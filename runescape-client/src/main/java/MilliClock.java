import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("b")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("v")
	long[] field1519;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1403302325
	)
	int field1515;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 892183401
	)
	int field1517;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -3130930086544390357L
	)
	long field1516;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 543039723
	)
	int field1518;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 652562423
	)
	int field1514;

	public MilliClock() {
		this.field1519 = new long[10];
		this.field1515 = 256;
		this.field1517 = 1;
		this.field1518 = 0;
		this.field1516 = ObjectComposition.currentTimeMillis();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1519[var1] = this.field1516;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1887937791"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1519[var1] = 0L;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1841090229"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1515;
		int var4 = this.field1517;
		this.field1515 = 300;
		this.field1517 = 1;
		this.field1516 = ObjectComposition.currentTimeMillis();
		if (0L == this.field1519[this.field1514]) {
			this.field1515 = var3;
			this.field1517 = var4;
		} else if (this.field1516 > this.field1519[this.field1514]) {
			this.field1515 = (int)((long)(var1 * 2560) / (this.field1516 - this.field1519[this.field1514]));
		}

		if (this.field1515 < 25) {
			this.field1515 = 25;
		}

		if (this.field1515 > 256) {
			this.field1515 = 256;
			this.field1517 = (int)((long)var1 - (this.field1516 - this.field1519[this.field1514]) / 10L);
		}

		if (this.field1517 > var1) {
			this.field1517 = var1;
		}

		this.field1519[this.field1514] = this.field1516;
		this.field1514 = (this.field1514 + 1) % 10;
		if (this.field1517 > 1) {
			for (int var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1519[var5]) {
					this.field1519[var5] += (long)this.field1517;
				}
			}
		}

		if (this.field1517 < var2) {
			this.field1517 = var2;
		}

		long var10 = (long)this.field1517;
		if (var10 > 0L) {
			if (0L == var10 % 10L) {
				long var7 = var10 - 1L;

				try {
					Thread.sleep(var7);
				} catch (InterruptedException var16) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var15) {
				}
			} else {
				try {
					Thread.sleep(var10);
				} catch (InterruptedException var14) {
				}
			}
		}

		int var13;
		for (var13 = 0; this.field1518 < 256; this.field1518 += this.field1515) {
			++var13;
		}

		this.field1518 &= 255;
		return var13;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "179304235"
	)
	public static void method2587() {
		WorldMapDecoration.SpriteBuffer_xOffsets = null;
		Calendar.SpriteBuffer_yOffsets = null;
		class396.SpriteBuffer_spriteWidths = null;
		class302.SpriteBuffer_spriteHeights = null;
		SpriteBuffer_spritePalette = null;
		class396.SpriteBuffer_pixels = null;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	@Export("load")
	static void load() {
		int var31;
		if (Client.titleLoadingStage == 0) {
			AbstractSocket.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var31 = 0; var31 < 4; ++var31) {
				Client.collisionMaps[var31] = new CollisionMap(104, 104);
			}

			GameEngine.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			NetCache.archive3 = FontName.newArchive(0, false, true, true);
			class27.archive4 = FontName.newArchive(1, false, true, true);
			class8.archive2 = FontName.newArchive(2, true, false, true);
			class3.archive5 = FontName.newArchive(3, false, true, true);
			class32.field242 = FontName.newArchive(4, false, true, true);
			class247.archive7 = FontName.newArchive(5, true, true, true);
			UrlRequest.archive6 = FontName.newArchive(6, true, true, true);
			Decimator.archive9 = FontName.newArchive(7, false, true, true);
			GrandExchangeOfferAgeComparator.archive8 = FontName.newArchive(8, false, true, true);
			CollisionMap.field1903 = FontName.newArchive(9, false, true, true);
			SoundCache.archive10 = FontName.newArchive(10, false, true, true);
			WorldMapManager.archive11 = FontName.newArchive(11, false, true, true);
			UserComparator5.archive12 = FontName.newArchive(12, false, true, true);
			Decimator.archive13 = FontName.newArchive(13, true, false, true);
			class125.archive14 = FontName.newArchive(14, false, true, true);
			FriendsChatMember.archive15 = FontName.newArchive(15, false, true, true);
			class8.archive17 = FontName.newArchive(17, true, true, true);
			FontName.archive18 = FontName.newArchive(18, false, true, true);
			class179.archive19 = FontName.newArchive(19, false, true, true);
			class5.archive20 = FontName.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage != 40) {
			if (Client.titleLoadingStage == 45) {
				boolean var34 = !Client.isLowDetail;
				PcmPlayer.field428 = 486202500;
				PcmPlayer.PcmPlayer_stereo = var34;
				PcmPlayer.field418 = 2;
				MidiPcmStream var32 = new MidiPcmStream();
				var32.method4502(9, 128);
				DesktopPlatformInfoProvider.pcmPlayer0 = HorizontalAlignment.method2762(GameEngine.taskHandler, 0, 22050);
				DesktopPlatformInfoProvider.pcmPlayer0.setStream(var32);
				WorldMapID.method3636(FriendsChatMember.archive15, class125.archive14, class32.field242, var32);
				MouseRecorder.pcmPlayer1 = HorizontalAlignment.method2762(GameEngine.taskHandler, 1, 2048);
				class308.pcmStreamMixer = new PcmStreamMixer();
				MouseRecorder.pcmPlayer1.setStream(class308.pcmStreamMixer);
				TileItem.decimator = new Decimator(22050, PcmPlayer.field428 * 22050);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				World.WorldMapElement_fonts = new Fonts(GrandExchangeOfferAgeComparator.archive8, Decimator.archive13);
			} else {
				int var1;
				if (Client.titleLoadingStage == 50) {
					FontName[] var29 = new FontName[]{FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12};
					var1 = var29.length;
					Fonts var33 = World.WorldMapElement_fonts;
					FontName[] var27 = new FontName[]{FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12};
					Client.fontsMap = var33.createMap(var27);
					if (Client.fontsMap.size() < var1) {
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%";
						Login.Login_loadingPercent = 40;
					} else {
						Actor.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						UserComparator3.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						Widget.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						class10.platformInfo = Client.platformInfoProvider.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.titleLoadingStage = 60;
					}
				} else {
					int var3;
					int var4;
					Archive var24;
					Archive var25;
					if (Client.titleLoadingStage == 60) {
						var24 = SoundCache.archive10;
						var25 = GrandExchangeOfferAgeComparator.archive8;
						var3 = 0;
						if (var24.tryLoadFileByNames("title.jpg", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("logo", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("logo_deadman_mode", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("logo_seasonal_mode", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("titlebox", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("titlebutton", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("runes", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("title_mute", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("options_radio_buttons,0", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("options_radio_buttons,2", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("options_radio_buttons,4", "")) {
							++var3;
						}

						if (var25.tryLoadFileByNames("options_radio_buttons,6", "")) {
							++var3;
						}

						var25.tryLoadFileByNames("sl_back", "");
						var25.tryLoadFileByNames("sl_flags", "");
						var25.tryLoadFileByNames("sl_arrows", "");
						var25.tryLoadFileByNames("sl_stars", "");
						var25.tryLoadFileByNames("sl_button", "");
						var4 = AbstractSocket.method5901();
						if (var3 < var4) {
							Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%";
							Login.Login_loadingPercent = 50;
						} else {
							Login.Login_loadingText = "Loaded title screen";
							Login.Login_loadingPercent = 50;
							class12.updateGameState(5);
							Client.titleLoadingStage = 70;
						}
					} else if (Client.titleLoadingStage == 70) {
						if (!class8.archive2.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + class8.archive2.loadPercent() + "%";
							Login.Login_loadingPercent = 60;
						} else {
							Archive var28 = class8.archive2;
							class142.FloorOverlayDefinition_archive = var28;
							class27.method277(class8.archive2);
							ChatChannel.method2012(class8.archive2, Decimator.archive9);
							var24 = class8.archive2;
							var25 = Decimator.archive9;
							boolean var30 = Client.isLowDetail;
							ObjectComposition.ObjectDefinition_archive = var24;
							class310.ObjectDefinition_modelsArchive = var25;
							ObjectComposition.ObjectDefinition_isLowDetail = var30;
							Archive var26 = class8.archive2;
							Archive var5 = Decimator.archive9;
							NPCComposition.NpcDefinition_archive = var26;
							NPCComposition.NpcDefinition_modelArchive = var5;
							class13.method180(class8.archive2);
							Archive var6 = class8.archive2;
							Archive var7 = Decimator.archive9;
							boolean var8 = Client.isMembersWorld;
							Font var9 = Actor.fontPlain11;
							class341.ItemDefinition_archive = var6;
							class311.ItemDefinition_modelArchive = var7;
							ItemContainer.ItemDefinition_inMembersWorld = var8;
							ItemComposition.ItemDefinition_fileCount = class341.ItemDefinition_archive.getGroupFileCount(10);
							class288.ItemDefinition_fontPlain11 = var9;
							Archive var10 = class8.archive2;
							Archive var11 = NetCache.archive3;
							Archive var12 = class27.archive4;
							SequenceDefinition.SequenceDefinition_archive = var10;
							SequenceDefinition.SequenceDefinition_animationsArchive = var11;
							SequenceDefinition.SequenceDefinition_skeletonsArchive = var12;
							class1.method13(class8.archive2, Decimator.archive9);
							UserComparator10.method2471(class8.archive2);
							class280.method5070(class8.archive2);
							Archive var13 = class3.archive5;
							Archive var14 = Decimator.archive9;
							Archive var15 = GrandExchangeOfferAgeComparator.archive8;
							Archive var16 = Decimator.archive13;
							HealthBarUpdate.Widget_archive = var13;
							SpriteMask.Widget_modelsArchive = var14;
							class245.Widget_spritesArchive = var15;
							VertexNormal.Widget_fontsArchive = var16;
							Widget.Widget_interfaceComponents = new Widget[HealthBarUpdate.Widget_archive.getGroupCount()][];
							Widget.Widget_loadedInterfaces = new boolean[HealthBarUpdate.Widget_archive.getGroupCount()];
							LoginScreenAnimation.method2210(class8.archive2);
							GrandExchangeOfferUnitPriceComparator.method5109(class8.archive2);
							PacketWriter.method2384(class8.archive2);
							Archive var17 = class8.archive2;
							ParamComposition.ParamDefinition_archive = var17;
							GrandExchangeOfferOwnWorldComparator.field634 = new class369(SoundSystem.field461, 54, class378.clientLanguage, class8.archive2);
							ViewportMouse.HitSplatDefinition_cachedSprites = new class369(SoundSystem.field461, 47, class378.clientLanguage, class8.archive2);
							GrandExchangeOfferOwnWorldComparator.varcs = new Varcs();
							Archive var18 = class8.archive2;
							Archive var19 = GrandExchangeOfferAgeComparator.archive8;
							Archive var20 = Decimator.archive13;
							HitSplatDefinition.HitSplatDefinition_archive = var18;
							HitSplatDefinition.field1734 = var19;
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var20;
							Archive var21 = class8.archive2;
							Archive var22 = GrandExchangeOfferAgeComparator.archive8;
							HealthBarDefinition.HealthBarDefinition_archive = var21;
							HealthBarDefinition.HitSplatDefinition_spritesArchive = var22;
							UserComparator5.method2449(class8.archive2, GrandExchangeOfferAgeComparator.archive8);
							Login.Login_loadingText = "Loaded config";
							Login.Login_loadingPercent = 60;
							Client.titleLoadingStage = 80;
						}
					} else if (Client.titleLoadingStage == 80) {
						var31 = 0;
						if (NPCComposition.compass == null) {
							NPCComposition.compass = ClientPacket.SpriteBuffer_getSprite(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.compass, 0);
						} else {
							++var31;
						}

						if (Interpreter.redHintArrowSprite == null) {
							Interpreter.redHintArrowSprite = ClientPacket.SpriteBuffer_getSprite(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3897, 0);
						} else {
							++var31;
						}

						if (class10.mapSceneSprites == null) {
							class10.mapSceneSprites = VerticalAlignment.method2799(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.mapScenes, 0);
						} else {
							++var31;
						}

						if (class35.headIconPkSprites == null) {
							class35.headIconPkSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.headIconsPk, 0);
						} else {
							++var31;
						}

						if (TextureProvider.headIconPrayerSprites == null) {
							TextureProvider.headIconPrayerSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3900, 0);
						} else {
							++var31;
						}

						if (PacketBufferNode.headIconHintSprites == null) {
							PacketBufferNode.headIconHintSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3901, 0);
						} else {
							++var31;
						}

						if (WorldMapArea.mapMarkerSprites == null) {
							WorldMapArea.mapMarkerSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3905, 0);
						} else {
							++var31;
						}

						if (ArchiveLoader.crossSprites == null) {
							ArchiveLoader.crossSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3903, 0);
						} else {
							++var31;
						}

						if (class170.mapDotSprites == null) {
							class170.mapDotSprites = ItemComposition.method3087(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3904, 0);
						} else {
							++var31;
						}

						if (Player.scrollBarSprites == null) {
							Player.scrollBarSprites = VerticalAlignment.method2799(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3898, 0);
						} else {
							++var31;
						}

						if (WorldMapDecoration.modIconSprites == null) {
							WorldMapDecoration.modIconSprites = VerticalAlignment.method2799(GrandExchangeOfferAgeComparator.archive8, TaskHandler.spriteIds.field3906, 0);
						} else {
							++var31;
						}

						if (var31 < 11) {
							Login.Login_loadingText = "Loading sprites - " + var31 * 100 / 12 + "%";
							Login.Login_loadingPercent = 70;
						} else {
							AbstractFont.AbstractFont_modIconSprites = WorldMapDecoration.modIconSprites;
							Interpreter.redHintArrowSprite.normalize();
							var1 = (int)(Math.random() * 21.0D) - 10;
							int var2 = (int)(Math.random() * 21.0D) - 10;
							var3 = (int)(Math.random() * 21.0D) - 10;
							var4 = (int)(Math.random() * 41.0D) - 20;
							class10.mapSceneSprites[0].shiftColors(var1 + var4, var2 + var4, var4 + var3);
							Login.Login_loadingText = "Loaded sprites";
							Login.Login_loadingPercent = 70;
							Client.titleLoadingStage = 90;
						}
					} else if (Client.titleLoadingStage == 90) {
						if (!CollisionMap.field1903.isFullyLoaded()) {
							Login.Login_loadingText = "Loading textures - " + "0%";
							Login.Login_loadingPercent = 90;
						} else {
							World.textureProvider = new TextureProvider(CollisionMap.field1903, GrandExchangeOfferAgeComparator.archive8, 20, ObjectComposition.clientPreferences.field1337, Client.isLowDetail ? 64 : 128);
							Rasterizer3D.Rasterizer3D_setTextureLoader(World.textureProvider);
							Rasterizer3D.Rasterizer3D_setBrightness(ObjectComposition.clientPreferences.field1337);
							Client.titleLoadingStage = 100;
						}
					} else if (Client.titleLoadingStage == 100) {
						var31 = World.textureProvider.getLoadedPercentage();
						if (var31 < 100) {
							Login.Login_loadingText = "Loading textures - " + var31 + "%";
							Login.Login_loadingPercent = 90;
						} else {
							Login.Login_loadingText = "Loaded textures";
							Login.Login_loadingPercent = 90;
							Client.titleLoadingStage = 110;
						}
					} else if (Client.titleLoadingStage == 110) {
						Skills.mouseRecorder = new MouseRecorder();
						GameEngine.taskHandler.newThreadTask(Skills.mouseRecorder, 10);
						Login.Login_loadingText = "Loaded input handler";
						Login.Login_loadingPercent = 92;
						Client.titleLoadingStage = 120;
					} else if (Client.titleLoadingStage == 120) {
						if (!SoundCache.archive10.tryLoadFileByNames("huffman", "")) {
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
							Login.Login_loadingPercent = 94;
						} else {
							Huffman var0 = new Huffman(SoundCache.archive10.takeFileByNames("huffman", ""));
							class9.method88(var0);
							Login.Login_loadingText = "Loaded wordpack";
							Login.Login_loadingPercent = 94;
							Client.titleLoadingStage = 130;
						}
					} else if (Client.titleLoadingStage == 130) {
						if (!class3.archive5.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + class3.archive5.loadPercent() * 4 / 5 + "%";
							Login.Login_loadingPercent = 96;
						} else if (!UserComparator5.archive12.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (80 + UserComparator5.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 96;
						} else if (!Decimator.archive13.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (96 + Decimator.archive13.loadPercent() / 50) + "%";
							Login.Login_loadingPercent = 96;
						} else {
							Login.Login_loadingText = "Loaded interfaces";
							Login.Login_loadingPercent = 98;
							Client.titleLoadingStage = 140;
						}
					} else if (Client.titleLoadingStage == 140) {
						Login.Login_loadingPercent = 100;
						if (!class179.archive19.tryLoadGroupByName(WorldMapCacheName.field2137.name)) {
							Login.Login_loadingText = "Loading world map - " + class179.archive19.groupLoadPercentByName(WorldMapCacheName.field2137.name) / 10 + "%";
						} else {
							if (class243.worldMap == null) {
								class243.worldMap = new WorldMap();
								class243.worldMap.init(class179.archive19, FontName.archive18, class5.archive20, Widget.fontBold12, Client.fontsMap, class10.mapSceneSprites);
							}

							Login.Login_loadingText = "Loaded world map";
							Client.titleLoadingStage = 150;
						}
					} else if (Client.titleLoadingStage == 150) {
						class12.updateGameState(10);
					}
				}
			}
		} else {
			byte var23 = 0;
			var31 = var23 + NetCache.archive3.percentage() * 4 / 100;
			var31 += class27.archive4.percentage() * 4 / 100;
			var31 += class8.archive2.percentage() * 2 / 100;
			var31 += class3.archive5.percentage() * 2 / 100;
			var31 += class32.field242.percentage() * 6 / 100;
			var31 += class247.archive7.percentage() * 4 / 100;
			var31 += UrlRequest.archive6.percentage() * 2 / 100;
			var31 += Decimator.archive9.percentage() * 56 / 100;
			var31 += GrandExchangeOfferAgeComparator.archive8.percentage() * 2 / 100;
			var31 += CollisionMap.field1903.percentage() * 2 / 100;
			var31 += SoundCache.archive10.percentage() * 2 / 100;
			var31 += WorldMapManager.archive11.percentage() * 2 / 100;
			var31 += UserComparator5.archive12.percentage() * 2 / 100;
			var31 += Decimator.archive13.percentage() * 2 / 100;
			var31 += class125.archive14.percentage() * 2 / 100;
			var31 += FriendsChatMember.archive15.percentage() * 2 / 100;
			var31 += class179.archive19.percentage() / 100;
			var31 += FontName.archive18.percentage() / 100;
			var31 += class5.archive20.percentage() / 100;
			var31 += class8.archive17.method4869() && class8.archive17.isFullyLoaded() ? 1 : 0;
			if (var31 != 100) {
				if (var31 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var31 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				class13.method175(NetCache.archive3, "Animations");
				class13.method175(class27.archive4, "Skeletons");
				class13.method175(class32.field242, "Sound FX");
				class13.method175(class247.archive7, "Maps");
				class13.method175(UrlRequest.archive6, "Music Tracks");
				class13.method175(Decimator.archive9, "Models");
				class13.method175(GrandExchangeOfferAgeComparator.archive8, "Sprites");
				class13.method175(WorldMapManager.archive11, "Music Jingles");
				class13.method175(class125.archive14, "Music Samples");
				class13.method175(FriendsChatMember.archive15, "Music Patches");
				class13.method175(class179.archive19, "World Map");
				class13.method175(FontName.archive18, "World Map Geography");
				class13.method175(class5.archive20, "World Map Ground");
				TaskHandler.spriteIds = new GraphicsDefaults();
				TaskHandler.spriteIds.decode(class8.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1594517863"
	)
	static final int method2588() {
		return Client.menuOptionsCount - 1;
	}
}
