import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("AbstractFont")
public abstract class AbstractFont extends Rasterizer2D {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	@Export("AbstractFont_modIconSprites")
	public static IndexedSprite[] AbstractFont_modIconSprites;
	@ObfuscatedName("g")
	@Export("AbstractFont_strike")
	static int AbstractFont_strike;
	@ObfuscatedName("i")
	@Export("AbstractFont_underline")
	static int AbstractFont_underline;
	@ObfuscatedName("o")
	@Export("AbstractFont_previousShadow")
	static int AbstractFont_previousShadow;
	@ObfuscatedName("n")
	@Export("AbstractFont_shadow")
	static int AbstractFont_shadow;
	@ObfuscatedName("k")
	@Export("AbstractFont_previousColor")
	static int AbstractFont_previousColor;
	@ObfuscatedName("a")
	@Export("AbstractFont_color")
	static int AbstractFont_color;
	@ObfuscatedName("s")
	@Export("AbstractFont_alpha")
	static int AbstractFont_alpha;
	@ObfuscatedName("l")
	@Export("AbstractFont_justificationTotal")
	static int AbstractFont_justificationTotal;
	@ObfuscatedName("t")
	@Export("AbstractFont_justificationCurrent")
	static int AbstractFont_justificationCurrent;
	@ObfuscatedName("c")
	@Export("AbstractFont_random")
	static Random AbstractFont_random;
	@ObfuscatedName("p")
	@Export("AbstractFont_lines")
	static String[] AbstractFont_lines;
	@ObfuscatedName("h")
	@Export("pixels")
	byte[][] pixels;
	@ObfuscatedName("e")
	@Export("advances")
	int[] advances;
	@ObfuscatedName("v")
	@Export("widths")
	int[] widths;
	@ObfuscatedName("x")
	@Export("heights")
	int[] heights;
	@ObfuscatedName("m")
	@Export("leftBearings")
	int[] leftBearings;
	@ObfuscatedName("q")
	@Export("topBearings")
	int[] topBearings;
	@ObfuscatedName("f")
	@Export("ascent")
	public int ascent;
	@ObfuscatedName("r")
	@Export("maxAscent")
	public int maxAscent;
	@ObfuscatedName("u")
	@Export("maxDescent")
	public int maxDescent;
	@ObfuscatedName("j")
	@Export("kerning")
	byte[] kerning;

	static {
		AbstractFont_strike = -1; // L: 25
		AbstractFont_underline = -1; // L: 26
		AbstractFont_previousShadow = -1; // L: 27
		AbstractFont_shadow = -1; // L: 28
		AbstractFont_previousColor = 0; // L: 29
		AbstractFont_color = 0; // L: 30
		AbstractFont_alpha = 256; // L: 31
		AbstractFont_justificationTotal = 0; // L: 32
		AbstractFont_justificationCurrent = 0; // L: 33
		AbstractFont_random = new Random(); // L: 34
		AbstractFont_lines = new String[100]; // L: 35
	}

	AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.pixels = new byte[256][];
		this.ascent = 0;
		this.leftBearings = var2; // L: 38
		this.topBearings = var3; // L: 39
		this.widths = var4; // L: 40
		this.heights = var5; // L: 41
		this.readMetrics(var1); // L: 42
		this.pixels = var7; // L: 43
		int var8 = Integer.MAX_VALUE; // L: 44
		int var9 = Integer.MIN_VALUE; // L: 45

		for (int var10 = 0; var10 < 256; ++var10) { // L: 46
			if (this.topBearings[var10] < var8 && this.heights[var10] != 0) { // L: 47
				var8 = this.topBearings[var10];
			}

			if (this.topBearings[var10] + this.heights[var10] > var9) { // L: 48
				var9 = this.topBearings[var10] + this.heights[var10];
			}
		}

		this.maxAscent = this.ascent - var8; // L: 50
		this.maxDescent = var9 - this.ascent; // L: 51
	} // L: 52

	AbstractFont(byte[] var1) {
		this.pixels = new byte[256][]; // L: 14
		this.ascent = 0; // L: 20
		this.readMetrics(var1); // L: 55
	} // L: 56

	@ObfuscatedName("h")
	@Export("drawGlyph")
	abstract void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfuscatedName("e")
	@Export("drawGlyphAlpha")
	abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfuscatedName("m")
	@Export("readMetrics")
	void readMetrics(byte[] var1) {
		this.advances = new int[256]; // L: 59
		int var2;
		if (var1.length == 257) { // L: 60
			for (var2 = 0; var2 < this.advances.length; ++var2) { // L: 61
				this.advances[var2] = var1[var2] & 255;
			}

			this.ascent = var1[256] & 255; // L: 62
		} else {
			var2 = 0; // L: 65

			for (int var3 = 0; var3 < 256; ++var3) { // L: 66
				this.advances[var3] = var1[var2++] & 255;
			}

			int[] var10 = new int[256]; // L: 67
			int[] var4 = new int[256]; // L: 68

			int var5;
			for (var5 = 0; var5 < 256; ++var5) { // L: 69
				var10[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) { // L: 70
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][]; // L: 71

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) { // L: 72
				var11[var6] = new byte[var10[var6]]; // L: 73
				byte var7 = 0; // L: 74

				for (var8 = 0; var8 < var11[var6].length; ++var8) { // L: 75
					var7 += var1[var2++]; // L: 76
					var11[var6][var8] = var7; // L: 77
				}
			}

			byte[][] var12 = new byte[256][]; // L: 80

			int var13;
			for (var13 = 0; var13 < 256; ++var13) { // L: 81
				var12[var13] = new byte[var10[var13]]; // L: 82
				byte var14 = 0; // L: 83

				for (int var9 = 0; var9 < var12[var13].length; ++var9) { // L: 84
					var14 += var1[var2++]; // L: 85
					var12[var13][var9] = var14; // L: 86
				}
			}

			this.kerning = new byte[65536]; // L: 89

			for (var13 = 0; var13 < 256; ++var13) { // L: 90
				if (var13 != 32 && var13 != 160) { // L: 91
					for (var8 = 0; var8 < 256; ++var8) { // L: 92
						if (var8 != 32 && var8 != 160) { // L: 93
							this.kerning[var8 + (var13 << 8)] = (byte)method7186(var11, var12, var4, this.advances, var10, var13, var8); // L: 94
						}
					}
				}
			}

			this.ascent = var4[32] + var10[32]; // L: 97
		}

	} // L: 99

	@ObfuscatedName("f")
	@Export("charWidth")
	public int charWidth(char var1) {
		if (var1 == 160) { // L: 124
			var1 = ' ';
		}

		return this.advances[class299.charToByteCp1252(var1) & 255]; // L: 125
	}

	@ObfuscatedName("r")
	@Export("stringWidth")
	public int stringWidth(String var1) {
		if (var1 == null) { // L: 129
			return 0;
		} else {
			int var2 = -1; // L: 130
			int var3 = -1; // L: 131
			int var4 = 0; // L: 132

			for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 133
				char var6 = var1.charAt(var5); // L: 134
				if (var6 == '<') { // L: 135
					var2 = var5; // L: 136
				} else {
					if (var6 == '>' && var2 != -1) { // L: 139
						String var7 = var1.substring(var2 + 1, var5); // L: 140
						var2 = -1; // L: 141
						if (var7.equals("lt")) { // L: 142
							var6 = '<';
						} else {
							if (!var7.equals("gt")) { // L: 143
								if (var7.startsWith("img=")) { // L: 144
									try {
										int var8 = class412.method7858(var7.substring(4)); // L: 146
										var4 += AbstractFont_modIconSprites[var8].width; // L: 147
										var3 = -1; // L: 148
									} catch (Exception var10) { // L: 150
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) { // L: 155
						var6 = ' ';
					}

					if (var2 == -1) { // L: 156
						var4 += this.advances[(char)(class299.charToByteCp1252(var6) & 255)]; // L: 157
						if (this.kerning != null && var3 != -1) { // L: 158
							var4 += this.kerning[var6 + (var3 << 8)];
						}

						var3 = var6; // L: 159
					}
				}
			}

			return var4; // L: 162
		}
	}

	@ObfuscatedName("u")
	@Export("breakLines")
	public int breakLines(String var1, int[] var2, String[] var3) {
		if (var1 == null) { // L: 166
			return 0;
		} else {
			int var4 = 0; // L: 167
			int var5 = 0; // L: 168
			StringBuilder var6 = new StringBuilder(100); // L: 169
			int var7 = -1; // L: 170
			int var8 = 0; // L: 171
			byte var9 = 0; // L: 172
			int var10 = -1; // L: 173
			char var11 = 0; // L: 174
			int var12 = 0; // L: 175
			int var13 = var1.length(); // L: 176

			for (int var14 = 0; var14 < var13; ++var14) { // L: 177
				char var15 = var1.charAt(var14); // L: 178
				if (var15 == '<') { // L: 179
					var10 = var14; // L: 180
				} else {
					if (var15 == '>' && var10 != -1) { // L: 183
						String var16 = var1.substring(var10 + 1, var14); // L: 184
						var10 = -1; // L: 185
						var6.append('<'); // L: 186
						var6.append(var16); // L: 187
						var6.append('>'); // L: 188
						if (var16.equals("br")) { // L: 189
							var3[var12] = var6.toString().substring(var5, var6.length()); // L: 190
							++var12; // L: 191
							var5 = var6.length(); // L: 192
							var4 = 0; // L: 193
							var7 = -1; // L: 194
							var11 = 0; // L: 195
						} else if (var16.equals("lt")) { // L: 197
							var4 += this.charWidth('<'); // L: 198
							if (this.kerning != null && var11 != -1) { // L: 199
								var4 += this.kerning[(var11 << '\b') + 60];
							}

							var11 = '<'; // L: 200
						} else if (var16.equals("gt")) { // L: 202
							var4 += this.charWidth('>'); // L: 203
							if (this.kerning != null && var11 != -1) { // L: 204
								var4 += this.kerning[(var11 << '\b') + 62];
							}

							var11 = '>'; // L: 205
						} else if (var16.startsWith("img=")) { // L: 207
							try {
								int var17 = class412.method7858(var16.substring(4)); // L: 209
								var4 += AbstractFont_modIconSprites[var17].width; // L: 210
								var11 = 0; // L: 211
							} catch (Exception var20) { // L: 213
							}
						}

						var15 = 0; // L: 215
					}

					if (var10 == -1) { // L: 217
						if (var15 != 0) { // L: 218
							var6.append(var15); // L: 219
							var4 += this.charWidth(var15); // L: 220
							if (this.kerning != null && var11 != -1) { // L: 221
								var4 += this.kerning[var15 + (var11 << '\b')];
							}

							var11 = var15; // L: 222
						}

						if (var15 == ' ') { // L: 224
							var7 = var6.length(); // L: 225
							var8 = var4; // L: 226
							var9 = 1; // L: 227
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) { // L: 229
							var3[var12] = var6.toString().substring(var5, var7 - var9); // L: 230
							++var12; // L: 231
							var5 = var7; // L: 232
							var7 = -1; // L: 233
							var4 -= var8; // L: 234
							var11 = 0; // L: 235
						}

						if (var15 == '-') { // L: 237
							var7 = var6.length(); // L: 238
							var8 = var4; // L: 239
							var9 = 0; // L: 240
						}
					}
				}
			}

			String var19 = var6.toString(); // L: 244
			if (var19.length() > var5) { // L: 245
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12; // L: 246
		}
	}

	@ObfuscatedName("b")
	@Export("lineWidth")
	public int lineWidth(String var1, int var2) {
		int var3 = this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 250
		int var4 = 0; // L: 251

		for (int var5 = 0; var5 < var3; ++var5) { // L: 252
			int var6 = this.stringWidth(AbstractFont_lines[var5]); // L: 253
			if (var6 > var4) { // L: 254
				var4 = var6;
			}
		}

		return var4; // L: 256
	}

	@ObfuscatedName("j")
	@Export("lineCount")
	public int lineCount(String var1, int var2) {
		return this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 260
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)Lok;"
	)
	public Bounds method7169(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var2 + var1) { // L: 281
			int var6 = var4 - this.stringWidth(var3) / 2; // L: 284
			var6 += this.stringWidth(var3.substring(0, var1)); // L: 285
			int var7 = var5 - this.maxAscent; // L: 286
			int var8 = this.stringWidth(var3.substring(var1, var2 + var1)); // L: 287
			int var9 = this.maxAscent + this.maxDescent; // L: 288
			return new Bounds(var6, var7, var8, var9); // L: 289
		} else {
			return new Bounds(var4, var5, 0, 0); // L: 282
		}
	}

	@ObfuscatedName("o")
	@Export("draw")
	public void draw(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 293
			this.reset(var4, var5); // L: 294
			this.draw0(var1, var2, var3); // L: 295
		}
	} // L: 296

	@ObfuscatedName("n")
	@Export("drawAlpha")
	public void drawAlpha(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 299
			this.reset(var4, var5); // L: 300
			AbstractFont_alpha = var6; // L: 301
			this.draw0(var1, var2, var3); // L: 302
		}
	} // L: 303

	@ObfuscatedName("k")
	@Export("drawRightAligned")
	public void drawRightAligned(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 306
			this.reset(var4, var5); // L: 307
			this.draw0(var1, var2 - this.stringWidth(var1), var3); // L: 308
		}
	} // L: 309

	@ObfuscatedName("a")
	@Export("drawCentered")
	public void drawCentered(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 312
			this.reset(var4, var5); // L: 313
			this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3); // L: 314
		}
	} // L: 315

	@ObfuscatedName("s")
	@Export("drawLines")
	public int drawLines(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (var1 == null) { // L: 318
			return 0;
		} else {
			this.reset(var6, var7); // L: 319
			if (var10 == 0) { // L: 320
				var10 = this.ascent;
			}

			int[] var11 = new int[]{var4}; // L: 321
			if (var5 < var10 + this.maxAscent + this.maxDescent && var5 < var10 + var10) { // L: 322
				var11 = null;
			}

			int var12 = this.breakLines(var1, var11, AbstractFont_lines); // L: 323
			if (var9 == 3 && var12 == 1) { // L: 325
				var9 = 1;
			}

			int var13;
			int var14;
			if (var9 == 0) { // L: 326
				var13 = var3 + this.maxAscent;
			} else if (var9 == 1) { // L: 327
				var13 = var3 + (var5 - this.maxAscent - this.maxDescent - var10 * (var12 - 1)) / 2 + this.maxAscent;
			} else if (var9 == 2) { // L: 328
				var13 = var3 + var5 - this.maxDescent - var10 * (var12 - 1);
			} else {
				var14 = (var5 - this.maxAscent - this.maxDescent - var10 * (var12 - 1)) / (var12 + 1); // L: 330
				if (var14 < 0) { // L: 331
					var14 = 0;
				}

				var13 = var3 + var14 + this.maxAscent; // L: 332
				var10 += var14; // L: 333
			}

			for (var14 = 0; var14 < var12; ++var14) { // L: 335
				if (var8 == 0) {
					this.draw0(AbstractFont_lines[var14], var2, var13); // L: 336
				} else if (var8 == 1) { // L: 337
					this.draw0(AbstractFont_lines[var14], var2 + (var4 - this.stringWidth(AbstractFont_lines[var14])) / 2, var13);
				} else if (var8 == 2) { // L: 338
					this.draw0(AbstractFont_lines[var14], var2 + var4 - this.stringWidth(AbstractFont_lines[var14]), var13);
				} else if (var14 == var12 - 1) { // L: 340
					this.draw0(AbstractFont_lines[var14], var2, var13);
				} else {
					this.calculateLineJustification(AbstractFont_lines[var14], var4); // L: 342
					this.draw0(AbstractFont_lines[var14], var2, var13); // L: 343
					AbstractFont_justificationTotal = 0; // L: 344
				}

				var13 += var10; // L: 347
			}

			return var12; // L: 349
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lna;IIIII)Lpg;"
	)
	public class440 method7166(class372 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method7251()) { // L: 353
			this.reset(var4, var5); // L: 354
			var3 -= this.ascent; // L: 355

			for (int var7 = 0; var7 < var1.method7269(); ++var7) { // L: 356
				class370 var8 = var1.method7256(var7); // L: 357
				if (var6 != -1 && var8.field4397 > var6) { // L: 358 359
					return new class440(var8.field4398, var8.field4397); // L: 360
				}

				char var9 = var8.field4395; // L: 363
				if (var9 != '\n') { // L: 364
					if (var1.method7250(var7)) { // L: 365
						var9 = '*'; // L: 366
					}

					if (var9 != '\t') { // L: 368
						if (var9 == 160) { // L: 369
							var9 = ' ';
						}

						int var10 = var2 + var8.field4398; // L: 370
						int var11 = var3 + var8.field4397; // L: 371
						int var12 = this.widths[var9]; // L: 372
						int var13 = this.heights[var9]; // L: 373
						if (AbstractFont_shadow != -1) { // L: 374
							this.drawGlyph(this.pixels[var9], var10 + this.leftBearings[var9] + 1, var11 + this.topBearings[var9] + 1, var12, var13, AbstractFont_shadow); // L: 375
						}

						this.drawGlyph(this.pixels[var9], var10 + this.leftBearings[var9], var11 + this.topBearings[var9], var12, var13, AbstractFont_color); // L: 377
					}
				}
			}
		}

		return var1.method7255(); // L: 382
	}

	@ObfuscatedName("t")
	@Export("drawCenteredWave")
	public void drawCenteredWave(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 386
			this.reset(var4, var5); // L: 387
			int[] var7 = new int[var1.length()]; // L: 388

			for (int var8 = 0; var8 < var1.length(); ++var8) { // L: 389
				var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var7); // L: 390
		}
	} // L: 391

	@ObfuscatedName("c")
	@Export("drawCenteredWave2")
	public void drawCenteredWave2(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 394
			this.reset(var4, var5); // L: 395
			int[] var7 = new int[var1.length()]; // L: 396
			int[] var8 = new int[var1.length()]; // L: 397

			for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 398
				var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D); // L: 399
				var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D); // L: 400
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, var7, var8); // L: 402
		}
	} // L: 403

	@ObfuscatedName("p")
	@Export("drawCenteredShake")
	public void drawCenteredShake(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) { // L: 406
			this.reset(var4, var5); // L: 407
			double var8 = 7.0D - (double)var7 / 8.0D; // L: 408
			if (var8 < 0.0D) { // L: 409
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.length()]; // L: 410

			for (int var11 = 0; var11 < var1.length(); ++var11) { // L: 411
				var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var10); // L: 412
		}
	} // L: 413

	@ObfuscatedName("d")
	@Export("drawRandomAlphaAndSpacing")
	public void drawRandomAlphaAndSpacing(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 416
			this.reset(var4, var5); // L: 417
			AbstractFont_random.setSeed((long)var6); // L: 418
			AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31); // L: 419
			int[] var7 = new int[var1.length()]; // L: 420
			int var8 = 0; // L: 421

			for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 422
				var7[var9] = var8; // L: 423
				if ((AbstractFont_random.nextInt() & 3) == 0) { // L: 424
					++var8;
				}
			}

			this.drawWithOffsets0(var1, var2, var3, var7, (int[])null); // L: 426
		}
	} // L: 427

	@ObfuscatedName("y")
	@Export("reset")
	void reset(int var1, int var2) {
		AbstractFont_strike = -1; // L: 430
		AbstractFont_underline = -1; // L: 431
		AbstractFont_previousShadow = var2; // L: 432
		AbstractFont_shadow = var2;
		AbstractFont_previousColor = var1; // L: 433
		AbstractFont_color = var1;
		AbstractFont_alpha = 256; // L: 434
		AbstractFont_justificationTotal = 0; // L: 435
		AbstractFont_justificationCurrent = 0; // L: 436
	} // L: 437

	@ObfuscatedName("z")
	@Export("decodeTag")
	void decodeTag(String var1) {
		try {
			if (var1.startsWith("col=")) { // L: 441
				AbstractFont_color = WorldMapElement.method3568(var1.substring(4), 16);
			} else if (var1.equals("/col")) { // L: 442
				AbstractFont_color = AbstractFont_previousColor;
			} else if (var1.startsWith("str=")) { // L: 443
				AbstractFont_strike = WorldMapElement.method3568(var1.substring(4), 16);
			} else if (var1.equals("str")) { // L: 444
				AbstractFont_strike = 8388608;
			} else if (var1.equals("/str")) { // L: 445
				AbstractFont_strike = -1;
			} else if (var1.startsWith("u=")) { // L: 446
				AbstractFont_underline = WorldMapElement.method3568(var1.substring(2), 16);
			} else if (var1.equals("u")) { // L: 447
				AbstractFont_underline = 0;
			} else if (var1.equals("/u")) { // L: 448
				AbstractFont_underline = -1;
			} else if (var1.startsWith("shad=")) { // L: 449
				AbstractFont_shadow = WorldMapElement.method3568(var1.substring(5), 16);
			} else if (var1.equals("shad")) { // L: 450
				AbstractFont_shadow = 0;
			} else if (var1.equals("/shad")) { // L: 451
				AbstractFont_shadow = AbstractFont_previousShadow;
			} else if (var1.equals("br")) { // L: 452
				this.reset(AbstractFont_previousColor, AbstractFont_previousShadow);
			}
		} catch (Exception var3) { // L: 454
		}

	} // L: 455

	@ObfuscatedName("w")
	@Export("calculateLineJustification")
	void calculateLineJustification(String var1, int var2) {
		int var3 = 0; // L: 458
		boolean var4 = false; // L: 459

		for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 460
			char var6 = var1.charAt(var5); // L: 461
			if (var6 == '<') { // L: 462
				var4 = true;
			} else if (var6 == '>') { // L: 463
				var4 = false;
			} else if (!var4 && var6 == ' ') { // L: 464
				++var3;
			}
		}

		if (var3 > 0) { // L: 466
			AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
		}

	} // L: 467

	@ObfuscatedName("as")
	@Export("draw0")
	void draw0(String var1, int var2, int var3) {
		var3 -= this.ascent; // L: 470
		int var4 = -1; // L: 471
		int var5 = -1; // L: 472

		for (int var6 = 0; var6 < var1.length(); ++var6) { // L: 473
			if (var1.charAt(var6) != 0) { // L: 474
				char var7 = (char)(class299.charToByteCp1252(var1.charAt(var6)) & 255); // L: 475
				if (var7 == '<') { // L: 476
					var4 = var6; // L: 477
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) { // L: 480
						String var8 = var1.substring(var4 + 1, var6); // L: 481
						var4 = -1; // L: 482
						if (var8.equals("lt")) { // L: 483
							var7 = '<';
						} else {
							if (!var8.equals("gt")) { // L: 484
								if (var8.startsWith("img=")) { // L: 485
									try {
										var9 = class412.method7858(var8.substring(4)); // L: 487
										IndexedSprite var10 = AbstractFont_modIconSprites[var9]; // L: 488
										var10.drawAt(var2, var3 + this.ascent - var10.height); // L: 489
										var2 += var10.width; // L: 490
										var5 = -1; // L: 491
									} catch (Exception var14) { // L: 493
									}
								} else {
									this.decodeTag(var8); // L: 497
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) { // L: 501
						var7 = ' ';
					}

					if (var4 == -1) { // L: 502
						if (this.kerning != null && var5 != -1) { // L: 503
							var2 += this.kerning[var7 + (var5 << 8)];
						}

						int var12 = this.widths[var7]; // L: 504
						var9 = this.heights[var7]; // L: 505
						if (var7 != ' ') { // L: 506
							if (AbstractFont_alpha == 256) { // L: 507
								if (AbstractFont_shadow != -1) { // L: 508
									AbstractFont_drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color); // L: 509
							} else {
								if (AbstractFont_shadow != -1) { // L: 512
									AbstractFont_drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color, AbstractFont_alpha); // L: 513
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 517
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 518
							var2 += AbstractFont_justificationCurrent >> 8; // L: 519
							AbstractFont_justificationCurrent &= 255; // L: 520
						}

						int var13 = this.advances[var7]; // L: 523
						if (AbstractFont_strike != -1) { // L: 524
							Rasterizer2D.method8892(var2, var3 + (int)((double)this.ascent * 0.7D), var13, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 525
							Rasterizer2D.method8892(var2, var3 + this.ascent + 1, var13, AbstractFont_underline);
						}

						var2 += var13; // L: 526
						var5 = var7; // L: 527
					}
				}
			}
		}

	} // L: 530

	@ObfuscatedName("ad")
	@Export("drawWithOffsets0")
	void drawWithOffsets0(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.ascent; // L: 533
		int var6 = -1; // L: 534
		int var7 = -1; // L: 535
		int var8 = 0; // L: 536

		for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 537
			if (var1.charAt(var9) != 0) { // L: 538
				char var10 = (char)(class299.charToByteCp1252(var1.charAt(var9)) & 255); // L: 539
				if (var10 == '<') { // L: 540
					var6 = var9; // L: 541
				} else {
					int var12;
					int var13;
					int var14;
					if (var10 == '>' && var6 != -1) { // L: 544
						String var11 = var1.substring(var6 + 1, var9); // L: 545
						var6 = -1; // L: 546
						if (var11.equals("lt")) { // L: 547
							var10 = '<';
						} else {
							if (!var11.equals("gt")) { // L: 548
								if (var11.startsWith("img=")) { // L: 549
									try {
										if (var4 != null) { // L: 552
											var12 = var4[var8];
										} else {
											var12 = 0; // L: 553
										}

										if (var5 != null) { // L: 555
											var13 = var5[var8];
										} else {
											var13 = 0; // L: 556
										}

										++var8; // L: 557
										var14 = class412.method7858(var11.substring(4)); // L: 558
										IndexedSprite var15 = AbstractFont_modIconSprites[var14]; // L: 559
										var15.drawAt(var12 + var2, var13 + (var3 + this.ascent - var15.height)); // L: 560
										var2 += var15.width; // L: 561
										var7 = -1; // L: 562
									} catch (Exception var19) { // L: 564
									}
								} else {
									this.decodeTag(var11); // L: 568
								}
								continue;
							}

							var10 = '>';
						}
					}

					if (var10 == 160) { // L: 572
						var10 = ' ';
					}

					if (var6 == -1) { // L: 573
						if (this.kerning != null && var7 != -1) { // L: 574
							var2 += this.kerning[var10 + (var7 << 8)];
						}

						int var17 = this.widths[var10]; // L: 575
						var12 = this.heights[var10]; // L: 576
						if (var4 != null) { // L: 578
							var13 = var4[var8];
						} else {
							var13 = 0; // L: 579
						}

						if (var5 != null) { // L: 581
							var14 = var5[var8];
						} else {
							var14 = 0; // L: 582
						}

						++var8; // L: 583
						if (var10 != ' ') { // L: 584
							if (AbstractFont_alpha == 256) { // L: 585
								if (AbstractFont_shadow != -1) { // L: 586
									AbstractFont_drawGlyph(this.pixels[var10], var13 + var2 + this.leftBearings[var10] + 1, var3 + var14 + this.topBearings[var10] + 1, var17, var12, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var10], var13 + var2 + this.leftBearings[var10], var3 + var14 + this.topBearings[var10], var17, var12, AbstractFont_color); // L: 587
							} else {
								if (AbstractFont_shadow != -1) { // L: 590
									AbstractFont_drawGlyphAlpha(this.pixels[var10], var13 + var2 + this.leftBearings[var10] + 1, var3 + var14 + this.topBearings[var10] + 1, var17, var12, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var10], var13 + var2 + this.leftBearings[var10], var3 + var14 + this.topBearings[var10], var17, var12, AbstractFont_color, AbstractFont_alpha); // L: 591
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 595
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 596
							var2 += AbstractFont_justificationCurrent >> 8; // L: 597
							AbstractFont_justificationCurrent &= 255; // L: 598
						}

						int var18 = this.advances[var10]; // L: 601
						if (AbstractFont_strike != -1) { // L: 602
							Rasterizer2D.method8892(var2, var3 + (int)((double)this.ascent * 0.7D), var18, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 603
							Rasterizer2D.method8892(var2, var3 + this.ascent, var18, AbstractFont_underline);
						}

						var2 += var18; // L: 604
						var7 = var10; // L: 605
					}
				}
			}
		}

	} // L: 608

	@ObfuscatedName("q")
	static int method7186(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5]; // L: 102
		int var8 = var7 + var4[var5]; // L: 103
		int var9 = var2[var6]; // L: 104
		int var10 = var9 + var4[var6]; // L: 105
		int var11 = var7; // L: 106
		if (var9 > var7) { // L: 107
			var11 = var9;
		}

		int var12 = var8; // L: 108
		if (var10 < var8) { // L: 109
			var12 = var10;
		}

		int var13 = var3[var5]; // L: 110
		if (var3[var6] < var13) { // L: 111
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5]; // L: 112
		byte[] var15 = var0[var6]; // L: 113
		int var16 = var11 - var7; // L: 114
		int var17 = var11 - var9; // L: 115

		for (int var18 = var11; var18 < var12; ++var18) { // L: 116
			int var19 = var14[var16++] + var15[var17++]; // L: 117
			if (var19 < var13) { // L: 118
				var13 = var19;
			}
		}

		return -var13; // L: 120
	}

	@ObfuscatedName("g")
	@Export("escapeBrackets")
	public static String escapeBrackets(String var0) {
		int var1 = var0.length(); // L: 264
		int var2 = 0; // L: 265

		for (int var3 = 0; var3 < var1; ++var3) { // L: 266
			char var4 = var0.charAt(var3); // L: 267
			if (var4 == '<' || var4 == '>') {
				var2 += 3; // L: 268
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2); // L: 270

		for (int var7 = 0; var7 < var1; ++var7) { // L: 271
			char var5 = var0.charAt(var7); // L: 272
			if (var5 == '<') {
				var6.append("<lt>"); // L: 273
			} else if (var5 == '>') { // L: 274
				var6.append("<gt>");
			} else {
				var6.append(var5); // L: 275
			}
		}

		return var6.toString(); // L: 277
	}

	@ObfuscatedName("ao")
	@Export("AbstractFont_drawGlyph")
	static void AbstractFont_drawGlyph(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 614
		int var7 = Rasterizer2D.Rasterizer2D_width - var3; // L: 615
		int var8 = 0; // L: 616
		int var9 = 0; // L: 617
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 618
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 619
			var4 -= var10; // L: 620
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 621
			var9 += var3 * var10; // L: 622
			var6 += var10 * Rasterizer2D.Rasterizer2D_width; // L: 623
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 625
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 626
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 627
			var3 -= var10; // L: 628
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 629
			var9 += var10; // L: 630
			var6 += var10; // L: 631
			var8 += var10; // L: 632
			var7 += var10; // L: 633
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 635
			var10 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 636
			var3 -= var10; // L: 637
			var8 += var10; // L: 638
			var7 += var10; // L: 639
		}

		if (var3 > 0 && var4 > 0) { // L: 641
			AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8); // L: 642
		}
	} // L: 643

	@ObfuscatedName("am")
	@Export("AbstractFont_placeGlyph")
	static void AbstractFont_placeGlyph(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2); // L: 646
		var5 = -(var5 & 3); // L: 647

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 648
			int var11;
			for (var11 = var9; var11 < 0; ++var11) { // L: 649
				if (var1[var3++] != 0) { // L: 650
					var0[var4++] = var2;
				} else {
					++var4; // L: 651
				}

				if (var1[var3++] != 0) { // L: 652
					var0[var4++] = var2;
				} else {
					++var4; // L: 653
				}

				if (var1[var3++] != 0) { // L: 654
					var0[var4++] = var2;
				} else {
					++var4; // L: 655
				}

				if (var1[var3++] != 0) { // L: 656
					var0[var4++] = var2;
				} else {
					++var4; // L: 657
				}
			}

			for (var11 = var5; var11 < 0; ++var11) { // L: 659
				if (var1[var3++] != 0) { // L: 660
					var0[var4++] = var2;
				} else {
					++var4; // L: 661
				}
			}

			var4 += var7; // L: 663
			var3 += var8; // L: 664
		}

	} // L: 666

	@ObfuscatedName("av")
	@Export("AbstractFont_drawGlyphAlpha")
	static void AbstractFont_drawGlyphAlpha(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 669
		int var8 = Rasterizer2D.Rasterizer2D_width - var3; // L: 670
		int var9 = 0; // L: 671
		int var10 = 0; // L: 672
		int var11;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 673
			var11 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 674
			var4 -= var11; // L: 675
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 676
			var10 += var3 * var11; // L: 677
			var7 += var11 * Rasterizer2D.Rasterizer2D_width; // L: 678
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 680
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 681
			var11 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 682
			var3 -= var11; // L: 683
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 684
			var10 += var11; // L: 685
			var7 += var11; // L: 686
			var9 += var11; // L: 687
			var8 += var11; // L: 688
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 690
			var11 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 691
			var3 -= var11; // L: 692
			var9 += var11; // L: 693
			var8 += var11; // L: 694
		}

		if (var3 > 0 && var4 > 0) { // L: 696
			AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var10, var7, var3, var4, var8, var9, var6); // L: 697
		}
	} // L: 698

	@ObfuscatedName("au")
	@Export("AbstractFont_placeGlyphAlpha")
	static void AbstractFont_placeGlyphAlpha(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8; // L: 701
		var9 = 256 - var9; // L: 702

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 703
			for (int var11 = -var5; var11 < 0; ++var11) { // L: 704
				if (var1[var3++] != 0) { // L: 705
					int var12 = var0[var4]; // L: 706
					var0[var4++] = (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2; // L: 707
				} else {
					++var4; // L: 709
				}
			}

			var4 += var7; // L: 711
			var3 += var8; // L: 712
		}

	} // L: 714
}
