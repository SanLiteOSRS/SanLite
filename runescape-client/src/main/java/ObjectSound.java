import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cq")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 958334097
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -884169787
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 242121143
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 183687375
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -649138819
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 170081973
	)
	int field843;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1112977525
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -305868053
	)
	int field845;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 301142655
	)
	int field836;
	@ObfuscatedName("aa")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1490558417
	)
	int field848;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 50
		ObjectComposition var2 = this.obj.transform(); // L: 51
		if (var2 != null) { // L: 52
			this.soundEffectId = var2.ambientSoundId; // L: 53
			this.field843 = var2.int7 * 128; // L: 54
			this.field845 = var2.int5; // L: 55
			this.field836 = var2.int6; // L: 56
			this.soundEffectIds = var2.soundEffectIds; // L: 57
		} else {
			this.soundEffectId = -1; // L: 60
			this.field843 = 0; // L: 61
			this.field845 = 0; // L: 62
			this.field836 = 0; // L: 63
			this.soundEffectIds = null; // L: 64
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 66
			KitDefinition.pcmStreamMixer.removeSubStream(this.stream1); // L: 67
			this.stream1 = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;I)V",
		garbageValue = "1503120743"
	)
	public static void method1883(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0; // L: 32
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1; // L: 33
	} // L: 34

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Ley;",
		garbageValue = "1661675157"
	)
	static class127[] method1875() {
		return new class127[]{class127.field1494, class127.field1486, class127.field1487, class127.field1488, class127.field1491}; // L: 143
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "145020276"
	)
	static int method1881(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4453
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class497.loadWorlds() ? 1 : 0; // L: 4454
			return 1; // L: 4455
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4457
				var9 = class17.worldListStart(); // L: 4458
				if (var9 != null) { // L: 4459
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4460
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4461
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.activity; // L: 4462
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4463
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4464
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.host; // L: 4465
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4468
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4469
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4470
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4471
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4472
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4473
				}

				return 1; // L: 4475
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4477
				var9 = class171.getNextWorldListWorld(); // L: 4478
				if (var9 != null) { // L: 4479
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4480
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4481
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.activity; // L: 4482
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4483
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4484
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var9.host; // L: 4485
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4488
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4489
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4490
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4491
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4492
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4493
				}

				return 1; // L: 4495
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4497
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4498
					var7 = null; // L: 4499

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4500
						if (var3 == World.World_worlds[var8].id) { // L: 4501
							var7 = World.World_worlds[var8]; // L: 4502
							break;
						}
					}

					if (var7 != null) { // L: 4506
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4507
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4508
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.activity; // L: 4509
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4510
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4511
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.host; // L: 4512
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4515
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4516
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4517
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4518
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4519
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4520
					}

					return 1; // L: 4522
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4524
					Interpreter.Interpreter_intStackSize -= 4; // L: 4525
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4526
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4527
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4528
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 4529
					class309.sortWorldList(var3, var10, var8, var6); // L: 4530
					return 1; // L: 4531
				} else if (var0 != 6511) { // L: 4533
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4554
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4555
						return 1; // L: 4556
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4558
							Interpreter.Interpreter_intStackSize -= 2; // L: 4559
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4560
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4561
							var5 = ModeWhere.getParamDefinition(var4); // L: 4562
							if (var5.isString()) { // L: 4563
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = Bounds.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4564
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Bounds.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4567
							}

							return 1; // L: 4569
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4571
							Interpreter.Interpreter_intStackSize -= 2; // L: 4572
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4573
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4574
							var5 = ModeWhere.getParamDefinition(var4); // L: 4575
							if (var5.isString()) { // L: 4576
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class175.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4577
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class175.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4580
							}

							return 1; // L: 4582
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4584
							Interpreter.Interpreter_intStackSize -= 2; // L: 4585
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4586
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4587
							var5 = ModeWhere.getParamDefinition(var4); // L: 4588
							if (var5.isString()) { // L: 4589
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class300.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4590
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4593
							}

							return 1; // L: 4595
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4597
							Interpreter.Interpreter_intStackSize -= 2; // L: 4598
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4599
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4600
							var5 = ModeWhere.getParamDefinition(var4); // L: 4601
							if (var5.isString()) { // L: 4602
								Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class139.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4603
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class139.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4606
							}

							return 1; // L: 4608
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4610
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4611
							return 1; // L: 4612
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4614
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType; // L: 4615
							return 1; // L: 4616
						} else if (var0 == 6520) { // L: 4618
							return 1; // L: 4619
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4621
							return 1; // L: 4622
						} else if (var0 == 6522) { // L: 4624
							--class149.Interpreter_stringStackSize; // L: 4625
							--Interpreter.Interpreter_intStackSize; // L: 4626
							return 1; // L: 4627
						} else if (var0 == 6523) { // L: 4629
							--class149.Interpreter_stringStackSize; // L: 4630
							--Interpreter.Interpreter_intStackSize; // L: 4631
							return 1; // L: 4632
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4634
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4635
							return 1; // L: 4636
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4638
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4639
							return 1; // L: 4640
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4642
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4643
							return 1; // L: 4644
						} else if (var0 == 6527) { // L: 4646
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field510; // L: 4647
							return 1; // L: 4648
						} else {
							return 2; // L: 4650
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4534
					if (var3 >= 0 && var3 < World.World_count) { // L: 4535
						var7 = World.World_worlds[var3]; // L: 4536
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4537
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4538
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.activity; // L: 4539
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4540
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4541
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.host; // L: 4542
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4545
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4546
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4547
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4548
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4549
						Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 4550
					}

					return 1; // L: 4552
				}
			}
		}
	}
}
