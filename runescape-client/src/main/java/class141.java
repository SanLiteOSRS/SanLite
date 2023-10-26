import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fn")
public enum class141 implements class386 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1635(2, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1627(3, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1630(1, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1629(4, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	field1634(0, 4);

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 667084945
	)
	public final int field1626;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 82137219
	)
	@Export("id")
	final int id;

	class141(int var3, int var4) {
		this.field1626 = var3;
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1592727780"
	)
	public static void method3127() {
		class202.field2026.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldh;",
		garbageValue = "-2108098513"
	)
	static class92[] method3128() {
		return new class92[]{class92.field1108, class92.field1111, class92.field1109, class92.field1113, class92.field1112, class92.field1110}; // L: 17
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1466228430"
	)
	static int method3129(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3841
			var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3842
			var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3843
			Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3844
			return 1; // L: 3845
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3847
				class180.Interpreter_stringStackSize -= 2; // L: 3848
				var3 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize]; // L: 3849
				var4 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 1]; // L: 3850
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3851
				return 1; // L: 3852
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3854
				var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3855
				var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3856
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3 + AbstractWorldMapData.intToString(var10, true); // L: 3857
				return 1; // L: 3858
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3860
				var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3861
				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3862
				return 1; // L: 3863
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3865
					var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3866
					long var14 = (11745L + (long)var11) * 86400000L; // L: 3867
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3868
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3869
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3870
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3871
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3872
					return 1; // L: 3873
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3875
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3887
						var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3888
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3889
						return 1; // L: 3890
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3892
						class180.Interpreter_stringStackSize -= 2; // L: 3893
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class241.method4622(CollisionMap.compareStrings(Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 1], WorldMapLabelSize.clientLanguage)); // L: 3894
						return 1; // L: 3895
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3897
							var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3898
							Interpreter.Interpreter_intStackSize -= 2; // L: 3899
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3900
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3901
							var12 = class27.archive13.takeFile(var9, 0); // L: 3902
							var13 = new Font(var12); // L: 3903
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3904
							return 1; // L: 3905
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3907
							var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3908
							Interpreter.Interpreter_intStackSize -= 2; // L: 3909
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3910
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3911
							var12 = class27.archive13.takeFile(var9, 0); // L: 3912
							var13 = new Font(var12); // L: 3913
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3914
							return 1; // L: 3915
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3917
							class180.Interpreter_stringStackSize -= 2; // L: 3918
							var3 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize]; // L: 3919
							var4 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 1]; // L: 3920
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 3921
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4; // L: 3922
							}

							return 1; // L: 3923
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3925
							var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3926
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3927
							return 1; // L: 3928
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3930
							var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3931
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3932
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3933
							return 1; // L: 3934
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3936
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3937
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = StructComposition.isCharPrintable((char)var11) ? 1 : 0; // L: 3938
							return 1; // L: 3939
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3941
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3942
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Decimator.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3943
							return 1; // L: 3944
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3946
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3947
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class135.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3948
							return 1; // L: 3949
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3951
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3952
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = IsaacCipher.isDigit((char)var11) ? 1 : 0; // L: 3953
							return 1; // L: 3954
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3956
							var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3957
							if (var3 != null) { // L: 3958
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3959
							}

							return 1; // L: 3960
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3962
							var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3963
							Interpreter.Interpreter_intStackSize -= 2; // L: 3964
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3965
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3966
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3967
							return 1; // L: 3968
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3970
							var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3971
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3972
							boolean var18 = false; // L: 3973

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3974
								char var7 = var3.charAt(var6); // L: 3975
								if (var7 == '<') { // L: 3976
									var18 = true;
								} else if (var7 == '>') { // L: 3977
									var18 = false;
								} else if (!var18) { // L: 3978
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3980
							return 1; // L: 3981
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3983
							var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3984
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3985
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3986
							return 1; // L: 3987
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3989
							class180.Interpreter_stringStackSize -= 2; // L: 3990
							var3 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize]; // L: 3991
							var4 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 1]; // L: 3992
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3993
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3994
							return 1; // L: 3995
						} else if (var0 == 4122) { // L: 3997
							var3 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]; // L: 3998
							Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3999
							return 1; // L: 4000
						} else if (var0 == 4123) { // L: 4002
							class180.Interpreter_stringStackSize -= 3; // L: 4003
							var3 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize]; // L: 4004
							var4 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 1]; // L: 4005
							String var5 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 2]; // L: 4006
							if (TextureProvider.localPlayer.appearance == null) { // L: 4007
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5; // L: 4008
								return 1; // L: 4009
							} else {
								switch(TextureProvider.localPlayer.appearance.field3614) { // L: 4011
								case 0:
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3; // L: 4016
									break; // L: 4017
								case 1:
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4; // L: 4013
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var5; // L: 4020
								}

								return 1; // L: 4023
							}
						} else {
							return 2; // L: 4025
						}
					}
				} else {
					class180.Interpreter_stringStackSize -= 2; // L: 3876
					var3 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize]; // L: 3877
					var4 = Interpreter.Interpreter_stringStack[class180.Interpreter_stringStackSize + 1]; // L: 3878
					if (TextureProvider.localPlayer.appearance != null && TextureProvider.localPlayer.appearance.field3611 != 0) { // L: 3879
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var4; // L: 3883
					} else {
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3; // L: 3880
					}

					return 1; // L: 3885
				}
			}
		}
	}
}
