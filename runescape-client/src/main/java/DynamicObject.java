import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -867396279
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1462065423
	)
	@Export("type")
	int type;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 121923965
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1938885073
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -668170179
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1601039867
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2038787913
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1593490755
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLjy;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = class36.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2340 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (this.sequenceDefinition == var10.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4177()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) { // L: 51
			int var1 = Client.cycle - this.cycleStart; // L: 52
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method4177(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label80: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label80;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame; // L: 57
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 58

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 60

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = class91.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) { // L: 81
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "-1342712165"
	)
	static int method2218(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class521 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5135
			if (var0 != 7501) { // L: 5157
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5166
					Interpreter.Interpreter_intStackSize -= 3; // L: 5167
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5168
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5169
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 5170
					var20 = AbstractArchive.method6972(var19); // L: 5171
					var7 = VarbitComposition.method3896(var19); // L: 5172
					int var21 = HealthBar.method2619(var19); // L: 5173
					class522 var26 = class180.method3566(var3); // L: 5174
					class520 var27 = class309.method5866(var20); // L: 5175
					int[] var28 = var27.field5079[var7]; // L: 5176
					int var12 = 0; // L: 5177
					int var13 = var28.length; // L: 5178
					if (var21 >= 0) { // L: 5179
						if (var21 >= var13) { // L: 5180
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5181
						}

						var12 = var21; // L: 5183
						var13 = var21 + 1; // L: 5184
					}

					Object[] var14 = var26.method9105(var7); // L: 5186
					if (var14 == null && var27.field5078 != null) { // L: 5187 5188
						var14 = var27.field5078[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5190
						for (var15 = var12; var15 < var13; ++var15) { // L: 5191
							var16 = var28[var15]; // L: 5192
							class517 var22 = Tile.method4516(var16); // L: 5193
							if (var22 == class517.field5065) { // L: 5194
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class360.method6801(var16); // L: 5195
							}
						}

						return 1; // L: 5197
					} else {
						var15 = var14.length / var28.length; // L: 5199
						if (var5 >= 0 && var5 < var15) { // L: 5200
							for (var16 = var12; var16 < var13; ++var16) { // L: 5203
								int var17 = var16 + var28.length * var5; // L: 5204
								class517 var18 = Tile.method4516(var28[var16]); // L: 5205
								if (var18 == class517.field5065) { // L: 5206
									Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5207
								}
							}

							return 1; // L: 5209
						} else {
							throw new RuntimeException(); // L: 5201
						}
					}
				} else if (var0 == 7503) { // L: 5211
					Interpreter.Interpreter_intStackSize -= 2; // L: 5212
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5213
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5214
					var5 = 0; // L: 5215
					var20 = AbstractArchive.method6972(var19); // L: 5216
					var7 = VarbitComposition.method3896(var19); // L: 5217
					class522 var25 = class180.method3566(var3); // L: 5218
					class520 var9 = class309.method5866(var20); // L: 5219
					int[] var10 = var9.field5079[var7]; // L: 5220
					Object[] var11 = var25.method9105(var7); // L: 5221
					if (var11 == null && var9.field5078 != null) { // L: 5222 5223
						var11 = var9.field5078[var7]; // L: 5224
					}

					if (var11 != null) { // L: 5227
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 5228
					return 1; // L: 5229
				} else if (var0 != 7504 && var0 != 7510) { // L: 5231
					if (var0 == 7505) { // L: 5248
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5249
						class522 var24 = class180.method3566(var3); // L: 5250
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.field5089; // L: 5251
						return 1; // L: 5252
					} else if (var0 == 7506) { // L: 5254
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5255
						var19 = -1; // L: 5256
						if (class130.field1529 != null && var3 >= 0 && var3 < class130.field1529.size()) { // L: 5257
							var19 = (Integer)class130.field1529.get(var3); // L: 5258
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19; // L: 5260
						return 1; // L: 5261
					} else if (var0 != 7507 && var0 != 7509) { // L: 5263
						return 2; // L: 5290
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5264
						var4 = GrandExchangeOfferOwnWorldComparator.method1241(var3); // L: 5265
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5266
						var6 = SoundCache.method865(var5); // L: 5267
						if (var6 == null) { // L: 5268
							throw new RuntimeException(); // L: 5269
						} else if (AbstractArchive.method6972(var5) != Client.field587) { // L: 5271
							throw new RuntimeException(); // L: 5272
						} else if (class130.field1529 == null && class130.field1529.isEmpty()) { // L: 5274
							throw new RuntimeException(); // L: 5275
						} else {
							var7 = HealthBar.method2619(var5); // L: 5277
							List var8 = var6.method9089(var4, var7); // L: 5278
							class130.field1529 = new LinkedList(class130.field1529); // L: 5279
							if (var8 != null) { // L: 5280
								class130.field1529.retainAll(var8); // L: 5281
							} else {
								class130.field1529.clear(); // L: 5284
							}

							class481.field4836 = class130.field1529.iterator(); // L: 5286
							if (var0 == 7507) { // L: 5287
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class130.field1529.size();
							}

							return 1; // L: 5288
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize; // L: 5232
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5233
					class521 var23 = class223.method4212(var3); // L: 5234
					if (var23 == null) { // L: 5235
						throw new RuntimeException(); // L: 5236
					} else {
						class130.field1529 = var23.method9089(0, 0); // L: 5238
						var5 = 0; // L: 5239
						if (class130.field1529 != null) { // L: 5240
							Client.field587 = var3; // L: 5241
							class481.field4836 = class130.field1529.iterator(); // L: 5242
							var5 = class130.field1529.size(); // L: 5243
						}

						if (var0 == 7504) { // L: 5245
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5246
					}
				}
			} else {
				if (class481.field4836 != null && class481.field4836.hasNext()) { // L: 5158
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)class481.field4836.next(); // L: 5159
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5162
				}

				return 1; // L: 5164
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5136
			var4 = GrandExchangeOfferOwnWorldComparator.method1241(var3); // L: 5137
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5138
			var6 = SoundCache.method865(var5); // L: 5139
			if (var6 == null) { // L: 5140
				throw new RuntimeException(); // L: 5141
			} else {
				var7 = HealthBar.method2619(var5); // L: 5143
				class130.field1529 = var6.method9089(var4, var7); // L: 5144
				if (class130.field1529 != null) { // L: 5145
					Client.field587 = AbstractArchive.method6972(var5); // L: 5146
					class481.field4836 = class130.field1529.iterator(); // L: 5147
					if (var0 == 7500) { // L: 5148
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class130.field1529.size();
					}
				} else {
					Client.field587 = -1; // L: 5151
					class481.field4836 = null; // L: 5152
					if (var0 == 7500) { // L: 5153
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5155
			}
		}
	}
}
