import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "[Lle;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("k")
	int[] field1064;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -221462457
	)
	int field1080;
	@ObfuscatedName("u")
	int[] field1076;
	@ObfuscatedName("t")
	int[] field1067;
	@ObfuscatedName("e")
	int[] field1073;
	@ObfuscatedName("o")
	int[] field1069;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 393124217
	)
	int field1070;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1553210135
	)
	int field1065;
	@ObfuscatedName("p")
	int[] field1072;
	@ObfuscatedName("r")
	int[] field1066;
	@ObfuscatedName("y")
	int[] field1074;
	@ObfuscatedName("s")
	int[] field1075;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1218395493
	)
	int field1068;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -754055508
	)
	int field1071;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 897555571
	)
	int field1077;

	@ObfuscatedSignature(
		signature = "([Lle;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1064 = new int[256];
		this.field1080 = 0;
		this.field1070 = 0;
		this.field1065 = 0;
		this.field1068 = 0;
		this.field1071 = 0;
		this.field1077 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-24"
	)
	@Export("initColors")
	void initColors() {
		this.field1067 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1067[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1067[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1067[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1067[var1 + 192] = 16777215;
		}

		this.field1073 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1073[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1073[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1073[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1073[var1 + 192] = 16777215;
		}

		this.field1069 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1069[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1069[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1069[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1069[var1 + 192] = 16777215;
		}

		this.field1076 = new int[256];
		this.field1068 = 0;
		this.field1074 = new int[32768];
		this.field1075 = new int[32768];
		this.method1924((IndexedSprite)null);
		this.field1072 = new int[32768];
		this.field1066 = new int[32768];
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "831434594"
	)
	void method1917() {
		this.field1067 = null;
		this.field1073 = null;
		this.field1069 = null;
		this.field1076 = null;
		this.field1074 = null;
		this.field1075 = null;
		this.field1072 = null;
		this.field1066 = null;
		this.field1068 = 0;
		this.field1071 = 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1501826850"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1072 == null) {
			this.initColors();
		}

		if (this.field1077 == 0) {
			this.field1077 = var2;
		}

		int var3 = var2 - this.field1077;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1077 = var2;
		if (var3 > 0) {
			this.method1929(var3);
		}

		this.method1915(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IS)V",
		garbageValue = "128"
	)
	final void method1929(int var1) {
		this.field1068 += var1 * 128;
		int var2;
		if (this.field1068 > this.field1074.length) {
			this.field1068 -= this.field1074.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method1924(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1072[var2 + var3] - this.field1074[var2 + this.field1068 & this.field1074.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1072[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1072[var9 + var8] = 255;
				} else {
					this.field1072[var9 + var8] = 0;
				}
			}
		}

		if (this.field1070 * 16 > 0) {
			this.field1070 = this.field1070 * 16 - var1 * 4;
		}

		if (this.field1065 * 16 > 0) {
			this.field1065 = this.field1065 * 16 - var1 * 4;
		}

		if (this.field1070 * 16 == 0 && this.field1065 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1070 = 1024;
			}

			if (var7 == 1) {
				this.field1065 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1064[var7] = this.field1064[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1064[var7] = (int)(Math.sin((double)this.field1080 / 14.0D) * 16.0D + Math.sin((double)this.field1080 / 15.0D) * 14.0D + Math.sin((double)this.field1080 / 16.0D) * 12.0D);
			++this.field1080;
		}

		this.field1071 = this.field1071 * 10000 + var1 * 100;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1071 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1072[var12 + (var13 << 7)] = 192;
			}

			this.field1071 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1072[var14 + var13 + var7];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1072[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1066[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1066[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1066[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1072[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "-1771546572"
	)
	final int method1920(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IS)V",
		garbageValue = "152"
	)
	final void method1915(int var1) {
		int var2 = this.field1076.length;
		if (this.field1070 * 16 > 0) {
			this.method1922(this.field1070 * 16, this.field1073);
		} else if (this.field1065 * 16 > 0) {
			this.method1922(this.field1065 * 16, this.field1069);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1076[var3] = this.field1067[var3];
			}
		}

		this.method1921(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I[II)V",
		garbageValue = "1276738651"
	)
	final void method1922(int var1, int[] var2) {
		int var3 = this.field1076.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1076[var4] = this.method1920(this.field1067[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1076[var4] = var2[var4];
			} else {
				this.field1076[var4] = this.method1920(var2[var4], this.field1067[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "943733056"
	)
	final void method1921(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1064[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class22.rasterProvider.width) {
				var7 = class22.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class22.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1072[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1076[var10];
					int var14 = class22.rasterProvider.pixels[var8];
					class22.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lle;I)V",
		garbageValue = "1389216639"
	)
	final void method1924(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1074.length; ++var2) {
			this.field1074[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1074[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1075[var5] = (this.field1074[var5 + 1] + this.field1074[var5 + 128] + this.field1074[var5 - 128] + this.field1074[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1074;
			this.field1074 = this.field1075;
			this.field1075 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1074[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-20"
	)
	static void method1945() {
		Client.packetWriter.addNode(class4.getPacketBufferNode(ClientPacket.field2320, Client.packetWriter.isaacCipher));
		Client.oculusOrbState = 0;
	}
}
