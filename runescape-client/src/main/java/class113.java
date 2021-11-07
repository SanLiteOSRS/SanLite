import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public class class113 extends class116 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1422168885
	)
	int field1356;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1587001219
	)
	int field1353;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1005373589
	)
	int field1354;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 191673925
	)
	int field1355;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class113(class119 var1) {
		this.this$0 = var1;
		this.field1356 = -1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1356 = var1.readUnsignedShort();
		this.field1353 = var1.readInt();
		this.field1354 = var1.readUnsignedByte();
		this.field1355 = var1.readUnsignedByte();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2663(this.field1356, this.field1353, this.field1354, this.field1355);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1973528524"
	)
	static void method2533() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		Tiles.field969 = null;
		Tiles.field962 = null;
		class54.field419 = null;
		DirectByteArrayCopier.field3212 = null;
		TileItem.Tiles_hue = null;
		class397.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		class1.Tiles_hueMultiplier = null;
		class81.field1039 = null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;ZII)V",
		garbageValue = "-1234515035"
	)
	static void method2529(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				class275.method5201(4);
			}

		} else {
			if (var3 == 0) {
				EnumComposition.method3097(var2);
			} else {
				class275.method5201(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			BufferedImage var6 = null;

			SpritePixels var5;
			int var8;
			label66: {
				try {
					var6 = ImageIO.read(new ByteArrayInputStream(var4));
					int var7 = var6.getWidth();
					var8 = var6.getHeight();
					int[] var9 = new int[var8 * var7];
					PixelGrabber var10 = new PixelGrabber(var6, 0, 0, var7, var8, var9, 0, var7);
					var10.grabPixels();
					var5 = new SpritePixels(var9, var7, var8);
					break label66;
				} catch (IOException var17) {
				} catch (InterruptedException var18) {
				}

				var5 = new SpritePixels(0, 0);
			}

			RouteStrategy.leftTitleSprite = var5;
			class139.rightTitleSprite = RouteStrategy.leftTitleSprite.mirrorHorizontally();
			int var12 = Client.worldProperties;
			if ((var12 & 536870912) != 0) {
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var12 & 1073741824) != 0) {
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				class16.logoSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			Login.titleboxSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field854 = Script.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class29.field159 = Script.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			Script.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = class393.SpriteBuffer_getSpritePixelsByName(var1, "runes", "");
			VarpDefinition.title_muteSprite = class393.SpriteBuffer_getSpritePixelsByName(var1, "title_mute", "");
			NetSocket.options_buttons_0Sprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Login.field868 = Script.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class9.options_buttons_2Sprite = Script.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			FriendsChatMember.field3950 = Script.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class327.field3908 = NetSocket.options_buttons_0Sprite.subWidth;
			UserComparator9.field1326 = NetSocket.options_buttons_0Sprite.subHeight * 470302976;
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			ReflectionCheck.field429 = 0;
			Tiles.otp = "";
			Login.field875 = true;
			Login.worldSelectOpen = false;
			if (!class408.clientPreferences.titleMusicDisabled) {
				Archive var11 = Messages.archive6;
				var8 = var11.getGroupId("scape main");
				int var13 = var11.getFileId(var8, "");
				class247.musicPlayerStatus = 1;
				class128.musicTrackArchive = var11;
				class411.musicTrackGroupId = var8;
				ArchiveDiskActionHandler.musicTrackFileId = var13;
				class247.musicTrackVolume = 255;
				SecureRandomCallable.musicTrackBoolean = false;
				class247.pcmSampleLength = 2;
			} else {
				class247.musicPlayerStatus = 1;
				class128.musicTrackArchive = null;
				class411.musicTrackGroupId = -1;
				ArchiveDiskActionHandler.musicTrackFileId = -1;
				class247.musicTrackVolume = 0;
				SecureRandomCallable.musicTrackBoolean = false;
				class247.pcmSampleLength = 2;
			}

			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var19 = new Buffer(4);
					var19.writeByte(3);
					var19.writeMedium(0);
					NetCache.NetCache_socket.write(var19.array, 0, 4);
				} catch (IOException var16) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var15) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = true;
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			Login.loginBoxCenter = Login.loginBoxX + 180;
			RouteStrategy.leftTitleSprite.drawAt(Login.xPadding, 0);
			class139.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class16.logoSprite.drawAt(Login.xPadding + 382 - class16.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ljf;II)I",
		garbageValue = "-1898154429"
	)
	static final int method2532(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = UserComparator9.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!TaskHandler.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = HealthBarDefinition.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = UserComparator9.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!TaskHandler.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class119.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = class19.baseX * 64 + (HealthBarDefinition.localPlayer.x >> 7);
					}

					if (var6 == 19) {
						var7 = DefaultsGroup.baseY * 64 + (HealthBarDefinition.localPlayer.y >> 7);
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
