import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public enum class6 implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	field14(0, 0);

	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1375980133
	)
	public final int field21;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1249543369
	)
	final int field13;

	class6(int var3, int var4) {
		this.field21 = var3; // L: 12
		this.field13 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field13; // L: 18
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(Ldi;II)V",
		garbageValue = "1987002078"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var5;
		int var7;
		int var11;
		if (var0.spotAnimation >= Client.cycle) { // L: 4174
			var11 = Math.max(1, var0.spotAnimation - Client.cycle); // L: 4175
			var3 = var0.field1238 * 128 + var0.field1189 * 64; // L: 4176
			var4 = var0.field1185 * 128 + var0.field1189 * 64; // L: 4177
			var0.x += (var3 - var0.x) / var11; // L: 4178
			var0.y += (var4 - var0.y) / var11; // L: 4179
			var0.field1233 = 0; // L: 4180
			var0.orientation = var0.field1254; // L: 4181
		} else if (var0.field1243 >= Client.cycle) { // L: 4183
			JagexCache.method3537(var0);
		} else {
			var0.movementSequence = var0.idleSequence; // L: 4185
			if (var0.pathLength == 0) { // L: 4186
				var0.field1233 = 0; // L: 4187
			} else {
				label681: {
					if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4190
						var2 = class36.SequenceDefinition_get(var0.sequence); // L: 4191
						if (var0.field1261 > 0 && var2.field2327 == 0) { // L: 4192
							++var0.field1233; // L: 4193
							break label681; // L: 4194
						}

						if (var0.field1261 <= 0 && var2.field2339 == 0) { // L: 4196
							++var0.field1233; // L: 4197
							break label681; // L: 4198
						}
					}

					var11 = var0.x; // L: 4201
					var3 = var0.y; // L: 4202
					var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1189 * 64; // L: 4203
					var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1189 * 64; // L: 4204
					if (var11 < var4) { // L: 4205
						if (var3 < var5) { // L: 4206
							var0.orientation = 1280;
						} else if (var3 > var5) { // L: 4207
							var0.orientation = 1792;
						} else {
							var0.orientation = 1536; // L: 4208
						}
					} else if (var11 > var4) { // L: 4210
						if (var3 < var5) { // L: 4211
							var0.orientation = 768;
						} else if (var3 > var5) { // L: 4212
							var0.orientation = 256;
						} else {
							var0.orientation = 512; // L: 4213
						}
					} else if (var3 < var5) { // L: 4215
						var0.orientation = 1024;
					} else if (var3 > var5) { // L: 4216
						var0.orientation = 0;
					}

					class231 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 4217
					if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 4218
						var7 = var0.orientation - var0.rotation & 2047; // L: 4225
						if (var7 > 1024) { // L: 4226
							var7 -= 2048;
						}

						int var8 = var0.walkBackSequence; // L: 4227
						if (var7 >= -256 && var7 <= 256) { // L: 4228
							var8 = var0.walkSequence;
						} else if (var7 >= 256 && var7 < 768) { // L: 4229
							var8 = var0.walkRightSequence;
						} else if (var7 >= -768 && var7 <= -256) { // L: 4230
							var8 = var0.walkLeftSequence;
						}

						if (var8 == -1) { // L: 4231
							var8 = var0.walkSequence;
						}

						var0.movementSequence = var8; // L: 4232
						int var9 = 4; // L: 4233
						boolean var10 = true; // L: 4234
						if (var0 instanceof NPC) { // L: 4235
							var10 = ((NPC)var0).definition.isClickable;
						}

						if (var10) { // L: 4236
							if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1216 != 0) { // L: 4237
								var9 = 2;
							}

							if (var0.pathLength > 2) { // L: 4238
								var9 = 6;
							}

							if (var0.pathLength > 3) { // L: 4239
								var9 = 8;
							}

							if (var0.field1233 > 0 && var0.pathLength > 1) { // L: 4240
								var9 = 8; // L: 4241
								--var0.field1233; // L: 4242
							}
						} else {
							if (var0.pathLength > 1) { // L: 4246
								var9 = 6;
							}

							if (var0.pathLength > 2) { // L: 4247
								var9 = 8;
							}

							if (var0.field1233 > 0 && var0.pathLength > 1) { // L: 4248
								var9 = 8; // L: 4249
								--var0.field1233; // L: 4250
							}
						}

						if (var6 == class231.field2427) { // L: 4253
							var9 <<= 1;
						} else if (var6 == class231.field2426) { // L: 4254
							var9 >>= 1;
						}

						if (var9 >= 8) { // L: 4255
							if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4256
								var0.movementSequence = var0.runSequence;
							} else if (var0.walkBackSequence == var0.movementSequence && var0.field1217 != -1) { // L: 4257
								var0.movementSequence = var0.field1217;
							} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1202 != -1) { // L: 4258
								var0.movementSequence = var0.field1202;
							} else if (var0.movementSequence == var0.walkRightSequence && var0.field1201 != -1) { // L: 4259
								var0.movementSequence = var0.field1201;
							}
						} else if (var9 <= 2) { // L: 4261
							if (var0.walkSequence == var0.movementSequence && var0.field1196 != -1) { // L: 4262
								var0.movementSequence = var0.field1196;
							} else if (var0.movementSequence == var0.walkBackSequence && var0.field1203 != -1) { // L: 4263
								var0.movementSequence = var0.field1203;
							} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1219 != -1) { // L: 4264
								var0.movementSequence = var0.field1219;
							} else if (var0.movementSequence == var0.walkRightSequence && var0.field1205 != -1) { // L: 4265
								var0.movementSequence = var0.field1205;
							}
						}

						if (var4 != var11 || var3 != var5) { // L: 4267
							if (var11 < var4) { // L: 4268
								var0.x += var9; // L: 4269
								if (var0.x > var4) { // L: 4270
									var0.x = var4;
								}
							} else if (var11 > var4) { // L: 4272
								var0.x -= var9; // L: 4273
								if (var0.x < var4) { // L: 4274
									var0.x = var4;
								}
							}

							if (var3 < var5) { // L: 4276
								var0.y += var9; // L: 4277
								if (var0.y > var5) { // L: 4278
									var0.y = var5;
								}
							} else if (var3 > var5) { // L: 4280
								var0.y -= var9; // L: 4281
								if (var0.y < var5) { // L: 4282
									var0.y = var5;
								}
							}
						}

						if (var4 == var0.x && var5 == var0.y) { // L: 4285
							--var0.pathLength; // L: 4286
							if (var0.field1261 > 0) { // L: 4287
								--var0.field1261;
							}
						}
					} else {
						var0.x = var4; // L: 4219
						var0.y = var5; // L: 4220
						--var0.pathLength; // L: 4221
						if (var0.field1261 > 0) { // L: 4222
							--var0.field1261;
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4290
			var0.sequence = -1; // L: 4291
			var0.spotAnimation = 0; // L: 4292
			var0.field1243 = 0; // L: 4293
			var0.method2434(); // L: 4294
			var0.x = var0.pathX[0] * 128 + var0.field1189 * 64; // L: 4295
			var0.y = var0.pathY[0] * 128 + var0.field1189 * 64; // L: 4296
			var0.method2421(); // L: 4297
		}

		if (TextureProvider.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4299 4300
			var0.sequence = -1; // L: 4301
			var0.spotAnimation = 0; // L: 4302
			var0.field1243 = 0; // L: 4303
			var0.method2434(); // L: 4304
			var0.x = var0.pathX[0] * 128 + var0.field1189 * 64; // L: 4305
			var0.y = var0.pathY[0] * 128 + var0.field1189 * 64; // L: 4306
			var0.method2421(); // L: 4307
		}

		if (var0.targetIndex != -1) { // L: 4311
			var2 = null; // L: 4312
			var3 = 65536; // L: 4313
			Object var16;
			if (var0.targetIndex < var3) { // L: 4314
				var16 = Client.npcs[var0.targetIndex]; // L: 4315
			} else {
				var16 = Client.players[var0.targetIndex - var3]; // L: 4318
			}

			if (var16 != null) { // L: 4320
				var4 = var0.x - ((Actor)var16).x; // L: 4321
				var5 = var0.y - ((Actor)var16).y; // L: 4322
				if (var4 != 0 || var5 != 0) { // L: 4323
					var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167D) & 2047; // L: 4327
					var0.orientation = var7; // L: 4329
				}
			} else if (var0.false0) { // L: 4332
				var0.targetIndex = -1; // L: 4333
				var0.false0 = false; // L: 4334
			}
		}

		int var12;
		if (var0.pathLength == 0 || var0.field1233 > 0) { // L: 4337
			var11 = -1; // L: 4338
			if (var0.field1224 != -1 && var0.field1225 != -1) { // L: 4339
				var3 = var0.field1224 * 128 - class20.baseX * 8192 + 64; // L: 4340
				var4 = var0.field1225 * 128 - class19.baseY * 8192 + 64; // L: 4341
				var5 = var0.x - var3; // L: 4342
				var12 = var0.y - var4; // L: 4343
				if (var5 != 0 || var12 != 0) { // L: 4344
					var7 = (int)(Math.atan2((double)var5, (double)var12) * 325.94932345220167D) & 2047; // L: 4347
					var11 = var7; // L: 4349
				}
			} else if (var0.field1223 != -1) { // L: 4352
				var11 = var0.field1223; // L: 4353
			}

			if (var11 != -1) { // L: 4355
				var0.orientation = var11; // L: 4356
				if (var0.field1240) { // L: 4357
					var0.rotation = var0.orientation; // L: 4358
				}
			}

			var0.method2430(); // L: 4361
		}

		var11 = var0.orientation - var0.rotation & 2047; // L: 4363
		if (var11 != 0) { // L: 4364
			boolean var18 = true; // L: 4365
			boolean var19 = true; // L: 4366
			++var0.field1212; // L: 4367
			var5 = var11 > 1024 ? -1 : 1; // L: 4368
			var0.rotation += var0.field1216 * var5; // L: 4369
			boolean var20 = true; // L: 4370
			if (var11 < var0.field1216 || var11 > 2048 - var0.field1216) { // L: 4371
				var0.rotation = var0.orientation; // L: 4372
				var20 = false; // L: 4373
			}

			if (var0.field1216 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1212 > 25 || var20)) { // L: 4375
				if (var5 == -1 && var0.field1192 != -1) { // L: 4376
					var0.movementSequence = var0.field1192; // L: 4377
				} else if (var5 == 1 && var0.field1193 != -1) { // L: 4379
					var0.movementSequence = var0.field1193; // L: 4380
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4383
				}
			}

			var0.rotation &= 2047; // L: 4387
		} else {
			if (var0.false0) { // L: 4390
				var0.targetIndex = -1; // L: 4391
				var0.false0 = false; // L: 4392
			}

			var0.field1212 = 0; // L: 4394
		}

		var0.isWalking = false; // L: 4398
		if (var0.movementSequence != -1) { // L: 4399
			var2 = class36.SequenceDefinition_get(var0.movementSequence); // L: 4400
			if (var2 != null) { // L: 4401
				if (!var2.isCachedModelIdSet() && var2.frameIds != null) { // L: 4402
					++var0.field1229; // L: 4403
					if (var0.movementFrame < var2.frameIds.length && var0.field1229 > var2.frameLengths[var0.movementFrame]) { // L: 4404
						var0.field1229 = 1; // L: 4405
						++var0.movementFrame; // L: 4406
						FontName.method8850(var2, var0.movementFrame, var0.x, var0.y); // L: 4407
					}

					if (var0.movementFrame >= var2.frameIds.length) { // L: 4409
						if (var2.frameCount > 0) { // L: 4410
							var0.movementFrame -= var2.frameCount; // L: 4411
							if (var2.field2319) { // L: 4412
								++var0.field1230;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2.frameIds.length || var2.field2319 && var0.field1230 >= var2.field2341) { // L: 4413
								var0.field1229 = 0; // L: 4414
								var0.movementFrame = 0; // L: 4415
								var0.field1230 = 0; // L: 4416
							}
						} else {
							var0.field1229 = 0; // L: 4420
							var0.movementFrame = 0; // L: 4421
						}

						FontName.method8850(var2, var0.movementFrame, var0.x, var0.y); // L: 4423
					}
				} else if (var2.isCachedModelIdSet()) { // L: 4426
					++var0.movementFrame; // L: 4427
					var3 = var2.method4177(); // L: 4428
					if (var0.movementFrame < var3) { // L: 4429
						ModeWhere.method7181(var2, var0.movementFrame, var0.x, var0.y); // L: 4430
					} else {
						if (var2.frameCount > 0) { // L: 4433
							var0.movementFrame -= var2.frameCount; // L: 4434
							if (var2.field2319) { // L: 4435
								++var0.field1230;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var3 || var2.field2319 && var0.field1230 >= var2.field2341) { // L: 4436
								var0.movementFrame = 0; // L: 4437
								var0.field1229 = 0; // L: 4438
								var0.field1230 = 0; // L: 4439
							}
						} else {
							var0.field1229 = 0; // L: 4443
							var0.movementFrame = 0; // L: 4444
						}

						ModeWhere.method7181(var2, var0.movementFrame, var0.x, var0.y); // L: 4446
					}
				} else {
					var0.movementSequence = -1; // L: 4449
				}
			} else {
				var0.movementSequence = -1; // L: 4451
			}
		}

		IterableNodeHashTableIterator var17 = new IterableNodeHashTableIterator(var0.method2425()); // L: 4453

		for (class551 var14 = (class551)var17.method8861(); var14 != null; var14 = (class551)var17.next()) { // L: 4454
			if (var14.field5281 != -1 && Client.cycle >= var14.field5282) { // L: 4455
				var4 = class406.SpotAnimationDefinition_get(var14.field5281).sequence; // L: 4458
				if (var4 == -1) { // L: 4459
					var14.remove(); // L: 4460
					--var0.field1237; // L: 4461
				} else {
					var14.field5280 = Math.max(var14.field5280, 0); // L: 4464
					SequenceDefinition var15 = class36.SequenceDefinition_get(var4); // L: 4465
					if (var15.frameIds != null && !var15.isCachedModelIdSet()) { // L: 4466
						++var14.field5279; // L: 4467
						if (var14.field5280 < var15.frameIds.length && var14.field5279 > var15.frameLengths[var14.field5280]) { // L: 4468
							var14.field5279 = 1; // L: 4469
							++var14.field5280; // L: 4470
							FontName.method8850(var15, var14.field5280, var0.x, var0.y); // L: 4471
						}

						if (var14.field5280 >= var15.frameIds.length) { // L: 4473
							var14.remove(); // L: 4474
							--var0.field1237; // L: 4475
						}
					} else if (var15.isCachedModelIdSet()) { // L: 4478
						++var14.field5280; // L: 4479
						var12 = var15.method4177(); // L: 4480
						if (var14.field5280 < var12) { // L: 4481
							ModeWhere.method7181(var15, var14.field5280, var0.x, var0.y); // L: 4482
						} else {
							var14.remove(); // L: 4485
							--var0.field1237; // L: 4486
						}
					} else {
						var14.remove(); // L: 4490
						--var0.field1237; // L: 4491
					}
				}
			}
		}

		SequenceDefinition var21;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4494
			var21 = class36.SequenceDefinition_get(var0.sequence); // L: 4495
			if (var21.field2327 == 1 && var0.field1261 > 0 && var0.spotAnimation <= Client.cycle && var0.field1243 < Client.cycle) { // L: 4496 4497
				var0.sequenceDelay = 1; // L: 4498
				return; // L: 4554
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4503
			var21 = class36.SequenceDefinition_get(var0.sequence); // L: 4504
			if (var21 == null) { // L: 4505
				var0.sequence = -1; // L: 4550
			} else if (!var21.isCachedModelIdSet() && var21.frameIds != null) { // L: 4506
				++var0.sequenceFrameCycle; // L: 4507
				if (var0.sequenceFrame < var21.frameIds.length && var0.sequenceFrameCycle > var21.frameLengths[var0.sequenceFrame]) { // L: 4508
					var0.sequenceFrameCycle = 1; // L: 4509
					++var0.sequenceFrame; // L: 4510
					FontName.method8850(var21, var0.sequenceFrame, var0.x, var0.y); // L: 4511
				}

				if (var0.sequenceFrame >= var21.frameIds.length) { // L: 4513
					var0.sequenceFrame -= var21.frameCount; // L: 4514
					++var0.field1235; // L: 4515
					if (var0.field1235 >= var21.field2341) { // L: 4516
						var0.sequence = -1; // L: 4517
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var21.frameIds.length) { // L: 4519
						FontName.method8850(var21, var0.sequenceFrame, var0.x, var0.y); // L: 4523
					} else {
						var0.sequence = -1; // L: 4520
					}
				}

				var0.isWalking = var21.field2338; // L: 4526
			} else if (var21.isCachedModelIdSet()) { // L: 4528
				++var0.sequenceFrame; // L: 4529
				var4 = var21.method4177(); // L: 4530
				if (var0.sequenceFrame < var4) { // L: 4531
					ModeWhere.method7181(var21, var0.sequenceFrame, var0.x, var0.y); // L: 4532
				} else {
					var0.sequenceFrame -= var21.frameCount; // L: 4535
					++var0.field1235; // L: 4536
					if (var0.field1235 >= var21.field2341) { // L: 4537
						var0.sequence = -1; // L: 4538
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var4) { // L: 4540
						ModeWhere.method7181(var21, var0.sequenceFrame, var0.x, var0.y); // L: 4544
					} else {
						var0.sequence = -1; // L: 4541
					}
				}
			} else {
				var0.sequence = -1; // L: 4548
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4552
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "569925847"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class10.scene.getWallObjectTag(var0, var1, var2); // L: 6344
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) { // L: 6345
			var7 = class10.scene.getObjectFlags(var0, var1, var2, var5); // L: 6346
			var8 = var7 >> 6 & 3; // L: 6347
			var9 = var7 & 31; // L: 6348
			var10 = var3; // L: 6349
			if (class372.method6898(var5)) { // L: 6350
				var10 = var4;
			}

			int[] var11 = SpriteMask.field3559.pixels; // L: 6351
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6352
			var13 = SecureRandomFuture.Entity_unpackID(var5); // L: 6353
			ObjectComposition var14 = class91.getObjectDefinition(var13); // L: 6354
			if (var14.mapSceneId != -1) { // L: 6355
				IndexedSprite var15 = KitDefinition.mapSceneSprites[var14.mapSceneId]; // L: 6356
				if (var15 != null) { // L: 6357
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 6358
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 6359
					var15.drawAt(var16 + var1 * 4 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48); // L: 6360
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 6364
					if (var8 == 0) { // L: 6365
						var11[var12] = var10; // L: 6366
						var11[var12 + 512] = var10; // L: 6367
						var11[var12 + 1024] = var10; // L: 6368
						var11[var12 + 1536] = var10; // L: 6369
					} else if (var8 == 1) { // L: 6371
						var11[var12] = var10; // L: 6372
						var11[var12 + 1] = var10; // L: 6373
						var11[var12 + 2] = var10; // L: 6374
						var11[var12 + 3] = var10; // L: 6375
					} else if (var8 == 2) { // L: 6377
						var11[var12 + 3] = var10; // L: 6378
						var11[var12 + 512 + 3] = var10; // L: 6379
						var11[var12 + 1024 + 3] = var10; // L: 6380
						var11[var12 + 1536 + 3] = var10; // L: 6381
					} else if (var8 == 3) { // L: 6383
						var11[var12 + 1536] = var10; // L: 6384
						var11[var12 + 1536 + 1] = var10; // L: 6385
						var11[var12 + 1536 + 2] = var10; // L: 6386
						var11[var12 + 1536 + 3] = var10; // L: 6387
					}
				}

				if (var9 == 3) { // L: 6390
					if (var8 == 0) { // L: 6391
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 6392
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 6393
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 6394
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 6396
					if (var8 == 3) { // L: 6397
						var11[var12] = var10; // L: 6398
						var11[var12 + 512] = var10; // L: 6399
						var11[var12 + 1024] = var10; // L: 6400
						var11[var12 + 1536] = var10; // L: 6401
					} else if (var8 == 0) { // L: 6403
						var11[var12] = var10; // L: 6404
						var11[var12 + 1] = var10; // L: 6405
						var11[var12 + 2] = var10; // L: 6406
						var11[var12 + 3] = var10; // L: 6407
					} else if (var8 == 1) { // L: 6409
						var11[var12 + 3] = var10; // L: 6410
						var11[var12 + 512 + 3] = var10; // L: 6411
						var11[var12 + 1024 + 3] = var10; // L: 6412
						var11[var12 + 1536 + 3] = var10; // L: 6413
					} else if (var8 == 2) { // L: 6415
						var11[var12 + 1536] = var10; // L: 6416
						var11[var12 + 1536 + 1] = var10; // L: 6417
						var11[var12 + 1536 + 2] = var10; // L: 6418
						var11[var12 + 1536 + 3] = var10; // L: 6419
					}
				}
			}
		}

		var5 = class10.scene.getGameObjectTag(var0, var1, var2); // L: 6424
		if (var5 != 0L) { // L: 6425
			var7 = class10.scene.getObjectFlags(var0, var1, var2, var5); // L: 6426
			var8 = var7 >> 6 & 3; // L: 6427
			var9 = var7 & 31; // L: 6428
			var10 = SecureRandomFuture.Entity_unpackID(var5); // L: 6429
			ObjectComposition var24 = class91.getObjectDefinition(var10); // L: 6430
			int var19;
			if (var24.mapSceneId != -1) { // L: 6431
				IndexedSprite var20 = KitDefinition.mapSceneSprites[var24.mapSceneId]; // L: 6432
				if (var20 != null) { // L: 6433
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 6434
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 6435
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48); // L: 6436
				}
			} else if (var9 == 9) { // L: 6439
				var12 = 15658734; // L: 6440
				if (class372.method6898(var5)) { // L: 6441
					var12 = 15597568;
				}

				int[] var18 = SpriteMask.field3559.pixels; // L: 6442
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 6443
				if (var8 != 0 && var8 != 2) { // L: 6444
					var18[var19] = var12; // L: 6451
					var18[var19 + 1 + 512] = var12; // L: 6452
					var18[var19 + 1024 + 2] = var12; // L: 6453
					var18[var19 + 1536 + 3] = var12; // L: 6454
				} else {
					var18[var19 + 1536] = var12; // L: 6445
					var18[var19 + 1 + 1024] = var12; // L: 6446
					var18[var19 + 512 + 2] = var12; // L: 6447
					var18[var19 + 3] = var12; // L: 6448
				}
			}
		}

		var5 = class10.scene.getGroundObjectTag(var0, var1, var2); // L: 6458
		if (0L != var5) { // L: 6459
			var7 = SecureRandomFuture.Entity_unpackID(var5); // L: 6460
			ObjectComposition var21 = class91.getObjectDefinition(var7); // L: 6461
			if (var21.mapSceneId != -1) { // L: 6462
				IndexedSprite var22 = KitDefinition.mapSceneSprites[var21.mapSceneId]; // L: 6463
				if (var22 != null) { // L: 6464
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 6465
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 6466
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48); // L: 6467
				}
			}
		}

	} // L: 6471

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-2045006615"
	)
	static final void method40(Widget var0) {
		int var1 = var0.contentType; // L: 12342
		if (var1 == 324) { // L: 12343
			if (Client.field805 == -1) { // L: 12344
				Client.field805 = var0.spriteId2; // L: 12345
				Client.field806 = var0.spriteId; // L: 12346
			}

			if (Client.playerAppearance.field3611 == 1) { // L: 12348
				var0.spriteId2 = Client.field805;
			} else {
				var0.spriteId2 = Client.field806; // L: 12349
			}

		} else if (var1 == 325) { // L: 12352
			if (Client.field805 == -1) { // L: 12353
				Client.field805 = var0.spriteId2; // L: 12354
				Client.field806 = var0.spriteId; // L: 12355
			}

			if (Client.playerAppearance.field3611 == 1) { // L: 12357
				var0.spriteId2 = Client.field806;
			} else {
				var0.spriteId2 = Client.field805; // L: 12358
			}

		} else if (var1 == 327) { // L: 12361
			var0.modelAngleX = 150; // L: 12362
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12363
			var0.modelType = 5; // L: 12364
			var0.modelId = 0; // L: 12365
		} else if (var1 == 328) { // L: 12368
			var0.modelAngleX = 150; // L: 12369
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12370
			var0.modelType = 5; // L: 12371
			var0.modelId = 1; // L: 12372
		}
	} // L: 12350 12359 12366 12373 12375
}
