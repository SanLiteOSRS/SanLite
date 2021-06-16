import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("KeyHandler_instance")
	public static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cb")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cg")
	public static boolean[] field264;
	@ObfuscatedName("ca")
	public static boolean[] field265;
	@ObfuscatedName("cy")
	public static int[] field283;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 2097317257
	)
	public static int field267;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1162064339
	)
	public static int field268;
	@ObfuscatedName("cs")
	static char[] field269;
	@ObfuscatedName("co")
	static int[] field270;
	@ObfuscatedName("cj")
	public static int[] field257;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1885523729
	)
	public static int field271;
	@ObfuscatedName("cl")
	public static int[] field273;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 227302155
	)
	public static int field274;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 490430437
	)
	public static int field276;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1780430541
	)
	public static int field255;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -35185769
	)
	public static int field277;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1652881761
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("db")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_instance = new KeyHandler();
		KeyHandler_pressedKeys = new boolean[112];
		field264 = new boolean[112];
		field265 = new boolean[112];
		field283 = new int[128];
		field267 = 0;
		field268 = 0;
		field269 = new char[128];
		field270 = new int[128];
		field257 = new int[128];
		field271 = 0;
		field273 = new int[128];
		field274 = 0;
		field276 = 0;
		field255 = 0;
		field277 = 0;
		KeyHandler_idleCycles = 0;
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	KeyHandler() {
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (field268 >= 0 && var2 >= 0) {
				field283[field268] = var2;
				field268 = field268 + 1 & 127;
				if (field268 == field267) {
					field268 = -1;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = field255 + 1 & 127;
				if (var3 != field276) {
					field270[field255] = var2;
					field269[field255] = 0;
					field255 = var3;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) {
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1;
			}

			if (field268 >= 0 && var2 >= 0) {
				field283[field268] = ~var2;
				field268 = field268 + 1 & 127;
				if (field268 == field267) {
					field268 = -1;
				}
			}
		}

		var1.consume();
	}

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != '\uffff' && ItemLayer.method3861(var2)) {
				int var3 = field255 + 1 & 127;
				if (var3 != field276) {
					field270[field255] = -1;
					field269[field255] = var2;
					field255 = var3;
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) {
			field268 = -1;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIILfv;Lfl;B)Z",
		garbageValue = "30"
	)
	public static final boolean method475(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0;
		int var6 = var1;
		byte var7 = 64;
		byte var8 = 64;
		int var9 = var0 - var7;
		int var10 = var1 - var8;
		class160.directions[var7][var8] = 99;
		class160.distances[var7][var8] = 0;
		byte var11 = 0;
		int var12 = 0;
		class160.bufferX[var11] = var0;
		int var20 = var11 + 1;
		class160.bufferY[var11] = var1;
		int[][] var13 = var4.flags;

		while (true) {
			label307:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label284:
							do {
								if (var20 == var12) {
									Login.field1033 = var5;
									GrandExchangeOfferOwnWorldComparator.field608 = var6;
									return false;
								}

								var5 = class160.bufferX[var12];
								var6 = class160.bufferY[var12];
								var12 = var12 + 1 & 4095;
								var18 = var5 - var9;
								var19 = var6 - var10;
								var14 = var5 - var4.xInset;
								var15 = var6 - var4.yInset;
								if (var3.hasArrived(var2, var5, var6, var4)) {
									Login.field1033 = var5;
									GrandExchangeOfferOwnWorldComparator.field608 = var6;
									return true;
								}

								var16 = class160.distances[var18][var19] + 1;
								if (var18 > 0 && class160.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class160.bufferX[var20] = var5 - 1;
											class160.bufferY[var20] = var6;
											var20 = var20 + 1 & 4095;
											class160.directions[var18 - 1][var19] = 2;
											class160.distances[var18 - 1][var19] = var16;
											break;
										}

										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 < 128 - var2 && class160.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class160.bufferX[var20] = var5 + 1;
											class160.bufferY[var20] = var6;
											var20 = var20 + 1 & 4095;
											class160.directions[var18 + 1][var19] = 8;
											class160.distances[var18 + 1][var19] = var16;
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var19 > 0 && class160.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class160.bufferX[var20] = var5;
											class160.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class160.directions[var18][var19 - 1] = 1;
											class160.distances[var18][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 + var17][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var19 < 128 - var2 && class160.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class160.bufferX[var20] = var5;
											class160.bufferY[var20] = var6 + 1;
											var20 = var20 + 1 & 4095;
											class160.directions[var18][var19 + 1] = 4;
											class160.distances[var18][var19 + 1] = var16;
											break;
										}

										if ((var13[var17 + var14][var15 + var2] & 19137016) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 > 0 && var19 > 0 && class160.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class160.bufferX[var20] = var5 - 1;
											class160.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class160.directions[var18 - 1][var19 - 1] = 3;
											class160.distances[var18 - 1][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class160.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) {
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class160.bufferX[var20] = var5 + 1;
											class160.bufferY[var20] = var6 - 1;
											var20 = var20 + 1 & 4095;
											class160.directions[var18 + 1][var19 - 1] = 9;
											class160.distances[var18 + 1][var19 - 1] = var16;
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var14 + var17][var15 - 1] & 19136911) != 0) {
											break;
										}

										++var17;
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class160.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) {
									for (var17 = 1; var17 < var2; ++var17) {
										if ((var13[var14 - 1][var15 + var17] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) {
											continue label284;
										}
									}

									class160.bufferX[var20] = var5 - 1;
									class160.bufferY[var20] = var6 + 1;
									var20 = var20 + 1 & 4095;
									class160.directions[var18 - 1][var19 + 1] = 6;
									class160.distances[var18 - 1][var19 + 1] = var16;
								}
							} while(var18 >= 128 - var2);
						} while(var19 >= 128 - var2);
					} while(class160.directions[var18 + 1][var19 + 1] != 0);
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0);

				for (var17 = 1; var17 < var2; ++var17) {
					if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var15 + var17] & 19136995) != 0) {
						continue label307;
					}
				}

				class160.bufferX[var20] = var5 + 1;
				class160.bufferY[var20] = var6 + 1;
				var20 = var20 + 1 & 4095;
				class160.directions[var18 + 1][var19 + 1] = 12;
				class160.distances[var18 + 1][var19 + 1] = var16;
			}
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(ZLns;I)V",
		garbageValue = "-739552124"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			var2 = var1.method6651();
			int var3 = var1.readUnsignedShort();
			var4 = var1.readUnsignedShort();
			class7.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class7.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			UserComparator4.regions = new int[var4];
			UrlRequester.regionMapArchiveIds = new int[var4];
			class286.regionLandArchiveIds = new int[var4];
			UrlRequest.regionLandArchives = new byte[var4][];
			WorldMapDecorationType.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
				var16 = true;
			}

			if (var2 / 8 == 48 && var3 / 8 == 148) {
				var16 = true;
			}

			var4 = 0;

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						UserComparator4.regions[var4] = var8;
						UrlRequester.regionMapArchiveIds[var4] = class4.archive7.getGroupId("m" + var6 + "_" + var7);
						class286.regionLandArchiveIds[var4] = class4.archive7.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			class265.method4984(var2, var3, true);
		} else {
			var2 = var1.method6651();
			boolean var15 = var1.readUnsignedByte() == 1;
			var4 = var1.method6651();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			class7.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class7.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			UserComparator4.regions = new int[var5];
			UrlRequester.regionMapArchiveIds = new int[var5];
			class286.regionLandArchiveIds = new int[var5];
			UrlRequest.regionLandArchives = new byte[var5][];
			WorldMapDecorationType.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (UserComparator4.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								UserComparator4.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								UrlRequester.regionMapArchiveIds[var5] = class4.archive7.getGroupId("m" + var13 + "_" + var14);
								class286.regionLandArchiveIds[var5] = class4.archive7.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class265.method4984(var4, var2, !var15);
		}

	}
}
