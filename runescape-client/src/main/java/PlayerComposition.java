import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("an")
	public static short[][] field3646;
	@ObfuscatedName("ad")
	public static short[] field3648;
	@ObfuscatedName("aw")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("PlayerComposition_cachedModels")
	static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("archive10")
	static class439 archive10;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -177001297
	)
	static int field3652;
	@ObfuscatedName("am")
	int[] field3643;
	@ObfuscatedName("ap")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("af")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1371357529
	)
	public int field3639;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2080622051
	)
	public int field3640;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1192849673
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -5117144179831570855L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 300192240701935017L
	)
	long field3647;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	class168[] field3644;
	@ObfuscatedName("aa")
	boolean field3645;

	static {
		equipmentIndices = new int[]{class205.field2255.field2259, class205.field2257.field2259, class205.field2251.field2259, class205.field2253.field2259, class205.field2261.field2259, class205.field2254.field2259, class205.field2256.field2259}; // L: 32
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 35
		archive10 = new class439(16, class437.field4677); // L: 36
		field3652 = 0; // L: 37
	}

	public PlayerComposition() {
		this.field3639 = -1;
		this.field3640 = 0;
		this.field3645 = false;
	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Lnz;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3639 = -1; // L: 21
		this.field3640 = 0; // L: 22
		this.field3645 = false; // L: 27
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 42
		int[] var3 = Arrays.copyOf(var1.field3643, var1.field3643.length); // L: 43
		class168[] var4 = (class168[])(var1.field3644 != null ? (class168[])Arrays.copyOf(var1.field3644, var1.field3644.length) : null); // L: 44
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length); // L: 45
		this.method6372(var3, var2, var4, false, var5, var1.field3640, var1.npcTransformId, var1.field3639); // L: 46
	} // L: 47

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgb;Z[IIIII)V",
		garbageValue = "629052239"
	)
	public void method6372(int[] var1, int[] var2, class168[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3644 = var3; // L: 50
		this.field3645 = var4; // L: 51
		this.field3639 = var8; // L: 52
		this.method6373(var1, var2, var5, var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "-2050509235"
	)
	public void method6373(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 57
			var1 = this.method6374(var4); // L: 58
		}

		if (var2 == null) { // L: 60
			var2 = this.method6374(var4); // L: 61
		}

		this.field3643 = var1; // L: 63
		this.equipment = var2; // L: 64
		this.bodyColors = var3; // L: 65
		this.field3640 = var4; // L: 66
		this.npcTransformId = var5; // L: 67
		this.setHash(); // L: 68
	} // L: 69

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1941026920"
	)
	int[] method6374(int var1) {
		int[] var2 = new int[12]; // L: 72

		for (int var3 = 0; var3 < 7; ++var3) { // L: 73
			for (int var4 = 0; var4 < KitDefinition.field1871; ++var4) { // L: 75
				KitDefinition var5 = PlayerType.KitDefinition_get(var4); // L: 76
				if (var5 != null && !var5.nonSelectable && (var1 == 1 ? 7 : 0) + var3 == var5.bodypartID) { // L: 77
					var2[equipmentIndices[var3]] = var4 + 256; // L: 78
					break; // L: 79
				}
			}
		}

		return var2; // L: 84
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-914027039"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[equipmentIndices[var1]]; // L: 88
		if (var3 != 0) { // L: 89
			var3 -= 256; // L: 90

			KitDefinition var4;
			do {
				if (!var2) { // L: 92
					--var3; // L: 93
					if (var3 < 0) {
						var3 = KitDefinition.field1871 - 1; // L: 94
					}
				} else {
					++var3; // L: 97
					if (var3 >= KitDefinition.field1871) { // L: 98
						var3 = 0;
					}
				}

				var4 = PlayerType.KitDefinition_get(var3); // L: 100
			} while(var4 == null || var4.nonSelectable || (this.field3640 == 1 ? 7 : 0) + var1 != var4.bodypartID); // L: 101

			this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 103
			this.setHash(); // L: 104
		}
	} // L: 105

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "751474737"
	)
	public void method6388(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 108
		if (!var2) { // L: 109
			do {
				--var3; // L: 111
				if (var3 < 0) { // L: 112
					var3 = field3646[var1].length - 1; // L: 113
				}
			} while(!VarcInt.method3635(var1, var3)); // L: 115
		} else {
			do {
				++var3; // L: 120
				if (var3 >= field3646[var1].length) { // L: 121
					var3 = 0;
				}
			} while(!VarcInt.method3635(var1, var3)); // L: 122
		}

		this.bodyColors[var1] = var3; // L: 125
		this.setHash(); // L: 126
	} // L: 127

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "424550326"
	)
	public void method6386(int var1) {
		if (this.field3640 != var1) { // L: 130
			this.method6373((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 131
		}
	} // L: 132

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "-18"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3640); // L: 135

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 136
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 137
			if (var3 == 0) {
				var1.writeByte(-1); // L: 138
			} else {
				var1.writeByte(var3 - 256); // L: 139
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 141
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 142

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1718369552"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 145
		int var3 = this.equipment[5]; // L: 146
		int var4 = this.equipment[9]; // L: 147
		this.equipment[5] = var4; // L: 148
		this.equipment[9] = var3; // L: 149
		this.hash = 0L; // L: 150

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 151
			this.hash <<= 4; // L: 152
			if (this.equipment[var5] >= 256) { // L: 153
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 155
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 156
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 157
			this.hash <<= 3; // L: 158
			this.hash += (long)this.bodyColors[var5]; // L: 159
		}

		this.hash <<= 1; // L: 161
		this.hash += 2080622051L * (long)(this.field3640 * -1386633269); // L: 162
		this.equipment[5] = var3; // L: 163
		this.equipment[9] = var4; // L: 164
		if (0L != var1 && var1 != this.hash || this.field3645) { // L: 165
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 166

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lhl;ILhl;IB)Lko;",
		garbageValue = "-50"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 169
			return Script.getNpcDefinition(this.npcTransformId).method3741(var1, var2, var3, var4, (class187)null); // L: 170
		} else {
			long var5 = this.hash; // L: 172
			int[] var7 = this.equipment; // L: 173
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 174
				var7 = new int[12]; // L: 175

				for (int var8 = 0; var8 < 12; ++var8) { // L: 176
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 177
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 178
					var7[5] = var1.shield; // L: 179
				}

				if (var1.weapon >= 0) { // L: 181
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 182
					var7[3] = var1.weapon; // L: 183
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 186
			if (var18 == null) { // L: 187
				boolean var9 = false; // L: 188

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 189
					var11 = var7[var10]; // L: 190
					if (var11 >= 256 && var11 < 512 && !PlayerType.KitDefinition_get(var11 - 256).ready()) { // L: 191 192
						var9 = true;
					}

					if (var11 >= 512 && !class341.ItemComposition_get(var11 - 512).method3994(this.field3640)) { // L: 194 195
						var9 = true;
					}
				}

				if (var9) { // L: 198
					if (-1L != this.field3647) { // L: 199
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3647);
					}

					if (var18 == null) { // L: 200
						return null;
					}
				}

				if (var18 == null) { // L: 202
					ModelData[] var19 = new ModelData[12]; // L: 203
					var11 = 0; // L: 204

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 205
						var13 = var7[var12]; // L: 206
						if (var13 >= 256 && var13 < 512) { // L: 207
							ModelData var14 = PlayerType.KitDefinition_get(var13 - 256).getModelData(); // L: 208
							if (var14 != null) { // L: 209
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 211
							ItemComposition var22 = class341.ItemComposition_get(var13 - 512); // L: 212
							ModelData var15 = var22.method3989(this.field3640); // L: 213
							if (var15 != null) { // L: 214
								if (this.field3644 != null) { // L: 215
									class168 var16 = this.field3644[var12]; // L: 216
									if (var16 != null) { // L: 217
										int var17;
										if (var16.field1796 != null && var22.recolorFrom != null && var16.field1796.length == var22.recolorTo.length) { // L: 218
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 219
												var15.recolor(var22.recolorTo[var17], var16.field1796[var17]); // L: 220
											}
										}

										if (var16.field1794 != null && var22.retextureFrom != null && var16.field1794.length == var22.retextureTo.length) { // L: 223
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 224
												var15.retexture(var22.retextureTo[var17], var16.field1794[var17]); // L: 225
											}
										}
									}
								}

								var19[var11++] = var15; // L: 230
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 234

					for (var13 = 0; var13 < 5; ++var13) { // L: 235
						if (this.bodyColors[var13] < field3646[var13].length) { // L: 236
							var20.recolor(class539.field5245[var13], field3646[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < DevicePcmPlayerProvider.field113[var13].length) { // L: 237
							var20.recolor(field3648[var13], DevicePcmPlayerProvider.field113[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 239
					PlayerComposition_cachedModels.put(var18, var5); // L: 240
					this.field3647 = var5; // L: 241
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 245
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) { // L: 246
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) { // L: 247
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4); // L: 248
			}

			return var21; // L: 249
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lkm;",
		garbageValue = "1938215856"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 253
			return Script.getNpcDefinition(this.npcTransformId).method3720((class187)null); // L: 254
		} else {
			boolean var1 = false; // L: 256

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 257
				var3 = this.equipment[var2]; // L: 258
				if (var3 >= 256 && var3 < 512 && !PlayerType.KitDefinition_get(var3 - 256).method3665()) { // L: 259 260
					var1 = true;
				}

				if (var3 >= 512 && !class341.ItemComposition_get(var3 - 512).method4018(this.field3640)) { // L: 262 263
					var1 = true;
				}
			}

			if (var1) { // L: 266
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 267
				var3 = 0; // L: 268

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 269
					var5 = this.equipment[var4]; // L: 270
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 271
						var6 = PlayerType.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 272
						if (var6 != null) { // L: 273
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 275
						var6 = class341.ItemComposition_get(var5 - 512).method3997(this.field3640); // L: 276
						if (var6 != null) { // L: 277
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 280

				for (var5 = 0; var5 < 5; ++var5) { // L: 281
					if (this.bodyColors[var5] < field3646[var5].length) { // L: 282
						var8.recolor(class539.field5245[var5], field3646[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < DevicePcmPlayerProvider.field113[var5].length) { // L: 283
						var8.recolor(field3648[var5], DevicePcmPlayerProvider.field113[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 285
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2102105717"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash; // L: 289
		if (this.npcTransformId != -1) { // L: 290
			var1 = -65536L | (long)this.npcTransformId; // L: 291
		}

		Integer var3 = (Integer)archive10.method8139(var1); // L: 293
		if (var3 == null) { // L: 294
			var3 = ++field3652 - 1; // L: 295
			archive10.method8146(var1, var3); // L: 296
			field3652 %= 65535; // L: 297
		}

		return var3; // L: 299
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1817630974"
	)
	void method6383() {
		this.method6373(this.field3643, this.equipment, this.bodyColors, this.field3640, this.npcTransformId); // L: 303
	} // L: 304

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-538084723"
	)
	public static void method6414() {
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 450
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 451
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 452
	} // L: 453
}
