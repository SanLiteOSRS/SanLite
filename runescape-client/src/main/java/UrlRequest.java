import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("h")
	@Export("url")
	final URL url;
	@ObfuscatedName("c")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("o")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "32017774"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1444379818"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("h")
	@Export("sleepExact")
	public static final void sleepExact(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;ZLkc;I)V",
		garbageValue = "543530822"
	)
	public static void method2431(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemDefinition_archive = var0;
		FloorDecoration.ItemDefinition_modelArchive = var1;
		BufferedNetSocket.ItemDefinition_inMembersWorld = var2;
		class6.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
		StudioGame.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2069514072"
	)
	@Export("load")
	static void load() {
		int var23;
		if (Client.titleLoadingStage == 0) {
			class5.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var23 = 0; var23 < 4; ++var23) {
				Client.collisionMaps[var23] = new CollisionMap(104, 104);
			}

			UserComparator8.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			MilliClock.archive3 = class9.newArchive(0, false, true, true);
			class0.archive4 = class9.newArchive(1, false, true, true);
			KitDefinition.archive2 = class9.newArchive(2, true, false, true);
			EnumComposition.archive5 = class9.newArchive(3, false, true, true);
			class14.field129 = class9.newArchive(4, false, true, true);
			WorldMapSection0.archive7 = class9.newArchive(5, true, true, true);
			class29.archive6 = class9.newArchive(6, true, true, true);
			class260.archive9 = class9.newArchive(7, false, true, true);
			class43.archive8 = class9.newArchive(8, false, true, true);
			GameBuild.field3213 = class9.newArchive(9, false, true, true);
			PendingSpawn.archive10 = class9.newArchive(10, false, true, true);
			KeyHandler.archive11 = class9.newArchive(11, false, true, true);
			class22.archive12 = class9.newArchive(12, false, true, true);
			class18.archive13 = class9.newArchive(13, true, false, true);
			Huffman.archive14 = class9.newArchive(14, false, true, true);
			class16.archive15 = class9.newArchive(15, false, true, true);
			Actor.archive17 = class9.newArchive(17, true, true, true);
			WorldMapAreaData.archive18 = class9.newArchive(18, false, true, true);
			class232.archive19 = class9.newArchive(19, false, true, true);
			class9.archive20 = class9.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var34 = 0;
			var23 = var34 + MilliClock.archive3.percentage() * 4 / 100;
			var23 += class0.archive4.percentage() * 4 / 100;
			var23 += KitDefinition.archive2.percentage() * 2 / 100;
			var23 += EnumComposition.archive5.percentage() * 2 / 100;
			var23 += class14.field129.percentage() * 6 / 100;
			var23 += WorldMapSection0.archive7.percentage() * 4 / 100;
			var23 += class29.archive6.percentage() * 2 / 100;
			var23 += class260.archive9.percentage() * 56 / 100;
			var23 += class43.archive8.percentage() * 2 / 100;
			var23 += GameBuild.field3213.percentage() * 2 / 100;
			var23 += PendingSpawn.archive10.percentage() * 2 / 100;
			var23 += KeyHandler.archive11.percentage() * 2 / 100;
			var23 += class22.archive12.percentage() * 2 / 100;
			var23 += class18.archive13.percentage() * 2 / 100;
			var23 += Huffman.archive14.percentage() * 2 / 100;
			var23 += class16.archive15.percentage() * 2 / 100;
			var23 += class232.archive19.percentage() / 100;
			var23 += WorldMapAreaData.archive18.percentage() / 100;
			var23 += class9.archive20.percentage() / 100;
			var23 += Actor.archive17.method4822() && Actor.archive17.isFullyLoaded() ? 1 : 0;
			if (var23 != 100) {
				if (var23 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var23 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				class225.method4300(MilliClock.archive3, "Animations");
				class225.method4300(class0.archive4, "Skeletons");
				class225.method4300(class14.field129, "Sound FX");
				class225.method4300(WorldMapSection0.archive7, "Maps");
				class225.method4300(class29.archive6, "Music Tracks");
				class225.method4300(class260.archive9, "Models");
				class225.method4300(class43.archive8, "Sprites");
				class225.method4300(KeyHandler.archive11, "Music Jingles");
				class225.method4300(Huffman.archive14, "Music Samples");
				class225.method4300(class16.archive15, "Music Patches");
				class225.method4300(class232.archive19, "World Map");
				class225.method4300(WorldMapAreaData.archive18, "World Map Geography");
				class225.method4300(class9.archive20, "World Map Ground");
				ScriptFrame.spriteIds = new GraphicsDefaults();
				ScriptFrame.spriteIds.decode(Actor.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else if (Client.titleLoadingStage == 45) {
			Message.method1166(22050, !Client.isLowDetail, 2);
			MidiPcmStream var30 = new MidiPcmStream();
			var30.method4467(9, 128);
			WorldMapAreaData.pcmPlayer0 = GrandExchangeEvents.method4969(GameEngine.taskHandler, 0, 22050);
			WorldMapAreaData.pcmPlayer0.setStream(var30);
			class1.method13(class16.archive15, Huffman.archive14, class14.field129, var30);
			class93.pcmPlayer1 = GrandExchangeEvents.method4969(GameEngine.taskHandler, 1, 2048);
			FloorOverlayDefinition.pcmStreamMixer = new PcmStreamMixer();
			class93.pcmPlayer1.setStream(FloorOverlayDefinition.pcmStreamMixer);
			class3.field31 = new Decimator(22050, PcmPlayer.field401);
			Login.Login_loadingText = "Prepared sound engine";
			Login.Login_loadingPercent = 35;
			Client.titleLoadingStage = 50;
			class260.WorldMapElement_fonts = new Fonts(class43.archive8, class18.archive13);
		} else {
			int var1;
			if (Client.titleLoadingStage == 50) {
				FontName[] var29 = new FontName[]{FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_verdana13};
				var1 = var29.length;
				Fonts var32 = class260.WorldMapElement_fonts;
				FontName[] var33 = new FontName[]{FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_verdana13};
				Client.fontsMap = var32.createMap(var33);
				if (Client.fontsMap.size() < var1) {
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%";
					Login.Login_loadingPercent = 40;
				} else {
					class11.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
					Message.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
					WorldMapArea.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
					GameObject.platformInfo = Client.platformInfoProvider.get();
					Login.Login_loadingText = "Loaded fonts";
					Login.Login_loadingPercent = 40;
					Client.titleLoadingStage = 60;
				}
			} else if (Client.titleLoadingStage == 60) {
				var23 = GraphicsDefaults.method5825(PendingSpawn.archive10, class43.archive8);
				byte var31 = 12;
				if (var23 < var31) {
					Login.Login_loadingText = "Loading title screen - " + var23 * 100 / var31 + "%";
					Login.Login_loadingPercent = 50;
				} else {
					Login.Login_loadingText = "Loaded title screen";
					Login.Login_loadingPercent = 50;
					Client.updateGameState(5);
					Client.titleLoadingStage = 70;
				}
			} else if (Client.titleLoadingStage == 70) {
				if (!KitDefinition.archive2.isFullyLoaded()) {
					Login.Login_loadingText = "Loading config - " + KitDefinition.archive2.loadPercent() + "%";
					Login.Login_loadingPercent = 60;
				} else {
					BufferedSource.method5782(KitDefinition.archive2);
					Archive var28 = KitDefinition.archive2;
					FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var28;
					Archive var24 = KitDefinition.archive2;
					Archive var25 = class260.archive9;
					KitDefinition.KitDefinition_archive = var24;
					KitDefinition.KitDefinition_modelsArchive = var25;
					KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
					Archive var26 = KitDefinition.archive2;
					Archive var27 = class260.archive9;
					boolean var5 = Client.isLowDetail;
					ObjectComposition.ObjectDefinition_archive = var26;
					ObjectComposition.ObjectDefinition_modelsArchive = var27;
					ObjectComposition.ObjectDefinition_isLowDetail = var5;
					Archive var6 = KitDefinition.archive2;
					Archive var7 = class260.archive9;
					NPCComposition.NpcDefinition_archive = var6;
					NPCComposition.NpcDefinition_modelArchive = var7;
					UserComparator7.method2453(KitDefinition.archive2);
					method2431(KitDefinition.archive2, class260.archive9, Client.isMembersWorld, class11.fontPlain11);
					Archive var8 = KitDefinition.archive2;
					Archive var9 = MilliClock.archive3;
					Archive var10 = class0.archive4;
					SequenceDefinition.SequenceDefinition_archive = var8;
					SequenceDefinition.SequenceDefinition_animationsArchive = var9;
					SequenceDefinition.SequenceDefinition_skeletonsArchive = var10;
					class69.method1153(KitDefinition.archive2, class260.archive9);
					Archive var11 = KitDefinition.archive2;
					VarbitComposition.VarbitDefinition_archive = var11;
					Archive var12 = KitDefinition.archive2;
					VarpDefinition.VarpDefinition_archive = var12;
					class403.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
					class34.method391(EnumComposition.archive5, class260.archive9, class43.archive8, class18.archive13);
					NPC.method2266(KitDefinition.archive2);
					Archive var13 = KitDefinition.archive2;
					EnumComposition.EnumDefinition_archive = var13;
					AbstractByteArrayCopier.method4756(KitDefinition.archive2);
					ApproximateRouteStrategy.method1203(KitDefinition.archive2);
					class7.field60 = new class369(NetSocket.field1492, 54, class7.clientLanguage, KitDefinition.archive2);
					ModeWhere.HitSplatDefinition_cachedSprites = new class369(NetSocket.field1492, 47, class7.clientLanguage, KitDefinition.archive2);
					Client.varcs = new Varcs();
					Archive var14 = KitDefinition.archive2;
					Archive var15 = class43.archive8;
					Archive var16 = class18.archive13;
					HitSplatDefinition.HitSplatDefinition_archive = var14;
					HitSplatDefinition.field1731 = var15;
					HitSplatDefinition.HitSplatDefinition_fontsArchive = var16;
					Archive var17 = KitDefinition.archive2;
					Archive var18 = class43.archive8;
					HealthBarDefinition.HealthBarDefinition_archive = var17;
					HealthBarDefinition.HitSplatDefinition_spritesArchive = var18;
					Archive var19 = KitDefinition.archive2;
					Archive var20 = class43.archive8;
					WorldMapElement.WorldMapElement_archive = var20;
					if (var19.isFullyLoaded()) {
						WorldMapElement.WorldMapElement_count = var19.getGroupFileCount(35);
						WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

						for (int var21 = 0; var21 < WorldMapElement.WorldMapElement_count; ++var21) {
							byte[] var22 = var19.takeFile(35, var21);
							WorldMapElement.WorldMapElement_cached[var21] = new WorldMapElement(var21);
							if (var22 != null) {
								WorldMapElement.WorldMapElement_cached[var21].decode(new Buffer(var22));
								WorldMapElement.WorldMapElement_cached[var21].method2631();
							}
						}
					}

					Login.Login_loadingText = "Loaded config";
					Login.Login_loadingPercent = 60;
					Client.titleLoadingStage = 80;
				}
			} else if (Client.titleLoadingStage == 80) {
				var23 = 0;
				if (WorldMapRegion.compass == null) {
					WorldMapRegion.compass = Friend.SpriteBuffer_getSprite(class43.archive8, ScriptFrame.spriteIds.compass, 0);
				} else {
					++var23;
				}

				if (GrandExchangeOfferOwnWorldComparator.redHintArrowSprite == null) {
					GrandExchangeOfferOwnWorldComparator.redHintArrowSprite = Friend.SpriteBuffer_getSprite(class43.archive8, ScriptFrame.spriteIds.field3915, 0);
				} else {
					++var23;
				}

				if (class23.mapSceneSprites == null) {
					class23.mapSceneSprites = WorldMapDecoration.method3571(class43.archive8, ScriptFrame.spriteIds.mapScenes, 0);
				} else {
					++var23;
				}

				if (class14.headIconPkSprites == null) {
					class14.headIconPkSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.headIconsPk, 0);
				} else {
					++var23;
				}

				if (Varcs.headIconPrayerSprites == null) {
					Varcs.headIconPrayerSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.field3908, 0);
				} else {
					++var23;
				}

				if (class375.headIconHintSprites == null) {
					class375.headIconHintSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.field3909, 0);
				} else {
					++var23;
				}

				if (ObjectComposition.mapMarkerSprites == null) {
					ObjectComposition.mapMarkerSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.field3910, 0);
				} else {
					++var23;
				}

				if (MouseHandler.crossSprites == null) {
					MouseHandler.crossSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.field3914, 0);
				} else {
					++var23;
				}

				if (class341.mapDotSprites == null) {
					class341.mapDotSprites = class253.method4767(class43.archive8, ScriptFrame.spriteIds.field3904, 0);
				} else {
					++var23;
				}

				if (GrandExchangeOfferTotalQuantityComparator.scrollBarSprites == null) {
					GrandExchangeOfferTotalQuantityComparator.scrollBarSprites = WorldMapDecoration.method3571(class43.archive8, ScriptFrame.spriteIds.field3913, 0);
				} else {
					++var23;
				}

				if (FriendSystem.modIconSprites == null) {
					FriendSystem.modIconSprites = WorldMapDecoration.method3571(class43.archive8, ScriptFrame.spriteIds.field3916, 0);
				} else {
					++var23;
				}

				if (var23 < 11) {
					Login.Login_loadingText = "Loading sprites - " + var23 * 100 / 12 + "%";
					Login.Login_loadingPercent = 70;
				} else {
					AbstractFont.AbstractFont_modIconSprites = FriendSystem.modIconSprites;
					GrandExchangeOfferOwnWorldComparator.redHintArrowSprite.normalize();
					var1 = (int)(Math.random() * 21.0D) - 10;
					int var2 = (int)(Math.random() * 21.0D) - 10;
					int var3 = (int)(Math.random() * 21.0D) - 10;
					int var4 = (int)(Math.random() * 41.0D) - 20;
					class23.mapSceneSprites[0].shiftColors(var1 + var4, var4 + var2, var3 + var4);
					Login.Login_loadingText = "Loaded sprites";
					Login.Login_loadingPercent = 70;
					Client.titleLoadingStage = 90;
				}
			} else if (Client.titleLoadingStage == 90) {
				if (!GameBuild.field3213.isFullyLoaded()) {
					Login.Login_loadingText = "Loading textures - " + "0%";
					Login.Login_loadingPercent = 90;
				} else {
					class9.textureProvider = new TextureProvider(GameBuild.field3213, class43.archive8, 20, class12.clientPreferences.field1303, Client.isLowDetail ? 64 : 128);
					Rasterizer3D.Rasterizer3D_setTextureLoader(class9.textureProvider);
					Rasterizer3D.Rasterizer3D_setBrightness(class12.clientPreferences.field1303);
					Client.titleLoadingStage = 100;
				}
			} else if (Client.titleLoadingStage == 100) {
				var23 = class9.textureProvider.getLoadedPercentage();
				if (var23 < 100) {
					Login.Login_loadingText = "Loading textures - " + var23 + "%";
					Login.Login_loadingPercent = 90;
				} else {
					Login.Login_loadingText = "Loaded textures";
					Login.Login_loadingPercent = 90;
					Client.titleLoadingStage = 110;
				}
			} else if (Client.titleLoadingStage == 110) {
				class69.mouseRecorder = new MouseRecorder();
				GameEngine.taskHandler.newThreadTask(class69.mouseRecorder, 10);
				Login.Login_loadingText = "Loaded input handler";
				Login.Login_loadingPercent = 92;
				Client.titleLoadingStage = 120;
			} else if (Client.titleLoadingStage == 120) {
				if (!PendingSpawn.archive10.tryLoadFileByNames("huffman", "")) {
					Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
					Login.Login_loadingPercent = 94;
				} else {
					Huffman var0 = new Huffman(PendingSpawn.archive10.takeFileByNames("huffman", ""));
					VertexNormal.method4219(var0);
					Login.Login_loadingText = "Loaded wordpack";
					Login.Login_loadingPercent = 94;
					Client.titleLoadingStage = 130;
				}
			} else if (Client.titleLoadingStage == 130) {
				if (!EnumComposition.archive5.isFullyLoaded()) {
					Login.Login_loadingText = "Loading interfaces - " + EnumComposition.archive5.loadPercent() * 4 / 5 + "%";
					Login.Login_loadingPercent = 96;
				} else if (!class22.archive12.isFullyLoaded()) {
					Login.Login_loadingText = "Loading interfaces - " + (80 + class22.archive12.loadPercent() / 6) + "%";
					Login.Login_loadingPercent = 96;
				} else if (!class18.archive13.isFullyLoaded()) {
					Login.Login_loadingText = "Loading interfaces - " + (96 + class18.archive13.loadPercent() / 50) + "%";
					Login.Login_loadingPercent = 96;
				} else {
					Login.Login_loadingText = "Loaded interfaces";
					Login.Login_loadingPercent = 98;
					Client.titleLoadingStage = 140;
				}
			} else if (Client.titleLoadingStage == 140) {
				Login.Login_loadingPercent = 100;
				if (!class232.archive19.tryLoadGroupByName(WorldMapCacheName.field2128.name)) {
					Login.Login_loadingText = "Loading world map - " + class232.archive19.groupLoadPercentByName(WorldMapCacheName.field2128.name) / 10 + "%";
				} else {
					if (NetSocket.worldMap == null) {
						NetSocket.worldMap = new WorldMap();
						NetSocket.worldMap.init(class232.archive19, WorldMapAreaData.archive18, class9.archive20, WorldMapArea.fontBold12, Client.fontsMap, class23.mapSceneSprites);
					}

					Login.Login_loadingText = "Loaded world map";
					Client.titleLoadingStage = 150;
				}
			} else if (Client.titleLoadingStage == 150) {
				Client.updateGameState(10);
			}
		}
	}
}
