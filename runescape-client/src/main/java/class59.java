import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public class class59 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1209151713
	)
	static int field414;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	VorbisFloor field413;
	@ObfuscatedName("ah")
	boolean field408;
	@ObfuscatedName("ar")
	int[] field412;
	@ObfuscatedName("ao")
	int[] field410;
	@ObfuscatedName("ab")
	boolean[] field411;

	@ObfuscatedSignature(
		descriptor = "(Lbu;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field413 = var1; // L: 11
		this.field408 = var2; // L: 12
		this.field412 = var3; // L: 13
		this.field410 = var4; // L: 14
		this.field411 = var5; // L: 15
	} // L: 16

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "-121312327"
	)
	void method1172(float[] var1, int var2) {
		int var3 = this.field413.field257.length; // L: 19
		VorbisFloor var10000 = this.field413; // L: 20
		int var4 = VorbisFloor.field259[this.field413.multiplier - 1];
		boolean[] var5 = this.field411; // L: 21
		this.field411[1] = true; // L: 22
		var5[0] = true; // L: 23

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) { // L: 24
			var7 = this.field413.method784(this.field412, var6); // L: 25
			var8 = this.field413.method777(this.field412, var6); // L: 26
			var9 = this.field413.method778(this.field412[var7], this.field410[var7], this.field412[var8], this.field410[var8], this.field412[var6]); // L: 27
			var10 = this.field410[var6]; // L: 28
			int var11 = var4 - var9; // L: 29
			int var13 = (var11 < var9 ? var11 : var9) << 1; // L: 31
			if (var10 != 0) { // L: 32
				boolean[] var14 = this.field411; // L: 33
				this.field411[var8] = true; // L: 35
				var14[var7] = true; // L: 36
				this.field411[var6] = true; // L: 37
				if (var10 >= var13) { // L: 38
					this.field410[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1; // L: 39
				} else {
					this.field410[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9; // L: 42
				}
			} else {
				this.field411[var6] = false; // L: 46
				this.field410[var6] = var9; // L: 47
			}
		}

		this.VarbisFloor_sort(0, var3 - 1); // L: 50
		var6 = 0; // L: 51
		var7 = this.field413.multiplier * this.field410[0]; // L: 52

		for (var8 = 1; var8 < var3; ++var8) { // L: 53
			if (this.field411[var8]) { // L: 54
				var9 = this.field412[var8]; // L: 55
				var10 = this.field413.multiplier * this.field410[var8]; // L: 56
				this.field413.method779(var6, var7, var9, var10, var1, var2); // L: 57
				if (var9 >= var2) { // L: 58
					return;
				}

				var6 = var9; // L: 59
				var7 = var10; // L: 60
			}
		}

		var10000 = this.field413; // L: 63
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) { // L: 64
			var1[var9] *= var16;
		}

	} // L: 65

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1465438441"
	)
	boolean method1173() {
		return this.field408; // L: 68
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1888348492"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) { // L: 72
			int var3 = var1; // L: 73
			int var4 = this.field412[var1]; // L: 74
			int var5 = this.field410[var1]; // L: 75
			boolean var6 = this.field411[var1]; // L: 76

			for (int var7 = var1 + 1; var7 <= var2; ++var7) { // L: 77
				int var8 = this.field412[var7];
				if (var8 < var4) {
					this.field412[var3] = var8; // L: 80
					this.field410[var3] = this.field410[var7]; // L: 81
					this.field411[var3] = this.field411[var7]; // L: 82
					++var3; // L: 83
					this.field412[var7] = this.field412[var3]; // L: 84
					this.field410[var7] = this.field410[var3]; // L: 85
					this.field411[var7] = this.field411[var3]; // L: 86
				}
			}

			this.field412[var3] = var4; // L: 89
			this.field410[var3] = var5; // L: 90
			this.field411[var3] = var6; // L: 91
			this.VarbisFloor_sort(var1, var3 - 1); // L: 92
			this.VarbisFloor_sort(var3 + 1, var2); // L: 93
		}
	} // L: 94

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1858684336"
	)
	static void method1185() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "5"
	)
	static int method1184(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class518 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5139
			if (var0 != 7501) { // L: 5161
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5170
					class517.Interpreter_intStackSize -= 3; // L: 5171
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 5172
					var19 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 5173
					var5 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 2]; // L: 5174
					var20 = SequenceDefinition.method4092(var19); // L: 5175
					var7 = class306.method5916(var19); // L: 5176
					int var21 = class134.method3149(var19); // L: 5177
					class519 var26 = class469.method8561(var3); // L: 5178
					class517 var27 = class416.method7825(var20); // L: 5179
					int[] var28 = var27.field5073[var7]; // L: 5180
					int var12 = 0; // L: 5181
					int var13 = var28.length; // L: 5182
					if (var21 >= 0) { // L: 5183
						if (var21 >= var13) { // L: 5184
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5185
						}

						var12 = var21; // L: 5187
						var13 = var21 + 1; // L: 5188
					}

					Object[] var14 = var26.method9163(var7); // L: 5190
					if (var14 == null && var27.field5075 != null) { // L: 5191 5192
						var14 = var27.field5075[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5194
						for (var15 = var12; var15 < var13; ++var15) { // L: 5195
							var16 = var28[var15]; // L: 5196
							class514 var22 = class472.method8562(var16); // L: 5197
							if (var22 == class514.field5061) { // L: 5198
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = MusicPatchNode.method6238(var16); // L: 5199
							}
						}

						return 1; // L: 5201
					} else {
						var15 = var14.length / var28.length; // L: 5203
						if (var5 >= 0 && var5 < var15) { // L: 5204
							for (var16 = var12; var16 < var13; ++var16) { // L: 5207
								int var17 = var16 + var28.length * var5; // L: 5208
								class514 var18 = class472.method8562(var28[var16]); // L: 5209
								if (var18 == class514.field5061) { // L: 5210
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5211
								}
							}

							return 1; // L: 5213
						} else {
							throw new RuntimeException(); // L: 5205
						}
					}
				} else if (var0 == 7503) { // L: 5215
					class517.Interpreter_intStackSize -= 2; // L: 5216
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 5217
					var19 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1]; // L: 5218
					var5 = 0; // L: 5219
					var20 = SequenceDefinition.method4092(var19); // L: 5220
					var7 = class306.method5916(var19); // L: 5221
					class519 var25 = class469.method8561(var3); // L: 5222
					class517 var9 = class416.method7825(var20); // L: 5223
					int[] var10 = var9.field5073[var7]; // L: 5224
					Object[] var11 = var25.method9163(var7); // L: 5225
					if (var11 == null && var9.field5075 != null) { // L: 5226 5227
						var11 = var9.field5075[var7]; // L: 5228
					}

					if (var11 != null) { // L: 5231
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5; // L: 5232
					return 1; // L: 5233
				} else if (var0 != 7504 && var0 != 7510) { // L: 5235
					if (var0 == 7505) { // L: 5252
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5253
						class519 var24 = class469.method8561(var3); // L: 5254
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var24.field5084; // L: 5255
						return 1; // L: 5256
					} else if (var0 == 7506) { // L: 5258
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5259
						var19 = -1; // L: 5260
						if (DevicePcmPlayerProvider.field108 != null && var3 >= 0 && var3 < DevicePcmPlayerProvider.field108.size()) { // L: 5261
							var19 = (Integer)DevicePcmPlayerProvider.field108.get(var3); // L: 5262
						}

						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var19; // L: 5264
						return 1; // L: 5265
					} else if (var0 != 7507 && var0 != 7509) { // L: 5267
						return 2; // L: 5294
					} else {
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5268
						var4 = WorldMapLabelSize.method4488(var3); // L: 5269
						var5 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5270
						var6 = class168.method3513(var5); // L: 5271
						if (var6 == null) { // L: 5272
							throw new RuntimeException(); // L: 5273
						} else if (SequenceDefinition.method4092(var5) != Client.field636) { // L: 5275
							throw new RuntimeException(); // L: 5276
						} else if (DevicePcmPlayerProvider.field108 == null && DevicePcmPlayerProvider.field108.isEmpty()) { // L: 5278
							throw new RuntimeException(); // L: 5279
						} else {
							var7 = class134.method3149(var5); // L: 5281
							List var8 = var6.method9156(var4, var7); // L: 5282
							DevicePcmPlayerProvider.field108 = new LinkedList(DevicePcmPlayerProvider.field108); // L: 5283
							if (var8 != null) { // L: 5284
								DevicePcmPlayerProvider.field108.retainAll(var8); // L: 5285
							} else {
								DevicePcmPlayerProvider.field108.clear(); // L: 5288
							}

							class10.field40 = DevicePcmPlayerProvider.field108.iterator(); // L: 5290
							if (var0 == 7507) { // L: 5291
								Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.field108.size();
							}

							return 1; // L: 5292
						}
					}
				} else {
					--class517.Interpreter_intStackSize; // L: 5236
					var3 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize]; // L: 5237
					class518 var23 = UserComparator4.method2937(var3); // L: 5238
					if (var23 == null) { // L: 5239
						throw new RuntimeException(); // L: 5240
					} else {
						DevicePcmPlayerProvider.field108 = var23.method9156(0, 0); // L: 5242
						var5 = 0; // L: 5243
						if (DevicePcmPlayerProvider.field108 != null) { // L: 5244
							Client.field636 = var3; // L: 5245
							class10.field40 = DevicePcmPlayerProvider.field108.iterator(); // L: 5246
							var5 = DevicePcmPlayerProvider.field108.size(); // L: 5247
						}

						if (var0 == 7504) { // L: 5249
							Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5250
					}
				}
			} else {
				if (class10.field40 != null && class10.field40.hasNext()) { // L: 5162
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = (Integer)class10.field40.next(); // L: 5163
				} else {
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = -1; // L: 5166
				}

				return 1; // L: 5168
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5140
			var4 = WorldMapLabelSize.method4488(var3); // L: 5141
			var5 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 5142
			var6 = class168.method3513(var5); // L: 5143
			if (var6 == null) { // L: 5144
				throw new RuntimeException(); // L: 5145
			} else {
				var7 = class134.method3149(var5); // L: 5147
				DevicePcmPlayerProvider.field108 = var6.method9156(var4, var7); // L: 5148
				if (DevicePcmPlayerProvider.field108 != null) { // L: 5149
					Client.field636 = SequenceDefinition.method4092(var5); // L: 5150
					class10.field40 = DevicePcmPlayerProvider.field108.iterator(); // L: 5151
					if (var0 == 7500) { // L: 5152
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.field108.size();
					}
				} else {
					Client.field636 = -1; // L: 5155
					class10.field40 = null; // L: 5156
					if (var0 == 7500) { // L: 5157
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5159
			}
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lcb;III)V",
		garbageValue = "1570010040"
	)
	static final void method1177(MenuAction var0, int var1, int var2) {
		if (var0 != null) { // L: 9505
			class407.method7656(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.field882, var0.field883, var0.field881, var1, var2); // L: 9506
		}

	} // L: 9508
}
