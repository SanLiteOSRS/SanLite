import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hb")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 704722641
	)
	static int field2799;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 13169171
	)
	@Export("z")
	int z;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 195804449
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -878815741
	)
	@Export("y")
	int y;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1962326121
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1777240723
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1641152353
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1040498041
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -4565289188219368055L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1162489357
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1929783827"
	)
	public static boolean method4830() {
		long var0 = Message.method1197();
		int var2 = (int)(var0 - NetCache.field4218);
		NetCache.field4218 = var0;
		if (var2 > 200) {
			var2 = 200;
		}

		NetCache.NetCache_loadTime += var2; // L: 48
		if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
			return true;
		} else if (NetCache.NetCache_socket == null) {
			return false;
		} else {
			try {
				if (NetCache.NetCache_loadTime > 30000) {
					throw new IOException();
				} else {
					NetFileRequest var3;
					Buffer var4;
					while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
						var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
						var4 = new Buffer(4);
						var4.writeByte(1); // L: 56
						var4.writeMedium((int)var3.key); // L: 57
						NetCache.NetCache_socket.write(var4.array, 0, 4);
						NetCache.NetCache_pendingPriorityResponses.put(var3, var3.key);
						--NetCache.NetCache_pendingPriorityWritesCount;
						++NetCache.NetCache_pendingPriorityResponsesCount;
					}

					while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
						var3 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
						var4 = new Buffer(4);
						var4.writeByte(0);
						var4.writeMedium((int)var3.key);
						NetCache.NetCache_socket.write(var4.array, 0, 4);
						var3.removeDual();
						NetCache.NetCache_pendingResponses.put(var3, var3.key);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingResponsesCount;
					}

					for (int var15 = 0; var15 < 100; ++var15) {
						int var16 = NetCache.NetCache_socket.available();
						if (var16 < 0) {
							throw new IOException();
						}

						if (var16 == 0) {
							break;
						}

						NetCache.NetCache_loadTime = 0;
						byte var5 = 0;
						if (class185.NetCache_currentResponse == null) {
							var5 = 8;
						} else if (NetCache.field4216 == 0) {
							var5 = 1;
						}

						int var6;
						int var7;
						int var8;
						int var10;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var5 > 0) {
							var6 = var5 - NetCache.NetCache_responseHeaderBuffer.offset;
							if (var6 > var16) {
								var6 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var6);
							if (NetCache.field4232 != 0) {
								for (var7 = 0; var7 < var6; ++var7) {
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var7;
									var10000[var10001] ^= NetCache.field4232;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer;
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) {
								break;
							}

							if (class185.NetCache_currentResponse == null) {
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 95
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt();
								long var11 = (long)(var8 + (var7 << 16)); // L: 97
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11); // L: 98
								class157.field1804 = true; // L: 99
								if (var13 == null) { // L: 100
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11); // L: 101
									class157.field1804 = false; // L: 102
								}

								if (var13 == null) { // L: 104
									throw new IOException(); // L: 105
								}

								int var14 = var9 == 0 ? 5 : 9; // L: 107
								class185.NetCache_currentResponse = var13; // L: 108
								ModeWhere.NetCache_responseArchiveBuffer = new Buffer(var10 + var14 + class185.NetCache_currentResponse.padding); // L: 109
								ModeWhere.NetCache_responseArchiveBuffer.writeByte(var9); // L: 110
								ModeWhere.NetCache_responseArchiveBuffer.method8536(var10); // L: 111
								NetCache.field4216 = 8; // L: 112
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 113
							} else if (NetCache.field4216 == 0) { // L: 116
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 117
									NetCache.field4216 = 1; // L: 118
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 119
								} else {
									class185.NetCache_currentResponse = null; // L: 123
								}
							}
						} else {
							var6 = ModeWhere.NetCache_responseArchiveBuffer.array.length - class185.NetCache_currentResponse.padding; // L: 129
							var7 = 512 - NetCache.field4216; // L: 130
							if (var7 > var6 - ModeWhere.NetCache_responseArchiveBuffer.offset) { // L: 131
								var7 = var6 - ModeWhere.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) { // L: 132
								var7 = var16;
							}

							NetCache.NetCache_socket.read(ModeWhere.NetCache_responseArchiveBuffer.array, ModeWhere.NetCache_responseArchiveBuffer.offset, var7); // L: 133
							if (NetCache.field4232 != 0) { // L: 134
								for (var8 = 0; var8 < var7; ++var8) { // L: 135
									var10000 = ModeWhere.NetCache_responseArchiveBuffer.array;
									var10001 = ModeWhere.NetCache_responseArchiveBuffer.offset + var8;
									var10000[var10001] ^= NetCache.field4232;
								}
							}

							var22 = ModeWhere.NetCache_responseArchiveBuffer; // L: 137
							var22.offset += var7;
							NetCache.field4216 += var7; // L: 138
							if (var6 == ModeWhere.NetCache_responseArchiveBuffer.offset) { // L: 139
								if (class185.NetCache_currentResponse.key == 16711935L) { // L: 140
									class169.field1878 = ModeWhere.NetCache_responseArchiveBuffer; // L: 141

									for (var8 = 0; var8 < 256; ++var8) { // L: 142
										Archive var17 = NetCache.NetCache_archives[var8]; // L: 143
										if (var17 != null) { // L: 144
											class169.field1878.offset = var8 * 8 + 5; // L: 146
											if (class169.field1878.offset >= class169.field1878.array.length) { // L: 147
												if (!var17.field4191) { // L: 148
													throw new RuntimeException(""); // L: 152
												}

												var17.method6419(); // L: 149
											} else {
												var10 = class169.field1878.readInt(); // L: 154
												int var18 = class169.field1878.readInt(); // L: 155
												var17.loadIndex(var10, var18); // L: 156
											}
										}
									}
								} else {
									NetCache.NetCache_crc.reset(); // L: 162
									NetCache.NetCache_crc.update(ModeWhere.NetCache_responseArchiveBuffer.array, 0, var6); // L: 163
									var8 = (int)NetCache.NetCache_crc.getValue(); // L: 164
									if (var8 != class185.NetCache_currentResponse.crc) { // L: 165
										try {
											NetCache.NetCache_socket.close(); // L: 167
										} catch (Exception var20) { // L: 169
										}

										++NetCache.NetCache_crcMismatches; // L: 170
										NetCache.NetCache_socket = null; // L: 171
										NetCache.field4232 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 172
										return false; // L: 173
									}

									NetCache.NetCache_crcMismatches = 0; // L: 175
									NetCache.NetCache_ioExceptions = 0; // L: 176
									class185.NetCache_currentResponse.archive.write((int)(class185.NetCache_currentResponse.key & 65535L), ModeWhere.NetCache_responseArchiveBuffer.array, 16711680L == (class185.NetCache_currentResponse.key & 16711680L), class157.field1804); // L: 177
								}

								class185.NetCache_currentResponse.remove(); // L: 179
								if (class157.field1804) { // L: 180
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount; // L: 181
								}

								NetCache.field4216 = 0; // L: 182
								class185.NetCache_currentResponse = null; // L: 183
								ModeWhere.NetCache_responseArchiveBuffer = null; // L: 184
							} else {
								if (NetCache.field4216 != 512) { // L: 186
									break;
								}

								NetCache.field4216 = 0;
							}
						}
					}

					return true; // L: 190
				}
			} catch (IOException var21) {
				try {
					NetCache.NetCache_socket.close(); // L: 194
				} catch (Exception var19) { // L: 196
				}

				++NetCache.NetCache_ioExceptions; // L: 197
				NetCache.NetCache_socket = null; // L: 198
				return false; // L: 199
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lmb;I)I",
		garbageValue = "643814592"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = WorldMapIcon_1.method4872(var9); // L: 33
			var8 = WorldMapIcon_1.method4872(var10); // L: 34
			var9 = class168.standardizeChar(var9, var2); // L: 35
			var10 = class168.standardizeChar(var10, var2); // L: 36
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var10 != var9) { // L: 40
					return WorldMapLabel.lowercaseChar(var9, var2) - WorldMapLabel.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 44
			if (var2 == Language.Language_FR) { // L: 45
				var5 = var3 - 1 - var17; // L: 46
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17; // L: 49
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var12 != var11) {
					return WorldMapLabel.lowercaseChar(var11, var2) - WorldMapLabel.lowercaseChar(var12, var2); // L: 55
				}
			}
		}

		var17 = var3 - var4; // L: 58
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var12 != var13) {
					return WorldMapLabel.lowercaseChar(var12, var2) - WorldMapLabel.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BIB)I",
		garbageValue = "-81"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1; // L: 63

		for (int var6 = 0; var6 < var5; ++var6) { // L: 64
			char var7 = var0.charAt(var6 + var1); // L: 65
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) { // L: 66
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) { // L: 67
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) { // L: 68
				var3[var6 + var4] = -126;
			} else if (var7 == 402) { // L: 69
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) { // L: 70
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) { // L: 71
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) { // L: 72
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) { // L: 73
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120; // L: 74
			} else if (var7 == 8240) { // L: 75
				var3[var6 + var4] = -119;
			} else if (var7 == 352) { // L: 76
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) { // L: 77
				var3[var6 + var4] = -117;
			} else if (var7 == 338) { // L: 78
				var3[var6 + var4] = -116;
			} else if (var7 == 381) { // L: 79
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) { // L: 80
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) { // L: 81
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) { // L: 85
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105; // L: 86
			} else if (var7 == 732) { // L: 87
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) { // L: 88
				var3[var6 + var4] = -103;
			} else if (var7 == 353) { // L: 89
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) { // L: 90
				var3[var6 + var4] = -101;
			} else if (var7 == 339) { // L: 91
				var3[var6 + var4] = -100;
			} else if (var7 == 382) { // L: 92
				var3[var6 + var4] = -98;
			} else if (var7 == 376) { // L: 93
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63; // L: 94
			}
		}

		return var5; // L: 96
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65280"
	)
	public static void method4828() {
		HealthBarDefinition.HealthBarDefinition_cached.clear(); // L: 82
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear(); // L: 83
	} // L: 84

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "84"
	)
	static int method4827(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 4215
			Client.logoutTimer = 250; // L: 4216
			return 1; // L: 4217
		} else {
			return 2; // L: 4219
		}
	}
}
