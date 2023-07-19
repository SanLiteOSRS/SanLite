import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("ai")
	boolean field4624;
	@ObfuscatedName("aj")
	boolean field4625;

	Friend() {
	} // L: 9

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqc;I)I",
		garbageValue = "-1942896991"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field4624 && !var1.field4624) { // L: 16
			return -1;
		} else if (!this.field4624 && var1.field4624) { // L: 17
			return 1;
		} else if (this.field4625 && !var1.field4625) { // L: 18
			return -1;
		} else if (!this.field4625 && var1.field4625) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqh;S)I",
		garbageValue = "-24941"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;B)Ljava/lang/String;",
		garbageValue = "-29"
	)
	public static String method7887(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 29
			if (var2 > 32767) { // L: 30
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 31
			var0.offset += class334.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 32
			String var4 = LoginScreenAnimation.decodeStringCp1252(var3, 0, var2); // L: 33
			var1 = var4; // L: 34
		} catch (Exception var6) { // L: 36
			var1 = "Cabbage"; // L: 37
		}

		return var1; // L: 40
	}
}
