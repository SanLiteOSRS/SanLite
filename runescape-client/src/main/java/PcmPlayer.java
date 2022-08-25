import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("q")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("k")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -89074195
	)
	public static int field279;
	@ObfuscatedName("m")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("u")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1437568663
	)
	int field281;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 8741985463652068785L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 895919135
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 578376697
	)
	int field300;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -363737623
	)
	int field286;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 7995751903745327077L
	)
	long field287;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 77946161
	)
	int field288;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1883029617
	)
	int field293;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -527189205
	)
	int field290;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 3890268651486961207L
	)
	long field291;
	@ObfuscatedName("g")
	boolean field292;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1250489603
	)
	int field277;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lah;"
	)
	PcmStream[] field295;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lah;"
	)
	PcmStream[] field302;

	protected PcmPlayer() {
		this.field281 = 32;
		this.timeMs = class181.method3483();
		this.field287 = 0L;
		this.field288 = 0;
		this.field293 = 0;
		this.field290 = 0;
		this.field291 = 0L;
		this.field292 = true;
		this.field277 = 0;
		this.field295 = new PcmStream[8];
		this.field302 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2068921690"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 277

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "6"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 278

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-91"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 281
	}

	@ObfuscatedName("v")
	@Export("write")
	protected void write() throws Exception {
	} // L: 284

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-68"
	)
	@Export("close")
	protected void close() {
	} // L: 285

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-829256546"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 286

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lah;B)V",
		garbageValue = "-115"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 76
	} // L: 77

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1234729688"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 80
			long var1 = class181.method3483(); // L: 81

			try {
				if (0L != this.field287) { // L: 83
					if (var1 < this.field287) { // L: 84
						return;
					}

					this.open(this.capacity); // L: 85
					this.field287 = 0L; // L: 86
					this.field292 = true; // L: 87
				}

				int var3 = this.position(); // L: 89
				if (this.field290 - var3 > this.field288) { // L: 90
					this.field288 = this.field290 - var3;
				}

				int var4 = this.field286 + this.field300; // L: 91
				if (var4 + 256 > 16384) { // L: 92
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 93
					this.capacity += 1024; // L: 94
					if (this.capacity > 16384) { // L: 95
						this.capacity = 16384;
					}

					this.close(); // L: 96
					this.open(this.capacity); // L: 97
					var3 = 0; // L: 98
					this.field292 = true; // L: 99
					if (var4 + 256 > this.capacity) { // L: 100
						var4 = this.capacity - 256; // L: 101
						this.field286 = var4 - this.field300; // L: 102
					}
				}

				while (var3 < var4) { // L: 105
					this.fill(this.samples, 256); // L: 106
					this.write(); // L: 107
					var3 += 256; // L: 108
				}

				if (var1 > this.field291) { // L: 110
					if (!this.field292) { // L: 111
						if (this.field288 == 0 && this.field293 == 0) { // L: 112
							this.close(); // L: 113
							this.field287 = 2000L + var1; // L: 114
							return; // L: 115
						}

						this.field286 = Math.min(this.field293, this.field288); // L: 117
						this.field293 = this.field288; // L: 118
					} else {
						this.field292 = false; // L: 120
					}

					this.field288 = 0; // L: 121
					this.field291 = 2000L + var1; // L: 122
				}

				this.field290 = var3; // L: 124
			} catch (Exception var7) { // L: 126
				this.close(); // L: 127
				this.field287 = var1 + 2000L; // L: 128
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 131
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 132
					this.skip(256); // L: 133
					this.timeMs += (long)(256000 / (class344.field4152 * -449918071)); // L: 134
				}
			} catch (Exception var6) { // L: 137
				this.timeMs = var1; // L: 138
			}

		}
	} // L: 140

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	public final void method669() {
		this.field292 = true; // L: 143
	} // L: 144

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2017665651"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field292 = true; // L: 147

		try {
			this.discard(); // L: 149
		} catch (Exception var2) { // L: 151
			this.close(); // L: 152
			this.field287 = class181.method3483() + 2000L; // L: 153
		}

	} // L: 155

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-121473973"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (TaskHandler.soundSystem != null) { // L: 158
			boolean var1 = true; // L: 159

			for (int var2 = 0; var2 < 2; ++var2) { // L: 160
				if (this == TaskHandler.soundSystem.players[var2]) { // L: 161
					TaskHandler.soundSystem.players[var2] = null;
				}

				if (TaskHandler.soundSystem.players[var2] != null) { // L: 162
					var1 = false;
				}
			}

			if (var1) { // L: 164
				soundSystemExecutor.shutdownNow(); // L: 165
				soundSystemExecutor = null; // L: 166
				TaskHandler.soundSystem = null; // L: 167
			}
		}

		this.close(); // L: 170
		this.samples = null; // L: 171
	} // L: 172

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1430293749"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field277 -= var1; // L: 175
		if (this.field277 < 0) {
			this.field277 = 0; // L: 176
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 177
		}

	} // L: 178

	@ObfuscatedName("ax")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 182
		if (PcmPlayer_stereo) { // L: 183
			var3 = var2 << 1;
		}

		class351.clearIntArray(var1, 0, var3); // L: 184
		this.field277 -= var2; // L: 185
		if (this.stream != null && this.field277 <= 0) { // L: 186
			this.field277 += class344.field4152 * -449918071 >> 4; // L: 187
			class146.PcmStream_disable(this.stream); // L: 188
			this.method674(this.stream, this.stream.vmethod920()); // L: 189
			int var4 = 0; // L: 190
			int var5 = 255; // L: 191

			int var6;
			PcmStream var10;
			label107:
			for (var6 = 7; var5 != 0; --var6) { // L: 192
				int var7;
				int var8;
				if (var6 < 0) { // L: 195
					var7 = var6 & 3; // L: 196
					var8 = -(var6 >> 2); // L: 197
				} else {
					var7 = var6; // L: 200
					var8 = 0; // L: 201
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 203 205
					if ((var9 & 1) != 0) { // L: 208
						var5 &= ~(1 << var7); // L: 211
						var10 = null; // L: 212
						PcmStream var11 = this.field295[var7]; // L: 213

						label101:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 214
									break label101;
								}

								AbstractSound var12 = var11.sound; // L: 215
								if (var12 != null && var12.position > var8) { // L: 216
									var5 |= 1 << var7; // L: 217
									var10 = var11; // L: 218
									var11 = var11.after; // L: 219
								} else {
									var11.active = true; // L: 222
									int var13 = var11.vmethod5396(); // L: 223
									var4 += var13; // L: 224
									if (var12 != null) { // L: 225
										var12.position += var13;
									}

									if (var4 >= this.field281) { // L: 226
										break label107;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 227
									if (var14 != null) { // L: 228
										for (int var15 = var11.field348; var14 != null; var14 = var11.nextSubStream()) { // L: 229 230 232
											this.method674(var14, var15 * var14.vmethod920() >> 8); // L: 231
										}
									}

									PcmStream var18 = var11.after; // L: 235
									var11.after = null; // L: 236
									if (var10 == null) { // L: 237
										this.field295[var7] = var18;
									} else {
										var10.after = var18; // L: 238
									}

									if (var18 == null) { // L: 239
										this.field302[var7] = var10;
									}

									var11 = var18; // L: 240
								}
							}
						}
					}

					var7 += 4; // L: 204
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 244
				PcmStream var16 = this.field295[var6]; // L: 245
				PcmStream[] var17 = this.field295; // L: 246
				this.field302[var6] = null; // L: 248

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 249 250 253
					var10 = var16.after; // L: 251
					var16.after = null; // L: 252
				}
			}
		}

		if (this.field277 < 0) { // L: 257
			this.field277 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 258
		}

		this.timeMs = class181.method3483(); // L: 259
	} // L: 260

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lah;II)V",
		garbageValue = "-1247840564"
	)
	final void method674(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 269
		PcmStream var4 = this.field302[var3]; // L: 270
		if (var4 == null) { // L: 271
			this.field295[var3] = var1;
		} else {
			var4.after = var1; // L: 272
		}

		this.field302[var3] = var1; // L: 273
		var1.field348 = var2; // L: 274
	} // L: 275

	@ObfuscatedName("s")
	public static final int method666(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var2 + var4 - var2 * var4; // L: 15
			}

			double var14 = 2.0D * var4 - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = var16 * 6.0D * (var12 - var14) + var14;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) { // L: 24
				var6 = (0.6666666666666666D - var16) * (var12 - var14) * 6.0D + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = 6.0D * (var12 - var14) * var0 + var14;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14); // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = var20 * 6.0D * (var12 - var14) + var14;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) { // L: 32
				var10 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var20);
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "400465000"
	)
	static void method689() {
		int var0 = Players.Players_count; // L: 4822
		int[] var1 = Players.Players_indices; // L: 4823

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4824
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 4825
				class9.addPlayerToScene(Client.players[var1[var2]], true); // L: 4826
			}
		}

	} // L: 4828

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1869318837"
	)
	static boolean method723() {
		return (Client.drawPlayerNames & 1) != 0; // L: 4959
	}
}
