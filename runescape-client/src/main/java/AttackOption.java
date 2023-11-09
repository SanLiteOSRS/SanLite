import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cl")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	field1282(2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	field1284(4);

	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1585335571
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3; // L: 12489
	} // L: 12490

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1790946346"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 12494
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-713560133"
	)
	static int method2466(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3926
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ArchiveDiskActionHandler.loadWorlds() ? 1 : 0; // L: 3927
			return 1; // L: 3928
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3930
				var9 = class127.worldListStart(); // L: 3931
				if (var9 != null) { // L: 3932
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.id; // L: 3933
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.properties; // L: 3934
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var9.activity; // L: 3935
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.location; // L: 3936
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.population; // L: 3937
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var9.host; // L: 3938
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 3941
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3942
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3943
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3944
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3945
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3946
				}

				return 1; // L: 3948
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3950
				var9 = NPC.getNextWorldListWorld(); // L: 3951
				if (var9 != null) { // L: 3952
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.id; // L: 3953
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.properties; // L: 3954
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var9.activity; // L: 3955
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.location; // L: 3956
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.population; // L: 3957
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var9.host; // L: 3958
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 3961
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3962
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3963
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3964
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3965
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3966
				}

				return 1; // L: 3968
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3970
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3971
					var7 = null; // L: 3972

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3973
						if (var3 == class93.World_worlds[var8].id) { // L: 3974
							var7 = class93.World_worlds[var8]; // L: 3975
							break;
						}
					}

					if (var7 != null) { // L: 3979
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.id; // L: 3980
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.properties; // L: 3981
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.activity; // L: 3982
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.location; // L: 3983
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.population; // L: 3984
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.host; // L: 3985
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 3988
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3989
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3990
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3991
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3992
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 3993
					}

					return 1; // L: 3995
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3997
					TaskHandler.Interpreter_intStackSize -= 4; // L: 3998
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3999
					boolean var10 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] == 1; // L: 4000
					var8 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 4001
					boolean var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3] == 1; // L: 4002
					ArchiveLoader.sortWorldList(var3, var10, var8, var6); // L: 4003
					return 1; // L: 4004
				} else if (var0 != 6511) { // L: 4006
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4027
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1; // L: 4028
						return 1; // L: 4029
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4031
							TaskHandler.Interpreter_intStackSize -= 2; // L: 4032
							var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4033
							var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 4034
							var5 = class238.getParamDefinition(var4); // L: 4035
							if (var5.isString()) { // L: 4036
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class125.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4037
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class125.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4040
							}

							return 1; // L: 4042
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4044
							TaskHandler.Interpreter_intStackSize -= 2; // L: 4045
							var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4046
							var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 4047
							var5 = class238.getParamDefinition(var4); // L: 4048
							if (var5.isString()) { // L: 4049
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = WorldMapDecoration.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4050
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4053
							}

							return 1; // L: 4055
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4057
							TaskHandler.Interpreter_intStackSize -= 2; // L: 4058
							var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4059
							var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 4060
							var5 = class238.getParamDefinition(var4); // L: 4061
							if (var5.isString()) { // L: 4062
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class258.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4063
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class258.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4066
							}

							return 1; // L: 4068
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4070
							TaskHandler.Interpreter_intStackSize -= 2; // L: 4071
							var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 4072
							var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 4073
							var5 = class238.getParamDefinition(var4); // L: 4074
							if (var5.isString()) { // L: 4075
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class126.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4076
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class126.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4079
							}

							return 1; // L: 4081
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4083
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4084
							return 1; // L: 4085
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4087
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.clientType; // L: 4088
							return 1; // L: 4089
						} else if (var0 == 6520) { // L: 4091
							return 1; // L: 4092
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4094
							return 1; // L: 4095
						} else if (var0 == 6522) { // L: 4097
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4098
							--TaskHandler.Interpreter_intStackSize; // L: 4099
							return 1; // L: 4100
						} else if (var0 == 6523) { // L: 4102
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize; // L: 4103
							--TaskHandler.Interpreter_intStackSize; // L: 4104
							return 1; // L: 4105
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4107
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4108
							return 1; // L: 4109
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4111
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 4112
							return 1; // L: 4113
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4115
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 4116
							return 1; // L: 4117
						} else if (var0 == 6527) { // L: 4119
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.field489; // L: 4120
							return 1; // L: 4121
						} else {
							return 2; // L: 4123
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 4007
					if (var3 >= 0 && var3 < World.World_count) { // L: 4008
						var7 = class93.World_worlds[var3]; // L: 4009
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.id; // L: 4010
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.properties; // L: 4011
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.activity; // L: 4012
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.location; // L: 4013
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.population; // L: 4014
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.host; // L: 4015
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4018
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4019
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 4020
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4021
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4022
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = ""; // L: 4023
					}

					return 1; // L: 4025
				}
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILkp;ZI)V",
		garbageValue = "-1388826628"
	)
	static void method2465(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class273.getWorldMap().getMapArea(var0); // L: 4997
		int var4 = class28.localPlayer.plane; // L: 4998
		int var5 = class300.baseX * 64 + (class28.localPlayer.x >> 7); // L: 4999
		int var6 = Message.baseY * 64 + (class28.localPlayer.y >> 7); // L: 5000
		Coord var7 = new Coord(var4, var5, var6); // L: 5001
		class273.getWorldMap().method7240(var3, var7, var1, var2); // L: 5002
	} // L: 5003

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lgc;IIIB)V",
		garbageValue = "-32"
	)
	static void method2468(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class260.clientPreferences.method2329() != 0) { // L: 3719
			if (var0.field2159 != null && var0.field2159.containsKey(var1)) { // L: 3720
				int var4 = (Integer)var0.field2159.get(var1); // L: 3721
				if (var4 != 0) { // L: 3725
					int var7 = var4 >> 8; // L: 3726
					int var8 = var4 >> 4 & 7; // L: 3727
					int var9 = var4 & 15; // L: 3728
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3729
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3730
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3731
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3732
					int var10 = (var2 - 64) / 128; // L: 3733
					int var11 = (var3 - 64) / 128; // L: 3734
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3735
					++Client.soundEffectCount; // L: 3736
				}

			}
		}
	} // L: 3738
}
