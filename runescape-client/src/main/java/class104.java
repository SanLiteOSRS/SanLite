import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
final class class104 implements class321 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static IndexedSprite field1322;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmb;)V"
	)
	class104(Widget var1) {
		this.val$cc = var1; // L: 502
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
	public void vmethod5986() {
		if (this.val$cc != null && this.val$cc.method6383().field3533 != null) { // L: 504
			ScriptEvent var1 = new ScriptEvent(); // L: 505
			var1.method2247(this.val$cc); // L: 506
			var1.setArgs(this.val$cc.method6383().field3533); // L: 507
			Message.method1177().addFirst(var1); // L: 508
		}

	} // L: 510

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "1467572188"
	)
	public static Object method2665(byte[] var0, boolean var1) {
		if (var0 == null) { // L: 7
			return null;
		} else if (var0.length > 136) { // L: 8
			DirectByteArrayCopier var2 = new DirectByteArrayCopier(); // L: 10
			var2.set(var0); // L: 11
			return var2; // L: 12
		} else {
			return var0; // L: 16
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "181839988"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 70
		if (var1 == null) { // L: 71
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 72 73
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1413449120"
	)
	static void method2672() {
		class390.method7249(24); // L: 2061
		class478.setLoginResponseString("", "You were disconnected from the server.", ""); // L: 2062
	} // L: 2063

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(Ldi;B)V",
		garbageValue = "0"
	)
	static final void method2671(Actor var0) {
		var0.isWalking = false; // L: 4392
		if (var0.movementSequence != -1) { // L: 4393
			SequenceDefinition var1 = WorldMapLabelSize.SequenceDefinition_get(var0.movementSequence); // L: 4394
			if (var1 != null) { // L: 4395
				if (!var1.isCachedModelIdSet() && var1.frameIds != null) { // L: 4396
					++var0.field1194; // L: 4397
					if (var0.movementFrame < var1.frameIds.length && var0.field1194 > var1.frameLengths[var0.movementFrame]) { // L: 4398
						var0.field1194 = 1; // L: 4399
						++var0.movementFrame; // L: 4400
						FaceNormal.method4718(var1, var0.movementFrame, var0.x, var0.y); // L: 4401
					}

					if (var0.movementFrame >= var1.frameIds.length) { // L: 4403
						if (var1.frameCount > 0) { // L: 4404
							var0.movementFrame -= var1.frameCount; // L: 4405
							if (var1.field2296) { // L: 4406
								++var0.field1195;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var1.frameIds.length || var1.field2296 && var0.field1195 >= var1.field2297) { // L: 4407
								var0.field1194 = 0; // L: 4408
								var0.movementFrame = 0; // L: 4409
								var0.field1195 = 0; // L: 4410
							}
						} else {
							var0.field1194 = 0; // L: 4414
							var0.movementFrame = 0; // L: 4415
						}

						FaceNormal.method4718(var1, var0.movementFrame, var0.x, var0.y); // L: 4417
					}
				} else if (var1.isCachedModelIdSet()) { // L: 4420
					++var0.movementFrame; // L: 4421
					int var2 = var1.method4084(); // L: 4422
					if (var0.movementFrame < var2) { // L: 4423
						ModeWhere.method6916(var1, var0.movementFrame, var0.x, var0.y); // L: 4424
					} else {
						if (var1.frameCount > 0) { // L: 4427
							var0.movementFrame -= var1.frameCount; // L: 4428
							if (var1.field2296) { // L: 4429
								++var0.field1195;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2 || var1.field2296 && var0.field1195 >= var1.field2297) { // L: 4430
								var0.movementFrame = 0; // L: 4431
								var0.field1194 = 0; // L: 4432
								var0.field1195 = 0; // L: 4433
							}
						} else {
							var0.field1194 = 0; // L: 4437
							var0.movementFrame = 0; // L: 4438
						}

						ModeWhere.method6916(var1, var0.movementFrame, var0.x, var0.y); // L: 4440
					}
				} else {
					var0.movementSequence = -1; // L: 4443
				}
			} else {
				var0.movementSequence = -1; // L: 4445
			}
		}

		IterableNodeHashTableIterator var7 = new IterableNodeHashTableIterator(var0.method2391()); // L: 4447

		int var3;
		for (class523 var6 = (class523)var7.method8589(); var6 != null; var6 = (class523)var7.next()) { // L: 4448
			if (var6.field5165 != -1 && Client.cycle >= var6.field5170) { // L: 4449
				var3 = class53.SpotAnimationDefinition_get(var6.field5165).sequence; // L: 4452
				if (var3 == -1) { // L: 4453
					var6.remove(); // L: 4454
					--var0.field1193; // L: 4455
				} else {
					var6.field5168 = Math.max(var6.field5168, 0); // L: 4458
					SequenceDefinition var4 = WorldMapLabelSize.SequenceDefinition_get(var3); // L: 4459
					if (var4.frameIds != null && !var4.isCachedModelIdSet()) { // L: 4460
						++var6.field5167; // L: 4461
						if (var6.field5168 < var4.frameIds.length && var6.field5167 > var4.frameLengths[var6.field5168]) { // L: 4462
							var6.field5167 = 1; // L: 4463
							++var6.field5168; // L: 4464
							FaceNormal.method4718(var4, var6.field5168, var0.x, var0.y); // L: 4465
						}

						if (var6.field5168 >= var4.frameIds.length) { // L: 4467
							var6.remove(); // L: 4468
							--var0.field1193; // L: 4469
						}
					} else if (var4.isCachedModelIdSet()) { // L: 4472
						++var6.field5168; // L: 4473
						int var5 = var4.method4084(); // L: 4474
						if (var6.field5168 < var5) { // L: 4475
							ModeWhere.method6916(var4, var6.field5168, var0.x, var0.y); // L: 4476
						} else {
							var6.remove(); // L: 4479
							--var0.field1193; // L: 4480
						}
					} else {
						var6.remove(); // L: 4484
						--var0.field1193; // L: 4485
					}
				}
			}
		}

		SequenceDefinition var8;
		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4488
			var8 = WorldMapLabelSize.SequenceDefinition_get(var0.sequence); // L: 4489
			if (var8.field2287 == 1 && var0.field1226 > 0 && var0.spotAnimation <= Client.cycle && var0.field1208 < Client.cycle) { // L: 4490 4491
				var0.sequenceDelay = 1; // L: 4492
				return; // L: 4493
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4497
			var8 = WorldMapLabelSize.SequenceDefinition_get(var0.sequence); // L: 4498
			if (var8 != null) { // L: 4499
				if (!var8.isCachedModelIdSet() && var8.frameIds != null) { // L: 4500
					++var0.sequenceFrameCycle; // L: 4501
					if (var0.sequenceFrame < var8.frameIds.length && var0.sequenceFrameCycle > var8.frameLengths[var0.sequenceFrame]) { // L: 4502
						var0.sequenceFrameCycle = 1; // L: 4503
						++var0.sequenceFrame; // L: 4504
						FaceNormal.method4718(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4505
					}

					if (var0.sequenceFrame >= var8.frameIds.length) { // L: 4507
						var0.sequenceFrame -= var8.frameCount; // L: 4508
						++var0.field1200; // L: 4509
						if (var0.field1200 >= var8.field2297) { // L: 4510
							var0.sequence = -1; // L: 4511
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var8.frameIds.length) { // L: 4513
							FaceNormal.method4718(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4517
						} else {
							var0.sequence = -1; // L: 4514
						}
					}

					var0.isWalking = var8.field2273; // L: 4520
				} else if (var8.isCachedModelIdSet()) { // L: 4522
					++var0.sequenceFrame; // L: 4523
					var3 = var8.method4084(); // L: 4524
					if (var0.sequenceFrame < var3) { // L: 4525
						ModeWhere.method6916(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4526
					} else {
						var0.sequenceFrame -= var8.frameCount; // L: 4529
						++var0.field1200; // L: 4530
						if (var0.field1200 >= var8.field2297) { // L: 4531
							var0.sequence = -1; // L: 4532
						} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) { // L: 4534
							ModeWhere.method6916(var8, var0.sequenceFrame, var0.x, var0.y); // L: 4538
						} else {
							var0.sequence = -1; // L: 4535
						}
					}
				} else {
					var0.sequence = -1; // L: 4542
				}
			} else {
				var0.sequence = -1; // L: 4544
			}
		}

		if (var0.sequenceDelay > 0) {
			--var0.sequenceDelay; // L: 4546
		}

	} // L: 4547

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1396951833"
	)
	static boolean method2664() {
		return (Client.drawPlayerNames & 8) != 0; // L: 5198
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "([Lmb;IIIZI)V",
		garbageValue = "1776735016"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 11072
			Widget var6 = var0[var5]; // L: 11073
			if (var6 != null && var6.parentId == var1) { // L: 11074 11075
				SoundSystem.alignWidgetSize(var6, var2, var3, var4); // L: 11076
				class140.alignWidgetPosition(var6, var2, var3); // L: 11077
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 11078
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 11079
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 11080
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 11081
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 11082
					Projectile.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 11084
}
