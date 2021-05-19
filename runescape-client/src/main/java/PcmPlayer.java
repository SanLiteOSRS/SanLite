import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 74532615
	)
	public static int field401;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -866267341
	)
	static int field405;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("r")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -490357665
	)
	int field402;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -9009804721100139371L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 878578447
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -733571391
	)
	int field400;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1308000535
	)
	int field406;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -6126918723449100817L
	)
	long field407;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -912602509
	)
	int field408;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -843557291
	)
	int field409;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1543102679
	)
	int field396;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 211548958469134193L
	)
	long field411;
	@ObfuscatedName("n")
	boolean field412;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1771576573
	)
	int field403;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	PcmStream[] field415;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	PcmStream[] field416;

	protected PcmPlayer() {
		this.field402 = 32;
		this.timeMs = Archive.currentTimeMillis();
		this.field407 = 0L;
		this.field408 = 0;
		this.field409 = 0;
		this.field396 = 0;
		this.field411 = 0L;
		this.field412 = true;
		this.field403 = 0;
		this.field415 = new PcmStream[8];
		this.field416 = new PcmStream[8];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1996880040"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1272180581"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-10918"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("g")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1221564732"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lbt;B)V",
		garbageValue = "-8"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = Archive.currentTimeMillis();

			try {
				if (0L != this.field407) {
					if (var1 < this.field407) {
						return;
					}

					this.open(this.capacity);
					this.field407 = 0L;
					this.field412 = true;
				}

				int var3 = this.position();
				if (this.field396 - var3 > this.field408) {
					this.field408 = this.field396 - var3;
				}

				int var4 = this.field400 + this.field406;
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
					this.field412 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field406 = var4 - this.field400;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field411) {
					if (!this.field412) {
						if (this.field408 == 0 && this.field409 == 0) {
							this.close();
							this.field407 = 2000L + var1;
							return;
						}

						this.field406 = Math.min(this.field409, this.field408);
						this.field409 = this.field408;
					} else {
						this.field412 = false;
					}

					this.field408 = 0;
					this.field411 = var1 + 2000L;
				}

				this.field396 = var3;
			} catch (Exception var7) {
				this.close();
				this.field407 = var1 + 2000L;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field401);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-615521568"
	)
	public final void method794() {
		this.field412 = true;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field412 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field407 = Archive.currentTimeMillis() + 2000L;
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == soundSystem.players[var2]) {
					soundSystem.players[var2] = null;
				}

				if (soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				class337.soundSystemExecutor.shutdownNow();
				class337.soundSystemExecutor = null;
				soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2095717179"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field403 -= var1;
		if (this.field403 < 0) {
			this.field403 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("n")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (ApproximateRouteStrategy.PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class306.clearIntArray(var1, 0, var3);
		this.field403 -= var2;
		if (this.stream != null && this.field403 <= 0) {
			this.field403 += field401 >> 4;
			class386.PcmStream_disable(this.stream);
			this.method799(this.stream, this.stream.vmethod1044());
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
						PcmStream var11 = this.field415[var7];

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
									int var13 = var11.vmethod4560();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field402) {
										break label109;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field469; var14 != null; var14 = var11.nextSubStream()) {
											this.method799(var14, var15 * var14.vmethod1044() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field415[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field416[var7] = var10;
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
				PcmStream var16 = this.field415[var6];
				PcmStream[] var17 = this.field415;
				this.field416[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field403 < 0) {
			this.field403 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = Archive.currentTimeMillis();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lbt;IB)V",
		garbageValue = "0"
	)
	final void method799(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field416[var3];
		if (var4 == null) {
			this.field415[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field416[var3] = var1;
		var1.field469 = var2;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "678860256"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = SceneTilePaint.getTileHeight(var0, var1, ParamComposition.Client_plane) - var2;
			var0 -= class20.cameraX;
			var3 -= Skeleton.cameraY;
			var1 -= WorldMapDecoration.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[class1.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class1.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[HealthBarDefinition.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[HealthBarDefinition.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var5 * var1 + var4 * var3 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
