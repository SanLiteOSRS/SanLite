import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class160 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	public UrlRequest field1755;
	@ObfuscatedName("q")
	public float[] field1754;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lef;)V"
	)
	class160(class155 var1) {
		this.this$0 = var1;
		this.field1754 = new float[4]; // L: 308
	} // L: 310

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1550492132"
	)
	static int method3277(int var0, int var1) {
		if (var0 == -2) { // L: 63
			return 12345678;
		} else if (var0 == -1) { // L: 64
			if (var1 < 0) { // L: 65
				var1 = 0; // L: 66
			} else if (var1 > 127) { // L: 68
				var1 = 127; // L: 69
			}

			var1 = 127 - var1; // L: 71
			return var1; // L: 72
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 74
			if (var1 < 2) { // L: 75
				var1 = 2;
			} else if (var1 > 126) { // L: 76
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 77
		}
	}
}
