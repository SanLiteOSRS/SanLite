import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ef")
public class class107 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1361;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1358;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1347;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1348;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1349;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1350;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1346;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1352;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1353;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1354;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1355;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1345;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1357;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1362;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1359;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	static final class107 field1356;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1555194661
	)
	int field1360;

	static {
		field1361 = new class107(0); // L: 2162
		field1358 = new class107(1); // L: 2163
		field1347 = new class107(2); // L: 2164
		field1348 = new class107(3); // L: 2165
		field1349 = new class107(4); // L: 2166
		field1350 = new class107(5); // L: 2167
		field1346 = new class107(6); // L: 2168
		field1352 = new class107(7); // L: 2169
		field1353 = new class107(8); // L: 2170
		field1354 = new class107(9); // L: 2171
		field1355 = new class107(10); // L: 2172
		field1345 = new class107(11); // L: 2173
		field1357 = new class107(12); // L: 2174
		field1362 = new class107(13); // L: 2175
		field1359 = new class107(14); // L: 2176
		field1356 = new class107(15); // L: 2177
	}

	class107(int var1) {
		this.field1360 = var1; // L: 2181
	} // L: 2182

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;Lni;I)V",
		garbageValue = "1627772643"
	)
	public static void method2679(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		class291.SequenceDefinition_archive = var0; // L: 51
		class105.SequenceDefinition_animationsArchive = var1; // L: 52
		class396.SequenceDefinition_skeletonsArchive = var2; // L: 53
	} // L: 54

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;B)V",
		garbageValue = "-12"
	)
	public static void method2680(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-204902460"
	)
	public static boolean method2681() {
		return class304.musicPlayerStatus != 0 ? true : class304.midiPcmStream.isReady(); // L: 97 98
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-1686759875"
	)
	static int method2678(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3788
			var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3789
			var10 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3790
			Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3791
			return 1; // L: 3792
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3794
				class156.Interpreter_stringStackSize -= 2; // L: 3795
				var3 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize]; // L: 3796
				var4 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize + 1]; // L: 3797
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3798
				return 1; // L: 3799
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3801
				var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3802
				var10 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3803
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3 + class6.intToString(var10, true); // L: 3804
				return 1; // L: 3805
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3807
				var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3808
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3809
				return 1; // L: 3810
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3812
					var11 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3813
					long var14 = 86400000L * (11745L + (long)var11); // L: 3814
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3815
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3816
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3817
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3818
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3819
					return 1; // L: 3820
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3822
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3834
						var11 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3835
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3836
						return 1; // L: 3837
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3839
						class156.Interpreter_stringStackSize -= 2; // L: 3840
						Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = MidiPcmStream.method5942(Clock.compareStrings(Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize + 1], class124.clientLanguage)); // L: 3841
						return 1; // L: 3842
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3844
							var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3845
							class336.Interpreter_intStackSize -= 2; // L: 3846
							var10 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3847
							var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3848
							var12 = class127.archive13.takeFile(var9, 0); // L: 3849
							var13 = new Font(var12); // L: 3850
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3851
							return 1; // L: 3852
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3854
							var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3855
							class336.Interpreter_intStackSize -= 2; // L: 3856
							var10 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3857
							var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3858
							var12 = class127.archive13.takeFile(var9, 0); // L: 3859
							var13 = new Font(var12); // L: 3860
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3861
							return 1; // L: 3862
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3864
							class156.Interpreter_stringStackSize -= 2; // L: 3865
							var3 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize]; // L: 3866
							var4 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize + 1]; // L: 3867
							if (Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1) { // L: 3868
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4; // L: 3869
							}

							return 1; // L: 3870
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3872
							var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3873
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3874
							return 1; // L: 3875
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3877
							var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3878
							var10 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3879
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3880
							return 1; // L: 3881
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3883
							var11 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3884
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class132.isCharPrintable((char)var11) ? 1 : 0; // L: 3885
							return 1; // L: 3886
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3888
							var11 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3889
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = ServerPacket.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3890
							return 1; // L: 3891
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3893
							var11 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3894
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = Clock.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3895
							return 1; // L: 3896
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3898
							var11 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3899
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class350.isDigit((char)var11) ? 1 : 0; // L: 3900
							return 1; // L: 3901
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3903
							var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3904
							if (var3 != null) { // L: 3905
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 3906
							}

							return 1; // L: 3907
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3909
							var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3910
							class336.Interpreter_intStackSize -= 2; // L: 3911
							var10 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 3912
							var9 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 3913
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3914
							return 1; // L: 3915
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3917
							var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3918
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3919
							boolean var18 = false; // L: 3920

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3921
								char var7 = var3.charAt(var6); // L: 3922
								if (var7 == '<') { // L: 3923
									var18 = true;
								} else if (var7 == '>') { // L: 3924
									var18 = false;
								} else if (!var18) { // L: 3925
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3927
							return 1; // L: 3928
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3930
							var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3931
							var10 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3932
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3933
							return 1; // L: 3934
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3936
							class156.Interpreter_stringStackSize -= 2; // L: 3937
							var3 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize]; // L: 3938
							var4 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize + 1]; // L: 3939
							var9 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 3940
							Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3941
							return 1; // L: 3942
						} else if (var0 == 4122) { // L: 3944
							var3 = Interpreter.Interpreter_stringStack[--class156.Interpreter_stringStackSize]; // L: 3945
							Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3946
							return 1; // L: 3947
						} else if (var0 == 4123) { // L: 3949
							class156.Interpreter_stringStackSize -= 3; // L: 3950
							var3 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize]; // L: 3951
							var4 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize + 1]; // L: 3952
							String var5 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize + 2]; // L: 3953
							if (HitSplatDefinition.localPlayer.appearance == null) { // L: 3954
								Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var5; // L: 3955
								return 1; // L: 3956
							} else {
								switch(HitSplatDefinition.localPlayer.appearance.field3542) { // L: 3958
								case 0:
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3; // L: 3964
									break; // L: 3965
								case 1:
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4; // L: 3967
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var5; // L: 3961
								}

								return 1; // L: 3970
							}
						} else {
							return 2; // L: 3972
						}
					}
				} else {
					class156.Interpreter_stringStackSize -= 2; // L: 3823
					var3 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize]; // L: 3824
					var4 = Interpreter.Interpreter_stringStack[class156.Interpreter_stringStackSize + 1]; // L: 3825
					if (HitSplatDefinition.localPlayer.appearance != null && HitSplatDefinition.localPlayer.appearance.field3543 != 0) { // L: 3826
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var4; // L: 3830
					} else {
						Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3; // L: 3827
					}

					return 1; // L: 3832
				}
			}
		}
	}
}
