import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public static AbstractArchive field2034;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2095995371
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("ao")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("ab")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("aw")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ad")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("al")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("as")
	@Export("models")
	int[] models;
	@ObfuscatedName("ag")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1};
		this.nonSelectable = false; // L: 22
	} // L: 26

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;S)V",
		garbageValue = "-1456"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 41
			if (var2 == 0) { // L: 42
				return; // L: 45
			}

			this.decodeNext(var1, var2); // L: 43
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-1126295738"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 48
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 49
				var3 = var1.readUnsignedByte(); // L: 50
				this.models2 = new int[var3]; // L: 51

				for (var4 = 0; var4 < var3; ++var4) { // L: 52
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 54
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 55
				var3 = var1.readUnsignedByte(); // L: 56
				this.recolorFrom = new short[var3]; // L: 57
				this.recolorTo = new short[var3]; // L: 58

				for (var4 = 0; var4 < var3; ++var4) { // L: 59
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 60
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 61
				}
			} else if (var2 == 41) { // L: 64
				var3 = var1.readUnsignedByte(); // L: 65
				this.retextureFrom = new short[var3]; // L: 66
				this.retextureTo = new short[var3]; // L: 67

				for (var4 = 0; var4 < var3; ++var4) { // L: 68
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 69
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 70
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 73
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 75

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-864799211"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 78
			return true;
		} else {
			boolean var1 = true; // L: 79

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 80
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 81
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljj;",
		garbageValue = "23"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) {
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length];

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) {
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length);
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) { // L: 96
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 97
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-747233225"
	)
	public boolean method3780() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) { // L: 106
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 107
				var1 = false;
			}
		}

		return var1; // L: 109
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljj;",
		garbageValue = "412957617"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0; // L: 114

		for (int var3 = 0; var3 < 5; ++var3) { // L: 115
			if (this.models[var3] != -1) {
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 118
		int var4;
		if (this.recolorFrom != null) { // L: 119
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 121
			}
		}

		if (this.retextureFrom != null) {
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
			}
		}

		return var5;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([Lpk;IB)Lpk;",
		garbageValue = "99"
	)
	@Export("findEnumerated")
	public static class391 findEnumerated(class391[] var0, int var1) {
		class391[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class391 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "0"
	)
	public static void method3804(AbstractArchive var0) {
	} // L: 14

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1947071788"
	)
	public static int method3778(CharSequence var0) {
		return class442.method8005(var0, 10, true);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IIIII)Z",
		garbageValue = "29544109"
	)
	static final boolean method3805(Model var0, int var1, int var2, int var3, int var4) {
		if (!Player.method2361()) { // L: 82
			return false;
		} else {
			int var6;
			int var7;
			int var8;
			int var11;
			int var12;
			int var13;
			int var14;
			int var21;
			int var22;
			if (!ViewportMouse.ViewportMouse_false0) { // L: 84
				int var5 = Scene.Scene_cameraPitchSine; // L: 85
				var6 = Scene.Scene_cameraPitchCosine; // L: 86
				var7 = Scene.Scene_cameraYawSine; // L: 87
				var8 = Scene.Scene_cameraYawCosine; // L: 88
				byte var9 = 50; // L: 89
				short var10 = 3500; // L: 90
				var11 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4567()) * var9 / Rasterizer3D.method4620(); // L: 91
				var12 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4568()) * var9 / Rasterizer3D.method4620(); // L: 92
				var13 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.method4567()) * var10 / Rasterizer3D.method4620(); // L: 93
				var14 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.method4568()) * var10 / Rasterizer3D.method4620(); // L: 94
				int var16 = var12 * var6 + var5 * var9 >> 16; // L: 98
				var21 = class10.method99(var12, var9, var6, var5); // L: 101
				int var17 = var14 * var6 + var10 * var5 >> 16; // L: 105
				var22 = class10.method99(var14, var10, var6, var5); // L: 108
				int var15 = class228.method4316(var11, var21, var8, var7); // L: 110
				int var18 = var21 * var8 + var7 * var11 >> 16; // L: 113
				var11 = var15; // L: 116
				var15 = class228.method4316(var13, var22, var8, var7); // L: 117
				int var19 = var8 * var22 + var13 * var7 >> 16; // L: 120
				ViewportMouse.field2855 = (var15 + var11) / 2; // L: 124
				ViewportMouse.field2862 = (var17 + var16) / 2; // L: 125
				class472.field4889 = (var18 + var19) / 2; // L: 126
				ViewportMouse.field2861 = (var15 - var11) / 2; // L: 127
				class206.field2094 = (var17 - var16) / 2; // L: 128
				class106.field1375 = (var19 - var18) / 2; // L: 129
				ViewportMouse.field2859 = Math.abs(ViewportMouse.field2861); // L: 130
				class127.field1519 = Math.abs(class206.field2094); // L: 131
				class469.field4868 = Math.abs(class106.field1375); // L: 132
			}

			class247 var20 = (class247)var0.field2782.get(var1); // L: 134
			var6 = var2 + var20.field2709; // L: 135
			var7 = var3 + var20.field2708; // L: 136
			var8 = var4 + var20.field2707; // L: 137
			var21 = var20.field2710; // L: 138
			var22 = var20.field2711; // L: 139
			var11 = var20.field2712; // L: 140
			var12 = ViewportMouse.field2855 - var6; // L: 141
			var13 = ViewportMouse.field2862 - var7; // L: 142
			var14 = class472.field4889 - var8; // L: 143
			if (Math.abs(var12) > var21 + ViewportMouse.field2859) { // L: 144
				return false; // L: 145
			} else if (Math.abs(var13) > var22 + class127.field1519) { // L: 147
				return false; // L: 148
			} else if (Math.abs(var14) > var11 + class469.field4868) { // L: 150
				return false; // L: 151
			} else if (Math.abs(var14 * class206.field2094 - var13 * class106.field1375) > var22 * class469.field4868 + var11 * class127.field1519) { // L: 153
				return false; // L: 154
			} else if (Math.abs(var12 * class106.field1375 - var14 * ViewportMouse.field2861) > var11 * ViewportMouse.field2859 + var21 * class469.field4868) { // L: 156
				return false; // L: 157
			} else {
				return Math.abs(var13 * ViewportMouse.field2861 - var12 * class206.field2094) <= var21 * class127.field1519 + var22 * ViewportMouse.field2859; // L: 159
			}
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-843602483"
	)
	static void method3775() {
		if (class93.field1152 == Client.field540) { // L: 1500
			class141.archive4 = WorldMapLabelSize.newArchive(class376.field4402.field4407, false, true, true, false); // L: 1501
			UserComparator6.field1508 = WorldMapLabelSize.newArchive(class376.field4391.field4407, true, true, true, false); // L: 1502
			GameEngine.field201 = WorldMapLabelSize.newArchive(class376.field4393.field4407, false, true, true, false); // L: 1503
			SpriteMask.field3623 = WorldMapLabelSize.newArchive(class376.field4395.field4407, false, true, true, false); // L: 1504
			class67.archive13 = WorldMapLabelSize.newArchive(class376.field4398.field4407, true, false, true, false); // L: 1505
			class93.field1170 = WorldMapLabelSize.newArchive(class376.field4399.field4407, false, true, true, false); // L: 1506
			GraphicsObject.field883 = WorldMapLabelSize.newArchive(class376.field4384.field4407, false, true, true, false); // L: 1507
			HorizontalAlignment.method3850(20, "Connecting to update server"); // L: 1508
			class427.method7851(class93.field1155); // L: 1509
		} else {
			int var0;
			byte var43;
			if (class93.field1155 == Client.field540) { // L: 1512
				var43 = 0; // L: 1513
				var0 = var43 + class141.archive4.percentage() * 53 / 100; // L: 1514
				var0 += UserComparator6.field1508.percentage() * 5 / 100; // L: 1515
				var0 += GameEngine.field201.percentage() * 36 / 100; // L: 1516
				var0 += SpriteMask.field3623.percentage() / 100; // L: 1517
				var0 += class67.archive13.percentage() / 100; // L: 1518
				var0 += class93.field1170.percentage() * 3 / 100; // L: 1519
				var0 += GraphicsObject.field883.percentage() / 100; // L: 1520
				if (var0 != 100) { // L: 1521
					if (var0 != 0) { // L: 1522
						HorizontalAlignment.method3850(30, "Checking for updates - " + var0 + "%");
					}

				} else {
					UserComparator6.method2944(class141.archive4, "Sound FX"); // L: 1525
					UserComparator6.method2944(UserComparator6.field1508, "Music Tracks"); // L: 1526
					UserComparator6.method2944(GameEngine.field201, "Sprites"); // L: 1527
					UserComparator6.method2944(class93.field1170, "Music Samples"); // L: 1528
					UserComparator6.method2944(GraphicsObject.field883, "Music Patches"); // L: 1529
					HorizontalAlignment.method3850(40, "Loaded update list"); // L: 1530
					class427.method7851(class93.field1161); // L: 1531
				}
			} else if (class93.field1161 == Client.field540) { // L: 1534
				boolean var44 = !Client.isLowDetail; // L: 1535
				class472.field4892 = -1623100384; // L: 1538
				PcmPlayer.PcmPlayer_stereo = var44; // L: 1539
				class203.field2080 = 2; // L: 1540
				ArrayList var33 = new ArrayList(3); // L: 1542
				TaskHandler var37 = class350.taskHandler; // L: 1544
				short var39 = 2048; // L: 1545
				if (class472.field4892 * 722468864 == 0) { // L: 1547
					throw new IllegalStateException();
				} else {
					if (var39 < 256) { // L: 1549
						var39 = 256;
					}

					PcmPlayer var38;
					try {
						PcmPlayer var40 = class129.pcmPlayerProvider.player(); // L: 1551
						var40.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 1552
						var40.field270 = var39; // L: 1553
						var40.init(); // L: 1554
						var40.capacity = (var39 & -1024) + 1024; // L: 1555
						if (var40.capacity > 16384) { // L: 1556
							var40.capacity = 16384;
						}

						var40.open(var40.capacity); // L: 1557
						if (class203.field2080 > 0 && PcmPlayer.soundSystem == null) { // L: 1558
							PcmPlayer.soundSystem = new SoundSystem(); // L: 1559
							class142.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 1560
							class142.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 1561
						}

						if (PcmPlayer.soundSystem != null) { // L: 1563
							if (PcmPlayer.soundSystem.players[0] != null) { // L: 1564
								throw new IllegalArgumentException();
							}

							PcmPlayer.soundSystem.players[0] = var40; // L: 1565
						}

						var38 = var40; // L: 1567
					} catch (Throwable var32) { // L: 1570
						var38 = new PcmPlayer(); // L: 1571
					}

					class144.pcmPlayer1 = var38; // L: 1573
					HealthBarUpdate.pcmStreamMixer = new PcmStreamMixer(); // L: 1574
					PcmStreamMixer var41 = new PcmStreamMixer(); // L: 1575
					var41.addSubStream(HealthBarUpdate.pcmStreamMixer); // L: 1576

					for (int var6 = 0; var6 < 3; ++var6) { // L: 1577
						MidiPcmStream var42 = new MidiPcmStream(class144.pcmPlayer1); // L: 1578
						var42.method6009(9, 128); // L: 1579
						var41.addSubStream(var42); // L: 1580
						var33.add(var42); // L: 1581
					}

					class144.pcmPlayer1.setStream(var41); // L: 1583
					class11.method109(GraphicsObject.field883, class93.field1170, class141.archive4, var33); // L: 1584
					class86.decimator = new Decimator(22050, class472.field4892 * 722468864); // L: 1585
					HorizontalAlignment.method3850(60, "Prepared sound engine"); // L: 1586
					class427.method7851(class93.field1158); // L: 1587
				}
			} else {
				int var27;
				if (Client.field540 == class93.field1158) { // L: 1590
					if (class12.field54 == null) { // L: 1591
						class12.field54 = new Fonts(GameEngine.field201, class67.archive13);
					}

					FontName[] var47 = new FontName[]{FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12}; // L: 1594
					var27 = var47.length; // L: 1596
					Fonts var35 = class12.field54; // L: 1597
					FontName[] var36 = new FontName[]{FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12}; // L: 1600
					Client.field623 = var35.createMap(var36); // L: 1602
					if (Client.field623.size() < var27) { // L: 1603
						HorizontalAlignment.method3850(80, "Loading fonts - " + Client.field623.size() * 100 / var27 + "%"); // L: 1604
					} else {
						DevicePcmPlayerProvider.field96 = (Font)Client.field623.get(FontName.FontName_plain11); // L: 1607
						class316.fontPlain12 = (Font)Client.field623.get(FontName.FontName_plain12); // L: 1608
						DevicePcmPlayerProvider.fontBold12 = (Font)Client.field623.get(FontName.FontName_bold12); // L: 1609
						class166.field1810 = Client.field621.get(); // L: 1610
						HorizontalAlignment.method3850(80, "Loaded fonts"); // L: 1611
						class427.method7851(class93.field1159); // L: 1612
					}
				} else if (Client.field540 == class93.field1159) { // L: 1615
					var0 = class17.method254(SpriteMask.field3623, GameEngine.field201); // L: 1616
					var27 = WorldMapIcon_0.method5598(GameEngine.field201); // L: 1617
					if (var0 < var27) { // L: 1618
						HorizontalAlignment.method3850(90, "Loading title screen - " + var0 * 100 / var27 + "%"); // L: 1619
					} else {
						HorizontalAlignment.method3850(100, "Loaded title screen"); // L: 1622
						if (ScriptFrame.field460) { // L: 1623
							FaceNormal.method4886(5); // L: 1624
							class427.method7851(class93.field1154); // L: 1625
						} else {
							class427.method7851(class93.field1156); // L: 1628
						}

					}
				} else if (Client.field540 == class93.field1154) { // L: 1632
					FaceNormal.method4886(10); // L: 1633
				} else {
					Archive var26;
					if (Client.field540 == class93.field1156) { // L: 1636
						UrlRequester.field1452 = WorldMapLabelSize.newArchive(class376.field4405.field4407, false, true, true, false); // L: 1637
						class17.field75 = WorldMapLabelSize.newArchive(class376.field4386.field4407, false, true, true, false); // L: 1638
						UserComparator9.archive2 = WorldMapLabelSize.newArchive(class376.field4388.field4407, true, false, true, false); // L: 1639
						GrandExchangeOfferOwnWorldComparator.field479 = WorldMapLabelSize.newArchive(class376.field4397.field4407, false, true, true, false); // L: 1640
						class73.field909 = WorldMapLabelSize.newArchive(class376.field4390.field4407, true, true, true, false); // L: 1641
						class470.field4874 = WorldMapLabelSize.newArchive(class376.field4392.field4407, false, true, true, false); // L: 1642
						class107.field1377 = WorldMapLabelSize.newArchive(class376.field4394.field4407, false, true, true, false); // L: 1643
						WorldMapScaleHandler.field3167 = WorldMapLabelSize.newArchive(class376.field4400.field4407, false, true, true, false); // L: 1644
						GrandExchangeOfferOwnWorldComparator.archive12 = WorldMapLabelSize.newArchive(class376.field4385.field4407, false, true, true, false); // L: 1645
						SceneTilePaint.field2883 = WorldMapLabelSize.newArchive(class376.field4401.field4407, true, true, true, false); // L: 1646
						PlayerType.field4332 = WorldMapLabelSize.newArchive(class376.field4387.field4407, false, true, true, false); // L: 1647
						SoundCache.field308 = WorldMapLabelSize.newArchive(class376.field4403.field4407, false, true, true, false); // L: 1648
						class153.field1726 = WorldMapLabelSize.newArchive(class376.field4404.field4407, false, true, true, false); // L: 1649
						class439.field4743 = WorldMapLabelSize.newArchive(class376.field4396.field4407, false, true, true, false); // L: 1650
						var27 = class376.field4406.field4407; // L: 1652
						ArchiveDisk var34 = null; // L: 1654
						if (JagexCache.JagexCache_dat2File != null) { // L: 1655
							var34 = new ArchiveDisk(var27, JagexCache.JagexCache_dat2File, UserComparator5.JagexCache_idxFiles[var27], 1000000); // L: 1656
						}

						var26 = new Archive(var34, Decimator.field392, ChatChannel.field1023, var27, false, true, true, true, true); // L: 1658
						PcmPlayer.field283 = var26; // L: 1660
						HorizontalAlignment.method3850(20, "Connecting to update server"); // L: 1661
						class427.method7851(class93.field1168); // L: 1662
					} else if (class93.field1168 == Client.field540) { // L: 1665
						var43 = 0; // L: 1666
						var0 = var43 + UrlRequester.field1452.percentage() * 5 / 100; // L: 1667
						var0 += class17.field75.percentage() * 2 / 100; // L: 1668
						var0 += UserComparator9.archive2.percentage() / 100; // L: 1669
						var0 += GrandExchangeOfferOwnWorldComparator.field479.percentage() / 100; // L: 1670
						var0 += class73.field909.percentage() * 10 / 100; // L: 1671
						var0 += class470.field4874.percentage() * 65 / 100; // L: 1672
						var0 += class107.field1377.percentage() / 100; // L: 1673
						var0 += WorldMapScaleHandler.field3167.percentage() / 100; // L: 1674
						var0 += GrandExchangeOfferOwnWorldComparator.archive12.percentage() * 6 / 100; // L: 1675
						var0 += SoundCache.field308.percentage() / 100; // L: 1676
						var0 += PlayerType.field4332.percentage() * 2 / 100; // L: 1677
						var0 += class153.field1726.percentage() * 2 / 100; // L: 1678
						var0 += class439.field4743.percentage() / 100; // L: 1679
						var0 += PcmPlayer.field283.percentage() / 100; // L: 1680
						var0 += SceneTilePaint.field2883.method6907() && SceneTilePaint.field2883.isFullyLoaded() ? 1 : 0; // L: 1681
						if (var0 != 100) { // L: 1682
							if (var0 != 0) { // L: 1683
								HorizontalAlignment.method3850(30, "Checking for updates - " + var0 + "%");
							}

						} else {
							UserComparator6.method2944(UrlRequester.field1452, "Animations"); // L: 1686
							UserComparator6.method2944(class17.field75, "Skeletons"); // L: 1687
							UserComparator6.method2944(class73.field909, "Maps"); // L: 1688
							UserComparator6.method2944(class470.field4874, "Models"); // L: 1689
							UserComparator6.method2944(WorldMapScaleHandler.field3167, "Music Jingles"); // L: 1690
							UserComparator6.method2944(SoundCache.field308, "World Map"); // L: 1691
							UserComparator6.method2944(PlayerType.field4332, "World Map Geography"); // L: 1692
							UserComparator6.method2944(class153.field1726, "World Map Ground"); // L: 1693
							class345.field3680 = new GraphicsDefaults(); // L: 1694
							class345.field3680.decode(SceneTilePaint.field2883); // L: 1695
							HorizontalAlignment.method3850(30, "Loaded update list"); // L: 1696
							class427.method7851(class93.field1164); // L: 1697
						}
					} else if (class93.field1164 == Client.field540) { // L: 1700
						LoginType.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1701

						for (var0 = 0; var0 < 4; ++var0) { // L: 1702
							Client.collisionMaps[var0] = new CollisionMap(104, 104);
						}

						Interpreter.field877 = new SpritePixels(512, 512); // L: 1703
						HorizontalAlignment.method3850(30, "Starting game engine..."); // L: 1704
						class427.method7851(class93.field1160); // L: 1705
					} else if (class93.field1160 != Client.field540) { // L: 1708
						if (class93.field1153 == Client.field540) { // L: 1820
							var0 = 0; // L: 1821
							if (GroundObject.field2556 == null) { // L: 1822
								GroundObject.field2556 = GraphicsObject.SpriteBuffer_getSprite(GameEngine.field201, class345.field3680.field4851, 0);
							} else {
								++var0; // L: 1823
							}

							if (class315.redHintArrowSprite == null) { // L: 1824
								class315.redHintArrowSprite = GraphicsObject.SpriteBuffer_getSprite(GameEngine.field201, class345.field3680.field4843, 0);
							} else {
								++var0; // L: 1825
							}

							if (CollisionMap.mapSceneSprites == null) { // L: 1826
								CollisionMap.mapSceneSprites = class225.method4272(GameEngine.field201, class345.field3680.field4842, 0);
							} else {
								++var0; // L: 1827
							}

							if (class91.field1118 == null) { // L: 1828
								class91.field1118 = Player.method2379(GameEngine.field201, class345.field3680.field4845, 0);
							} else {
								++var0; // L: 1829
							}

							if (class334.field3621 == null) { // L: 1830
								class334.field3621 = Player.method2379(GameEngine.field201, class345.field3680.field4846, 0);
							} else {
								++var0; // L: 1831
							}

							if (class137.field1630 == null) { // L: 1832
								class137.field1630 = Player.method2379(GameEngine.field201, class345.field3680.field4844, 0);
							} else {
								++var0; // L: 1833
							}

							if (class33.field164 == null) { // L: 1834
								class33.field164 = Player.method2379(GameEngine.field201, class345.field3680.field4848, 0);
							} else {
								++var0; // L: 1835
							}

							if (class286.field3130 == null) { // L: 1836
								class286.field3130 = Player.method2379(GameEngine.field201, class345.field3680.field4849, 0);
							} else {
								++var0; // L: 1837
							}

							if (class25.field115 == null) { // L: 1838
								class25.field115 = Player.method2379(GameEngine.field201, class345.field3680.field4850, 0);
							} else {
								++var0; // L: 1839
							}

							if (FriendSystem.scrollBarSprites == null) { // L: 1840
								FriendSystem.scrollBarSprites = class225.method4272(GameEngine.field201, class345.field3680.field4847, 0);
							} else {
								++var0; // L: 1841
							}

							if (class168.field1834 == null) { // L: 1842
								class168.field1834 = class225.method4272(GameEngine.field201, class345.field3680.field4852, 0);
							} else {
								++var0; // L: 1843
							}

							if (var0 < 11) { // L: 1844
								HorizontalAlignment.method3850(70, "Loading sprites - " + var0 * 100 / 12 + "%"); // L: 1845
							} else {
								AbstractFont.AbstractFont_modIconSprites = class168.field1834; // L: 1848
								class315.redHintArrowSprite.normalize(); // L: 1849
								var27 = (int)(Math.random() * 21.0D) - 10; // L: 1850
								int var30 = (int)(Math.random() * 21.0D) - 10; // L: 1851
								int var31 = (int)(Math.random() * 21.0D) - 10; // L: 1852
								int var4 = (int)(Math.random() * 41.0D) - 20; // L: 1853
								CollisionMap.mapSceneSprites[0].shiftColors(var4 + var27, var4 + var30, var31 + var4); // L: 1854
								HorizontalAlignment.method3850(60, "Loaded sprites"); // L: 1855
								class427.method7851(class93.field1162); // L: 1856
							}
						} else if (Client.field540 == class93.field1162) { // L: 1859
							if (!class107.field1377.isFullyLoaded()) { // L: 1860
								HorizontalAlignment.method3850(70, "Loading textures - " + "0%"); // L: 1861
							} else {
								SpriteMask.field3627 = new TextureProvider(class107.field1377, GameEngine.field201, 20, NPC.clientPreferences.method2470(), Client.isLowDetail ? 64 : 128); // L: 1864
								Rasterizer3D.method4611(SpriteMask.field3627); // L: 1865
								Rasterizer3D.method4564(NPC.clientPreferences.method2470()); // L: 1866
								class427.method7851(class93.field1163); // L: 1867
							}
						} else if (Client.field540 == class93.field1163) { // L: 1870
							var0 = SpriteMask.field3627.getLoadedPercentage(); // L: 1871
							if (var0 < 100) { // L: 1872
								HorizontalAlignment.method3850(80, "Loading textures - " + var0 + "%"); // L: 1873
							} else {
								HorizontalAlignment.method3850(90, "Loaded textures"); // L: 1876
								class427.method7851(class93.field1157); // L: 1877
							}
						} else if (Client.field540 == class93.field1157) { // L: 1880
							Tiles.mouseRecorder = new MouseRecorder(); // L: 1881
							class350.taskHandler.newThreadTask(Tiles.mouseRecorder, 10); // L: 1882
							HorizontalAlignment.method3850(92, "Loaded input handler"); // L: 1883
							class427.method7851(class93.field1165); // L: 1884
						} else if (class93.field1165 == Client.field540) { // L: 1887
							if (!SpriteMask.field3623.tryLoadFileByNames("huffman", "")) { // L: 1888
								HorizontalAlignment.method3850(94, "Loading wordpack - " + 0 + "%"); // L: 1889
							} else {
								Huffman var46 = new Huffman(SpriteMask.field3623.takeFileByNames("huffman", "")); // L: 1892
								KeyHandler.method403(var46); // L: 1893
								HorizontalAlignment.method3850(94, "Loaded wordpack"); // L: 1894
								class427.method7851(class93.field1166); // L: 1895
							}
						} else if (Client.field540 == class93.field1166) { // L: 1898
							if (!GrandExchangeOfferOwnWorldComparator.field479.isFullyLoaded()) { // L: 1899
								HorizontalAlignment.method3850(96, "Loading interfaces - " + GrandExchangeOfferOwnWorldComparator.field479.loadPercent() * 4 / 5 + "%"); // L: 1900
							} else if (!PcmPlayer.field283.isFullyLoaded()) { // L: 1903
								HorizontalAlignment.method3850(96, "Loading interfaces - " + PcmPlayer.field283.loadPercent() * 4 / 5 + "%"); // L: 1904
							} else if (!GrandExchangeOfferOwnWorldComparator.archive12.isFullyLoaded()) { // L: 1907
								HorizontalAlignment.method3850(96, "Loading interfaces - " + (80 + GrandExchangeOfferOwnWorldComparator.archive12.loadPercent() / 6) + "%"); // L: 1908
							} else if (!class67.archive13.isFullyLoaded()) { // L: 1911
								HorizontalAlignment.method3850(96, "Loading interfaces - " + (96 + class67.archive13.loadPercent() / 50) + "%"); // L: 1912
							} else {
								HorizontalAlignment.method3850(98, "Loaded interfaces"); // L: 1915
								if (GrandExchangeOfferOwnWorldComparator.archive12.isValidFileName("version.dat", "")) { // L: 1916
									Buffer var45 = new Buffer(GrandExchangeOfferOwnWorldComparator.archive12.takeFileByNames("version.dat", "")); // L: 1917
									var45.readUnsignedShort(); // L: 1918
								}

								class427.method7851(class93.field1167); // L: 1920
							}
						} else if (Client.field540 == class93.field1167) { // L: 1923
							if (SoundCache.field308.getGroupCount() > 0 && !SoundCache.field308.tryLoadGroupByName(WorldMapCacheName.field3154.name)) { // L: 1924
								HorizontalAlignment.method3850(100, "Loading world map - " + SoundCache.field308.groupLoadPercentByName(WorldMapCacheName.field3154.name) / 10 + "%"); // L: 1925
							} else {
								if (ModeWhere.worldMap == null) { // L: 1928
									ModeWhere.worldMap = new WorldMap(); // L: 1929
									ModeWhere.worldMap.init(SoundCache.field308, PlayerType.field4332, class153.field1726, DevicePcmPlayerProvider.fontBold12, Client.field623, CollisionMap.mapSceneSprites); // L: 1930
								}

								HorizontalAlignment.method3850(100, "Loaded world map"); // L: 1932
								if (ScriptFrame.field460) { // L: 1933
									class427.method7851(class93.field1169); // L: 1934
								} else {
									class427.method7851(class93.field1154); // L: 1937
								}

								Client.field788 = false; // L: 1939
							}
						} else {
							if (Client.field540 == class93.field1169) { // L: 1942
								class276.field3052 = false; // L: 1943
								FaceNormal.method4886(20); // L: 1944
								class102.method2651(class67.field483); // L: 1945
							}

						}
					} else if (!UserComparator9.archive2.isFullyLoaded()) { // L: 1709
						HorizontalAlignment.method3850(40, "Loading config - " + UserComparator9.archive2.loadPercent() + "%"); // L: 1710
					} else if (!class439.field4743.isFullyLoaded()) { // L: 1713
						HorizontalAlignment.method3850(40, "Loading config - " + (80 + GrandExchangeOfferOwnWorldComparator.archive12.loadPercent() / 6) + "%"); // L: 1714
					} else {
						UserComparator10.method2922(UserComparator9.archive2); // L: 1717
						var26 = UserComparator9.archive2; // L: 1718
						FloorUnderlayDefinition.field2195 = var26; // L: 1720
						Archive var1 = UserComparator9.archive2; // L: 1722
						Archive var2 = class470.field4874; // L: 1723
						field2034 = var1; // L: 1725
						KitDefinition_modelsArchive = var2; // L: 1726
						class12.field56 = field2034.getGroupFileCount(3); // L: 1727
						class103.method2663(UserComparator9.archive2, class470.field4874, Client.isLowDetail); // L: 1729
						Archive var3 = UserComparator9.archive2; // L: 1730
						Archive var28 = class470.field4874; // L: 1731
						class191.NpcDefinition_archive = var3; // L: 1733
						Decimator.field395 = var28; // L: 1734
						Archive var5 = UserComparator9.archive2; // L: 1736
						class559.StructDefinition_archive = var5; // L: 1738
						Archive var29 = UserComparator9.archive2; // L: 1740
						Archive var7 = class470.field4874; // L: 1741
						boolean var8 = Client.isMembersWorld; // L: 1742
						Font var9 = DevicePcmPlayerProvider.field96; // L: 1743
						ItemComposition.ItemComposition_archive = var29; // L: 1745
						WorldMapSectionType.ItemComposition_modelArchive = var7; // L: 1746
						class168.ItemComposition_inMembersWorld = var8; // L: 1747
						ItemComposition.ItemComposition_fileCount = ItemComposition.ItemComposition_archive.getGroupFileCount(10); // L: 1748
						FileSystem.field1887 = var9; // L: 1749
						Archive var10 = UserComparator9.archive2; // L: 1751
						Archive var11 = UrlRequester.field1452; // L: 1752
						Archive var12 = class17.field75; // L: 1753
						SequenceDefinition.SequenceDefinition_archive = var10; // L: 1755
						class343.SequenceDefinition_animationsArchive = var11; // L: 1756
						UrlRequest.SequenceDefinition_skeletonsArchive = var12; // L: 1757
						Archive var13 = UserComparator9.archive2; // L: 1759
						Archive var14 = class470.field4874; // L: 1760
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var13; // L: 1762
						SpotAnimationDefinition.field2173 = var14; // L: 1763
						GrandExchangeOfferUnitPriceComparator.method7156(UserComparator9.archive2); // L: 1765
						WorldMap.method8917(UserComparator9.archive2); // L: 1766
						class243.field2620 = new class340(GrandExchangeOfferOwnWorldComparator.field479, class470.field4874, GameEngine.field201, class67.archive13, PcmPlayer.field283); // L: 1767
						Archive var15 = UserComparator9.archive2; // L: 1768
						InvDefinition.InvDefinition_archive = var15; // L: 1770
						UserComparator5.method2892(UserComparator9.archive2); // L: 1772
						ApproximateRouteStrategy.method1185(UserComparator9.archive2); // L: 1773
						method3804(UserComparator9.archive2); // L: 1774
						class286.method5689(UserComparator9.archive2); // L: 1775
						ModeWhere.method7206(UserComparator9.archive2); // L: 1776
						Archive var16 = UserComparator9.archive2; // L: 1777
						class527.field5175 = var16; // L: 1779
						DevicePcmPlayerProvider.field99 = new class517(HorizontalAlignment.field2089, 54, GraphicsObject.clientLanguage, UserComparator9.archive2); // L: 1781
						Tiles.field1043 = new class517(HorizontalAlignment.field2089, 47, GraphicsObject.clientLanguage, UserComparator9.archive2); // L: 1782
						class130.varcs = new Varcs(); // L: 1783
						Archive var17 = UserComparator9.archive2; // L: 1784
						Archive var18 = GameEngine.field201; // L: 1785
						Archive var19 = class67.archive13; // L: 1786
						HitSplatDefinition.HitSplatDefinition_archive = var17; // L: 1788
						HitSplatDefinition.field2219 = var18; // L: 1789
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var19; // L: 1790
						Archive var20 = UserComparator9.archive2; // L: 1792
						Archive var21 = GameEngine.field201; // L: 1793
						HealthBarDefinition.HealthBarDefinition_archive = var20; // L: 1795
						HealthBarDefinition.field2055 = var21; // L: 1796
						Archive var22 = UserComparator9.archive2; // L: 1798
						Archive var23 = GameEngine.field201; // L: 1799
						WorldMapElement.WorldMapElement_archive = var23; // L: 1801
						if (var22.isFullyLoaded()) { // L: 1802
							UserComparator1.WorldMapElement_count = var22.getGroupFileCount(35); // L: 1805
							WorldMapElement.WorldMapElement_cached = new WorldMapElement[UserComparator1.WorldMapElement_count]; // L: 1806

							for (int var24 = 0; var24 < UserComparator1.WorldMapElement_count; ++var24) { // L: 1807
								byte[] var25 = var22.takeFile(35, var24); // L: 1808
								WorldMapElement.WorldMapElement_cached[var24] = new WorldMapElement(var24); // L: 1809
								if (var25 != null) { // L: 1810
									WorldMapElement.WorldMapElement_cached[var24].decode(new Buffer(var25)); // L: 1811
									WorldMapElement.WorldMapElement_cached[var24].method3743(); // L: 1812
								}
							}
						}

						HorizontalAlignment.method3850(50, "Loaded config"); // L: 1816
						class427.method7851(class93.field1153); // L: 1817
					}
				}
			}
		}
	} // L: 1510 1523 1532 1588 1605 1613 1620 1630 1634 1663 1684 1698 1706 1711 1715 1818 1846 1857 1862 1868 1874 1878 1885 1890 1896 1901 1905 1909 1913 1921 1926 1940 1947
}
