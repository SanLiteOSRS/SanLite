import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class155 extends class159 {
	@ObfuscatedName("as")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static IndexedSprite field1725;
	@ObfuscatedName("am")
	String field1724;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1792190605
	)
	int field1727;
	@ObfuscatedName("af")
	byte field1722;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class155(class160 var1) {
		this.this$0 = var1;
		this.field1724 = null; // L: 57
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1814222712"
	)
	void vmethod3518(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1724 = var1.readStringCp1252NullTerminatedOrNull(); // L: 68
		this.field1727 = var1.readUnsignedShort();
		this.field1722 = var1.readByte();
		var1.readLong(); // L: 71
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "1662663599"
	)
	void vmethod3519(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1724);
		var2.world = this.field1727; // L: 77
		var2.rank = this.field1722; // L: 78
		var1.addMember(var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfx;FB)F",
		garbageValue = "0"
	)
	static float method3423(class131 var0, float var1) {
		if (var0 != null && var0.method3088() != 0) { // L: 20
			if (var1 < (float)var0.field1545[0].field1483) { // L: 23
				return var0.field1539 == class129.field1513 ? var0.field1545[0].field1480 : UserComparator8.method2944(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1545[var0.method3088() - 1].field1483) { // L: 29
				return var0.field1530 == class129.field1513 ? var0.field1545[var0.method3088() - 1].field1480 : UserComparator8.method2944(var0, var1, false); // L: 30 31 33
			} else if (var0.field1527) { // L: 35
				return var0.field1545[0].field1480; // L: 36
			} else {
				class126 var2 = var0.method3091(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 221
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1481 == 0.0D && (double)var2.field1484 == 0.0D) { // L: 42
						var3 = true; // L: 43
					} else if (Float.MAX_VALUE == var2.field1481 && Float.MAX_VALUE == var2.field1484) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1485 != null) { // L: 48
						if (var0.field1543) { // L: 49
							var5 = (float)var2.field1483; // L: 58
							float var9 = var2.field1480; // L: 59
							var6 = var5 + var2.field1481 * 0.33333334F; // L: 60
							float var10 = var2.field1484 * 0.33333334F + var9; // L: 61
							float var8 = (float)var2.field1485.field1483; // L: 62
							float var12 = var2.field1485.field1480; // L: 63
							var7 = var8 - 0.33333334F * var2.field1485.field1482; // L: 64
							float var11 = var12 - 0.33333334F * var2.field1485.field1479; // L: 65
							float var14;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1541) { // L: 66
								var15 = var10; // L: 69
								var16 = var11; // L: 70
								if (var0 != null) { // L: 72
									var17 = var8 - var5; // L: 75
									if (0.0D != (double)var17) { // L: 76
										var18 = var6 - var5; // L: 79
										var19 = var7 - var5; // L: 80
										float[] var29 = new float[]{var18 / var17, var19 / var17}; // L: 81 82 83
										var0.field1532 = 0.33333334F == var29[0] && 0.6666667F == var29[1]; // L: 84
										float var21 = var29[0]; // L: 85
										float var22 = var29[1]; // L: 86
										if ((double)var29[0] < 0.0D) { // L: 87
											var29[0] = 0.0F;
										}

										if ((double)var29[1] > 1.0D) { // L: 88
											var29[1] = 1.0F;
										}

										if ((double)var29[0] > 1.0D || var29[1] < -1.0F) { // L: 89
											AttackOption.method2739(var29); // L: 90
										}

										if (var29[0] != var21) { // L: 92
											float var10000 = var5 + var17 * var29[0]; // L: 93
											if ((double)var21 != 0.0D) { // L: 94
												var15 = var9 + var29[0] * (var10 - var9) / var21; // L: 95
											}
										}

										if (var29[1] != var22) { // L: 98
											var14 = var17 * var29[1] + var5; // L: 99
											if (1.0D != (double)var22) { // L: 100
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var29[1]) / (1.0D - (double)var22)); // L: 101
											}
										}

										var0.field1533 = var5; // L: 104
										var0.field1534 = var8; // L: 105
										float var23 = var29[0]; // L: 106
										float var24 = var29[1]; // L: 107
										float var25 = var23 - 0.0F; // L: 109
										float var26 = var24 - var23; // L: 110
										float var27 = 1.0F - var24; // L: 111
										float var28 = var26 - var25; // L: 112
										var0.field1538 = var27 - var26 - var28; // L: 113
										var0.field1546 = var28 + var28 + var28; // L: 114
										var0.field1540 = var25 + var25 + var25; // L: 115
										var0.field1535 = 0.0F; // L: 116
										World.method1863(var9, var15, var16, var12, var0); // L: 118
									}
								}
							} else if (var0 != null) { // L: 123
								var0.field1533 = var5; // L: 126
								float var13 = var8 - var5; // L: 127
								var14 = var12 - var9; // L: 128
								var15 = var6 - var5; // L: 129
								var16 = 0.0F; // L: 130
								var17 = 0.0F; // L: 131
								if ((double)var15 != 0.0D) { // L: 132
									var16 = (var10 - var9) / var15; // L: 133
								}

								var15 = var8 - var7; // L: 135
								if (0.0D != (double)var15) { // L: 136
									var17 = (var12 - var11) / var15; // L: 137
								}

								var18 = 1.0F / (var13 * var13); // L: 139
								var19 = var13 * var16; // L: 140
								float var20 = var17 * var13; // L: 141
								var0.field1535 = (var20 + var19 - var14 - var14) * var18 / var13; // L: 142
								var0.field1540 = var18 * (var14 + var14 + var14 - var19 - var19 - var20); // L: 143
								var0.field1546 = var16; // L: 144
								var0.field1538 = var9; // L: 145
							}

							var0.field1543 = false; // L: 148
						}
					} else {
						var3 = true; // L: 152
					}

					if (var3) { // L: 154
						return var2.field1480; // L: 155
					} else if (var4) { // L: 157
						return (float)var2.field1483 != var1 && var2.field1485 != null ? var2.field1485.field1480 : var2.field1480; // L: 158 159 162
					} else if (var0.field1541) { // L: 165
						if (var0 == null) { // L: 168
							var5 = 0.0F; // L: 169
						} else {
							if (var0.field1533 == var1) { // L: 173
								var6 = 0.0F; // L: 174
							} else if (var1 == var0.field1534) { // L: 176
								var6 = 1.0F; // L: 177
							} else {
								var6 = (var1 - var0.field1533) / (var0.field1534 - var0.field1533); // L: 180
							}

							if (var0.field1532) { // L: 183
								var7 = var6; // L: 184
							} else {
								class127.field1491[3] = var0.field1538; // L: 187
								class127.field1491[2] = var0.field1546; // L: 188
								class127.field1491[1] = var0.field1540; // L: 189
								class127.field1491[0] = var0.field1535 - var6; // L: 190
								class127.field1492[0] = 0.0F; // L: 191
								class127.field1492[1] = 0.0F; // L: 192
								class127.field1492[2] = 0.0F; // L: 193
								class127.field1492[3] = 0.0F; // L: 194
								class127.field1492[4] = 0.0F; // L: 195
								int var30 = class434.method8069(class127.field1491, 3, 0.0F, true, 1.0F, true, class127.field1492); // L: 196
								if (var30 == 1) { // L: 197
									var7 = class127.field1492[0]; // L: 198
								} else {
									var7 = 0.0F; // L: 201
								}
							}

							var5 = var0.field1537 + ((var0.field1542 * var7 + var0.field1529) * var7 + var0.field1531) * var7; // L: 204
						}

						return var5; // L: 206
					} else {
						if (var0 == null) { // L: 211
							var5 = 0.0F; // L: 212
						} else {
							var6 = var1 - var0.field1533; // L: 215
							var5 = var0.field1538 + var6 * ((var0.field1535 * var6 + var0.field1540) * var6 + var0.field1546); // L: 216
						}

						return var5; // L: 218
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2048505706"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 13
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldj;",
		garbageValue = "0"
	)
	static final InterfaceParent method3421(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12269
		var3.group = var1; // L: 12270
		var3.type = var2; // L: 12271
		Client.interfaceParents.put(var3, (long)var0); // L: 12272
		BufferedSink.method8450(var1); // L: 12273
		Widget var4 = class380.field4414.method6348(var0); // L: 12274
		FaceNormal.invalidateWidget(var4); // L: 12275
		if (Client.meslayerContinueWidget != null) { // L: 12276
			FaceNormal.invalidateWidget(Client.meslayerContinueWidget); // L: 12277
			Client.meslayerContinueWidget = null; // L: 12278
		}

		class16.revalidateWidgetScroll(class380.field4414.field3610[var0 >> 16], var4, false); // L: 12280
		class195.method3835(var1); // L: 12281
		if (Client.rootInterface != -1) { // L: 12282
			WorldMapScaleHandler.method5149(Client.rootInterface, 1);
		}

		return var3; // L: 12283
	}
}
