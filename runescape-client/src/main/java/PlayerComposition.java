import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("as")
	public static short[][] field3606;
	@ObfuscatedName("ay")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("PlayerComposition_cachedModels")
	static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	@Export("archive10")
	static class435 archive10;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -971246219
	)
	static int field3611;
	@ObfuscatedName("at")
	int[] field3596;
	@ObfuscatedName("ah")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ar")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 267402299
	)
	public int field3598;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -857831361
	)
	public int field3600;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1418794423
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -122798719749358227L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 1369544555335042193L
	)
	long field3608;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lgx;"
	)
	class169[] field3604;
	@ObfuscatedName("az")
	boolean field3603;

	static {
		equipmentIndices = new int[]{class205.field2242.field2245, class205.field2231.field2245, class205.field2235.field2245, class205.field2237.field2245, class205.field2240.field2245, class205.field2236.field2245, class205.field2241.field2245}; // L: 32
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 35
		archive10 = new class435(16, class433.field4645); // L: 36
		field3611 = 0; // L: 37
	}

	public PlayerComposition() {
		this.field3598 = -1;
		this.field3600 = 0;
		this.field3603 = false;
	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Lnb;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3598 = -1; // L: 21
		this.field3600 = 0; // L: 22
		this.field3603 = false; // L: 27
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 42
		int[] var3 = Arrays.copyOf(var1.field3596, var1.field3596.length); // L: 43
		class169[] var4 = (class169[])(var1.field3604 != null ? (class169[])Arrays.copyOf(var1.field3604, var1.field3604.length) : null); // L: 44
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length); // L: 45
		this.method6313(var3, var2, var4, false, var5, var1.field3600, var1.npcTransformId, var1.field3598); // L: 46
	} // L: 47

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgx;Z[IIIII)V",
		garbageValue = "-712663226"
	)
	public void method6313(int[] var1, int[] var2, class169[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3604 = var3; // L: 50
		this.field3603 = var4; // L: 51
		this.field3598 = var8; // L: 52
		this.method6314(var1, var2, var5, var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "-107"
	)
	public void method6314(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 57
			var1 = this.method6318(var4); // L: 58
		}

		if (var2 == null) { // L: 60
			var2 = this.method6318(var4); // L: 61
		}

		this.field3596 = var1; // L: 63
		this.equipment = var2; // L: 64
		this.bodyColors = var3; // L: 65
		this.field3600 = var4; // L: 66
		this.npcTransformId = var5; // L: 67
		this.setHash(); // L: 68
	} // L: 69

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "45"
	)
	int[] method6318(int var1) {
		int[] var2 = new int[12]; // L: 72

		for (int var3 = 0; var3 < 7; ++var3) { // L: 73
			class228.method4438(var1, var2, var3); // L: 74
		}

		return var2; // L: 76
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1628205152"
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
						var3 = class348.field3825 - 1; // L: 96
					}
				} else {
					++var3; // L: 99
					if (var3 >= class348.field3825) { // L: 100
						var3 = 0;
					}
				}

				var4 = class1.KitDefinition_get(var3); // L: 102
			} while(var4 == null || var4.nonSelectable || var4.bodypartID != var1 + (this.field3600 == 1 ? 7 : 0)); // L: 103

			this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 105
			this.setHash(); // L: 106
		}
	} // L: 107

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-58"
	)
	public void method6317(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 110
		if (!var2) { // L: 111
			do {
				--var3; // L: 113
				if (var3 < 0) { // L: 114
					var3 = class90.field1094[var1].length - 1; // L: 115
				}
			} while(!class90.method2382(var1, var3)); // L: 117
		} else {
			do {
				++var3; // L: 122
				if (var3 >= class90.field1094[var1].length) { // L: 123
					var3 = 0;
				}
			} while(!class90.method2382(var1, var3)); // L: 124
		}

		this.bodyColors[var1] = var3; // L: 127
		this.setHash(); // L: 128
	} // L: 129

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-530024953"
	)
	public void method6322(int var1) {
		if (this.field3600 != var1) { // L: 132
			this.method6314((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 133
		}
	} // L: 134

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "0"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3600); // L: 137

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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "226179138"
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
		this.hash += -857831361L * (long)(this.field3600 * -249993281); // L: 164
		this.equipment[5] = var3; // L: 165
		this.equipment[9] = var4; // L: 166
		if (0L != var1 && this.hash != var1 || this.field3603) { // L: 167
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 168

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhx;ILhx;II)Lka;",
		garbageValue = "1048858154"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 171
			return VerticalAlignment.getNpcDefinition(this.npcTransformId).method3735(var1, var2, var3, var4, (class187)null); // L: 172
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
					if (var11 >= 256 && var11 < 512 && !class1.KitDefinition_get(var11 - 256).ready()) { // L: 193 194
						var9 = true;
					}

					if (var11 >= 512 && !class214.ItemComposition_get(var11 - 512).method3958(this.field3600)) { // L: 196 197
						var9 = true;
					}
				}

				if (var9) { // L: 200
					if (this.field3608 != -1L) { // L: 201
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3608);
					}

					if (var18 == null) { // L: 202
						return null;
					}
				}

				if (var18 == null) { // L: 204
					ModelData[] var19 = new ModelData[12]; // L: 205
					var11 = 0; // L: 206

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 207
						var13 = var7[var12]; // L: 208
						if (var13 >= 256 && var13 < 512) { // L: 209
							ModelData var14 = class1.KitDefinition_get(var13 - 256).getModelData(); // L: 210
							if (var14 != null) { // L: 211
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 213
							ItemComposition var22 = class214.ItemComposition_get(var13 - 512); // L: 214
							ModelData var15 = var22.method3961(this.field3600); // L: 215
							if (var15 != null) { // L: 216
								if (this.field3604 != null) { // L: 217
									class169 var16 = this.field3604[var12]; // L: 218
									if (var16 != null) { // L: 219
										int var17;
										if (var16.field1792 != null && var22.recolorFrom != null && var16.field1792.length == var22.recolorTo.length) { // L: 220
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 221
												var15.recolor(var22.recolorTo[var17], var16.field1792[var17]); // L: 222
											}
										}

										if (var16.field1793 != null && var22.retextureFrom != null && var22.retextureTo.length == var16.field1793.length) { // L: 225
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 226
												var15.retexture(var22.retextureTo[var17], var16.field1793[var17]); // L: 227
											}
										}
									}
								}

								var19[var11++] = var15; // L: 232
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 236

					for (var13 = 0; var13 < 5; ++var13) { // L: 237
						if (this.bodyColors[var13] < class90.field1094[var13].length) { // L: 238
							var20.recolor(WorldMapLabelSize.field2440[var13], class90.field1094[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3606[var13].length) { // L: 239
							var20.recolor(class503.field5015[var13], field3606[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 241
					PlayerComposition_cachedModels.put(var18, var5); // L: 242
					this.field3608 = var5; // L: 243
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 247
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) { // L: 248
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) { // L: 249
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4); // L: 250
			}

			return var21; // L: 251
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lkq;",
		garbageValue = "-468638043"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 255
			return VerticalAlignment.getNpcDefinition(this.npcTransformId).method3696((class187)null); // L: 256
		} else {
			boolean var1 = false; // L: 258

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 259
				var3 = this.equipment[var2]; // L: 260
				if (var3 >= 256 && var3 < 512 && !class1.KitDefinition_get(var3 - 256).method3607()) { // L: 261 262
					var1 = true;
				}

				if (var3 >= 512 && !class214.ItemComposition_get(var3 - 512).method3960(this.field3600)) { // L: 264 265
					var1 = true;
				}
			}

			if (var1) { // L: 268
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 269
				var3 = 0; // L: 270

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 271
					var5 = this.equipment[var4]; // L: 272
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 273
						var6 = class1.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 274
						if (var6 != null) { // L: 275
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 277
						var6 = class214.ItemComposition_get(var5 - 512).method3986(this.field3600); // L: 278
						if (var6 != null) { // L: 279
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 282

				for (var5 = 0; var5 < 5; ++var5) { // L: 283
					if (this.bodyColors[var5] < class90.field1094[var5].length) { // L: 284
						var8.recolor(WorldMapLabelSize.field2440[var5], class90.field1094[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3606[var5].length) { // L: 285
						var8.recolor(class503.field5015[var5], field3606[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 287
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1257035370"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash; // L: 291
		if (this.npcTransformId != -1) { // L: 292
			var1 = -65536L | (long)this.npcTransformId; // L: 293
		}

		Integer var3 = (Integer)archive10.method8022(var1); // L: 295
		if (var3 == null) { // L: 296
			var3 = ++field3611 - 1; // L: 297
			archive10.method8037(var1, var3); // L: 298
			field3611 %= 65535; // L: 299
		}

		return var3; // L: 301
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1823719371"
	)
	void method6323() {
		this.method6314(this.field3596, this.equipment, this.bodyColors, this.field3600, this.npcTransformId); // L: 305
	} // L: 306

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "21"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4655
		class92.method2447(); // L: 4656
		class320.method6188(); // L: 4657
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4659
			AccessFile.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4660
		}

		class18.addNpcsToScene(true); // L: 4663
		int var4 = Players.Players_count; // L: 4665
		int[] var5 = Players.Players_indices; // L: 4666

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4667
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4668
				AccessFile.addPlayerToScene(Client.players[var5[var6]], true); // L: 4669
			}
		}

		class18.addNpcsToScene(false); // L: 4672
		class327.method6247(); // L: 4673

		for (GraphicsObject var36 = (GraphicsObject)Client.graphicsObjects.last(); var36 != null; var36 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4675 4676 4683
			if (var36.plane == ItemLayer.Client_plane && !var36.isFinished) { // L: 4677
				if (Client.cycle >= var36.cycleStart) { // L: 4678
					var36.advance(Client.field564); // L: 4679
					if (var36.isFinished) { // L: 4680
						var36.remove();
					} else {
						class36.scene.drawEntity(var36.plane, var36.x, var36.y, var36.z, 60, var36, 0, -1L, false); // L: 4681
					}
				}
			} else {
				var36.remove();
			}
		}

		class348.setViewportShape(var0, var1, var2, var3, true); // L: 4686
		var0 = Client.viewportOffsetX; // L: 4687
		var1 = Client.viewportOffsetY; // L: 4688
		var2 = Client.viewportWidth; // L: 4689
		var3 = Client.viewportHeight; // L: 4690
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4691
		Rasterizer3D.method5203(); // L: 4692
		Rasterizer2D.method9630(); // L: 4693
		var4 = Client.camAngleX; // L: 4694
		if (Client.field759 / 256 > var4) { // L: 4695
			var4 = Client.field759 / 256;
		}

		if (Client.field755[4] && Client.field704[4] + 128 > var4) { // L: 4696
			var4 = Client.field704[4] + 128;
		}

		int var37 = Client.camAngleY & 2047; // L: 4697
		var6 = LoginScreenAnimation.oculusOrbFocalPointX; // L: 4698
		int var7 = class12.field56; // L: 4699
		int var8 = ScriptFrame.oculusOrbFocalPointY; // L: 4700
		int var9 = class158.method3414(var4); // L: 4701
		var9 = class395.method7401(var9, var3); // L: 4703
		int var10 = 2048 - var4 & 2047; // L: 4704
		int var11 = 2048 - var37 & 2047; // L: 4705
		int var12 = 0; // L: 4706
		int var13 = 0; // L: 4707
		int var14 = var9; // L: 4708
		int var15;
		int var16;
		int var17;
		if (var10 != 0) { // L: 4709
			var15 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 4710
			var16 = Rasterizer3D.Rasterizer3D_cosine[var10]; // L: 4711
			var17 = var16 * var13 - var9 * var15 >> 16; // L: 4712
			var14 = var16 * var9 + var15 * var13 >> 16; // L: 4713
			var13 = var17; // L: 4714
		}

		if (var11 != 0) { // L: 4716
			var15 = Rasterizer3D.Rasterizer3D_sine[var11]; // L: 4717
			var16 = Rasterizer3D.Rasterizer3D_cosine[var11]; // L: 4718
			var17 = var16 * var12 + var14 * var15 >> 16; // L: 4719
			var14 = var16 * var14 - var12 * var15 >> 16; // L: 4720
			var12 = var17; // L: 4721
		}

		if (Client.isCameraLocked) { // L: 4723
			FloorOverlayDefinition.field2194 = var6 - var12; // L: 4724
			class323.field3490 = var7 - var13; // L: 4725
			Projectile.field937 = var8 - var14; // L: 4726
			class127.field1494 = var4; // L: 4727
			CollisionMap.field2370 = var37; // L: 4728
		} else {
			ViewportMouse.cameraX = var6 - var12; // L: 4731
			SecureRandomFuture.cameraY = var7 - var13; // L: 4732
			class36.cameraZ = var8 - var14; // L: 4733
			Varcs.cameraPitch = var4; // L: 4734
			class192.cameraYaw = var37; // L: 4735
		}

		if (Client.titleLoadingStage == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (LoginScreenAnimation.oculusOrbFocalPointX >> 7 != class229.localPlayer.x >> 7 || ScriptFrame.oculusOrbFocalPointY >> 7 != class229.localPlayer.y >> 7)) { // L: 4737 4738
			var15 = class229.localPlayer.plane; // L: 4739
			var16 = class187.baseX * 64 + (LoginScreenAnimation.oculusOrbFocalPointX >> 7); // L: 4740
			var17 = class101.baseY * 64 + (ScriptFrame.oculusOrbFocalPointY >> 7); // L: 4741
			PacketBufferNode var18 = class113.getPacketBufferNode(ClientPacket.field3223, Client.packetWriter.isaacCipher); // L: 4744
			var18.packetBuffer.writeInt(Client.field584); // L: 4745
			var18.packetBuffer.method9300(var16); // L: 4746
			var18.packetBuffer.method9300(var17); // L: 4747
			var18.packetBuffer.writeByte(var15); // L: 4748
			Client.packetWriter.addNode(var18); // L: 4749
		}

		if (!Client.isCameraLocked) { // L: 4755
			var10 = class306.method5913();
		} else {
			if (WorldMapIcon_1.clientPreferences.method2541()) { // L: 4759
				var11 = ItemLayer.Client_plane; // L: 4760
			} else {
				var12 = WorldMapDecorationType.getTileHeight(ViewportMouse.cameraX, class36.cameraZ, ItemLayer.Client_plane); // L: 4763
				if (var12 - SecureRandomFuture.cameraY < 800 && (Tiles.Tiles_renderFlags[ItemLayer.Client_plane][ViewportMouse.cameraX >> 7][class36.cameraZ >> 7] & 4) != 0) { // L: 4764
					var11 = ItemLayer.Client_plane; // L: 4765
				} else {
					var11 = 3; // L: 4768
				}
			}

			var10 = var11; // L: 4770
		}

		var11 = ViewportMouse.cameraX; // L: 4772
		var12 = SecureRandomFuture.cameraY; // L: 4773
		var13 = class36.cameraZ; // L: 4774
		var14 = Varcs.cameraPitch; // L: 4775
		var15 = class192.cameraYaw; // L: 4776

		for (var16 = 0; var16 < 5; ++var16) { // L: 4777
			if (Client.field755[var16]) { // L: 4778
				var17 = (int)(Math.random() * (double)(Client.field756[var16] * 2 + 1) - (double)Client.field756[var16] + Math.sin((double)Client.field728[var16] * ((double)Client.field758[var16] / 100.0D)) * (double)Client.field704[var16]); // L: 4779
				if (var16 == 0) { // L: 4780
					ViewportMouse.cameraX += var17;
				}

				if (var16 == 1) { // L: 4781
					SecureRandomFuture.cameraY += var17;
				}

				if (var16 == 2) { // L: 4782
					class36.cameraZ += var17;
				}

				if (var16 == 3) { // L: 4783
					class192.cameraYaw = var17 + class192.cameraYaw & 2047;
				}

				if (var16 == 4) { // L: 4784
					Varcs.cameraPitch += var17; // L: 4785
					if (Varcs.cameraPitch < 128) { // L: 4786
						Varcs.cameraPitch = 128;
					}

					if (Varcs.cameraPitch > 383) { // L: 4787
						Varcs.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x; // L: 4791
		var17 = MouseHandler.MouseHandler_y; // L: 4792
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 4793
			var16 = MouseHandler.MouseHandler_lastPressedX; // L: 4794
			var17 = MouseHandler.MouseHandler_lastPressedY; // L: 4795
		}

		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) { // L: 4797
			class301.method5905(var16 - var0, var17 - var1); // L: 4798
		} else {
			class410.method7802(); // L: 4801
		}

		class102.method2728(); // L: 4803
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4804
		class102.method2728(); // L: 4805
		int var38 = Rasterizer3D.method5200(); // L: 4806
		Rasterizer3D.method5189(SpriteMask.client.field170); // L: 4807
		Rasterizer3D.field2772.field3041 = Client.viewportZoom; // L: 4808
		class36.scene.draw(ViewportMouse.cameraX, SecureRandomFuture.cameraY, class36.cameraZ, Varcs.cameraPitch, class192.cameraYaw, var10); // L: 4809
		Rasterizer3D.method5189(false); // L: 4810
		if (Client.renderSelf) { // L: 4811
			Rasterizer2D.method9664(); // L: 4812
		}

		Rasterizer3D.field2772.field3041 = var38; // L: 4814
		class102.method2728(); // L: 4815
		class36.scene.clearTempGameObjects(); // L: 4816
		Client.field780 = 0; // L: 4818
		boolean var19 = false; // L: 4819
		int var20 = -1; // L: 4820
		int var21 = -1; // L: 4821
		int var22 = Players.Players_count; // L: 4822
		int[] var23 = Players.Players_indices; // L: 4823

		int var24;
		for (var24 = 0; var24 < var22 + Client.npcCount; ++var24) { // L: 4824
			Object var40;
			if (var24 < var22) { // L: 4826
				var40 = Client.players[var23[var24]]; // L: 4827
				if (var23[var24] == Client.combatTargetPlayerIndex) { // L: 4828
					var19 = true; // L: 4829
					var20 = var24; // L: 4830
					continue;
				}

				if (var40 == class229.localPlayer) { // L: 4833
					var21 = var24; // L: 4834
					continue; // L: 4835
				}
			} else {
				var40 = Client.npcs[Client.npcIndices[var24 - var22]]; // L: 4838
			}

			class171.drawActor2d((Actor)var40, var24, var0, var1, var2, var3); // L: 4839
		}

		if (Client.field615 && var21 != -1) { // L: 4841
			class171.drawActor2d(class229.localPlayer, var21, var0, var1, var2, var3); // L: 4842
		}

		if (var19) { // L: 4844
			class171.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var20, var0, var1, var2, var3); // L: 4845
		}

		for (var24 = 0; var24 < Client.field780; ++var24) { // L: 4847
			int var25 = Client.field591[var24]; // L: 4848
			int var26 = Client.field592[var24]; // L: 4849
			int var27 = Client.field594[var24]; // L: 4850
			int var28 = Client.field734[var24]; // L: 4851
			boolean var29 = true; // L: 4852

			while (var29) {
				var29 = false; // L: 4854

				for (int var39 = 0; var39 < var24; ++var39) { // L: 4855
					if (var26 + 2 > Client.field592[var39] - Client.field734[var39] && var26 - var28 < Client.field592[var39] + 2 && var25 - var27 < Client.field594[var39] + Client.field591[var39] && var27 + var25 > Client.field591[var39] - Client.field594[var39] && Client.field592[var39] - Client.field734[var39] < var26) { // L: 4856 4857
						var26 = Client.field592[var39] - Client.field734[var39]; // L: 4858
						var29 = true; // L: 4859
					}
				}
			}

			Client.viewportTempX = Client.field591[var24]; // L: 4864
			Client.viewportTempY = Client.field592[var24] = var26; // L: 4865
			String var30 = Client.field599[var24]; // L: 4866
			if (Client.chatEffects == 0) { // L: 4867
				int var31 = 16776960; // L: 4868
				if (Client.field721[var24] < 6) { // L: 4869
					var31 = Client.field483[Client.field721[var24]];
				}

				if (Client.field721[var24] == 6) { // L: 4870
					var31 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field721[var24] == 7) { // L: 4871
					var31 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field721[var24] == 8) { // L: 4872
					var31 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var32;
				if (Client.field721[var24] == 9) { // L: 4873
					var32 = 150 - Client.field598[var24]; // L: 4874
					if (var32 < 50) { // L: 4875
						var31 = var32 * 1280 + 16711680;
					} else if (var32 < 100) { // L: 4876
						var31 = 16776960 - (var32 - 50) * 327680;
					} else if (var32 < 150) { // L: 4877
						var31 = (var32 - 100) * 5 + 65280;
					}
				}

				if (Client.field721[var24] == 10) { // L: 4879
					var32 = 150 - Client.field598[var24]; // L: 4880
					if (var32 < 50) { // L: 4881
						var31 = var32 * 5 + 16711680;
					} else if (var32 < 100) { // L: 4882
						var31 = 16711935 - (var32 - 50) * 327680;
					} else if (var32 < 150) { // L: 4883
						var31 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
					}
				}

				if (Client.field721[var24] == 11) { // L: 4885
					var32 = 150 - Client.field598[var24]; // L: 4886
					if (var32 < 50) { // L: 4887
						var31 = 16777215 - var32 * 327685;
					} else if (var32 < 100) { // L: 4888
						var31 = (var32 - 50) * 327685 + 65280;
					} else if (var32 < 150) { // L: 4889
						var31 = 16777215 - (var32 - 100) * 327680;
					}
				}

				int var33;
				if (Client.field721[var24] == 12 && Client.field597[var24] == null) { // L: 4891 4892
					var32 = var30.length(); // L: 4893
					Client.field597[var24] = new int[var32]; // L: 4894

					for (var33 = 0; var33 < var32; ++var33) { // L: 4895
						int var34 = (int)((float)var33 / (float)var32 * 64.0F); // L: 4896
						int var35 = var34 << 10 | 896 | 64; // L: 4897
						Client.field597[var24][var33] = class478.field4836[var35]; // L: 4898
					}
				}

				if (Client.field596[var24] == 0) { // L: 4902
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7678(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.field597[var24]);
				}

				if (Client.field596[var24] == 1) { // L: 4903
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7709(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, Client.field597[var24]);
				}

				if (Client.field596[var24] == 2) { // L: 4904
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7676(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, Client.field597[var24]);
				}

				if (Client.field596[var24] == 3) { // L: 4905
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7677(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, 150 - Client.field598[var24], Client.field597[var24]);
				}

				if (Client.field596[var24] == 4) { // L: 4906
					var32 = (150 - Client.field598[var24]) * (GrandExchangeOfferTotalQuantityComparator.fontBold12.stringWidth(var30) + 100) / 150; // L: 4907
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4908
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7679(var30, var0 + Client.viewportTempX + 50 - var32, Client.viewportTempY + var1, var31, 0, Client.field597[var24]); // L: 4909
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4910
				}

				if (Client.field596[var24] == 5) { // L: 4912
					var32 = 150 - Client.field598[var24]; // L: 4913
					var33 = 0; // L: 4914
					if (var32 < 25) { // L: 4915
						var33 = var32 - 25;
					} else if (var32 > 125) { // L: 4916
						var33 = var32 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - GrandExchangeOfferTotalQuantityComparator.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4917
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7678(var30, var0 + Client.viewportTempX, var33 + Client.viewportTempY + var1, var31, 0, Client.field597[var24]); // L: 4918
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4919
				}
			} else {
				GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4923
			}
		}

		if (Client.hintArrowType == 2) { // L: 4928
			class514.worldToScreen(Client.field512 * 64 + (Client.field509 - class187.baseX * 64 << 7), (Client.field510 - class101.baseY * 64 << 7) + Client.field513 * 4096, Client.field511 * 4); // L: 4929
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4930
				class60.field420[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.field2772.Rasterizer3D_textureLoader).animate(Client.field564); // L: 4932
		Client.field736 = 0; // L: 4935
		int var41 = class187.baseX * 64 + (class229.localPlayer.x >> 7); // L: 4936
		var20 = class101.baseY * 64 + (class229.localPlayer.y >> 7); // L: 4937
		if (var41 >= 3053 && var41 <= 3156 && var20 >= 3056 && var20 <= 3136) { // L: 4938
			Client.field736 = 1;
		}

		if (var41 >= 3072 && var41 <= 3118 && var20 >= 9492 && var20 <= 9535) { // L: 4939
			Client.field736 = 1;
		}

		if (Client.field736 == 1 && var41 >= 3139 && var41 <= 3199 && var20 >= 3008 && var20 <= 3062) { // L: 4940
			Client.field736 = 0;
		}

		ViewportMouse.cameraX = var11; // L: 4943
		SecureRandomFuture.cameraY = var12; // L: 4944
		class36.cameraZ = var13; // L: 4945
		Varcs.cameraPitch = var14; // L: 4946
		class192.cameraYaw = var15; // L: 4947
		if (Client.field498 && WorldMapSectionType.field2556.method7052(true, false) == 0) { // L: 4948
			Client.field498 = false;
		}

		if (Client.field498) { // L: 4949
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4950
			LoginPacket.drawLoadingMessage("Loading - please wait.", false); // L: 4951
		}

	} // L: 4953
}
