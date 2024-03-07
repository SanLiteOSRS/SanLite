import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 345499435
	)
	public static int field295;
	@ObfuscatedName("as")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("az")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("af")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1666009421
	)
	int field285;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 7904803181192803033L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -57612285
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1722443599
	)
	int field288;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 185087089
	)
	int field279;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -5103555793324550579L
	)
	long field290;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2127435563
	)
	int field291;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -927399077
	)
	int field292;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1628734865
	)
	int field293;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 1679271652544265673L
	)
	long field294;
	@ObfuscatedName("ap")
	boolean field298;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -474525305
	)
	int field284;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	PcmStream[] field283;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "[Lbj;"
	)
	PcmStream[] field289;

	protected PcmPlayer() {
		this.field285 = 32; // L: 22
		this.timeMs = SecureRandomCallable.method2320(); // L: 23
		this.field290 = 0L; // L: 27
		this.field291 = 0; // L: 28
		this.field292 = 0; // L: 29
		this.field293 = 0; // L: 30
		this.field294 = 0L; // L: 31
		this.field298 = true; // L: 32
		this.field284 = 0; // L: 38
		this.field283 = new PcmStream[8]; // L: 39
		this.field289 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 280

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-51"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 281

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "810849571"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 284
	}

	@ObfuscatedName("ai")
	@Export("write")
	protected void write() throws Exception {
	} // L: 287

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-114"
	)
	@Export("close")
	protected void close() {
	} // L: 288

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1411350214"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 289

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbj;I)V",
		garbageValue = "-1154054246"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 79
	} // L: 80

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1197971386"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 83
			long var1 = SecureRandomCallable.method2320(); // L: 84

			try {
				if (0L != this.field290) { // L: 86
					if (var1 < this.field290) { // L: 87
						return;
					}

					this.open(this.capacity); // L: 88
					this.field290 = 0L; // L: 89
					this.field298 = true; // L: 90
				}

				int var3 = this.position(); // L: 92
				if (this.field293 - var3 > this.field291) { // L: 93
					this.field291 = this.field293 - var3;
				}

				int var4 = this.field288 + this.field279; // L: 94
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
					this.field298 = true; // L: 102
					if (var4 + 256 > this.capacity) { // L: 103
						var4 = this.capacity - 256; // L: 104
						this.field279 = var4 - this.field288; // L: 105
					}
				}

				while (var3 < var4) { // L: 108
					this.fill(this.samples, 256); // L: 109
					this.write(); // L: 110
					var3 += 256; // L: 111
				}

				if (var1 > this.field294) { // L: 113
					if (!this.field298) { // L: 114
						if (this.field291 == 0 && this.field292 == 0) { // L: 115
							this.close(); // L: 116
							this.field290 = 2000L + var1; // L: 117
							return; // L: 118
						}

						this.field279 = Math.min(this.field292, this.field291); // L: 120
						this.field292 = this.field291; // L: 121
					} else {
						this.field298 = false; // L: 123
					}

					this.field291 = 0; // L: 124
					this.field294 = 2000L + var1; // L: 125
				}

				this.field293 = var3; // L: 127
			} catch (Exception var7) { // L: 129
				this.close(); // L: 130
				this.field290 = var1 + 2000L; // L: 131
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 134
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 135
					this.skip(256); // L: 136
					this.timeMs += (long)(256000 / field295); // L: 137
				}
			} catch (Exception var6) { // L: 140
				this.timeMs = var1; // L: 141
			}

		}
	} // L: 143

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	public final void method741() {
		this.field298 = true; // L: 146
	} // L: 147

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-82"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field298 = true; // L: 150

		try {
			this.discard(); // L: 152
		} catch (Exception var2) { // L: 154
			this.close(); // L: 155
			this.field290 = SecureRandomCallable.method2320() + 2000L; // L: 156
		}

	} // L: 158

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-21100"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class27.soundSystem != null) { // L: 161
			boolean var1 = true; // L: 162

			for (int var2 = 0; var2 < 2; ++var2) { // L: 163
				if (this == class27.soundSystem.players[var2]) { // L: 164
					class27.soundSystem.players[var2] = null;
				}

				if (class27.soundSystem.players[var2] != null) { // L: 165
					var1 = false;
				}
			}

			if (var1) { // L: 167
				soundSystemExecutor.shutdownNow(); // L: 168
				soundSystemExecutor = null; // L: 169
				class27.soundSystem = null; // L: 170
			}
		}

		this.close(); // L: 173
		this.samples = null; // L: 174
	} // L: 175

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1435517864"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field284 -= var1; // L: 178
		if (this.field284 < 0) {
			this.field284 = 0; // L: 179
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 180
		}

	} // L: 181

	@ObfuscatedName("bq")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 185
		if (PcmPlayer_stereo) { // L: 186
			var3 = var2 << 1;
		}

		class428.clearIntArray(var1, 0, var3); // L: 187
		this.field284 -= var2; // L: 188
		if (this.stream != null && this.field284 <= 0) { // L: 189
			this.field284 += field295 >> 4; // L: 190
			class60.PcmStream_disable(this.stream); // L: 191
			this.method781(this.stream, this.stream.vmethod1014()); // L: 192
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
						PcmStream var11 = this.field283[var7]; // L: 216

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
									int var13 = var11.vmethod6346(); // L: 226
									var4 += var13; // L: 227
									if (var12 != null) {
										var12.position += var13; // L: 228
									}

									if (var4 >= this.field285) { // L: 229
										break label107;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 230
									if (var14 != null) { // L: 231
										for (int var15 = var11.field348; var14 != null; var14 = var11.nextSubStream()) { // L: 232 233 235
											this.method781(var14, var15 * var14.vmethod1014() >> 8); // L: 234
										}
									}

									PcmStream var18 = var11.after; // L: 238
									var11.after = null; // L: 239
									if (var10 == null) { // L: 240
										this.field283[var7] = var18;
									} else {
										var10.after = var18; // L: 241
									}

									if (var18 == null) { // L: 242
										this.field289[var7] = var10;
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
				PcmStream var16 = this.field283[var6]; // L: 248
				PcmStream[] var17 = this.field283; // L: 249
				this.field289[var6] = null; // L: 251

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 252 253 256
					var10 = var16.after; // L: 254
					var16.after = null; // L: 255
				}
			}
		}

		if (this.field284 < 0) { // L: 260
			this.field284 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 261
		}

		this.timeMs = SecureRandomCallable.method2320(); // L: 262
	} // L: 263

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lbj;IB)V",
		garbageValue = "1"
	)
	final void method781(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 272
		PcmStream var4 = this.field289[var3]; // L: 273
		if (var4 == null) { // L: 274
			this.field283[var3] = var1;
		} else {
			var4.after = var1; // L: 275
		}

		this.field289[var3] = var1; // L: 276
		var1.field348 = var2; // L: 277
	} // L: 278

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-1753341754"
	)
	static int method790(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class525 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 5170
			if (var0 != 7501) { // L: 5192
				int var19;
				int var20;
				if (var0 == 7502) { // L: 5201
					Interpreter.Interpreter_intStackSize -= 3; // L: 5202
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5203
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5204
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 5205
					var20 = class133.method3115(var19); // L: 5206
					var7 = class227.method4423(var19); // L: 5207
					int var21 = class167.method3503(var19); // L: 5208
					class526 var26 = class423.method8002(var3); // L: 5209
					class524 var27 = WorldMapScaleHandler.method5164(var20); // L: 5210
					int[] var28 = var27.field5140[var7]; // L: 5211
					int var12 = 0; // L: 5212
					int var13 = var28.length; // L: 5213
					if (var21 >= 0) { // L: 5214
						if (var21 >= var13) { // L: 5215
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 5216
						}

						var12 = var21; // L: 5218
						var13 = var21 + 1; // L: 5219
					}

					Object[] var14 = var26.method9385(var7); // L: 5221
					if (var14 == null && var27.field5139 != null) { // L: 5222 5223
						var14 = var27.field5139[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 5225
						for (var15 = var12; var15 < var13; ++var15) { // L: 5226
							var16 = var28[var15]; // L: 5227
							class521 var22 = class297.method5966(var16); // L: 5228
							if (var22 == class521.field5126) { // L: 5229
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class383.method7273(var16); // L: 5230
							}
						}

						return 1; // L: 5232
					} else {
						var15 = var14.length / var28.length; // L: 5234
						if (var5 >= 0 && var5 < var15) { // L: 5235
							for (var16 = var12; var16 < var13; ++var16) { // L: 5238
								int var17 = var16 + var28.length * var5; // L: 5239
								class521 var18 = class297.method5966(var28[var16]); // L: 5240
								if (var18 == class521.field5126) { // L: 5241
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 5242
								}
							}

							return 1; // L: 5244
						} else {
							throw new RuntimeException(); // L: 5236
						}
					}
				} else if (var0 == 7503) { // L: 5246
					Interpreter.Interpreter_intStackSize -= 2; // L: 5247
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5248
					var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 5249
					var5 = 0; // L: 5250
					var20 = class133.method3115(var19); // L: 5251
					var7 = class227.method4423(var19); // L: 5252
					class526 var25 = class423.method8002(var3); // L: 5253
					class524 var9 = WorldMapScaleHandler.method5164(var20); // L: 5254
					int[] var10 = var9.field5140[var7]; // L: 5255
					Object[] var11 = var25.method9385(var7); // L: 5256
					if (var11 == null && var9.field5139 != null) { // L: 5257 5258
						var11 = var9.field5139[var7]; // L: 5259
					}

					if (var11 != null) { // L: 5262
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5; // L: 5263
					return 1; // L: 5264
				} else if (var0 != 7504 && var0 != 7510) { // L: 5266
					if (var0 == 7505) { // L: 5283
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5284
						class526 var24 = class423.method8002(var3); // L: 5285
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var24.field5150; // L: 5286
						return 1; // L: 5287
					} else if (var0 == 7506) { // L: 5289
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5290
						var19 = -1; // L: 5291
						if (class173.field1847 != null && var3 >= 0 && var3 < class173.field1847.size()) { // L: 5292
							var19 = (Integer)class173.field1847.get(var3); // L: 5293
						}

						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19; // L: 5295
						return 1; // L: 5296
					} else if (var0 != 7507 && var0 != 7509) { // L: 5298
						return 2; // L: 5325
					} else {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5299
						var4 = class319.method6108(var3); // L: 5300
						var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5301
						var6 = ModelData0.method5941(var5); // L: 5302
						if (var6 == null) { // L: 5303
							throw new RuntimeException(); // L: 5304
						} else if (class133.method3115(var5) != Client.field824) { // L: 5306
							throw new RuntimeException(); // L: 5307
						} else if (class173.field1847 == null && class173.field1847.isEmpty()) { // L: 5309
							throw new RuntimeException(); // L: 5310
						} else {
							var7 = class167.method3503(var5); // L: 5312
							List var8 = var6.method9370(var4, var7); // L: 5313
							class173.field1847 = new LinkedList(class173.field1847); // L: 5314
							if (var8 != null) { // L: 5315
								class173.field1847.retainAll(var8); // L: 5316
							} else {
								class173.field1847.clear(); // L: 5319
							}

							Timer.field4675 = class173.field1847.iterator(); // L: 5321
							if (var0 == 7507) { // L: 5322
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class173.field1847.size();
							}

							return 1; // L: 5323
						}
					}
				} else {
					--Interpreter.Interpreter_intStackSize; // L: 5267
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 5268
					class525 var23 = class421.method7998(var3); // L: 5269
					if (var23 == null) { // L: 5270
						throw new RuntimeException(); // L: 5271
					} else {
						class173.field1847 = var23.method9370(0, 0); // L: 5273
						var5 = 0; // L: 5274
						if (class173.field1847 != null) { // L: 5275
							Client.field824 = var3; // L: 5276
							Timer.field4675 = class173.field1847.iterator(); // L: 5277
							var5 = class173.field1847.size(); // L: 5278
						}

						if (var0 == 7504) { // L: 5280
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5281
					}
				}
			} else {
				if (Timer.field4675 != null && Timer.field4675.hasNext()) { // L: 5193
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)Timer.field4675.next(); // L: 5194
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 5197
				}

				return 1; // L: 5199
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5171
			var4 = class319.method6108(var3); // L: 5172
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5173
			var6 = ModelData0.method5941(var5); // L: 5174
			if (var6 == null) { // L: 5175
				throw new RuntimeException(); // L: 5176
			} else {
				var7 = class167.method3503(var5); // L: 5178
				class173.field1847 = var6.method9370(var4, var7); // L: 5179
				if (class173.field1847 != null) { // L: 5180
					Client.field824 = class133.method3115(var5); // L: 5181
					Timer.field4675 = class173.field1847.iterator(); // L: 5182
					if (var0 == 7500) { // L: 5183
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class173.field1847.size();
					}
				} else {
					Client.field824 = -1; // L: 5186
					Timer.field4675 = null; // L: 5187
					if (var0 == 7500) { // L: 5188
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 5190
			}
		}
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Z",
		garbageValue = "-1595987533"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12780
	}
}
