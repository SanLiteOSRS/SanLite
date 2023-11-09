import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("b")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("PlayerComposition_cachedModels")
	static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("a")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("f")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1490136635
	)
	public int field3425;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1040392237
	)
	public int field3423;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -79707607
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 59114764337406355L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -4365974817637349645L
	)
	long field3420;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[Lfw;"
	)
	class174[] field3427;
	@ObfuscatedName("n")
	boolean field3428;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10}; // L: 27
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 28
	}

	public PlayerComposition() {
		this.field3425 = -1; // L: 16
		this.field3423 = 0; // L: 17
		this.field3428 = false; // L: 22
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([I[Lfw;Z[IIIII)V",
		garbageValue = "1081958245"
	)
	public void method5730(int[] var1, class174[] var2, boolean var3, int[] var4, int var5, int var6, int var7) {
		this.field3427 = var2; // L: 31
		this.field3428 = var3; // L: 32
		this.field3425 = var7; // L: 33
		this.method5731(var1, var4, var5, var6); // L: 34
	} // L: 35

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-1357740388"
	)
	public void method5731(int[] var1, int[] var2, int var3, int var4) {
		if (var1 == null) { // L: 38
			var1 = new int[12]; // L: 39

			for (int var5 = 0; var5 < 7; ++var5) { // L: 40
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) { // L: 41
					KitDefinition var7 = Script.KitDefinition_get(var6); // L: 42
					if (var7 != null && !var7.nonSelectable && var5 + (var3 == 1 ? 7 : 0) == var7.bodypartID) { // L: 43
						var1[equipmentIndices[var5]] = var6 + 256; // L: 44
						break; // L: 45
					}
				}
			}
		}

		this.equipment = var1; // L: 50
		this.bodyColors = var2; // L: 51
		this.field3423 = var3; // L: 52
		this.npcTransformId = var4; // L: 53
		this.setHash(); // L: 54
	} // L: 55

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "28"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || this.field3423 != 1) { // L: 58
			int var3 = this.equipment[equipmentIndices[var1]]; // L: 59
			if (var3 != 0) { // L: 60
				var3 -= 256; // L: 61

				KitDefinition var4;
				do {
					if (!var2) { // L: 63
						--var3; // L: 64
						if (var3 < 0) { // L: 65
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3; // L: 68
						if (var3 >= KitDefinition.KitDefinition_fileCount) { // L: 69
							var3 = 0;
						}
					}

					var4 = Script.KitDefinition_get(var3); // L: 71
				} while(var4 == null || var4.nonSelectable || var1 + (this.field3423 == 1 ? 7 : 0) != var4.bodypartID); // L: 72

				this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 74
				this.setHash(); // L: 75
			}
		}
	} // L: 76

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-2095549182"
	)
	public void method5745(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 79
		if (!var2) { // L: 80
			do {
				--var3; // L: 82
				if (var3 < 0) { // L: 83
					var3 = class34.field193[var1].length - 1; // L: 84
				}
			} while(!class131.method2952(var1, var3)); // L: 86
		} else {
			do {
				++var3; // L: 91
				if (var3 >= class34.field193[var1].length) { // L: 92
					var3 = 0;
				}
			} while(!class131.method2952(var1, var3)); // L: 93
		}

		this.bodyColors[var1] = var3; // L: 96
		this.setHash(); // L: 97
	} // L: 98

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "72"
	)
	public void method5732(int var1) {
		if (this.field3423 != var1) { // L: 101
			this.method5731((int[])null, this.bodyColors, var1, -1); // L: 102
		}
	} // L: 103

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "101"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3423); // L: 106

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 107
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 108
			if (var3 == 0) {
				var1.writeByte(-1); // L: 109
			} else {
				var1.writeByte(var3 - 256); // L: 110
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 112
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 113

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1912909156"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 116
		int var3 = this.equipment[5]; // L: 117
		int var4 = this.equipment[9]; // L: 118
		this.equipment[5] = var4; // L: 119
		this.equipment[9] = var3; // L: 120
		this.hash = 0L; // L: 121

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 122
			this.hash <<= 4; // L: 123
			if (this.equipment[var5] >= 256) { // L: 124
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 126
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 127
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 128
			this.hash <<= 3; // L: 129
			this.hash += (long)this.bodyColors[var5]; // L: 130
		}

		this.hash <<= 1; // L: 132
		this.hash += (long)(this.field3423 * 568602533) * 1040392237L; // L: 133
		this.equipment[5] = var3; // L: 134
		this.equipment[9] = var4; // L: 135
		if (0L != var1 && var1 != this.hash || this.field3428) { // L: 136
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 137

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lgg;ILgg;II)Lha;",
		garbageValue = "-990876935"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 140
			return HealthBarDefinition.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 141
		} else {
			long var5 = this.hash; // L: 143
			int[] var7 = this.equipment; // L: 144
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 145
				var7 = new int[12]; // L: 146

				for (int var8 = 0; var8 < 12; ++var8) { // L: 147
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 148
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 149
					var7[5] = var1.shield; // L: 150
				}

				if (var1.weapon >= 0) { // L: 152
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 153
					var7[3] = var1.weapon; // L: 154
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 157
			if (var18 == null) { // L: 158
				boolean var9 = false; // L: 159

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 160
					var11 = var7[var10]; // L: 161
					if (var11 >= 256 && var11 < 512 && !Script.KitDefinition_get(var11 - 256).ready()) { // L: 162 163
						var9 = true;
					}

					if (var11 >= 512 && !MidiPcmStream.ItemComposition_get(var11 - 512).method3826(this.field3423)) { // L: 165 166
						var9 = true;
					}
				}

				if (var9) { // L: 169
					if (-1L != this.field3420) { // L: 170
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3420);
					}

					if (var18 == null) { // L: 171
						return null;
					}
				}

				if (var18 == null) { // L: 173
					ModelData[] var19 = new ModelData[12]; // L: 174
					var11 = 0; // L: 175

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 176
						var13 = var7[var12]; // L: 177
						if (var13 >= 256 && var13 < 512) { // L: 178
							ModelData var14 = Script.KitDefinition_get(var13 - 256).getModelData(); // L: 179
							if (var14 != null) { // L: 180
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 182
							ItemComposition var22 = MidiPcmStream.ItemComposition_get(var13 - 512); // L: 183
							ModelData var15 = var22.method3779(this.field3423); // L: 184
							if (var15 != null) { // L: 185
								if (this.field3427 != null) { // L: 186
									class174 var16 = this.field3427[var12]; // L: 187
									if (var16 != null) { // L: 188
										int var17;
										if (var16.field1858 != null && var22.recolorFrom != null && var16.field1858.length == var22.recolorTo.length) { // L: 189
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 190
												var15.recolor(var22.recolorTo[var17], var16.field1858[var17]); // L: 191
											}
										}

										if (var16.field1855 != null && var22.retextureFrom != null && var22.retextureTo.length == var16.field1855.length) { // L: 194
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 195
												var15.retexture(var22.retextureTo[var17], var16.field1855[var17]); // L: 196
											}
										}
									}
								}

								var19[var11++] = var15; // L: 201
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 205

					for (var13 = 0; var13 < 5; ++var13) { // L: 206
						if (this.bodyColors[var13] < class34.field193[var13].length) { // L: 207
							var20.recolor(TaskHandler.field1780[var13], class34.field193[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < ArchiveLoader.field1016[var13].length) { // L: 208
							var20.recolor(class21.field114[var13], ArchiveLoader.field1016[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 210
					PlayerComposition_cachedModels.put(var18, var5); // L: 211
					this.field3420 = var5; // L: 212
				}
			}

			if (var1 == null && var3 == null) { // L: 216
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) { // L: 217
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) { // L: 218
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4); // L: 219
				}

				return var21; // L: 220
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lgs;",
		garbageValue = "-4"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 224
			return HealthBarDefinition.getNpcDefinition(this.npcTransformId).getModelData(); // L: 225
		} else {
			boolean var1 = false; // L: 227

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 228
				var3 = this.equipment[var2]; // L: 229
				if (var3 >= 256 && var3 < 512 && !Script.KitDefinition_get(var3 - 256).method3470()) { // L: 230 231
					var1 = true;
				}

				if (var3 >= 512 && !MidiPcmStream.ItemComposition_get(var3 - 512).method3824(this.field3423)) { // L: 233 234
					var1 = true;
				}
			}

			if (var1) { // L: 237
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 238
				var3 = 0; // L: 239

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 240
					var5 = this.equipment[var4]; // L: 241
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 242
						var6 = Script.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 243
						if (var6 != null) { // L: 244
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 246
						var6 = MidiPcmStream.ItemComposition_get(var5 - 512).method3787(this.field3423); // L: 247
						if (var6 != null) { // L: 248
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 251

				for (var5 = 0; var5 < 5; ++var5) { // L: 252
					if (this.bodyColors[var5] < class34.field193[var5].length) { // L: 253
						var8.recolor(TaskHandler.field1780[var5], class34.field193[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < ArchiveLoader.field1016[var5].length) { // L: 254
						var8.recolor(class21.field114[var5], ArchiveLoader.field1016[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 256
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "73"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + HealthBarDefinition.getNpcDefinition(this.npcTransformId).id; // L: 260 261
	}
}
