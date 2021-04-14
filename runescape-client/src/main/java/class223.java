import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class223 {
	@ObfuscatedName("f")
	public static final short[] field2609;
	@ObfuscatedName("o")
	public static final short[][] field2608;
	@ObfuscatedName("u")
	public static final short[] field2611;
	@ObfuscatedName("p")
	public static final short[][] field2610;
	@ObfuscatedName("h")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;

	static {
		field2609 = new short[]{6798, 8741, 25238, 4626, 4550};
		field2608 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
		field2611 = new short[]{-10304, 9104, -1, -1, -1};
		field2610 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-1982407025"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = class7.method107(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (SecureRandomCallable.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(SecureRandomCallable.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + RunException.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.clientType + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "2"
	)
	public static int method4231(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "962825784"
	)
	static int method4236(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class32.method394(var0, var1, var2);
		} else if (var0 < 1100) {
			return UserComparator7.method2431(var0, var1, var2);
		} else if (var0 < 1200) {
			return AttackOption.method2260(var0, var1, var2);
		} else if (var0 < 1300) {
			return class24.method349(var0, var1, var2);
		} else if (var0 < 1400) {
			return ModeWhere.method4705(var0, var1, var2);
		} else if (var0 < 1500) {
			return InterfaceParent.method2095(var0, var1, var2);
		} else if (var0 < 1600) {
			return WorldMapArea.method2740(var0, var1, var2);
		} else if (var0 < 1700) {
			return GameEngine.method547(var0, var1, var2);
		} else if (var0 < 1800) {
			return SoundCache.method883(var0, var1, var2);
		} else if (var0 < 1900) {
			return Player.method2140(var0, var1, var2);
		} else if (var0 < 2000) {
			return MouseHandler.method726(var0, var1, var2);
		} else if (var0 < 2100) {
			return UserComparator7.method2431(var0, var1, var2);
		} else if (var0 < 2200) {
			return AttackOption.method2260(var0, var1, var2);
		} else if (var0 < 2300) {
			return class24.method349(var0, var1, var2);
		} else if (var0 < 2400) {
			return ModeWhere.method4705(var0, var1, var2);
		} else if (var0 < 2500) {
			return InterfaceParent.method2095(var0, var1, var2);
		} else if (var0 < 2600) {
			return class69.method1169(var0, var1, var2);
		} else if (var0 < 2700) {
			return ReflectionCheck.method1171(var0, var1, var2);
		} else if (var0 < 2800) {
			return Buddy.method5815(var0, var1, var2);
		} else if (var0 < 2900) {
			return AbstractUserComparator.method5710(var0, var1, var2);
		} else if (var0 < 3000) {
			return MouseHandler.method726(var0, var1, var2);
		} else if (var0 < 3200) {
			return FaceNormal.method3630(var0, var1, var2);
		} else if (var0 < 3300) {
			return Tile.method3358(var0, var1, var2);
		} else if (var0 < 3400) {
			return SpriteMask.method4173(var0, var1, var2);
		} else if (var0 < 3500) {
			return class0.method10(var0, var1, var2);
		} else if (var0 < 3700) {
			return class263.method4666(var0, var1, var2);
		} else if (var0 < 3800) {
			return method4235(var0, var1, var2);
		} else if (var0 < 3900) {
			return Script.method1998(var0, var1, var2);
		} else if (var0 < 4000) {
			return PacketBuffer.method6559(var0, var1, var2);
		} else if (var0 < 4100) {
			return class82.method1922(var0, var1, var2);
		} else if (var0 < 4200) {
			return class9.method120(var0, var1, var2);
		} else if (var0 < 4300) {
			return class239.method4385(var0, var1, var2);
		} else if (var0 < 5100) {
			return class19.method285(var0, var1, var2);
		} else if (var0 < 5400) {
			return GrandExchangeOfferOwnWorldComparator.method1217(var0, var1, var2);
		} else if (var0 < 5600) {
			return class25.method350(var0, var1, var2);
		} else if (var0 < 5700) {
			return class6.method96(var0, var1, var2);
		} else if (var0 < 6300) {
			return PcmPlayer.method837(var0, var1, var2);
		} else if (var0 < 6600) {
			return class9.method122(var0, var1, var2);
		} else if (var0 < 6700) {
			return class227.method4327(var0, var1, var2);
		} else if (var0 < 6800) {
			return GrandExchangeOfferOwnWorldComparator.method1216(var0, var1, var2);
		} else if (var0 < 6900) {
			return class9.method121(var0, var1, var2);
		} else if (var0 < 7000) {
			return VarcInt.method4941(var0, var1, var2);
		} else if (var0 < 7100) {
			return class12.method209(var0, var1, var2);
		} else if (var0 < 7200) {
			return VarpDefinition.method4898(var0, var1, var2);
		} else {
			return var0 < 7300 ? SpotAnimationDefinition.method5048(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "272018600"
	)
	public static boolean method4239(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lal;B)V",
		garbageValue = "0"
	)
	static void method4238(GameEngine var0) {
		while (class231.isKeyDown()) {
			if (class19.field146 == 13) {
				Login.worldSelectOpen = false;
				Client.leftTitleSprite.drawAt(Login.xPadding, 0);
				ArchiveDiskActionHandler.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				class125.logoSprite.drawAt(Login.xPadding + 382 - class125.logoSprite.subWidth / 2, 18);
				return;
			}

			if (class19.field146 == 96) {
				if (Login.worldSelectPage > 0 && World.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (class19.field146 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && Interpreter.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var1 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				UserComparator4.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				UserComparator4.changeWorldSelectSorting(0, 1);
				return;
			}

			int var2 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				UserComparator4.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				UserComparator4.changeWorldSelectSorting(1, 1);
				return;
			}

			int var3 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				UserComparator4.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				UserComparator4.changeWorldSelectSorting(2, 1);
				return;
			}

			int var4 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				UserComparator4.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				UserComparator4.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				Login.worldSelectOpen = false;
				Client.leftTitleSprite.drawAt(Login.xPadding, 0);
				ArchiveDiskActionHandler.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				class125.logoSprite.drawAt(Login.xPadding + 382 - class125.logoSprite.subWidth / 2, 18);
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var5 = class9.World_worlds[Login.hoveredWorldIndex];
				class148.changeWorld(var5);
				Login.worldSelectOpen = false;
				Client.leftTitleSprite.drawAt(Login.xPadding, 0);
				ArchiveDiskActionHandler.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
				class125.logoSprite.drawAt(Login.xPadding + 382 - class125.logoSprite.subWidth / 2, 18);
				return;
			}

			if (Login.worldSelectPage > 0 && World.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= World.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && Interpreter.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= InterfaceParent.canvasWidth - Interpreter.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= InterfaceParent.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "-1972284946"
	)
	static int method4235(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++class16.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--class16.Interpreter_intStackSize;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		}
	}
}
