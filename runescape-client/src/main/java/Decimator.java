import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cx")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("wm")
	static Iterator field425;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1787207085
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1799047063
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ai")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}

			while (var5 != 0) { // L: 24
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			}

			var1 /= var4; // L: 32
			var2 /= var4; // L: 33
			this.inputRate = var1; // L: 34
			this.outputRate = var2; // L: 35
			this.table = new int[var1][14]; // L: 36

			for (int var7 = 0; var7 < var1; ++var7) { // L: 37
				int[] var8 = this.table[var7]; // L: 38
				double var9 = 6.0D + (double)var7 / (double)var1; // L: 39
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D)); // L: 40
				if (var11 < 0) { // L: 41
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D); // L: 42
				if (var12 > 14) { // L: 43
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) { // L: 44 45
					double var15 = ((double)var11 - var9) * 3.141592653589793D; // L: 46
					double var17 = var13; // L: 47
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) { // L: 48
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9)); // L: 49
					var8[var11] = (int)Math.floor(0.5D + var17 * 65536.0D); // L: 50
				}
			}

		}
	} // L: 53

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BS)[B",
		garbageValue = "31853"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 56
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14; // L: 57
			int[] var3 = new int[var2]; // L: 58
			int var4 = 0; // L: 59
			int var5 = 0; // L: 60

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 61
				byte var7 = var1[var6]; // L: 62
				int[] var8 = this.table[var5]; // L: 63

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 64
					var3[var9 + var4] += var7 * var8[var9];
				}

				var5 += this.outputRate; // L: 65
				var9 = var5 / this.inputRate; // L: 66
				var4 += var9; // L: 67
				var5 -= var9 * this.inputRate; // L: 68
			}

			var1 = new byte[var2]; // L: 70

			for (var6 = 0; var6 < var2; ++var6) { // L: 71
				int var10 = var3[var6] + 32768 >> 16; // L: 72
				if (var10 < -128) { // L: 73
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 74
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 75
				}
			}
		}

		return var1; // L: 78
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) { // L: 82
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
		}

		return var1; // L: 83
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "429071526"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 87
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1; // L: 88
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;Lsf;I)Lsf;",
		garbageValue = "-738926216"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte(); // L: 16
		int var3;
		if (var1 == null) { // L: 17
			var3 = WorldMapIcon_1.method5088(var2); // L: 18
			var1 = new IterableNodeHashTable(var3); // L: 19
		}

		for (var3 = 0; var3 < var2; ++var3) { // L: 21
			boolean var4 = var0.readUnsignedByte() == 1; // L: 22
			int var5 = var0.readMedium(); // L: 23
			Object var6;
			if (var4) { // L: 25
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt()); // L: 26
			}

			var1.put((Node)var6, (long)var5); // L: 27
		}

		return var1; // L: 29
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Ltu;",
		garbageValue = "1734618555"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 248
		if (var3.exists()) { // L: 249
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 251
				return var10; // L: 252
			} catch (IOException var9) { // L: 254
			}
		}

		String var4 = ""; // L: 256
		if (JagexCache.cacheGamebuild == 33) { // L: 257
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) { // L: 258
			var4 = "_wip";
		}

		File var5 = new File(class36.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 259
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 260
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 262
				return var6; // L: 263
			} catch (IOException var8) { // L: 265
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 268
			return var6; // L: 269
		} catch (IOException var7) { // L: 271
			throw new RuntimeException(); // L: 272
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "88"
	)
	static final boolean method1135() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 93
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnu;IB)Z",
		garbageValue = "0"
	)
	public static boolean method1129(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 187
		if (var2 == null) { // L: 188
			return false;
		} else {
			class137.SpriteBuffer_decode(var2); // L: 189
			return true; // L: 190
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-94"
	)
	static int method1133(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3830
			var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3831
			var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3832
			Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3833
			return 1; // L: 3834
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3836
				class137.Interpreter_stringStackSize -= 2; // L: 3837
				var3 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize]; // L: 3838
				var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1]; // L: 3839
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3840
				return 1; // L: 3841
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3843
				var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3844
				var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3845
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3 + class60.intToString(var10, true); // L: 3846
				return 1; // L: 3847
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3849
				var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3850
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3851
				return 1; // L: 3852
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3854
					var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3855
					long var14 = 86400000L * ((long)var11 + 11745L); // L: 3856
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3857
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3858
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3859
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3860
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3861
					return 1; // L: 3862
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3864
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3876
						var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3877
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3878
						return 1; // L: 3879
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3881
						class137.Interpreter_stringStackSize -= 2; // L: 3882
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ItemComposition.method4006(StudioGame.compareStrings(Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1], ClanChannelMember.clientLanguage)); // L: 3883
						return 1; // L: 3884
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3886
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3887
							SoundCache.Interpreter_intStackSize -= 2; // L: 3888
							var10 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3889
							var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3890
							var12 = Player.archive13.takeFile(var9, 0); // L: 3891
							var13 = new Font(var12); // L: 3892
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3893
							return 1; // L: 3894
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3896
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3897
							SoundCache.Interpreter_intStackSize -= 2; // L: 3898
							var10 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3899
							var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3900
							var12 = Player.archive13.takeFile(var9, 0); // L: 3901
							var13 = new Font(var12); // L: 3902
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3903
							return 1; // L: 3904
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3906
							class137.Interpreter_stringStackSize -= 2; // L: 3907
							var3 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize]; // L: 3908
							var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1]; // L: 3909
							if (Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1) { // L: 3910
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4; // L: 3911
							}

							return 1; // L: 3912
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3914
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3915
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3916
							return 1; // L: 3917
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3919
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3920
							var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3921
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3922
							return 1; // L: 3923
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3925
							var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3926
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.isCharPrintable((char)var11) ? 1 : 0; // L: 3927
							return 1; // L: 3928
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3930
							var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3931
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = WorldMapLabel.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3932
							return 1; // L: 3933
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3935
							var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3936
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class200.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3937
							return 1; // L: 3938
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3940
							var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3941
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class330.isDigit((char)var11) ? 1 : 0; // L: 3942
							return 1; // L: 3943
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3945
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3946
							if (var3 != null) { // L: 3947
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0; // L: 3948
							}

							return 1; // L: 3949
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3951
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3952
							SoundCache.Interpreter_intStackSize -= 2; // L: 3953
							var10 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]; // L: 3954
							var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]; // L: 3955
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3956
							return 1; // L: 3957
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3959
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3960
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3961
							boolean var18 = false; // L: 3962

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3963
								char var7 = var3.charAt(var6); // L: 3964
								if (var7 == '<') { // L: 3965
									var18 = true;
								} else if (var7 == '>') { // L: 3966
									var18 = false;
								} else if (!var18) { // L: 3967
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3969
							return 1; // L: 3970
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3972
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3973
							var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3974
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3975
							return 1; // L: 3976
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3978
							class137.Interpreter_stringStackSize -= 2; // L: 3979
							var3 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize]; // L: 3980
							var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1]; // L: 3981
							var9 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]; // L: 3982
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3983
							return 1; // L: 3984
						} else if (var0 == 4122) { // L: 3986
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]; // L: 3987
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3988
							return 1; // L: 3989
						} else if (var0 == 4123) { // L: 3991
							class137.Interpreter_stringStackSize -= 3; // L: 3992
							var3 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize]; // L: 3993
							var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1]; // L: 3994
							String var5 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 2]; // L: 3995
							if (VarbitComposition.localPlayer.appearance == null) { // L: 3996
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5; // L: 3997
								return 1; // L: 3998
							} else {
								switch(VarbitComposition.localPlayer.appearance.field3574) { // L: 4000
								case 0:
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3; // L: 4006
									break; // L: 4007
								case 1:
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4; // L: 4009
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5; // L: 4003
								}

								return 1; // L: 4012
							}
						} else {
							return 2; // L: 4014
						}
					}
				} else {
					class137.Interpreter_stringStackSize -= 2; // L: 3865
					var3 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize]; // L: 3866
					var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1]; // L: 3867
					if (VarbitComposition.localPlayer.appearance != null && VarbitComposition.localPlayer.appearance.field3572 != 0) { // L: 3868
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4; // L: 3872
					} else {
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3; // L: 3869
					}

					return 1; // L: 3874
				}
			}
		}
	}
}
