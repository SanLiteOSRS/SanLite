import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public abstract class class14 extends Node {
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 1812999285
	)
	@Export("menuX")
	static int menuX;

	class14() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	abstract void vmethod276(Buffer var1);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	abstract void vmethod281(class11 var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-24"
	)
	public static final boolean method188(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (Login.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class365.field4096;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class365.field4097;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}
}
