import java.net.URL;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ee")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -752777603
	)
	static int field1434;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1873857457
	)
	static int field1435;
	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("am")
	final URL field1440;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 983679983
	)
	volatile int field1436;
	@ObfuscatedName("aq")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1434 = -1; // L: 134
		field1435 = -2; // L: 135
	}

	UrlRequest(URL var1) {
		this.field1436 = field1434; // L: 136
		this.field1440 = var1; // L: 140
	} // L: 141

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "66"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1436 != field1434; // L: 144
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "375506917"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 148
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "16"
	)
	public String method2920() {
		return this.field1440.toString(); // L: 152
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1230611922"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 98
		int var4 = 0; // L: 99

		for (int var5 = 0; var5 < var2; ++var5) { // L: 100
			int var6 = var0[var5 + var1] & 255; // L: 101
			if (var6 != 0) { // L: 102
				if (var6 >= 128 && var6 < 160) { // L: 103
					char var7 = class400.cp1252AsciiExtension[var6 - 128]; // L: 104
					if (var7 == 0) { // L: 105
						var7 = '?';
					}

					var6 = var7; // L: 106
				}

				var3[var4++] = (char)var6; // L: 108
			}
		}

		return new String(var3, 0, var4); // L: 110
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1029576904"
	)
	static int method2929(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3876
			var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3877
			var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3878
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3879
			return 1; // L: 3880
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3882
				class211.Interpreter_stringStackSize -= 2; // L: 3883
				var3 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize]; // L: 3884
				var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1]; // L: 3885
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3886
				return 1; // L: 3887
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3889
				var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3890
				var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3891
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3 + GrandExchangeOfferAgeComparator.intToString(var10, true); // L: 3892
				return 1; // L: 3893
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3895
				var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3896
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3897
				return 1; // L: 3898
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3900
					var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3901
					long var14 = 86400000L * (11745L + (long)var11); // L: 3902
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3903
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3904
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3905
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3906
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3907
					return 1; // L: 3908
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3910
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3922
						var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3923
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3924
						return 1; // L: 3925
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3927
						class211.Interpreter_stringStackSize -= 2; // L: 3928
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class17.method271(ObjectComposition.compareStrings(Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1], class92.clientLanguage)); // L: 3929
						return 1; // L: 3930
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3932
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3933
							UserComparator6.Interpreter_intStackSize -= 2; // L: 3934
							var10 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3935
							var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3936
							var12 = HitSplatDefinition.archive13.takeFile(var9, 0); // L: 3937
							var13 = new Font(var12); // L: 3938
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3939
							return 1; // L: 3940
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3942
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3943
							UserComparator6.Interpreter_intStackSize -= 2; // L: 3944
							var10 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 3945
							var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 3946
							var12 = HitSplatDefinition.archive13.takeFile(var9, 0); // L: 3947
							var13 = new Font(var12); // L: 3948
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3949
							return 1; // L: 3950
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3952
							class211.Interpreter_stringStackSize -= 2; // L: 3953
							var3 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize]; // L: 3954
							var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1]; // L: 3955
							if (Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1) { // L: 3956
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4; // L: 3957
							}

							return 1; // L: 3958
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3960
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3961
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3962
							return 1; // L: 3963
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3965
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3966
							var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3967
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3968
							return 1; // L: 3969
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3971
							var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3972
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = WorldMapData_1.isCharPrintable((char)var11) ? 1 : 0; // L: 3973
							return 1; // L: 3974
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3976
							var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3977
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = WorldMapIcon_0.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3978
							return 1; // L: 3979
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3981
							var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3982
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = PlayerType.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3983
							return 1; // L: 3984
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3986
							var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3987
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ScriptFrame.isDigit((char)var11) ? 1 : 0; // L: 3988
							return 1; // L: 3989
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3991
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3992
							if (var3 != null) { // L: 3993
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 3994
							}

							return 1; // L: 3995
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3997
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 3998
							UserComparator6.Interpreter_intStackSize -= 2; // L: 3999
							var10 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4000
							var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4001
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 4002
							return 1; // L: 4003
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 4005
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 4006
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 4007
							boolean var18 = false; // L: 4008

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 4009
								char var7 = var3.charAt(var6); // L: 4010
								if (var7 == '<') { // L: 4011
									var18 = true;
								} else if (var7 == '>') { // L: 4012
									var18 = false;
								} else if (!var18) { // L: 4013
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var16.toString(); // L: 4015
							return 1; // L: 4016
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 4018
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 4019
							var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4020
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 4021
							return 1; // L: 4022
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 4024
							class211.Interpreter_stringStackSize -= 2; // L: 4025
							var3 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize]; // L: 4026
							var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1]; // L: 4027
							var9 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4028
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 4029
							return 1; // L: 4030
						} else if (var0 == 4122) { // L: 4032
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 4033
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 4034
							return 1; // L: 4035
						} else if (var0 == 4123) { // L: 4037
							class211.Interpreter_stringStackSize -= 3; // L: 4038
							var3 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize]; // L: 4039
							var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1]; // L: 4040
							String var5 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 2]; // L: 4041
							if (class25.localPlayer.appearance == null) { // L: 4042
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5; // L: 4043
								return 1; // L: 4044
							} else {
								switch(class25.localPlayer.appearance.field3639) { // L: 4046
								case 0:
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3; // L: 4051
									break; // L: 4052
								case 1:
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4; // L: 4048
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5; // L: 4055
								}

								return 1; // L: 4058
							}
						} else {
							return 2; // L: 4060
						}
					}
				} else {
					class211.Interpreter_stringStackSize -= 2; // L: 3911
					var3 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize]; // L: 3912
					var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1]; // L: 3913
					if (class25.localPlayer.appearance != null && class25.localPlayer.appearance.field3640 != 0) { // L: 3914
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4; // L: 3918
					} else {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3; // L: 3915
					}

					return 1; // L: 3920
				}
			}
		}
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	static void method2930(int var0) {
		if (var0 != Client.loginState) { // L: 12757
			Client.loginState = var0; // L: 12758
		}
	} // L: 12759
}
