import java.util.ArrayList;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ln")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("ae")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1707394859
	)
	int field3460;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lcg;"
	)
	@Export("rawSounds")
	class53[] rawSounds;
	@ObfuscatedName("ab")
	short[] field3457;
	@ObfuscatedName("at")
	byte[] field3465;
	@ObfuscatedName("ax")
	byte[] field3466;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lle;"
	)
	MusicPatchNode2[] field3455;
	@ObfuscatedName("aj")
	byte[] field3461;
	@ObfuscatedName("ac")
	ArrayList field3458;
	@ObfuscatedName("ag")
	int[] field3463;

	MusicPatch(byte[] var1) {
		this.field3458 = new ArrayList(8); // L: 21
		this.rawSounds = new class53[128]; // L: 31
		this.field3457 = new short[128]; // L: 32
		this.field3465 = new byte[128]; // L: 33
		this.field3466 = new byte[128]; // L: 34
		this.field3455 = new MusicPatchNode2[128]; // L: 35
		this.field3461 = new byte[128]; // L: 36
		this.field3463 = new int[128]; // L: 37
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
		byte[] var38 = new byte[var9]; // L: 61
		int var12;
		int var14;
		if (var9 > 1) { // L: 63
			var38[1] = 1; // L: 64
			int var13 = 1; // L: 65
			var12 = 2; // L: 66

			for (var14 = 2; var14 < var9; ++var14) { // L: 67
				int var43 = var2.readUnsignedByte(); // L: 68
				if (var43 == 0) { // L: 69
					var13 = var12++;
				} else {
					if (var43 <= var13) { // L: 71
						--var43;
					}

					var13 = var43; // L: 72
				}

				var38[var14] = (byte)var13; // L: 74
			}
		} else {
			var12 = var9; // L: 77
		}

		MusicPatchNode2[] var39 = new MusicPatchNode2[var12]; // L: 78

		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var39.length; ++var14) { // L: 79
			var15 = var39[var14] = new MusicPatchNode2(); // L: 80
			int var42 = var2.readUnsignedByte(); // L: 81
			if (var42 > 0) { // L: 82
				var15.field3376 = new byte[var42 * 2];
			}

			var42 = var2.readUnsignedByte(); // L: 83
			if (var42 > 0) { // L: 84
				var15.field3375 = new byte[var42 * 2 + 2]; // L: 85
				var15.field3375[1] = 64; // L: 86
			}
		}

		var14 = var2.readUnsignedByte(); // L: 89
		byte[] var44 = var14 > 0 ? new byte[var14 * 2] : null; // L: 90
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
			this.field3457[var20] = (short)var19; // L: 102
		}

		var19 = 0; // L: 104

		short[] var50;
		for (var20 = 0; var20 < 128; ++var20) { // L: 105
			var19 += var2.readUnsignedByte(); // L: 106
			var50 = this.field3457; // L: 107
			var50[var20] = (short)(var50[var20] + (var19 << 8));
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

			var50 = this.field3457; // L: 118
			var50[var23] = (short)(var50[var23] + ((var22 - 1 & 2) << 14));
			this.field3463[var23] = var22; // L: 119
			--var20; // L: 120
		}

		var20 = 0; // L: 122
		var21 = 0; // L: 123
		var23 = 0; // L: 124

		int var24;
		for (var24 = 0; var24 < 128; ++var24) { // L: 125
			if (this.field3463[var24] != 0) { // L: 126
				if (var20 == 0) { // L: 127
					if (var21 < var4.length) { // L: 128
						var20 = var4[var21++];
					} else {
						var20 = -1; // L: 129
					}

					var23 = var2.array[var5++] - 1; // L: 130
				}

				this.field3461[var24] = (byte)var23; // L: 132
				--var20; // L: 133
			}
		}

		var20 = 0; // L: 135
		var21 = 0; // L: 136
		var24 = 0; // L: 137

		for (int var25 = 0; var25 < 128; ++var25) { // L: 138
			if (this.field3463[var25] != 0) { // L: 139
				if (var20 == 0) { // L: 140
					if (var21 < var7.length) { // L: 141
						var20 = var7[var21++];
					} else {
						var20 = -1; // L: 142
					}

					var24 = var2.array[var8++] + 16 << 2; // L: 143
				}

				this.field3466[var25] = (byte)var24; // L: 145
				--var20; // L: 146
			}
		}

		var20 = 0; // L: 148
		var21 = 0; // L: 149
		MusicPatchNode2 var40 = null; // L: 150

		int var26;
		for (var26 = 0; var26 < 128; ++var26) { // L: 151
			if (this.field3463[var26] != 0) { // L: 152
				if (var20 == 0) { // L: 153
					var40 = var39[var38[var21]]; // L: 154
					if (var21 < var10.length) { // L: 155
						var20 = var10[var21++];
					} else {
						var20 = -1; // L: 156
					}
				}

				this.field3455[var26] = var40; // L: 158
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

				if (this.field3463[var27] > 0) { // L: 168
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field3465[var27] = (byte)var26; // L: 170
			--var20; // L: 171
		}

		this.field3460 = var2.readUnsignedByte() + 1; // L: 173

		int var29;
		MusicPatchNode2 var41;
		for (var27 = 0; var27 < var12; ++var27) { // L: 174
			var41 = var39[var27]; // L: 175
			if (var41.field3376 != null) { // L: 176
				for (var29 = 1; var29 < var41.field3376.length; var29 += 2) { // L: 177
					var41.field3376[var29] = var2.readByte();
				}
			}

			if (var41.field3375 != null) { // L: 179
				for (var29 = 3; var29 < var41.field3375.length - 2; var29 += 2) { // L: 180
					var41.field3375[var29] = var2.readByte();
				}
			}
		}

		if (var44 != null) { // L: 183
			for (var27 = 1; var27 < var44.length; var27 += 2) { // L: 184
				var44[var27] = var2.readByte();
			}
		}

		if (var16 != null) { // L: 186
			for (var27 = 1; var27 < var16.length; var27 += 2) { // L: 187
				var16[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 189
			var41 = var39[var27]; // L: 190
			if (var41.field3375 != null) { // L: 191
				var19 = 0; // L: 192

				for (var29 = 2; var29 < var41.field3375.length; var29 += 2) { // L: 193
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 194
					var41.field3375[var29] = (byte)var19; // L: 195
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 199
			var41 = var39[var27]; // L: 200
			if (var41.field3376 != null) { // L: 201
				var19 = 0; // L: 202

				for (var29 = 2; var29 < var41.field3376.length; var29 += 2) { // L: 203
					var19 = var19 + 1 + var2.readUnsignedByte(); // L: 204
					var41.field3376[var29] = (byte)var19; // L: 205
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		int var47;
		byte var49;
		if (var44 != null) { // L: 209
			var19 = var2.readUnsignedByte(); // L: 210
			var44[0] = (byte)var19; // L: 211

			for (var27 = 2; var27 < var44.length; var27 += 2) { // L: 212
				var19 = 1 + var19 + var2.readUnsignedByte(); // L: 213
				var44[var27] = (byte)var19; // L: 214
			}

			var49 = var44[0]; // L: 216
			byte var28 = var44[1]; // L: 217

			for (var29 = 0; var29 < var49; ++var29) { // L: 218
				this.field3465[var29] = (byte)(var28 * this.field3465[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var44.length; var29 += 2) { // L: 219 220 237
				var30 = var44[var29]; // L: 221
				byte var31 = var44[var29 + 1]; // L: 222
				var32 = var28 * (var30 - var49) + (var30 - var49) / 2; // L: 223

				for (var33 = var49; var33 < var30; ++var33) { // L: 224
					var35 = var30 - var49; // L: 226
					var36 = var32 >>> 31; // L: 228
					var34 = (var32 + var36) / var35 - var36; // L: 229
					this.field3465[var33] = (byte)(var34 * this.field3465[var33] + 32 >> 6); // L: 232
					var32 += var31 - var28; // L: 233
				}

				var49 = var30; // L: 235
				var28 = var31; // L: 236
			}

			for (var47 = var49; var47 < 128; ++var47) { // L: 239
				this.field3465[var47] = (byte)(var28 * this.field3465[var47] + 32 >> 6);
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

			var49 = var16[0]; // L: 249
			int var46 = var16[1] << 1; // L: 250

			for (var29 = 0; var29 < var49; ++var29) { // L: 251
				var47 = var46 + (this.field3466[var29] & 255); // L: 252
				if (var47 < 0) { // L: 253
					var47 = 0;
				}

				if (var47 > 128) { // L: 254
					var47 = 128;
				}

				this.field3466[var29] = (byte)var47; // L: 255
			}

			int var48;
			for (var29 = 2; var29 < var16.length; var29 += 2) { // L: 257 258 278
				var30 = var16[var29]; // L: 259
				var48 = var16[var29 + 1] << 1; // L: 260
				var32 = var46 * (var30 - var49) + (var30 - var49) / 2; // L: 261

				for (var33 = var49; var33 < var30; ++var33) { // L: 262
					var35 = var30 - var49; // L: 264
					var36 = var32 >>> 31; // L: 266
					var34 = (var32 + var36) / var35 - var36; // L: 267
					int var37 = var34 + (this.field3466[var33] & 255); // L: 270
					if (var37 < 0) { // L: 271
						var37 = 0;
					}

					if (var37 > 128) { // L: 272
						var37 = 128;
					}

					this.field3466[var33] = (byte)var37; // L: 273
					var32 += var48 - var46; // L: 274
				}

				var49 = var30; // L: 276
				var46 = var48; // L: 277
			}

			for (var47 = var49; var47 < 128; ++var47) { // L: 280
				var48 = var46 + (this.field3466[var47] & 255); // L: 281
				if (var48 < 0) { // L: 282
					var48 = 0;
				}

				if (var48 > 128) { // L: 283
					var48 = 128;
				}

				this.field3466[var47] = (byte)var48; // L: 284
			}

			Object var45 = null; // L: 286
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 288
			var39[var27].field3377 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 289
			var41 = var39[var27]; // L: 290
			if (var41.field3376 != null) { // L: 291
				var41.field3381 = var2.readUnsignedByte();
			}

			if (var41.field3375 != null) { // L: 292
				var41.field3379 = var2.readUnsignedByte();
			}

			if (var41.field3377 > 0) { // L: 293
				var41.field3380 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 295
			var39[var27].field3382 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 296
			var41 = var39[var27]; // L: 297
			if (var41.field3382 > 0) { // L: 298
				var41.field3378 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) { // L: 300
			var41 = var39[var27]; // L: 301
			if (var41.field3378 > 0) { // L: 302
				var41.field3383 = var2.readUnsignedByte();
			}
		}

	} // L: 304

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lbx;Ljava/util/BitSet;I)Z",
		garbageValue = "807371418"
	)
	boolean method5997(SoundCache var1, BitSet var2) {
		boolean var3 = true; // L: 307
		int var4 = 0; // L: 308
		class53 var5 = new class53(); // L: 309

		int var7;
		for (int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) { // L: 310 311 340
			var7 = var2.nextClearBit(var6); // L: 312

			for (int var8 = var6; var8 < var7; ++var8) { // L: 313
				if (var2.get(var8)) { // L: 314
					int var9 = this.field3463[var8]; // L: 315
					if (var9 != 0) { // L: 316
						if (var4 != var9) { // L: 317
							var4 = var9--; // L: 318 319
							if ((var9 & 1) == 0) { // L: 320
								var5 = new class53(var1.method845(var9 >> 2)); // L: 321
							} else {
								var5 = var1.method844(var9 >> 2); // L: 324
							}

							if (var5.method1056()) { // L: 326
								var3 = false; // L: 327
							} else {
								this.field3458.add(this.field3458.size(), var5); // L: 330
							}
						}

						if (!var5.method1056()) { // L: 333
							this.rawSounds[var8] = var5; // L: 334
							this.field3463[var8] = 0; // L: 335
						}
					}
				}
			}
		}

		return var3; // L: 342
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1605185789"
	)
	void method5998() {
		this.field3463 = null; // L: 346
	} // L: 347

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "458159141"
	)
	static int method6009(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 1519
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1520
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.itemId; // L: 1521
			return 1; // L: 1522
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1524
			if (var3.itemId != -1) { // L: 1525
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = 0; // L: 1526
			}

			return 1; // L: 1527
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1529
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1530
			return 1; // L: 1531
		} else if (var0 == 1707) { // L: 1533
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.method6445() ? 1 : 0; // L: 1534
			return 1; // L: 1535
		} else if (var0 == 1708) { // L: 1537
			return class4.method15(var3); // L: 1538
		} else {
			return var0 == 1709 ? class33.method469(var3) : 2; // L: 1540 1541 1543
		}
	}
}
