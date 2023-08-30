import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -251294299
	)
	public static int field293;
	@ObfuscatedName("ai")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("ap")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1214547985
	)
	static int field296;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field304;
	@ObfuscatedName("an")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2010513145
	)
	int field300;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 4668505505533220207L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1919941599
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 406112827
	)
	int field303;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1907297993
	)
	int field314;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -2235654764052402713L
	)
	long field305;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1514301463
	)
	int field306;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 758582745
	)
	int field307;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -993560077
	)
	int field309;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -4227404571919014607L
	)
	long field297;
	@ObfuscatedName("ak")
	boolean field310;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1549070857
	)
	int field294;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	PcmStream[] field315;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	PcmStream[] field316;

	protected PcmPlayer() {
		this.field300 = 32; // L: 22
		this.timeMs = GameEngine.method661(); // L: 23
		this.field305 = 0L; // L: 27
		this.field306 = 0; // L: 28
		this.field307 = 0; // L: 29
		this.field309 = 0; // L: 30
		this.field297 = 0L; // L: 31
		this.field310 = true; // L: 32
		this.field294 = 0; // L: 38
		this.field315 = new PcmStream[8]; // L: 39
		this.field316 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1766369380"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 280

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "57"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 281

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1982834691"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 284
	}

	@ObfuscatedName("at")
	@Export("write")
	protected void write() throws Exception {
	} // L: 287

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1874015336"
	)
	@Export("close")
	protected void close() {
	} // L: 288

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 289

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lbw;I)V",
		garbageValue = "-828545471"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 79
	} // L: 80

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 83
			long var1 = GameEngine.method661(); // L: 84

			try {
				if (0L != this.field305) { // L: 86
					if (var1 < this.field305) { // L: 87
						return;
					}

					this.open(this.capacity); // L: 88
					this.field305 = 0L; // L: 89
					this.field310 = true; // L: 90
				}

				int var3 = this.position(); // L: 92
				if (this.field309 - var3 > this.field306) { // L: 93
					this.field306 = this.field309 - var3;
				}

				int var4 = this.field314 + this.field303; // L: 94
				if (var4 + 256 > 16384) { // L: 95
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 96
					this.capacity += 1024; // L: 97
					if (this.capacity > 16384) { // L: 98
						this.capacity = 16384;
					}

					this.close(); // L: 99
					this.open(this.capacity); // L: 100
					var3 = 0; // L: 101
					this.field310 = true; // L: 102
					if (var4 + 256 > this.capacity) { // L: 103
						var4 = this.capacity - 256; // L: 104
						this.field314 = var4 - this.field303; // L: 105
					}
				}

				while (var3 < var4) { // L: 108
					this.fill(this.samples, 256); // L: 109
					this.write(); // L: 110
					var3 += 256; // L: 111
				}

				if (var1 > this.field297) { // L: 113
					if (!this.field310) { // L: 114
						if (this.field306 == 0 && this.field307 == 0) { // L: 115
							this.close(); // L: 116
							this.field305 = var1 + 2000L; // L: 117
							return; // L: 118
						}

						this.field314 = Math.min(this.field307, this.field306); // L: 120
						this.field307 = this.field306; // L: 121
					} else {
						this.field310 = false; // L: 123
					}

					this.field306 = 0; // L: 124
					this.field297 = var1 + 2000L; // L: 125
				}

				this.field309 = var3; // L: 127
			} catch (Exception var7) { // L: 129
				this.close(); // L: 130
				this.field305 = 2000L + var1; // L: 131
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 134
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) { // L: 135
					this.skip(256); // L: 136
					this.timeMs += (long)(256000 / field293); // L: 137
				}
			} catch (Exception var6) { // L: 140
				this.timeMs = var1; // L: 141
			}

		}
	} // L: 143

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1331437422"
	)
	public final void method804() {
		this.field310 = true; // L: 146
	} // L: 147

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field310 = true; // L: 150

		try {
			this.discard(); // L: 152
		} catch (Exception var2) { // L: 154
			this.close(); // L: 155
			this.field305 = GameEngine.method661() + 2000L; // L: 156
		}

	} // L: 158

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-35"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (Canvas.soundSystem != null) { // L: 161
			boolean var1 = true; // L: 162

			for (int var2 = 0; var2 < 2; ++var2) { // L: 163
				if (this == Canvas.soundSystem.players[var2]) { // L: 164
					Canvas.soundSystem.players[var2] = null;
				}

				if (Canvas.soundSystem.players[var2] != null) { // L: 165
					var1 = false;
				}
			}

			if (var1) { // L: 167
				soundSystemExecutor.shutdownNow(); // L: 168
				soundSystemExecutor = null; // L: 169
				Canvas.soundSystem = null; // L: 170
			}
		}

		this.close(); // L: 173
		this.samples = null; // L: 174
	} // L: 175

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "9"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field294 -= var1; // L: 178
		if (this.field294 < 0) {
			this.field294 = 0; // L: 179
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 180
		}

	} // L: 181

	@ObfuscatedName("bh")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 185
		if (PcmPlayer_stereo) { // L: 186
			var3 = var2 << 1;
		}

		class409.clearIntArray(var1, 0, var3); // L: 187
		this.field294 -= var2; // L: 188
		if (this.stream != null && this.field294 <= 0) { // L: 189
			this.field294 += field293 >> 4; // L: 190
			class31.PcmStream_disable(this.stream); // L: 191
			this.method809(this.stream, this.stream.vmethod1041()); // L: 192
			int var4 = 0; // L: 193
			int var5 = 255; // L: 194

			int var6;
			PcmStream var10;
			label107:
			for (var6 = 7; var5 != 0; --var6) { // L: 195
				int var7;
				int var8;
				if (var6 < 0) { // L: 198
					var7 = var6 & 3; // L: 199
					var8 = -(var6 >> 2); // L: 200
				} else {
					var7 = var6; // L: 203
					var8 = 0; // L: 204
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 206 208
					if ((var9 & 1) != 0) { // L: 211
						var5 &= ~(1 << var7); // L: 214
						var10 = null; // L: 215
						PcmStream var11 = this.field315[var7]; // L: 216

						label101:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 217
									break label101;
								}

								AbstractSound var12 = var11.sound; // L: 218
								if (var12 != null && var12.position > var8) { // L: 219
									var5 |= 1 << var7; // L: 220
									var10 = var11; // L: 221
									var11 = var11.after; // L: 222
								} else {
									var11.active = true; // L: 225
									int var13 = var11.vmethod5973(); // L: 226
									var4 += var13; // L: 227
									if (var12 != null) {
										var12.position += var13; // L: 228
									}

									if (var4 >= this.field300) { // L: 229
										break label107;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 230
									if (var14 != null) { // L: 231
										for (int var15 = var11.field371; var14 != null; var14 = var11.nextSubStream()) { // L: 232 233 235
											this.method809(var14, var15 * var14.vmethod1041() >> 8); // L: 234
										}
									}

									PcmStream var18 = var11.after; // L: 238
									var11.after = null; // L: 239
									if (var10 == null) { // L: 240
										this.field315[var7] = var18;
									} else {
										var10.after = var18; // L: 241
									}

									if (var18 == null) { // L: 242
										this.field316[var7] = var10;
									}

									var11 = var18; // L: 243
								}
							}
						}
					}

					var7 += 4; // L: 207
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 247
				PcmStream var16 = this.field315[var6]; // L: 248
				PcmStream[] var17 = this.field315; // L: 249
				this.field316[var6] = null; // L: 251

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 252 253 256
					var10 = var16.after; // L: 254
					var16.after = null; // L: 255
				}
			}
		}

		if (this.field294 < 0) { // L: 260
			this.field294 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 261
		}

		this.timeMs = GameEngine.method661(); // L: 262
	} // L: 263

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lbw;II)V",
		garbageValue = "1754087851"
	)
	final void method809(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 272
		PcmStream var4 = this.field316[var3]; // L: 273
		if (var4 == null) { // L: 274
			this.field315[var3] = var1;
		} else {
			var4.after = var1; // L: 275
		}

		this.field316[var3] = var1; // L: 276
		var1.field371 = var2; // L: 277
	} // L: 278

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "125"
	)
	public static int method854(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 58
		int var1 = (int)(var2 >>> 7 & 127L); // L: 60
		return var1; // L: 62
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1604258574"
	)
	static void method838(int var0) {
		if (var0 != Login.loginIndex) { // L: 1934
			Login.loginIndex = var0; // L: 1935
		}
	} // L: 1936

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) { // L: 5238
			if (var0 instanceof NPC) { // L: 5239
				NPCComposition var6 = ((NPC)var0).definition; // L: 5240
				if (var6.transforms != null) { // L: 5241
					var6 = var6.transform();
				}

				if (var6 == null) { // L: 5242
					return;
				}
			}

			int var75 = Players.Players_count; // L: 5244
			int[] var7 = Players.Players_indices; // L: 5245
			boolean var8 = var1 < var75; // L: 5246
			int var9 = -2; // L: 5247
			if (var0.overheadText != null && (!var8 || !var0.field1220 && (Client.publicChatMode == 4 || !var0.field1219 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).method2305())))) { // L: 5248 5249
				SecureRandomFuture.method2156(var0, var0.defaultHeight); // L: 5250
				if (Client.viewportTempX > -1 && Client.field631 < Client.field563) { // L: 5251
					Client.field811[Client.field631] = class59.fontBold12.stringWidth(var0.overheadText) / 2; // L: 5252
					Client.field585[Client.field631] = class59.fontBold12.ascent; // L: 5253
					Client.field633[Client.field631] = Client.viewportTempX; // L: 5254
					Client.field634[Client.field631] = Client.viewportTempY - var9; // L: 5255
					Client.field637[Client.field631] = var0.field1222; // L: 5256
					Client.field638[Client.field631] = var0.field1223; // L: 5257
					Client.field786[Client.field631] = var0.overheadTextCyclesRemaining; // L: 5258
					Client.field535[Client.field631] = var0.field1264; // L: 5259
					Client.field641[Client.field631] = var0.overheadText; // L: 5260
					++Client.field631; // L: 5261
					var9 += 12; // L: 5262
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7032()) { // L: 5266
				SecureRandomFuture.method2156(var0, var0.defaultHeight + 15); // L: 5267

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) { // L: 5268
					HealthBarUpdate var11 = var10.getInventorySprite(Client.cycle); // L: 5269
					if (var11 == null) { // L: 5270
						if (var10.isEmpty()) { // L: 5328
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition; // L: 5271
						SpritePixels var79 = var12.method3645(); // L: 5272
						SpritePixels var83 = var12.method3644(); // L: 5273
						int var84 = 0; // L: 5275
						if (var79 != null && var83 != null) { // L: 5276
							if (var12.widthPadding * 2 < var83.subWidth) { // L: 5277
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2; // L: 5278
						} else {
							var15 = var12.width; // L: 5280
						}

						int var81 = 255; // L: 5281
						boolean var85 = true; // L: 5282
						int var86 = Client.cycle - var11.cycle; // L: 5283
						int var87 = var15 * var11.health2 / var12.width; // L: 5284
						int var88;
						int var98;
						if (var11.cycleOffset > var86) { // L: 5285
							var88 = var12.field1998 == 0 ? 0 : var12.field1998 * (var86 / var12.field1998); // L: 5286
							var22 = var15 * var11.health / var12.width; // L: 5287
							var98 = var88 * (var87 - var22) / var11.cycleOffset + var22; // L: 5288
						} else {
							var98 = var87; // L: 5291
							var88 = var11.cycleOffset + var12.int5 - var86; // L: 5292
							if (var12.int3 >= 0) { // L: 5293
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var98 < 1) { // L: 5295
							var98 = 1;
						}

						if (var79 != null && var83 != null) { // L: 5296
							if (var15 == var98) { // L: 5297
								var98 += var84 * 2;
							} else {
								var98 += var84; // L: 5298
							}

							var88 = var79.subHeight; // L: 5299
							var9 += var88; // L: 5300
							var22 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5301
							var23 = var3 + Client.viewportTempY - var9; // L: 5302
							var22 -= var84; // L: 5303
							if (var81 >= 0 && var81 < 255) { // L: 5304
								var79.drawTransAt(var22, var23, var81); // L: 5305
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var23 + var88); // L: 5306
								var83.drawTransAt(var22, var23, var81); // L: 5307
							} else {
								var79.drawTransBgAt(var22, var23); // L: 5310
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var98, var88 + var23); // L: 5311
								var83.drawTransBgAt(var22, var23); // L: 5312
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5); // L: 5314
							var9 += 2; // L: 5315
						} else {
							var9 += 5; // L: 5318
							if (Client.viewportTempX > -1) { // L: 5319
								var88 = var2 + Client.viewportTempX - (var15 >> 1); // L: 5320
								var22 = var3 + Client.viewportTempY - var9; // L: 5321
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280); // L: 5322
								Rasterizer2D.Rasterizer2D_fillRectangle(var98 + var88, var22, var15 - var98, 5, 16711680); // L: 5323
							}

							var9 += 2; // L: 5325
						}
					}
				}
			}

			if (var9 == -2) { // L: 5331
				var9 += 7;
			}

			Player var89;
			if (var8 && var0.playerCycle == Client.cycle && Occluder.method4725((Player)var0)) { // L: 5332
				var89 = (Player)var0; // L: 5333
				if (var8) { // L: 5334
					SecureRandomFuture.method2156(var0, var0.defaultHeight + 15); // L: 5335
					AbstractFont var90 = (AbstractFont)Client.field595.get(FontName.FontName_plain12); // L: 5336
					var9 += 4; // L: 5337
					var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0); // L: 5338
					var9 += 18; // L: 5339
				}
			}

			if (var8) { // L: 5342
				var89 = (Player)var0; // L: 5343
				if (var89.isHidden) { // L: 5344
					return;
				}

				if (var89.headIconPk != -1 || var89.headIconPrayer != -1) { // L: 5345
					SecureRandomFuture.method2156(var0, var0.defaultHeight + 15); // L: 5346
					if (Client.viewportTempX > -1) { // L: 5347
						if (var89.headIconPk != -1) { // L: 5348
							var9 += 25; // L: 5349
							class178.field1894[var89.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5350
						}

						if (var89.headIconPrayer != -1) { // L: 5352
							var9 += 25; // L: 5353
							class502.field5029[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5354
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.field567) { // L: 5358
					SecureRandomFuture.method2156(var0, var0.defaultHeight + 15); // L: 5359
					if (Client.viewportTempX > -1) { // L: 5360
						var9 += ArchiveLoader.field1063[1].subHeight; // L: 5361
						ArchiveLoader.field1063[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9); // L: 5362
					}
				}
			} else {
				NPC var91 = (NPC)var0; // L: 5367
				int[] var92 = var91.method2577(); // L: 5368
				short[] var93 = var91.method2597(); // L: 5369
				if (var93 != null && var92 != null) { // L: 5370
					for (int var13 = 0; var13 < var93.length; ++var13) { // L: 5371
						if (var93[var13] >= 0 && var92[var13] >= 0) { // L: 5372
							long var14 = (long)var92[var13] << 8 | (long)var93[var13]; // L: 5375
							SpritePixels var16 = (SpritePixels)Client.archive5.method7781(var14); // L: 5376
							if (var16 == null) { // L: 5377
								SpritePixels[] var17 = WorldMapArchiveLoader.method8495(field304, var92[var13], 0); // L: 5378
								if (var17 != null && var93[var13] < var17.length) { // L: 5379
									var16 = var17[var93[var13]]; // L: 5380
									Client.archive5.method7782(var14, var16); // L: 5381
								}
							}

							if (var16 != null) { // L: 5384
								SecureRandomFuture.method2156(var0, var0.defaultHeight + 15); // L: 5385
								if (Client.viewportTempX > -1) { // L: 5386
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4); // L: 5387
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.field548 && Client.cycle % 20 < 10) { // L: 5392
					SecureRandomFuture.method2156(var0, var0.defaultHeight + 15); // L: 5393
					if (Client.viewportTempX > -1) { // L: 5394
						ArchiveLoader.field1063[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) { // L: 5397
				int var77 = var0.hitSplatCycles[var76]; // L: 5398
				int var78 = var0.hitSplatTypes[var76]; // L: 5399
				HitSplatDefinition var96 = null; // L: 5400
				int var80 = 0; // L: 5401
				if (var78 >= 0) { // L: 5402
					if (var77 <= Client.cycle) { // L: 5403
						continue;
					}

					var96 = WorldMapCacheName.method5560(var0.hitSplatTypes[var76]); // L: 5404
					var80 = var96.field2161; // L: 5405
					if (var96 != null && var96.transforms != null) { // L: 5406
						var96 = var96.transform(); // L: 5407
						if (var96 == null) { // L: 5408
							var0.hitSplatCycles[var76] = -1; // L: 5409
							continue; // L: 5410
						}
					}
				} else if (var77 < 0) { // L: 5414
					continue;
				}

				var15 = var0.hitSplatTypes2[var76]; // L: 5415
				HitSplatDefinition var94 = null; // L: 5416
				if (var15 >= 0) { // L: 5417
					var94 = WorldMapCacheName.method5560(var15); // L: 5418
					if (var94 != null && var94.transforms != null) { // L: 5419
						var94 = var94.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) { // L: 5421
					if (var96 == null) { // L: 5422
						var0.hitSplatCycles[var76] = -1; // L: 5423
					} else {
						SecureRandomFuture.method2156(var0, var0.defaultHeight / 2); // L: 5426
						if (Client.viewportTempX > -1) { // L: 5427
							boolean var97 = true; // L: 5428
							if (var76 == 1) { // L: 5429
								Client.viewportTempY -= 20; // L: 5430
							}

							if (var76 == 2) { // L: 5432
								Client.viewportTempX -= 15; // L: 5433
								Client.viewportTempY -= 10; // L: 5434
							}

							if (var76 == 3) { // L: 5436
								Client.viewportTempX += 15; // L: 5437
								Client.viewportTempY -= 10; // L: 5438
							}

							SpritePixels var18 = null; // L: 5440
							SpritePixels var19 = null; // L: 5441
							SpritePixels var20 = null; // L: 5442
							SpritePixels var21 = null; // L: 5443
							var22 = 0; // L: 5444
							var23 = 0; // L: 5445
							int var24 = 0; // L: 5446
							int var25 = 0; // L: 5447
							int var26 = 0; // L: 5448
							int var27 = 0; // L: 5449
							int var28 = 0; // L: 5450
							int var29 = 0; // L: 5451
							SpritePixels var30 = null; // L: 5452
							SpritePixels var31 = null; // L: 5453
							SpritePixels var32 = null; // L: 5454
							SpritePixels var33 = null; // L: 5455
							int var34 = 0; // L: 5456
							int var35 = 0; // L: 5457
							int var36 = 0; // L: 5458
							int var37 = 0; // L: 5459
							int var38 = 0; // L: 5460
							int var39 = 0; // L: 5461
							int var40 = 0; // L: 5462
							int var41 = 0; // L: 5463
							int var42 = 0; // L: 5464
							var18 = var96.method3850(); // L: 5465
							int var43;
							if (var18 != null) { // L: 5466
								var22 = var18.subWidth; // L: 5467
								var43 = var18.subHeight; // L: 5468
								if (var43 > var42) { // L: 5469
									var42 = var43;
								}

								var26 = var18.xOffset; // L: 5470
							}

							var19 = var96.method3846(); // L: 5472
							if (var19 != null) { // L: 5473
								var23 = var19.subWidth; // L: 5474
								var43 = var19.subHeight; // L: 5475
								if (var43 > var42) { // L: 5476
									var42 = var43;
								}

								var27 = var19.xOffset; // L: 5477
							}

							var20 = var96.method3852(); // L: 5479
							if (var20 != null) { // L: 5480
								var24 = var20.subWidth; // L: 5481
								var43 = var20.subHeight; // L: 5482
								if (var43 > var42) { // L: 5483
									var42 = var43;
								}

								var28 = var20.xOffset; // L: 5484
							}

							var21 = var96.method3853(); // L: 5486
							if (var21 != null) { // L: 5487
								var25 = var21.subWidth; // L: 5488
								var43 = var21.subHeight; // L: 5489
								if (var43 > var42) { // L: 5490
									var42 = var43;
								}

								var29 = var21.xOffset; // L: 5491
							}

							if (var94 != null) { // L: 5493
								var30 = var94.method3850(); // L: 5494
								if (var30 != null) { // L: 5495
									var34 = var30.subWidth; // L: 5496
									var43 = var30.subHeight; // L: 5497
									if (var43 > var42) { // L: 5498
										var42 = var43;
									}

									var38 = var30.xOffset; // L: 5499
								}

								var31 = var94.method3846(); // L: 5501
								if (var31 != null) { // L: 5502
									var35 = var31.subWidth; // L: 5503
									var43 = var31.subHeight; // L: 5504
									if (var43 > var42) { // L: 5505
										var42 = var43;
									}

									var39 = var31.xOffset; // L: 5506
								}

								var32 = var94.method3852(); // L: 5508
								if (var32 != null) { // L: 5509
									var36 = var32.subWidth; // L: 5510
									var43 = var32.subHeight; // L: 5511
									if (var43 > var42) { // L: 5512
										var42 = var43;
									}

									var40 = var32.xOffset; // L: 5513
								}

								var33 = var94.method3853(); // L: 5515
								if (var33 != null) { // L: 5516
									var37 = var33.subWidth; // L: 5517
									var43 = var33.subHeight; // L: 5518
									if (var43 > var42) { // L: 5519
										var42 = var43;
									}

									var41 = var33.xOffset; // L: 5520
								}
							}

							Font var82 = var96.getFont(); // L: 5525
							if (var82 == null) { // L: 5526
								var82 = HealthBarUpdate.field1278;
							}

							Font var44;
							if (var94 != null) { // L: 5527
								var44 = var94.getFont(); // L: 5528
								if (var44 == null) { // L: 5529
									var44 = HealthBarUpdate.field1278;
								}
							} else {
								var44 = HealthBarUpdate.field1278; // L: 5531
							}

							String var45 = null; // L: 5532
							String var46 = null; // L: 5533
							boolean var47 = false; // L: 5534
							int var48 = 0; // L: 5535
							var45 = var96.getString(var0.hitSplatValues[var76]); // L: 5536
							int var95 = var82.stringWidth(var45); // L: 5537
							if (var94 != null) { // L: 5538
								var46 = var94.getString(var0.hitSplatValues2[var76]); // L: 5539
								var48 = var44.stringWidth(var46); // L: 5540
							}

							int var49 = 0; // L: 5542
							int var50 = 0; // L: 5543
							if (var23 > 0) { // L: 5544
								if (var20 == null && var21 == null) { // L: 5545
									var49 = 1; // L: 5546
								} else {
									var49 = var95 / var23 + 1;
								}
							}

							if (var94 != null && var35 > 0) { // L: 5548 5549
								if (var32 == null && var33 == null) { // L: 5550
									var50 = 1; // L: 5551
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0; // L: 5554
							int var52 = var51; // L: 5555
							if (var22 > 0) { // L: 5556
								var51 += var22;
							}

							var51 += 2; // L: 5557
							int var53 = var51; // L: 5558
							if (var24 > 0) { // L: 5559
								var51 += var24;
							}

							int var54 = var51; // L: 5560
							int var55 = var51; // L: 5561
							int var56;
							if (var23 > 0) { // L: 5562
								var56 = var23 * var49; // L: 5563
								var51 += var56; // L: 5564
								var55 += (var56 - var95) / 2; // L: 5565
							} else {
								var51 += var95; // L: 5568
							}

							var56 = var51; // L: 5570
							if (var25 > 0) { // L: 5571
								var51 += var25;
							}

							int var57 = 0; // L: 5572
							int var58 = 0; // L: 5573
							int var59 = 0; // L: 5574
							int var60 = 0; // L: 5575
							int var61 = 0; // L: 5576
							int var62;
							if (var94 != null) { // L: 5577
								var51 += 2; // L: 5578
								var57 = var51; // L: 5579
								if (var34 > 0) { // L: 5580
									var51 += var34;
								}

								var51 += 2; // L: 5581
								var58 = var51; // L: 5582
								if (var36 > 0) { // L: 5583
									var51 += var36;
								}

								var59 = var51; // L: 5584
								var61 = var51; // L: 5585
								if (var35 > 0) { // L: 5586
									var62 = var50 * var35; // L: 5587
									var51 += var62; // L: 5588
									var61 += (var62 - var48) / 2; // L: 5589
								} else {
									var51 += var48; // L: 5592
								}

								var60 = var51; // L: 5594
								if (var37 > 0) { // L: 5595
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle; // L: 5597
							int var63 = var96.field2159 - var62 * var96.field2159 / var96.field2161; // L: 5598
							int var64 = var62 * var96.field2153 / var96.field2161 + -var96.field2153; // L: 5599
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1)); // L: 5600
							int var66 = var3 + Client.viewportTempY - 12 + var64; // L: 5601
							int var67 = var66; // L: 5602
							int var68 = var42 + var66; // L: 5603
							int var69 = var66 + var96.field2163 + 15; // L: 5604
							int var70 = var69 - var82.maxAscent; // L: 5605
							int var71 = var69 + var82.maxDescent; // L: 5606
							if (var70 < var66) { // L: 5607
								var67 = var70;
							}

							if (var71 > var68) { // L: 5608
								var68 = var71;
							}

							int var72 = 0; // L: 5609
							int var73;
							int var74;
							if (var94 != null) { // L: 5610
								var72 = var66 + var94.field2163 + 15; // L: 5611
								var73 = var72 - var44.maxAscent; // L: 5612
								var74 = var72 + var44.maxDescent; // L: 5613
								if (var73 < var67) { // L: 5614
									;
								}

								if (var74 > var68) { // L: 5615
									;
								}
							}

							var73 = 255; // L: 5617
							if (var96.field2147 >= 0) { // L: 5618
								var73 = (var62 << 8) / (var96.field2161 - var96.field2147);
							}

							if (var73 >= 0 && var73 < 255) { // L: 5619
								if (var18 != null) { // L: 5620
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) { // L: 5621
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) { // L: 5622
									for (var74 = 0; var74 < var49; ++var74) { // L: 5623
										var19.drawTransAt(var74 * var23 + (var54 + var65 - var27), var66, var73); // L: 5624
									}
								}

								if (var21 != null) { // L: 5627
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var65 + var55, var69, var96.textColor, 0, var73); // L: 5628
								if (var94 != null) { // L: 5629
									if (var30 != null) { // L: 5630
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) { // L: 5631
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) { // L: 5632
										for (var74 = 0; var74 < var50; ++var74) { // L: 5633
											var31.drawTransAt(var74 * var35 + (var59 + var65 - var39), var66, var73); // L: 5634
										}
									}

									if (var33 != null) { // L: 5637
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var94.textColor, 0, var73); // L: 5638
								}
							} else {
								if (var18 != null) { // L: 5642
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) { // L: 5643
									var20.drawTransBgAt(var65 + var53 - var28, var66);
								}

								if (var19 != null) { // L: 5644
									for (var74 = 0; var74 < var49; ++var74) { // L: 5645
										var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66); // L: 5646
									}
								}

								if (var21 != null) { // L: 5649
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var82.draw(var45, var65 + var55, var69, var96.textColor | -16777216, 0); // L: 5650
								if (var94 != null) { // L: 5651
									if (var30 != null) { // L: 5652
										var30.drawTransBgAt(var57 + var65 - var38, var66);
									}

									if (var32 != null) { // L: 5653
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) { // L: 5654
										for (var74 = 0; var74 < var50; ++var74) { // L: 5655
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66); // L: 5656
										}
									}

									if (var33 != null) { // L: 5659
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var94.textColor | -16777216, 0); // L: 5660
								}
							}
						}
					}
				}
			}

		}
	} // L: 5665

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "([Lmi;IIIZI)V",
		garbageValue = "-166664235"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 11070
			Widget var6 = var0[var5]; // L: 11071
			if (var6 != null && var6.parentId == var1) { // L: 11072 11073
				class369.alignWidgetSize(var6, var2, var3, var4); // L: 11074
				WorldMapArea.alignWidgetPosition(var6, var2, var3); // L: 11075
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 11076
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 11077
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 11078
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 11079
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 11080
					Login.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 11082
}
