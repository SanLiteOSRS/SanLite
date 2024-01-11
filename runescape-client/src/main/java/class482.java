import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public class class482 {
	@ObfuscatedName("ar")
	static int[] field4870;
	@ObfuscatedName("ag")
	public static int[] field4871;
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;

	static {
		field4870 = new int[32768]; // L: 14

		for (int var0 = 0; var0 < 32768; ++var0) { // L: 15
			field4870[var0] = method8742(var0);
		}

		if (field4871 == null) { // L: 17
			field4871 = new int[65536]; // L: 18
			double var25 = 0.949999988079071D; // L: 19

			for (int var2 = 0; var2 < 65536; ++var2) { // L: 20
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D; // L: 21
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D; // L: 22
				double var7 = (double)(var2 & 127) / 128.0D; // L: 23
				double var9 = var7; // L: 24
				double var11 = var7; // L: 25
				double var13 = var7; // L: 26
				if (var5 != 0.0D) {
					double var15;
					if (var7 < 0.5D) {
						var15 = (1.0D + var5) * var7;
					} else {
						var15 = var7 + var5 - var5 * var7;
					}

					double var17 = 2.0D * var7 - var15;
					double var19 = 0.3333333333333333D + var3;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (var19 * 6.0D < 1.0D) {
						var9 = var17 + 6.0D * (var15 - var17) * var19;
					} else if (2.0D * var19 < 1.0D) {
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) { // L: 39
						var9 = (0.6666666666666666D - var19) * (var15 - var17) * 6.0D + var17;
					} else {
						var9 = var17; // L: 40
					}

					if (var3 * 6.0D < 1.0D) { // L: 41
						var11 = 6.0D * (var15 - var17) * var3 + var17;
					} else if (var3 * 2.0D < 1.0D) { // L: 42
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) { // L: 43
						var11 = var17 + (var15 - var17) * (0.6666666666666666D - var3) * 6.0D;
					} else {
						var11 = var17; // L: 44
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var17 + 6.0D * (var15 - var17) * var23;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) {
						var13 = var17 + (var15 - var17) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var25);
				var11 = Math.pow(var11, var25);
				var13 = Math.pow(var13, var25);
				int var27 = (int)(256.0D * var9);
				int var16 = (int)(256.0D * var11);
				int var28 = (int)(var13 * 256.0D);
				int var18 = var28 + (var16 << 8) + (var27 << 16);
				field4871[var2] = var18 & 16777215;
			}
		}

	} // L: 60

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "960538433"
	)
	static final int method8742(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D; // L: 67
		double var3 = (double)(var0 >> 5 & 31) / 31.0D; // L: 68
		double var5 = (double)(var0 & 31) / 31.0D; // L: 69
		double var7 = var1; // L: 70
		if (var3 < var1) { // L: 71
			var7 = var3;
		}

		if (var5 < var7) { // L: 72
			var7 = var5;
		}

		double var9 = var1; // L: 73
		if (var3 > var1) { // L: 74
			var9 = var3;
		}

		if (var5 > var9) { // L: 75
			var9 = var5;
		}

		double var11 = 0.0D; // L: 76
		double var13 = 0.0D; // L: 77
		double var15 = (var7 + var9) / 2.0D; // L: 78
		if (var7 != var9) { // L: 79
			if (var15 < 0.5D) { // L: 80
				var13 = (var9 - var7) / (var7 + var9);
			}

			if (var15 >= 0.5D) { // L: 81
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var1 == var9) { // L: 82
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var9 == var3) { // L: 83
				var11 = 2.0D + (var5 - var1) / (var9 - var7);
			} else if (var5 == var9) { // L: 84
				var11 = 4.0D + (var1 - var3) / (var9 - var7);
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D); // L: 86
		var17 &= 255; // L: 87
		double var18 = var13 * 256.0D; // L: 88
		if (var18 < 0.0D) { // L: 89
			var18 = 0.0D;
		} else if (var18 > 255.0D) { // L: 90
			var18 = 255.0D;
		}

		if (var15 > 0.7D) { // L: 91
			var18 /= 2.0D; // L: 92
			var18 = Math.floor(var18); // L: 93
		}

		if (var15 > 0.75D) { // L: 95
			var18 /= 2.0D; // L: 96
			var18 = Math.floor(var18); // L: 97
		}

		if (var15 > 0.85D) { // L: 99
			var18 /= 2.0D; // L: 100
			var18 = Math.floor(var18); // L: 101
		}

		if (var15 > 0.95D) { // L: 103
			var18 /= 2.0D; // L: 104
			var18 = Math.floor(var18); // L: 105
		}

		if (var15 > 0.995D) { // L: 107
			var15 = 0.995D;
		}

		int var20 = (int)((double)(var17 / 4 * 8) + var18 / 32.0D); // L: 108
		return (int)(128.0D * var15) + (var20 << 7); // L: 109
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1823738301"
	)
	static void method8743() {
		Tiles.Tiles_minPlane = 99; // L: 45
		Tiles.field1021 = new short[4][104][104]; // L: 46
		Tiles.field1011 = new short[4][104][104]; // L: 47
		class141.field1628 = new byte[4][104][104]; // L: 48
		class208.field2278 = new byte[4][104][104]; // L: 49
		Tiles.field1012 = new int[4][105][105]; // L: 50
		AbstractRasterProvider.field5260 = new byte[4][105][105]; // L: 51
		class420.field4590 = new int[105][105]; // L: 52
		GrandExchangeOfferWorldComparator.Tiles_hue = new int[104]; // L: 53
		class341.Tiles_saturation = new int[104]; // L: 54
		class515.Tiles_lightness = new int[104]; // L: 55
		class309.Tiles_hueMultiplier = new int[104]; // L: 56
		class228.field2427 = new int[104]; // L: 57
	} // L: 58

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Llo;Lvd;B)Llr;",
		garbageValue = "32"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = SecureRandomFuture.method2234(); // L: 27
		var2.clientPacket = var0; // L: 28
		var2.clientPacketLength = var0.length; // L: 29
		if (var2.clientPacketLength == -1) { // L: 30
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000); // L: 31
		} else if (var2.clientPacketLength <= 18) { // L: 32
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 33
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 34
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 35
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 36
		var2.index = 0; // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2035193976"
	)
	public static int method8734(int var0) {
		return 255 - (var0 & 255); // L: 113
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)V",
		garbageValue = "608074547"
	)
	static final void method8736(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8492

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8493 8494 8499
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8495
				var10 = var11; // L: 8496
				break;
			}
		}

		if (var10 == null) { // L: 8501
			var10 = new PendingSpawn(); // L: 8502
			var10.plane = var0; // L: 8503
			var10.type = var3; // L: 8504
			var10.x = var1; // L: 8505
			var10.y = var2; // L: 8506
			var10.field1167 = -1; // L: 8507
			class1.method12(var10); // L: 8508
			Client.pendingSpawns.addFirst(var10); // L: 8509
		}

		var10.field1164 = var4; // L: 8511
		var10.field1166 = var5; // L: 8512
		var10.field1157 = var6; // L: 8513
		var10.delay = var8; // L: 8514
		var10.hitpoints = var9; // L: 8515
		var10.method2443(var7); // L: 8516
	} // L: 8517

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1186214374"
	)
	static void method8744(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9935
		int[] var3 = Players.Players_indices; // L: 9936
		boolean var4 = false; // L: 9937
		Username var5 = new Username(var1, UserComparator10.loginType); // L: 9938

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9939
			Player var7 = Client.players[var3[var6]]; // L: 9940
			if (var7 != null && var7 != class25.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9941
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9942
					var8 = getPacketBufferNode(ClientPacket.field3172, Client.packetWriter.isaacCipher); // L: 9944
					var8.packetBuffer.writeIntME(var3[var6]); // L: 9945
					var8.packetBuffer.method9483(0); // L: 9946
					Client.packetWriter.addNode(var8); // L: 9947
				} else if (var0 == 4) { // L: 9949
					var8 = getPacketBufferNode(ClientPacket.field3236, Client.packetWriter.isaacCipher); // L: 9951
					var8.packetBuffer.writeByte(0); // L: 9952
					var8.packetBuffer.method9427(var3[var6]); // L: 9953
					Client.packetWriter.addNode(var8); // L: 9954
				} else if (var0 == 6) { // L: 9956
					var8 = getPacketBufferNode(ClientPacket.field3169, Client.packetWriter.isaacCipher); // L: 9958
					var8.packetBuffer.writeShort(var3[var6]); // L: 9959
					var8.packetBuffer.writeByte(0); // L: 9960
					Client.packetWriter.addNode(var8); // L: 9961
				} else if (var0 == 7) { // L: 9963
					var8 = getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher); // L: 9965
					var8.packetBuffer.writeShort(var3[var6]); // L: 9966
					var8.packetBuffer.writeByte(0); // L: 9967
					Client.packetWriter.addNode(var8); // L: 9968
				}

				var4 = true; // L: 9970
				break;
			}
		}

		if (!var4) { // L: 9974
			GrandExchangeEvents.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9975

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)Lnn;",
		garbageValue = "-85"
	)
	static Widget method8733(Widget var0) {
		int var1 = ReflectionCheck.method736(class405.getWidgetFlags(var0)); // L: 12554
		if (var1 == 0) { // L: 12555
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) { // L: 12556
				var0 = class380.field4414.method6348(var0.parentId); // L: 12557
				if (var0 == null) { // L: 12558
					return null;
				}
			}

			return var0; // L: 12560
		}
	}
}
