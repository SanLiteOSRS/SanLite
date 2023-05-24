import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1359271235
	)
	public static int field306;
	@ObfuscatedName("ab")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	@Export("pcmPlayerProvider")
	public static class50 pcmPlayerProvider;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static Archive field316;
	@ObfuscatedName("ai")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1670800945
	)
	int field302;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 5466236213624304261L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -896831859
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1331788289
	)
	int field305;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 335978257
	)
	int field297;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -269385131777873879L
	)
	long field307;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1667971679
	)
	int field308;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1982890287
	)
	int field296;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1187659381
	)
	int field310;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 7119359816026141145L
	)
	long field309;
	@ObfuscatedName("ap")
	boolean field312;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -951195189
	)
	int field314;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Lbp;"
	)
	PcmStream[] field304;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[Lbp;"
	)
	PcmStream[] field315;

	protected PcmPlayer() {
		this.field302 = 32; // L: 22
		this.timeMs = class96.method2634(); // L: 23
		this.field307 = 0L; // L: 27
		this.field308 = 0; // L: 28
		this.field296 = 0; // L: 29
		this.field310 = 0; // L: 30
		this.field309 = 0L; // L: 31
		this.field312 = true; // L: 32
		this.field314 = 0; // L: 38
		this.field304 = new PcmStream[8]; // L: 39
		this.field315 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 273

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "182405776"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 274

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-654786411"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 277
	}

	@ObfuscatedName("ac")
	@Export("write")
	protected void write() throws Exception {
	} // L: 280

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1466449702"
	)
	@Export("close")
	protected void close() {
	} // L: 281

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 282

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbp;I)V",
		garbageValue = "-412033085"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 72
	} // L: 73

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "336870901"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 76
			long var1 = class96.method2634(); // L: 77

			try {
				if (0L != this.field307) { // L: 79
					if (var1 < this.field307) { // L: 80
						return;
					}

					this.open(this.capacity); // L: 81
					this.field307 = 0L; // L: 82
					this.field312 = true; // L: 83
				}

				int var3 = this.position(); // L: 85
				if (this.field310 - var3 > this.field308) { // L: 86
					this.field308 = this.field310 - var3;
				}

				int var4 = this.field297 + this.field305; // L: 87
				if (var4 + 256 > 16384) { // L: 88
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 89
					this.capacity += 1024; // L: 90
					if (this.capacity > 16384) { // L: 91
						this.capacity = 16384;
					}

					this.close(); // L: 92
					this.open(this.capacity); // L: 93
					var3 = 0; // L: 94
					this.field312 = true; // L: 95
					if (var4 + 256 > this.capacity) { // L: 96
						var4 = this.capacity - 256; // L: 97
						this.field297 = var4 - this.field305; // L: 98
					}
				}

				while (var3 < var4) { // L: 101
					this.fill(this.samples, 256); // L: 102
					this.write(); // L: 103
					var3 += 256; // L: 104
				}

				if (var1 > this.field309) { // L: 106
					if (!this.field312) { // L: 107
						if (this.field308 == 0 && this.field296 == 0) { // L: 108
							this.close(); // L: 109
							this.field307 = 2000L + var1; // L: 110
							return; // L: 111
						}

						this.field297 = Math.min(this.field296, this.field308); // L: 113
						this.field296 = this.field308; // L: 114
					} else {
						this.field312 = false; // L: 116
					}

					this.field308 = 0; // L: 117
					this.field309 = var1 + 2000L; // L: 118
				}

				this.field310 = var3; // L: 120
			} catch (Exception var7) { // L: 122
				this.close(); // L: 123
				this.field307 = var1 + 2000L; // L: 124
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 127
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 128
					this.skip(256); // L: 129
					this.timeMs += (long)(256000 / (field306 * 586337296)); // L: 130
				}
			} catch (Exception var6) { // L: 133
				this.timeMs = var1; // L: 134
			}

		}
	} // L: 136

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1976746918"
	)
	public final void method814() {
		this.field312 = true; // L: 139
	} // L: 140

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1703203933"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field312 = true; // L: 143

		try {
			this.discard(); // L: 145
		} catch (Exception var2) { // L: 147
			this.close(); // L: 148
			this.field307 = class96.method2634() + 2000L; // L: 149
		}

	} // L: 151

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class354.soundSystem != null) { // L: 154
			boolean var1 = true; // L: 155

			for (int var2 = 0; var2 < 2; ++var2) { // L: 156
				if (this == class354.soundSystem.players[var2]) { // L: 157
					class354.soundSystem.players[var2] = null;
				}

				if (class354.soundSystem.players[var2] != null) { // L: 158
					var1 = false;
				}
			}

			if (var1) { // L: 160
				SoundSystem.soundSystemExecutor.shutdownNow(); // L: 161
				SoundSystem.soundSystemExecutor = null; // L: 162
				class354.soundSystem = null; // L: 163
			}
		}

		this.close(); // L: 166
		this.samples = null; // L: 167
	} // L: 168

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1042309166"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field314 -= var1; // L: 171
		if (this.field314 < 0) {
			this.field314 = 0; // L: 172
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 173
		}

	} // L: 174

	@ObfuscatedName("by")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 178
		if (PcmPlayer_stereo) { // L: 179
			var3 = var2 << 1;
		}

		class384.clearIntArray(var1, 0, var3); // L: 180
		this.field314 -= var2; // L: 181
		if (this.stream != null && this.field314 <= 0) { // L: 182
			this.field314 += field306 * 586337296 >> 4; // L: 183
			class207.PcmStream_disable(this.stream); // L: 184
			this.method823(this.stream, this.stream.vmethod1060()); // L: 185
			int var4 = 0; // L: 186
			int var5 = 255; // L: 187

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) { // L: 188
				int var7;
				int var8;
				if (var6 < 0) { // L: 191
					var7 = var6 & 3; // L: 192
					var8 = -(var6 >> 2); // L: 193
				} else {
					var7 = var6; // L: 196
					var8 = 0; // L: 197
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 199 201
					if ((var9 & 1) != 0) { // L: 204
						var5 &= ~(1 << var7); // L: 207
						var10 = null; // L: 208
						PcmStream var11 = this.field304[var7]; // L: 209

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 210
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 211
								if (var12 != null && var12.position > var8) { // L: 212
									var5 |= 1 << var7; // L: 213
									var10 = var11; // L: 214
									var11 = var11.after; // L: 215
								} else {
									var11.active = true; // L: 218
									int var13 = var11.vmethod5949(); // L: 219
									var4 += var13; // L: 220
									if (var12 != null) { // L: 221
										var12.position += var13;
									}

									if (var4 >= this.field302) { // L: 222
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 223
									if (var14 != null) { // L: 224
										for (int var15 = var11.field365; var14 != null; var14 = var11.nextSubStream()) { // L: 225 226 228
											this.method823(var14, var15 * var14.vmethod1060() >> 8); // L: 227
										}
									}

									PcmStream var18 = var11.after; // L: 231
									var11.after = null; // L: 232
									if (var10 == null) { // L: 233
										this.field304[var7] = var18;
									} else {
										var10.after = var18; // L: 234
									}

									if (var18 == null) { // L: 235
										this.field315[var7] = var10;
									}

									var11 = var18; // L: 236
								}
							}
						}
					}

					var7 += 4; // L: 200
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 240
				PcmStream var16 = this.field304[var6]; // L: 241
				PcmStream[] var17 = this.field304; // L: 242
				this.field315[var6] = null; // L: 244

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 245 246 249
					var10 = var16.after; // L: 247
					var16.after = null; // L: 248
				}
			}
		}

		if (this.field314 < 0) { // L: 253
			this.field314 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 254
		}

		this.timeMs = class96.method2634(); // L: 255
	} // L: 256

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lbp;IB)V",
		garbageValue = "-105"
	)
	final void method823(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 265
		PcmStream var4 = this.field315[var3]; // L: 266
		if (var4 == null) { // L: 267
			this.field304[var3] = var1;
		} else {
			var4.after = var1; // L: 268
		}

		this.field315[var3] = var1; // L: 269
		var1.field365 = var2; // L: 270
	} // L: 271

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1817276364"
	)
	static int method845(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 1002
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 1003
		}
	}
}
