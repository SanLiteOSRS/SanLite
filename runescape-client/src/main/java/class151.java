import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fn")
public class class151 extends class159 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2060205349
	)
	int field1681;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgb;)V"
	)
	class151(class160 var1) {
		this.this$0 = var1;
		this.field1681 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "-105"
	)
	void vmethod3335(Buffer var1) {
		this.field1681 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "84"
	)
	void vmethod3337(ClanChannel var1) {
		var1.removeMember(this.field1681); // L: 96
	} // L: 97

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "56552779"
	)
	static int method3171() {
		return ++Messages.Messages_count - 1; // L: 19
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1685341469"
	)
	static void method3174(String var0, String var1, String var2) {
		class14.method171(7); // L: 1149
		UrlRequest.setLoginResponseString(var0, var1, var2); // L: 1150
	} // L: 1151

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "642810755"
	)
	static int method3172(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3976
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3977
			Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = class230.ItemComposition_get(var3).name; // L: 3978
			return 1; // L: 3979
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3981
				class336.Interpreter_intStackSize -= 2; // L: 3982
				var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3983
				var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3984
				var5 = class230.ItemComposition_get(var3); // L: 3985
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 3986
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 3987
				}

				return 1; // L: 3988
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3990
				class336.Interpreter_intStackSize -= 2; // L: 3991
				var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3992
				var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3993
				var5 = class230.ItemComposition_get(var3); // L: 3994
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 3995
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 3996
				}

				return 1; // L: 3997
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3999
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4000
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class230.ItemComposition_get(var3).price; // L: 4001
				return 1; // L: 4002
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4004
				var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4005
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class230.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4006
				return 1; // L: 4007
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4009
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4010
					var4 = class230.ItemComposition_get(var3); // L: 4011
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4012
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3; // L: 4013
					}

					return 1; // L: 4014
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4016
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4017
					var4 = class230.ItemComposition_get(var3); // L: 4018
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4019
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3; // L: 4020
					}

					return 1; // L: 4021
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4023
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4024
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class230.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4025
					return 1; // L: 4026
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4028
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4029
					var4 = class230.ItemComposition_get(var3); // L: 4030
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4031
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3; // L: 4032
					}

					return 1; // L: 4033
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4035
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4036
					var4 = class230.ItemComposition_get(var3); // L: 4037
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4038
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3; // L: 4039
					}

					return 1; // L: 4040
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4042
					String var7 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 4043
					var6 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4044
					PendingSpawn.findItemDefinitions(var7, var6 == 1); // L: 4045
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Occluder.foundItemIdCount; // L: 4046
					return 1; // L: 4047
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4049
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4054
						GroundObject.foundItemIndex = 0; // L: 4055
						return 1; // L: 4056
					} else if (var0 == 4213) { // L: 4058
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4059
						var6 = class230.ItemComposition_get(var3).getShiftClickIndex(); // L: 4060
						if (var6 == -1) { // L: 4061
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var6; // L: 4062
						} else {
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var6 + 1; // L: 4065
						}

						return 1; // L: 4067
					} else if (var0 == 4214) { // L: 4069
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4070
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class230.ItemComposition_get(var3).maleModel; // L: 4071
						return 1; // L: 4072
					} else if (var0 == 4215) { // L: 4074
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4075
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class230.ItemComposition_get(var3).maleModel1; // L: 4076
						return 1; // L: 4077
					} else if (var0 == 4216) { // L: 4079
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4080
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class230.ItemComposition_get(var3).maleModel2; // L: 4081
						return 1; // L: 4082
					} else if (var0 == 4217) { // L: 4084
						var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4085
						var4 = class230.ItemComposition_get(var3); // L: 4086
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var4.field2206; // L: 4087
						return 1; // L: 4088
					} else {
						return 2; // L: 4090
					}
				} else {
					if (class158.foundItemIds != null && GroundObject.foundItemIndex < Occluder.foundItemIdCount) { // L: 4050
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class158.foundItemIds[++GroundObject.foundItemIndex - 1] & '\uffff'; // L: 4051
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4052
				}
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "-37"
	)
	static int method3173(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4453
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ArchiveDisk.loadWorlds() ? 1 : 0; // L: 4454
			return 1; // L: 4455
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4457
				var9 = class27.worldListStart(); // L: 4458
				if (var9 != null) { // L: 4459
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9.id; // L: 4460
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9.properties; // L: 4461
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var9.activity; // L: 4462
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9.location; // L: 4463
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9.population; // L: 4464
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var9.host; // L: 4465
				} else {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4468
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4469
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4470
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4471
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4472
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4473
				}

				return 1; // L: 4475
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4477
				var9 = WorldMapSectionType.getNextWorldListWorld(); // L: 4478
				if (var9 != null) { // L: 4479
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9.id; // L: 4480
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9.properties; // L: 4481
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var9.activity; // L: 4482
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9.location; // L: 4483
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var9.population; // L: 4484
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var9.host; // L: 4485
				} else {
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4488
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4489
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4490
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4491
					Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4492
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4493
				}

				return 1; // L: 4495
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4497
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4498
					var7 = null; // L: 4499

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4500
						if (var3 == class20.World_worlds[var8].id) { // L: 4501
							var7 = class20.World_worlds[var8]; // L: 4502
							break;
						}
					}

					if (var7 != null) { // L: 4506
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7.id; // L: 4507
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7.properties; // L: 4508
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7.activity; // L: 4509
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7.location; // L: 4510
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7.population; // L: 4511
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7.host; // L: 4512
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4515
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4516
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4517
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4518
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4519
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4520
					}

					return 1; // L: 4522
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4524
					class336.Interpreter_intStackSize -= 4; // L: 4525
					var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4526
					boolean var10 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1] == 1; // L: 4527
					var8 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 4528
					boolean var6 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 3] == 1; // L: 4529
					class85.sortWorldList(var3, var10, var8, var6); // L: 4530
					return 1; // L: 4531
				} else if (var0 != 6511) { // L: 4533
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4554
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 4555
						return 1; // L: 4556
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4558
							class336.Interpreter_intStackSize -= 2; // L: 4559
							var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4560
							var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 4561
							var5 = UserComparator9.getParamDefinition(var4); // L: 4562
							if (var5.isString()) { // L: 4563
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = class407.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4564
							} else {
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class407.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4567
							}

							return 1; // L: 4569
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4571
							class336.Interpreter_intStackSize -= 2; // L: 4572
							var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4573
							var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 4574
							var5 = UserComparator9.getParamDefinition(var4); // L: 4575
							if (var5.isString()) { // L: 4576
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = class59.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4577
							} else {
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class59.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4580
							}

							return 1; // L: 4582
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4584
							class336.Interpreter_intStackSize -= 2; // L: 4585
							var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4586
							var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 4587
							var5 = UserComparator9.getParamDefinition(var4); // L: 4588
							if (var5.isString()) { // L: 4589
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = class230.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4590
							} else {
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class230.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4593
							}

							return 1; // L: 4595
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4597
							class336.Interpreter_intStackSize -= 2; // L: 4598
							var3 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 4599
							var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 4600
							var5 = UserComparator9.getParamDefinition(var4); // L: 4601
							if (var5.isString()) { // L: 4602
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = KeyHandler.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4603
							} else {
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = KeyHandler.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4606
							}

							return 1; // L: 4608
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4610
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4611
							return 1; // L: 4612
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4614
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.clientType; // L: 4615
							return 1; // L: 4616
						} else if (var0 == 6520) { // L: 4618
							return 1; // L: 4619
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4621
							return 1; // L: 4622
						} else if (var0 == 6522) { // L: 4624
							--class156.Interpreter_stringStackSize; // L: 4625
							--class336.Interpreter_intStackSize; // L: 4626
							return 1; // L: 4627
						} else if (var0 == 6523) { // L: 4629
							--class156.Interpreter_stringStackSize; // L: 4630
							--class336.Interpreter_intStackSize; // L: 4631
							return 1; // L: 4632
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4634
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4635
							return 1; // L: 4636
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4638
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 4639
							return 1; // L: 4640
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4642
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 1; // L: 4643
							return 1; // L: 4644
						} else if (var0 == 6527) { // L: 4646
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Client.field487; // L: 4647
							return 1; // L: 4648
						} else {
							return 2; // L: 4650
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 4534
					if (var3 >= 0 && var3 < World.World_count) { // L: 4535
						var7 = class20.World_worlds[var3]; // L: 4536
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7.id; // L: 4537
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7.properties; // L: 4538
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7.activity; // L: 4539
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7.location; // L: 4540
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var7.population; // L: 4541
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var7.host; // L: 4542
					} else {
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = -1; // L: 4545
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4546
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4547
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4548
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 4549
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = ""; // L: 4550
					}

					return 1; // L: 4552
				}
			}
		}
	}
}
