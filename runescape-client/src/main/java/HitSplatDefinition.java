import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	public static AbstractArchive field1731;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -562228541
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1310441091
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -654467791
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 926003347
	)
	public int field1735;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -317860375
	)
	int field1732;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1265156123
	)
	int field1750;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 389377947
	)
	int field1746;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -874345173
	)
	int field1747;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1104481509
	)
	public int field1748;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1793396621
	)
	public int field1749;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 208289651
	)
	public int field1743;
	@ObfuscatedName("f")
	String field1751;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2027049703
	)
	public int field1752;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1572052995
	)
	public int field1753;
	@ObfuscatedName("w")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -965854333
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 329700349
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(20);
	}

	public HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field1735 = 70;
		this.field1732 = -1;
		this.field1750 = -1;
		this.field1746 = -1;
		this.field1747 = -1;
		this.field1748 = 0;
		this.field1749 = 0;
		this.field1743 = -1;
		this.field1751 = "";
		this.field1752 = -1;
		this.field1753 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-135808343"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "1862722203"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.method6464();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field1732 = var1.method6464();
		} else if (var2 == 4) {
			this.field1746 = var1.method6464();
		} else if (var2 == 5) {
			this.field1750 = var1.method6464();
		} else if (var2 == 6) {
			this.field1747 = var1.method6464();
		} else if (var2 == 7) {
			this.field1748 = var1.readShort();
		} else if (var2 == 8) {
			this.field1751 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field1735 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field1749 = var1.readShort();
		} else if (var2 == 11) {
			this.field1743 = 0;
		} else if (var2 == 12) {
			this.field1752 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field1753 = var1.readShort();
		} else if (var2 == 14) {
			this.field1743 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}

			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];

			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)Lep;",
		garbageValue = "-20229"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = ObjectComposition.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		if (var2 != -1) {
			HitSplatDefinition var4 = (HitSplatDefinition)HitSplatDefinition_cached.get((long)var2);
			HitSplatDefinition var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = HitSplatDefinition_archive.takeFile(32, var2);
				var4 = new HitSplatDefinition();
				if (var5 != null) {
					var4.decode(new Buffer(var5));
				}

				HitSplatDefinition_cached.put(var4, (long)var2);
				var3 = var4;
			}

			return var3;
		} else {
			return null;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2025907756"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field1751;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + PendingSpawn.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-1353066238"
	)
	public SpritePixels method2890() {
		if (this.field1732 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cached.get((long)this.field1732);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Friend.SpriteBuffer_getSprite(field1731, this.field1732, 0);
				if (var1 != null) {
					HealthBarDefinition_cached.put(var1, (long)this.field1732);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-1885835544"
	)
	public SpritePixels method2893() {
		if (this.field1750 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cached.get((long)this.field1750);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Friend.SpriteBuffer_getSprite(field1731, this.field1750, 0);
				if (var1 != null) {
					HealthBarDefinition_cached.put(var1, (long)this.field1750);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "1224895394"
	)
	public SpritePixels method2871() {
		if (this.field1746 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cached.get((long)this.field1746);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Friend.SpriteBuffer_getSprite(field1731, this.field1746, 0);
				if (var1 != null) {
					HealthBarDefinition_cached.put(var1, (long)this.field1746);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Low;",
		garbageValue = "-1519234970"
	)
	public SpritePixels method2872() {
		if (this.field1747 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cached.get((long)this.field1747);
			if (var1 != null) {
				return var1;
			} else {
				var1 = Friend.SpriteBuffer_getSprite(field1731, this.field1747, 0);
				if (var1 != null) {
					HealthBarDefinition_cached.put(var1, (long)this.field1747);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lkc;",
		garbageValue = "247804226"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HealthBarDefinition_cachedSprites.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = field1731;
				AbstractArchive var4 = HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!Username.method5711(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class243.SpriteBuffer_xOffsets, class396.SpriteBuffer_yOffsets, ArchiveDiskActionHandler.SpriteBuffer_spriteWidths, class372.SpriteBuffer_spriteHeights, AccessFile.SpriteBuffer_spritePalette, class396.SpriteBuffer_pixels);
						class243.SpriteBuffer_xOffsets = null;
						class396.SpriteBuffer_yOffsets = null;
						ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null;
						class372.SpriteBuffer_spriteHeights = null;
						AccessFile.SpriteBuffer_spritePalette = null;
						class396.SpriteBuffer_pixels = null;
						var6 = var8;
					}

					var2 = var6;
				}

				if (var2 != null) {
					HealthBarDefinition_cachedSprites.put(var2, (long)this.fontId);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2092279976"
	)
	public static boolean method2896() {
		long var0 = Archive.currentTimeMillis();
		int var2 = (int)(var0 - SecureRandomCallable.field1108);
		SecureRandomCallable.field1108 = var0;
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
						if (class7.NetCache_currentResponse == null) {
							var5 = 8;
						} else if (NetCache.field3626 == 0) {
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
							if (NetCache.field3629 != 0) {
								for (var7 = 0; var7 < var6; ++var7) {
									var10000 = NetCache.NetCache_responseHeaderBuffer.array;
									var10001 = var7 + NetCache.NetCache_responseHeaderBuffer.offset;
									var10000[var10001] ^= NetCache.field3629;
								}
							}

							var22 = NetCache.NetCache_responseHeaderBuffer;
							var22.offset += var6;
							if (NetCache.NetCache_responseHeaderBuffer.offset < var5) {
								break;
							}

							if (class7.NetCache_currentResponse == null) {
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
								var7 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var8 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
								int var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
								var10 = NetCache.NetCache_responseHeaderBuffer.readInt();
								long var11 = (long)(var8 + (var7 << 16));
								NetFileRequest var13 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var11);
								PlayerType.field3563 = true;
								if (var13 == null) {
									var13 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var11);
									PlayerType.field3563 = false;
								}

								if (var13 == null) {
									throw new IOException();
								}

								int var14 = var9 == 0 ? 5 : 9;
								class7.NetCache_currentResponse = var13;
								NetCache.NetCache_responseArchiveBuffer = new Buffer(var14 + var10 + class7.NetCache_currentResponse.padding);
								NetCache.NetCache_responseArchiveBuffer.writeByte(var9);
								NetCache.NetCache_responseArchiveBuffer.writeInt(var10);
								NetCache.field3626 = 8;
								NetCache.NetCache_responseHeaderBuffer.offset = 0;
							} else if (NetCache.field3626 == 0) {
								if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
									NetCache.field3626 = 1;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else {
									class7.NetCache_currentResponse = null;
								}
							}
						} else {
							var6 = NetCache.NetCache_responseArchiveBuffer.array.length - class7.NetCache_currentResponse.padding;
							var7 = 512 - NetCache.field3626;
							if (var7 > var6 - NetCache.NetCache_responseArchiveBuffer.offset) {
								var7 = var6 - NetCache.NetCache_responseArchiveBuffer.offset;
							}

							if (var7 > var16) {
								var7 = var16;
							}

							NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset, var7);
							if (NetCache.field3629 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = NetCache.NetCache_responseArchiveBuffer.array;
									var10001 = NetCache.NetCache_responseArchiveBuffer.offset + var8;
									var10000[var10001] ^= NetCache.field3629;
								}
							}

							var22 = NetCache.NetCache_responseArchiveBuffer;
							var22.offset += var7;
							NetCache.field3626 += var7;
							if (var6 == NetCache.NetCache_responseArchiveBuffer.offset) {
								if (class7.NetCache_currentResponse.key == 16711935L) {
									SecureRandomCallable.NetCache_reference = NetCache.NetCache_responseArchiveBuffer;

									for (var8 = 0; var8 < 256; ++var8) {
										Archive var17 = NetCache.NetCache_archives[var8];
										if (var17 != null) {
											SecureRandomCallable.NetCache_reference.offset = var8 * 8 + 5;
											var10 = SecureRandomCallable.NetCache_reference.readInt();
											int var18 = SecureRandomCallable.NetCache_reference.readInt();
											var17.loadIndex(var10, var18);
										}
									}
								} else {
									NetCache.NetCache_crc.reset();
									NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, var6);
									var8 = (int)NetCache.NetCache_crc.getValue();
									if (var8 != class7.NetCache_currentResponse.crc) {
										try {
											NetCache.NetCache_socket.close();
										} catch (Exception var20) {
										}

										++NetCache.NetCache_crcMismatches;
										NetCache.NetCache_socket = null;
										NetCache.field3629 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									NetCache.NetCache_crcMismatches = 0;
									NetCache.NetCache_ioExceptions = 0;
									class7.NetCache_currentResponse.archive.write((int)(class7.NetCache_currentResponse.key & 65535L), NetCache.NetCache_responseArchiveBuffer.array, 16711680L == (class7.NetCache_currentResponse.key & 16711680L), PlayerType.field3563);
								}

								class7.NetCache_currentResponse.remove();
								if (PlayerType.field3563) {
									--NetCache.NetCache_pendingPriorityResponsesCount;
								} else {
									--NetCache.NetCache_pendingResponsesCount;
								}

								NetCache.field3626 = 0;
								class7.NetCache_currentResponse = null;
								NetCache.NetCache_responseArchiveBuffer = null;
							} else {
								if (NetCache.field3626 != 512) {
									break;
								}

								NetCache.field3626 = 0;
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

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2037549792"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
