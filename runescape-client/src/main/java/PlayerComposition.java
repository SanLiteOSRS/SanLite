import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ai")
	public static short[] field3682;
	@ObfuscatedName("ar")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("PlayerComposition_cachedModels")
	public static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	public static class443 field3691;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2112554485
	)
	public static int field3688;
	@ObfuscatedName("az")
	int[] field3695;
	@ObfuscatedName("ah")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("af")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1320896867
	)
	public int field3685;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1990618721
	)
	public int field3686;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -196311875
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 2846450048819873737L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -4831100458946757933L
	)
	long field3689;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lhv;"
	)
	class187[] field3690;
	@ObfuscatedName("al")
	boolean field3687;

	static {
		equipmentIndices = new int[]{class225.field2404.field2415, class225.field2407.field2415, class225.field2409.field2415, class225.field2401.field2415, class225.field2410.field2415, class225.field2408.field2415, class225.field2411.field2415}; // L: 32
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 35
		field3691 = new class443(16, class441.field4748); // L: 36
		field3688 = 0; // L: 37
	}

	public PlayerComposition() {
		this.field3685 = -1;
		this.field3686 = 0;
		this.field3687 = false;
	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Lnq;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3685 = -1; // L: 21
		this.field3686 = 0; // L: 22
		this.field3687 = false; // L: 27
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 42
		int[] var3 = Arrays.copyOf(var1.field3695, var1.field3695.length); // L: 43
		class187[] var4 = (class187[])(var1.field3690 != null ? (class187[])Arrays.copyOf(var1.field3690, var1.field3690.length) : null); // L: 44
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length); // L: 45
		this.method6321(var3, var2, var4, false, var5, var1.field3686, var1.npcTransformId, var1.field3685); // L: 46
	} // L: 47

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lhv;Z[IIIII)V",
		garbageValue = "1919445139"
	)
	public void method6321(int[] var1, int[] var2, class187[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3690 = var3; // L: 50
		this.field3687 = var4; // L: 51
		this.field3685 = var8; // L: 52
		this.method6322(var1, var2, var5, var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "-127"
	)
	public void method6322(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 57
			var1 = this.method6327(var4); // L: 58
		}

		if (var2 == null) { // L: 60
			var2 = this.method6327(var4); // L: 61
		}

		this.field3695 = var1; // L: 63
		this.equipment = var2; // L: 64
		this.bodyColors = var3; // L: 65
		this.field3686 = var4; // L: 66
		this.npcTransformId = var5; // L: 67
		this.setHash(); // L: 68
	} // L: 69

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "0"
	)
	int[] method6327(int var1) {
		int[] var2 = new int[12]; // L: 72

		for (int var3 = 0; var3 < 7; ++var3) { // L: 73
			HitSplatDefinition.method4073(var1, var2, var3); // L: 74
		}

		return var2; // L: 76
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-14"
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
					if (var3 < 0) {
						var3 = class12.field56 - 1; // L: 96
					}
				} else {
					++var3; // L: 99
					if (var3 >= class12.field56) { // L: 100
						var3 = 0;
					}
				}

				var4 = class195.KitDefinition_get(var3); // L: 102
			} while(var4 == null || var4.nonSelectable || var1 + (this.field3686 == 1 ? 7 : 0) != var4.bodypartID); // L: 103

			this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 105
			this.setHash(); // L: 106
		}
	} // L: 107

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "2063718045"
	)
	public void method6325(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 110
		boolean var4;
		if (!var2) { // L: 111
			do {
				--var3; // L: 113
				if (var3 < 0) { // L: 114
					var3 = UrlRequester.field1454[var1].length - 1; // L: 115
				}

				if (var1 == 4 && var3 >= 8) { // L: 119
					var4 = false; // L: 120
				} else {
					var4 = true; // L: 123
				}
			} while(!var4); // L: 125
		} else {
			do {
				++var3; // L: 130
				if (var3 >= UrlRequester.field1454[var1].length) { // L: 131
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) { // L: 134
					var4 = false; // L: 135
				} else {
					var4 = true; // L: 138
				}
			} while(!var4); // L: 140
		}

		this.bodyColors[var1] = var3; // L: 143
		this.setHash(); // L: 144
	} // L: 145

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "880079772"
	)
	public void method6326(int var1) {
		if (this.field3686 != var1) { // L: 148
			this.method6322((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 149
		}
	} // L: 150

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "65"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3686); // L: 153

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 154
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 155
			if (var3 == 0) {
				var1.writeByte(-1); // L: 156
			} else {
				var1.writeByte(var3 - 256); // L: 157
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 159
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 160

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1818181200"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 163
		int var3 = this.equipment[5]; // L: 164
		int var4 = this.equipment[9]; // L: 165
		this.equipment[5] = var4; // L: 166
		this.equipment[9] = var3; // L: 167
		this.hash = 0L; // L: 168

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 169
			this.hash <<= 4; // L: 170
			if (this.equipment[var5] >= 256) { // L: 171
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 173
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 174
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 175
			this.hash <<= 3; // L: 176
			this.hash += (long)this.bodyColors[var5]; // L: 177
		}

		this.hash <<= 1; // L: 179
		this.hash += (long)(this.field3686 * 1435153825) * 1990618721L; // L: 180
		this.equipment[5] = var3; // L: 181
		this.equipment[9] = var4; // L: 182
		if (var1 != 0L && var1 != this.hash || this.field3687) { // L: 183
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 184

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lig;ILig;II)Ljn;",
		garbageValue = "1553363278"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 187
			return UserComparator10.getNpcDefinition(this.npcTransformId).method3866(var1, var2, var3, var4, (class206)null); // L: 188
		} else {
			long var5 = this.hash; // L: 190
			int[] var7 = this.equipment; // L: 191
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 192
				var7 = new int[12]; // L: 193

				for (int var8 = 0; var8 < 12; ++var8) { // L: 194
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 195
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 196
					var7[5] = var1.shield; // L: 197
				}

				if (var1.weapon >= 0) { // L: 199
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 200
					var7[3] = var1.weapon; // L: 201
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 204
			if (var18 == null) { // L: 205
				boolean var9 = false; // L: 206

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 207
					var11 = var7[var10]; // L: 208
					if (var11 >= 256 && var11 < 512) { // L: 209
						KitDefinition var20 = class195.KitDefinition_get(var11 - 256); // L: 210
						if (var20 != null && !var20.ready()) { // L: 211
							var9 = true;
						}
					}

					if (var11 >= 512 && !class10.ItemComposition_get(var11 - 512).method4141(this.field3686)) { // L: 213 214
						var9 = true;
					}
				}

				if (var9) { // L: 217
					if (-1L != this.field3689) { // L: 218
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3689);
					}

					if (var18 == null) { // L: 219
						return null;
					}
				}

				if (var18 == null) { // L: 221
					ModelData[] var19 = new ModelData[12]; // L: 222
					var11 = 0; // L: 223

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 224
						var13 = var7[var12]; // L: 225
						ModelData var15;
						if (var13 >= 256 && var13 < 512) { // L: 226
							KitDefinition var14 = class195.KitDefinition_get(var13 - 256); // L: 227
							var15 = null; // L: 228
							if (var14 != null) { // L: 229
								var15 = var14.getModelData();
							}

							if (var15 != null) { // L: 230
								var19[var11++] = var15;
							}
						}

						if (var13 >= 512) { // L: 232
							ItemComposition var22 = class10.ItemComposition_get(var13 - 512); // L: 233
							var15 = var22.method4142(this.field3686); // L: 234
							if (var15 != null) { // L: 235
								if (this.field3690 != null) { // L: 236
									class187 var16 = this.field3690[var12]; // L: 237
									if (var16 != null) { // L: 238
										int var17;
										if (var16.field1959 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1959.length) { // L: 239
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 240
												var15.recolor(var22.recolorTo[var17], var16.field1959[var17]); // L: 241
											}
										}

										if (var16.field1961 != null && var22.retextureFrom != null && var16.field1961.length == var22.retextureTo.length) { // L: 244
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 245
												var15.retexture(var22.retextureTo[var17], var16.field1961[var17]); // L: 246
											}
										}
									}
								}

								var19[var11++] = var15; // L: 251
							}
						}
					}

					ModelData var23 = new ModelData(var19, var11); // L: 255

					for (var13 = 0; var13 < 5; ++var13) { // L: 256
						if (this.bodyColors[var13] < UrlRequester.field1454[var13].length) { // L: 257
							var23.recolor(class172.field1858[var13], UrlRequester.field1454[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class1.field6[var13].length) { // L: 258
							var23.recolor(field3682[var13], class1.field6[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var23.toModel(64, 850, -30, -50, -30); // L: 260
					PlayerComposition_cachedModels.put(var18, var5); // L: 261
					this.field3689 = var5; // L: 262
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 266
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) { // L: 267
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) { // L: 268
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4); // L: 269
			}

			return var21; // L: 270
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljj;",
		garbageValue = "-2059098099"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 274
			return UserComparator10.getNpcDefinition(this.npcTransformId).method3864((class206)null); // L: 275
		} else {
			boolean var1 = false; // L: 277

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 278
				var3 = this.equipment[var2]; // L: 279
				if (var3 >= 256 && var3 < 512) { // L: 280
					KitDefinition var9 = class195.KitDefinition_get(var3 - 256); // L: 281
					if (var9 != null && !var9.method3780()) { // L: 282
						var1 = true;
					}
				}

				if (var3 >= 512 && !class10.ItemComposition_get(var3 - 512).method4143(this.field3686)) { // L: 284 285
					var1 = true;
				}
			}

			if (var1) { // L: 288
				return null;
			} else {
				ModelData[] var8 = new ModelData[12]; // L: 289
				var3 = 0; // L: 290

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 291
					var5 = this.equipment[var4]; // L: 292
					if (var5 >= 256 && var5 < 512) { // L: 293
						KitDefinition var6 = class195.KitDefinition_get(var5 - 256); // L: 294
						ModelData var7 = null; // L: 295
						if (var6 != null) { // L: 296
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) { // L: 297
							var8[var3++] = var7;
						}
					}

					if (var5 >= 512) { // L: 299
						ModelData var10 = class10.ItemComposition_get(var5 - 512).method4162(this.field3686); // L: 300
						if (var10 != null) { // L: 301
							var8[var3++] = var10;
						}
					}
				}

				ModelData var11 = new ModelData(var8, var3); // L: 304

				for (var5 = 0; var5 < 5; ++var5) { // L: 305
					if (this.bodyColors[var5] < UrlRequester.field1454[var5].length) { // L: 306
						var11.recolor(class172.field1858[var5], UrlRequester.field1454[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class1.field6[var5].length) { // L: 307
						var11.recolor(field3682[var5], class1.field6[var5][this.bodyColors[var5]]);
					}
				}

				return var11; // L: 309
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1594754470"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash; // L: 313
		if (this.npcTransformId != -1) { // L: 314
			var1 = -65536L | (long)this.npcTransformId; // L: 315
		}

		Integer var3 = (Integer)field3691.method8015(var1); // L: 317
		if (var3 == null) { // L: 318
			var3 = ++field3688 - 1; // L: 319
			field3691.method8008(var1, var3); // L: 320
			field3688 %= 65535; // L: 321
		}

		return var3; // L: 323
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-561820634"
	)
	void method6332() {
		this.method6322(this.field3695, this.equipment, this.bodyColors, this.field3686, this.npcTransformId); // L: 327
	} // L: 328
}
