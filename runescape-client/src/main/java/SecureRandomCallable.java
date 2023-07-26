import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = 257715649
	)
	static int field1039;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;

	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return WorldMapSection2.method5134(); // L: 46
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2007772558"
	)
	static String method2253(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-1364633543"
	)
	static void method2248(float[] var0) {
		if (var0[0] + class126.field1494 < 1.3333334F) { // L: 307
			float var1 = var0[0] - 2.0F; // L: 308
			float var2 = var0[0] - 1.0F; // L: 309
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * 4.0F * var2)); // L: 310
			float var4 = (-var1 + var3) * 0.5F; // L: 311
			if (class126.field1494 + var0[1] > var4) { // L: 312
				var0[1] = var4 - class126.field1494; // L: 313
			} else {
				var4 = (-var1 - var3) * 0.5F; // L: 316
				if (var0[1] < class126.field1494 + var4) { // L: 317
					var0[1] = var4 + class126.field1494; // L: 318
				}
			}
		} else {
			var0[0] = 1.3333334F - class126.field1494; // L: 323
			var0[1] = 0.33333334F - class126.field1494; // L: 324
		}

	} // L: 326
}
