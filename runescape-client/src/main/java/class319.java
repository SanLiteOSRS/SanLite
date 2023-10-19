import java.awt.Image;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mr")
public class class319 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static AbstractArchive field3439;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static AbstractArchive field3429;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static AbstractArchive field3432;
	@ObfuscatedName("ax")
	public static ArrayList field3431;
	@ObfuscatedName("ao")
	public static LinkedList field3428;
	@ObfuscatedName("ah")
	public static ArrayList field3433;
	@ObfuscatedName("ar")
	public static ArrayList field3440;
	@ObfuscatedName("ab")
	static ArrayList field3435;
	@ObfuscatedName("am")
	public static final List field3434;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 918069203
	)
	static int field3437;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1766578021
	)
	static int field3438;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2143984183
	)
	static int field3436;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1371578057
	)
	static int field3430;
	@ObfuscatedName("ba")
	static Image field3443;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field3442;

	static {
		field3431 = null; // L: 13
		field3428 = new LinkedList(); // L: 14
		field3433 = new ArrayList(3); // L: 15
		field3440 = new ArrayList(3); // L: 16
		field3435 = new ArrayList(); // L: 17
		field3434 = new ArrayList(); // L: 18
		field3437 = 0; // L: 19
		field3438 = 0; // L: 20
		field3436 = 0; // L: 21
		field3430 = 0; // L: 22
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CLoa;B)C",
		garbageValue = "84"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 69
			if (var0 >= 192 && var0 <= 198) { // L: 70
				return 'A';
			}

			if (var0 == 199) { // L: 71
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 72
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 73
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 74
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 75
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 76
				return 'U';
			}

			if (var0 == 221) { // L: 77
				return 'Y';
			}

			if (var0 == 223) { // L: 78
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 79
				return 'a';
			}

			if (var0 == 231) { // L: 80
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 81
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) { // L: 82
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 83
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 84
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 85
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 86
				return 'y';
			}
		}

		if (var0 == 338) { // L: 88
			return 'O';
		} else if (var0 == 339) { // L: 89
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0; // L: 90
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-1456273213"
	)
	static int method5968(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4506
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.loadWorlds() ? 1 : 0; // L: 4507
			return 1; // L: 4508
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4510
				var9 = class53.worldListStart(); // L: 4511
				if (var9 != null) { // L: 4512
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4513
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4514
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var9.activity; // L: 4515
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4516
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4517
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var9.host; // L: 4518
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4521
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4522
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4523
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4524
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4525
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4526
				}

				return 1; // L: 4528
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4530
				var9 = DevicePcmPlayerProvider.getNextWorldListWorld(); // L: 4531
				if (var9 != null) { // L: 4532
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id; // L: 4533
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties; // L: 4534
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var9.activity; // L: 4535
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location; // L: 4536
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population; // L: 4537
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var9.host; // L: 4538
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4541
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4542
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4543
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4544
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4545
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4546
				}

				return 1; // L: 4548
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4550
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4551
					var7 = null; // L: 4552

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4553
						if (var3 == UserComparator3.World_worlds[var8].id) { // L: 4554
							var7 = UserComparator3.World_worlds[var8]; // L: 4555
							break;
						}
					}

					if (var7 != null) { // L: 4559
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4560
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4561
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7.activity; // L: 4562
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4563
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4564
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7.host; // L: 4565
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4568
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4569
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4570
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4571
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4572
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4573
					}

					return 1; // L: 4575
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4577
					Interpreter.Interpreter_intStackSize -= 4; // L: 4578
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4579
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4580
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 4581
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1; // L: 4582
					class230.sortWorldList(var3, var10, var8, var6); // L: 4583
					return 1; // L: 4584
				} else if (var0 != 6511) { // L: 4586
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4607
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4608
						return 1; // L: 4609
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4611
							Interpreter.Interpreter_intStackSize -= 2; // L: 4612
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4613
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4614
							var5 = class180.getParamDefinition(var4); // L: 4615
							if (var5.isString()) { // L: 4616
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class190.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4617
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class190.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4620
							}

							return 1; // L: 4622
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4624
							Interpreter.Interpreter_intStackSize -= 2; // L: 4625
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4626
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4627
							var5 = class180.getParamDefinition(var4); // L: 4628
							if (var5.isString()) { // L: 4629
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class91.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4630
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class91.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4633
							}

							return 1; // L: 4635
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4637
							Interpreter.Interpreter_intStackSize -= 2; // L: 4638
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4639
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4640
							var5 = class180.getParamDefinition(var4); // L: 4641
							if (var5.isString()) { // L: 4642
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class214.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4643
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4646
							}

							return 1; // L: 4648
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4650
							Interpreter.Interpreter_intStackSize -= 2; // L: 4651
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4652
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4653
							var5 = class180.getParamDefinition(var4); // L: 4654
							if (var5.isString()) { // L: 4655
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class164.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4656
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class164.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4659
							}

							return 1; // L: 4661
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4663
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4664
							return 1; // L: 4665
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4667
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType; // L: 4668
							return 1; // L: 4669
						} else if (var0 == 6520) { // L: 4671
							return 1; // L: 4672
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4674
							return 1; // L: 4675
						} else if (var0 == 6522) { // L: 4677
							--class180.Interpreter_stringStackSize; // L: 4678
							--Interpreter.Interpreter_intStackSize; // L: 4679
							return 1; // L: 4680
						} else if (var0 == 6523) { // L: 4682
							--class180.Interpreter_stringStackSize; // L: 4683
							--Interpreter.Interpreter_intStackSize; // L: 4684
							return 1; // L: 4685
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4687
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4688
							return 1; // L: 4689
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4691
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4692
							return 1; // L: 4693
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4695
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 4696
							return 1; // L: 4697
						} else if (var0 == 6527) { // L: 4699
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field525; // L: 4700
							return 1; // L: 4701
						} else {
							return 2; // L: 4703
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4587
					if (var3 >= 0 && var3 < World.World_count) { // L: 4588
						var7 = UserComparator3.World_worlds[var3]; // L: 4589
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id; // L: 4590
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties; // L: 4591
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7.activity; // L: 4592
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location; // L: 4593
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population; // L: 4594
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7.host; // L: 4595
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4598
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4599
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4600
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4601
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4602
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = ""; // L: 4603
					}

					return 1; // L: 4605
				}
			}
		}
	}
}
