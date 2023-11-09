import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class144 extends class135 {
	@ObfuscatedName("a")
	String field1653;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
	)
	class144(class138 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1428026624"
	)
	void vmethod3254(Buffer var1) {
		this.field1653 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "-110"
	)
	void vmethod3248(ClanSettings var1) {
		var1.name = this.field1653; // L: 237
	} // L: 238

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1551414846"
	)
	static void method3062(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 12580
			if ((var1.key >> 48 & 65535L) == (long)var0) { // L: 12581
				var1.remove(); // L: 12582
			}
		}

	} // L: 12585
}
