import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1745719425
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 943830507
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -600062291
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 799207299
	)
	@Export("x")
	int x;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 137130919
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1808411713
	)
	@Export("z")
	int z;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -842084923
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2077503945
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("aa")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.z = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = class151.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = class9.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "244690834"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 38
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 39
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 40
					++this.frame; // L: 41
					if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 42
						this.isFinished = true; // L: 43
						break;
					}
				}
			} else {
				this.frame += var1; // L: 49
				if (this.frame >= this.sequenceDefinition.method4106()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-714420560"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class151.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-65"
	)
	static boolean method2140(String var0) {
		if (var0 == null) { // L: 210
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 217
			} catch (MalformedURLException var2) { // L: 214
				return false; // L: 215
			}
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V",
		garbageValue = "-644531348"
	)
	static final void method2141(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4366
		if (var0.pathLength == 0) { // L: 4367
			var0.field1245 = 0; // L: 4368
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4371
				SequenceDefinition var1 = class9.SequenceDefinition_get(var0.sequence); // L: 4372
				if (var0.field1215 > 0 && var1.field2244 == 0) { // L: 4373
					++var0.field1245; // L: 4374
					return; // L: 4375
				}

				if (var0.field1215 <= 0 && var1.field2226 == 0) { // L: 4377
					++var0.field1245; // L: 4378
					return; // L: 4379
				}
			}

			int var10 = var0.x; // L: 4382
			int var2 = var0.y; // L: 4383
			int var3 = var0.field1175 * 423432192 + var0.pathX[var0.pathLength - 1] * 128; // L: 4384
			int var4 = var0.field1175 * 423432192 + var0.pathY[var0.pathLength - 1] * 128; // L: 4385
			if (var10 < var3) { // L: 4386
				if (var2 < var4) { // L: 4387
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4388
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4389
				}
			} else if (var10 > var3) { // L: 4391
				if (var2 < var4) { // L: 4392
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4393
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4394
				}
			} else if (var2 < var4) { // L: 4396
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4397
				var0.orientation = 0;
			}

			class231 var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4398
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4399
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4406
				if (var6 > 1024) { // L: 4407
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4408
				if (var6 >= -256 && var6 <= 256) { // L: 4409
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4410
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4411
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 4412
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 4413
				int var8 = 4; // L: 4414
				boolean var9 = true; // L: 4415
				if (var0 instanceof NPC) { // L: 4416
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4417
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1240 != 0) { // L: 4418
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4419
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4420
						var8 = 8;
					}

					if (var0.field1245 > 0 && var0.pathLength > 1) { // L: 4421
						var8 = 8; // L: 4422
						--var0.field1245; // L: 4423
					}
				} else {
					if (var0.pathLength > 1) { // L: 4427
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4428
						var8 = 8;
					}

					if (var0.field1245 > 0 && var0.pathLength > 1) { // L: 4429
						var8 = 8; // L: 4430
						--var0.field1245; // L: 4431
					}
				}

				if (var5 == class231.field2459) { // L: 4434
					var8 <<= 1;
				} else if (var5 == class231.field2456) { // L: 4435
					var8 >>= 1;
				}

				if (var8 >= 8) { // L: 4436
					if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4437
						var0.movementSequence = var0.runSequence;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1187 != -1) { // L: 4438
						var0.movementSequence = var0.field1187;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1186 != -1) { // L: 4439
						var0.movementSequence = var0.field1186;
					} else if (var0.movementSequence == var0.walkRightSequence && var0.field1218 != -1) { // L: 4440
						var0.movementSequence = var0.field1218;
					}
				} else if (var8 <= 2) { // L: 4442
					if (var0.movementSequence == var0.walkSequence && var0.field1188 != -1) { // L: 4443
						var0.movementSequence = var0.field1188;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1178 != -1) { // L: 4444
						var0.movementSequence = var0.field1178;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1190 != -1) { // L: 4445
						var0.movementSequence = var0.field1190;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1191 != -1) { // L: 4446
						var0.movementSequence = var0.field1191;
					}
				}

				if (var10 != var3 || var2 != var4) { // L: 4448
					if (var10 < var3) { // L: 4449
						var0.x += var8; // L: 4450
						if (var0.x > var3) { // L: 4451
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4453
						var0.x -= var8; // L: 4454
						if (var0.x < var3) { // L: 4455
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4457
						var0.y += var8; // L: 4458
						if (var0.y > var4) { // L: 4459
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4461
						var0.y -= var8; // L: 4462
						if (var0.y < var4) { // L: 4463
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4466
					--var0.pathLength; // L: 4467
					if (var0.field1215 > 0) { // L: 4468
						--var0.field1215;
					}
				}

			} else {
				var0.x = var3; // L: 4400
				var0.y = var4; // L: 4401
				--var0.pathLength; // L: 4402
				if (var0.field1215 > 0) { // L: 4403
					--var0.field1215;
				}

			}
		}
	} // L: 4369 4404 4470

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IILir;I)V",
		garbageValue = "-275020148"
	)
	static final void method2132(Player var0, int var1, int var2, class231 var3) {
		int var4 = var0.pathX[0]; // L: 9081
		int var5 = var0.pathY[0]; // L: 9082
		int var6 = var0.transformedSize(); // L: 9083
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 9084
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 9085
				class232 var7 = Client.field691; // L: 9086
				int var10 = var0.transformedSize(); // L: 9089
				Client.field801.approxDestinationX = var1; // L: 9092
				Client.field801.approxDestinationY = var2; // L: 9093
				Client.field801.approxDestinationSizeX = 1; // L: 9094
				Client.field801.approxDestinationSizeY = 1; // L: 9095
				ApproximateRouteStrategy var11 = Client.field801; // L: 9096
				int var12 = var7.method4556(var4, var5, var10, var11, Client.collisionMaps[var0.plane], true, Client.field802, Client.field803); // L: 9098
				if (var12 >= 1) { // L: 9099
					for (int var13 = 0; var13 < var12 - 1; ++var13) { // L: 9100
						var0.method2415(Client.field802[var13], Client.field803[var13], var3);
					}

				}
			}
		}
	} // L: 9101

	public GraphicsObject() {
	}
}
