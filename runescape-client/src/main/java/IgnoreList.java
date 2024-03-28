import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	final LoginType field4768;

	@ObfuscatedSignature(
		descriptor = "(Ltr;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 16
		this.field4768 = var1; // L: 17
	} // L: 18

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lrr;",
		garbageValue = "958125629"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored(); // L: 22
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lrr;",
		garbageValue = "8"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 27
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "1"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) { // L: 31
			int var3 = var1.readUnsignedByte(); // L: 32
			if (var3 == 4) { // L: 33
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field4768); // L: 34
				if (!var10.hasCleanName()) {
					throw new IllegalStateException(); // L: 35
				}

				boolean var11 = false; // L: 36
				class334.friendSystem.method1860(var10.getName(), var11); // L: 37
			} else {
				boolean var4 = (var3 & 1) != 0; // L: 40
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field4768); // L: 41
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field4768); // L: 42
				var1.readStringCp1252NullTerminated(); // L: 43
				if (!var5.hasCleanName()) { // L: 44
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 45
				if (var4) { // L: 46
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 47
					if (var8 != null && var7 != var8) { // L: 48
						if (var7 != null) { // L: 49
							this.remove(var8); // L: 50
						} else {
							var7 = var8; // L: 53
						}
					}
				}

				if (var7 != null) { // L: 57
					this.changeName(var7, var5, var6); // L: 58
				} else if (this.getSize() < 400) { // L: 60
					int var9 = this.getSize(); // L: 61
					var7 = (Ignored)this.addLast(var5, var6); // L: 62
					var7.id = var9;
				}
			}
		}

	} // L: 67

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2081162974"
	)
	static int method8043(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 63
		if (var1 == null) { // L: 64
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 65 66
		}
	}
}
