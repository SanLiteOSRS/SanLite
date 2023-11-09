import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -766441787
	)
	static int field4016;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1108975405
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("k")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("v")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("e")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("s")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("i")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("r")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("m")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lqa;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("ar")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("aj")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1499874975
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("as")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("ab")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4016 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-335585852"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 132

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "586524231"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 218

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1212522629"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 188 189
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "740141823"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var5 = -1; // L: 42

		int var6;
		for (var6 = 0; var6 < var3; ++var6) { // L: 43
			var5 = var5 >>> 8 ^ Buffer.crc32Table[(var5 ^ var1[var6]) & 255]; // L: 44
		}

		var5 = ~var5; // L: 46
		this.hash = var5; // L: 51
		Buffer var15 = new Buffer(WorldMapDecorationType.decompressBytes(var1)); // L: 52
		var5 = var15.readUnsignedByte(); // L: 53
		if (var5 >= 5 && var5 <= 7) { // L: 54
			if (var5 >= 6) { // L: 55
				var15.readInt(); // L: 56
			}

			var6 = var15.readUnsignedByte(); // L: 59
			if (var5 >= 7) { // L: 60
				this.groupCount = var15.method7755();
			} else {
				this.groupCount = var15.readUnsignedShort(); // L: 61
			}

			int var7 = 0; // L: 62
			int var8 = -1; // L: 63
			this.groupIds = new int[this.groupCount]; // L: 64
			int var9;
			if (var5 >= 7) { // L: 65
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 66
					this.groupIds[var9] = var7 += var15.method7755(); // L: 67
					if (this.groupIds[var9] > var8) { // L: 68
						var8 = this.groupIds[var9];
					}
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 72
					this.groupIds[var9] = var7 += var15.readUnsignedShort(); // L: 73
					if (this.groupIds[var9] > var8) { // L: 74
						var8 = this.groupIds[var9];
					}
				}
			}

			this.groupCrcs = new int[var8 + 1]; // L: 77
			this.groupVersions = new int[var8 + 1]; // L: 78
			this.fileCounts = new int[var8 + 1]; // L: 79
			this.fileIds = new int[var8 + 1][]; // L: 80
			this.groups = new Object[var8 + 1]; // L: 81
			this.files = new Object[var8 + 1][]; // L: 82
			if (var6 != 0) { // L: 83
				this.groupNameHashes = new int[var8 + 1]; // L: 84

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 85
					this.groupNameHashes[this.groupIds[var9]] = var15.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes); // L: 86
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 88
				this.groupCrcs[this.groupIds[var9]] = var15.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 89
				this.groupVersions[this.groupIds[var9]] = var15.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 90
				this.fileCounts[this.groupIds[var9]] = var15.readUnsignedShort();
			}

			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			if (var5 >= 7) { // L: 91
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 92
					var10 = this.groupIds[var9]; // L: 93
					var11 = this.fileCounts[var10]; // L: 94
					var7 = 0; // L: 95
					var12 = -1; // L: 96
					this.fileIds[var10] = new int[var11]; // L: 97

					for (var13 = 0; var13 < var11; ++var13) { // L: 98
						var14 = this.fileIds[var10][var13] = var7 += var15.method7755(); // L: 99
						if (var14 > var12) { // L: 100
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1]; // L: 102
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 106
					var10 = this.groupIds[var9]; // L: 107
					var11 = this.fileCounts[var10]; // L: 108
					var7 = 0; // L: 109
					var12 = -1; // L: 110
					this.fileIds[var10] = new int[var11]; // L: 111

					for (var13 = 0; var13 < var11; ++var13) { // L: 112
						var14 = this.fileIds[var10][var13] = var7 += var15.readUnsignedShort(); // L: 113
						if (var14 > var12) { // L: 114
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1]; // L: 116
				}
			}

			if (var6 != 0) { // L: 119
				this.fileNameHashes = new int[var8 + 1][]; // L: 120
				this.fileNameHashTables = new IntHashTable[var8 + 1]; // L: 121

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 122
					var10 = this.groupIds[var9]; // L: 123
					var11 = this.fileCounts[var10]; // L: 124
					this.fileNameHashes[var10] = new int[this.files[var10].length]; // L: 125

					for (var12 = 0; var12 < var11; ++var12) { // L: 126
						this.fileNameHashes[var10][this.fileIds[var10][var12]] = var15.readInt();
					}

					this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]); // L: 127
				}
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 130

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "-4"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 135
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-304157516"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 139
			if (this.files[var1][var2] == null) { // L: 140
				boolean var4 = this.buildFiles(var1, var3); // L: 141
				if (!var4) { // L: 142
					this.loadGroup(var1); // L: 143
					var4 = this.buildFiles(var1, var3); // L: 144
					if (!var4) { // L: 145
						return null;
					}
				}
			}

			byte[] var5 = class20.method291(this.files[var1][var2], false); // L: 148
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 149
			}

			return var5; // L: 150
		} else {
			return null;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-653603810"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 154
			if (this.files[var1][var2] != null) {
				return true; // L: 155
			} else if (this.groups[var1] != null) { // L: 156
				return true;
			} else {
				this.loadGroup(var1); // L: 157
				return this.groups[var1] != null; // L: 158
			}
		} else {
			return false; // L: 159
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-70"
	)
	public boolean method5927(int var1) {
		if (this.files.length == 1) { // L: 163
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 164
		} else {
			throw new RuntimeException(); // L: 165
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1989359863"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 169
			return true;
		} else {
			this.loadGroup(var1); // L: 170
			return this.groups[var1] != null; // L: 171
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-86"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true; // L: 176

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) { // L: 177
			int var3 = this.groupIds[var2]; // L: 178
			if (this.groups[var3] == null) { // L: 179
				this.loadGroup(var3); // L: 180
				if (this.groups[var3] == null) { // L: 181
					var1 = false;
				}
			}
		}

		return var1; // L: 184
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-1"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) { // L: 193
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0); // L: 194
		} else {
			throw new RuntimeException(); // L: 195
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "95"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 199
			if (this.files[var1][var2] == null) { // L: 200
				boolean var3 = this.buildFiles(var1, (int[])null); // L: 201
				if (!var3) { // L: 202
					this.loadGroup(var1); // L: 203
					var3 = this.buildFiles(var1, (int[])null); // L: 204
					if (!var3) { // L: 205
						return null;
					}
				}
			}

			byte[] var4 = class20.method291(this.files[var1][var2], false); // L: 208
			return var4; // L: 209
		} else {
			return null;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "1"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) { // L: 213
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0); // L: 214
		} else {
			throw new RuntimeException(); // L: 215
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1125413052"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 221 222 224
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "113911321"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 228
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "66"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 232
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1783649041"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 236
			this.groups[var1] = null;
		}

	} // L: 237

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "12667"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 240
			this.files[var1][var2] = null;
		}

	} // L: 241

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 244
			if (this.files[var1] != null) { // L: 245
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 246
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 249

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "43"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) { // L: 252
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 253
			int[] var4 = this.fileIds[var1]; // L: 254
			Object[] var5 = this.files[var1]; // L: 255
			boolean var6 = true; // L: 256

			for (int var7 = 0; var7 < var3; ++var7) { // L: 257
				if (var5[var4[var7]] == null) { // L: 258
					var6 = false; // L: 259
					break;
				}
			}

			if (var6) { // L: 263
				return true;
			} else {
				byte[] var21;
				if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) { // L: 265
					var21 = class20.method291(this.groups[var1], true); // L: 266
					Buffer var8 = new Buffer(var21); // L: 267
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 268
				} else {
					var21 = class20.method291(this.groups[var1], false); // L: 270
				}

				byte[] var25 = WorldMapDecorationType.decompressBytes(var21); // L: 273
				if (this.releaseGroups) { // L: 310
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) { // L: 311
					int var22 = var25.length; // L: 312
					--var22; // L: 313
					var10 = var25[var22] & 255;
					var22 -= var10 * var3 * 4; // L: 314
					Buffer var11 = new Buffer(var25); // L: 315
					int[] var12 = new int[var3]; // L: 316
					var11.offset = var22; // L: 317

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 318
						var14 = 0; // L: 319

						for (var15 = 0; var15 < var3; ++var15) { // L: 320
							var14 += var11.readInt(); // L: 321
							var12[var15] += var14; // L: 322
						}
					}

					byte[][] var23 = new byte[var3][]; // L: 325

					for (var14 = 0; var14 < var3; ++var14) { // L: 326
						var23[var14] = new byte[var12[var14]]; // L: 327
						var12[var14] = 0; // L: 328
					}

					var11.offset = var22; // L: 330
					var14 = 0; // L: 331

					int var17;
					for (var15 = 0; var15 < var10; ++var15) { // L: 332
						int var24 = 0; // L: 333

						for (var17 = 0; var17 < var3; ++var17) { // L: 334
							var24 += var11.readInt(); // L: 335
							System.arraycopy(var25, var14, var23[var17], var12[var17], var24); // L: 336
							var12[var17] += var24; // L: 337
							var14 += var24; // L: 338
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 341
						if (!this.shallowFiles) { // L: 342
							var17 = var4[var15]; // L: 344
							byte[] var19 = var23[var15]; // L: 346
							Object var18;
							if (var19 == null) { // L: 348
								var18 = null; // L: 349
							} else if (var19.length > 136) { // L: 352
								DirectByteArrayCopier var20 = new DirectByteArrayCopier(); // L: 354
								var20.set(var19); // L: 355
								var18 = var20; // L: 356
							} else {
								var18 = var19; // L: 370
							}

							var5[var17] = var18; // L: 372
						} else {
							var5[var4[var15]] = var23[var15]; // L: 374
						}
					}
				} else if (!this.shallowFiles) { // L: 378
					var10 = var4[0]; // L: 380
					Object var26;
					if (var25 == null) { // L: 383
						var26 = null; // L: 384
					} else if (var25.length > 136) { // L: 387
						DirectByteArrayCopier var27 = new DirectByteArrayCopier(); // L: 389
						var27.set(var25); // L: 390
						var26 = var27; // L: 391
					} else {
						var26 = var25; // L: 405
					}

					var5[var10] = var26; // L: 407
				} else {
					var5[var4[0]] = var25; // L: 409
				}

				return true; // L: 411
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1752133542"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 415
		return this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1)); // L: 416
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)I",
		garbageValue = "59"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 420
		return this.fileNameHashTables[var1].get(ArchiveDiskActionHandler.hashString(var2)); // L: 421
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "251984031"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 425
		var2 = var2.toLowerCase(); // L: 426
		int var3 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1)); // L: 427
		if (var3 < 0) { // L: 428
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(ArchiveDiskActionHandler.hashString(var2)); // L: 429
			return var4 >= 0; // L: 430
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1285225709"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 435
		var2 = var2.toLowerCase(); // L: 436
		int var3 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1)); // L: 437
		int var4 = this.fileNameHashTables[var3].get(ArchiveDiskActionHandler.hashString(var2)); // L: 438
		return this.takeFile(var3, var4); // L: 439
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "849258773"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 443
		var2 = var2.toLowerCase(); // L: 444
		int var3 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1)); // L: 445
		int var4 = this.fileNameHashTables[var3].get(ArchiveDiskActionHandler.hashString(var2)); // L: 446
		return this.tryLoadFile(var3, var4); // L: 447
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-115701314"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 451
		int var2 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1)); // L: 452
		return this.tryLoadGroup(var2); // L: 453
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2048850474"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 457
		int var2 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1)); // L: 458
		if (var2 >= 0) { // L: 459
			this.loadRegionFromGroup(var2); // L: 460
		}
	} // L: 461

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-340005039"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 464
		int var2 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1)); // L: 465
		return this.groupLoadPercent(var2); // L: 466
	}
}
