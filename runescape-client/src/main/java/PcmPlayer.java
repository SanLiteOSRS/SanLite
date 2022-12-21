import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("vd")
	static List field333;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 519516550
	)
	public static int field325;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("j")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("o")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1650041923
	)
	int field317;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 244756660672843037L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -492551753
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -354348965
	)
	int field320;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1338328461
	)
	int field312;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -341542258888666809L
	)
	long field322;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 742475801
	)
	int field323;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1012487413
	)
	int field324;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1158064801
	)
	int field329;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 8623637060416294591L
	)
	long field318;
	@ObfuscatedName("w")
	boolean field327;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2049685311
	)
	int field328;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Laa;"
	)
	PcmStream[] field321;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Laa;"
	)
	PcmStream[] field330;

	protected PcmPlayer() {
		this.field317 = 32; // L: 22
		this.timeMs = Message.method1197(); // L: 23
		this.field322 = 0L; // L: 27
		this.field323 = 0; // L: 28
		this.field324 = 0; // L: 29
		this.field329 = 0; // L: 30
		this.field318 = 0L; // L: 31
		this.field327 = true; // L: 32
		this.field328 = 0; // L: 38
		this.field321 = new PcmStream[8]; // L: 39
		this.field330 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1022018312"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 273

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-95"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 274

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "116"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 277
	}

	@ObfuscatedName("x")
	@Export("write")
	protected void write() throws Exception {
	} // L: 280

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-126"
	)
	@Export("close")
	protected void close() {
	} // L: 281

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1458227244"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 282

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Laa;I)V",
		garbageValue = "-2127499053"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 72
	} // L: 73

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-431761037"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 76
			long var1 = Message.method1197(); // L: 77

			try {
				if (0L != this.field322) { // L: 79
					if (var1 < this.field322) { // L: 80
						return;
					}

					this.open(this.capacity); // L: 81
					this.field322 = 0L; // L: 82
					this.field327 = true; // L: 83
				}

				int var3 = this.position(); // L: 85
				if (this.field329 - var3 > this.field323) { // L: 86
					this.field323 = this.field329 - var3;
				}

				int var4 = this.field312 + this.field320; // L: 87
				if (var4 + 256 > 16384) { // L: 88
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 89
					this.capacity += 1024; // L: 90
					if (this.capacity > 16384) { // L: 91
						this.capacity = 16384;
					}

					this.close(); // L: 92
					this.open(this.capacity); // L: 93
					var3 = 0; // L: 94
					this.field327 = true; // L: 95
					if (var4 + 256 > this.capacity) { // L: 96
						var4 = this.capacity - 256; // L: 97
						this.field312 = var4 - this.field320; // L: 98
					}
				}

				while (var3 < var4) { // L: 101
					this.fill(this.samples, 256); // L: 102
					this.write(); // L: 103
					var3 += 256; // L: 104
				}

				if (var1 > this.field318) { // L: 106
					if (!this.field327) { // L: 107
						if (this.field323 == 0 && this.field324 == 0) { // L: 108
							this.close(); // L: 109
							this.field322 = 2000L + var1; // L: 110
							return; // L: 111
						}

						this.field312 = Math.min(this.field324, this.field323); // L: 113
						this.field324 = this.field323; // L: 114
					} else {
						this.field327 = false; // L: 116
					}

					this.field323 = 0; // L: 117
					this.field318 = 2000L + var1; // L: 118
				}

				this.field329 = var3; // L: 120
			} catch (Exception var7) { // L: 122
				this.close(); // L: 123
				this.field322 = var1 + 2000L; // L: 124
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 127
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 128
					this.skip(256); // L: 129
					this.timeMs += (long)(256000 / (field325 * 22050)); // L: 130
				}
			} catch (Exception var6) { // L: 133
				this.timeMs = var1; // L: 134
			}

		}
	} // L: 136

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2068894886"
	)
	public final void method817() {
		this.field327 = true; // L: 139
	} // L: 140

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-54"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field327 = true; // L: 143

		try {
			this.discard(); // L: 145
		} catch (Exception var2) { // L: 147
			this.close(); // L: 148
			this.field322 = Message.method1197() + 2000L; // L: 149
		}

	} // L: 151

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1880345802"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 154
			boolean var1 = true; // L: 155

			for (int var2 = 0; var2 < 2; ++var2) { // L: 156
				if (this == soundSystem.players[var2]) { // L: 157
					soundSystem.players[var2] = null;
				}

				if (soundSystem.players[var2] != null) { // L: 158
					var1 = false;
				}
			}

			if (var1) { // L: 160
				class11.soundSystemExecutor.shutdownNow(); // L: 161
				class11.soundSystemExecutor = null; // L: 162
				soundSystem = null; // L: 163
			}
		}

		this.close(); // L: 166
		this.samples = null; // L: 167
	} // L: 168

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "434161889"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field328 -= var1; // L: 171
		if (this.field328 < 0) {
			this.field328 = 0; // L: 172
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 173
		}

	} // L: 174

	@ObfuscatedName("an")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 178
		if (class286.PcmPlayer_stereo) { // L: 179
			var3 = var2 << 1;
		}

		class373.clearIntArray(var1, 0, var3); // L: 180
		this.field328 -= var2; // L: 181
		if (this.stream != null && this.field328 <= 0) { // L: 182
			this.field328 += field325 * 22050 >> 4; // L: 183
			GrandExchangeEvents.PcmStream_disable(this.stream); // L: 184
			this.method801(this.stream, this.stream.vmethod1052()); // L: 185
			int var4 = 0; // L: 186
			int var5 = 255; // L: 187

			int var6;
			PcmStream var10;
			label107:
			for (var6 = 7; var5 != 0; --var6) { // L: 188
				int var7;
				int var8;
				if (var6 < 0) { // L: 191
					var7 = var6 & 3; // L: 192
					var8 = -(var6 >> 2); // L: 193
				} else {
					var7 = var6; // L: 196
					var8 = 0; // L: 197
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 199 201
					if ((var9 & 1) != 0) { // L: 204
						var5 &= ~(1 << var7); // L: 207
						var10 = null; // L: 208
						PcmStream var11 = this.field321[var7]; // L: 209

						label101:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 210
									break label101;
								}

								AbstractSound var12 = var11.sound; // L: 211
								if (var12 != null && var12.position > var8) { // L: 212
									var5 |= 1 << var7; // L: 213
									var10 = var11; // L: 214
									var11 = var11.after; // L: 215
								} else {
									var11.active = true; // L: 218
									int var13 = var11.vmethod5753(); // L: 219
									var4 += var13; // L: 220
									if (var12 != null) { // L: 221
										var12.position += var13;
									}

									if (var4 >= this.field317) { // L: 222
										break label107;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 223
									if (var14 != null) { // L: 224
										for (int var15 = var11.field383; var14 != null; var14 = var11.nextSubStream()) { // L: 225 226 228
											this.method801(var14, var15 * var14.vmethod1052() >> 8); // L: 227
										}
									}

									PcmStream var18 = var11.after; // L: 231
									var11.after = null; // L: 232
									if (var10 == null) { // L: 233
										this.field321[var7] = var18;
									} else {
										var10.after = var18; // L: 234
									}

									if (var18 == null) { // L: 235
										this.field330[var7] = var10;
									}

									var11 = var18; // L: 236
								}
							}
						}
					}

					var7 += 4; // L: 200
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 240
				PcmStream var16 = this.field321[var6]; // L: 241
				PcmStream[] var17 = this.field321; // L: 242
				this.field330[var6] = null; // L: 244

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 245 246 249
					var10 = var16.after; // L: 247
					var16.after = null; // L: 248
				}
			}
		}

		if (this.field328 < 0) { // L: 253
			this.field328 = 0;
		}

		if (this.stream != null) {
			this.stream.fill(var1, 0, var2); // L: 254
		}

		this.timeMs = Message.method1197(); // L: 255
	} // L: 256

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Laa;II)V",
		garbageValue = "-2144008402"
	)
	final void method801(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 265
		PcmStream var4 = this.field330[var3]; // L: 266
		if (var4 == null) { // L: 267
			this.field321[var3] = var1;
		} else {
			var4.after = var1; // L: 268
		}

		this.field330[var3] = var1; // L: 269
		var1.field383 = var2; // L: 270
	} // L: 271

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "125"
	)
	static void method856(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9792
		int[] var3 = Players.Players_indices; // L: 9793
		boolean var4 = false; // L: 9794
		Username var5 = new Username(var1, SecureRandomFuture.loginType); // L: 9795

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9796
			Player var7 = Client.players[var3[var6]]; // L: 9797
			if (var7 != null && var7 != class155.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9798
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9799
					var8 = class136.getPacketBufferNode(ClientPacket.field3091, Client.packetWriter.isaacCipher); // L: 9801
					var8.packetBuffer.writeByte(0); // L: 9802
					var8.packetBuffer.writeShort(var3[var6]); // L: 9803
					Client.packetWriter.addNode(var8); // L: 9804
				} else if (var0 == 4) { // L: 9806
					var8 = class136.getPacketBufferNode(ClientPacket.field3047, Client.packetWriter.isaacCipher); // L: 9808
					var8.packetBuffer.writeShort(var3[var6]); // L: 9809
					var8.packetBuffer.method8580(0); // L: 9810
					Client.packetWriter.addNode(var8); // L: 9811
				} else if (var0 == 6) { // L: 9813
					var8 = class136.getPacketBufferNode(ClientPacket.field3066, Client.packetWriter.isaacCipher); // L: 9815
					var8.packetBuffer.method8580(0); // L: 9816
					var8.packetBuffer.writeShort(var3[var6]); // L: 9817
					Client.packetWriter.addNode(var8); // L: 9818
				} else if (var0 == 7) { // L: 9820
					var8 = class136.getPacketBufferNode(ClientPacket.field3105, Client.packetWriter.isaacCipher); // L: 9822
					var8.packetBuffer.method8589(var3[var6]); // L: 9823
					var8.packetBuffer.method8580(0); // L: 9824
					Client.packetWriter.addNode(var8); // L: 9825
				}

				var4 = true; // L: 9827
				break;
			}
		}

		if (!var4) { // L: 9831
			KitDefinition.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9832
}
