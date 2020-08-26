import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 551932135
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lbe;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1641634033
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1212010463
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 569317801
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 476051061
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1924891607
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -5989118801596156891L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1364176147
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 1548820219885674609L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1745887067
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2031476779
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -604562201
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -1684843054653501119L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 376699801
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1229832903
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -434332357
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = -2055163658116269707L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		signature = "Lln;"
	)
	static AbstractSocket field508;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 1280773695
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;

	static {
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "-11"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = PacketWriter.currentTimeMillis();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([BI)Llp;",
		garbageValue = "1839748509"
	)
	@Export("convertJpgToSprite")
	public static final SpritePixels convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null;

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0));
			int var2 = var1.getWidth();
			int var3 = var1.getHeight();
			int[] var4 = new int[var2 * var3];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
			var5.grabPixels();
			return new SpritePixels(var4, var2, var3);
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lhq;IIII)V",
		garbageValue = "1755181117"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field2682 == null) {
			throw new RuntimeException();
		} else {
			var0.field2682[var1] = var2;
			var0.field2683[var1] = var3;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(ILhg;ZB)V",
		garbageValue = "70"
	)
	static void method1150(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = WorldMapSection0.getWorldMap().getMapArea(var0);
		int var4 = WorldMapLabelSize.localPlayer.plane;
		int var5 = WorldMapManager.baseX * 64 + (WorldMapLabelSize.localPlayer.x >> 7);
		int var6 = WorldMapLabel.baseY * 64 + (WorldMapLabelSize.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		WorldMapSection0.getWorldMap().method6549(var3, var7, var1, var2);
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		signature = "(Lgd;I)V",
		garbageValue = "-930522600"
	)
	static final void method1134(class194 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (class194.field2361 == var0) {
			var2 = var1.method5656();
			var3 = var1.method5646();
			var4 = (var3 >> 4 & 7) + WorldMapIcon_0.field154;
			var5 = (var3 & 7) + ScriptEvent.field597;
			var6 = var1.method5656();
			var7 = var1.readUnsignedShort();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				NodeDeque var41 = Client.groundItems[Huffman.Client_plane][var4][var5];
				if (var41 != null) {
					for (TileItem var9 = (TileItem)var41.last(); var9 != null; var9 = (TileItem)var41.previous()) {
						if ((var6 & 32767) == var9.id && var2 == var9.quantity) {
							var9.quantity = var7;
							break;
						}
					}

					class13.updateItemPile(var4, var5);
				}
			}

		} else {
			int var10;
			int var31;
			int var32;
			if (class194.field2371 == var0) {
				var2 = var1.method5612();
				var3 = var2 >> 4 & 15;
				var4 = var2 & 7;
				var5 = var1.method5612();
				var6 = var1.readUnsignedByte();
				var7 = (var6 >> 4 & 7) + WorldMapIcon_0.field154;
				var31 = (var6 & 7) + ScriptEvent.field597;
				var32 = var1.method5656();
				if (var7 >= 0 && var31 >= 0 && var7 < 104 && var31 < 104) {
					var10 = var3 + 1;
					if (WorldMapLabelSize.localPlayer.pathX[0] >= var7 - var10 && WorldMapLabelSize.localPlayer.pathX[0] <= var7 + var10 && WorldMapLabelSize.localPlayer.pathY[0] >= var31 - var10 && WorldMapLabelSize.localPlayer.pathY[0] <= var10 + var31 && Client.areaSoundEffectVolume != 0 && var4 > 0 && Client.soundEffectCount < 50) {
						Client.soundEffectIds[Client.soundEffectCount] = var32;
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = var3 + (var31 << 8) + (var7 << 16);
						++Client.soundEffectCount;
					}
				}
			}

			int var11;
			int var12;
			int var13;
			int var14;
			byte var38;
			if (class194.field2364 == var0) {
				var2 = var1.method5656();
				var38 = var1.method5649();
				var4 = var1.method5646();
				var5 = (var4 >> 4 & 7) + WorldMapIcon_0.field154;
				var6 = (var4 & 7) + ScriptEvent.field597;
				var7 = var1.readUnsignedByte();
				var31 = var1.method5612() * 4;
				var32 = var1.method5639();
				var10 = var1.method5655();
				var11 = var1.readUnsignedShort();
				var12 = var1.method5658();
				var13 = var1.method5646() * 4;
				byte var42 = var1.method5649();
				var3 = var38 + var5;
				var14 = var42 + var6;
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var3 >= 0 && var14 >= 0 && var3 < 104 && var14 < 104 && var2 != 65535) {
					var5 = var5 * 128 + 64;
					var6 = var6 * 128 + 64;
					var3 = var3 * 128 + 64;
					var14 = var14 * 128 + 64;
					Projectile var15 = new Projectile(var2, Huffman.Client_plane, var5, var6, ArchiveLoader.getTileHeight(var5, var6, Huffman.Client_plane) - var31, var10 + Client.cycle, var11 + Client.cycle, var32, var7, var12, var13);
					var15.setDestination(var3, var14, ArchiveLoader.getTileHeight(var3, var14, Huffman.Client_plane) - var13, var10 + Client.cycle);
					Client.projectiles.addFirst(var15);
				}

			} else if (class194.field2365 == var0) {
				var2 = var1.method5639();
				var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field154;
				var4 = (var2 & 7) + ScriptEvent.field597;
				var5 = var1.method5612();
				var6 = var5 >> 2;
				var7 = var5 & 3;
				var31 = Client.field736[var6];
				var32 = var1.readUnsignedShort();
				if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
					if (var31 == 0) {
						BoundaryObject var33 = ScriptEvent.scene.method3276(Huffman.Client_plane, var3, var4);
						if (var33 != null) {
							var11 = UserComparator9.Entity_unpackID(var33.tag);
							if (var6 == 2) {
								var33.entity1 = new DynamicObject(var11, 2, var7 + 4, Huffman.Client_plane, var3, var4, var32, false, var33.entity1);
								var33.entity2 = new DynamicObject(var11, 2, var7 + 1 & 3, Huffman.Client_plane, var3, var4, var32, false, var33.entity2);
							} else {
								var33.entity1 = new DynamicObject(var11, var6, var7, Huffman.Client_plane, var3, var4, var32, false, var33.entity1);
							}
						}
					}

					if (var31 == 1) {
						WallDecoration var43 = ScriptEvent.scene.method3211(Huffman.Client_plane, var3, var4);
						if (var43 != null) {
							var11 = UserComparator9.Entity_unpackID(var43.tag);
							if (var6 != 4 && var6 != 5) {
								if (var6 == 6) {
									var43.entity1 = new DynamicObject(var11, 4, var7 + 4, Huffman.Client_plane, var3, var4, var32, false, var43.entity1);
								} else if (var6 == 7) {
									var43.entity1 = new DynamicObject(var11, 4, (var7 + 2 & 3) + 4, Huffman.Client_plane, var3, var4, var32, false, var43.entity1);
								} else if (var6 == 8) {
									var43.entity1 = new DynamicObject(var11, 4, var7 + 4, Huffman.Client_plane, var3, var4, var32, false, var43.entity1);
									var43.entity2 = new DynamicObject(var11, 4, (var7 + 2 & 3) + 4, Huffman.Client_plane, var3, var4, var32, false, var43.entity2);
								}
							} else {
								var43.entity1 = new DynamicObject(var11, 4, var7, Huffman.Client_plane, var3, var4, var32, false, var43.entity1);
							}
						}
					}

					if (var31 == 2) {
						GameObject var44 = ScriptEvent.scene.method3197(Huffman.Client_plane, var3, var4);
						if (var6 == 11) {
							var6 = 10;
						}

						if (var44 != null) {
							var44.entity = new DynamicObject(UserComparator9.Entity_unpackID(var44.tag), var6, var7, Huffman.Client_plane, var3, var4, var32, false, var44.entity);
						}
					}

					if (var31 == 3) {
						FloorDecoration var45 = ScriptEvent.scene.getFloorDecoration(Huffman.Client_plane, var3, var4);
						if (var45 != null) {
							var45.entity = new DynamicObject(UserComparator9.Entity_unpackID(var45.tag), 22, var7, Huffman.Client_plane, var3, var4, var32, false, var45.entity);
						}
					}
				}

			} else if (class194.field2368 == var0) {
				var2 = var1.method5657();
				var3 = var1.method5639();
				var4 = (var3 >> 4 & 7) + WorldMapIcon_0.field154;
				var5 = (var3 & 7) + ScriptEvent.field597;
				var6 = var1.method5639();
				var7 = var1.method5655();
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
					var4 = var4 * 128 + 64;
					var5 = var5 * 128 + 64;
					GraphicsObject var8 = new GraphicsObject(var2, Huffman.Client_plane, var4, var5, ArchiveLoader.getTileHeight(var4, var5, Huffman.Client_plane) - var6, var7, Client.cycle);
					Client.graphicsObjects.addFirst(var8);
				}

			} else if (class194.field2362 == var0) {
				var2 = var1.method5646();
				var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field154;
				var4 = (var2 & 7) + ScriptEvent.field597;
				var5 = var1.method5639();
				var6 = var5 >> 2;
				var7 = var5 & 3;
				var31 = Client.field736[var6];
				var32 = var1.method5657();
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
					class9.updatePendingSpawn(Huffman.Client_plane, var3, var4, var31, var32, var6, var7, 0, -1);
				}

			} else if (class194.field2367 == var0) {
				var2 = var1.method5646();
				var3 = var2 >> 2;
				var4 = var2 & 3;
				var5 = Client.field736[var3];
				var6 = var1.method5612();
				var7 = (var6 >> 4 & 7) + WorldMapIcon_0.field154;
				var31 = (var6 & 7) + ScriptEvent.field597;
				if (var7 >= 0 && var31 >= 0 && var7 < 104 && var31 < 104) {
					class9.updatePendingSpawn(Huffman.Client_plane, var7, var31, var5, -1, var3, var4, 0, -1);
				}

			} else {
				TileItem var35;
				if (class194.field2363 == var0) {
					var2 = var1.method5612();
					var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field154;
					var4 = (var2 & 7) + ScriptEvent.field597;
					var5 = var1.readUnsignedShort();
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						NodeDeque var34 = Client.groundItems[Huffman.Client_plane][var3][var4];
						if (var34 != null) {
							for (var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) {
								if ((var5 & 32767) == var35.id) {
									var35.remove();
									break;
								}
							}

							if (var34.last() == null) {
								Client.groundItems[Huffman.Client_plane][var3][var4] = null;
							}

							class13.updateItemPile(var3, var4);
						}
					}

				} else if (class194.field2370 == var0) {
					var2 = var1.readUnsignedByte();
					var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field154;
					var4 = (var2 & 7) + ScriptEvent.field597;
					var5 = var1.method5656();
					var6 = var1.method5657();
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						var35 = new TileItem();
						var35.id = var6;
						var35.quantity = var5;
						if (Client.groundItems[Huffman.Client_plane][var3][var4] == null) {
							Client.groundItems[Huffman.Client_plane][var3][var4] = new NodeDeque();
						}

						Client.groundItems[Huffman.Client_plane][var3][var4].addFirst(var35);
						class13.updateItemPile(var3, var4);
					}

				} else {
					if (class194.field2366 == var0) {
						byte var37 = var1.readByte();
						var38 = var1.method5649();
						var4 = var1.readUnsignedShort();
						byte var39 = var1.readByte();
						byte var40 = var1.method5649();
						var7 = var1.readUnsignedShort();
						var31 = var1.method5656();
						var32 = var1.readUnsignedByte();
						var10 = (var32 >> 4 & 7) + WorldMapIcon_0.field154;
						var11 = (var32 & 7) + ScriptEvent.field597;
						var12 = var1.method5646();
						var13 = var12 >> 2;
						var14 = var12 & 3;
						int var36 = Client.field736[var13];
						int var16 = var1.readUnsignedShort();
						Player var17;
						if (var4 == Client.localPlayerIndex) {
							var17 = WorldMapLabelSize.localPlayer;
						} else {
							var17 = Client.players[var4];
						}

						if (var17 != null) {
							ObjectComposition var18 = MidiPcmStream.getObjectDefinition(var16);
							int var19;
							int var20;
							if (var14 != 1 && var14 != 3) {
								var19 = var18.sizeX;
								var20 = var18.sizeY;
							} else {
								var19 = var18.sizeY;
								var20 = var18.sizeX;
							}

							int var21 = var10 + (var19 >> 1);
							int var22 = var10 + (var19 + 1 >> 1);
							int var23 = var11 + (var20 >> 1);
							int var24 = var11 + (var20 + 1 >> 1);
							int[][] var25 = Tiles.Tiles_heights[Huffman.Client_plane];
							int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2;
							int var27 = (var10 << 7) + (var19 << 6);
							int var28 = (var11 << 7) + (var20 << 6);
							Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28);
							if (var29 != null) {
								class9.updatePendingSpawn(Huffman.Client_plane, var10, var11, var36, -1, 0, 0, var31 + 1, var7 + 1);
								var17.animationCycleStart = var31 + Client.cycle;
								var17.animationCycleEnd = var7 + Client.cycle;
								var17.model0 = var29;
								var17.field645 = var10 * 128 + var19 * 64;
								var17.field640 = var11 * 128 + var20 * 64;
								var17.tileHeight2 = var26;
								byte var30;
								if (var38 > var40) {
									var30 = var38;
									var38 = var40;
									var40 = var30;
								}

								if (var37 > var39) {
									var30 = var37;
									var37 = var39;
									var39 = var30;
								}

								var17.field649 = var10 + var38;
								var17.field651 = var40 + var10;
								var17.field635 = var11 + var37;
								var17.field643 = var11 + var39;
							}
						}
					}

				}
			}
		}
	}
}
