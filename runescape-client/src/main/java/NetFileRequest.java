import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive")
	Archive archive;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 279436127
	)
	@Export("crc")
	int crc;
	@ObfuscatedName("v")
	@Export("padding")
	byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-2058830969"
	)
	static final boolean method6516(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 216
		Buffer var4 = new Buffer(var0); // L: 217
		int var5 = -1; // L: 218

		label69:
		while (true) {
			int var6 = var4.method8809(); // L: 220
			if (var6 == 0) { // L: 221
				return var3; // L: 252
			}

			var5 += var6; // L: 222
			int var7 = 0; // L: 223
			boolean var8 = false; // L: 224

			while (true) {
				int var9;
				while (!var8) { // L: 226
					var9 = var4.readUShortSmart(); // L: 232
					if (var9 == 0) { // L: 233
						continue label69;
					}

					var7 += var9 - 1; // L: 234
					int var10 = var7 & 63; // L: 235
					int var11 = var7 >> 6 & 63; // L: 236
					int var12 = var4.readUnsignedByte() >> 2; // L: 237
					int var13 = var11 + var1; // L: 238
					int var14 = var10 + var2; // L: 239
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 240
						ObjectComposition var15 = class463.getObjectDefinition(var5); // L: 241
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 242
							if (!var15.needsModelFiles()) { // L: 243
								++Client.field567; // L: 244
								var3 = false; // L: 245
							}

							var8 = true; // L: 247
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 227
				if (var9 == 0) { // L: 228
					break;
				}

				var4.readUnsignedByte(); // L: 229
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIILhn;[Lgv;B)V",
		garbageValue = "-47"
	)
	static final void method6517(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0); // L: 256
		int var6 = -1; // L: 257

		while (true) {
			int var7 = var5.method8809(); // L: 259
			if (var7 == 0) { // L: 260
				return; // L: 284
			}

			var6 += var7; // L: 261
			int var8 = 0; // L: 262

			while (true) {
				int var9 = var5.readUShortSmart(); // L: 264
				if (var9 == 0) { // L: 265
					break;
				}

				var8 += var9 - 1; // L: 266
				int var10 = var8 & 63; // L: 267
				int var11 = var8 >> 6 & 63; // L: 268
				int var12 = var8 >> 12; // L: 269
				int var13 = var5.readUnsignedByte(); // L: 270
				int var14 = var13 >> 2; // L: 271
				int var15 = var13 & 3; // L: 272
				int var16 = var11 + var1; // L: 273
				int var17 = var10 + var2; // L: 274
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) { // L: 275
					int var18 = var12; // L: 276
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) { // L: 277
						var18 = var12 - 1;
					}

					CollisionMap var19 = null; // L: 278
					if (var18 >= 0) { // L: 279
						var19 = var4[var18];
					}

					NameableContainer.addObjects(var12, var16, var17, var6, var15, var14, var3, var19); // L: 280
				}
			}
		}
	}
}
