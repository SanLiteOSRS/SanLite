import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2463689
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -636454485
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 677245085
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1268728333
	)
	@Export("x")
	int x;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -936729713
	)
	@Export("y")
	int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1829727049
	)
	@Export("z")
	int z;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -989227779
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -680875237
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("az")
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
		int var8 = TextureProvider.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = class140.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1003433701"
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
				if (this.frame >= this.sequenceDefinition.method4174()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljr;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = TextureProvider.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Ldt;II)V",
		garbageValue = "212329683"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var11;
		if (var0.spotAnimation >= Client.cycle) { // L: 4137
			var11 = Math.max(1, var0.spotAnimation - Client.cycle); // L: 4138
			var3 = var0.field1229 * 128 + var0.field1181 * 64; // L: 4139
			var4 = var0.field1231 * 128 + var0.field1181 * 64; // L: 4140
			var0.x += (var3 - var0.x) / var11; // L: 4141
			var0.y += (var4 - var0.y) / var11; // L: 4142
			var0.field1251 = 0; // L: 4143
			var0.orientation = var0.field1235; // L: 4144
		} else if (var0.field1234 >= Client.cycle) { // L: 4146
			StudioGame.method6669(var0);
		} else {
			var0.movementSequence = var0.idleSequence; // L: 4148
			if (var0.pathLength == 0) { // L: 4149
				var0.field1251 = 0; // L: 4150
			} else {
				label575: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4153
						var2 = class140.SequenceDefinition_get(var0.sequence); // L: 4154
						if (var0.field1252 > 0 && var2.field2299 == 0) { // L: 4155
							++var0.field1251; // L: 4156
							break label575; // L: 4157
						}

						if (var0.field1252 <= 0 && var2.field2275 == 0) { // L: 4159
							++var0.field1251; // L: 4160
							break label575; // L: 4161
						}
					}

					var11 = var0.x; // L: 4164
					var3 = var0.y; // L: 4165
					var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1181 * 64; // L: 4166
					int var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1181 * 64; // L: 4167
					if (var11 < var4) { // L: 4168
						if (var3 < var5) { // L: 4169
							var0.orientation = 1280;
						} else if (var3 > var5) { // L: 4170
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536; // L: 4171
						}
					} else if (var11 > var4) { // L: 4173
						if (var3 < var5) { // L: 4174
							var0.orientation = 768;
						} else if (var3 > var5) { // L: 4175
							var0.orientation = 256;
						} else {
							var0.orientation = 512; // L: 4176
						}
					} else if (var3 < var5) { // L: 4178
						var0.orientation = 1024;
					} else if (var3 > var5) { // L: 4179
						var0.orientation = 0;
					}

					class217 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 4180
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 4181
						int var7 = var0.orientation - var0.rotation & 2047; // L: 4188
						if (var7 > 1024) { // L: 4189
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence; // L: 4190
						if (var7 >= -256 && var7 <= 256) { // L: 4191
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) { // L: 4192
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) { // L: 4193
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) { // L: 4194
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8; // L: 4195
						int var9 = 4; // L: 4196
						boolean var10 = true; // L: 4197
						if (var0 instanceof NPC) { // L: 4198
							var10 = ((NPC)var0).definition.isClickable;
						}

						if (var10) { // L: 4199
							if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1228 != 0) { // L: 4200
								var9 = 2;
							}

							if (var0.pathLength > 2) { // L: 4201
								var9 = 6;
							}

							if (var0.pathLength > 3) { // L: 4202
								var9 = 8;
							}

							if (var0.field1251 > 0 && var0.pathLength > 1) { // L: 4203
								var9 = 8; // L: 4204
								--var0.field1251; // L: 4205
							}
						} else {
							if (var0.pathLength > 1) { // L: 4209
								var9 = 6;
							}

							if (var0.pathLength > 2) { // L: 4210
								var9 = 8;
							}

							if (var0.field1251 > 0 && var0.pathLength > 1) { // L: 4211
								var9 = 8; // L: 4212
								--var0.field1251; // L: 4213
							}
						}

						if (var6 == class217.field2395) { // L: 4216
							var9 <<= 1;
						} else if (var6 == class217.field2392) { // L: 4217
							var9 >>= 1;
						}

						if (var9 >= 8) { // L: 4218
							if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4219
								var0.movementSequence = var0.runSequence;
							} else if (var0.movementSequence == var0.walkBackSequence && var0.field1191 != -1) { // L: 4220
								var0.movementSequence = var0.field1191;
							} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1192 != -1) { // L: 4221
								var0.movementSequence = var0.field1192;
							} else if (var0.movementSequence == var0.walkRightSequence && var0.field1193 != -1) { // L: 4222
								var0.movementSequence = var0.field1193;
							}
						} else if (var9 <= 2) { // L: 4224
							if (var0.movementSequence == var0.walkSequence && var0.field1194 != -1) { // L: 4225
								var0.movementSequence = var0.field1194;
							} else if (var0.movementSequence == var0.walkBackSequence && var0.field1195 != -1) { // L: 4226
								var0.movementSequence = var0.field1195;
							} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1196 != -1) { // L: 4227
								var0.movementSequence = var0.field1196;
							} else if (var0.walkRightSequence == var0.movementSequence && var0.field1197 != -1) { // L: 4228
								var0.movementSequence = var0.field1197;
							}
						}

						if (var4 != var11 || var5 != var3) { // L: 4230
							if (var11 < var4) { // L: 4231
								var0.x += var9; // L: 4232
								if (var0.x > var4) { // L: 4233
									var0.x = var4;
								}
							} else if (var11 > var4) { // L: 4235
								var0.x -= var9; // L: 4236
								if (var0.x < var4) { // L: 4237
									var0.x = var4;
								}
							}

							if (var3 < var5) { // L: 4239
								var0.y += var9; // L: 4240
								if (var0.y > var5) { // L: 4241
									var0.y = var5;
								}
							} else if (var3 > var5) { // L: 4243
								var0.y -= var9; // L: 4244
								if (var0.y < var5) { // L: 4245
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) { // L: 4248
							--var0.pathLength; // L: 4249
							if (var0.field1252 > 0) { // L: 4250
								--var0.field1252;
							}
						}
					} else {
						var0.x = var4; // L: 4182
						var0.y = var5; // L: 4183
						--var0.pathLength; // L: 4184
						if (var0.field1252 > 0) { // L: 4185
							--var0.field1252;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4253
			var0.sequence = -1; // L: 4254
			var0.spotAnimation = 0; // L: 4255
			var0.field1234 = 0; // L: 4256
			var0.method2430(); // L: 4257
			var0.x = var0.pathX[0] * 128 + var0.field1181 * 64; // L: 4258
			var0.y = var0.pathY[0] * 128 + var0.field1181 * 64; // L: 4259
			var0.method2445(); // L: 4260
		}

		if (class27.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4262 4263
			var0.sequence = -1; // L: 4264
			var0.spotAnimation = 0; // L: 4265
			var0.field1234 = 0; // L: 4266
			var0.method2430(); // L: 4267
			var0.x = var0.pathX[0] * 128 + var0.field1181 * 64; // L: 4268
			var0.y = var0.pathY[0] * 128 + var0.field1181 * 64; // L: 4269
			var0.method2445(); // L: 4270
		}

		SoundCache.method872(var0); // L: 4273
		var0.isWalking = false; // L: 4275
		if (var0.movementSequence != -1) { // L: 4276
			var2 = class140.SequenceDefinition_get(var0.movementSequence); // L: 4277
			if (var2 != null) { // L: 4278
				if (!var2.isCachedModelIdSet() && var2.frameIds != null) { // L: 4279
					++var0.field1220; // L: 4280
					if (var0.movementFrame < var2.frameIds.length && var0.field1220 > var2.frameLengths[var0.movementFrame]) { // L: 4281
						var0.field1220 = 1; // L: 4282
						++var0.movementFrame; // L: 4283
						WorldMapDecorationType.method6643(var2, var0.movementFrame, var0.x, var0.y); // L: 4284
					}

					if (var0.movementFrame >= var2.frameIds.length) { // L: 4286
						if (var2.frameCount > 0) { // L: 4287
							var0.movementFrame -= var2.frameCount; // L: 4288
							if (var2.field2298) { // L: 4289
								++var0.field1214;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2.frameIds.length || var2.field2298 && var0.field1214 >= var2.field2292) { // L: 4290
								var0.field1220 = 0; // L: 4291
								var0.movementFrame = 0; // L: 4292
								var0.field1214 = 0; // L: 4293
							}
						} else {
							var0.field1220 = 0; // L: 4297
							var0.movementFrame = 0; // L: 4298
						}

						WorldMapDecorationType.method6643(var2, var0.movementFrame, var0.x, var0.y); // L: 4300
					}
				} else if (var2.isCachedModelIdSet()) { // L: 4303
					++var0.movementFrame; // L: 4304
					var3 = var2.method4174(); // L: 4305
					if (var0.movementFrame < var3) { // L: 4306
						Skills.method6649(var2, var0.movementFrame, var0.x, var0.y); // L: 4307
					} else {
						if (var2.frameCount > 0) { // L: 4310
							var0.movementFrame -= var2.frameCount; // L: 4311
							if (var2.field2298) { // L: 4312
								++var0.field1214;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var3 || var2.field2298 && var0.field1214 >= var2.field2292) { // L: 4313
								var0.movementFrame = 0; // L: 4314
								var0.field1220 = 0; // L: 4315
								var0.field1214 = 0; // L: 4316
							}
						} else {
							var0.field1220 = 0; // L: 4320
							var0.movementFrame = 0; // L: 4321
						}

						Skills.method6649(var2, var0.movementFrame, var0.x, var0.y); // L: 4323
					}
				} else {
					var0.movementSequence = -1; // L: 4326
				}
			} else {
				var0.movementSequence = -1; // L: 4328
			}
		}

		IterableNodeHashTableIterator var15 = new IterableNodeHashTableIterator(var0.method2436()); // L: 4330

		for (class535 var12 = (class535)var15.method8709(); var12 != null; var12 = (class535)var15.next()) { // L: 4331
			if (var12.field5220 != -1 && Client.cycle >= var12.field5221) { // L: 4332
				var4 = TextureProvider.SpotAnimationDefinition_get(var12.field5220).sequence; // L: 4335
				if (var4 == -1) { // L: 4336
					var12.remove(); // L: 4337
					--var0.field1242; // L: 4338
				} else {
					var12.field5218 = Math.max(var12.field5218, 0); // L: 4341
					SequenceDefinition var13 = class140.SequenceDefinition_get(var4); // L: 4342
					if (var13.frameIds != null && !var13.isCachedModelIdSet()) { // L: 4343
						++var12.field5219; // L: 4344
						if (var12.field5218 < var13.frameIds.length && var12.field5219 > var13.frameLengths[var12.field5218]) { // L: 4345
							var12.field5219 = 1; // L: 4346
							++var12.field5218; // L: 4347
							WorldMapDecorationType.method6643(var13, var12.field5218, var0.x, var0.y); // L: 4348
						}

						if (var12.field5218 >= var13.frameIds.length) { // L: 4350
							var12.remove(); // L: 4351
							--var0.field1242; // L: 4352
						}
					} else if (var13.isCachedModelIdSet()) { // L: 4355
						++var12.field5218; // L: 4356
						int var14 = var13.method4174(); // L: 4357
						if (var12.field5218 < var14) { // L: 4358
							Skills.method6649(var13, var12.field5218, var0.x, var0.y); // L: 4359
						} else {
							var12.remove(); // L: 4362
							--var0.field1242; // L: 4363
						}
					} else {
						var12.remove(); // L: 4367
						--var0.field1242; // L: 4368
					}
				}
			}
		}

		SequenceDefinition var16;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4371
			var16 = class140.SequenceDefinition_get(var0.sequence); // L: 4372
			if (var16.field2299 == 1 && var0.field1252 > 0 && var0.spotAnimation <= Client.cycle && var0.field1234 < Client.cycle) { // L: 4373 4374
				var0.sequenceDelay = 1; // L: 4375
				return; // L: 4431
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4380
			var16 = class140.SequenceDefinition_get(var0.sequence); // L: 4381
			if (var16 == null) { // L: 4382
				var0.sequence = -1; // L: 4427
			} else if (!var16.isCachedModelIdSet() && var16.frameIds != null) { // L: 4383
				++var0.sequenceFrameCycle; // L: 4384
				if (var0.sequenceFrame < var16.frameIds.length && var0.sequenceFrameCycle > var16.frameLengths[var0.sequenceFrame]) { // L: 4385
					var0.sequenceFrameCycle = 1; // L: 4386
					++var0.sequenceFrame; // L: 4387
					WorldMapDecorationType.method6643(var16, var0.sequenceFrame, var0.x, var0.y); // L: 4388
				}

				if (var0.sequenceFrame >= var16.frameIds.length) { // L: 4390
					var0.sequenceFrame -= var16.frameCount; // L: 4391
					++var0.field1226; // L: 4392
					if (var0.field1226 >= var16.field2292) { // L: 4393
						var0.sequence = -1; // L: 4394
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var16.frameIds.length) { // L: 4396
						WorldMapDecorationType.method6643(var16, var0.sequenceFrame, var0.x, var0.y); // L: 4400
					} else {
						var0.sequence = -1; // L: 4397
					}
				}

				var0.isWalking = var16.field2290; // L: 4403
			} else if (var16.isCachedModelIdSet()) { // L: 4405
				++var0.sequenceFrame; // L: 4406
				var4 = var16.method4174(); // L: 4407
				if (var0.sequenceFrame < var4) { // L: 4408
					Skills.method6649(var16, var0.sequenceFrame, var0.x, var0.y); // L: 4409
				} else {
					var0.sequenceFrame -= var16.frameCount; // L: 4412
					++var0.field1226; // L: 4413
					if (var0.field1226 >= var16.field2292) { // L: 4414
						var0.sequence = -1; // L: 4415
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var4) { // L: 4417
						Skills.method6649(var16, var0.sequenceFrame, var0.x, var0.y); // L: 4421
					} else {
						var0.sequence = -1; // L: 4418
					}
				}
			} else {
				var0.sequence = -1; // L: 4425
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4429
			--var0.sequenceDelay;
		}

	}

	public GraphicsObject() {
	}
}
