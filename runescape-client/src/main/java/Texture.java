import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("Texture")
public class Texture extends Node {
	@ObfuscatedName("ay")
	@Export("Texture_animatedPixels")
	static int[] Texture_animatedPixels;
	@ObfuscatedName("ab")
	@Export("averageRGB")
	int averageRGB;
	@ObfuscatedName("au")
	boolean field2725;
	@ObfuscatedName("aa")
	@Export("fileIds")
	int[] fileIds;
	@ObfuscatedName("ac")
	int[] field2720;
	@ObfuscatedName("al")
	int[] field2715;
	@ObfuscatedName("az")
	int[] field2726;
	@ObfuscatedName("ap")
	@Export("animationDirection")
	int animationDirection;
	@ObfuscatedName("av")
	@Export("animationSpeed")
	int animationSpeed;
	@ObfuscatedName("ax")
	@Export("pixels")
	int[] pixels;
	@ObfuscatedName("as")
	@Export("isLoaded")
	boolean isLoaded;

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	Texture(Buffer var1) {
		this.isLoaded = false; // L: 25
		this.averageRGB = var1.readUnsignedShort(); // L: 29
		this.field2725 = var1.readUnsignedByte() == 1; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 >= 1 && var2 <= 4) { // L: 32
			this.fileIds = new int[var2]; // L: 35

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 36
				this.fileIds[var3] = var1.readUnsignedShort();
			}

			if (var2 > 1) { // L: 37
				this.field2720 = new int[var2 - 1]; // L: 38

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 39
					this.field2720[var3] = var1.readUnsignedByte();
				}
			}

			if (var2 > 1) { // L: 41
				this.field2715 = new int[var2 - 1]; // L: 42

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 43
					this.field2715[var3] = var1.readUnsignedByte();
				}
			}

			this.field2726 = new int[var2]; // L: 45

			for (var3 = 0; var3 < var2; ++var3) { // L: 46
				this.field2726[var3] = var1.readInt();
			}

			this.animationDirection = var1.readUnsignedByte(); // L: 47
			this.animationSpeed = var1.readUnsignedByte(); // L: 48
			this.pixels = null; // L: 49
		} else {
			throw new RuntimeException(); // L: 33
		}
	} // L: 50

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(DILol;)Z"
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
			if (!EnumComposition.method3679(var4, var8)) { // L: 62
				var7 = null; // L: 63
			} else {
				IndexedSprite var10 = new IndexedSprite(); // L: 68
				var10.width = class541.SpriteBuffer_spriteWidth; // L: 69
				var10.height = GrandExchangeOfferWorldComparator.SpriteBuffer_spriteHeight; // L: 70
				var10.xOffset = class541.SpriteBuffer_xOffsets[0]; // L: 71
				var10.yOffset = class541.SpriteBuffer_yOffsets[0]; // L: 72
				var10.subWidth = class541.SpriteBuffer_spriteWidths[0]; // L: 73
				var10.subHeight = class520.SpriteBuffer_spriteHeights[0]; // L: 74
				var10.palette = class541.SpriteBuffer_spritePalette; // L: 75
				var10.pixels = class396.SpriteBuffer_pixels[0]; // L: 76
				class541.SpriteBuffer_xOffsets = null; // L: 78
				class541.SpriteBuffer_yOffsets = null; // L: 79
				class541.SpriteBuffer_spriteWidths = null; // L: 80
				class520.SpriteBuffer_spriteHeights = null; // L: 81
				class541.SpriteBuffer_spritePalette = null; // L: 82
				class396.SpriteBuffer_pixels = null; // L: 83
				var7 = var10; // L: 87
			}

			var7.normalize(); // L: 90
			byte[] var17 = var7.pixels; // L: 91
			int[] var11 = var7.palette; // L: 92
			int var12 = this.field2726[var6]; // L: 93
			if ((var12 & -16777216) == 16777216) { // L: 94
			}

			if ((var12 & -16777216) == 33554432) { // L: 95
			}

			int var13;
			int var14;
			int var15;
			int var16;
			if ((var12 & -16777216) == 50331648) { // L: 96
				var13 = var12 & 16711935; // L: 97
				var14 = var12 >> 8 & 255; // L: 98

				for (var15 = 0; var15 < var11.length; ++var15) { // L: 99
					var16 = var11[var15]; // L: 100
					if (var16 >> 8 == (var16 & 65535)) { // L: 101
						var16 &= 255; // L: 102
						var11[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 65280; // L: 103
					}
				}
			}

			for (var13 = 0; var13 < var11.length; ++var13) { // L: 107
				var11[var13] = Rasterizer3D.Rasterizer3D_brighten(var11[var13], var1);
			}

			if (var6 == 0) { // L: 109
				var13 = 0;
			} else {
				var13 = this.field2720[var6 - 1]; // L: 110
			}

			if (var13 == 0) { // L: 111
				if (var3 == var7.subWidth) { // L: 112
					for (var14 = 0; var14 < var5; ++var14) { // L: 113
						this.pixels[var14] = var11[var17[var14] & 255];
					}
				} else if (var7.subWidth == 64 && var3 == 128) { // L: 115
					var14 = 0; // L: 116

					for (var15 = 0; var15 < var3; ++var15) { // L: 117
						for (var16 = 0; var16 < var3; ++var16) { // L: 118
							this.pixels[var14++] = var11[var17[(var15 >> 1 << 6) + (var16 >> 1)] & 255];
						}
					}
				} else {
					if (var7.subWidth != 128 || var3 != 64) { // L: 121
						throw new RuntimeException(); // L: 128
					}

					var14 = 0; // L: 122

					for (var15 = 0; var15 < var3; ++var15) { // L: 123
						for (var16 = 0; var16 < var3; ++var16) { // L: 124
							this.pixels[var14++] = var11[var17[(var16 << 1) + (var15 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var13 == 1) { // L: 131
			}

			if (var13 == 2) { // L: 132
			}

			if (var13 == 3) { // L: 133
			}
		}

		return true; // L: 135
	}

	@ObfuscatedName("ah")
	@Export("reset")
	void reset() {
		this.pixels = null; // L: 139
	} // L: 140

	@ObfuscatedName("ar")
	@Export("animate")
	void animate(int var1) {
		if (this.pixels != null) { // L: 143
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.animationDirection == 1 || this.animationDirection == 3) { // L: 144
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 145
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 147
					var2 = 64;
				} else {
					var2 = 128; // L: 148
				}

				var3 = this.pixels.length; // L: 149
				var4 = var2 * this.animationSpeed * var1; // L: 150
				var5 = var3 - 1; // L: 151
				if (this.animationDirection == 1) { // L: 152
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) { // L: 153
					var7 = var6 + var4 & var5; // L: 154
					Texture_animatedPixels[var6] = this.pixels[var7]; // L: 155
				}

				var10 = this.pixels; // L: 157
				this.pixels = Texture_animatedPixels; // L: 158
				Texture_animatedPixels = var10; // L: 159
			}

			if (this.animationDirection == 2 || this.animationDirection == 4) { // L: 161
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 162
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 164
					var2 = 64;
				} else {
					var2 = 128; // L: 165
				}

				var3 = this.pixels.length; // L: 166
				var4 = this.animationSpeed * var1; // L: 167
				var5 = var2 - 1; // L: 168
				if (this.animationDirection == 2) { // L: 169
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) { // L: 170
					for (var7 = 0; var7 < var2; ++var7) { // L: 171
						int var8 = var6 + var7; // L: 172
						int var9 = var6 + (var7 + var4 & var5); // L: 173
						Texture_animatedPixels[var8] = this.pixels[var9]; // L: 174
					}
				}

				var10 = this.pixels; // L: 177
				this.pixels = Texture_animatedPixels; // L: 178
				Texture_animatedPixels = var10; // L: 179
			}

		}
	} // L: 181
}
