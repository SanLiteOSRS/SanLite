import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = -1656768019
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("o")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("r")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -900105725
	)
	static int field416;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("k")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1427209561
	)
	int field400;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = -1728161507642357129L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -140802569
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -857903809
	)
	int field403;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1599565829
	)
	int field396;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -6258201281571484971L
	)
	long field405;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1984678795
	)
	int field412;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -658055953
	)
	int field407;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1674190229
	)
	int field413;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 939543839577998155L
	)
	long field409;
	@ObfuscatedName("a")
	boolean field415;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1615466093
	)
	int field411;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	PcmStream[] field408;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	PcmStream[] field406;

	protected PcmPlayer() {
		this.field400 = 32;
		this.timeMs = ClientPacket.currentTimeMillis();
		this.field405 = 0L;
		this.field412 = 0;
		this.field407 = 0;
		this.field413 = 0;
		this.field409 = 0L;
		this.field415 = true;
		this.field411 = 0;
		this.field408 = new PcmStream[8];
		this.field406 = new PcmStream[8];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-412057865"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "19"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("y")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2004376502"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1448704014"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lbc;B)V",
		garbageValue = "82"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2069251377"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = ClientPacket.currentTimeMillis();

			try {
				if (0L != this.field405) {
					if (var1 < this.field405) {
						return;
					}

					this.open(this.capacity);
					this.field405 = 0L;
					this.field415 = true;
				}

				int var3 = this.position();
				if (this.field413 - var3 > this.field412) {
					this.field412 = this.field413 - var3;
				}

				int var4 = this.field403 + this.field396;
				if (var4 + 256 > 16384) {
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) {
					this.capacity += 1024;
					if (this.capacity > 16384) {
						this.capacity = 16384;
					}

					this.close();
					this.open(this.capacity);
					var3 = 0;
					this.field415 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field396 = var4 - this.field403;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field409) {
					if (!this.field415) {
						if (this.field412 == 0 && this.field407 == 0) {
							this.close();
							this.field405 = var1 + 2000L;
							return;
						}

						this.field396 = Math.min(this.field407, this.field412);
						this.field407 = this.field412;
					} else {
						this.field415 = false;
					}

					this.field412 = 0;
					this.field409 = 2000L + var1;
				}

				this.field413 = var3;
			} catch (Exception var7) {
				this.close();
				this.field405 = 2000L + var1;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / class341.field3921);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1732163057"
	)
	public final void method844() {
		this.field415 = true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1915909212"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field415 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field405 = ClientPacket.currentTimeMillis() + 2000L;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2141825819"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (Login.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == Login.soundSystem.players[var2]) {
					Login.soundSystem.players[var2] = null;
				}

				if (Login.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				Login.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "120"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field411 -= var1;
		if (this.field411 < 0) {
			this.field411 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("at")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class307.clearIntArray(var1, 0, var3);
		this.field411 -= var2;
		if (this.stream != null && this.field411 <= 0) {
			this.field411 += class341.field3921 >> 4;
			NetFileRequest.PcmStream_disable(this.stream);
			this.method843(this.stream, this.stream.vmethod1099());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label109:
			for (var6 = 7; var5 != 0; --var6) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
					if ((var9 & 1) != 0) {
						var5 &= ~(1 << var7);
						var10 = null;
						PcmStream var11 = this.field408[var7];

						label103:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label103;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod4740();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field400) {
										break label109;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field473; var14 != null; var14 = var11.nextSubStream()) {
											this.method843(var14, var15 * var14.vmethod1099() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field408[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field406[var7] = var10;
									}

									var11 = var18;
								}
							}
						}
					}

					var7 += 4;
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) {
				PcmStream var16 = this.field408[var6];
				PcmStream[] var17 = this.field408;
				this.field406[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field411 < 0) {
			this.field411 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = ClientPacket.currentTimeMillis();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lbc;II)V",
		garbageValue = "176073519"
	)
	final void method843(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field406[var3];
		if (var4 == null) {
			this.field408[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field406[var3] = var1;
		var1.field473 = var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public static void method856(int var0) {
		class233.musicPlayerStatus = 1;
		InvDefinition.musicTrackArchive = null;
		class233.musicTrackGroupId = -1;
		class233.musicTrackFileId = -1;
		class233.musicTrackVolume = 0;
		GrandExchangeOfferUnitPriceComparator.musicTrackBoolean = false;
		FaceNormal.pcmSampleLength = var0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1170967176"
	)
	public static void method893() {
		KitDefinition.KitDefinition_cached.clear();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Llk;",
		garbageValue = "1530151189"
	)
	public static AbstractSocket method897(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1965845813"
	)
	static int method898(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			ChatChannel.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			ChatChannel.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			ChatChannel.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--ChatChannel.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			ChatChannel.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-998429895"
	)
	static void method895() {
		Client.mouseLastLastPressedTimeMillis = 1L;
		UrlRequester.mouseRecorder.index = 0;
		class397.hasFocus = true;
		Client.hadFocus = true;
		Client.field850 = -1L;
		Decimator.method1160();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1410 = null;
		Client.packetWriter.field1411 = null;
		Client.packetWriter.field1399 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1408 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		class34.method407();
		MouseHandler.MouseHandler_idleCycles = 0;
		class69.method1208();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		LoginPacket.field2800 = null;
		Client.minimapState = 0;
		Client.field853 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		SoundCache.method928();

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) {
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1;
		Client.projectiles.clear();
		Client.graphicsObjects.clear();

		for (var0 = 0; var0 < 4; ++var0) {
			for (int var4 = 0; var4 < 104; ++var4) {
				for (int var2 = 0; var2 < 104; ++var2) {
					Client.groundItems[var0][var4][var2] = null;
				}
			}
		}

		Client.pendingSpawns = new NodeDeque();
		DevicePcmPlayerProvider.friendSystem.clear();

		for (var0 = 0; var0 < SoundSystem.VarpDefinition_fileCount; ++var0) {
			VarpDefinition var1 = class1.VarpDefinition_get(var0);
			if (var1 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		class20.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class44.method540(Client.rootInterface);
		}

		for (InterfaceParent var3 = (InterfaceParent)Client.interfaceParents.first(); var3 != null; var3 = (InterfaceParent)Client.interfaceParents.next()) {
			InvDefinition.closeInterface(var3, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		class34.method407();
		Client.playerAppearance.update((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field831[var0] = true;
		}

		BufferedSink.method5992();
		class289.friendsChatManager = null;
		WorldMapManager.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		AttackOption.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		class267.grandExchangeEvents = null;
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1475129816"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		class96.method2202();
		UserComparator7.method2539();
		method893();
		CollisionMap.method3245();
		class143.method2811();
		Projectile.method2075();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		MenuAction.method2028();
		VarbitComposition.VarbitDefinition_cached.clear();
		class69.method1224();
		class27.field215.method6474();
		class26.HitSplatDefinition_cachedSprites.method6474();
		class171.method3613();
		Decimator.method1168();
		SoundSystem.method916();
		Players.method2402();
		WorldMapElement.Widget_cachedSprites.clear();
		PlayerComposition.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		Widget.field2970.clear();
		Widget.archive0.clear();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		ClanChannel.archive3.clearFiles();
		KitDefinition.archive4.clearFiles();
		class18.archive5.clearFiles();
		class26.field211.clearFiles();
		class4.archive7.clearFiles();
		DynamicObject.archive6.clearFiles();
		archive9.clearFiles();
		ModeWhere.archive8.clearFiles();
		class16.field134.clearFiles();
		JagexCache.archive10.clearFiles();
		class160.archive11.clearFiles();
		Varcs.archive12.clearFiles();
		DevicePcmPlayerProvider.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		System.gc();
		method856(2);
		Client.currentTrackGroupId = -1;
		Client.field862 = false;

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.stream1 != null) {
				UserComparator7.pcmStreamMixer.removeSubStream(var1.stream1);
				var1.stream1 = null;
			}

			if (var1.stream2 != null) {
				UserComparator7.pcmStreamMixer.removeSubStream(var1.stream2);
				var1.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
		Projectile.updateGameState(10);
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "([Liv;IIIIIIIII)V",
		garbageValue = "-1362986911"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();

		for (int var9 = 0; var9 < var0.length; ++var9) {
			Widget var10 = var0[var9];
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
				int var11;
				if (var8 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
					var11 = ++Client.rootWidgetCount - 1;
				} else {
					var11 = var8;
				}

				var10.rootIndex = var11;
				var10.cycle = Client.cycle;
				if (!var10.isIf3 || !class35.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						class309.method5671(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							WorldMapCacheName.field2135 = var0;
							Clock.field1538 = var6;
							Canvas.field296 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field821) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field801) {
								var15 = Client.field801;
							}

							if (var15 + var10.width > Client.field801 + Client.clickedWidgetParent.width) {
								var15 = Client.field801 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field802) {
								var16 = Client.field802;
							}

							if (var16 + var10.height > Client.field802 + Client.clickedWidgetParent.height) {
								var16 = Client.field802 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15;
							var13 = var16;
						}

						if (!var10.isScrollBar) {
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) {
						var15 = var2;
						var16 = var3;
						var17 = var4;
						var18 = var5;
					} else if (var10.type == 9) {
						var19 = var12;
						var20 = var13;
						var21 = var12 + var10.width;
						var22 = var13 + var10.height;
						if (var21 < var12) {
							var19 = var21;
							var21 = var12;
						}

						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						++var21;
						++var22;
						var15 = var19 > var2 ? var19 : var2;
						var16 = var20 > var3 ? var20 : var3;
						var17 = var21 < var4 ? var21 : var4;
						var18 = var22 < var5 ? var22 : var5;
					} else {
						var19 = var12 + var10.width;
						var20 = var13 + var10.height;
						var15 = var12 > var2 ? var12 : var2;
						var16 = var13 > var3 ? var13 : var3;
						var17 = var19 < var4 ? var19 : var4;
						var18 = var20 < var5 ? var20 : var5;
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) {
						if (var10.contentType != 0) {
							if (var10.contentType == 1336) {
								if (Client.displayFps) {
									var13 += 15;
									AbstractSocket.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var42 = Runtime.getRuntime();
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									AbstractSocket.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								UserComparator9.drawEntities(var12, var13, var10.width, var10.height);
								Client.field831[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								FloorOverlayDefinition.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								IsaacCipher.drawCompass(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								class80.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
							}

							if (var10.contentType == 1401) {
								class80.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}

							if (var10.contentType == 1402) {
								PendingSpawn.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (!var10.isIf3 && class35.isComponentHidden(var10) && var10 != MusicPatchNode.mousedOverWidgetIf1) {
								continue;
							}

							if (!var10.isIf3) {
								if (var10.scrollY > var10.scrollHeight - var10.height) {
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) {
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
							if (var30 != null) {
								SoundSystem.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						}

						if (Client.isResizable || Client.field833[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
								BufferedSource.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) {
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) {
									var19 = 0;

									for (var20 = 0; var20 < var10.rawHeight; ++var20) {
										for (var21 = 0; var21 < var10.rawWidth; ++var21) {
											var22 = var12 + var21 * (var10.paddingX + 32);
											var23 = var20 * (var10.paddingY + 32) + var13;
											if (var19 < 20) {
												var22 += var10.inventoryXOffsets[var19];
												var23 += var10.inventoryYOffsets[var19];
											}

											if (var10.itemIds[var19] <= 0) {
												if (var10.inventorySprites != null && var19 < 20) {
													SpritePixels var46 = var10.getInventorySprite(var19);
													if (var46 != null) {
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field2958) {
														Script.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false;
												boolean var38 = false;
												var26 = var10.itemIds[var19] - 1;
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == VerticalAlignment.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == Timer.selectedItemSlot && var10.id == class246.selectedItemWidget) {
														var35 = SpotAnimationDefinition.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = SpotAnimationDefinition.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
													}

													if (var35 != null) {
														if (var10 == VerticalAlignment.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX;
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY;
															if (var24 < 5 && var24 > -5) {
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) {
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) {
																var24 = 0;
																var25 = 0;
															}

															var35.drawTransAt(var22 + var24, var23 + var25, 128);
															if (var1 != -1) {
																Widget var28 = var0[var1 & 65535];
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) {
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field683 / 3;
																	if (var29 > Client.field683 * 10) {
																		var29 = Client.field683 * 10;
																	}

																	if (var29 > var28.scrollY) {
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29;
																	Client.draggedWidgetY += var29;
																	Script.invalidateWidget(var28);
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) {
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field683 / 3;
																	if (var29 > Client.field683 * 10) {
																		var29 = Client.field683 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) {
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29;
																	Client.draggedWidgetY -= var29;
																	Script.invalidateWidget(var28);
																}
															}
														} else if (var10 == Login.field1034 && var19 == Client.field729) {
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23);
														}
													} else {
														Script.invalidateWidget(var10);
													}
												}
											}

											++var19;
										}
									}
								} else if (var10.type == 3) {
									if (Friend.runCs1(var10)) {
										var19 = var10.color2;
										if (var10 == MusicPatchNode.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color;
										if (var10 == MusicPatchNode.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field4242) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
											break;
										default:
											if (var14 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
											}
										}
									} else if (var14 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
									}
								} else {
									Font var39;
									if (var10.type == 4) {
										var39 = var10.getFont();
										if (var39 == null) {
											if (Widget.field2958) {
												Script.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text;
											if (Friend.runCs1(var10)) {
												var20 = var10.color2;
												if (var10 == MusicPatchNode.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) {
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color;
												if (var10 == MusicPatchNode.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) {
												ItemComposition var45 = class250.ItemDefinition_get(var10.itemId);
												var44 = var45.name;
												if (var44 == null) {
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
													var44 = SecureRandomFuture.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + MusicPatchNode.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) {
												var44 = "Please wait...";
												var20 = var10.color;
											}

											if (!var10.isIf3) {
												var44 = ItemContainer.method2184(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
										}
									} else if (var10.type == 5) {
										SpritePixels var40;
										if (!var10.isIf3) {
											var40 = var10.getSprite(Friend.runCs1(var10));
											if (var40 != null) {
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field2958) {
												Script.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var40 = SpotAnimationDefinition.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false);
											}

											if (var40 == null) {
												if (Widget.field2958) {
													Script.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width;
												var21 = var40.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 4096 / var20;
													if (var10.spriteAngle != 0) {
														var40.method7097(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) {
														var40.drawTransBgAt(var12, var13);
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
													var22 = (var20 - 1 + var10.width) / var20;
													var23 = (var21 - 1 + var10.height) / var21;

													for (var24 = 0; var24 < var22; ++var24) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var40.method7097(var20 / 2 + var12 + var20 * var24, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21);
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) {
											boolean var36 = Friend.runCs1(var10);
											if (var36) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var41 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												var33 = class250.ItemDefinition_get(var10.itemId);
												if (var33 != null) {
													var33 = var33.getCountObj(var10.itemQuantity);
													var41 = var33.getModel(1);
													if (var41 != null) {
														var41.calculateBoundsCylinder();
														var22 = var41.height / 2;
													} else {
														Script.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class262.localPlayer.getModel();
												}
											} else if (var20 == -1) {
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class262.localPlayer.appearance);
												if (var41 == null && Widget.field2958) {
													Script.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = WorldMapScaleHandler.SequenceDefinition_get(var20);
												var41 = var10.getModel(var47, var10.modelFrame, var36, class262.localPlayer.appearance);
												if (var41 == null && Widget.field2958) {
													Script.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3950(var10.width / 2 + var12, var10.height / 2 + var13);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
											if (var41 != null) {
												if (!var10.isIf3) {
													var41.method4347(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var41.method4309(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4347(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY);
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3();
										} else {
											if (var10.type == 7) {
												var39 = var10.getFont();
												if (var39 == null) {
													if (Widget.field2958) {
														Script.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0;

												for (var21 = 0; var21 < var10.rawHeight; ++var21) {
													for (var22 = 0; var22 < var10.rawWidth; ++var22) {
														if (var10.itemIds[var20] > 0) {
															var33 = class250.ItemDefinition_get(var10.itemIds[var20] - 1);
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) {
																var34 = SecureRandomFuture.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = SecureRandomFuture.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + MusicPatchNode.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115);
															var26 = (var10.paddingY + 12) * var21 + var13;
															if (var10.textXAlignment == 0) {
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) {
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
															}
														}

														++var20;
													}
												}
											}

											if (var10.type == 8 && var10 == class5.field42 && Client.field773 == Client.field693) {
												var19 = 0;
												var20 = 0;
												Font var31 = AbstractSocket.fontPlain12;
												String var32 = var10.text;

												String var43;
												for (var32 = ItemContainer.method2184(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) {
													var24 = var32.indexOf("<br>");
													if (var24 != -1) {
														var43 = var32.substring(0, var24);
														var32 = var32.substring(var24 + 4);
													} else {
														var43 = var32;
														var32 = "";
													}

													var25 = var31.stringWidth(var43);
													if (var25 > var19) {
														var19 = var25;
													}
												}

												var19 += 6;
												var20 += 7;
												var24 = var12 + var10.width - 5 - var19;
												var25 = var13 + var10.height + 5;
												if (var24 < var12 + 5) {
													var24 = var12 + 5;
												}

												if (var19 + var24 > var4) {
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
												var32 = var10.text;
												var26 = var25 + var31.ascent + 2;

												for (var32 = ItemContainer.method2184(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) {
													int var27 = var32.indexOf("<br>");
													if (var27 != -1) {
														var43 = var32.substring(0, var27);
														var32 = var32.substring(var27 + 4);
													} else {
														var43 = var32;
														var32 = "";
													}

													var31.draw(var43, var24 + 3, var26, 0, -1);
												}
											}

											if (var10.type == 9) {
												if (var10.field2994) {
													var19 = var12;
													var20 = var13 + var10.height;
													var21 = var12 + var10.width;
													var22 = var13;
												} else {
													var19 = var12;
													var20 = var13;
													var21 = var12 + var10.width;
													var22 = var13 + var10.height;
												}

												if (var10.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color);
												} else {
													PlayerComposition.method4850(var19, var20, var21, var22, var10.color, var10.lineWid);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
