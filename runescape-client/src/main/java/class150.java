import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class150 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -5552334129573370025L
	)
	long field1691;
	@ObfuscatedName("q")
	String field1689;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class150(class131 var1) {
		this.this$0 = var1;
		this.field1691 = -1L; // L: 194
		this.field1689 = null; // L: 195
	} // L: 197

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-423569520"
	)
	void vmethod3155(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1691 = var1.readLong(); // L: 202
		}

		this.field1689 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)V",
		garbageValue = "-1755436064"
	)
	void vmethod3154(ClanSettings var1) {
		var1.method2987(this.field1691, this.field1689); // L: 208
	} // L: 209

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "700719603"
	)
	public static int method3143(String var0) {
		return var0.length() + 2; // L: 119
	}
}
