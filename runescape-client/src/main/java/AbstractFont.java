import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("AbstractFont")
public abstract class AbstractFont extends Rasterizer2D {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("AbstractFont_modIconSprites")
	public static IndexedSprite[] AbstractFont_modIconSprites;
	@ObfuscatedName("a")
	@Export("AbstractFont_strike")
	static int AbstractFont_strike;
	@ObfuscatedName("m")
	@Export("AbstractFont_underline")
	static int AbstractFont_underline;
	@ObfuscatedName("u")
	@Export("AbstractFont_previousShadow")
	static int AbstractFont_previousShadow;
	@ObfuscatedName("l")
	@Export("AbstractFont_shadow")
	static int AbstractFont_shadow;
	@ObfuscatedName("z")
	@Export("AbstractFont_previousColor")
	static int AbstractFont_previousColor;
	@ObfuscatedName("r")
	@Export("AbstractFont_color")
	static int AbstractFont_color;
	@ObfuscatedName("y")
	@Export("AbstractFont_alpha")
	static int AbstractFont_alpha;
	@ObfuscatedName("p")
	@Export("AbstractFont_justificationTotal")
	static int AbstractFont_justificationTotal;
	@ObfuscatedName("e")
	@Export("AbstractFont_justificationCurrent")
	static int AbstractFont_justificationCurrent;
	@ObfuscatedName("b")
	@Export("AbstractFont_random")
	static Random AbstractFont_random;
	@ObfuscatedName("x")
	@Export("AbstractFont_lines")
	static String[] AbstractFont_lines;
	@ObfuscatedName("s")
	@Export("pixels")
	byte[][] pixels;
	@ObfuscatedName("h")
	@Export("advances")
	int[] advances;
	@ObfuscatedName("w")
	@Export("widths")
	int[] widths;
	@ObfuscatedName("v")
	@Export("heights")
	int[] heights;
	@ObfuscatedName("c")
	@Export("leftBearings")
	int[] leftBearings;
	@ObfuscatedName("q")
	@Export("topBearings")
	int[] topBearings;
	@ObfuscatedName("i")
	@Export("ascent")
	public int ascent;
	@ObfuscatedName("k")
	@Export("maxAscent")
	public int maxAscent;
	@ObfuscatedName("o")
	@Export("maxDescent")
	public int maxDescent;
	@ObfuscatedName("d")
	@Export("kerning")
	byte[] kerning;

	static {
		AbstractFont_strike = -1; // L: 24
		AbstractFont_underline = -1; // L: 25
		AbstractFont_previousShadow = -1; // L: 26
		AbstractFont_shadow = -1; // L: 27
		AbstractFont_previousColor = 0; // L: 28
		AbstractFont_color = 0; // L: 29
		AbstractFont_alpha = 256; // L: 30
		AbstractFont_justificationTotal = 0; // L: 31
		AbstractFont_justificationCurrent = 0; // L: 32
		AbstractFont_random = new Random(); // L: 33
		AbstractFont_lines = new String[100]; // L: 34
	}

	AbstractFont(byte[] var1) {
		this.pixels = new byte[256][];
		this.ascent = 0;
		this.readMetrics(var1); // L: 54
	} // L: 55

	AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.pixels = new byte[256][]; // L: 13
		this.ascent = 0; // L: 19
		this.leftBearings = var2; // L: 37
		this.topBearings = var3; // L: 38
		this.widths = var4; // L: 39
		this.heights = var5; // L: 40
		this.readMetrics(var1); // L: 41
		this.pixels = var7; // L: 42
		int var8 = Integer.MAX_VALUE; // L: 43
		int var9 = Integer.MIN_VALUE; // L: 44

		for (int var10 = 0; var10 < 256; ++var10) { // L: 45
			if (this.topBearings[var10] < var8 && this.heights[var10] != 0) { // L: 46
				var8 = this.topBearings[var10];
			}

			if (this.topBearings[var10] + this.heights[var10] > var9) { // L: 47
				var9 = this.topBearings[var10] + this.heights[var10];
			}
		}

		this.maxAscent = this.ascent - var8; // L: 49
		this.maxDescent = var9 - this.ascent; // L: 50
	} // L: 51

	@ObfuscatedName("s")
	@Export("drawGlyph")
	abstract void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfuscatedName("h")
	@Export("drawGlyphAlpha")
	abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfuscatedName("o")
	@Export("readMetrics")
	void readMetrics(byte[] var1) {
		this.advances = new int[256]; // L: 58
		int var2;
		if (var1.length == 257) { // L: 59
			for (var2 = 0; var2 < this.advances.length; ++var2) { // L: 60
				this.advances[var2] = var1[var2] & 255;
			}

			this.ascent = var1[256] & 255; // L: 61
		} else {
			var2 = 0; // L: 64

			for (int var3 = 0; var3 < 256; ++var3) { // L: 65
				this.advances[var3] = var1[var2++] & 255;
			}

			int[] var10 = new int[256]; // L: 66
			int[] var4 = new int[256]; // L: 67

			int var5;
			for (var5 = 0; var5 < 256; ++var5) { // L: 68
				var10[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) { // L: 69
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][]; // L: 70

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) { // L: 71
				var11[var6] = new byte[var10[var6]]; // L: 72
				byte var7 = 0; // L: 73

				for (var8 = 0; var8 < var11[var6].length; ++var8) { // L: 74
					var7 += var1[var2++]; // L: 75
					var11[var6][var8] = var7; // L: 76
				}
			}

			byte[][] var12 = new byte[256][]; // L: 79

			int var13;
			for (var13 = 0; var13 < 256; ++var13) { // L: 80
				var12[var13] = new byte[var10[var13]]; // L: 81
				byte var14 = 0; // L: 82

				for (int var9 = 0; var9 < var12[var13].length; ++var9) { // L: 83
					var14 += var1[var2++]; // L: 84
					var12[var13][var9] = var14; // L: 85
				}
			}

			this.kerning = new byte[65536]; // L: 88

			for (var13 = 0; var13 < 256; ++var13) { // L: 89
				if (var13 != 32 && var13 != 160) { // L: 90
					for (var8 = 0; var8 < 256; ++var8) { // L: 91
						if (var8 != 32 && var8 != 160) { // L: 92
							this.kerning[var8 + (var13 << 8)] = (byte)method6301(var11, var12, var4, this.advances, var10, var13, var8); // L: 93
						}
					}
				}
			}

			this.ascent = var4[32] + var10[32]; // L: 96
		}

	} // L: 98

	@ObfuscatedName("d")
	@Export("charWidth")
	int charWidth(char var1) {
		if (var1 == 160) { // L: 123
			var1 = ' ';
		}

		return this.advances[class300.charToByteCp1252(var1) & 255]; // L: 124
	}

	@ObfuscatedName("a")
	@Export("stringWidth")
	public int stringWidth(String var1) {
		if (var1 == null) { // L: 128
			return 0;
		} else {
			int var2 = -1; // L: 129
			int var3 = -1; // L: 130
			int var4 = 0; // L: 131

			for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 132
				char var6 = var1.charAt(var5); // L: 133
				if (var6 == '<') { // L: 134
					var2 = var5; // L: 135
				} else {
					if (var6 == '>' && var2 != -1) { // L: 138
						String var7 = var1.substring(var2 + 1, var5); // L: 139
						var2 = -1; // L: 140
						if (var7.equals("lt")) { // L: 141
							var6 = '<';
						} else {
							if (!var7.equals("gt")) { // L: 142
								if (var7.startsWith("img=")) { // L: 143
									try {
										int var8 = AbstractUserComparator.method6644(var7.substring(4)); // L: 145
										var4 += AbstractFont_modIconSprites[var8].width; // L: 146
										var3 = -1; // L: 147
									} catch (Exception var10) { // L: 149
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) { // L: 154
						var6 = ' ';
					}

					if (var2 == -1) { // L: 155
						var4 += this.advances[(char)(class300.charToByteCp1252(var6) & 255)]; // L: 156
						if (this.kerning != null && var3 != -1) { // L: 157
							var4 += this.kerning[var6 + (var3 << 8)];
						}

						var3 = var6; // L: 158
					}
				}
			}

			return var4; // L: 161
		}
	}

	@ObfuscatedName("m")
	@Export("breakLines")
	public int breakLines(String var1, int[] var2, String[] var3) {
		if (var1 == null) { // L: 165
			return 0;
		} else {
			int var4 = 0; // L: 166
			int var5 = 0; // L: 167
			StringBuilder var6 = new StringBuilder(100); // L: 168
			int var7 = -1; // L: 169
			int var8 = 0; // L: 170
			byte var9 = 0; // L: 171
			int var10 = -1; // L: 172
			char var11 = 0; // L: 173
			int var12 = 0; // L: 174
			int var13 = var1.length(); // L: 175

			for (int var14 = 0; var14 < var13; ++var14) { // L: 176
				char var15 = var1.charAt(var14); // L: 177
				if (var15 == '<') { // L: 178
					var10 = var14; // L: 179
				} else {
					if (var15 == '>' && var10 != -1) { // L: 182
						String var16 = var1.substring(var10 + 1, var14); // L: 183
						var10 = -1; // L: 184
						var6.append('<'); // L: 185
						var6.append(var16); // L: 186
						var6.append('>'); // L: 187
						if (var16.equals("br")) { // L: 188
							var3[var12] = var6.toString().substring(var5, var6.length()); // L: 189
							++var12; // L: 190
							var5 = var6.length(); // L: 191
							var4 = 0; // L: 192
							var7 = -1; // L: 193
							var11 = 0; // L: 194
						} else if (var16.equals("lt")) { // L: 196
							var4 += this.charWidth('<'); // L: 197
							if (this.kerning != null && var11 != -1) { // L: 198
								var4 += this.kerning[(var11 << '\b') + 60];
							}

							var11 = '<'; // L: 199
						} else if (var16.equals("gt")) { // L: 201
							var4 += this.charWidth('>'); // L: 202
							if (this.kerning != null && var11 != -1) { // L: 203
								var4 += this.kerning[(var11 << '\b') + 62];
							}

							var11 = '>'; // L: 204
						} else if (var16.startsWith("img=")) { // L: 206
							try {
								int var17 = AbstractUserComparator.method6644(var16.substring(4)); // L: 208
								var4 += AbstractFont_modIconSprites[var17].width; // L: 209
								var11 = 0; // L: 210
							} catch (Exception var20) { // L: 212
							}
						}

						var15 = 0; // L: 214
					}

					if (var10 == -1) { // L: 216
						if (var15 != 0) { // L: 217
							var6.append(var15); // L: 218
							var4 += this.charWidth(var15); // L: 219
							if (this.kerning != null && var11 != -1) { // L: 220
								var4 += this.kerning[var15 + (var11 << '\b')];
							}

							var11 = var15; // L: 221
						}

						if (var15 == ' ') { // L: 223
							var7 = var6.length(); // L: 224
							var8 = var4; // L: 225
							var9 = 1; // L: 226
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) { // L: 228
							var3[var12] = var6.toString().substring(var5, var7 - var9); // L: 229
							++var12; // L: 230
							var5 = var7; // L: 231
							var7 = -1; // L: 232
							var4 -= var8; // L: 233
							var11 = 0; // L: 234
						}

						if (var15 == '-') { // L: 236
							var7 = var6.length(); // L: 237
							var8 = var4; // L: 238
							var9 = 0; // L: 239
						}
					}
				}
			}

			String var19 = var6.toString(); // L: 243
			if (var19.length() > var5) { // L: 244
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12; // L: 245
		}
	}

	@ObfuscatedName("u")
	@Export("lineWidth")
	public int lineWidth(String var1, int var2) {
		int var3 = this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 249
		int var4 = 0; // L: 250

		for (int var5 = 0; var5 < var3; ++var5) { // L: 251
			int var6 = this.stringWidth(AbstractFont_lines[var5]); // L: 252
			if (var6 > var4) { // L: 253
				var4 = var6;
			}
		}

		return var4; // L: 255
	}

	@ObfuscatedName("l")
	@Export("lineCount")
	public int lineCount(String var1, int var2) {
		return this.breakLines(var1, new int[]{var2}, AbstractFont_lines); // L: 259
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)Lnh;"
	)
	public Bounds method6357(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var2 + var1) { // L: 280
			int var6 = var4 - this.stringWidth(var3) / 2; // L: 283
			var6 += this.stringWidth(var3.substring(0, var1)); // L: 284
			int var7 = var5 - this.maxAscent; // L: 285
			int var8 = this.stringWidth(var3.substring(var1, var2 + var1)); // L: 286
			int var9 = this.maxAscent + this.maxDescent; // L: 287
			return new Bounds(var6, var7, var8, var9); // L: 288
		} else {
			return new Bounds(var4, var5, 0, 0); // L: 281
		}
	}

	@ObfuscatedName("y")
	@Export("draw")
	public void draw(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 292
			this.reset(var4, var5); // L: 293
			this.draw0(var1, var2, var3); // L: 294
		}
	} // L: 295

	@ObfuscatedName("p")
	@Export("drawAlpha")
	public void drawAlpha(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 298
			this.reset(var4, var5); // L: 299
			AbstractFont_alpha = var6; // L: 300
			this.draw0(var1, var2, var3); // L: 301
		}
	} // L: 302

	@ObfuscatedName("e")
	@Export("drawRightAligned")
	public void drawRightAligned(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 305
			this.reset(var4, var5); // L: 306
			this.draw0(var1, var2 - this.stringWidth(var1), var3); // L: 307
		}
	} // L: 308

	@ObfuscatedName("b")
	@Export("drawCentered")
	public void drawCentered(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) { // L: 311
			this.reset(var4, var5); // L: 312
			this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3); // L: 313
		}
	} // L: 314

	@ObfuscatedName("x")
	@Export("drawLines")
	public int drawLines(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (var1 == null) { // L: 317
			return 0;
		} else {
			this.reset(var6, var7); // L: 318
			if (var10 == 0) { // L: 319
				var10 = this.ascent;
			}

			int[] var11 = new int[]{var4}; // L: 320
			if (var5 < var10 + this.maxAscent + this.maxDescent && var5 < var10 + var10) { // L: 321
				var11 = null;
			}

			int var12 = this.breakLines(var1, var11, AbstractFont_lines); // L: 322
			if (var9 == 3 && var12 == 1) { // L: 324
				var9 = 1;
			}

			int var13;
			int var14;
			if (var9 == 0) { // L: 325
				var13 = var3 + this.maxAscent;
			} else if (var9 == 1) { // L: 326
				var13 = var3 + (var5 - this.maxAscent - this.maxDescent - var10 * (var12 - 1)) / 2 + this.maxAscent;
			} else if (var9 == 2) { // L: 327
				var13 = var3 + var5 - this.maxDescent - var10 * (var12 - 1);
			} else {
				var14 = (var5 - this.maxAscent - this.maxDescent - var10 * (var12 - 1)) / (var12 + 1); // L: 329
				if (var14 < 0) { // L: 330
					var14 = 0;
				}

				var13 = var3 + var14 + this.maxAscent; // L: 331
				var10 += var14; // L: 332
			}

			for (var14 = 0; var14 < var12; ++var14) { // L: 334
				if (var8 == 0) {
					this.draw0(AbstractFont_lines[var14], var2, var13); // L: 335
				} else if (var8 == 1) { // L: 336
					this.draw0(AbstractFont_lines[var14], var2 + (var4 - this.stringWidth(AbstractFont_lines[var14])) / 2, var13);
				} else if (var8 == 2) { // L: 337
					this.draw0(AbstractFont_lines[var14], var2 + var4 - this.stringWidth(AbstractFont_lines[var14]), var13);
				} else if (var14 == var12 - 1) { // L: 339
					this.draw0(AbstractFont_lines[var14], var2, var13);
				} else {
					this.calculateLineJustification(AbstractFont_lines[var14], var4); // L: 341
					this.draw0(AbstractFont_lines[var14], var2, var13); // L: 342
					AbstractFont_justificationTotal = 0; // L: 343
				}

				var13 += var10; // L: 346
			}

			return var12; // L: 348
		}
	}

	@ObfuscatedName("f")
	@Export("drawCenteredWave")
	public void drawCenteredWave(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 352
			this.reset(var4, var5); // L: 353
			int[] var7 = new int[var1.length()]; // L: 354

			for (int var8 = 0; var8 < var1.length(); ++var8) { // L: 355
				var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var7); // L: 356
		}
	} // L: 357

	@ObfuscatedName("t")
	@Export("drawCenteredWave2")
	public void drawCenteredWave2(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 360
			this.reset(var4, var5); // L: 361
			int[] var7 = new int[var1.length()]; // L: 362
			int[] var8 = new int[var1.length()]; // L: 363

			for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 364
				var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D); // L: 365
				var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D); // L: 366
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, var7, var8); // L: 368
		}
	} // L: 369

	@ObfuscatedName("j")
	@Export("drawCenteredShake")
	public void drawCenteredShake(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) { // L: 372
			this.reset(var4, var5); // L: 373
			double var8 = 7.0D - (double)var7 / 8.0D; // L: 374
			if (var8 < 0.0D) { // L: 375
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.length()]; // L: 376

			for (int var11 = 0; var11 < var1.length(); ++var11) { // L: 377
				var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
			}

			this.drawWithOffsets0(var1, var2 - this.stringWidth(var1) / 2, var3, (int[])null, var10); // L: 378
		}
	} // L: 379

	@ObfuscatedName("g")
	@Export("drawRandomAlphaAndSpacing")
	public void drawRandomAlphaAndSpacing(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) { // L: 382
			this.reset(var4, var5); // L: 383
			AbstractFont_random.setSeed((long)var6); // L: 384
			AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31); // L: 385
			int[] var7 = new int[var1.length()]; // L: 386
			int var8 = 0; // L: 387

			for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 388
				var7[var9] = var8; // L: 389
				if ((AbstractFont_random.nextInt() & 3) == 0) { // L: 390
					++var8;
				}
			}

			this.drawWithOffsets0(var1, var2, var3, var7, (int[])null); // L: 392
		}
	} // L: 393

	@ObfuscatedName("ar")
	@Export("reset")
	void reset(int var1, int var2) {
		AbstractFont_strike = -1; // L: 396
		AbstractFont_underline = -1; // L: 397
		AbstractFont_previousShadow = var2; // L: 398
		AbstractFont_shadow = var2;
		AbstractFont_previousColor = var1; // L: 399
		AbstractFont_color = var1;
		AbstractFont_alpha = 256; // L: 400
		AbstractFont_justificationTotal = 0; // L: 401
		AbstractFont_justificationCurrent = 0; // L: 402
	} // L: 403

	@ObfuscatedName("aq")
	@Export("decodeTag")
	void decodeTag(String var1) {
		try {
			if (var1.startsWith("col=")) { // L: 407
				String var3 = var1.substring(4); // L: 409
				int var2 = WorldMapIcon_0.method4838(var3, 16, true); // L: 411
				AbstractFont_color = var2; // L: 413
			} else if (var1.equals("/col")) { // L: 415
				AbstractFont_color = AbstractFont_previousColor;
			} else if (var1.startsWith("str=")) { // L: 416
				AbstractFont_strike = WorldMapSection2.method4509(var1.substring(4), 16);
			} else if (var1.equals("str")) { // L: 417
				AbstractFont_strike = 8388608;
			} else if (var1.equals("/str")) { // L: 418
				AbstractFont_strike = -1;
			} else if (var1.startsWith("u=")) {
				AbstractFont_underline = WorldMapSection2.method4509(var1.substring(2), 16); // L: 419
			} else if (var1.equals("u")) { // L: 420
				AbstractFont_underline = 0;
			} else if (var1.equals("/u")) { // L: 421
				AbstractFont_underline = -1;
			} else if (var1.startsWith("shad=")) { // L: 422
				AbstractFont_shadow = WorldMapSection2.method4509(var1.substring(5), 16);
			} else if (var1.equals("shad")) { // L: 423
				AbstractFont_shadow = 0;
			} else if (var1.equals("/shad")) { // L: 424
				AbstractFont_shadow = AbstractFont_previousShadow;
			} else if (var1.equals("br")) { // L: 425
				this.reset(AbstractFont_previousColor, AbstractFont_previousShadow);
			}
		} catch (Exception var5) { // L: 427
		}

	} // L: 428

	@ObfuscatedName("av")
	@Export("calculateLineJustification")
	void calculateLineJustification(String var1, int var2) {
		int var3 = 0; // L: 431
		boolean var4 = false; // L: 432

		for (int var5 = 0; var5 < var1.length(); ++var5) { // L: 433
			char var6 = var1.charAt(var5); // L: 434
			if (var6 == '<') { // L: 435
				var4 = true;
			} else if (var6 == '>') { // L: 436
				var4 = false;
			} else if (!var4 && var6 == ' ') { // L: 437
				++var3;
			}
		}

		if (var3 > 0) { // L: 439
			AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
		}

	} // L: 440

	@ObfuscatedName("aj")
	@Export("draw0")
	void draw0(String var1, int var2, int var3) {
		var3 -= this.ascent; // L: 443
		int var4 = -1; // L: 444
		int var5 = -1; // L: 445

		for (int var6 = 0; var6 < var1.length(); ++var6) { // L: 446
			if (var1.charAt(var6) != 0) { // L: 447
				char var7 = (char)(class300.charToByteCp1252(var1.charAt(var6)) & 255); // L: 448
				if (var7 == '<') { // L: 449
					var4 = var6; // L: 450
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) { // L: 453
						String var8 = var1.substring(var4 + 1, var6); // L: 454
						var4 = -1; // L: 455
						if (var8.equals("lt")) { // L: 456
							var7 = '<';
						} else {
							if (!var8.equals("gt")) { // L: 457
								if (var8.startsWith("img=")) { // L: 458
									try {
										var9 = AbstractUserComparator.method6644(var8.substring(4)); // L: 460
										IndexedSprite var10 = AbstractFont_modIconSprites[var9]; // L: 461
										var10.drawAt(var2, var3 + this.ascent - var10.height); // L: 462
										var2 += var10.width; // L: 463
										var5 = -1; // L: 464
									} catch (Exception var14) { // L: 466
									}
								} else {
									this.decodeTag(var8); // L: 470
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) { // L: 474
						var7 = ' ';
					}

					if (var4 == -1) { // L: 475
						if (this.kerning != null && var5 != -1) { // L: 476
							var2 += this.kerning[var7 + (var5 << 8)];
						}

						int var12 = this.widths[var7]; // L: 477
						var9 = this.heights[var7]; // L: 478
						if (var7 != ' ') { // L: 479
							if (AbstractFont_alpha == 256) { // L: 480
								if (AbstractFont_shadow != -1) { // L: 481
									AbstractFont_drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color); // L: 482
							} else {
								if (AbstractFont_shadow != -1) { // L: 485
									AbstractFont_drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color, AbstractFont_alpha); // L: 486
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 490
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 491
							var2 += AbstractFont_justificationCurrent >> 8; // L: 492
							AbstractFont_justificationCurrent &= 255; // L: 493
						}

						int var13 = this.advances[var7]; // L: 496
						if (AbstractFont_strike != -1) { // L: 497
							Rasterizer2D.method7967(var2, var3 + (int)((double)this.ascent * 0.7D), var13, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 498
							Rasterizer2D.method7967(var2, var3 + this.ascent + 1, var13, AbstractFont_underline);
						}

						var2 += var13; // L: 499
						var5 = var7; // L: 500
					}
				}
			}
		}

	} // L: 503

	@ObfuscatedName("ax")
	@Export("drawWithOffsets0")
	void drawWithOffsets0(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.ascent; // L: 506
		int var6 = -1; // L: 507
		int var7 = -1; // L: 508
		int var8 = 0; // L: 509

		for (int var9 = 0; var9 < var1.length(); ++var9) { // L: 510
			if (var1.charAt(var9) != 0) { // L: 511
				char var10 = (char)(class300.charToByteCp1252(var1.charAt(var9)) & 255); // L: 512
				if (var10 == '<') { // L: 513
					var6 = var9; // L: 514
				} else {
					int var12;
					int var13;
					int var14;
					if (var10 == '>' && var6 != -1) { // L: 517
						String var11 = var1.substring(var6 + 1, var9); // L: 518
						var6 = -1; // L: 519
						if (var11.equals("lt")) { // L: 520
							var10 = '<';
						} else {
							if (!var11.equals("gt")) { // L: 521
								if (var11.startsWith("img=")) { // L: 522
									try {
										if (var4 != null) { // L: 525
											var12 = var4[var8];
										} else {
											var12 = 0; // L: 526
										}

										if (var5 != null) { // L: 528
											var13 = var5[var8];
										} else {
											var13 = 0; // L: 529
										}

										++var8; // L: 530
										var14 = AbstractUserComparator.method6644(var11.substring(4)); // L: 531
										IndexedSprite var15 = AbstractFont_modIconSprites[var14]; // L: 532
										var15.drawAt(var12 + var2, var13 + (var3 + this.ascent - var15.height)); // L: 533
										var2 += var15.width; // L: 534
										var7 = -1; // L: 535
									} catch (Exception var19) { // L: 537
									}
								} else {
									this.decodeTag(var11); // L: 541
								}
								continue;
							}

							var10 = '>';
						}
					}

					if (var10 == 160) { // L: 545
						var10 = ' ';
					}

					if (var6 == -1) { // L: 546
						if (this.kerning != null && var7 != -1) { // L: 547
							var2 += this.kerning[var10 + (var7 << 8)];
						}

						int var17 = this.widths[var10]; // L: 548
						var12 = this.heights[var10]; // L: 549
						if (var4 != null) { // L: 551
							var13 = var4[var8];
						} else {
							var13 = 0; // L: 552
						}

						if (var5 != null) { // L: 554
							var14 = var5[var8];
						} else {
							var14 = 0; // L: 555
						}

						++var8; // L: 556
						if (var10 != ' ') { // L: 557
							if (AbstractFont_alpha == 256) { // L: 558
								if (AbstractFont_shadow != -1) { // L: 559
									AbstractFont_drawGlyph(this.pixels[var10], var13 + var2 + this.leftBearings[var10] + 1, var3 + var14 + this.topBearings[var10] + 1, var17, var12, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var10], var13 + var2 + this.leftBearings[var10], var3 + var14 + this.topBearings[var10], var17, var12, AbstractFont_color); // L: 560
							} else {
								if (AbstractFont_shadow != -1) { // L: 563
									AbstractFont_drawGlyphAlpha(this.pixels[var10], var13 + var2 + this.leftBearings[var10] + 1, var3 + var14 + this.topBearings[var10] + 1, var17, var12, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var10], var13 + var2 + this.leftBearings[var10], var3 + var14 + this.topBearings[var10], var17, var12, AbstractFont_color, AbstractFont_alpha); // L: 564
							}
						} else if (AbstractFont_justificationTotal > 0) { // L: 568
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal; // L: 569
							var2 += AbstractFont_justificationCurrent >> 8; // L: 570
							AbstractFont_justificationCurrent &= 255; // L: 571
						}

						int var18 = this.advances[var10]; // L: 574
						if (AbstractFont_strike != -1) { // L: 575
							Rasterizer2D.method7967(var2, var3 + (int)((double)this.ascent * 0.7D), var18, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) { // L: 576
							Rasterizer2D.method7967(var2, var3 + this.ascent, var18, AbstractFont_underline);
						}

						var2 += var18; // L: 577
						var7 = var10; // L: 578
					}
				}
			}
		}

	} // L: 581

	@ObfuscatedName("n")
	static int method6301(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5]; // L: 101
		int var8 = var7 + var4[var5]; // L: 102
		int var9 = var2[var6]; // L: 103
		int var10 = var9 + var4[var6]; // L: 104
		int var11 = var7; // L: 105
		if (var9 > var7) { // L: 106
			var11 = var9;
		}

		int var12 = var8; // L: 107
		if (var10 < var8) { // L: 108
			var12 = var10;
		}

		int var13 = var3[var5]; // L: 109
		if (var3[var6] < var13) { // L: 110
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5]; // L: 111
		byte[] var15 = var0[var6]; // L: 112
		int var16 = var11 - var7; // L: 113
		int var17 = var11 - var9; // L: 114

		for (int var18 = var11; var18 < var12; ++var18) { // L: 115
			int var19 = var14[var16++] + var15[var17++]; // L: 116
			if (var19 < var13) { // L: 117
				var13 = var19;
			}
		}

		return -var13; // L: 119
	}

	@ObfuscatedName("z")
	@Export("escapeBrackets")
	public static String escapeBrackets(String var0) {
		int var1 = var0.length(); // L: 263
		int var2 = 0; // L: 264

		for (int var3 = 0; var3 < var1; ++var3) { // L: 265
			char var4 = var0.charAt(var3); // L: 266
			if (var4 == '<' || var4 == '>') {
				var2 += 3; // L: 267
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2); // L: 269

		for (int var7 = 0; var7 < var1; ++var7) { // L: 270
			char var5 = var0.charAt(var7); // L: 271
			if (var5 == '<') {
				var6.append("<lt>"); // L: 272
			} else if (var5 == '>') { // L: 273
				var6.append("<gt>");
			} else {
				var6.append(var5); // L: 274
			}
		}

		return var6.toString(); // L: 276
	}

	@ObfuscatedName("ab")
	@Export("AbstractFont_drawGlyph")
	static void AbstractFont_drawGlyph(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 587
		int var7 = Rasterizer2D.Rasterizer2D_width - var3; // L: 588
		int var8 = 0; // L: 589
		int var9 = 0; // L: 590
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 591
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 592
			var4 -= var10; // L: 593
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 594
			var9 += var3 * var10; // L: 595
			var6 += var10 * Rasterizer2D.Rasterizer2D_width; // L: 596
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 598
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 599
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 600
			var3 -= var10; // L: 601
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 602
			var9 += var10; // L: 603
			var6 += var10; // L: 604
			var8 += var10; // L: 605
			var7 += var10; // L: 606
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 608
			var10 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 609
			var3 -= var10; // L: 610
			var8 += var10; // L: 611
			var7 += var10; // L: 612
		}

		if (var3 > 0 && var4 > 0) { // L: 614
			AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8); // L: 615
		}
	} // L: 616

	@ObfuscatedName("ak")
	@Export("AbstractFont_placeGlyph")
	static void AbstractFont_placeGlyph(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2); // L: 619
		var5 = -(var5 & 3); // L: 620

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 621
			int var11;
			for (var11 = var9; var11 < 0; ++var11) { // L: 622
				if (var1[var3++] != 0) { // L: 623
					var0[var4++] = var2;
				} else {
					++var4; // L: 624
				}

				if (var1[var3++] != 0) { // L: 625
					var0[var4++] = var2;
				} else {
					++var4; // L: 626
				}

				if (var1[var3++] != 0) { // L: 627
					var0[var4++] = var2;
				} else {
					++var4; // L: 628
				}

				if (var1[var3++] != 0) { // L: 629
					var0[var4++] = var2;
				} else {
					++var4; // L: 630
				}
			}

			for (var11 = var5; var11 < 0; ++var11) { // L: 632
				if (var1[var3++] != 0) { // L: 633
					var0[var4++] = var2;
				} else {
					++var4; // L: 634
				}
			}

			var4 += var7; // L: 636
			var3 += var8; // L: 637
		}

	} // L: 639

	@ObfuscatedName("au")
	@Export("AbstractFont_drawGlyphAlpha")
	static void AbstractFont_drawGlyphAlpha(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * Rasterizer2D.Rasterizer2D_width; // L: 642
		int var8 = Rasterizer2D.Rasterizer2D_width - var3; // L: 643
		int var9 = 0; // L: 644
		int var10 = 0; // L: 645
		int var11;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) { // L: 646
			var11 = Rasterizer2D.Rasterizer2D_yClipStart - var2; // L: 647
			var4 -= var11; // L: 648
			var2 = Rasterizer2D.Rasterizer2D_yClipStart; // L: 649
			var10 += var3 * var11; // L: 650
			var7 += var11 * Rasterizer2D.Rasterizer2D_width; // L: 651
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) { // L: 653
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) { // L: 654
			var11 = Rasterizer2D.Rasterizer2D_xClipStart - var1; // L: 655
			var3 -= var11; // L: 656
			var1 = Rasterizer2D.Rasterizer2D_xClipStart; // L: 657
			var10 += var11; // L: 658
			var7 += var11; // L: 659
			var9 += var11; // L: 660
			var8 += var11; // L: 661
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 663
			var11 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd; // L: 664
			var3 -= var11; // L: 665
			var9 += var11; // L: 666
			var8 += var11; // L: 667
		}

		if (var3 > 0 && var4 > 0) { // L: 669
			AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var10, var7, var3, var4, var8, var9, var6); // L: 670
		}
	} // L: 671

	@ObfuscatedName("ae")
	@Export("AbstractFont_placeGlyphAlpha")
	static void AbstractFont_placeGlyphAlpha(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8; // L: 674
		var9 = 256 - var9; // L: 675

		for (int var10 = -var6; var10 < 0; ++var10) { // L: 676
			for (int var11 = -var5; var11 < 0; ++var11) { // L: 677
				if (var1[var3++] != 0) { // L: 678
					int var12 = var0[var4]; // L: 679
					var0[var4++] = (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2; // L: 680
				} else {
					++var4; // L: 682
				}
			}

			var4 += var7; // L: 684
			var3 += var8; // L: 685
		}

	} // L: 687
}
