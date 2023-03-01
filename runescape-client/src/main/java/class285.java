import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@kx
@ObfuscatedName("jk")
public final class class285 {
	@ObfuscatedName("v")
	static final HashMap field3324;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = -826527577
	)
	@Export("cameraYaw")
	static int cameraYaw;

	static {
		field3324 = new HashMap(); // L: 11
		java.util.Calendar.getInstance(method5567("Europe/London")); // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
		garbageValue = "-1482815227"
	)
	static TimeZone method5567(String var0) {
		synchronized(field3324) {
			TimeZone var2 = (TimeZone)field3324.get(var0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(var0);
				field3324.put(var0, var2);
			}

			return var2;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-72"
	)
	public static String method5572(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 21
		int var4 = 0; // L: 22
		int var5 = var1; // L: 23

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) { // L: 24 25 56
			int var7 = var0[var5++] & 255; // L: 26
			if (var7 < 128) { // L: 28
				if (var7 == 0) { // L: 29
					var8 = 65533;
				} else {
					var8 = var7; // L: 30
				}
			} else if (var7 < 192) { // L: 32
				var8 = 65533;
			} else if (var7 < 224) { // L: 33
				if (var5 < var6 && (var0[var5] & 192) == 128) { // L: 34
					var8 = (var7 & 31) << 6 | var0[var5++] & 63; // L: 35
					if (var8 < 128) { // L: 36
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 38
				}
			} else if (var7 < 240) { // L: 40
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) { // L: 41
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 42
					if (var8 < 2048) { // L: 43
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 45
				}
			} else if (var7 < 248) { // L: 47
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) { // L: 48
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 49
					if (var8 >= 65536 && var8 <= 1114111) { // L: 50
						var8 = 65533; // L: 51
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 53
				}
			} else {
				var8 = 65533; // L: 55
			}
		}

		return new String(var3, 0, var4); // L: 58
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "93"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 68

		for (int var6 = 0; var6 < var5; ++var6) { // L: 69
			char var7 = var0.charAt(var6 + var1); // L: 70
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 71
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 72
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 73
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 74
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 75
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 76
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 77
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 78
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 79
			} else if (var7 == 8240) { // L: 80
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 81
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 82
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 83
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 84
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 85
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 86
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) { // L: 87
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) { // L: 88
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) { // L: 89
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 90
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) { // L: 91
				var3[var6 + var4] = -105;
			} else if (var7 == 732) { // L: 92
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 93
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 94
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 95
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 96
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 97
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 98
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 99
			}
		}

		return var5; // L: 101
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lru;II)Z",
		garbageValue = "-1054314314"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 378
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 379
			if (var0.readBits(1) != 0) { // L: 380
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 381
			var4 = var0.readBits(13); // L: 382
			boolean var12 = var0.readBits(1) == 1; // L: 383
			if (var12) { // L: 384
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 385
				throw new RuntimeException(); // L: 386
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 388
				var11.index = var1; // L: 389
				if (Players.field1341[var1] != null) { // L: 390
					var11.read(Players.field1341[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 391
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 392
				var7 = Players.Players_regions[var1]; // L: 393
				var8 = var7 >> 28; // L: 394
				var9 = var7 >> 14 & 255; // L: 395
				var10 = var7 & 255; // L: 396
				var11.pathTraversed[0] = Players.field1340[var1]; // L: 397
				var11.plane = (byte)var8; // L: 398
				var11.resetPath((var9 << 13) + var3 - ParamComposition.baseX * 64, (var10 << 13) + var4 - Client.baseY * 64); // L: 399
				var11.field1132 = false; // L: 400
				return true; // L: 401
			}
		} else if (var2 == 1) { // L: 403
			var3 = var0.readBits(2); // L: 404
			var4 = Players.Players_regions[var1]; // L: 405
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 406
			return false; // L: 407
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 409
				var3 = var0.readBits(5); // L: 410
				var4 = var3 >> 3; // L: 411
				var5 = var3 & 7; // L: 412
				var6 = Players.Players_regions[var1]; // L: 413
				var7 = (var6 >> 28) + var4 & 3; // L: 414
				var8 = var6 >> 14 & 255; // L: 415
				var9 = var6 & 255; // L: 416
				if (var5 == 0) { // L: 417
					--var8; // L: 418
					--var9; // L: 419
				}

				if (var5 == 1) { // L: 421
					--var9;
				}

				if (var5 == 2) { // L: 422
					++var8; // L: 423
					--var9; // L: 424
				}

				if (var5 == 3) { // L: 426
					--var8;
				}

				if (var5 == 4) { // L: 427
					++var8;
				}

				if (var5 == 5) { // L: 428
					--var8; // L: 429
					++var9; // L: 430
				}

				if (var5 == 6) { // L: 432
					++var9;
				}

				if (var5 == 7) { // L: 433
					++var8; // L: 434
					++var9; // L: 435
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 437
				return false; // L: 438
			} else {
				var3 = var0.readBits(18); // L: 440
				var4 = var3 >> 16; // L: 441
				var5 = var3 >> 8 & 255; // L: 442
				var6 = var3 & 255; // L: 443
				var7 = Players.Players_regions[var1]; // L: 444
				var8 = (var7 >> 28) + var4 & 3; // L: 445
				var9 = var5 + (var7 >> 14) & 255; // L: 446
				var10 = var7 + var6 & 255; // L: 447
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 448
				return false; // L: 449
			}
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIS)V",
		garbageValue = "20930"
	)
	static final void method5570(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		class290.method5598(var0, var1, var2, var3, var4, var5, var6, false); // L: 10444
	} // L: 10445
}
