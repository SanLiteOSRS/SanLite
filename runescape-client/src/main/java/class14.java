import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ag")
public class class14 {
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1348646431
	)
	final int field66;
	@ObfuscatedName("aj")
	final String field70;
	@ObfuscatedName("ac")
	final ThreadFactory field67;
	@ObfuscatedName("aw")
	final ThreadPoolExecutor field71;

	public class14(String var1, int var2, int var3) {
		this.field70 = var1; // L: 15
		this.field66 = var2; // L: 16
		this.field67 = new class16(this); // L: 17
		this.field71 = this.method196(var3); // L: 18
	} // L: 19

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-984889391"
	)
	final ThreadPoolExecutor method196(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field66), this.field67); // L: 22
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lab;B)Lat;",
		garbageValue = "-50"
	)
	public class18 method197(class10 var1) {
		if (this.field71.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field71.getCorePoolSize() + " Queue capacity " + this.field66); // L: 27
			return new class18("Queue full"); // L: 28
		} else {
			class18 var2 = new class18(this.field71.submit(new class19(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	public final void method198() {
		try {
			this.field71.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "111"
	)
	static Date method195() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1087
		var0.set(2, 0); // L: 1088
		var0.set(5, 1); // L: 1089
		var0.set(1, 1900); // L: 1090
		return var0.getTime(); // L: 1091
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "-38"
	)
	static int method203(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3827
			var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3828
			var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3829
			Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3830
			return 1; // L: 3831
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3833
				class179.Interpreter_stringStackSize -= 2; // L: 3834
				var3 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize]; // L: 3835
				var4 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize + 1]; // L: 3836
				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3837
				return 1; // L: 3838
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3840
				var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3841
				var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3842
				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3 + WorldMapSection2.intToString(var10, true); // L: 3843
				return 1; // L: 3844
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3846
				var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3847
				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3848
				return 1; // L: 3849
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3851
					var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3852
					long var14 = ((long)var11 + 11745L) * 86400000L; // L: 3853
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3854
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3855
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3856
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3857
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3858
					return 1; // L: 3859
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3861
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3873
						var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3874
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3875
						return 1; // L: 3876
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3878
						class179.Interpreter_stringStackSize -= 2; // L: 3879
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class158.method3377(VarcInt.compareStrings(Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize + 1], WorldMapElement.clientLanguage)); // L: 3880
						return 1; // L: 3881
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3883
							var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3884
							Interpreter.Interpreter_intStackSize -= 2; // L: 3885
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3886
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3887
							var12 = Canvas.archive13.takeFile(var9, 0); // L: 3888
							var13 = new Font(var12); // L: 3889
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3890
							return 1; // L: 3891
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3893
							var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3894
							Interpreter.Interpreter_intStackSize -= 2; // L: 3895
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3896
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3897
							var12 = Canvas.archive13.takeFile(var9, 0); // L: 3898
							var13 = new Font(var12); // L: 3899
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3900
							return 1; // L: 3901
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3903
							class179.Interpreter_stringStackSize -= 2; // L: 3904
							var3 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize]; // L: 3905
							var4 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize + 1]; // L: 3906
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 3907
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4; // L: 3908
							}

							return 1; // L: 3909
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3911
							var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3912
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3913
							return 1; // L: 3914
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3916
							var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3917
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3918
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3919
							return 1; // L: 3920
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3922
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3923
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class348.isCharPrintable((char)var11) ? 1 : 0; // L: 3924
							return 1; // L: 3925
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3927
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3928
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3929
							return 1; // L: 3930
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3932
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3933
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SpotAnimationDefinition.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3934
							return 1; // L: 3935
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3937
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3938
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class412.isDigit((char)var11) ? 1 : 0; // L: 3939
							return 1; // L: 3940
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3942
							var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3943
							if (var3 != null) { // L: 3944
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3945
							}

							return 1; // L: 3946
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3948
							var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3949
							Interpreter.Interpreter_intStackSize -= 2; // L: 3950
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3951
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3952
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3953
							return 1; // L: 3954
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3956
							var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3957
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3958
							boolean var18 = false; // L: 3959

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3960
								char var7 = var3.charAt(var6); // L: 3961
								if (var7 == '<') { // L: 3962
									var18 = true;
								} else if (var7 == '>') { // L: 3963
									var18 = false;
								} else if (!var18) { // L: 3964
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3966
							return 1; // L: 3967
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3969
							var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3970
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3971
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3972
							return 1; // L: 3973
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3975
							class179.Interpreter_stringStackSize -= 2; // L: 3976
							var3 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize]; // L: 3977
							var4 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize + 1]; // L: 3978
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3979
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3980
							return 1; // L: 3981
						} else if (var0 == 4122) { // L: 3983
							var3 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 3984
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3985
							return 1; // L: 3986
						} else if (var0 == 4123) { // L: 3988
							class179.Interpreter_stringStackSize -= 3; // L: 3989
							var3 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize]; // L: 3990
							var4 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize + 1]; // L: 3991
							String var5 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize + 2]; // L: 3992
							if (class27.localPlayer.appearance == null) { // L: 3993
								Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var5; // L: 3994
								return 1; // L: 3995
							} else {
								switch(class27.localPlayer.appearance.field3562) { // L: 3997
								case 0:
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3; // L: 3999
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4; // L: 4006
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var5; // L: 4003
								}

								return 1; // L: 4009
							}
						} else {
							return 2; // L: 4011
						}
					}
				} else {
					class179.Interpreter_stringStackSize -= 2; // L: 3862
					var3 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize]; // L: 3863
					var4 = Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize + 1]; // L: 3864
					if (class27.localPlayer.appearance != null && class27.localPlayer.appearance.field3563 != 0) { // L: 3865
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var4; // L: 3869
					} else {
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var3; // L: 3866
					}

					return 1; // L: 3871
				}
			}
		}
	}
}
