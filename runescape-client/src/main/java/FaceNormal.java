import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -825673515
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1083154949
	)
	@Export("y")
	int y;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1141248363
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lot;",
		garbageValue = "1491252484"
	)
	static GameBuild[] method4885() {
		return new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP, GameBuild.LIVE}; // L: 13
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lpv;II)Lmh;",
		garbageValue = "299810628"
	)
	public static PacketBufferNode method4884(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class425.getPacketBufferNode(ClientPacket.field3239, Client.packetWriter.isaacCipher); // L: 23
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
		} else if (var6.startsWith("pattern")) {
			var8 = ClanChannel.method3399(var6);
			if (var8 != null) {
				var7 = var8.length + 12;
				var1 = var1.substring("pattern".length() + var8.length + 1);
			}
		}

		var6 = var1.toLowerCase();
		byte var9 = 0;
		if (var6.startsWith("wave:")) {
			var9 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var9 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var9 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) { // L: 103
			var9 = 4; // L: 104
			var1 = var1.substring("scroll:".length()); // L: 105
		} else if (var6.startsWith("slide:")) {
			var9 = 5;
			var1 = var1.substring("slide:".length());
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var9);
		if (var8 != null) {
			for (int var10 = 0; var10 < var8.length; ++var10) {
				var4.packetBuffer.writeByte(var8[var10]);
			}
		}

		MenuAction.method2088(var4.packetBuffer, var1); // L: 118
		if (var0 == class357.field3919.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3); // L: 120
		}

		var4.packetBuffer.method9262(var4.packetBuffer.offset - var5); // L: 122
		return var4; // L: 123
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BI)Ldn;",
		garbageValue = "-1476583300"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 81
		Buffer var2 = new Buffer(var0); // L: 82
		var2.offset = var2.array.length - 2; // L: 83
		int var3 = var2.readUnsignedShort(); // L: 84
		int var4 = var2.array.length - 2 - var3 - 12; // L: 85
		var2.offset = var4; // L: 86
		int var5 = var2.readInt(); // L: 87
		var1.localIntCount = var2.readUnsignedShort(); // L: 88
		var1.localStringCount = var2.readUnsignedShort(); // L: 89
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 90
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 91
		int var6 = var2.readUnsignedByte(); // L: 92
		int var7;
		int var8;
		if (var6 > 0) { // L: 93
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 94

			for (var7 = 0; var7 < var6; ++var7) { // L: 95
				var8 = var2.readUnsignedShort(); // L: 96
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? class193.method3722(var8) : 1); // L: 97
				var1.switches[var7] = var9; // L: 98

				while (var8-- > 0) { // L: 99
					int var10 = var2.readInt(); // L: 100
					int var11 = var2.readInt(); // L: 101
					var9.put(new IntegerNode(var11), (long)var10); // L: 102
				}
			}
		}

		var2.offset = 0; // L: 106
		var1.field1008 = var2.readStringCp1252NullTerminatedOrNull(); // L: 107
		var1.opcodes = new int[var5]; // L: 108
		var1.intOperands = new int[var5]; // L: 109
		var1.stringOperands = new String[var5]; // L: 110

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 111 112 117
			var8 = var2.readUnsignedShort(); // L: 113
			if (var8 == 3) { // L: 114
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 115
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 116
			}
		}

		return var1; // L: 119
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	static void method4886(int var0) {
		if (var0 != Client.gameState) { // L: 1308
			if (Client.gameState == 30) { // L: 1309
				Client.field749.method4282(); // L: 1310
			}

			if (Client.gameState == 0) { // L: 1312
				UrlRequest.client.method489();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1313
				class102.method2651(class67.field488); // L: 1314
				Client.field544 = 0; // L: 1315
				Client.field667 = 0; // L: 1316
				Client.timer.method7927(var0); // L: 1317
				if (var0 != 20) { // L: 1318
					class27.method399(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Actor.field1277 != null) { // L: 1320 1321
				Actor.field1277.close(); // L: 1322
				Actor.field1277 = null; // L: 1323
			}

			if (Client.gameState == 25) { // L: 1326
				Client.field582 = 0; // L: 1327
				Client.field578 = 0; // L: 1328
				Client.field579 = 1; // L: 1329
				Client.field727 = 0; // L: 1330
				Client.field581 = 1; // L: 1331
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1333
				if (var0 == 20) { // L: 1337
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1338
					class306.method5907(SpriteMask.field3623, GameEngine.field201, false, var1); // L: 1339
				} else if (var0 == 11) { // L: 1341
					class306.method5907(SpriteMask.field3623, GameEngine.field201, false, 4); // L: 1342
				} else if (var0 == 50) { // L: 1344
					class59.setLoginResponseString("", "Updating date of birth...", ""); // L: 1345
					class306.method5907(SpriteMask.field3623, GameEngine.field201, false, 7); // L: 1346
				} else if (var0 != 0 && Login.clearLoginScreen) { // L: 1348 1350
					Login.titleboxSprite = null; // L: 1351
					Login.field925 = null; // L: 1352
					Login.field941 = null; // L: 1353
					class430.leftTitleSprite = null; // L: 1354
					Login.rightTitleSprite = null; // L: 1355
					class390.logoSprite = null; // L: 1356
					ApproximateRouteStrategy.title_muteSprite = null; // L: 1357
					class27.field125 = null; // L: 1358
					class140.field1658 = null; // L: 1359
					class325.worldSelectBackSprites = null; // L: 1360
					class4.worldSelectFlagSprites = null; // L: 1361
					class136.worldSelectArrows = null; // L: 1362
					class7.worldSelectStars = null; // L: 1363
					class1.field3 = null; // L: 1364
					class59.loginScreenRunesAnimation.method2433(); // L: 1365
					class11.method108(0, 100); // L: 1366
					class341.method6299().method7052(true); // L: 1367
					Login.clearLoginScreen = false; // L: 1368
				}
			} else {
				var1 = class10.method101() ? 0 : 12; // L: 1334
				class306.method5907(SpriteMask.field3623, GameEngine.field201, true, var1); // L: 1335
			}

			Client.gameState = var0; // L: 1371
		}
	} // L: 1372
}
