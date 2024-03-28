import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ao")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("soundSystem")
	public static SoundSystem soundSystem;
	@ObfuscatedName("bz")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field283;
	@ObfuscatedName("ia")
	static int[] field290;
	@ObfuscatedName("ax")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -477975923
	)
	int field272;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 267391531349526727L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 150500267
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -24065233
	)
	public int field270;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -925982767
	)
	int field280;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 1433110650917121645L
	)
	long field277;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1806952535
	)
	int field278;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 493066387
	)
	int field275;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1948163787
	)
	int field286;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 6302391860379089589L
	)
	long field281;
	@ObfuscatedName("ak")
	boolean field282;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 951407123
	)
	int field279;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	PcmStream[] field284;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Lba;"
	)
	PcmStream[] field285;

	public PcmPlayer() {
		this.field272 = 32; // L: 22
		this.timeMs = VerticalAlignment.method3924(); // L: 23
		this.field277 = 0L; // L: 27
		this.field278 = 0; // L: 28
		this.field275 = 0; // L: 29
		this.field286 = 0; // L: 30
		this.field281 = 0L; // L: 31
		this.field282 = true; // L: 32
		this.field279 = 0; // L: 38
		this.field284 = new PcmStream[8]; // L: 39
		this.field285 = new PcmStream[8]; // L: 40
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1163974499"
	)
	@Export("init")
	public void init() throws Exception {
	} // L: 244

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1133626633"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	} // L: 245

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350442159"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 248
	}

	@ObfuscatedName("at")
	@Export("write")
	protected void write() throws Exception {
	} // L: 251

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "483569760"
	)
	@Export("close")
	protected void close() {
	} // L: 252

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-10789"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 253

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)V",
		garbageValue = "-1593114865"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 43
	} // L: 44

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 47
			long var1 = VerticalAlignment.method3924(); // L: 48

			try {
				if (this.field277 != 0L) { // L: 50
					if (var1 < this.field277) { // L: 51
						return;
					}

					this.open(this.capacity); // L: 52
					this.field277 = 0L; // L: 53
					this.field282 = true; // L: 54
				}

				int var3 = this.position(); // L: 56
				if (this.field286 - var3 > this.field278) { // L: 57
					this.field278 = this.field286 - var3;
				}

				int var4 = this.field280 + this.field270; // L: 58
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
					this.field282 = true; // L: 66
					if (var4 + 256 > this.capacity) { // L: 67
						var4 = this.capacity - 256; // L: 68
						this.field280 = var4 - this.field270; // L: 69
					}
				}

				while (var3 < var4) { // L: 72
					this.fill(this.samples, 256); // L: 73
					this.write(); // L: 74
					var3 += 256; // L: 75
				}

				if (var1 > this.field281) { // L: 77
					if (!this.field282) { // L: 78
						if (this.field278 == 0 && this.field275 == 0) { // L: 79
							this.close(); // L: 80
							this.field277 = 2000L + var1; // L: 81
							return; // L: 82
						}

						this.field280 = Math.min(this.field275, this.field278); // L: 84
						this.field275 = this.field278;
					} else {
						this.field282 = false; // L: 87
					}

					this.field278 = 0; // L: 88
					this.field281 = var1 + 2000L; // L: 89
				}

				this.field286 = var3; // L: 91
			} catch (Exception var7) { // L: 93
				this.close(); // L: 94
				this.field277 = var1 + 2000L; // L: 95
			}

			try {
				if (var1 > this.timeMs + 500000L) { // L: 98
					var1 = this.timeMs;
				}

				while (var1 > this.timeMs + 5000L) { // L: 99
					this.skip(256); // L: 100
					this.timeMs += (long)(256000 / (class472.field4892 * 722468864)); // L: 101
				}
			} catch (Exception var6) { // L: 104
				this.timeMs = var1; // L: 105
			}

		}
	} // L: 107

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1814436740"
	)
	public final void method763() {
		this.field282 = true; // L: 110
	} // L: 111

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-422429694"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field282 = true; // L: 114

		try {
			this.discard(); // L: 116
		} catch (Exception var2) { // L: 118
			this.close(); // L: 119
			this.field277 = VerticalAlignment.method3924() + 2000L; // L: 120
		}

	} // L: 122

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
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
				class142.soundSystemExecutor.shutdownNow(); // L: 132
				class142.soundSystemExecutor = null; // L: 133
				soundSystem = null; // L: 134
			}
		}

		this.close(); // L: 137
		this.samples = null; // L: 138
	} // L: 139

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1197021655"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field279 -= var1; // L: 142
		if (this.field279 < 0) {
			this.field279 = 0; // L: 143
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 144
		}

	} // L: 145

	@ObfuscatedName("bz")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 149
		if (PcmPlayer_stereo) { // L: 150
			var3 = var2 << 1;
		}

		class429.clearIntArray(var1, 0, var3); // L: 151
		this.field279 -= var2; // L: 152
		if (this.stream != null && this.field279 <= 0) { // L: 153
			this.field279 += class472.field4892 * 722468864 >> 4; // L: 154
			class333.PcmStream_disable(this.stream); // L: 155
			this.method760(this.stream, this.stream.vmethod1015()); // L: 156
			int var4 = 0; // L: 157
			int var5 = 255; // L: 158

			int var6;
			PcmStream var10;
			label110:
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
						PcmStream var11 = this.field284[var7]; // L: 180

						label104:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 181
									break label104;
								}

								AbstractSound var12 = var11.sound; // L: 182
								if (var12 != null && var12.position > var8) { // L: 183
									var5 |= 1 << var7; // L: 184
									var10 = var11; // L: 185
									var11 = var11.after; // L: 186
								} else {
									var11.active = true; // L: 189
									int var13 = var11.vmethod6214(); // L: 190
									var4 += var13; // L: 191
									if (var12 != null) { // L: 192
										var12.position += var13;
									}

									if (var4 >= this.field272) { // L: 193
										break label110;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 194
									if (var14 != null) { // L: 195
										for (int var15 = var11.field344; var14 != null; var14 = var11.nextSubStream()) { // L: 196 197 199
											this.method760(var14, var15 * var14.vmethod1015() >> 8); // L: 198
										}
									}

									PcmStream var18 = var11.after; // L: 202
									var11.after = null; // L: 203
									if (var10 == null) { // L: 204
										this.field284[var7] = var18;
									} else {
										var10.after = var18; // L: 205
									}

									if (var18 == null) { // L: 206
										this.field285[var7] = var10;
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
				PcmStream var16 = this.field284[var6]; // L: 212
				PcmStream[] var17 = this.field284; // L: 213
				this.field285[var6] = null; // L: 215

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 216 217 220
					var10 = var16.after; // L: 218
					var16.after = null; // L: 219
				}
			}
		}

		if (this.field279 < 0) { // L: 224
			this.field279 = 0;
		}

		if (this.stream != null) { // L: 225
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = VerticalAlignment.method3924(); // L: 226
	} // L: 227

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lba;II)V",
		garbageValue = "1415944306"
	)
	final void method760(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 236
		PcmStream var4 = this.field285[var3]; // L: 237
		if (var4 == null) { // L: 238
			this.field284[var3] = var1;
		} else {
			var4.after = var1; // L: 239
		}

		this.field285[var3] = var1; // L: 240
		var1.field344 = var2; // L: 241
	} // L: 242

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1962789961"
	)
	public static void method799() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 85
	} // L: 86

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)I",
		garbageValue = "113"
	)
	static int method752(Widget var0) {
		if (var0.type != 11) { // L: 1594
			--AbstractWorldMapIcon.Interpreter_stringStackSize; // L: 1595
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = -1; // L: 1596
			return 1; // L: 1597
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 1599
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var0.method6670(var1); // L: 1600
			return 1; // L: 1601
		}
	}
}
