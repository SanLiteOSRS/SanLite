import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1806729323
	)
	int field3401;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Laf;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("v")
	short[] field3399;
	@ObfuscatedName("x")
	byte[] field3402;
	@ObfuscatedName("m")
	byte[] field3405;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[Ljy;"
	)
	MusicPatchNode2[] field3400;
	@ObfuscatedName("f")
	byte[] field3403;
	@ObfuscatedName("r")
	int[] field3404;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128]; // L: 27
		this.field3399 = new short[128]; // L: 28
		this.field3402 = new byte[128]; // L: 29
		this.field3405 = new byte[128]; // L: 30
		this.field3400 = new MusicPatchNode2[128]; // L: 31
		this.field3403 = new byte[128]; // L: 32
		this.field3404 = new int[128]; // L: 33
		Buffer var2 = new Buffer(var1); // L: 34

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) { // L: 35 36
		}

		byte[] var4 = new byte[var3]; // L: 37

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 38
			var4[var5] = var2.readByte();
		}

		++var2.offset; // L: 39
		++var3; // L: 40
		var5 = var2.offset; // L: 41
		var2.offset += var3; // L: 42

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) { // L: 43 44
		}

		byte[] var7 = new byte[var6]; // L: 45

		int var8;
		for (var8 = 0; var8 < var6; ++var8) { // L: 46
			var7[var8] = var2.readByte();
		}

		++var2.offset; // L: 47
		++var6; // L: 48
		var8 = var2.offset; // L: 49
		var2.offset += var6; // L: 50

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) { // L: 51 52
		}

		byte[] var10 = new byte[var9]; // L: 53

		for (int var11 = 0; var11 < var9; ++var11) { // L: 54
			var10[var11] = var2.readByte();
		}

		++var2.offset; // L: 55
		++var9; // L: 56
		byte[] var36 = new byte[var9]; // L: 57
		int var12;
		int var14;
		if (var9 > 1) { // L: 59
			var36[1] = 1; // L: 60
			int var13 = 1; // L: 61
			var12 = 2; // L: 62

			for (var14 = 2; var14 < var9; ++var14) { // L: 63
				int var41 = var2.readUnsignedByte(); // L: 64
				if (var41 == 0) { // L: 65
					var13 = var12++;
				} else {
					if (var41 <= var13) { // L: 67
						--var41;
					}

					var13 = var41; // L: 68
				}

				var36[var14] = (byte)var13; // L: 70
			}
		} else {
			var12 = var9; // L: 73
		}

		MusicPatchNode2[] var37 = new MusicPatchNode2[var12]; // L: 74

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var37.length; ++var14) { // L: 75
			var15 = var37[var14] = new MusicPatchNode2(); // L: 76
			int var40 = var2.readUnsignedByte(); // L: 77
			if (var40 > 0) { // L: 78
				var15.field3337 = new byte[var40 * 2];
			}

			var40 = var2.readUnsignedByte(); // L: 79
			if (var40 > 0) { // L: 80
				var15.field3333 = new byte[var40 * 2 + 2]; // L: 81
				var15.field3333[1] = 64; // L: 82
			}
		}

		var14 = var2.readUnsignedByte(); // L: 85
		byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null; // L: 86
		var14 = var2.readUnsignedByte(); // L: 87
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null; // L: 88

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) { // L: 89 90
		}

		byte[] var18 = new byte[var17]; // L: 91

		int var19;
		for (var19 = 0; var19 < var17; ++var19) { // L: 92
			var18[var19] = var2.readByte();
		}

		++var2.offset; // L: 93
		++var17; // L: 94
		var19 = 0; // L: 95

		int var20;
		for (var20 = 0; var20 < 128; ++var20) { // L: 96
			var19 += var2.readUnsignedByte(); // L: 97
			this.field3399[var20] = (short)var19; // L: 98
		}

		var19 = 0; // L: 100

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) { // L: 101
			var19 += var2.readUnsignedByte(); // L: 102
			var48 = this.field3399; // L: 103
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0; // L: 105
		int var21 = 0; // L: 106
		int var22 = 0; // L: 107

		int var23;
		for (var23 = 0; var23 < 128; ++var23) { // L: 108
			if (var20 == 0) { // L: 109
				if (var21 < var18.length) { // L: 110
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 111
				}

				var22 = var2.readVarInt(); // L: 112
			}

			var48 = this.field3399; // L: 114
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field3404[var23] = var22; // L: 115
			--var20; // L: 116
		}

		var20 = 0; // L: 118
		var21 = 0; // L: 119
		var23 = 0; // L: 120

		int var24;
		for (var24 = 0; var24 < 128; ++var24) { // L: 121
			if (this.field3404[var24] != 0) { // L: 122
				if (var20 == 0) { // L: 123
					if (var21 < var4.length) { // L: 124
						var20 = var4[var21++];
					} else {
						var20 = -1; // L: 125
					}

					var23 = var2.array[var5++] - 1; // L: 126
				}

				this.field3403[var24] = (byte)var23; // L: 128
				--var20; // L: 129
			}
		}

		var20 = 0; // L: 131
		var21 = 0; // L: 132
		var24 = 0; // L: 133

		for (int var25 = 0; var25 < 128; ++var25) { // L: 134
			if (this.field3404[var25] != 0) { // L: 135
				if (var20 == 0) { // L: 136
					if (var21 < var7.length) { // L: 137
						var20 = var7[var21++];
					} else {
						var20 = -1; // L: 138
					}

					var24 = var2.array[var8++] + 16 << 2; // L: 139
				}

				this.field3405[var25] = (byte)var24; // L: 141
				--var20; // L: 142
			}
		}

		var20 = 0; // L: 144
		var21 = 0; // L: 145
		MusicPatchNode2 var38 = null; // L: 146

		int var26;
		for (var26 = 0; var26 < 128; ++var26) { // L: 147
			if (this.field3404[var26] != 0) { // L: 148
				if (var20 == 0) { // L: 149
					var38 = var37[var36[var21]]; // L: 150
					if (var21 < var10.length) { // L: 151
						var20 = var10[var21++];
					} else {
						var20 = -1; // L: 152
					}
				}

				this.field3400[var26] = var38; // L: 154
				--var20; // L: 155
			}
		}

		var20 = 0; // L: 157
		var21 = 0; // L: 158
		var26 = 0; // L: 159

		int var27;
		for (var27 = 0; var27 < 128; ++var27) { // L: 160
			if (var20 == 0) { // L: 161
				if (var21 < var18.length) { // L: 162
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 163
				}

				if (this.field3404[var27] > 0) { // L: 164
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3402[var27] = (byte)var26; // L: 166
			--var20; // L: 167
		}

		this.field3401 = var2.readUnsignedByte() + 1; // L: 169

		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) { // L: 170
			var39 = var37[var27]; // L: 171
			if (var39.field3337 != null) { // L: 172
				for (var29 = 1; var29 < var39.field3337.length; var29 += 2) { // L: 173
					var39.field3337[var29] = var2.readByte();
				}
			}

			if (var39.field3333 != null) { // L: 175
				for (var29 = 3; var29 < var39.field3333.length - 2; var29 += 2) { // L: 176
					var39.field3333[var29] = var2.readByte();
				}
			}
		}

		if (var42 != null) { // L: 179
			for (var27 = 1; var27 < var42.length; var27 += 2) { // L: 180
				var42[var27] = var2.readByte();
			}
		}

		if (var16 != null) { // L: 182
			for (var27 = 1; var27 < var16.length; var27 += 2) { // L: 183
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 185
			var39 = var37[var27]; // L: 186
			if (var39.field3333 != null) { // L: 187
				var19 = 0; // L: 188

				for (var29 = 2; var29 < var39.field3333.length; var29 += 2) { // L: 189
					var19 = 1 + var19 + var2.readUnsignedByte(); // L: 190
					var39.field3333[var29] = (byte)var19; // L: 191
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 195
			var39 = var37[var27]; // L: 196
			if (var39.field3337 != null) { // L: 197
				var19 = 0; // L: 198

				for (var29 = 2; var29 < var39.field3337.length; var29 += 2) { // L: 199
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 200
					var39.field3337[var29] = (byte)var19; // L: 201
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (var42 != null) { // L: 205
			var19 = var2.readUnsignedByte(); // L: 206
			var42[0] = (byte)var19; // L: 207

			for (var27 = 2; var27 < var42.length; var27 += 2) { // L: 208
				var19 = var19 + 1 + var2.readUnsignedByte(); // L: 209
				var42[var27] = (byte)var19; // L: 210
			}

			var47 = var42[0]; // L: 212
			byte var28 = var42[1]; // L: 213

			for (var29 = 0; var29 < var47; ++var29) { // L: 214
				this.field3402[var29] = (byte)(var28 * this.field3402[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var42.length; var29 += 2) { // L: 215 216 227
				var30 = var42[var29]; // L: 217
				byte var31 = var42[var29 + 1]; // L: 218
				var32 = var28 * (var30 - var47) + (var30 - var47) / 2; // L: 219

				for (var33 = var47; var33 < var30; ++var33) { // L: 220
					var34 = HorizontalAlignment.method3659(var32, var30 - var47); // L: 221
					this.field3402[var33] = (byte)(var34 * this.field3402[var33] + 32 >> 6); // L: 222
					var32 += var31 - var28; // L: 223
				}

				var47 = var30; // L: 225
				var28 = var31; // L: 226
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 229
				this.field3402[var45] = (byte)(var28 * this.field3402[var45] + 32 >> 6);
			}

			var15 = null; // L: 230
		}

		if (var16 != null) { // L: 232
			var19 = var2.readUnsignedByte(); // L: 233
			var16[0] = (byte)var19; // L: 234

			for (var27 = 2; var27 < var16.length; var27 += 2) { // L: 235
				var19 = 1 + var19 + var2.readUnsignedByte(); // L: 236
				var16[var27] = (byte)var19; // L: 237
			}

			var47 = var16[0]; // L: 239
			int var44 = var16[1] << 1; // L: 240

			for (var29 = 0; var29 < var47; ++var29) { // L: 241
				var45 = var44 + (this.field3405[var29] & 255); // L: 242
				if (var45 < 0) { // L: 243
					var45 = 0;
				}

				if (var45 > 128) { // L: 244
					var45 = 128;
				}

				this.field3405[var29] = (byte)var45; // L: 245
			}

			int var46;
			for (var29 = 2; var29 < var16.length; var29 += 2) { // L: 247 248 262
				var30 = var16[var29]; // L: 249
				var46 = var16[var29 + 1] << 1; // L: 250
				var32 = var44 * (var30 - var47) + (var30 - var47) / 2; // L: 251

				for (var33 = var47; var33 < var30; ++var33) { // L: 252
					var34 = HorizontalAlignment.method3659(var32, var30 - var47); // L: 253
					int var35 = var34 + (this.field3405[var33] & 255); // L: 254
					if (var35 < 0) { // L: 255
						var35 = 0;
					}

					if (var35 > 128) { // L: 256
						var35 = 128;
					}

					this.field3405[var33] = (byte)var35; // L: 257
					var32 += var46 - var44; // L: 258
				}

				var47 = var30; // L: 260
				var44 = var46; // L: 261
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 264
				var46 = var44 + (this.field3405[var45] & 255); // L: 265
				if (var46 < 0) { // L: 266
					var46 = 0;
				}

				if (var46 > 128) { // L: 267
					var46 = 128;
				}

				this.field3405[var45] = (byte)var46; // L: 268
			}

			Object var43 = null; // L: 270
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 272
			var37[var27].field3335 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 273
			var39 = var37[var27]; // L: 274
			if (var39.field3337 != null) { // L: 275
				var39.field3340 = var2.readUnsignedByte();
			}

			if (var39.field3333 != null) { // L: 276
				var39.field3336 = var2.readUnsignedByte();
			}

			if (var39.field3335 > 0) { // L: 277
				var39.field3332 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 279
			var37[var27].field3339 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 280
			var39 = var37[var27]; // L: 281
			if (var39.field3339 > 0) { // L: 282
				var39.field3338 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 284
			var39 = var37[var27]; // L: 285
			if (var39.field3338 > 0) { // L: 286
				var39.field3334 = var2.readUnsignedByte();
			}
		}

	} // L: 288

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Laj;[B[II)Z",
		garbageValue = "-225235843"
	)
	boolean method5739(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true; // L: 291
		int var5 = 0; // L: 292
		RawSound var6 = null; // L: 293

		for (int var7 = 0; var7 < 128; ++var7) { // L: 294
			if (var2 == null || var2[var7] != 0) { // L: 295
				int var8 = this.field3404[var7]; // L: 296
				if (var8 != 0) { // L: 297
					if (var8 != var5) { // L: 298
						var5 = var8--; // L: 299 300
						if ((var8 & 1) == 0) { // L: 301
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3); // L: 302
						}

						if (var6 == null) { // L: 303
							var4 = false;
						}
					}

					if (var6 != null) { // L: 305
						this.rawSounds[var7] = var6; // L: 306
						this.field3404[var7] = 0; // L: 307
					}
				}
			}
		}

		return var4; // L: 311
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-638414665"
	)
	@Export("clear")
	void clear() {
		this.field3404 = null; // L: 315
	} // L: 316
}
