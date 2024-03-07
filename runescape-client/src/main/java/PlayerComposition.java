import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("aj")
	public static short[] field3671;
	@ObfuscatedName("ax")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("PlayerComposition_cachedModels")
	public static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	public static class442 field3674;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -381449419
	)
	public static int field3661;
	@ObfuscatedName("aq")
	int[] field3666;
	@ObfuscatedName("aw")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("al")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1835423421
	)
	public int field3664;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1283608831
	)
	public int field3665;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1636819905
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 418701774932304743L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 3006434584733454555L
	)
	long field3675;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lgj;"
	)
	class170[] field3669;
	@ObfuscatedName("au")
	boolean field3670;

	static {
		equipmentIndices = new int[]{class207.field2283.field2289, class207.field2280.field2289, class207.field2279.field2289, class207.field2287.field2289, class207.field2284.field2289, class207.field2281.field2289, class207.field2285.field2289}; // L: 32
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 35
		field3674 = new class442(16, class440.field4712); // L: 36
		field3661 = 0; // L: 37
	}

	public PlayerComposition() {
		this.field3664 = -1;
		this.field3665 = 0;
		this.field3670 = false;
	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3664 = -1; // L: 21
		this.field3665 = 0; // L: 22
		this.field3670 = false; // L: 27
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 42
		int[] var3 = Arrays.copyOf(var1.field3666, var1.field3666.length); // L: 43
		class170[] var4 = (class170[])(var1.field3669 != null ? (class170[])Arrays.copyOf(var1.field3669, var1.field3669.length) : null); // L: 44
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length); // L: 45
		this.method6467(var3, var2, var4, false, var5, var1.field3665, var1.npcTransformId, var1.field3664); // L: 46
	} // L: 47

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgj;Z[IIIII)V",
		garbageValue = "-1147007725"
	)
	public void method6467(int[] var1, int[] var2, class170[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3669 = var3; // L: 50
		this.field3670 = var4; // L: 51
		this.field3664 = var8; // L: 52
		this.method6468(var1, var2, var5, var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "366816373"
	)
	public void method6468(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 57
			var1 = this.method6492(var4); // L: 58
		}

		if (var2 == null) { // L: 60
			var2 = this.method6492(var4); // L: 61
		}

		this.field3666 = var1; // L: 63
		this.equipment = var2; // L: 64
		this.bodyColors = var3; // L: 65
		this.field3665 = var4; // L: 66
		this.npcTransformId = var5; // L: 67
		this.setHash(); // L: 68
	} // L: 69

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1738741900"
	)
	int[] method6492(int var1) {
		int[] var2 = new int[12]; // L: 72

		for (int var3 = 0; var3 < 7; ++var3) { // L: 73
			class175.method3548(var1, var2, var3); // L: 74
		}

		return var2; // L: 76
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-2140190800"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[equipmentIndices[var1]]; // L: 90
		if (var3 != 0) { // L: 91
			var3 -= 256; // L: 92

			KitDefinition var4;
			do {
				if (!var2) { // L: 94
					--var3; // L: 95
					if (var3 < 0) { // L: 96
						var3 = KitDefinition.field1894 - 1;
					}
				} else {
					++var3; // L: 99
					if (var3 >= KitDefinition.field1894) { // L: 100
						var3 = 0;
					}
				}

				var4 = GrandExchangeOfferWorldComparator.KitDefinition_get(var3); // L: 102
			} while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.field3665 == 1 ? 7 : 0) + var1); // L: 103

			this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 105
			this.setHash(); // L: 106
		}
	} // L: 107

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1917247523"
	)
	public void method6471(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 110
		if (!var2) { // L: 111
			do {
				--var3; // L: 113
				if (var3 < 0) { // L: 114
					var3 = class407.field4547[var1].length - 1; // L: 115
				}
			} while(!class160.method3419(var1, var3)); // L: 117
		} else {
			do {
				++var3; // L: 122
				if (var3 >= class407.field4547[var1].length) { // L: 123
					var3 = 0;
				}
			} while(!class160.method3419(var1, var3)); // L: 124
		}

		this.bodyColors[var1] = var3; // L: 127
		this.setHash(); // L: 128
	} // L: 129

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	public void method6493(int var1) {
		if (this.field3665 != var1) { // L: 132
			this.method6468((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 133
		}
	} // L: 134

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-2017235297"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3665); // L: 137

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 138
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 139
			if (var3 == 0) {
				var1.writeByte(-1); // L: 140
			} else {
				var1.writeByte(var3 - 256); // L: 141
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 143
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 144

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1192088733"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 147
		int var3 = this.equipment[5]; // L: 148
		int var4 = this.equipment[9]; // L: 149
		this.equipment[5] = var4; // L: 150
		this.equipment[9] = var3; // L: 151
		this.hash = 0L; // L: 152

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 153
			this.hash <<= 4; // L: 154
			if (this.equipment[var5] >= 256) { // L: 155
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 157
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 158
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 159
			this.hash <<= 3; // L: 160
			this.hash += (long)this.bodyColors[var5]; // L: 161
		}

		this.hash <<= 1; // L: 163
		this.hash += 1283608831L * (long)(this.field3665 * 1692184319); // L: 164
		this.equipment[5] = var3; // L: 165
		this.equipment[9] = var4; // L: 166
		if (0L != var1 && this.hash != var1 || this.field3670) { // L: 167
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 168

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhs;ILhs;IB)Lkz;",
		garbageValue = "-19"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 171
			return VarcInt.getNpcDefinition(this.npcTransformId).method3701(var1, var2, var3, var4, (class188)null); // L: 172
		} else {
			long var5 = this.hash; // L: 174
			int[] var7 = this.equipment; // L: 175
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 176
				var7 = new int[12]; // L: 177

				for (int var8 = 0; var8 < 12; ++var8) { // L: 178
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 179
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 180
					var7[5] = var1.shield; // L: 181
				}

				if (var1.weapon >= 0) { // L: 183
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 184
					var7[3] = var1.weapon; // L: 185
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 188
			if (var18 == null) { // L: 189
				boolean var9 = false; // L: 190

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 191
					var11 = var7[var10]; // L: 192
					if (var11 >= 256 && var11 < 512) { // L: 193
						KitDefinition var20 = GrandExchangeOfferWorldComparator.KitDefinition_get(var11 - 256); // L: 194
						if (var20 != null && !var20.ready()) { // L: 195
							var9 = true;
						}
					}

					if (var11 >= 512 && !ArchiveDiskActionHandler.ItemComposition_get(var11 - 512).method3976(this.field3665)) { // L: 197 198
						var9 = true;
					}
				}

				if (var9) { // L: 201
					if (-1L != this.field3675) { // L: 202
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3675);
					}

					if (var18 == null) { // L: 203
						return null;
					}
				}

				if (var18 == null) { // L: 205
					ModelData[] var19 = new ModelData[12]; // L: 206
					var11 = 0; // L: 207

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 208
						var13 = var7[var12]; // L: 209
						ModelData var15;
						if (var13 >= 256 && var13 < 512) { // L: 210
							KitDefinition var14 = GrandExchangeOfferWorldComparator.KitDefinition_get(var13 - 256); // L: 211
							var15 = null; // L: 212
							if (var14 != null) { // L: 213
								var15 = var14.getModelData();
							}

							if (var15 != null) { // L: 214
								var19[var11++] = var15;
							}
						}

						if (var13 >= 512) { // L: 216
							ItemComposition var22 = ArchiveDiskActionHandler.ItemComposition_get(var13 - 512); // L: 217
							var15 = var22.method3977(this.field3665); // L: 218
							if (var15 != null) { // L: 219
								if (this.field3669 != null) { // L: 220
									class170 var16 = this.field3669[var12]; // L: 221
									if (var16 != null) { // L: 222
										int var17;
										if (var16.field1834 != null && var22.recolorFrom != null && var16.field1834.length == var22.recolorTo.length) { // L: 223
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 224
												var15.recolor(var22.recolorTo[var17], var16.field1834[var17]); // L: 225
											}
										}

										if (var16.field1835 != null && var22.retextureFrom != null && var22.retextureTo.length == var16.field1835.length) { // L: 228
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 229
												var15.retexture(var22.retextureTo[var17], var16.field1835[var17]); // L: 230
											}
										}
									}
								}

								var19[var11++] = var15; // L: 235
							}
						}
					}

					ModelData var23 = new ModelData(var19, var11); // L: 239

					for (var13 = 0; var13 < 5; ++var13) { // L: 240
						if (this.bodyColors[var13] < class407.field4547[var13].length) { // L: 241
							var23.recolor(Messages.field1422[var13], class407.field4547[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class143.field1665[var13].length) {
							var23.recolor(field3671[var13], class143.field1665[var13][this.bodyColors[var13]]); // L: 242
						}
					}

					var18 = var23.toModel(64, 850, -30, -50, -30); // L: 244
					PlayerComposition_cachedModels.put(var18, var5); // L: 245
					this.field3675 = var5; // L: 246
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 250
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) { // L: 251
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) { // L: 252
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4); // L: 253
			}

			return var21; // L: 254
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lkf;",
		garbageValue = "-27"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 258
			return VarcInt.getNpcDefinition(this.npcTransformId).method3702((class188)null); // L: 259
		} else {
			boolean var1 = false; // L: 261

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 262
				var3 = this.equipment[var2]; // L: 263
				if (var3 >= 256 && var3 < 512) { // L: 264
					KitDefinition var9 = GrandExchangeOfferWorldComparator.KitDefinition_get(var3 - 256); // L: 265
					if (var9 != null && !var9.method3612()) { // L: 266
						var1 = true;
					}
				}

				if (var3 >= 512 && !ArchiveDiskActionHandler.ItemComposition_get(var3 - 512).method3978(this.field3665)) { // L: 268 269
					var1 = true;
				}
			}

			if (var1) { // L: 272
				return null;
			} else {
				ModelData[] var8 = new ModelData[12]; // L: 273
				var3 = 0; // L: 274

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 275
					var5 = this.equipment[var4]; // L: 276
					if (var5 >= 256 && var5 < 512) { // L: 277
						KitDefinition var6 = GrandExchangeOfferWorldComparator.KitDefinition_get(var5 - 256); // L: 278
						ModelData var7 = null; // L: 279
						if (var6 != null) { // L: 280
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) { // L: 281
							var8[var3++] = var7;
						}
					}

					if (var5 >= 512) { // L: 283
						ModelData var10 = ArchiveDiskActionHandler.ItemComposition_get(var5 - 512).method4023(this.field3665); // L: 284
						if (var10 != null) { // L: 285
							var8[var3++] = var10;
						}
					}
				}

				ModelData var11 = new ModelData(var8, var3); // L: 288

				for (var5 = 0; var5 < 5; ++var5) { // L: 289
					if (this.bodyColors[var5] < class407.field4547[var5].length) { // L: 290
						var11.recolor(Messages.field1422[var5], class407.field4547[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class143.field1665[var5].length) { // L: 291
						var11.recolor(field3671[var5], class143.field1665[var5][this.bodyColors[var5]]);
					}
				}

				return var11; // L: 293
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "906284880"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash; // L: 297
		if (this.npcTransformId != -1) { // L: 298
			var1 = -65536L | (long)this.npcTransformId; // L: 299
		}

		Integer var3 = (Integer)field3674.method8198(var1); // L: 301
		if (var3 == null) { // L: 302
			var3 = ++field3661 - 1; // L: 303
			field3674.method8201(var1, var3); // L: 304
			field3661 %= 65535; // L: 305
		}

		return var3; // L: 307
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-33"
	)
	void method6477() {
		this.method6468(this.field3666, this.equipment, this.bodyColors, this.field3665, this.npcTransformId); // L: 311
	} // L: 312
}
