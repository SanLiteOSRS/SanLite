import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ay")
	public static short[] field3517;
	@ObfuscatedName("ao")
	public static short[][] field3507;
	@ObfuscatedName("ag")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("PlayerComposition_cachedModels")
	static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("af")
	int[] field3522;
	@ObfuscatedName("an")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("aw")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1004049459
	)
	public int field3511;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1693987821
	)
	public int field3521;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2131733097
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 800274196296009541L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 1976929687773021041L
	)
	long field3514;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lgx;"
	)
	class179[] field3515;
	@ObfuscatedName("aa")
	boolean field3516;

	static {
		equipmentIndices = new int[]{class204.field2323.field2315, class204.field2324.field2315, class204.field2319.field2315, class204.field2321.field2315, class204.field2318.field2315, class204.field2322.field2315, class204.field2327.field2315}; // L: 30
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 33
	}

	public PlayerComposition() {
		this.field3511 = -1;
		this.field3521 = 0;
		this.field3516 = false;
	} // L: 35

	@ObfuscatedSignature(
		descriptor = "(Lmw;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3511 = -1; // L: 19
		this.field3521 = 0;
		this.field3516 = false; // L: 25
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 38
		int[] var3 = Arrays.copyOf(var1.field3522, var1.field3522.length); // L: 39
		class179[] var4 = (class179[])(var1.field3515 != null ? (class179[])Arrays.copyOf(var1.field3515, var1.field3515.length) : null); // L: 40
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length); // L: 41
		this.method6037(var3, var2, var4, false, var5, var1.field3521, var1.npcTransformId, var1.field3511); // L: 42
	} // L: 43

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgx;Z[IIIIB)V",
		garbageValue = "21"
	)
	public void method6037(int[] var1, int[] var2, class179[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3515 = var3; // L: 46
		this.field3516 = var4; // L: 47
		this.field3511 = var8; // L: 48
		this.method6038(var1, var2, var5, var6, var7); // L: 49
	} // L: 50

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "1564496359"
	)
	public void method6038(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 53
			var1 = this.method6046(var4); // L: 54
		}

		if (var2 == null) { // L: 56
			var2 = this.method6046(var4); // L: 57
		}

		this.field3522 = var1; // L: 59
		this.equipment = var2; // L: 60
		this.bodyColors = var3; // L: 61
		this.field3521 = var4; // L: 62
		this.npcTransformId = var5; // L: 63
		this.setHash(); // L: 64
	} // L: 65

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1564505092"
	)
	int[] method6046(int var1) {
		int[] var2 = new int[12]; // L: 68

		for (int var3 = 0; var3 < 7; ++var3) { // L: 69
			class163.method3462(var1, var2, var3); // L: 70
		}

		return var2; // L: 72
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1645926709"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || this.field3521 != 1) { // L: 86
			int var3 = this.equipment[equipmentIndices[var1]]; // L: 87
			if (var3 != 0) { // L: 88
				var3 -= 256; // L: 89

				KitDefinition var4;
				do {
					if (!var2) { // L: 91
						--var3; // L: 92
						if (var3 < 0) { // L: 93
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3; // L: 96
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0; // L: 97
						}
					}

					var4 = class100.KitDefinition_get(var3); // L: 99
				} while(var4 == null || var4.nonSelectable || var4.bodypartID != var1 + (this.field3521 == 1 ? 7 : 0)); // L: 100

				this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 102
				this.setHash(); // L: 103
			}
		}
	} // L: 104

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1999663188"
	)
	public void method6057(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 107
		if (!var2) { // L: 108
			do {
				--var3; // L: 110
				if (var3 < 0) { // L: 111
					var3 = field3507[var1].length - 1; // L: 112
				}
			} while(!ClanSettings.method3355(var1, var3)); // L: 114
		} else {
			do {
				++var3; // L: 119
				if (var3 >= field3507[var1].length) { // L: 120
					var3 = 0;
				}
			} while(!ClanSettings.method3355(var1, var3)); // L: 121
		}

		this.bodyColors[var1] = var3; // L: 124
		this.setHash(); // L: 125
	} // L: 126

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1411028779"
	)
	public void method6042(int var1) {
		if (this.field3521 != var1) { // L: 129
			this.method6038((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 130
		}
	} // L: 131

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "64"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3521); // L: 134

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 135
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 136
			if (var3 == 0) {
				var1.writeByte(-1); // L: 137
			} else {
				var1.writeByte(var3 - 256); // L: 138
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 140
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 141

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1418315210"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 144
		int var3 = this.equipment[5]; // L: 145
		int var4 = this.equipment[9]; // L: 146
		this.equipment[5] = var4; // L: 147
		this.equipment[9] = var3; // L: 148
		this.hash = 0L; // L: 149

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 150
			this.hash <<= 4; // L: 151
			if (this.equipment[var5] >= 256) { // L: 152
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 154
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 155
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 156
			this.hash <<= 3; // L: 157
			this.hash += (long)this.bodyColors[var5]; // L: 158
		}

		this.hash <<= 1; // L: 160
		this.hash += (long)(this.field3521 * 325591525) * 1693987821L; // L: 161
		this.equipment[5] = var3; // L: 162
		this.equipment[9] = var4; // L: 163
		if (var1 != 0L && this.hash != var1 || this.field3516) { // L: 164
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 165

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lha;ILha;IB)Lit;",
		garbageValue = "42"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 168
			return AbstractArchive.getNpcDefinition(this.npcTransformId).method3769(var1, var2, var3, var4, (class189)null); // L: 169
		} else {
			long var5 = this.hash; // L: 171
			int[] var7 = this.equipment; // L: 172
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 173
				var7 = new int[12]; // L: 174

				for (int var8 = 0; var8 < 12; ++var8) { // L: 175
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 176
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 177
					var7[5] = var1.shield; // L: 178
				}

				if (var1.weapon >= 0) { // L: 180
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 181
					var7[3] = var1.weapon; // L: 182
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 185
			if (var18 == null) { // L: 186
				boolean var9 = false; // L: 187

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 188
					var11 = var7[var10]; // L: 189
					if (var11 >= 256 && var11 < 512 && !class100.KitDefinition_get(var11 - 256).ready()) { // L: 190 191
						var9 = true;
					}

					if (var11 >= 512 && !HealthBarUpdate.ItemComposition_get(var11 - 512).method4039(this.field3521)) { // L: 193 194
						var9 = true;
					}
				}

				if (var9) { // L: 197
					if (-1L != this.field3514) { // L: 198
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3514);
					}

					if (var18 == null) { // L: 199
						return null;
					}
				}

				if (var18 == null) { // L: 201
					ModelData[] var19 = new ModelData[12]; // L: 202
					var11 = 0; // L: 203

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 204
						var13 = var7[var12]; // L: 205
						if (var13 >= 256 && var13 < 512) { // L: 206
							ModelData var14 = class100.KitDefinition_get(var13 - 256).getModelData(); // L: 207
							if (var14 != null) { // L: 208
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 210
							ItemComposition var22 = HealthBarUpdate.ItemComposition_get(var13 - 512); // L: 211
							ModelData var15 = var22.method4052(this.field3521); // L: 212
							if (var15 != null) { // L: 213
								if (this.field3515 != null) { // L: 214
									class179 var16 = this.field3515[var12]; // L: 215
									if (var16 != null) { // L: 216
										int var17;
										if (var16.field1899 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1899.length) { // L: 217
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 218
												var15.recolor(var22.recolorTo[var17], var16.field1899[var17]); // L: 219
											}
										}

										if (var16.field1898 != null && var22.retextureFrom != null && var16.field1898.length == var22.retextureTo.length) { // L: 222
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 223
												var15.retexture(var22.retextureTo[var17], var16.field1898[var17]); // L: 224
											}
										}
									}
								}

								var19[var11++] = var15; // L: 229
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 233

					for (var13 = 0; var13 < 5; ++var13) { // L: 234
						if (this.bodyColors[var13] < field3507[var13].length) { // L: 235
							var20.recolor(field3517[var13], field3507[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class437.field4707[var13].length) { // L: 236
							var20.recolor(WorldMapIcon_0.field2956[var13], class437.field4707[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 238
					PlayerComposition_cachedModels.put(var18, var5); // L: 239
					this.field3514 = var5; // L: 240
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 244
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) { // L: 245
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) { // L: 246
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4); // L: 247
			}

			return var21; // L: 248
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Liz;",
		garbageValue = "126"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 252
			return AbstractArchive.getNpcDefinition(this.npcTransformId).method3770((class189)null); // L: 253
		} else {
			boolean var1 = false; // L: 255

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 256
				var3 = this.equipment[var2]; // L: 257
				if (var3 >= 256 && var3 < 512 && !class100.KitDefinition_get(var3 - 256).method3689()) { // L: 258 259
					var1 = true;
				}

				if (var3 >= 512 && !HealthBarUpdate.ItemComposition_get(var3 - 512).method4041(this.field3521)) { // L: 261 262
					var1 = true;
				}
			}

			if (var1) { // L: 265
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 266
				var3 = 0; // L: 267

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 268
					var5 = this.equipment[var4]; // L: 269
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 270
						var6 = class100.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 271
						if (var6 != null) { // L: 272
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 274
						var6 = HealthBarUpdate.ItemComposition_get(var5 - 512).method4042(this.field3521); // L: 275
						if (var6 != null) { // L: 276
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 279

				for (var5 = 0; var5 < 5; ++var5) { // L: 280
					if (this.bodyColors[var5] < field3507[var5].length) { // L: 281
						var8.recolor(field3517[var5], field3507[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class437.field4707[var5].length) { // L: 282
						var8.recolor(WorldMapIcon_0.field2956[var5], class437.field4707[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 284
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "5890"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + AbstractArchive.getNpcDefinition(this.npcTransformId).id; // L: 288 289
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-469114674"
	)
	void method6068() {
		this.method6038(this.field3522, this.equipment, this.bodyColors, this.field3521, this.npcTransformId); // L: 293
	} // L: 294

	@ObfuscatedName("af")
	public static final void method6084(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "-35"
	)
	public static byte[] method6083(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		byte[] var2 = new byte[var1]; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 > 127) { // L: 13
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 14
			}
		}

		return var2; // L: 16
	}
}
