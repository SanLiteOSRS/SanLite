import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("w")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("ht")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("g")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1070483423
	)
	int field289;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -7636460397969717259L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1836093347
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -756570525
	)
	int field290;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1043855905
	)
	int field296;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -1277459700016021033L
	)
	long field297;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1619668637
	)
	int field298;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -937790393
	)
	int field287;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 689589807
	)
	int field300;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = -2276824281352982551L
	)
	long field301;
	@ObfuscatedName("m")
	boolean field292;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 752389737
	)
	int field303;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lae;"
	)
	PcmStream[] field304;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lae;"
	)
	PcmStream[] field305;

	protected PcmPlayer() {
		this.field289 = 32; // L: 22
		this.timeMs = class131.method2916(); // L: 23
		this.field297 = 0L; // L: 27
		this.field298 = 0; // L: 28
		this.field287 = 0; // L: 29
		this.field300 = 0; // L: 30
		this.field301 = 0L; // L: 31
		this.field292 = true; // L: 32
		this.field303 = 0; // L: 38
		this.field304 = new PcmStream[8]; // L: 39
		this.field305 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1912003377"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 280

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-870519251"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 281

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1295373245"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 284
	}

	@ObfuscatedName("u")
	@Export("write")
	protected void write() throws Exception {
	} // L: 287

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	@Export("close")
	protected void close() {
	} // L: 288

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 289

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lae;I)V",
		garbageValue = "-1114112408"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 79
	} // L: 80

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 83
			long var1 = class131.method2916(); // L: 84

			try {
				if (0L != this.field297) { // L: 86
					if (var1 < this.field297) { // L: 87
						return;
					}

					this.open(this.capacity); // L: 88
					this.field297 = 0L; // L: 89
					this.field292 = true; // L: 90
				}

				int var3 = this.position(); // L: 92
				if (this.field300 - var3 > this.field298) { // L: 93
					this.field298 = this.field300 - var3;
				}

				int var4 = this.field296 + this.field290; // L: 94
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
					this.field292 = true; // L: 102
					if (var4 + 256 > this.capacity) { // L: 103
						var4 = this.capacity - 256; // L: 104
						this.field296 = var4 - this.field290; // L: 105
					}
				}

				while (var3 < var4) { // L: 108
					this.fill(this.samples, 256); // L: 109
					this.write(); // L: 110
					var3 += 256; // L: 111
				}

				if (var1 > this.field301) { // L: 113
					if (!this.field292) { // L: 114
						if (this.field298 == 0 && this.field287 == 0) { // L: 115
							this.close(); // L: 116
							this.field297 = var1 + 2000L; // L: 117
							return; // L: 118
						}

						this.field296 = Math.min(this.field287, this.field298); // L: 120
						this.field287 = this.field298; // L: 121
					} else {
						this.field292 = false; // L: 123
					}

					this.field298 = 0; // L: 124
					this.field301 = 2000L + var1; // L: 125
				}

				this.field300 = var3; // L: 127
			} catch (Exception var7) { // L: 129
				this.close(); // L: 130
				this.field297 = var1 + 2000L; // L: 131
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 134
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 135
					this.skip(256); // L: 136
					this.timeMs += (long)(256000 / class301.field3595); // L: 137
				}
			} catch (Exception var6) { // L: 140
				this.timeMs = var1; // L: 141
			}

		}
	} // L: 143

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-627992854"
	)
	public final void method698() {
		this.field292 = true; // L: 146
	} // L: 147

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1004120734"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field292 = true; // L: 150

		try {
			this.discard(); // L: 152
		} catch (Exception var2) { // L: 154
			this.close(); // L: 155
			this.field297 = class131.method2916() + 2000L; // L: 156
		}

	} // L: 158

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1917315609"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 161
			boolean var1 = true; // L: 162

			for (int var2 = 0; var2 < 2; ++var2) { // L: 163
				if (this == soundSystem.players[var2]) { // L: 164
					soundSystem.players[var2] = null;
				}

				if (soundSystem.players[var2] != null) { // L: 165
					var1 = false;
				}
			}

			if (var1) { // L: 167
				Messages.soundSystemExecutor.shutdownNow(); // L: 168
				Messages.soundSystemExecutor = null; // L: 169
				soundSystem = null; // L: 170
			}
		}

		this.close(); // L: 173
		this.samples = null; // L: 174
	} // L: 175

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1638389721"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field303 -= var1; // L: 178
		if (this.field303 < 0) {
			this.field303 = 0; // L: 179
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 180
		}

	} // L: 181

	@ObfuscatedName("au")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 185
		if (PcmPlayer_stereo) { // L: 186
			var3 = var2 << 1;
		}

		class351.clearIntArray(var1, 0, var3); // L: 187
		this.field303 -= var2; // L: 188
		if (this.stream != null && this.field303 <= 0) { // L: 189
			this.field303 += class301.field3595 >> 4; // L: 190
			class346.PcmStream_disable(this.stream); // L: 191
			this.method721(this.stream, this.stream.vmethod959()); // L: 192
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
						PcmStream var11 = this.field304[var7]; // L: 216

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
									int var13 = var11.vmethod5453(); // L: 226
									var4 += var13; // L: 227
									if (var12 != null) {
										var12.position += var13; // L: 228
									}

									if (var4 >= this.field289) { // L: 229
										break label107;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 230
									if (var14 != null) { // L: 231
										for (int var15 = var11.field354; var14 != null; var14 = var11.nextSubStream()) { // L: 232 233 235
											this.method721(var14, var15 * var14.vmethod959() >> 8); // L: 234
										}
									}

									PcmStream var18 = var11.after; // L: 238
									var11.after = null; // L: 239
									if (var10 == null) { // L: 240
										this.field304[var7] = var18;
									} else {
										var10.after = var18; // L: 241
									}

									if (var18 == null) { // L: 242
										this.field305[var7] = var10;
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
				PcmStream var16 = this.field304[var6]; // L: 248
				PcmStream[] var17 = this.field304; // L: 249
				this.field305[var6] = null; // L: 251

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 252 253 256
					var10 = var16.after; // L: 254
					var16.after = null; // L: 255
				}
			}
		}

		if (this.field303 < 0) { // L: 260
			this.field303 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 261
		}

		this.timeMs = class131.method2916(); // L: 262
	} // L: 263

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lae;II)V",
		garbageValue = "-1010174146"
	)
	final void method721(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 272
		PcmStream var4 = this.field305[var3]; // L: 273
		if (var4 == null) { // L: 274
			this.field304[var3] = var1;
		} else {
			var4.after = var1; // L: 275
		}

		this.field305[var3] = var1; // L: 276
		var1.field354 = var2; // L: 277
	} // L: 278

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1786212767"
	)
	static final void method751(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field541; ++var1) { // L: 8170
			int var2 = Client.field729[var1]; // L: 8171
			NPC var3 = Client.npcs[var2]; // L: 8172
			int var4 = var0.readUnsignedByte(); // L: 8173
			int var5;
			if (ScriptFrame.field462 && (var4 & 2) != 0) { // L: 8174
				var5 = var0.readUnsignedByte(); // L: 8175
				var4 += var5 << 8; // L: 8176
			}

			if ((var4 & 64) != 0) { // L: 8178
				var3.targetIndex = var0.readUnsignedShort(); // L: 8179
				if (var3.targetIndex == 65535) { // L: 8180
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 256) != 0) { // L: 8182
				var3.method2412(var0.readStringCp1252NullTerminated()); // L: 8183
			}

			int var6;
			int var7;
			if ((var4 & 8) != 0) { // L: 8185
				var5 = var0.method7741(); // L: 8186
				if (var5 == 65535) { // L: 8187
					var5 = -1; // L: 8188
				}

				var6 = var0.method7766(); // L: 8190
				if (var5 == var3.sequence && var5 != -1) { // L: 8191
					var7 = class14.SequenceDefinition_get(var5).field2175; // L: 8192
					if (var7 == 1) { // L: 8193
						var3.sequenceFrame = 0; // L: 8194
						var3.sequenceFrameCycle = 0; // L: 8195
						var3.sequenceDelay = var6; // L: 8196
						var3.field1174 = 0; // L: 8197
					}

					if (var7 == 2) { // L: 8199
						var3.field1174 = 0; // L: 8200
					}
				} else if (var5 == -1 || var3.sequence == -1 || class14.SequenceDefinition_get(var5).field2168 >= class14.SequenceDefinition_get(var3.sequence).field2168) { // L: 8203
					var3.sequence = var5; // L: 8204
					var3.sequenceFrame = 0; // L: 8205
					var3.sequenceFrameCycle = 0; // L: 8206
					var3.sequenceDelay = var6; // L: 8207
					var3.field1174 = 0; // L: 8208
					var3.field1203 = var3.pathLength; // L: 8209
				}
			}

			if ((var4 & 16) != 0) { // L: 8213
				var3.definition = class125.getNpcDefinition(var0.method7776()); // L: 8214
				var3.field1202 = var3.definition.size; // L: 8215
				var3.field1197 = var3.definition.rotation; // L: 8216
				var3.walkSequence = var3.definition.walkSequence; // L: 8217
				var3.walkBackSequence = var3.definition.walkBackSequence; // L: 8218
				var3.walkLeftSequence = var3.definition.walkLeftSequence; // L: 8219
				var3.walkRightSequence = var3.definition.walkRightSequence; // L: 8220
				var3.idleSequence = var3.definition.idleSequence; // L: 8221
				var3.turnLeftSequence = var3.definition.turnLeftSequence; // L: 8222
				var3.turnRightSequence = var3.definition.turnRightSequence; // L: 8223
			}

			if ((var4 & 32) != 0) { // L: 8225
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 8226
				var3.overheadTextCyclesRemaining = 100; // L: 8227
			}

			int var8;
			if ((var4 & 4) != 0) { // L: 8229
				var5 = var0.method7774(); // L: 8230
				var6 = var0.method7774(); // L: 8231
				if (ScriptFrame.field462) { // L: 8232
					var3.field1152 = var0.readUnsignedByte() == 1; // L: 8233
				}

				var7 = var3.x - (var5 - class300.baseX * 64 - class300.baseX * 64) * 64; // L: 8235
				var8 = var3.y - (var6 - Message.baseY * 64 - Message.baseY * 64) * 64; // L: 8236
				if (var7 != 0 || var8 != 0) { // L: 8237
					var3.field1164 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 128) != 0) { // L: 8239
				var5 = var0.method7908(); // L: 8240
				int var9;
				int var10;
				int var11;
				if (var5 > 0) { // L: 8241
					for (var6 = 0; var6 < var5; ++var6) { // L: 8242
						var8 = -1; // L: 8244
						var9 = -1; // L: 8245
						var10 = -1; // L: 8246
						var7 = var0.readUShortSmart(); // L: 8247
						if (var7 == 32767) { // L: 8248
							var7 = var0.readUShortSmart(); // L: 8249
							var9 = var0.readUShortSmart(); // L: 8250
							var8 = var0.readUShortSmart(); // L: 8251
							var10 = var0.readUShortSmart(); // L: 8252
						} else if (var7 != 32766) { // L: 8254
							var9 = var0.readUShortSmart(); // L: 8255
						} else {
							var7 = -1; // L: 8257
						}

						var11 = var0.readUShortSmart(); // L: 8258
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 8259
					}
				}

				var6 = var0.readUnsignedByte(); // L: 8262
				if (var6 > 0) { // L: 8263
					for (var7 = 0; var7 < var6; ++var7) { // L: 8264
						var8 = var0.readUShortSmart(); // L: 8265
						var9 = var0.readUShortSmart(); // L: 8266
						if (var9 != 32767) { // L: 8267
							var10 = var0.readUShortSmart(); // L: 8268
							var11 = var0.method7766(); // L: 8269
							int var12 = var9 > 0 ? var0.method7908() : var11; // L: 8270
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8271
						} else {
							var3.removeHealthBar(var8); // L: 8273
						}
					}
				}
			}

			if ((var4 & 1) != 0) { // L: 8277
				var3.spotAnimation = var0.method7774(); // L: 8278
				var5 = var0.method7787(); // L: 8279
				var3.field1128 = var5 >> 16; // L: 8280
				var3.field1178 = (var5 & 65535) + Client.cycle; // L: 8281
				var3.spotAnimationFrame = 0; // L: 8282
				var3.field1201 = 0; // L: 8283
				if (var3.field1178 > Client.cycle) { // L: 8284
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 8285
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 1024) != 0) { // L: 8287
				var3.field1189 = Client.cycle + var0.method7774(); // L: 8288
				var3.field1136 = Client.cycle + var0.readUnsignedShort(); // L: 8289
				var3.field1191 = var0.method7768(); // L: 8290
				var3.field1168 = var0.readByte(); // L: 8291
				var3.field1193 = var0.readByte(); // L: 8292
				var3.field1184 = (byte)var0.method7908(); // L: 8293
			}

			if (ScriptFrame.field462 && (var4 & 512) != 0 || !ScriptFrame.field462 && (var4 & 2) != 0) { // L: 8295
				var3.field1177 = var0.method7769(); // L: 8296
				var3.field1182 = var0.method7743(); // L: 8297
				var3.field1188 = var0.method7769(); // L: 8298
				var3.field1183 = var0.readByte(); // L: 8299
				var3.field1194 = var0.method7776() + Client.cycle; // L: 8300
				var3.field1166 = var0.method7776() + Client.cycle; // L: 8301
				var3.field1186 = var0.method7776(); // L: 8302
				var3.pathLength = 1; // L: 8303
				var3.field1203 = 0; // L: 8304
				var3.field1177 += var3.pathX[0]; // L: 8305
				var3.field1182 += var3.pathY[0]; // L: 8306
				var3.field1188 += var3.pathX[0]; // L: 8307
				var3.field1183 += var3.pathY[0]; // L: 8308
			}

			if ((var4 & 2048) != 0) { // L: 8310
				var3.field1204 = var0.method7787(); // L: 8311
			}
		}

	} // L: 8314
}
