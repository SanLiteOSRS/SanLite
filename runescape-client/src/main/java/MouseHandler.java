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

@ObfuscatedName("bv")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("KeyHandler_instance")
	public static MouseHandler KeyHandler_instance;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -517286061
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1388225959
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 300117531
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 306292181
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -469436568998083601L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1208937069
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -177745371
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -854966233
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -2737158056637173329L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1791908027
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1200607205
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 507108069
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 7764657987235540599L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1106996993
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 350393107
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1963747575
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -3858337612740784601L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;

	static {
		KeyHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-2106134237"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 63 64
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 109
			MouseHandler_idleCycles = 0; // L: 110
			MouseHandler_xVolatile = var1.getX(); // L: 111
			MouseHandler_yVolatile = var1.getY(); // L: 112
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 113
		}

	} // L: 115

	public final synchronized void mousePressed(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 68
			MouseHandler_idleCycles = 0; // L: 69
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 70
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 71
			MouseHandler_lastPressedTimeMillisVolatile = Canvas.method310(); // L: 72
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 73
			if (MouseHandler_lastButtonVolatile != 0) { // L: 74
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 76
			var1.consume();
		}

	} // L: 77

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 80
			MouseHandler_idleCycles = 0; // L: 81
			MouseHandler_currentButtonVolatile = 0; // L: 82
		}

		if (var1.isPopupTrigger()) { // L: 84
			var1.consume();
		}

	} // L: 85

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 88
			var1.consume();
		}

	} // L: 89

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 105
	} // L: 106

	public final void focusGained(FocusEvent var1) {
	} // L: 117

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 120
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 121

	public final synchronized void mouseExited(MouseEvent var1) {
		if (KeyHandler_instance != null) { // L: 96
			MouseHandler_idleCycles = 0; // L: 97
			MouseHandler_xVolatile = -1; // L: 98
			MouseHandler_yVolatile = -1; // L: 99
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 100
		}

	} // L: 102

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 92
	} // L: 93

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;Lni;Lni;Llw;I)Z",
		garbageValue = "1546188496"
	)
	public static boolean method678(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class304.musicPatchesArchive = var0;
		class304.musicSamplesArchive = var1; // L: 41
		class304.soundEffectsArchive = var2; // L: 42
		class304.midiPcmStream = var3;
		return true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldk;",
		garbageValue = "-2061114450"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0; // L: 40
		Script var5 = class269.method5495(var3, var0); // L: 43
		if (var5 != null) { // L: 44
			return var5; // L: 45
		} else {
			int var6 = (-3 - var2 << 8) + var0; // L: 49
			var5 = class269.method5495(var6, var0); // L: 52
			if (var5 != null) { // L: 53
				return var5; // L: 54
			} else {
				int var7 = var0 + -512; // L: 58
				var5 = class269.method5495(var7, var0); // L: 61
				return var5 != null ? var5 : null; // L: 62 65
			}
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1787208657"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 4651
		Renderable.method4678(); // L: 4652
		class190.method3639(); // L: 4653
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4655
			class218.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4656
		}

		ArchiveLoader.addNpcsToScene(true); // L: 4659
		int var4 = Players.Players_count; // L: 4661
		int[] var5 = Players.Players_indices; // L: 4662

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 4663
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 4664
				class218.addPlayerToScene(Client.players[var5[var6]], true); // L: 4665
			}
		}

		ArchiveLoader.addNpcsToScene(false); // L: 4668

		for (Projectile var21 = (Projectile)Client.projectiles.last(); var21 != null; var21 = (Projectile)Client.projectiles.previous()) { // L: 4670 4671 4688
			if (var21.plane == NetFileRequest.Client_plane && Client.cycle <= var21.cycleEnd) { // L: 4672
				if (Client.cycle >= var21.cycleStart) { // L: 4673
					if (var21.targetIndex > 0) { // L: 4674
						NPC var23 = Client.npcs[var21.targetIndex - 1]; // L: 4675
						if (var23 != null && var23.x >= 0 && var23.x < 13312 && var23.y >= 0 && var23.y < 13312) { // L: 4676
							var21.setDestination(var23.x, var23.y, class208.getTileHeight(var23.x, var23.y, var21.plane) - var21.endHeight, Client.cycle);
						}
					}

					if (var21.targetIndex < 0) { // L: 4678
						var6 = -var21.targetIndex - 1; // L: 4680
						Player var24;
						if (var6 == Client.localPlayerIndex) { // L: 4681
							var24 = HitSplatDefinition.localPlayer;
						} else {
							var24 = Client.players[var6]; // L: 4682
						}

						if (var24 != null && var24.x >= 0 && var24.x < 13312 && var24.y >= 0 && var24.y < 13312) { // L: 4683
							var21.setDestination(var24.x, var24.y, class208.getTileHeight(var24.x, var24.y, var21.plane) - var21.endHeight, Client.cycle);
						}
					}

					var21.advance(Client.field558); // L: 4685
					UserComparator4.scene.drawEntity(NetFileRequest.Client_plane, (int)var21.x, (int)var21.y, (int)var21.z, 60, var21, var21.yaw, -1L, false); // L: 4686
				}
			} else {
				var21.remove();
			}
		}

		FloorUnderlayDefinition.method3759(); // L: 4691
		WorldMapDecorationType.setViewportShape(var0, var1, var2, var3, true); // L: 4692
		var0 = Client.viewportOffsetX; // L: 4693
		var1 = Client.viewportOffsetY; // L: 4694
		var2 = Client.viewportWidth; // L: 4695
		var3 = Client.viewportHeight; // L: 4696
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4697
		Rasterizer3D.method4319(); // L: 4698
		Rasterizer2D.method9307(); // L: 4699
		var4 = Client.camAngleX; // L: 4700
		if (Client.field582 / 256 > var4) { // L: 4701
			var4 = Client.field582 / 256;
		}

		if (Client.field748[4] && Client.field750[4] + 128 > var4) { // L: 4702
			var4 = Client.field750[4] + 128;
		}

		int var22 = Client.camAngleY & 2047; // L: 4703
		var6 = WorldMapSection0.oculusOrbFocalPointX; // L: 4704
		int var7 = Decimator.field400; // L: 4705
		int var8 = TextureProvider.oculusOrbFocalPointY; // L: 4706
		int var11 = var4 * 3 + 600; // L: 4711
		class299.method5756(var6, var7, var8, var4, var22, var11, var3); // L: 4713
		int var12;
		int var13;
		int var14;
		if (!Client.isCameraLocked) { // L: 4715
			var12 = ReflectionCheck.method691();
		} else {
			if (WorldMapManager.clientPreferences.method2536()) { // L: 4719
				var13 = NetFileRequest.Client_plane; // L: 4720
			} else {
				var14 = class208.getTileHeight(class19.cameraX, BuddyRankComparator.cameraZ, NetFileRequest.Client_plane); // L: 4723
				if (var14 - DynamicObject.cameraY < 800 && (Tiles.Tiles_renderFlags[NetFileRequest.Client_plane][class19.cameraX >> 7][BuddyRankComparator.cameraZ >> 7] & 4) != 0) { // L: 4724
					var13 = NetFileRequest.Client_plane; // L: 4725
				} else {
					var13 = 3; // L: 4728
				}
			}

			var12 = var13; // L: 4730
		}

		var13 = class19.cameraX; // L: 4732
		var14 = DynamicObject.cameraY; // L: 4733
		int var15 = BuddyRankComparator.cameraZ; // L: 4734
		int var16 = ObjectComposition.cameraPitch; // L: 4735
		int var17 = Coord.cameraYaw; // L: 4736

		int var18;
		int var19;
		for (var18 = 0; var18 < 5; ++var18) { // L: 4737
			if (Client.field748[var18]) { // L: 4738
				var19 = (int)(Math.random() * (double)(Client.field611[var18] * 2 + 1) - (double)Client.field611[var18] + Math.sin((double)Client.field696[var18] / 100.0D * (double)Client.field752[var18]) * (double)Client.field750[var18]); // L: 4739
				if (var18 == 0) { // L: 4740
					class19.cameraX += var19;
				}

				if (var18 == 1) { // L: 4741
					DynamicObject.cameraY += var19;
				}

				if (var18 == 2) { // L: 4742
					BuddyRankComparator.cameraZ += var19;
				}

				if (var18 == 3) { // L: 4743
					Coord.cameraYaw = var19 + Coord.cameraYaw & 2047;
				}

				if (var18 == 4) { // L: 4744
					ObjectComposition.cameraPitch += var19; // L: 4745
					if (ObjectComposition.cameraPitch < 128) { // L: 4746
						ObjectComposition.cameraPitch = 128;
					}

					if (ObjectComposition.cameraPitch > 383) { // L: 4747
						ObjectComposition.cameraPitch = 383;
					}
				}
			}
		}

		var18 = MouseHandler_x; // L: 4751
		var19 = MouseHandler_y; // L: 4752
		if (MouseHandler_lastButton != 0) { // L: 4753
			var18 = MouseHandler_lastPressedX; // L: 4754
			var19 = MouseHandler_lastPressedY; // L: 4755
		}

		if (var18 >= var0 && var18 < var0 + var2 && var19 >= var1 && var19 < var3 + var1) { // L: 4757
			WorldMapLabelSize.method5043(var18 - var0, var19 - var1); // L: 4758
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 4762
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 4763
		}

		class85.playPcmPlayers(); // L: 4766
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4767
		class85.playPcmPlayers(); // L: 4768
		int var20 = Rasterizer3D.method4329(); // L: 4769
		Rasterizer3D.method4354(class439.client.field193); // L: 4770
		Rasterizer3D.field2512.field2806 = Client.viewportZoom; // L: 4771
		UserComparator4.scene.draw(class19.cameraX, DynamicObject.cameraY, BuddyRankComparator.cameraZ, ObjectComposition.cameraPitch, Coord.cameraYaw, var12); // L: 4772
		Rasterizer3D.method4354(false); // L: 4773
		if (Client.renderSelf) { // L: 4774
			Rasterizer2D.method9308(); // L: 4775
		}

		Rasterizer3D.field2512.field2806 = var20; // L: 4777
		class85.playPcmPlayers(); // L: 4778
		UserComparator4.scene.clearTempGameObjects(); // L: 4779
		Calendar.method6613(var0, var1, var2, var3); // L: 4780
		if (Client.hintArrowType == 2) { // L: 4782
			GrandExchangeOffer.worldToScreen((Client.field504 - class147.baseX * 64 << 7) + Client.field507 * 4096, Client.field508 * 64 + (Client.field684 - ModeWhere.baseY * 64 << 7), Client.field506 * 2); // L: 4783
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 4784
				ItemComposition.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.field2512.Rasterizer3D_textureLoader).animate(Client.field558); // L: 4786
		class4.method13(var0, var1, var2, var3); // L: 4787
		class19.cameraX = var13; // L: 4788
		DynamicObject.cameraY = var14; // L: 4789
		BuddyRankComparator.cameraZ = var15; // L: 4790
		ObjectComposition.cameraPitch = var16; // L: 4791
		Coord.cameraYaw = var17; // L: 4792
		if (Client.field493 && GraphicsObject.method2045(true, false) == 0) { // L: 4793
			Client.field493 = false;
		}

		if (Client.field493) { // L: 4794
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 4795
			AbstractWorldMapIcon.drawLoadingMessage("Loading - please wait.", false); // L: 4796
		}

	} // L: 4798

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "64"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (WorldMapAreaData.loadInterface(var0)) { // L: 10299
			UrlRequest.field1414 = null; // L: 10306
			class30.drawInterface(UserComparator6.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10307
			if (UrlRequest.field1414 != null) { // L: 10308
				class30.drawInterface(UrlRequest.field1414, -1412584499, var1, var2, var3, var4, class33.field167, Varcs.field1374, var7); // L: 10309
				UrlRequest.field1414 = null; // L: 10310
			}

		} else {
			if (var7 != -1) { // L: 10300
				Client.field693[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10302
					Client.field693[var8] = true;
				}
			}

		}
	} // L: 10304 10312
}
