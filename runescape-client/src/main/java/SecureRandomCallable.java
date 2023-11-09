import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("be")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	} // L: 36

	public Object call() {
		return Script.method1936(); // L: 46
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfo;",
		garbageValue = "-1858925619"
	)
	static HorizontalAlignment[] method2032() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1898, HorizontalAlignment.field1895}; // L: 14
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "1"
	)
	static int method2026(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3935
			Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class4.loadWorlds() ? 1 : 0; // L: 3936
			return 1; // L: 3937
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3939
				var9 = GraphicsObject.worldListStart(); // L: 3940
				if (var9 != null) { // L: 3941
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var9.id; // L: 3942
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var9.properties; // L: 3943
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var9.activity; // L: 3944
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var9.location; // L: 3945
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var9.population; // L: 3946
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var9.host; // L: 3947
				} else {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 3950
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3951
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3952
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3953
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3954
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3955
				}

				return 1; // L: 3957
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3959
				var9 = FriendSystem.getNextWorldListWorld(); // L: 3960
				if (var9 != null) { // L: 3961
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var9.id; // L: 3962
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var9.properties; // L: 3963
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var9.activity; // L: 3964
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var9.location; // L: 3965
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var9.population; // L: 3966
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var9.host; // L: 3967
				} else {
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 3970
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3971
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3972
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3973
					Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3974
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3975
				}

				return 1; // L: 3977
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3979
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 3980
					var7 = null; // L: 3981

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3982
						if (var3 == World.World_worlds[var8].id) { // L: 3983
							var7 = World.World_worlds[var8]; // L: 3984
							break;
						}
					}

					if (var7 != null) { // L: 3988
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.id; // L: 3989
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.properties; // L: 3990
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.activity; // L: 3991
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.location; // L: 3992
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.population; // L: 3993
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.host; // L: 3994
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 3997
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 3998
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 3999
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4000
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4001
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4002
					}

					return 1; // L: 4004
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4006
					Nameable.Interpreter_intStackSize -= 4; // L: 4007
					var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4008
					boolean var10 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1] == 1; // L: 4009
					var8 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 2]; // L: 4010
					boolean var6 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 3] == 1; // L: 4011
					InterfaceParent.sortWorldList(var3, var10, var8, var6); // L: 4012
					return 1; // L: 4013
				} else if (var0 != 6511) { // L: 4015
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4036
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize] == 1; // L: 4037
						return 1; // L: 4038
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4040
							Nameable.Interpreter_intStackSize -= 2; // L: 4041
							var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4042
							var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 4043
							var5 = DesktopPlatformInfoProvider.getParamDefinition(var4); // L: 4044
							if (var5.isString()) { // L: 4045
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class119.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4046
							} else {
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class119.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4049
							}

							return 1; // L: 4051
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4053
							Nameable.Interpreter_intStackSize -= 2; // L: 4054
							var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4055
							var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 4056
							var5 = DesktopPlatformInfoProvider.getParamDefinition(var4); // L: 4057
							if (var5.isString()) { // L: 4058
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = FileSystem.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4059
							} else {
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = FileSystem.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4062
							}

							return 1; // L: 4064
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4066
							Nameable.Interpreter_intStackSize -= 2; // L: 4067
							var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4068
							var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 4069
							var5 = DesktopPlatformInfoProvider.getParamDefinition(var4); // L: 4070
							if (var5.isString()) { // L: 4071
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = AttackOption.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4072
							} else {
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = AttackOption.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4075
							}

							return 1; // L: 4077
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4079
							Nameable.Interpreter_intStackSize -= 2; // L: 4080
							var3 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize]; // L: 4081
							var4 = Interpreter.Interpreter_intStack[Nameable.Interpreter_intStackSize + 1]; // L: 4082
							var5 = DesktopPlatformInfoProvider.getParamDefinition(var4); // L: 4083
							if (var5.isString()) { // L: 4084
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = class388.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4085
							} else {
								Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = class388.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4088
							}

							return 1; // L: 4090
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4092
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4093
							return 1; // L: 4094
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4096
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.clientType; // L: 4097
							return 1; // L: 4098
						} else if (var0 == 6520) { // L: 4100
							return 1; // L: 4101
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4103
							return 1; // L: 4104
						} else if (var0 == 6522) { // L: 4106
							--UserComparator8.Interpreter_stringStackSize; // L: 4107
							--Nameable.Interpreter_intStackSize; // L: 4108
							return 1; // L: 4109
						} else if (var0 == 6523) { // L: 4111
							--UserComparator8.Interpreter_stringStackSize; // L: 4112
							--Nameable.Interpreter_intStackSize; // L: 4113
							return 1; // L: 4114
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4116
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4117
							return 1; // L: 4118
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4120
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 4121
							return 1; // L: 4122
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4124
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 1; // L: 4125
							return 1; // L: 4126
						} else if (var0 == 6527) { // L: 4128
							Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = Client.field482; // L: 4129
							return 1; // L: 4130
						} else {
							return 2; // L: 4132
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Nameable.Interpreter_intStackSize]; // L: 4016
					if (var3 >= 0 && var3 < World.World_count) { // L: 4017
						var7 = World.World_worlds[var3]; // L: 4018
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.id; // L: 4019
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.properties; // L: 4020
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.activity; // L: 4021
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.location; // L: 4022
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = var7.population; // L: 4023
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.host; // L: 4024
					} else {
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = -1; // L: 4027
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4028
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4029
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4030
						Interpreter.Interpreter_intStack[++Nameable.Interpreter_intStackSize - 1] = 0; // L: 4031
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = ""; // L: 4032
					}

					return 1; // L: 4034
				}
			}
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIIILqn;Lkl;B)V",
		garbageValue = "-2"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11943
			int var6 = Client.camAngleY & 2047; // L: 11944
			int var7 = var3 * var3 + var2 * var2; // L: 11945
			if (var7 <= 6400) { // L: 11946
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11947
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11948
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 11949
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11950
				if (var7 > 2500) {
					var4.method8091(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11951
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11952
				}

			}
		}
	} // L: 11953
}
