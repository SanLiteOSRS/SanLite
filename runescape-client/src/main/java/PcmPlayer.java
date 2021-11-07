import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("g")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1710206631
	)
	public static int field272;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("t")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1114914311
	)
	int field254;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -139627477628549521L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -964657999
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -169687701
	)
	int field264;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 275810673
	)
	int field258;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 7412881241186270643L
	)
	long field259;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1880549509
	)
	int field251;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 672902205
	)
	int field253;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -390982901
	)
	int field261;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -127582275051913285L
	)
	long field263;
	@ObfuscatedName("v")
	boolean field257;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1176592889
	)
	int field267;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lav;"
	)
	PcmStream[] field268;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lav;"
	)
	PcmStream[] field269;

	protected PcmPlayer() {
		this.field254 = 32;
		this.timeMs = class111.method2516();
		this.field259 = 0L;
		this.field251 = 0;
		this.field253 = 0;
		this.field261 = 0;
		this.field263 = 0L;
		this.field257 = true;
		this.field267 = 0;
		this.field268 = new PcmStream[8];
		this.field269 = new PcmStream[8];
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "122369223"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1689594693"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("a")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1440644043"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-98"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lav;I)V",
		garbageValue = "242678028"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "971942949"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = class111.method2516();

			try {
				if (this.field259 != 0L) {
					if (var1 < this.field259) {
						return;
					}

					this.open(this.capacity);
					this.field259 = 0L;
					this.field257 = true;
				}

				int var3 = this.position();
				if (this.field261 - var3 > this.field251) {
					this.field251 = this.field261 - var3;
				}

				int var4 = this.field258 + this.field264;
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
					this.field257 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field258 = var4 - this.field264;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field263) {
					if (!this.field257) {
						if (this.field251 == 0 && this.field253 == 0) {
							this.close();
							this.field259 = var1 + 2000L;
							return;
						}

						this.field258 = Math.min(this.field253, this.field251);
						this.field253 = this.field251;
					} else {
						this.field257 = false;
					}

					this.field251 = 0;
					this.field263 = var1 + 2000L;
				}

				this.field261 = var3;
			} catch (Exception var7) {
				this.close();
				this.field259 = var1 + 2000L;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) {
					this.skip(256);
					this.timeMs += (long)(256000 / UserComparator2.field4359);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2104373839"
	)
	public final void method750() {
		this.field257 = true;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "31692"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field257 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field259 = class111.method2516() + 2000L;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1720419183"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class122.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class122.soundSystem.players[var2]) {
					class122.soundSystem.players[var2] = null;
				}

				if (class122.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class381.soundSystemExecutor.shutdownNow();
				class381.soundSystemExecutor = null;
				class122.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1660525629"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field267 -= var1;
		if (this.field267 < 0) {
			this.field267 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("ag")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class321.clearIntArray(var1, 0, var3);
		this.field267 -= var2;
		if (this.stream != null && this.field267 <= 0) {
			this.field267 += UserComparator2.field4359 >> 4;
			KitDefinition.PcmStream_disable(this.stream);
			this.method719(this.stream, this.stream.vmethod974());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label108:
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
						PcmStream var11 = this.field268[var7];

						label102:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label102;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod4958();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field254) {
										break label108;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field320; var14 != null; var14 = var11.nextSubStream()) {
											this.method719(var14, var15 * var14.vmethod974() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field268[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field269[var7] = var10;
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
				PcmStream var16 = this.field268[var6];
				PcmStream[] var17 = this.field268;
				this.field269[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field267 < 0) {
			this.field267 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class111.method2516();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lav;IS)V",
		garbageValue = "2601"
	)
	final void method719(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field269[var3];
		if (var4 == null) {
			this.field268[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field269[var3] = var1;
		var1.field320 = var2;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lai;I)V",
		garbageValue = "-1238015178"
	)
	static void method757(GameEngine var0) {
		while (WorldMapElement.isKeyDown()) {
			if (class12.field55 == 13) {
				class10.method104();
				return;
			}

			if (class12.field55 == 96) {
				if (Login.worldSelectPage > 0 && UserComparator6.worldSelectLeftSprite != null) {
					--Login.worldSelectPage;
				}
			} else if (class12.field55 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class81.worldSelectRightSprite != null) {
				++Login.worldSelectPage;
			}
		}

		if (MouseHandler.MouseHandler_lastButton == 1 || !ApproximateRouteStrategy.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
			int var1 = Login.xPadding + 280;
			if (MouseHandler.MouseHandler_lastPressedX >= var1 && MouseHandler.MouseHandler_lastPressedX <= var1 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				PlayerType.changeWorldSelectSorting(0, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var1 + 15 && MouseHandler.MouseHandler_lastPressedX <= var1 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				PlayerType.changeWorldSelectSorting(0, 1);
				return;
			}

			int var2 = Login.xPadding + 390;
			if (MouseHandler.MouseHandler_lastPressedX >= var2 && MouseHandler.MouseHandler_lastPressedX <= var2 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				PlayerType.changeWorldSelectSorting(1, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var2 + 15 && MouseHandler.MouseHandler_lastPressedX <= var2 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				PlayerType.changeWorldSelectSorting(1, 1);
				return;
			}

			int var3 = Login.xPadding + 500;
			if (MouseHandler.MouseHandler_lastPressedX >= var3 && MouseHandler.MouseHandler_lastPressedX <= var3 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				PlayerType.changeWorldSelectSorting(2, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var3 + 15 && MouseHandler.MouseHandler_lastPressedX <= var3 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				PlayerType.changeWorldSelectSorting(2, 1);
				return;
			}

			int var4 = Login.xPadding + 610;
			if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				PlayerType.changeWorldSelectSorting(3, 0);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
				PlayerType.changeWorldSelectSorting(3, 1);
				return;
			}

			if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
				class10.method104();
				return;
			}

			if (Login.hoveredWorldIndex != -1) {
				World var5 = WorldMapEvent.World_worlds[Login.hoveredWorldIndex];
				MidiPcmStream.changeWorld(var5);
				class10.method104();
				return;
			}

			if (Login.worldSelectPage > 0 && UserComparator6.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= UserComparator6.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= KeyHandler.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= KeyHandler.canvasHeight / 2 + 50) {
				--Login.worldSelectPage;
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class81.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= GameEngine.canvasWidth - class81.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= GameEngine.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= KeyHandler.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= KeyHandler.canvasHeight / 2 + 50) {
				++Login.worldSelectPage;
			}
		}

	}
}
