import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class448 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("b")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1473504645
	)
	int field300;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -2802413428054542971L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 61027143
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1492111259
	)
	int field303;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -600741535
	)
	int field304;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -8410672408092661703L
	)
	long field305;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1648747053
	)
	int field306;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2111705421
	)
	int field307;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1486182231
	)
	int field308;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -335238723578473881L
	)
	long field297;
	@ObfuscatedName("v")
	boolean field299;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 954407483
	)
	int field311;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lay;"
	)
	PcmStream[] field312;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lay;"
	)
	PcmStream[] field313;

	protected PcmPlayer() {
		this.field300 = 32;
		this.timeMs = UserComparator8.method2748();
		this.field305 = 0L; // L: 27
		this.field306 = 0; // L: 28
		this.field307 = 0; // L: 29
		this.field308 = 0; // L: 30
		this.field297 = 0L; // L: 31
		this.field299 = true; // L: 32
		this.field311 = 0; // L: 38
		this.field312 = new PcmStream[8]; // L: 39
		this.field313 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1886684155"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 284

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-13"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 285

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1692273069"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 288
	}

	@ObfuscatedName("x")
	@Export("write")
	protected void write() throws Exception {
	} // L: 291

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1178676683"
	)
	@Export("close")
	protected void close() {
	} // L: 292

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 293

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lay;I)V",
		garbageValue = "-101862616"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 83
	} // L: 84

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1278116824"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 87
			long var1 = UserComparator8.method2748(); // L: 88

			try {
				if (this.field305 != 0L) { // L: 90
					if (var1 < this.field305) { // L: 91
						return;
					}

					this.open(this.capacity); // L: 92
					this.field305 = 0L; // L: 93
					this.field299 = true; // L: 94
				}

				int var3 = this.position(); // L: 96
				if (this.field308 - var3 > this.field306) { // L: 97
					this.field306 = this.field308 - var3;
				}

				int var4 = this.field304 + this.field303; // L: 98
				if (var4 + 256 > 16384) { // L: 99
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 100
					this.capacity += 1024; // L: 101
					if (this.capacity > 16384) { // L: 102
						this.capacity = 16384;
					}

					this.close(); // L: 103
					this.open(this.capacity); // L: 104
					var3 = 0; // L: 105
					this.field299 = true; // L: 106
					if (var4 + 256 > this.capacity) { // L: 107
						var4 = this.capacity - 256; // L: 108
						this.field304 = var4 - this.field303; // L: 109
					}
				}

				while (var3 < var4) { // L: 112
					this.fill(this.samples, 256); // L: 113
					this.write(); // L: 114
					var3 += 256; // L: 115
				}

				if (var1 > this.field297) { // L: 117
					if (!this.field299) { // L: 118
						if (this.field306 == 0 && this.field307 == 0) { // L: 119
							this.close(); // L: 120
							this.field305 = 2000L + var1; // L: 121
							return; // L: 122
						}

						this.field304 = Math.min(this.field307, this.field306); // L: 124
						this.field307 = this.field306; // L: 125
					} else {
						this.field299 = false; // L: 127
					}

					this.field306 = 0; // L: 128
					this.field297 = 2000L + var1; // L: 129
				}

				this.field308 = var3; // L: 131
			} catch (Exception var7) { // L: 133
				this.close(); // L: 134
				this.field305 = 2000L + var1; // L: 135
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 138
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) { // L: 139
					this.skip(256); // L: 140
					this.timeMs += (long)(256000 / SoundCache.field337); // L: 141
				}
			} catch (Exception var6) { // L: 144
				this.timeMs = var1; // L: 145
			}

		}
	} // L: 147

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2050982607"
	)
	public final void method808() {
		this.field299 = true; // L: 150
	} // L: 151

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1570480130"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field299 = true; // L: 154

		try {
			this.discard(); // L: 156
		} catch (Exception var2) { // L: 158
			this.close(); // L: 159
			this.field305 = UserComparator8.method2748() + 2000L; // L: 160
		}

	} // L: 162

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "776117996"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 165
			boolean var1 = true; // L: 166

			for (int var2 = 0; var2 < 2; ++var2) { // L: 167
				if (this == soundSystem.players[var2]) { // L: 168
					soundSystem.players[var2] = null;
				}

				if (soundSystem.players[var2] != null) { // L: 169
					var1 = false;
				}
			}

			if (var1) { // L: 171
				class354.soundSystemExecutor.shutdownNow(); // L: 172
				class354.soundSystemExecutor = null; // L: 173
				soundSystem = null; // L: 174
			}
		}

		this.close(); // L: 177
		this.samples = null; // L: 178
	} // L: 179

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "84"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field311 -= var1; // L: 182
		if (this.field311 < 0) {
			this.field311 = 0; // L: 183
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 184
		}

	} // L: 185

	@ObfuscatedName("ac")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 189
		if (class157.PcmPlayer_stereo) { // L: 190
			var3 = var2 << 1;
		}

		class370.clearIntArray(var1, 0, var3); // L: 191
		this.field311 -= var2; // L: 192
		if (this.stream != null && this.field311 <= 0) { // L: 193
			this.field311 += SoundCache.field337 >> 4; // L: 194
			SecureRandomFuture.PcmStream_disable(this.stream); // L: 195
			this.method832(this.stream, this.stream.vmethod1019()); // L: 196
			int var4 = 0; // L: 197
			int var5 = 255; // L: 198

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) { // L: 199
				int var7;
				int var8;
				if (var6 < 0) { // L: 202
					var7 = var6 & 3; // L: 203
					var8 = -(var6 >> 2); // L: 204
				} else {
					var7 = var6; // L: 207
					var8 = 0; // L: 208
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 210 212
					if ((var9 & 1) != 0) { // L: 215
						var5 &= ~(1 << var7); // L: 218
						var10 = null; // L: 219
						PcmStream var11 = this.field312[var7]; // L: 220

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 221
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 222
								if (var12 != null && var12.position > var8) { // L: 223
									var5 |= 1 << var7; // L: 224
									var10 = var11; // L: 225
									var11 = var11.after; // L: 226
								} else {
									var11.active = true; // L: 229
									int var13 = var11.vmethod5648(); // L: 230
									var4 += var13; // L: 231
									if (var12 != null) { // L: 232
										var12.position += var13;
									}

									if (var4 >= this.field300) { // L: 233
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 234
									if (var14 != null) { // L: 235
										for (int var15 = var11.field364; var14 != null; var14 = var11.nextSubStream()) { // L: 236 237
											this.method832(var14, var15 * var14.vmethod1019() >> 8);
										}
									}

									PcmStream var18 = var11.after; // L: 242
									var11.after = null;
									if (var10 == null) {
										this.field312[var7] = var18;
									} else {
										var10.after = var18; // L: 245
									}

									if (var18 == null) { // L: 246
										this.field313[var7] = var10;
									}

									var11 = var18; // L: 247
								}
							}
						}
					}

					var7 += 4; // L: 211
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 251
				PcmStream var16 = this.field312[var6]; // L: 252
				PcmStream[] var17 = this.field312; // L: 253
				this.field313[var6] = null; // L: 255

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 256 257 260
					var10 = var16.after; // L: 258
					var16.after = null; // L: 259
				}
			}
		}

		if (this.field311 < 0) { // L: 264
			this.field311 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 265
		}

		this.timeMs = UserComparator8.method2748(); // L: 266
	} // L: 267

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lay;II)V",
		garbageValue = "2139894290"
	)
	final void method832(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 276
		PcmStream var4 = this.field313[var3]; // L: 277
		if (var4 == null) { // L: 278
			this.field312[var3] = var1;
		} else {
			var4.after = var1; // L: 279
		}

		this.field313[var3] = var1; // L: 280
		var1.field364 = var2; // L: 281
	} // L: 282

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lqp;",
		garbageValue = "57607815"
	)
	public static class456 method842(int var0) {
		class456 var1 = (class456)class456.DBTableType_cache.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = class456.field4841.takeFile(39, var0); // L: 21
			var1 = new class456(); // L: 22
			if (var2 != null) { // L: 23
				var1.method8282(new Buffer(var2));
			}

			var1.method8284(); // L: 24
			class456.DBTableType_cache.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2130903475"
	)
	static void method830() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 238
			if (BufferedSink.clientPreferences.method2397() != null) { // L: 239
				Login.Login_username = BufferedSink.clientPreferences.method2397(); // L: 240
				Client.Login_isUsernameRemembered = true; // L: 241
			} else {
				Client.Login_isUsernameRemembered = false; // L: 243
			}

		}
	} // L: 244

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	static int method829() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1630
			int var0 = 0; // L: 1631

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1632
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1633
			}

			return var0 * 10000 / Client.field588; // L: 1635
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-2685"
	)
	static void method841(int var0) {
		Client.oculusOrbState = var0; // L: 12747
	} // L: 12748
}
