import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("h")
	boolean field3838;
	@ObfuscatedName("c")
	boolean field3839;

	Friend() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llk;I)I",
		garbageValue = "1098181185"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field3838 && !var1.field3838) {
			return -1;
		} else if (!this.field3838 && var1.field3838) {
			return 1;
		} else if (this.field3839 && !var1.field3839) {
			return -1;
		} else if (!this.field3839 && var1.field3839) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llm;B)I",
		garbageValue = "88"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lef;",
		garbageValue = "-6"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-1000223970"
	)
	static final void method5550(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();

		byte[] var10000;
		int var2;
		int var4;
		int var6;
		int var7;
		int var8;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var8 = Players.Players_indices[var2];
			if ((Players.field1344[var8] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1344;
					var10000[var8] = (byte)(var10000[var8] | 2);
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var6 = var0.readBits(2);
						if (var6 == 0) {
							var7 = 0;
						} else if (var6 == 1) {
							var7 = var0.readBits(5);
						} else if (var6 == 2) {
							var7 = var0.readBits(8);
						} else {
							var7 = var0.readBits(11);
						}

						var1 = var7;
						var10000 = Players.field1344;
						var10000[var8] = (byte)(var10000[var8] | 2);
					} else {
						class35.readPlayerUpdate(var0, var8);
					}
				}
			}
		}

		var0.exportIndex();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var2 = 0; var2 < Players.Players_count; ++var2) {
				var8 = Players.Players_indices[var2];
				if ((Players.field1344[var8] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.field1344;
						var10000[var8] = (byte)(var10000[var8] | 2);
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var6 = var0.readBits(2);
							if (var6 == 0) {
								var7 = 0;
							} else if (var6 == 1) {
								var7 = var0.readBits(5);
							} else if (var6 == 2) {
								var7 = var0.readBits(8);
							} else {
								var7 = var0.readBits(11);
							}

							var1 = var7;
							var10000 = Players.field1344;
							var10000[var8] = (byte)(var10000[var8] | 2);
						} else {
							class35.readPlayerUpdate(var0, var8);
						}
					}
				}
			}

			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var8 = Players.Players_emptyIndices[var2];
					if ((Players.field1344[var8] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1344;
							var10000[var8] = (byte)(var10000[var8] | 2);
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var6 = var0.readBits(2);
								if (var6 == 0) {
									var7 = 0;
								} else if (var6 == 1) {
									var7 = var0.readBits(5);
								} else if (var6 == 2) {
									var7 = var0.readBits(8);
								} else {
									var7 = var0.readBits(11);
								}

								var1 = var7;
								var10000 = Players.field1344;
								var10000[var8] = (byte)(var10000[var8] | 2);
							} else if (Tiles.updateExternalPlayer(var0, var8)) {
								var10000 = Players.field1344;
								var10000[var8] = (byte)(var10000[var8] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var8 = Players.Players_emptyIndices[var2];
						if ((Players.field1344[var8] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.field1344;
								var10000[var8] = (byte)(var10000[var8] | 2);
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var6 = var0.readBits(2);
									if (var6 == 0) {
										var7 = 0;
									} else if (var6 == 1) {
										var7 = var0.readBits(5);
									} else if (var6 == 2) {
										var7 = var0.readBits(8);
									} else {
										var7 = var0.readBits(11);
									}

									var1 = var7;
									var10000 = Players.field1344;
									var10000[var8] = (byte)(var10000[var8] | 2);
								} else if (Tiles.updateExternalPlayer(var0, var8)) {
									var10000 = Players.field1344;
									var10000[var8] = (byte)(var10000[var8] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var2 = 1; var2 < 2048; ++var2) {
							var10000 = Players.field1344;
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2];
							if (var3 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljp;III)Low;",
		garbageValue = "609200231"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!Username.method5711(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels();
			var4.width = class396.SpriteBuffer_spriteWidth;
			var4.height = class396.SpriteBuffer_spriteHeight;
			var4.xOffset = class243.SpriteBuffer_xOffsets[0];
			var4.yOffset = class396.SpriteBuffer_yOffsets[0];
			var4.subWidth = ArchiveDiskActionHandler.SpriteBuffer_spriteWidths[0];
			var4.subHeight = class372.SpriteBuffer_spriteHeights[0];
			int var5 = var4.subWidth * var4.subHeight;
			byte[] var6 = class396.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];

			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = AccessFile.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class243.SpriteBuffer_xOffsets = null;
			class396.SpriteBuffer_yOffsets = null;
			ArchiveDiskActionHandler.SpriteBuffer_spriteWidths = null;
			class372.SpriteBuffer_spriteHeights = null;
			AccessFile.SpriteBuffer_spritePalette = null;
			class396.SpriteBuffer_pixels = null;
			return var4;
		}
	}
}
