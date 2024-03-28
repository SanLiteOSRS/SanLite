import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dq")
public class class93 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1164;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1152;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1156;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1155;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1168;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1161;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1158;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1159;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1160;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1153;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1162;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1163;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1157;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1165;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1166;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1167;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1154;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1169;
	@ObfuscatedName("ba")
	static String field1171;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field1170;

	static {
		field1164 = new class93(); // L: 13089
		field1152 = new class93(); // L: 13090
		field1156 = new class93(); // L: 13091
		field1155 = new class93(); // L: 13092
		field1168 = new class93(); // L: 13093
		field1161 = new class93(); // L: 13094
		field1158 = new class93(); // L: 13095
		field1159 = new class93(); // L: 13096
		field1160 = new class93(); // L: 13097
		field1153 = new class93(); // L: 13098
		field1162 = new class93(); // L: 13099
		field1163 = new class93(); // L: 13100
		field1157 = new class93(); // L: 13101
		field1165 = new class93(); // L: 13102
		field1166 = new class93(); // L: 13103
		field1167 = new class93(); // L: 13104
		field1154 = new class93(); // L: 13105
		field1169 = new class93(); // L: 13106
	}

	class93() {
	} // L: 13108

	@ObfuscatedName("at")
	static int method2381(long var0) {
		return (int)(var0 >>> 14 & 3L); // L: 56
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "-31"
	)
	static int method2380(int var0, Script var1, boolean var2) {
		return 2; // L: 3289
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-2120069693"
	)
	static int method2382(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3878
			var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3879
			var10 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3880
			Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3881
			return 1; // L: 3882
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3884
				AbstractWorldMapIcon.Interpreter_stringStackSize -= 2; // L: 3885
				var3 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3886
				var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1]; // L: 3887
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3888
				return 1; // L: 3889
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3891
				var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3892
				var10 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3893
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3 + UrlRequest.intToString(var10, true); // L: 3894
				return 1; // L: 3895
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3897
				var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3898
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3899
				return 1; // L: 3900
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3902
					var11 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3903
					long var14 = ((long)var11 + 11745L) * 86400000L; // L: 3904
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3905
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3906
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3907
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3908
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3909
					return 1; // L: 3910
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3912
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3924
						var11 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3925
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3926
						return 1; // L: 3927
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3929
						AbstractWorldMapIcon.Interpreter_stringStackSize -= 2; // L: 3930
						Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = HealthBar.method2577(class53.compareStrings(Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1], GraphicsObject.clientLanguage)); // L: 3931
						return 1; // L: 3932
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3934
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3935
							class19.Interpreter_intStackSize -= 2; // L: 3936
							var10 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3937
							var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3938
							var12 = class67.archive13.takeFile(var9, 0); // L: 3939
							var13 = new Font(var12); // L: 3940
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3941
							return 1; // L: 3942
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3944
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3945
							class19.Interpreter_intStackSize -= 2; // L: 3946
							var10 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 3947
							var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 3948
							var12 = class67.archive13.takeFile(var9, 0); // L: 3949
							var13 = new Font(var12); // L: 3950
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3951
							return 1; // L: 3952
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3954
							AbstractWorldMapIcon.Interpreter_stringStackSize -= 2; // L: 3955
							var3 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3956
							var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1]; // L: 3957
							if (Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize] == 1) { // L: 3958
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4; // L: 3959
							}

							return 1; // L: 3960
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3962
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3963
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3964
							return 1; // L: 3965
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3967
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3968
							var10 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3969
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3970
							return 1; // L: 3971
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3973
							var11 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3974
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = ArchiveDiskAction.isCharPrintable((char)var11) ? 1 : 0; // L: 3975
							return 1; // L: 3976
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3978
							var11 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3979
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class210.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3980
							return 1; // L: 3981
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3983
							var11 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3984
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = UserComparator10.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3985
							return 1; // L: 3986
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3988
							var11 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 3989
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class384.isDigit((char)var11) ? 1 : 0; // L: 3990
							return 1; // L: 3991
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3993
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3994
							if (var3 != null) { // L: 3995
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = 0; // L: 3996
							}

							return 1; // L: 3997
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3999
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4000
							class19.Interpreter_intStackSize -= 2; // L: 4001
							var10 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]; // L: 4002
							var9 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 4003
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 4004
							return 1; // L: 4005
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 4007
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4008
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 4009
							boolean var18 = false; // L: 4010

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 4011
								char var7 = var3.charAt(var6); // L: 4012
								if (var7 == '<') { // L: 4013
									var18 = true;
								} else if (var7 == '>') { // L: 4014
									var18 = false;
								} else if (!var18) { // L: 4015
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var16.toString(); // L: 4017
							return 1; // L: 4018
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 4020
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4021
							var10 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4022
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 4023
							return 1; // L: 4024
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 4026
							AbstractWorldMapIcon.Interpreter_stringStackSize -= 2; // L: 4027
							var3 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4028
							var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1]; // L: 4029
							var9 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 4030
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 4031
							return 1; // L: 4032
						} else if (var0 == 4122) { // L: 4034
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4035
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 4036
							return 1; // L: 4037
						} else if (var0 == 4123) { // L: 4039
							AbstractWorldMapIcon.Interpreter_stringStackSize -= 3; // L: 4040
							var3 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 4041
							var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1]; // L: 4042
							String var5 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 2]; // L: 4043
							if (class133.localPlayer.appearance == null) { // L: 4044
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5; // L: 4045
								return 1; // L: 4046
							} else {
								switch(class133.localPlayer.appearance.field3685) { // L: 4048
								case 0:
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3; // L: 4057
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4; // L: 4054
									break; // L: 4055
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5; // L: 4051
								}

								return 1; // L: 4060
							}
						} else if (var0 == 4124) { // L: 4062
							Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class133.localPlayer.appearance != null ? class133.localPlayer.appearance.field3685 : -1; // L: 4063
							return 1; // L: 4064
						} else {
							return 2; // L: 4066
						}
					}
				} else {
					AbstractWorldMapIcon.Interpreter_stringStackSize -= 2; // L: 3913
					var3 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 3914
					var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1]; // L: 3915
					if (class133.localPlayer.appearance != null && class133.localPlayer.appearance.field3686 != 0) { // L: 3916
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4; // L: 3920
					} else {
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3; // L: 3917
					}

					return 1; // L: 3922
				}
			}
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "324556399"
	)
	static final void method2383(int var0, int var1, int var2, boolean var3) {
		if (class243.field2620.method6285(var0)) { // L: 11198
			class522.resizeInterface(class243.field2620.field3645[var0], -1, var1, var2, var3); // L: 11199
		}
	} // L: 11200
}
