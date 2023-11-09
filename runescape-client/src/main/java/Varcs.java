import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@ObfuscatedName("ds")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("c")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("x")
	@Export("map")
	Map map;
	/** @deprecated */
	@ObfuscatedName("h")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("j")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 6607387257894408165L
	)
	long field1356;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class157.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2); // L: 35
			VarcInt var3;
			if (var4 != null) { // L: 36
				var3 = var4; // L: 37
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2); // L: 40
				var4 = new VarcInt(); // L: 41
				if (var5 != null) {
					var4.method3459(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (class157.archive2.method6298(15)) { // L: 50
			var2 = class157.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-14"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 59
		}

	} // L: 60

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "32"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-930824979"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-26"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "2034530215"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1748116686"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 93
			if (!this.intsPersistence[var1]) { // L: 94
				this.map.remove(var1); // L: 95
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 98
			this.strings[var1] = null; // L: 99
		}

	} // L: 101

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lqv;",
		garbageValue = "1722935868"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class156.getPreferencesFile("2", class376.field4411.name, var1); // L: 104
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1968826266"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 108

		try {
			int var2 = 3; // L: 110
			int var3 = 0; // L: 111
			Iterator var4 = this.map.entrySet().iterator(); // L: 112

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 113
				int var6 = (Integer)var5.getKey(); // L: 115
				if (this.intsPersistence[var6]) { // L: 116
					Object var7 = var5.getValue(); // L: 117
					var2 += 3; // L: 118
					if (var7 instanceof Integer) { // L: 119
						var2 += 4;
					} else if (var7 instanceof String) { // L: 120
						var2 += Actor.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 121
				}
			}

			Buffer var23 = new Buffer(var2); // L: 125
			var23.writeByte(2); // L: 126
			var23.writeShort(var3); // L: 127
			Iterator var24 = this.map.entrySet().iterator(); // L: 128

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next(); // L: 129
				int var13 = (Integer)var12.getKey(); // L: 131
				if (this.intsPersistence[var13]) { // L: 132
					var23.writeShort(var13); // L: 133
					Object var8 = var12.getValue(); // L: 134
					class453 var9 = class453.method8255(var8.getClass()); // L: 135
					var23.writeByte(var9.field4832); // L: 136
					class453.method8265(var8, var23); // L: 137
				}
			}

			var1.write(var23.array, 0, var23.offset); // L: 141
		} catch (Exception var21) { // L: 143
		} finally {
			try {
				var1.close(); // L: 146
			} catch (Exception var20) { // L: 148
			}

		}

		this.unwrittenChanges = false; // L: 150
		this.field1356 = UserComparator8.method2748(); // L: 151
	} // L: 152

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 155

		label227: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 157

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 158 159 162
					var4 = var1.read(var2, var3, var2.length - var3); // L: 160
					if (var4 == -1) { // L: 161
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 164
				if (var14.array.length - var14.offset >= 1) {
					int var15 = var14.readUnsignedByte(); // L: 166
					if (var15 >= 0 && var15 <= 2) {
						int var7;
						int var8;
						int var9;
						int var16;
						if (var15 >= 2) { // L: 168
							var16 = var14.readUnsignedShort(); // L: 169
							var7 = 0;

							while (true) {
								if (var7 >= var16) {
									break label227;
								}

								var8 = var14.readUnsignedShort(); // L: 171
								var9 = var14.readUnsignedByte(); // L: 172
								class453 var10 = (class453)DecorativeObject.findEnumerated(class453.method8268(), var9); // L: 173
								Object var11 = var10.method8257(var14); // L: 174
								if (this.intsPersistence[var8]) { // L: 175
									this.map.put(var8, var11); // L: 176
								}

								++var7; // L: 170
							}
						} else {
							var16 = var14.readUnsignedShort(); // L: 181

							for (var7 = 0; var7 < var16; ++var7) { // L: 182
								var8 = var14.readUnsignedShort(); // L: 183
								var9 = var14.readInt(); // L: 184
								if (this.intsPersistence[var8]) { // L: 185
									this.map.put(var8, var9); // L: 186
								}
							}

							var7 = var14.readUnsignedShort(); // L: 189
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label227;
								}

								var14.readUnsignedShort(); // L: 191
								var14.readStringCp1252NullTerminated(); // L: 192
								++var8; // L: 190
							}
						}
					}

					return; // L: 167
				}
			} catch (Exception var25) { // L: 196
				break label227;
			} finally {
				try {
					var1.close(); // L: 199
				} catch (Exception var24) { // L: 201
				}

			}

			return; // L: 165
		}

		this.unwrittenChanges = false; // L: 203
	} // L: 204

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1356 < UserComparator8.method2748() - 60000L) { // L: 207
			this.write(); // L: 208
		}

	} // L: 210

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 213
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2015445151"
	)
	static final void method2612(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0; // L: 5397
		boolean var4 = false; // L: 5398
		int var5 = -1; // L: 5399
		int var6 = -1; // L: 5400
		int var7 = Players.Players_count; // L: 5401
		int[] var8 = Players.Players_indices; // L: 5402

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5403
			Object var20;
			if (var9 < var7) { // L: 5405
				var20 = Client.players[var8[var9]]; // L: 5406
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5407
					var4 = true; // L: 5408
					var5 = var9; // L: 5409
					continue;
				}

				if (var20 == class296.localPlayer) { // L: 5412
					var6 = var9; // L: 5413
					continue; // L: 5414
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5417
			}

			class138.drawActor2d((Actor)var20, var9, var0, var1, var2, var3); // L: 5418
		}

		if (Client.renderSelf && var6 != -1) { // L: 5420
			class138.drawActor2d(class296.localPlayer, var6, var0, var1, var2, var3); // L: 5421
		}

		if (var4) { // L: 5423
			class138.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5424
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) { // L: 5426
			int var10 = Client.overheadTextXs[var9]; // L: 5427
			int var11 = Client.overheadTextYs[var9]; // L: 5428
			int var12 = Client.overheadTextXOffsets[var9]; // L: 5429
			int var13 = Client.overheadTextAscents[var9]; // L: 5430
			boolean var14 = true; // L: 5431

			while (var14) {
				var14 = false; // L: 5433

				for (int var19 = 0; var19 < var9; ++var19) { // L: 5434
					if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXOffsets[var19] + Client.overheadTextXs[var19] && var12 + var10 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) { // L: 5435 5436
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]; // L: 5437
						var14 = true; // L: 5438
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9]; // L: 5443
			Client.viewportTempY = Client.overheadTextYs[var9] = var11; // L: 5444
			String var15 = Client.overheadText[var9]; // L: 5445
			if (Client.chatEffects == 0) { // L: 5446
				int var16 = 16776960; // L: 5447
				if (Client.overheadTextColors[var9] < 6) { // L: 5448
					var16 = Client.field727[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) { // L: 5449
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) { // L: 5450
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) { // L: 5451
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) { // L: 5452
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5453
					if (var17 < 50) { // L: 5454
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5455
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5456
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) { // L: 5458
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5459
					if (var17 < 50) { // L: 5460
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5461
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5462
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) { // L: 5464
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5465
					if (var17 < 50) { // L: 5466
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5467
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5468
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) { // L: 5470
					UserComparator3.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) { // L: 5471
					UserComparator3.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) { // L: 5472
					UserComparator3.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) { // L: 5473
					UserComparator3.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) { // L: 5474
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (UserComparator3.fontBold12.stringWidth(var15) + 100) / 150; // L: 5475
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5476
					UserComparator3.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0); // L: 5477
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5478
				}

				if (Client.overheadTextEffects[var9] == 5) { // L: 5480
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 5481
					int var18 = 0; // L: 5482
					if (var17 < 25) { // L: 5483
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 5484
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - UserComparator3.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5485
					UserComparator3.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0); // L: 5486
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5487
				}
			} else {
				UserComparator3.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5491
			}
		}

	} // L: 5494
}
