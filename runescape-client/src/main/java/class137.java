import java.util.ArrayList;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
class class137 implements Callable {
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field1630;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class138 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lff;"
	)
	final class130[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfa;II[Lff;)V"
	)
	class137(class138 var1, int var2, int var3, class130[] var4) {
		this.this$0 = var1; // L: 97
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) { // L: 100
			this.val$curveLoadJobs[var1].call(); // L: 101
		}

		return null; // L: 103
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "0"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1035
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1036
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1037
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1038
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1039
		return var3; // L: 1040
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "2998"
	)
	static void method3080(int var0, int var1) {
		if (NPC.clientPreferences.method2503() != 0 && var0 != -1) { // L: 3931
			ArrayList var2 = new ArrayList(); // L: 3932
			var2.add(new class333(WorldMapScaleHandler.field3167, var0, 0, NPC.clientPreferences.method2503(), false)); // L: 3933
			Renderable.method4881(var2, 0, 0, 0, 0, true); // L: 3934
			Client.playingJingle = true; // L: 3935
		}

	} // L: 3937
}
