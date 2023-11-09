import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("b")
public class class9 implements class345 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	public static final class9 field43;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	public static final class9 field33;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	static final class9 field42;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	static final class9 field35;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lb;"
	)
	static final class9 field36;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("bx")
	static String field41;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1316615471
	)
	int field45;
	@ObfuscatedName("f")
	String field37;
	@ObfuscatedName("r")
	boolean field34;
	@ObfuscatedName("u")
	boolean field40;

	static {
		field43 = new class9(0, "POST", true, true); // L: 6
		field33 = new class9(1, "GET", true, false); // L: 7
		field42 = new class9(2, "PUT", false, true); // L: 8
		field35 = new class9(3, "PATCH", false, true); // L: 9
		field36 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field45 = var1; // L: 17
		this.field37 = var2; // L: 18
		this.field34 = var3;
		this.field40 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2030872852"
	)
	boolean method69() {
		return this.field34;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field45; // L: 37
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "923368011"
	)
	public String method70() {
		return this.field37; // L: 28
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	boolean method71() {
		return this.field40; // L: 32
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lqr;",
		garbageValue = "2126474190"
	)
	public static class456 method82(int var0) {
		int var1 = class454.field4866[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class456.field4874; // L: 21
		} else if (var1 == 2) { // L: 23
			return class456.field4871; // L: 24
		} else {
			return var1 == 3 ? class456.field4870 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "6"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		class420.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IIIB)V",
		garbageValue = "0"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3630 == null) { // L: 1196
			throw new RuntimeException(); // L: 1197
		} else {
			var0.field3630[var1] = var2; // L: 1199
			var0.field3625[var1] = var3; // L: 1200
		}
	} // L: 1201

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1971964072"
	)
	static final void method80() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3735
			var0 = class155.localPlayer.x; // L: 3736
			var1 = class155.localPlayer.y; // L: 3737
			if (KeyHandler.oculusOrbFocalPointX - var0 < -500 || KeyHandler.oculusOrbFocalPointX - var0 > 500 || class14.oculusOrbFocalPointY - var1 < -500 || class14.oculusOrbFocalPointY - var1 > 500) { // L: 3738
				KeyHandler.oculusOrbFocalPointX = var0; // L: 3739
				class14.oculusOrbFocalPointY = var1; // L: 3740
			}

			if (var0 != KeyHandler.oculusOrbFocalPointX) { // L: 3742
				KeyHandler.oculusOrbFocalPointX += (var0 - KeyHandler.oculusOrbFocalPointX) / 16;
			}

			if (var1 != class14.oculusOrbFocalPointY) { // L: 3743
				class14.oculusOrbFocalPointY += (var1 - class14.oculusOrbFocalPointY) / 16;
			}

			var2 = KeyHandler.oculusOrbFocalPointX >> 7; // L: 3744
			var3 = class14.oculusOrbFocalPointY >> 7; // L: 3745
			var4 = SpotAnimationDefinition.getTileHeight(KeyHandler.oculusOrbFocalPointX, class14.oculusOrbFocalPointY, class383.Client_plane); // L: 3746
			var5 = 0; // L: 3747
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3748
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3749
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3750
						int var8 = class383.Client_plane; // L: 3751
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3752
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3753
						if (var9 > var5) { // L: 3754
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3758
			if (var6 > 98048) { // L: 3759
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3760
				var6 = 32768;
			}

			if (var6 > Client.field604) { // L: 3761
				Client.field604 += (var6 - Client.field604) / 24;
			} else if (var6 < Client.field604) { // L: 3762
				Client.field604 += (var6 - Client.field604) / 80;
			}

			ApproximateRouteStrategy.field498 = SpotAnimationDefinition.getTileHeight(class155.localPlayer.x, class155.localPlayer.y, class383.Client_plane) - Client.camFollowHeight; // L: 3763
		} else if (Client.oculusOrbState == 1) { // L: 3765
			if (Client.field529 && class155.localPlayer != null) { // L: 3767
				var0 = class155.localPlayer.pathX[0]; // L: 3768
				var1 = class155.localPlayer.pathY[0]; // L: 3769
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) { // L: 3770
					KeyHandler.oculusOrbFocalPointX = class155.localPlayer.x; // L: 3771
					var2 = SpotAnimationDefinition.getTileHeight(class155.localPlayer.x, class155.localPlayer.y, class383.Client_plane) - Client.camFollowHeight; // L: 3772
					if (var2 < ApproximateRouteStrategy.field498) { // L: 3773
						ApproximateRouteStrategy.field498 = var2;
					}

					class14.oculusOrbFocalPointY = class155.localPlayer.y; // L: 3774
					Client.field529 = false; // L: 3775
				}
			}

			short var10 = -1; // L: 3778
			if (Client.field747.method4106(33)) { // L: 3779
				var10 = 0;
			} else if (Client.field747.method4106(49)) { // L: 3780
				var10 = 1024;
			}

			if (Client.field747.method4106(48)) { // L: 3781
				if (var10 == 0) { // L: 3782
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3783
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3784
				}
			} else if (Client.field747.method4106(50)) { // L: 3786
				if (var10 == 0) { // L: 3787
					var10 = 256;
				} else if (var10 == 1024) { // L: 3788
					var10 = 768;
				} else {
					var10 = 512; // L: 3789
				}
			}

			byte var11 = 0; // L: 3791
			if (Client.field747.method4106(35)) { // L: 3792
				var11 = -1;
			} else if (Client.field747.method4106(51)) { // L: 3793
				var11 = 1;
			}

			var2 = 0; // L: 3794
			if (var10 >= 0 || var11 != 0) { // L: 3795
				var2 = Client.field747.method4106(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed; // L: 3796
				var2 *= 16; // L: 3797
				Client.field596 = var10; // L: 3798
				Client.field597 = var11; // L: 3799
			}

			if (Client.field638 < var2) { // L: 3801
				Client.field638 += var2 / 8; // L: 3802
				if (Client.field638 > var2) { // L: 3803
					Client.field638 = var2;
				}
			} else if (Client.field638 > var2) { // L: 3805
				Client.field638 = Client.field638 * 9 / 10;
			}

			if (Client.field638 > 0) { // L: 3806
				var3 = Client.field638 / 16; // L: 3807
				if (Client.field596 >= 0) { // L: 3808
					var0 = Client.field596 - class128.cameraYaw & 2047; // L: 3809
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3810
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3811
					KeyHandler.oculusOrbFocalPointX += var4 * var3 / 65536; // L: 3812
					class14.oculusOrbFocalPointY += var5 * var3 / 65536; // L: 3813
				}

				if (Client.field597 != 0) { // L: 3815
					ApproximateRouteStrategy.field498 += var3 * Client.field597; // L: 3816
					if (ApproximateRouteStrategy.field498 > 0) { // L: 3817
						ApproximateRouteStrategy.field498 = 0;
					}
				}
			} else {
				Client.field596 = -1; // L: 3821
				Client.field597 = -1; // L: 3822
			}

			if (Client.field747.method4106(13)) { // L: 3824
				Client.packetWriter.addNode(class136.getPacketBufferNode(ClientPacket.field3073, Client.packetWriter.isaacCipher)); // L: 3826
				Client.oculusOrbState = 0; // L: 3827
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && SceneTilePaint.mouseCam) { // L: 3831
			var0 = MouseHandler.MouseHandler_y - Client.field592; // L: 3832
			Client.field663 = var0 * 2; // L: 3833
			Client.field592 = var0 != -1 && var0 != 1 ? (Client.field592 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y; // L: 3834
			var1 = Client.field591 - MouseHandler.MouseHandler_x; // L: 3835
			Client.field589 = var1 * 2; // L: 3836
			Client.field591 = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.field591) / 2 : MouseHandler.MouseHandler_x; // L: 3837
		} else {
			if (Client.field747.method4106(96)) { // L: 3840
				Client.field589 += (-24 - Client.field589) / 2;
			} else if (Client.field747.method4106(97)) { // L: 3841
				Client.field589 += (24 - Client.field589) / 2;
			} else {
				Client.field589 /= 2; // L: 3842
			}

			if (Client.field747.method4106(98)) { // L: 3843
				Client.field663 += (12 - Client.field663) / 2;
			} else if (Client.field747.method4106(99)) { // L: 3844
				Client.field663 += (-12 - Client.field663) / 2;
			} else {
				Client.field663 /= 2; // L: 3845
			}

			Client.field592 = MouseHandler.MouseHandler_y; // L: 3846
			Client.field591 = MouseHandler.MouseHandler_x; // L: 3847
		}

		Client.camAngleY = Client.field589 / 2 + Client.camAngleY & 2047; // L: 3849
		Client.camAngleX += Client.field663 / 2; // L: 3850
		if (Client.camAngleX < 128) { // L: 3851
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 3852
			Client.camAngleX = 383;
		}

	} // L: 3853

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Lcx;ZB)V",
		garbageValue = "93"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12331
		int var3 = (int)var0.key; // L: 12332
		var0.remove(); // L: 12333
		if (var1) { // L: 12334
			HitSplatDefinition.method3850(var2);
		}

		VarpDefinition.method3547(var2); // L: 12335
		Widget var4 = class175.getWidget(var3); // L: 12336
		if (var4 != null) { // L: 12337
			class69.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) { // L: 12338
			GrandExchangeOfferAgeComparator.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 12339
}
