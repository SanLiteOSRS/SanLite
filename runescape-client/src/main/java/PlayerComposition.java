import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("al")
	public static short[] field3578;
	@ObfuscatedName("an")
	public static short[][] field3586;
	@ObfuscatedName("ar")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("PlayerComposition_cachedModels")
	public static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	static class423 field3582;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1525916171
	)
	static int field3583;
	@ObfuscatedName("au")
	int[] field3584;
	@ObfuscatedName("ae")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ao")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -34466909
	)
	public int field3574;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1305081315
	)
	public int field3572;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1253753061
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -4990962188091480033L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 8032241556888834061L
	)
	long field3575;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lho;"
	)
	class183[] field3579;
	@ObfuscatedName("af")
	boolean field3577;

	static {
		equipmentIndices = new int[]{class209.field2335.field2334, class209.field2339.field2334, class209.field2332.field2334, class209.field2328.field2334, class209.field2342.field2334, class209.field2330.field2334, class209.field2338.field2334}; // L: 32
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 35
		field3582 = new class423(16, class421.field4606); // L: 36
		field3583 = 0; // L: 37
	}

	public PlayerComposition() {
		this.field3574 = -1;
		this.field3572 = 0;
		this.field3577 = false;
	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Lmt;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3574 = -1; // L: 21
		this.field3572 = 0; // L: 22
		this.field3577 = false; // L: 27
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 42
		int[] var3 = Arrays.copyOf(var1.field3584, var1.field3584.length); // L: 43
		class183[] var4 = (class183[])(var1.field3579 != null ? (class183[])Arrays.copyOf(var1.field3579, var1.field3579.length) : null); // L: 44
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length); // L: 45
		this.method6061(var3, var2, var4, false, var5, var1.field3572, var1.npcTransformId, var1.field3574); // L: 46
	} // L: 47

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lho;Z[IIIII)V",
		garbageValue = "-1866336930"
	)
	public void method6061(int[] var1, int[] var2, class183[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3579 = var3; // L: 50
		this.field3577 = var4; // L: 51
		this.field3574 = var8; // L: 52
		this.method6080(var1, var2, var5, var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "1458257561"
	)
	public void method6080(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 57
			var1 = this.method6063(var4); // L: 58
		}

		if (var2 == null) { // L: 60
			var2 = this.method6063(var4); // L: 61
		}

		this.field3584 = var1; // L: 63
		this.equipment = var2; // L: 64
		this.bodyColors = var3; // L: 65
		this.field3572 = var4; // L: 66
		this.npcTransformId = var5; // L: 67
		this.setHash(); // L: 68
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "13"
	)
	int[] method6063(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < KitDefinition.field1980; ++var4) {
				KitDefinition var5 = ClanChannel.KitDefinition_get(var4);
				if (var5 != null && !var5.nonSelectable && var3 + (var1 == 1 ? 7 : 0) == var5.bodypartID) {
					var2[equipmentIndices[var3]] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1083968287"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[equipmentIndices[var1]];
		if (var3 != 0) {
			var3 -= 256;

			KitDefinition var4;
			do {
				if (!var2) { // L: 92
					--var3; // L: 93
					if (var3 < 0) {
						var3 = KitDefinition.field1980 - 1; // L: 94
					}
				} else {
					++var3; // L: 97
					if (var3 >= KitDefinition.field1980) { // L: 98
						var3 = 0;
					}
				}

				var4 = ClanChannel.KitDefinition_get(var3); // L: 100
			} while(var4 == null || var4.nonSelectable || (this.field3572 == 1 ? 7 : 0) + var1 != var4.bodypartID); // L: 101

			this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 103
			this.setHash(); // L: 104
		}
	} // L: 105

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "8"
	)
	public void method6065(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 108
		boolean var4;
		if (!var2) { // L: 109
			do {
				--var3; // L: 111
				if (var3 < 0) { // L: 112
					var3 = class140.field1659[var1].length - 1; // L: 113
				}

				if (var1 == 4 && var3 >= 8) { // L: 117
					var4 = false; // L: 118
				} else {
					var4 = true; // L: 121
				}
			} while(!var4); // L: 123
		} else {
			do {
				++var3; // L: 128
				if (var3 >= class140.field1659[var1].length) { // L: 129
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) { // L: 132
					var4 = false; // L: 133
				} else {
					var4 = true; // L: 136
				}
			} while(!var4); // L: 138
		}

		this.bodyColors[var1] = var3; // L: 141
		this.setHash(); // L: 142
	} // L: 143

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-782377094"
	)
	public void method6084(int var1) {
		if (this.field3572 != var1) { // L: 146
			this.method6080((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 147
		}
	} // L: 148

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-544852329"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3572); // L: 151

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 152
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 153
			if (var3 == 0) { // L: 154
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256); // L: 155
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 157
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 158

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 161
		int var3 = this.equipment[5]; // L: 162
		int var4 = this.equipment[9]; // L: 163
		this.equipment[5] = var4; // L: 164
		this.equipment[9] = var3; // L: 165
		this.hash = 0L; // L: 166

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 167
			this.hash <<= 4; // L: 168
			if (this.equipment[var5] >= 256) { // L: 169
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 171
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 172
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 173
			this.hash <<= 3; // L: 174
			this.hash += (long)this.bodyColors[var5]; // L: 175
		}

		this.hash <<= 1; // L: 177
		this.hash += -1305081315L * (long)(this.field3572 * 72026165); // L: 178
		this.equipment[5] = var3; // L: 179
		this.equipment[9] = var4; // L: 180
		if (var1 != 0L && var1 != this.hash || this.field3577) { // L: 181
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 182

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lib;ILib;II)Ljr;",
		garbageValue = "955721951"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 185
			return class90.getNpcDefinition(this.npcTransformId).method3691(var1, var2, var3, var4, (class194)null); // L: 186
		} else {
			long var5 = this.hash; // L: 188
			int[] var7 = this.equipment; // L: 189
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 190
				var7 = new int[12]; // L: 191

				for (int var8 = 0; var8 < 12; ++var8) { // L: 192
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 193
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 194
					var7[5] = var1.shield; // L: 195
				}

				if (var1.weapon >= 0) { // L: 197
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 198
					var7[3] = var1.weapon; // L: 199
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 202
			if (var18 == null) { // L: 203
				boolean var9 = false; // L: 204

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 205
					var11 = var7[var10]; // L: 206
					if (var11 >= 256 && var11 < 512 && !ClanChannel.KitDefinition_get(var11 - 256).ready()) { // L: 207 208
						var9 = true;
					}

					if (var11 >= 512 && !InvDefinition.ItemComposition_get(var11 - 512).method3947(this.field3572)) { // L: 210 211
						var9 = true;
					}
				}

				if (var9) { // L: 214
					if (-1L != this.field3575) { // L: 215
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3575);
					}

					if (var18 == null) { // L: 216
						return null;
					}
				}

				if (var18 == null) { // L: 218
					ModelData[] var19 = new ModelData[12]; // L: 219
					var11 = 0; // L: 220

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 221
						var13 = var7[var12]; // L: 222
						if (var13 >= 256 && var13 < 512) { // L: 223
							ModelData var14 = ClanChannel.KitDefinition_get(var13 - 256).getModelData(); // L: 224
							if (var14 != null) { // L: 225
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 227
							ItemComposition var22 = InvDefinition.ItemComposition_get(var13 - 512); // L: 228
							ModelData var15 = var22.method3948(this.field3572); // L: 229
							if (var15 != null) { // L: 230
								if (this.field3579 != null) { // L: 231
									class183 var16 = this.field3579[var12]; // L: 232
									if (var16 != null) { // L: 233
										int var17;
										if (var16.field1918 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1918.length) { // L: 234
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 235
												var15.recolor(var22.recolorTo[var17], var16.field1918[var17]); // L: 236
											}
										}

										if (var16.field1919 != null && var22.retextureFrom != null && var16.field1919.length == var22.retextureTo.length) { // L: 239
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 240
												var15.retexture(var22.retextureTo[var17], var16.field1919[var17]); // L: 241
											}
										}
									}
								}

								var19[var11++] = var15; // L: 246
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 250

					for (var13 = 0; var13 < 5; ++var13) { // L: 251
						if (this.bodyColors[var13] < class140.field1659[var13].length) { // L: 252
							var20.recolor(UrlRequest.field1458[var13], class140.field1659[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3586[var13].length) {
							var20.recolor(field3578[var13], field3586[var13][this.bodyColors[var13]]); // L: 253
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 255
					PlayerComposition_cachedModels.put(var18, var5); // L: 256
					this.field3575 = var5; // L: 257
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 261
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) { // L: 262
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) { // L: 263
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4); // L: 264
			}

			return var21; // L: 265
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;",
		garbageValue = "-812517450"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 269
			return class90.getNpcDefinition(this.npcTransformId).method3692((class194)null); // L: 270
		} else {
			boolean var1 = false; // L: 272

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 273
				var3 = this.equipment[var2]; // L: 274
				if (var3 >= 256 && var3 < 512 && !ClanChannel.KitDefinition_get(var3 - 256).method3637()) { // L: 275 276
					var1 = true;
				}

				if (var3 >= 512 && !InvDefinition.ItemComposition_get(var3 - 512).method3949(this.field3572)) { // L: 278 279
					var1 = true;
				}
			}

			if (var1) { // L: 282
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 283
				var3 = 0; // L: 284

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 285
					var5 = this.equipment[var4]; // L: 286
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 287
						var6 = ClanChannel.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 288
						if (var6 != null) { // L: 289
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 291
						var6 = InvDefinition.ItemComposition_get(var5 - 512).method3952(this.field3572); // L: 292
						if (var6 != null) { // L: 293
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 296

				for (var5 = 0; var5 < 5; ++var5) { // L: 297
					if (this.bodyColors[var5] < class140.field1659[var5].length) { // L: 298
						var8.recolor(UrlRequest.field1458[var5], class140.field1659[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3586[var5].length) { // L: 299
						var8.recolor(field3578[var5], field3586[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 301
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash; // L: 305
		if (this.npcTransformId != -1) { // L: 306
			var1 = -65536L | (long)this.npcTransformId; // L: 307
		}

		Integer var3 = (Integer)field3582.method7781(var1); // L: 309
		if (var3 == null) { // L: 310
			var3 = ++field3583 - 1; // L: 311
			field3582.method7782(var1, var3); // L: 312
			field3583 %= 65535; // L: 313
		}

		return var3; // L: 315
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1158771729"
	)
	void method6072() {
		this.method6080(this.field3584, this.equipment, this.bodyColors, this.field3572, this.npcTransformId); // L: 319
	} // L: 320

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CLon;B)C",
		garbageValue = "1"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 69
			if (var0 >= 192 && var0 <= 198) { // L: 70
				return 'A';
			}

			if (var0 == 199) { // L: 71
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 72
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 73
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 74
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 75
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 76
				return 'U';
			}

			if (var0 == 221) { // L: 77
				return 'Y';
			}

			if (var0 == 223) { // L: 78
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 79
				return 'a';
			}

			if (var0 == 231) { // L: 80
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 81
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i'; // L: 82
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 83
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 84
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 85
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 86
				return 'y';
			}
		}

		if (var0 == 338) { // L: 88
			return 'O';
		} else if (var0 == 339) { // L: 89
			return 'o';
		} else if (var0 == 376) { // L: 90
			return 'Y';
		} else {
			return var0; // L: 91
		}
	}
}
