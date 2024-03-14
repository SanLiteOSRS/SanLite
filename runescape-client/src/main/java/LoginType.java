import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5089;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5086;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5083;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5087;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5088;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5090;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	static final LoginType field5084;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	public static final LoginType field5091;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1843158875
	)
	final int field5092;
	@ObfuscatedName("ak")
	final String field5093;

	static {
		oldscape = new LoginType(4, 0, "", ""); // L: 5
		field5089 = new LoginType(2, 1, "", ""); // L: 6
		field5086 = new LoginType(0, 2, "", ""); // L: 7
		field5083 = new LoginType(6, 3, "", ""); // L: 8
		field5087 = new LoginType(7, 4, "", ""); // L: 9
		field5088 = new LoginType(5, 5, "", ""); // L: 10
		field5090 = new LoginType(8, 6, "", ""); // L: 11
		field5084 = new LoginType(3, 7, "", ""); // L: 12
		field5091 = new LoginType(1, -1, "", "", true, new LoginType[]{oldscape, field5089, field5086, field5087, field5083}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5092 = var1; // L: 18
		this.field5093 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lte;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5092 = var1;
		this.field5093 = var4;
	}

	public String toString() {
		return this.field5093;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lpe;II)Lmn;",
		garbageValue = "2019210009"
	)
	public static PacketBufferNode method9200(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = ViewportMouse.getPacketBufferNode(ClientPacket.field3267, Client.packetWriter.isaacCipher); // L: 23
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
		if (var8 != null) { // L: 154
			for (int var19 = 0; var19 < var8.length; ++var19) { // L: 155
				var4.packetBuffer.writeByte(var8[var19]); // L: 156
			}
		}

		TaskHandler.method4203(var4.packetBuffer, var1); // L: 159
		if (var0 == class357.field3907.rsOrdinal()) { // L: 160
			var4.packetBuffer.writeByte(var3); // L: 161
		}

		var4.packetBuffer.method9470(var4.packetBuffer.offset - var5); // L: 163
		return var4; // L: 164
	}
}
