import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cm")
public class class96 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1762551422"
	)
	public static boolean method2680() {
		long var0 = class153.method3317();
		int var2 = (int)(var0 - NetCache.field4252);
		NetCache.field4252 = var0; // L: 46
		if (var2 > 200) {
			var2 = 200;
		}

		NetCache.NetCache_loadTime += var2;
		if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
			return true;
		} else if (NetCache.NetCache_socket == null) { // L: 50
			return false;
		} else {
			try {
				if (NetCache.NetCache_loadTime > 30000) {
					throw new IOException();
				} else {
					NetFileRequest var3;
					Buffer var4;
					while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
						var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 54
						var4 = new Buffer(4);
						var4.writeByte(1);
						var4.writeMedium((int)var3.key);
						NetCache.NetCache_socket.write(var4.array, 0, 4); // L: 58
						NetCache.NetCache_pendingPriorityResponses.put(var3, var3.key);
						--NetCache.NetCache_pendingPriorityWritesCount;
						++NetCache.NetCache_pendingPriorityResponsesCount;
					}

					while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
						var3 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
						var4 = new Buffer(4);
						var4.writeByte(0); // L: 66
						var4.writeMedium((int)var3.key);
						NetCache.NetCache_socket.write(var4.array, 0, 4);
						var3.removeDual();
						NetCache.NetCache_pendingResponses.put(var3, var3.key); // L: 70
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingResponsesCount;
					}

					for (int var15 = 0; var15 < 100; ++var15) {
						int var16 = NetCache.NetCache_socket.available(); // L: 75
						if (var16 < 0) {
							throw new IOException();
						}

						if (var16 == 0) {
							break;
						}

						NetCache.NetCache_loadTime = 0;
						byte var5 = 0; // L: 79
						if (WorldMapDecoration.NetCache_currentResponse == null) {
							var5 = 8;
						} else if (NetCache.field4250 == 0) {
							var5 = 1;
						}

						int var6;
						int var7;
						int var8;
						byte[] var10000;
						int var10001;
						Buffer var21;
						if (var5 > 0) {
							var6 = var5 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 83
							if (var6 > var16) {
								var6 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var6);
							if (NetCache.field4248 != 0) {
								for (var7 = 0; var7 < var6; ++var7) { // L: 87
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var7;
									var10000[var10001] ^= NetCache.field4248;
								}
							}

							var21 = NetCache.NetCache_responseHeaderBuffer;
							var21.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) {
								break;
							}

							if (WorldMapDecoration.NetCache_currentResponse == null) { // L: 91
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 95
								int var10 = NetCache.NetCache_responseHeaderBuffer.readInt();
								long var11 = (long)(var8 + (var7 << 16));
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11);
								Messages.field1381 = true; // L: 99
								if (var13 == null) {
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11);
									Messages.field1381 = false;
								}

								if (var13 == null) {
									throw new IOException();
								}

								int var14 = var9 == 0 ? 5 : 9; // L: 107
								WorldMapDecoration.NetCache_currentResponse = var13;
								class14.NetCache_responseArchiveBuffer = new Buffer(var14 + var10 + WorldMapDecoration.NetCache_currentResponse.padding);
								class14.NetCache_responseArchiveBuffer.writeByte(var9);
								class14.NetCache_responseArchiveBuffer.writeInt(var10); // L: 111
								NetCache.field4250 = 8;
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
							} else if (NetCache.field4250 == 0) {
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
									NetCache.field4250 = 1;
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 119
								} else {
									WorldMapDecoration.NetCache_currentResponse = null;
								}
							}
						} else {
							var6 = class14.NetCache_responseArchiveBuffer.array.length - WorldMapDecoration.NetCache_currentResponse.padding;
							var7 = 512 - NetCache.field4250; // L: 130
							if (var7 > var6 - class14.NetCache_responseArchiveBuffer.offset) {
								var7 = var6 - class14.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) {
								var7 = var16;
							}

							NetCache.NetCache_socket.read(class14.NetCache_responseArchiveBuffer.array, class14.NetCache_responseArchiveBuffer.offset, var7);
							if (NetCache.field4248 != 0) { // L: 134
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = class14.NetCache_responseArchiveBuffer.array;
									var10001 = var8 + class14.NetCache_responseArchiveBuffer.offset;
									var10000[var10001] ^= NetCache.field4248;
								}
							}

							var21 = class14.NetCache_responseArchiveBuffer;
							var21.offset += var7;
							NetCache.field4250 += var7; // L: 138
							if (var6 == class14.NetCache_responseArchiveBuffer.offset) {
								if (16711935L == WorldMapDecoration.NetCache_currentResponse.key) {
									class10.field56 = class14.NetCache_responseArchiveBuffer;

									for (var8 = 0; var8 < 256; ++var8) { // L: 142
										Archive var17 = NetCache.NetCache_archives[var8];
										if (var17 != null) {
											class1.method9(var17, var8);
										}
									}
								} else {
									NetCache.NetCache_crc.reset();
									NetCache.NetCache_crc.update(class14.NetCache_responseArchiveBuffer.array, 0, var6); // L: 151
									var8 = (int)NetCache.NetCache_crc.getValue();
									if (var8 != WorldMapDecoration.NetCache_currentResponse.crc) {
										try {
											NetCache.NetCache_socket.close(); // L: 155
										} catch (Exception var19) {
										}

										++NetCache.NetCache_crcMismatches;
										NetCache.NetCache_socket = null; // L: 159
										NetCache.field4248 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									NetCache.NetCache_crcMismatches = 0; // L: 163
									NetCache.NetCache_ioExceptions = 0; // L: 164
									WorldMapDecoration.NetCache_currentResponse.archive.write((int)(WorldMapDecoration.NetCache_currentResponse.key & 65535L), class14.NetCache_responseArchiveBuffer.array, 16711680L == (WorldMapDecoration.NetCache_currentResponse.key & 16711680L), Messages.field1381);
								}

								WorldMapDecoration.NetCache_currentResponse.remove();
								if (Messages.field1381) {
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount;
								}

								NetCache.field4250 = 0; // L: 170
								WorldMapDecoration.NetCache_currentResponse = null;
								class14.NetCache_responseArchiveBuffer = null;
							} else {
								if (NetCache.field4250 != 512) { // L: 174
									break;
								}

								NetCache.field4250 = 0;
							}
						}
					}

					return true; // L: 178
				}
			} catch (IOException var20) {
				try {
					NetCache.NetCache_socket.close(); // L: 182
				} catch (Exception var18) { // L: 184
				}

				++NetCache.NetCache_ioExceptions; // L: 185
				NetCache.NetCache_socket = null; // L: 186
				return false; // L: 187
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lmn;IB)Lji;",
		garbageValue = "-1"
	)
	public static PacketBufferNode method2686(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = Renderable.getPacketBufferNode(ClientPacket.field3128, Client.packetWriter.isaacCipher); // L: 17
		var4.packetBuffer.writeByte(0); // L: 18
		int var5 = var4.packetBuffer.offset; // L: 19
		var4.packetBuffer.writeByte(var0); // L: 20
		String var6 = var1.toLowerCase(); // L: 21
		byte var7 = 0; // L: 22
		if (var6.startsWith("yellow:")) { // L: 23
			var7 = 0; // L: 24
			var1 = var1.substring("yellow:".length()); // L: 25
		} else if (var6.startsWith("red:")) { // L: 27
			var7 = 1; // L: 28
			var1 = var1.substring("red:".length()); // L: 29
		} else if (var6.startsWith("green:")) { // L: 31
			var7 = 2; // L: 32
			var1 = var1.substring("green:".length()); // L: 33
		} else if (var6.startsWith("cyan:")) { // L: 35
			var7 = 3; // L: 36
			var1 = var1.substring("cyan:".length()); // L: 37
		} else if (var6.startsWith("purple:")) { // L: 39
			var7 = 4; // L: 40
			var1 = var1.substring("purple:".length()); // L: 41
		} else if (var6.startsWith("white:")) { // L: 43
			var7 = 5; // L: 44
			var1 = var1.substring("white:".length()); // L: 45
		} else if (var6.startsWith("flash1:")) { // L: 47
			var7 = 6; // L: 48
			var1 = var1.substring("flash1:".length()); // L: 49
		} else if (var6.startsWith("flash2:")) { // L: 51
			var7 = 7; // L: 52
			var1 = var1.substring("flash2:".length()); // L: 53
		} else if (var6.startsWith("flash3:")) { // L: 55
			var7 = 8; // L: 56
			var1 = var1.substring("flash3:".length()); // L: 57
		} else if (var6.startsWith("glow1:")) { // L: 59
			var7 = 9; // L: 60
			var1 = var1.substring("glow1:".length()); // L: 61
		} else if (var6.startsWith("glow2:")) { // L: 63
			var7 = 10; // L: 64
			var1 = var1.substring("glow2:".length()); // L: 65
		} else if (var6.startsWith("glow3:")) { // L: 67
			var7 = 11; // L: 68
			var1 = var1.substring("glow3:".length()); // L: 69
		} else if (var2 != Language.Language_EN) { // L: 71
			if (var6.startsWith("yellow:")) { // L: 72
				var7 = 0; // L: 73
				var1 = var1.substring("yellow:".length()); // L: 74
			} else if (var6.startsWith("red:")) { // L: 76
				var7 = 1; // L: 77
				var1 = var1.substring("red:".length()); // L: 78
			} else if (var6.startsWith("green:")) { // L: 80
				var7 = 2; // L: 81
				var1 = var1.substring("green:".length()); // L: 82
			} else if (var6.startsWith("cyan:")) { // L: 84
				var7 = 3; // L: 85
				var1 = var1.substring("cyan:".length()); // L: 86
			} else if (var6.startsWith("purple:")) { // L: 88
				var7 = 4; // L: 89
				var1 = var1.substring("purple:".length()); // L: 90
			} else if (var6.startsWith("white:")) { // L: 92
				var7 = 5; // L: 93
				var1 = var1.substring("white:".length()); // L: 94
			} else if (var6.startsWith("flash1:")) { // L: 96
				var7 = 6; // L: 97
				var1 = var1.substring("flash1:".length()); // L: 98
			} else if (var6.startsWith("flash2:")) { // L: 100
				var7 = 7; // L: 101
				var1 = var1.substring("flash2:".length()); // L: 102
			} else if (var6.startsWith("flash3:")) { // L: 104
				var7 = 8; // L: 105
				var1 = var1.substring("flash3:".length()); // L: 106
			} else if (var6.startsWith("glow1:")) { // L: 108
				var7 = 9; // L: 109
				var1 = var1.substring("glow1:".length()); // L: 110
			} else if (var6.startsWith("glow2:")) { // L: 112
				var7 = 10; // L: 113
				var1 = var1.substring("glow2:".length()); // L: 114
			} else if (var6.startsWith("glow3:")) { // L: 116
				var7 = 11; // L: 117
				var1 = var1.substring("glow3:".length()); // L: 118
			}
		}

		var6 = var1.toLowerCase(); // L: 121
		byte var8 = 0; // L: 122
		if (var6.startsWith("wave:")) { // L: 123
			var8 = 1; // L: 124
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) { // L: 127
			var8 = 2; // L: 128
			var1 = var1.substring("wave2:".length()); // L: 129
		} else if (var6.startsWith("shake:")) { // L: 131
			var8 = 3; // L: 132
			var1 = var1.substring("shake:".length()); // L: 133
		} else if (var6.startsWith("scroll:")) { // L: 135
			var8 = 4; // L: 136
			var1 = var1.substring("scroll:".length()); // L: 137
		} else if (var6.startsWith("slide:")) { // L: 139
			var8 = 5; // L: 140
			var1 = var1.substring("slide:".length()); // L: 141
		} else if (var2 != Language.Language_EN) { // L: 143
			if (var6.startsWith("wave:")) { // L: 144
				var8 = 1; // L: 145
				var1 = var1.substring("wave:".length()); // L: 146
			} else if (var6.startsWith("wave2:")) { // L: 148
				var8 = 2; // L: 149
				var1 = var1.substring("wave2:".length()); // L: 150
			} else if (var6.startsWith("shake:")) { // L: 152
				var8 = 3; // L: 153
				var1 = var1.substring("shake:".length()); // L: 154
			} else if (var6.startsWith("scroll:")) { // L: 156
				var8 = 4; // L: 157
				var1 = var1.substring("scroll:".length()); // L: 158
			} else if (var6.startsWith("slide:")) { // L: 160
				var8 = 5; // L: 161
				var1 = var1.substring("slide:".length()); // L: 162
			}
		}

		var4.packetBuffer.writeByte(var7); // L: 165
		var4.packetBuffer.writeByte(var8); // L: 166
		ServerPacket.method5563(var4.packetBuffer, var1); // L: 167
		if (var0 == class317.field3738.rsOrdinal()) { // L: 168
			var4.packetBuffer.writeByte(var3); // L: 169
		}

		var4.packetBuffer.method8810(var4.packetBuffer.offset - var5); // L: 171
		return var4; // L: 172
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZB)I",
		garbageValue = "9"
	)
	static int method2687(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 1490
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1491
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.itemId; // L: 1492
			return 1; // L: 1493
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1495
			if (var3.itemId != -1) { // L: 1496
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = 0; // L: 1497
			}

			return 1; // L: 1498
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1500
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1501
			return 1; // L: 1502
		} else if (var0 == 1707) { // L: 1504
			Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = var3.method6351() ? 1 : 0; // L: 1505
			return 1; // L: 1506
		} else if (var0 == 1708) { // L: 1508
			return FileSystem.method3510(var3); // L: 1509
		} else {
			return var0 == 1709 ? class308.method6188(var3) : 2; // L: 1511 1512 1514
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "2"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 125
	}
}
