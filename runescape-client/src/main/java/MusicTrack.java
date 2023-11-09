import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
@Implements("MusicTrack")
public class MusicTrack extends Node {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	NodeHashTable field3473;
	@ObfuscatedName("an")
	@Export("midi")
	byte[] midi;

	@ObfuscatedSignature(
		descriptor = "(Ltz;)V"
	)
	MusicTrack(Buffer var1) {
		this.field3473 = new NodeHashTable(16); // L: 11
		var1.offset = var1.array.length - 3; // L: 21
		int var2 = var1.readUnsignedByte(); // L: 22
		int var3 = var1.readUnsignedShort(); // L: 23
		int var4 = var2 * 10 + 14; // L: 24
		var1.offset = 0; // L: 25
		int var5 = 0; // L: 26
		int var6 = 0; // L: 27
		int var7 = 0; // L: 28
		int var8 = 0; // L: 29
		int var9 = 0; // L: 30
		int var10 = 0; // L: 31
		int var11 = 0; // L: 32
		int var12 = 0; // L: 33

		int var13;
		int var14;
		int var15;
		for (var13 = 0; var13 < var2; ++var13) { // L: 34
			var14 = -1; // L: 35

			while (true) {
				var15 = var1.readUnsignedByte(); // L: 37
				if (var15 != var14) { // L: 38
					++var4;
				}

				var14 = var15 & 15; // L: 39
				if (var15 == 7) { // L: 40
					break;
				}

				if (var15 == 23) { // L: 41
					++var5; // L: 42
				} else if (var14 == 0) { // L: 45
					++var7; // L: 46
				} else if (var14 == 1) { // L: 49
					++var8; // L: 50
				} else if (var14 == 2) { // L: 53
					++var6; // L: 54
				} else if (var14 == 3) { // L: 57
					++var9; // L: 58
				} else if (var14 == 4) { // L: 61
					++var10; // L: 62
				} else if (var14 == 5) { // L: 65
					++var11; // L: 66
				} else {
					if (var14 != 6) { // L: 69
						throw new RuntimeException(); // L: 73
					}

					++var12; // L: 70
				}
			}
		}

		var4 += var5 * 5; // L: 76
		var4 += (var7 + var8 + var6 + var9 + var11) * 2; // L: 77
		var4 = var4 + var10 + var12; // L: 78
		var13 = var1.offset; // L: 79
		var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12; // L: 80

		for (var15 = 0; var15 < var14; ++var15) { // L: 81
			var1.readVarInt();
		}

		var4 += var1.offset - var13; // L: 82
		var15 = var1.offset; // L: 83
		int var16 = 0; // L: 84
		int var17 = 0; // L: 85
		int var18 = 0; // L: 86
		int var19 = 0; // L: 87
		int var20 = 0; // L: 88
		int var21 = 0; // L: 89
		int var22 = 0; // L: 90
		int var23 = 0; // L: 91
		int var24 = 0; // L: 92
		int var25 = 0; // L: 93
		int var26 = 0; // L: 94
		int var27 = 0; // L: 95
		int var28 = 0; // L: 96

		int var29;
		for (var29 = 0; var29 < var6; ++var29) { // L: 97
			var28 = var28 + var1.readUnsignedByte() & 127; // L: 98
			if (var28 != 0 && var28 != 32) { // L: 99
				if (var28 == 1) { // L: 100
					++var16;
				} else if (var28 == 33) { // L: 101
					++var17;
				} else if (var28 == 7) { // L: 102
					++var18;
				} else if (var28 == 39) { // L: 103
					++var19;
				} else if (var28 == 10) { // L: 104
					++var20;
				} else if (var28 == 42) { // L: 105
					++var21;
				} else if (var28 == 99) { // L: 106
					++var22;
				} else if (var28 == 98) { // L: 107
					++var23;
				} else if (var28 == 101) { // L: 108
					++var24;
				} else if (var28 == 100) { // L: 109
					++var25;
				} else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) { // L: 110
					++var27; // L: 111
				} else {
					++var26;
				}
			} else {
				++var12;
			}
		}

		var29 = 0; // L: 113
		int var30 = var1.offset; // L: 114
		var1.offset += var26; // L: 115
		int var31 = var1.offset; // L: 116
		var1.offset += var11; // L: 117
		int var32 = var1.offset; // L: 118
		var1.offset += var10; // L: 119
		int var33 = var1.offset; // L: 120
		var1.offset += var9; // L: 121
		int var34 = var1.offset; // L: 122
		var1.offset += var16; // L: 123
		int var35 = var1.offset; // L: 124
		var1.offset += var18; // L: 125
		int var36 = var1.offset; // L: 126
		var1.offset += var20; // L: 127
		int var37 = var1.offset; // L: 128
		var1.offset += var7 + var8 + var11; // L: 129
		int var38 = var1.offset; // L: 130
		var1.offset += var7; // L: 131
		int var39 = var1.offset; // L: 132
		var1.offset += var27; // L: 133
		int var40 = var1.offset; // L: 134
		var1.offset += var8; // L: 135
		int var41 = var1.offset; // L: 136
		var1.offset += var17; // L: 137
		int var42 = var1.offset; // L: 138
		var1.offset += var19; // L: 139
		int var43 = var1.offset; // L: 140
		var1.offset += var21; // L: 141
		int var44 = var1.offset; // L: 142
		var1.offset += var12; // L: 143
		int var45 = var1.offset; // L: 144
		var1.offset += var9; // L: 145
		int var46 = var1.offset; // L: 146
		var1.offset += var22; // L: 147
		int var47 = var1.offset; // L: 148
		var1.offset += var23; // L: 149
		int var48 = var1.offset; // L: 150
		var1.offset += var24; // L: 151
		int var49 = var1.offset; // L: 152
		var1.offset += var25; // L: 153
		int var50 = var1.offset; // L: 154
		var1.offset += var5 * 3; // L: 155
		this.midi = new byte[var4]; // L: 156
		Buffer var51 = new Buffer(this.midi); // L: 157
		var51.writeInt(1297377380); // L: 158
		var51.writeInt(6); // L: 159
		var51.writeShort(var2 > 1 ? 1 : 0); // L: 160
		var51.writeShort(var2); // L: 161
		var51.writeShort(var3); // L: 162
		var1.offset = var13; // L: 163
		int var52 = 0; // L: 164
		int var53 = 0; // L: 165
		int var54 = 0; // L: 166
		int var55 = 0; // L: 167
		int var56 = 0; // L: 168
		int var57 = 0; // L: 169
		int var58 = 0; // L: 170
		int[] var59 = new int[128]; // L: 171
		var28 = 0; // L: 172
		int[] var60 = new int[16]; // L: 173
		int[] var61 = new int[16]; // L: 174
		var61[9] = 128; // L: 176
		var60[9] = 128; // L: 177

		label256:
		for (int var63 = 0; var63 < var2; ++var63) { // L: 178
			var51.writeInt(1297379947); // L: 179
			var51.offset += 4; // L: 180
			int var64 = var51.offset; // L: 181
			int var65 = var64; // L: 182
			int var66 = -1; // L: 183

			while (true) {
				while (true) {
					int var67 = var1.readVarInt(); // L: 185
					var51.writeVarInt(var67); // L: 186
					var65 += var67; // L: 187
					int var68 = var1.array[var29++] & 255; // L: 188
					boolean var69 = var68 != var66; // L: 189
					var66 = var68 & 15; // L: 190
					if (var68 == 7) { // L: 191
						if (var69) { // L: 192
							var51.writeByte(255);
						}

						var51.writeByte(47); // L: 193
						var51.writeByte(0); // L: 194
						var51.writeLengthInt(var51.offset - var64); // L: 295
						continue label256;
					}

					if (var68 == 23) { // L: 197
						if (var69) { // L: 198
							var51.writeByte(255);
						}

						var51.writeByte(81); // L: 199
						var51.writeByte(3); // L: 200
						var51.writeByte(var1.array[var50++]); // L: 201
						var51.writeByte(var1.array[var50++]); // L: 202
						var51.writeByte(var1.array[var50++]); // L: 203
					} else {
						var52 ^= var68 >> 4; // L: 206
						int var71;
						int var74;
						if (var66 == 0) { // L: 207
							if (var69) { // L: 208
								var51.writeByte(var52 + 144);
							}

							var53 += var1.array[var37++]; // L: 209
							var54 += var1.array[var38++]; // L: 210
							var74 = var53 & 127; // L: 211
							var71 = var54 & 127; // L: 212
							var51.writeByte(var74); // L: 213
							var51.writeByte(var71); // L: 214
							if (var71 > 0) { // L: 215
								int var72 = var61[var52]; // L: 216
								class316 var73 = (class316)this.field3473.get((long)var72); // L: 217
								if (var73 == null) { // L: 218
									var73 = new class316(var65); // L: 219
									this.field3473.put(var73, (long)var72); // L: 220
								}

								var73.field3500.set(var74); // L: 222
							}
						} else if (var66 == 1) { // L: 226
							if (var69) { // L: 227
								var51.writeByte(var52 + 128);
							}

							var53 += var1.array[var37++]; // L: 228
							var55 += var1.array[var40++]; // L: 229
							var51.writeByte(var53 & 127); // L: 230
							var51.writeByte(var55 & 127); // L: 231
						} else {
							byte var70;
							if (var66 == 2) { // L: 234
								if (var69) { // L: 235
									var51.writeByte(var52 + 176);
								}

								var28 = var28 + var1.array[var15++] & 127; // L: 236
								var51.writeByte(var28); // L: 237
								if (var28 != 0 && var28 != 32) { // L: 239
									if (var28 == 1) { // L: 240
										var70 = var1.array[var34++];
									} else if (var28 == 33) { // L: 241
										var70 = var1.array[var41++];
									} else if (var28 == 7) { // L: 242
										var70 = var1.array[var35++];
									} else if (var28 == 39) { // L: 243
										var70 = var1.array[var42++];
									} else if (var28 == 10) { // L: 244
										var70 = var1.array[var36++];
									} else if (var28 == 42) { // L: 245
										var70 = var1.array[var43++];
									} else if (var28 == 99) { // L: 246
										var70 = var1.array[var46++];
									} else if (var28 == 98) { // L: 247
										var70 = var1.array[var47++];
									} else if (var28 == 101) { // L: 248
										var70 = var1.array[var48++];
									} else if (var28 == 100) { // L: 249
										var70 = var1.array[var49++];
									} else if (var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) { // L: 250
										var70 = var1.array[var39++]; // L: 251
									} else {
										var70 = var1.array[var30++];
									}
								} else {
									var70 = var1.array[var44++];
								}

								var74 = var70 + var59[var28]; // L: 252
								var59[var28] = var74; // L: 253
								var71 = var74 & 127; // L: 254
								var51.writeByte(var71); // L: 255
								if (var28 == 0) { // L: 256
									var60[var52] = (var71 << 14) + (var60[var52] & -2080769); // L: 257
								}

								if (var28 == 32) { // L: 259
									var60[var52] = (var60[var52] & -16257) + (var71 << 7); // L: 260
								}
							} else if (var66 == 3) { // L: 264
								if (var69) { // L: 265
									var51.writeByte(var52 + 224);
								}

								var56 += var1.array[var45++]; // L: 266
								var56 += var1.array[var33++] << 7; // L: 267
								var51.writeByte(var56 & 127); // L: 268
								var51.writeByte(var56 >> 7 & 127); // L: 269
							} else if (var66 == 4) { // L: 272
								if (var69) { // L: 273
									var51.writeByte(var52 + 208);
								}

								var57 += var1.array[var32++]; // L: 274
								var51.writeByte(var57 & 127); // L: 275
							} else if (var66 == 5) { // L: 278
								if (var69) { // L: 279
									var51.writeByte(var52 + 160);
								}

								var53 += var1.array[var37++]; // L: 280
								var58 += var1.array[var31++]; // L: 281
								var51.writeByte(var53 & 127); // L: 282
								var51.writeByte(var58 & 127); // L: 283
							} else {
								if (var66 != 6) { // L: 286
									throw new RuntimeException(); // L: 293
								}

								if (var69) { // L: 287
									var51.writeByte(var52 + 192);
								}

								var70 = var1.array[var44++]; // L: 288
								var61[var52] = var70 + var60[var52]; // L: 289
								var51.writeByte(var70); // L: 290
							}
						}
					}
				}
			}
		}

	} // L: 297

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;II)Lmv;"
	)
	@Export("readTrack")
	static MusicTrack readTrack(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 15
		return var3 == null ? null : new MusicTrack(new Buffer(var3)); // L: 16
	}
}
