import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("ae")
	static String field4784;
	@ObfuscatedName("aq")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("sink")
	BufferedSink sink;

	public BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1; // L: 12
		this.socket.setSoTimeout(30000); // L: 13
		this.socket.setTcpNoDelay(true); // L: 14
		this.socket.setReceiveBufferSize(65536); // L: 15
		this.socket.setSendBufferSize(65536); // L: 16
		this.source = new BufferedSource(this.socket.getInputStream(), var2); // L: 17
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3); // L: 18
	} // L: 19

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "854871960"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1); // L: 23
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1869781257"
	)
	public int vmethod8476() throws IOException {
		return this.source.available(); // L: 28
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1680246450"
	)
	public int vmethod8489() throws IOException {
		return this.source.readUnsignedByte(); // L: 33
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIIS)I",
		garbageValue = "230"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3); // L: 38
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "437315408"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3); // L: 43
	} // L: 44

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("close")
	public void close() {
		this.sink.close(); // L: 48

		try {
			this.socket.close(); // L: 50
		} catch (IOException var2) { // L: 52
		}

		this.source.close(); // L: 53
	} // L: 54

	protected void finalize() {
		this.close(); // L: 58
	} // L: 59

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2019836049"
	)
	static void method8501() {
		if (Client.field553 == class93.field1165) { // L: 1509
			class376.field4387 = ScriptFrame.newArchive(4, false, true, true, false); // L: 1510
			Renderable.field2921 = ScriptFrame.newArchive(6, true, true, true, false); // L: 1511
			class311.field3274 = ScriptFrame.newArchive(8, false, true, true, false); // L: 1512
			ScriptFrame.field468 = ScriptFrame.newArchive(10, false, true, true, false); // L: 1513
			class25.archive13 = ScriptFrame.newArchive(13, true, false, true, false); // L: 1514
			class391.field4483 = ScriptFrame.newArchive(14, false, true, true, false); // L: 1515
			class86.field1084 = ScriptFrame.newArchive(15, false, true, true, false); // L: 1516
			class128.method3018(20, "Connecting to update server"); // L: 1517
			WorldMapDecoration.method5033(class93.field1167); // L: 1518
		} else {
			int var28;
			byte var44;
			if (Client.field553 == class93.field1167) { // L: 1521
				var44 = 0; // L: 1522
				var28 = var44 + class376.field4387.percentage() * 53 / 100; // L: 1523
				var28 += Renderable.field2921.percentage() * 5 / 100; // L: 1524
				var28 += class311.field3274.percentage() * 36 / 100; // L: 1525
				var28 += ScriptFrame.field468.percentage() / 100; // L: 1526
				var28 += class25.archive13.percentage() / 100; // L: 1527
				var28 += class391.field4483.percentage() * 3 / 100; // L: 1528
				var28 += class86.field1084.percentage() / 100; // L: 1529
				if (var28 != 100) { // L: 1530
					if (var28 != 0) { // L: 1531
						class128.method3018(30, "Checking for updates - " + var28 + "%");
					}

				} else {
					Login.method2168(class376.field4387, "Sound FX"); // L: 1534
					Login.method2168(Renderable.field2921, "Music Tracks"); // L: 1535
					Login.method2168(class311.field3274, "Sprites"); // L: 1536
					Login.method2168(class391.field4483, "Music Samples"); // L: 1537
					Login.method2168(class86.field1084, "Music Patches"); // L: 1538
					class128.method3018(40, "Loaded update list"); // L: 1539
					WorldMapDecoration.method5033(class93.field1177); // L: 1540
				}
			} else {
				Archive var2;
				int var30;
				if (Client.field553 == class93.field1177) { // L: 1543
					SoundSystem.method805(22050, !Client.isLowDetail, 2); // L: 1544
					ArrayList var36 = new ArrayList(3); // L: 1545
					class125.pcmPlayer1 = class228.method4433(GameEngine.taskHandler, 0, 2048); // L: 1546
					SceneTilePaint.pcmStreamMixer = new PcmStreamMixer(); // L: 1547
					PcmStreamMixer var38 = new PcmStreamMixer(); // L: 1548
					var38.addSubStream(SceneTilePaint.pcmStreamMixer); // L: 1549

					for (var30 = 0; var30 < 3; ++var30) { // L: 1550
						MidiPcmStream var33 = new MidiPcmStream(class125.pcmPlayer1); // L: 1551
						var33.method6230(9, 128); // L: 1552
						var38.addSubStream(var33); // L: 1553
						var36.add(var33); // L: 1554
					}

					class125.pcmPlayer1.setStream(var38); // L: 1556
					var2 = class86.field1084; // L: 1557
					Archive var43 = class391.field4483; // L: 1558
					Archive var4 = class376.field4387; // L: 1559
					class321.field3480 = var2; // L: 1561
					class321.field3475 = var43; // L: 1562
					class321.field3477 = var4; // L: 1563
					class321.field3479 = var36; // L: 1564
					class73.field919 = new Decimator(22050, PcmPlayer.field295); // L: 1566
					class128.method3018(60, "Prepared sound engine"); // L: 1567
					WorldMapDecoration.method5033(class93.field1170); // L: 1568
				} else if (Client.field553 == class93.field1170) { // L: 1571
					if (class183.field1925 == null) { // L: 1572
						class183.field1925 = new Fonts(class311.field3274, class25.archive13);
					}

					var28 = FontName.method9110().length; // L: 1573
					Client.field743 = class183.field1925.createMap(FontName.method9110()); // L: 1574
					if (Client.field743.size() < var28) { // L: 1575
						class128.method3018(80, "Loading fonts - " + Client.field743.size() * 100 / var28 + "%"); // L: 1576
					} else {
						class60.field435 = (Font)Client.field743.get(FontName.FontName_plain11); // L: 1579
						class141.fontPlain12 = (Font)Client.field743.get(FontName.FontName_plain12); // L: 1580
						class166.fontBold12 = (Font)Client.field743.get(FontName.FontName_bold12); // L: 1581
						class31.field165 = Client.field818.get(); // L: 1582
						class128.method3018(80, "Loaded fonts"); // L: 1583
						WorldMapDecoration.method5033(class93.field1173); // L: 1584
					}
				} else {
					int var29;
					if (Client.field553 == class93.field1173) { // L: 1587
						var28 = class234.method4589(ScriptFrame.field468, class311.field3274); // L: 1588
						var29 = MouseHandler.method629(class311.field3274); // L: 1589
						if (var28 < var29) { // L: 1590
							class128.method3018(90, "Loading title screen - " + var28 * 100 / var29 + "%"); // L: 1591
						} else {
							class128.method3018(100, "Loaded title screen"); // L: 1594
							if (WorldMapScaleHandler.field2696) { // L: 1595
								Interpreter.method2106(5); // L: 1596
								WorldMapDecoration.method5033(class93.field1169); // L: 1597
							} else {
								WorldMapDecoration.method5033(class93.field1166); // L: 1600
							}

						}
					} else if (Client.field553 == class93.field1169) { // L: 1604
						Interpreter.method2106(10); // L: 1605
					} else if (Client.field553 == class93.field1166) { // L: 1608
						class154.field1724 = ScriptFrame.newArchive(0, false, true, true, false); // L: 1609
						Client.field556 = ScriptFrame.newArchive(1, false, true, true, false); // L: 1610
						class19.archive2 = ScriptFrame.newArchive(2, true, false, true, false); // L: 1611
						ScriptFrame.field464 = ScriptFrame.newArchive(3, false, true, true, false); // L: 1612
						JagexCache.field2336 = ScriptFrame.newArchive(5, true, true, true, false); // L: 1613
						class198.field2070 = ScriptFrame.newArchive(7, false, true, true, false); // L: 1614
						Varcs.field1417 = ScriptFrame.newArchive(9, false, true, true, false); // L: 1615
						WorldMapSectionType.field2612 = ScriptFrame.newArchive(11, false, true, true, false); // L: 1616
						WorldMapSectionType.archive12 = ScriptFrame.newArchive(12, false, true, true, false); // L: 1617
						class12.field52 = ScriptFrame.newArchive(17, true, true, true, false); // L: 1618
						SpotAnimationDefinition.field2045 = ScriptFrame.newArchive(18, false, true, true, false); // L: 1619
						class170.field1832 = ScriptFrame.newArchive(19, false, true, true, false); // L: 1620
						class362.field3958 = ScriptFrame.newArchive(20, false, true, true, false); // L: 1621
						class150.field1703 = ScriptFrame.newArchive(21, false, true, true, false); // L: 1622
						MouseHandler.field239 = class186.method3684(22, false, true, true, true, true); // L: 1623
						class128.method3018(20, "Connecting to update server"); // L: 1624
						WorldMapDecoration.method5033(class93.field1168); // L: 1625
					} else if (class93.field1168 == Client.field553) { // L: 1628
						var44 = 0; // L: 1629
						var28 = var44 + class154.field1724.percentage() * 5 / 100; // L: 1630
						var28 += Client.field556.percentage() * 2 / 100; // L: 1631
						var28 += class19.archive2.percentage() / 100; // L: 1632
						var28 += ScriptFrame.field464.percentage() / 100; // L: 1633
						var28 += JagexCache.field2336.percentage() * 10 / 100; // L: 1634
						var28 += class198.field2070.percentage() * 65 / 100; // L: 1635
						var28 += Varcs.field1417.percentage() / 100; // L: 1636
						var28 += WorldMapSectionType.field2612.percentage() / 100; // L: 1637
						var28 += WorldMapSectionType.archive12.percentage() * 6 / 100; // L: 1638
						var28 += class170.field1832.percentage() / 100; // L: 1639
						var28 += SpotAnimationDefinition.field2045.percentage() * 2 / 100; // L: 1640
						var28 += class362.field3958.percentage() * 2 / 100; // L: 1641
						var28 += class150.field1703.percentage() / 100; // L: 1642
						var28 += MouseHandler.field239.percentage() / 100; // L: 1643
						var28 += class12.field52.method7049() && class12.field52.isFullyLoaded() ? 1 : 0; // L: 1644
						if (var28 != 100) { // L: 1645
							if (var28 != 0) { // L: 1646
								class128.method3018(30, "Checking for updates - " + var28 + "%");
							}

						} else {
							Login.method2168(class154.field1724, "Animations"); // L: 1649
							Login.method2168(Client.field556, "Skeletons"); // L: 1650
							Login.method2168(JagexCache.field2336, "Maps"); // L: 1651
							Login.method2168(class198.field2070, "Models"); // L: 1652
							Login.method2168(WorldMapSectionType.field2612, "Music Jingles"); // L: 1653
							Login.method2168(class170.field1832, "World Map"); // L: 1654
							Login.method2168(SpotAnimationDefinition.field2045, "World Map Geography"); // L: 1655
							Login.method2168(class362.field3958, "World Map Ground"); // L: 1656
							class128.field1514 = new GraphicsDefaults(); // L: 1657
							class128.field1514.decode(class12.field52); // L: 1658
							class128.method3018(30, "Loaded update list"); // L: 1659
							WorldMapDecoration.method5033(class93.field1171); // L: 1660
						}
					} else if (Client.field553 == class93.field1171) { // L: 1663
						Actor.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1664

						for (var28 = 0; var28 < 4; ++var28) { // L: 1665
							Client.collisionMaps[var28] = new CollisionMap(104, 104);
						}

						class25.field118 = new SpritePixels(512, 512); // L: 1666
						class128.method3018(30, "Starting game engine..."); // L: 1667
						WorldMapDecoration.method5033(class93.field1172); // L: 1668
					} else if (Client.field553 == class93.field1172) { // L: 1671
						if (!class19.archive2.isFullyLoaded()) { // L: 1672
							class128.method3018(40, "Loading config - " + class19.archive2.loadPercent() + "%"); // L: 1673
						} else if (!class150.field1703.isFullyLoaded()) { // L: 1676
							class128.method3018(40, "Loading config - " + (80 + WorldMapSectionType.archive12.loadPercent() / 6) + "%"); // L: 1677
						} else {
							ItemComposition.method4029(class19.archive2); // L: 1680
							Archive var35 = class19.archive2; // L: 1681
							FloorUnderlayDefinition.field2051 = var35; // L: 1683
							class417.method7969(class19.archive2, class198.field2070); // L: 1685
							Archive var37 = class19.archive2; // L: 1686
							var2 = class198.field2070; // L: 1687
							boolean var39 = Client.isLowDetail; // L: 1688
							boolean var42 = Client.field530 >= 220; // L: 1689
							ObjectComposition.ObjectDefinition_archive = var37; // L: 1691
							ObjectComposition.ObjectDefinition_modelsArchive = var2; // L: 1692
							ObjectComposition.ObjectDefinition_isLowDetail = var39; // L: 1693
							ObjectComposition.field2118 = var42; // L: 1694
							Archive var40 = class19.archive2; // L: 1696
							Archive var32 = class198.field2070; // L: 1697
							NPCComposition.NpcDefinition_archive = var40; // L: 1699
							NPCComposition.field1964 = var32; // L: 1700
							Archive var41 = class19.archive2; // L: 1702
							StructComposition.StructDefinition_archive = var41; // L: 1704
							Archive var8 = class19.archive2; // L: 1706
							Archive var9 = class198.field2070; // L: 1707
							boolean var10 = Client.isMembersWorld; // L: 1708
							Font var11 = class60.field435; // L: 1709
							ItemComposition.ItemComposition_archive = var8; // L: 1711
							ItemComposition.ItemComposition_modelArchive = var9; // L: 1712
							HealthBarUpdate.ItemComposition_inMembersWorld = var10; // L: 1713
							ItemComposition.ItemComposition_fileCount = ItemComposition.ItemComposition_archive.getGroupFileCount(10); // L: 1714
							Decimator.field406 = var11; // L: 1715
							Archive var12 = class19.archive2; // L: 1717
							Archive var13 = class154.field1724; // L: 1718
							Archive var14 = Client.field556; // L: 1719
							boolean var15 = Client.field530 >= 220; // L: 1720
							class149.SequenceDefinition_archive = var12; // L: 1722
							class135.SequenceDefinition_animationsArchive = var13; // L: 1723
							class138.SequenceDefinition_skeletonsArchive = var14; // L: 1724
							SequenceDefinition.field2250 = var15; // L: 1725
							Archive var16 = class19.archive2; // L: 1727
							Archive var17 = class198.field2070; // L: 1728
							SpotAnimationDefinition.SpotAnimationDefinition_archive = var16; // L: 1730
							SpotAnimationDefinition.field2034 = var17; // L: 1731
							WorldMapSection2.method4667(class19.archive2); // L: 1733
							Login.method2192(class19.archive2); // L: 1734
							ArchiveLoader.field1070 = new class340(ScriptFrame.field464, class198.field2070, class311.field3274, class25.archive13, MouseHandler.field239); // L: 1735
							FontName.method9114(class19.archive2); // L: 1736
							DefaultsGroup.method8542(class19.archive2); // L: 1737
							PacketWriter.method2892(class19.archive2); // L: 1738
							Archive var18 = class19.archive2; // L: 1739
							class36.method660(class19.archive2); // L: 1741
							HealthBarUpdate.method2495(class19.archive2); // L: 1742
							class91.method2383(class19.archive2); // L: 1743
							EnumComposition.field1931 = new class516(KeyHandler.field151, 54, WorldMapCacheName.clientLanguage, class19.archive2); // L: 1744
							ApproximateRouteStrategy.field488 = new class516(KeyHandler.field151, 47, WorldMapCacheName.clientLanguage, class19.archive2); // L: 1745
							ScriptFrame.varcs = new Varcs(); // L: 1746
							Archive var19 = class19.archive2; // L: 1747
							Archive var20 = class311.field3274; // L: 1748
							Archive var21 = class25.archive13; // L: 1749
							HitSplatDefinition.HitSplatDefinition_archive = var19; // L: 1751
							class17.field81 = var20; // L: 1752
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var21; // L: 1753
							Archive var22 = class19.archive2; // L: 1755
							Archive var23 = class311.field3274; // L: 1756
							HealthBarDefinition.HealthBarDefinition_archive = var22; // L: 1758
							HealthBarDefinition.field1907 = var23; // L: 1759
							Archive var24 = class19.archive2; // L: 1761
							Archive var25 = class311.field3274; // L: 1762
							WorldMapElement.WorldMapElement_archive = var25; // L: 1764
							if (var24.isFullyLoaded()) { // L: 1765
								WorldMapElement.WorldMapElement_count = var24.getGroupFileCount(35); // L: 1768
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 1769

								for (int var26 = 0; var26 < WorldMapElement.WorldMapElement_count; ++var26) { // L: 1770
									byte[] var27 = var24.takeFile(35, var26); // L: 1771
									WorldMapElement.WorldMapElement_cached[var26] = new WorldMapElement(var26); // L: 1772
									if (var27 != null) { // L: 1773
										WorldMapElement.WorldMapElement_cached[var26].decode(new Buffer(var27)); // L: 1774
										WorldMapElement.WorldMapElement_cached[var26].method3590(); // L: 1775
									}
								}
							}

							class128.method3018(50, "Loaded config"); // L: 1779
							WorldMapDecoration.method5033(class93.field1175); // L: 1780
						}
					} else if (class93.field1175 == Client.field553) { // L: 1783
						var28 = 0; // L: 1784
						if (Varps.field3615 == null) { // L: 1785
							Varps.field3615 = FileSystem.SpriteBuffer_getSprite(class311.field3274, class128.field1514.field4819, 0);
						} else {
							++var28; // L: 1786
						}

						if (ItemComposition.redHintArrowSprite == null) { // L: 1787
							ItemComposition.redHintArrowSprite = FileSystem.SpriteBuffer_getSprite(class311.field3274, class128.field1514.field4810, 0);
						} else {
							++var28; // L: 1788
						}

						IndexedSprite[] var1;
						int var3;
						IndexedSprite[] var5;
						int var6;
						IndexedSprite var7;
						if (AbstractSocket.mapSceneSprites == null) { // L: 1789
							var2 = class311.field3274; // L: 1791
							var3 = class128.field1514.field4812; // L: 1792
							if (!class130.method3074(var2, var3, 0)) { // L: 1794
								var1 = null; // L: 1795
							} else {
								var5 = new IndexedSprite[class548.SpriteBuffer_spriteCount]; // L: 1800

								for (var6 = 0; var6 < class548.SpriteBuffer_spriteCount; ++var6) { // L: 1801
									var7 = var5[var6] = new IndexedSprite(); // L: 1802
									var7.width = class548.SpriteBuffer_spriteWidth; // L: 1803
									var7.height = class548.SpriteBuffer_spriteHeight; // L: 1804
									var7.xOffset = class548.SpriteBuffer_xOffsets[var6]; // L: 1805
									var7.yOffset = class548.SpriteBuffer_yOffsets[var6]; // L: 1806
									var7.subWidth = class235.SpriteBuffer_spriteWidths[var6]; // L: 1807
									var7.subHeight = class548.SpriteBuffer_spriteHeights[var6]; // L: 1808
									var7.palette = AbstractSocket.SpriteBuffer_spritePalette; // L: 1809
									var7.pixels = class548.SpriteBuffer_pixels[var6]; // L: 1810
								}

								class548.SpriteBuffer_xOffsets = null; // L: 1813
								class548.SpriteBuffer_yOffsets = null; // L: 1814
								class235.SpriteBuffer_spriteWidths = null; // L: 1815
								class548.SpriteBuffer_spriteHeights = null; // L: 1816
								AbstractSocket.SpriteBuffer_spritePalette = null; // L: 1817
								class548.SpriteBuffer_pixels = null; // L: 1818
								var1 = var5; // L: 1822
							}

							AbstractSocket.mapSceneSprites = var1; // L: 1824
						} else {
							++var28; // L: 1826
						}

						if (class13.field61 == null) { // L: 1827
							class13.field61 = class138.method3146(class311.field3274, class128.field1514.field4813, 0);
						} else {
							++var28; // L: 1828
						}

						if (class168.field1826 == null) { // L: 1829
							class168.field1826 = class138.method3146(class311.field3274, class128.field1514.field4814, 0);
						} else {
							++var28; // L: 1830
						}

						if (ChatChannel.field1041 == null) { // L: 1831
							ChatChannel.field1041 = class138.method3146(class311.field3274, class128.field1514.field4815, 0);
						} else {
							++var28; // L: 1832
						}

						if (Players.field1390 == null) { // L: 1833
							Players.field1390 = class138.method3146(class311.field3274, class128.field1514.field4822, 0);
						} else {
							++var28; // L: 1834
						}

						if (GrandExchangeOfferOwnWorldComparator.field492 == null) { // L: 1835
							GrandExchangeOfferOwnWorldComparator.field492 = class138.method3146(class311.field3274, class128.field1514.field4817, 0);
						} else {
							++var28; // L: 1836
						}

						if (class246.field2581 == null) { // L: 1837
							class246.field2581 = class138.method3146(class311.field3274, class128.field1514.field4818, 0);
						} else {
							++var28; // L: 1838
						}

						if (ClanChannelMember.scrollBarSprites == null) { // L: 1839
							var2 = class311.field3274; // L: 1841
							var3 = class128.field1514.field4816; // L: 1842
							if (!class130.method3074(var2, var3, 0)) { // L: 1844
								var1 = null; // L: 1845
							} else {
								var5 = new IndexedSprite[class548.SpriteBuffer_spriteCount]; // L: 1850

								for (var6 = 0; var6 < class548.SpriteBuffer_spriteCount; ++var6) { // L: 1851
									var7 = var5[var6] = new IndexedSprite(); // L: 1852
									var7.width = class548.SpriteBuffer_spriteWidth; // L: 1853
									var7.height = class548.SpriteBuffer_spriteHeight; // L: 1854
									var7.xOffset = class548.SpriteBuffer_xOffsets[var6]; // L: 1855
									var7.yOffset = class548.SpriteBuffer_yOffsets[var6]; // L: 1856
									var7.subWidth = class235.SpriteBuffer_spriteWidths[var6]; // L: 1857
									var7.subHeight = class548.SpriteBuffer_spriteHeights[var6]; // L: 1858
									var7.palette = AbstractSocket.SpriteBuffer_spritePalette; // L: 1859
									var7.pixels = class548.SpriteBuffer_pixels[var6]; // L: 1860
								}

								class548.SpriteBuffer_xOffsets = null; // L: 1863
								class548.SpriteBuffer_yOffsets = null; // L: 1864
								class235.SpriteBuffer_spriteWidths = null; // L: 1865
								class548.SpriteBuffer_spriteHeights = null; // L: 1866
								AbstractSocket.SpriteBuffer_spritePalette = null; // L: 1867
								class548.SpriteBuffer_pixels = null; // L: 1868
								var1 = var5; // L: 1872
							}

							ClanChannelMember.scrollBarSprites = var1; // L: 1874
						} else {
							++var28; // L: 1876
						}

						if (WorldMapCacheName.field2685 == null) { // L: 1877
							var2 = class311.field3274; // L: 1879
							var3 = class128.field1514.field4820; // L: 1880
							if (!class130.method3074(var2, var3, 0)) { // L: 1882
								var1 = null; // L: 1883
							} else {
								var5 = new IndexedSprite[class548.SpriteBuffer_spriteCount]; // L: 1888

								for (var6 = 0; var6 < class548.SpriteBuffer_spriteCount; ++var6) { // L: 1889
									var7 = var5[var6] = new IndexedSprite(); // L: 1890
									var7.width = class548.SpriteBuffer_spriteWidth; // L: 1891
									var7.height = class548.SpriteBuffer_spriteHeight; // L: 1892
									var7.xOffset = class548.SpriteBuffer_xOffsets[var6]; // L: 1893
									var7.yOffset = class548.SpriteBuffer_yOffsets[var6]; // L: 1894
									var7.subWidth = class235.SpriteBuffer_spriteWidths[var6]; // L: 1895
									var7.subHeight = class548.SpriteBuffer_spriteHeights[var6]; // L: 1896
									var7.palette = AbstractSocket.SpriteBuffer_spritePalette; // L: 1897
									var7.pixels = class548.SpriteBuffer_pixels[var6]; // L: 1898
								}

								class548.SpriteBuffer_xOffsets = null; // L: 1901
								class548.SpriteBuffer_yOffsets = null; // L: 1902
								class235.SpriteBuffer_spriteWidths = null; // L: 1903
								class548.SpriteBuffer_spriteHeights = null; // L: 1904
								AbstractSocket.SpriteBuffer_spritePalette = null; // L: 1905
								class548.SpriteBuffer_pixels = null; // L: 1906
								var1 = var5; // L: 1910
							}

							WorldMapCacheName.field2685 = var1; // L: 1912
						} else {
							++var28; // L: 1914
						}

						if (var28 < 11) { // L: 1915
							class128.method3018(70, "Loading sprites - " + var28 * 100 / 12 + "%"); // L: 1916
						} else {
							AbstractFont.AbstractFont_modIconSprites = WorldMapCacheName.field2685; // L: 1919
							ItemComposition.redHintArrowSprite.normalize(); // L: 1920
							var29 = (int)(Math.random() * 21.0D) - 10; // L: 1921
							var30 = (int)(Math.random() * 21.0D) - 10; // L: 1922
							var3 = (int)(Math.random() * 21.0D) - 10; // L: 1923
							int var31 = (int)(Math.random() * 41.0D) - 20; // L: 1924
							AbstractSocket.mapSceneSprites[0].shiftColors(var31 + var29, var30 + var31, var3 + var31); // L: 1925
							class128.method3018(60, "Loaded sprites"); // L: 1926
							WorldMapDecoration.method5033(class93.field1178); // L: 1927
						}
					} else if (Client.field553 == class93.field1178) { // L: 1930
						if (!Varcs.field1417.isFullyLoaded()) { // L: 1931
							class128.method3018(70, "Loading textures - " + "0%"); // L: 1932
						} else {
							class159.field1773 = new TextureProvider(Varcs.field1417, class311.field3274, 20, class30.clientPreferences.method2542(), Client.isLowDetail ? 64 : 128); // L: 1935
							Rasterizer3D.method5344(class159.field1773); // L: 1936
							Rasterizer3D.method5280(class30.clientPreferences.method2542()); // L: 1937
							WorldMapDecoration.method5033(class93.field1164); // L: 1938
						}
					} else if (Client.field553 == class93.field1164) { // L: 1941
						var28 = class159.field1773.getLoadedPercentage(); // L: 1942
						if (var28 < 100) { // L: 1943
							class128.method3018(80, "Loading textures - " + var28 + "%"); // L: 1944
						} else {
							class128.method3018(90, "Loaded textures"); // L: 1947
							WorldMapDecoration.method5033(class93.field1176); // L: 1948
						}
					} else if (class93.field1176 == Client.field553) { // L: 1951
						ByteArrayPool.mouseRecorder = new MouseRecorder(); // L: 1952
						GameEngine.taskHandler.newThreadTask(ByteArrayPool.mouseRecorder, 10); // L: 1953
						class128.method3018(92, "Loaded input handler"); // L: 1954
						WorldMapDecoration.method5033(class93.field1174); // L: 1955
					} else if (Client.field553 == class93.field1174) { // L: 1958
						if (!ScriptFrame.field468.tryLoadFileByNames("huffman", "")) { // L: 1959
							class128.method3018(94, "Loading wordpack - " + 0 + "%"); // L: 1960
						} else {
							Huffman var34 = new Huffman(ScriptFrame.field468.takeFileByNames("huffman", "")); // L: 1963
							class405.huffman = var34; // L: 1965
							class128.method3018(94, "Loaded wordpack"); // L: 1967
							WorldMapDecoration.method5033(class93.field1180); // L: 1968
						}
					} else if (class93.field1180 == Client.field553) { // L: 1971
						if (!ScriptFrame.field464.isFullyLoaded()) { // L: 1972
							class128.method3018(96, "Loading interfaces - " + ScriptFrame.field464.loadPercent() * 4 / 5 + "%"); // L: 1973
						} else if (!MouseHandler.field239.isFullyLoaded()) { // L: 1976
							class128.method3018(96, "Loading interfaces - " + MouseHandler.field239.loadPercent() * 4 / 5 + "%"); // L: 1977
						} else if (!WorldMapSectionType.archive12.isFullyLoaded()) { // L: 1980
							class128.method3018(96, "Loading interfaces - " + (80 + WorldMapSectionType.archive12.loadPercent() / 6) + "%"); // L: 1981
						} else if (!class25.archive13.isFullyLoaded()) { // L: 1984
							class128.method3018(96, "Loading interfaces - " + (96 + class25.archive13.loadPercent() / 50) + "%"); // L: 1985
						} else {
							class128.method3018(98, "Loaded interfaces"); // L: 1988
							if (WorldMapSectionType.archive12.isValidFileName("version.dat", "")) { // L: 1989
								Buffer var0 = new Buffer(WorldMapSectionType.archive12.takeFileByNames("version.dat", "")); // L: 1990
								var0.readUnsignedShort(); // L: 1991
							}

							WorldMapDecoration.method5033(class93.field1179); // L: 1993
						}
					} else if (Client.field553 == class93.field1179) { // L: 1996
						if (class170.field1832.getGroupCount() > 0 && !class170.field1832.tryLoadGroupByName(WorldMapCacheName.field2680.name)) { // L: 1997
							class128.method3018(100, "Loading world map - " + class170.field1832.groupLoadPercentByName(WorldMapCacheName.field2680.name) / 10 + "%"); // L: 1998
						} else {
							if (Tiles.worldMap == null) { // L: 2001
								Tiles.worldMap = new WorldMap(); // L: 2002
								Tiles.worldMap.init(class170.field1832, SpotAnimationDefinition.field2045, class362.field3958, class166.fontBold12, Client.field743, AbstractSocket.mapSceneSprites); // L: 2003
							}

							class128.method3018(100, "Loaded world map"); // L: 2005
							if (WorldMapScaleHandler.field2696) { // L: 2006
								WorldMapDecoration.method5033(class93.field1181); // L: 2007
							} else {
								WorldMapDecoration.method5033(class93.field1169); // L: 2010
							}

							Client.field718 = false; // L: 2012
						}
					} else {
						if (class93.field1181 == Client.field553) { // L: 2015
							VarbitComposition.field2061 = false; // L: 2016
							Interpreter.method2106(20); // L: 2017
							class407.method7638(class67.field514); // L: 2018
						}

					}
				}
			}
		}
	} // L: 1519 1532 1541 1569 1577 1585 1592 1602 1606 1626 1647 1661 1669 1674 1678 1781 1917 1928 1933 1939 1945 1949 1956 1961 1969 1974 1978 1982 1986 1994 1999 2013 2020
}
