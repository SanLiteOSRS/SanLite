import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nu")
public class class351 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static final class351 field4282;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static final class351 field4280;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	static final class351 field4281;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -934359099
	)
	@Export("cameraY")
	static int cameraY;

	static {
		field4282 = new class351(); // L: 4
		field4280 = new class351(); // L: 5
		field4281 = new class351(); // L: 6
	}

	class351() {
	} // L: 8

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "-28082582"
	)
	static int method6636(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3758
			var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3759
			var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3760
			Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3761
			return 1; // L: 3762
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3764
				HealthBar.Interpreter_stringStackSize -= 2; // L: 3765
				var3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize]; // L: 3766
				var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1]; // L: 3767
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3768
				return 1; // L: 3769
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3771
				var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3772
				var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3773
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3 + class393.intToString(var10, true); // L: 3774
				return 1; // L: 3775
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3777
				var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3778
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3779
				return 1; // L: 3780
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3782
					var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3783
					long var14 = 86400000L * (11745L + (long)var11); // L: 3784
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3785
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3786
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3787
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3788
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3789
					return 1; // L: 3790
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3792
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3804
						var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3805
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3806
						return 1; // L: 3807
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3809
						HealthBar.Interpreter_stringStackSize -= 2; // L: 3810
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class211.method4151(class188.compareStrings(Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1], class69.clientLanguage)); // L: 3811
						return 1; // L: 3812
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3814
							var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3815
							Interpreter.Interpreter_intStackSize -= 2; // L: 3816
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3817
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3818
							var12 = TextureProvider.archive13.takeFile(var9, 0); // L: 3819
							var13 = new Font(var12); // L: 3820
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3821
							return 1; // L: 3822
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3824
							var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3825
							Interpreter.Interpreter_intStackSize -= 2; // L: 3826
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3827
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3828
							var12 = TextureProvider.archive13.takeFile(var9, 0); // L: 3829
							var13 = new Font(var12); // L: 3830
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3831
							return 1; // L: 3832
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3834
							HealthBar.Interpreter_stringStackSize -= 2; // L: 3835
							var3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize]; // L: 3836
							var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1]; // L: 3837
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 3838
								Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4; // L: 3839
							}

							return 1; // L: 3840
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3842
							var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3843
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3844
							return 1; // L: 3845
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3847
							var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3848
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3849
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3850
							return 1; // L: 3851
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3853
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3854
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MusicPatchPcmStream.isCharPrintable((char)var11) ? 1 : 0; // L: 3855
							return 1; // L: 3856
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3858
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3859
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PlayerComposition.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3860
							return 1; // L: 3861
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3863
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3864
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ArchiveDiskAction.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3865
							return 1; // L: 3866
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3868
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3869
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = KeyHandler.isDigit((char)var11) ? 1 : 0; // L: 3870
							return 1; // L: 3871
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3873
							var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3874
							if (var3 != null) { // L: 3875
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3876
							}

							return 1; // L: 3877
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3879
							var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3880
							Interpreter.Interpreter_intStackSize -= 2; // L: 3881
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3882
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3883
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3884
							return 1; // L: 3885
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3887
							var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3888
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3889
							boolean var18 = false; // L: 3890

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3891
								char var7 = var3.charAt(var6); // L: 3892
								if (var7 == '<') { // L: 3893
									var18 = true;
								} else if (var7 == '>') { // L: 3894
									var18 = false;
								} else if (!var18) { // L: 3895
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3897
							return 1; // L: 3898
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3900
							var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3901
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3902
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3903
							return 1; // L: 3904
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3906
							HealthBar.Interpreter_stringStackSize -= 2; // L: 3907
							var3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize]; // L: 3908
							var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1]; // L: 3909
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3910
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3911
							return 1; // L: 3912
						} else if (var0 == 4122) { // L: 3914
							var3 = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 3915
							Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3916
							return 1; // L: 3917
						} else if (var0 == 4123) { // L: 3919
							HealthBar.Interpreter_stringStackSize -= 3; // L: 3920
							var3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize]; // L: 3921
							var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1]; // L: 3922
							String var5 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 2]; // L: 3923
							if (BuddyRankComparator.localPlayer.appearance == null) { // L: 3924
								Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5; // L: 3925
								return 1; // L: 3926
							} else {
								switch(BuddyRankComparator.localPlayer.appearance.field3461) { // L: 3928
								case 0:
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3; // L: 3934
									break; // L: 3935
								case 1:
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4; // L: 3937
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var5; // L: 3931
								}

								return 1; // L: 3940
							}
						} else {
							return 2; // L: 3942
						}
					}
				} else {
					HealthBar.Interpreter_stringStackSize -= 2; // L: 3793
					var3 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize]; // L: 3794
					var4 = Interpreter.Interpreter_stringStack[HealthBar.Interpreter_stringStackSize + 1]; // L: 3795
					if (BuddyRankComparator.localPlayer.appearance != null && BuddyRankComparator.localPlayer.appearance.field3464 != 0) { // L: 3796
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4; // L: 3800
					} else {
						Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3; // L: 3797
					}

					return 1; // L: 3802
				}
			}
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZB)V",
		garbageValue = "55"
	)
	static final void method6635(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 9712
			if (Client.menuOptionsCount < 500) { // L: 9713
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9714
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9715
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9716
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9717
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9718
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9719
				Client.field628[Client.menuOptionsCount] = var6; // L: 9720
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 9721
				++Client.menuOptionsCount; // L: 9722
			}

		}
	} // L: 9724
}
