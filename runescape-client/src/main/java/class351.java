import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class351 {
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -1477583049
	)
	static int field3864;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "10"
	)
	static final int method6892(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16; // L: 9
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIILhg;IB)V",
		garbageValue = "12"
	)
	static void method6891(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		if (var3 != null && var3.hasSound()) { // L: 158
			int var5 = var3.sizeX; // L: 159
			int var6 = var3.sizeY; // L: 160
			if (var4 == 1 || var4 == 3) { // L: 161
				var5 = var3.sizeY; // L: 162
				var6 = var3.sizeX; // L: 163
			}

			int var7 = (var5 + var1) * 128; // L: 165
			int var8 = (var6 + var2) * 128; // L: 166
			var1 *= 128; // L: 167
			var2 *= 128; // L: 168
			int var9 = var3.ambientSoundId; // L: 169
			int var10 = var3.int7 * 16384; // L: 170
			if (var3.transforms != null) { // L: 171
				ObjectComposition var11 = var3.transform(); // L: 172
				if (var11 != null) { // L: 173
					var9 = var11.ambientSoundId; // L: 174
					var10 = var11.int7 * 16384; // L: 175
				}
			}

			for (ObjectSound var12 = (ObjectSound)ObjectSound.objectSounds.last(); var12 != null; var12 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 178
				if (var0 == var12.plane && var12.x * 16384 == var1 && var2 == var12.y * 16384 && var7 == var12.maxX * 16384 && var8 == var12.maxY * 16384 && var9 == var12.soundEffectId && var10 == var12.field844) { // L: 179
					if (var12.stream1 != null) { // L: 180
						ClanSettings.pcmStreamMixer.removeSubStream(var12.stream1); // L: 181
						var12.stream1 = null; // L: 182
					}

					if (var12.stream2 != null) { // L: 184
						ClanSettings.pcmStreamMixer.removeSubStream(var12.stream2); // L: 185
						var12.stream2 = null; // L: 186
					}

					var12.remove(); // L: 188
					break; // L: 189
				}
			}
		}

	} // L: 193
}
