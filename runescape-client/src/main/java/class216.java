import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public enum class216 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	field2397((byte)-1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	field2394((byte)0),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	field2395((byte)1),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	field2396((byte)2);

	@ObfuscatedName("ax")
	public byte field2393;

	class216(byte var3) {
		this.field2393 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2393; // L: 19
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "294559986"
	)
	static final boolean method4261(char var0) {
		if (Character.isISOControl(var0)) { // L: 28
			return false;
		} else if (class209.isAlphaNumeric(var0)) { // L: 29
			return true;
		} else {
			char[] var1 = class481.field4937; // L: 31

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 32
				var3 = var1[var2]; // L: 33
				if (var0 == var3) { // L: 34
					return true;
				}
			}

			var1 = class481.field4935; // L: 38

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 39
				var3 = var1[var2]; // L: 40
				if (var0 == var3) {
					return true; // L: 41
				}
			}

			return false; // L: 44
		}
	}
}
