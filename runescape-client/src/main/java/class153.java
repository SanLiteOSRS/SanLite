import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class153 extends class144 {
	@ObfuscatedName("ai")
	String field1706;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	class153(class147 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-25252119"
	)
	void vmethod3458(Buffer var1) {
		this.field1706 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "-1582049647"
	)
	void vmethod3460(ClanSettings var1) {
		var1.name = this.field1706; // L: 237
	} // L: 238

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1929795072"
	)
	static int method3272(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field868 - 7.0D) * 256.0D); // L: 4416
	}
}
