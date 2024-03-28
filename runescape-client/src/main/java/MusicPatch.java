import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1443245103
	)
	int field3565;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lcj;"
	)
	@Export("rawSounds")
	class53[] rawSounds;
	@ObfuscatedName("at")
	short[] field3557;
	@ObfuscatedName("an")
	byte[] field3561;
	@ObfuscatedName("ao")
	byte[] field3562;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lmb;"
	)
	MusicPatchNode2[] field3563;
	@ObfuscatedName("aw")
	byte[] field3564;
	@ObfuscatedName("ad")
	ArrayList field3560;
	@ObfuscatedName("al")
	int[] field3566;

	MusicPatch(byte[] var1) {
		this.field3560 = new ArrayList(8); // L: 21
		this.rawSounds = new class53[128]; // L: 31
		this.field3557 = new short[128]; // L: 32
		this.field3561 = new byte[128]; // L: 33
		this.field3562 = new byte[128]; // L: 34
		this.field3563 = new MusicPatchNode2[128]; // L: 35
		this.field3564 = new byte[128]; // L: 36
		this.field3566 = new int[128]; // L: 37
		Buffer var2 = new Buffer(var1); // L: 38

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) { // L: 39 40
		}

		byte[] var4 = new byte[var3]; // L: 41

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 42
			var4[var5] = var2.readByte();
		}

		++var2.offset; // L: 43
		++var3; // L: 44
		var5 = var2.offset; // L: 45
		var2.offset += var3; // L: 46

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) { // L: 47 48
		}

		byte[] var7 = new byte[var6]; // L: 49

		int var8;
		for (var8 = 0; var8 < var6; ++var8) { // L: 50
			var7[var8] = var2.readByte();
		}

		++var2.offset; // L: 51
		++var6; // L: 52
		var8 = var2.offset; // L: 53
		var2.offset += var6; // L: 54

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) { // L: 55 56
		}

		byte[] var10 = new byte[var9]; // L: 57

		for (int var11 = 0; var11 < var9; ++var11) { // L: 58
			var10[var11] = var2.readByte();
		}

		++var2.offset; // L: 59
		++var9; // L: 60
		byte[] var37 = new byte[var9]; // L: 61
		int var12;
		int var14;
		if (var9 > 1) { // L: 63
			var37[1] = 1; // L: 64
			int var13 = 1; // L: 65
			var12 = 2; // L: 66

			for (var14 = 2; var14 < var9; ++var14) { // L: 67
				int var42 = var2.readUnsignedByte(); // L: 68
				if (var42 == 0) { // L: 69
					var13 = var12++;
				} else {
					if (var42 <= var13) { // L: 71
						--var42;
					}

					var13 = var42; // L: 72
				}

				var37[var14] = (byte)var13; // L: 74
			}
		} else {
			var12 = var9; // L: 77
		}

		MusicPatchNode2[] var38 = new MusicPatchNode2[var12]; // L: 78

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var38.length; ++var14) { // L: 79
			var15 = var38[var14] = new MusicPatchNode2(); // L: 80
			int var41 = var2.readUnsignedByte(); // L: 81
			if (var41 > 0) { // L: 82
				var15.field3488 = new byte[var41 * 2];
			}

			var41 = var2.readUnsignedByte(); // L: 83
			if (var41 > 0) { // L: 84
				var15.field3482 = new byte[var41 * 2 + 2]; // L: 85
				var15.field3482[1] = 64; // L: 86
			}
		}

		var14 = var2.readUnsignedByte(); // L: 89
		byte[] var43 = var14 > 0 ? new byte[var14 * 2] : null; // L: 90
		var14 = var2.readUnsignedByte(); // L: 91
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null; // L: 92

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) { // L: 93 94
		}

		byte[] var18 = new byte[var17]; // L: 95

		int var19;
		for (var19 = 0; var19 < var17; ++var19) { // L: 96
			var18[var19] = var2.readByte();
		}

		++var2.offset; // L: 97
		++var17; // L: 98
		var19 = 0; // L: 99

		int var20;
		for (var20 = 0; var20 < 128; ++var20) { // L: 100
			var19 += var2.readUnsignedByte(); // L: 101
			this.field3557[var20] = (short)var19; // L: 102
		}

		var19 = 0; // L: 104

		short[] var49;
		for (var20 = 0; var20 < 128; ++var20) { // L: 105
			var19 += var2.readUnsignedByte(); // L: 106
			var49 = this.field3557; // L: 107
			var49[var20] = (short)(var49[var20] + (var19 << 8));
		}

		var20 = 0; // L: 109
		int var21 = 0; // L: 110
		int var22 = 0; // L: 111

		int var23;
		for (var23 = 0; var23 < 128; ++var23) { // L: 112
			if (var20 == 0) { // L: 113
				if (var21 < var18.length) { // L: 114
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 115
				}

				var22 = var2.readVarInt(); // L: 116
			}

			var49 = this.field3557; // L: 118
			var49[var23] = (short)(var49[var23] + ((var22 - 1 & 2) << 14));
			this.field3566[var23] = var22; // L: 119
			--var20; // L: 120
		}

		var20 = 0; // L: 122
		var21 = 0; // L: 123
		var23 = 0; // L: 124

		int var24;
		for (var24 = 0; var24 < 128; ++var24) { // L: 125
			if (this.field3566[var24] != 0) { // L: 126
				if (var20 == 0) { // L: 127
					if (var21 < var4.length) { // L: 128
						var20 = var4[var21++];
					} else {
						var20 = -1; // L: 129
					}

					var23 = var2.array[var5++] - 1; // L: 130
				}

				this.field3564[var24] = (byte)var23; // L: 132
				--var20; // L: 133
			}
		}

		var20 = 0; // L: 135
		var21 = 0; // L: 136
		var24 = 0; // L: 137

		for (int var25 = 0; var25 < 128; ++var25) { // L: 138
			if (this.field3566[var25] != 0) { // L: 139
				if (var20 == 0) { // L: 140
					if (var21 < var7.length) {
						var20 = var7[var21++]; // L: 141
					} else {
						var20 = -1; // L: 142
					}

					var24 = var2.array[var8++] + 16 << 2; // L: 143
				}

				this.field3562[var25] = (byte)var24; // L: 145
				--var20; // L: 146
			}
		}

		var20 = 0; // L: 148
		var21 = 0; // L: 149
		MusicPatchNode2 var39 = null; // L: 150

		int var26;
		for (var26 = 0; var26 < 128; ++var26) { // L: 151
			if (this.field3566[var26] != 0) { // L: 152
				if (var20 == 0) { // L: 153
					var39 = var38[var37[var21]]; // L: 154
					if (var21 < var10.length) { // L: 155
						var20 = var10[var21++];
					} else {
						var20 = -1; // L: 156
					}
				}

				this.field3563[var26] = var39; // L: 158
				--var20; // L: 159
			}
		}

		var20 = 0; // L: 161
		var21 = 0; // L: 162
		var26 = 0; // L: 163

		int var27;
		for (var27 = 0; var27 < 128; ++var27) { // L: 164
			if (var20 == 0) { // L: 165
				if (var21 < var18.length) { // L: 166
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 167
				}

				if (this.field3566[var27] > 0) { // L: 168
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3561[var27] = (byte)var26; // L: 170
			--var20; // L: 171
		}

		this.field3565 = var2.readUnsignedByte() + 1; // L: 173

		int var29;
		MusicPatchNode2 var40;
		for (var27 = 0; var27 < var12; ++var27) { // L: 174
			var40 = var38[var27]; // L: 175
			if (var40.field3488 != null) { // L: 176
				for (var29 = 1; var29 < var40.field3488.length; var29 += 2) { // L: 177
					var40.field3488[var29] = var2.readByte();
				}
			}

			if (var40.field3482 != null) { // L: 179
				for (var29 = 3; var29 < var40.field3482.length - 2; var29 += 2) { // L: 180
					var40.field3482[var29] = var2.readByte();
				}
			}
		}

		if (var43 != null) { // L: 183
			for (var27 = 1; var27 < var43.length; var27 += 2) { // L: 184
				var43[var27] = var2.readByte();
			}
		}

		if (var16 != null) { // L: 186
			for (var27 = 1; var27 < var16.length; var27 += 2) { // L: 187
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 189
			var40 = var38[var27]; // L: 190
			if (var40.field3482 != null) { // L: 191
				var19 = 0; // L: 192

				for (var29 = 2; var29 < var40.field3482.length; var29 += 2) { // L: 193
					var19 = 1 + var19 + var2.readUnsignedByte(); // L: 194
					var40.field3482[var29] = (byte)var19; // L: 195
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 199
			var40 = var38[var27]; // L: 200
			if (var40.field3488 != null) { // L: 201
				var19 = 0; // L: 202

				for (var29 = 2; var29 < var40.field3488.length; var29 += 2) { // L: 203
					var19 = 1 + var19 + var2.readUnsignedByte(); // L: 204
					var40.field3488[var29] = (byte)var19; // L: 205
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var35;
		int var46;
		byte var48;
		if (var43 != null) { // L: 209
			var19 = var2.readUnsignedByte(); // L: 210
			var43[0] = (byte)var19; // L: 211

			for (var27 = 2; var27 < var43.length; var27 += 2) { // L: 212
				var19 = var19 + 1 + var2.readUnsignedByte(); // L: 213
				var43[var27] = (byte)var19; // L: 214
			}

			var48 = var43[0]; // L: 216
			byte var28 = var43[1]; // L: 217

			for (var29 = 0; var29 < var48; ++var29) { // L: 218
				this.field3561[var29] = (byte)(var28 * this.field3561[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var43.length; var29 += 2) { // L: 219 220 237
				var30 = var43[var29]; // L: 221
				byte var31 = var43[var29 + 1]; // L: 222
				var32 = var28 * (var30 - var48) + (var30 - var48) / 2; // L: 223

				for (var33 = var48; var33 < var30; ++var33) { // L: 224
					var35 = var30 - var48; // L: 226
					int var36 = var32 >>> 31; // L: 228
					var34 = (var36 + var32) / var35 - var36; // L: 229
					this.field3561[var33] = (byte)(var34 * this.field3561[var33] + 32 >> 6); // L: 232
					var32 += var31 - var28; // L: 233
				}

				var48 = var30; // L: 235
				var28 = var31; // L: 236
			}

			for (var46 = var48; var46 < 128; ++var46) { // L: 239
				this.field3561[var46] = (byte)(var28 * this.field3561[var46] + 32 >> 6);
			}

			var15 = null; // L: 240
		}

		if (var16 != null) { // L: 242
			var19 = var2.readUnsignedByte(); // L: 243
			var16[0] = (byte)var19; // L: 244

			for (var27 = 2; var27 < var16.length; var27 += 2) { // L: 245
				var19 = var19 + 1 + var2.readUnsignedByte(); // L: 246
				var16[var27] = (byte)var19; // L: 247
			}

			var48 = var16[0]; // L: 249
			int var45 = var16[1] << 1; // L: 250

			for (var29 = 0; var29 < var48; ++var29) { // L: 251
				var46 = var45 + (this.field3562[var29] & 255); // L: 252
				if (var46 < 0) { // L: 253
					var46 = 0;
				}

				if (var46 > 128) { // L: 254
					var46 = 128;
				}

				this.field3562[var29] = (byte)var46; // L: 255
			}

			int var47;
			for (var29 = 2; var29 < var16.length; var29 += 2) { // L: 257 258 272
				var30 = var16[var29]; // L: 259
				var47 = var16[var29 + 1] << 1; // L: 260
				var32 = var45 * (var30 - var48) + (var30 - var48) / 2; // L: 261

				for (var33 = var48; var33 < var30; ++var33) { // L: 262
					var34 = class254.method4942(var32, var30 - var48); // L: 263
					var35 = var34 + (this.field3562[var33] & 255); // L: 264
					if (var35 < 0) { // L: 265
						var35 = 0;
					}

					if (var35 > 128) { // L: 266
						var35 = 128;
					}

					this.field3562[var33] = (byte)var35; // L: 267
					var32 += var47 - var45; // L: 268
				}

				var48 = var30; // L: 270
				var45 = var47; // L: 271
			}

			for (var46 = var48; var46 < 128; ++var46) { // L: 274
				var47 = var45 + (this.field3562[var46] & 255); // L: 275
				if (var47 < 0) { // L: 276
					var47 = 0;
				}

				if (var47 > 128) { // L: 277
					var47 = 128;
				}

				this.field3562[var46] = (byte)var47; // L: 278
			}

			Object var44 = null; // L: 280
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 282
			var38[var27].field3489 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 283
			var40 = var38[var27]; // L: 284
			if (var40.field3488 != null) { // L: 285
				var40.field3484 = var2.readUnsignedByte();
			}

			if (var40.field3482 != null) { // L: 286
				var40.field3487 = var2.readUnsignedByte();
			}

			if (var40.field3489 > 0) { // L: 287
				var40.field3486 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 289
			var38[var27].field3485 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 290
			var40 = var38[var27]; // L: 291
			if (var40.field3485 > 0) { // L: 292
				var40.field3483 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 294
			var40 = var38[var27]; // L: 295
			if (var40.field3483 > 0) { // L: 296
				var40.field3481 = var2.readUnsignedByte();
			}
		}

	} // L: 298

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbq;Ljava/util/BitSet;I)Z",
		garbageValue = "157937762"
	)
	boolean method6186(SoundCache var1, BitSet var2) {
		boolean var3 = true; // L: 301
		int var4 = 0; // L: 302
		class53 var5 = new class53(); // L: 303

		int var7;
		for (int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) { // L: 304 305 334
			var7 = var2.nextClearBit(var6); // L: 306

			for (int var8 = var6; var8 < var7; ++var8) { // L: 307
				if (var2.get(var8)) { // L: 308
					int var9 = this.field3566[var8]; // L: 309
					if (var9 != 0) { // L: 310
						if (var9 != var4) { // L: 311
							var4 = var9--; // L: 312 313
							if ((var9 & 1) == 0) { // L: 314
								var5 = new class53(var1.method826(var9 >> 2)); // L: 315
							} else {
								var5 = var1.method834(var9 >> 2); // L: 318
							}

							if (var5.method1042()) { // L: 320
								var3 = false; // L: 321
							} else {
								this.field3560.add(this.field3560.size(), var5); // L: 324
							}
						}

						if (!var5.method1042()) { // L: 327
							this.rawSounds[var8] = var5; // L: 328
							this.field3566[var8] = 0; // L: 329
						}
					}
				}
			}
		}

		return var3; // L: 336
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2042479896"
	)
	@Export("clear")
	void clear() {
		this.field3566 = null; // L: 340
	} // L: 341
}
