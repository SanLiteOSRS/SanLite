import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lfl;"
	)
	public static final WorldMapCacheName field1768;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lfl;"
	)
	public static final WorldMapCacheName field1761;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lfl;"
	)
	public static final WorldMapCacheName field1763;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lfl;"
	)
	static final WorldMapCacheName field1764;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lfl;"
	)
	public static final WorldMapCacheName field1765;
	@ObfuscatedName("e")
	@Export("name")
	public final String name;

	static {
		field1768 = new WorldMapCacheName("details");
		field1761 = new WorldMapCacheName("compositemap");
		field1763 = new WorldMapCacheName("compositetexture");
		field1764 = new WorldMapCacheName("area");
		field1765 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "126"
	)
	public static boolean method3189() {
		long var0 = ObjectSound.currentTimeMillis();
		int var2 = (int)(var0 - NetCache.field3284);
		NetCache.field3284 = var0;
		if (var2 > 200) {
			var2 = 200;
		}

		NetCache.NetCache_loadTime += var2;
		if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
			return true;
		} else if (class303.NetCache_socket == null) {
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
						class303.NetCache_socket.write(var4.array, 0, 4);
						NetCache.NetCache_pendingPriorityResponses.put(var3, var3.key);
						--NetCache.NetCache_pendingPriorityWritesCount;
						++NetCache.NetCache_pendingPriorityResponsesCount;
					}

					while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
						var3 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
						var4 = new Buffer(4);
						var4.writeByte(0);
						var4.writeMedium((int)var3.key);
						class303.NetCache_socket.write(var4.array, 0, 4);
						var3.removeDual();
						NetCache.NetCache_pendingResponses.put(var3, var3.key);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingResponsesCount;
					}

					for (int var15 = 0; var15 < 100; ++var15) {
						int var16 = class303.NetCache_socket.available();
						if (var16 < 0) {
							throw new IOException();
						}

						if (var16 == 0) {
							break;
						}

						NetCache.NetCache_loadTime = 0;
						byte var5 = 0;
						if (class208.NetCache_currentResponse == null) {
							var5 = 8;
						} else if (NetCache.field3295 == 0) {
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

							class303.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var6);
							if (NetCache.field3287 != 0) {
								for (var7 = 0; var7 < var6; ++var7) {
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = var7 + NetCache.NetCache_responseHeaderBuffer.offset;
									var10000[var10001] ^= NetCache.field3287;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer;
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) {
								break;
							}

							if (class208.NetCache_currentResponse == null) {
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt();
								long var11 = (long)(var8 + (var7 << 16));
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11);
								NetSocket.field1498 = true;
								if (var13 == null) {
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11);
									NetSocket.field1498 = false;
								}

								if (var13 == null) {
									throw new IOException();
								}

								int var14 = var9 == 0 ? 5 : 9;
								class208.NetCache_currentResponse = var13;
								InterfaceParent.NetCache_responseArchiveBuffer = new Buffer(var14 + var10 + class208.NetCache_currentResponse.padding);
								InterfaceParent.NetCache_responseArchiveBuffer.writeByte(var9);
								InterfaceParent.NetCache_responseArchiveBuffer.writeInt(var10);
								NetCache.field3295 = 8;
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
							} else if (NetCache.field3295 == 0) {
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
									NetCache.field3295 = 1;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else {
									class208.NetCache_currentResponse = null;
								}
							}
						} else {
							var6 = InterfaceParent.NetCache_responseArchiveBuffer.array.length - class208.NetCache_currentResponse.padding;
							var7 = 512 - NetCache.field3295;
							if (var7 > var6 - InterfaceParent.NetCache_responseArchiveBuffer.offset) {
								var7 = var6 - InterfaceParent.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) {
								var7 = var16;
							}

							class303.NetCache_socket.read(InterfaceParent.NetCache_responseArchiveBuffer.array, InterfaceParent.NetCache_responseArchiveBuffer.offset, var7);
							if (NetCache.field3287 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = InterfaceParent.NetCache_responseArchiveBuffer.array;
									var10001 = var8 + InterfaceParent.NetCache_responseArchiveBuffer.offset;
									var10000[var10001] ^= NetCache.field3287;
								}
							}

							var22 = InterfaceParent.NetCache_responseArchiveBuffer;
							var22.offset += var7;
							NetCache.field3295 += var7;
							if (var6 == InterfaceParent.NetCache_responseArchiveBuffer.offset) {
								if (16711935L == class208.NetCache_currentResponse.key) {
									BuddyRankComparator.NetCache_reference = InterfaceParent.NetCache_responseArchiveBuffer;

									for (var8 = 0; var8 < 256; ++var8) {
										Archive var17 = NetCache.NetCache_archives[var8];
										if (var17 != null) {
											BuddyRankComparator.NetCache_reference.offset = var8 * 8 + 5;
											var10 = BuddyRankComparator.NetCache_reference.readInt();
											int var18 = BuddyRankComparator.NetCache_reference.readInt();
											var17.loadIndex(var10, var18);
										}
									}
								} else {
									NetCache.NetCache_crc.reset();
									NetCache.NetCache_crc.update(InterfaceParent.NetCache_responseArchiveBuffer.array, 0, var6);
									var8 = (int)NetCache.NetCache_crc.getValue();
									if (var8 != class208.NetCache_currentResponse.crc) {
										try {
											class303.NetCache_socket.close();
										} catch (Exception var20) {
										}

										++NetCache.NetCache_crcMismatches;
										class303.NetCache_socket = null;
										NetCache.field3287 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									NetCache.NetCache_crcMismatches = 0;
									NetCache.NetCache_ioExceptions = 0;
									class208.NetCache_currentResponse.archive.write((int)(class208.NetCache_currentResponse.key & 65535L), InterfaceParent.NetCache_responseArchiveBuffer.array, 16711680L == (class208.NetCache_currentResponse.key & 16711680L), NetSocket.field1498);
								}

								class208.NetCache_currentResponse.remove();
								if (NetSocket.field1498) {
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount;
								}

								NetCache.field3295 = 0;
								class208.NetCache_currentResponse = null;
								InterfaceParent.NetCache_responseArchiveBuffer = null;
							} else {
								if (NetCache.field3295 != 512) {
									break;
								}

								NetCache.field3295 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					class303.NetCache_socket.close();
				} catch (Exception var19) {
				}

				++NetCache.NetCache_ioExceptions;
				class303.NetCache_socket = null;
				return false;
			}
		}
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1888854268"
	)
	static final void method3188() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) {
			int var1 = Client.npcIndices[var0];
			NPC var2 = Client.npcs[var1];
			if (var2 != null) {
				class137.updateActorSequence(var2, var2.definition.size);
			}
		}

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		signature = "(IIIILoh;Lhh;S)V",
		garbageValue = "4096"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method7056(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
