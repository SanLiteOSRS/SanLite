import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1716974829
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("KitDefinition_cached")
	public static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	static Bounds field1860;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -198149691
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("w")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("z")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("j")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("h")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("a")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("d")
	@Export("models")
	int[] models;
	@ObfuscatedName("n")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1}; // L: 21
		this.nonSelectable = false; // L: 22
	} // L: 24

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-142028586"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 38
			if (var2 == 0) { // L: 39
				return; // L: 42
			}

			this.decodeNext(var1, var2); // L: 40
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "-2119387594"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 45
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 46
				var3 = var1.readUnsignedByte(); // L: 47
				this.models2 = new int[var3]; // L: 48

				for (var4 = 0; var4 < var3; ++var4) { // L: 49
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 51
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 52
				var3 = var1.readUnsignedByte(); // L: 53
				this.recolorFrom = new short[var3]; // L: 54
				this.recolorTo = new short[var3]; // L: 55

				for (var4 = 0; var4 < var3; ++var4) { // L: 56
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 57
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 58
				}
			} else if (var2 == 41) { // L: 61
				var3 = var1.readUnsignedByte(); // L: 62
				this.retextureFrom = new short[var3]; // L: 63
				this.retextureTo = new short[var3]; // L: 64

				for (var4 = 0; var4 < var3; ++var4) { // L: 65
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 66
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 67
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 70
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 72

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "417497565"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 75
			return true;
		} else {
			boolean var1 = true; // L: 76

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 77
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 78
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgw;",
		garbageValue = "820896030"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 82
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 83

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 84
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 86
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 87
			}

			int var3;
			if (this.recolorFrom != null) { // L: 88
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 89
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 90
				}
			}

			if (this.retextureFrom != null) { // L: 93
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 94
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 95
				}
			}

			return var4; // L: 98
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1596959264"
	)
	public boolean method3399() {
		boolean var1 = true; // L: 102

		for (int var2 = 0; var2 < 5; ++var2) { // L: 103
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 104
				var1 = false;
			}
		}

		return var1; // L: 106
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Lgw;",
		garbageValue = "-49"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 110
		int var2 = 0; // L: 111

		for (int var3 = 0; var3 < 5; ++var3) { // L: 112
			if (this.models[var3] != -1) { // L: 113
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 115
		int var4;
		if (this.recolorFrom != null) { // L: 116
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 117
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 118
			}
		}

		if (this.retextureFrom != null) { // L: 121
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 122
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 123
			}
		}

		return var5; // L: 126
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ldp;FZB)F",
		garbageValue = "-34"
	)
	static float method3390(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 160
		if (var0 != null && var0.method2785() != 0) { // L: 161
			float var4 = (float)var0.field1437[0].field1390; // L: 164
			float var5 = (float)var0.field1437[var0.method2785() - 1].field1390; // L: 165
			float var6 = var5 - var4; // L: 166
			if (0.0D == (double)var6) { // L: 167
				return var0.field1437[0].field1389; // L: 168
			} else {
				float var7 = 0.0F; // L: 170
				if (var1 > var5) { // L: 171
					var7 = (var1 - var5) / var6; // L: 172
				} else {
					var7 = (var1 - var4) / var6; // L: 175
				}

				double var8 = (double)((int)var7); // L: 177
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 178
				float var11 = var10 * var6; // L: 179
				var8 = Math.abs(var8 + 1.0D); // L: 180
				double var12 = var8 / 2.0D; // L: 181
				double var14 = (double)((int)var12); // L: 182
				var10 = (float)(var12 - var14); // L: 183
				float var16;
				float var17;
				if (var2) { // L: 186
					if (var0.field1435 == class116.field1422) { // L: 187
						if ((double)var10 != 0.0D) { // L: 188
							var11 += var4; // L: 189
						} else {
							var11 = var5 - var11; // L: 192
						}
					} else if (var0.field1435 != class116.field1424 && var0.field1435 != class116.field1425) { // L: 195
						if (var0.field1435 == class116.field1423) { // L: 198
							var11 = var4 - var1; // L: 199
							var16 = var0.field1437[0].field1391; // L: 200
							var17 = var0.field1437[0].field1396; // L: 201
							var3 = var0.field1437[0].field1389; // L: 202
							if ((double)var16 != 0.0D) { // L: 203
								var3 -= var17 * var11 / var16; // L: 204
							}

							return var3; // L: 206
						}
					} else {
						var11 = var5 - var11; // L: 196
					}
				} else if (var0.field1436 == class116.field1422) { // L: 210
					if (0.0D != (double)var10) { // L: 211
						var11 = var5 - var11; // L: 212
					} else {
						var11 += var4; // L: 215
					}
				} else if (var0.field1436 != class116.field1424 && var0.field1436 != class116.field1425) { // L: 218
					if (var0.field1436 == class116.field1423) { // L: 221
						var11 = var1 - var5; // L: 222
						var16 = var0.field1437[var0.method2785() - 1].field1392; // L: 223
						var17 = var0.field1437[var0.method2785() - 1].field1393; // L: 224
						var3 = var0.field1437[var0.method2785() - 1].field1389; // L: 225
						if ((double)var16 != 0.0D) { // L: 226
							var3 += var11 * var17 / var16; // L: 227
						}

						return var3; // L: 229
					}
				} else {
					var11 += var4; // L: 219
				}

				var3 = MouseHandler.method600(var0, var11); // L: 232
				float var18;
				if (var2 && var0.field1435 == class116.field1425) { // L: 234
					var18 = var0.field1437[var0.method2785() - 1].field1389 - var0.field1437[0].field1389; // L: 235
					var3 = (float)((double)var3 - (double)var18 * var8); // L: 236
				} else if (!var2 && var0.field1436 == class116.field1425) { // L: 238
					var18 = var0.field1437[var0.method2785() - 1].field1389 - var0.field1437[0].field1389; // L: 239
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 240
				}

				return var3; // L: 242
			}
		} else {
			return var3; // L: 162
		}
	}
}
