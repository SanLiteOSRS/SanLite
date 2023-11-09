import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 898312593
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -857678873
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 141597573
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1810991225
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -1225235563704375327L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2025551665
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1367600295
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -808246845
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -7283638899694965843L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1992798187
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1880795303
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2141367755
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 6118197766883651609L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 426079369
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1750298703
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1805968983
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 6498376297210789637L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("qq")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("varcs")
	static Varcs varcs;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-1407367231"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 62
		if (!var1.isAltDown() && var2 != 2) { // L: 63
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 64 65
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 110
			MouseHandler_idleCycles = 0; // L: 111
			MouseHandler_xVolatile = var1.getX(); // L: 112
			MouseHandler_yVolatile = var1.getY(); // L: 113
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 114
		}

	} // L: 116

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 81
			MouseHandler_idleCycles = 0; // L: 82
			MouseHandler_currentButtonVolatile = 0; // L: 83
		}

		if (var1.isPopupTrigger()) { // L: 85
			var1.consume();
		}

	} // L: 86

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 89
			var1.consume();
		}

	} // L: 90

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 93
	} // L: 94

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 97
			MouseHandler_idleCycles = 0; // L: 98
			MouseHandler_xVolatile = -1; // L: 99
			MouseHandler_yVolatile = -1; // L: 100
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 101
		}

	} // L: 103

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 106
	} // L: 107

	public final void focusGained(FocusEvent var1) {
	} // L: 118

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 121
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 122

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 69
			MouseHandler_idleCycles = 0; // L: 70
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 71
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 72
			MouseHandler_lastPressedTimeMillisVolatile = WallObject.method5027(); // L: 73
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 74
			if (MouseHandler_lastButtonVolatile != 0) { // L: 75
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 77
			var1.consume();
		}

	} // L: 78

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-3257"
	)
	static int method653() {
		return ++Messages.Messages_count - 1; // L: 19
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1002209752"
	)
	public static int method655(int var0) {
		return class452.field4731[var0 & 16383]; // L: 28
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "54"
	)
	public static int method642(int var0, int var1, int var2) {
		int var3 = class155.method3288(var2 - var1 + 1); // L: 45
		var3 <<= var1; // L: 46
		var0 |= var3; // L: 47
		return var0; // L: 48
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	static final void method654() {
		class4.method14(false); // L: 6015
		Client.field572 = 0; // L: 6016
		boolean var0 = true; // L: 6017

		int var1;
		for (var1 = 0; var1 < WorldMapLabelSize.regionLandArchives.length; ++var1) { // L: 6018
			if (WorldMapCacheName.regionMapArchiveIds[var1] != -1 && WorldMapLabelSize.regionLandArchives[var1] == null) { // L: 6019 6020
				WorldMapLabelSize.regionLandArchives[var1] = class305.archive9.takeFile(WorldMapCacheName.regionMapArchiveIds[var1], 0); // L: 6021
				if (WorldMapLabelSize.regionLandArchives[var1] == null) { // L: 6022
					var0 = false; // L: 6023
					++Client.field572; // L: 6024
				}
			}

			if (class130.regionLandArchiveIds[var1] != -1 && class74.regionMapArchives[var1] == null) { // L: 6028 6029
				class74.regionMapArchives[var1] = class305.archive9.takeFileEncrypted(class130.regionLandArchiveIds[var1], 0, SpotAnimationDefinition.xteaKeys[var1]); // L: 6030
				if (class74.regionMapArchives[var1] == null) { // L: 6031
					var0 = false; // L: 6032
					++Client.field572; // L: 6033
				}
			}
		}

		if (!var0) { // L: 6038
			Client.field576 = 1; // L: 6039
		} else {
			Client.field574 = 0; // L: 6042
			var0 = true; // L: 6043

			int var3;
			int var4;
			for (var1 = 0; var1 < WorldMapLabelSize.regionLandArchives.length; ++var1) { // L: 6044
				byte[] var17 = class74.regionMapArchives[var1]; // L: 6045
				if (var17 != null) { // L: 6046
					var3 = (SceneTilePaint.regions[var1] >> 8) * 64 - class213.baseX * 64; // L: 6047
					var4 = (SceneTilePaint.regions[var1] & 255) * 64 - class101.baseY * 64; // L: 6048
					if (Client.isInInstance) { // L: 6049
						var3 = 10; // L: 6050
						var4 = 10; // L: 6051
					}

					var0 &= class305.method5722(var17, var3, var4); // L: 6053
				}
			}

			if (!var0) { // L: 6056
				Client.field576 = 2; // L: 6057
			} else {
				if (Client.field576 != 0) { // L: 6060
					class230.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				WorldMapSectionType.playPcmPlayers(); // L: 6061
				class36.scene.clear(); // L: 6062

				for (var1 = 0; var1 < 4; ++var1) { // L: 6063
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 6064
					for (var2 = 0; var2 < 104; ++var2) { // L: 6065
						for (var3 = 0; var3 < 104; ++var3) { // L: 6066
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 6067
						}
					}
				}

				WorldMapSectionType.playPcmPlayers(); // L: 6071
				class269.method5466(); // L: 6072
				var1 = WorldMapLabelSize.regionLandArchives.length; // L: 6073
				class145.method3139(); // L: 6074
				class4.method14(true); // L: 6075
				int var5;
				if (!Client.isInInstance) { // L: 6076
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) { // L: 6077
						var3 = (SceneTilePaint.regions[var2] >> 8) * 64 - class213.baseX * 64; // L: 6078
						var4 = (SceneTilePaint.regions[var2] & 255) * 64 - class101.baseY * 64; // L: 6079
						var16 = WorldMapLabelSize.regionLandArchives[var2]; // L: 6080
						if (var16 != null) { // L: 6081
							WorldMapSectionType.playPcmPlayers(); // L: 6082
							WorldMapData_0.method5058(var16, var3, var4, class208.field2314 * 8 - 48, class182.field1891 * 8 - 48, Client.collisionMaps); // L: 6083
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 6086
						var3 = (SceneTilePaint.regions[var2] >> 8) * 64 - class213.baseX * 64; // L: 6087
						var4 = (SceneTilePaint.regions[var2] & 255) * 64 - class101.baseY * 64; // L: 6088
						var16 = WorldMapLabelSize.regionLandArchives[var2]; // L: 6089
						if (var16 == null && class182.field1891 < 800) { // L: 6090
							WorldMapSectionType.playPcmPlayers(); // L: 6091
							MilliClock.method3526(var3, var4, 64, 64); // L: 6092
						}
					}

					class4.method14(true); // L: 6095

					for (var2 = 0; var2 < var1; ++var2) { // L: 6096
						byte[] var15 = class74.regionMapArchives[var2]; // L: 6097
						if (var15 != null) { // L: 6098
							var4 = (SceneTilePaint.regions[var2] >> 8) * 64 - class213.baseX * 64; // L: 6099
							var5 = (SceneTilePaint.regions[var2] & 255) * 64 - class101.baseY * 64; // L: 6100
							WorldMapSectionType.playPcmPlayers(); // L: 6101
							UserComparator6.method2895(var15, var4, var5, class36.scene, Client.collisionMaps); // L: 6102
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 6106
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 6107
						WorldMapSectionType.playPcmPlayers(); // L: 6108

						for (var3 = 0; var3 < 13; ++var3) { // L: 6109
							for (var4 = 0; var4 < 13; ++var4) { // L: 6110
								boolean var18 = false; // L: 6111
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 6112
								if (var6 != -1) { // L: 6113
									var7 = var6 >> 24 & 3; // L: 6114
									var8 = var6 >> 1 & 3; // L: 6115
									var9 = var6 >> 14 & 1023; // L: 6116
									var10 = var6 >> 3 & 2047; // L: 6117
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 6118

									for (int var12 = 0; var12 < SceneTilePaint.regions.length; ++var12) { // L: 6119
										if (SceneTilePaint.regions[var12] == var11 && WorldMapLabelSize.regionLandArchives[var12] != null) { // L: 6120
											int var13 = (var9 - var3) * 8; // L: 6121
											int var14 = (var10 - var4) * 8; // L: 6122
											class230.method4706(WorldMapLabelSize.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps); // L: 6123
											var18 = true; // L: 6124
											break;
										}
									}
								}

								if (!var18) { // L: 6129
									Message.method1161(var2, var3 * 8, var4 * 8); // L: 6130
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 6135
						for (var3 = 0; var3 < 13; ++var3) { // L: 6136
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 6137
							if (var4 == -1) { // L: 6138
								MilliClock.method3526(var2 * 8, var3 * 8, 8, 8); // L: 6139
							}
						}
					}

					class4.method14(true); // L: 6143

					for (var2 = 0; var2 < 4; ++var2) { // L: 6144
						WorldMapSectionType.playPcmPlayers(); // L: 6145

						for (var3 = 0; var3 < 13; ++var3) { // L: 6146
							for (var4 = 0; var4 < 13; ++var4) { // L: 6147
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 6148
								if (var5 != -1) { // L: 6149
									var6 = var5 >> 24 & 3; // L: 6150
									var7 = var5 >> 1 & 3; // L: 6151
									var8 = var5 >> 14 & 1023; // L: 6152
									var9 = var5 >> 3 & 2047; // L: 6153
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 6154

									for (var11 = 0; var11 < SceneTilePaint.regions.length; ++var11) { // L: 6155
										if (SceneTilePaint.regions[var11] == var10 && class74.regionMapArchives[var11] != null) { // L: 6156
											Tiles.method2167(class74.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class36.scene, Client.collisionMaps); // L: 6157
											break; // L: 6158
										}
									}
								}
							}
						}
					}
				}

				class4.method14(true); // L: 6166
				WorldMapSectionType.playPcmPlayers(); // L: 6167
				VarpDefinition.method3573(class36.scene, Client.collisionMaps); // L: 6168
				class4.method14(true); // L: 6169
				var2 = Tiles.Tiles_minPlane; // L: 6170
				if (var2 > Clock.Client_plane) { // L: 6171
					var2 = Clock.Client_plane;
				}

				if (var2 < Clock.Client_plane - 1) { // L: 6172
					var2 = Clock.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 6173
					class36.scene.init(Tiles.Tiles_minPlane);
				} else {
					class36.scene.init(0); // L: 6174
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 6175
					for (var4 = 0; var4 < 104; ++var4) { // L: 6176
						class128.updateItemPile(var3, var4); // L: 6177
					}
				}

				WorldMapSectionType.playPcmPlayers(); // L: 6180
				VertexNormal.method4919(); // L: 6181
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 6182
				PacketBufferNode var19;
				if (class347.client.hasFrame()) { // L: 6183
					var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher); // L: 6185
					var19.packetBuffer.writeInt(1057001181); // L: 6186
					Client.packetWriter.addNode(var19); // L: 6187
				}

				if (!Client.isInInstance) { // L: 6189
					var3 = (class208.field2314 - 6) / 8; // L: 6190
					var4 = (class208.field2314 + 6) / 8; // L: 6191
					var5 = (class182.field1891 - 6) / 8; // L: 6192
					var6 = (class182.field1891 + 6) / 8; // L: 6193

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 6194
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 6195
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 6196
								class305.archive9.loadRegionFromName("m" + var7 + "_" + var8); // L: 6197
								class305.archive9.loadRegionFromName("l" + var7 + "_" + var8); // L: 6198
							}
						}
					}
				}

				UserComparator8.method2855(30); // L: 6202
				WorldMapSectionType.playPcmPlayers(); // L: 6203
				class161.method3331(); // L: 6204
				var19 = ObjectComposition.getPacketBufferNode(ClientPacket.field3114, Client.packetWriter.isaacCipher); // L: 6205
				Client.packetWriter.addNode(var19); // L: 6206
				class125.method2918(); // L: 6207
			}
		}
	} // L: 6040 6058 6208
}
