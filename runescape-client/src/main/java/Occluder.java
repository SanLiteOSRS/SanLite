import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -313882237
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1872976045
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 698541949
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1917785735
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 937252763
	)
	@Export("type")
	int type;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 307807739
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -706741873
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1147462173
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1046615135
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -132506543
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 92389715
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -276045913
	)
	int field1931;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 988545829
	)
	int field1925;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 927138423
	)
	int field1933;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1152663609
	)
	int field1920;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1721087493
	)
	int field1932;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -666576693
	)
	int field1936;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1378850457
	)
	int field1937;

	Occluder() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "22"
	)
	public static boolean method3411() {
		long var0 = Nameable.currentTimeMillis();
		int var2 = (int)(var0 - JagexCache.field2081);
		JagexCache.field2081 = var0;
		if (var2 > 200) {
			var2 = 200;
		}

		NetCache.NetCache_loadTime += var2;
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
						var4.writeByte(1);
						var4.writeMedium((int)var3.key);
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
						if (NetCache.NetCache_currentResponse == null) {
							var5 = 8;
						} else if (NetCache.field3190 == 0) {
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
							if (NetCache.field3207 != 0) {
								for (var7 = 0; var7 < var6; ++var7) {
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var7;
									var10000[var10001] ^= NetCache.field3207;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer;
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) {
								break;
							}

							if (NetCache.NetCache_currentResponse == null) {
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt();
								long var11 = (long)(var8 + (var7 << 16));
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11);
								NetCache.field3200 = true;
								if (var13 == null) {
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11);
									NetCache.field3200 = false;
								}

								if (var13 == null) {
									throw new IOException();
								}

								int var14 = var9 == 0 ? 5 : 9;
								NetCache.NetCache_currentResponse = var13;
								NetCache.NetCache_responseArchiveBuffer = new Buffer(var10 + var14 + NetCache.NetCache_currentResponse.padding);
								NetCache.NetCache_responseArchiveBuffer.writeByte(var9);
								NetCache.NetCache_responseArchiveBuffer.writeInt(var10);
								NetCache.field3190 = 8;
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
							} else if (NetCache.field3190 == 0) {
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
									NetCache.field3190 = 1;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else {
									NetCache.NetCache_currentResponse = null;
								}
							}
						} else {
							var6 = NetCache.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding;
							var7 = 512 - NetCache.field3190;
							if (var7 > var6 - NetCache.NetCache_responseArchiveBuffer.offset) {
								var7 = var6 - NetCache.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) {
								var7 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset, var7);
							if (NetCache.field3207 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = NetCache.NetCache_responseArchiveBuffer.array;
									var10001 = var8 + NetCache.NetCache_responseArchiveBuffer.offset;
									var10000[var10001] ^= NetCache.field3207;
								}
							}

							var22 = NetCache.NetCache_responseArchiveBuffer;
							var22.offset += var7;
							NetCache.field3190 += var7;
							if (var6 == NetCache.NetCache_responseArchiveBuffer.offset) {
								if (NetCache.NetCache_currentResponse.key == 16711935L) {
									class90.NetCache_reference = NetCache.NetCache_responseArchiveBuffer;

									for (var8 = 0; var8 < 256; ++var8) {
										Archive var17 = NetCache.NetCache_archives[var8];
										if (var17 != null) {
											class90.NetCache_reference.offset = var8 * 8 + 5;
											var10 = class90.NetCache_reference.readInt();
											int var18 = class90.NetCache_reference.readInt();
											var17.loadIndex(var10, var18);
										}
									}
								} else {
									NetCache.NetCache_crc.reset();
									NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, var6);
									var8 = (int)NetCache.NetCache_crc.getValue();
									if (var8 != NetCache.NetCache_currentResponse.crc) {
										try {
											NetCache.NetCache_socket.close();
										} catch (Exception var20) {
										}

										++NetCache.NetCache_crcMismatches;
										NetCache.NetCache_socket = null;
										NetCache.field3207 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									NetCache.NetCache_crcMismatches = 0;
									NetCache.NetCache_ioExceptions = 0;
									NetCache.NetCache_currentResponse.archive.write((int)(NetCache.NetCache_currentResponse.key & 65535L), NetCache.NetCache_responseArchiveBuffer.array, (NetCache.NetCache_currentResponse.key & 16711680L) == 16711680L, NetCache.field3200);
								}

								NetCache.NetCache_currentResponse.remove();
								if (NetCache.field3200) {
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount;
								}

								NetCache.field3190 = 0;
								NetCache.NetCache_currentResponse = null;
								NetCache.NetCache_responseArchiveBuffer = null;
							} else {
								if (NetCache.field3190 != 512) {
									break;
								}

								NetCache.field3190 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var19) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
				return false;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Throwable;S)Ljava/lang/String;",
		garbageValue = "150"
	)
	static String method3413(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) {
			RunException var2 = (RunException)var0;
			var1 = var2.message + " | ";
			var0 = var2.throwable;
		} else {
			var1 = "";
		}

		StringWriter var12 = new StringWriter();
		PrintWriter var3 = new PrintWriter(var12);
		var0.printStackTrace(var3);
		var3.close();
		String var4 = var12.toString();
		BufferedReader var5 = new BufferedReader(new StringReader(var4));
		String var6 = var5.readLine();

		while (true) {
			while (true) {
				String var7 = var5.readLine();
				if (var7 == null) {
					var1 = var1 + "| " + var6;
					return var1;
				}

				int var8 = var7.indexOf(40);
				int var9 = var7.indexOf(41, var8 + 1);
				if (var8 >= 0 && var9 >= 0) {
					String var10 = var7.substring(var8 + 1, var9);
					int var11 = var10.indexOf(".java:");
					if (var11 >= 0) {
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
						var1 = var1 + var10 + ' ';
						continue;
					}

					var7 = var7.substring(0, var8);
				}

				var7 = var7.trim();
				var7 = var7.substring(var7.lastIndexOf(32) + 1);
				var7 = var7.substring(var7.lastIndexOf(9) + 1);
				var1 = var1 + var7 + ' ';
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-1048299537"
	)
	static final int method3412(int var0, int var1) {
		int var2 = DynamicObject.method2357(var0 + 45365, var1 + 91923, 4) - 128 + (DynamicObject.method2357(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (DynamicObject.method2357(var0, var1, 1) - 128 >> 2);
		var2 = (int)(0.3D * (double)var2) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}
}
