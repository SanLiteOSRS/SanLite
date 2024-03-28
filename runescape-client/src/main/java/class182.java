import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hq")
public class class182 {
	@ObfuscatedName("ah")
	String field1928;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -587024587
	)
	int field1929;
	@ObfuscatedName("at")
	ArrayList field1934;
	@ObfuscatedName("an")
	ArrayList field1931;
	@ObfuscatedName("ao")
	ArrayList field1930;
	@ObfuscatedName("ab")
	String field1932;
	@ObfuscatedName("aw")
	float[] field1927;
	@ObfuscatedName("ad")
	Map field1935;
	@ObfuscatedName("al")
	Map field1936;

	class182() {
		this.field1929 = 0; // L: 17
		this.field1934 = new ArrayList(); // L: 18
		this.field1931 = new ArrayList(); // L: 19
		this.field1930 = new ArrayList(); // L: 20
		this.field1932 = null; // L: 21
		this.field1927 = new float[4]; // L: 22
		this.field1935 = new HashMap(); // L: 23
		this.field1936 = new HashMap(); // L: 24
	} // L: 26

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-991755602"
	)
	String method3597() {
		return this.field1928; // L: 29
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1668433026"
	)
	int method3598() {
		return this.field1929; // L: 33
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1140566683"
	)
	void method3601() {
		this.field1932 = null; // L: 37
		this.field1927[0] = 0.0F; // L: 38
		this.field1927[1] = 0.0F; // L: 39
		this.field1927[2] = 1.0F; // L: 40
		this.field1927[3] = 1.0F; // L: 41
		this.field1934.clear(); // L: 42
		this.field1931.clear(); // L: 43
		this.field1930.clear(); // L: 44
		this.field1935.clear(); // L: 45
		this.field1936.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILea;S)Z",
		garbageValue = "-9790"
	)
	boolean method3632(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1; // L: 50
		if (var2 < 2) { // L: 51
			try {
				var4 = var4.getJSONObject("message"); // L: 53
			} catch (Exception var13) { // L: 55
				this.method3601(); // L: 56
				return false; // L: 57
			}

			try {
				this.method3634(var4.getJSONArray("images"), var3); // L: 60
			} catch (Exception var12) { // L: 62
				this.field1931.clear(); // L: 63
			}

			try {
				this.method3603(var4.getJSONArray("labels")); // L: 66
			} catch (Exception var11) { // L: 68
				this.field1930.clear(); // L: 69
			}
		} else {
			try {
				this.method3602(var4.getJSONObject("image"), var3); // L: 74
			} catch (Exception var10) { // L: 76
				this.field1931.clear(); // L: 77
			}

			try {
				this.method3610(var4.getJSONObject("label")); // L: 80
			} catch (Exception var9) { // L: 82
				this.field1930.clear(); // L: 83
			}
		}

		try {
			this.method3622(var4.getJSONObject("behaviour")); // L: 87
		} catch (Exception var8) { // L: 89
			this.field1932 = null; // L: 90
			this.field1927[0] = 0.0F; // L: 91
			this.field1927[1] = 0.0F; // L: 92
			this.field1927[2] = 1.0F; // L: 93
			this.field1927[3] = 1.0F; // L: 94
			this.field1934.clear(); // L: 95
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta"); // L: 98
			if (var5 != null) { // L: 99
				this.method3605(var4.getJSONObject("meta")); // L: 100
			}
		} catch (Exception var7) { // L: 103
			this.field1935.clear(); // L: 104
			this.field1936.clear(); // L: 105
		}

		if (var2 == 2) { // L: 107
			try {
				this.field1928 = var4.getString("id"); // L: 109
				this.field1929 = Integer.parseInt(var4.getString("priority")); // L: 110
			} catch (Exception var6) { // L: 112
			}
		}

		return true; // L: 114
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lea;B)V",
		garbageValue = "1"
	)
	void method3634(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 118
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 119
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 121
					class172 var5 = new class172(this); // L: 122
					var5.field1859 = var2.request(new URL(var4.getString("src"))); // L: 123
					var5.field1857 = class143.method3147(var4, "placement"); // L: 124
					this.field1931.add(var5); // L: 125
				} catch (MalformedURLException var6) { // L: 127
				}
			}

		}
	} // L: 129

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lea;I)V",
		garbageValue = "-1108962694"
	)
	void method3602(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class172 var3 = new class172(this); // L: 133
			var3.field1859 = var2.request(new URL(var1.getString("src"))); // L: 134
			var3.field1857 = class143.method3147(var1, "placement"); // L: 135
			this.field1931.add(var3); // L: 136
		} catch (MalformedURLException var4) { // L: 138
		}

	} // L: 139

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-2078330414"
	)
	void method3603(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 142
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 143
				JSONObject var3 = var1.getJSONObject(var2); // L: 144
				class183 var4 = new class183(this); // L: 145
				var4.field1940 = var3.getString("text"); // L: 146
				String var7 = var3.getString("align_x"); // L: 149
				byte var6;
				if (var7.equals("centre")) { // L: 151
					var6 = 1; // L: 152
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 155
					var6 = 0; // L: 159
				} else {
					var6 = 2; // L: 156
				}

				var4.field1941 = var6; // L: 161
				String var10 = var3.getString("align_y"); // L: 164
				byte var9;
				if (var10.equals("centre")) { // L: 166
					var9 = 1; // L: 167
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 170
					var9 = 0; // L: 174
				} else {
					var9 = 2; // L: 171
				}

				var4.field1942 = var9; // L: 176
				var4.field1943 = var3.getInt("font"); // L: 177
				var4.field1938 = class143.method3147(var3, "placement"); // L: 178
				this.field1930.add(var4); // L: 179
			}

		}
	} // L: 181

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-95861413"
	)
	void method3610(JSONObject var1) throws JSONException {
		class183 var2 = new class183(this); // L: 184
		var2.field1940 = var1.optString("text"); // L: 185
		String var5 = var1.optString("align_x"); // L: 188
		byte var4;
		if (var5.equals("centre")) { // L: 190
			var4 = 1; // L: 191
		} else if (!var5.equals("bottom") && !var5.equals("right")) { // L: 194
			var4 = 0; // L: 198
		} else {
			var4 = 2; // L: 195
		}

		var2.field1941 = var4; // L: 200
		String var8 = var1.optString("align_y"); // L: 203
		byte var7;
		if (var8.equals("centre")) { // L: 205
			var7 = 1; // L: 206
		} else if (!var8.equals("bottom") && !var8.equals("right")) { // L: 209
			var7 = 0; // L: 213
		} else {
			var7 = 2; // L: 210
		}

		var2.field1942 = var7; // L: 215
		var2.field1943 = var1.optInt("font"); // L: 216
		var2.field1938 = class143.method3147(var1, "placement"); // L: 217
		this.field1930.add(var2); // L: 218
	} // L: 219

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-777241744"
	)
	void method3622(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 222
			this.field1927 = class143.method3147(var1, "clickbounds"); // L: 223
			this.field1932 = var1.getString("endpoint"); // L: 224
			String[] var2 = JSONObject.getNames(var1); // L: 225

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 226
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 227
					try {
						int var4 = var1.getInt(var2[var3]); // L: 229
						this.field1934.add(new class170(this, var2[var3], var4)); // L: 230
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 234
							if (var5.equals("true")) { // L: 235
								this.field1934.add(new class170(this, var2[var3], 1)); // L: 236
							} else if (var5.equals("false")) { // L: 238
								this.field1934.add(new class170(this, var2[var3], 0)); // L: 239
							} else {
								this.field1934.add(new class179(this, var2[var3], var5)); // L: 242
							}
						} catch (Exception var7) { // L: 245
						}
					}
				}
			}

		}
	} // L: 249

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-8"
	)
	void method3605(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 252

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 253
			try {
				int var4 = var1.optInt(var2[var3]); // L: 255
				this.field1935.put(var2[var3], var4); // L: 256
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]); // L: 260
					if (var5.equals("true")) { // L: 261
						this.field1935.put(var2[var3], 1); // L: 262
					} else if (var5.equals("false")) { // L: 264
						this.field1935.put(var2[var3], 0); // L: 265
					} else {
						this.field1936.put(var2[var3], var5); // L: 268
					}
				} catch (Exception var7) { // L: 271
				}
			}
		}

	} // L: 274

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldi;III)V",
		garbageValue = "334529676"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4570
			int var3 = DevicePcmPlayerProvider.SequenceDefinition_get(var1).field2396; // L: 4571
			if (var3 == 1) { // L: 4572
				var0.sequenceFrame = 0; // L: 4573
				var0.sequenceFrameCycle = 0; // L: 4574
				var0.sequenceDelay = var2; // L: 4575
				var0.field1248 = 0; // L: 4576
			}

			if (var3 == 2) { // L: 4578
				var0.field1248 = 0; // L: 4579
			}
		} else if (var1 == -1 || var0.sequence == -1 || DevicePcmPlayerProvider.SequenceDefinition_get(var1).field2393 >= DevicePcmPlayerProvider.SequenceDefinition_get(var0.sequence).field2393) { // L: 4582
			var0.sequence = var1; // L: 4583
			var0.sequenceFrame = 0; // L: 4584
			var0.sequenceFrameCycle = 0; // L: 4585
			var0.sequenceDelay = var2; // L: 4586
			var0.field1248 = 0; // L: 4587
			var0.field1274 = var0.pathLength; // L: 4588
		}

	} // L: 4590

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIIB)V",
		garbageValue = "-123"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5253
			if (var0 instanceof NPC) { // L: 5254
				NPCComposition var6 = ((NPC)var0).definition; // L: 5255
				if (var6.transforms != null) { // L: 5256
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5257
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5259
			int[] var7 = Players.Players_indices; // L: 5260
			boolean var8 = var1 < var75; // L: 5261
			int var9 = -2; // L: 5262
			if (var0.overheadText != null && (!var8 || !var0.field1222 && (Client.publicChatMode == 4 || !var0.field1252 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).method2331())))) { // L: 5263 5264
				Varcs.method2753(var0, var0.defaultHeight); // L: 5265
				if (Client.viewportTempX > -1 && Client.field613 < Client.field614) { // L: 5266
					Client.field604[Client.field613] = DevicePcmPlayerProvider.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5267
					Client.field775[Client.field613] = DevicePcmPlayerProvider.fontBold12.ascent; // L: 5268
					Client.field615[Client.field613] = Client.viewportTempX; // L: 5269
					Client.field616[Client.field613] = Client.viewportTempY - var9; // L: 5270
					Client.field619[Client.field613] = var0.field1224; // L: 5271
					Client.field793[Client.field613] = var0.field1225; // L: 5272
					Client.field636[Client.field613] = var0.overheadTextCyclesRemaining; // L: 5273
					Client.field779[Client.field613] = var0.field1262; // L: 5274
					Client.field751[Client.field613] = var0.overheadText; // L: 5275
					++Client.field613; // L: 5276
					var9 += 12; // L: 5277
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7356()) { // L: 5281
				Varcs.method2753(var0, var0.defaultHeight + 15); // L: 5282

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5283
					HealthBarUpdate var11 = var10.get(Client.cycle); // L: 5284
					if (var11 == null) { // L: 5285
						if (var10.isEmpty()) { // L: 5343
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition; // L: 5286
						SpritePixels var79 = var12.method3814(); // L: 5287
						SpritePixels var83 = var12.method3811(); // L: 5288
						int var84 = 0; // L: 5290
						if (var79 != null && var83 != null) { // L: 5291
							if (var12.widthPadding * 2 < var83.subWidth) { // L: 5292
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2; // L: 5293
						} else {
							var15 = var12.width; // L: 5295
						}

						int var81 = 255; // L: 5296
						boolean var85 = true; // L: 5297
						int var86 = Client.cycle - var11.cycle; // L: 5298
						int var87 = var15 * var11.health2 / var12.width; // L: 5299
						int var88;
						int var98;
						if (var11.cycleOffset > var86) { // L: 5300
							var88 = var12.field2049 == 0 ? 0 : var12.field2049 * (var86 / var12.field2049); // L: 5301
							var22 = var15 * var11.health / var12.width; // L: 5302
							var98 = var88 * (var87 - var22) / var11.cycleOffset + var22; // L: 5303
						} else {
							var98 = var87; // L: 5306
							var88 = var11.cycleOffset + var12.int5 - var86; // L: 5307
							if (var12.int3 >= 0) { // L: 5308
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var98 < 1) { // L: 5310
							var98 = 1;
						}

						if (var79 != null && var83 != null) { // L: 5311
							if (var15 == var98) { // L: 5312
								var98 += var84 * 2;
							} else {
								var98 += var84; // L: 5313
							}

							var88 = var79.subHeight; // L: 5314
							var9 += var88; // L: 5315
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5316
							var23 = var3 + Client.viewportTempY - var9; // L: 5317
							var22 -= var84; // L: 5318
							if (var81 >= 0 && var81 < 255) { // L: 5319
								var79.drawTransAt(var22, var23, var81); // L: 5320
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var88 + var23); // L: 5321
								var83.drawTransAt(var22, var23, var81); // L: 5322
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5325
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88); // L: 5326
								var83.drawTransBgAt(var22, var23); // L: 5327
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5329
							var9 += 2; // L: 5330
						} else {
							var9 += 5; // L: 5333
							if (Client.viewportTempX > -1) { // L: 5334
								var88 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5335
								var22 = var3 + Client.viewportTempY - var9; // L: 5336
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280); // L: 5337
								Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var98, var22, var15 - var98, 5, 16711680); // L: 5338
							}

							var9 += 2; // L: 5340
						}
					}
				}
			}

			if (var9 == -2) { // L: 5346
				var9 += 7;
			}

			Player var89;
			if (var8 && var0.playerCycle == Client.cycle && class474.method8495((Player)var0)) { // L: 5347
				var89 = (Player)var0; // L: 5348
				if (var8) { // L: 5349
					Varcs.method2753(var0, var0.defaultHeight + 15); // L: 5350
					AbstractFont var90 = (AbstractFont)Client.field623.get(FontName.FontName_plain12); // L: 5351
					var9 += 4; // L: 5352
					var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5353
					var9 += 18; // L: 5354
				}
			}

			if (var8) { // L: 5357
				var89 = (Player)var0; // L: 5358
				if (var89.isHidden) { // L: 5359
					return;
				}

				if (var89.field1123 != -1 || var89.field1124 != -1) { // L: 5360
					Varcs.method2753(var0, var0.defaultHeight + 15); // L: 5361
					if (Client.viewportTempX > -1) { // L: 5362
						if (var89.field1123 != -1) { // L: 5363
							var9 += 25; // L: 5364
							class91.field1118[var89.field1123].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5365
						}

						if (var89.field1124 != -1) { // L: 5367
							var9 += 25; // L: 5368
							class334.field3621[var89.field1124].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5369
						}
					}
				}

				if (var1 >= 0 && Client.field529 == 10 && var7[var1] == Client.field531) { // L: 5373
					Varcs.method2753(var0, var0.defaultHeight + 15); // L: 5374
					if (Client.viewportTempX > -1) { // L: 5375
						var9 += class137.field1630[1].subHeight; // L: 5376
						class137.field1630[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5377
					}
				}
			} else {
				NPC var91 = (NPC)var0; // L: 5382
				int[] var92 = var91.method2612(); // L: 5383
				short[] var93 = var91.method2589(); // L: 5384
				if (var93 != null && var92 != null) { // L: 5385
					for (int var13 = 0; var13 < var93.length; ++var13) { // L: 5386
						if (var93[var13] >= 0 && var92[var13] >= 0) { // L: 5387
							long var14 = (long)var92[var13] << 8 | (long)var93[var13]; // L: 5390
							SpritePixels var16 = (SpritePixels)Client.field597.method8015(var14); // L: 5391
							if (var16 == null) { // L: 5392
								SpritePixels[] var17 = Player.method2379(GameEngine.field201, var92[var13], 0); // L: 5393
								if (var17 != null && var93[var13] < var17.length) { // L: 5394
									var16 = var17[var93[var13]]; // L: 5395
									Client.field597.method8008(var14, var16); // L: 5396
								}
							}

							if (var16 != null) { // L: 5399
								Varcs.method2753(var0, var0.defaultHeight + 15); // L: 5400
								if (Client.viewportTempX > -1) { // L: 5401
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5402
								}
							}
						}
					}
				}

				if (Client.field529 == 1 && Client.npcIndices[var1 - var75] == Client.field530 && Client.cycle % 20 < 10) { // L: 5407
					Varcs.method2753(var0, var0.defaultHeight + 15); // L: 5408
					if (Client.viewportTempX > -1) { // L: 5409
						class137.field1630[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) { // L: 5412
				int var77 = var0.hitSplatCycles[var76]; // L: 5413
				int var78 = var0.hitSplatTypes[var76]; // L: 5414
				HitSplatDefinition var96 = null; // L: 5415
				int var80 = 0; // L: 5416
				if (var78 >= 0) { // L: 5417
					if (var77 <= Client.cycle) { // L: 5418
						continue;
					}

					var96 = class193.method3723(var0.hitSplatTypes[var76]); // L: 5419
					var80 = var96.field2227; // L: 5420
					if (var96 != null && var96.transforms != null) { // L: 5421
						var96 = var96.transform(); // L: 5422
						if (var96 == null) { // L: 5423
							var0.hitSplatCycles[var76] = -1; // L: 5424
							continue; // L: 5425
						}
					}
				} else if (var77 < 0) { // L: 5429
					continue;
				}

				var15 = var0.hitSplatTypes2[var76]; // L: 5430
				HitSplatDefinition var94 = null; // L: 5431
				if (var15 >= 0) { // L: 5432
					var94 = class193.method3723(var15); // L: 5433
					if (var94 != null && var94.transforms != null) { // L: 5434
						var94 = var94.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) { // L: 5436
					if (var96 == null) { // L: 5437
						var0.hitSplatCycles[var76] = -1; // L: 5438
					} else {
						Varcs.method2753(var0, var0.defaultHeight / 2); // L: 5441
						if (Client.viewportTempX > -1) { // L: 5442
							boolean var97 = true; // L: 5443
							if (var76 == 1) { // L: 5444
								Client.viewportTempY -= 20; // L: 5445
							}

							if (var76 == 2) { // L: 5447
								Client.viewportTempX -= 15; // L: 5448
								Client.viewportTempY -= 10; // L: 5449
							}

							if (var76 == 3) { // L: 5451
								Client.viewportTempX += 15; // L: 5452
								Client.viewportTempY -= 10; // L: 5453
							}

							SpritePixels var18 = null; // L: 5455
							SpritePixels var19 = null; // L: 5456
							SpritePixels var20 = null; // L: 5457
							SpritePixels var21 = null; // L: 5458
							var22 = 0; // L: 5459
							var23 = 0; // L: 5460
							int var24 = 0; // L: 5461
							int var25 = 0; // L: 5462
							int var26 = 0; // L: 5463
							int var27 = 0; // L: 5464
							int var28 = 0; // L: 5465
							int var29 = 0; // L: 5466
							SpritePixels var30 = null; // L: 5467
							SpritePixels var31 = null; // L: 5468
							SpritePixels var32 = null; // L: 5469
							SpritePixels var33 = null; // L: 5470
							int var34 = 0; // L: 5471
							int var35 = 0; // L: 5472
							int var36 = 0; // L: 5473
							int var37 = 0; // L: 5474
							int var38 = 0; // L: 5475
							int var39 = 0; // L: 5476
							int var40 = 0; // L: 5477
							int var41 = 0; // L: 5478
							int var42 = 0; // L: 5479
							var18 = var96.method4048(); // L: 5480
							int var43;
							if (var18 != null) { // L: 5481
								var22 = var18.subWidth; // L: 5482
								var43 = var18.subHeight; // L: 5483
								if (var43 > var42) { // L: 5484
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5485
							}

							var19 = var96.method4049(); // L: 5487
							if (var19 != null) { // L: 5488
								var23 = var19.subWidth; // L: 5489
								var43 = var19.subHeight; // L: 5490
								if (var43 > var42) { // L: 5491
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5492
							}

							var20 = var96.method4050(); // L: 5494
							if (var20 != null) { // L: 5495
								var24 = var20.subWidth; // L: 5496
								var43 = var20.subHeight; // L: 5497
								if (var43 > var42) { // L: 5498
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5499
							}

							var21 = var96.method4062(); // L: 5501
							if (var21 != null) { // L: 5502
								var25 = var21.subWidth; // L: 5503
								var43 = var21.subHeight; // L: 5504
								if (var43 > var42) { // L: 5505
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5506
							}

							if (var94 != null) { // L: 5508
								var30 = var94.method4048(); // L: 5509
								if (var30 != null) { // L: 5510
									var34 = var30.subWidth; // L: 5511
									var43 = var30.subHeight; // L: 5512
									if (var43 > var42) { // L: 5513
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5514
								}

								var31 = var94.method4049(); // L: 5516
								if (var31 != null) { // L: 5517
									var35 = var31.subWidth; // L: 5518
									var43 = var31.subHeight; // L: 5519
									if (var43 > var42) { // L: 5520
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5521
								}

								var32 = var94.method4050(); // L: 5523
								if (var32 != null) { // L: 5524
									var36 = var32.subWidth; // L: 5525
									var43 = var32.subHeight; // L: 5526
									if (var43 > var42) { // L: 5527
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5528
								}

								var33 = var94.method4062(); // L: 5530
								if (var33 != null) { // L: 5531
									var37 = var33.subWidth; // L: 5532
									var43 = var33.subHeight; // L: 5533
									if (var43 > var42) { // L: 5534
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5535
								}
							}

							Font var82 = var96.getFont(); // L: 5540
							if (var82 == null) { // L: 5541
								var82 = DevicePcmPlayerProvider.field96;
							}

							Font var44;
							if (var94 != null) { // L: 5542
								var44 = var94.getFont(); // L: 5543
								if (var44 == null) { // L: 5544
									var44 = DevicePcmPlayerProvider.field96;
								}
							} else {
								var44 = DevicePcmPlayerProvider.field96; // L: 5546
							}

							String var45 = null; // L: 5547
							String var46 = null; // L: 5548
							boolean var47 = false; // L: 5549
							int var48 = 0; // L: 5550
							var45 = var96.getString(var0.hitSplatValues[var76]); // L: 5551
							int var95 = var82.stringWidth(var45); // L: 5552
							if (var94 != null) { // L: 5553
								var46 = var94.getString(var0.hitSplatValues2[var76]); // L: 5554
								var48 = var44.stringWidth(var46); // L: 5555
							}

							int var49 = 0; // L: 5557
							int var50 = 0; // L: 5558
							if (var23 > 0) { // L: 5559
								if (var20 == null && var21 == null) { // L: 5560
									var49 = 1; // L: 5561
								} else {
									var49 = var95 / var23 + 1;
								}
							}

							if (var94 != null && var35 > 0) { // L: 5563 5564
								if (var32 == null && var33 == null) { // L: 5565
									var50 = 1; // L: 5566
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5569
							int var52 = var51; // L: 5570
							if (var22 > 0) { // L: 5571
								var51 += var22;
							}

							var51 += 2; // L: 5572
							int var53 = var51; // L: 5573
							if (var24 > 0) { // L: 5574
								var51 += var24;
							}

							int var54 = var51; // L: 5575
							int var55 = var51; // L: 5576
							int var56;
							if (var23 > 0) { // L: 5577
								var56 = var49 * var23; // L: 5578
								var51 += var56; // L: 5579
								var55 += (var56 - var95) / 2; // L: 5580
							} else {
								var51 += var95; // L: 5583
							}

							var56 = var51; // L: 5585
							if (var25 > 0) { // L: 5586
								var51 += var25;
							}

							int var57 = 0; // L: 5587
							int var58 = 0; // L: 5588
							int var59 = 0; // L: 5589
							int var60 = 0; // L: 5590
							int var61 = 0; // L: 5591
							int var62;
							if (var94 != null) { // L: 5592
								var51 += 2; // L: 5593
								var57 = var51; // L: 5594
								if (var34 > 0) { // L: 5595
									var51 += var34;
								}

								var51 += 2; // L: 5596
								var58 = var51; // L: 5597
								if (var36 > 0) { // L: 5598
									var51 += var36;
								}

								var59 = var51; // L: 5599
								var61 = var51; // L: 5600
								if (var35 > 0) { // L: 5601
									var62 = var35 * var50; // L: 5602
									var51 += var62; // L: 5603
									var61 += (var62 - var48) / 2; // L: 5604
								} else {
									var51 += var48; // L: 5607
								}

								var60 = var51; // L: 5609
								if (var37 > 0) { // L: 5610
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle; // L: 5612
							int var63 = var96.field2232 - var62 * var96.field2232 / var96.field2227; // L: 5613
							int var64 = var62 * var96.field2233 / var96.field2227 + -var96.field2233; // L: 5614
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5615
							int var66 = var64 + (var3 + Client.viewportTempY - 12); // L: 5616
							int var67 = var66; // L: 5617
							int var68 = var42 + var66; // L: 5618
							int var69 = var66 + var96.field2237 + 15; // L: 5619
							int var70 = var69 - var82.maxAscent; // L: 5620
							int var71 = var69 + var82.maxDescent; // L: 5621
							if (var70 < var66) { // L: 5622
								var67 = var70;
							}

							if (var71 > var68) { // L: 5623
								var68 = var71;
							}

							int var72 = 0; // L: 5624
							int var73;
							int var74;
							if (var94 != null) { // L: 5625
								var72 = var66 + var94.field2237 + 15; // L: 5626
								var73 = var72 - var44.maxAscent; // L: 5627
								var74 = var72 + var44.maxDescent; // L: 5628
								if (var73 < var67) { // L: 5629
									;
								}

								if (var74 > var68) { // L: 5630
									;
								}
							}

							var73 = 255; // L: 5632
							if (var96.field2234 >= 0) { // L: 5633
								var73 = (var62 << 8) / (var96.field2227 - var96.field2234);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5634
								if (var18 != null) { // L: 5635
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5636
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5637
									for (var74 = 0; var74 < var49; ++var74) { // L: 5638
										var19.drawTransAt(var23 * var74 + (var65 + var54 - var27), var66, var73); // L: 5639
									}
								}

								if (var21 != null) { // L: 5642
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var65 + var55, var69, var96.textColor, 0, var73); // L: 5643
								if (var94 != null) { // L: 5644
									if (var30 != null) { // L: 5645
										var30.drawTransAt(var65 + var57 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5646
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5647
										for (var74 = 0; var74 < var50; ++var74) { // L: 5648
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73); // L: 5649
										}
									}

									if (var33 != null) { // L: 5652
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var94.textColor, 0, var73); // L: 5653
								}
							} else {
								if (var18 != null) { // L: 5657
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) { // L: 5658
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5659
									for (var74 = 0; var74 < var49; ++var74) { // L: 5660
										var19.drawTransBgAt(var23 * var74 + (var54 + var65 - var27), var66); // L: 5661
									}
								}

								if (var21 != null) { // L: 5664
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var82.draw(var45, var55 + var65, var69, var96.textColor | -16777216, 0); // L: 5665
								if (var94 != null) { // L: 5666
									if (var30 != null) { // L: 5667
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) { // L: 5668
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 5669
										for (var74 = 0; var74 < var50; ++var74) { // L: 5670
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66); // L: 5671
										}
									}

									if (var33 != null) { // L: 5674
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var94.textColor | -16777216, 0); // L: 5675
								}
							}
						}
					}
				}
			}

		}
	} // L: 5680
}
