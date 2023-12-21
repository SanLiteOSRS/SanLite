import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
public class class544 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1536350795
	)
	int field5265;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1266576485
	)
	int field5264;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 133767695
	)
	int field5273;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1866643517
	)
	int field5266;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 20018137
	)
	int field5267;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1737635413
	)
	int field5263;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -541231897
	)
	int field5262;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1850961923
	)
	int field5270;
	@ObfuscatedName("az")
	boolean field5271;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1840691563
	)
	int field5268;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -574987319
	)
	int field5272;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1616668963
	)
	int field5269;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 65469375
	)
	int field5275;

	public class544() {
		this.field5262 = 0; // L: 18
		this.field5270 = 0; // L: 19
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZB)V",
		garbageValue = "0"
	)
	public void method9922(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5265 = var1;
		this.field5264 = var2;
		this.field5273 = var3;
		this.field5266 = var4;
		this.field5267 = var5;
		this.field5263 = var6;
		this.field5262 = var7; // L: 33
		this.field5270 = var8;
		this.field5271 = var9;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "86"
	)
	public void method9912(int var1, int var2, int var3, int var4) {
		this.field5268 = var1;
		this.field5272 = var2;
		this.field5269 = var3; // L: 41
		this.field5275 = var4;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpf;I)V",
		garbageValue = "72760556"
	)
	public void method9913(class406 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5266, (int)((float)var3 * 0.9F));
			int var5 = var1.method7560(this.field5273); // L: 49
			int var6 = var1.method7551(this.field5266);
			int var7 = var5 + (this.field5265 - this.field5267);
			int var8 = var6 + var3 + (this.field5264 - this.field5263);
			Rasterizer2D.Rasterizer2D_setClip(this.field5265, this.field5264, this.field5265 + this.field5273, this.field5266 + this.field5264); // L: 53
			int var9 = this.field5270;
			int var10 = this.field5262;
			if (var9 > var10) {
				int var11 = var9; // L: 57
				var9 = var10;
				var10 = var11;
			}

			class410 var21 = var1.method7531(0, var9); // L: 61
			class410 var12 = var1.method7531(var9, var10);
			class410 var13 = var1.method7531(var10, var1.method7522());
			class410 var14 = var1.method7531(0, this.field5262);
			int var16;
			int var18;
			if (!var12.method7777()) { // L: 65
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method7788(); ++var16) {
					class408 var23 = var12.method7782(var16);
					var18 = var7 + var23.field4508; // L: 69
					int var19 = var2.charWidth(var23.field4509);
					int var20 = var8 + var23.field4507 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5275);
				}
			}

			if (!var21.method7777()) {
				var2.method7674(var21, var7, var8, this.field5268, this.field5272, -1);
			}

			if (!var12.method7777()) {
				var2.method7674(var12, var7, var8, this.field5269, this.field5272, -1);
			}

			if (!var13.method7777()) { // L: 81
				var2.method7674(var13, var7, var8, this.field5268, this.field5272, -1);
			}

			if (this.field5271) { // L: 84
				class497 var22 = var14.method7793();
				var16 = var7 + (Integer)var22.field4996;
				int var17 = var8 + (Integer)var22.field4997;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5268);
				if (this.field5272 != -1) { // L: 90
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5272);
				}
			}

		}
	} // L: 94

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lof;II)Lld;",
		garbageValue = "-1670201559"
	)
	public static PacketBufferNode method9914(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class113.getPacketBufferNode(ClientPacket.field3166, Client.packetWriter.isaacCipher); // L: 23
		var4.packetBuffer.writeByte(0); // L: 24
		int var5 = var4.packetBuffer.offset; // L: 25
		var4.packetBuffer.writeByte(var0); // L: 26
		String var6 = var1.toLowerCase(); // L: 27
		int var7 = 0; // L: 28
		byte[] var8 = null; // L: 29
		if (var6.startsWith("yellow:")) { // L: 30
			var7 = 0; // L: 31
			var1 = var1.substring("yellow:".length()); // L: 32
		} else if (var6.startsWith("red:")) { // L: 34
			var7 = 1; // L: 35
			var1 = var1.substring("red:".length()); // L: 36
		} else if (var6.startsWith("green:")) { // L: 38
			var7 = 2; // L: 39
			var1 = var1.substring("green:".length()); // L: 40
		} else if (var6.startsWith("cyan:")) { // L: 42
			var7 = 3; // L: 43
			var1 = var1.substring("cyan:".length()); // L: 44
		} else if (var6.startsWith("purple:")) { // L: 46
			var7 = 4; // L: 47
			var1 = var1.substring("purple:".length()); // L: 48
		} else if (var6.startsWith("white:")) { // L: 50
			var7 = 5; // L: 51
			var1 = var1.substring("white:".length()); // L: 52
		} else if (var6.startsWith("flash1:")) { // L: 54
			var7 = 6; // L: 55
			var1 = var1.substring("flash1:".length()); // L: 56
		} else if (var6.startsWith("flash2:")) { // L: 58
			var7 = 7; // L: 59
			var1 = var1.substring("flash2:".length()); // L: 60
		} else if (var6.startsWith("flash3:")) { // L: 62
			var7 = 8; // L: 63
			var1 = var1.substring("flash3:".length()); // L: 64
		} else if (var6.startsWith("glow1:")) { // L: 66
			var7 = 9; // L: 67
			var1 = var1.substring("glow1:".length()); // L: 68
		} else if (var6.startsWith("glow2:")) { // L: 70
			var7 = 10; // L: 71
			var1 = var1.substring("glow2:".length()); // L: 72
		} else if (var6.startsWith("glow3:")) { // L: 74
			var7 = 11; // L: 75
			var1 = var1.substring("glow3:".length()); // L: 76
		} else if (var6.startsWith("rainbow:")) { // L: 78
			var7 = 12; // L: 79
			var1 = var1.substring("rainbow:".length()); // L: 80
		} else if (var6.startsWith("pattern")) { // L: 82
			boolean var10 = true; // L: 85
			boolean var11 = true; // L: 86
			int var12 = "pattern".length(); // L: 87
			int var13 = 0; // L: 88
			byte[] var14 = new byte[8]; // L: 89

			byte[] var9;
			while (true) {
				int var15 = var12 + var13; // L: 91
				if (var15 >= var6.length()) { // L: 92
					var9 = null; // L: 93
					break;
				}

				char var16 = var6.charAt(var15); // L: 96
				if (var16 == ':') { // L: 97
					if (var13 == 0) { // L: 116
						var9 = null; // L: 117
					} else {
						byte[] var17 = new byte[var13]; // L: 120
						System.arraycopy(var14, 0, var17, 0, var13); // L: 121
						var9 = var17; // L: 122
					}
					break;
				}

				if (var14.length == var13) { // L: 100
					var9 = null; // L: 101
					break; // L: 102
				}

				if (var16 >= '0' && var16 <= '9') { // L: 104
					var16 = (char)(var16 - '0'); // L: 105
				} else {
					if (var16 < 'a' || var16 > 'z') { // L: 107
						var9 = null; // L: 111
						break; // L: 112
					}

					var16 = (char)(var16 - 'W'); // L: 108
				}

				var14[var13++] = (byte)var16; // L: 114
			}

			var8 = var9; // L: 124
			if (var9 != null) { // L: 125
				var7 = var9.length + 12; // L: 126
				var1 = var1.substring("pattern".length() + var9.length + 1); // L: 127
			}
		}

		var6 = var1.toLowerCase(); // L: 130
		byte var18 = 0; // L: 131
		if (var6.startsWith("wave:")) { // L: 132
			var18 = 1; // L: 133
			var1 = var1.substring("wave:".length()); // L: 134
		} else if (var6.startsWith("wave2:")) { // L: 136
			var18 = 2; // L: 137
			var1 = var1.substring("wave2:".length()); // L: 138
		} else if (var6.startsWith("shake:")) { // L: 140
			var18 = 3; // L: 141
			var1 = var1.substring("shake:".length()); // L: 142
		} else if (var6.startsWith("scroll:")) { // L: 144
			var18 = 4; // L: 145
			var1 = var1.substring("scroll:".length()); // L: 146
		} else if (var6.startsWith("slide:")) { // L: 148
			var18 = 5; // L: 149
			var1 = var1.substring("slide:".length()); // L: 150
		}

		var4.packetBuffer.writeByte(var7); // L: 152
		var4.packetBuffer.writeByte(var18); // L: 153
		if (var8 != null && Client.field492 >= 214) { // L: 154
			for (int var19 = 0; var19 < var8.length; ++var19) { // L: 155
				var4.packetBuffer.writeByte(var8[var19]); // L: 156
			}
		}

		PcmPlayer.method847(var4.packetBuffer, var1); // L: 159
		if (var0 == class351.field3835.rsOrdinal()) { // L: 160
			var4.packetBuffer.writeByte(var3); // L: 161
		}

		var4.packetBuffer.method9257(var4.packetBuffer.offset - var5); // L: 163
		return var4; // L: 164
	}
}
