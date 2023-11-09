import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("n")
	public static short[][] field3339;
	@ObfuscatedName("x")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("PlayerComposition_cachedModels")
	public static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("o")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("q")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("f")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1435368141
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -8544801709963043315L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = -7138290277261142387L
	)
	long field3336;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "[Lfy;"
	)
	class167[] field3338;
	@ObfuscatedName("j")
	boolean field3334;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10}; // L: 26
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 27
	}

	public PlayerComposition() {
		this.field3334 = false; // L: 21
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([I[Lfy;Z[IZII)V",
		garbageValue = "997871682"
	)
	public void method5572(int[] var1, class167[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field3338 = var2; // L: 30
		this.field3334 = var3; // L: 31
		this.update(var1, var4, var5, var6); // L: 32
	} // L: 33

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "-734595682"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) { // L: 36
			var1 = new int[12]; // L: 37

			for (int var5 = 0; var5 < 7; ++var5) { // L: 38
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) { // L: 39
					KitDefinition var7 = RouteStrategy.KitDefinition_get(var6); // L: 40
					if (var7 != null && !var7.nonSelectable && var7.bodypartID == (var3 ? 7 : 0) + var5) { // L: 41
						var1[equipmentIndices[var5]] = var6 + 256; // L: 42
						break;
					}
				}
			}
		}

		this.equipment = var1;
		this.bodyColors = var2;
		this.isFemale = var3;
		this.npcTransformId = var4;
		this.setHash();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-602706500"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) {
			int var3 = this.equipment[equipmentIndices[var1]];
			if (var3 != 0) {
				var3 -= 256;

				KitDefinition var4;
				do {
					if (!var2) { // L: 61
						--var3; // L: 62
						if (var3 < 0) {
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3;
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0;
						}
					}

					var4 = RouteStrategy.KitDefinition_get(var3); // L: 69
				} while(var4 == null || var4.nonSelectable || var1 + (this.isFemale ? 7 : 0) != var4.bodypartID);

				this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 72
				this.setHash(); // L: 73
			}
		}
	} // L: 74

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-155720375"
	)
	public void method5584(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 77
		if (!var2) { // L: 78
			do {
				--var3; // L: 80
				if (var3 < 0) { // L: 81
					var3 = DynamicObject.field986[var1].length - 1; // L: 82
				}
			} while(!DecorativeObject.method4513(var1, var3)); // L: 84
		} else {
			do {
				++var3; // L: 89
				if (var3 >= DynamicObject.field986[var1].length) { // L: 90
					var3 = 0;
				}
			} while(!DecorativeObject.method4513(var1, var3)); // L: 91
		}

		this.bodyColors[var1] = var3; // L: 94
		this.setHash(); // L: 95
	} // L: 96

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1856619688"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) { // L: 99
			this.update((int[])null, this.bodyColors, var1, -1); // L: 100
		}
	} // L: 101

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "36892514"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0); // L: 104

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 105
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 106
			if (var3 == 0) { // L: 107
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256); // L: 108
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 110
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 111

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1189784957"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 114
		int var3 = this.equipment[5]; // L: 115
		int var4 = this.equipment[9]; // L: 116
		this.equipment[5] = var4; // L: 117
		this.equipment[9] = var3; // L: 118
		this.hash = 0L; // L: 119

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 120
			this.hash <<= 4; // L: 121
			if (this.equipment[var5] >= 256) { // L: 122
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 124
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 125
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 126
			this.hash <<= 3; // L: 127
			this.hash += (long)this.bodyColors[var5]; // L: 128
		}

		this.hash <<= 1; // L: 130
		this.hash += (long)(this.isFemale ? 1 : 0); // L: 131
		this.equipment[5] = var3; // L: 132
		this.equipment[9] = var4; // L: 133
		if (var1 != 0L && var1 != this.hash || this.field3334) { // L: 134
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 135

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lgc;ILgc;II)Lhd;",
		garbageValue = "-1345307278"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 138
			return class125.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 139
		} else {
			long var5 = this.hash; // L: 141
			int[] var7 = this.equipment; // L: 142
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 143
				var7 = new int[12]; // L: 144

				for (int var8 = 0; var8 < 12; ++var8) { // L: 145
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 146
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 147
					var7[5] = var1.shield; // L: 148
				}

				if (var1.weapon >= 0) { // L: 150
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 151
					var7[3] = var1.weapon; // L: 152
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 155
			if (var18 == null) { // L: 156
				boolean var9 = false; // L: 157

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 158
					var11 = var7[var10]; // L: 159
					if (var11 >= 256 && var11 < 512 && !RouteStrategy.KitDefinition_get(var11 - 256).ready()) { // L: 160 161
						var9 = true;
					}

					if (var11 >= 512 && !class258.ItemComposition_get(var11 - 512).hasNoValidModel(this.isFemale)) { // L: 163 164
						var9 = true;
					}
				}

				if (var9) { // L: 167
					if (-1L != this.field3336) { // L: 168
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3336);
					}

					if (var18 == null) { // L: 169
						return null;
					}
				}

				if (var18 == null) { // L: 171
					ModelData[] var19 = new ModelData[12]; // L: 172
					var11 = 0; // L: 173

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 174
						var13 = var7[var12]; // L: 175
						if (var13 >= 256 && var13 < 512) { // L: 176
							ModelData var14 = RouteStrategy.KitDefinition_get(var13 - 256).getModelData(); // L: 177
							if (var14 != null) { // L: 178
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 180
							ItemComposition var22 = class258.ItemComposition_get(var13 - 512); // L: 181
							ModelData var15 = var22.method3710(this.isFemale); // L: 182
							if (var15 != null) { // L: 183
								if (this.field3338 != null) { // L: 184
									class167 var16 = this.field3338[var12]; // L: 185
									if (var16 != null) { // L: 186
										int var17;
										if (var16.field1802 != null && var22.recolorFrom != null && var16.field1802.length == var22.recolorTo.length) { // L: 187
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 188
												var15.recolor(var22.recolorTo[var17], var16.field1802[var17]); // L: 189
											}
										}

										if (var16.field1805 != null && var22.retextureFrom != null && var16.field1805.length == var22.retextureTo.length) { // L: 192
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 193
												var15.retexture(var22.retextureTo[var17], var16.field1805[var17]); // L: 194
											}
										}
									}
								}

								var19[var11++] = var15; // L: 199
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 203

					for (var13 = 0; var13 < 5; ++var13) { // L: 204
						if (this.bodyColors[var13] < DynamicObject.field986[var13].length) { // L: 205
							var20.recolor(WorldMapEvent.field2881[var13], DynamicObject.field986[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3339[var13].length) { // L: 206
							var20.recolor(AbstractWorldMapIcon.field2859[var13], field3339[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 208
					PlayerComposition_cachedModels.put(var18, var5); // L: 209
					this.field3336 = var5; // L: 210
				}
			}

			if (var1 == null && var3 == null) { // L: 214
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) { // L: 215
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) { // L: 216
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4); // L: 217
				}

				return var21; // L: 218
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lgw;",
		garbageValue = "2117103903"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 222
			return class125.getNpcDefinition(this.npcTransformId).getModelData(); // L: 223
		} else {
			boolean var1 = false; // L: 225

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 226
				var3 = this.equipment[var2]; // L: 227
				if (var3 >= 256 && var3 < 512 && !RouteStrategy.KitDefinition_get(var3 - 256).method3399()) { // L: 228 229
					var1 = true;
				}

				if (var3 >= 512 && !class258.ItemComposition_get(var3 - 512).method3711(this.isFemale)) { // L: 231 232
					var1 = true;
				}
			}

			if (var1) { // L: 235
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 236
				var3 = 0; // L: 237

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 238
					var5 = this.equipment[var4]; // L: 239
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 240
						var6 = RouteStrategy.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 241
						if (var6 != null) { // L: 242
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 244
						var6 = class258.ItemComposition_get(var5 - 512).method3717(this.isFemale); // L: 245
						if (var6 != null) { // L: 246
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 249

				for (var5 = 0; var5 < 5; ++var5) { // L: 250
					if (this.bodyColors[var5] < DynamicObject.field986[var5].length) { // L: 251
						var8.recolor(WorldMapEvent.field2881[var5], DynamicObject.field986[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3339[var5].length) { // L: 252
						var8.recolor(AbstractWorldMapIcon.field2859[var5], field3339[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 254
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2077321912"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class125.getNpcDefinition(this.npcTransformId).id; // L: 258 259
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "430827033"
	)
	public static final boolean method5612(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 28
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "-1563727173"
	)
	static void method5610(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 43
			int var4 = (var3 + var2) / 2; // L: 44
			int var5 = var2; // L: 45
			String var6 = var0[var4]; // L: 46
			var0[var4] = var0[var3]; // L: 47
			var0[var3] = var6; // L: 48
			int var7 = var1[var4]; // L: 49
			var1[var4] = var1[var3]; // L: 50
			var1[var3] = var7; // L: 51

			for (int var8 = var2; var8 < var3; ++var8) { // L: 52
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 53
					String var9 = var0[var8]; // L: 54
					var0[var8] = var0[var5]; // L: 55
					var0[var5] = var9; // L: 56
					int var10 = var1[var8]; // L: 57
					var1[var8] = var1[var5]; // L: 58
					var1[var5++] = var10; // L: 59
				}
			}

			var0[var3] = var0[var5]; // L: 63
			var0[var5] = var6; // L: 64
			var1[var3] = var1[var5]; // L: 65
			var1[var5] = var7; // L: 66
			method5610(var0, var1, var2, var5 - 1); // L: 67
			method5610(var0, var1, var5 + 1, var3); // L: 68
		}

	} // L: 70
}
