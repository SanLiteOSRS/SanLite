import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ay")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("PlayerComposition_cachedModels")
	public static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("aj")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("al")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -25773693
	)
	public int field3461;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1628771057
	)
	public int field3464;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 464846559
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 8656154274683595361L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 5668896369310599269L
	)
	long field3463;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	class180[] field3466;
	@ObfuscatedName("ap")
	boolean field3469;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		this.field3461 = -1; // L: 16
		this.field3464 = 0; // L: 17
		this.field3469 = false; // L: 22
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([I[Lgv;Z[IIIII)V",
		garbageValue = "662366071"
	)
	public void method5792(int[] var1, class180[] var2, boolean var3, int[] var4, int var5, int var6, int var7) {
		this.field3466 = var2;
		this.field3469 = var3;
		this.field3461 = var7;
		this.method5784(var1, var4, var5, var6);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-1988594317"
	)
	public void method5784(int[] var1, int[] var2, int var3, int var4) {
		if (var1 == null) {
			var1 = new int[12]; // L: 39

			for (int var5 = 0; var5 < 7; ++var5) { // L: 40
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) { // L: 41
					KitDefinition var7 = class395.KitDefinition_get(var6); // L: 42
					if (var7 != null && !var7.nonSelectable && var5 + (var3 == 1 ? 7 : 0) == var7.bodypartID) {
						var1[equipmentIndices[var5]] = var6 + 256;
						break;
					}
				}
			}
		}

		this.equipment = var1;
		this.bodyColors = var2;
		this.field3464 = var3;
		this.npcTransformId = var4;
		this.setHash(); // L: 54
	} // L: 55

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-542295271"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || this.field3464 != 1) {
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
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0; // L: 69
						}
					}

					var4 = class395.KitDefinition_get(var3); // L: 71
				} while(var4 == null || var4.nonSelectable || (this.field3464 == 1 ? 7 : 0) + var1 != var4.bodypartID); // L: 72

				this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 74
				this.setHash(); // L: 75
			}
		}
	} // L: 76

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "54"
	)
	public void method5786(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 79
		boolean var4;
		if (!var2) { // L: 80
			do {
				--var3; // L: 82
				if (var3 < 0) { // L: 83
					var3 = CollisionMap.field2315[var1].length - 1; // L: 84
				}

				if (var1 == 4 && var3 >= 8) { // L: 88
					var4 = false; // L: 89
				} else {
					var4 = true; // L: 92
				}
			} while(!var4); // L: 94
		} else {
			do {
				++var3; // L: 99
				if (var3 >= CollisionMap.field2315[var1].length) { // L: 100
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) { // L: 103
					var4 = false; // L: 104
				} else {
					var4 = true; // L: 107
				}
			} while(!var4); // L: 109
		}

		this.bodyColors[var1] = var3; // L: 112
		this.setHash(); // L: 113
	} // L: 114

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-245090985"
	)
	public void method5787(int var1) {
		if (this.field3464 != var1) { // L: 117
			this.method5784((int[])null, this.bodyColors, var1, -1); // L: 118
		}
	} // L: 119

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsy;B)V",
		garbageValue = "18"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3464); // L: 122

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 123
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 124
			if (var3 == 0) { // L: 125
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256); // L: 126
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 128
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 129

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 132
		int var3 = this.equipment[5]; // L: 133
		int var4 = this.equipment[9]; // L: 134
		this.equipment[5] = var4; // L: 135
		this.equipment[9] = var3; // L: 136
		this.hash = 0L; // L: 137

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 138
			this.hash <<= 4; // L: 139
			if (this.equipment[var5] >= 256) { // L: 140
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 142
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 143
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 144
			this.hash <<= 3; // L: 145
			this.hash += (long)this.bodyColors[var5]; // L: 146
		}

		this.hash <<= 1; // L: 148
		this.hash += -1628771057L * (long)(this.field3464 * -410623505); // L: 149
		this.equipment[5] = var3; // L: 150
		this.equipment[9] = var4; // L: 151
		if (0L != var1 && this.hash != var1 || this.field3469) { // L: 152
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 153

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhx;ILhx;II)Lix;",
		garbageValue = "-1414560036"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 156
			return class188.getNpcDefinition(this.npcTransformId).method3669(var1, var2, var3, var4, (class191)null); // L: 157
		} else {
			long var5 = this.hash; // L: 159
			int[] var7 = this.equipment; // L: 160
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 161
				var7 = new int[12]; // L: 162

				for (int var8 = 0; var8 < 12; ++var8) { // L: 163
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 164
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 165
					var7[5] = var1.shield; // L: 166
				}

				if (var1.weapon >= 0) { // L: 168
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 169
					var7[3] = var1.weapon; // L: 170
				}
			}

			Model var18 = (Model)PlayerComposition_cachedModels.get(var5); // L: 173
			if (var18 == null) { // L: 174
				boolean var9 = false; // L: 175

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 176
					var11 = var7[var10]; // L: 177
					if (var11 >= 256 && var11 < 512 && !class395.KitDefinition_get(var11 - 256).ready()) { // L: 178 179
						var9 = true;
					}

					if (var11 >= 512 && !ParamComposition.ItemComposition_get(var11 - 512).method3918(this.field3464)) { // L: 181 182
						var9 = true;
					}
				}

				if (var9) { // L: 185
					if (this.field3463 != -1L) { // L: 186
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3463);
					}

					if (var18 == null) { // L: 187
						return null;
					}
				}

				if (var18 == null) { // L: 189
					ModelData[] var19 = new ModelData[12]; // L: 190
					var11 = 0; // L: 191

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 192
						var13 = var7[var12]; // L: 193
						if (var13 >= 256 && var13 < 512) { // L: 194
							ModelData var14 = class395.KitDefinition_get(var13 - 256).getModelData(); // L: 195
							if (var14 != null) { // L: 196
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 198
							ItemComposition var22 = ParamComposition.ItemComposition_get(var13 - 512); // L: 199
							ModelData var15 = var22.method3919(this.field3464); // L: 200
							if (var15 != null) { // L: 201
								if (this.field3466 != null) { // L: 202
									class180 var16 = this.field3466[var12]; // L: 203
									if (var16 != null) { // L: 204
										int var17;
										if (var16.field1871 != null && var22.recolorFrom != null && var16.field1871.length == var22.recolorTo.length) { // L: 205
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 206
												var15.recolor(var22.recolorTo[var17], var16.field1871[var17]); // L: 207
											}
										}

										if (var16.field1872 != null && var22.retextureFrom != null && var22.retextureTo.length == var16.field1872.length) { // L: 210
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 211
												var15.retexture(var22.retextureTo[var17], var16.field1872[var17]); // L: 212
											}
										}
									}
								}

								var19[var11++] = var15; // L: 217
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < CollisionMap.field2315[var13].length) {
							var20.recolor(class308.field3457[var13], CollisionMap.field2315[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class126.field1495[var13].length) { // L: 224
							var20.recolor(class128.field1529[var13], class126.field1495[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 226
					PlayerComposition_cachedModels.put(var18, var5);
					this.field3463 = var5;
				}
			}

			Model var21;
			if (var1 == null && var3 == null) { // L: 232
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) {
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) {
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4);
			}

			return var21;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Liu;",
		garbageValue = "-1742868640"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class188.getNpcDefinition(this.npcTransformId).method3670((class191)null);
		} else {
			boolean var1 = false; // L: 243

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 244
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !class395.KitDefinition_get(var3 - 256).method3608()) {
					var1 = true;
				}

				if (var3 >= 512 && !ParamComposition.ItemComposition_get(var3 - 512).method3920(this.field3464)) { // L: 250
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var7 = new ModelData[12];
				var3 = 0; // L: 255

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var6;
					if (var5 >= 256 && var5 < 512) {
						var6 = class395.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = ParamComposition.ItemComposition_get(var5 - 512).method3921(this.field3464);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < CollisionMap.field2315[var5].length) { // L: 269
						var8.recolor(class308.field3457[var5], CollisionMap.field2315[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class126.field1495[var5].length) {
						var8.recolor(class128.field1529[var5], class126.field1495[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1033760523"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class188.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILsy;B)Lgv;",
		garbageValue = "16"
	)
	public static class180 method5812(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class180 var5 = new class180(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1871 != null && var7.length == var5.field1871.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1871[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1872 != null && var7.length == var5.field1872.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1872[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;ZII)V",
		garbageValue = "-17062513"
	)
	static void method5782(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 221
			if (var3 == 4) { // L: 222
				class14.method173(4); // L: 223
			}

		} else {
			if (var3 == 0) { // L: 227
				KeyHandler.method426(var2); // L: 228
			} else {
				class14.method173(var3); // L: 231
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 233
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 234
			Login.leftTitleSprite = class139.method3105(var4); // L: 235
			class419.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally(); // L: 236
			class269.method5378(var1, Client.worldProperties); // L: 237
			WorldMapSprite.titleboxSprite = class368.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 238
			Login.field912 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 239
			GrandExchangeOfferOwnWorldComparator.field478 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 240
			class72.field882 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 241
			class368.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 242
			int var6 = var1.getGroupId("runes"); // L: 245
			int var7 = var1.getFileId(var6, ""); // L: 246
			IndexedSprite[] var5 = class456.method8334(var1, var6, var7); // L: 247
			Login.field888 = var5; // L: 249
			var7 = var1.getGroupId("title_mute"); // L: 252
			int var8 = var1.getFileId(var7, ""); // L: 253
			IndexedSprite[] var9 = class456.method8334(var1, var7, var8); // L: 254
			class139.title_muteSprite = var9; // L: 256
			Login.field892 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 257
			ArchiveLoader.field1017 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 258
			Login.field904 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 259
			KitDefinition.field1941 = class368.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 260
			Message.field466 = Login.field892.subWidth; // L: 261
			class465.field4857 = Login.field892.subHeight; // L: 262
			ArchiveDiskActionHandler.loginScreenRunesAnimation = new LoginScreenAnimation(Login.field888); // L: 263
			if (var2) { // L: 264
				Login.Login_username = ""; // L: 265
				Login.Login_password = ""; // L: 266
				Login.field908 = new String[8]; // L: 267
				Login.field909 = 0; // L: 268
			}

			FriendSystem.field800 = 0; // L: 270
			NetFileRequest.otp = ""; // L: 271
			Login.field914 = true; // L: 272
			Login.worldSelectOpen = false; // L: 273
			if (!WorldMapSectionType.clientPreferences.method2445()) { // L: 274
				NPC.method2620(2, class308.archive6, "scape main", "", 255, false);
			} else {
				class293.musicPlayerStatus = 1; // L: 276
				class364.musicTrackArchive = null; // L: 277
				IntHashTable.musicTrackGroupId = -1; // L: 278
				class293.musicTrackFileId = -1; // L: 279
				class368.musicTrackVolume = 0; // L: 280
				class293.musicTrackBoolean = false; // L: 281
				AbstractRasterProvider.pcmSampleLength = 2; // L: 282
			}

			class166.method3383(false); // L: 284
			Login.clearLoginScreen = true; // L: 285
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 286
			Login.loginBoxX = Login.xPadding + 202; // L: 287
			Login.loginBoxCenter = Login.loginBoxX + 180; // L: 288
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 289
			class419.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 290
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 291
		}
	} // L: 225 292

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1026409589"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 147
	}
}
