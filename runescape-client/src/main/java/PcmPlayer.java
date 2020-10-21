import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1149689047
	)
	public static int field1447;
	@ObfuscatedName("o")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("w")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		longValue = 2634650448797948467L
	)
	static long field1430;
	@ObfuscatedName("a")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Ldc;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1444527341
	)
	int field1435;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -2930435928401446917L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -149687327
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1461747439
	)
	int field1438;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 813792905
	)
	int field1451;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = -2022966020506386053L
	)
	long field1440;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1855020445
	)
	int field1446;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1127622439
	)
	int field1442;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1705628685
	)
	int field1443;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 4977190421454866475L
	)
	long field1444;
	@ObfuscatedName("e")
	boolean field1445;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -83389805
	)
	int field1441;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "[Ldc;"
	)
	PcmStream[] field1448;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "[Ldc;"
	)
	PcmStream[] field1449;

	protected PcmPlayer() {
		this.field1435 = 32;
		this.timeMs = PacketWriter.currentTimeMillis();
		this.field1440 = 0L;
		this.field1446 = 0;
		this.field1442 = 0;
		this.field1443 = 0;
		this.field1444 = 0L;
		this.field1445 = true;
		this.field1441 = 0;
		this.field1448 = new PcmStream[8];
		this.field1449 = new PcmStream[8];
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-841767260"
	)
	@Export("init")
	protected void init() throws Exception {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-120"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "106"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity;
	}

	@ObfuscatedName("t")
	@Export("write")
	protected void write() throws Exception {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "667465439"
	)
	@Export("close")
	protected void close() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2027971398"
	)
	@Export("discard")
	protected void discard() throws Exception {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Ldc;I)V",
		garbageValue = "35825022"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1677504744"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) {
			long var1 = PacketWriter.currentTimeMillis();

			try {
				if (this.field1440 != 0L) {
					if (var1 < this.field1440) {
						return;
					}

					this.open(this.capacity);
					this.field1440 = 0L;
					this.field1445 = true;
				}

				int var3 = this.position();
				if (this.field1443 - var3 > this.field1446) {
					this.field1446 = this.field1443 - var3;
				}

				int var4 = this.field1451 + this.field1438;
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
					this.field1445 = true;
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256;
						this.field1451 = var4 - this.field1438;
					}
				}

				while (var3 < var4) {
					this.fill(this.samples, 256);
					this.write();
					var3 += 256;
				}

				if (var1 > this.field1444) {
					if (!this.field1445) {
						if (this.field1446 == 0 && this.field1442 == 0) {
							this.close();
							this.field1440 = 2000L + var1;
							return;
						}

						this.field1451 = Math.min(this.field1442, this.field1446);
						this.field1442 = this.field1446;
					} else {
						this.field1445 = false;
					}

					this.field1446 = 0;
					this.field1444 = 2000L + var1;
				}

				this.field1443 = var3;
			} catch (Exception var7) {
				this.close();
				this.field1440 = var1 + 2000L;
			}

			try {
				if (var1 > this.timeMs + 500000L) {
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) {
					this.skip(256);
					this.timeMs += (long)(256000 / field1447);
				}
			} catch (Exception var6) {
				this.timeMs = var1;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2142907235"
	)
	public final void method2517() {
		this.field1445 = true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "30633041"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field1445 = true;

		try {
			this.discard();
		} catch (Exception var2) {
			this.close();
			this.field1440 = PacketWriter.currentTimeMillis() + 2000L;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2048322330"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class1.soundSystem != null) {
			boolean var1 = true;

			for (int var2 = 0; var2 < 2; ++var2) {
				if (this == class1.soundSystem.players[var2]) {
					class1.soundSystem.players[var2] = null;
				}

				if (class1.soundSystem.players[var2] != null) {
					var1 = false;
				}
			}

			if (var1) {
				soundSystemExecutor.shutdownNow();
				soundSystemExecutor = null;
				class1.soundSystem = null;
			}
		}

		this.close();
		this.samples = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "2014217671"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field1441 -= var1;
		if (this.field1441 < 0) {
			this.field1441 = 0;
		}

		if (this.stream != null) {
			this.stream.skip(var1);
		}

	}

	@ObfuscatedName("au")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2;
		if (PcmPlayer_stereo) {
			var3 = var2 << 1;
		}

		class310.clearIntArray(var1, 0, var3);
		this.field1441 -= var2;
		if (this.stream != null && this.field1441 <= 0) {
			this.field1441 += field1447 >> 4;
			PacketBufferNode.PcmStream_disable(this.stream);
			this.method2522(this.stream, this.stream.vmethod2837());
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
						PcmStream var11 = this.field1448[var7];

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
									int var13 = var11.vmethod3987();
									var4 += var13;
									if (var12 != null) {
										var12.position += var13;
									}

									if (var4 >= this.field1435) {
										break label104;
									}

									PcmStream var14 = var11.firstSubStream();
									if (var14 != null) {
										for (int var15 = var11.field1519; var14 != null; var14 = var11.nextSubStream()) {
											this.method2522(var14, var15 * var14.vmethod2837() >> 8);
										}
									}

									PcmStream var18 = var11.after;
									var11.after = null;
									if (var10 == null) {
										this.field1448[var7] = var18;
									} else {
										var10.after = var18;
									}

									if (var18 == null) {
										this.field1449[var7] = var10;
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
				PcmStream var16 = this.field1448[var6];
				PcmStream[] var17 = this.field1448;
				this.field1449[var6] = null;

				for (var17[var6] = null; var16 != null; var16 = var10) {
					var10 = var16.after;
					var16.after = null;
				}
			}
		}

		if (this.field1441 < 0) {
			this.field1441 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = PacketWriter.currentTimeMillis();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(Ldc;II)V",
		garbageValue = "-1443703786"
	)
	final void method2522(PcmStream var1, int var2) {
		int var3 = var2 >> 5;
		PcmStream var4 = this.field1449[var3];
		if (var4 == null) {
			this.field1448[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field1449[var3] = var1;
		var1.field1519 = var2;
	}
}
