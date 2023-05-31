import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dp")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Ltc;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("aq")
	int[] field1226;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 370886257
	)
	int field1227;
	@ObfuscatedName("at")
	int[] field1228;
	@ObfuscatedName("aa")
	int[] field1242;
	@ObfuscatedName("ay")
	int[] field1230;
	@ObfuscatedName("ao")
	int[] field1221;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1137135943
	)
	int field1245;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 564904941
	)
	int field1233;
	@ObfuscatedName("ag")
	int[] field1234;
	@ObfuscatedName("ah")
	int[] field1229;
	@ObfuscatedName("av")
	int[] field1236;
	@ObfuscatedName("ar")
	int[] field1231;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1156448081
	)
	int field1240;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -692470508
	)
	int field1239;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 72639573
	)
	int field1237;

	@ObfuscatedSignature(
		descriptor = "([Ltc;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1226 = new int[256]; // L: 13
		this.field1227 = 0; // L: 14
		this.field1245 = 0; // L: 19
		this.field1233 = 0; // L: 20
		this.field1240 = 0; // L: 25
		this.field1239 = 0; // L: 26
		this.field1237 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1937774120"
	)
	@Export("initColors")
	void initColors() {
		this.field1242 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1242[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1242[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1242[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1242[var1 + 192] = 16777215;
		}

		this.field1230 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1230[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1230[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1230[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1230[var1 + 192] = 16777215;
		}

		this.field1221 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1221[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1221[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1221[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1221[var1 + 192] = 16777215;
		}

		this.field1228 = new int[256]; // L: 50
		this.field1240 = 0; // L: 51
		this.field1236 = new int[32768]; // L: 52
		this.field1231 = new int[32768]; // L: 53
		this.method2418((IndexedSprite)null); // L: 54
		this.field1234 = new int[32768]; // L: 55
		this.field1229 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1639975847"
	)
	void method2442() {
		this.field1242 = null; // L: 60
		this.field1230 = null; // L: 61
		this.field1221 = null; // L: 62
		this.field1228 = null; // L: 63
		this.field1236 = null; // L: 64
		this.field1231 = null; // L: 65
		this.field1234 = null; // L: 66
		this.field1229 = null; // L: 67
		this.field1240 = 0; // L: 68
		this.field1239 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2057585866"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1234 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1237 == 0) { // L: 76
			this.field1237 = var2; // L: 77
		}

		int var3 = var2 - this.field1237; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1237 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2416(var3); // L: 83
		}

		this.method2415(var1); // L: 85
	} // L: 86

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1116978658"
	)
	final void method2416(int var1) {
		this.field1240 += var1 * 128; // L: 89
		int var2;
		if (this.field1240 > this.field1236.length) { // L: 90
			this.field1240 -= this.field1236.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2418(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1234[var2 + var3] - this.field1236[var2 + this.field1240 & this.field1236.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1234[var2++] = var6; // L: 101
		}

		byte var15 = 10; // L: 103
		var6 = 128 - var15; // L: 104

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 105
			int var8 = var7 * 128; // L: 106

			for (int var9 = 0; var9 < 128; ++var9) { // L: 107
				var10 = (int)(Math.random() * 100.0D); // L: 108
				if (var10 < 50 && var9 > var15 && var9 < var6) { // L: 109
					this.field1234[var9 + var8] = 255;
				} else {
					this.field1234[var8 + var9] = 0; // L: 110
				}
			}
		}

		if (this.field1245 * 16 > 0) { // L: 113
			this.field1245 = this.field1245 * 16 - var1 * 4;
		}

		if (this.field1233 * 16 > 0) { // L: 114
			this.field1233 = this.field1233 * 16 - var1 * 4;
		}

		if (this.field1245 * 16 == 0 && this.field1233 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1245 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1233 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1226[var7] = this.field1226[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1226[var7] = (int)(Math.sin((double)this.field1227 / 14.0D) * 16.0D + Math.sin((double)this.field1227 / 15.0D) * 14.0D + Math.sin((double)this.field1227 / 16.0D) * 12.0D); // L: 122
			++this.field1227; // L: 123
		}

		this.field1239 = this.field1239 * 10000 + 100 * var1; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1239 * 10000; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1234[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1239 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var7 + var14 < 128) { // L: 141
						var12 += this.field1234[var13 + var14 + var7];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1234[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1229[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var7 + var13 < 256) {
						var12 += this.field1229[var14 + var11 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1229[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1234[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-186966133"
	)
	final int method2410(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "6"
	)
	final void method2415(int var1) {
		int var2 = this.field1228.length; // L: 164
		if (this.field1245 * 16 > 0) { // L: 165
			this.method2420(this.field1245 * 16, this.field1230); // L: 166
		} else if (this.field1233 * 16 > 0) { // L: 168
			this.method2420(this.field1233 * 16, this.field1221); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1228[var3] = this.field1242[var3];
			}
		}

		this.method2417(var1); // L: 174
	} // L: 175

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "243550148"
	)
	final void method2420(int var1, int[] var2) {
		int var3 = this.field1228.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) { // L: 180
				this.field1228[var4] = this.method2410(this.field1242[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1228[var4] = var2[var4];
			} else {
				this.field1228[var4] = this.method2410(var2[var4], this.field1242[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-15545"
	)
	final void method2417(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1226[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= RouteStrategy.rasterProvider.width) { // L: 197
				var7 = RouteStrategy.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * RouteStrategy.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1234[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1228[var10]; // L: 208
					int var14 = RouteStrategy.rasterProvider.pixels[var8]; // L: 209
					RouteStrategy.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltc;I)V",
		garbageValue = "-1035268353"
	)
	final void method2418(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1236.length; ++var2) { // L: 219
			this.field1236[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1236[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1231[var5] = (this.field1236[var5 + 1] + this.field1236[var5 + 128] + this.field1236[var5 - 128] + this.field1236[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1236;
			this.field1236 = this.field1231;
			this.field1231 = var8;
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1236[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsq;I)I",
		garbageValue = "197503678"
	)
	static int method2422(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 179
		int var2;
		if (var1 == 0) { // L: 181
			var2 = 0;
		} else if (var1 == 1) { // L: 182
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 183
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 184
		}

		return var2; // L: 185
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "-1983594408"
	)
	static int method2440(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 475
			Interpreter.Interpreter_intStackSize -= 3; // L: 476
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 477
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 478
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 479
			if (var4 == 0) { // L: 480
				throw new RuntimeException(); // L: 481
			} else {
				Widget var6 = class165.getWidget(var9); // L: 483
				if (var6.children == null) { // L: 484
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 485
					Widget[] var7 = new Widget[var11 + 1]; // L: 486

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 487
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 488
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 490
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 491
					var12.type = var4; // L: 492
					var12.parentId = var12.id = var6.id; // L: 493
					var12.childIndex = var11; // L: 494
					var12.isIf3 = true; // L: 495
					if (var4 == 12) { // L: 496
						var12.method6391(); // L: 497
						var12.method6392().method6258(new class100(var12)); // L: 498
						var12.method6392().method6132(new class101(var12)); // L: 508
					}

					var6.children[var11] = var12; // L: 519
					if (var2) { // L: 520
						SoundSystem.scriptDotWidget = var12;
					} else {
						class1.field5 = var12; // L: 521
					}

					class144.invalidateWidget(var6); // L: 522
					return 1; // L: 523
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 525
				var3 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 526
				Widget var10 = class165.getWidget(var3.id); // L: 527
				var10.children[var3.childIndex] = null; // L: 528
				class144.invalidateWidget(var10); // L: 529
				return 1; // L: 530
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 532
				var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 533
				var3.children = null; // L: 534
				class144.invalidateWidget(var3); // L: 535
				return 1; // L: 536
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 538
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 551
					var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 552
					if (var3 != null) { // L: 553
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 554
						if (var2) { // L: 555
							SoundSystem.scriptDotWidget = var3;
						} else {
							class1.field5 = var3; // L: 556
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 558
					}

					return 1; // L: 559
				} else {
					return 2; // L: 561
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 539
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 540
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 541
				Widget var5 = SoundSystem.getWidgetChild(var9, var4); // L: 542
				if (var5 != null && var4 != -1) { // L: 543
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 544
					if (var2) { // L: 545
						SoundSystem.scriptDotWidget = var5;
					} else {
						class1.field5 = var5; // L: 546
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 548
				}

				return 1; // L: 549
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lex;",
		garbageValue = "100"
	)
	static class123 method2424(int var0) {
		class123 var1 = (class123)StructComposition.findEnumerated(Messages.method2757(), var0); // L: 150
		if (var1 == null) {
			var1 = class123.field1496; // L: 151
		}

		return var1; // L: 152
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-36"
	)
	static final void method2441(String var0, int var1) {
		PacketBufferNode var2 = class330.getPacketBufferNode(ClientPacket.field3151, Client.packetWriter.isaacCipher); // L: 228
		var2.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 229
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 230
		var2.packetBuffer.writeByte(var1); // L: 231
		Client.packetWriter.addNode(var2); // L: 232
	} // L: 233
}
