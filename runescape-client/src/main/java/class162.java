import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class162 extends class140 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -8207379148023187217L
	)
	long field1770;
	@ObfuscatedName("al")
	String field1769;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;)V"
	)
	class162(class143 var1) {
		this.this$0 = var1;
		this.field1770 = -1L; // L: 194
		this.field1769 = null; // L: 195
	} // L: 197

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "-1979280996"
	)
	void vmethod3361(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1770 = var1.readLong(); // L: 202
		}

		this.field1769 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "29"
	)
	void vmethod3362(ClanSettings var1) {
		var1.method3202(this.field1770, this.field1769); // L: 208
	} // L: 209

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lmf;",
		garbageValue = "927143554"
	)
	public static GameBuild method3350(int var0) {
		GameBuild[] var1 = SecureRandomFuture.method2123(); // L: 23

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 24
			GameBuild var3 = var1[var2]; // L: 25
			if (var0 == var3.buildId) {
				return var3; // L: 27
			}
		}

		return null; // L: 31
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "-17"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class175.method3494(var0, 10, true); // L: 35
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2027808995"
	)
	public static void method3349() {
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 47
	} // L: 48
}
