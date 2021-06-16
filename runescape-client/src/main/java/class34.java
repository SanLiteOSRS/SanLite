import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public enum class34 implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	field232(0, 0);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1096929681
	)
	public final int field233;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1588992419
	)
	final int field236;

	class34(int var3, int var4) {
		this.field233 = var3;
		this.field236 = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field236;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2123996277"
	)
	public static int method402(int var0, int var1) {
		int var2;
		if (var1 > var0) {
			var2 = var0;
			var0 = var1;
			var1 = var2;
		}

		while (var1 != 0) {
			var2 = var0 % var1;
			var0 = var1;
			var1 = var2;
		}

		return var0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	public static void method406() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("load")
	static void load() {
		int var21;
		if (Client.titleLoadingStage == 0) {
			DevicePcmPlayerProvider.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var21 = 0; var21 < 4; ++var21) {
				Client.collisionMaps[var21] = new CollisionMap(104, 104);
			}

			class69.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			ClanChannel.archive3 = UrlRequest.newArchive(0, false, true, true);
			KitDefinition.archive4 = UrlRequest.newArchive(1, false, true, true);
			SecureRandomFuture.archive2 = UrlRequest.newArchive(2, true, false, true);
			class18.archive5 = UrlRequest.newArchive(3, false, true, true);
			class26.field211 = UrlRequest.newArchive(4, false, true, true);
			class4.archive7 = UrlRequest.newArchive(5, true, true, true);
			DynamicObject.archive6 = UrlRequest.newArchive(6, true, true, true);
			PcmPlayer.archive9 = UrlRequest.newArchive(7, false, true, true);
			ModeWhere.archive8 = UrlRequest.newArchive(8, false, true, true);
			class16.field134 = UrlRequest.newArchive(9, false, true, true);
			JagexCache.archive10 = UrlRequest.newArchive(10, false, true, true);
			class160.archive11 = UrlRequest.newArchive(11, false, true, true);
			Varcs.archive12 = UrlRequest.newArchive(12, false, true, true);
			GrandExchangeOfferOwnWorldComparator.archive13 = UrlRequest.newArchive(13, true, false, true);
			PacketWriter.archive14 = UrlRequest.newArchive(14, false, true, true);
			class306.archive15 = UrlRequest.newArchive(15, false, true, true);
			class10.archive17 = UrlRequest.newArchive(17, true, true, true);
			class6.archive18 = UrlRequest.newArchive(18, false, true, true);
			WorldMapEvent.archive19 = UrlRequest.newArchive(19, false, true, true);
			WorldMapLabel.archive20 = UrlRequest.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var43 = 0;
			var21 = var43 + ClanChannel.archive3.percentage() * 4 / 100;
			var21 += KitDefinition.archive4.percentage() * 4 / 100;
			var21 += SecureRandomFuture.archive2.percentage() * 2 / 100;
			var21 += class18.archive5.percentage() * 2 / 100;
			var21 += class26.field211.percentage() * 6 / 100;
			var21 += class4.archive7.percentage() * 4 / 100;
			var21 += DynamicObject.archive6.percentage() * 2 / 100;
			var21 += PcmPlayer.archive9.percentage() * 56 / 100;
			var21 += ModeWhere.archive8.percentage() * 2 / 100;
			var21 += class16.field134.percentage() * 2 / 100;
			var21 += JagexCache.archive10.percentage() * 2 / 100;
			var21 += class160.archive11.percentage() * 2 / 100;
			var21 += Varcs.archive12.percentage() * 2 / 100;
			var21 += GrandExchangeOfferOwnWorldComparator.archive13.percentage() * 2 / 100;
			var21 += PacketWriter.archive14.percentage() * 2 / 100;
			var21 += class306.archive15.percentage() * 2 / 100;
			var21 += WorldMapEvent.archive19.percentage() / 100;
			var21 += class6.archive18.percentage() / 100;
			var21 += WorldMapLabel.archive20.percentage() / 100;
			var21 += class10.archive17.method5044() && class10.archive17.isFullyLoaded() ? 1 : 0;
			if (var21 != 100) {
				if (var21 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var21 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				class244.method4814(ClanChannel.archive3, "Animations");
				class244.method4814(KitDefinition.archive4, "Skeletons");
				class244.method4814(class26.field211, "Sound FX");
				class244.method4814(class4.archive7, "Maps");
				class244.method4814(DynamicObject.archive6, "Music Tracks");
				class244.method4814(PcmPlayer.archive9, "Models");
				class244.method4814(ModeWhere.archive8, "Sprites");
				class244.method4814(class160.archive11, "Music Jingles");
				class244.method4814(PacketWriter.archive14, "Music Samples");
				class244.method4814(class306.archive15, "Music Patches");
				class244.method4814(WorldMapEvent.archive19, "World Map");
				class244.method4814(class6.archive18, "World Map Geography");
				class244.method4814(WorldMapLabel.archive20, "World Map Ground");
				ClanChannel.spriteIds = new GraphicsDefaults();
				ClanChannel.spriteIds.decode(class10.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else if (Client.titleLoadingStage == 45) {
			boolean var42 = !Client.isLowDetail;
			class341.field3921 = 22050;
			PcmPlayer.PcmPlayer_stereo = var42;
			UserComparator1.field4220 = 2;
			MidiPcmStream var39 = new MidiPcmStream();
			var39.method4563(9, 128);
			SoundCache.pcmPlayer0 = class93.method2187(GameEngine.taskHandler, 0, 22050);
			SoundCache.pcmPlayer0.setStream(var39);
			ItemLayer.method3860(class306.archive15, PacketWriter.archive14, class26.field211, var39);
			UrlRequester.pcmPlayer1 = class93.method2187(GameEngine.taskHandler, 1, 2048);
			UserComparator7.pcmStreamMixer = new PcmStreamMixer();
			UrlRequester.pcmPlayer1.setStream(UserComparator7.pcmStreamMixer);
			WorldMapAreaData.decimator = new Decimator(22050, class341.field3921);
			Login.Login_loadingText = "Prepared sound engine";
			Login.Login_loadingPercent = 35;
			Client.titleLoadingStage = 50;
			class314.WorldMapElement_fonts = new Fonts(ModeWhere.archive8, GrandExchangeOfferOwnWorldComparator.archive13);
		} else if (Client.titleLoadingStage == 50) {
			var21 = FontName.method6334().length;
			Fonts var38 = class314.WorldMapElement_fonts;
			FontName[] var32 = new FontName[]{FontName.FontName_verdana15, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_plain12};
			Client.fontsMap = var38.createMap(var32);
			if (Client.fontsMap.size() < var21) {
				Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var21 + "%";
				Login.Login_loadingPercent = 40;
			} else {
				UserComparator10.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
				AbstractSocket.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
				class309.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
				ClanSettings.platformInfo = Client.platformInfoProvider.get();
				Login.Login_loadingText = "Loaded fonts";
				Login.Login_loadingPercent = 40;
				Client.titleLoadingStage = 60;
			}
		} else {
			Archive var2;
			int var3;
			Archive var35;
			if (Client.titleLoadingStage == 60) {
				var35 = JagexCache.archive10;
				var2 = ModeWhere.archive8;
				var3 = 0;
				if (var35.tryLoadFileByNames("title.jpg", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("logo", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("logo_deadman_mode", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("logo_seasonal_mode", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("titlebox", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("titlebutton", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("runes", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("title_mute", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,0", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,2", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,4", "")) {
					++var3;
				}

				if (var2.tryLoadFileByNames("options_radio_buttons,6", "")) {
					++var3;
				}

				var2.tryLoadFileByNames("sl_back", "");
				var2.tryLoadFileByNames("sl_flags", "");
				var2.tryLoadFileByNames("sl_arrows", "");
				var2.tryLoadFileByNames("sl_stars", "");
				var2.tryLoadFileByNames("sl_button", "");
				byte var41 = 12;
				if (var3 < var41) {
					Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var41 + "%";
					Login.Login_loadingPercent = 50;
				} else {
					Login.Login_loadingText = "Loaded title screen";
					Login.Login_loadingPercent = 50;
					Projectile.updateGameState(5);
					Client.titleLoadingStage = 70;
				}
			} else if (Client.titleLoadingStage == 70) {
				if (!SecureRandomFuture.archive2.isFullyLoaded()) {
					Login.Login_loadingText = "Loading config - " + SecureRandomFuture.archive2.loadPercent() + "%";
					Login.Login_loadingPercent = 60;
				} else {
					FaceNormal.method4252(SecureRandomFuture.archive2);
					Archive var29 = SecureRandomFuture.archive2;
					FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var29;
					var35 = SecureRandomFuture.archive2;
					var2 = PcmPlayer.archive9;
					class125.KitDefinition_archive = var35;
					KitDefinition.KitDefinition_modelsArchive = var2;
					TileItem.KitDefinition_fileCount = class125.KitDefinition_archive.getGroupFileCount(3);
					Actor.method2262(SecureRandomFuture.archive2, PcmPlayer.archive9, Client.isLowDetail);
					Archive var25 = SecureRandomFuture.archive2;
					Archive var4 = PcmPlayer.archive9;
					NPCComposition.NpcDefinition_archive = var25;
					NPCComposition.NpcDefinition_modelArchive = var4;
					Archive var34 = SecureRandomFuture.archive2;
					StructComposition.StructDefinition_archive = var34;
					Archive var26 = SecureRandomFuture.archive2;
					Archive var36 = PcmPlayer.archive9;
					boolean var37 = Client.isMembersWorld;
					Font var40 = UserComparator10.fontPlain11;
					ItemComposition.ItemDefinition_archive = var26;
					SoundCache.ItemDefinition_modelArchive = var36;
					ItemComposition.ItemDefinition_inMembersWorld = var37;
					ItemComposition.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
					ItemComposition.ItemDefinition_fontPlain11 = var40;
					Archive var27 = SecureRandomFuture.archive2;
					Archive var11 = ClanChannel.archive3;
					Archive var12 = KitDefinition.archive4;
					SequenceDefinition.SequenceDefinition_archive = var27;
					SequenceDefinition.SequenceDefinition_animationsArchive = var11;
					SequenceDefinition.SequenceDefinition_skeletonsArchive = var12;
					ObjectComposition.method3069(SecureRandomFuture.archive2, PcmPlayer.archive9);
					Archive var13 = SecureRandomFuture.archive2;
					VarbitComposition.VarbitDefinition_archive = var13;
					class125.method2587(SecureRandomFuture.archive2);
					NPCComposition.method2868(class18.archive5, PcmPlayer.archive9, ModeWhere.archive8, GrandExchangeOfferOwnWorldComparator.archive13);
					Archive var14 = SecureRandomFuture.archive2;
					InvDefinition.InvDefinition_archive = var14;
					class10.method109(SecureRandomFuture.archive2);
					Archive var15 = SecureRandomFuture.archive2;
					VarcInt.VarcInt_archive = var15;
					Archive var16 = SecureRandomFuture.archive2;
					ParamComposition.ParamDefinition_archive = var16;
					class27.field215 = new class370(class182.field2114, 54, AbstractArchive.clientLanguage, SecureRandomFuture.archive2);
					class26.HitSplatDefinition_cachedSprites = new class370(class182.field2114, 47, AbstractArchive.clientLanguage, SecureRandomFuture.archive2);
					class20.varcs = new Varcs();
					LoginScreenAnimation.method2312(SecureRandomFuture.archive2, ModeWhere.archive8, GrandExchangeOfferOwnWorldComparator.archive13);
					ClanSettings.method203(SecureRandomFuture.archive2, ModeWhere.archive8);
					Archive var17 = SecureRandomFuture.archive2;
					Archive var18 = ModeWhere.archive8;
					class244.WorldMapElement_archive = var18;
					if (var17.isFullyLoaded()) {
						WorldMapElement.WorldMapElement_count = var17.getGroupFileCount(35);
						WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

						for (int var19 = 0; var19 < WorldMapElement.WorldMapElement_count; ++var19) {
							byte[] var20 = var17.takeFile(35, var19);
							WorldMapElement.WorldMapElement_cached[var19] = new WorldMapElement(var19);
							if (var20 != null) {
								WorldMapElement.WorldMapElement_cached[var19].decode(new Buffer(var20));
								WorldMapElement.WorldMapElement_cached[var19].method2724();
							}
						}
					}

					Login.Login_loadingText = "Loaded config";
					Login.Login_loadingPercent = 60;
					Client.titleLoadingStage = 80;
				}
			} else if (Client.titleLoadingStage == 80) {
				var21 = 0;
				if (Friend.compass == null) {
					Friend.compass = Tile.SpriteBuffer_getSprite(ModeWhere.archive8, ClanChannel.spriteIds.compass, 0);
				} else {
					++var21;
				}

				if (class22.redHintArrowSprite == null) {
					class22.redHintArrowSprite = Tile.SpriteBuffer_getSprite(ModeWhere.archive8, ClanChannel.spriteIds.field3892, 0);
				} else {
					++var21;
				}

				IndexedSprite[] var1;
				IndexedSprite[] var5;
				int var6;
				IndexedSprite var7;
				if (FloorDecoration.mapSceneSprites == null) {
					var2 = ModeWhere.archive8;
					var3 = ClanChannel.spriteIds.mapScenes;
					if (!Message.method1263(var2, var3, 0)) {
						var1 = null;
					} else {
						var5 = new IndexedSprite[class397.SpriteBuffer_spriteCount];

						for (var6 = 0; var6 < class397.SpriteBuffer_spriteCount; ++var6) {
							var7 = var5[var6] = new IndexedSprite();
							var7.width = class397.SpriteBuffer_spriteWidth;
							var7.height = class244.SpriteBuffer_spriteHeight;
							var7.xOffset = class397.SpriteBuffer_xOffsets[var6];
							var7.yOffset = class26.SpriteBuffer_yOffsets[var6];
							var7.subWidth = Canvas.SpriteBuffer_spriteWidths[var6];
							var7.subHeight = Clock.SpriteBuffer_spriteHeights[var6];
							var7.palette = class397.SpriteBuffer_spritePalette;
							var7.pixels = class126.SpriteBuffer_pixels[var6];
						}

						ArchiveDisk.method5993();
						var1 = var5;
					}

					FloorDecoration.mapSceneSprites = var1;
				} else {
					++var21;
				}

				int var8;
				byte[] var9;
				int var10;
				SpritePixels[] var30;
				SpritePixels[] var31;
				SpritePixels var33;
				if (ScriptFrame.headIconPkSprites == null) {
					var2 = ModeWhere.archive8;
					var3 = ClanChannel.spriteIds.headIconsPk;
					if (!Message.method1263(var2, var3, 0)) {
						var30 = null;
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount];
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993();
								var30 = var31;
								break;
							}

							var33 = var31[var6] = new SpritePixels();
							var33.width = class397.SpriteBuffer_spriteWidth;
							var33.height = class244.SpriteBuffer_spriteHeight;
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6];
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6];
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6];
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6];
							var8 = var33.subHeight * var33.subWidth;
							var9 = class126.SpriteBuffer_pixels[var6];
							var33.pixels = new int[var8];

							for (var10 = 0; var10 < var8; ++var10) {
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6;
						}
					}

					ScriptFrame.headIconPkSprites = var30;
				} else {
					++var21;
				}

				if (class20.headIconPrayerSprites == null) {
					var2 = ModeWhere.archive8;
					var3 = ClanChannel.spriteIds.field3903;
					if (!Message.method1263(var2, var3, 0)) {
						var30 = null;
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount];
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993();
								var30 = var31;
								break;
							}

							var33 = var31[var6] = new SpritePixels();
							var33.width = class397.SpriteBuffer_spriteWidth;
							var33.height = class244.SpriteBuffer_spriteHeight;
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6];
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6];
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6];
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6];
							var8 = var33.subWidth * var33.subHeight;
							var9 = class126.SpriteBuffer_pixels[var6];
							var33.pixels = new int[var8];

							for (var10 = 0; var10 < var8; ++var10) {
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6;
						}
					}

					class20.headIconPrayerSprites = var30;
				} else {
					++var21;
				}

				if (Skills.headIconHintSprites == null) {
					var2 = ModeWhere.archive8;
					var3 = ClanChannel.spriteIds.field3902;
					if (!Message.method1263(var2, var3, 0)) {
						var30 = null;
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount];
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993();
								var30 = var31;
								break;
							}

							var33 = var31[var6] = new SpritePixels();
							var33.width = class397.SpriteBuffer_spriteWidth;
							var33.height = class244.SpriteBuffer_spriteHeight;
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6];
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6];
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6];
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6];
							var8 = var33.subHeight * var33.subWidth;
							var9 = class126.SpriteBuffer_pixels[var6];
							var33.pixels = new int[var8];

							for (var10 = 0; var10 < var8; ++var10) {
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6;
						}
					}

					Skills.headIconHintSprites = var30;
				} else {
					++var21;
				}

				if (BuddyRankComparator.mapMarkerSprites == null) {
					var2 = ModeWhere.archive8;
					var3 = ClanChannel.spriteIds.field3897;
					if (!Message.method1263(var2, var3, 0)) {
						var30 = null;
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount];
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993();
								var30 = var31;
								break;
							}

							var33 = var31[var6] = new SpritePixels();
							var33.width = class397.SpriteBuffer_spriteWidth;
							var33.height = class244.SpriteBuffer_spriteHeight;
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6];
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6];
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6];
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6];
							var8 = var33.subWidth * var33.subHeight;
							var9 = class126.SpriteBuffer_pixels[var6];
							var33.pixels = new int[var8];

							for (var10 = 0; var10 < var8; ++var10) {
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6;
						}
					}

					BuddyRankComparator.mapMarkerSprites = var30;
				} else {
					++var21;
				}

				if (NPCComposition.crossSprites == null) {
					var2 = ModeWhere.archive8;
					var3 = ClanChannel.spriteIds.field3899;
					if (!Message.method1263(var2, var3, 0)) {
						var30 = null;
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount];
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993();
								var30 = var31;
								break;
							}

							var33 = var31[var6] = new SpritePixels();
							var33.width = class397.SpriteBuffer_spriteWidth;
							var33.height = class244.SpriteBuffer_spriteHeight;
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6];
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6];
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6];
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6];
							var8 = var33.subWidth * var33.subHeight;
							var9 = class126.SpriteBuffer_pixels[var6];
							var33.pixels = new int[var8];

							for (var10 = 0; var10 < var8; ++var10) {
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6;
						}
					}

					NPCComposition.crossSprites = var30;
				} else {
					++var21;
				}

				if (class171.mapDotSprites == null) {
					var2 = ModeWhere.archive8;
					var3 = ClanChannel.spriteIds.field3900;
					if (!Message.method1263(var2, var3, 0)) {
						var30 = null;
					} else {
						var31 = new SpritePixels[class397.SpriteBuffer_spriteCount];
						var6 = 0;

						while (true) {
							if (var6 >= class397.SpriteBuffer_spriteCount) {
								ArchiveDisk.method5993();
								var30 = var31;
								break;
							}

							var33 = var31[var6] = new SpritePixels();
							var33.width = class397.SpriteBuffer_spriteWidth;
							var33.height = class244.SpriteBuffer_spriteHeight;
							var33.xOffset = class397.SpriteBuffer_xOffsets[var6];
							var33.yOffset = class26.SpriteBuffer_yOffsets[var6];
							var33.subWidth = Canvas.SpriteBuffer_spriteWidths[var6];
							var33.subHeight = Clock.SpriteBuffer_spriteHeights[var6];
							var8 = var33.subHeight * var33.subWidth;
							var9 = class126.SpriteBuffer_pixels[var6];
							var33.pixels = new int[var8];

							for (var10 = 0; var10 < var8; ++var10) {
								var33.pixels[var10] = class397.SpriteBuffer_spritePalette[var9[var10] & 255];
							}

							++var6;
						}
					}

					class171.mapDotSprites = var30;
				} else {
					++var21;
				}

				if (Client.scrollBarSprites == null) {
					var2 = ModeWhere.archive8;
					var3 = ClanChannel.spriteIds.field3901;
					if (!Message.method1263(var2, var3, 0)) {
						var1 = null;
					} else {
						var5 = new IndexedSprite[class397.SpriteBuffer_spriteCount];

						for (var6 = 0; var6 < class397.SpriteBuffer_spriteCount; ++var6) {
							var7 = var5[var6] = new IndexedSprite();
							var7.width = class397.SpriteBuffer_spriteWidth;
							var7.height = class244.SpriteBuffer_spriteHeight;
							var7.xOffset = class397.SpriteBuffer_xOffsets[var6];
							var7.yOffset = class26.SpriteBuffer_yOffsets[var6];
							var7.subWidth = Canvas.SpriteBuffer_spriteWidths[var6];
							var7.subHeight = Clock.SpriteBuffer_spriteHeights[var6];
							var7.palette = class397.SpriteBuffer_spritePalette;
							var7.pixels = class126.SpriteBuffer_pixels[var6];
						}

						ArchiveDisk.method5993();
						var1 = var5;
					}

					Client.scrollBarSprites = var1;
				} else {
					++var21;
				}

				if (class35.modIconSprites == null) {
					var2 = ModeWhere.archive8;
					var3 = ClanChannel.spriteIds.field3896;
					if (!Message.method1263(var2, var3, 0)) {
						var1 = null;
					} else {
						var5 = new IndexedSprite[class397.SpriteBuffer_spriteCount];

						for (var6 = 0; var6 < class397.SpriteBuffer_spriteCount; ++var6) {
							var7 = var5[var6] = new IndexedSprite();
							var7.width = class397.SpriteBuffer_spriteWidth;
							var7.height = class244.SpriteBuffer_spriteHeight;
							var7.xOffset = class397.SpriteBuffer_xOffsets[var6];
							var7.yOffset = class26.SpriteBuffer_yOffsets[var6];
							var7.subWidth = Canvas.SpriteBuffer_spriteWidths[var6];
							var7.subHeight = Clock.SpriteBuffer_spriteHeights[var6];
							var7.palette = class397.SpriteBuffer_spritePalette;
							var7.pixels = class126.SpriteBuffer_pixels[var6];
						}

						ArchiveDisk.method5993();
						var1 = var5;
					}

					class35.modIconSprites = var1;
				} else {
					++var21;
				}

				if (var21 < 11) {
					Login.Login_loadingText = "Loading sprites - " + var21 * 100 / 12 + "%";
					Login.Login_loadingPercent = 70;
				} else {
					AbstractFont.AbstractFont_modIconSprites = class35.modIconSprites;
					class22.redHintArrowSprite.normalize();
					int var22 = (int)(Math.random() * 21.0D) - 10;
					int var23 = (int)(Math.random() * 21.0D) - 10;
					var3 = (int)(Math.random() * 21.0D) - 10;
					int var24 = (int)(Math.random() * 41.0D) - 20;
					FloorDecoration.mapSceneSprites[0].shiftColors(var22 + var24, var23 + var24, var3 + var24);
					Login.Login_loadingText = "Loaded sprites";
					Login.Login_loadingPercent = 70;
					Client.titleLoadingStage = 90;
				}
			} else if (Client.titleLoadingStage == 90) {
				if (!class16.field134.isFullyLoaded()) {
					Login.Login_loadingText = "Loading textures - " + "0%";
					Login.Login_loadingPercent = 90;
				} else {
					Renderable.textureProvider = new TextureProvider(class16.field134, ModeWhere.archive8, 20, class4.clientPreferences.field1312, Client.isLowDetail ? 64 : 128);
					Rasterizer3D.Rasterizer3D_setTextureLoader(Renderable.textureProvider);
					Rasterizer3D.Rasterizer3D_setBrightness(class4.clientPreferences.field1312);
					Client.titleLoadingStage = 100;
				}
			} else if (Client.titleLoadingStage == 100) {
				var21 = Renderable.textureProvider.getLoadedPercentage();
				if (var21 < 100) {
					Login.Login_loadingText = "Loading textures - " + var21 + "%";
					Login.Login_loadingPercent = 90;
				} else {
					Login.Login_loadingText = "Loaded textures";
					Login.Login_loadingPercent = 90;
					Client.titleLoadingStage = 110;
				}
			} else if (Client.titleLoadingStage == 110) {
				UrlRequester.mouseRecorder = new class96();
				GameEngine.taskHandler.newThreadTask(UrlRequester.mouseRecorder, 10);
				Login.Login_loadingText = "Loaded input handler";
				Login.Login_loadingPercent = 92;
				Client.titleLoadingStage = 120;
			} else if (Client.titleLoadingStage == 120) {
				if (!JagexCache.archive10.tryLoadFileByNames("huffman", "")) {
					Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
					Login.Login_loadingPercent = 94;
				} else {
					Huffman var0 = new Huffman(JagexCache.archive10.takeFileByNames("huffman", ""));
					WorldMapCacheName.method3789(var0);
					Login.Login_loadingText = "Loaded wordpack";
					Login.Login_loadingPercent = 94;
					Client.titleLoadingStage = 130;
				}
			} else if (Client.titleLoadingStage == 130) {
				if (!class18.archive5.isFullyLoaded()) {
					Login.Login_loadingText = "Loading interfaces - " + class18.archive5.loadPercent() * 4 / 5 + "%";
					Login.Login_loadingPercent = 96;
				} else if (!Varcs.archive12.isFullyLoaded()) {
					Login.Login_loadingText = "Loading interfaces - " + (80 + Varcs.archive12.loadPercent() / 6) + "%";
					Login.Login_loadingPercent = 96;
				} else if (!GrandExchangeOfferOwnWorldComparator.archive13.isFullyLoaded()) {
					Login.Login_loadingText = "Loading interfaces - " + (96 + GrandExchangeOfferOwnWorldComparator.archive13.loadPercent() / 50) + "%";
					Login.Login_loadingPercent = 96;
				} else {
					Login.Login_loadingText = "Loaded interfaces";
					Login.Login_loadingPercent = 98;
					Client.titleLoadingStage = 140;
				}
			} else if (Client.titleLoadingStage == 140) {
				Login.Login_loadingPercent = 100;
				if (!WorldMapEvent.archive19.tryLoadGroupByName(WorldMapCacheName.field2131.name)) {
					Login.Login_loadingText = "Loading world map - " + WorldMapEvent.archive19.groupLoadPercentByName(WorldMapCacheName.field2131.name) / 10 + "%";
				} else {
					if (class80.worldMap == null) {
						class80.worldMap = new WorldMap();
						class80.worldMap.init(WorldMapEvent.archive19, class6.archive18, WorldMapLabel.archive20, class309.fontBold12, Client.fontsMap, FloorDecoration.mapSceneSprites);
					}

					Login.Login_loadingText = "Loaded world map";
					Client.titleLoadingStage = 150;
				}
			} else if (Client.titleLoadingStage == 150) {
				Projectile.updateGameState(10);
			}
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "125685661"
	)
	static void method407() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
