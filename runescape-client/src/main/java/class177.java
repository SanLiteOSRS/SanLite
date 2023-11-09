import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class177 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	public UrlRequest field1861;
	@ObfuscatedName("aj")
	public float[] field1860;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	final class171 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgq;)V"
	)
	class177(class171 var1) {
		this.this$0 = var1;
		this.field1860 = new float[4]; // L: 330
	} // L: 332

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "25308727"
	)
	static float method3610(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 200

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 201
			var3 = var0[var4] + var3 * var2; // L: 202
		}

		return var3; // L: 204
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-91"
	)
	static boolean method3611(int var0) {
		for (int var1 = 0; var1 < Client.field735; ++var1) { // L: 11895
			if (Client.field737[var1] == var0) { // L: 11896
				return true;
			}
		}

		return false; // L: 11898
	}
}
