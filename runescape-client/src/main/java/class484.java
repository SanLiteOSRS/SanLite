import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class484 {
	@ObfuscatedName("an")
	static final int[] field4915;
	@ObfuscatedName("ao")
	static final int[] field4918;

	static {
		field4915 = new int[16384]; // L: 8
		field4918 = new int[16384]; // L: 9
		double var0 = 3.834951969714103E-4D; // L: 12

		for (int var2 = 0; var2 < 16384; ++var2) { // L: 13
			field4915[var2] = (int)(16384.0D * Math.sin((double)var2 * var0)); // L: 14
			field4918[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2)); // L: 15
		}

	} // L: 17

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "139624089"
	)
	static final void method8581(Actor var0) {
		var0.isWalking = false; // L: 4405
		if (var0.movementSequence != -1) { // L: 4406
			SequenceDefinition var1 = DevicePcmPlayerProvider.SequenceDefinition_get(var0.movementSequence); // L: 4407
			if (var1 != null) { // L: 4408
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4409
					++var0.field1242; // L: 4410
					if (var0.movementFrame < var1.frameIds.length && var0.field1242 > var1.frameLengths[var0.movementFrame]) { // L: 4411
						var0.field1242 = 1; // L: 4412
						++var0.movementFrame; // L: 4413
						AbstractWorldMapIcon.method5729(var1, var0.movementFrame, var0.x, var0.y, var0); // L: 4414
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4416
						if (var1.frameCount > 0) { // L: 4417
							var0.movementFrame -= var1.frameCount; // L: 4418
							if (var1.field2397) { // L: 4419
								++var0.field1243;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2397 && var0.field1243 >= var1.field2388) { // L: 4420
								var0.field1242 = 0; // L: 4421
								var0.movementFrame = 0; // L: 4422
								var0.field1243 = 0; // L: 4423
							}
						} else {
							var0.field1242 = 0; // L: 4427
							var0.movementFrame = 0; // L: 4428
						}

						AbstractWorldMapIcon.method5729(var1, var0.movementFrame, var0.x, var0.y, var0); // L: 4430
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4433
					++var0.movementFrame; // L: 4434
					int var2 = var1.method4232(); // L: 4435
					if (var0.movementFrame < var2) { // L: 4436
						WorldMapLabelSize.method5246(var1, var0.movementFrame, var0.x, var0.y, var0); // L: 4437
					} else {
						if (var1.frameCount > 0) { // L: 4440
							var0.movementFrame -= var1.frameCount; // L: 4441
							if (var1.field2397) { // L: 4442
								++var0.field1243;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2397 && var0.field1243 >= var1.field2388) { // L: 4443
								var0.movementFrame = 0; // L: 4444
								var0.field1242 = 0; // L: 4445
								var0.field1243 = 0; // L: 4446
							}
						} else {
							var0.field1242 = 0; // L: 4450
							var0.movementFrame = 0; // L: 4451
						}

						WorldMapLabelSize.method5246(var1, var0.movementFrame, var0.x, var0.y, var0); // L: 4453
					}
				} else {
					var0.movementSequence = -1; // L: 4456
				}
			} else {
				var0.movementSequence = -1; // L: 4458
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2399()); // L: 4460

		int var3;
		for (class556 var6 = (class556)var7.method8943(); var6 != null; var6 = (class556)var7.next()) { // L: 4461
			if (var6.field5380 != -1 && Client.cycle >= var6.field5381) { // L: 4462
				var3 = UserComparator3.SpotAnimationDefinition_get(var6.field5380).sequence; // L: 4465
				if (var3 == -1) { // L: 4466
					var6.remove(); // L: 4467
					--var0.field1220; // L: 4468
				} else {
					var6.field5378 = Math.max(var6.field5378, 0); // L: 4471
					SequenceDefinition var4 = DevicePcmPlayerProvider.SequenceDefinition_get(var3); // L: 4472
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) { // L: 4473
						++var6.field5379; // L: 4474
						if (var6.field5378 < var4.frameIds.length && var6.field5379 > var4.frameLengths[var6.field5378]) { // L: 4475
							var6.field5379 = 1; // L: 4476
							++var6.field5378; // L: 4477
							AbstractWorldMapIcon.method5729(var4, var6.field5378, var0.x, var0.y, var0); // L: 4478
						}

						if (var6.field5378 >= var4.frameIds.length) { // L: 4480
							var6.remove(); // L: 4481
							--var0.field1220; // L: 4482
						}
					} else if (var4.isCachedModelIdSet()) { // L: 4485
						++var6.field5378; // L: 4486
						int var5 = var4.method4232(); // L: 4487
						if (var6.field5378 < var5) { // L: 4488
							WorldMapLabelSize.method5246(var4, var6.field5378, var0.x, var0.y, var0); // L: 4489
						} else {
							var6.remove(); // L: 4492
							--var0.field1220; // L: 4493
						}
					} else {
						var6.remove(); // L: 4497
						--var0.field1220; // L: 4498
					}
				}
			}
		}

		SequenceDefinition var8;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4501
			var8 = DevicePcmPlayerProvider.SequenceDefinition_get(var0.sequence); // L: 4502
			if (var8.field2398 == 1 && var0.field1274 > 0 && var0.spotAnimation <= Client.cycle && var0.field1256 < Client.cycle) { // L: 4503 4504
				var0.sequenceDelay = 1; // L: 4505
				return; // L: 4506
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4510
			var8 = DevicePcmPlayerProvider.SequenceDefinition_get(var0.sequence); // L: 4511
			if (var8 != null) { // L: 4512
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) { // L: 4513
					++var0.sequenceFrameCycle; // L: 4514
					if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) { // L: 4515
						var0.sequenceFrameCycle = 1; // L: 4516
						++var0.sequenceFrame; // L: 4517
						AbstractWorldMapIcon.method5729(var8, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4518
					}

					if (var0.sequenceFrame >= var8.frameIds.length) { // L: 4520
						var0.sequenceFrame -= var8.frameCount; // L: 4521
						++var0.field1248; // L: 4522
						if (var0.field1248 >= var8.field2388) { // L: 4523
							var0.sequence = -1; // L: 4524
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) { // L: 4526
							AbstractWorldMapIcon.method5729(var8, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4530
						} else {
							var0.sequence = -1; // L: 4527
						}
					}

					var0.isWalking = var8.field2376; // L: 4533
				} else if (var8.isCachedModelIdSet()) { // L: 4535
					++var0.sequenceFrame; // L: 4536
					var3 = var8.method4232(); // L: 4537
					if (var0.sequenceFrame < var3) { // L: 4538
						WorldMapLabelSize.method5246(var8, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4539
					} else {
						var0.sequenceFrame -= var8.frameCount; // L: 4542
						++var0.field1248; // L: 4543
						if (var0.field1248 >= var8.field2388) { // L: 4544
							var0.sequence = -1; // L: 4545
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) { // L: 4547
							WorldMapLabelSize.method5246(var8, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4551
						} else {
							var0.sequence = -1; // L: 4548
						}
					}
				} else {
					var0.sequence = -1; // L: 4555
				}
			} else {
				var0.sequence = -1; // L: 4557
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4559
			--var0.sequenceDelay;
		}

	} // L: 4560
}
