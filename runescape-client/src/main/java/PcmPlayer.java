import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 125222871
	)
	public static int field314;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -2102660149
	)
	static int field299;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 334530779
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("ax")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 61437835
	)
	int field301;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -977548067956458725L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1972567701
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -440082657
	)
	public int field304;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1827602467
	)
	int field305;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 283027201097119447L
	)
	long field306;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -205332835
	)
	int field307;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 835819537
	)
	int field317;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1967460671
	)
	int field309;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 7219484143483602389L
	)
	long field310;
	@ObfuscatedName("al")
	boolean field308;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -18718451
	)
	int field313;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field296;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "[Lby;"
	)
	PcmStream[] field312;

	public PcmPlayer() {
		this.field301 = 32; // L: 22
		this.timeMs = class113.method2835(); // L: 23
		this.field306 = 0L; // L: 27
		this.field307 = 0; // L: 28
		this.field317 = 0; // L: 29
		this.field309 = 0; // L: 30
		this.field310 = 0L; // L: 31
		this.field308 = true; // L: 32
		this.field313 = 0; // L: 38
		this.field296 = new PcmStream[8]; // L: 39
		this.field312 = new PcmStream[8]; // L: 40
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-27916"
	)
	@Export("init")
	public void init() throws Exception {
	} // L: 255

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1387208790"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	} // L: 256

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-110"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 259
	}

	@ObfuscatedName("am")
	@Export("write")
	protected void write() throws Exception {
	} // L: 262

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1310720179"
	)
	@Export("close")
	protected void close() {
	} // L: 263

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294273793"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 264

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lby;B)V",
		garbageValue = "46"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 54
	} // L: 55

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1561448166"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 58
			long var1 = class113.method2835(); // L: 59

			try {
				if (this.field306 != 0L) { // L: 61
					if (var1 < this.field306) { // L: 62
						return;
					}

					this.open(this.capacity); // L: 63
					this.field306 = 0L; // L: 64
					this.field308 = true; // L: 65
				}

				int var3 = this.position(); // L: 67
				if (this.field309 - var3 > this.field307) { // L: 68
					this.field307 = this.field309 - var3;
				}

				int var4 = this.field305 + this.field304; // L: 69
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
					this.field308 = true; // L: 77
					if (var4 + 256 > this.capacity) { // L: 78
						var4 = this.capacity - 256; // L: 79
						this.field305 = var4 - this.field304; // L: 80
					}
				}

				while (var3 < var4) { // L: 83
					this.fill(this.samples, 256); // L: 84
					this.write(); // L: 85
					var3 += 256; // L: 86
				}

				if (var1 > this.field310) { // L: 88
					if (!this.field308) { // L: 89
						if (this.field307 == 0 && this.field317 == 0) { // L: 90
							this.close(); // L: 91
							this.field306 = var1 + 2000L; // L: 92
							return; // L: 93
						}

						this.field305 = Math.min(this.field317, this.field307); // L: 95
						this.field317 = this.field307; // L: 96
					} else {
						this.field308 = false; // L: 98
					}

					this.field307 = 0; // L: 99
					this.field310 = 2000L + var1; // L: 100
				}

				this.field309 = var3; // L: 102
			} catch (Exception var7) { // L: 104
				this.close(); // L: 105
				this.field306 = var1 + 2000L; // L: 106
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 109
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 110
					this.skip(256); // L: 111
					this.timeMs += (long)(256000 / field314); // L: 112
				}
			} catch (Exception var6) { // L: 115
				this.timeMs = var1; // L: 116
			}

		}
	} // L: 118

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1629205695"
	)
	public final void method783() {
		this.field308 = true; // L: 121
	} // L: 122

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2090417340"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field308 = true; // L: 125

		try {
			this.discard(); // L: 127
		} catch (Exception var2) {
			this.close();
			this.field306 = class113.method2835() + 2000L;
		}

	} // L: 133

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1796457673"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (WorldMapSectionType.soundSystem != null) { // L: 136
			boolean var1 = true; // L: 137

			for (int var2 = 0; var2 < 2; ++var2) { // L: 138
				if (this == WorldMapSectionType.soundSystem.players[var2]) { // L: 139
					WorldMapSectionType.soundSystem.players[var2] = null;
				}

				if (WorldMapSectionType.soundSystem.players[var2] != null) { // L: 140
					var1 = false;
				}
			}

			if (var1) { // L: 142
				class273.soundSystemExecutor.shutdownNow(); // L: 143
				class273.soundSystemExecutor = null; // L: 144
				WorldMapSectionType.soundSystem = null; // L: 145
			}
		}

		this.close(); // L: 148
		this.samples = null; // L: 149
	} // L: 150

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "75"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field313 -= var1; // L: 153
		if (this.field313 < 0) {
			this.field313 = 0; // L: 154
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 155
		}

	} // L: 156

	@ObfuscatedName("ba")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 160
		if (class373.PcmPlayer_stereo) { // L: 161
			var3 = var2 << 1;
		}

		class410.clearIntArray(var1, 0, var3); // L: 162
		this.field313 -= var2; // L: 163
		if (this.stream != null && this.field313 <= 0) { // L: 164
			this.field313 += field314 >> 4; // L: 165
			class345.PcmStream_disable(this.stream); // L: 166
			this.method788(this.stream, this.stream.vmethod1051()); // L: 167
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
									int var13 = var11.vmethod6028(); // L: 201
									var4 += var13; // L: 202
									if (var12 != null) {
										var12.position += var13; // L: 203
									}

									if (var4 >= this.field301) { // L: 204
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 205
									if (var14 != null) { // L: 206
										for (int var15 = var11.field376; var14 != null; var14 = var11.nextSubStream()) { // L: 207 208 210
											this.method788(var14, var15 * var14.vmethod1051() >> 8); // L: 209
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
										this.field312[var7] = var10;
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
				this.field312[var6] = null; // L: 226

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 227 228 231
					var10 = var16.after; // L: 229
					var16.after = null; // L: 230
				}
			}
		}

		if (this.field313 < 0) { // L: 235
			this.field313 = 0;
		}

		if (this.stream != null) { // L: 236
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = class113.method2835(); // L: 237
	} // L: 238

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lby;II)V",
		garbageValue = "702268738"
	)
	final void method788(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 247
		PcmStream var4 = this.field312[var3];
		if (var4 == null) {
			this.field296[var3] = var1;
		} else {
			var4.after = var1;
		}

		this.field312[var3] = var1; // L: 251
		var1.field376 = var2; // L: 252
	} // L: 253

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Luu;",
		garbageValue = "1707988592"
	)
	static IndexedSprite method780(boolean var0, boolean var1) {
		return var0 ? (var1 ? Message.field504 : class11.field63) : (var1 ? class4.field10 : WorldMapLabelSize.field2862); // L: 250
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lcr;",
		garbageValue = "1"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 248
		return class419.getNextWorldListWorld(); // L: 249
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "1"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 128
		int var2 = 0; // L: 129

		for (int var3 = 0; var3 < var1; ++var3) { // L: 130
			var2 = (var2 << 5) - var2 + class313.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 131
	}
}
