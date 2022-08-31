import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 523238599
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("w")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("v")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	public static boolean method1036() {
		long var0 = class181.method3483(); // L: 44
		int var2 = (int)(var0 - NetCache.field4017); // L: 45
		NetCache.field4017 = var0; // L: 46
		if (var2 > 200) { // L: 47
			var2 = 200;
		}

		NetCache.NetCache_loadTime += var2; // L: 48
		if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 49
			return true;
		} else if (NetCache.NetCache_socket == null) { // L: 50
			return false;
		} else {
			try {
				if (NetCache.NetCache_loadTime > 30000) { // L: 52
					throw new IOException();
				} else {
					NetFileRequest var3;
					Buffer var4;
					while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 53
						var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 54
						var4 = new Buffer(4); // L: 55
						var4.writeByte(1); // L: 56
						var4.writeMedium((int)var3.key); // L: 57
						NetCache.NetCache_socket.write(var4.array, 0, 4); // L: 58
						NetCache.NetCache_pendingPriorityResponses.put(var3, var3.key); // L: 59
						--NetCache.NetCache_pendingPriorityWritesCount; // L: 60
						++NetCache.NetCache_pendingPriorityResponsesCount; // L: 61
					}

					while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 63
						var3 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 64
						var4 = new Buffer(4); // L: 65
						var4.writeByte(0); // L: 66
						var4.writeMedium((int)var3.key); // L: 67
						NetCache.NetCache_socket.write(var4.array, 0, 4); // L: 68
						var3.removeDual(); // L: 69
						NetCache.NetCache_pendingResponses.put(var3, var3.key); // L: 70
						--NetCache.NetCache_pendingWritesCount; // L: 71
						++NetCache.NetCache_pendingResponsesCount; // L: 72
					}

					for (int var15 = 0; var15 < 100; ++var15) { // L: 74
						int var16 = NetCache.NetCache_socket.available(); // L: 75
						if (var16 < 0) { // L: 76
							throw new IOException();
						}

						if (var16 == 0) { // L: 77
							break;
						}

						NetCache.NetCache_loadTime = 0; // L: 78
						byte var5 = 0; // L: 79
						if (MenuAction.NetCache_currentResponse == null) { // L: 80
							var5 = 8;
						} else if (NetCache.field4028 == 0) { // L: 81
							var5 = 1;
						}

						int var6;
						int var7;
						int var8;
						int var10;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var5 > 0) { // L: 82
							var6 = var5 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 83
							if (var6 > var16) { // L: 84
								var6 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var6); // L: 85
							if (NetCache.field4029 != 0) { // L: 86
								for (var7 = 0; var7 < var6; ++var7) { // L: 87
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var7;
									var10000[var10001] ^= NetCache.field4029;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer; // L: 89
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) { // L: 90
								break;
							}

							if (MenuAction.NetCache_currentResponse == null) { // L: 91
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 92
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 93
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 94
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 95
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 96
								long var11 = (long)(var8 + (var7 << 16)); // L: 97
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11); // L: 98
								ClanChannelMember.field1546 = true; // L: 99
								if (var13 == null) { // L: 100
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11); // L: 101
									ClanChannelMember.field1546 = false; // L: 102
								}

								if (var13 == null) { // L: 104
									throw new IOException(); // L: 105
								}

								int var14 = var9 == 0 ? 5 : 9; // L: 107
								MenuAction.NetCache_currentResponse = var13; // L: 108
								ClientPreferences.NetCache_responseArchiveBuffer = new Buffer(var14 + var10 + MenuAction.NetCache_currentResponse.padding); // L: 109
								ClientPreferences.NetCache_responseArchiveBuffer.writeByte(var9); // L: 110
								ClientPreferences.NetCache_responseArchiveBuffer.writeInt(var10); // L: 111
								NetCache.field4028 = 8; // L: 112
								NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 113
							} else if (NetCache.field4028 == 0) { // L: 116
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 117
									NetCache.field4028 = 1; // L: 118
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 119
								} else {
									MenuAction.NetCache_currentResponse = null; // L: 123
								}
							}
						} else {
							var6 = ClientPreferences.NetCache_responseArchiveBuffer.array.length - MenuAction.NetCache_currentResponse.padding; // L: 129
							var7 = 512 - NetCache.field4028; // L: 130
							if (var7 > var6 - ClientPreferences.NetCache_responseArchiveBuffer.offset) { // L: 131
								var7 = var6 - ClientPreferences.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) { // L: 132
								var7 = var16;
							}

							NetCache.NetCache_socket.read(ClientPreferences.NetCache_responseArchiveBuffer.array, ClientPreferences.NetCache_responseArchiveBuffer.offset, var7); // L: 133
							if (NetCache.field4029 != 0) { // L: 134
								for (var8 = 0; var8 < var7; ++var8) { // L: 135
									var10000 = ClientPreferences.NetCache_responseArchiveBuffer.array;
									var10001 = ClientPreferences.NetCache_responseArchiveBuffer.offset + var8;
									var10000[var10001] ^= NetCache.field4029;
								}
							}

							var22 = ClientPreferences.NetCache_responseArchiveBuffer; // L: 137
							var22.offset += var7;
							NetCache.field4028 += var7; // L: 138
							if (var6 == ClientPreferences.NetCache_responseArchiveBuffer.offset) { // L: 139
								if (MenuAction.NetCache_currentResponse.key == 16711935L) { // L: 140
									UserComparator3.field1385 = ClientPreferences.NetCache_responseArchiveBuffer; // L: 141

									for (var8 = 0; var8 < 256; ++var8) { // L: 142
										Archive var17 = NetCache.NetCache_archives[var8]; // L: 143
										if (var17 != null) { // L: 144
											UserComparator3.field1385.offset = var8 * 8 + 5; // L: 146
											if (UserComparator3.field1385.offset >= UserComparator3.field1385.array.length) { // L: 147
												if (!var17.field3988) { // L: 148
													throw new RuntimeException(""); // L: 152
												}

												var17.method5729(); // L: 149
											} else {
												var10 = UserComparator3.field1385.readInt(); // L: 154
												int var18 = UserComparator3.field1385.readInt(); // L: 155
												var17.loadIndex(var10, var18); // L: 156
											}
										}
									}
								} else {
									NetCache.NetCache_crc.reset(); // L: 162
									NetCache.NetCache_crc.update(ClientPreferences.NetCache_responseArchiveBuffer.array, 0, var6); // L: 163
									var8 = (int)NetCache.NetCache_crc.getValue(); // L: 164
									if (var8 != MenuAction.NetCache_currentResponse.crc) { // L: 165
										try {
											NetCache.NetCache_socket.close(); // L: 167
										} catch (Exception var20) { // L: 169
										}

										++NetCache.NetCache_crcMismatches; // L: 170
										NetCache.NetCache_socket = null; // L: 171
										NetCache.field4029 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 172
										return false; // L: 173
									}

									NetCache.NetCache_crcMismatches = 0; // L: 175
									NetCache.NetCache_ioExceptions = 0; // L: 176
									MenuAction.NetCache_currentResponse.archive.write((int)(MenuAction.NetCache_currentResponse.key & 65535L), ClientPreferences.NetCache_responseArchiveBuffer.array, (MenuAction.NetCache_currentResponse.key & 16711680L) == 16711680L, ClanChannelMember.field1546); // L: 177
								}

								MenuAction.NetCache_currentResponse.remove(); // L: 179
								if (ClanChannelMember.field1546) { // L: 180
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount; // L: 181
								}

								NetCache.field4028 = 0; // L: 182
								MenuAction.NetCache_currentResponse = null; // L: 183
								ClientPreferences.NetCache_responseArchiveBuffer = null; // L: 184
							} else {
								if (NetCache.field4028 != 512) { // L: 186
									break;
								}

								NetCache.field4028 = 0;
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
		descriptor = "(Lpm;IIB)I",
		garbageValue = "-2"
	)
	static int method1035(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1895664145"
	)
	static String method1034(int var0) {
		if (var0 < 0) { // L: 9411
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 9412 9413
		}
	}
}
