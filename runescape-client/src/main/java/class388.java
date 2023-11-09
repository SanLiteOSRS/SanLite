import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
public class class388 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILhu;II)V",
		garbageValue = "2037948415"
	)
	static void method7347(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 73
		var5.plane = var0; // L: 74
		var5.x = var1 * 16384; // L: 75
		var5.y = var2 * 128; // L: 76
		int var6 = var3.sizeX; // L: 77
		int var7 = var3.sizeY; // L: 78
		if (var4 == 1 || var4 == 3) { // L: 79
			var6 = var3.sizeY; // L: 80
			var7 = var3.sizeX; // L: 81
		}

		var5.maxX = (var6 + var1) * 128; // L: 83
		var5.maxY = (var7 + var2) * 128; // L: 84
		var5.soundEffectId = var3.ambientSoundId; // L: 85
		var5.field812 = var3.int7 * 128; // L: 86
		var5.field806 = var3.int5; // L: 87
		var5.field808 = var3.int6; // L: 88
		var5.soundEffectIds = var3.soundEffectIds; // L: 89
		if (var3.transforms != null) { // L: 90
			var5.obj = var3; // L: 91
			var5.set(); // L: 92
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 94
		if (var5.soundEffectIds != null) { // L: 95
			var5.field818 = var5.field806 + (int)(Math.random() * (double)(var5.field808 - var5.field806));
		}

	} // L: 96

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "792599380"
	)
	static int method7348(int var0, Script var1, boolean var2) {
		if (var0 == 7108) { // L: 5031
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class381.method7304() ? 1 : 0; // L: 5032
			return 1; // L: 5033
		} else {
			return 2; // L: 5035
		}
	}
}
