import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -534708063
	)
	int field3500;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lcu;"
	)
	@Export("rawSounds")
	class53[] rawSounds;
	@ObfuscatedName("ax")
	short[] field3498;
	@ObfuscatedName("ao")
	byte[] field3499;
	@ObfuscatedName("ah")
	byte[] field3502;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lmx;"
	)
	MusicPatchNode2[] field3501;
	@ObfuscatedName("ab")
	byte[] field3495;
	@ObfuscatedName("am")
	ArrayList field3503;
	@ObfuscatedName("av")
	int[] field3504;

	MusicPatch(byte[] var1) {
		this.field3503 = new ArrayList(8); // L: 21
		this.rawSounds = new class53[128]; // L: 31
		this.field3498 = new short[128]; // L: 32
		this.field3499 = new byte[128]; // L: 33
		this.field3502 = new byte[128]; // L: 34
		this.field3501 = new MusicPatchNode2[128]; // L: 35
		this.field3495 = new byte[128]; // L: 36
		this.field3504 = new int[128]; // L: 37
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
		byte[] var36 = new byte[var9]; // L: 61
		int var12;
		int var14;
		if (var9 > 1) { // L: 63
			var36[1] = 1; // L: 64
			int var13 = 1; // L: 65
			var12 = 2; // L: 66

			for (var14 = 2; var14 < var9; ++var14) { // L: 67
				int var41 = var2.readUnsignedByte(); // L: 68
				if (var41 == 0) { // L: 69
					var13 = var12++;
				} else {
					if (var41 <= var13) { // L: 71
						--var41;
					}

					var13 = var41; // L: 72
				}

				var36[var14] = (byte)var13; // L: 74
			}
		} else {
			var12 = var9; // L: 77
		}

		MusicPatchNode2[] var37 = new MusicPatchNode2[var12]; // L: 78

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var37.length; ++var14) { // L: 79
			var15 = var37[var14] = new MusicPatchNode2(); // L: 80
			int var40 = var2.readUnsignedByte(); // L: 81
			if (var40 > 0) { // L: 82
				var15.field3420 = new byte[var40 * 2];
			}

			var40 = var2.readUnsignedByte(); // L: 83
			if (var40 > 0) { // L: 84
				var15.field3418 = new byte[var40 * 2 + 2]; // L: 85
				var15.field3418[1] = 64; // L: 86
			}
		}

		var14 = var2.readUnsignedByte(); // L: 89
		byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null; // L: 90
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
			this.field3498[var20] = (short)var19; // L: 102
		}

		var19 = 0; // L: 104

		short[] var48;
		for (var20 = 0; var20 < 128; ++var20) { // L: 105
			var19 += var2.readUnsignedByte(); // L: 106
			var48 = this.field3498; // L: 107
			var48[var20] = (short)(var48[var20] + (var19 << 8));
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

			var48 = this.field3498; // L: 118
			var48[var23] = (short)(var48[var23] + ((var22 - 1 & 2) << 14));
			this.field3504[var23] = var22; // L: 119
			--var20; // L: 120
		}

		var20 = 0; // L: 122
		var21 = 0; // L: 123
		var23 = 0; // L: 124

		int var24;
		for (var24 = 0; var24 < 128; ++var24) { // L: 125
			if (this.field3504[var24] != 0) { // L: 126
				if (var20 == 0) { // L: 127
					if (var21 < var4.length) { // L: 128
						var20 = var4[var21++];
					} else {
						var20 = -1; // L: 129
					}

					var23 = var2.array[var5++] - 1; // L: 130
				}

				this.field3495[var24] = (byte)var23; // L: 132
				--var20; // L: 133
			}
		}

		var20 = 0; // L: 135
		var21 = 0; // L: 136
		var24 = 0; // L: 137

		for (int var25 = 0; var25 < 128; ++var25) { // L: 138
			if (this.field3504[var25] != 0) { // L: 139
				if (var20 == 0) { // L: 140
					if (var21 < var7.length) { // L: 141
						var20 = var7[var21++];
					} else {
						var20 = -1; // L: 142
					}

					var24 = var2.array[var8++] + 16 << 2; // L: 143
				}

				this.field3502[var25] = (byte)var24; // L: 145
				--var20; // L: 146
			}
		}

		var20 = 0; // L: 148
		var21 = 0; // L: 149
		MusicPatchNode2 var38 = null; // L: 150

		int var26;
		for (var26 = 0; var26 < 128; ++var26) { // L: 151
			if (this.field3504[var26] != 0) { // L: 152
				if (var20 == 0) { // L: 153
					var38 = var37[var36[var21]]; // L: 154
					if (var21 < var10.length) { // L: 155
						var20 = var10[var21++];
					} else {
						var20 = -1; // L: 156
					}
				}

				this.field3501[var26] = var38; // L: 158
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

				if (this.field3504[var27] > 0) { // L: 168
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3499[var27] = (byte)var26; // L: 170
			--var20; // L: 171
		}

		this.field3500 = var2.readUnsignedByte() + 1; // L: 173

		int var29;
		MusicPatchNode2 var39;
		for (var27 = 0; var27 < var12; ++var27) { // L: 174
			var39 = var37[var27]; // L: 175
			if (var39.field3420 != null) { // L: 176
				for (var29 = 1; var29 < var39.field3420.length; var29 += 2) { // L: 177
					var39.field3420[var29] = var2.readByte();
				}
			}

			if (var39.field3418 != null) { // L: 179
				for (var29 = 3; var29 < var39.field3418.length - 2; var29 += 2) { // L: 180
					var39.field3418[var29] = var2.readByte();
				}
			}
		}

		if (var42 != null) { // L: 183
			for (var27 = 1; var27 < var42.length; var27 += 2) { // L: 184
				var42[var27] = var2.readByte();
			}
		}

		if (var16 != null) { // L: 186
			for (var27 = 1; var27 < var16.length; var27 += 2) { // L: 187
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 189
			var39 = var37[var27]; // L: 190
			if (var39.field3418 != null) { // L: 191
				var19 = 0; // L: 192

				for (var29 = 2; var29 < var39.field3418.length; var29 += 2) { // L: 193
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 194
					var39.field3418[var29] = (byte)var19; // L: 195
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 199
			var39 = var37[var27]; // L: 200
			if (var39.field3420 != null) { // L: 201
				var19 = 0; // L: 202

				for (var29 = 2; var29 < var39.field3420.length; var29 += 2) { // L: 203
					var19 = 1 + var19 + var2.readUnsignedByte(); // L: 204
					var39.field3420[var29] = (byte)var19; // L: 205
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var45;
		byte var47;
		if (var42 != null) { // L: 209
			var19 = var2.readUnsignedByte(); // L: 210
			var42[0] = (byte)var19; // L: 211

			for (var27 = 2; var27 < var42.length; var27 += 2) { // L: 212
				var19 = var19 + 1 + var2.readUnsignedByte(); // L: 213
				var42[var27] = (byte)var19; // L: 214
			}

			var47 = var42[0]; // L: 216
			byte var28 = var42[1]; // L: 217

			for (var29 = 0; var29 < var47; ++var29) { // L: 218
				this.field3499[var29] = (byte)(var28 * this.field3499[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var42.length; var29 += 2) { // L: 219 220 231
				var30 = var42[var29]; // L: 221
				byte var31 = var42[var29 + 1]; // L: 222
				var32 = var28 * (var30 - var47) + (var30 - var47) / 2; // L: 223

				for (var33 = var47; var33 < var30; ++var33) { // L: 224
					var34 = VarcInt.method3679(var32, var30 - var47); // L: 225
					this.field3499[var33] = (byte)(var34 * this.field3499[var33] + 32 >> 6); // L: 226
					var32 += var31 - var28; // L: 227
				}

				var47 = var30; // L: 229
				var28 = var31; // L: 230
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 233
				this.field3499[var45] = (byte)(var28 * this.field3499[var45] + 32 >> 6);
			}

			var15 = null; // L: 234
		}

		if (var16 != null) { // L: 236
			var19 = var2.readUnsignedByte(); // L: 237
			var16[0] = (byte)var19; // L: 238

			for (var27 = 2; var27 < var16.length; var27 += 2) { // L: 239
				var19 = 1 + var19 + var2.readUnsignedByte(); // L: 240
				var16[var27] = (byte)var19; // L: 241
			}

			var47 = var16[0]; // L: 243
			int var44 = var16[1] << 1; // L: 244

			for (var29 = 0; var29 < var47; ++var29) { // L: 245
				var45 = var44 + (this.field3502[var29] & 255); // L: 246
				if (var45 < 0) { // L: 247
					var45 = 0;
				}

				if (var45 > 128) { // L: 248
					var45 = 128;
				}

				this.field3502[var29] = (byte)var45; // L: 249
			}

			int var46;
			for (var29 = 2; var29 < var16.length; var29 += 2) { // L: 251 252 266
				var30 = var16[var29]; // L: 253
				var46 = var16[var29 + 1] << 1; // L: 254
				var32 = var44 * (var30 - var47) + (var30 - var47) / 2; // L: 255

				for (var33 = var47; var33 < var30; ++var33) { // L: 256
					var34 = VarcInt.method3679(var32, var30 - var47); // L: 257
					int var35 = var34 + (this.field3502[var33] & 255); // L: 258
					if (var35 < 0) { // L: 259
						var35 = 0;
					}

					if (var35 > 128) { // L: 260
						var35 = 128;
					}

					this.field3502[var33] = (byte)var35; // L: 261
					var32 += var46 - var44; // L: 262
				}

				var47 = var30; // L: 264
				var44 = var46; // L: 265
			}

			for (var45 = var47; var45 < 128; ++var45) { // L: 268
				var46 = var44 + (this.field3502[var45] & 255); // L: 269
				if (var46 < 0) { // L: 270
					var46 = 0;
				}

				if (var46 > 128) { // L: 271
					var46 = 128;
				}

				this.field3502[var45] = (byte)var46; // L: 272
			}

			Object var43 = null; // L: 274
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 276
			var37[var27].field3419 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 277
			var39 = var37[var27]; // L: 278
			if (var39.field3420 != null) { // L: 279
				var39.field3425 = var2.readUnsignedByte();
			}

			if (var39.field3418 != null) { // L: 280
				var39.field3417 = var2.readUnsignedByte();
			}

			if (var39.field3419 > 0) { // L: 281
				var39.field3421 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 283
			var37[var27].field3424 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 284
			var39 = var37[var27]; // L: 285
			if (var39.field3424 > 0) { // L: 286
				var39.field3423 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 288
			var39 = var37[var27]; // L: 289
			if (var39.field3423 > 0) { // L: 290
				var39.field3426 = var2.readUnsignedByte();
			}
		}

	} // L: 292

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lbl;Ljava/util/BitSet;I)Z",
		garbageValue = "-461548778"
	)
	boolean method6157(SoundCache var1, BitSet var2) {
		boolean var3 = true; // L: 295
		int var4 = 0; // L: 296
		class53 var5 = new class53(); // L: 297

		int var7;
		for (int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) { // L: 298 299 328
			var7 = var2.nextClearBit(var6); // L: 300

			for (int var8 = var6; var8 < var7; ++var8) { // L: 301
				if (var2.get(var8)) { // L: 302
					int var9 = this.field3504[var8]; // L: 303
					if (var9 != 0) { // L: 304
						if (var4 != var9) { // L: 305
							var4 = var9--; // L: 306 307
							if ((var9 & 1) == 0) { // L: 308
								var5 = new class53(var1.method852(var9 >> 2)); // L: 309
							} else {
								var5 = var1.method851(var9 >> 2); // L: 312
							}

							if (var5.method1080()) { // L: 314
								var3 = false; // L: 315
							} else {
								this.field3503.add(this.field3503.size(), var5); // L: 318
							}
						}

						if (!var5.method1080()) { // L: 321
							this.rawSounds[var8] = var5; // L: 322
							this.field3504[var8] = 0; // L: 323
						}
					}
				}
			}
		}

		return var3; // L: 330
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	@Export("clear")
	void clear() {
		this.field3504 = null; // L: 334
	} // L: 335

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1601039867"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3863
			ItemComposition.method4136(0, 0); // L: 3864
		} else if (var0 != -1) { // L: 3866
			boolean var1;
			if (class319.field3440.isEmpty()) { // L: 3869
				var1 = false; // L: 3874
			} else {
				class331 var2 = (class331)class319.field3440.get(0); // L: 3870
				var1 = var2 != null && var0 == var2.field3539; // L: 3871
			}

			if (!var1 && class91.clientPreferences.method2515() != 0) { // L: 3876 3877
				ArrayList var3 = new ArrayList(); // L: 3878
				var3.add(new class331(CollisionMap.field2392, var0, 0, class91.clientPreferences.method2515(), false)); // L: 3879
				if (Client.playingJingle) { // L: 3880
					class275.method5562(var3, 0, 100, 100, 0); // L: 3881
				} else {
					class148.method3166(var3, 0, 100, 100, 0, false); // L: 3884
				}
			}
		}

	} // L: 3889
}
