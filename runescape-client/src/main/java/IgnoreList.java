import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	final LoginType field4494;

	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 16
		this.field4494 = var1; // L: 17
	} // L: 18

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lpb;",
		garbageValue = "1708206647"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored(); // L: 22
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lpb;",
		garbageValue = "0"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 27
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "-1601952909"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var3 = var1.readUnsignedByte(); // L: 32
			if (var3 == 4) {
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field4494);
				if (!var10.hasCleanName()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				class6.friendSystem.method1896(var10.getName(), var11);
			} else {
				boolean var4 = (var3 & 1) != 0;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field4494);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field4494);
				var1.readStringCp1252NullTerminated();
				if (!var5.hasCleanName()) {
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5);
				if (var4) {
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
					if (var8 != null && var7 != var8) { // L: 48
						if (var7 != null) {
							this.remove(var8);
						} else {
							var7 = var8; // L: 53
						}
					}
				}

				if (var7 != null) {
					this.changeName(var7, var5, var6); // L: 58
				} else if (this.getSize() < 400) { // L: 60
					int var9 = this.getSize(); // L: 61
					var7 = (Ignored)this.addLast(var5, var6); // L: 62
					var7.id = var9; // L: 63
				}
			}
		}

	} // L: 67

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2089044337"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class16.World_request == null) { // L: 31
				class16.World_request = class345.urlRequester.request(new URL(class199.field2088));
			} else if (class16.World_request.isDone()) { // L: 33
				byte[] var0 = class16.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				class260.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = class260.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				class16.sortWorlds(class260.World_worlds, 0, class260.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				class16.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			class16.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1387332345"
	)
	static char method7449(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1863377427"
	)
	static boolean method7455() {
		return (Client.drawPlayerNames & 8) != 0; // L: 5013
	}
}
