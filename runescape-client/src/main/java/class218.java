import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("im")
public class class218 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lis;"
	)
	public static class216[] field2400;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static IndexedSprite field2401;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1520798381"
	)
	public static boolean method4387(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 45
			return true;
		} else {
			if (var0 != 0) { // L: 46
				char[] var1 = class384.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true; // L: 53
					}
				}
			}

			return false; // L: 59
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnm;",
		garbageValue = "337183416"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_normal, PlayerType.field4217, PlayerType.field4228, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_playerModerator, PlayerType.field4225, PlayerType.field4214, PlayerType.field4213, PlayerType.field4224, PlayerType.field4216, PlayerType.PlayerType_ultimateIronman, PlayerType.field4219, PlayerType.field4221, PlayerType.PlayerType_ironman, PlayerType.field4222, PlayerType.field4220, PlayerType.PlayerType_jagexModerator}; // L: 30
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "46"
	)
	static int method4389(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 1327
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1328
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1329
			return 1; // L: 1330
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1332
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1333
			return 1; // L: 1334
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1336
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1337
			return 1; // L: 1338
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1340
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1341
			return 1; // L: 1342
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1344
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1345
			return 1; // L: 1346
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1348
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1349
			return 1; // L: 1350
		} else {
			return 2; // L: 1352
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "-122335978"
	)
	static int method4388(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4492
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundSystem.loadWorlds() ? 1 : 0; // L: 4493
			return 1; // L: 4494
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4496
				var9 = JagexCache.worldListStart(); // L: 4497
				if (var9 != null) { // L: 4498
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4499
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4500
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var9.activity; // L: 4501
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4502
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4503
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var9.host; // L: 4504
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4507
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4508
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4509
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4510
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4511
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4512
				}

				return 1; // L: 4514
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4516
				var9 = WorldMapDecoration.getNextWorldListWorld(); // L: 4517
				if (var9 != null) { // L: 4518
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4519
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4520
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var9.activity; // L: 4521
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4522
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4523
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var9.host; // L: 4524
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4527
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4528
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4529
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4530
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4531
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4532
				}

				return 1; // L: 4534
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4536
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4537
					var7 = null; // L: 4538

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4539
						if (var3 == class16.World_worlds[var8].id) { // L: 4540
							var7 = class16.World_worlds[var8]; // L: 4541
							break;
						}
					}

					if (var7 != null) { // L: 4545
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4546
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4547
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7.activity; // L: 4548
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4549
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4550
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7.host; // L: 4551
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4554
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4555
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4556
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4557
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4558
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4559
					}

					return 1; // L: 4561
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4563
					Interpreter.Interpreter_intStackSize -= 4; // L: 4564
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4565
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4566
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4567
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 4568
					class31.sortWorldList(var3, var10, var8, var6); // L: 4569
					return 1; // L: 4570
				} else if (var0 != 6511) { // L: 4572
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4593
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4594
						return 1; // L: 4595
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4597
							Interpreter.Interpreter_intStackSize -= 2; // L: 4598
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4599
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4600
							var5 = class291.getParamDefinition(var4); // L: 4601
							if (var5.isString()) { // L: 4602
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = class144.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4603
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class144.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4606
							}

							return 1; // L: 4608
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4610
							Interpreter.Interpreter_intStackSize -= 2; // L: 4611
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4612
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4613
							var5 = class291.getParamDefinition(var4); // L: 4614
							if (var5.isString()) { // L: 4615
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = Language.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4616
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Language.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4619
							}

							return 1; // L: 4621
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4623
							Interpreter.Interpreter_intStackSize -= 2; // L: 4624
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4625
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4626
							var5 = class291.getParamDefinition(var4); // L: 4627
							if (var5.isString()) { // L: 4628
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = class141.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4629
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class141.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4632
							}

							return 1; // L: 4634
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4636
							Interpreter.Interpreter_intStackSize -= 2; // L: 4637
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4638
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4639
							var5 = class291.getParamDefinition(var4); // L: 4640
							if (var5.isString()) { // L: 4641
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = TileItem.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4642
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = TileItem.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4645
							}

							return 1; // L: 4647
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4649
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4650
							return 1; // L: 4651
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4653
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType; // L: 4654
							return 1; // L: 4655
						} else if (var0 == 6520) { // L: 4657
							return 1; // L: 4658
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4660
							return 1; // L: 4661
						} else if (var0 == 6522) { // L: 4663
							--class179.Interpreter_stringStackSize; // L: 4664
							--Interpreter.Interpreter_intStackSize; // L: 4665
							return 1; // L: 4666
						} else if (var0 == 6523) { // L: 4668
							--class179.Interpreter_stringStackSize; // L: 4669
							--Interpreter.Interpreter_intStackSize; // L: 4670
							return 1; // L: 4671
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4673
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4674
							return 1; // L: 4675
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4677
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4678
							return 1; // L: 4679
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4681
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4682
							return 1; // L: 4683
						} else if (var0 == 6527) { // L: 4685
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field583; // L: 4686
							return 1; // L: 4687
						} else {
							return 2; // L: 4689
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4573
					if (var3 >= 0 && var3 < World.World_count) { // L: 4574
						var7 = class16.World_worlds[var3]; // L: 4575
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4576
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4577
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7.activity; // L: 4578
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4579
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4580
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7.host; // L: 4581
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4584
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4585
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4586
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4587
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4588
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = ""; // L: 4589
					}

					return 1; // L: 4591
				}
			}
		}
	}
}
