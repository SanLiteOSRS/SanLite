import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1529858789
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	AbstractArchive field335;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	NodeHashTable field336;

	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256); // L: 11
		this.field336 = new NodeHashTable(256); // L: 14
		this.soundEffectIndex = var1; // L: 17
		this.field335 = var2; // L: 18
	} // L: 19

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbu;",
		garbageValue = "-1861641707"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method876(var1, var2, false); // L: 22
		class53 var6 = (class53)this.field336.get(var4); // L: 23
		if (var6 != null) { // L: 24
			return var6.method1087();
		} else if (var3 != null && var3[0] <= 0) { // L: 25
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 26
			if (var7 == null) { // L: 27
				return null;
			} else {
				RawSound var8 = var7.toRawSound(); // L: 28
				this.field336.put(new class53(var8), var4); // L: 29
				if (var3 != null) { // L: 30
					var3[0] -= var8.samples.length;
				}

				return var8; // L: 31
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lcf;",
		garbageValue = "-98"
	)
	class53 method871(int var1, int var2) {
		long var3 = this.method876(var1, var2, true); // L: 35
		class53 var5 = (class53)this.field336.get(var3); // L: 36
		if (var5 != null) { // L: 37
			return var5; // L: 38
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field335, var1, var2); // L: 40
			if (var6 == null) { // L: 41
				return new class53(); // L: 42
			} else {
				class53 var7 = new class53(var6); // L: 44
				this.field336.put(var7, var3); // L: 45
				return var7; // L: 46
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbu;",
		garbageValue = "88728645"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 50
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 51
		} else {
			throw new RuntimeException(); // L: 52
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lcf;",
		garbageValue = "134889372"
	)
	public class53 method874(int var1) {
		if (this.field335.getGroupCount() == 1) { // L: 56
			return this.method871(0, var1); // L: 57
		} else if (this.field335.getGroupFileCount(var1) == 1) { // L: 59
			return this.method871(var1, 0); // L: 60
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lbu;",
		garbageValue = "1913686453"
	)
	public RawSound method875(int var1) {
		return this.getSoundEffect(var1, (int[])null); // L: 68
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "1190461425"
	)
	long method876(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12); // L: 72
		var4 |= var1 << 16; // L: 73
		return var3 ? (long)var4 ^ 4294967296L : (long)var4; // L: 74 75 78
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Lmi;",
		garbageValue = "139540914"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class92.getWidget(var0); // L: 235
		if (var1 == -1) { // L: 236
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null; // L: 237 238
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1117171488"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1164645966"
	)
	static int method884(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class506 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5124
			if (var0 != 7501) { // L: 5146
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5155
					Interpreter_intStackSize -= 3; // L: 5156
					var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 5157
					var19 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 5158
					var5 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 2]; // L: 5159
					var20 = UserComparator3.method2895(var19); // L: 5160
					var7 = class194.method3686(var19); // L: 5161
					int var21 = class217.method4241(var19); // L: 5162
					class507 var26 = class159.method3272(var3); // L: 5163
					class505 var27 = class159.method3273(var20); // L: 5164
					int[] var28 = var27.field5043[var7]; // L: 5165
					int var12 = 0; // L: 5166
					int var13 = var28.length; // L: 5167
					if (var21 >= 0) { // L: 5168
						if (var21 >= var13) { // L: 5169
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5170
						}

						var12 = var21; // L: 5172
						var13 = var21 + 1; // L: 5173
					}

					Object[] var14 = var26.method8961(var7); // L: 5175
					if (var14 == null && var27.field5045 != null) { // L: 5176 5177
						var14 = var27.field5045[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5179
						for (var15 = var12; var15 < var13; ++var15) { // L: 5180
							var16 = var28[var15]; // L: 5181
							class502 var22 = SequenceDefinition.method4071(var16); // L: 5182
							if (var22 == class502.field5030) { // L: 5183
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = class127.method2979(var16); // L: 5184
							}
						}

						return 1; // L: 5186
					} else {
						var15 = var14.length / var28.length; // L: 5188
						if (var5 >= 0 && var5 < var15) { // L: 5189
							for (var16 = var12; var16 < var13; ++var16) { // L: 5192
								int var17 = var16 + var28.length * var5; // L: 5193
								class502 var18 = SequenceDefinition.method4071(var28[var16]); // L: 5194
								if (var18 == class502.field5030) { // L: 5195
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5196
								}
							}

							return 1; // L: 5198
						} else {
							throw new RuntimeException(); // L: 5190
						}
					}
				} else if (var0 == 7503) { // L: 5200
					Interpreter_intStackSize -= 2; // L: 5201
					var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 5202
					var19 = Interpreter.Interpreter_intStack[Interpreter_intStackSize + 1]; // L: 5203
					var5 = 0; // L: 5204
					var20 = UserComparator3.method2895(var19); // L: 5205
					var7 = class194.method3686(var19); // L: 5206
					class507 var25 = class159.method3272(var3); // L: 5207
					class505 var9 = class159.method3273(var20); // L: 5208
					int[] var10 = var9.field5043[var7]; // L: 5209
					Object[] var11 = var25.method8961(var7); // L: 5210
					if (var11 == null && var9.field5045 != null) { // L: 5211 5212
						var11 = var9.field5045[var7]; // L: 5213
					}

					if (var11 != null) { // L: 5216
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var5; // L: 5217
					return 1; // L: 5218
				} else if (var0 != 7504 && var0 != 7510) { // L: 5220
					if (var0 == 7505) { // L: 5237
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5238
						class507 var24 = class159.method3272(var3); // L: 5239
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var24.field5055; // L: 5240
						return 1; // L: 5241
					} else if (var0 == 7506) { // L: 5243
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5244
						var19 = -1; // L: 5245
						if (VarcInt.field1972 != null && var3 >= 0 && var3 < VarcInt.field1972.size()) { // L: 5246
							var19 = (Integer)VarcInt.field1972.get(var3); // L: 5247
						}

						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var19; // L: 5249
						return 1; // L: 5250
					} else if (var0 != 7507 && var0 != 7509) { // L: 5252
						return 2; // L: 5279
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5253
						var4 = class217.method4239(var3); // L: 5254
						var5 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5255
						var6 = class344.method6604(var5); // L: 5256
						if (var6 == null) { // L: 5257
							throw new RuntimeException(); // L: 5258
						} else if (UserComparator3.method2895(var5) != Client.field822) { // L: 5260
							throw new RuntimeException(); // L: 5261
						} else if (VarcInt.field1972 == null && VarcInt.field1972.isEmpty()) { // L: 5263
							throw new RuntimeException(); // L: 5264
						} else {
							var7 = class217.method4241(var5); // L: 5266
							List var8 = var6.method8950(var4, var7); // L: 5267
							VarcInt.field1972 = new LinkedList(VarcInt.field1972); // L: 5268
							if (var8 != null) { // L: 5269
								VarcInt.field1972.retainAll(var8); // L: 5270
							} else {
								VarcInt.field1972.clear(); // L: 5273
							}

							Decimator.field425 = VarcInt.field1972.iterator(); // L: 5275
							if (var0 == 7507) { // L: 5276
								Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = VarcInt.field1972.size();
							}

							return 1; // L: 5277
						}
					}
				} else {
					--Interpreter_intStackSize; // L: 5221
					var3 = Interpreter.Interpreter_intStack[Interpreter_intStackSize]; // L: 5222
					class506 var23 = IgnoreList.method7815(var3); // L: 5223
					if (var23 == null) { // L: 5224
						throw new RuntimeException(); // L: 5225
					} else {
						VarcInt.field1972 = var23.method8950(0, 0); // L: 5227
						var5 = 0; // L: 5228
						if (VarcInt.field1972 != null) { // L: 5229
							Client.field822 = var3; // L: 5230
							Decimator.field425 = VarcInt.field1972.iterator(); // L: 5231
							var5 = VarcInt.field1972.size(); // L: 5232
						}

						if (var0 == 7504) { // L: 5234
							Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5235
					}
				}
			} else {
				if (Decimator.field425 != null && Decimator.field425.hasNext()) { // L: 5147
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = (Integer)Decimator.field425.next(); // L: 5148
				} else {
					Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = -1; // L: 5151
				}

				return 1; // L: 5153
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5125
			var4 = class217.method4239(var3); // L: 5126
			var5 = Interpreter.Interpreter_intStack[--Interpreter_intStackSize]; // L: 5127
			var6 = class344.method6604(var5); // L: 5128
			if (var6 == null) { // L: 5129
				throw new RuntimeException(); // L: 5130
			} else {
				var7 = class217.method4241(var5); // L: 5132
				VarcInt.field1972 = var6.method8950(var4, var7); // L: 5133
				if (VarcInt.field1972 != null) { // L: 5134
					Client.field822 = UserComparator3.method2895(var5); // L: 5135
					Decimator.field425 = VarcInt.field1972.iterator(); // L: 5136
					if (var0 == 7500) { // L: 5137
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = VarcInt.field1972.size();
					}
				} else {
					Client.field822 = -1; // L: 5140
					Decimator.field425 = null; // L: 5141
					if (var0 == 7500) { // L: 5142
						Interpreter.Interpreter_intStack[++Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5144
			}
		}
	}
}
