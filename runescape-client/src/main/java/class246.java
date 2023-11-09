import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class246 {
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1717042974"
	)
	static void method5251(int var0) {
		if (var0 != Client.gameState) { // L: 1473
			if (Client.gameState == 30) { // L: 1474
				Client.field752.method4097(); // L: 1475
			}

			if (Client.gameState == 0) { // L: 1477
				Decimator.client.method632();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1478
				ModeWhere.method6787(0); // L: 1479
				Client.field532 = 0; // L: 1480
				Client.field533 = 0; // L: 1481
				Client.timer.method7393(var0); // L: 1482
				if (var0 != 20) { // L: 1483
					class373.method7183(false);
				}
			}

			if (var0 != 20 && var0 != 40 && WorldMapLabelSize.field2818 != null) { // L: 1485 1486
				WorldMapLabelSize.field2818.close(); // L: 1487
				WorldMapLabelSize.field2818 = null; // L: 1488
			}

			if (Client.gameState == 25) { // L: 1491
				Client.field744 = 0; // L: 1492
				Client.field565 = 0; // L: 1493
				Client.field566 = 1; // L: 1494
				Client.field567 = 0; // L: 1495
				Client.field568 = 1; // L: 1496
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1498
				if (var0 == 20) { // L: 1502
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1503
					class129.method3086(ApproximateRouteStrategy.field490, WorldMapEvent.archive8, false, var1); // L: 1504
				} else if (var0 == 11) { // L: 1506
					class129.method3086(ApproximateRouteStrategy.field490, WorldMapEvent.archive8, false, 4); // L: 1507
				} else if (var0 == 50) { // L: 1509
					class70.setLoginResponseString("", "Updating date of birth...", ""); // L: 1510
					class129.method3086(ApproximateRouteStrategy.field490, WorldMapEvent.archive8, false, 7); // L: 1511
				} else if (Login.clearLoginScreen) { // L: 1514
					class147.titleboxSprite = null; // L: 1515
					Login.titlebuttonSprite = null; // L: 1516
					Login.runesSprite = null; // L: 1517
					Login.leftTitleSprite = null; // L: 1518
					class275.rightTitleSprite = null; // L: 1519
					class33.logoSprite = null; // L: 1520
					Login.title_muteSprite = null; // L: 1521
					Login.field932 = null; // L: 1522
					Login.field910 = null; // L: 1523
					class491.worldSelectBackSprites = null; // L: 1524
					class307.worldSelectFlagSprites = null; // L: 1525
					class391.worldSelectArrows = null; // L: 1526
					class25.worldSelectStars = null; // L: 1527
					Login.field935 = null; // L: 1528
					class305.loginScreenRunesAnimation.method2464(); // L: 1529
					KeyHandler.method430(2); // L: 1530
					if (NetCache.NetCache_socket != null) { // L: 1532
						try {
							Buffer var3 = new Buffer(4); // L: 1534
							var3.writeByte(2); // L: 1535
							var3.writeMedium(0); // L: 1536
							NetCache.NetCache_socket.write(var3.array, 0, 4); // L: 1537
						} catch (IOException var5) {
							try {
								NetCache.NetCache_socket.close(); // L: 1541
							} catch (Exception var4) { // L: 1543
							}

							++NetCache.NetCache_ioExceptions; // L: 1544
							NetCache.NetCache_socket = null; // L: 1545
						}
					}

					Login.clearLoginScreen = false; // L: 1548
				}
			} else {
				var1 = ClanSettings.method3293() ? 0 : 12; // L: 1499
				class129.method3086(ApproximateRouteStrategy.field490, WorldMapEvent.archive8, true, var1); // L: 1500
			}

			Client.gameState = var0; // L: 1550
		}
	} // L: 1551
}
