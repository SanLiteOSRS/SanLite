import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class174 {
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive18")
	static Archive archive18;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;IIS)Lql;",
		garbageValue = "15759"
	)
	static IndexedSprite method3444(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			class83.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : SoundCache.method777();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lfa;",
		garbageValue = "1641447523"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lqw;IIIIIII)V",
		garbageValue = "-1905100181"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 169
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 170

			while (true) {
				var7 = var0.readUnsignedByte(); // L: 172
				if (var7 == 0) { // L: 173
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -class306.method5765(var2 + 932731 + var4, var5 + var3 + 556238) * 8; // L: 174
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 175
					}
					break;
				}

				if (var7 == 1) { // L: 178
					int var8 = var0.readUnsignedByte(); // L: 179
					if (var8 == 1) { // L: 180
						var8 = 0;
					}

					if (var1 == 0) { // L: 181
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8; // L: 182
					}
					break;
				}

				if (var7 <= 49) { // L: 185
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte(); // L: 186
					Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4); // L: 187
					Tiles.field997[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3); // L: 188
				} else if (var7 <= 81) { // L: 191
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49); // L: 192
				} else {
					class356.Tiles_underlays[var1][var2][var3] = (byte)(var7 - 81); // L: 195
				}
			}
		} else {
			while (true) {
				var7 = var0.readUnsignedByte(); // L: 200
				if (var7 == 0) { // L: 201
					break;
				}

				if (var7 == 1) { // L: 202
					var0.readUnsignedByte(); // L: 203
					break;
				}

				if (var7 <= 49) { // L: 206
					var0.readUnsignedByte();
				}
			}
		}

	} // L: 209

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-549094941"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class260.clientPreferences.method2348() != 0 && var1 != 0 && Client.soundEffectCount < 50) { // L: 3741
			Client.soundEffectIds[Client.soundEffectCount] = var0; // L: 3742
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1; // L: 3743
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2; // L: 3744
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3745
			Client.soundLocations[Client.soundEffectCount] = 0; // L: 3746
			++Client.soundEffectCount; // L: 3747
		}

	} // L: 3749
}
