import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cd")
public class class60 {
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1091339839
	)
	static int field443;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -1106831405
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("at")
	byte[] field440;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -726527241
	)
	int field439;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 174090797
	)
	int field445;

	class60() {
		this.field440 = null; // L: 4
		this.field439 = 0; // L: 5
		this.field445 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "790256157"
	)
	int method1118(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field445; var1 -= var4) {
			var4 = 8 - this.field445;
			int var5 = (1 << var4) - 1;
			var2 += (this.field440[this.field439] >> this.field445 & var5) << var3;
			this.field445 = 0;
			++this.field439;
			var3 += var4; // L: 19
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field440[this.field439] >> this.field445 & var4) << var3;
			this.field445 += var1;
		}

		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1551736607"
	)
	int method1117() {
		int var1 = this.field440[this.field439] >> this.field445 & 1;
		++this.field445;
		this.field439 += this.field445 >> 3;
		this.field445 &= 7; // L: 34
		return var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-2117226834"
	)
	void method1136(byte[] var1, int var2) {
		this.field440 = var1;
		this.field439 = var2; // L: 40
		this.field445 = 0; // L: 41
	} // L: 42

	@ObfuscatedName("at")
	public static final int method1135(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var2 + var4 - var4 * var2; // L: 15
			}

			double var14 = 2.0D * var4 - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = var14 + 6.0D * (var12 - var14) * var16;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = (var12 - var14) * (0.6666666666666666D - var16) * 6.0D + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (6.0D * var0 < 1.0D) { // L: 26
				var8 = var14 + var0 * 6.0D * (var12 - var14);
			} else if (var0 * 2.0D < 1.0D) { // L: 27
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) { // L: 28
				var8 = var14 + (0.6666666666666666D - var0) * (var12 - var14) * 6.0D;
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = var20 * (var12 - var14) * 6.0D + var14;
			} else if (var20 * 2.0D < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var20);
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(var6 * 256.0D); // L: 35
		int var13 = (int)(var8 * 256.0D); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "68"
	)
	public static boolean method1131(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0; // L: 13
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "-967954610"
	)
	public static byte[] method1132(CharSequence var0) {
		int var1 = var0.length(); // L: 74
		byte[] var2 = new byte[var1]; // L: 75

		for (int var3 = 0; var3 < var1; ++var3) { // L: 76
			char var4 = var0.charAt(var3); // L: 77
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 78
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 79
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 80
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 81
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 82
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 83
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 84
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 85
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 86
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 87
				var2[var3] = -119;
			} else if (var4 == 352) { // L: 88
				var2[var3] = -118;
			} else if (var4 == 8249) { // L: 89
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 90
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 91
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 92
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 93
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 94
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 95
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 96
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 97
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 98
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 99
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 100
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 101
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101; // L: 102
			} else if (var4 == 339) { // L: 103
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 104
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 105
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 106
			}
		}

		return var2; // L: 108
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "76"
	)
	static int method1133(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3976
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3977
			Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class300.ItemComposition_get(var3).name; // L: 3978
			return 1; // L: 3979
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3981
				Interpreter.Interpreter_intStackSize -= 2; // L: 3982
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3983
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3984
				var5 = class300.ItemComposition_get(var3); // L: 3985
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 3986
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 3987
				}

				return 1; // L: 3988
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3990
				Interpreter.Interpreter_intStackSize -= 2; // L: 3991
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3992
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3993
				var5 = class300.ItemComposition_get(var3); // L: 3994
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 3995
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = ""; // L: 3996
				}

				return 1; // L: 3997
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3999
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4000
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemComposition_get(var3).price; // L: 4001
				return 1; // L: 4002
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 4004
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4005
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 4006
				return 1; // L: 4007
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4009
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4010
					var4 = class300.ItemComposition_get(var3); // L: 4011
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4012
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4013
					}

					return 1; // L: 4014
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4016
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4017
					var4 = class300.ItemComposition_get(var3); // L: 4018
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4019
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4020
					}

					return 1; // L: 4021
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4023
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4024
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4025
					return 1; // L: 4026
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4028
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4029
					var4 = class300.ItemComposition_get(var3); // L: 4030
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4031
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4032
					}

					return 1; // L: 4033
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4035
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4036
					var4 = class300.ItemComposition_get(var3); // L: 4037
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4038
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4039
					}

					return 1; // L: 4040
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4042
					String var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 4043
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4044
					LoginScreenAnimation.findItemDefinitions(var7, var6 == 1); // L: 4045
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class105.foundItemIdCount; // L: 4046
					return 1; // L: 4047
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4049
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4054
						class13.foundItemIndex = 0; // L: 4055
						return 1; // L: 4056
					} else if (var0 == 4213) { // L: 4058
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4059
						var6 = class300.ItemComposition_get(var3).getShiftClickIndex(); // L: 4060
						if (var6 == -1) { // L: 4061
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 4062
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 + 1; // L: 4065
						}

						return 1; // L: 4067
					} else if (var0 == 4214) { // L: 4069
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4070
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemComposition_get(var3).maleModel; // L: 4071
						return 1; // L: 4072
					} else if (var0 == 4215) { // L: 4074
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4075
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemComposition_get(var3).maleModel1; // L: 4076
						return 1; // L: 4077
					} else if (var0 == 4216) { // L: 4079
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4080
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemComposition_get(var3).maleModel2; // L: 4081
						return 1; // L: 4082
					} else if (var0 == 4217) { // L: 4084
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4085
						var4 = class300.ItemComposition_get(var3); // L: 4086
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field2249; // L: 4087
						return 1; // L: 4088
					} else {
						return 2; // L: 4090
					}
				} else {
					if (class18.foundItemIds != null && class13.foundItemIndex < class105.foundItemIdCount) { // L: 4050
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class18.foundItemIds[++class13.foundItemIndex - 1] & '\uffff'; // L: 4051
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4052
				}
			}
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	static final int method1119() {
		float var0 = 200.0F * ((float)class10.clientPreferences.method2430() - 0.5F); // L: 12205
		return 100 - Math.round(var0); // L: 12206
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Ltz;II)V",
		garbageValue = "1476989367"
	)
	static void method1120(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 12714
		if (Client.randomDatData == null) { // L: 12716
			Client.randomDatData = new byte[24];
		}

		class397.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 12717
		if (JagexCache.JagexCache_randomDat != null) { // L: 12720
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 12722
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 12723
			} catch (Exception var4) { // L: 12725
			}
		}

	} // L: 12728
}
