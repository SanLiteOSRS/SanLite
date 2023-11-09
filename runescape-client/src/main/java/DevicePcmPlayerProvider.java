import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("wu")
	static List field108;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 294736235
	)
	static int field111;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)Lby;",
		garbageValue = "-2211"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)Ljava/lang/String;",
		garbageValue = "1966437671"
	)
	static String method323(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart(); // L: 31
			if (var2 > var1) { // L: 32
				var2 = var1;
			}

			byte[] var3 = new byte[var2]; // L: 33
			var0.offset += class350.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 34
			String var4 = World.decodeStringCp1252(var3, 0, var2); // L: 35
			return var4; // L: 36
		} catch (Exception var6) { // L: 38
			return "Cabbage"; // L: 39
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-26053498"
	)
	static final int method315(int var0, int var1) {
		int var2 = WorldMapIcon_0.method4849(45365 + var0, var1 + 91923, 4) - 128 + (WorldMapIcon_0.method4849(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (WorldMapIcon_0.method4849(var0, var1, 1) - 128 >> 2); // L: 949
		var2 = (int)((double)var2 * 0.3D) + 35; // L: 950
		if (var2 < 10) { // L: 951
			var2 = 10;
		} else if (var2 > 60) { // L: 952
			var2 = 60;
		}

		return var2; // L: 953
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V",
		garbageValue = "1536572289"
	)
	static final void method322(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4326
		if (var0.pathLength == 0) { // L: 4327
			var0.field1245 = 0; // L: 4328
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4331
				SequenceDefinition var1 = DynamicObject.SequenceDefinition_get(var0.sequence); // L: 4332
				if (var0.field1220 > 0 && var1.field2218 == 0) { // L: 4333
					++var0.field1245; // L: 4334
					return; // L: 4335
				}

				if (var0.field1220 <= 0 && var1.field2205 == 0) { // L: 4337
					++var0.field1245; // L: 4338
					return; // L: 4339
				}
			}

			int var10 = var0.x; // L: 4342
			int var2 = var0.y; // L: 4343
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1198 * 64; // L: 4344
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1198 * 64; // L: 4345
			if (var10 < var3) { // L: 4346
				if (var2 < var4) { // L: 4347
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4348
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4349
				}
			} else if (var10 > var3) { // L: 4351
				if (var2 < var4) { // L: 4352
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4353
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4354
				}
			} else if (var2 < var4) { // L: 4356
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4357
				var0.orientation = 0;
			}

			class228 var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4358
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4359
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4366
				if (var6 > 1024) { // L: 4367
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4368
				if (var6 >= -256 && var6 <= 256) { // L: 4369
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4370
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4371
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 4372
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 4373
				int var8 = 4; // L: 4374
				boolean var9 = true; // L: 4375
				if (var0 instanceof NPC) { // L: 4376
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4377
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1240 != 0) { // L: 4378
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4379
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4380
						var8 = 8;
					}

					if (var0.field1245 > 0 && var0.pathLength > 1) { // L: 4381
						var8 = 8; // L: 4382
						--var0.field1245; // L: 4383
					}
				} else {
					if (var0.pathLength > 1) { // L: 4387
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4388
						var8 = 8;
					}

					if (var0.field1245 > 0 && var0.pathLength > 1) { // L: 4389
						var8 = 8; // L: 4390
						--var0.field1245; // L: 4391
					}
				}

				if (var5 == class228.field2410) { // L: 4394
					var8 <<= 1;
				} else if (var5 == class228.field2408) { // L: 4395
					var8 >>= 1;
				}

				if (var8 >= 8) { // L: 4396
					if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4397
						var0.movementSequence = var0.runSequence;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1185 != -1) { // L: 4398
						var0.movementSequence = var0.field1185;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1186 != -1) { // L: 4399
						var0.movementSequence = var0.field1186;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1233 != -1) { // L: 4400
						var0.movementSequence = var0.field1233;
					}
				} else if (var8 <= 2) { // L: 4402
					if (var0.walkSequence == var0.movementSequence && var0.field1188 != -1) { // L: 4403
						var0.movementSequence = var0.field1188;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1189 != -1) { // L: 4404
						var0.movementSequence = var0.field1189;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1190 != -1) { // L: 4405
						var0.movementSequence = var0.field1190;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1239 != -1) { // L: 4406
						var0.movementSequence = var0.field1239;
					}
				}

				if (var3 != var10 || var4 != var2) { // L: 4408
					if (var10 < var3) { // L: 4409
						var0.x += var8; // L: 4410
						if (var0.x > var3) { // L: 4411
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4413
						var0.x -= var8; // L: 4414
						if (var0.x < var3) { // L: 4415
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4417
						var0.y += var8; // L: 4418
						if (var0.y > var4) { // L: 4419
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4421
						var0.y -= var8; // L: 4422
						if (var0.y < var4) { // L: 4423
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4426
					--var0.pathLength; // L: 4427
					if (var0.field1220 > 0) { // L: 4428
						--var0.field1220;
					}
				}

			} else {
				var0.x = var3; // L: 4360
				var0.y = var4; // L: 4361
				--var0.pathLength; // L: 4362
				if (var0.field1220 > 0) { // L: 4363
					--var0.field1220;
				}

			}
		}
	} // L: 4329 4364 4430
}
