import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
public class class336 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -691755619
	)
	@Export("SpriteBuffer_spriteCount")
	static int SpriteBuffer_spriteCount;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1823110703
	)
	@Export("SpriteBuffer_spriteWidth")
	static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2023472681
	)
	@Export("SpriteBuffer_spriteHeight")
	static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("m")
	@Export("SpriteBuffer_xOffsets")
	static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("q")
	@Export("SpriteBuffer_spriteWidths")
	static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("k")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;

	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "374882055"
	)
	@Export("load")
	static void load() {
		int var24;
		if (Client.titleLoadingStage == 0) {
			ModeWhere.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var24 = 0; var24 < 4; ++var24) {
				Client.collisionMaps[var24] = new CollisionMap(104, 104);
			}

			InterfaceParent.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			MenuAction.archive0 = ReflectionCheck.newArchive(0, false, true, true);
			WorldMapManager.archive1 = ReflectionCheck.newArchive(1, false, true, true);
			WorldMapSection3.archive2 = ReflectionCheck.newArchive(2, true, false, true);
			FaceNormal.archive3 = ReflectionCheck.newArchive(3, false, true, true);
			Username.archive4 = ReflectionCheck.newArchive(4, false, true, true);
			Varcs.archive5 = ReflectionCheck.newArchive(5, true, true, true);
			ApproximateRouteStrategy.archive6 = ReflectionCheck.newArchive(6, true, true, true);
			class236.archive7 = ReflectionCheck.newArchive(7, false, true, true);
			GrandExchangeOffer.archive8 = ReflectionCheck.newArchive(8, false, true, true);
			WorldMapData_1.archive9 = ReflectionCheck.newArchive(9, false, true, true);
			class281.archive10 = ReflectionCheck.newArchive(10, false, true, true);
			AbstractByteArrayCopier.archive11 = ReflectionCheck.newArchive(11, false, true, true);
			ViewportMouse.archive12 = ReflectionCheck.newArchive(12, false, true, true);
			class8.archive13 = ReflectionCheck.newArchive(13, true, false, true);
			AbstractByteArrayCopier.archive14 = ReflectionCheck.newArchive(14, false, true, true);
			class1.archive15 = ReflectionCheck.newArchive(15, false, true, true);
			class23.archive17 = ReflectionCheck.newArchive(17, true, true, true);
			ModelData0.archive18 = ReflectionCheck.newArchive(18, false, true, true);
			class60.archive19 = ReflectionCheck.newArchive(19, false, true, true);
			Tiles.archive20 = ReflectionCheck.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage != 40) {
			if (Client.titleLoadingStage == 45) {
				boolean var27 = !Client.isLowDetail;
				PcmPlayer.field1442 = 22050;
				PcmPlayer.PcmPlayer_stereo = var27;
				FontName.field3694 = 2;
				MidiPcmStream var25 = new MidiPcmStream();
				var25.method3863(9, 128);
				class195.pcmPlayer0 = class13.method146(GameEngine.taskHandler, 0, 22050);
				class195.pcmPlayer0.setStream(var25);
				ItemLayer.method2909(class1.archive15, AbstractByteArrayCopier.archive14, Username.archive4, var25);
				class23.pcmPlayer1 = class13.method146(GameEngine.taskHandler, 1, 2048);
				GrandExchangeEvents.pcmStreamMixer = new PcmStreamMixer();
				class23.pcmPlayer1.setStream(GrandExchangeEvents.pcmStreamMixer);
				NetSocket.decimator = new Decimator(22050, PcmPlayer.field1442);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				WorldMapAreaData.WorldMapElement_fonts = new Fonts(GrandExchangeOffer.archive8, class8.archive13);
			} else if (Client.titleLoadingStage == 50) {
				var24 = FontName.method5456().length;
				Client.fontsMap = WorldMapAreaData.WorldMapElement_fonts.createMap(FontName.method5456());
				if (Client.fontsMap.size() < var24) {
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var24 + "%";
					Login.Login_loadingPercent = 40;
				} else {
					DevicePcmPlayerProvider.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
					WorldMapCacheName.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
					ReflectionCheck.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
					Skills.platformInfo = Client.platformInfoProvider.get();
					Login.Login_loadingText = "Loaded fonts";
					Login.Login_loadingPercent = 40;
					Client.titleLoadingStage = 60;
				}
			} else {
				Archive var1;
				Archive var2;
				int var3;
				int var4;
				if (Client.titleLoadingStage == 60) {
					var1 = class281.archive10;
					var2 = GrandExchangeOffer.archive8;
					var3 = 0;
					if (var1.tryLoadFileByNames("title.jpg", "")) {
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
					var4 = class90.method2168();
					if (var3 < var4) {
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%";
						Login.Login_loadingPercent = 50;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = 50;
						BuddyRankComparator.updateGameState(5);
						Client.titleLoadingStage = 70;
					}
				} else if (Client.titleLoadingStage == 70) {
					if (!WorldMapSection3.archive2.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + WorldMapSection3.archive2.loadPercent() + "%";
						Login.Login_loadingPercent = 60;
					} else {
						Archive var28 = WorldMapSection3.archive2;
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var28;
						ScriptFrame.method1224(WorldMapSection3.archive2);
						FileSystem.method3630(WorldMapSection3.archive2, class236.archive7);
						var1 = WorldMapSection3.archive2;
						var2 = class236.archive7;
						boolean var26 = Client.isLowDetail;
						ObjectComposition.ObjectDefinition_archive = var1;
						GrandExchangeOfferAgeComparator.ObjectDefinition_modelsArchive = var2;
						ObjectComposition.ObjectDefinition_isLowDetail = var26;
						Archive var21 = WorldMapSection3.archive2;
						Archive var5 = class236.archive7;
						NPCComposition.NpcDefinition_archive = var21;
						NPCComposition.NpcDefinition_modelArchive = var5;
						WorldMapAreaData.method791(WorldMapSection3.archive2);
						Archive var6 = WorldMapSection3.archive2;
						Archive var7 = class236.archive7;
						boolean var8 = Client.isMembersWorld;
						Font var9 = DevicePcmPlayerProvider.fontPlain11;
						ItemComposition.ItemDefinition_archive = var6;
						UserComparator9.ItemDefinition_modelArchive = var7;
						SoundCache.ItemDefinition_inMembersWorld = var8;
						HealthBar.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
						VerticalAlignment.ItemDefinition_fontPlain11 = var9;
						Archive var10 = WorldMapSection3.archive2;
						Archive var11 = MenuAction.archive0;
						Archive var12 = WorldMapManager.archive1;
						SequenceDefinition.SequenceDefinition_archive = var10;
						SequenceDefinition.SequenceDefinition_animationsArchive = var11;
						DefaultsGroup.SequenceDefinition_skeletonsArchive = var12;
						class182.method3716(WorldMapSection3.archive2, class236.archive7);
						Archive var13 = WorldMapSection3.archive2;
						VarbitComposition.VarbitDefinition_archive = var13;
						FaceNormal.method3393(WorldMapSection3.archive2);
						Varps.method4126(FaceNormal.archive3, class236.archive7, GrandExchangeOffer.archive8, class8.archive13);
						GrandExchangeOfferUnitPriceComparator.method211(WorldMapSection3.archive2);
						Messages.method2328(WorldMapSection3.archive2);
						Messages.method2339(WorldMapSection3.archive2);
						Archive var14 = WorldMapSection3.archive2;
						ParamDefinition.ParamDefinition_archive = var14;
						FriendSystem.varcs = new Varcs();
						Archive var15 = WorldMapSection3.archive2;
						Archive var16 = GrandExchangeOffer.archive8;
						Archive var17 = class8.archive13;
						HitSplatDefinition.HitSplatDefinition_archive = var15;
						HitSplatDefinition.field3350 = var16;
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var17;
						Archive var18 = WorldMapSection3.archive2;
						Archive var19 = GrandExchangeOffer.archive8;
						HealthBarDefinition.HealthBarDefinition_archive = var18;
						HealthBarDefinition.HitSplatDefinition_spritesArchive = var19;
						UserComparator4.method3504(WorldMapSection3.archive2, GrandExchangeOffer.archive8);
						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.titleLoadingStage = 80;
					}
				} else if (Client.titleLoadingStage == 80) {
					var24 = 0;
					if (UserComparator5.compass == null) {
						UserComparator5.compass = FloorDecoration.SpriteBuffer_getSprite(GrandExchangeOffer.archive8, FontName.spriteIds.compass, 0);
					} else {
						++var24;
					}

					if (class219.redHintArrowSprite == null) {
						class219.redHintArrowSprite = FloorDecoration.SpriteBuffer_getSprite(GrandExchangeOffer.archive8, FontName.spriteIds.field3835, 0);
					} else {
						++var24;
					}

					if (AbstractWorldMapIcon.mapSceneSprites == null) {
						AbstractWorldMapIcon.mapSceneSprites = UserComparator5.method3540(GrandExchangeOffer.archive8, FontName.spriteIds.mapScenes, 0);
					} else {
						++var24;
					}

					if (World.headIconPkSprites == null) {
						World.headIconPkSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.headIconsPk, 0);
					} else {
						++var24;
					}

					if (TaskHandler.headIconPrayerSprites == null) {
						TaskHandler.headIconPrayerSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.field3836, 0);
					} else {
						++var24;
					}

					if (class337.headIconHintSprites == null) {
						class337.headIconHintSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.field3839, 0);
					} else {
						++var24;
					}

					if (ScriptEvent.mapMarkerSprites == null) {
						ScriptEvent.mapMarkerSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.field3841, 0);
					} else {
						++var24;
					}

					if (class60.crossSprites == null) {
						class60.crossSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.field3837, 0);
					} else {
						++var24;
					}

					if (Renderable.mapDotSprites == null) {
						Renderable.mapDotSprites = HorizontalAlignment.method4882(GrandExchangeOffer.archive8, FontName.spriteIds.field3834, 0);
					} else {
						++var24;
					}

					if (WorldMapSection0.scrollBarSprites == null) {
						WorldMapSection0.scrollBarSprites = UserComparator5.method3540(GrandExchangeOffer.archive8, FontName.spriteIds.field3842, 0);
					} else {
						++var24;
					}

					if (SpriteMask.modIconSprites == null) {
						SpriteMask.modIconSprites = UserComparator5.method3540(GrandExchangeOffer.archive8, FontName.spriteIds.field3844, 0);
					} else {
						++var24;
					}

					if (var24 < 11) {
						Login.Login_loadingText = "Loading sprites - " + var24 * 100 / 12 + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = SpriteMask.modIconSprites;
						class219.redHintArrowSprite.normalize();
						int var22 = (int)(Math.random() * 21.0D) - 10;
						int var23 = (int)(Math.random() * 21.0D) - 10;
						var3 = (int)(Math.random() * 21.0D) - 10;
						var4 = (int)(Math.random() * 41.0D) - 20;
						AbstractWorldMapIcon.mapSceneSprites[0].shiftColors(var22 + var4, var23 + var4, var4 + var3);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.titleLoadingStage = 90;
					}
				} else if (Client.titleLoadingStage == 90) {
					if (!WorldMapData_1.archive9.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						class278.textureProvider = new TextureProvider(WorldMapData_1.archive9, GrandExchangeOffer.archive8, 20, 0.8D, Client.isLowDetail ? 64 : 128);
						Rasterizer3D.Rasterizer3D_setTextureLoader(class278.textureProvider);
						Rasterizer3D.Rasterizer3D_setBrightness(0.8D);
						Client.titleLoadingStage = 100;
					}
				} else if (Client.titleLoadingStage == 100) {
					var24 = class278.textureProvider.getLoadedPercentage();
					if (var24 < 100) {
						Login.Login_loadingText = "Loading textures - " + var24 + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.titleLoadingStage = 110;
					}
				} else if (Client.titleLoadingStage == 110) {
					class204.mouseRecorder = new MouseRecorder();
					GameEngine.taskHandler.newThreadTask(class204.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.titleLoadingStage = 120;
				} else if (Client.titleLoadingStage == 120) {
					if (!class281.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var20 = new Huffman(class281.archive10.takeFileByNames("huffman", ""));
						class4.method77(var20);
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.titleLoadingStage = 130;
					}
				} else if (Client.titleLoadingStage == 130) {
					if (!FaceNormal.archive3.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + FaceNormal.archive3.loadPercent() * 4 / 5 + "%";
						Login.Login_loadingPercent = 96;
					} else if (!ViewportMouse.archive12.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (80 + ViewportMouse.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class8.archive13.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (96 + class8.archive13.loadPercent() / 50) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						Client.titleLoadingStage = 140;
					}
				} else if (Client.titleLoadingStage == 140) {
					Login.Login_loadingPercent = 100;
					if (!class60.archive19.tryLoadGroupByName(WorldMapCacheName.field320.name)) {
						Login.Login_loadingText = "Loading world map - " + class60.archive19.groupLoadPercentByName(WorldMapCacheName.field320.name) / 10 + "%";
					} else {
						if (KeyHandler.worldMap == null) {
							KeyHandler.worldMap = new WorldMap();
							KeyHandler.worldMap.init(class60.archive19, ModelData0.archive18, Tiles.archive20, ReflectionCheck.fontBold12, Client.fontsMap, AbstractWorldMapIcon.mapSceneSprites);
						}

						Login.Login_loadingText = "Loaded world map";
						Client.titleLoadingStage = 150;
					}
				} else if (Client.titleLoadingStage == 150) {
					BuddyRankComparator.updateGameState(10);
				}
			}
		} else {
			byte var0 = 0;
			var24 = var0 + MenuAction.archive0.percentage() * 4 / 100;
			var24 += WorldMapManager.archive1.percentage() * 4 / 100;
			var24 += WorldMapSection3.archive2.percentage() * 2 / 100;
			var24 += FaceNormal.archive3.percentage() * 2 / 100;
			var24 += Username.archive4.percentage() * 6 / 100;
			var24 += Varcs.archive5.percentage() * 4 / 100;
			var24 += ApproximateRouteStrategy.archive6.percentage() * 2 / 100;
			var24 += class236.archive7.percentage() * 56 / 100;
			var24 += GrandExchangeOffer.archive8.percentage() * 2 / 100;
			var24 += WorldMapData_1.archive9.percentage() * 2 / 100;
			var24 += class281.archive10.percentage() * 2 / 100;
			var24 += AbstractByteArrayCopier.archive11.percentage() * 2 / 100;
			var24 += ViewportMouse.archive12.percentage() * 2 / 100;
			var24 += class8.archive13.percentage() * 2 / 100;
			var24 += AbstractByteArrayCopier.archive14.percentage() * 2 / 100;
			var24 += class1.archive15.percentage() * 2 / 100;
			var24 += class60.archive19.percentage() / 100;
			var24 += ModelData0.archive18.percentage() / 100;
			var24 += Tiles.archive20.percentage() / 100;
			var24 += class23.archive17.method4420() && class23.archive17.isFullyLoaded() ? 1 : 0;
			if (var24 != 100) {
				if (var24 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var24 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				ArchiveDiskActionHandler.method4404(MenuAction.archive0, "Animations");
				ArchiveDiskActionHandler.method4404(WorldMapManager.archive1, "Skeletons");
				ArchiveDiskActionHandler.method4404(Username.archive4, "Sound FX");
				ArchiveDiskActionHandler.method4404(Varcs.archive5, "Maps");
				ArchiveDiskActionHandler.method4404(ApproximateRouteStrategy.archive6, "Music Tracks");
				ArchiveDiskActionHandler.method4404(class236.archive7, "Models");
				ArchiveDiskActionHandler.method4404(GrandExchangeOffer.archive8, "Sprites");
				ArchiveDiskActionHandler.method4404(AbstractByteArrayCopier.archive11, "Music Jingles");
				ArchiveDiskActionHandler.method4404(AbstractByteArrayCopier.archive14, "Music Samples");
				ArchiveDiskActionHandler.method4404(class1.archive15, "Music Patches");
				ArchiveDiskActionHandler.method4404(class60.archive19, "World Map");
				ArchiveDiskActionHandler.method4404(ModelData0.archive18, "World Map Geography");
				ArchiveDiskActionHandler.method4404(Tiles.archive20, "World Map Ground");
				FontName.spriteIds = new GraphicsDefaults();
				FontName.spriteIds.decode(class23.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		}
	}
}
