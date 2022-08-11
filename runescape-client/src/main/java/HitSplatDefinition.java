import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static AbstractArchive field2017;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -447025333
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -165263255
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -415270105
	)
	public int field2014;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1228261471
	)
	int field2015;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1563829945
	)
	int field2016;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -451727261
	)
	int field2023;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1479003505
	)
	int field2018;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1205062523
	)
	public int field2019;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1272409313
	)
	public int field2021;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1577848177
	)
	public int field2025;
	@ObfuscatedName("e")
	String field2022;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 355377753
	)
	public int field2007;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2108810599
	)
	public int field2024;
	@ObfuscatedName("r")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1684933833
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1631680875
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2014 = 70; // L: 28
		this.field2015 = -1; // L: 29
		this.field2016 = -1; // L: 30
		this.field2023 = -1; // L: 31
		this.field2018 = -1; // L: 32
		this.field2019 = 0; // L: 33
		this.field2021 = 0; // L: 34
		this.field2025 = -1; // L: 35
		this.field2022 = ""; // L: 36
		this.field2007 = -1; // L: 37
		this.field2024 = 0; // L: 38
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "1178176274"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 63
			if (var2 == 0) { // L: 64
				return; // L: 67
			}

			this.decodeNext(var1, var2); // L: 65
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "-2044843073"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 70
			this.fontId = var1.method7752();
		} else if (var2 == 2) { // L: 71
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 72
			this.field2015 = var1.method7752();
		} else if (var2 == 4) { // L: 73
			this.field2023 = var1.method7752();
		} else if (var2 == 5) { // L: 74
			this.field2016 = var1.method7752();
		} else if (var2 == 6) { // L: 75
			this.field2018 = var1.method7752();
		} else if (var2 == 7) { // L: 76
			this.field2019 = var1.readShort();
		} else if (var2 == 8) { // L: 77
			this.field2022 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 78
			this.field2014 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 79
			this.field2021 = var1.readShort();
		} else if (var2 == 11) { // L: 80
			this.field2025 = 0;
		} else if (var2 == 12) { // L: 81
			this.field2007 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 82
			this.field2024 = var1.readShort();
		} else if (var2 == 14) { // L: 83
			this.field2025 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) { // L: 84
			this.transformVarbit = var1.readUnsignedShort(); // L: 85
			if (this.transformVarbit == 65535) { // L: 86
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 87
			if (this.transformVarp == 65535) { // L: 88
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 89
			if (var2 == 18) { // L: 90
				var3 = var1.readUnsignedShort(); // L: 91
				if (var3 == 65535) { // L: 92
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 94
			this.transforms = new int[var4 + 2]; // L: 95

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 96
				this.transforms[var5] = var1.readUnsignedShort(); // L: 97
				if (this.transforms[var5] == 65535) { // L: 98
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 100
		}

	} // L: 103

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgf;",
		garbageValue = "-1530642645"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 106
		if (this.transformVarbit != -1) { // L: 107
			var1 = class271.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 108
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 110
			var2 = this.transforms[var1]; // L: 111
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? GrandExchangeOfferOwnWorldComparator.method1095(var2) : null; // L: 112 113
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1562496023"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2022; // L: 117

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 119
			if (var3 < 0) { // L: 120
				return var2; // L: 123
			}

			var2 = var2.substring(0, var3) + ModeWhere.intToString(var1, false) + var2.substring(var3 + 2); // L: 121
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lqj;",
		garbageValue = "-1581395475"
	)
	public SpritePixels method3630() {
		if (this.field2015 < 0) { // L: 127
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2015); // L: 128
			if (var1 != null) {
				return var1; // L: 129
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field2017, this.field2015, 0); // L: 130
				if (var1 != null) { // L: 131
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2015);
				}

				return var1; // L: 133
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lqj;",
		garbageValue = "-1122708350"
	)
	public SpritePixels method3607() {
		if (this.field2016 < 0) { // L: 137
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2016); // L: 138
			if (var1 != null) {
				return var1; // L: 139
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field2017, this.field2016, 0); // L: 140
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2016); // L: 141
				}

				return var1; // L: 143
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Lqj;",
		garbageValue = "1734967846"
	)
	public SpritePixels method3608() {
		if (this.field2023 < 0) { // L: 147
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2023); // L: 148
			if (var1 != null) {
				return var1; // L: 149
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field2017, this.field2023, 0); // L: 150
				if (var1 != null) { // L: 151
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2023);
				}

				return var1; // L: 153
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lqj;",
		garbageValue = "2040345171"
	)
	public SpritePixels method3609() {
		if (this.field2018 < 0) { // L: 157
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2018); // L: 158
			if (var1 != null) { // L: 159
				return var1;
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field2017, this.field2018, 0); // L: 160
				if (var1 != null) { // L: 161
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2018);
				}

				return var1; // L: 163
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Lmx;",
		garbageValue = "-7"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 167
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 168
			if (var1 != null) { // L: 169
				return var1;
			} else {
				AbstractArchive var3 = field2017; // L: 171
				AbstractArchive var4 = class290.HitSplatDefinition_fontsArchive; // L: 172
				int var5 = this.fontId; // L: 173
				byte[] var7 = var3.takeFile(var5, 0); // L: 177
				boolean var6;
				if (var7 == null) { // L: 178
					var6 = false; // L: 179
				} else {
					class83.SpriteBuffer_decode(var7); // L: 182
					var6 = true; // L: 183
				}

				Font var2;
				if (!var6) { // L: 185
					var2 = null; // L: 186
				} else {
					var2 = class14.method182(var4.takeFile(var5, 0)); // L: 189
				}

				if (var2 != null) { // L: 192
					HitSplatDefinition_cachedFonts.put(var2, (long)this.fontId);
				}

				return var2; // L: 194
			}
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "105"
	)
	@Export("load")
	static void load() {
		int var33;
		if (Client.titleLoadingStage == 0) { // L: 1598
			Decimator.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1599

			for (var33 = 0; var33 < 4; ++var33) { // L: 1600
				Client.collisionMaps[var33] = new CollisionMap(104, 104);
			}

			SceneTilePaint.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1601
			Login.Login_loadingText = "Starting game engine..."; // L: 1602
			Login.Login_loadingPercent = 5; // L: 1603
			Client.titleLoadingStage = 20; // L: 1604
		} else if (Client.titleLoadingStage == 20) { // L: 1607
			Login.Login_loadingText = "Prepared visibility map"; // L: 1608
			Login.Login_loadingPercent = 10; // L: 1609
			Client.titleLoadingStage = 30; // L: 1610
		} else if (Client.titleLoadingStage == 30) { // L: 1613
			Calendar.archive5 = MusicPatch.newArchive(0, false, true, true, false); // L: 1614
			Calendar.field3297 = MusicPatch.newArchive(1, false, true, true, false); // L: 1615
			class20.archive2 = MusicPatch.newArchive(2, true, false, true, false); // L: 1616
			Skills.archive7 = MusicPatch.newArchive(3, false, true, true, false); // L: 1617
			WorldMapArchiveLoader.archive4 = MusicPatch.newArchive(4, false, true, true, false); // L: 1618
			class21.archive9 = MusicPatch.newArchive(5, true, true, true, false); // L: 1619
			MouseHandler.archive6 = MusicPatch.newArchive(6, true, true, true, false); // L: 1620
			TaskHandler.archive11 = MusicPatch.newArchive(7, false, true, true, false); // L: 1621
			AbstractWorldMapData.archive8 = MusicPatch.newArchive(8, false, true, true, false); // L: 1622
			class293.field3349 = MusicPatch.newArchive(9, false, true, true, false); // L: 1623
			Actor.archive10 = MusicPatch.newArchive(10, false, true, true, false); // L: 1624
			WorldMapRegion.field2708 = MusicPatch.newArchive(11, false, true, true, false); // L: 1625
			class117.archive12 = MusicPatch.newArchive(12, false, true, true, false); // L: 1626
			class1.archive13 = MusicPatch.newArchive(13, true, false, true, false); // L: 1627
			InvDefinition.archive14 = MusicPatch.newArchive(14, false, true, true, false); // L: 1628
			WorldMapRegion.archive15 = MusicPatch.newArchive(15, false, true, true, false); // L: 1629
			class155.archive17 = MusicPatch.newArchive(17, true, true, true, false); // L: 1630
			class174.archive18 = MusicPatch.newArchive(18, false, true, true, false); // L: 1631
			GrandExchangeOffer.archive19 = MusicPatch.newArchive(19, false, true, true, false); // L: 1632
			ClanSettings.archive20 = MusicPatch.newArchive(20, false, true, true, false); // L: 1633
			BuddyRankComparator.field1380 = MusicPatch.newArchive(21, false, true, true, true); // L: 1634
			Login.Login_loadingText = "Connecting to update server"; // L: 1635
			Login.Login_loadingPercent = 20; // L: 1636
			Client.titleLoadingStage = 40; // L: 1637
		} else if (Client.titleLoadingStage != 40) { // L: 1640
			Archive var2;
			Archive var22;
			Archive var30;
			if (Client.titleLoadingStage == 45) { // L: 1688
				class258.method5186(22050, !Client.isLowDetail, 2); // L: 1689
				MidiPcmStream var28 = new MidiPcmStream(); // L: 1690
				var28.method5277(9, 128); // L: 1691
				class192.pcmPlayer0 = MusicPatch.method5443(GameEngine.taskHandler, 0, 22050); // L: 1692
				class192.pcmPlayer0.setStream(var28); // L: 1693
				var30 = WorldMapRegion.archive15; // L: 1694
				var2 = InvDefinition.archive14; // L: 1695
				var22 = WorldMapArchiveLoader.archive4; // L: 1696
				class273.musicPatchesArchive = var30; // L: 1698
				class273.musicSamplesArchive = var2; // L: 1699
				class329.soundEffectsArchive = var22; // L: 1700
				class273.midiPcmStream = var28; // L: 1701
				SequenceDefinition.pcmPlayer1 = MusicPatch.method5443(GameEngine.taskHandler, 1, 2048); // L: 1703
				StructComposition.pcmStreamMixer = new PcmStreamMixer(); // L: 1704
				SequenceDefinition.pcmPlayer1.setStream(StructComposition.pcmStreamMixer); // L: 1705
				Tiles.decimator = new Decimator(22050, class301.field3595); // L: 1706
				Login.Login_loadingText = "Prepared sound engine"; // L: 1707
				Login.Login_loadingPercent = 35; // L: 1708
				Client.titleLoadingStage = 50; // L: 1709
				class136.WorldMapElement_fonts = new Fonts(AbstractWorldMapData.archive8, class1.archive13); // L: 1710
			} else {
				int var20;
				if (Client.titleLoadingStage == 50) { // L: 1713
					FontName[] var27 = new FontName[]{FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12}; // L: 1716
					var20 = var27.length; // L: 1718
					Fonts var29 = class136.WorldMapElement_fonts; // L: 1719
					FontName[] var34 = new FontName[]{FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12}; // L: 1722
					Client.fontsMap = var29.createMap(var34); // L: 1724
					if (Client.fontsMap.size() < var20) { // L: 1725
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var20 + "%"; // L: 1726
						Login.Login_loadingPercent = 40; // L: 1727
					} else {
						class116.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1730
						class149.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1731
						class116.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1732
						class92.platformInfo = Client.platformInfoProvider.get(); // L: 1733
						Login.Login_loadingText = "Loaded fonts"; // L: 1734
						Login.Login_loadingPercent = 40; // L: 1735
						Client.titleLoadingStage = 60; // L: 1736
					}
				} else {
					int var3;
					int var32;
					if (Client.titleLoadingStage == 60) { // L: 1739
						var30 = Actor.archive10; // L: 1741
						var2 = AbstractWorldMapData.archive8; // L: 1742
						var3 = 0; // L: 1744
						String[] var35 = Login.field930; // L: 1746

						int var24;
						String var25;
						for (var24 = 0; var24 < var35.length; ++var24) { // L: 1747
							var25 = var35[var24]; // L: 1748
							if (var30.tryLoadFileByNames(var25, "")) { // L: 1750
								++var3;
							}
						}

						var35 = Login.field907; // L: 1755

						for (var24 = 0; var24 < var35.length; ++var24) { // L: 1756
							var25 = var35[var24]; // L: 1757
							if (var2.tryLoadFileByNames(var25, "")) { // L: 1759
								++var3;
							}
						}

						var32 = FaceNormal.method4303(); // L: 1766
						if (var3 < var32) { // L: 1767
							Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var32 + "%"; // L: 1768
							Login.Login_loadingPercent = 50; // L: 1769
						} else {
							Login.Login_loadingText = "Loaded title screen"; // L: 1772
							Login.Login_loadingPercent = 50; // L: 1773
							class82.updateGameState(5); // L: 1774
							Client.titleLoadingStage = 70; // L: 1775
						}
					} else if (Client.titleLoadingStage == 70) { // L: 1778
						if (!class20.archive2.isFullyLoaded()) { // L: 1779
							Login.Login_loadingText = "Loading config - " + class20.archive2.loadPercent() + "%"; // L: 1780
							Login.Login_loadingPercent = 60; // L: 1781
						} else if (!BuddyRankComparator.field1380.isFullyLoaded()) { // L: 1784
							Login.Login_loadingText = "Loading config - " + (80 + class117.archive12.loadPercent() / 6) + "%"; // L: 1785
							Login.Login_loadingPercent = 60; // L: 1786
						} else {
							class434.method7615(class20.archive2); // L: 1789
							class291.method5561(class20.archive2); // L: 1790
							Archive var26 = class20.archive2; // L: 1791
							var30 = TaskHandler.archive11; // L: 1792
							KitDefinition.KitDefinition_archive = var26; // L: 1794
							KitDefinition.KitDefinition_modelsArchive = var30; // L: 1795
							KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1796
							AbstractByteArrayCopier.method5501(class20.archive2, TaskHandler.archive11, Client.isLowDetail); // L: 1798
							var2 = class20.archive2; // L: 1799
							var22 = TaskHandler.archive11; // L: 1800
							NPCComposition.NpcDefinition_archive = var2; // L: 1802
							NPCComposition.NpcDefinition_modelArchive = var22; // L: 1803
							UserComparator4.method2655(class20.archive2); // L: 1805
							Archive var23 = class20.archive2; // L: 1806
							Archive var31 = TaskHandler.archive11; // L: 1807
							boolean var6 = Client.isMembersWorld; // L: 1808
							Font var7 = class116.fontPlain11; // L: 1809
							ItemComposition.ItemComposition_archive = var23; // L: 1811
							ItemComposition.ItemComposition_modelArchive = var31; // L: 1812
							ItemComposition.ItemComposition_inMembersWorld = var6; // L: 1813
							Buddy.ItemComposition_fileCount = ItemComposition.ItemComposition_archive.getGroupFileCount(10); // L: 1814
							class341.ItemComposition_fontPlain11 = var7; // L: 1815
							Archive var8 = class20.archive2; // L: 1817
							Archive var9 = Calendar.archive5; // L: 1818
							Archive var10 = Calendar.field3297; // L: 1819
							class343.SequenceDefinition_archive = var8; // L: 1821
							SequenceDefinition.SequenceDefinition_animationsArchive = var9; // L: 1822
							SequenceDefinition.SequenceDefinition_skeletonsArchive = var10; // L: 1823
							ClientPreferences.method2400(class20.archive2, TaskHandler.archive11); // L: 1825
							Archive var11 = class20.archive2; // L: 1826
							VarbitComposition.VarbitDefinition_archive = var11; // L: 1828
							class93.method2463(class20.archive2); // L: 1830
							Archive var12 = Skills.archive7; // L: 1831
							Archive var13 = TaskHandler.archive11; // L: 1832
							Archive var14 = AbstractWorldMapData.archive8; // L: 1833
							Archive var15 = class1.archive13; // L: 1834
							class228.Widget_archive = var12; // L: 1836
							class7.Widget_modelsArchive = var13; // L: 1837
							class192.Widget_spritesArchive = var14; // L: 1838
							JagexCache.Widget_fontsArchive = var15; // L: 1839
							Widget.Widget_interfaceComponents = new Widget[class228.Widget_archive.getGroupCount()][]; // L: 1840
							GameObject.Widget_loadedInterfaces = new boolean[class228.Widget_archive.getGroupCount()]; // L: 1841
							class162.method3284(class20.archive2); // L: 1843
							class120.method2822(class20.archive2); // L: 1844
							class92.method2442(class20.archive2); // L: 1845
							UserComparator8.method2664(class20.archive2); // L: 1846
							Client.method1321(class20.archive2); // L: 1847
							Archive var16 = class20.archive2; // L: 1848
							class436.field4682 = var16; // L: 1850
							class118.method2810(class20.archive2); // L: 1852
							class398.HitSplatDefinition_cachedSprites = new class428(AbstractByteArrayCopier.field3293, 54, class21.clientLanguage, class20.archive2); // L: 1853
							class6.Ignored_cached = new class428(AbstractByteArrayCopier.field3293, 47, class21.clientLanguage, class20.archive2); // L: 1854
							class151.varcs = new Varcs(); // L: 1855
							class29.method394(class20.archive2, AbstractWorldMapData.archive8, class1.archive13); // L: 1856
							Archive var17 = class20.archive2; // L: 1857
							Archive var18 = AbstractWorldMapData.archive8; // L: 1858
							HealthBarDefinition.HealthBarDefinition_archive = var17; // L: 1860
							HealthBarDefinition.field1867 = var18; // L: 1861
							PendingSpawn.method2250(class20.archive2, AbstractWorldMapData.archive8); // L: 1863
							Login.Login_loadingText = "Loaded config"; // L: 1864
							Login.Login_loadingPercent = 60; // L: 1865
							Client.titleLoadingStage = 80; // L: 1866
						}
					} else if (Client.titleLoadingStage == 80) { // L: 1869
						var33 = 0; // L: 1870
						if (class21.compass == null) { // L: 1871
							class21.compass = SoundSystem.SpriteBuffer_getSprite(AbstractWorldMapData.archive8, class340.spriteIds.compass, 0);
						} else {
							++var33; // L: 1872
						}

						if (LoginPacket.redHintArrowSprite == null) { // L: 1873
							LoginPacket.redHintArrowSprite = SoundSystem.SpriteBuffer_getSprite(AbstractWorldMapData.archive8, class340.spriteIds.field4378, 0);
						} else {
							++var33; // L: 1874
						}

						IndexedSprite[] var1;
						boolean var4;
						byte[] var5;
						if (class270.mapSceneSprites == null) { // L: 1875
							var2 = AbstractWorldMapData.archive8; // L: 1877
							var3 = class340.spriteIds.mapScenes; // L: 1878
							var5 = var2.takeFile(var3, 0); // L: 1882
							if (var5 == null) { // L: 1883
								var4 = false; // L: 1884
							} else {
								class83.SpriteBuffer_decode(var5); // L: 1887
								var4 = true; // L: 1888
							}

							if (!var4) { // L: 1890
								var1 = null; // L: 1891
							} else {
								var1 = class389.method7083(); // L: 1894
							}

							class270.mapSceneSprites = var1; // L: 1896
						} else {
							++var33; // L: 1898
						}

						if (class11.headIconPkSprites == null) { // L: 1899
							class11.headIconPkSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.headIconsPk, 0);
						} else {
							++var33; // L: 1900
						}

						if (DirectByteArrayCopier.headIconPrayerSprites == null) { // L: 1901
							DirectByteArrayCopier.headIconPrayerSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.field4381, 0);
						} else {
							++var33; // L: 1902
						}

						if (class92.headIconHintSprites == null) { // L: 1903
							class92.headIconHintSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.field4388, 0);
						} else {
							++var33; // L: 1904
						}

						if (WorldMapSection2.mapMarkerSprites == null) { // L: 1905
							WorldMapSection2.mapMarkerSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.field4377, 0);
						} else {
							++var33; // L: 1906
						}

						if (MouseHandler.crossSprites == null) { // L: 1907
							MouseHandler.crossSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.field4384, 0);
						} else {
							++var33; // L: 1908
						}

						if (class65.mapDotSprites == null) { // L: 1909
							class65.mapDotSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.field4383, 0);
						} else {
							++var33; // L: 1910
						}

						if (MusicPatchNode2.scrollBarSprites == null) { // L: 1911
							var2 = AbstractWorldMapData.archive8; // L: 1913
							var3 = class340.spriteIds.field4386; // L: 1914
							var5 = var2.takeFile(var3, 0); // L: 1918
							if (var5 == null) { // L: 1919
								var4 = false; // L: 1920
							} else {
								class83.SpriteBuffer_decode(var5); // L: 1923
								var4 = true; // L: 1924
							}

							if (!var4) { // L: 1926
								var1 = null; // L: 1927
							} else {
								var1 = class389.method7083(); // L: 1930
							}

							MusicPatchNode2.scrollBarSprites = var1; // L: 1932
						} else {
							++var33; // L: 1934
						}

						if (class343.modIconSprites == null) { // L: 1935
							var2 = AbstractWorldMapData.archive8; // L: 1937
							var3 = class340.spriteIds.field4385; // L: 1938
							var5 = var2.takeFile(var3, 0); // L: 1942
							if (var5 == null) { // L: 1943
								var4 = false; // L: 1944
							} else {
								class83.SpriteBuffer_decode(var5); // L: 1947
								var4 = true; // L: 1948
							}

							if (!var4) { // L: 1950
								var1 = null; // L: 1951
							} else {
								var1 = class389.method7083(); // L: 1954
							}

							class343.modIconSprites = var1; // L: 1956
						} else {
							++var33; // L: 1958
						}

						if (var33 < 11) { // L: 1959
							Login.Login_loadingText = "Loading sprites - " + var33 * 100 / 12 + "%"; // L: 1960
							Login.Login_loadingPercent = 70; // L: 1961
						} else {
							AbstractFont.AbstractFont_modIconSprites = class343.modIconSprites; // L: 1964
							LoginPacket.redHintArrowSprite.normalize(); // L: 1965
							var20 = (int)(Math.random() * 21.0D) - 10; // L: 1966
							int var21 = (int)(Math.random() * 21.0D) - 10; // L: 1967
							var3 = (int)(Math.random() * 21.0D) - 10; // L: 1968
							var32 = (int)(Math.random() * 41.0D) - 20; // L: 1969
							class270.mapSceneSprites[0].shiftColors(var20 + var32, var21 + var32, var32 + var3); // L: 1970
							Login.Login_loadingText = "Loaded sprites"; // L: 1971
							Login.Login_loadingPercent = 70; // L: 1972
							Client.titleLoadingStage = 90; // L: 1973
						}
					} else if (Client.titleLoadingStage == 90) { // L: 1976
						if (!class293.field3349.isFullyLoaded()) { // L: 1977
							Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1978
							Login.Login_loadingPercent = 90; // L: 1979
						} else {
							UrlRequest.textureProvider = new TextureProvider(class293.field3349, AbstractWorldMapData.archive8, 20, class260.clientPreferences.method2323(), Client.isLowDetail ? 64 : 128); // L: 1982
							Rasterizer3D.Rasterizer3D_setTextureLoader(UrlRequest.textureProvider); // L: 1983
							Rasterizer3D.Rasterizer3D_setBrightness(class260.clientPreferences.method2323()); // L: 1984
							Client.titleLoadingStage = 100; // L: 1985
						}
					} else if (Client.titleLoadingStage == 100) { // L: 1988
						var33 = UrlRequest.textureProvider.getLoadedPercentage(); // L: 1989
						if (var33 < 100) { // L: 1990
							Login.Login_loadingText = "Loading textures - " + var33 + "%"; // L: 1991
							Login.Login_loadingPercent = 90; // L: 1992
						} else {
							Login.Login_loadingText = "Loaded textures"; // L: 1995
							Login.Login_loadingPercent = 90; // L: 1996
							Client.titleLoadingStage = 110; // L: 1997
						}
					} else if (Client.titleLoadingStage == 110) { // L: 2000
						class309.mouseRecorder = new MouseRecorder(); // L: 2001
						GameEngine.taskHandler.newThreadTask(class309.mouseRecorder, 10); // L: 2002
						Login.Login_loadingText = "Loaded input handler"; // L: 2003
						Login.Login_loadingPercent = 92; // L: 2004
						Client.titleLoadingStage = 120; // L: 2005
					} else if (Client.titleLoadingStage == 120) { // L: 2008
						if (!Actor.archive10.tryLoadFileByNames("huffman", "")) { // L: 2009
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 2010
							Login.Login_loadingPercent = 94; // L: 2011
						} else {
							Huffman var0 = new Huffman(Actor.archive10.takeFileByNames("huffman", "")); // L: 2014
							class18.huffman = var0; // L: 2016
							Login.Login_loadingText = "Loaded wordpack"; // L: 2018
							Login.Login_loadingPercent = 94; // L: 2019
							Client.titleLoadingStage = 130; // L: 2020
						}
					} else if (Client.titleLoadingStage == 130) { // L: 2023
						if (!Skills.archive7.isFullyLoaded()) { // L: 2024
							Login.Login_loadingText = "Loading interfaces - " + Skills.archive7.loadPercent() * 4 / 5 + "%"; // L: 2025
							Login.Login_loadingPercent = 96; // L: 2026
						} else if (!class117.archive12.isFullyLoaded()) { // L: 2029
							Login.Login_loadingText = "Loading interfaces - " + (80 + class117.archive12.loadPercent() / 6) + "%"; // L: 2030
							Login.Login_loadingPercent = 96; // L: 2031
						} else if (!class1.archive13.isFullyLoaded()) { // L: 2034
							Login.Login_loadingText = "Loading interfaces - " + (96 + class1.archive13.loadPercent() / 50) + "%"; // L: 2035
							Login.Login_loadingPercent = 96; // L: 2036
						} else {
							Login.Login_loadingText = "Loaded interfaces"; // L: 2039
							Login.Login_loadingPercent = 98; // L: 2040
							Client.titleLoadingStage = 140; // L: 2041
						}
					} else if (Client.titleLoadingStage == 140) { // L: 2044
						Login.Login_loadingPercent = 100; // L: 2045
						if (!GrandExchangeOffer.archive19.tryLoadGroupByName(WorldMapCacheName.field2867.name)) { // L: 2046
							Login.Login_loadingText = "Loading world map - " + GrandExchangeOffer.archive19.groupLoadPercentByName(WorldMapCacheName.field2867.name) / 10 + "%"; // L: 2047
						} else {
							if (class344.worldMap == null) { // L: 2050
								class344.worldMap = new WorldMap(); // L: 2051
								class344.worldMap.init(GrandExchangeOffer.archive19, class174.archive18, ClanSettings.archive20, class116.fontBold12, Client.fontsMap, class270.mapSceneSprites); // L: 2052
							}

							Login.Login_loadingText = "Loaded world map"; // L: 2054
							Client.titleLoadingStage = 150; // L: 2055
						}
					} else if (Client.titleLoadingStage == 150) { // L: 2058
						class82.updateGameState(10); // L: 2059
					}
				}
			}
		} else {
			byte var19 = 0; // L: 1641
			var33 = var19 + Calendar.archive5.percentage() * 4 / 100; // L: 1642
			var33 += Calendar.field3297.percentage() * 4 / 100; // L: 1643
			var33 += class20.archive2.percentage() * 2 / 100; // L: 1644
			var33 += Skills.archive7.percentage() * 2 / 100; // L: 1645
			var33 += WorldMapArchiveLoader.archive4.percentage() * 6 / 100; // L: 1646
			var33 += class21.archive9.percentage() * 4 / 100; // L: 1647
			var33 += MouseHandler.archive6.percentage() * 2 / 100; // L: 1648
			var33 += TaskHandler.archive11.percentage() * 55 / 100; // L: 1649
			var33 += AbstractWorldMapData.archive8.percentage() * 2 / 100; // L: 1650
			var33 += class293.field3349.percentage() * 2 / 100; // L: 1651
			var33 += Actor.archive10.percentage() * 2 / 100; // L: 1652
			var33 += WorldMapRegion.field2708.percentage() * 2 / 100; // L: 1653
			var33 += class117.archive12.percentage() * 2 / 100; // L: 1654
			var33 += class1.archive13.percentage() * 2 / 100; // L: 1655
			var33 += InvDefinition.archive14.percentage() * 2 / 100; // L: 1656
			var33 += WorldMapRegion.archive15.percentage() * 2 / 100; // L: 1657
			var33 += GrandExchangeOffer.archive19.percentage() / 100; // L: 1658
			var33 += class174.archive18.percentage() / 100; // L: 1659
			var33 += ClanSettings.archive20.percentage() / 100; // L: 1660
			var33 += BuddyRankComparator.field1380.percentage() / 100; // L: 1661
			var33 += class155.archive17.method5802() && class155.archive17.isFullyLoaded() ? 1 : 0; // L: 1662
			if (var33 != 100) { // L: 1663
				if (var33 != 0) { // L: 1664
					Login.Login_loadingText = "Checking for updates - " + var33 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1665
			} else {
				class29.method395(Calendar.archive5, "Animations"); // L: 1668
				class29.method395(Calendar.field3297, "Skeletons"); // L: 1669
				class29.method395(WorldMapArchiveLoader.archive4, "Sound FX"); // L: 1670
				class29.method395(class21.archive9, "Maps"); // L: 1671
				class29.method395(MouseHandler.archive6, "Music Tracks"); // L: 1672
				class29.method395(TaskHandler.archive11, "Models"); // L: 1673
				class29.method395(AbstractWorldMapData.archive8, "Sprites"); // L: 1674
				class29.method395(WorldMapRegion.field2708, "Music Jingles"); // L: 1675
				class29.method395(InvDefinition.archive14, "Music Samples"); // L: 1676
				class29.method395(WorldMapRegion.archive15, "Music Patches"); // L: 1677
				class29.method395(GrandExchangeOffer.archive19, "World Map"); // L: 1678
				class29.method395(class174.archive18, "World Map Geography"); // L: 1679
				class29.method395(ClanSettings.archive20, "World Map Ground"); // L: 1680
				class340.spriteIds = new GraphicsDefaults(); // L: 1681
				class340.spriteIds.decode(class155.archive17); // L: 1682
				Login.Login_loadingText = "Loaded update list"; // L: 1683
				Login.Login_loadingPercent = 30; // L: 1684
				Client.titleLoadingStage = 45; // L: 1685
			}
		}
	} // L: 1605 1611 1638 1666 1686 1711 1728 1737 1770 1776 1782 1787 1867 1962 1974 1980 1986 1993 1998 2006 2012 2021 2027 2032 2037 2042 2048 2056 2060 2062

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-96"
	)
	static int method3637(int var0, int var1) {
		int var2 = var1 - 334; // L: 5627
		if (var2 < 0) { // L: 5628
			var2 = 0;
		} else if (var2 > 100) { // L: 5629
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight; // L: 5630
		return var0 * var3 / 256; // L: 5631
	}
}
