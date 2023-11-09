import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("j")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("n")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("m")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 502378549
	)
	int field310;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 8306176507750216733L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1116036099
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -839102897
	)
	int field313;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -679047829
	)
	int field324;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 9103786008147036381L
	)
	long field306;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1593097243
	)
	int field316;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 382614027
	)
	int field317;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1237732405
	)
	int field318;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 1189070885184433193L
	)
	long field319;
	@ObfuscatedName("y")
	boolean field307;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1016835193
	)
	int field322;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lan;"
	)
	PcmStream[] field323;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lan;"
	)
	PcmStream[] field314;

	protected PcmPlayer() {
		this.field310 = 32; // L: 22
		this.timeMs = class153.method3317(); // L: 23
		this.field306 = 0L; // L: 27
		this.field316 = 0; // L: 28
		this.field317 = 0; // L: 29
		this.field318 = 0; // L: 30
		this.field319 = 0L; // L: 31
		this.field307 = true; // L: 32
		this.field322 = 0; // L: 38
		this.field323 = new PcmStream[8]; // L: 39
		this.field314 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1600330502"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 280

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "742720329"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 281

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1573553273"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 284
	}

	@ObfuscatedName("s")
	@Export("write")
	protected void write() throws Exception {
	} // L: 287

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-892812272"
	)
	@Export("close")
	protected void close() {
	} // L: 288

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1285037243"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 289

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lan;I)V",
		garbageValue = "-116833836"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 79
	} // L: 80

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1435721898"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 83
			long var1 = class153.method3317(); // L: 84

			try {
				if (0L != this.field306) { // L: 86
					if (var1 < this.field306) { // L: 87
						return;
					}

					this.open(this.capacity); // L: 88
					this.field306 = 0L; // L: 89
					this.field307 = true; // L: 90
				}

				int var3 = this.position(); // L: 92
				if (this.field318 - var3 > this.field316) { // L: 93
					this.field316 = this.field318 - var3;
				}

				int var4 = this.field324 + this.field313; // L: 94
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
					this.field307 = true; // L: 102
					if (var4 + 256 > this.capacity) {
						var4 = this.capacity - 256; // L: 104
						this.field324 = var4 - this.field313; // L: 105
					}
				}

				while (var3 < var4) { // L: 108
					this.fill(this.samples, 256); // L: 109
					this.write(); // L: 110
					var3 += 256; // L: 111
				}

				if (var1 > this.field319) { // L: 113
					if (!this.field307) { // L: 114
						if (this.field316 == 0 && this.field317 == 0) { // L: 115
							this.close(); // L: 116
							this.field306 = 2000L + var1; // L: 117
							return; // L: 118
						}

						this.field324 = Math.min(this.field317, this.field316); // L: 120
						this.field317 = this.field316; // L: 121
					} else {
						this.field307 = false; // L: 123
					}

					this.field316 = 0; // L: 124
					this.field319 = 2000L + var1; // L: 125
				}

				this.field318 = var3; // L: 127
			} catch (Exception var7) { // L: 129
				this.close(); // L: 130
				this.field306 = 2000L + var1; // L: 131
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 134
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 135
					this.skip(256); // L: 136
					this.timeMs += (long)(256000 / class284.field3321); // L: 137
				}
			} catch (Exception var6) { // L: 140
				this.timeMs = var1; // L: 141
			}

		}
	} // L: 143

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1131218520"
	)
	public final void method783() {
		this.field307 = true; // L: 146
	} // L: 147

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1800360111"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field307 = true; // L: 150

		try {
			this.discard(); // L: 152
		} catch (Exception var2) { // L: 154
			this.close(); // L: 155
			this.field306 = class153.method3317() + 2000L; // L: 156
		}

	} // L: 158

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16415"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class266.soundSystem != null) { // L: 161
			boolean var1 = true; // L: 162

			for (int var2 = 0; var2 < 2; ++var2) { // L: 163
				if (this == class266.soundSystem.players[var2]) { // L: 164
					class266.soundSystem.players[var2] = null;
				}

				if (class266.soundSystem.players[var2] != null) { // L: 165
					var1 = false;
				}
			}

			if (var1) { // L: 167
				soundSystemExecutor.shutdownNow(); // L: 168
				soundSystemExecutor = null; // L: 169
				class266.soundSystem = null; // L: 170
			}
		}

		this.close(); // L: 173
		this.samples = null; // L: 174
	} // L: 175

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1488629152"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field322 -= var1; // L: 178
		if (this.field322 < 0) {
			this.field322 = 0; // L: 179
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 180
		}

	} // L: 181

	@ObfuscatedName("ai")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 185
		if (PcmPlayer_stereo) { // L: 186
			var3 = var2 << 1;
		}

		class377.clearIntArray(var1, 0, var3); // L: 187
		this.field322 -= var2; // L: 188
		if (this.stream != null && this.field322 <= 0) { // L: 189
			this.field322 += class284.field3321 >> 4; // L: 190
			class31.PcmStream_disable(this.stream); // L: 191
			this.method786(this.stream, this.stream.vmethod1026()); // L: 192
			int var4 = 0; // L: 193
			int var5 = 255; // L: 194

			int var6;
			PcmStream var10;
			label107:
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
						PcmStream var11 = this.field323[var7]; // L: 216

						label101:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 217
									break label101;
								}

								AbstractSound var12 = var11.sound; // L: 218
								if (var12 != null && var12.position > var8) { // L: 219
									var5 |= 1 << var7; // L: 220
									var10 = var11; // L: 221
									var11 = var11.after; // L: 222
								} else {
									var11.active = true; // L: 225
									int var13 = var11.vmethod5793(); // L: 226
									var4 += var13; // L: 227
									if (var12 != null) {
										var12.position += var13; // L: 228
									}

									if (var4 >= this.field310) { // L: 229
										break label107;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 230
									if (var14 != null) { // L: 231
										for (int var15 = var11.field369; var14 != null; var14 = var11.nextSubStream()) { // L: 232 233 235
											this.method786(var14, var15 * var14.vmethod1026() >> 8); // L: 234
										}
									}

									PcmStream var18 = var11.after; // L: 238
									var11.after = null; // L: 239
									if (var10 == null) { // L: 240
										this.field323[var7] = var18;
									} else {
										var10.after = var18; // L: 241
									}

									if (var18 == null) { // L: 242
										this.field314[var7] = var10;
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
				PcmStream var16 = this.field323[var6]; // L: 248
				PcmStream[] var17 = this.field323; // L: 249
				this.field314[var6] = null; // L: 251

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 252 253 256
					var10 = var16.after; // L: 254
					var16.after = null; // L: 255
				}
			}
		}

		if (this.field322 < 0) { // L: 260
			this.field322 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 261
		}

		this.timeMs = class153.method3317(); // L: 262
	} // L: 263

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lan;II)V",
		garbageValue = "-967266641"
	)
	final void method786(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 272
		PcmStream var4 = this.field314[var3]; // L: 273
		if (var4 == null) { // L: 274
			this.field323[var3] = var1;
		} else {
			var4.after = var1; // L: 275
		}

		this.field314[var3] = var1; // L: 276
		var1.field369 = var2; // L: 277
	} // L: 278

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-55"
	)
	public static int method838(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2; // L: 17
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1346222802"
	)
	static int method826() {
		return KeyHandler.KeyHandler_keyCodes.length; // L: 103
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "2137110263"
	)
	static int method837(int var0, Script var1, boolean var2) {
		return 2; // L: 4914
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Lcb;II)V",
		garbageValue = "163232913"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		SequenceDefinition var2;
		int var3;
		int var4;
		int var5;
		int var11;
		SequenceDefinition var12;
		if (var0.field1215 >= Client.cycle) { // L: 4241
			var11 = Math.max(1, var0.field1215 - Client.cycle); // L: 4242
			var3 = var0.field1211 * 128 + var0.field1163 * 64; // L: 4243
			var4 = var0.field1213 * 128 + var0.field1163 * 64; // L: 4244
			var0.x += (var3 - var0.x) / var11; // L: 4245
			var0.y += (var4 - var0.y) / var11; // L: 4246
			var0.field1175 = 0; // L: 4247
			var0.orientation = var0.field1217; // L: 4248
		} else {
			int var7;
			int var8;
			if (var0.field1189 >= Client.cycle) { // L: 4250
				boolean var16 = var0.field1189 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4251
				if (!var16) { // L: 4252
					var12 = class85.SequenceDefinition_get(var0.sequence); // L: 4253
					if (var12 != null && !var12.isCachedModelIdSet()) { // L: 4254
						var16 = var0.sequenceFrameCycle + 1 > var12.frameLengths[var0.sequenceFrame]; // L: 4258
					} else {
						var16 = true; // L: 4255
					}
				}

				if (var16) { // L: 4261
					var3 = var0.field1189 - var0.field1215; // L: 4262
					var4 = Client.cycle - var0.field1215; // L: 4263
					var5 = var0.field1211 * 128 + var0.field1163 * 64; // L: 4264
					int var13 = var0.field1213 * 128 + var0.field1163 * 64; // L: 4265
					var7 = var0.field1212 * 128 + var0.field1163 * 64; // L: 4266
					var8 = var0.field1214 * 128 + var0.field1163 * 64; // L: 4267
					var0.x = (var4 * var7 + var5 * (var3 - var4)) / var3; // L: 4268
					var0.y = (var8 * var4 + var13 * (var3 - var4)) / var3; // L: 4269
				}

				var0.field1175 = 0; // L: 4271
				var0.orientation = var0.field1217; // L: 4272
				var0.rotation = var0.orientation; // L: 4273
			} else {
				var0.movementSequence = var0.idleSequence; // L: 4276
				if (var0.pathLength == 0) { // L: 4277
					var0.field1175 = 0; // L: 4278
				} else {
					label756: {
						if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4281
							var2 = class85.SequenceDefinition_get(var0.sequence); // L: 4282
							if (var0.field1230 > 0 && var2.field2307 == 0) { // L: 4283
								++var0.field1175; // L: 4284
								break label756; // L: 4285
							}

							if (var0.field1230 <= 0 && var2.field2301 == 0) { // L: 4287
								++var0.field1175; // L: 4288
								break label756; // L: 4289
							}
						}

						var11 = var0.x; // L: 4292
						var3 = var0.y; // L: 4293
						var4 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1163 * 64; // L: 4294
						var5 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1163 * 64; // L: 4295
						if (var11 < var4) { // L: 4296
							if (var3 < var5) { // L: 4297
								var0.orientation = 1280;
							} else if (var3 > var5) { // L: 4298
								var0.orientation = 1792;
							} else {
								var0.orientation = 1536; // L: 4299
							}
						} else if (var11 > var4) { // L: 4301
							if (var3 < var5) { // L: 4302
								var0.orientation = 768;
							} else if (var3 > var5) { // L: 4303
								var0.orientation = 256;
							} else {
								var0.orientation = 512; // L: 4304
							}
						} else if (var3 < var5) { // L: 4306
							var0.orientation = 1024;
						} else if (var3 > var5) { // L: 4307
							var0.orientation = 0;
						}

						class208 var6 = var0.pathTraversed[var0.pathLength - 1]; // L: 4308
						if (var4 - var11 <= 256 && var4 - var11 >= -256 && var5 - var3 <= 256 && var5 - var3 >= -256) { // L: 4309
							var7 = var0.orientation - var0.rotation & 2047; // L: 4316
							if (var7 > 1024) { // L: 4317
								var7 -= 2048;
							}

							var8 = var0.walkBackSequence; // L: 4318
							if (var7 >= -256 && var7 <= 256) { // L: 4319
								var8 = var0.walkSequence;
							} else if (var7 >= 256 && var7 < 768) { // L: 4320
								var8 = var0.walkRightSequence;
							} else if (var7 >= -768 && var7 <= -256) { // L: 4321
								var8 = var0.walkLeftSequence;
							}

							if (var8 == -1) { // L: 4322
								var8 = var0.walkSequence;
							}

							var0.movementSequence = var8; // L: 4323
							int var9 = 4; // L: 4324
							boolean var10 = true; // L: 4325
							if (var0 instanceof NPC) { // L: 4326
								var10 = ((NPC)var0).definition.isClickable;
							}

							if (var10) { // L: 4327
								if (var0.orientation != var0.rotation && var0.targetIndex == -1 && var0.field1228 != 0) { // L: 4328
									var9 = 2;
								}

								if (var0.pathLength > 2) { // L: 4329
									var9 = 6;
								}

								if (var0.pathLength > 3) { // L: 4330
									var9 = 8;
								}

								if (var0.field1175 > 0 && var0.pathLength > 1) { // L: 4331
									var9 = 8; // L: 4332
									--var0.field1175; // L: 4333
								}
							} else {
								if (var0.pathLength > 1) { // L: 4337
									var9 = 6;
								}

								if (var0.pathLength > 2) { // L: 4338
									var9 = 8;
								}

								if (var0.field1175 > 0 && var0.pathLength > 1) { // L: 4339
									var9 = 8; // L: 4340
									--var0.field1175; // L: 4341
								}
							}

							if (var6 == class208.field2362) { // L: 4344
								var9 <<= 1;
							} else if (var6 == class208.field2366) { // L: 4345
								var9 >>= 1;
							}

							if (var9 >= 8) { // L: 4346
								if (var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4347
									var0.movementSequence = var0.runSequence;
								} else if (var0.movementSequence == var0.walkBackSequence && var0.field1173 != -1) { // L: 4348
									var0.movementSequence = var0.field1173;
								} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1174 != -1) { // L: 4349
									var0.movementSequence = var0.field1174;
								} else if (var0.movementSequence == var0.walkRightSequence && var0.field1168 != -1) { // L: 4350
									var0.movementSequence = var0.field1168;
								}
							} else if (var9 <= 1) { // L: 4352
								if (var0.walkSequence == var0.movementSequence && var0.field1187 != -1) { // L: 4353
									var0.movementSequence = var0.field1187;
								} else if (var0.movementSequence == var0.walkBackSequence && var0.field1172 != -1) { // L: 4354
									var0.movementSequence = var0.field1172;
								} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1178 != -1) { // L: 4355
									var0.movementSequence = var0.field1178;
								} else if (var0.movementSequence == var0.walkRightSequence && var0.field1179 != -1) { // L: 4356
									var0.movementSequence = var0.field1179;
								}
							}

							if (var4 != var11 || var5 != var3) { // L: 4358
								if (var11 < var4) { // L: 4359
									var0.x += var9; // L: 4360
									if (var0.x > var4) { // L: 4361
										var0.x = var4;
									}
								} else if (var11 > var4) { // L: 4363
									var0.x -= var9; // L: 4364
									if (var0.x < var4) { // L: 4365
										var0.x = var4;
									}
								}

								if (var3 < var5) { // L: 4367
									var0.y += var9; // L: 4368
									if (var0.y > var5) { // L: 4369
										var0.y = var5;
									}
								} else if (var3 > var5) { // L: 4371
									var0.y -= var9; // L: 4372
									if (var0.y < var5) { // L: 4373
										var0.y = var5;
									}
								}
							}

							if (var4 == var0.x && var5 == var0.y) { // L: 4376
								--var0.pathLength; // L: 4377
								if (var0.field1230 > 0) { // L: 4378
									--var0.field1230;
								}
							}
						} else {
							var0.x = var4; // L: 4310
							var0.y = var5; // L: 4311
							--var0.pathLength; // L: 4312
							if (var0.field1230 > 0) { // L: 4313
								--var0.field1230;
							}
						}
					}
				}
			}
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 4381
			var0.sequence = -1; // L: 4382
			var0.spotAnimation = -1; // L: 4383
			var0.field1215 = 0; // L: 4384
			var0.field1189 = 0; // L: 4385
			var0.x = var0.pathX[0] * 128 + var0.field1163 * 64; // L: 4386
			var0.y = var0.pathY[0] * 128 + var0.field1163 * 64; // L: 4387
			var0.method2423(); // L: 4388
		}

		if (class387.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 4390 4391
			var0.sequence = -1; // L: 4392
			var0.spotAnimation = -1; // L: 4393
			var0.field1215 = 0; // L: 4394
			var0.field1189 = 0; // L: 4395
			var0.x = var0.pathX[0] * 128 + var0.field1163 * 64; // L: 4396
			var0.y = var0.pathY[0] * 128 + var0.field1163 * 64; // L: 4397
			var0.method2423(); // L: 4398
		}

		if (var0.field1228 != 0) { // L: 4402
			if (var0.targetIndex != -1) { // L: 4403
				Object var14 = null; // L: 4404
				var3 = class323.field3800 ? 65536 : 32768; // L: 4405
				if (var0.targetIndex < var3) { // L: 4406
					var14 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= var3) { // L: 4407
					var14 = Client.players[var0.targetIndex - var3];
				}

				if (var14 != null) { // L: 4408
					var4 = var0.x - ((Actor)var14).x; // L: 4409
					var5 = var0.y - ((Actor)var14).y; // L: 4410
					if (var4 != 0 || var5 != 0) { // L: 4411
						var0.orientation = (int)(Math.atan2((double)var4, (double)var5) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 4413
					var0.targetIndex = -1; // L: 4414
					var0.false0 = false; // L: 4415
				}
			}

			if (var0.field1195 != -1 && (var0.pathLength == 0 || var0.field1175 > 0)) { // L: 4418
				var0.orientation = var0.field1195; // L: 4419
				var0.field1195 = -1; // L: 4420
			}

			var11 = var0.orientation - var0.rotation & 2047; // L: 4422
			if (var11 == 0 && var0.false0) { // L: 4423
				var0.targetIndex = -1; // L: 4424
				var0.false0 = false; // L: 4425
			}

			if (var11 != 0) { // L: 4427
				++var0.field1191; // L: 4428
				boolean var15;
				if (var11 > 1024) { // L: 4429
					var0.rotation -= var0.field1196 ? var11 : var0.field1228; // L: 4430
					var15 = true; // L: 4431
					if (var11 < var0.field1228 || var11 > 2048 - var0.field1228) { // L: 4432
						var0.rotation = var0.orientation; // L: 4433
						var15 = false; // L: 4434
					}

					if (!var0.field1196 && var0.movementSequence == var0.idleSequence && (var0.field1191 > 25 || var15)) { // L: 4436
						if (var0.turnLeftSequence != -1) { // L: 4437
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4438
						}
					}
				} else {
					var0.rotation += var0.field1196 ? var11 : var0.field1228; // L: 4442
					var15 = true; // L: 4443
					if (var11 < var0.field1228 || var11 > 2048 - var0.field1228) { // L: 4444
						var0.rotation = var0.orientation; // L: 4445
						var15 = false; // L: 4446
					}

					if (!var0.field1196 && var0.movementSequence == var0.idleSequence && (var0.field1191 > 25 || var15)) { // L: 4448
						if (var0.turnRightSequence != -1) { // L: 4449
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 4450
						}
					}
				}

				var0.rotation &= 2047; // L: 4454
				var0.field1196 = false; // L: 4455
			} else {
				var0.field1191 = 0; // L: 4457
			}
		}

		var0.isWalking = false; // L: 4460
		if (var0.movementSequence != -1) { // L: 4461
			var2 = class85.SequenceDefinition_get(var0.movementSequence); // L: 4462
			if (var2 != null) { // L: 4463
				if (!var2.isCachedModelIdSet() && var2.frameIds != null) { // L: 4464
					++var0.movementFrameCycle; // L: 4465
					if (var0.movementFrame < var2.frameIds.length && var0.movementFrameCycle > var2.frameLengths[var0.movementFrame]) { // L: 4466
						var0.movementFrameCycle = 1; // L: 4467
						++var0.movementFrame; // L: 4468
						SoundCache.method868(var2, var0.movementFrame, var0.x, var0.y); // L: 4469
					}

					if (var0.movementFrame >= var2.frameIds.length) { // L: 4471
						if (var2.frameCount > 0) { // L: 4472
							var0.movementFrame -= var2.frameCount; // L: 4473
							if (var2.field2297) { // L: 4474
								++var0.field1200;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var2.frameIds.length || var2.field2297 && var0.field1200 >= var2.field2304) { // L: 4475
								var0.movementFrameCycle = 0; // L: 4476
								var0.movementFrame = 0; // L: 4477
								var0.field1200 = 0; // L: 4478
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4482
							var0.movementFrame = 0; // L: 4483
						}

						SoundCache.method868(var2, var0.movementFrame, var0.x, var0.y); // L: 4485
					}
				} else if (var2.isCachedModelIdSet()) { // L: 4488
					++var0.movementFrame; // L: 4489
					var3 = var2.method4055(); // L: 4490
					if (var0.movementFrame < var3) { // L: 4491
						StudioGame.method6440(var2, var0.movementFrame, var0.x, var0.y); // L: 4492
					} else {
						if (var2.frameCount > 0) { // L: 4495
							var0.movementFrame -= var2.frameCount; // L: 4496
							if (var2.field2297) { // L: 4497
								++var0.field1200;
							}

							if (var0.movementFrame < 0 || var0.movementFrame >= var3 || var2.field2297 && var0.field1200 >= var2.field2304) { // L: 4498
								var0.movementFrame = 0; // L: 4499
								var0.movementFrameCycle = 0; // L: 4500
								var0.field1200 = 0; // L: 4501
							}
						} else {
							var0.movementFrameCycle = 0; // L: 4505
							var0.movementFrame = 0; // L: 4506
						}

						StudioGame.method6440(var2, var0.movementFrame, var0.x, var0.y); // L: 4508
					}
				} else {
					var0.movementSequence = -1; // L: 4511
				}
			} else {
				var0.movementSequence = -1; // L: 4513
			}
		}

		if (var0.spotAnimation != -1 && Client.cycle >= var0.field1207) { // L: 4515
			if (var0.spotAnimationFrame < 0) { // L: 4516
				var0.spotAnimationFrame = 0;
			}

			var11 = MouseRecorder.SpotAnimationDefinition_get(var0.spotAnimation).sequence; // L: 4517
			if (var11 != -1) { // L: 4518
				var12 = class85.SequenceDefinition_get(var11); // L: 4519
				if (var12 != null && var12.frameIds != null && !var12.isCachedModelIdSet()) { // L: 4520
					++var0.field1208; // L: 4521
					if (var0.spotAnimationFrame < var12.frameIds.length && var0.field1208 > var12.frameLengths[var0.spotAnimationFrame]) { // L: 4522
						var0.field1208 = 1; // L: 4523
						++var0.spotAnimationFrame; // L: 4524
						SoundCache.method868(var12, var0.spotAnimationFrame, var0.x, var0.y); // L: 4525
					}

					if (var0.spotAnimationFrame >= var12.frameIds.length && (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var12.frameIds.length)) { // L: 4527 4528
						var0.spotAnimation = -1;
					}
				} else if (var12.isCachedModelIdSet()) { // L: 4531
					++var0.spotAnimationFrame; // L: 4532
					var4 = var12.method4055(); // L: 4533
					if (var0.spotAnimationFrame < var4) { // L: 4534
						StudioGame.method6440(var12, var0.spotAnimationFrame, var0.x, var0.y); // L: 4535
					} else if (var0.spotAnimationFrame < 0 || var0.spotAnimationFrame >= var4) { // L: 4538
						var0.spotAnimation = -1;
					}
				} else {
					var0.spotAnimation = -1; // L: 4541
				}
			} else {
				var0.spotAnimation = -1; // L: 4543
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay <= 1) { // L: 4545
			var2 = class85.SequenceDefinition_get(var0.sequence); // L: 4546
			if (var2.field2307 == 1 && var0.field1230 > 0 && var0.field1215 <= Client.cycle && var0.field1189 < Client.cycle) { // L: 4547 4548
				var0.sequenceDelay = 1; // L: 4549
				return; // L: 4605
			}
		}

		if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4554
			var2 = class85.SequenceDefinition_get(var0.sequence); // L: 4555
			if (var2 == null) { // L: 4556
				var0.sequence = -1; // L: 4601
			} else if (!var2.isCachedModelIdSet() && var2.frameIds != null) { // L: 4557
				++var0.sequenceFrameCycle; // L: 4558
				if (var0.sequenceFrame < var2.frameIds.length && var0.sequenceFrameCycle > var2.frameLengths[var0.sequenceFrame]) { // L: 4559
					var0.sequenceFrameCycle = 1; // L: 4560
					++var0.sequenceFrame; // L: 4561
					SoundCache.method868(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4562
				}

				if (var0.sequenceFrame >= var2.frameIds.length) { // L: 4564
					var0.sequenceFrame -= var2.frameCount; // L: 4565
					++var0.field1205; // L: 4566
					if (var0.field1205 >= var2.field2304) { // L: 4567
						var0.sequence = -1; // L: 4568
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var2.frameIds.length) { // L: 4570
						SoundCache.method868(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4574
					} else {
						var0.sequence = -1; // L: 4571
					}
				}

				var0.isWalking = var2.field2293; // L: 4577
			} else if (var2.isCachedModelIdSet()) { // L: 4579
				++var0.sequenceFrame; // L: 4580
				var3 = var2.method4055(); // L: 4581
				if (var0.sequenceFrame < var3) { // L: 4582
					StudioGame.method6440(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4583
				} else {
					var0.sequenceFrame -= var2.frameCount; // L: 4586
					++var0.field1205; // L: 4587
					if (var0.field1205 >= var2.field2304) { // L: 4588
						var0.sequence = -1; // L: 4589
					} else if (var0.sequenceFrame >= 0 && var0.sequenceFrame < var3) { // L: 4591
						StudioGame.method6440(var2, var0.sequenceFrame, var0.x, var0.y); // L: 4595
					} else {
						var0.sequence = -1; // L: 4592
					}
				}
			} else {
				var0.sequence = -1; // L: 4599
			}
		}

		if (var0.sequenceDelay > 0) { // L: 4603
			--var0.sequenceDelay;
		}

	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1696311323"
	)
	static void method803() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 5061
			Decimator.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 5062
		}

	} // L: 5064
}
