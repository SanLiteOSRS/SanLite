import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bb")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ao")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbw;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("ax")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 544795385
	)
	int field295;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 2923713038662853309L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1811234521
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -700999465
	)
	public int field288;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1061162499
	)
	int field289;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -3737012796057226807L
	)
	long field281;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1556259401
	)
	int field291;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 761147211
	)
	int field292;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1186639275
	)
	int field293;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 5892979677882615623L
	)
	long field294;
	@ObfuscatedName("at")
	boolean field284;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 810684273
	)
	int field285;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "[Lbl;"
	)
	PcmStream[] field298;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Lbl;"
	)
	PcmStream[] field283;

	public PcmPlayer() {
		this.field295 = 32; // L: 22
		this.timeMs = UserComparator9.method2973(); // L: 23
		this.field281 = 0L; // L: 27
		this.field291 = 0; // L: 28
		this.field292 = 0; // L: 29
		this.field293 = 0; // L: 30
		this.field294 = 0L; // L: 31
		this.field284 = true; // L: 32
		this.field285 = 0; // L: 38
		this.field298 = new PcmStream[8]; // L: 39
		this.field283 = new PcmStream[8]; // L: 40
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	@Export("init")
	public void init() throws Exception {
	} // L: 244

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-81"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	} // L: 245

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-95"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 248
	}

	@ObfuscatedName("aj")
	@Export("write")
	protected void write() throws Exception {
	} // L: 251

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1232699455"
	)
	@Export("close")
	protected void close() {
	} // L: 252

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1520596872"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 253

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbl;B)V",
		garbageValue = "22"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 43
	} // L: 44

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2034283035"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 47
			long var1 = UserComparator9.method2973(); // L: 48

			try {
				if (this.field281 != 0L) { // L: 50
					if (var1 < this.field281) { // L: 51
						return;
					}

					this.open(this.capacity); // L: 52
					this.field281 = 0L; // L: 53
					this.field284 = true; // L: 54
				}

				int var3 = this.position(); // L: 56
				if (this.field293 - var3 > this.field291) { // L: 57
					this.field291 = this.field293 - var3;
				}

				int var4 = this.field289 + this.field288; // L: 58
				if (var4 + 256 > 16384) { // L: 59
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 60
					this.capacity += 1024; // L: 61
					if (this.capacity > 16384) { // L: 62
						this.capacity = 16384;
					}

					this.close(); // L: 63
					this.open(this.capacity); // L: 64
					var3 = 0; // L: 65
					this.field284 = true; // L: 66
					if (var4 + 256 > this.capacity) { // L: 67
						var4 = this.capacity - 256; // L: 68
						this.field289 = var4 - this.field288; // L: 69
					}
				}

				while (var3 < var4) { // L: 72
					this.fill(this.samples, 256); // L: 73
					this.write(); // L: 74
					var3 += 256; // L: 75
				}

				if (var1 > this.field294) { // L: 77
					if (!this.field284) { // L: 78
						if (this.field291 == 0 && this.field292 == 0) { // L: 79
							this.close(); // L: 80
							this.field281 = 2000L + var1; // L: 81
							return; // L: 82
						}

						this.field289 = Math.min(this.field292, this.field291); // L: 84
						this.field292 = this.field291; // L: 85
					} else {
						this.field284 = false; // L: 87
					}

					this.field291 = 0; // L: 88
					this.field294 = var1 + 2000L; // L: 89
				}

				this.field293 = var3; // L: 91
			} catch (Exception var7) { // L: 93
				this.close(); // L: 94
				this.field281 = var1 + 2000L; // L: 95
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 98
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 99
					this.skip(256); // L: 100
					this.timeMs += (long)(256000 / (class189.field1993 * 22050)); // L: 101
				}
			} catch (Exception var6) { // L: 104
				this.timeMs = var1; // L: 105
			}

		}
	} // L: 107

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "246556055"
	)
	public final void method845() {
		this.field284 = true; // L: 110
	} // L: 111

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1777076574"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field284 = true; // L: 114

		try {
			this.discard(); // L: 116
		} catch (Exception var2) { // L: 118
			this.close(); // L: 119
			this.field281 = UserComparator9.method2973() + 2000L; // L: 120
		}

	} // L: 122

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1331387146"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 125
			boolean var1 = true; // L: 126

			for (int var2 = 0; var2 < 2; ++var2) { // L: 127
				if (this == soundSystem.players[var2]) { // L: 128
					soundSystem.players[var2] = null;
				}

				if (soundSystem.players[var2] != null) { // L: 129
					var1 = false;
				}
			}

			if (var1) { // L: 131
				soundSystemExecutor.shutdownNow(); // L: 132
				soundSystemExecutor = null; // L: 133
				soundSystem = null; // L: 134
			}
		}

		this.close(); // L: 137
		this.samples = null; // L: 138
	} // L: 139

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-32"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field285 -= var1; // L: 142
		if (this.field285 < 0) {
			this.field285 = 0; // L: 143
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 144
		}

	} // L: 145

	@ObfuscatedName("bd")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 149
		if (class462.PcmPlayer_stereo) { // L: 150
			var3 = var2 << 1;
		}

		class425.clearIntArray(var1, 0, var3); // L: 151
		this.field285 -= var2; // L: 152
		if (this.stream != null && this.field285 <= 0) { // L: 153
			this.field285 += class189.field1993 * 22050 >> 4; // L: 154
			FloorOverlayDefinition.PcmStream_disable(this.stream); // L: 155
			this.method814(this.stream, this.stream.vmethod1061()); // L: 156
			int var4 = 0; // L: 157
			int var5 = 255; // L: 158

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) { // L: 159
				int var7;
				int var8;
				if (var6 < 0) { // L: 162
					var7 = var6 & 3; // L: 163
					var8 = -(var6 >> 2); // L: 164
				} else {
					var7 = var6; // L: 167
					var8 = 0; // L: 168
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 170 172
					if ((var9 & 1) != 0) { // L: 175
						var5 &= ~(1 << var7); // L: 178
						var10 = null; // L: 179
						PcmStream var11 = this.field298[var7]; // L: 180

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 181
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 182
								if (var12 != null && var12.position > var8) { // L: 183
									var5 |= 1 << var7; // L: 184
									var10 = var11; // L: 185
									var11 = var11.after; // L: 186
								} else {
									var11.active = true; // L: 189
									int var13 = var11.vmethod6281(); // L: 190
									var4 += var13; // L: 191
									if (var12 != null) { // L: 192
										var12.position += var13;
									}

									if (var4 >= this.field295) { // L: 193
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 194
									if (var14 != null) { // L: 195
										for (int var15 = var11.field353; var14 != null; var14 = var11.nextSubStream()) { // L: 196 197 199
											this.method814(var14, var15 * var14.vmethod1061() >> 8); // L: 198
										}
									}

									PcmStream var18 = var11.after; // L: 202
									var11.after = null; // L: 203
									if (var10 == null) { // L: 204
										this.field298[var7] = var18;
									} else {
										var10.after = var18; // L: 205
									}

									if (var18 == null) { // L: 206
										this.field283[var7] = var10;
									}

									var11 = var18; // L: 207
								}
							}
						}
					}

					var7 += 4; // L: 171
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 211
				PcmStream var16 = this.field298[var6]; // L: 212
				PcmStream[] var17 = this.field298; // L: 213
				this.field283[var6] = null; // L: 215

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 216 217 220
					var10 = var16.after; // L: 218
					var16.after = null; // L: 219
				}
			}
		}

		if (this.field285 < 0) { // L: 224
			this.field285 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 225
		}

		this.timeMs = UserComparator9.method2973(); // L: 226
	} // L: 227

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lbl;II)V",
		garbageValue = "429153206"
	)
	final void method814(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 236
		PcmStream var4 = this.field283[var3]; // L: 237
		if (var4 == null) { // L: 238
			this.field298[var3] = var1;
		} else {
			var4.after = var1; // L: 239
		}

		this.field283[var3] = var1; // L: 240
		var1.field353 = var2; // L: 241
	} // L: 242

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1767711937"
	)
	static int method860(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3473
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3474
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3475
			return 1; // L: 3476
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3478
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3479
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3480
			return 1; // L: 3481
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3483
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3484
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3485
			return 1; // L: 3486
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3488
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3489
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3490
			return 1; // L: 3491
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3493
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3494
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3495
			return 1; // L: 3496
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3498
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3499
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3500
			return 1; // L: 3501
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3503
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3504
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3505
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3506
				return 1; // L: 3507
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3509
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3510
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3511
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3512
				return 1; // L: 3513
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3515
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3516
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3517
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3518
				return 1; // L: 3519
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3521
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3522
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3523
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3524
				return 1; // L: 3525
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3527
					var12 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3528
					if (class380.grandExchangeEvents != null) { // L: 3529
						class380.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3530
					}

					return 1; // L: 3532
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3534
					var12 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3535
					if (class380.grandExchangeEvents != null) { // L: 3536
						class380.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3537
					}

					return 1; // L: 3539
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3541
					UserComparator6.Interpreter_intStackSize -= 2; // L: 3542
					var12 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize] == 1; // L: 3543
					boolean var11 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1] == 1; // L: 3544
					if (class380.grandExchangeEvents != null) { // L: 3545
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3546
						class380.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3547
					}

					return 1; // L: 3549
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3551
					var12 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3552
					if (class380.grandExchangeEvents != null) { // L: 3553
						class380.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3554
					}

					return 1; // L: 3556
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3558
					var12 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 3559
					if (class380.grandExchangeEvents != null) { // L: 3560
						class380.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3561
					}

					return 1; // L: 3563
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3565
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class380.grandExchangeEvents == null ? 0 : class380.grandExchangeEvents.events.size(); // L: 3566
					return 1; // L: 3567
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3569
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3570
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3); // L: 3571
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.world; // L: 3572
						return 1; // L: 3573
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3575
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3576
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3); // L: 3577
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3578
						return 1; // L: 3579
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3581
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3582
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3); // L: 3583
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3584
						return 1; // L: 3585
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3587
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3588
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3); // L: 3589
						long var5 = UserComparator9.method2973() - class17.field74 - var4.age; // L: 3590
						int var7 = (int)(var5 / 3600000L); // L: 3591
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3592
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3593
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3594
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var10; // L: 3595
						return 1; // L: 3596
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3598
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3599
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3); // L: 3600
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3601
						return 1; // L: 3602
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3604
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3605
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3); // L: 3606
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3607
						return 1; // L: 3608
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3610
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3611
						var4 = (GrandExchangeEvent)class380.grandExchangeEvents.events.get(var3); // L: 3612
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3613
						return 1; // L: 3614
					} else if (var0 == 3939) { // L: 3616
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 3617
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemComposition_get(var3).isTradable ? 1 : 0; // L: 3618
						return 1; // L: 3619
					} else {
						return 2; // L: 3621
					}
				}
			}
		}
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "-1536525774"
	)
	static void method859(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem(); // L: 8427
		var10.id = var3; // L: 8428
		var10.quantity = var4; // L: 8429
		var10.method2750(var5); // L: 8430
		if (Client.groundItems[var0][var1][var2] == null) { // L: 8431
			Client.groundItems[var0][var1][var2] = new NodeDeque(); // L: 8432
		}

		Client.groundItems[var0][var1][var2].addFirst(var10); // L: 8434
		class134.method3141(var0, var1, var2); // L: 8435
	} // L: 8436

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Luo;B)V",
		garbageValue = "84"
	)
	static final void method846(PacketBuffer var0) {
		var0.importIndex(); // L: 8726
		int var1 = var0.readBits(8); // L: 8727
		int var2;
		if (var1 < Client.npcCount) { // L: 8728
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 8729
				Client.field625[++Client.field708 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 8731
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8732

			for (var2 = 0; var2 < var1; ++var2) { // L: 8733
				int var3 = Client.npcIndices[var2]; // L: 8734
				NPC var4 = Client.npcs[var3]; // L: 8735
				int var5 = var0.readBits(1); // L: 8736
				if (var5 == 0) { // L: 8737
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8738
					var4.npcCycle = Client.cycle; // L: 8739
				} else {
					int var6 = var0.readBits(2); // L: 8742
					if (var6 == 0) { // L: 8743
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8744
						var4.npcCycle = Client.cycle; // L: 8745
						Client.field603[++Client.field549 - 1] = var3; // L: 8746
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 8749
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8750
							var4.npcCycle = Client.cycle; // L: 8751
							var7 = var0.readBits(3); // L: 8752
							var4.method2661(var7, class231.field2458); // L: 8753
							var8 = var0.readBits(1); // L: 8754
							if (var8 == 1) { // L: 8755
								Client.field603[++Client.field549 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 8758
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8759
							var4.npcCycle = Client.cycle; // L: 8760
							if (var0.readBits(1) == 1) { // L: 8761
								var7 = var0.readBits(3); // L: 8762
								var4.method2661(var7, class231.field2459); // L: 8763
								var8 = var0.readBits(3); // L: 8764
								var4.method2661(var8, class231.field2459); // L: 8765
							} else {
								var7 = var0.readBits(3); // L: 8768
								var4.method2661(var7, class231.field2456); // L: 8769
							}

							var7 = var0.readBits(1); // L: 8771
							if (var7 == 1) { // L: 8772
								Client.field603[++Client.field549 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 8775
							Client.field625[++Client.field708 - 1] = var3; // L: 8776
						}
					}
				}
			}

		}
	} // L: 8780
}
