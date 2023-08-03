import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("aj")
	static final int[] field2092;
	@ObfuscatedName("gy")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1797505233
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1893247295
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 323707367
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field2092 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field2092[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1506861624"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 31
			if (var2 == 0) { // L: 32
				return; // L: 35
			}

			this.decodeNext(var1, var2); // L: 33
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)V",
		garbageValue = "-7"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 38
			this.baseVar = var1.readUnsignedShort(); // L: 39
			this.startBit = var1.readUnsignedByte(); // L: 40
			this.endBit = var1.readUnsignedByte(); // L: 41
		}

	} // L: 44

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lmt;",
		garbageValue = "-2070721746"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (ArchiveLoader.Widget_interfaceComponents[var1] == null || ArchiveLoader.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = Login.loadInterface(var1); // L: 228
			if (!var3) {
				return null;
			}
		}

		return ArchiveLoader.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Lcr;II[I[II)V",
		garbageValue = "-1873571758"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 82
			int var5 = var1 - 1; // L: 83
			int var6 = var2 + 1; // L: 84
			int var7 = (var2 + var1) / 2; // L: 85
			World var8 = var0[var7]; // L: 86
			var0[var7] = var0[var1]; // L: 87
			var0[var1] = var8; // L: 88

			while (var5 < var6) { // L: 89
				boolean var9 = true; // L: 90

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 92

					for (var10 = 0; var10 < 4; ++var10) { // L: 93
						if (var3[var10] == 2) { // L: 96
							var11 = var0[var6].index; // L: 97
							var12 = var8.index; // L: 98
						} else if (var3[var10] == 1) { // L: 100
							var11 = var0[var6].population; // L: 101
							var12 = var8.population; // L: 102
							if (var11 == -1 && var4[var10] == 1) { // L: 103
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 104
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 106
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 107
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 108
						} else {
							var11 = var0[var6].id; // L: 111
							var12 = var8.id; // L: 112
						}

						if (var12 != var11) { // L: 114
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 117 118
								var9 = false; // L: 120
							}
							break;
						}

						if (var10 == 3) { // L: 115
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 125

				do {
					++var5; // L: 127

					for (var10 = 0; var10 < 4; ++var10) { // L: 128
						if (var3[var10] == 2) { // L: 131
							var11 = var0[var5].index; // L: 132
							var12 = var8.index; // L: 133
						} else if (var3[var10] == 1) { // L: 135
							var11 = var0[var5].population; // L: 136
							var12 = var8.population; // L: 137
							if (var11 == -1 && var4[var10] == 1) { // L: 138
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 139
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 141
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 142
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 143
						} else {
							var11 = var0[var5].id; // L: 146
							var12 = var8.id; // L: 147
						}

						if (var11 != var12) { // L: 149
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 152 153
								var9 = false; // L: 155
							}
							break;
						}

						if (var10 == 3) { // L: 150
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 160
					World var13 = var0[var5]; // L: 161
					var0[var5] = var0[var6]; // L: 162
					var0[var6] = var13; // L: 163
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 166
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 167
		}

	} // L: 169

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1174907654"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 207
		var1.offset = var0.length - 2; // L: 208
		class528.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 209
		class492.SpriteBuffer_xOffsets = new int[class528.SpriteBuffer_spriteCount]; // L: 210
		class134.SpriteBuffer_yOffsets = new int[class528.SpriteBuffer_spriteCount]; // L: 211
		class172.SpriteBuffer_spriteWidths = new int[class528.SpriteBuffer_spriteCount]; // L: 212
		class528.SpriteBuffer_spriteHeights = new int[class528.SpriteBuffer_spriteCount]; // L: 213
		ArchiveDiskAction.SpriteBuffer_pixels = new byte[class528.SpriteBuffer_spriteCount][]; // L: 214
		var1.offset = var0.length - 7 - class528.SpriteBuffer_spriteCount * 8; // L: 215
		class528.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 216
		class528.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 217
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 218

		int var3;
		for (var3 = 0; var3 < class528.SpriteBuffer_spriteCount; ++var3) { // L: 219
			class492.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class528.SpriteBuffer_spriteCount; ++var3) { // L: 220
			class134.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class528.SpriteBuffer_spriteCount; ++var3) { // L: 221
			class172.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class528.SpriteBuffer_spriteCount; ++var3) { // L: 222
			class528.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class528.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 223
		class528.SpriteBuffer_spritePalette = new int[var2]; // L: 224

		for (var3 = 1; var3 < var2; ++var3) { // L: 225
			class528.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 226
			if (class528.SpriteBuffer_spritePalette[var3] == 0) { // L: 227
				class528.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 229

		for (var3 = 0; var3 < class528.SpriteBuffer_spriteCount; ++var3) { // L: 230
			int var4 = class172.SpriteBuffer_spriteWidths[var3]; // L: 231
			int var5 = class528.SpriteBuffer_spriteHeights[var3]; // L: 232
			int var6 = var5 * var4; // L: 233
			byte[] var7 = new byte[var6]; // L: 234
			ArchiveDiskAction.SpriteBuffer_pixels[var3] = var7; // L: 235
			int var8 = var1.readUnsignedByte(); // L: 236
			int var9;
			if (var8 == 0) { // L: 237
				for (var9 = 0; var9 < var6; ++var9) { // L: 238
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 240
				for (var9 = 0; var9 < var4; ++var9) { // L: 241
					for (int var10 = 0; var10 < var5; ++var10) { // L: 242
						var7[var9 + var10 * var4] = var1.readByte(); // L: 243
					}
				}
			}
		}

	} // L: 248

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)V",
		garbageValue = "-164966121"
	)
	static final void method3823(Widget var0) {
		int var1 = var0.contentType; // L: 12375
		if (var1 == 324) { // L: 12376
			if (Client.field720 == -1) { // L: 12377
				Client.field720 = var0.spriteId2; // L: 12378
				Client.field802 = var0.spriteId; // L: 12379
			}

			if (Client.playerAppearance.field3563 == 1) { // L: 12381
				var0.spriteId2 = Client.field720;
			} else {
				var0.spriteId2 = Client.field802; // L: 12382
			}

		} else if (var1 == 325) { // L: 12385
			if (Client.field720 == -1) { // L: 12386
				Client.field720 = var0.spriteId2; // L: 12387
				Client.field802 = var0.spriteId; // L: 12388
			}

			if (Client.playerAppearance.field3563 == 1) { // L: 12390
				var0.spriteId2 = Client.field802;
			} else {
				var0.spriteId2 = Client.field720; // L: 12391
			}

		} else if (var1 == 327) { // L: 12394
			var0.modelAngleX = 150; // L: 12395
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12396
			var0.modelType = 5; // L: 12397
			var0.modelId = 0; // L: 12398
		} else if (var1 == 328) { // L: 12401
			var0.modelAngleX = 150; // L: 12402
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12403
			var0.modelType = 5; // L: 12404
			var0.modelId = 1; // L: 12405
		}
	} // L: 12383 12392 12399 12406 12408
}
