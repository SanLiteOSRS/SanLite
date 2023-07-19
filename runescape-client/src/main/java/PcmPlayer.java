import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1008288309
	)
	public static int field271;
	@ObfuscatedName("ap")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 455549639
	)
	static int field274;
	@ObfuscatedName("am")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 358098371
	)
	int field277;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -1462229260789378589L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1397733919
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 382377575
	)
	int field280;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 537838613
	)
	int field281;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 1432415578268152335L
	)
	long field282;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -112787191
	)
	int field283;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1166258649
	)
	int field286;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2071996567
	)
	int field285;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 1444432609526895699L
	)
	long field272;
	@ObfuscatedName("ax")
	boolean field287;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1408579735
	)
	int field289;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	PcmStream[] field290;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[Lbg;"
	)
	PcmStream[] field291;

	protected PcmPlayer() {
		this.field277 = 32; // L: 22
		this.timeMs = AttackOption.method2714(); // L: 23
		this.field282 = 0L; // L: 27
		this.field283 = 0; // L: 28
		this.field286 = 0; // L: 29
		this.field285 = 0; // L: 30
		this.field272 = 0L; // L: 31
		this.field287 = true; // L: 32
		this.field289 = 0; // L: 38
		this.field290 = new PcmStream[8]; // L: 39
		this.field291 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1392328801"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 284

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-1723"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 285

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "226985336"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 288
	}

	@ObfuscatedName("aw")
	@Export("write")
	protected void write() throws Exception {
	} // L: 291

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "778118264"
	)
	@Export("close")
	protected void close() {
	} // L: 292

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-9"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 293

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lbg;I)V",
		garbageValue = "-471426327"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 83
	} // L: 84

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1584527123"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 87
			long var1 = AttackOption.method2714(); // L: 88

			try {
				if (this.field282 != 0L) { // L: 90
					if (var1 < this.field282) { // L: 91
						return;
					}

					this.open(this.capacity); // L: 92
					this.field282 = 0L; // L: 93
					this.field287 = true; // L: 94
				}

				int var3 = this.position(); // L: 96
				if (this.field285 - var3 > this.field283) { // L: 97
					this.field283 = this.field285 - var3;
				}

				int var4 = this.field280 + this.field281; // L: 98
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
					this.field287 = true; // L: 106
					if (var4 + 256 > this.capacity) { // L: 107
						var4 = this.capacity - 256; // L: 108
						this.field281 = var4 - this.field280; // L: 109
					}
				}

				while (var3 < var4) { // L: 112
					this.fill(this.samples, 256); // L: 113
					this.write(); // L: 114
					var3 += 256; // L: 115
				}

				if (var1 > this.field272) { // L: 117
					if (!this.field287) { // L: 118
						if (this.field283 == 0 && this.field286 == 0) { // L: 119
							this.close(); // L: 120
							this.field282 = var1 + 2000L; // L: 121
							return; // L: 122
						}

						this.field281 = Math.min(this.field286, this.field283); // L: 124
						this.field286 = this.field283; // L: 125
					} else {
						this.field287 = false; // L: 127
					}

					this.field283 = 0; // L: 128
					this.field272 = var1 + 2000L; // L: 129
				}

				this.field285 = var3; // L: 131
			} catch (Exception var7) { // L: 133
				this.close(); // L: 134
				this.field282 = var1 + 2000L; // L: 135
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 138
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) { // L: 139
					this.skip(256); // L: 140
					this.timeMs += (long)(256000 / field271); // L: 141
				}
			} catch (Exception var6) { // L: 144
				this.timeMs = var1; // L: 145
			}

		}
	} // L: 147

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	public final void method781() {
		this.field287 = true; // L: 150
	} // L: 151

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1644407321"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field287 = true; // L: 154

		try {
			this.discard(); // L: 156
		} catch (Exception var2) { // L: 158
			this.close(); // L: 159
			this.field282 = AttackOption.method2714() + 2000L; // L: 160
		}

	} // L: 162

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1256243607"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class527.soundSystem != null) { // L: 165
			boolean var1 = true; // L: 166

			for (int var2 = 0; var2 < 2; ++var2) { // L: 167
				if (this == class527.soundSystem.players[var2]) { // L: 168
					class527.soundSystem.players[var2] = null;
				}

				if (class527.soundSystem.players[var2] != null) { // L: 169
					var1 = false;
				}
			}

			if (var1) { // L: 171
				class299.soundSystemExecutor.shutdownNow(); // L: 172
				class299.soundSystemExecutor = null; // L: 173
				class527.soundSystem = null; // L: 174
			}
		}

		this.close(); // L: 177
		this.samples = null; // L: 178
	} // L: 179

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "23659"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field289 -= var1; // L: 182
		if (this.field289 < 0) {
			this.field289 = 0; // L: 183
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 184
		}

	} // L: 185

	@ObfuscatedName("bn")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 189
		if (PcmPlayer_stereo) { // L: 190
			var3 = var2 << 1;
		}

		class409.clearIntArray(var1, 0, var3); // L: 191
		this.field289 -= var2; // L: 192
		if (this.stream != null && this.field289 <= 0) { // L: 193
			this.field289 += field271 >> 4; // L: 194
			class168.PcmStream_disable(this.stream); // L: 195
			this.method789(this.stream, this.stream.vmethod1055()); // L: 196
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
						PcmStream var11 = this.field290[var7]; // L: 220

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
									int var13 = var11.vmethod6035(); // L: 230
									var4 += var13; // L: 231
									if (var12 != null) {
										var12.position += var13; // L: 232
									}

									if (var4 >= this.field277) { // L: 233
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 234
									if (var14 != null) { // L: 235
										for (int var15 = var11.field352; var14 != null; var14 = var11.nextSubStream()) { // L: 236 237 239
											this.method789(var14, var15 * var14.vmethod1055() >> 8); // L: 238
										}
									}

									PcmStream var18 = var11.after; // L: 242
									var11.after = null; // L: 243
									if (var10 == null) { // L: 244
										this.field290[var7] = var18;
									} else {
										var10.after = var18; // L: 245
									}

									if (var18 == null) { // L: 246
										this.field291[var7] = var10;
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
				PcmStream var16 = this.field290[var6]; // L: 252
				PcmStream[] var17 = this.field290; // L: 253
				this.field291[var6] = null; // L: 255

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 256 257 260
					var10 = var16.after; // L: 258
					var16.after = null; // L: 259
				}
			}
		}

		if (this.field289 < 0) { // L: 264
			this.field289 = 0;
		}

		if (this.stream != null) { // L: 265
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = AttackOption.method2714(); // L: 266
	} // L: 267

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lbg;II)V",
		garbageValue = "-2079632087"
	)
	final void method789(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 276
		PcmStream var4 = this.field291[var3]; // L: 277
		if (var4 == null) { // L: 278
			this.field290[var3] = var1;
		} else {
			var4.after = var1; // L: 279
		}

		this.field291[var3] = var1; // L: 280
		var1.field352 = var2; // L: 281
	} // L: 282

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I)Z",
		garbageValue = "-354252778"
	)
	static boolean method842(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 679
			int[] var1 = var0.transforms; // L: 681

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 682
				int var3 = var1[var2]; // L: 683
				ObjectComposition var4 = Language.getObjectDefinition(var3); // L: 685
				if (var4.mapIconId != -1) { // L: 686
					return true; // L: 687
				}
			}
		} else if (var0.mapIconId != -1) { // L: 693
			return true; // L: 694
		}

		return false; // L: 696
	}
}
