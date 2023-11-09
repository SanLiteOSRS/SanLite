import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jc")
public final class class282 {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -788590648153767697L
	)
	static long field3327;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)[Lra;",
		garbageValue = "-872214440"
	)
	static IndexedSprite[] method5509() {
		IndexedSprite[] var0 = new IndexedSprite[class481.SpriteBuffer_spriteCount]; // L: 146

		for (int var1 = 0; var1 < class481.SpriteBuffer_spriteCount; ++var1) { // L: 147
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 148
			var2.width = GrandExchangeOfferTotalQuantityComparator.SpriteBuffer_spriteWidth; // L: 149
			var2.height = class481.SpriteBuffer_spriteHeight; // L: 150
			var2.xOffset = class481.SpriteBuffer_xOffsets[var1]; // L: 151
			var2.yOffset = class414.SpriteBuffer_yOffsets[var1]; // L: 152
			var2.subWidth = class11.SpriteBuffer_spriteWidths[var1]; // L: 153
			var2.subHeight = StructComposition.SpriteBuffer_spriteHeights[var1]; // L: 154
			var2.palette = WorldMapEvent.SpriteBuffer_spritePalette; // L: 155
			var2.pixels = GroundObject.SpriteBuffer_pixels[var1]; // L: 156
		}

		class481.SpriteBuffer_xOffsets = null; // L: 159
		class414.SpriteBuffer_yOffsets = null; // L: 160
		class11.SpriteBuffer_spriteWidths = null; // L: 161
		StructComposition.SpriteBuffer_spriteHeights = null; // L: 162
		WorldMapEvent.SpriteBuffer_spritePalette = null; // L: 163
		GroundObject.SpriteBuffer_pixels = null; // L: 164
		return var0; // L: 166
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-808600101"
	)
	static int method5508(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4155
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Message.getWindowedMode(); // L: 4156
			return 1; // L: 4157
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4159
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4160
				if (var3 == 1 || var3 == 2) { // L: 4161
					class101.setWindowedMode(var3);
				}

				return 1; // L: 4162
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4164
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = StructComposition.clientPreferences.method2434(); // L: 4165
				return 1; // L: 4166
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4168
				if (var0 == 5310) { // L: 4175
					--class87.Interpreter_intStackSize; // L: 4176
					return 1; // L: 4177
				} else {
					return 2; // L: 4179
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4169
				if (var3 == 1 || var3 == 2) { // L: 4170
					StructComposition.clientPreferences.method2460(var3); // L: 4171
				}

				return 1; // L: 4173
			}
		}
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(IIIILrx;Lkv;I)V",
		garbageValue = "826966523"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12480
			int var6 = Client.camAngleY & 2047; // L: 12481
			int var7 = var3 * var3 + var2 * var2; // L: 12482
			if (var7 <= 6400) { // L: 12483
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12484
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12485
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12486
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12487
				if (var7 > 2500) {
					var4.method9027(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12488
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12489
				}

			}
		}
	} // L: 12490

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2088314775"
	)
	static String method5507(String var0) {
		PlayerType[] var1 = class149.PlayerType_values(); // L: 12707

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12708
			PlayerType var3 = var1[var2]; // L: 12709
			if (var3.modIcon != -1 && var0.startsWith(class456.method8410(var3.modIcon))) { // L: 12711 12712
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12713
				break;
			}
		}

		return var0; // L: 12720
	}
}
