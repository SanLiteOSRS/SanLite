import java.awt.Component;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -243088695
	)
	static int field352;
	@ObfuscatedName("h")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("a")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("q")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		signature = "(Lkf;Lkf;IZB)V",
		garbageValue = "1"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.worldMapData0Set = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.worldMapData0Set.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.worldMapData1Set = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.worldMapData1Set.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		signature = "(Lkf;ZS)V",
		garbageValue = "8691"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.method5634();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;I)V",
		garbageValue = "-681398425"
	)
	static void method751(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "638484007"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1355090288"
	)
	static final void method752() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = WorldMapLabelSize.localPlayer.x;
			var1 = WorldMapLabelSize.localPlayer.y;
			if (GrandExchangeOfferWorldComparator.oculusOrbFocalPointX - var0 < -500 || GrandExchangeOfferWorldComparator.oculusOrbFocalPointX - var0 > 500 || MouseHandler.oculusOrbFocalPointY - var1 < -500 || MouseHandler.oculusOrbFocalPointY - var1 > 500) {
				GrandExchangeOfferWorldComparator.oculusOrbFocalPointX = var0;
				MouseHandler.oculusOrbFocalPointY = var1;
			}

			if (var0 != GrandExchangeOfferWorldComparator.oculusOrbFocalPointX) {
				GrandExchangeOfferWorldComparator.oculusOrbFocalPointX += (var0 - GrandExchangeOfferWorldComparator.oculusOrbFocalPointX) / 16;
			}

			if (var1 != MouseHandler.oculusOrbFocalPointY) {
				MouseHandler.oculusOrbFocalPointY += (var1 - MouseHandler.oculusOrbFocalPointY) / 16;
			}

			var2 = GrandExchangeOfferWorldComparator.oculusOrbFocalPointX >> 7;
			var3 = MouseHandler.oculusOrbFocalPointY >> 7;
			var4 = ArchiveLoader.getTileHeight(GrandExchangeOfferWorldComparator.oculusOrbFocalPointX, MouseHandler.oculusOrbFocalPointY, Huffman.Client_plane);
			var5 = 0;
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
						int var8 = Huffman.Client_plane;
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
						if (var9 > var5) {
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192;
			if (var6 > 98048) {
				var6 = 98048;
			}

			if (var6 < 32768) {
				var6 = 32768;
			}

			if (var6 > Client.field762) {
				Client.field762 += (var6 - Client.field762) / 24;
			} else if (var6 < Client.field762) {
				Client.field762 += (var6 - Client.field762) / 80;
			}

			class7.field40 = ArchiveLoader.getTileHeight(WorldMapLabelSize.localPlayer.x, WorldMapLabelSize.localPlayer.y, Huffman.Client_plane) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			if (Client.field759 && WorldMapLabelSize.localPlayer != null) {
				var0 = WorldMapLabelSize.localPlayer.pathX[0];
				var1 = WorldMapLabelSize.localPlayer.pathY[0];
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) {
					GrandExchangeOfferWorldComparator.oculusOrbFocalPointX = WorldMapLabelSize.localPlayer.x;
					var2 = ArchiveLoader.getTileHeight(WorldMapLabelSize.localPlayer.x, WorldMapLabelSize.localPlayer.y, Huffman.Client_plane) - Client.camFollowHeight;
					if (var2 < class7.field40) {
						class7.field40 = var2;
					}

					MouseHandler.oculusOrbFocalPointY = WorldMapLabelSize.localPlayer.y;
					Client.field759 = false;
				}
			}

			short var10 = -1;
			if (KeyHandler.KeyHandler_pressedKeys[33]) {
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) {
				if (var10 == 0) {
					var10 = 1792;
				} else if (var10 == 1024) {
					var10 = 1280;
				} else {
					var10 = 1536;
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
				if (var10 == 0) {
					var10 = 256;
				} else if (var10 == 1024) {
					var10 = 768;
				} else {
					var10 = 512;
				}
			}

			byte var11 = 0;
			if (KeyHandler.KeyHandler_pressedKeys[35]) {
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
				var11 = 1;
			}

			var2 = 0;
			if (var10 >= 0 || var11 != 0) {
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
				var2 *= 16;
				Client.field796 = var10;
				Client.field755 = var11;
			}

			if (Client.field753 < var2) {
				Client.field753 += var2 / 8;
				if (Client.field753 > var2) {
					Client.field753 = var2;
				}
			} else if (Client.field753 > var2) {
				Client.field753 = Client.field753 * 9 / 10;
			}

			if (Client.field753 > 0) {
				var3 = Client.field753 / 16;
				if (Client.field796 >= 0) {
					var0 = Client.field796 - ServerPacket.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					GrandExchangeOfferWorldComparator.oculusOrbFocalPointX += var3 * var4 / 65536;
					MouseHandler.oculusOrbFocalPointY += var5 * var3 / 65536;
				}

				if (Client.field755 != 0) {
					class7.field40 += var3 * Client.field755;
					if (class7.field40 > 0) {
						class7.field40 = 0;
					}
				}
			} else {
				Client.field796 = -1;
				Client.field755 = -1;
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) {
				Client.packetWriter.addNode(Client.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher));
				Client.oculusOrbState = 0;
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && ScriptEvent.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) {
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2;
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) {
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2;
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x;
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
		Client.camAngleX += Client.camAngleDX / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}

	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1654311283"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class279.method5091();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		signature = "([Lhq;II)V",
		garbageValue = "1802029198"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						ClientPacket.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					Script.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = TileItem.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					Script.runScriptEvent(var5);
				}
			}
		}

	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		signature = "(Lhq;II)Ljava/lang/String;",
		garbageValue = "-1179780727"
	)
	static String method756(Widget var0, int var1) {
		if (!StudioGame.method4230(WorldMapIcon_0.getWidgetClickMask(var0), var1) && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}
}
