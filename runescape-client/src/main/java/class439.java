import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
class class439 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	final class438 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lqw;)V"
	)
	class439(class438 var1) {
		this.this$0 = var1; // L: 84
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-856053440"
	)
	int method8183(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 86
	}

	public int compare(Object var1, Object var2) {
		return this.method8183((Entry)var1, (Entry)var2); // L: 90
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 94
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "-1619141249"
	)
	static final void method8184(Actor var0) {
		var0.isWalking = false; // L: 4449
		if (var0.movementSequence != -1) { // L: 4450
			SequenceDefinition var1 = MilliClock.SequenceDefinition_get(var0.movementSequence); // L: 4451
			if (var1 != null) { // L: 4452
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4453
					++var0.field1267; // L: 4454
					if (var0.movementFrame < var1.frameIds.length && var0.field1267 > var1.frameLengths[var0.movementFrame]) { // L: 4455
						var0.field1267 = 1; // L: 4456
						++var0.movementFrame; // L: 4457
						GraphicsObject.method2116(var1, var0.movementFrame, var0.x, var0.y, var0); // L: 4458
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4460
						if (var1.frameCount > 0) { // L: 4461
							var0.movementFrame -= var1.frameCount; // L: 4462
							if (var1.field2270) { // L: 4463
								++var0.field1232;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2270 && var0.field1232 >= var1.field2269) { // L: 4464
								var0.field1267 = 0; // L: 4465
								var0.movementFrame = 0; // L: 4466
								var0.field1232 = 0; // L: 4467
							}
						} else {
							var0.field1267 = 0; // L: 4471
							var0.movementFrame = 0; // L: 4472
						}

						GraphicsObject.method2116(var1, var0.movementFrame, var0.x, var0.y, var0); // L: 4474
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4477
					++var0.movementFrame; // L: 4478
					int var2 = var1.method4065(); // L: 4479
					if (var0.movementFrame < var2) { // L: 4480
						class334.method6394(var1, var0.movementFrame, var0.x, var0.y, var0); // L: 4481
					} else {
						if (var1.frameCount > 0) { // L: 4484
							var0.movementFrame -= var1.frameCount; // L: 4485
							if (var1.field2270) { // L: 4486
								++var0.field1232;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2270 && var0.field1232 >= var1.field2269) { // L: 4487
								var0.movementFrame = 0; // L: 4488
								var0.field1267 = 0; // L: 4489
								var0.field1232 = 0; // L: 4490
							}
						} else {
							var0.field1267 = 0; // L: 4494
							var0.movementFrame = 0; // L: 4495
						}

						class334.method6394(var1, var0.movementFrame, var0.x, var0.y, var0); // L: 4497
					}
				} else {
					var0.movementSequence = -1; // L: 4500
				}
			} else {
				var0.movementSequence = -1; // L: 4502
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2475()); // L: 4504

		int var3;
		for (class555 var6 = (class555)var7.method9127(); var6 != null; var6 = (class555)var7.next()) { // L: 4505
			if (var6.field5352 != -1 && Client.cycle >= var6.field5351) { // L: 4506
				var3 = VarbitComposition.SpotAnimationDefinition_get(var6.field5352).sequence; // L: 4509
				if (var3 == -1) { // L: 4510
					var6.remove(); // L: 4511
					--var0.field1256; // L: 4512
				} else {
					var6.field5349 = Math.max(var6.field5349, 0); // L: 4515
					SequenceDefinition var4 = MilliClock.SequenceDefinition_get(var3); // L: 4516
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) { // L: 4517
						++var6.field5350; // L: 4518
						if (var6.field5349 < var4.frameIds.length && var6.field5350 > var4.frameLengths[var6.field5349]) { // L: 4519
							var6.field5350 = 1; // L: 4520
							++var6.field5349; // L: 4521
							GraphicsObject.method2116(var4, var6.field5349, var0.x, var0.y, var0); // L: 4522
						}

						if (var6.field5349 >= var4.frameIds.length) { // L: 4524
							var6.remove(); // L: 4525
							--var0.field1256; // L: 4526
						}
					} else if (var4.isCachedModelIdSet()) { // L: 4529
						++var6.field5349; // L: 4530
						int var5 = var4.method4065(); // L: 4531
						if (var6.field5349 < var5) { // L: 4532
							class334.method6394(var4, var6.field5349, var0.x, var0.y, var0); // L: 4533
						} else {
							var6.remove(); // L: 4536
							--var0.field1256; // L: 4537
						}
					} else {
						var6.remove(); // L: 4541
						--var0.field1256; // L: 4542
					}
				}
			}
		}

		SequenceDefinition var8;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4545
			var8 = MilliClock.SequenceDefinition_get(var0.sequence); // L: 4546
			if (var8.field2271 == 1 && var0.field1280 > 0 && var0.spotAnimation <= Client.cycle && var0.field1271 < Client.cycle) { // L: 4547 4548
				var0.sequenceDelay = 1; // L: 4549
				return; // L: 4550
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4554
			var8 = MilliClock.SequenceDefinition_get(var0.sequence); // L: 4555
			if (var8 != null) { // L: 4556
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) { // L: 4557
					++var0.sequenceFrameCycle; // L: 4558
					if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) { // L: 4559
						var0.sequenceFrameCycle = 1; // L: 4560
						++var0.sequenceFrame; // L: 4561
						GraphicsObject.method2116(var8, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4562
					}

					if (var0.sequenceFrame >= var8.frameIds.length) { // L: 4564
						var0.sequenceFrame -= var8.frameCount; // L: 4565
						++var0.field1254; // L: 4566
						if (var0.field1254 >= var8.field2269) { // L: 4567
							var0.sequence = -1; // L: 4568
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) { // L: 4570
							GraphicsObject.method2116(var8, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4574
						} else {
							var0.sequence = -1; // L: 4571
						}
					}

					var0.isWalking = var8.field2265; // L: 4577
				} else if (var8.isCachedModelIdSet()) { // L: 4579
					++var0.sequenceFrame; // L: 4580
					var3 = var8.method4065(); // L: 4581
					if (var0.sequenceFrame < var3) { // L: 4582
						class334.method6394(var8, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4583
					} else {
						var0.sequenceFrame -= var8.frameCount; // L: 4586
						++var0.field1254; // L: 4587
						if (var0.field1254 >= var8.field2269) { // L: 4588
							var0.sequence = -1; // L: 4589
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) { // L: 4591
							class334.method6394(var8, var0.sequenceFrame, var0.x, var0.y, var0); // L: 4595
						} else {
							var0.sequence = -1; // L: 4592
						}
					}
				} else {
					var0.sequence = -1; // L: 4599
				}
			} else {
				var0.sequence = -1; // L: 4601
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4603
			--var0.sequenceDelay;
		}

	} // L: 4604

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-435095249"
	)
	static final void method8189(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 8674
			if (Client.isLowDetail && var0 != class473.Client_plane) { // L: 8675
				return;
			}

			long var8 = 0L; // L: 8676
			boolean var10 = true; // L: 8677
			boolean var11 = false; // L: 8678
			boolean var12 = false; // L: 8679
			if (var1 == 0) { // L: 8680
				var8 = Actor.scene.getWallObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 8681
				var8 = Actor.scene.getDecorativeObjectTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 8682
				var8 = Actor.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 8683
				var8 = Actor.scene.getGroundObjectTag(var0, var2, var3);
			}

			int var13;
			ObjectComposition var14;
			if (var8 != 0L) { // L: 8684
				var13 = Actor.scene.getObjectFlags(var0, var2, var3, var8); // L: 8685
				int var25 = Message.Entity_unpackID(var8); // L: 8686
				int var26 = var13 & 31; // L: 8687
				int var27 = var13 >> 6 & 3; // L: 8688
				var14 = class127.getObjectDefinition(var25); // L: 8689
				if (var14 != null && var14.hasSound()) { // L: 8693
					int var17 = var14.sizeX; // L: 8694
					int var18 = var14.sizeY; // L: 8695
					if (var27 == 1 || var27 == 3) { // L: 8696
						var17 = var14.sizeY; // L: 8697
						var18 = var14.sizeX; // L: 8698
					}

					int var19 = (var2 + var17) * 128; // L: 8700
					int var20 = (var3 + var18) * 128; // L: 8701
					int var15 = var2 * 128; // L: 8702
					int var16 = var3 * 128; // L: 8703
					int var21 = var14.ambientSoundId; // L: 8704
					int var22 = var14.int7 * 128; // L: 8705
					int var23 = var14.field2130 * 16384; // L: 8706
					if (var14.transforms != null) { // L: 8707
						ObjectComposition var24 = var14.transform(); // L: 8708
						if (var24 != null) { // L: 8709
							var21 = var24.ambientSoundId; // L: 8710
							var22 = var24.int7 * 128; // L: 8711
							var23 = var24.field2130 * 16384; // L: 8712
						}
					}

					Object var10000 = null;

					for (ObjectSound var28 = (ObjectSound)ObjectSound.objectSounds.last(); var28 != null; var28 = (ObjectSound)ObjectSound.objectSounds.previous()) {
						if (var0 == var28.plane && var15 == var28.x * 128 && var16 == var28.y * 16384 && var19 == var28.maxX * 16384 && var20 == var28.maxY * 16384 && var21 == var28.soundEffectId && var22 == var28.field872 && var23 == var28.field864) { // L: 8716
							if (var28.stream1 != null) { // L: 8717
								SceneTilePaint.pcmStreamMixer.removeSubStream(var28.stream1); // L: 8718
								var28.stream1 = null; // L: 8719
							}

							if (var28.stream2 != null) { // L: 8721
								SceneTilePaint.pcmStreamMixer.removeSubStream(var28.stream2); // L: 8722
								var28.stream2 = null; // L: 8723
							}

							var28.remove(); // L: 8725
							break; // L: 8726
						}

						var10000 = null; // L: 8715
					}
				}

				if (var1 == 0) { // L: 8731
					Actor.scene.method5437(var0, var2, var3); // L: 8732
					if (var14.interactType != 0) { // L: 8733
						Client.collisionMaps[var0].method4476(var2, var3, var26, var27, var14.boolean1);
					}
				}

				if (var1 == 1) { // L: 8735
					Actor.scene.method5438(var0, var2, var3);
				}

				if (var1 == 2) { // L: 8736
					Actor.scene.removeGameObject(var0, var2, var3); // L: 8737
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) { // L: 8738
						return;
					}

					if (var14.interactType != 0) { // L: 8739
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var27, var14.boolean1);
					}
				}

				if (var1 == 3) { // L: 8741
					Actor.scene.method5440(var0, var2, var3); // L: 8742
					if (var14.interactType == 1) { // L: 8743
						Client.collisionMaps[var0].method4489(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 8746
				var13 = var0; // L: 8747
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 8748
					var13 = var0 + 1;
				}

				World.method1821(var0, var13, var2, var3, var4, var5, var6, var7, Actor.scene, Client.collisionMaps[var0]); // L: 8749
				var14 = class127.getObjectDefinition(var4); // L: 8750
				if (var14 != null && var14.hasSound()) { // L: 8751
					WorldMapScaleHandler.method5153(var13, var2, var3, var14, var5); // L: 8752
				}
			}
		}

	} // L: 8756
}
