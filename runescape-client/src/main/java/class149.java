import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class149 extends class135 {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1406247549
	)
	int field1699;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
	)
	class149(class138 var1) {
		this.this$0 = var1;
		this.field1699 = -1; // L: 213
	} // L: 215

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-1428026624"
	)
	void vmethod3254(Buffer var1) {
		this.field1699 = var1.readUnsignedShort(); // L: 218
	} // L: 219

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "-110"
	)
	void vmethod3248(ClanSettings var1) {
		var1.method3084(this.field1699); // L: 222
	} // L: 223

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2144467823"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 112

		try {
			var0 = class156.getPreferencesFile("", class376.field4411.name, true); // L: 114
			Buffer var1 = BufferedSink.clientPreferences.toBuffer(); // L: 115
			var0.write(var1.array, 0, var1.offset); // L: 116
		} catch (Exception var3) { // L: 118
		}

		try {
			if (var0 != null) { // L: 120
				var0.closeSync(true); // L: 121
			}
		} catch (Exception var2) { // L: 124
		}

	} // L: 125
}
