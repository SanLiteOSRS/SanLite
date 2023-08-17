import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("ParamComposition_cached")
	static EvictingDualNodeHashTable ParamComposition_cached;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -284568135
	)
	static int field2138;
	@ObfuscatedName("ao")
	@Export("type")
	char type;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -490553151
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ac")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ai")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamComposition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	ParamComposition() {
		this.autoDisable = true; // L: 16
	} // L: 18

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-990843992"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 35

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-59"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 39
			if (var2 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var2); // L: 41
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "-1461368185"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 46
			this.type = ViewportMouse.method4918(var1.readByte()); // L: 47
		} else if (var2 == 2) { // L: 49
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false; // L: 50
		} else if (var2 == 5) { // L: 51
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	} // L: 53

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-785538560"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's'; // L: 56
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	static void method3821() {
		int var28;
		if (Client.field558 == class92.field1169) { // L: 1513
			class130.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1514

			for (var28 = 0; var28 < 4; ++var28) { // L: 1515
				Client.collisionMaps[var28] = new CollisionMap(104, 104);
			}

			AbstractUserComparator.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1516
			Login.Login_loadingText = "Starting game engine..."; // L: 1517
			Login.Login_loadingPercent = 5; // L: 1518
			Client.field558 = class92.field1159; // L: 1519
		} else if (class92.field1159 == Client.field558) { // L: 1522
			Login.Login_loadingText = "Prepared visibility map"; // L: 1523
			Login.Login_loadingPercent = 10; // L: 1524
			Client.field558 = class92.field1168; // L: 1525
		} else if (class92.field1168 == Client.field558) { // L: 1528
			AttackOption.field1351 = class133.newArchive(0, false, true, true, false); // L: 1529
			class318.archive7 = class133.newArchive(1, false, true, true, false); // L: 1530
			class1.archive2 = class133.newArchive(2, true, false, true, false); // L: 1531
			ObjectSound.archive4 = class133.newArchive(3, false, true, true, false); // L: 1532
			KeyHandler.archive9 = class133.newArchive(4, false, true, true, false); // L: 1533
			class499.archive6 = class133.newArchive(5, true, true, true, false); // L: 1534
			class385.archive11 = class133.newArchive(6, true, true, true, false); // L: 1535
			Message.archive8 = class133.newArchive(7, false, true, true, false); // L: 1536
			PcmPlayer.field304 = class133.newArchive(8, false, true, true, false); // L: 1537
			class147.archive10 = class133.newArchive(9, false, true, true, false); // L: 1538
			class141.field1665 = class133.newArchive(10, false, true, true, false); // L: 1539
			class388.field4435 = class133.newArchive(11, false, true, true, false); // L: 1540
			GrandExchangeOffer.archive12 = class133.newArchive(12, false, true, true, false); // L: 1541
			Player.archive13 = class133.newArchive(13, true, false, true, false); // L: 1542
			class106.field1371 = class133.newArchive(14, false, true, true, false); // L: 1543
			Tiles.field1038 = class133.newArchive(15, false, true, true, false); // L: 1544
			class10.field46 = class133.newArchive(17, true, true, true, false); // L: 1545
			WorldMapElement.field1964 = class133.newArchive(18, false, true, true, false); // L: 1546
			ClanChannelMember.field1676 = class133.newArchive(19, false, true, true, false); // L: 1547
			class227.field2545 = class133.newArchive(20, false, true, true, false); // L: 1548
			class343.field3869 = class133.newArchive(21, false, true, true, true); // L: 1549
			Login.Login_loadingText = "Connecting to update server"; // L: 1550
			Login.Login_loadingPercent = 20; // L: 1551
			Client.field558 = class92.field1161; // L: 1552
		} else if (class92.field1161 == Client.field558) { // L: 1555
			byte var50 = 0; // L: 1556
			var28 = var50 + AttackOption.field1351.percentage() * 4 / 100; // L: 1557
			var28 += class318.archive7.percentage() * 4 / 100; // L: 1558
			var28 += class1.archive2.percentage() * 2 / 100; // L: 1559
			var28 += ObjectSound.archive4.percentage() * 2 / 100; // L: 1560
			var28 += KeyHandler.archive9.percentage() * 6 / 100; // L: 1561
			var28 += class499.archive6.percentage() * 4 / 100; // L: 1562
			var28 += class385.archive11.percentage() * 2 / 100; // L: 1563
			var28 += Message.archive8.percentage() * 55 / 100; // L: 1564
			var28 += PcmPlayer.field304.percentage() * 2 / 100; // L: 1565
			var28 += class147.archive10.percentage() * 2 / 100; // L: 1566
			var28 += class141.field1665.percentage() * 2 / 100; // L: 1567
			var28 += class388.field4435.percentage() * 2 / 100; // L: 1568
			var28 += GrandExchangeOffer.archive12.percentage() * 2 / 100; // L: 1569
			var28 += Player.archive13.percentage() * 2 / 100; // L: 1570
			var28 += class106.field1371.percentage() * 2 / 100; // L: 1571
			var28 += Tiles.field1038.percentage() * 2 / 100; // L: 1572
			var28 += ClanChannelMember.field1676.percentage() / 100; // L: 1573
			var28 += WorldMapElement.field1964.percentage() / 100; // L: 1574
			var28 += class227.field2545.percentage() / 100; // L: 1575
			var28 += class343.field3869.percentage() / 100; // L: 1576
			var28 += class10.field46.method6676() && class10.field46.isFullyLoaded() ? 1 : 0; // L: 1577
			if (var28 != 100) { // L: 1578
				if (var28 != 0) { // L: 1579
					Login.Login_loadingText = "Checking for updates - " + var28 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1580
			} else {
				class466.method8374(AttackOption.field1351, "Animations"); // L: 1583
				class466.method8374(class318.archive7, "Skeletons"); // L: 1584
				class466.method8374(KeyHandler.archive9, "Sound FX"); // L: 1585
				class466.method8374(class499.archive6, "Maps"); // L: 1586
				class466.method8374(class385.archive11, "Music Tracks"); // L: 1587
				class466.method8374(Message.archive8, "Models"); // L: 1588
				class466.method8374(PcmPlayer.field304, "Sprites"); // L: 1589
				class466.method8374(class388.field4435, "Music Jingles"); // L: 1590
				class466.method8374(class106.field1371, "Music Samples"); // L: 1591
				class466.method8374(Tiles.field1038, "Music Patches"); // L: 1592
				class466.method8374(ClanChannelMember.field1676, "World Map"); // L: 1593
				class466.method8374(WorldMapElement.field1964, "World Map Geography"); // L: 1594
				class466.method8374(class227.field2545, "World Map Ground"); // L: 1595
				class387.field4432 = new GraphicsDefaults(); // L: 1596
				class387.field4432.decode(class10.field46); // L: 1597
				Login.Login_loadingText = "Loaded update list"; // L: 1598
				Login.Login_loadingPercent = 30; // L: 1599
				Client.field558 = class92.field1162; // L: 1600
			}
		} else {
			int var2;
			Archive var30;
			Archive var31;
			if (class92.field1162 == Client.field558) { // L: 1603
				class504.method8936(22050, !Client.isLowDetail, 2); // L: 1604
				ArrayList var40 = new ArrayList(3); // L: 1605
				class399.pcmPlayer0 = TileItem.method2684(GameEngine.taskHandler, 0, 2048); // L: 1606
				class162.pcmStreamMixer = new PcmStreamMixer(); // L: 1607
				PcmStreamMixer var45 = new PcmStreamMixer(); // L: 1608
				var45.addSubStream(class162.pcmStreamMixer); // L: 1609

				for (var2 = 0; var2 < 3; ++var2) { // L: 1610
					MidiPcmStream var48 = new MidiPcmStream(); // L: 1611
					var48.method5811(9, 128); // L: 1612
					var45.addSubStream(var48); // L: 1613
					var40.add(var48); // L: 1614
				}

				class399.pcmPlayer0.setStream(var45); // L: 1616
				var30 = Tiles.field1038; // L: 1617
				var31 = class106.field1371; // L: 1618
				Archive var49 = KeyHandler.archive9; // L: 1619
				class305.field3399 = var30; // L: 1621
				class305.field3400 = var31; // L: 1622
				class305.field3403 = var49; // L: 1623
				class305.field3402 = var40; // L: 1624
				class330.decimator = new Decimator(22050, PcmPlayer.field293); // L: 1626
				Login.Login_loadingText = "Prepared sound engine"; // L: 1627
				Login.Login_loadingPercent = 35; // L: 1628
				Client.field558 = class92.field1166; // L: 1629
				PacketBufferNode.field3230 = new Fonts(PcmPlayer.field304, Player.archive13); // L: 1630
			} else {
				int var1;
				if (Client.field558 == class92.field1166) { // L: 1633
					FontName[] var39 = new FontName[]{FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_plain12}; // L: 1636
					var1 = var39.length; // L: 1638
					Fonts var46 = PacketBufferNode.field3230; // L: 1639
					FontName[] var47 = new FontName[]{FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_plain12}; // L: 1642
					Client.field595 = var46.createMap(var47); // L: 1644
					if (Client.field595.size() < var1) { // L: 1645
						Login.Login_loadingText = "Loading fonts - " + Client.field595.size() * 100 / var1 + "%"; // L: 1646
						Login.Login_loadingPercent = 40; // L: 1647
					} else {
						HealthBarUpdate.field1278 = (Font)Client.field595.get(FontName.FontName_plain11); // L: 1650
						SecureRandomCallable.fontPlain12 = (Font)Client.field595.get(FontName.FontName_plain12); // L: 1651
						class59.fontBold12 = (Font)Client.field595.get(FontName.FontName_bold12); // L: 1652
						class18.field92 = Client.field671.get(); // L: 1653
						Login.Login_loadingText = "Loaded fonts"; // L: 1654
						Login.Login_loadingPercent = 40; // L: 1655
						Client.field558 = class92.field1164; // L: 1656
					}
				} else {
					int var3;
					Archive var5;
					Archive var29;
					if (Client.field558 == class92.field1164) { // L: 1659
						var29 = class141.field1665; // L: 1661
						var30 = PcmPlayer.field304; // L: 1662
						var3 = 0; // L: 1664
						String[] var33 = Login.field946; // L: 1666

						int var34;
						String var42;
						for (var34 = 0; var34 < var33.length; ++var34) { // L: 1667
							var42 = var33[var34]; // L: 1668
							if (var29.tryLoadFileByNames(var42, "")) { // L: 1670
								++var3; // L: 1671
							}
						}

						var33 = Login.field967; // L: 1677

						for (var34 = 0; var34 < var33.length; ++var34) { // L: 1678
							var42 = var33[var34]; // L: 1679
							if (var30.tryLoadFileByNames(var42, "")) { // L: 1681
								++var3; // L: 1682
							}
						}

						var33 = Login.field971; // L: 1688

						for (var34 = 0; var34 < var33.length; ++var34) { // L: 1689
							var42 = var33[var34]; // L: 1690
							if (var30.getGroupId(var42) != -1 && var30.tryLoadFileByNames(var42, "")) { // L: 1692
								++var3; // L: 1693
							}
						}

						var5 = PcmPlayer.field304; // L: 1702
						int var35 = Login.field946.length + Login.field967.length; // L: 1704
						String[] var43 = Login.field971; // L: 1706

						for (int var36 = 0; var36 < var43.length; ++var36) { // L: 1707
							String var44 = var43[var36]; // L: 1708
							if (var5.getGroupId(var44) != -1) { // L: 1710
								++var35; // L: 1711
							}
						}

						if (var3 < var35) { // L: 1719
							Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var35 + "%"; // L: 1720
							Login.Login_loadingPercent = 50; // L: 1721
						} else {
							Login.Login_loadingText = "Loaded title screen"; // L: 1724
							Login.Login_loadingPercent = 50; // L: 1725
							class317.method6014(5); // L: 1726
							Client.field558 = class92.field1165; // L: 1727
						}
					} else if (class92.field1165 == Client.field558) { // L: 1730
						if (!class1.archive2.isFullyLoaded()) { // L: 1731
							Login.Login_loadingText = "Loading config - " + class1.archive2.loadPercent() + "%"; // L: 1732
							Login.Login_loadingPercent = 60; // L: 1733
						} else if (!class343.field3869.isFullyLoaded()) { // L: 1736
							Login.Login_loadingText = "Loading config - " + (80 + GrandExchangeOffer.archive12.loadPercent() / 6) + "%"; // L: 1737
							Login.Login_loadingPercent = 60; // L: 1738
						} else {
							class326.method6058(class1.archive2); // L: 1741
							SecureRandomFuture.method2163(class1.archive2); // L: 1742
							Archive var38 = class1.archive2; // L: 1743
							var29 = Message.archive8; // L: 1744
							KitDefinition.KitDefinition_archive = var38; // L: 1746
							KitDefinition.KitDefinition_modelsArchive = var29; // L: 1747
							KitDefinition.field1980 = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1748
							var30 = class1.archive2; // L: 1750
							var31 = Message.archive8; // L: 1751
							boolean var41 = Client.isLowDetail; // L: 1752
							ObjectComposition.ObjectDefinition_archive = var30; // L: 1754
							ObjectComposition.ObjectDefinition_modelsArchive = var31; // L: 1755
							ObjectComposition.ObjectDefinition_isLowDetail = var41; // L: 1756
							var5 = class1.archive2; // L: 1758
							Archive var6 = Message.archive8; // L: 1759
							NPCComposition.NpcDefinition_archive = var5; // L: 1761
							NPCComposition.field2032 = var6; // L: 1762
							Archive var7 = class1.archive2; // L: 1764
							StructComposition.StructDefinition_archive = var7; // L: 1766
							Archive var8 = class1.archive2; // L: 1768
							Archive var9 = Message.archive8; // L: 1769
							boolean var10 = Client.isMembersWorld; // L: 1770
							Font var11 = HealthBarUpdate.field1278; // L: 1771
							class384.ItemComposition_archive = var8; // L: 1773
							ItemComposition.ItemComposition_modelArchive = var9; // L: 1774
							ItemComposition.ItemComposition_inMembersWorld = var10; // L: 1775
							HealthBar.ItemComposition_fileCount = class384.ItemComposition_archive.getGroupFileCount(10); // L: 1776
							class452.field4759 = var11; // L: 1777
							class227.method4479(class1.archive2, AttackOption.field1351, class318.archive7); // L: 1779
							Archive var12 = class1.archive2; // L: 1780
							Archive var13 = Message.archive8; // L: 1781
							SpotAnimationDefinition.SpotAnimationDefinition_archive = var12; // L: 1783
							SpotAnimationDefinition.field2096 = var13; // L: 1784
							ServerPacket.method5708(class1.archive2); // L: 1786
							FileSystem.method3488(class1.archive2); // L: 1787
							Archive var14 = ObjectSound.archive4; // L: 1788
							Archive var15 = Message.archive8; // L: 1789
							Archive var16 = PcmPlayer.field304; // L: 1790
							Archive var17 = Player.archive13; // L: 1791
							int var18 = 0; // L: 1793
							if (var14 != null) { // L: 1794
								Decimator.Widget_archive = var14; // L: 1795
								class47.field352 = var15; // L: 1796
								Language.Widget_spritesArchive = var16; // L: 1797
								class155.Widget_fontsArchive = var17; // L: 1798
								var18 = Decimator.Widget_archive.getGroupCount(); // L: 1799
							}

							PacketBufferNode.Widget_interfaceComponents = new Widget[var18][]; // L: 1801
							class316.Widget_loadedInterfaces = new boolean[var18]; // L: 1802
							ModeWhere.method6955(class1.archive2); // L: 1804
							Archive var32 = class1.archive2; // L: 1805
							EnumComposition.EnumDefinition_archive = var32; // L: 1807
							Archive var19 = class1.archive2; // L: 1809
							VarcInt.VarcInt_archive = var19; // L: 1811
							Archive var20 = class1.archive2; // L: 1813
							class139.method3083(class1.archive2); // L: 1815
							BufferedSource.method8066(class1.archive2); // L: 1816
							ModelData0.method5022(class1.archive2); // L: 1817
							class47.HitSplatDefinition_cachedSprites = new class497(WorldMapSectionType.field2997, 54, ClanChannelMember.clientLanguage, class1.archive2); // L: 1818
							class400.Ignored_cached = new class497(WorldMapSectionType.field2997, 47, ClanChannelMember.clientLanguage, class1.archive2); // L: 1819
							class25.varcs = new Varcs(); // L: 1820
							Archive var21 = class1.archive2; // L: 1821
							Archive var22 = PcmPlayer.field304; // L: 1822
							Archive var23 = Player.archive13; // L: 1823
							HitSplatDefinition.HitSplatDefinition_archive = var21; // L: 1825
							HitSplatDefinition.field2146 = var22; // L: 1826
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var23; // L: 1827
							class152.method3168(class1.archive2, PcmPlayer.field304); // L: 1829
							Archive var24 = class1.archive2; // L: 1830
							Archive var25 = PcmPlayer.field304; // L: 1831
							WorldMapElement.WorldMapElement_archive = var25; // L: 1833
							if (var24.isFullyLoaded()) { // L: 1834
								WorldMapElement.WorldMapElement_count = var24.getGroupFileCount(35); // L: 1837
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 1838

								for (int var26 = 0; var26 < WorldMapElement.WorldMapElement_count; ++var26) { // L: 1839
									byte[] var27 = var24.takeFile(35, var26); // L: 1840
									WorldMapElement.WorldMapElement_cached[var26] = new WorldMapElement(var26); // L: 1841
									if (var27 != null) { // L: 1842
										WorldMapElement.WorldMapElement_cached[var26].decode(new Buffer(var27)); // L: 1843
										WorldMapElement.WorldMapElement_cached[var26].method3580(); // L: 1844
									}
								}
							}

							Login.Login_loadingText = "Loaded config"; // L: 1848
							Login.Login_loadingPercent = 60; // L: 1849
							Client.field558 = class92.field1158; // L: 1850
						}
					} else if (Client.field558 == class92.field1158) { // L: 1853
						var28 = 0; // L: 1854
						if (Client.compass == null) { // L: 1855
							Client.compass = Tiles.SpriteBuffer_getSprite(PcmPlayer.field304, class387.field4432.field4715, 0);
						} else {
							++var28; // L: 1856
						}

						if (class167.redHintArrowSprite == null) { // L: 1857
							class167.redHintArrowSprite = Tiles.SpriteBuffer_getSprite(PcmPlayer.field304, class387.field4432.field4705, 0);
						} else {
							++var28; // L: 1858
						}

						if (class299.mapSceneSprites == null) { // L: 1859
							class299.mapSceneSprites = KeyHandler.method424(PcmPlayer.field304, class387.field4432.field4708, 0);
						} else {
							++var28; // L: 1860
						}

						if (class178.field1894 == null) { // L: 1861
							class178.field1894 = WorldMapArchiveLoader.method8495(PcmPlayer.field304, class387.field4432.field4707, 0);
						} else {
							++var28; // L: 1862
						}

						if (class502.field5029 == null) { // L: 1863
							class502.field5029 = WorldMapArchiveLoader.method8495(PcmPlayer.field304, class387.field4432.field4713, 0);
						} else {
							++var28; // L: 1864
						}

						if (ArchiveLoader.field1063 == null) { // L: 1865
							ArchiveLoader.field1063 = WorldMapArchiveLoader.method8495(PcmPlayer.field304, class387.field4432.field4704, 0);
						} else {
							++var28; // L: 1866
						}

						if (Message.field508 == null) { // L: 1867
							Message.field508 = WorldMapArchiveLoader.method8495(PcmPlayer.field304, class387.field4432.field4710, 0);
						} else {
							++var28; // L: 1868
						}

						if (class152.field1717 == null) { // L: 1869
							class152.field1717 = WorldMapArchiveLoader.method8495(PcmPlayer.field304, class387.field4432.field4711, 0);
						} else {
							++var28; // L: 1870
						}

						if (FloorOverlayDefinition.field2289 == null) { // L: 1871
							FloorOverlayDefinition.field2289 = WorldMapArchiveLoader.method8495(PcmPlayer.field304, class387.field4432.field4712, 0);
						} else {
							++var28; // L: 1872
						}

						if (GrandExchangeOfferOwnWorldComparator.scrollBarSprites == null) { // L: 1873
							GrandExchangeOfferOwnWorldComparator.scrollBarSprites = KeyHandler.method424(PcmPlayer.field304, class387.field4432.field4709, 0);
						} else {
							++var28; // L: 1874
						}

						if (class451.field4755 == null) { // L: 1875
							class451.field4755 = KeyHandler.method424(PcmPlayer.field304, class387.field4432.field4714, 0);
						} else {
							++var28; // L: 1876
						}

						if (var28 < 11) { // L: 1877
							Login.Login_loadingText = "Loading sprites - " + var28 * 100 / 12 + "%"; // L: 1878
							Login.Login_loadingPercent = 70; // L: 1879
						} else {
							AbstractFont.AbstractFont_modIconSprites = class451.field4755; // L: 1882
							class167.redHintArrowSprite.normalize(); // L: 1883
							var1 = (int)(Math.random() * 21.0D) - 10; // L: 1884
							var2 = (int)(Math.random() * 21.0D) - 10; // L: 1885
							var3 = (int)(Math.random() * 21.0D) - 10; // L: 1886
							int var4 = (int)(Math.random() * 41.0D) - 20; // L: 1887
							class299.mapSceneSprites[0].shiftColors(var4 + var1, var2 + var4, var4 + var3); // L: 1888
							Login.Login_loadingText = "Loaded sprites"; // L: 1889
							Login.Login_loadingPercent = 70; // L: 1890
							Client.field558 = class92.field1173; // L: 1891
						}
					} else if (Client.field558 == class92.field1173) { // L: 1894
						if (!class147.archive10.isFullyLoaded()) { // L: 1895
							Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1896
							Login.Login_loadingPercent = 90; // L: 1897
						} else {
							class129.field1544 = new TextureProvider(class147.archive10, PcmPlayer.field304, 20, class449.clientPreferences.method2505(), Client.isLowDetail ? 64 : 128); // L: 1900
							Rasterizer3D.method4376(class129.field1544); // L: 1901
							Rasterizer3D.Rasterizer3D_setBrightness(class449.clientPreferences.method2505()); // L: 1902
							Client.field558 = class92.field1174; // L: 1903
						}
					} else if (class92.field1174 == Client.field558) { // L: 1906
						var28 = class129.field1544.getLoadedPercentage(); // L: 1907
						if (var28 < 100) { // L: 1908
							Login.Login_loadingText = "Loading textures - " + var28 + "%"; // L: 1909
							Login.Login_loadingPercent = 90; // L: 1910
						} else {
							Login.Login_loadingText = "Loaded textures"; // L: 1913
							Login.Login_loadingPercent = 90; // L: 1914
							Client.field558 = class92.field1171; // L: 1915
						}
					} else if (Client.field558 == class92.field1171) { // L: 1918
						class126.mouseRecorder = new MouseRecorder(); // L: 1919
						GameEngine.taskHandler.newThreadTask(class126.mouseRecorder, 10); // L: 1920
						Login.Login_loadingText = "Loaded input handler"; // L: 1921
						Login.Login_loadingPercent = 92; // L: 1922
						Client.field558 = class92.field1170; // L: 1923
					} else if (class92.field1170 == Client.field558) { // L: 1926
						if (!class141.field1665.tryLoadFileByNames("huffman", "")) { // L: 1927
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1928
							Login.Login_loadingPercent = 94; // L: 1929
						} else {
							Huffman var37 = new Huffman(class141.field1665.takeFileByNames("huffman", "")); // L: 1932
							UserComparator9.method2896(var37); // L: 1933
							Login.Login_loadingText = "Loaded wordpack"; // L: 1934
							Login.Login_loadingPercent = 94; // L: 1935
							Client.field558 = class92.field1163; // L: 1936
						}
					} else if (class92.field1163 == Client.field558) { // L: 1939
						if (!ObjectSound.archive4.isFullyLoaded()) { // L: 1940
							Login.Login_loadingText = "Loading interfaces - " + ObjectSound.archive4.loadPercent() * 4 / 5 + "%"; // L: 1941
							Login.Login_loadingPercent = 96; // L: 1942
						} else if (!GrandExchangeOffer.archive12.isFullyLoaded()) { // L: 1945
							Login.Login_loadingText = "Loading interfaces - " + (80 + GrandExchangeOffer.archive12.loadPercent() / 6) + "%"; // L: 1946
							Login.Login_loadingPercent = 96; // L: 1947
						} else if (!Player.archive13.isFullyLoaded()) { // L: 1950
							Login.Login_loadingText = "Loading interfaces - " + (96 + Player.archive13.loadPercent() / 50) + "%"; // L: 1951
							Login.Login_loadingPercent = 96; // L: 1952
						} else {
							Login.Login_loadingText = "Loaded interfaces"; // L: 1955
							Login.Login_loadingPercent = 98; // L: 1956
							if (GrandExchangeOffer.archive12.isValidFileName("version.dat", "")) { // L: 1957
								Buffer var0 = new Buffer(GrandExchangeOffer.archive12.takeFileByNames("version.dat", "")); // L: 1958
								var0.readUnsignedShort(); // L: 1959
							}

							Client.field558 = class92.field1172; // L: 1961
						}
					} else if (Client.field558 == class92.field1172) { // L: 1964
						Login.Login_loadingPercent = 100; // L: 1965
						if (ClanChannelMember.field1676.getGroupCount() > 0 && !ClanChannelMember.field1676.tryLoadGroupByName(WorldMapCacheName.field3068.name)) { // L: 1966
							Login.Login_loadingText = "Loading world map - " + ClanChannelMember.field1676.groupLoadPercentByName(WorldMapCacheName.field3068.name) / 10 + "%"; // L: 1967
						} else {
							if (Canvas.worldMap == null) { // L: 1970
								Canvas.worldMap = new WorldMap(); // L: 1971
								Canvas.worldMap.init(ClanChannelMember.field1676, WorldMapElement.field1964, class227.field2545, class59.fontBold12, Client.field595, class299.mapSceneSprites); // L: 1972
							}

							Login.Login_loadingText = "Loaded world map"; // L: 1974
							Client.field558 = class92.field1160; // L: 1975
						}
					} else {
						if (class92.field1160 == Client.field558) { // L: 1978
							class317.method6014(10); // L: 1979
						}

					}
				}
			}
		}
	} // L: 1520 1526 1553 1581 1601 1631 1648 1657 1722 1728 1734 1739 1851 1880 1892 1898 1904 1911 1916 1924 1930 1937 1943 1948 1953 1962 1968 1976 1981
}
