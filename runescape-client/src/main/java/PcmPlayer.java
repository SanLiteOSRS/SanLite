import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("ab")
	public static int field275;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -259350243
	)
	public static int field266;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field281;
	@ObfuscatedName("as")
	@Export("samples")
	public int[] samples;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1988628851
	)
	int field271;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -231391675110677647L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1302720391
	)
	@Export("capacity")
	public int capacity;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1205498269
	)
	public int field272;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 656213455
	)
	int field267;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 7824561401735037233L
	)
	long field276;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 28096255
	)
	int field274;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1740635577
	)
	int field264;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1444849327
	)
	int field279;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 8910830171002284323L
	)
	long field280;
	@ObfuscatedName("af")
	boolean field269;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 223547587
	)
	int field282;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	PcmStream[] field283;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	PcmStream[] field284;

	public PcmPlayer() {
		this.field271 = 32;
		this.timeMs = SpotAnimationDefinition.method3775(); // L: 23
		this.field276 = 0L; // L: 27
		this.field274 = 0; // L: 28
		this.field264 = 0; // L: 29
		this.field279 = 0; // L: 30
		this.field280 = 0L; // L: 31
		this.field269 = true; // L: 32
		this.field282 = 0; // L: 38
		this.field283 = new PcmStream[8]; // L: 39
		this.field284 = new PcmStream[8]; // L: 40
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	@Export("init")
	public void init() throws Exception {
	} // L: 244

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "851046877"
	)
	@Export("open")
	public void open(int var1) throws Exception {
	} // L: 245

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-79725090"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 248
	}

	@ObfuscatedName("ao")
	@Export("write")
	protected void write() throws Exception {
	} // L: 251

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1254913818"
	)
	@Export("close")
	protected void close() {
	} // L: 252

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-264971545"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 253

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lbk;B)V",
		garbageValue = "32"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 43
	} // L: 44

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1871006724"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 47
			long var1 = SpotAnimationDefinition.method3775(); // L: 48

			try {
				if (0L != this.field276) { // L: 50
					if (var1 < this.field276) { // L: 51
						return;
					}

					this.open(this.capacity); // L: 52
					this.field276 = 0L; // L: 53
					this.field269 = true; // L: 54
				}

				int var3 = this.position(); // L: 56
				if (this.field279 - var3 > this.field274) { // L: 57
					this.field274 = this.field279 - var3;
				}

				int var4 = this.field272 + this.field267; // L: 58
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
					this.field269 = true; // L: 66
					if (var4 + 256 > this.capacity) { // L: 67
						var4 = this.capacity - 256; // L: 68
						this.field267 = var4 - this.field272; // L: 69
					}
				}

				while (var3 < var4) { // L: 72
					this.fill(this.samples, 256); // L: 73
					this.write(); // L: 74
					var3 += 256; // L: 75
				}

				if (var1 > this.field280) { // L: 77
					if (!this.field269) { // L: 78
						if (this.field274 == 0 && this.field264 == 0) { // L: 79
							this.close(); // L: 80
							this.field276 = 2000L + var1; // L: 81
							return; // L: 82
						}

						this.field267 = Math.min(this.field264, this.field274); // L: 84
						this.field264 = this.field274; // L: 85
					} else {
						this.field269 = false; // L: 87
					}

					this.field274 = 0; // L: 88
					this.field280 = var1 + 2000L; // L: 89
				}

				this.field279 = var3; // L: 91
			} catch (Exception var7) { // L: 93
				this.close(); // L: 94
				this.field276 = 2000L + var1; // L: 95
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 98
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 99
					this.skip(256); // L: 100
					this.timeMs += (long)(256000 / (field275 * 1019137945)); // L: 101
				}
			} catch (Exception var6) { // L: 104
				this.timeMs = var1; // L: 105
			}

		}
	} // L: 107

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-440619545"
	)
	public final void method795() {
		this.field269 = true; // L: 110
	} // L: 111

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2108187094"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field269 = true; // L: 114

		try {
			this.discard(); // L: 116
		} catch (Exception var2) { // L: 118
			this.close(); // L: 119
			this.field276 = SpotAnimationDefinition.method3775() + 2000L; // L: 120
		}

	} // L: 122

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "592900977"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (class414.soundSystem != null) { // L: 125
			boolean var1 = true; // L: 126

			for (int var2 = 0; var2 < 2; ++var2) { // L: 127
				if (this == class414.soundSystem.players[var2]) { // L: 128
					class414.soundSystem.players[var2] = null;
				}

				if (class414.soundSystem.players[var2] != null) { // L: 129
					var1 = false;
				}
			}

			if (var1) { // L: 131
				class342.soundSystemExecutor.shutdownNow(); // L: 132
				class342.soundSystemExecutor = null; // L: 133
				class414.soundSystem = null; // L: 134
			}
		}

		this.close(); // L: 137
		this.samples = null; // L: 138
	} // L: 139

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-120"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field282 -= var1; // L: 142
		if (this.field282 < 0) {
			this.field282 = 0; // L: 143
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 144
		}

	} // L: 145

	@ObfuscatedName("bi")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 149
		if (WorldMapRectangle.PcmPlayer_stereo) { // L: 150
			var3 = var2 << 1;
		}

		class421.clearIntArray(var1, 0, var3); // L: 151
		this.field282 -= var2; // L: 152
		if (this.stream != null && this.field282 <= 0) { // L: 153
			this.field282 += 1019137945 * field275 >> 4; // L: 154
			NPC.PcmStream_disable(this.stream); // L: 155
			this.method802(this.stream, this.stream.vmethod1046()); // L: 156
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
						PcmStream var11 = this.field283[var7]; // L: 180

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
									int var13 = var11.vmethod6210(); // L: 190
									var4 += var13; // L: 191
									if (var12 != null) {
										var12.position += var13; // L: 192
									}

									if (var4 >= this.field271) { // L: 193
										break label108;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 194
									if (var14 != null) { // L: 195
										for (int var15 = var11.field337; var14 != null; var14 = var11.nextSubStream()) { // L: 196 197 199
											this.method802(var14, var15 * var14.vmethod1046() >> 8); // L: 198
										}
									}

									PcmStream var18 = var11.after; // L: 202
									var11.after = null; // L: 203
									if (var10 == null) { // L: 204
										this.field283[var7] = var18;
									} else {
										var10.after = var18; // L: 205
									}

									if (var18 == null) { // L: 206
										this.field284[var7] = var10;
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
				PcmStream var16 = this.field283[var6]; // L: 212
				PcmStream[] var17 = this.field283; // L: 213
				this.field284[var6] = null; // L: 215

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 216 217 220
					var10 = var16.after; // L: 218
					var16.after = null; // L: 219
				}
			}
		}

		if (this.field282 < 0) { // L: 224
			this.field282 = 0;
		}

		if (this.stream != null) { // L: 225
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = SpotAnimationDefinition.method3775(); // L: 226
	} // L: 227

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lbk;IB)V",
		garbageValue = "39"
	)
	final void method802(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 236
		PcmStream var4 = this.field284[var3]; // L: 237
		if (var4 == null) { // L: 238
			this.field283[var3] = var1;
		} else {
			var4.after = var1; // L: 239
		}

		this.field284[var3] = var1; // L: 240
		var1.field337 = var2; // L: 241
	} // L: 242

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;Ljava/lang/String;B)I",
		garbageValue = "108"
	)
	public static int method847(Buffer var0, String var1) {
		int var2 = var0.offset; // L: 18
		byte[] var3 = MusicPatchPcmStream.method6233(var1); // L: 19
		var0.writeSmartByteShort(var3.length); // L: 20
		var0.offset += class350.huffman.compress(var3, 0, var3.length, var0.array, var0.offset); // L: 21
		return var0.offset - var2; // L: 22
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-54"
	)
	static void method846(int var0) {
		class174.tempMenuAction = new MenuAction(); // L: 12173
		class174.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 12174
		class174.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 12175
		class174.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 12176
		class174.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 12177
		class174.tempMenuAction.field882 = Client.field639[var0]; // L: 12178
		class174.tempMenuAction.field883 = Client.menuActions[var0]; // L: 12179
		class174.tempMenuAction.field881 = Client.menuTargets[var0]; // L: 12180
	} // L: 12181
}
