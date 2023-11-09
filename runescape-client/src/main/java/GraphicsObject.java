import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2093422367
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 90284227
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1148021499
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -47217285
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -162029343
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 394535241
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2094471395
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2040502427
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("ag")
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
		int var8 = class155.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = class149.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-63"
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
				if (this.frame >= this.sequenceDefinition.method4006()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljh;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class155.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;I)V",
		garbageValue = "-78994825"
	)
	public static void method2044(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1; // L: 33
	} // L: 34

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZZS)I",
		garbageValue = "256"
	)
	public static int method2045(boolean var0, boolean var1) {
		byte var2 = 0; // L: 136
		int var3 = var2 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount; // L: 137
		return var3; // L: 138
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-1576869718"
	)
	static int method2036(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class336.Interpreter_intStackSize -= 2;
			Client.field753 = (short)class337.method6628(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]);
			if (Client.field753 <= 0) {
				Client.field753 = 256;
			}

			Client.field754 = (short)class337.method6628(Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]); // L: 4385
			if (Client.field754 <= 0) {
				Client.field754 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class336.Interpreter_intStackSize -= 2; // L: 4390
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) { // L: 4394
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class336.Interpreter_intStackSize -= 4; // L: 4398
			Client.field757 = (short)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize];
			if (Client.field757 <= 0) {
				Client.field757 = 1;
			}

			Client.field758 = (short)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1];
			if (Client.field758 <= 0) { // L: 4402
				Client.field758 = 32767;
			} else if (Client.field758 < Client.field757) { // L: 4403
				Client.field758 = Client.field757;
			}

			Client.field676 = (short)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2];
			if (Client.field676 <= 0) {
				Client.field676 = 1;
			}

			Client.field760 = (short)Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 3];
			if (Client.field760 <= 0) { // L: 4407
				Client.field760 = 32767;
			} else if (Client.field760 < Client.field676) {
				Client.field760 = Client.field676;
			}

			return 1; // L: 4409
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 4411
			if (Client.viewportWidget != null) { // L: 4412
				WorldMapDecorationType.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 4413
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 4414
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 4415
			} else {
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4418
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4419
			}

			return 1; // L: 4421
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 4423
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 4424
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 4425
			return 1; // L: 4426
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 4428
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ChatChannel.method2135(Client.field753); // L: 4429
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ChatChannel.method2135(Client.field754); // L: 4430
			return 1; // L: 4431
		} else if (var0 == 6220) { // L: 4433
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4434
			return 1; // L: 4435
		} else if (var0 == 6221) { // L: 4437
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4438
			return 1; // L: 4439
		} else if (var0 == 6222) { // L: 4441
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class10.canvasWidth; // L: 4442
			return 1; // L: 4443
		} else if (var0 == 6223) { // L: 4445
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class11.canvasHeight; // L: 4446
			return 1; // L: 4447
		} else {
			return 2; // L: 4449
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V",
		garbageValue = "-154870481"
	)
	static final void method2046(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4304
		if (var0.pathLength == 0) { // L: 4305
			var0.field1213 = 0; // L: 4306
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4309
				SequenceDefinition var1 = class149.SequenceDefinition_get(var0.sequence); // L: 4310
				if (var0.field1214 > 0 && var1.field2290 == 0) { // L: 4311
					++var0.field1213; // L: 4312
					return; // L: 4313
				}

				if (var0.field1214 <= 0 && var1.field2291 == 0) { // L: 4315
					++var0.field1213; // L: 4316
					return; // L: 4317
				}
			}

			int var10 = var0.x; // L: 4320
			int var2 = var0.y; // L: 4321
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1147 * -3932160; // L: 4322
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1147 * -3932160; // L: 4323
			if (var10 < var3) { // L: 4324
				if (var2 < var4) { // L: 4325
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4326
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4327
				}
			} else if (var10 > var3) { // L: 4329
				if (var2 < var4) { // L: 4330
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4331
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4332
				}
			} else if (var2 < var4) { // L: 4334
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4335
				var0.orientation = 0;
			}

			class216 var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4336
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4337
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4344
				if (var6 > 1024) { // L: 4345
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4346
				if (var6 >= -256 && var6 <= 256) { // L: 4347
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4348
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4349
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) { // L: 4350
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7; // L: 4351
				int var8 = 4; // L: 4352
				boolean var9 = true; // L: 4353
				if (var0 instanceof NPC) { // L: 4354
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4355
					if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1209 != 0) { // L: 4356
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4357
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4358
						var8 = 8;
					}

					if (var0.field1213 > 0 && var0.pathLength > 1) { // L: 4359
						var8 = 8; // L: 4360
						--var0.field1213; // L: 4361
					}
				} else {
					if (var0.pathLength > 1) { // L: 4365
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4366
						var8 = 8;
					}

					if (var0.field1213 > 0 && var0.pathLength > 1) { // L: 4367
						var8 = 8; // L: 4368
						--var0.field1213; // L: 4369
					}
				}

				if (var5 == class216.field2384) { // L: 4372
					var8 <<= 1;
				} else if (var5 == class216.field2380) { // L: 4373
					var8 >>= 1;
				}

				if (var8 >= 8) { // L: 4374
					if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4375
						var0.movementSequence = var0.runSequence;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1156 != -1) { // L: 4376
						var0.movementSequence = var0.field1156;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1143 != -1) { // L: 4377
						var0.movementSequence = var0.field1143;
					} else if (var0.movementSequence == var0.walkRightSequence && var0.field1199 != -1) { // L: 4378
						var0.movementSequence = var0.field1199;
					}
				} else if (var8 <= 1) { // L: 4380
					if (var0.movementSequence == var0.walkSequence && var0.field1179 != -1) { // L: 4381
						var0.movementSequence = var0.field1179;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1157 != -1) { // L: 4382
						var0.movementSequence = var0.field1157;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1149 != -1) { // L: 4383
						var0.movementSequence = var0.field1149;
					} else if (var0.movementSequence == var0.walkRightSequence && var0.field1197 != -1) { // L: 4384
						var0.movementSequence = var0.field1197;
					}
				}

				if (var10 != var3 || var2 != var4) { // L: 4386
					if (var10 < var3) { // L: 4387
						var0.x += var8; // L: 4388
						if (var0.x > var3) { // L: 4389
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4391
						var0.x -= var8; // L: 4392
						if (var0.x < var3) { // L: 4393
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4395
						var0.y += var8; // L: 4396
						if (var0.y > var4) { // L: 4397
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4399
						var0.y -= var8; // L: 4400
						if (var0.y < var4) { // L: 4401
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4404
					--var0.pathLength; // L: 4405
					if (var0.field1214 > 0) { // L: 4406
						--var0.field1214;
					}
				}

			} else {
				var0.x = var3; // L: 4338
				var0.y = var4; // L: 4339
				--var0.pathLength; // L: 4340
				if (var0.field1214 > 0) { // L: 4341
					--var0.field1214;
				}

			}
		}
	} // L: 4307 4342 4408

	public GraphicsObject() {
	}
}
