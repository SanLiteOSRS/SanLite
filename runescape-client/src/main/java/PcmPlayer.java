import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1464280883
	)
	public static int field292;
	@ObfuscatedName("aq")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("ay")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1741324525
	)
	int field289;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -4925716031019377997L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -674134555
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -229392335
	)
	int field285;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 456413397
	)
	int field293;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 8082179839914669633L
	)
	long field294;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1554044513
	)
	int field295;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -575095721
	)
	int field296;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1634791103
	)
	int field297;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -5523156607669087437L
	)
	long field298;
	@ObfuscatedName("ad")
	boolean field287;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1227535865
	)
	int field300;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	PcmStream[] field301;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	PcmStream[] field299;

	protected PcmPlayer() {
		this.field289 = 32; // L: 22
		this.timeMs = WorldMapSection2.method4844(); // L: 23
		this.field294 = 0L; // L: 27
		this.field295 = 0; // L: 28
		this.field296 = 0; // L: 29
		this.field297 = 0; // L: 30
		this.field298 = 0L; // L: 31
		this.field287 = true; // L: 32
		this.field300 = 0; // L: 38
		this.field301 = new PcmStream[8]; // L: 39
		this.field299 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2134180158"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 280

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 281

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "84"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 284
	}

	@ObfuscatedName("ab")
	@Export("write")
	protected void write() throws Exception {
	} // L: 287

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("close")
	protected void close() {
	} // L: 288

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5904"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 289

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lbj;I)V",
		garbageValue = "1750133787"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 79
	} // L: 80

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1624173078"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 83
			long var1 = WorldMapSection2.method4844(); // L: 84

			try {
				if (this.field294 != 0L) { // L: 86
					if (var1 < this.field294) { // L: 87
						return;
					}

					this.open(this.capacity); // L: 88
					this.field294 = 0L; // L: 89
					this.field287 = true; // L: 90
				}

				int var3 = this.position(); // L: 92
				if (this.field297 - var3 > this.field295) { // L: 93
					this.field295 = this.field297 - var3;
				}

				int var4 = this.field285 + this.field293; // L: 94
				if (var4 + 256 > 16384) { // L: 95
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 96
					this.capacity += 1024; // L: 97
					if (this.capacity > 16384) { // L: 98
						this.capacity = 16384;
					}

					this.close(); // L: 99
					this.open(this.capacity); // L: 100
					var3 = 0; // L: 101
					this.field287 = true; // L: 102
					if (var4 + 256 > this.capacity) { // L: 103
						var4 = this.capacity - 256; // L: 104
						this.field293 = var4 - this.field285; // L: 105
					}
				}

				while (var3 < var4) { // L: 108
					this.fill(this.samples, 256); // L: 109
					this.write(); // L: 110
					var3 += 256; // L: 111
				}

				if (var1 > this.field298) { // L: 113
					if (!this.field287) { // L: 114
						if (this.field295 == 0 && this.field296 == 0) { // L: 115
							this.close(); // L: 116
							this.field294 = var1 + 2000L; // L: 117
							return; // L: 118
						}

						this.field293 = Math.min(this.field296, this.field295); // L: 120
						this.field296 = this.field295; // L: 121
					} else {
						this.field287 = false; // L: 123
					}

					this.field295 = 0; // L: 124
					this.field298 = var1 + 2000L; // L: 125
				}

				this.field297 = var3; // L: 127
			} catch (Exception var7) { // L: 129
				this.close(); // L: 130
				this.field294 = var1 + 2000L; // L: 131
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 134
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) { // L: 135
					this.skip(256); // L: 136
					this.timeMs += (long)(256000 / field292); // L: 137
				}
			} catch (Exception var6) { // L: 140
				this.timeMs = var1; // L: 141
			}

		}
	} // L: 143

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1765565781"
	)
	public final void method817() {
		this.field287 = true; // L: 146
	} // L: 147

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field287 = true; // L: 150

		try {
			this.discard(); // L: 152
		} catch (Exception var2) { // L: 154
			this.close(); // L: 155
			this.field294 = WorldMapSection2.method4844() + 2000L; // L: 156
		}

	} // L: 158

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1555106489"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class291.soundSystem != null) { // L: 161
			boolean var1 = true; // L: 162

			for (int var2 = 0; var2 < 2; ++var2) { // L: 163
				if (this == class291.soundSystem.players[var2]) { // L: 164
					class291.soundSystem.players[var2] = null;
				}

				if (class291.soundSystem.players[var2] != null) { // L: 165
					var1 = false;
				}
			}

			if (var1) { // L: 167
				soundSystemExecutor.shutdownNow(); // L: 168
				soundSystemExecutor = null; // L: 169
				class291.soundSystem = null; // L: 170
			}
		}

		this.close(); // L: 173
		this.samples = null; // L: 174
	} // L: 175

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2131967863"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field300 -= var1; // L: 178
		if (this.field300 < 0) {
			this.field300 = 0; // L: 179
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 180
		}

	} // L: 181

	@ObfuscatedName("bk")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 185
		if (ChatChannel.PcmPlayer_stereo) { // L: 186
			var3 = var2 << 1;
		}

		class380.clearIntArray(var1, 0, var3); // L: 187
		this.field300 -= var2; // L: 188
		if (this.stream != null && this.field300 <= 0) { // L: 189
			this.field300 += field292 >> 4; // L: 190
			AbstractWorldMapIcon.PcmStream_disable(this.stream); // L: 191
			this.method769(this.stream, this.stream.vmethod1024()); // L: 192
			int var4 = 0; // L: 193
			int var5 = 255; // L: 194

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) { // L: 195
				int var7;
				int var8;
				if (var6 < 0) { // L: 198
					var7 = var6 & 3; // L: 199
					var8 = -(var6 >> 2); // L: 200
				} else {
					var7 = var6; // L: 203
					var8 = 0; // L: 204
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 206 208
					if ((var9 & 1) != 0) { // L: 211
						var5 &= ~(1 << var7); // L: 214
						var10 = null; // L: 215
						PcmStream var11 = this.field301[var7]; // L: 216

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 217
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 218
								if (var12 != null && var12.position > var8) { // L: 219
									var5 |= 1 << var7; // L: 220
									var10 = var11; // L: 221
									var11 = var11.after; // L: 222
								} else {
									var11.active = true; // L: 225
									int var13 = var11.vmethod5700(); // L: 226
									var4 += var13; // L: 227
									if (var12 != null) {
										var12.position += var13; // L: 228
									}

									if (var4 >= this.field289) { // L: 229
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 230
									if (var14 != null) { // L: 231
										for (int var15 = var11.field349; var14 != null; var14 = var11.nextSubStream()) { // L: 232 233 235
											this.method769(var14, var15 * var14.vmethod1024() >> 8); // L: 234
										}
									}

									PcmStream var18 = var11.after; // L: 238
									var11.after = null; // L: 239
									if (var10 == null) { // L: 240
										this.field301[var7] = var18;
									} else {
										var10.after = var18; // L: 241
									}

									if (var18 == null) { // L: 242
										this.field299[var7] = var10;
									}

									var11 = var18; // L: 243
								}
							}
						}
					}

					var7 += 4; // L: 207
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 247
				PcmStream var16 = this.field301[var6]; // L: 248
				PcmStream[] var17 = this.field301; // L: 249
				this.field299[var6] = null; // L: 251

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 252 253 256
					var10 = var16.after; // L: 254
					var16.after = null; // L: 255
				}
			}
		}

		if (this.field300 < 0) { // L: 260
			this.field300 = 0;
		}

		if (this.stream != null) { // L: 261
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = WorldMapSection2.method4844(); // L: 262
	} // L: 263

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lbj;II)V",
		garbageValue = "-1707696429"
	)
	final void method769(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 272
		PcmStream var4 = this.field299[var3]; // L: 273
		if (var4 == null) { // L: 274
			this.field301[var3] = var1;
		} else {
			var4.after = var1; // L: 275
		}

		this.field299[var3] = var1; // L: 276
		var1.field349 = var2; // L: 277
	} // L: 278

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lmy;IIZI)V",
		garbageValue = "1659869209"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 10572
		int var5 = var0.height; // L: 10573
		if (var0.widthAlignment == 0) { // L: 10574
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 10575
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 10576
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 10577
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 10578
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14; // L: 10579
		}

		if (var0.widthAlignment == 4) { // L: 10580
			var0.width = var0.field3667 * var0.height / var0.field3578;
		}

		if (var0.heightAlignment == 4) { // L: 10581
			var0.height = var0.width * var0.field3578 / var0.field3667;
		}

		if (var0.contentType == 1337) { // L: 10582
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 10583
			var0.method6118().method5822(var0.width, var0.height); // L: 10584
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 10586
			ScriptEvent var6 = new ScriptEvent(); // L: 10587
			var6.widget = var0; // L: 10588
			var6.args = var0.onResize; // L: 10589
			Client.scriptEvents.addFirst(var6); // L: 10590
		}

	} // L: 10592
}
