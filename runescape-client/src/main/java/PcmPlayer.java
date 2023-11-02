import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 911118355
	)
	public static int field306;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("tw")
	static boolean field307;
	@ObfuscatedName("ay")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1263973473
	)
	int field292;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -2154553687402305665L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -140839579
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1020036435
	)
	public int field289;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1686523433
	)
	int field299;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 8238266776402452691L
	)
	long field297;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1466732995
	)
	int field298;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -802432147
	)
	int field294;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2014710731
	)
	int field300;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -8003400550630877477L
	)
	long field301;
	@ObfuscatedName("ad")
	boolean field302;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1290381553
	)
	int field303;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	PcmStream[] field296;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	PcmStream[] field305;

	public PcmPlayer() {
		this.field292 = 32; // L: 22
		this.timeMs = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 23
		this.field297 = 0L; // L: 27
		this.field298 = 0; // L: 28
		this.field294 = 0; // L: 29
		this.field300 = 0; // L: 30
		this.field301 = 0L; // L: 31
		this.field302 = true; // L: 32
		this.field303 = 0; // L: 38
		this.field296 = new PcmStream[8]; // L: 39
		this.field305 = new PcmStream[8]; // L: 40
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1058566109"
	)
	@Export("init")
	public void init() throws Exception {
	} // L: 255

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	} // L: 256

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-325041005"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 259
	}

	@ObfuscatedName("ax")
	@Export("write")
	protected void write() throws Exception {
	} // L: 262

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3331"
	)
	@Export("close")
	protected void close() {
	} // L: 263

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 264

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbi;I)V",
		garbageValue = "-1717479669"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 54
	} // L: 55

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1281644299"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 58
			long var1 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 59

			try {
				if (this.field297 != 0L) { // L: 61
					if (var1 < this.field297) { // L: 62
						return;
					}

					this.open(this.capacity); // L: 63
					this.field297 = 0L; // L: 64
					this.field302 = true; // L: 65
				}

				int var3 = this.position(); // L: 67
				if (this.field300 - var3 > this.field298) { // L: 68
					this.field298 = this.field300 - var3;
				}

				int var4 = this.field299 + this.field289; // L: 69
				if (var4 + 256 > 16384) { // L: 70
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 71
					this.capacity += 1024; // L: 72
					if (this.capacity > 16384) { // L: 73
						this.capacity = 16384;
					}

					this.close(); // L: 74
					this.open(this.capacity); // L: 75
					var3 = 0; // L: 76
					this.field302 = true; // L: 77
					if (var4 + 256 > this.capacity) { // L: 78
						var4 = this.capacity - 256; // L: 79
						this.field299 = var4 - this.field289; // L: 80
					}
				}

				while (var3 < var4) { // L: 83
					this.fill(this.samples, 256); // L: 84
					this.write(); // L: 85
					var3 += 256; // L: 86
				}

				if (var1 > this.field301) { // L: 88
					if (!this.field302) { // L: 89
						if (this.field298 == 0 && this.field294 == 0) { // L: 90
							this.close(); // L: 91
							this.field297 = var1 + 2000L; // L: 92
							return; // L: 93
						}

						this.field299 = Math.min(this.field294, this.field298); // L: 95
						this.field294 = this.field298; // L: 96
					} else {
						this.field302 = false; // L: 98
					}

					this.field298 = 0; // L: 99
					this.field301 = 2000L + var1; // L: 100
				}

				this.field300 = var3; // L: 102
			} catch (Exception var7) { // L: 104
				this.close(); // L: 105
				this.field297 = var1 + 2000L; // L: 106
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 109
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 110
					this.skip(256); // L: 111
					this.timeMs += (long)(256000 / field306); // L: 112
				}
			} catch (Exception var6) { // L: 115
				this.timeMs = var1; // L: 116
			}

		}
	} // L: 118

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "233937978"
	)
	public final void method780() {
		this.field302 = true; // L: 121
	} // L: 122

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1063946921"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field302 = true; // L: 125

		try {
			this.discard(); // L: 127
		} catch (Exception var2) { // L: 129
			this.close(); // L: 130
			this.field297 = GrandExchangeOfferTotalQuantityComparator.method7049() + 2000L; // L: 131
		}

	} // L: 133

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1490878758"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (UserComparator4.soundSystem != null) { // L: 136
			boolean var1 = true; // L: 137

			for (int var2 = 0; var2 < 2; ++var2) { // L: 138
				if (this == UserComparator4.soundSystem.players[var2]) {
					UserComparator4.soundSystem.players[var2] = null; // L: 139
				}

				if (UserComparator4.soundSystem.players[var2] != null) { // L: 140
					var1 = false;
				}
			}

			if (var1) { // L: 142
				class353.soundSystemExecutor.shutdownNow(); // L: 143
				class353.soundSystemExecutor = null; // L: 144
				UserComparator4.soundSystem = null; // L: 145
			}
		}

		this.close(); // L: 148
		this.samples = null; // L: 149
	} // L: 150

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1697605758"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field303 -= var1; // L: 153
		if (this.field303 < 0) {
			this.field303 = 0; // L: 154
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 155
		}

	} // L: 156

	@ObfuscatedName("bd")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 160
		if (class306.PcmPlayer_stereo) { // L: 161
			var3 = var2 << 1;
		}

		class424.clearIntArray(var1, 0, var3); // L: 162
		this.field303 -= var2; // L: 163
		if (this.stream != null && this.field303 <= 0) { // L: 164
			this.field303 += field306 >> 4; // L: 165
			class193.PcmStream_disable(this.stream); // L: 166
			this.method820(this.stream, this.stream.vmethod1038()); // L: 167
			int var4 = 0; // L: 168
			int var5 = 255; // L: 169

			int var6;
			PcmStream var10;
			label108:
			for (var6 = 7; var5 != 0; --var6) { // L: 170
				int var7;
				int var8;
				if (var6 < 0) { // L: 173
					var7 = var6 & 3; // L: 174
					var8 = -(var6 >> 2); // L: 175
				} else {
					var7 = var6; // L: 178
					var8 = 0; // L: 179
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 181 183
					if ((var9 & 1) != 0) { // L: 186
						var5 &= ~(1 << var7); // L: 189
						var10 = null; // L: 190
						PcmStream var11 = this.field296[var7]; // L: 191

						label102:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 192
									break label102;
								}

								AbstractSound var12 = var11.sound; // L: 193
								if (var12 != null && var12.position > var8) { // L: 194
									var5 |= 1 << var7; // L: 195
									var10 = var11; // L: 196
									var11 = var11.after; // L: 197
								} else {
									var11.active = true; // L: 200
									int var13 = var11.vmethod6188(); // L: 201
									var4 += var13; // L: 202
									if (var12 != null) {
										var12.position += var13; // L: 203
									}

									if (var4 >= this.field292) { // L: 204
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 205
									if (var14 != null) { // L: 206
										for (int var15 = var11.field366; var14 != null; var14 = var11.nextSubStream()) { // L: 207 208 210
											this.method820(var14, var15 * var14.vmethod1038() >> 8); // L: 209
										}
									}

									PcmStream var18 = var11.after; // L: 213
									var11.after = null; // L: 214
									if (var10 == null) { // L: 215
										this.field296[var7] = var18;
									} else {
										var10.after = var18; // L: 216
									}

									if (var18 == null) { // L: 217
										this.field305[var7] = var10;
									}

									var11 = var18; // L: 218
								}
							}
						}
					}

					var7 += 4; // L: 182
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 222
				PcmStream var16 = this.field296[var6]; // L: 223
				PcmStream[] var17 = this.field296; // L: 224
				this.field305[var6] = null; // L: 226

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 227 228 231
					var10 = var16.after; // L: 229
					var16.after = null; // L: 230
				}
			}
		}

		if (this.field303 < 0) { // L: 235
			this.field303 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 236
		}

		this.timeMs = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 237
	} // L: 238

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lbi;IB)V",
		garbageValue = "-119"
	)
	final void method820(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 247
		PcmStream var4 = this.field305[var3]; // L: 248
		if (var4 == null) { // L: 249
			this.field296[var3] = var1;
		} else {
			var4.after = var1; // L: 250
		}

		this.field305[var3] = var1; // L: 251
		var1.field366 = var2; // L: 252
	} // L: 253

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	static final void method819() {
		int var0;
		int var1;
		int var2;
		if (!Client.field779) { // L: 4120
			var0 = class191.field1922 * 128 + 64; // L: 4121
			var1 = MouseHandler.field224 * 16384 + 64; // L: 4122
			var2 = class115.getTileHeight(var0, var1, class87.Client_plane) - SoundSystem.field323; // L: 4123
			WorldMapSectionType.method5616(var0, var2, var1); // L: 4124
		} else if (Client.field782 != null) { // L: 4126
			Client.cameraX = Client.field782.vmethod8614(); // L: 4127
			WorldMapArea.cameraZ = Client.field782.vmethod8622(); // L: 4128
			if (Client.field781) { // L: 4129
				class17.cameraY = Client.field782.vmethod8618(); // L: 4130
			} else {
				class17.cameraY = class115.getTileHeight(Client.cameraX, WorldMapArea.cameraZ, class87.Client_plane) - Client.field782.vmethod8618(); // L: 4133
			}

			Client.field782.method8627(); // L: 4135
		}

		if (!Client.field780) { // L: 4137
			var0 = class148.field1663 * 16384 + 64; // L: 4138
			var1 = BufferedNetSocket.field4722 * 16384 + 64; // L: 4139
			var2 = class115.getTileHeight(var0, var1, class87.Client_plane) - class161.field1754; // L: 4140
			int var3 = var0 - Client.cameraX; // L: 4141
			int var4 = var2 - class17.cameraY; // L: 4142
			int var5 = var1 - WorldMapArea.cameraZ; // L: 4143
			int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5)); // L: 4144
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047; // L: 4145
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047; // L: 4146
			Projectile.method2184(var7, var8); // L: 4147
		} else {
			if (Client.field784 != null) { // L: 4150
				class365.cameraPitch = Client.field784.method8611(); // L: 4151
				class365.cameraPitch = Math.min(Math.max(class365.cameraPitch, 128), 383); // L: 4152
				Client.field784.method8627(); // L: 4153
			}

			if (Client.field783 != null) { // L: 4155
				DecorativeObject.cameraYaw = Client.field783.method8611() & 2047; // L: 4156
				Client.field783.method8627(); // L: 4157
			}
		}

	} // L: 4160
}
