import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("aa")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("PlayerComposition_cachedModels")
	public static EvictingDualNodeHashTable PlayerComposition_cachedModels;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	static class424 field3571;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1229069893
	)
	static int field3562;
	@ObfuscatedName("aw")
	int[] field3566;
	@ObfuscatedName("ay")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ar")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1597545793
	)
	public int field3564;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 191395647
	)
	public int field3563;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -461294661
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -8882540548903026967L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -5539411647284932357L
	)
	long field3569;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lhv;"
	)
	class183[] field3567;
	@ObfuscatedName("ap")
	boolean field3568;

	static {
		equipmentIndices = new int[]{class210.field2294.field2292, class210.field2297.field2292, class210.field2290.field2292, class210.field2301.field2292, class210.field2300.field2292, class210.field2293.field2292, class210.field2296.field2292}; // L: 32
		PlayerComposition_cachedModels = new EvictingDualNodeHashTable(260); // L: 35
		field3571 = new class424(16, class422.field4609); // L: 36
		field3562 = 0; // L: 37
	}

	public PlayerComposition() {
		this.field3564 = -1;
		this.field3563 = 0;
		this.field3568 = false;
	} // L: 39

	@ObfuscatedSignature(
		descriptor = "(Lmb;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3564 = -1; // L: 21
		this.field3563 = 0; // L: 22
		this.field3568 = false; // L: 27
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length); // L: 42
		int[] var3 = Arrays.copyOf(var1.field3566, var1.field3566.length); // L: 43
		class183[] var4 = (class183[])(var1.field3567 != null ? (class183[])Arrays.copyOf(var1.field3567, var1.field3567.length) : null); // L: 44
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length); // L: 45
		this.method6118(var3, var2, var4, false, var5, var1.field3563, var1.npcTransformId, var1.field3564); // L: 46
	} // L: 47

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lhv;Z[IIIII)V",
		garbageValue = "1828739510"
	)
	public void method6118(int[] var1, int[] var2, class183[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.field3567 = var3; // L: 50
		this.field3568 = var4; // L: 51
		this.field3564 = var8; // L: 52
		this.method6119(var1, var2, var5, var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "439535909"
	)
	public void method6119(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) { // L: 57
			var1 = this.method6120(var4); // L: 58
		}

		if (var2 == null) { // L: 60
			var2 = this.method6120(var4); // L: 61
		}

		this.field3566 = var1; // L: 63
		this.equipment = var2; // L: 64
		this.bodyColors = var3; // L: 65
		this.field3563 = var4; // L: 66
		this.npcTransformId = var5; // L: 67
		this.setHash(); // L: 68
	} // L: 69

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1012952291"
	)
	int[] method6120(int var1) {
		int[] var2 = new int[12]; // L: 72

		for (int var3 = 0; var3 < 7; ++var3) { // L: 73
			for (int var4 = 0; var4 < KitDefinition.field1939; ++var4) { // L: 75
				KitDefinition var5 = class132.KitDefinition_get(var4); // L: 76
				if (var5 != null && !var5.nonSelectable && var5.bodypartID == var3 + (var1 == 1 ? 7 : 0)) { // L: 77
					var2[equipmentIndices[var3]] = var4 + 256; // L: 78
					break; // L: 79
				}
			}
		}

		return var2; // L: 84
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-2138181432"
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
						var3 = KitDefinition.field1939 - 1; // L: 94
					}
				} else {
					++var3; // L: 97
					if (var3 >= KitDefinition.field1939) { // L: 98
						var3 = 0;
					}
				}

				var4 = class132.KitDefinition_get(var3); // L: 100
			} while(var4 == null || var4.nonSelectable || var1 + (this.field3563 == 1 ? 7 : 0) != var4.bodypartID); // L: 101

			this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 103
			this.setHash(); // L: 104
		}
	} // L: 105

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "953473118"
	)
	public void method6143(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 108
		boolean var4;
		if (!var2) { // L: 109
			do {
				--var3; // L: 111
				if (var3 < 0) { // L: 112
					var3 = ClanChannel.field1776[var1].length - 1; // L: 113
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
				if (var3 >= ClanChannel.field1776[var1].length) { // L: 129
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1643075322"
	)
	public void method6122(int var1) {
		if (this.field3563 != var1) { // L: 146
			this.method6119((int[])null, (int[])null, this.bodyColors, var1, -1); // L: 147
		}
	} // L: 148

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-1001147090"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.field3563); // L: 151

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 152
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 153
			if (var3 == 0) {
				var1.writeByte(-1); // L: 154
			} else {
				var1.writeByte(var3 - 256); // L: 155
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 157
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 158

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-11"
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
		this.hash += (long)(this.field3563 * -1913194305) * 191395647L; // L: 178
		this.equipment[5] = var3; // L: 179
		this.equipment[9] = var4; // L: 180
		if (0L != var1 && var1 != this.hash || this.field3568) { // L: 181
			PlayerComposition_cachedModels.remove(var1);
		}

	} // L: 182

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lig;ILig;IB)Ljo;",
		garbageValue = "-42"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 185
			return Tile.getNpcDefinition(this.npcTransformId).method3704(var1, var2, var3, var4, (class194)null); // L: 186
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
					if (var11 >= 256 && var11 < 512 && !class132.KitDefinition_get(var11 - 256).ready()) { // L: 207 208
						var9 = true;
					}

					if (var11 >= 512 && !class125.ItemComposition_get(var11 - 512).method4040(this.field3563)) { // L: 210 211
						var9 = true;
					}
				}

				if (var9) { // L: 214
					if (-1L != this.field3569) { // L: 215
						var18 = (Model)PlayerComposition_cachedModels.get(this.field3569);
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
							ModelData var14 = class132.KitDefinition_get(var13 - 256).getModelData(); // L: 224
							if (var14 != null) { // L: 225
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 227
							ItemComposition var22 = class125.ItemComposition_get(var13 - 512); // L: 228
							ModelData var15 = var22.method3975(this.field3563); // L: 229
							if (var15 != null) { // L: 230
								if (this.field3567 != null) { // L: 231
									class183 var16 = this.field3567[var12]; // L: 232
									if (var16 != null) { // L: 233
										int var17;
										if (var16.field1888 != null && var22.recolorFrom != null && var22.recolorTo.length == var16.field1888.length) { // L: 234
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 235
												var15.recolor(var22.recolorTo[var17], var16.field1888[var17]); // L: 236
											}
										}

										if (var16.field1891 != null && var22.retextureFrom != null && var16.field1891.length == var22.retextureTo.length) { // L: 239
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 240
												var15.retexture(var22.retextureTo[var17], var16.field1891[var17]); // L: 241
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
						if (this.bodyColors[var13] < ClanChannel.field1776[var13].length) { // L: 252
							var20.recolor(class33.field196[var13], ClanChannel.field1776[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < WorldMapSectionType.field2980[var13].length) { // L: 253
							var20.recolor(ViewportMouse.field2762[var13], WorldMapSectionType.field2980[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 255
					PlayerComposition_cachedModels.put(var18, var5); // L: 256
					this.field3569 = var5; // L: 257
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lie;",
		garbageValue = "-734942912"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 269
			return Tile.getNpcDefinition(this.npcTransformId).method3709((class194)null); // L: 270
		} else {
			boolean var1 = false; // L: 272

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 273
				var3 = this.equipment[var2]; // L: 274
				if (var3 >= 256 && var3 < 512 && !class132.KitDefinition_get(var3 - 256).method3643()) { // L: 275 276
					var1 = true;
				}

				if (var3 >= 512 && !class125.ItemComposition_get(var3 - 512).method3976(this.field3563)) { // L: 278 279
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
						var6 = class132.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 288
						if (var6 != null) { // L: 289
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 291
						var6 = class125.ItemComposition_get(var5 - 512).method4027(this.field3563); // L: 292
						if (var6 != null) { // L: 293
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 296

				for (var5 = 0; var5 < 5; ++var5) { // L: 297
					if (this.bodyColors[var5] < ClanChannel.field1776[var5].length) { // L: 298
						var8.recolor(class33.field196[var5], ClanChannel.field1776[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < WorldMapSectionType.field2980[var5].length) { // L: 299
						var8.recolor(ViewportMouse.field2762[var5], WorldMapSectionType.field2980[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 301
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "295497"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash; // L: 305
		if (this.npcTransformId != -1) { // L: 306
			var1 = -65536L | (long)this.npcTransformId; // L: 307
		}

		Integer var3 = (Integer)field3571.method7829(var1); // L: 309
		if (var3 == null) { // L: 310
			var3 = ++field3562 - 1; // L: 311
			field3571.method7830(var1, var3); // L: 312
			field3562 %= 65535; // L: 313
		}

		return var3; // L: 315
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "481625166"
	)
	void method6128() {
		this.method6119(this.field3566, this.equipment, this.bodyColors, this.field3563, this.npcTransformId); // L: 319
	} // L: 320

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-121"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!TileItem.client.method1267() && !TileItem.client.isOtlTokenRequesterInitialized() && !TileItem.client.method1472()) { // L: 1125
			Login.Login_response1 = ""; // L: 1129
			Login.Login_response2 = "Enter your username/email & password."; // L: 1130
			Login.Login_response3 = ""; // L: 1131
			class328.method6115(2); // L: 1132
			if (var0) {
				Login.Login_password = ""; // L: 1133
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1135
				if (class150.clientPreferences.method2483() != null) { // L: 1136
					Login.Login_username = class150.clientPreferences.method2483(); // L: 1137
					Client.Login_isUsernameRemembered = true; // L: 1138
				} else {
					Client.Login_isUsernameRemembered = false; // L: 1140
				}
			}

			class395.method7331(); // L: 1142
		} else {
			class328.method6115(10); // L: 1126
		}
	} // L: 1127 1143
}
