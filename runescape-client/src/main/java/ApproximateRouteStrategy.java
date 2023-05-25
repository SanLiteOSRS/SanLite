import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cm")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	} // L: 12339

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILif;I)Z",
		garbageValue = "286986723"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12343
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lgl;",
		garbageValue = "-1717461998"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "16776960"
	)
	static int method1212(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3779
			var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3780
			var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3781
			Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3782
			return 1; // L: 3783
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3785
				SecureRandomCallable.Interpreter_stringStackSize -= 2; // L: 3786
				var3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize]; // L: 3787
				var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1]; // L: 3788
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3789
				return 1; // L: 3790
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3792
				var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3793
				var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3794
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3 + KitDefinition.intToString(var10, true); // L: 3795
				return 1; // L: 3796
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3798
				var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3799
				Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3800
				return 1; // L: 3801
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3803
					var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3804
					long var14 = ((long)var11 + 11745L) * 86400000L; // L: 3805
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3806
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3807
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3808
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3809
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3810
					return 1; // L: 3811
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3813
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3825
						var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3826
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3827
						return 1; // L: 3828
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3830
						SecureRandomCallable.Interpreter_stringStackSize -= 2; // L: 3831
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BuddyRankComparator.method2961(class16.compareStrings(Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1], ClanSettings.clientLanguage)); // L: 3832
						return 1; // L: 3833
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3835
							var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3836
							Interpreter.Interpreter_intStackSize -= 2; // L: 3837
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3838
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3839
							var12 = class128.archive13.takeFile(var9, 0); // L: 3840
							var13 = new Font(var12); // L: 3841
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3842
							return 1; // L: 3843
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3845
							var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3846
							Interpreter.Interpreter_intStackSize -= 2; // L: 3847
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3848
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3849
							var12 = class128.archive13.takeFile(var9, 0); // L: 3850
							var13 = new Font(var12); // L: 3851
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3852
							return 1; // L: 3853
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3855
							SecureRandomCallable.Interpreter_stringStackSize -= 2; // L: 3856
							var3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize]; // L: 3857
							var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1]; // L: 3858
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 3859
								Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4; // L: 3860
							}

							return 1; // L: 3861
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3863
							var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3864
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3865
							return 1; // L: 3866
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3868
							var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3869
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3870
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3871
							return 1; // L: 3872
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3874
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3875
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = VarcInt.isCharPrintable((char)var11) ? 1 : 0; // L: 3876
							return 1; // L: 3877
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3879
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3880
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MenuAction.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3881
							return 1; // L: 3882
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3884
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3885
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class134.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3886
							return 1; // L: 3887
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3889
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3890
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class149.isDigit((char)var11) ? 1 : 0; // L: 3891
							return 1; // L: 3892
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3894
							var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3895
							if (var3 != null) { // L: 3896
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3897
							}

							return 1; // L: 3898
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3900
							var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3901
							Interpreter.Interpreter_intStackSize -= 2; // L: 3902
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3903
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3904
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3905
							return 1; // L: 3906
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3908
							var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3909
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3910
							boolean var18 = false; // L: 3911

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3912
								char var7 = var3.charAt(var6); // L: 3913
								if (var7 == '<') { // L: 3914
									var18 = true;
								} else if (var7 == '>') { // L: 3915
									var18 = false;
								} else if (!var18) { // L: 3916
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3918
							return 1; // L: 3919
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3921
							var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3922
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3923
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3924
							return 1; // L: 3925
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3927
							SecureRandomCallable.Interpreter_stringStackSize -= 2; // L: 3928
							var3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize]; // L: 3929
							var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1]; // L: 3930
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3931
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3932
							return 1; // L: 3933
						} else if (var0 == 4122) { // L: 3935
							var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 3936
							Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3937
							return 1; // L: 3938
						} else if (var0 == 4123) { // L: 3940
							SecureRandomCallable.Interpreter_stringStackSize -= 3; // L: 3941
							var3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize]; // L: 3942
							var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1]; // L: 3943
							String var5 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 2]; // L: 3944
							if (MusicPatchNode.localPlayer.appearance == null) { // L: 3945
								Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5; // L: 3946
								return 1; // L: 3947
							} else {
								switch(MusicPatchNode.localPlayer.appearance.field3511) { // L: 3949
								case 0:
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3; // L: 3951
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4; // L: 3954
									break; // L: 3955
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5; // L: 3958
								}

								return 1; // L: 3961
							}
						} else {
							return 2; // L: 3963
						}
					}
				} else {
					SecureRandomCallable.Interpreter_stringStackSize -= 2; // L: 3814
					var3 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize]; // L: 3815
					var4 = Interpreter.Interpreter_stringStack[SecureRandomCallable.Interpreter_stringStackSize + 1]; // L: 3816
					if (MusicPatchNode.localPlayer.appearance != null && MusicPatchNode.localPlayer.appearance.field3521 != 0) { // L: 3817
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var4; // L: 3821
					} else {
						Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var3; // L: 3818
					}

					return 1; // L: 3823
				}
			}
		}
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-458475537"
	)
	static final void method1205(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 11639
		var0 = 100 - var0; // L: 11640
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 11641
		ScriptFrame.method1164((double)var1); // L: 11642
	} // L: 11643
}
