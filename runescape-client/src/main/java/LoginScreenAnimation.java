import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -499000379
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("aa")
	int[] field1260;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1590000383
	)
	int field1259;
	@ObfuscatedName("al")
	int[] field1258;
	@ObfuscatedName("az")
	int[] field1263;
	@ObfuscatedName("ap")
	int[] field1264;
	@ObfuscatedName("av")
	int[] field1268;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1703311969
	)
	int field1266;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 726511481
	)
	int field1267;
	@ObfuscatedName("ay")
	int[] field1256;
	@ObfuscatedName("ak")
	int[] field1269;
	@ObfuscatedName("aj")
	int[] field1270;
	@ObfuscatedName("am")
	int[] field1271;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1495033317
	)
	int field1272;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 162451348
	)
	int field1273;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 403261153
	)
	int field1274;

	@ObfuscatedSignature(
		descriptor = "([Lup;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1260 = new int[256];
		this.field1259 = 0; // L: 14
		this.field1266 = 0; // L: 19
		this.field1267 = 0; // L: 20
		this.field1272 = 0;
		this.field1273 = 0;
		this.field1274 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	@Export("initColors")
	void initColors() {
		this.field1263 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1263[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1263[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1263[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1263[var1 + 192] = 16777215;
		}

		this.field1264 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1264[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1264[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1264[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1264[var1 + 192] = 16777215;
		}

		this.field1268 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1268[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1268[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1268[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1268[var1 + 192] = 16777215;
		}

		this.field1258 = new int[256];
		this.field1272 = 0;
		this.field1270 = new int[32768];
		this.field1271 = new int[32768];
		this.method2511((IndexedSprite)null);
		this.field1256 = new int[32768]; // L: 55
		this.field1269 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-761993864"
	)
	void method2506() {
		this.field1263 = null; // L: 60
		this.field1264 = null; // L: 61
		this.field1268 = null;
		this.field1258 = null;
		this.field1270 = null;
		this.field1271 = null;
		this.field1256 = null; // L: 66
		this.field1269 = null;
		this.field1272 = 0;
		this.field1273 = 0;
	} // L: 70

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "960530049"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1256 == null) {
			this.initColors(); // L: 74
		}

		if (this.field1274 == 0) {
			this.field1274 = var2;
		}

		int var3 = var2 - this.field1274;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1274 = var2;
		if (var3 > 0) { // L: 82
			this.method2519(var3);
		}

		this.method2508(var1); // L: 85
	} // L: 86

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-52"
	)
	final void method2519(int var1) {
		this.field1272 += var1 * 128; // L: 89
		int var2;
		if (this.field1272 > this.field1270.length) { // L: 90
			this.field1272 -= this.field1270.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2511(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1256[var3 + var2] - this.field1270[var2 + this.field1272 & this.field1270.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1256[var2++] = var6; // L: 101
		}

		byte var15 = 10; // L: 103
		var6 = 128 - var15; // L: 104

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 105
			int var8 = var7 * 128; // L: 106

			for (int var9 = 0; var9 < 128; ++var9) { // L: 107
				var10 = (int)(Math.random() * 100.0D); // L: 108
				if (var10 < 50 && var9 > var15 && var9 < var6) { // L: 109
					this.field1256[var8 + var9] = 255;
				} else {
					this.field1256[var9 + var8] = 0; // L: 110
				}
			}
		}

		if (this.field1266 * 16 > 0) { // L: 113
			this.field1266 = this.field1266 * 16 - var1 * 4;
		}

		if (this.field1267 * 16 > 0) { // L: 114
			this.field1267 = this.field1267 * 16 - var1 * 4;
		}

		if (this.field1266 * 16 == 0 && this.field1267 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1266 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1267 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1260[var7] = this.field1260[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1260[var7] = (int)(Math.sin((double)this.field1259 / 14.0D) * 16.0D + Math.sin((double)this.field1259 / 15.0D) * 14.0D + Math.sin((double)this.field1259 / 16.0D) * 12.0D); // L: 122
			++this.field1259; // L: 123
		}

		this.field1273 = this.field1273 * 10000 + var1 * 100; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1273 * 10000; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1256[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1273 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var7 + var14 < 128) { // L: 141
						var12 += this.field1256[var13 + var14 + var7];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1256[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1269[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1269[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1269[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1256[var14 + var11] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1611908618"
	)
	final int method2507(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-650502535"
	)
	final void method2508(int var1) {
		int var2 = this.field1258.length; // L: 164
		if (this.field1266 * 16 > 0) { // L: 165
			this.method2509(this.field1266 * 16, this.field1264); // L: 166
		} else if (this.field1267 * 16 > 0) { // L: 168
			this.method2509(this.field1267 * 16, this.field1268); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1258[var3] = this.field1263[var3];
			}
		}

		this.method2533(var1); // L: 174
	} // L: 175

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-2016304583"
	)
	final void method2509(int var1, int[] var2) {
		int var3 = this.field1258.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1258[var4] = this.method2507(this.field1263[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1258[var4] = var2[var4]; // L: 181
			} else {
				this.field1258[var4] = this.method2507(var2[var4], this.field1263[var4], 256 - var1); // L: 182
			}
		}

	} // L: 184

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1596261133"
	)
	final void method2533(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) { // L: 188
			int var4 = (256 - var3) * this.field1260[var3] / 256; // L: 189
			int var5 = var4 + var1; // L: 190
			int var6 = 0; // L: 191
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5; // L: 194
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= class338.rasterProvider.width) { // L: 197
				var7 = class338.rasterProvider.width - var5; // L: 198
			}

			int var8 = var5 + (var3 + 8) * class338.rasterProvider.width; // L: 200
			var2 += var6; // L: 201

			for (int var9 = var6; var9 < var7; ++var9) { // L: 202
				int var10 = this.field1256[var2++]; // L: 203
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width; // L: 204
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) { // L: 205
					int var12 = var10; // L: 206
					int var13 = 256 - var10; // L: 207
					var10 = this.field1258[var10]; // L: 208
					int var14 = class338.rasterProvider.pixels[var8]; // L: 209
					class338.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8; // L: 210
				} else {
					++var8; // L: 212
				}
			}

			var2 += 128 - var7; // L: 214
		}

	} // L: 216

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lup;I)V",
		garbageValue = "1899155334"
	)
	final void method2511(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1270.length; ++var2) { // L: 219
			this.field1270[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D); // L: 221
			this.field1270[var3] = (int)(Math.random() * 256.0D); // L: 222
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) { // L: 224
			for (var3 = 1; var3 < 255; ++var3) { // L: 225
				for (var4 = 1; var4 < 127; ++var4) { // L: 226
					var5 = var4 + (var3 << 7); // L: 227
					this.field1271[var5] = (this.field1270[var5 + 128] + this.field1270[var5 - 128] + this.field1270[var5 + 1] + this.field1270[var5 - 1]) / 4; // L: 228
				}
			}

			int[] var8 = this.field1270; // L: 231
			this.field1270 = this.field1271; // L: 232
			this.field1271 = var8; // L: 233
		}

		if (var1 != null) { // L: 235
			var2 = 0; // L: 236

			for (var3 = 0; var3 < var1.subHeight; ++var3) { // L: 237
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16; // L: 241
						int var7 = var5 + (var6 << 7); // L: 242
						this.field1270[var7] = 0; // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;II)Lmq;",
		garbageValue = "812097859"
	)
	static MusicPatch method2536(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 25
		return var2 == null ? null : new MusicPatch(var2); // L: 26
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;B)V",
		garbageValue = "41"
	)
	public static void method2510(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		class191.field1977 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "18"
	)
	static final int method2532(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 13
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-12"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 62
		if (var0 < 0 || var0 >= 65536) { // L: 63
			var0 >>>= 16; // L: 64
			var1 += 16; // L: 65
		}

		if (var0 >= 256) { // L: 67
			var0 >>>= 8; // L: 68
			var1 += 8; // L: 69
		}

		if (var0 >= 16) { // L: 71
			var0 >>>= 4; // L: 72
			var1 += 4; // L: 73
		}

		if (var0 >= 4) { // L: 75
			var0 >>>= 2; // L: 76
			var1 += 2; // L: 77
		}

		if (var0 >= 1) { // L: 79
			var0 >>>= 1; // L: 80
			++var1; // L: 81
		}

		return var0 + var1; // L: 83
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1084664088"
	)
	static void method2531() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "112"
	)
	static final void method2513(boolean var0) {
		class102.method2728(); // L: 5886
		++Client.packetWriter.pendingWrites; // L: 5887
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5888
			Client.packetWriter.pendingWrites = 0; // L: 5889
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5890
				PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher); // L: 5892
				Client.packetWriter.addNode(var1); // L: 5893

				try {
					Client.packetWriter.flush(); // L: 5895
				} catch (IOException var3) { // L: 5897
					Client.hadNetworkError = true; // L: 5898
				}
			}

		}
	} // L: 5901
}
