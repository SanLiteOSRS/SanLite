import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public abstract class class183 {
	@ObfuscatedName("ti")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("ax")
	String field1888;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class172 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;Ljava/lang/String;)V"
	)
	class183(class172 var1, String var2) {
		this.this$0 = var1; // L: 371
		this.field1888 = var2; // L: 372
	} // L: 373

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1007456210"
	)
	public abstract int vmethod3575();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1667250407"
	)
	public String vmethod3574() {
		return null; // L: 382
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-19272"
	)
	public int vmethod3573() {
		return -1; // L: 386
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "4207"
	)
	public String method3576() {
		return this.field1888; // L: 376
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfz;FB)F",
		garbageValue = "-84"
	)
	static float method3586(class132 var0, float var1) {
		if (var0 != null && var0.method3017() != 0) { // L: 20
			if (var1 < (float)var0.field1541[0].field1492) { // L: 23
				return var0.field1547 == class130.field1524 ? var0.field1541[0].field1490 : class104.method2712(var0, var1, true); // L: 24 25 27
			} else if (var1 > (float)var0.field1541[var0.method3017() - 1].field1492) { // L: 29
				return var0.field1553 == class130.field1524 ? var0.field1541[var0.method3017() - 1].field1490 : class104.method2712(var0, var1, false); // L: 31 33
			} else if (var0.field1548) { // L: 35
				return var0.field1541[0].field1490; // L: 36
			} else {
				class127 var2 = var0.method3030(var1); // L: 38
				boolean var3 = false; // L: 39
				boolean var4 = false; // L: 40
				if (var2 == null) { // L: 41
					return 0.0F; // L: 197
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1489 == 0.0D && 0.0D == (double)var2.field1494) { // L: 42
						var3 = true; // L: 43
					} else if (Float.MAX_VALUE == var2.field1489 && Float.MAX_VALUE == var2.field1494) { // L: 45
						var4 = true; // L: 46
					} else if (var2.field1493 != null) { // L: 48
						if (var0.field1552) { // L: 49
							var5 = (float)var2.field1492; // L: 58
							float var9 = var2.field1490; // L: 59
							var6 = var5 + var2.field1489 * 0.33333334F; // L: 60
							float var10 = var2.field1494 * 0.33333334F + var9; // L: 61
							float var8 = (float)var2.field1493.field1492; // L: 62
							float var12 = var2.field1493.field1490; // L: 63
							var7 = var8 - var2.field1493.field1491 * 0.33333334F; // L: 64
							float var11 = var12 - 0.33333334F * var2.field1493.field1495; // L: 65
							if (var0.field1558) { // L: 66
								float var15 = var10; // L: 69
								float var16 = var11; // L: 70
								if (var0 != null) { // L: 72
									float var17 = var8 - var5; // L: 75
									if (0.0D != (double)var17) { // L: 76
										float var18 = var6 - var5; // L: 79
										float var19 = var7 - var5; // L: 80
										float[] var20 = new float[]{var18 / var17, var19 / var17}; // L: 81 82 83
										var0.field1556 = 0.33333334F == var20[0] && var20[1] == 0.6666667F; // L: 84
										float var21 = var20[0]; // L: 85
										float var22 = var20[1]; // L: 86
										if ((double)var20[0] < 0.0D) { // L: 87
											var20[0] = 0.0F;
										}

										if ((double)var20[1] > 1.0D) { // L: 88
											var20[1] = 1.0F;
										}

										float var23;
										if ((double)var20[0] > 1.0D || var20[1] < -1.0F) { // L: 89
											var20[1] = 1.0F - var20[1]; // L: 91
											if (var20[0] < 0.0F) { // L: 92
												var20[0] = 0.0F;
											}

											if (var20[1] < 0.0F) { // L: 93
												var20[1] = 0.0F;
											}

											if (var20[0] > 1.0F || var20[1] > 1.0F) { // L: 94
												var23 = (float)(1.0D + (double)(var20[0] * (var20[0] - 2.0F + var20[1])) + (double)var20[1] * ((double)var20[1] - 2.0D)); // L: 95
												if (class128.field1501 + var23 > 0.0F) { // L: 96
													class10.method104(var20); // L: 97
												}
											}

											var20[1] = 1.0F - var20[1]; // L: 100
										}

										if (var21 != var20[0]) { // L: 103
											float var13 = var17 * var20[0] + var5; // L: 104
											if ((double)var21 != 0.0D) { // L: 105
												var15 = var9 + var20[0] * (var10 - var9) / var21; // L: 106
											}
										}

										if (var22 != var20[1]) { // L: 109
											float var14 = var20[1] * var17 + var5; // L: 110
											if (1.0D != (double)var22) { // L: 111
												var16 = (float)((double)var12 - (1.0D - (double)var20[1]) * (double)(var12 - var11) / (1.0D - (double)var22)); // L: 112
											}
										}

										var0.field1543 = var5; // L: 115
										var0.field1544 = var8; // L: 116
										class315.method5905(0.0F, var20[0], var20[1], 1.0F, var0); // L: 117
										var23 = var15 - var9; // L: 119
										float var24 = var16 - var15; // L: 120
										float var25 = var12 - var16; // L: 121
										float var26 = var24 - var23; // L: 122
										var0.field1554 = var25 - var24 - var26; // L: 123
										var0.field1551 = var26 + var26 + var26; // L: 124
										var0.field1550 = var23 + var23 + var23; // L: 125
										var0.field1549 = var9; // L: 126
									}
								}
							} else {
								TileItem.method2727(var0, var5, var6, var7, var8, var9, var10, var11, var12); // L: 131
							}

							var0.field1552 = false; // L: 133
						}
					} else {
						var3 = true; // L: 137
					}

					if (var3) { // L: 139
						return var2.field1490; // L: 140
					} else if (var4) { // L: 142
						return (float)var2.field1492 != var1 && var2.field1493 != null ? var2.field1493.field1490 : var2.field1490; // L: 143 144 147
					} else if (var0.field1558) { // L: 150
						if (var0 == null) { // L: 153
							var5 = 0.0F; // L: 154
						} else {
							if (var0.field1543 == var1) { // L: 158
								var6 = 0.0F; // L: 159
							} else if (var0.field1544 == var1) { // L: 161
								var6 = 1.0F; // L: 162
							} else {
								var6 = (var1 - var0.field1543) / (var0.field1544 - var0.field1543); // L: 165
							}

							if (var0.field1556) { // L: 168
								var7 = var6; // L: 169
							} else {
								class128.field1502[3] = var0.field1542; // L: 172
								class128.field1502[2] = var0.field1538; // L: 173
								class128.field1502[1] = var0.field1546; // L: 174
								class128.field1502[0] = var0.field1545 - var6; // L: 175
								class128.field1503[0] = 0.0F; // L: 176
								class128.field1503[1] = 0.0F; // L: 177
								class128.field1503[2] = 0.0F; // L: 178
								class128.field1503[3] = 0.0F; // L: 179
								class128.field1503[4] = 0.0F; // L: 180
								int var27 = PacketBufferNode.method5873(class128.field1502, 3, 0.0F, true, 1.0F, true, class128.field1503); // L: 181
								if (var27 == 1) { // L: 182
									var7 = class128.field1503[0]; // L: 183
								} else {
									var7 = 0.0F; // L: 186
								}
							}

							var5 = var7 * ((var0.field1554 * var7 + var0.field1551) * var7 + var0.field1550) + var0.field1549; // L: 189
						}

						return var5; // L: 191
					} else {
						return DevicePcmPlayerProvider.method311(var0, var1); // L: 194
					}
				}
			}
		} else {
			return 0.0F; // L: 21
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lol;",
		garbageValue = "654321032"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4267, PlayerType.field4285, PlayerType.field4273, PlayerType.PlayerType_ironman, PlayerType.field4278, PlayerType.PlayerType_ultimateIronman, PlayerType.field4275, PlayerType.field4277, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_playerModerator, PlayerType.field4272, PlayerType.PlayerType_jagexModerator, PlayerType.field4276, PlayerType.field4274, PlayerType.field4279, PlayerType.PlayerType_normal, PlayerType.field4270}; // L: 30
	}
}
