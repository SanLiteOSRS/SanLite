import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -512679661
	)
	static int field1428;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1004408775
	)
	static int field1432;
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	static SpritePixels[] field1434;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 1252033691
	)
	static int field1430;
	@ObfuscatedName("at")
	final URL field1429;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -404858941
	)
	volatile int field1427;
	@ObfuscatedName("ab")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1428 = -1; // L: 134
		field1432 = -2; // L: 135
	}

	UrlRequest(URL var1) {
		this.field1427 = field1428; // L: 136
		this.field1429 = var1; // L: 140
	} // L: 141

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "143275860"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1427 != field1428; // L: 144
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "1"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0; // L: 148
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1515971347"
	)
	public String method2928() {
		return this.field1429.toString(); // L: 152
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpf;Lpf;Lpf;I)V",
		garbageValue = "-1245628340"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (Language.canvasWidth - 765) / 2; // L: 1565
		Login.loginBoxX = Login.xPadding + 202; // L: 1566
		class157.loginBoxCenter = Login.loginBoxX + 180; // L: 1567
		if (Login.worldSelectOpen) { // L: 1568
			ParamComposition.method3830(var0, var1); // L: 1569
		} else {
			class250.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1572
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1573
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1574
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1575
				byte var3 = 20; // L: 1576
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1577
				var4 = 253 - var3; // L: 1578
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1579
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1580
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1581
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1582
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1583
			}

			String var5;
			String var6;
			String var7;
			short var23;
			int var24;
			short var25;
			if (Client.gameState == 20) { // L: 1585
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1586
				var23 = 201; // L: 1587
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1588
				var24 = var23 + 15; // L: 1589
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1590
				var24 += 15; // L: 1591
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1592
				var24 += 15; // L: 1593
				var24 += 7; // L: 1594
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1595
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var24, 16777215, 0); // L: 1596
					var25 = 200; // L: 1597
					var5 = WorldMapIcon_1.clientPreferences.method2543() ? MusicPatch.method6201(Login.Login_username) : Login.Login_username; // L: 1600

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) { // L: 1602 1603 1604
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var24, 16777215, 0); // L: 1606
					var24 += 15; // L: 1607

					for (var7 = MusicPatch.method6201(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) { // L: 1608 1609 1610
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var24, 16777215, 0); // L: 1612
					var24 += 15; // L: 1613
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1616
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1617
				short var18;
				if (Login.loginIndex == 0) { // L: 1618
					var23 = 251; // L: 1619
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1620
					var24 = var23 + 30; // L: 1621
					var4 = Login.loginBoxX + 180 - 80; // L: 1622
					var18 = 291; // L: 1623
					Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1624
					var0.drawLines("New User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1625
					var4 = Login.loginBoxX + 180 + 80; // L: 1626
					Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1627
					var0.drawLines("Existing User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1628
				} else if (Login.loginIndex == 1) { // L: 1630
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1631
					var23 = 236; // L: 1632
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1633
					var24 = var23 + 15; // L: 1634
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1635
					var24 += 15; // L: 1636
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1637
					var24 += 15; // L: 1638
					var4 = Login.loginBoxX + 180 - 80; // L: 1639
					var18 = 321; // L: 1640
					Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1641
					var0.drawCentered("Continue", var4, var18 + 5, 16777215, 0); // L: 1642
					var4 = Login.loginBoxX + 180 + 80; // L: 1643
					Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1644
					var0.drawCentered("Cancel", var4, var18 + 5, 16777215, 0); // L: 1645
				} else if (Login.loginIndex == 2) { // L: 1647
					var23 = 201; // L: 1648
					var0.drawCentered(Login.Login_response1, class157.loginBoxCenter, var23, 16776960, 0); // L: 1649
					var24 = var23 + 15; // L: 1650
					var0.drawCentered(Login.Login_response2, class157.loginBoxCenter, var24, 16776960, 0); // L: 1651
					var24 += 15; // L: 1652
					var0.drawCentered(Login.Login_response3, class157.loginBoxCenter, var24, 16776960, 0); // L: 1653
					var24 += 15; // L: 1654
					var24 += 7; // L: 1655
					var0.draw("Login: ", class157.loginBoxCenter - 110, var24, 16777215, 0); // L: 1656
					var25 = 200; // L: 1657
					var5 = WorldMapIcon_1.clientPreferences.method2543() ? MusicPatch.method6201(Login.Login_username) : Login.Login_username; // L: 1660

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) { // L: 1662 1663 1664
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class167.colorStartTag(16776960) + "|" : ""), class157.loginBoxCenter - 70, var24, 16777215, 0); // L: 1666
					var24 += 15; // L: 1667

					for (var7 = MusicPatch.method6201(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) { // L: 1668 1669 1670
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class167.colorStartTag(16776960) + "|" : ""), class157.loginBoxCenter - 108, var24, 16777215, 0); // L: 1672
					var24 += 15; // L: 1673
					var23 = 277; // L: 1674
					int var8 = class157.loginBoxCenter + -117; // L: 1675
					boolean var10 = Client.Login_isUsernameRemembered; // L: 1677
					boolean var11 = Login.field916; // L: 1678
					IndexedSprite var9 = var10 ? (var11 ? GrandExchangeEvents.field4344 : FriendsList.field4665) : (var11 ? Login.field902 : class310.field3386); // L: 1680
					var9.drawAt(var8, var23); // L: 1683
					var8 = var8 + var9.subWidth + 5; // L: 1684
					var1.draw("Remember username", var8, var23 + 13, 16776960, 0); // L: 1685
					var8 = class157.loginBoxCenter + 24; // L: 1686
					boolean var14 = WorldMapIcon_1.clientPreferences.method2543(); // L: 1688
					boolean var15 = Login.field919; // L: 1689
					IndexedSprite var13 = var14 ? (var15 ? GrandExchangeEvents.field4344 : FriendsList.field4665) : (var15 ? Login.field902 : class310.field3386); // L: 1691
					var13.drawAt(var8, var23); // L: 1694
					var8 = var8 + var13.subWidth + 5; // L: 1695
					var1.draw("Hide username", var8, var23 + 13, 16776960, 0); // L: 1696
					var24 = var23 + 15; // L: 1697
					int var16 = class157.loginBoxCenter - 80; // L: 1698
					short var17 = 321; // L: 1699
					Login.field897.drawAt(var16 - 73, var17 - 20); // L: 1700
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0); // L: 1701
					var16 = class157.loginBoxCenter + 80; // L: 1702
					Login.field897.drawAt(var16 - 73, var17 - 20); // L: 1703
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0); // L: 1704
					var23 = 357; // L: 1705
					switch(Login.field931) { // L: 1706
					case 2:
						ModeWhere.field4426 = "Having trouble logging in?"; // L: 1708
						break;
					default:
						ModeWhere.field4426 = "Can't login? Click here."; // L: 1711
					}

					Login.field918 = new Bounds(class157.loginBoxCenter, var23, var1.stringWidth(ModeWhere.field4426), 11); // L: 1714
					class7.field21 = new Bounds(class157.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1715
					var1.drawCentered(ModeWhere.field4426, class157.loginBoxCenter, var23, 16777215, 0); // L: 1716
				} else if (Login.loginIndex == 3) { // L: 1718
					var23 = 201; // L: 1719
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1720
					var24 = var23 + 20; // L: 1721
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1722
					var24 += 20; // L: 1723
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1724
					var24 += 15; // L: 1725
					var4 = Login.loginBoxX + 180; // L: 1726
					var18 = 276; // L: 1727
					Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1728
					var2.drawCentered("Try again", var4, var18 + 5, 16777215, 0); // L: 1729
					var4 = Login.loginBoxX + 180; // L: 1730
					var18 = 326; // L: 1731
					Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1732
					var2.drawCentered("Forgotten password?", var4, var18 + 5, 16777215, 0); // L: 1733
				} else {
					int var20;
					short var27;
					int var28;
					if (Login.loginIndex == 4) { // L: 1735
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1736
						var23 = 236; // L: 1737
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1738
						var24 = var23 + 15; // L: 1739
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1740
						var24 += 15; // L: 1741
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1742
						var24 += 15; // L: 1743
						var0.draw("PIN: " + MusicPatch.method6201(class187.otp) + (Client.cycle % 40 < 20 ? class167.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var24, 16777215, 0); // L: 1744
						var24 -= 8; // L: 1745
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var24, 16776960, 0); // L: 1746
						var24 += 15; // L: 1747
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var24, 16776960, 0); // L: 1748
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1749
						var28 = var24 - var0.ascent; // L: 1750
						IndexedSprite var26;
						if (Login.field920) { // L: 1752
							var26 = FriendsList.field4665; // L: 1753
						} else {
							var26 = class310.field3386; // L: 1756
						}

						var26.drawAt(var4, var28); // L: 1758
						var24 += 15; // L: 1759
						var20 = Login.loginBoxX + 180 - 80; // L: 1760
						var27 = 321; // L: 1761
						Login.field897.drawAt(var20 - 73, var27 - 20); // L: 1762
						var0.drawCentered("Continue", var20, var27 + 5, 16777215, 0); // L: 1763
						var20 = Login.loginBoxX + 180 + 80; // L: 1764
						Login.field897.drawAt(var20 - 73, var27 - 20); // L: 1765
						var0.drawCentered("Cancel", var20, var27 + 5, 16777215, 0); // L: 1766
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var27 + 36, 16777215, 0); // L: 1767
					} else if (Login.loginIndex == 5) { // L: 1769
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1770
						var23 = 221; // L: 1771
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1772
						var24 = var23 + 15; // L: 1773
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1774
						var24 += 15; // L: 1775
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1776
						var24 += 15; // L: 1777
						var24 += 14; // L: 1778
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var24, 16777215, 0); // L: 1779
						var25 = 174; // L: 1780
						var5 = WorldMapIcon_1.clientPreferences.method2543() ? MusicPatch.method6201(Login.Login_username) : Login.Login_username; // L: 1783

						for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) { // L: 1785 1786 1787
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? class167.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var24, 16777215, 0); // L: 1789
						var24 += 15; // L: 1790
						var20 = Login.loginBoxX + 180 - 80; // L: 1791
						var27 = 321; // L: 1792
						Login.field897.drawAt(var20 - 73, var27 - 20); // L: 1793
						var0.drawCentered("Recover", var20, var27 + 5, 16777215, 0); // L: 1794
						var20 = Login.loginBoxX + 180 + 80; // L: 1795
						Login.field897.drawAt(var20 - 73, var27 - 20); // L: 1796
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0); // L: 1797
						var27 = 356; // L: 1798
						var1.drawCentered("Still having trouble logging in?", class157.loginBoxCenter, var27, 268435455, 0); // L: 1799
					} else if (Login.loginIndex == 6) { // L: 1801
						var23 = 201; // L: 1802
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1803
						var24 = var23 + 15; // L: 1804
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1805
						var24 += 15; // L: 1806
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1807
						var24 += 15; // L: 1808
						var4 = Login.loginBoxX + 180; // L: 1809
						var18 = 321; // L: 1810
						Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1811
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 1812
					} else if (Login.loginIndex == 7) { // L: 1814
						if (PendingSpawn.field1169 && !Client.onMobile) { // L: 1815
							var23 = 201; // L: 1816
							var0.drawCentered(Login.Login_response1, class157.loginBoxCenter, var23, 16776960, 0); // L: 1817
							var24 = var23 + 15; // L: 1818
							var0.drawCentered(Login.Login_response2, class157.loginBoxCenter, var24, 16776960, 0); // L: 1819
							var24 += 15; // L: 1820
							var0.drawCentered(Login.Login_response3, class157.loginBoxCenter, var24, 16776960, 0); // L: 1821
							var4 = class157.loginBoxCenter - 150; // L: 1822
							var24 += 10; // L: 1823

							for (var28 = 0; var28 < 8; ++var28) { // L: 1824
								Login.field897.method9718(var4, var24, 30, 40); // L: 1825
								boolean var21 = var28 == Login.field915 & Client.cycle % 40 < 20; // L: 1826
								var0.draw((Login.field907[var28] == null ? "" : Login.field907[var28]) + (var21 ? class167.colorStartTag(16776960) + "|" : ""), var4 + 10, var24 + 27, 16777215, 0); // L: 1827
								if (var28 != 1 && var28 != 3) { // L: 1828
									var4 += 35; // L: 1833
								} else {
									var4 += 50; // L: 1829
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var24 + 27, 16777215, 0); // L: 1830
								}
							}

							var28 = class157.loginBoxCenter - 80; // L: 1836
							short var29 = 321; // L: 1837
							Login.field897.drawAt(var28 - 73, var29 - 20); // L: 1838
							var0.drawCentered("Submit", var28, var29 + 5, 16777215, 0); // L: 1839
							var28 = class157.loginBoxCenter + 80; // L: 1840
							Login.field897.drawAt(var28 - 73, var29 - 20); // L: 1841
							var0.drawCentered("Cancel", var28, var29 + 5, 16777215, 0); // L: 1842
						} else {
							var23 = 216; // L: 1845
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1846
							var24 = var23 + 15; // L: 1847
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1848
							var24 += 15; // L: 1849
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1850
							var24 += 15; // L: 1851
							var4 = Login.loginBoxX + 180 - 80; // L: 1852
							var18 = 321; // L: 1853
							Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1854
							var0.drawCentered("Set Date of Birth", var4, var18 + 5, 16777215, 0); // L: 1855
							var4 = Login.loginBoxX + 180 + 80; // L: 1856
							Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1857
							var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 1858
						}
					} else if (Login.loginIndex == 8) { // L: 1861
						var23 = 216; // L: 1862
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1863
						var24 = var23 + 15; // L: 1864
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1865
						var24 += 15; // L: 1866
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 1867
						var24 += 15; // L: 1868
						var4 = Login.loginBoxX + 180 - 80; // L: 1869
						var18 = 321; // L: 1870
						Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1871
						var0.drawCentered("Privacy Policy", var4, var18 + 5, 16777215, 0); // L: 1872
						var4 = Login.loginBoxX + 180 + 80; // L: 1873
						Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1874
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 1875
					} else if (Login.loginIndex == 9) { // L: 1877
						var23 = 221; // L: 1878
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1879
						var24 = var23 + 25; // L: 1880
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1881
						var24 += 25; // L: 1882
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1883
						var4 = Login.loginBoxX + 180; // L: 1884
						var18 = 311; // L: 1885
						Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1886
						var0.drawCentered("Try again", var4, var18 + 5, 16777215, 0); // L: 1887
					} else if (Login.loginIndex == 10) { // L: 1889
						var24 = Login.loginBoxX + 180; // L: 1890
						var25 = 209; // L: 1891
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0); // L: 1892
						var4 = var25 + 20; // L: 1893
						Login.field898.drawAt(var24 - 109, var4); // L: 1894
						if (Login.field917.isEmpty()) { // L: 1895
							class11.field47.drawAt(var24 - 48, var4 + 18); // L: 1896
						} else {
							class11.field47.drawAt(var24 - 48, var4 + 5); // L: 1899
							var0.drawCentered(Login.field917, var24, var4 + 68 - 15, 16776960, 0); // L: 1900
						}
					} else if (Login.loginIndex == 12) { // L: 1903
						var24 = class157.loginBoxCenter; // L: 1904
						var25 = 216; // L: 1905
						var2.drawCentered("Before using this app, please read and accept our", var24, var25, 16777215, 0); // L: 1906
						var4 = var25 + 17; // L: 1907
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var4, 16777215, 0); // L: 1908
						var4 += 17; // L: 1909
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var24, var4, 16777215, 0); // L: 1910
						var4 += 17; // L: 1911
						var2.drawCentered("By accepting, you agree to these documents.", var24, var4, 16777215, 0); // L: 1912
						var24 = class157.loginBoxCenter - 80; // L: 1913
						var25 = 311; // L: 1914
						Login.field897.drawAt(var24 - 73, var25 - 20); // L: 1915
						var0.drawCentered("Accept", var24, var25 + 5, 16777215, 0); // L: 1916
						var24 = class157.loginBoxCenter + 80; // L: 1917
						Login.field897.drawAt(var24 - 73, var25 - 20); // L: 1918
						var0.drawCentered("Decline", var24, var25 + 5, 16777215, 0); // L: 1919
					} else if (Login.loginIndex == 13) { // L: 1921
						var23 = 231; // L: 1922
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0); // L: 1923
						var24 = var23 + 20; // L: 1924
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var24, 16777215, 0); // L: 1925
						var4 = Login.loginBoxX + 180; // L: 1926
						var23 = 311; // L: 1927
						Login.field897.drawAt(var4 - 73, var23 - 20); // L: 1928
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1929
					} else if (Login.loginIndex == 14) { // L: 1931
						var23 = 201; // L: 1932
						String var19 = ""; // L: 1933
						var5 = ""; // L: 1934
						var6 = ""; // L: 1935
						switch(Login.field894) { // L: 1936
						case 0:
							var19 = "Your account has been involved"; // L: 1958
							var5 = "in serious rule breaking."; // L: 1959
							var6 = ""; // L: 1960
							break;
						case 1:
							var19 = "Your account has been locked due to"; // L: 1939
							var5 = "suspicious activity."; // L: 1940
							var6 = "Please recover your account."; // L: 1941
							break;
						case 2:
							var19 = "The unpaid balance on your account needs"; // L: 1951
							var5 = "to be resolved before you can play."; // L: 1952
							var6 = Strings.field4057; // L: 1953
							break; // L: 1954
						default:
							SoundSystem.Login_promptCredentials(false); // L: 1946
						}

						var0.drawCentered(var19, Login.loginBoxX + 180, var23, 16776960, 0); // L: 1964
						var24 = var23 + 20; // L: 1965
						var0.drawCentered(var5, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1966
						var24 += 20; // L: 1967
						var0.drawCentered(var6, Login.loginBoxX + 180, var24, 16776960, 0); // L: 1968
						var20 = Login.loginBoxX + 180; // L: 1969
						var27 = 276; // L: 1970
						Login.field897.drawAt(var20 - 73, var27 - 20); // L: 1971
						if (Login.field894 == 1) { // L: 1972
							var0.drawCentered("Recover Account", var20, var27 + 5, 16777215, 0); // L: 1973
						} else {
							var0.drawCentered("View Appeal Options", var20, var27 + 5, 16777215, 0); // L: 1976
						}

						var20 = Login.loginBoxX + 180; // L: 1978
						var27 = 326; // L: 1979
						Login.field897.drawAt(var20 - 73, var27 - 20); // L: 1980
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0); // L: 1981
					} else if (Login.loginIndex == 24) { // L: 1983
						var23 = 221; // L: 1984
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0); // L: 1985
						var24 = var23 + 15; // L: 1986
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1987
						var24 += 15; // L: 1988
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0); // L: 1989
						var24 += 15; // L: 1990
						var4 = Login.loginBoxX + 180; // L: 1991
						var18 = 301; // L: 1992
						Login.field897.drawAt(var4 - 73, var18 - 20); // L: 1993
						var0.drawCentered("Ok", var4, var18 + 5, 16777215, 0); // L: 1994
					} else if (Login.loginIndex == 32) { // L: 1996
						var23 = 216; // L: 1997
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0); // L: 1998
						var24 = var23 + 15; // L: 1999
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0); // L: 2000
						var24 += 15; // L: 2001
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0); // L: 2002
						var24 += 15; // L: 2003
						var4 = Login.loginBoxX + 180 - 80; // L: 2004
						var18 = 321; // L: 2005
						Login.field897.drawAt(var4 - 73, var18 - 20); // L: 2006
						var0.drawCentered("Set Date of Birth", var4, var18 + 5, 16777215, 0); // L: 2007
						var4 = Login.loginBoxX + 180 + 80; // L: 2008
						Login.field897.drawAt(var4 - 73, var18 - 20); // L: 2009
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 2010
					} else if (Login.loginIndex == 33) { // L: 2012
						var23 = 201; // L: 2013
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0); // L: 2014
						var24 = var23 + 20; // L: 2015
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0); // L: 2016
						var24 += 20; // L: 2017
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0); // L: 2018
						var24 += 15; // L: 2019
						var4 = Login.loginBoxX + 180; // L: 2020
						var18 = 276; // L: 2021
						Login.field897.drawAt(var4 - 73, var18 - 20); // L: 2022
						var2.drawCentered("Download Launcher", var4, var18 + 5, 16777215, 0); // L: 2023
						var4 = Login.loginBoxX + 180; // L: 2024
						var18 = 326; // L: 2025
						Login.field897.drawAt(var4 - 73, var18 - 20); // L: 2026
						var2.drawCentered("Back", var4, var18 + 5, 16777215, 0); // L: 2027
					}
				}
			}

			if (Client.gameState >= 10) { // L: 2030
				int[] var22 = new int[4]; // L: 2031
				Rasterizer2D.Rasterizer2D_getClipArray(var22); // L: 2032
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class47.canvasHeight); // L: 2033
				EnumComposition.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 2034
				EnumComposition.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 2035
				Rasterizer2D.Rasterizer2D_setClipArray(var22); // L: 2036
			}

			Login.title_muteSprite[WorldMapIcon_1.clientPreferences.method2631() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 2038
			if (Client.gameState > 5 && class85.clientLanguage == Language.Language_EN) { // L: 2039
				if (class416.field4547 != null) { // L: 2040
					var24 = Login.xPadding + 5; // L: 2041
					var25 = 463; // L: 2042
					byte var31 = 100; // L: 2043
					byte var30 = 35; // L: 2044
					class416.field4547.drawAt(var24, var25); // L: 2045
					var0.drawCentered("World" + " " + Client.worldId, var31 / 2 + var24, var30 / 2 + var25 - 2, 16777215, 0); // L: 2046
					if (class542.World_request != null) { // L: 2047
						var1.drawCentered("Loading...", var31 / 2 + var24, var30 / 2 + var25 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var31 / 2 + var24, var30 / 2 + var25 + 12, 16777215, 0); // L: 2048
					}
				} else {
					class416.field4547 = class313.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.field481, "sl_button", ""); // L: 2051
				}
			}

		}
	} // L: 1570 2054

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-1"
	)
	static final void method2922(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 11100
		int var7 = var3 - var1; // L: 11101
		int var8 = var6 >= 0 ? var6 : -var6; // L: 11102
		int var9 = var7 >= 0 ? var7 : -var7; // L: 11103
		int var10 = var8; // L: 11104
		if (var8 < var9) { // L: 11105
			var10 = var9;
		}

		if (var10 != 0) { // L: 11106
			int var11 = (var6 << 16) / var10; // L: 11107
			int var12 = (var7 << 16) / var10; // L: 11108
			if (var12 <= var11) { // L: 11109
				var11 = -var11;
			} else {
				var12 = -var12; // L: 11110
			}

			int var13 = var5 * var12 >> 17; // L: 11111
			int var14 = var5 * var12 + 1 >> 17; // L: 11112
			int var15 = var5 * var11 >> 17; // L: 11113
			int var16 = var5 * var11 + 1 >> 17; // L: 11114
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 11115
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 11116
			int var17 = var0 + var13; // L: 11117
			int var18 = var0 - var14; // L: 11118
			int var19 = var0 + var6 - var14; // L: 11119
			int var20 = var0 + var6 + var13; // L: 11120
			int var21 = var15 + var1; // L: 11121
			int var22 = var1 - var16; // L: 11122
			int var23 = var7 + var1 - var16; // L: 11123
			int var24 = var7 + var15 + var1; // L: 11124
			Rasterizer3D.method5207(var17, var18, var19); // L: 11125
			Rasterizer3D.method5209(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4); // L: 11126
			Rasterizer3D.method5207(var17, var19, var20); // L: 11127
			Rasterizer3D.method5209(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4); // L: 11128
		}
	} // L: 11129

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "([Lnn;IIIZB)V",
		garbageValue = "2"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 11200
			Widget var6 = var0[var5]; // L: 11201
			if (var6 != null && var6.parentId == var1) { // L: 11202 11203
				Renderable.alignWidgetSize(var6, var2, var3, var4); // L: 11204
				JagexCache.alignWidgetPosition(var6, var2, var3); // L: 11205
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 11206
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 11207
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 11208
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 11209
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 11210
					class132.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 11212

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "99"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12823
		short[] var2 = new short[16]; // L: 12824
		int var3 = 0; // L: 12825

		for (int var4 = 0; var4 < ItemComposition.ItemComposition_fileCount; ++var4) { // L: 12826
			ItemComposition var9 = class214.ItemComposition_get(var4); // L: 12827
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12828 12829 12830
				if (var3 >= 250) { // L: 12831
					BuddyRankComparator.foundItemIdCount = -1; // L: 12832
					MusicPatchNode.foundItemIds = null; // L: 12833
					return; // L: 12834
				}

				if (var3 >= var2.length) { // L: 12836
					short[] var6 = new short[var2.length * 2]; // L: 12837

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12838
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12839
				}

				var2[var3++] = (short)var4; // L: 12841
			}
		}

		MusicPatchNode.foundItemIds = var2; // L: 12843
		ApproximateRouteStrategy.foundItemIndex = 0; // L: 12844
		BuddyRankComparator.foundItemIdCount = var3; // L: 12845
		String[] var8 = new String[BuddyRankComparator.foundItemIdCount]; // L: 12846

		for (int var5 = 0; var5 < BuddyRankComparator.foundItemIdCount; ++var5) { // L: 12847
			var8[var5] = class214.ItemComposition_get(var2[var5]).name;
		}

		class215.method4229(var8, MusicPatchNode.foundItemIds); // L: 12848
	} // L: 12849
}
