import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ac")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("PlayerComposition_cachedModels")
	public static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("at")
	int[] field3544;
	@ObfuscatedName("an")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("av")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1302023925
	)
	public int field3541;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -838376169
	)
	public int field3540;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1286079261
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -698536201873075837L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -7296980266756646439L
	)
	long field3545;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lhe;"
	)
	class182[] field3546;
	@ObfuscatedName("af")
	boolean field3547;

	static {
		equipmentIndices = new int[]{class208.field2304.field2315, class208.field2312.field2315, class208.field2301.field2315, class208.field2307.field2315, class208.field2309.field2315, class208.field2308.field2315, class208.field2311.field2315}; // L: 30
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 33
	}

	public PlayerComposition() {
		this.field3541 = -1;
		this.field3540 = 0;
		this.field3547 = false;
	} // L: 35

	@ObfuscatedSignature(
		descriptor = "(Lmk;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3541 = -1; // L: 19
		this.field3540 = 0; // L: 20
		this.field3547 = false; // L: 25
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 38
		int[] var3 = Arrays.copyOf(var1.field3544, var1.field3544.length);
		class182[] var4 = (class182[])(var1.field3546 != null ? (class182[])Arrays.copyOf(var1.field3546, var1.field3546.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method6010(var3, var2, var4, false, var5, var1.field3540, var1.npcTransformId, var1.field3541); // L: 42
	} // L: 43

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lhe;Z[IIIII)V",
		garbageValue = "-2103200697"
	)
	public void method6010(int[] var1, int[] var2, class182[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3546 = var3;
		this.field3547 = var4;
		this.field3541 = var8;
		this.method6011(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "-89"
	)
	public void method6011(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 53
			var1 = this.method6012(var4); // L: 54
		}

		if (var2 == null) { // L: 56
			var2 = this.method6012(var4); // L: 57
		}

		this.field3544 = var1; // L: 59
		this.equipment = var2; // L: 60
		this.bodyColors = var3; // L: 61
		this.field3540 = var4; // L: 62
		this.npcTransformId = var5; // L: 63
		this.setHash(); // L: 64
	} // L: 65

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "2008088858"
	)
	int[] method6012(int var1) {
		int[] var2 = new int[12]; // L: 68

		for (int var3 = 0; var3 < 7; ++var3) { // L: 69
			class59.method1116(var1, var2, var3); // L: 70
		}

		return var2; // L: 72
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1483080455"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int var3 = this.equipment[equipmentIndices[var1]]; // L: 86
		if (var3 != 0) { // L: 87
			var3 -= 256; // L: 88

			KitDefinition var4;
			do {
				if (!var2) { // L: 90
					--var3; // L: 91
					if (var3 < 0) {
						var3 = KitDefinition.KitDefinition_fileCount - 1; // L: 92
					}
				} else {
					++var3; // L: 95
					if (var3 >= KitDefinition.KitDefinition_fileCount) { // L: 96
						var3 = 0;
					}
				}

				var4 = class154.KitDefinition_get(var3); // L: 98
			} while(var4 == null || var4.nonSelectable || var4.bodypartID != (this.field3540 == 1 ? 7 : 0) + var1); // L: 99

			this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 101
			this.setHash(); // L: 102
		}
	} // L: 103

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-19"
	)
	public void method6014(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 106
		if (!var2) { // L: 107
			do {
				--var3; // L: 109
				if (var3 < 0) { // L: 110
					var3 = class13.field65[var1].length - 1; // L: 111
				}
			} while(!UserComparator8.method2852(var1, var3)); // L: 113
		} else {
			do {
				++var3; // L: 118
				if (var3 >= class13.field65[var1].length) { // L: 119
					var3 = 0;
				}
			} while(!UserComparator8.method2852(var1, var3)); // L: 120
		}

		this.bodyColors[var1] = var3; // L: 123
		this.setHash(); // L: 124
	} // L: 125

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "6519"
	)
	public void method6015(int var1) {
		if (this.field3540 != var1) { // L: 128
			this.method6011((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 129
		}
	} // L: 130

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "217742493"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3540); // L: 133

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 134
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 135
			if (var3 == 0) {
				var1.writeByte(-1); // L: 136
			} else {
				var1.writeByte(var3 - 256); // L: 137
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 139
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 140

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "214405957"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 143
		int var3 = this.equipment[5]; // L: 144
		int var4 = this.equipment[9]; // L: 145
		this.equipment[5] = var4; // L: 146
		this.equipment[9] = var3; // L: 147
		this.hash = 0L; // L: 148

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 149
			this.hash <<= 4; // L: 150
			if (this.equipment[var5] >= 256) { // L: 151
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 153
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 154
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 155
			this.hash <<= 3; // L: 156
			this.hash += (long)this.bodyColors[var5]; // L: 157
		}

		this.hash <<= 1; // L: 159
		this.hash += -838376169L * (long)(this.field3540 * 1749033639); // L: 160
		this.equipment[5] = var3; // L: 161
		this.equipment[9] = var4; // L: 162
		if (var1 != 0L && var1 != this.hash || this.field3547) { // L: 163
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 164

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lhy;ILhy;IB)Ljd;",
		garbageValue = "0"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 167
			return Bounds.getNpcDefinition(this.npcTransformId).method3691(var1, var2, var3, var4, (class193)null); // L: 168
		} else {
			long var5 = this.hash; // L: 170
			int[] var7 = this.equipment; // L: 171
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 172
				var7 = new int[12]; // L: 173

				for (int var8 = 0; var8 < 12; ++var8) { // L: 174
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 175
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 176
					var7[5] = var1.shield; // L: 177
				}

				if (var1.weapon >= 0) { // L: 179
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 180
					var7[3] = var1.weapon; // L: 181
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 184
			if (var18 == null) { // L: 185
				boolean var9 = false; // L: 186

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 187
					var11 = var7[var10]; // L: 188
					if (var11 >= 256 && var11 < 512 && !class154.KitDefinition_get(var11 - 256).ready()) { // L: 189 190
						var9 = true;
					}

					if (var11 >= 512 && !class300.ItemComposition_get(var11 - 512).method3957(this.field3540)) { // L: 192 193
						var9 = true;
					}
				}

				if (var9) { // L: 196
					if (this.field3545 != -1L) { // L: 197
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3545);
					}

					if (var18 == null) { // L: 198
						return null;
					}
				}

				if (var18 == null) { // L: 200
					ModelData[] var19 = new ModelData[12]; // L: 201
					var11 = 0; // L: 202

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 203
						var13 = var7[var12]; // L: 204
						if (var13 >= 256 && var13 < 512) { // L: 205
							ModelData var14 = class154.KitDefinition_get(var13 - 256).getModelData(); // L: 206
							if (var14 != null) { // L: 207
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 209
							ItemComposition var22 = class300.ItemComposition_get(var13 - 512); // L: 210
							ModelData var15 = var22.method3986(this.field3540); // L: 211
							if (var15 != null) { // L: 212
								if (this.field3546 != null) { // L: 213
									class182 var16 = this.field3546[var12]; // L: 214
									if (var16 != null) { // L: 215
										int var17;
										if (var16.field1890 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1890.length) { // L: 216
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 217
												var15.recolor(var22.recolorTo[var17], var16.field1890[var17]); // L: 218
											}
										}

										if (var16.field1888 != null && var22.retextureFrom != null && var16.field1888.length == var22.retextureTo.length) { // L: 221
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 222
												var15.retexture(var22.retextureTo[var17], var16.field1888[var17]); // L: 223
											}
										}
									}
								}

								var19[var11++] = var15; // L: 228
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 232

					for (var13 = 0; var13 < 5; ++var13) { // L: 233
						if (this.bodyColors[var13] < class13.field65[var13].length) { // L: 234
							var20.recolor(WorldMapSection1.field3036[var13], class13.field65[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class209.field2326[var13].length) { // L: 235
							var20.recolor(GrandExchangeEvent.field4312[var13], class209.field2326[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 237
					PlayerComposition_cachedModels.put(var18, var5); // L: 238
					this.field3545 = var5; // L: 239
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 243
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) { // L: 244
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) { // L: 245
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4); // L: 246
			}

			return var21; // L: 247
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "4"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 251
			return Bounds.getNpcDefinition(this.npcTransformId).method3692((class193)null); // L: 252
		} else {
			boolean var1 = false; // L: 254

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 255
				var3 = this.equipment[var2]; // L: 256
				if (var3 >= 256 && var3 < 512 && !class154.KitDefinition_get(var3 - 256).method3619()) { // L: 257 258
					var1 = true;
				}

				if (var3 >= 512 && !class300.ItemComposition_get(var3 - 512).method3959(this.field3540)) { // L: 260 261
					var1 = true;
				}
			}

			if (var1) { // L: 264
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 265
				var3 = 0; // L: 266

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 267
					var5 = this.equipment[var4]; // L: 268
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 269
						var6 = class154.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 270
						if (var6 != null) { // L: 271
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 273
						var6 = class300.ItemComposition_get(var5 - 512).method3960(this.field3540); // L: 274
						if (var6 != null) { // L: 275
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 278

				for (var5 = 0; var5 < 5; ++var5) { // L: 279
					if (this.bodyColors[var5] < class13.field65[var5].length) { // L: 280
						var8.recolor(WorldMapSection1.field3036[var5], class13.field65[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class209.field2326[var5].length) { // L: 281
						var8.recolor(GrandExchangeEvent.field4312[var5], class209.field2326[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 283
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "766034284"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + Bounds.getNpcDefinition(this.npcTransformId).id; // L: 287 288
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-611812075"
	)
	void method6021() {
		this.method6011(this.field3544, this.equipment, this.bodyColors, this.field3540, this.npcTransformId); // L: 292
	} // L: 293

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhl;",
		garbageValue = "-2145601729"
	)
	public static HitSplatDefinition method6053(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2031134679"
	)
	public static int method6052(int var0, int var1, int var2) {
		int var3 = class155.method3288(var2 - var1 + 1); // L: 39
		var3 <<= var1; // L: 40
		return var0 & ~var3; // L: 41
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IILie;I)V",
		garbageValue = "115389205"
	)
	static final void method6009(Player var0, int var1, int var2, class216 var3) {
		int var4 = var0.pathX[0]; // L: 9069
		int var5 = var0.pathY[0]; // L: 9070
		int var6 = var0.transformedSize(); // L: 9071
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 9072
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 9073
				int var8 = var0.transformedSize(); // L: 9075
				RouteStrategy var9 = WorldMapDecoration.method5461(var1, var2); // L: 9076
				CollisionMap var10 = Client.collisionMaps[var0.plane]; // L: 9077
				int[] var11 = Client.field805; // L: 9078
				int[] var12 = Client.field806; // L: 9079
				int var7 = class328.method6347(var4, var5, var8, var9, var10, true, var11, var12, class135.field1579[0]); // L: 9081
				int var13 = var7; // L: 9083
				if (var7 >= 1) { // L: 9084
					for (int var14 = 0; var14 < var13 - 1; ++var14) { // L: 9085
						var0.method2296(Client.field805[var14], Client.field806[var14], var3);
					}

				}
			}
		}
	} // L: 9086
}
