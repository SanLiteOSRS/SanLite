import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("BufferedFile")
public class BufferedFile {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("accessFile")
	AccessFile accessFile;
	@ObfuscatedName("ar")
	@Export("readBuffer")
	byte[] readBuffer;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -2854885223795690509L
	)
	@Export("readBufferOffset")
	long readBufferOffset;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1189922833
	)
	@Export("readBufferLength")
	int readBufferLength;
	@ObfuscatedName("ax")
	@Export("writeBuffer")
	byte[] writeBuffer;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 4385103495728204659L
	)
	@Export("writeBufferOffset")
	long writeBufferOffset;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1558380473
	)
	@Export("writeBufferLength")
	int writeBufferLength;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -8944621520824101545L
	)
	@Export("offset")
	long offset;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -5317105893157613735L
	)
	@Export("fileLength")
	long fileLength;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 7384821624614794453L
	)
	@Export("length")
	long length;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -1650587532528801373L
	)
	@Export("fileOffset")
	long fileOffset;

	@ObfuscatedSignature(
		descriptor = "(Lsj;II)V"
	)
	public BufferedFile(AccessFile var1, int var2, int var3) throws IOException {
		this.readBufferOffset = -1L; // L: 9
		this.writeBufferOffset = -1L; // L: 12
		this.writeBufferLength = 0; // L: 13
		this.accessFile = var1; // L: 20
		this.length = this.fileLength = var1.length(); // L: 21
		this.readBuffer = new byte[var2]; // L: 22
		this.writeBuffer = new byte[var3]; // L: 23
		this.offset = 0L; // L: 24
	} // L: 25

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-6355"
	)
	@Export("close")
	public void close() throws IOException {
		this.flush(); // L: 28
		this.accessFile.close(); // L: 29
	} // L: 30

	@ObfuscatedName("an")
	@Export("seek")
	public void seek(long var1) throws IOException {
		if (var1 < 0L) { // L: 33
			throw new IOException("");
		} else {
			this.offset = var1; // L: 34
		}
	} // L: 35

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-859557204"
	)
	@Export("length")
	public long length() {
		return this.length; // L: 38
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-128"
	)
	@Export("readFully")
	public void readFully(byte[] var1) throws IOException {
		this.read(var1, 0, var1.length); // L: 42
	} // L: 43

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "-498076670"
	)
	@Export("read")
	public void read(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var3 + var2 > var1.length) { // L: 47
				throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
			}

			if (this.writeBufferOffset != -1L && this.offset >= this.writeBufferOffset && this.offset + (long)var3 <= this.writeBufferOffset + (long)this.writeBufferLength) { // L: 48
				System.arraycopy(this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var1, var2, var3); // L: 49
				this.offset += (long)var3; // L: 50
				return; // L: 51
			}

			long var4 = this.offset; // L: 53
			int var7 = var3; // L: 55
			int var8;
			if (this.offset >= this.readBufferOffset && this.offset < this.readBufferOffset + (long)this.readBufferLength) { // L: 56
				var8 = (int)((long)this.readBufferLength - (this.offset - this.readBufferOffset)); // L: 57
				if (var8 > var3) { // L: 58
					var8 = var3;
				}

				System.arraycopy(this.readBuffer, (int)(this.offset - this.readBufferOffset), var1, var2, var8); // L: 59
				this.offset += (long)var8; // L: 60
				var2 += var8; // L: 61
				var3 -= var8; // L: 62
			}

			if (var3 > this.readBuffer.length) { // L: 64
				this.accessFile.seek(this.offset); // L: 65

				for (this.fileOffset = this.offset; var3 > 0; var3 -= var8) { // L: 66 67 73
					var8 = this.accessFile.read(var1, var2, var3); // L: 68
					if (var8 == -1) { // L: 69
						break;
					}

					this.fileOffset += (long)var8; // L: 70
					this.offset += (long)var8; // L: 71
					var2 += var8; // L: 72
				}
			} else if (var3 > 0) { // L: 76
				this.load(); // L: 77
				var8 = var3; // L: 78
				if (var3 > this.readBufferLength) { // L: 79
					var8 = this.readBufferLength;
				}

				System.arraycopy(this.readBuffer, 0, var1, var2, var8); // L: 80
				var2 += var8; // L: 81
				var3 -= var8; // L: 82
				this.offset += (long)var8; // L: 83
			}

			if (-1L != this.writeBufferOffset) { // L: 85
				if (this.writeBufferOffset > this.offset && var3 > 0) { // L: 86
					var8 = var2 + (int)(this.writeBufferOffset - this.offset); // L: 87
					if (var8 > var3 + var2) { // L: 88
						var8 = var3 + var2;
					}

					while (var2 < var8) { // L: 89
						var1[var2++] = 0; // L: 90
						--var3; // L: 91
						++this.offset; // L: 92
					}
				}

				long var13 = -1L; // L: 95
				long var10 = -1L; // L: 96
				if (this.writeBufferOffset >= var4 && this.writeBufferOffset < var4 + (long)var7) { // L: 97
					var13 = this.writeBufferOffset; // L: 98
				} else if (var4 >= this.writeBufferOffset && var4 < this.writeBufferOffset + (long)this.writeBufferLength) { // L: 100
					var13 = var4; // L: 101
				}

				if ((long)this.writeBufferLength + this.writeBufferOffset > var4 && (long)this.writeBufferLength + this.writeBufferOffset <= var4 + (long)var7) { // L: 103
					var10 = (long)this.writeBufferLength + this.writeBufferOffset; // L: 104
				} else if ((long)var7 + var4 > this.writeBufferOffset && (long)var7 + var4 <= (long)this.writeBufferLength + this.writeBufferOffset) { // L: 106
					var10 = (long)var7 + var4; // L: 107
				}

				if (var13 > -1L && var10 > var13) { // L: 109
					int var12 = (int)(var10 - var13); // L: 110
					System.arraycopy(this.writeBuffer, (int)(var13 - this.writeBufferOffset), var1, (int)(var13 - var4) + var2, var12); // L: 111
					if (var10 > this.offset) { // L: 112
						var3 = (int)((long)var3 - (var10 - this.offset)); // L: 113
						this.offset = var10; // L: 114
					}
				}
			}
		} catch (IOException var16) { // L: 120
			this.fileOffset = -1L; // L: 121
			throw var16; // L: 122
		}

		if (var3 > 0) { // L: 124
			throw new EOFException();
		}
	} // L: 125

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1939500823"
	)
	@Export("load")
	void load() throws IOException {
		this.readBufferLength = 0; // L: 128
		if (this.fileOffset != this.offset) { // L: 129
			this.accessFile.seek(this.offset); // L: 130
			this.fileOffset = this.offset; // L: 131
		}

		int var2;
		for (this.readBufferOffset = this.offset; this.readBufferLength < this.readBuffer.length; this.readBufferLength += var2) { // L: 133 134 140
			int var1 = this.readBuffer.length - this.readBufferLength; // L: 135
			if (var1 > 200000000) { // L: 136
				var1 = 200000000;
			}

			var2 = this.accessFile.read(this.readBuffer, this.readBufferLength, var1); // L: 137
			if (var2 == -1) { // L: 138
				break;
			}

			this.fileOffset += (long)var2; // L: 139
		}

	} // L: 142

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "951914889"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((long)var3 + this.offset > this.length) { // L: 146
				this.length = this.offset + (long)var3;
			}

			if (this.writeBufferOffset != -1L && (this.offset < this.writeBufferOffset || this.offset > (long)this.writeBufferLength + this.writeBufferOffset)) { // L: 147
				this.flush(); // L: 148
			}

			if (-1L != this.writeBufferOffset && (long)var3 + this.offset > (long)this.writeBuffer.length + this.writeBufferOffset) { // L: 150
				int var4 = (int)((long)this.writeBuffer.length - (this.offset - this.writeBufferOffset)); // L: 151
				System.arraycopy(var1, var2, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var4); // L: 152
				this.offset += (long)var4; // L: 153
				var2 += var4; // L: 154
				var3 -= var4; // L: 155
				this.writeBufferLength = this.writeBuffer.length; // L: 156
				this.flush(); // L: 157
			}

			if (var3 <= this.writeBuffer.length) { // L: 159
				if (var3 > 0) { // L: 188
					if (this.writeBufferOffset == -1L) { // L: 189
						this.writeBufferOffset = this.offset;
					}

					System.arraycopy(var1, var2, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var3); // L: 190
					this.offset += (long)var3; // L: 191
					if (this.offset - this.writeBufferOffset > (long)this.writeBufferLength) { // L: 192
						this.writeBufferLength = (int)(this.offset - this.writeBufferOffset);
					}

				}
			} else {
				if (this.fileOffset != this.offset) { // L: 160
					this.accessFile.seek(this.offset); // L: 161
					this.fileOffset = this.offset; // L: 162
				}

				this.accessFile.write(var1, var2, var3); // L: 164
				this.fileOffset += (long)var3; // L: 165
				if (this.fileOffset > this.fileLength) { // L: 166
					this.fileLength = this.fileOffset;
				}

				long var9 = -1L; // L: 167
				long var6 = -1L; // L: 168
				if (this.offset >= this.readBufferOffset && this.offset < (long)this.readBufferLength + this.readBufferOffset) { // L: 169
					var9 = this.offset; // L: 170
				} else if (this.readBufferOffset >= this.offset && this.readBufferOffset < (long)var3 + this.offset) { // L: 172
					var9 = this.readBufferOffset; // L: 173
				}

				if (this.offset + (long)var3 > this.readBufferOffset && (long)var3 + this.offset <= this.readBufferOffset + (long)this.readBufferLength) { // L: 175
					var6 = (long)var3 + this.offset; // L: 176
				} else if (this.readBufferOffset + (long)this.readBufferLength > this.offset && (long)this.readBufferLength + this.readBufferOffset <= (long)var3 + this.offset) { // L: 178
					var6 = (long)this.readBufferLength + this.readBufferOffset; // L: 179
				}

				if (var9 > -1L && var6 > var9) { // L: 181
					int var8 = (int)(var6 - var9); // L: 182
					System.arraycopy(var1, (int)((long)var2 + var9 - this.offset), this.readBuffer, (int)(var9 - this.readBufferOffset), var8); // L: 183
				}

				this.offset += (long)var3; // L: 185
			}
		} catch (IOException var12) { // L: 196
			this.fileOffset = -1L; // L: 197
			throw var12; // L: 198
		}
	} // L: 186 193 200

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "666408425"
	)
	@Export("flush")
	void flush() throws IOException {
		if (this.writeBufferOffset != -1L) { // L: 203
			if (this.fileOffset != this.writeBufferOffset) { // L: 204
				this.accessFile.seek(this.writeBufferOffset); // L: 205
				this.fileOffset = this.writeBufferOffset; // L: 206
			}

			this.accessFile.write(this.writeBuffer, 0, this.writeBufferLength); // L: 208
			this.fileOffset += -1558380473L * (long)(this.writeBufferLength * -1510299273); // L: 209
			if (this.fileOffset > this.fileLength) { // L: 210
				this.fileLength = this.fileOffset;
			}

			long var1 = -1L; // L: 211
			long var3 = -1L; // L: 212
			if (this.writeBufferOffset >= this.readBufferOffset && this.writeBufferOffset < (long)this.readBufferLength + this.readBufferOffset) { // L: 213
				var1 = this.writeBufferOffset; // L: 214
			} else if (this.readBufferOffset >= this.writeBufferOffset && this.readBufferOffset < (long)this.writeBufferLength + this.writeBufferOffset) { // L: 216
				var1 = this.readBufferOffset; // L: 217
			}

			if (this.writeBufferOffset + (long)this.writeBufferLength > this.readBufferOffset && this.writeBufferOffset + (long)this.writeBufferLength <= (long)this.readBufferLength + this.readBufferOffset) { // L: 219
				var3 = this.writeBufferOffset + (long)this.writeBufferLength; // L: 220
			} else if (this.readBufferOffset + (long)this.readBufferLength > this.writeBufferOffset && this.readBufferOffset + (long)this.readBufferLength <= (long)this.writeBufferLength + this.writeBufferOffset) { // L: 222
				var3 = (long)this.readBufferLength + this.readBufferOffset; // L: 223
			}

			if (var1 > -1L && var3 > var1) { // L: 225
				int var5 = (int)(var3 - var1); // L: 226
				System.arraycopy(this.writeBuffer, (int)(var1 - this.writeBufferOffset), this.readBuffer, (int)(var1 - this.readBufferOffset), var5); // L: 227
			}

			this.writeBufferOffset = -1L; // L: 229
			this.writeBufferLength = 0; // L: 230
		}

	} // L: 232

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbe;Lpa;Lpa;B)V",
		garbageValue = "-67"
	)
	static void method8773(GameEngine var0, Font var1, Font var2) {
		int var5;
		int var6;
		int var37;
		int var38;
		if (Login.worldSelectOpen) { // L: 318
			class211 var35 = Client.field759; // L: 322
			class211 var4 = var35; // L: 324

			while (true) {
				if (!var4.method4085()) { // L: 325
					if (MouseHandler.MouseHandler_lastButton != 1 && (Client.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 341
						break;
					}

					var5 = Login.xPadding + 280; // L: 342
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 343
						KeyHandler.changeWorldSelectSorting(0, 0); // L: 344
						break; // L: 345
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 347
						KeyHandler.changeWorldSelectSorting(0, 1); // L: 348
						break; // L: 349
					}

					var6 = Login.xPadding + 390; // L: 351
					if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 352
						KeyHandler.changeWorldSelectSorting(1, 0); // L: 353
						break; // L: 354
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 356
						KeyHandler.changeWorldSelectSorting(1, 1); // L: 357
						break; // L: 358
					}

					var37 = Login.xPadding + 500; // L: 360
					if (MouseHandler.MouseHandler_lastPressedX >= var37 && MouseHandler.MouseHandler_lastPressedX <= var37 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 361
						KeyHandler.changeWorldSelectSorting(2, 0); // L: 362
						break; // L: 363
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var37 + 15 && MouseHandler.MouseHandler_lastPressedX <= var37 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 365
						KeyHandler.changeWorldSelectSorting(2, 1); // L: 366
						break; // L: 367
					}

					var38 = Login.xPadding + 610; // L: 369
					if (MouseHandler.MouseHandler_lastPressedX >= var38 && MouseHandler.MouseHandler_lastPressedX <= var38 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 370
						KeyHandler.changeWorldSelectSorting(3, 0); // L: 371
						break; // L: 372
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var38 + 15 && MouseHandler.MouseHandler_lastPressedX <= var38 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 374
						KeyHandler.changeWorldSelectSorting(3, 1); // L: 375
						break; // L: 376
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 378
						class14.method179(); // L: 379
						break; // L: 380
					}

					if (Login.hoveredWorldIndex != -1) { // L: 382
						World var39 = class20.World_worlds[Login.hoveredWorldIndex]; // L: 383
						class14.changeWorld(var39); // L: 384
						class14.method179(); // L: 385
					} else {
						if (Login.worldSelectPage > 0 && FloorUnderlayDefinition.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= FloorUnderlayDefinition.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class11.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class11.canvasHeight / 2 + 50) { // L: 388
							--Login.worldSelectPage; // L: 389
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && Tiles.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class10.canvasWidth - Tiles.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class10.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class11.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class11.canvasHeight / 2 + 50) { // L: 391
							++Login.worldSelectPage; // L: 392
						}
					}
					break;
				}

				if (var4.field2334 == 13) { // L: 326
					class14.method179(); // L: 327
					break; // L: 328
				}

				if (var4.field2334 == 96) { // L: 330
					if (Login.worldSelectPage > 0 && FloorUnderlayDefinition.worldSelectLeftSprite != null) { // L: 331
						--Login.worldSelectPage; // L: 332
					}
				} else if (var4.field2334 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && Tiles.worldSelectRightSprite != null) { // L: 335 336
					++Login.worldSelectPage; // L: 337
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 398
				WorldMapManager.clientPreferences.method2481(!WorldMapManager.clientPreferences.method2435()); // L: 399
				if (!WorldMapManager.clientPreferences.method2435()) { // L: 400
					Archive var3 = class33.archive6; // L: 401
					if (var3.isValidFileName("scape main", "")) { // L: 403
						int var22 = var3.getGroupId("scape main"); // L: 404
						var5 = var3.getFileId(var22, ""); // L: 405
						class304.musicPlayerStatus = 1; // L: 407
						HealthBar.musicTrackArchive = var3; // L: 408
						class7.musicTrackGroupId = var22; // L: 409
						class438.musicTrackFileId = var5; // L: 410
						class178.musicTrackVolume = 255; // L: 411
						class404.musicTrackBoolean = false; // L: 412
						class128.pcmSampleLength = 10000; // L: 413
					}
				} else {
					Friend.method7788(); // L: 418
				}
			}

			if (Client.gameState != 5) { // L: 420
				if (-1L == Login.field917) { // L: 421
					Login.field917 = Canvas.method310() + 1000L; // L: 422
				}

				long var23 = Canvas.method310(); // L: 424
				boolean var36;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 427
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 431
							var36 = true; // L: 439
							break;
						}

						ArchiveLoader var25 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 432
						if (!var25.isLoaded()) { // L: 433
							var36 = false; // L: 434
							break; // L: 435
						}

						++Client.archiveLoadersDone; // L: 437
					}
				} else {
					var36 = true; // L: 428
				}

				if (var36 && -1L == Login.field901) { // L: 441 442
					Login.field901 = var23; // L: 443
					if (Login.field901 > Login.field917) { // L: 444
						Login.field917 = Login.field901; // L: 445
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 449
					if (Language.Language_EN == class124.clientLanguage) { // L: 450
						if (MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 451
							var6 = Login.xPadding + 5; // L: 452
							short var7 = 463; // L: 453
							byte var8 = 100; // L: 454
							byte var26 = 35; // L: 455
							if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + var8 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var26 + var7) { // L: 456
								if (ArchiveDisk.loadWorlds()) { // L: 458
									Login.worldSelectOpen = true; // L: 459
									Login.worldSelectPage = 0; // L: 460
									Login.worldSelectPagesCount = 0; // L: 461
								}

								return; // L: 464
							}
						}

						if (World.World_request != null && ArchiveDisk.loadWorlds()) { // L: 467 468
							Login.worldSelectOpen = true; // L: 469
							Login.worldSelectPage = 0; // L: 470
							Login.worldSelectPagesCount = 0; // L: 471
						}
					}

					var6 = MouseHandler.MouseHandler_lastButton; // L: 475
					var37 = MouseHandler.MouseHandler_lastPressedX; // L: 476
					var38 = MouseHandler.MouseHandler_lastPressedY; // L: 477
					if (var6 == 0) { // L: 478
						var37 = MouseHandler.MouseHandler_x; // L: 479
						var38 = MouseHandler.MouseHandler_y; // L: 480
					}

					if (!Client.mouseCam && var6 == 4) { // L: 482
						var6 = 1;
					}

					class211 var9 = Client.field759; // L: 485
					class211 var10 = var9; // L: 487
					short var41;
					int var42;
					if (Login.loginIndex == 0) { // L: 488
						boolean var46 = false; // L: 489

						while (var10.method4085()) { // L: 490
							if (var10.field2334 == 84) { // L: 491
								var46 = true; // L: 492
							}
						}

						var42 = class153.loginBoxCenter - 80; // L: 495
						var41 = 291; // L: 496
						if (var6 == 1 && var37 >= var42 - 75 && var37 <= var42 + 75 && var38 >= var41 - 20 && var38 <= var41 + 20) { // L: 497
							class125.openURL(Skeleton.method4472("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 498
						}

						var42 = class153.loginBoxCenter + 80; // L: 500
						if (var6 == 1 && var37 >= var42 - 75 && var37 <= var42 + 75 && var38 >= var41 - 20 && var38 <= var41 + 20 || var46) { // L: 501
							if ((Client.worldProperties & 33554432) != 0) { // L: 502
								Login.Login_response0 = ""; // L: 503
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 504
								Login.Login_response2 = "Your normal account will not be affected."; // L: 505
								Login.Login_response3 = ""; // L: 506
								class14.method171(1); // L: 507
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 509
									Login.currentLoginField = 1; // L: 510
								} else {
									Login.currentLoginField = 0; // L: 513
								}
							} else if ((Client.worldProperties & 4) != 0) { // L: 517
								if ((Client.worldProperties & 1024) != 0) { // L: 518
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 519
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 520
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 521
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 524
									Login.Login_response2 = "Players can attack each other"; // L: 525
									Login.Login_response3 = "almost everywhere."; // L: 526
								}

								Login.Login_response0 = "Warning!"; // L: 528
								class14.method171(1); // L: 529
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 531
									Login.currentLoginField = 1; // L: 532
								} else {
									Login.currentLoginField = 0; // L: 535
								}
							} else if ((Client.worldProperties & 1024) != 0) { // L: 539
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 540
								Login.Login_response2 = "The Protect Item prayer will"; // L: 541
								Login.Login_response3 = "not work on this world."; // L: 542
								Login.Login_response0 = "Warning!"; // L: 543
								class14.method171(1); // L: 544
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 546
									Login.currentLoginField = 1; // L: 547
								} else {
									Login.currentLoginField = 0; // L: 550
								}
							} else {
								class130.Login_promptCredentials(false); // L: 555
							}
						}
					} else {
						int var11;
						short var12;
						if (Login.loginIndex == 1) { // L: 559
							while (true) {
								if (!var10.method4085()) { // L: 560
									var11 = class153.loginBoxCenter - 80; // L: 568
									var12 = 321; // L: 569
									if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 570
										class130.Login_promptCredentials(false); // L: 571
									}

									var11 = class153.loginBoxCenter + 80; // L: 573
									if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 574
										class14.method171(0); // L: 575
									}
									break;
								}

								if (var10.field2334 == 84) { // L: 561
									class130.Login_promptCredentials(false); // L: 562
								} else if (var10.field2334 == 13) { // L: 564
									class14.method171(0); // L: 565
								}
							}
						} else {
							short var40;
							boolean var43;
							if (Login.loginIndex == 2) { // L: 578
								var40 = 201; // L: 579
								var11 = var40 + 52; // L: 580
								if (var6 == 1 && var38 >= var11 - 12 && var38 < var11 + 2) { // L: 581
									Login.currentLoginField = 0;
								}

								var11 += 15; // L: 582
								if (var6 == 1 && var38 >= var11 - 12 && var38 < var11 + 2) { // L: 583
									Login.currentLoginField = 1;
								}

								var11 += 15; // L: 584
								var40 = 361; // L: 585
								if (WorldMapLabelSize.field2867 != null) { // L: 586
									var42 = WorldMapLabelSize.field2867.highX / 2; // L: 587
									if (var6 == 1 && var37 >= WorldMapLabelSize.field2867.lowX - var42 && var37 <= var42 + WorldMapLabelSize.field2867.lowX && var38 >= var40 - 15 && var38 < var40) { // L: 588
										switch(Login.field895) { // L: 589
										case 1:
											UrlRequest.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 597
											class14.method171(5); // L: 598
											return; // L: 599
										case 2:
											class125.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 592
										}
									}
								}

								var42 = class153.loginBoxCenter - 80; // L: 604
								var41 = 321; // L: 605
								if (var6 == 1 && var37 >= var42 - 75 && var37 <= var42 + 75 && var38 >= var41 - 20 && var38 <= var41 + 20) { // L: 606
									Login.Login_username = Login.Login_username.trim(); // L: 607
									if (Login.Login_username.length() == 0) { // L: 608
										UrlRequest.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 609
										return; // L: 610
									}

									if (Login.Login_password.length() == 0) { // L: 612
										UrlRequest.setLoginResponseString("", "Please enter your password.", ""); // L: 613
										return; // L: 614
									}

									UrlRequest.setLoginResponseString("", "Connecting to server...", ""); // L: 616
									FontName.method8639(false); // L: 617
									class47.method867(20); // L: 618
									return; // L: 619
								}

								var42 = Login.loginBoxX + 180 + 80; // L: 621
								if (var6 == 1 && var37 >= var42 - 75 && var37 <= var42 + 75 && var38 >= var41 - 20 && var38 <= var41 + 20) { // L: 622
									class14.method171(0); // L: 623
									Login.Login_username = ""; // L: 624
									Login.Login_password = ""; // L: 625
									AbstractWorldMapData.field2999 = 0; // L: 626
									class382.otp = ""; // L: 627
									Login.field909 = true; // L: 628
								}

								var42 = class153.loginBoxCenter + -117; // L: 630
								var41 = 277; // L: 631
								Login.field886 = var37 >= var42 && var37 < var42 + Skeleton.field2541 && var38 >= var41 && var38 < var41 + class342.field3848; // L: 632
								if (var6 == 1 && Login.field886) { // L: 633
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 634
									if (!Client.Login_isUsernameRemembered && WorldMapManager.clientPreferences.method2446() != null) { // L: 635
										WorldMapManager.clientPreferences.method2445((String)null); // L: 636
									}
								}

								var42 = class153.loginBoxCenter + 24; // L: 639
								var41 = 277; // L: 640
								Login.field914 = var37 >= var42 && var37 < var42 + Skeleton.field2541 && var38 >= var41 && var38 < var41 + class342.field3848; // L: 641
								if (var6 == 1 && Login.field914) { // L: 642
									WorldMapManager.clientPreferences.method2428(!WorldMapManager.clientPreferences.method2458()); // L: 643
									if (!WorldMapManager.clientPreferences.method2458()) { // L: 644
										Login.Login_username = ""; // L: 645
										WorldMapManager.clientPreferences.method2445((String)null); // L: 646
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 648
											Login.currentLoginField = 1; // L: 649
										} else {
											Login.currentLoginField = 0; // L: 652
										}
									}
								}

								label1506:
								while (true) {
									int var45;
									Transferable var48;
									do {
										while (true) {
											char var44;
											label1470:
											do {
												while (true) {
													while (var10.method4085()) { // L: 657
														if (var10.field2334 != 13) { // L: 658
															if (Login.currentLoginField != 0) { // L: 667
																continue label1470;
															}

															EnumComposition.method3645(var10.field2321); // L: 668
															if (var10.field2334 == 85 && Login.Login_username.length() > 0) { // L: 669
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var10.field2334 == 84 || var10.field2334 == 80) { // L: 670
																Login.currentLoginField = 1;
															}

															var44 = var10.field2321; // L: 672
															var43 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var44) != -1; // L: 674
															if (var43 && Login.Login_username.length() < 320) { // L: 676
																Login.Login_username = Login.Login_username + var10.field2321;
															}
														} else {
															class14.method171(0); // L: 659
															Login.Login_username = ""; // L: 660
															Login.Login_password = ""; // L: 661
															AbstractWorldMapData.field2999 = 0; // L: 662
															class382.otp = ""; // L: 663
															Login.field909 = true; // L: 664
														}
													}

													return; // L: 1072
												}
											} while(Login.currentLoginField != 1); // L: 678

											if (var10.field2334 == 85 && Login.Login_password.length() > 0) { // L: 679
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 680
											} else if (var10.field2334 == 84 || var10.field2334 == 80) { // L: 682
												Login.currentLoginField = 0; // L: 683
												if (var10.field2334 == 84) { // L: 684
													Login.Login_username = Login.Login_username.trim(); // L: 685
													if (Login.Login_username.length() == 0) { // L: 686
														UrlRequest.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 687
														return; // L: 688
													}

													if (Login.Login_password.length() == 0) { // L: 690
														UrlRequest.setLoginResponseString("", "Please enter your password.", ""); // L: 691
														return; // L: 692
													}

													UrlRequest.setLoginResponseString("", "Connecting to server...", ""); // L: 694
													FontName.method8639(false); // L: 695
													class47.method867(20); // L: 696
													return; // L: 697
												}
											}

											if ((var10.method4087(82) || var10.method4087(87)) && var10.field2334 == 67) { // L: 700
												Clipboard var47 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 701
												var48 = var47.getContents(class439.client); // L: 702
												var45 = 20 - Login.Login_password.length(); // L: 703
												break;
											}

											if (class156.method3268(var10.field2321)) { // L: 728
												var44 = var10.field2321; // L: 730
												var43 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var44) != -1; // L: 732
												if (var43 && Login.Login_password.length() < 20) { // L: 734 735
													Login.Login_password = Login.Login_password + var10.field2321; // L: 736
												}
											}
										}
									} while(var45 <= 0); // L: 704

									try {
										String var17 = (String)var48.getTransferData(DataFlavor.stringFlavor); // L: 706
										int var18 = Math.min(var45, var17.length()); // L: 707
										int var19 = 0;

										while (true) {
											if (var19 >= var18) {
												Login.Login_password = Login.Login_password + var17.substring(0, var18); // L: 722
												continue label1506;
											}

											if (!class156.method3268(var17.charAt(var19))) { // L: 710
												break;
											}

											char var21 = var17.charAt(var19); // L: 712
											boolean var20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var21) != -1; // L: 714
											if (!var20) { // L: 716
												break;
											}

											++var19; // L: 708
										}

										class14.method171(3); // L: 718
										return; // L: 719
									} catch (UnsupportedFlavorException var33) { // L: 724
									} catch (IOException var34) { // L: 725
									}
								}
							} else {
								Bounds var29;
								if (Login.loginIndex == 3) { // L: 744
									var11 = Login.loginBoxX + 180; // L: 745
									var12 = 241; // L: 746
									var29 = var1.method7397(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var11, var12); // L: 747
									if (var6 == 1 && var29.method8065(var37, var38)) { // L: 748
										class125.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 749
									}

									var11 = Login.loginBoxX + 180; // L: 751
									var12 = 276; // L: 752
									if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 753
										class260.method5395(false); // L: 754
									}

									var11 = Login.loginBoxX + 180; // L: 756
									var12 = 326; // L: 757
									if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 758
										UrlRequest.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 759
										class14.method171(5); // L: 760
										return; // L: 761
									}
								} else {
									int var14;
									if (Login.loginIndex == 4) { // L: 764
										var11 = Login.loginBoxX + 180 - 80; // L: 765
										var12 = 321; // L: 766
										if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 767
											class382.otp.trim(); // L: 768
											if (class382.otp.length() != 6) { // L: 769
												UrlRequest.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 770
												return; // L: 771
											}

											AbstractWorldMapData.field2999 = Integer.parseInt(class382.otp); // L: 773
											class382.otp = ""; // L: 774
											FontName.method8639(true); // L: 775
											UrlRequest.setLoginResponseString("", "Connecting to server...", ""); // L: 776
											class47.method867(20); // L: 777
											return; // L: 778
										}

										if (var6 == 1 && var37 >= Login.loginBoxX + 180 - 9 && var37 <= Login.loginBoxX + 180 + 130 && var38 >= 263 && var38 <= 296) { // L: 780
											Login.field909 = !Login.field909; // L: 781
										}

										if (var6 == 1 && var37 >= Login.loginBoxX + 180 - 34 && var37 <= Login.loginBoxX + 34 + 180 && var38 >= 351 && var38 <= 363) { // L: 783
											class125.openURL(Skeleton.method4472("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false); // L: 784
										}

										var11 = Login.loginBoxX + 180 + 80; // L: 786
										if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 787
											class14.method171(0); // L: 788
											Login.Login_username = ""; // L: 789
											Login.Login_password = ""; // L: 790
											AbstractWorldMapData.field2999 = 0; // L: 791
											class382.otp = ""; // L: 792
										}

										while (var10.method4085()) { // L: 794
											boolean var13 = false; // L: 795

											for (var14 = 0; var14 < "1234567890".length(); ++var14) { // L: 796
												if (var10.field2321 == "1234567890".charAt(var14)) { // L: 797
													var13 = true; // L: 798
													break; // L: 799
												}
											}

											if (var10.field2334 == 13) { // L: 802
												class14.method171(0); // L: 803
												Login.Login_username = ""; // L: 804
												Login.Login_password = ""; // L: 805
												AbstractWorldMapData.field2999 = 0; // L: 806
												class382.otp = ""; // L: 807
											} else {
												if (var10.field2334 == 85 && class382.otp.length() > 0) { // L: 810
													class382.otp = class382.otp.substring(0, class382.otp.length() - 1);
												}

												if (var10.field2334 == 84) { // L: 811
													class382.otp.trim(); // L: 812
													if (class382.otp.length() != 6) { // L: 813
														UrlRequest.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 814
														return; // L: 815
													}

													AbstractWorldMapData.field2999 = Integer.parseInt(class382.otp); // L: 817
													class382.otp = ""; // L: 818
													FontName.method8639(true); // L: 819
													UrlRequest.setLoginResponseString("", "Connecting to server...", ""); // L: 820
													class47.method867(20); // L: 821
													return; // L: 822
												}

												if (var13 && class382.otp.length() < 6) { // L: 824
													class382.otp = class382.otp + var10.field2321;
												}
											}
										}
									} else {
										int var15;
										if (Login.loginIndex == 5) { // L: 828
											var11 = Login.loginBoxX + 180 - 80; // L: 829
											var12 = 321; // L: 830
											if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 831
												class336.method6624(); // L: 832
												return; // L: 833
											}

											var11 = Login.loginBoxX + 180 + 80; // L: 835
											if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 836
												class130.Login_promptCredentials(true); // L: 837
											}

											var41 = 361; // L: 839
											if (class336.field3786 != null) { // L: 840
												var14 = class336.field3786.highX / 2; // L: 841
												if (var6 == 1 && var37 >= class336.field3786.lowX - var14 && var37 <= var14 + class336.field3786.lowX && var38 >= var41 - 15 && var38 < var41) { // L: 842
													class125.openURL(Skeleton.method4472("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 843
												}
											}

											while (var10.method4085()) { // L: 846
												var43 = false; // L: 847

												for (var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var15) { // L: 848
													if (var10.field2321 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15)) { // L: 849
														var43 = true; // L: 850
														break; // L: 851
													}
												}

												if (var10.field2334 == 13) { // L: 854
													class130.Login_promptCredentials(true); // L: 855
												} else {
													if (var10.field2334 == 85 && Login.Login_username.length() > 0) { // L: 858
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var10.field2334 == 84) { // L: 859
														class336.method6624(); // L: 860
														return; // L: 861
													}

													if (var43 && Login.Login_username.length() < 320) { // L: 863
														Login.Login_username = Login.Login_username + var10.field2321;
													}
												}
											}
										} else if (Login.loginIndex != 6) { // L: 867
											if (Login.loginIndex == 7) { // L: 878
												if (class306.field3401 && !Client.onMobile) { // L: 879
													var11 = class153.loginBoxCenter - 150; // L: 880
													var42 = var11 + 40 + 240 + 25; // L: 881
													var41 = 231; // L: 882
													var14 = var41 + 40; // L: 883
													if (var6 == 1 && var37 >= var11 && var37 <= var42 && var38 >= var41 && var38 <= var14) { // L: 884
														Login.field903 = class210.method4076(var11, var37); // L: 885
													}

													var15 = Login.loginBoxX + 180 - 80; // L: 887
													short var16 = 321; // L: 888
													boolean var30;
													if (var6 == 1 && var37 >= var15 - 75 && var37 <= var15 + 75 && var38 >= var16 - 20 && var38 <= var16 + 20) { // L: 889
														var30 = class382.method7153(); // L: 890
														if (var30) { // L: 891
															class47.method867(50); // L: 892
															return; // L: 893
														}
													}

													var15 = Login.loginBoxX + 180 + 80; // L: 896
													if (var6 == 1 && var37 >= var15 - 75 && var37 <= var15 + 75 && var38 >= var16 - 20 && var38 <= var16 + 20) { // L: 897
														Login.field905 = new String[8]; // L: 898
														class130.Login_promptCredentials(true); // L: 899
													}

													while (var10.method4085()) { // L: 901
														if (var10.field2334 == 101) { // L: 902
															Login.field905[Login.field903] = null; // L: 903
														}

														if (var10.field2334 == 85) { // L: 905
															if (Login.field905[Login.field903] == null && Login.field903 > 0) { // L: 906
																--Login.field903; // L: 907
															}

															Login.field905[Login.field903] = null; // L: 909
														}

														if (var10.field2321 >= '0' && var10.field2321 <= '9') { // L: 911
															Login.field905[Login.field903] = "" + var10.field2321; // L: 912
															if (Login.field903 < 7) { // L: 913
																++Login.field903; // L: 914
															}
														}

														if (var10.field2334 == 84) { // L: 917
															var30 = class382.method7153(); // L: 918
															if (var30) { // L: 919
																class47.method867(50); // L: 920
															}

															return; // L: 922
														}
													}
												} else {
													var11 = Login.loginBoxX + 180 - 80; // L: 927
													var12 = 321; // L: 928
													if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 929
														class125.openURL(Skeleton.method4472("secure", true) + "m=dob/set_dob.ws", true, false); // L: 930
														UrlRequest.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 931
														class14.method171(6); // L: 932
														return; // L: 933
													}

													var11 = Login.loginBoxX + 180 + 80; // L: 935
													if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 936
														class130.Login_promptCredentials(true); // L: 937
													}
												}
											} else if (Login.loginIndex == 8) { // L: 941
												var11 = Login.loginBoxX + 180 - 80; // L: 942
												var12 = 321; // L: 943
												if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 944
													class125.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 945
													UrlRequest.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 946
													class14.method171(6); // L: 947
													return; // L: 948
												}

												var11 = Login.loginBoxX + 180 + 80; // L: 950
												if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 951
													class130.Login_promptCredentials(true); // L: 952
												}
											} else if (Login.loginIndex == 9) { // L: 955
												var11 = Login.loginBoxX + 180; // L: 956
												var12 = 311; // L: 957
												if (var9.field2334 == 84 || var9.field2334 == 13 || var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 958
													class260.method5395(false); // L: 959
												}
											} else if (Login.loginIndex == 10) { // L: 962
												var11 = Login.loginBoxX + 180; // L: 963
												var12 = 209; // L: 964
												if (var9.field2334 == 84 || var6 == 1 && var37 >= var11 - 109 && var37 <= var11 + 109 && var38 >= var12 && var38 <= var12 + 68) { // L: 965
													UrlRequest.setLoginResponseString("", "Connecting to server...", ""); // L: 966
													Client.field522 = class505.field5074; // L: 967
													FontName.method8639(false); // L: 968
													class47.method867(20); // L: 969
												}
											} else if (Login.loginIndex == 12) { // L: 972
												var11 = class153.loginBoxCenter; // L: 973
												var12 = 233; // L: 974
												var29 = var2.method7397(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12); // L: 975
												Bounds var27 = var2.method7397(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12); // L: 976
												Bounds var28 = var2.method7397(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12); // L: 977
												var42 = var12 + 17; // L: 978
												Bounds var31 = var2.method7397(0, 34, "<col=ffd200>agreement (EULA)</col>.", var11, var42); // L: 979
												if (var6 == 1) { // L: 980
													if (var29.method8065(var37, var38)) { // L: 981
														class125.openURL("https://www.jagex.com/terms", true, false); // L: 982
													} else if (var27.method8065(var37, var38)) { // L: 984
														class125.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 985
													} else if (var28.method8065(var37, var38) || var31.method8065(var37, var38)) { // L: 987
														class125.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 988
													}
												}

												var11 = class153.loginBoxCenter - 80; // L: 991
												var12 = 311; // L: 992
												if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 993
													class137.method3067(); // L: 994
													class260.method5395(true); // L: 995
												}

												var11 = class153.loginBoxCenter + 80; // L: 997
												if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 998
													Login.loginIndex = 13; // L: 999
												}
											} else if (Login.loginIndex == 13) { // L: 1002
												var11 = class153.loginBoxCenter; // L: 1003
												var12 = 321; // L: 1004
												if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 1005
													class260.method5395(true); // L: 1006
												}
											} else if (Login.loginIndex == 14) { // L: 1009
												String var32 = ""; // L: 1010
												switch(Login.field894) { // L: 1011
												case 0:
													var32 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 1022
													break;
												case 1:
													var32 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 1019
													break; // L: 1020
												case 2:
													var32 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1016
													break; // L: 1017
												default:
													class130.Login_promptCredentials(false); // L: 1013
												}

												var42 = Login.loginBoxX + 180; // L: 1025
												var41 = 276; // L: 1026
												if (var6 == 1 && var37 >= var42 - 75 && var37 <= var42 + 75 && var38 >= var41 - 20 && var38 <= var41 + 20) { // L: 1027
													class125.openURL(var32, true, false); // L: 1028
													UrlRequest.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1029
													class14.method171(6); // L: 1030
													return; // L: 1031
												}

												var42 = Login.loginBoxX + 180; // L: 1033
												var41 = 326; // L: 1034
												if (var6 == 1 && var37 >= var42 - 75 && var37 <= var42 + 75 && var38 >= var41 - 20 && var38 <= var41 + 20) { // L: 1035
													class130.Login_promptCredentials(false); // L: 1036
												}
											} else if (Login.loginIndex == 24) { // L: 1039
												var11 = Login.loginBoxX + 180; // L: 1040
												var12 = 301; // L: 1041
												if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 1042
													class260.method5395(false); // L: 1043
												}
											} else if (Login.loginIndex == 32) { // L: 1046
												var11 = Login.loginBoxX + 180 - 80; // L: 1047
												var12 = 321; // L: 1048
												if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 1049
													class125.openURL(Skeleton.method4472("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1050
													UrlRequest.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1051
													class14.method171(6); // L: 1052
													return; // L: 1053
												}

												var11 = Login.loginBoxX + 180 + 80; // L: 1055
												if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 1056
													class130.Login_promptCredentials(true); // L: 1057
												}
											} else if (Login.loginIndex == 33) { // L: 1060
												var11 = Login.loginBoxX + 180; // L: 1061
												var12 = 276; // L: 1062
												if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 1063
													class125.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 1064
												}

												var11 = Login.loginBoxX + 180; // L: 1066
												var12 = 326; // L: 1067
												if (var6 == 1 && var37 >= var11 - 75 && var37 <= var11 + 75 && var38 >= var12 - 20 && var38 <= var12 + 20) { // L: 1068
													class130.Login_promptCredentials(true); // L: 1069
												}
											}
										} else {
											while (true) {
												do {
													if (!var10.method4085()) { // L: 868
														var40 = 321; // L: 873
														if (var6 == 1 && var38 >= var40 - 20 && var38 <= var40 + 20) { // L: 874
															class130.Login_promptCredentials(true); // L: 875
														}

														return;
													}
												} while(var10.field2334 != 84 && var10.field2334 != 13); // L: 869

												class130.Login_promptCredentials(true); // L: 870
											}
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 396

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Lmo;III)V",
		garbageValue = "1787199939"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3796
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3797
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3798
				if (var3 == null) { // L: 3799
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3800
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3801
				if (var3.contains(var4, var5)) { // L: 3802
					var4 -= var3.width / 2; // L: 3803
					var5 -= var3.height / 2; // L: 3804
					int var6 = Client.camAngleY & 2047; // L: 3805
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3806
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3807
					int var9 = var8 * var4 + var7 * var5 >> 11; // L: 3808
					int var10 = var8 * var5 - var7 * var4 >> 11; // L: 3809
					int var11 = var9 + HitSplatDefinition.localPlayer.x >> 7; // L: 3810
					int var12 = HitSplatDefinition.localPlayer.y - var10 >> 7; // L: 3811
					PacketBufferNode var13 = class251.getPacketBufferNode(ClientPacket.field3128, Client.packetWriter.isaacCipher); // L: 3813
					var13.packetBuffer.writeByte(18); // L: 3814
					var13.packetBuffer.method8994(Client.field759.method4087(82) ? (Client.field759.method4087(81) ? 2 : 1) : 0); // L: 3815
					var13.packetBuffer.writeShort(class147.baseX * 64 + var11); // L: 3816
					var13.packetBuffer.method9004(ModeWhere.baseY * 64 + var12); // L: 3817
					var13.packetBuffer.writeByte(var4); // L: 3818
					var13.packetBuffer.writeByte(var5); // L: 3819
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3820
					var13.packetBuffer.writeByte(57); // L: 3821
					var13.packetBuffer.writeByte(0); // L: 3822
					var13.packetBuffer.writeByte(0); // L: 3823
					var13.packetBuffer.writeByte(89); // L: 3824
					var13.packetBuffer.writeShort(HitSplatDefinition.localPlayer.x); // L: 3825
					var13.packetBuffer.writeShort(HitSplatDefinition.localPlayer.y); // L: 3826
					var13.packetBuffer.writeByte(63); // L: 3827
					Client.packetWriter.addNode(var13); // L: 3828
					Client.destinationX = var11; // L: 3829
					Client.destinationY = var12; // L: 3830
				}
			}

		}
	} // L: 3833
}
