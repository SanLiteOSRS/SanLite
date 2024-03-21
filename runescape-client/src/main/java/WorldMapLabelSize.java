import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1026433701
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 912835647
	)
	final int field2493;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 46594647
	)
	final int field2492;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -13257785
	)
	final int field2490;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2493 = var1; // L: 15
		this.field2492 = var2; // L: 16
		this.field2490 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "166533408"
	)
	boolean method4620(float var1) {
		return var1 >= (float)this.field2490; // L: 21
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1769906721"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljh;",
		garbageValue = "-1654301488"
	)
	static WorldMapLabelSize method4621(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_small, WorldMapLabelSize_medium}; // L: 28
		WorldMapLabelSize[] var2 = var1; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			WorldMapLabelSize var4 = var2[var3]; // L: 32
			if (var0 == var4.field2492) { // L: 34
				return var4; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "2"
	)
	static ArrayList method4627() {
		ArrayList var0 = new ArrayList(); // L: 192
		Iterator var1 = class321.field3474.iterator(); // L: 193

		while (var1.hasNext()) {
			class333 var2 = (class333)var1.next(); // L: 194
			var0.add(var2); // L: 196
		}

		return var0; // L: 199
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "1431043748"
	)
	static final void method4623(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4342
		if (var0.pathLength == 0) { // L: 4343
			var0.field1279 = 0; // L: 4344
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4347
				SequenceDefinition var1 = MilliClock.SequenceDefinition_get(var0.sequence); // L: 4348
				if (var0.field1280 > 0 && var1.field2271 == 0) { // L: 4349
					++var0.field1279; // L: 4350
					return; // L: 4351
				}

				if (var0.field1280 <= 0 && var1.field2273 == 0) { // L: 4353
					++var0.field1279; // L: 4354
					return; // L: 4355
				}
			}

			int var10 = var0.x; // L: 4358
			int var2 = var0.y; // L: 4359
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1212 * 64; // L: 4360
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1212 * 64; // L: 4361
			if (var10 < var3) { // L: 4362
				if (var2 < var4) { // L: 4363
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4364
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4365
				}
			} else if (var10 > var3) { // L: 4367
				if (var2 < var4) { // L: 4368
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4369
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4370
				}
			} else if (var2 < var4) { // L: 4372
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4373
				var0.orientation = 0;
			}

			class233 var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4374
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4375
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4382
				if (var6 > 1024) { // L: 4383
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4384
				if (var6 >= -256 && var6 <= 256) { // L: 4385
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4386
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4387
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 4388
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 4389
				int var8 = 4; // L: 4390
				boolean var9 = true; // L: 4391
				if (var0 instanceof NPC) { // L: 4392
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4393
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1249 != 0) { // L: 4394
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4395
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4396
						var8 = 8;
					}

					if (var0.field1279 > 0 && var0.pathLength > 1) { // L: 4397
						var8 = 8; // L: 4398
						--var0.field1279; // L: 4399
					}
				} else {
					if (var0.pathLength > 1) { // L: 4403
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4404
						var8 = 8;
					}

					if (var0.field1279 > 0 && var0.pathLength > 1) { // L: 4405
						var8 = 8; // L: 4406
						--var0.field1279; // L: 4407
					}
				}

				if (var5 == class233.field2472) { // L: 4410
					var8 <<= 1;
				} else if (var5 == class233.field2469) { // L: 4411
					var8 >>= 1;
				}

				if (var8 >= 8) { // L: 4412
					if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4413
						var0.movementSequence = var0.runSequence;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1219 != -1) { // L: 4414
						var0.movementSequence = var0.field1219;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1220 != -1) { // L: 4415
						var0.movementSequence = var0.field1220;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1221 != -1) {
						var0.movementSequence = var0.field1221; // L: 4416
					}
				} else if (var8 <= 2) { // L: 4418
					if (var0.movementSequence == var0.walkSequence && var0.field1222 != -1) { // L: 4419
						var0.movementSequence = var0.field1222;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1216 != -1) { // L: 4420
						var0.movementSequence = var0.field1216;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1224 != -1) { // L: 4421
						var0.movementSequence = var0.field1224;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1225 != -1) { // L: 4422
						var0.movementSequence = var0.field1225;
					}
				}

				if (var10 != var3 || var2 != var4) { // L: 4424
					if (var10 < var3) { // L: 4425
						var0.x += var8; // L: 4426
						if (var0.x > var3) { // L: 4427
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4429
						var0.x -= var8; // L: 4430
						if (var0.x < var3) { // L: 4431
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4433
						var0.y += var8; // L: 4434
						if (var0.y > var4) { // L: 4435
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4437
						var0.y -= var8; // L: 4438
						if (var0.y < var4) { // L: 4439
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4442
					--var0.pathLength; // L: 4443
					if (var0.field1280 > 0) { // L: 4444
						--var0.field1280;
					}
				}

			} else {
				var0.x = var3; // L: 4376
				var0.y = var4; // L: 4377
				--var0.pathLength; // L: 4378
				if (var0.field1280 > 0) { // L: 4379
					--var0.field1280;
				}

			}
		}
	} // L: 4345 4380 4446
}
