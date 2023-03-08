import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("Texture")
public class Texture extends Node {
	@ObfuscatedName("t")
	@Export("Texture_animatedPixels")
	static int[] Texture_animatedPixels;
	@ObfuscatedName("z")
	@Export("averageRGB")
	int averageRGB;
	@ObfuscatedName("j")
	boolean field2453;
	@ObfuscatedName("i")
	@Export("fileIds")
	int[] fileIds;
	@ObfuscatedName("n")
	int[] field2447;
	@ObfuscatedName("l")
	int[] field2441;
	@ObfuscatedName("k")
	int[] field2445;
	@ObfuscatedName("c")
	@Export("animationDirection")
	int animationDirection;
	@ObfuscatedName("r")
	@Export("animationSpeed")
	int animationSpeed;
	@ObfuscatedName("b")
	@Export("pixels")
	int[] pixels;
	@ObfuscatedName("m")
	@Export("isLoaded")
	boolean isLoaded;

	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	Texture(Buffer var1) {
		this.isLoaded = false; // L: 25
		this.averageRGB = var1.readUnsignedShort(); // L: 29
		this.field2453 = var1.readUnsignedByte() == 1; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 >= 1 && var2 <= 4) { // L: 32
			this.fileIds = new int[var2]; // L: 35

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 36
				this.fileIds[var3] = var1.readUnsignedShort();
			}

			if (var2 > 1) { // L: 37
				this.field2447 = new int[var2 - 1]; // L: 38

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 39
					this.field2447[var3] = var1.readUnsignedByte();
				}
			}

			if (var2 > 1) { // L: 41
				this.field2441 = new int[var2 - 1]; // L: 42

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 43
					this.field2441[var3] = var1.readUnsignedByte();
				}
			}

			this.field2445 = new int[var2]; // L: 45

			for (var3 = 0; var3 < var2; ++var3) { // L: 46
				this.field2445[var3] = var1.readInt();
			}

			this.animationDirection = var1.readUnsignedByte(); // L: 47
			this.animationSpeed = var1.readUnsignedByte(); // L: 48
			this.pixels = null; // L: 49
		} else {
			throw new RuntimeException(); // L: 33
		}
	} // L: 50

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(DILln;)Z"
	)
	@Export("load")
	boolean load(double var1, int var3, AbstractArchive var4) {
		int var5;
		for (var5 = 0; var5 < this.fileIds.length; ++var5) { // L: 53
			if (var4.getFileFlat(this.fileIds[var5]) == null) { // L: 54
				return false;
			}
		}

		var5 = var3 * var3; // L: 56
		this.pixels = new int[var5]; // L: 57

		for (int var6 = 0; var6 < this.fileIds.length; ++var6) { // L: 58
			int var8 = this.fileIds[var6]; // L: 60
			IndexedSprite var7;
			if (!class348.method6766(var4, var8)) { // L: 62
				var7 = null; // L: 63
			} else {
				IndexedSprite var10 = new IndexedSprite(); // L: 68
				var10.width = class488.SpriteBuffer_spriteWidth; // L: 69
				var10.height = class488.SpriteBuffer_spriteHeight; // L: 70
				var10.xOffset = class488.SpriteBuffer_xOffsets[0]; // L: 71
				var10.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[0]; // L: 72
				var10.subWidth = FriendsList.SpriteBuffer_spriteWidths[0]; // L: 73
				var10.subHeight = class132.SpriteBuffer_spriteHeights[0]; // L: 74
				var10.palette = class100.SpriteBuffer_spritePalette; // L: 75
				var10.pixels = class140.SpriteBuffer_pixels[0]; // L: 76
				class100.method2724(); // L: 77
				var7 = var10; // L: 80
			}

			var7.normalize(); // L: 83
			byte[] var17 = var7.pixels; // L: 84
			int[] var11 = var7.palette; // L: 85
			int var12 = this.field2445[var6]; // L: 86
			if ((var12 & -16777216) == 16777216) { // L: 87
			}

			if ((var12 & -16777216) == 33554432) { // L: 88
			}

			int var13;
			int var14;
			int var15;
			int var16;
			if ((var12 & -16777216) == 50331648) { // L: 89
				var13 = var12 & 16711935; // L: 90
				var14 = var12 >> 8 & 255; // L: 91

				for (var15 = 0; var15 < var11.length; ++var15) { // L: 92
					var16 = var11[var15]; // L: 93
					if (var16 >> 8 == (var16 & 65535)) { // L: 94
						var16 &= 255; // L: 95
						var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 65280; // L: 96
					}
				}
			}

			for (var13 = 0; var13 < var11.length; ++var13) { // L: 100
				var11[var13] = Rasterizer3D.Rasterizer3D_brighten(var11[var13], var1);
			}

			if (var6 == 0) { // L: 102
				var13 = 0;
			} else {
				var13 = this.field2447[var6 - 1]; // L: 103
			}

			if (var13 == 0) { // L: 104
				if (var3 == var7.subWidth) { // L: 105
					for (var14 = 0; var14 < var5; ++var14) { // L: 106
						this.pixels[var14] = var11[var17[var14] & 255];
					}
				} else if (var7.subWidth == 64 && var3 == 128) { // L: 108
					var14 = 0; // L: 109

					for (var15 = 0; var15 < var3; ++var15) { // L: 110
						for (var16 = 0; var16 < var3; ++var16) { // L: 111
							this.pixels[var14++] = var11[var17[(var15 >> 1 << 6) + (var16 >> 1)] & 255];
						}
					}
				} else {
					if (var7.subWidth != 128 || var3 != 64) { // L: 114
						throw new RuntimeException(); // L: 121
					}

					var14 = 0; // L: 115

					for (var15 = 0; var15 < var3; ++var15) { // L: 116
						for (var16 = 0; var16 < var3; ++var16) { // L: 117
							this.pixels[var14++] = var11[var17[(var16 << 1) + (var15 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var13 == 1) { // L: 124
			}

			if (var13 == 2) { // L: 125
			}

			if (var13 == 3) { // L: 126
			}
		}

		return true; // L: 128
	}

	@ObfuscatedName("w")
	@Export("reset")
	void reset() {
		this.pixels = null; // L: 132
	} // L: 133

	@ObfuscatedName("v")
	@Export("animate")
	void animate(int var1) {
		if (this.pixels != null) { // L: 136
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.animationDirection == 1 || this.animationDirection == 3) { // L: 137
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 138
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 140
					var2 = 64;
				} else {
					var2 = 128; // L: 141
				}

				var3 = this.pixels.length; // L: 142
				var4 = var2 * this.animationSpeed * var1; // L: 143
				var5 = var3 - 1; // L: 144
				if (this.animationDirection == 1) { // L: 145
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) { // L: 146
					var7 = var6 + var4 & var5; // L: 147
					Texture_animatedPixels[var6] = this.pixels[var7]; // L: 148
				}

				var10 = this.pixels; // L: 150
				this.pixels = Texture_animatedPixels; // L: 151
				Texture_animatedPixels = var10; // L: 152
			}

			if (this.animationDirection == 2 || this.animationDirection == 4) { // L: 154
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 155
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 157
					var2 = 64;
				} else {
					var2 = 128; // L: 158
				}

				var3 = this.pixels.length; // L: 159
				var4 = this.animationSpeed * var1; // L: 160
				var5 = var2 - 1; // L: 161
				if (this.animationDirection == 2) { // L: 162
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) { // L: 163
					for (var7 = 0; var7 < var2; ++var7) { // L: 164
						int var8 = var6 + var7; // L: 165
						int var9 = var6 + (var7 + var4 & var5); // L: 166
						Texture_animatedPixels[var8] = this.pixels[var9]; // L: 167
					}
				}

				var10 = this.pixels; // L: 170
				this.pixels = Texture_animatedPixels; // L: 171
				Texture_animatedPixels = var10; // L: 172
			}

		}
	} // L: 174
}
