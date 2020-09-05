import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1168420419
	)
	int field2513;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "[Lde;"
	)
	@Export("rawSounds")
	RawSound[] rawSounds;
	@ObfuscatedName("s")
	short[] field2510;
	@ObfuscatedName("t")
	byte[] field2507;
	@ObfuscatedName("i")
	byte[] field2509;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "[Lgo;"
	)
	MusicPatchNode2[] field2506;
	@ObfuscatedName("x")
	byte[] field2511;
	@ObfuscatedName("w")
	int[] field2512;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128];
		this.field2510 = new short[128];
		this.field2507 = new byte[128];
		this.field2509 = new byte[128];
		this.field2506 = new MusicPatchNode2[128];
		this.field2511 = new byte[128];
		this.field2512 = new int[128];
		Buffer var2 = new Buffer(var1);

		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
		}

		byte[] var4 = new byte[var3];

		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}

		++var2.offset;
		++var3;
		var5 = var2.offset;
		var2.offset += var3;

		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
		}

		byte[] var7 = new byte[var6];

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}

		++var2.offset;
		++var6;
		var8 = var2.offset;
		var2.offset += var6;

		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
		}

		byte[] var10 = new byte[var9];

		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}

		++var2.offset;
		++var9;
		byte[] var38 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var38[1] = 1;
			int var13 = 1;
			var12 = 2;

			for (var14 = 2; var14 < var9; ++var14) {
				int var15 = var2.readUnsignedByte();
				if (var15 == 0) {
					var13 = var12++;
				} else {
					if (var15 <= var13) {
						--var15;
					}

					var13 = var15;
				}

				var38[var14] = (byte)var13;
			}
		} else {
			var12 = var9;
		}

		MusicPatchNode2[] var39 = new MusicPatchNode2[var12];

		MusicPatchNode2 var40;
		for (var14 = 0; var14 < var39.length; ++var14) {
			var40 = var39[var14] = new MusicPatchNode2();
			int var16 = var2.readUnsignedByte();
			if (var16 > 0) {
				var40.field2426 = new byte[var16 * 2];
			}

			var16 = var2.readUnsignedByte();
			if (var16 > 0) {
				var40.field2433 = new byte[var16 * 2 + 2];
				var40.field2433[1] = 64;
			}
		}

		var14 = var2.readUnsignedByte();
		byte[] var47 = var14 > 0 ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var41 = var14 > 0 ? new byte[var14 * 2] : null;

		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
		}

		byte[] var18 = new byte[var17];

		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}

		++var2.offset;
		++var17;
		var19 = 0;

		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field2510[var20] = (short)var19;
		}

		var19 = 0;

		short[] var50;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var50 = this.field2510;
			var50[var20] = (short)(var50[var20] + (var19 << 8));
		}

		var20 = 0;
		int var21 = 0;
		int var22 = 0;

		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				var22 = var2.readVarInt();
			}

			var50 = this.field2510;
			var50[var23] = (short)(var50[var23] + ((var22 - 1 & 2) << 14));
			this.field2512[var23] = var22;
			--var20;
		}

		var20 = 0;
		var21 = 0;
		var23 = 0;

		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field2512[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}

					var23 = var2.array[var5++] - 1;
				}

				this.field2511[var24] = (byte)var23;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var24 = 0;

		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field2512[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}

					var24 = var2.array[var8++] + 16 << 2;
				}

				this.field2509[var25] = (byte)var24;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var42 = null;

		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field2512[var26] != 0) {
				if (var20 == 0) {
					var42 = var39[var38[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}

				this.field2506[var26] = var42;
				--var20;
			}
		}

		var20 = 0;
		var21 = 0;
		var26 = 0;

		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}

				if (this.field2512[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}

			this.field2507[var27] = (byte)var26;
			--var20;
		}

		this.field2513 = var2.readUnsignedByte() + 1;

		MusicPatchNode2 var28;
		int var29;
		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (var28.field2426 != null) {
				for (var29 = 1; var29 < var28.field2426.length; var29 += 2) {
					var28.field2426[var29] = var2.readByte();
				}
			}

			if (var28.field2433 != null) {
				for (var29 = 3; var29 < var28.field2433.length - 2; var29 += 2) {
					var28.field2433[var29] = var2.readByte();
				}
			}
		}

		if (var47 != null) {
			for (var27 = 1; var27 < var47.length; var27 += 2) {
				var47[var27] = var2.readByte();
			}
		}

		if (var41 != null) {
			for (var27 = 1; var27 < var41.length; var27 += 2) {
				var41[var27] = var2.readByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (var28.field2433 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field2433.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var28.field2433[var29] = (byte)var19;
				}
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (var28.field2426 != null) {
				var19 = 0;

				for (var29 = 2; var29 < var28.field2426.length; var29 += 2) {
					var19 = var19 + 1 + var2.readUnsignedByte();
					var28.field2426[var29] = (byte)var19;
				}
			}
		}

		byte var30;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		int var44;
		byte var46;
		if (var47 != null) {
			var19 = var2.readUnsignedByte();
			var47[0] = (byte)var19;

			for (var27 = 2; var27 < var47.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var47[var27] = (byte)var19;
			}

			var46 = var47[0];
			byte var43 = var47[1];

			for (var29 = 0; var29 < var46; ++var29) {
				this.field2507[var29] = (byte)(var43 * this.field2507[var29] + 32 >> 6);
			}

			for (var29 = 2; var29 < var47.length; var29 += 2) {
				var30 = var47[var29];
				byte var31 = var47[var29 + 1];
				var32 = var43 * (var30 - var46) + (var30 - var46) / 2;

				for (var33 = var46; var33 < var30; ++var33) {
					var35 = var30 - var46;
					var36 = var32 >>> 31;
					var34 = (var32 + var36) / var35 - var36;
					this.field2507[var33] = (byte)(var34 * this.field2507[var33] + 32 >> 6);
					var32 += var31 - var43;
				}

				var46 = var30;
				var43 = var31;
			}

			for (var44 = var46; var44 < 128; ++var44) {
				this.field2507[var44] = (byte)(var43 * this.field2507[var44] + 32 >> 6);
			}

			var40 = null;
		}

		if (var41 != null) {
			var19 = var2.readUnsignedByte();
			var41[0] = (byte)var19;

			for (var27 = 2; var27 < var41.length; var27 += 2) {
				var19 = 1 + var19 + var2.readUnsignedByte();
				var41[var27] = (byte)var19;
			}

			var46 = var41[0];
			int var49 = var41[1] << 1;

			for (var29 = 0; var29 < var46; ++var29) {
				var44 = var49 + (this.field2509[var29] & 255);
				if (var44 < 0) {
					var44 = 0;
				}

				if (var44 > 128) {
					var44 = 128;
				}

				this.field2509[var29] = (byte)var44;
			}

			int var45;
			for (var29 = 2; var29 < var41.length; var29 += 2) {
				var30 = var41[var29];
				var45 = var41[var29 + 1] << 1;
				var32 = var49 * (var30 - var46) + (var30 - var46) / 2;

				for (var33 = var46; var33 < var30; ++var33) {
					var35 = var30 - var46;
					var36 = var32 >>> 31;
					var34 = (var32 + var36) / var35 - var36;
					int var37 = var34 + (this.field2509[var33] & 255);
					if (var37 < 0) {
						var37 = 0;
					}

					if (var37 > 128) {
						var37 = 128;
					}

					this.field2509[var33] = (byte)var37;
					var32 += var45 - var49;
				}

				var46 = var30;
				var49 = var45;
			}

			for (var44 = var46; var44 < 128; ++var44) {
				var45 = var49 + (this.field2509[var44] & 255);
				if (var45 < 0) {
					var45 = 0;
				}

				if (var45 > 128) {
					var45 = 128;
				}

				this.field2509[var44] = (byte)var45;
			}

			Object var48 = null;
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field2425 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (var28.field2426 != null) {
				var28.field2427 = var2.readUnsignedByte();
			}

			if (var28.field2433 != null) {
				var28.field2428 = var2.readUnsignedByte();
			}

			if (var28.field2425 > 0) {
				var28.field2429 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field2431 = var2.readUnsignedByte();
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (var28.field2431 > 0) {
				var28.field2430 = var2.readUnsignedByte();
			}
		}

		for (var27 = 0; var27 < var12; ++var27) {
			var28 = var39[var27];
			if (var28.field2430 > 0) {
				var28.field2432 = var2.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lds;[B[IB)Z",
		garbageValue = "-93"
	)
	boolean method3979(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true;
		int var5 = 0;
		RawSound var6 = null;

		for (int var7 = 0; var7 < 128; ++var7) {
			if (var2 == null || var2[var7] != 0) {
				int var8 = this.field2512[var7];
				if (var8 != 0) {
					if (var8 != var5) {
						var5 = var8--;
						if ((var8 & 1) == 0) {
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3);
						}

						if (var6 == null) {
							var4 = false;
						}
					}

					if (var6 != null) {
						this.rawSounds[var7] = var6;
						this.field2512[var7] = 0;
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "25153"
	)
	@Export("clear")
	void clear() {
		this.field2512 = null;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		signature = "(Lhq;I)Z",
		garbageValue = "-2027629220"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = GrandExchangeOfferNameComparator.method230(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}
}
