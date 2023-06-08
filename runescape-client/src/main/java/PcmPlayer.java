import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -279260471
	)
	public static int field291;
	@ObfuscatedName("ak")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 641714195
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("gf")
	static String field300;
	@ObfuscatedName("ad")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -655130737
	)
	int field278;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 537932703614340537L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -634982835
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2002025533
	)
	int field289;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 570815459
	)
	int field286;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 664762705317999087L
	)
	long field287;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -105357093
	)
	int field288;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1698424343
	)
	int field277;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2135990423
	)
	int field293;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 4057425990654529201L
	)
	long field282;
	@ObfuscatedName("am")
	boolean field292;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 34392533
	)
	int field284;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field294;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field295;

	protected PcmPlayer() {
		this.field278 = 32; // L: 22
		this.timeMs = WallObject.method5027(); // L: 23
		this.field287 = 0L; // L: 27
		this.field288 = 0; // L: 28
		this.field277 = 0; // L: 29
		this.field293 = 0; // L: 30
		this.field282 = 0L; // L: 31
		this.field292 = true; // L: 32
		this.field284 = 0; // L: 38
		this.field294 = new PcmStream[8]; // L: 39
		this.field295 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2056298902"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 284

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "713594557"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 285

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-253109735"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 288
	}

	@ObfuscatedName("as")
	@Export("write")
	protected void write() throws Exception {
	} // L: 291

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1964455949"
	)
	@Export("close")
	protected void close() {
	} // L: 292

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-56642635"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 293

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lby;I)V",
		garbageValue = "-677421630"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 83
	} // L: 84

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "11509345"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 87
			long var1 = WallObject.method5027(); // L: 88

			try {
				if (this.field287 != 0L) { // L: 90
					if (var1 < this.field287) { // L: 91
						return;
					}

					this.open(this.capacity); // L: 92
					this.field287 = 0L; // L: 93
					this.field292 = true; // L: 94
				}

				int var3 = this.position(); // L: 96
				if (this.field293 - var3 > this.field288) { // L: 97
					this.field288 = this.field293 - var3;
				}

				int var4 = this.field289 + this.field286; // L: 98
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
					this.field292 = true; // L: 106
					if (var4 + 256 > this.capacity) { // L: 107
						var4 = this.capacity - 256; // L: 108
						this.field286 = var4 - this.field289; // L: 109
					}
				}

				while (var3 < var4) { // L: 112
					this.fill(this.samples, 256); // L: 113
					this.write(); // L: 114
					var3 += 256; // L: 115
				}

				if (var1 > this.field282) { // L: 117
					if (!this.field292) { // L: 118
						if (this.field288 == 0 && this.field277 == 0) { // L: 119
							this.close(); // L: 120
							this.field287 = 2000L + var1; // L: 121
							return; // L: 122
						}

						this.field286 = Math.min(this.field277, this.field288); // L: 124
						this.field277 = this.field288; // L: 125
					} else {
						this.field292 = false; // L: 127
					}

					this.field288 = 0; // L: 128
					this.field282 = var1 + 2000L; // L: 129
				}

				this.field293 = var3; // L: 131
			} catch (Exception var7) { // L: 133
				this.close(); // L: 134
				this.field287 = 2000L + var1; // L: 135
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 138
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 139
					this.skip(256); // L: 140
					this.timeMs += (long)(256000 / field291); // L: 141
				}
			} catch (Exception var6) { // L: 144
				this.timeMs = var1; // L: 145
			}

		}
	} // L: 147

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "344895616"
	)
	public final void method748() {
		this.field292 = true; // L: 150
	} // L: 151

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "372572905"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field292 = true; // L: 154

		try {
			this.discard(); // L: 156
		} catch (Exception var2) { // L: 158
			this.close(); // L: 159
			this.field287 = WallObject.method5027() + 2000L; // L: 160
		}

	} // L: 162

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2107802305"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class382.soundSystem != null) { // L: 165
			boolean var1 = true; // L: 166

			for (int var2 = 0; var2 < 2; ++var2) { // L: 167
				if (this == class382.soundSystem.players[var2]) { // L: 168
					class382.soundSystem.players[var2] = null;
				}

				if (class382.soundSystem.players[var2] != null) { // L: 169
					var1 = false;
				}
			}

			if (var1) { // L: 171
				soundSystemExecutor.shutdownNow(); // L: 172
				soundSystemExecutor = null; // L: 173
				class382.soundSystem = null; // L: 174
			}
		}

		this.close(); // L: 177
		this.samples = null; // L: 178
	} // L: 179

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1763828606"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field284 -= var1; // L: 182
		if (this.field284 < 0) {
			this.field284 = 0; // L: 183
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 184
		}

	} // L: 185

	@ObfuscatedName("bs")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 189
		if (class347.PcmPlayer_stereo) { // L: 190
			var3 = var2 << 1;
		}

		class397.clearIntArray(var1, 0, var3); // L: 191
		this.field284 -= var2; // L: 192
		if (this.stream != null && this.field284 <= 0) { // L: 193
			this.field284 += field291 >> 4; // L: 194
			InterfaceParent.PcmStream_disable(this.stream); // L: 195
			this.method764(this.stream, this.stream.vmethod1017()); // L: 196
			int var4 = 0; // L: 197
			int var5 = 255; // L: 198

			int var6;
			PcmStream var10;
			label107:
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
						PcmStream var11 = this.field294[var7]; // L: 220

						label101:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 221
									break label101;
								}

								AbstractSound var12 = var11.sound; // L: 222
								if (var12 != null && var12.position > var8) { // L: 223
									var5 |= 1 << var7; // L: 224
									var10 = var11; // L: 225
									var11 = var11.after; // L: 226
								} else {
									var11.active = true; // L: 229
									int var13 = var11.vmethod5920(); // L: 230
									var4 += var13; // L: 231
									if (var12 != null) {
										var12.position += var13; // L: 232
									}

									if (var4 >= this.field278) { // L: 233
										break label107;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 234
									if (var14 != null) { // L: 235
										for (int var15 = var11.field353; var14 != null; var14 = var11.nextSubStream()) { // L: 236 237 239
											this.method764(var14, var15 * var14.vmethod1017() >> 8); // L: 238
										}
									}

									PcmStream var18 = var11.after; // L: 242
									var11.after = null; // L: 243
									if (var10 == null) { // L: 244
										this.field294[var7] = var18;
									} else {
										var10.after = var18; // L: 245
									}

									if (var18 == null) { // L: 246
										this.field295[var7] = var10;
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
				PcmStream var16 = this.field294[var6]; // L: 252
				PcmStream[] var17 = this.field294; // L: 253
				this.field295[var6] = null; // L: 255

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 256 257 260
					var10 = var16.after; // L: 258
					var16.after = null; // L: 259
				}
			}
		}

		if (this.field284 < 0) { // L: 264
			this.field284 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 265
		}

		this.timeMs = WallObject.method5027(); // L: 266
	} // L: 267

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lby;II)V",
		garbageValue = "-666866184"
	)
	final void method764(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 276
		PcmStream var4 = this.field295[var3]; // L: 277
		if (var4 == null) { // L: 278
			this.field294[var3] = var1;
		} else {
			var4.after = var1; // L: 279
		}

		this.field295[var3] = var1; // L: 280
		var1.field353 = var2; // L: 281
	} // L: 282

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ldi;B)V",
		garbageValue = "-39"
	)
	static final void method797(Actor var0) {
		int var2;
		int var3;
		int var4;
		if (var0.targetIndex != -1) { // L: 4313
			Object var1 = null; // L: 4314
			var2 = 65536; // L: 4315
			if (var0.targetIndex < var2) { // L: 4316
				var1 = Client.npcs[var0.targetIndex]; // L: 4317
			} else {
				var1 = Client.players[var0.targetIndex - var2]; // L: 4320
			}

			if (var1 != null) { // L: 4322
				var3 = var0.x - ((Actor)var1).x; // L: 4323
				var4 = var0.y - ((Actor)var1).y; // L: 4324
				if (var3 != 0 || var4 != 0) { // L: 4325
					var0.orientation = class398.method7591(var3, var4); // L: 4326
				}
			} else if (var0.false0) { // L: 4329
				var0.targetIndex = -1; // L: 4330
				var0.false0 = false; // L: 4331
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1225 > 0) { // L: 4334
			var7 = -1; // L: 4335
			if (var0.field1178 != -1 && var0.field1190 != -1) { // L: 4336
				var2 = var0.field1178 * 128 - class213.baseX * 8192 + 64; // L: 4337
				var3 = var0.field1190 * 128 - class101.baseY * 8192 + 64; // L: 4338
				var4 = var0.x - var2; // L: 4339
				int var5 = var0.y - var3; // L: 4340
				if (var4 != 0 || var5 != 0) { // L: 4341
					var7 = class398.method7591(var4, var5); // L: 4342
				}
			} else if (var0.field1228 != -1) { // L: 4345
				var7 = var0.field1228; // L: 4346
			}

			if (var7 != -1) { // L: 4348
				var0.orientation = var7; // L: 4349
				if (var0.field1184) { // L: 4350
					var0.rotation = var0.orientation; // L: 4351
				}
			}

			var0.method2375(); // L: 4354
		}

		var7 = var0.orientation - var0.rotation & 2047; // L: 4356
		if (var7 != 0) { // L: 4357
			boolean var8 = true; // L: 4358
			boolean var9 = true; // L: 4359
			++var0.field1219; // L: 4360
			var4 = var7 > 1024 ? -1 : 1; // L: 4361
			var0.rotation += var0.field1220 * var4; // L: 4362
			boolean var10 = true; // L: 4363
			if (var7 < var0.field1220 || var7 > 2048 - var0.field1220) { // L: 4364
				var0.rotation = var0.orientation; // L: 4365
				var10 = false; // L: 4366
			}

			if (var0.field1220 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1219 > 25 || var10)) { // L: 4368
				if (var4 == -1 && var0.field1199 != -1) { // L: 4369
					var0.movementSequence = var0.field1199; // L: 4370
				} else if (var4 == 1 && var0.field1159 != -1) { // L: 4372
					var0.movementSequence = var0.field1159; // L: 4373
				} else {
					var0.movementSequence = var0.walkSequence; // L: 4376
				}
			}

			var0.rotation &= 2047; // L: 4380
		} else {
			if (var0.false0) { // L: 4383
				var0.targetIndex = -1; // L: 4384
				var0.false0 = false; // L: 4385
			}

			var0.field1219 = 0; // L: 4387
		}

	} // L: 4389
}
