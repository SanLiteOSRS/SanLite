import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fr")
public enum class139 implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1650(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1647(2, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1653(3, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1646(4, 3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1648(1, 4);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 1907020251
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	static class454 field1654;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -726683121
	)
	public final int field1651;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 456464061
	)
	@Export("id")
	final int id;

	class139(int var3, int var4) {
		this.field1651 = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1677394683"
	)
	public static void method3083(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lch;Lch;IZI)I",
		garbageValue = "548586770"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) { // L: 212
			int var4 = var0.population; // L: 213
			int var5 = var1.population; // L: 214
			if (!var3) { // L: 215
				if (var4 == -1) { // L: 216
					var4 = 2001;
				}

				if (var5 == -1) { // L: 217
					var5 = 2001;
				}
			}

			return var4 - var5; // L: 219
		} else if (var2 == 2) { // L: 221
			return var0.location - var1.location;
		} else if (var2 == 3) { // L: 222
			if (var0.activity.equals("-")) { // L: 223
				if (var1.activity.equals("-")) { // L: 224
					return 0;
				} else {
					return var3 ? -1 : 1; // L: 225
				}
			} else if (var1.activity.equals("-")) { // L: 227
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity); // L: 228
			}
		} else if (var2 == 4) { // L: 230
			return var0.method1817() ? (var1.method1817() ? 0 : 1) : (var1.method1817() ? -1 : 0);
		} else if (var2 == 5) { // L: 231
			return var0.method1805() ? (var1.method1805() ? 0 : 1) : (var1.method1805() ? -1 : 0);
		} else if (var2 == 6) { // L: 232
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) { // L: 233
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id; // L: 234
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-808541663"
	)
	static int method3084(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4495
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class125.loadWorlds() ? 1 : 0; // L: 4496
			return 1; // L: 4497
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4499
				var9 = class18.worldListStart(); // L: 4500
				if (var9 != null) { // L: 4501
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.id; // L: 4502
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.properties; // L: 4503
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var9.activity; // L: 4504
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.location; // L: 4505
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.population; // L: 4506
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var9.host; // L: 4507
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4510
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4511
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4512
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4513
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4514
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4515
				}

				return 1; // L: 4517
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4519
				var9 = VarcInt.getNextWorldListWorld(); // L: 4520
				if (var9 != null) { // L: 4521
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.id; // L: 4522
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.properties; // L: 4523
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var9.activity; // L: 4524
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.location; // L: 4525
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.population; // L: 4526
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var9.host; // L: 4527
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4530
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4531
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4532
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4533
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4534
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4535
				}

				return 1; // L: 4537
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4539
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4540
					var7 = null; // L: 4541

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4542
						if (var3 == class176.World_worlds[var8].id) { // L: 4543
							var7 = class176.World_worlds[var8]; // L: 4544
							break;
						}
					}

					if (var7 != null) { // L: 4548
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.id; // L: 4549
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.properties; // L: 4550
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7.activity; // L: 4551
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.location; // L: 4552
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.population; // L: 4553
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7.host; // L: 4554
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4557
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4558
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4559
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4560
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4561
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4562
					}

					return 1; // L: 4564
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4566
					SoundCache.Interpreter_intStackSize -= 4; // L: 4567
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4568
					boolean var10 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1] == 1; // L: 4569
					var8 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2]; // L: 4570
					boolean var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3] == 1; // L: 4571
					class131.sortWorldList(var3, var10, var8, var6); // L: 4572
					return 1; // L: 4573
				} else if (var0 != 6511) { // L: 4575
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4596
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1; // L: 4597
						return 1; // L: 4598
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4600
							SoundCache.Interpreter_intStackSize -= 2; // L: 4601
							var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4602
							var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4603
							var5 = class183.getParamDefinition(var4); // L: 4604
							if (var5.isString()) { // L: 4605
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = class90.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4606
							} else {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class90.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4609
							}

							return 1; // L: 4611
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4613
							SoundCache.Interpreter_intStackSize -= 2; // L: 4614
							var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4615
							var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4616
							var5 = class183.getParamDefinition(var4); // L: 4617
							if (var5.isString()) { // L: 4618
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = WorldMapElement.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4619
							} else {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = WorldMapElement.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4622
							}

							return 1; // L: 4624
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4626
							SoundCache.Interpreter_intStackSize -= 2; // L: 4627
							var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4628
							var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4629
							var5 = class183.getParamDefinition(var4); // L: 4630
							if (var5.isString()) { // L: 4631
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = InvDefinition.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4632
							} else {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4635
							}

							return 1; // L: 4637
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4639
							SoundCache.Interpreter_intStackSize -= 2; // L: 4640
							var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 4641
							var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 4642
							var5 = class183.getParamDefinition(var4); // L: 4643
							if (var5.isString()) { // L: 4644
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = Players.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4645
							} else {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Players.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4648
							}

							return 1; // L: 4650
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4652
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4653
							return 1; // L: 4654
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4656
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.clientType; // L: 4657
							return 1; // L: 4658
						} else if (var0 == 6520) { // L: 4660
							return 1; // L: 4661
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4663
							return 1; // L: 4664
						} else if (var0 == 6522) { // L: 4666
							--class137.Interpreter_stringStackSize; // L: 4667
							--SoundCache.Interpreter_intStackSize; // L: 4668
							return 1; // L: 4669
						} else if (var0 == 6523) { // L: 4671
							--class137.Interpreter_stringStackSize; // L: 4672
							--SoundCache.Interpreter_intStackSize; // L: 4673
							return 1; // L: 4674
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4676
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4677
							return 1; // L: 4678
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4680
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 4681
							return 1; // L: 4682
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4684
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1; // L: 4685
							return 1; // L: 4686
						} else if (var0 == 6527) { // L: 4688
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field544; // L: 4689
							return 1; // L: 4690
						} else {
							return 2; // L: 4692
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 4576
					if (var3 >= 0 && var3 < World.World_count) { // L: 4577
						var7 = class176.World_worlds[var3]; // L: 4578
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.id; // L: 4579
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.properties; // L: 4580
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7.activity; // L: 4581
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.location; // L: 4582
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.population; // L: 4583
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7.host; // L: 4584
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1; // L: 4587
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4588
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4589
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4590
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 4591
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = ""; // L: 4592
					}

					return 1; // L: 4594
				}
			}
		}
	}
}
