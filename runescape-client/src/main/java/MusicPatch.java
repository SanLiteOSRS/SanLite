import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1531042121
	)
	int field3474;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lcf;"
	)
	@Export("rawSounds")
	class53[] rawSounds;
	@ObfuscatedName("at")
	short[] field3468;
	@ObfuscatedName("ac")
	byte[] field3469;
	@ObfuscatedName("ai")
	byte[] field3470;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Llj;"
	)
	MusicPatchNode2[] field3471;
	@ObfuscatedName("ap")
	byte[] field3472;
	@ObfuscatedName("aa")
	ArrayList field3475;
	@ObfuscatedName("af")
	int[] field3466;

	MusicPatch(byte[] var1) {
		this.field3475 = new ArrayList(8); // L: 21
		this.rawSounds = new class53[128]; // L: 25
		this.field3468 = new short[128]; // L: 26
		this.field3469 = new byte[128]; // L: 27
		this.field3470 = new byte[128]; // L: 28
		this.field3471 = new MusicPatchNode2[128]; // L: 29
		this.field3472 = new byte[128]; // L: 30
		this.field3466 = new int[128]; // L: 31
		Buffer var2 = new Buffer(var1); // L: 32

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) { // L: 33 34
		}

		byte[] var4 = new byte[var3]; // L: 35

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 36
			var4[var5] = var2.readByte();
		}

		++var2.offset; // L: 37
		++var3; // L: 38
		var5 = var2.offset; // L: 39
		var2.offset += var3; // L: 40

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) { // L: 41 42
		}

		byte[] var7 = new byte[var6]; // L: 43

		int var8;
		for (var8 = 0; var8 < var6; ++var8) { // L: 44
			var7[var8] = var2.readByte();
		}

		++var2.offset; // L: 45
		++var6; // L: 46
		var8 = var2.offset; // L: 47
		var2.offset += var6; // L: 48

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) { // L: 49 50
		}

		byte[] var10 = new byte[var9]; // L: 51

		for (int var11 = 0; var11 < var9; ++var11) { // L: 52
			var10[var11] = var2.readByte();
		}

		++var2.offset; // L: 53
		++var9; // L: 54
		byte[] var36 = new byte[var9]; // L: 55
		int var12;
		int var14;
		if (var9 > 1) { // L: 57
			var36[1] = 1; // L: 58
			int var13 = 1; // L: 59
			var12 = 2; // L: 60

			for (var14 = 2; var14 < var9; ++var14) { // L: 61
				int var41 = var2.readUnsignedByte(); // L: 62
				if (var41 == 0) { // L: 63
					var13 = var12++;
				} else {
					if (var41 <= var13) { // L: 65
						--var41;
					}

					var13 = var41; // L: 66
				}

				var36[var14] = (byte)var13; // L: 68
			}
		} else {
			var12 = var9; // L: 71
		}

		MusicPatchNode2[] var37 = new MusicPatchNode2[var12]; // L: 72

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var37.length; ++var14) { // L: 73
			var15 = var37[var14] = new MusicPatchNode2(); // L: 74
			int var40 = var2.readUnsignedByte(); // L: 75
			if (var40 > 0) { // L: 76
				var15.field3392 = new byte[var40 * 2];
			}

			var40 = var2.readUnsignedByte(); // L: 77
			if (var40 > 0) { // L: 78
				var15.field3398 = new byte[var40 * 2 + 2]; // L: 79
				var15.field3398[1] = 64; // L: 80
			}
		}

		var14 = var2.readUnsignedByte(); // L: 83
		byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null; // L: 84
		var14 = var2.readUnsignedByte(); // L: 85
		byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null; // L: 86

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) { // L: 87 88
		}

		byte[] var18 = new byte[var17]; // L: 89

		int var19;
		for (var19 = 0; var19 < var17; ++var19) { // L: 90
			var18[var19] = var2.readByte();
		}

		++var2.offset; // L: 91
		++var17; // L: 92
		var19 = 0; // L: 93

		int var20;
		for (var20 = 0; var20 < 128; ++var20) { // L: 94
			var19 += var2.readUnsignedByte(); // L: 95
			this.field3468[var20] = (short)var19; // L: 96
		}

		var19 = 0; // L: 98

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) { // L: 99
			var19 += var2.readUnsignedByte(); // L: 100
			var48 = this.field3468; // L: 101
			var48[var20] = (short)(var48[var20] + (var19 << 8));
		}

		var20 = 0; // L: 103
		int var21 = 0; // L: 104
		int var22 = 0; // L: 105

		int var23;
		for (var23 = 0; var23 < 128; ++var23) { // L: 106
			if (var20 == 0) { // L: 107
				if (var21 < var18.length) { // L: 108
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 109
				}

				var22 = var2.readVarInt(); // L: 110
			}

			var48 = this.field3468; // L: 112
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field3466[var23] = var22; // L: 113
			--var20; // L: 114
		}

		var20 = 0; // L: 116
		var21 = 0; // L: 117
		var23 = 0; // L: 118

		int var24;
		for (var24 = 0; var24 < 128; ++var24) { // L: 119
			if (this.field3466[var24] != 0) { // L: 120
				if (var20 == 0) { // L: 121
					if (var21 < var4.length) { // L: 122
						var20 = var4[var21++];
					} else {
						var20 = -1; // L: 123
					}

					var23 = var2.array[var5++] - 1; // L: 124
				}

				this.field3472[var24] = (byte)var23; // L: 126
				--var20; // L: 127
			}
		}

		var20 = 0; // L: 129
		var21 = 0; // L: 130
		var24 = 0; // L: 131

		for (int var25 = 0; var25 < 128; ++var25) { // L: 132
			if (this.field3466[var25] != 0) { // L: 133
				if (var20 == 0) { // L: 134
					if (var21 < var7.length) { // L: 135
						var20 = var7[var21++];
					} else {
						var20 = -1; // L: 136
					}

					var24 = var2.array[var8++] + 16 << 2; // L: 137
				}

				this.field3470[var25] = (byte)var24; // L: 139
				--var20; // L: 140
			}
		}

		var20 = 0; // L: 142
		var21 = 0; // L: 143
		MusicPatchNode2 var38 = null; // L: 144

		int var26;
		for (var26 = 0; var26 < 128; ++var26) { // L: 145
			if (this.field3466[var26] != 0) { // L: 146
				if (var20 == 0) { // L: 147
					var38 = var37[var36[var21]]; // L: 148
					if (var21 < var10.length) { // L: 149
						var20 = var10[var21++];
					} else {
						var20 = -1; // L: 150
					}
				}

				this.field3471[var26] = var38; // L: 152
				--var20; // L: 153
			}
		}

		var20 = 0; // L: 155
		var21 = 0; // L: 156
		var26 = 0; // L: 157

		int var27;
		for (var27 = 0; var27 < 128; ++var27) { // L: 158
			if (var20 == 0) { // L: 159
				if (var21 < var18.length) { // L: 160
					var20 = var18[var21++];
				} else {
					var20 = -1; // L: 161
				}

				if (this.field3466[var27] > 0) { // L: 162
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3469[var27] = (byte)var26; // L: 164
			--var20; // L: 165
		}

		this.field3474 = var2.readUnsignedByte() + 1; // L: 167

		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) { // L: 168
			var39 = var37[var27]; // L: 169
			if (var39.field3392 != null) { // L: 170
				for (var29 = 1; var29 < var39.field3392.length; var29 += 2) { // L: 171
					var39.field3392[var29] = var2.readByte();
				}
			}

			if (var39.field3398 != null) { // L: 173
				for (var29 = 3; var29 < var39.field3398.length - 2; var29 += 2) { // L: 174
					var39.field3398[var29] = var2.readByte();
				}
			}
		}

		if (var42 != null) { // L: 177
			for (var27 = 1; var27 < var42.length; var27 += 2) { // L: 178
				var42[var27] = var2.readByte();
			}
		}

		if (var16 != null) { // L: 180
			for (var27 = 1; var27 < var16.length; var27 += 2) { // L: 181
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 183
			var39 = var37[var27]; // L: 184
			if (var39.field3398 != null) { // L: 185
				var19 = 0; // L: 186

				for (var29 = 2; var29 < var39.field3398.length; var29 += 2) { // L: 187
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 188
					var39.field3398[var29] = (byte)var19; // L: 189
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 193
			var39 = var37[var27]; // L: 194
			if (var39.field3392 != null) { // L: 195
				var19 = 0; // L: 196

				for (var29 = 2; var29 < var39.field3392.length; var29 += 2) { // L: 197
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 198
					var39.field3392[var29] = (byte)var19; // L: 199
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (var42 != null) { // L: 203
			var19 = var2.readUnsignedByte(); // L: 204
			var42[0] = (byte)var19; // L: 205

			for (var27 = 2; var27 < var42.length; var27 += 2) { // L: 206
				var19 = var19 + 1 + var2.readUnsignedByte(); // L: 207
				var42[var27] = (byte)var19; // L: 208
			}

			var47 = var42[0]; // L: 210
			byte var28 = var42[1]; // L: 211

			for (var29 = 0; var29 < var47; ++var29) { // L: 212
				this.field3469[var29] = (byte)(var28 * this.field3469[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var42.length; var29 += 2) { // L: 213 214 225
				var30 = var42[var29]; // L: 215
				byte var31 = var42[var29 + 1]; // L: 216
				var32 = var28 * (var30 - var47) + (var30 - var47) / 2; // L: 217

				for (var33 = var47; var33 < var30; ++var33) { // L: 218
					var34 = SecureRandomFuture.method2152(var32, var30 - var47); // L: 219
					this.field3469[var33] = (byte)(var34 * this.field3469[var33] + 32 >> 6); // L: 220
					var32 += var31 - var28; // L: 221
				}

				var47 = var30; // L: 223
				var28 = var31; // L: 224
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 227
				this.field3469[var45] = (byte)(var28 * this.field3469[var45] + 32 >> 6);
			}

			var15 = null; // L: 228
		}

		if (var16 != null) { // L: 230
			var19 = var2.readUnsignedByte(); // L: 231
			var16[0] = (byte)var19; // L: 232

			for (var27 = 2; var27 < var16.length; var27 += 2) { // L: 233
				var19 = var19 + 1 + var2.readUnsignedByte(); // L: 234
				var16[var27] = (byte)var19; // L: 235
			}

			var47 = var16[0]; // L: 237
			int var44 = var16[1] << 1; // L: 238

			for (var29 = 0; var29 < var47; ++var29) { // L: 239
				var45 = var44 + (this.field3470[var29] & 255); // L: 240
				if (var45 < 0) { // L: 241
					var45 = 0;
				}

				if (var45 > 128) { // L: 242
					var45 = 128;
				}

				this.field3470[var29] = (byte)var45; // L: 243
			}

			int var46;
			for (var29 = 2; var29 < var16.length; var29 += 2) { // L: 245 246 260
				var30 = var16[var29]; // L: 247
				var46 = var16[var29 + 1] << 1; // L: 248
				var32 = var44 * (var30 - var47) + (var30 - var47) / 2; // L: 249

				for (var33 = var47; var33 < var30; ++var33) { // L: 250
					var34 = SecureRandomFuture.method2152(var32, var30 - var47); // L: 251
					int var35 = var34 + (this.field3470[var33] & 255); // L: 252
					if (var35 < 0) { // L: 253
						var35 = 0;
					}

					if (var35 > 128) { // L: 254
						var35 = 128;
					}

					this.field3470[var33] = (byte)var35; // L: 255
					var32 += var46 - var44; // L: 256
				}

				var47 = var30; // L: 258
				var44 = var46; // L: 259
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 262
				var46 = var44 + (this.field3470[var45] & 255); // L: 263
				if (var46 < 0) { // L: 264
					var46 = 0;
				}

				if (var46 > 128) { // L: 265
					var46 = 128;
				}

				this.field3470[var45] = (byte)var46; // L: 266
			}

			Object var43 = null; // L: 268
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 270
			var37[var27].field3389 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 271
			var39 = var37[var27]; // L: 272
			if (var39.field3392 != null) { // L: 273
				var39.field3388 = var2.readUnsignedByte();
			}

			if (var39.field3398 != null) { // L: 274
				var39.field3391 = var2.readUnsignedByte();
			}

			if (var39.field3389 > 0) { // L: 275
				var39.field3387 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 277
			var37[var27].field3394 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 278
			var39 = var37[var27]; // L: 279
			if (var39.field3394 > 0) { // L: 280
				var39.field3393 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 282
			var39 = var37[var27]; // L: 283
			if (var39.field3393 > 0) { // L: 284
				var39.field3395 = var2.readUnsignedByte();
			}
		}

	} // L: 286

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lbi;Ljava/util/BitSet;I)Z",
		garbageValue = "-1836403783"
	)
	boolean method5959(SoundCache var1, BitSet var2) {
		boolean var3 = true; // L: 289
		int var4 = 0; // L: 290
		class53 var5 = new class53(); // L: 291

		int var7;
		for (int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) { // L: 292 293 322
			var7 = var2.nextClearBit(var6); // L: 294

			for (int var8 = var6; var8 < var7; ++var8) { // L: 295
				if (var2.get(var8)) { // L: 296
					int var9 = this.field3466[var8]; // L: 297
					if (var9 != 0) { // L: 298
						if (var9 != var4) { // L: 299
							var4 = var9--; // L: 300 301
							if ((var9 & 1) == 0) { // L: 302
								var5 = new class53(var1.method875(var9 >> 2)); // L: 303
							} else {
								var5 = var1.method874(var9 >> 2); // L: 306
							}

							if (var5.method1085()) { // L: 308
								var3 = false; // L: 309
							} else {
								this.field3475.add(this.field3475.size(), var5); // L: 312
							}
						}

						if (!var5.method1085()) { // L: 315
							this.rawSounds[var8] = var5; // L: 316
							this.field3466[var8] = 0; // L: 317
						}
					}
				}
			}
		}

		return var3; // L: 324
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1286940116"
	)
	void method5960() {
		this.field3466 = null; // L: 328
	} // L: 329
}
