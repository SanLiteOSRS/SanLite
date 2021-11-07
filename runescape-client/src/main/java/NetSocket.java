import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("NetSocket")
public final class NetSocket extends AbstractSocket implements Runnable {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("i")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("w")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("s")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("a")
	@Export("isClosed")
	boolean isClosed;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("taskHandler")
	TaskHandler taskHandler;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("e")
	@Export("outBuffer")
	byte[] outBuffer;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 23689551
	)
	@Export("outLength")
	int outLength;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1817332035
	)
	@Export("outOffset")
	int outOffset;
	@ObfuscatedName("b")
	@Export("exceptionWriting")
	boolean exceptionWriting;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 401992191
	)
	@Export("bufferLength")
	final int bufferLength;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -955072145
	)
	@Export("maxPacketLength")
	final int maxPacketLength;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;Lew;I)V"
	)
	public NetSocket(Socket var1, TaskHandler var2, int var3) throws IOException {
		this.isClosed = false;
		this.outLength = 0;
		this.outOffset = 0;
		this.exceptionWriting = false;
		this.taskHandler = var2;
		this.socket = var1;
		this.bufferLength = var3;
		this.maxPacketLength = var3 - 100;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.inputStream = this.socket.getInputStream();
		this.outputStream = this.socket.getOutputStream();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("close")
	public void close() {
		if (!this.isClosed) {
			synchronized(this) {
				this.isClosed = true;
				this.notifyAll();
			}

			if (this.task != null) {
				while (this.task.status == 0) {
					FloorUnderlayDefinition.method3190(1L);
				}

				if (this.task.status == 1) {
					try {
						((Thread)this.task.result).join();
					} catch (InterruptedException var3) {
					}
				}
			}

			this.task = null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1953698452"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.isClosed ? 0 : this.inputStream.read();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1632705310"
	)
	@Export("available")
	public int available() throws IOException {
		return this.isClosed ? 0 : this.inputStream.available();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1771919747"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		if (this.isClosed) {
			return false;
		} else {
			return this.inputStream.available() >= var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-1246528305"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		if (this.isClosed) {
			return 0;
		} else {
			int var4;
			int var5;
			for (var4 = var3; var3 > 0; var3 -= var5) {
				var5 = this.inputStream.read(var1, var2, var3);
				if (var5 <= 0) {
					throw new EOFException();
				}

				var2 += var5;
			}

			return var4;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "0"
	)
	@Export("write0")
	void write0(byte[] var1, int var2, int var3) throws IOException {
		if (!this.isClosed) {
			if (this.exceptionWriting) {
				this.exceptionWriting = false;
				throw new IOException();
			} else {
				if (this.outBuffer == null) {
					this.outBuffer = new byte[this.bufferLength];
				}

				synchronized(this) {
					for (int var5 = 0; var5 < var3; ++var5) {
						this.outBuffer[this.outOffset] = var1[var5 + var2];
						this.outOffset = (this.outOffset + 1) % this.bufferLength;
						if ((this.outLength + this.maxPacketLength) % this.bufferLength == this.outOffset) {
							throw new IOException();
						}
					}

					if (this.task == null) {
						this.task = this.taskHandler.newThreadTask(this, 3);
					}

					this.notifyAll();
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-748791607"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.write0(var1, var2, var3);
	}

	protected void finalize() {
		this.close();
	}

	public void run() {
		try {
			while (true) {
				label84: {
					int var1;
					int var2;
					synchronized(this) {
						if (this.outOffset == this.outLength) {
							if (this.isClosed) {
								break label84;
							}

							try {
								this.wait();
							} catch (InterruptedException var10) {
							}
						}

						var2 = this.outLength;
						if (this.outOffset >= this.outLength) {
							var1 = this.outOffset - this.outLength;
						} else {
							var1 = this.bufferLength - this.outLength;
						}
					}

					if (var1 <= 0) {
						continue;
					}

					try {
						this.outputStream.write(this.outBuffer, var2, var1);
					} catch (IOException var9) {
						this.exceptionWriting = true;
					}

					this.outLength = (var1 + this.outLength) % this.bufferLength;

					try {
						if (this.outLength == this.outOffset) {
							this.outputStream.flush();
						}
					} catch (IOException var8) {
						this.exceptionWriting = true;
					}
					continue;
				}

				try {
					if (this.inputStream != null) {
						this.inputStream.close();
					}

					if (this.outputStream != null) {
						this.outputStream.close();
					}

					if (this.socket != null) {
						this.socket.close();
					}
				} catch (IOException var7) {
				}

				this.outBuffer = null;
				break;
			}
		} catch (Exception var12) {
			MilliClock.RunException_sendStackTrace((String)null, var12);
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "965371090"
	)
	static long method2923(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1408375765"
	)
	@Export("load")
	static void load() {
		int var25;
		if (Client.titleLoadingStage == 0) {
			GameBuild.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var25 = 0; var25 < 4; ++var25) {
				Client.collisionMaps[var25] = new CollisionMap(104, 104);
			}

			class10.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			InvDefinition.archive0 = UrlRequest.newArchive(0, false, true, true);
			ApproximateRouteStrategy.archive1 = UrlRequest.newArchive(1, false, true, true);
			class1.archive2 = UrlRequest.newArchive(2, true, false, true);
			ParamComposition.archive3 = UrlRequest.newArchive(3, false, true, true);
			class12.archive4 = UrlRequest.newArchive(4, false, true, true);
			class11.archive5 = UrlRequest.newArchive(5, true, true, true);
			Messages.archive6 = UrlRequest.newArchive(6, true, true, true);
			HorizontalAlignment.archive7 = UrlRequest.newArchive(7, false, true, true);
			GrandExchangeOfferOwnWorldComparator.archive8 = UrlRequest.newArchive(8, false, true, true);
			SecureRandomFuture.archive9 = UrlRequest.newArchive(9, false, true, true);
			ChatChannel.archive10 = UrlRequest.newArchive(10, false, true, true);
			AbstractWorldMapIcon.archive11 = UrlRequest.newArchive(11, false, true, true);
			class14.archive12 = UrlRequest.newArchive(12, false, true, true);
			LoginScreenAnimation.archive13 = UrlRequest.newArchive(13, true, false, true);
			SecureRandomCallable.archive14 = UrlRequest.newArchive(14, false, true, true);
			Archive.archive15 = UrlRequest.newArchive(15, false, true, true);
			Message.archive17 = UrlRequest.newArchive(17, true, true, true);
			Messages.archive18 = UrlRequest.newArchive(18, false, true, true);
			class111.archive19 = UrlRequest.newArchive(19, false, true, true);
			GrandExchangeOfferOwnWorldComparator.archive20 = UrlRequest.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var39 = 0;
			var25 = var39 + InvDefinition.archive0.percentage() * 4 / 100;
			var25 += ApproximateRouteStrategy.archive1.percentage() * 4 / 100;
			var25 += class1.archive2.percentage() * 2 / 100;
			var25 += ParamComposition.archive3.percentage() * 2 / 100;
			var25 += class12.archive4.percentage() * 6 / 100;
			var25 += class11.archive5.percentage() * 4 / 100;
			var25 += Messages.archive6.percentage() * 2 / 100;
			var25 += HorizontalAlignment.archive7.percentage() * 56 / 100;
			var25 += GrandExchangeOfferOwnWorldComparator.archive8.percentage() * 2 / 100;
			var25 += SecureRandomFuture.archive9.percentage() * 2 / 100;
			var25 += ChatChannel.archive10.percentage() * 2 / 100;
			var25 += AbstractWorldMapIcon.archive11.percentage() * 2 / 100;
			var25 += class14.archive12.percentage() * 2 / 100;
			var25 += LoginScreenAnimation.archive13.percentage() * 2 / 100;
			var25 += SecureRandomCallable.archive14.percentage() * 2 / 100;
			var25 += Archive.archive15.percentage() * 2 / 100;
			var25 += class111.archive19.percentage() / 100;
			var25 += Messages.archive18.percentage() / 100;
			var25 += GrandExchangeOfferOwnWorldComparator.archive20.percentage() / 100;
			var25 += Message.archive17.method5260() && Message.archive17.isFullyLoaded() ? 1 : 0;
			if (var25 != 100) {
				if (var25 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var25 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				UserComparator8.method2460(InvDefinition.archive0, "Animations");
				UserComparator8.method2460(ApproximateRouteStrategy.archive1, "Skeletons");
				UserComparator8.method2460(class12.archive4, "Sound FX");
				UserComparator8.method2460(class11.archive5, "Maps");
				UserComparator8.method2460(Messages.archive6, "Music Tracks");
				UserComparator8.method2460(HorizontalAlignment.archive7, "Models");
				UserComparator8.method2460(GrandExchangeOfferOwnWorldComparator.archive8, "Sprites");
				UserComparator8.method2460(AbstractWorldMapIcon.archive11, "Music Jingles");
				UserComparator8.method2460(SecureRandomCallable.archive14, "Music Samples");
				UserComparator8.method2460(Archive.archive15, "Music Patches");
				UserComparator8.method2460(class111.archive19, "World Map");
				UserComparator8.method2460(Messages.archive18, "World Map Geography");
				UserComparator8.method2460(GrandExchangeOfferOwnWorldComparator.archive20, "World Map Ground");
				class111.spriteIds = new GraphicsDefaults();
				class111.spriteIds.decode(Message.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else {
			Archive var27;
			Archive var28;
			Archive var29;
			if (Client.titleLoadingStage == 45) {
				boolean var38 = !Client.isLowDetail;
				UserComparator2.field4359 = 22050;
				PcmPlayer.PcmPlayer_stereo = var38;
				PcmPlayer.field272 = 2;
				MidiPcmStream var34 = new MidiPcmStream();
				var34.method4761(9, 128);
				HealthBar.pcmPlayer0 = class112.method2522(GameEngine.taskHandler, 0, 22050);
				HealthBar.pcmPlayer0.setStream(var34);
				var27 = Archive.archive15;
				var28 = SecureRandomCallable.archive14;
				var29 = class12.archive4;
				class247.musicPatchesArchive = var27;
				class247.musicSamplesArchive = var28;
				class408.soundEffectsArchive = var29;
				class247.midiPcmStream = var34;
				ScriptEvent.pcmPlayer1 = class112.method2522(GameEngine.taskHandler, 1, 2048);
				BuddyRankComparator.pcmStreamMixer = new PcmStreamMixer();
				ScriptEvent.pcmPlayer1.setStream(BuddyRankComparator.pcmStreamMixer);
				FontName.decimator = new Decimator(22050, UserComparator2.field4359);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				MenuAction.WorldMapElement_fonts = new Fonts(GrandExchangeOfferOwnWorldComparator.archive8, LoginScreenAnimation.archive13);
			} else {
				int var1;
				if (Client.titleLoadingStage == 50) {
					FontName[] var33 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13};
					var1 = var33.length;
					Fonts var35 = MenuAction.WorldMapElement_fonts;
					FontName[] var36 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13};
					Client.fontsMap = var35.createMap(var36);
					if (Client.fontsMap.size() < var1) {
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%";
						Login.Login_loadingPercent = 40;
					} else {
						FriendLoginUpdate.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						class6.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						Login.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						class54.platformInfo = Client.platformInfoProvider.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.titleLoadingStage = 60;
					}
				} else {
					int var3;
					int var4;
					Archive var26;
					if (Client.titleLoadingStage == 60) {
						var26 = ChatChannel.archive10;
						var27 = GrandExchangeOfferOwnWorldComparator.archive8;
						var3 = 0;
						String[] var37 = Login.field885;

						int var30;
						String var31;
						for (var30 = 0; var30 < var37.length; ++var30) {
							var31 = var37[var30];
							if (var26.tryLoadFileByNames(var31, "")) {
								++var3;
							}
						}

						var37 = Login.field871;

						for (var30 = 0; var30 < var37.length; ++var30) {
							var31 = var37[var30];
							if (var27.tryLoadFileByNames(var31, "")) {
								++var3;
							}
						}

						var4 = ReflectionCheck.method1115();
						if (var3 < var4) {
							Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%";
							Login.Login_loadingPercent = 50;
						} else {
							Login.Login_loadingText = "Loaded title screen";
							Login.Login_loadingPercent = 50;
							WorldMapData_1.updateGameState(5);
							Client.titleLoadingStage = 70;
						}
					} else if (Client.titleLoadingStage == 70) {
						if (!class1.archive2.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + class1.archive2.loadPercent() + "%";
							Login.Login_loadingPercent = 60;
						} else {
							Archive var32 = class1.archive2;
							FloorOverlayDefinition.FloorOverlayDefinition_archive = var32;
							var26 = class1.archive2;
							FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var26;
							var27 = class1.archive2;
							var28 = HorizontalAlignment.archive7;
							KitDefinition.KitDefinition_archive = var27;
							KitDefinition.KitDefinition_modelsArchive = var28;
							class67.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
							var29 = class1.archive2;
							Archive var5 = HorizontalAlignment.archive7;
							boolean var6 = Client.isLowDetail;
							ObjectComposition.ObjectDefinition_archive = var29;
							ObjectComposition.ObjectDefinition_modelsArchive = var5;
							ObjectComposition.ObjectDefinition_isLowDetail = var6;
							Archive var7 = class1.archive2;
							Archive var8 = HorizontalAlignment.archive7;
							NPCComposition.NpcDefinition_archive = var7;
							NPCComposition.NpcDefinition_modelArchive = var8;
							class28.method405(class1.archive2);
							Archive var9 = class1.archive2;
							Archive var10 = HorizontalAlignment.archive7;
							boolean var11 = Client.isMembersWorld;
							Font var12 = FriendLoginUpdate.fontPlain11;
							DirectByteArrayCopier.ItemDefinition_archive = var9;
							HealthBarDefinition.ItemDefinition_modelArchive = var10;
							BuddyRankComparator.ItemDefinition_inMembersWorld = var11;
							class129.ItemDefinition_fileCount = DirectByteArrayCopier.ItemDefinition_archive.getGroupFileCount(10);
							SoundSystem.ItemDefinition_fontPlain11 = var12;
							Archive var13 = class1.archive2;
							Archive var14 = InvDefinition.archive0;
							Archive var15 = ApproximateRouteStrategy.archive1;
							SequenceDefinition.SequenceDefinition_archive = var13;
							SequenceDefinition.SequenceDefinition_animationsArchive = var14;
							SequenceDefinition.SequenceDefinition_skeletonsArchive = var15;
							Archive var16 = class1.archive2;
							Archive var17 = HorizontalAlignment.archive7;
							SpotAnimationDefinition.SpotAnimationDefinition_archive = var16;
							class389.SpotAnimationDefinition_modelArchive = var17;
							HealthBarUpdate.method2183(class1.archive2);
							Players.method2327(class1.archive2);
							class128.method2720(ParamComposition.archive3, HorizontalAlignment.archive7, GrandExchangeOfferOwnWorldComparator.archive8, LoginScreenAnimation.archive13);
							Archive var18 = class1.archive2;
							InvDefinition.InvDefinition_archive = var18;
							UserComparator7.method2463(class1.archive2);
							class81.method2093(class1.archive2);
							class28.method400(class1.archive2);
							FileSystem.field1564 = new class387(RouteStrategy.field1986, 54, MouseHandler.clientLanguage, class1.archive2);
							class240.HitSplatDefinition_cachedSprites = new class387(RouteStrategy.field1986, 47, MouseHandler.clientLanguage, class1.archive2);
							Message.varcs = new Varcs();
							class20.method295(class1.archive2, GrandExchangeOfferOwnWorldComparator.archive8, LoginScreenAnimation.archive13);
							Archive var19 = class1.archive2;
							Archive var20 = GrandExchangeOfferOwnWorldComparator.archive8;
							HealthBarDefinition.HealthBarDefinition_archive = var19;
							HealthBarDefinition.field1658 = var20;
							Archive var21 = class1.archive2;
							Archive var22 = GrandExchangeOfferOwnWorldComparator.archive8;
							WorldMapElement.WorldMapElement_archive = var22;
							if (var21.isFullyLoaded()) {
								WorldMapElement.WorldMapElement_count = var21.getGroupFileCount(35);
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

								for (int var23 = 0; var23 < WorldMapElement.WorldMapElement_count; ++var23) {
									byte[] var24 = var21.takeFile(35, var23);
									WorldMapElement.WorldMapElement_cached[var23] = new WorldMapElement(var23);
									if (var24 != null) {
										WorldMapElement.WorldMapElement_cached[var23].decode(new Buffer(var24));
										WorldMapElement.WorldMapElement_cached[var23].method3008();
									}
								}
							}

							Login.Login_loadingText = "Loaded config";
							Login.Login_loadingPercent = 60;
							Client.titleLoadingStage = 80;
						}
					} else if (Client.titleLoadingStage == 80) {
						var25 = 0;
						if (class114.compass == null) {
							class114.compass = WorldMapSection0.SpriteBuffer_getSprite(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.compass, 0);
						} else {
							++var25;
						}

						if (BoundaryObject.redHintArrowSprite == null) {
							BoundaryObject.redHintArrowSprite = WorldMapSection0.SpriteBuffer_getSprite(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4008, 0);
						} else {
							++var25;
						}

						if (TriBool.mapSceneSprites == null) {
							TriBool.mapSceneSprites = UserComparator5.method2478(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.mapScenes, 0);
						} else {
							++var25;
						}

						if (Client.headIconPkSprites == null) {
							Client.headIconPkSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.headIconsPk, 0);
						} else {
							++var25;
						}

						if (ServerPacket.headIconPrayerSprites == null) {
							ServerPacket.headIconPrayerSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4011, 0);
						} else {
							++var25;
						}

						if (DevicePcmPlayerProvider.headIconHintSprites == null) {
							DevicePcmPlayerProvider.headIconHintSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4012, 0);
						} else {
							++var25;
						}

						if (WorldMapIcon_0.mapMarkerSprites == null) {
							WorldMapIcon_0.mapMarkerSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4013, 0);
						} else {
							++var25;
						}

						if (UserComparator10.crossSprites == null) {
							UserComparator10.crossSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4014, 0);
						} else {
							++var25;
						}

						if (class115.mapDotSprites == null) {
							class115.mapDotSprites = class21.method312(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4010, 0);
						} else {
							++var25;
						}

						if (GameEngine.scrollBarSprites == null) {
							GameEngine.scrollBarSprites = UserComparator5.method2478(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4018, 0);
						} else {
							++var25;
						}

						if (class7.modIconSprites == null) {
							class7.modIconSprites = UserComparator5.method2478(GrandExchangeOfferOwnWorldComparator.archive8, class111.spriteIds.field4016, 0);
						} else {
							++var25;
						}

						if (var25 < 11) {
							Login.Login_loadingText = "Loading sprites - " + var25 * 100 / 12 + "%";
							Login.Login_loadingPercent = 70;
						} else {
							AbstractFont.AbstractFont_modIconSprites = class7.modIconSprites;
							BoundaryObject.redHintArrowSprite.normalize();
							var1 = (int)(Math.random() * 21.0D) - 10;
							int var2 = (int)(Math.random() * 21.0D) - 10;
							var3 = (int)(Math.random() * 21.0D) - 10;
							var4 = (int)(Math.random() * 41.0D) - 20;
							TriBool.mapSceneSprites[0].shiftColors(var1 + var4, var2 + var4, var4 + var3);
							Login.Login_loadingText = "Loaded sprites";
							Login.Login_loadingPercent = 70;
							Client.titleLoadingStage = 90;
						}
					} else if (Client.titleLoadingStage == 90) {
						if (!SecureRandomFuture.archive9.isFullyLoaded()) {
							Login.Login_loadingText = "Loading textures - " + "0%";
							Login.Login_loadingPercent = 90;
						} else {
							Varcs.textureProvider = new TextureProvider(SecureRandomFuture.archive9, GrandExchangeOfferOwnWorldComparator.archive8, 20, class408.clientPreferences.brightness, Client.isLowDetail ? 64 : 128);
							Rasterizer3D.Rasterizer3D_setTextureLoader(Varcs.textureProvider);
							Rasterizer3D.Rasterizer3D_setBrightness(class408.clientPreferences.brightness);
							Client.titleLoadingStage = 100;
						}
					} else if (Client.titleLoadingStage == 100) {
						var25 = Varcs.textureProvider.getLoadedPercentage();
						if (var25 < 100) {
							Login.Login_loadingText = "Loading textures - " + var25 + "%";
							Login.Login_loadingPercent = 90;
						} else {
							Login.Login_loadingText = "Loaded textures";
							Login.Login_loadingPercent = 90;
							Client.titleLoadingStage = 110;
						}
					} else if (Client.titleLoadingStage == 110) {
						Interpreter.mouseRecorder = new class81();
						GameEngine.taskHandler.newThreadTask(Interpreter.mouseRecorder, 10);
						Login.Login_loadingText = "Loaded input handler";
						Login.Login_loadingPercent = 92;
						Client.titleLoadingStage = 120;
					} else if (Client.titleLoadingStage == 120) {
						if (!ChatChannel.archive10.tryLoadFileByNames("huffman", "")) {
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
							Login.Login_loadingPercent = 94;
						} else {
							Huffman var0 = new Huffman(ChatChannel.archive10.takeFileByNames("huffman", ""));
							ItemLayer.method4108(var0);
							Login.Login_loadingText = "Loaded wordpack";
							Login.Login_loadingPercent = 94;
							Client.titleLoadingStage = 130;
						}
					} else if (Client.titleLoadingStage == 130) {
						if (!ParamComposition.archive3.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + ParamComposition.archive3.loadPercent() * 4 / 5 + "%";
							Login.Login_loadingPercent = 96;
						} else if (!class14.archive12.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (80 + class14.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 96;
						} else if (!LoginScreenAnimation.archive13.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (96 + LoginScreenAnimation.archive13.loadPercent() / 50) + "%";
							Login.Login_loadingPercent = 96;
						} else {
							Login.Login_loadingText = "Loaded interfaces";
							Login.Login_loadingPercent = 98;
							Client.titleLoadingStage = 140;
						}
					} else if (Client.titleLoadingStage == 140) {
						Login.Login_loadingPercent = 100;
						if (!class111.archive19.tryLoadGroupByName(WorldMapCacheName.field2210.name)) {
							Login.Login_loadingText = "Loading world map - " + class111.archive19.groupLoadPercentByName(WorldMapCacheName.field2210.name) / 10 + "%";
						} else {
							if (class133.worldMap == null) {
								class133.worldMap = new WorldMap();
								class133.worldMap.init(class111.archive19, Messages.archive18, GrandExchangeOfferOwnWorldComparator.archive20, Login.fontBold12, Client.fontsMap, TriBool.mapSceneSprites);
							}

							Login.Login_loadingText = "Loaded world map";
							Client.titleLoadingStage = 150;
						}
					} else if (Client.titleLoadingStage == 150) {
						WorldMapData_1.updateGameState(10);
					}
				}
			}
		}
	}
}
