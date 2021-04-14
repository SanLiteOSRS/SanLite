import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public enum class34 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lap;"
	)
	field236(0, 0);

	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		signature = "Lby;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("g")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("aw")
	static String field229;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1478025593
	)
	static int field232;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -337730907
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1373587667
	)
	public final int field230;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2109916151
	)
	final int field233;

	class34(int var3, int var4) {
		this.field230 = var3;
		this.field233 = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field233;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "0"
	)
	public static boolean method415() {
		ReflectionCheck var0 = (ReflectionCheck)class69.reflectionChecks.last();
		return var0 != null;
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-842302459"
	)
	@Export("load")
	static void load() {
		int var24;
		if (Client.titleLoadingStage == 0) {
			WorldMapArea.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var24 = 0; var24 < 4; ++var24) {
				Client.collisionMaps[var24] = new CollisionMap(104, 104);
			}

			class19.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			TriBool.archive0 = HitSplatDefinition.newArchive(0, false, true, true);
			class367.archive1 = HitSplatDefinition.newArchive(1, false, true, true);
			class235.archive2 = HitSplatDefinition.newArchive(2, true, false, true);
			class5.archive3 = HitSplatDefinition.newArchive(3, false, true, true);
			ItemContainer.archive4 = HitSplatDefinition.newArchive(4, false, true, true);
			class157.archive5 = HitSplatDefinition.newArchive(5, true, true, true);
			class8.archive6 = HitSplatDefinition.newArchive(6, true, true, true);
			class12.archive7 = HitSplatDefinition.newArchive(7, false, true, true);
			SoundSystem.archive8 = HitSplatDefinition.newArchive(8, false, true, true);
			AbstractWorldMapData.archive9 = HitSplatDefinition.newArchive(9, false, true, true);
			class373.archive10 = HitSplatDefinition.newArchive(10, false, true, true);
			class10.archive11 = HitSplatDefinition.newArchive(11, false, true, true);
			BuddyRankComparator.archive12 = HitSplatDefinition.newArchive(12, false, true, true);
			MilliClock.archive13 = HitSplatDefinition.newArchive(13, true, false, true);
			WorldMapSection0.archive14 = HitSplatDefinition.newArchive(14, false, true, true);
			Buddy.archive15 = HitSplatDefinition.newArchive(15, false, true, true);
			class0.archive17 = HitSplatDefinition.newArchive(17, true, true, true);
			class246.archive18 = HitSplatDefinition.newArchive(18, false, true, true);
			class283.archive19 = HitSplatDefinition.newArchive(19, false, true, true);
			NPCComposition.archive20 = HitSplatDefinition.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage != 40) {
			Archive var2;
			Archive var3;
			Archive var4;
			if (Client.titleLoadingStage == 45) {
				boolean var28 = !Client.isLowDetail;
				PcmPlayer.field394 = 486202500;
				PcmPlayer.PcmPlayer_stereo = var28;
				Frames.field2007 = 2;
				MidiPcmStream var25 = new MidiPcmStream();
				var25.method3938(9, 128);
				ApproximateRouteStrategy.pcmPlayer0 = class3.method57(GameEngine.taskHandler, 0, 22050);
				ApproximateRouteStrategy.pcmPlayer0.setStream(var25);
				var2 = Buddy.archive15;
				var3 = WorldMapSection0.archive14;
				var4 = ItemContainer.archive4;
				class210.musicPatchesArchive = var2;
				class372.musicSamplesArchive = var3;
				class210.soundEffectsArchive = var4;
				class210.midiPcmStream = var25;
				class43.pcmPlayer1 = class3.method57(GameEngine.taskHandler, 1, 2048);
				Huffman.pcmStreamMixer = new PcmStreamMixer();
				class43.pcmPlayer1.setStream(Huffman.pcmStreamMixer);
				decimator = new Decimator(22050, PcmPlayer.field394 * 22050);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				class243.WorldMapElement_fonts = new Fonts(SoundSystem.archive8, MilliClock.archive13);
			} else {
				int var20;
				if (Client.titleLoadingStage == 50) {
					FontName[] var30 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13};
					var20 = var30.length;
					Fonts var26 = class243.WorldMapElement_fonts;
					FontName[] var27 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13};
					Client.fontsMap = var26.createMap(var27);
					if (Client.fontsMap.size() < var20) {
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var20 + "%";
						Login.Login_loadingPercent = 40;
					} else {
						class0.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						class14.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						class368.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						UserComparator8.platformInfo = Client.platformInfoProvider.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.titleLoadingStage = 60;
					}
				} else {
					Archive var1;
					int var21;
					int var22;
					if (Client.titleLoadingStage == 60) {
						var1 = class373.archive10;
						var2 = SoundSystem.archive8;
						var21 = 0;
						if (var1.tryLoadFileByNames("title.jpg", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("logo", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("logo_deadman_mode", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("logo_seasonal_mode", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("titlebox", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("titlebutton", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("runes", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("title_mute", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("options_radio_buttons,0", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("options_radio_buttons,2", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("options_radio_buttons,4", "")) {
							++var21;
						}

						if (var2.tryLoadFileByNames("options_radio_buttons,6", "")) {
							++var21;
						}

						var2.tryLoadFileByNames("sl_back", "");
						var2.tryLoadFileByNames("sl_flags", "");
						var2.tryLoadFileByNames("sl_arrows", "");
						var2.tryLoadFileByNames("sl_stars", "");
						var2.tryLoadFileByNames("sl_button", "");
						var22 = DirectByteArrayCopier.method4354();
						if (var21 < var22) {
							Login.Login_loadingText = "Loading title screen - " + var21 * 100 / var22 + "%";
							Login.Login_loadingPercent = 50;
						} else {
							Login.Login_loadingText = "Loaded title screen";
							Login.Login_loadingPercent = 50;
							class20.updateGameState(5);
							Client.titleLoadingStage = 70;
						}
					} else if (Client.titleLoadingStage == 70) {
						if (!class235.archive2.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + class235.archive2.loadPercent() + "%";
							Login.Login_loadingPercent = 60;
						} else {
							Archive var29 = class235.archive2;
							FloorOverlayDefinition.FloorOverlayDefinition_archive = var29;
							class0.method13(class235.archive2);
							var1 = class235.archive2;
							var2 = class12.archive7;
							KitDefinition.KitDefinition_archive = var1;
							class266.KitDefinition_modelsArchive = var2;
							KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
							var3 = class235.archive2;
							var4 = class12.archive7;
							boolean var5 = Client.isLowDetail;
							ObjectComposition.ObjectDefinition_archive = var3;
							ObjectComposition.ObjectDefinition_modelsArchive = var4;
							ObjectComposition.ObjectDefinition_isLowDetail = var5;
							Decimator.method1114(class235.archive2, class12.archive7);
							Archive var6 = class235.archive2;
							StructDefinition.StructDefinition_archive = var6;
							ScriptEvent.method2101(class235.archive2, class12.archive7, Client.isMembersWorld, class0.fontPlain11);
							Archive var7 = class235.archive2;
							Archive var8 = TriBool.archive0;
							Archive var9 = class367.archive1;
							SequenceDefinition.SequenceDefinition_archive = var7;
							GrandExchangeOfferOwnWorldComparator.SequenceDefinition_animationsArchive = var8;
							SequenceDefinition.SequenceDefinition_skeletonsArchive = var9;
							Archive var10 = class235.archive2;
							Archive var11 = class12.archive7;
							SpotAnimationDefinition.SpotAnimationDefinition_archive = var10;
							SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var11;
							Archive var12 = class235.archive2;
							VarbitComposition.VarbitDefinition_archive = var12;
							ItemLayer.method3268(class235.archive2);
							Archive var13 = class5.archive3;
							Archive var14 = class12.archive7;
							Archive var15 = SoundSystem.archive8;
							Archive var16 = MilliClock.archive13;
							FloorDecoration.Widget_archive = var13;
							WorldMapDecoration.Widget_modelsArchive = var14;
							UrlRequest.Widget_spritesArchive = var15;
							class32.Widget_fontsArchive = var16;
							Widget.Widget_interfaceComponents = new Widget[FloorDecoration.Widget_archive.getGroupCount()][];
							class69.Widget_loadedInterfaces = new boolean[FloorDecoration.Widget_archive.getGroupCount()];
							Archive var17 = class235.archive2;
							InvDefinition.InvDefinition_archive = var17;
							Archive var18 = class235.archive2;
							EnumComposition.EnumDefinition_archive = var18;
							class303.method5526(class235.archive2);
							class6.method97(class235.archive2);
							TextureProvider.varcs = new Varcs();
							WorldMapSection0.method3034(class235.archive2, SoundSystem.archive8, MilliClock.archive13);
							VertexNormal.method3782(class235.archive2, SoundSystem.archive8);
							class18.method280(class235.archive2, SoundSystem.archive8);
							Login.Login_loadingText = "Loaded config";
							Login.Login_loadingPercent = 60;
							Client.titleLoadingStage = 80;
						}
					} else if (Client.titleLoadingStage == 80) {
						var24 = 0;
						if (class22.compass == null) {
							class22.compass = ModelData0.SpriteBuffer_getSprite(SoundSystem.archive8, class32.spriteIds.compass, 0);
						} else {
							++var24;
						}

						if (class32.redHintArrowSprite == null) {
							class32.redHintArrowSprite = ModelData0.SpriteBuffer_getSprite(SoundSystem.archive8, class32.spriteIds.field3898, 0);
						} else {
							++var24;
						}

						if (class18.mapSceneSprites == null) {
							class18.mapSceneSprites = class309.method5603(SoundSystem.archive8, class32.spriteIds.mapScenes, 0);
						} else {
							++var24;
						}

						if (ItemContainer.headIconPkSprites == null) {
							ItemContainer.headIconPkSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.headIconsPk, 0);
						} else {
							++var24;
						}

						if (ArchiveDiskActionHandler.headIconPrayerSprites == null) {
							ArchiveDiskActionHandler.headIconPrayerSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.field3901, 0);
						} else {
							++var24;
						}

						if (Script.headIconHintSprites == null) {
							Script.headIconHintSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.field3897, 0);
						} else {
							++var24;
						}

						if (class14.mapMarkerSprites == null) {
							class14.mapMarkerSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.field3903, 0);
						} else {
							++var24;
						}

						if (class18.crossSprites == null) {
							class18.crossSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.field3907, 0);
						} else {
							++var24;
						}

						if (class244.mapDotSprites == null) {
							class244.mapDotSprites = class337.method5985(SoundSystem.archive8, class32.spriteIds.field3902, 0);
						} else {
							++var24;
						}

						if (NPCComposition.scrollBarSprites == null) {
							NPCComposition.scrollBarSprites = class309.method5603(SoundSystem.archive8, class32.spriteIds.field3906, 0);
						} else {
							++var24;
						}

						if (class93.modIconSprites == null) {
							class93.modIconSprites = class309.method5603(SoundSystem.archive8, class32.spriteIds.field3899, 0);
						} else {
							++var24;
						}

						if (var24 < 11) {
							Login.Login_loadingText = "Loading sprites - " + var24 * 100 / 12 + "%";
							Login.Login_loadingPercent = 70;
						} else {
							AbstractFont.AbstractFont_modIconSprites = class93.modIconSprites;
							class32.redHintArrowSprite.normalize();
							var20 = (int)(Math.random() * 21.0D) - 10;
							int var23 = (int)(Math.random() * 21.0D) - 10;
							var21 = (int)(Math.random() * 21.0D) - 10;
							var22 = (int)(Math.random() * 41.0D) - 20;
							class18.mapSceneSprites[0].shiftColors(var22 + var20, var22 + var23, var22 + var21);
							Login.Login_loadingText = "Loaded sprites";
							Login.Login_loadingPercent = 70;
							Client.titleLoadingStage = 90;
						}
					} else if (Client.titleLoadingStage == 90) {
						if (!AbstractWorldMapData.archive9.isFullyLoaded()) {
							Login.Login_loadingText = "Loading textures - " + "0%";
							Login.Login_loadingPercent = 90;
						} else {
							FriendLoginUpdate.textureProvider = new TextureProvider(AbstractWorldMapData.archive9, SoundSystem.archive8, 20, Login.clientPreferences.field1304, Client.isLowDetail ? 64 : 128);
							Rasterizer3D.Rasterizer3D_setTextureLoader(FriendLoginUpdate.textureProvider);
							Rasterizer3D.Rasterizer3D_setBrightness(Login.clientPreferences.field1304);
							Client.titleLoadingStage = 100;
						}
					} else if (Client.titleLoadingStage == 100) {
						var24 = FriendLoginUpdate.textureProvider.getLoadedPercentage();
						if (var24 < 100) {
							Login.Login_loadingText = "Loading textures - " + var24 + "%";
							Login.Login_loadingPercent = 90;
						} else {
							Login.Login_loadingText = "Loaded textures";
							Login.Login_loadingPercent = 90;
							Client.titleLoadingStage = 110;
						}
					} else if (Client.titleLoadingStage == 110) {
						Language.mouseRecorder = new MouseRecorder();
						GameEngine.taskHandler.newThreadTask(Language.mouseRecorder, 10);
						Login.Login_loadingText = "Loaded input handler";
						Login.Login_loadingPercent = 92;
						Client.titleLoadingStage = 120;
					} else if (Client.titleLoadingStage == 120) {
						if (!class373.archive10.tryLoadFileByNames("huffman", "")) {
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
							Login.Login_loadingPercent = 94;
						} else {
							Huffman var19 = new Huffman(class373.archive10.takeFileByNames("huffman", ""));
							ClientPacket.method3884(var19);
							Login.Login_loadingText = "Loaded wordpack";
							Login.Login_loadingPercent = 94;
							Client.titleLoadingStage = 130;
						}
					} else if (Client.titleLoadingStage == 130) {
						if (!class5.archive3.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + class5.archive3.loadPercent() * 4 / 5 + "%";
							Login.Login_loadingPercent = 96;
						} else if (!BuddyRankComparator.archive12.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (80 + BuddyRankComparator.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 96;
						} else if (!MilliClock.archive13.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (96 + MilliClock.archive13.loadPercent() / 50) + "%";
							Login.Login_loadingPercent = 96;
						} else {
							Login.Login_loadingText = "Loaded interfaces";
							Login.Login_loadingPercent = 98;
							Client.titleLoadingStage = 140;
						}
					} else if (Client.titleLoadingStage == 140) {
						Login.Login_loadingPercent = 100;
						if (!class283.archive19.tryLoadGroupByName(WorldMapCacheName.field1768.name)) {
							Login.Login_loadingText = "Loading world map - " + class283.archive19.groupLoadPercentByName(WorldMapCacheName.field1768.name) / 10 + "%";
						} else {
							if (UserComparator4.worldMap == null) {
								UserComparator4.worldMap = new WorldMap();
								UserComparator4.worldMap.init(class283.archive19, class246.archive18, NPCComposition.archive20, class368.fontBold12, Client.fontsMap, class18.mapSceneSprites);
							}

							Login.Login_loadingText = "Loaded world map";
							Client.titleLoadingStage = 150;
						}
					} else if (Client.titleLoadingStage == 150) {
						class20.updateGameState(10);
					}
				}
			}
		} else {
			byte var0 = 0;
			var24 = var0 + TriBool.archive0.percentage() * 4 / 100;
			var24 += class367.archive1.percentage() * 4 / 100;
			var24 += class235.archive2.percentage() * 2 / 100;
			var24 += class5.archive3.percentage() * 2 / 100;
			var24 += ItemContainer.archive4.percentage() * 6 / 100;
			var24 += class157.archive5.percentage() * 4 / 100;
			var24 += class8.archive6.percentage() * 2 / 100;
			var24 += class12.archive7.percentage() * 56 / 100;
			var24 += SoundSystem.archive8.percentage() * 2 / 100;
			var24 += AbstractWorldMapData.archive9.percentage() * 2 / 100;
			var24 += class373.archive10.percentage() * 2 / 100;
			var24 += class10.archive11.percentage() * 2 / 100;
			var24 += BuddyRankComparator.archive12.percentage() * 2 / 100;
			var24 += MilliClock.archive13.percentage() * 2 / 100;
			var24 += WorldMapSection0.archive14.percentage() * 2 / 100;
			var24 += Buddy.archive15.percentage() * 2 / 100;
			var24 += class283.archive19.percentage() / 100;
			var24 += class246.archive18.percentage() / 100;
			var24 += NPCComposition.archive20.percentage() / 100;
			var24 += class0.archive17.method4430() && class0.archive17.isFullyLoaded() ? 1 : 0;
			if (var24 != 100) {
				if (var24 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var24 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				class231.method4356(TriBool.archive0, "Animations");
				class231.method4356(class367.archive1, "Skeletons");
				class231.method4356(ItemContainer.archive4, "Sound FX");
				class231.method4356(class157.archive5, "Maps");
				class231.method4356(class8.archive6, "Music Tracks");
				class231.method4356(class12.archive7, "Models");
				class231.method4356(SoundSystem.archive8, "Sprites");
				class231.method4356(class10.archive11, "Music Jingles");
				class231.method4356(WorldMapSection0.archive14, "Music Samples");
				class231.method4356(Buddy.archive15, "Music Patches");
				class231.method4356(class283.archive19, "World Map");
				class231.method4356(class246.archive18, "World Map Geography");
				class231.method4356(NPCComposition.archive20, "World Map Ground");
				class32.spriteIds = new GraphicsDefaults();
				class32.spriteIds.decode(class0.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		}
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "927217331"
	)
	static final int method420() {
		if (Login.clientPreferences.roofsHidden) {
			return class26.Client_plane;
		} else {
			int var0 = UserComparator7.getTileHeight(ModeWhere.cameraX, ReflectionCheck.cameraZ, class26.Client_plane);
			return var0 - WorldMapRectangle.cameraY < 800 && (Tiles.Tiles_renderFlags[class26.Client_plane][ModeWhere.cameraX >> 7][ReflectionCheck.cameraZ >> 7] & 4) != 0 ? class26.Client_plane : 3;
		}
	}
}
