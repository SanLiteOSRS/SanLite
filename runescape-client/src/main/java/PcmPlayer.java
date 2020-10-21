import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = 1059477120
	)
	static int field1449;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 445943663
	)
	public static int field1442;
	@ObfuscatedName("q")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("be")
	static String field1436;
	@ObfuscatedName("x")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lde;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -420218683
	)
	int field1438;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -2584674083897744543L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2101974297
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1733688779
	)
	int field1441;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1246439087
	)
	int field1454;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -2737488179381108627L
	)
	long field1432;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 704933067
	)
	int field1444;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1488004649
	)
	int field1445;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2114790969
	)
	int field1435;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -7835668176490123993L
	)
	long field1456;
	@ObfuscatedName("i")
	boolean field1448;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1431776873
	)
	int field1450;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "[Lde;"
	)
	PcmStream[] field1451;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "[Lde;"
	)
	PcmStream[] field1452;

	protected PcmPlayer() {
		this.field1438 = 32;
		this.timeMs = Nameable.currentTimeMillis();
		this.field1432 = 0L;
		this.field1444 = 0;
		this.field1445 = 0;
		this.field1435 = 0;
		this.field1456 = 0L;
		this.field1448 = true;
		this.field1450 = 0;
		this.field1451 = new PcmStream[8];
		this.field1452 = new PcmStream[8];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-906788639"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-32"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-612241013"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("m")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "0"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1393012391"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(Lde;I)V",
		garbageValue = "-239504049"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "29"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = Nameable.currentTimeMillis();

			try {
				if (0L != this.field1432) {
					if (var1 < this.field1432) {
						return;
					}

					this.open(this.capacity);
					this.field1432 = 0L;
					this.field1448 = true;
				}

				int var3 = this.position();
				if (this.field1435 - var3 > this.field1444) {
					this.field1444 = this.field1435 - var3;
				}

				int var4 = this.field1441 + this.field1454;
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
					this.field1448 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field1454 = var4 - this.field1441;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field1456) {
					if (!this.field1448) {
						if (this.field1444 == 0 && this.field1445 == 0) {
							this.close();
							this.field1432 = 2000L + var1;
							return;
						}

						this.field1454 = Math.min(this.field1445, this.field1444);
						this.field1445 = this.field1444;
					} else {
						this.field1448 = false;
					}

					this.field1444 = 0;
					this.field1456 = 2000L + var1;
				}

				this.field1435 = var3;
			} catch (Exception var7) {
				this.close();
				this.field1432 = var1 + 2000L;
			}

			try {
				if (var1 > 500000L + this.timeMs) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field1442);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-170851511"
	)
	public final void method2562() {
		this.field1448 = true;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2091297211"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1448 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field1432 = Nameable.currentTimeMillis() + 2000L;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "115"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (WorldMapDecoration.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == WorldMapDecoration.soundSystem.players[var2]) {
					WorldMapDecoration.soundSystem.players[var2] = null;
				}

				if (WorldMapDecoration.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				RunException.soundSystemExecutor.shutdownNow();
				RunException.soundSystemExecutor = null;
				WorldMapDecoration.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "79"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1450 -= var1;
		if (this.field1450 < 0) {
			this.field1450 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("ab")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class311.clearIntArray(var1, 0, var3);
		this.field1450 -= var2;
		if (this.stream != null && this.field1450 <= 0) {
			this.field1450 += field1442 >> 4;
			Client.PcmStream_disable(this.stream);
			this.method2606(this.stream, this.stream.vmethod2850());
			int var4 = 0;
			int var5 = 255;

			int var6;
			PcmStream var10;
			label104:
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
						PcmStream var11 = this.field1451[var7];

						label98:
						while (true) {
							while (true) {
								if (var11 == null) {
									break label98;
								}

								AbstractSound var12 = var11.sound;
								if (var12 != null && var12.position > var8) {
									var5 |= 1 << var7;
									var10 = var11;
									var11 = var11.after;
								} else {
									var11.active = true;
									int var13 = var11.vmethod4043();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field1438) {
										break label104;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field1520; var14 != null; var14 = var11.nextSubStream()) {
											this.method2606(var14, var15 * var14.vmethod2850() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field1451[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field1452[var7] = var10;
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
				PcmStream var16 = this.field1451[var6];
				PcmStream[] var17 = this.field1451;
				this.field1452[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field1450 < 0) {
			this.field1450 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = Nameable.currentTimeMillis();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(Lde;II)V",
		garbageValue = "750775441"
	)
	final void method2606(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field1452[var3];
		if (var4 == null) {
			this.field1451[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field1452[var3] = var1;
		var1.field1520 = var2;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-1294994184"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(Lje;I)Z",
		garbageValue = "-1268197096"
	)
	static boolean method2598(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = ScriptEvent.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}
}
