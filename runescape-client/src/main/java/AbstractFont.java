import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
@Implements("AbstractFont")
public abstract class AbstractFont extends Rasterizer2D {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lum;"
	)
	@Export("AbstractFont_modIconSprites")
	public static IndexedSprite[] AbstractFont_modIconSprites;
	@ObfuscatedName("as")
	@Export("AbstractFont_strike")
	static int AbstractFont_strike;
	@ObfuscatedName("am")
	@Export("AbstractFont_underline")
	static int AbstractFont_underline;
	@ObfuscatedName("ag")
	@Export("AbstractFont_previousShadow")
	static int AbstractFont_previousShadow;
	@ObfuscatedName("aa")
	@Export("AbstractFont_shadow")
	static int AbstractFont_shadow;
	@ObfuscatedName("ar")
	@Export("AbstractFont_previousColor")
	static int AbstractFont_previousColor;
	@ObfuscatedName("ad")
	@Export("AbstractFont_color")
	static int AbstractFont_color;
	@ObfuscatedName("at")
	@Export("AbstractFont_alpha")
	static int AbstractFont_alpha;
	@ObfuscatedName("af")
	@Export("AbstractFont_justificationTotal")
	static int AbstractFont_justificationTotal;
	@ObfuscatedName("ae")
	@Export("AbstractFont_justificationCurrent")
	static int AbstractFont_justificationCurrent;
	@ObfuscatedName("al")
	@Export("AbstractFont_random")
	static Random AbstractFont_random;
	@ObfuscatedName("aq")
	@Export("AbstractFont_lines")
	static String[] AbstractFont_lines;
	@ObfuscatedName("aj")
	@Export("pixels")
	byte[][] pixels;
	@ObfuscatedName("ac")
	@Export("advances")
	int[] advances;
	@ObfuscatedName("aw")
	@Export("widths")
	int[] widths;
	@ObfuscatedName("ay")
	@Export("heights")
	int[] heights;
	@ObfuscatedName("ap")
	@Export("leftBearings")
	int[] leftBearings;
	@ObfuscatedName("av")
	@Export("topBearings")
	int[] topBearings;
	@ObfuscatedName("an")
	@Export("ascent")
	public int ascent;
	@ObfuscatedName("au")
	@Export("maxAscent")
	public int maxAscent;
	@ObfuscatedName("az")
	@Export("maxDescent")
	public int maxDescent;
	@ObfuscatedName("ao")
	@Export("kerning")
	byte[] kerning;

	static {
		AbstractFont_strike = -1; // L: 26
		AbstractFont_underline = -1; // L: 27
		AbstractFont_previousShadow = -1; // L: 28
		AbstractFont_shadow = -1; // L: 29
		AbstractFont_previousColor = 0; // L: 30
		AbstractFont_color = 0; // L: 31
		AbstractFont_alpha = 256; // L: 32
		AbstractFont_justificationTotal = 0; // L: 33
		AbstractFont_justificationCurrent = 0; // L: 34
		AbstractFont_random = new Random(); // L: 35
		AbstractFont_lines = new String[100]; // L: 36
	}

	AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.pixels = new byte[256][];
		this.ascent = 0;
		this.leftBearings = var2; // L: 39
		this.topBearings = var3; // L: 40
		this.widths = var4; // L: 41
		this.heights = var5; // L: 42
		this.readMetrics(var1); // L: 43
		this.pixels = var7; // L: 44
		int var8 = Integer.MAX_VALUE; // L: 45
		int var9 = Integer.MIN_VALUE; // L: 46

		for (int var10 = 0; var10 < 256; ++var10) { // L: 47
			if (this.topBearings[var10] < var8 && this.heights[var10] != 0) { // L: 48
				var8 = this.topBearings[var10];
			}

			if (this.topBearings[var10] + this.heights[var10] > var9) { // L: 49
				var9 = this.topBearings[var10] + this.heights[var10];
			}
		}

		this.maxAscent = this.ascent - var8; // L: 51
		this.maxDescent = var9 - this.ascent; // L: 52
	} // L: 53

	AbstractFont(byte[] var1) {
		this.pixels = new byte[256][]; // L: 15
		this.ascent = 0; // L: 21
		this.readMetrics(var1); // L: 56
	} // L: 57

	@ObfuscatedName("ai")
	@Export("drawGlyph")
	abstract void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfuscatedName("aj")
	@Export("drawGlyphAlpha")
	abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfuscatedName("au")
	@Export("readMetrics")
	void readMetrics(byte[] var1) {
		this.advances = new int[256]; // L: 60
		int var2;
		if (var1.length == 257) { // L: 61
			for (var2 = 0; var2 < this.advances.length; ++var2) { // L: 62
				this.advances[var2] = var1[var2] & 255;
			}

			this.ascent = var1[256] & 255; // L: 63
		} else {
			var2 = 0; // L: 66

			for (int var3 = 0; var3 < 256; ++var3) { // L: 67
				this.advances[var3] = var1[var2++] & 255;
			}

			int[] var10 = new int[256]; // L: 68
			int[] var4 = new int[256]; // L: 69

			int var5;
			for (var5 = 0; var5 < 256; ++var5) { // L: 70
				var10[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) { // L: 71
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][]; // L: 72

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) { // L: 73
				var11[var6] = new byte[var10[var6]]; // L: 74
				byte var7 = 0; // L: 75

				for (var8 = 0; var8 < var11[var6].length; ++var8) { // L: 76
					var7 += var1[var2++]; // L: 77
					var11[var6][var8] = var7; // L: 78
				}
			}

			byte[][] var12 = new byte[256][]; // L: 81

			int var13;
			for (var13 = 0; var13 < 256; ++var13) { // L: 82
				var12[var13] = new byte[var10[var13]]; // L: 83
				byte var14 = 0; // L: 84

				for (int var9 = 0; var9 < var12[var13].length; ++var9) { // L: 85
					var14 += var1[var2++]; // L: 86
					var12[var13][var9] = var14; // L: 87
				}
			}

			this.kerning = new byte[65536]; // L: 90

			for (var13 = 0; var13 < 256; ++var13) { // L: 91
				if (var13 != 32 && var13 != 160) { // L: 92
					for (var8 = 0; var8 < 256; ++var8) { // L: 93
						if (var8 != 32 && var8 != 160) { // L: 94
							this.kerning[var8 + (var13 << 8)] = (byte)method7502(var11, var12, var4, this.advances, var10, var13, var8); // L: 95
						}
					}
				}
			}

			this.ascent = var4[32] + var10[32]; // L: 98
		}

	} // L: 100

	@ObfuscatedName("ab")
	@Export("charWidth")
	public int charWidth(char var1) {
		if (var1 == 160) { // L: 125
			var1 = ' ';
		}

		return this.advances[UserComparator4.charToByteCp1252(var1) & 255]; // L: 126
	}

	@ObfuscatedName("ao")
	@Export("stringWidth")
	public int stringWidth(String var1) {
		if (var1 == null) { // L: 130
			return 0;
		} else {
			int var2 = -1; // L: 131
			int var3 = -1; // L: 132
			int var4 = 0; // L: 133

			for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 134
				char var6 = var1.charAt(var5); // L: 135
				if (var6 == '<') { // L: 136
					var2 = var5; // L: 137
				} else {
					if (var6 == '>' && var2 != -1) { // L: 140
						String var7 = var1.substring(var2 + 1, var5); // L: 141
						var2 = -1; // L: 142
						if (var7.equals("lt")) { // L: 143
							var6 = '<';
						} else {
							if (!var7.equals("gt")) { // L: 144
								if (var7.startsWith("img=")) { // L: 145
									try {
										int var8 = class317.method6078(var7.substring(4)); // L: 147
										var4 += AbstractFont_modIconSprites[var8].width; // L: 148
										var3 = -1; // L: 149
									} catch (Exception var10) { // L: 151
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) { // L: 156
						var6 = ' ';
					}

					if (var2 == -1) { // L: 157
						var4 += this.advances[(char)(UserComparator4.charToByteCp1252(var6) & 255)]; // L: 158
						if (this.kerning != null && var3 != -1) { // L: 159
							var4 += this.kerning[var6 + (var3 << 8)];
						}

						var3 = var6; // L: 160
					}
				}
			}

			return var4; // L: 163
		}
	}

	@ObfuscatedName("as")
	@Export("breakLines")
	public int breakLines(String var1, int[] var2, String[] var3) {
		if (var1 == null) { // L: 167
			return 0;
		} else {
			int var4 = 0; // L: 168
			int var5 = 0; // L: 169
			StringBuilder var6 = new StringBuilder(100); // L: 170
			int var7 = -1; // L: 171
			int var8 = 0; // L: 172
			byte var9 = 0; // L: 173
			int var10 = -1; // L: 174
			char var11 = 0; // L: 175
			int var12 = 0; // L: 176
			int var13 = var1.length(); // L: 177

			for (int var14 = 0; var14 < var13; ++var14) { // L: 178
				char var15 = var1.charAt(var14); // L: 179
				if (var15 == '<') { // L: 180
					var10 = var14; // L: 181
				} else {
					if (var15 == '>' && var10 != -1) { // L: 184
						String var16 = var1.substring(var10 + 1, var14); // L: 185
						var10 = -1; // L: 186
						var6.append('<'); // L: 187
						var6.append(var16); // L: 188
						var6.append('>'); // L: 189
						if (var16.equals("br")) { // L: 190
							var3[var12] = var6.toString().substring(var5, var6.length()); // L: 191
							++var12; // L: 192
							var5 = var6.length(); // L: 193
							var4 = 0; // L: 194
							var7 = -1; // L: 195
							var11 = 0; // L: 196
						} else if (var16.equals("lt")) { // L: 198
							var4 += this.charWidth('<'); // L: 199
							if (this.kerning != null && var11 != -1) { // L: 200
								var4 += this.kerning[(var11 << '\b') + 60];
							}

							var11 = '<'; // L: 201
						} else if (var16.equals("gt")) { // L: 203
							var4 += this.charWidth('>'); // L: 204
							if (this.kerning != null && var11 != -1) { // L: 205
								var4 += this.kerning[(var11 << '\b') + 62];
							}

							var11 = '>'; // L: 206
						} else if (var16.startsWith("img=")) { // L: 208
							try {
								int var17 = class317.method6078(var16.substring(4)); // L: 210
								var4 += AbstractFont_modIconSprites[var17].width; // L: 211
								var11 = 0; // L: 212
							} catch (Exception var20) { // L: 214
							}
						}

						var15 = 0; // L: 216
					}

					if (var10 == -1) { // L: 218
						if (var15 != 0) { // L: 219
							var6.append(var15); // L: 220
							var4 += this.charWidth(var15); // L: 221
							if (this.kerning != null && var11 != -1) { // L: 222
								var4 += this.kerning[var15 + (var11 << '\b')];
							}

							var11 = var15; // L: 223
						}

						if (var15 == ' ') { // L: 225
							var7 = var6.length(); // L: 226
							var8 = var4; // L: 227
							var9 = 1; // L: 228
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) { // L: 230
							var3[var12] = var6.toString().substring(var5, var7 - var9); // L: 231
							++var12; // L: 232
							var5 = var7; // L: 233
							var7 = -1; // L: 234
							var4 -= var8; // L: 235
							var11 = 0; // L: 236
						}

						if (var15 == '-') { // L: 238
							var7 = var6.length(); // L: 239
							var8 = var4; // L: 240
							var9 = 0; // L: 241
						}
					}
				}
			}

			String var19 = var6.toString(); // L: 245
			if (var19.length() > var5) { // L: 246
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12; // L: 247
		}
	}

	@ObfuscatedName("am")
	@Export("lineWidth")
	public int lineWidth(String var1, int var2) {
		int var3 = this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 251
		int var4 = 0; // L: 252

		for (int var5 = 0; var5 < var3; ++var5) { // L: 253
			int var6 = this.stringWidth(AbstractFont_lines[var5]); // L: 254
			if (var6 > var4) { // L: 255
				var4 = var6;
			}
		}

		return var4; // L: 257
	}

	@ObfuscatedName("ag")
	@Export("lineCount")
	public int lineCount(String var1, int var2) {
		return this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 261
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)Lrh;"
	)
	public Bounds method7479(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var2 + var1) { // L: 282
			int var6 = var4 - this.stringWidth(var3) / 2; // L: 285
			var6 += this.stringWidth(var3.substring(0, var1)); // L: 286
			int var7 = var5 - this.maxAscent; // L: 287
			int var8 = this.stringWidth(var3.substring(var1, var2 + var1)); // L: 288
			int var9 = this.maxAscent + this.maxDescent; // L: 289
			return new Bounds(var6, var7, var8, var9); // L: 290
		} else {
			return new Bounds(var4, var5, 0, 0); // L: 283
		}
	}

	@ObfuscatedName("ad")
	@Export("draw")
	public void draw(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 294
			this.reset(var4, var5); // L: 295
			this.draw0(var1, var2, var3); // L: 296
		}
	} // L: 297

	@ObfuscatedName("at")
	@Export("drawAlpha")
	public void drawAlpha(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 300
			this.reset(var4, var5); // L: 301
			AbstractFont_alpha = var6; // L: 302
			this.draw0(var1, var2, var3); // L: 303
		}
	} // L: 304

	@ObfuscatedName("af")
	@Export("drawRightAligned")
	public void drawRightAligned(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 307
			this.reset(var4, var5); // L: 308
			this.draw0(var1, var2 - this.stringWidth(var1), var3); // L: 309
		}
	} // L: 310

	@ObfuscatedName("ae")
	@Export("drawCentered")
	public void drawCentered(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 313
			this.reset(var4, var5); // L: 314
			this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3); // L: 315
		}
	} // L: 316

	@ObfuscatedName("al")
	@Export("drawLines")
	public int drawLines(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.method7575(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10); // L: 319
	}

	@ObfuscatedName("aq")
	public int method7575(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) { // L: 323
			return 0;
		} else {
			if (var8 == 255) { // L: 324
				var8 = 256;
			}

			this.reset(var6, var7); // L: 325
			AbstractFont_alpha = var8; // L: 326
			if (var11 == 0) { // L: 327
				var11 = this.ascent;
			}

			int[] var12 = new int[]{var4}; // L: 328
			if (var5 < var11 + this.maxAscent + this.maxDescent && var5 < var11 + var11) { // L: 329
				var12 = null;
			}

			int var13 = this.breakLines(var1, var12, AbstractFont_lines); // L: 330
			if (var10 == 3 && var13 == 1) { // L: 332
				var10 = 1;
			}

			int var14;
			int var15;
			if (var10 == 0) { // L: 333
				var14 = var3 + this.maxAscent;
			} else if (var10 == 1) { // L: 334
				var14 = var3 + this.maxAscent + (var5 - this.maxAscent - this.maxDescent - var11 * (var13 - 1)) / 2;
			} else if (var10 == 2) { // L: 335
				var14 = var3 + var5 - this.maxDescent - var11 * (var13 - 1);
			} else {
				var15 = (var5 - this.maxAscent - this.maxDescent - var11 * (var13 - 1)) / (var13 + 1); // L: 337
				if (var15 < 0) { // L: 338
					var15 = 0;
				}

				var14 = var3 + var15 + this.maxAscent; // L: 339
				var11 += var15; // L: 340
			}

			for (var15 = 0; var15 < var13; ++var15) { // L: 342
				if (var9 == 0) { // L: 343
					this.draw0(AbstractFont_lines[var15], var2, var14);
				} else if (var9 == 1) { // L: 344
					this.draw0(AbstractFont_lines[var15], var2 + (var4 - this.stringWidth(AbstractFont_lines[var15])) / 2, var14);
				} else if (var9 == 2) { // L: 345
					this.draw0(AbstractFont_lines[var15], var2 + var4 - this.stringWidth(AbstractFont_lines[var15]), var14);
				} else if (var15 == var13 - 1) { // L: 347
					this.draw0(AbstractFont_lines[var15], var2, var14);
				} else {
					this.calculateLineJustification(AbstractFont_lines[var15], var4); // L: 349
					this.draw0(AbstractFont_lines[var15], var2, var14); // L: 350
					AbstractFont_justificationTotal = 0; // L: 351
				}

				var14 += var11; // L: 354
			}

			return var13; // L: 356
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lpt;IIIII)Lsh;"
	)
	public class485 method7486(class398 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method7584()) { // L: 360
			this.reset(var4, var5); // L: 361
			var3 -= this.ascent; // L: 362

			for (int var7 = 0; var7 < var1.method7583(); ++var7) { // L: 363
				class396 var8 = var1.method7586(var7); // L: 364
				if (var6 != -1 && var8.field4463 > var6) { // L: 365 366
					return new class485(var8.field4464, var8.field4463); // L: 367
				}

				char var9 = var8.field4465; // L: 370
				if (var9 != '\n') { // L: 371
					if (var1.method7581(var7)) { // L: 372
						var9 = '*'; // L: 373
					}

					if (var9 != '\t') { // L: 375
						if (var9 == 160) { // L: 376
							var9 = ' ';
						}

						int var10 = var2 + var8.field4464; // L: 377
						int var11 = var3 + var8.field4463; // L: 378
						int var12 = this.widths[var9]; // L: 379
						int var13 = this.heights[var9]; // L: 380
						if (AbstractFont_shadow != -1) { // L: 381
							this.drawGlyph(this.pixels[var9], var10 + this.leftBearings[var9] + 1, var11 + this.topBearings[var9] + 1, var12, var13, AbstractFont_shadow); // L: 382
						}

						this.drawGlyph(this.pixels[var9], var10 + this.leftBearings[var9], var11 + this.topBearings[var9], var12, var13, AbstractFont_color); // L: 384
					}
				}
			}
		}

		return var1.method7585(); // L: 389
	}

	@ObfuscatedName("ak")
	public void method7547(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) { // L: 393
			this.reset(var4, var5); // L: 394
			int[] var8 = null; // L: 395
			if (var7 != null) { // L: 396
				var8 = this.method7492(var7, var1.length());
			}

			int[] var9 = new int[var1.length()]; // L: 397

			for (int var10 = 0; var10 < var1.length(); ++var10) { // L: 398
				var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method7498(var1, var2 - this.stringWidth(var1) / 2, var3, var8, (int[])null, var9); // L: 399
		}
	} // L: 400

	@ObfuscatedName("ax")
	public void method7524(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) { // L: 403
			this.reset(var4, var5); // L: 404
			int[] var8 = null; // L: 405
			if (var7 != null) { // L: 406
				var8 = this.method7492(var7, var1.length());
			}

			int[] var9 = new int[var1.length()]; // L: 407
			int[] var10 = new int[var1.length()]; // L: 408

			for (int var11 = 0; var11 < var1.length(); ++var11) { // L: 409
				var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D); // L: 410
				var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D); // L: 411
			}

			this.method7498(var1, var2 - this.stringWidth(var1) / 2, var3, var8, var9, var10); // L: 413
		}
	} // L: 414

	@ObfuscatedName("bm")
	public void method7489(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) { // L: 417
			this.reset(var4, var5); // L: 418
			int[] var9 = null; // L: 419
			if (var8 != null) { // L: 420
				var9 = this.method7492(var8, var1.length());
			}

			double var10 = 7.0D - (double)var7 / 8.0D; // L: 421
			if (var10 < 0.0D) { // L: 422
				var10 = 0.0D;
			}

			int[] var12 = new int[var1.length()]; // L: 423

			for (int var13 = 0; var13 < var1.length(); ++var13) { // L: 424
				var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
			}

			this.method7498(var1, var2 - this.stringWidth(var1) / 2, var3, var9, (int[])null, var12); // L: 425
		}
	} // L: 426

	@ObfuscatedName("bt")
	public void method7553(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) { // L: 429
			this.reset(var4, var5); // L: 430
			int[] var7 = null; // L: 431
			if (var6 != null) { // L: 432
				var7 = this.method7492(var6, var1.length());
			}

			this.method7498(var1, var2 - this.stringWidth(var1) / 2, var3, var7, (int[])null, (int[])null); // L: 433
		}
	} // L: 434

	@ObfuscatedName("by")
	public void method7507(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) { // L: 437
			this.reset(var4, var5); // L: 438
			int[] var7 = null; // L: 439
			if (var6 != null) { // L: 440
				var7 = this.method7492(var6, var1.length());
			}

			this.method7498(var1, var2, var3, var7, (int[])null, (int[])null); // L: 441
		}
	} // L: 442

	@ObfuscatedName("bc")
	int[] method7492(int[] var1, int var2) {
		if (var2 == 0) { // L: 445
			return null;
		} else {
			int[] var3 = new int[var2]; // L: 446
			float var4 = (float)var1.length / (float)var2; // L: 447

			for (int var5 = 0; var5 < var2; ++var5) { // L: 448
				var3[var5] = var1[(int)((float)var5 * var4)]; // L: 449
			}

			return var3; // L: 451
		}
	}

	@ObfuscatedName("bw")
	@Export("drawRandomAlphaAndSpacing")
	public void drawRandomAlphaAndSpacing(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 455
			this.reset(var4, var5); // L: 456
			AbstractFont_random.setSeed((long)var6); // L: 457
			AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31); // L: 458
			int[] var7 = new int[var1.length()]; // L: 459
			int var8 = 0; // L: 460

			for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 461
				var7[var9] = var8; // L: 462
				if ((AbstractFont_random.nextInt() & 3) == 0) { // L: 463
					++var8;
				}
			}

			this.method7498(var1, var2, var3, (int[])null, var7, (int[])null); // L: 465
		}
	} // L: 466

	@ObfuscatedName("bq")
	@Export("reset")
	void reset(int var1, int var2) {
		AbstractFont_strike = -1; // L: 469
		AbstractFont_underline = -1; // L: 470
		AbstractFont_previousShadow = var2; // L: 471
		AbstractFont_shadow = var2;
		AbstractFont_previousColor = var1; // L: 472
		AbstractFont_color = var1;
		AbstractFont_alpha = 256; // L: 473
		AbstractFont_justificationTotal = 0; // L: 474
		AbstractFont_justificationCurrent = 0; // L: 475
	} // L: 476

	@ObfuscatedName("bn")
	@Export("decodeTag")
	void decodeTag(String var1) {
		try {
			if (var1.startsWith("col=")) { // L: 480
				AbstractFont_color = class165.method3441(var1.substring(4), 16);
			} else if (var1.equals("/col")) { // L: 481
				AbstractFont_color = AbstractFont_previousColor;
			} else if (var1.startsWith("str=")) { // L: 482
				AbstractFont_strike = class165.method3441(var1.substring(4), 16);
			} else if (var1.equals("str")) { // L: 483
				AbstractFont_strike = 8388608;
			} else if (var1.equals("/str")) { // L: 484
				AbstractFont_strike = -1;
			} else if (var1.startsWith("u=")) { // L: 485
				AbstractFont_underline = class165.method3441(var1.substring(2), 16);
			} else if (var1.equals("u")) { // L: 486
				AbstractFont_underline = 0;
			} else if (var1.equals("/u")) { // L: 487
				AbstractFont_underline = -1;
			} else if (var1.startsWith("shad=")) { // L: 488
				AbstractFont_shadow = class165.method3441(var1.substring(5), 16);
			} else if (var1.equals("shad")) { // L: 489
				AbstractFont_shadow = 0;
			} else if (var1.equals("/shad")) { // L: 490
				AbstractFont_shadow = AbstractFont_previousShadow;
			} else if (var1.equals("br")) { // L: 491
				this.reset(AbstractFont_previousColor, AbstractFont_previousShadow);
			}
		} catch (Exception var3) { // L: 493
		}

	} // L: 494

	@ObfuscatedName("bb")
	@Export("calculateLineJustification")
	void calculateLineJustification(String var1, int var2) {
		int var3 = 0; // L: 497
		boolean var4 = false; // L: 498

		for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 499
			char var6 = var1.charAt(var5); // L: 500
			if (var6 == '<') { // L: 501
				var4 = true;
			} else if (var6 == '>') { // L: 502
				var4 = false;
			} else if (!var4 && var6 == ' ') { // L: 503
				++var3;
			}
		}

		if (var3 > 0) { // L: 505
			AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
		}

	} // L: 506

	@ObfuscatedName("bi")
	@Export("draw0")
	void draw0(String var1, int var2, int var3) {
		var3 -= this.ascent; // L: 509
		int var4 = -1; // L: 510
		int var5 = -1; // L: 511

		for (int var6 = 0; var6 < var1.length(); ++var6) { // L: 512
			if (var1.charAt(var6) != 0) { // L: 513
				char var7 = (char)(UserComparator4.charToByteCp1252(var1.charAt(var6)) & 255); // L: 514
				if (var7 == '<') { // L: 515
					var4 = var6; // L: 516
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) { // L: 519
						String var8 = var1.substring(var4 + 1, var6); // L: 520
						var4 = -1; // L: 521
						if (var8.equals("lt")) { // L: 522
							var7 = '<';
						} else {
							if (!var8.equals("gt")) { // L: 523
								if (var8.startsWith("img=")) { // L: 524
									try {
										var9 = class317.method6078(var8.substring(4)); // L: 526
										IndexedSprite var10 = AbstractFont_modIconSprites[var9]; // L: 527
										var10.drawAt(var2, var3 + this.ascent - var10.height); // L: 528
										var2 += var10.width; // L: 529
										var5 = -1; // L: 530
									} catch (Exception var14) { // L: 532
									}
								} else {
									this.decodeTag(var8); // L: 536
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) { // L: 540
						var7 = ' ';
					}

					if (var4 == -1) { // L: 541
						if (this.kerning != null && var5 != -1) { // L: 542
							var2 += this.kerning[var7 + (var5 << 8)];
						}

						int var12 = this.widths[var7]; // L: 543
						var9 = this.heights[var7]; // L: 544
						if (var7 != ' ') { // L: 545
							if (AbstractFont_alpha == 256) { // L: 546
								if (AbstractFont_shadow != -1) { // L: 547
									AbstractFont_drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color); // L: 548
							} else {
								if (AbstractFont_shadow != -1) { // L: 551
									AbstractFont_drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color, AbstractFont_alpha); // L: 552
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 556
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 557
							var2 += AbstractFont_justificationCurrent >> 8; // L: 558
							AbstractFont_justificationCurrent &= 255; // L: 559
						}

						int var13 = this.advances[var7]; // L: 562
						if (AbstractFont_strike != -1) { // L: 563
							Rasterizer2D.method9408(var2, var3 + (int)((double)this.ascent * 0.7D), var13, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 564
							Rasterizer2D.method9408(var2, var3 + this.ascent + 1, var13, AbstractFont_underline);
						}

						var2 += var13; // L: 565
						var5 = var7; // L: 566
					}
				}
			}
		}

	} // L: 569

	@ObfuscatedName("bj")
	void method7498(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		var3 -= this.ascent; // L: 572
		int var7 = -1; // L: 573
		int var8 = -1; // L: 574
		int var9 = 0; // L: 575

		for (int var10 = 0; var10 < var1.length(); ++var10) { // L: 576
			if (var1.charAt(var10) != 0) { // L: 577
				char var11 = (char)(UserComparator4.charToByteCp1252(var1.charAt(var10)) & 255); // L: 578
				if (var11 == '<') { // L: 579
					var7 = var10; // L: 580
				} else {
					int var13;
					int var14;
					int var15;
					if (var11 == '>' && var7 != -1) { // L: 583
						String var12 = var1.substring(var7 + 1, var10); // L: 584
						var7 = -1; // L: 585
						if (var12.equals("lt")) { // L: 586
							var11 = '<';
						} else {
							if (!var12.equals("gt")) { // L: 587
								if (var12.startsWith("img=")) { // L: 588
									try {
										if (var5 != null) { // L: 591
											var13 = var5[var9];
										} else {
											var13 = 0; // L: 592
										}

										if (var6 != null) { // L: 594
											var14 = var6[var9];
										} else {
											var14 = 0; // L: 595
										}

										++var9; // L: 596
										var15 = class317.method6078(var12.substring(4)); // L: 597
										IndexedSprite var16 = AbstractFont_modIconSprites[var15]; // L: 598
										var16.drawAt(var13 + var2, var14 + (var3 + this.ascent - var16.height)); // L: 599
										var2 += var16.width; // L: 600
										var8 = -1; // L: 601
									} catch (Exception var21) { // L: 603
									}
								} else {
									this.decodeTag(var12); // L: 607
								}
								continue;
							}

							var11 = '>';
						}
					}

					if (var11 == 160) { // L: 611
						var11 = ' ';
					}

					if (var7 == -1) { // L: 612
						if (this.kerning != null && var8 != -1) { // L: 613
							var2 += this.kerning[var11 + (var8 << 8)];
						}

						int var19 = this.widths[var11]; // L: 614
						var13 = this.heights[var11]; // L: 615
						if (var5 != null) { // L: 617
							var14 = var5[var9];
						} else {
							var14 = 0; // L: 618
						}

						if (var6 != null) { // L: 620
							var15 = var6[var9];
						} else {
							var15 = 0; // L: 621
						}

						int var20;
						if (var4 != null) { // L: 623
							var20 = var4[var9];
						} else {
							var20 = AbstractFont_color; // L: 624
						}

						++var9; // L: 625
						if (var11 != ' ') { // L: 626
							if (AbstractFont_alpha == 256) { // L: 627
								if (AbstractFont_shadow != -1) { // L: 628
									AbstractFont_drawGlyph(this.pixels[var11], var14 + var2 + this.leftBearings[var11] + 1, var3 + var15 + this.topBearings[var11] + 1, var19, var13, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var11], var14 + var2 + this.leftBearings[var11], var3 + var15 + this.topBearings[var11], var19, var13, var20); // L: 629
							} else {
								if (AbstractFont_shadow != -1) { // L: 632
									AbstractFont_drawGlyphAlpha(this.pixels[var11], var14 + var2 + this.leftBearings[var11] + 1, var3 + var15 + this.topBearings[var11] + 1, var19, var13, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var11], var14 + var2 + this.leftBearings[var11], var3 + var15 + this.topBearings[var11], var19, var13, var20, AbstractFont_alpha); // L: 633
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 637
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 638
							var2 += AbstractFont_justificationCurrent >> 8; // L: 639
							AbstractFont_justificationCurrent &= 255; // L: 640
						}

						int var17 = this.advances[var11]; // L: 643
						if (AbstractFont_strike != -1) { // L: 644
							Rasterizer2D.method9408(var2, var3 + (int)((double)this.ascent * 0.7D), var17, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 645
							Rasterizer2D.method9408(var2, var3 + this.ascent, var17, AbstractFont_underline);
						}

						var2 += var17; // L: 646
						var8 = var11; // L: 647
					}
				}
			}
		}

	} // L: 650

	@ObfuscatedName("az")
	static int method7502(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5]; // L: 103
		int var8 = var7 + var4[var5]; // L: 104
		int var9 = var2[var6]; // L: 105
		int var10 = var9 + var4[var6]; // L: 106
		int var11 = var7; // L: 107
		if (var9 > var7) { // L: 108
			var11 = var9;
		}

		int var12 = var8; // L: 109
		if (var10 < var8) { // L: 110
			var12 = var10;
		}

		int var13 = var3[var5]; // L: 111
		if (var3[var6] < var13) { // L: 112
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5]; // L: 113
		byte[] var15 = var0[var6]; // L: 114
		int var16 = var11 - var7; // L: 115
		int var17 = var11 - var9; // L: 116

		for (int var18 = var11; var18 < var12; ++var18) { // L: 117
			int var19 = var14[var16++] + var15[var17++]; // L: 118
			if (var19 < var13) { // L: 119
				var13 = var19;
			}
		}

		return -var13; // L: 121
	}

	@ObfuscatedName("aa")
	@Export("escapeBrackets")
	public static String escapeBrackets(String var0) {
		int var1 = var0.length(); // L: 265
		int var2 = 0; // L: 266

		for (int var3 = 0; var3 < var1; ++var3) { // L: 267
			char var4 = var0.charAt(var3); // L: 268
			if (var4 == '<' || var4 == '>') {
				var2 += 3; // L: 269
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2); // L: 271

		for (int var7 = 0; var7 < var1; ++var7) { // L: 272
			char var5 = var0.charAt(var7); // L: 273
			if (var5 == '<') {
				var6.append("<lt>"); // L: 274
			} else if (var5 == '>') { // L: 275
				var6.append("<gt>");
			} else {
				var6.append(var5); // L: 276
			}
		}

		return var6.toString(); // L: 278
	}

	@ObfuscatedName("bf")
	@Export("AbstractFont_drawGlyph")
	static void AbstractFont_drawGlyph(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 656
		int var7 = Rasterizer2D.Rasterizer2D_width - var3; // L: 657
		int var8 = 0; // L: 658
		int var9 = 0; // L: 659
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 660
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 661
			var4 -= var10; // L: 662
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 663
			var9 += var3 * var10; // L: 664
			var6 += var10 * Rasterizer2D.Rasterizer2D_width; // L: 665
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 667
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 668
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 669
			var3 -= var10; // L: 670
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 671
			var9 += var10; // L: 672
			var6 += var10; // L: 673
			var8 += var10; // L: 674
			var7 += var10; // L: 675
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 677
			var10 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 678
			var3 -= var10; // L: 679
			var8 += var10; // L: 680
			var7 += var10; // L: 681
		}

		if (var3 > 0 && var4 > 0) { // L: 683
			AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8); // L: 684
		}
	} // L: 685

	@ObfuscatedName("ba")
	@Export("AbstractFont_placeGlyph")
	static void AbstractFont_placeGlyph(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2); // L: 688
		var5 = -(var5 & 3); // L: 689

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 690
			int var11;
			for (var11 = var9; var11 < 0; ++var11) { // L: 691
				if (var1[var3++] != 0) { // L: 692
					var0[var4++] = var2;
				} else {
					++var4; // L: 693
				}

				if (var1[var3++] != 0) { // L: 694
					var0[var4++] = var2;
				} else {
					++var4; // L: 695
				}

				if (var1[var3++] != 0) { // L: 696
					var0[var4++] = var2;
				} else {
					++var4; // L: 697
				}

				if (var1[var3++] != 0) { // L: 698
					var0[var4++] = var2;
				} else {
					++var4; // L: 699
				}
			}

			for (var11 = var5; var11 < 0; ++var11) { // L: 701
				if (var1[var3++] != 0) { // L: 702
					var0[var4++] = var2;
				} else {
					++var4; // L: 703
				}
			}

			var4 += var7; // L: 705
			var3 += var8; // L: 706
		}

	} // L: 708

	@ObfuscatedName("bu")
	@Export("AbstractFont_drawGlyphAlpha")
	static void AbstractFont_drawGlyphAlpha(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 711
		int var8 = Rasterizer2D.Rasterizer2D_width - var3; // L: 712
		int var9 = 0; // L: 713
		int var10 = 0; // L: 714
		int var11;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 715
			var11 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 716
			var4 -= var11; // L: 717
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 718
			var10 += var3 * var11; // L: 719
			var7 += var11 * Rasterizer2D.Rasterizer2D_width; // L: 720
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 722
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 723
			var11 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 724
			var3 -= var11; // L: 725
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 726
			var10 += var11; // L: 727
			var7 += var11; // L: 728
			var9 += var11; // L: 729
			var8 += var11; // L: 730
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 732
			var11 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 733
			var3 -= var11; // L: 734
			var9 += var11; // L: 735
			var8 += var11; // L: 736
		}

		if (var3 > 0 && var4 > 0) { // L: 738
			AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var10, var7, var3, var4, var8, var9, var6); // L: 739
		}
	} // L: 740

	@ObfuscatedName("bh")
	@Export("AbstractFont_placeGlyphAlpha")
	static void AbstractFont_placeGlyphAlpha(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8; // L: 743
		var9 = 256 - var9; // L: 744

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 745
			for (int var11 = -var5; var11 < 0; ++var11) { // L: 746
				if (var1[var3++] != 0) { // L: 747
					int var12 = var0[var4]; // L: 748
					var0[var4++] = (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2; // L: 749
				} else {
					++var4; // L: 751
				}
			}

			var4 += var7; // L: 753
			var3 += var8; // L: 754
		}

	} // L: 756
}
