import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -152549147
	)
	static int field4222;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -828267869
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("u")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("x")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("q")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("d")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("e")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("g")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("y")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lsp;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("aa")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("ai")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1192295435
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("ar")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("al")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4222 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1827988769"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 123

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-4"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 209

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-821387785"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 179 180
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1887197696"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var2 = IgnoreList.method7524(var1, 0, var3); // L: 40
		this.hash = var2; // L: 42
		Buffer var4 = new Buffer(class161.decompressBytes(var1)); // L: 43
		int var5 = var4.readUnsignedByte(); // L: 44
		if (var5 >= 5 && var5 <= 7) { // L: 45
			if (var5 >= 6) { // L: 46
				var4.readInt(); // L: 47
			}

			int var6 = var4.readUnsignedByte(); // L: 50
			if (var5 >= 7) { // L: 51
				this.groupCount = var4.method8662();
			} else {
				this.groupCount = var4.readUnsignedShort(); // L: 52
			}

			int var7 = 0; // L: 53
			int var8 = -1; // L: 54
			this.groupIds = new int[this.groupCount]; // L: 55
			int var9;
			if (var5 >= 7) { // L: 56
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 57
					this.groupIds[var9] = var7 += var4.method8662(); // L: 58
					if (this.groupIds[var9] > var8) { // L: 59
						var8 = this.groupIds[var9];
					}
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 63
					this.groupIds[var9] = var7 += var4.readUnsignedShort(); // L: 64
					if (this.groupIds[var9] > var8) { // L: 65
						var8 = this.groupIds[var9];
					}
				}
			}

			this.groupCrcs = new int[var8 + 1]; // L: 68
			this.groupVersions = new int[var8 + 1]; // L: 69
			this.fileCounts = new int[var8 + 1]; // L: 70
			this.fileIds = new int[var8 + 1][]; // L: 71
			this.groups = new Object[var8 + 1]; // L: 72
			this.files = new Object[var8 + 1][]; // L: 73
			if (var6 != 0) { // L: 74
				this.groupNameHashes = new int[var8 + 1]; // L: 75

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 76
					this.groupNameHashes[this.groupIds[var9]] = var4.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes); // L: 77
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 79
				this.groupCrcs[this.groupIds[var9]] = var4.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 80
				this.groupVersions[this.groupIds[var9]] = var4.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 81
				this.fileCounts[this.groupIds[var9]] = var4.readUnsignedShort();
			}

			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			if (var5 >= 7) { // L: 82
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 83
					var10 = this.groupIds[var9]; // L: 84
					var11 = this.fileCounts[var10]; // L: 85
					var7 = 0; // L: 86
					var12 = -1; // L: 87
					this.fileIds[var10] = new int[var11]; // L: 88

					for (var13 = 0; var13 < var11; ++var13) { // L: 89
						var14 = this.fileIds[var10][var13] = var7 += var4.method8662(); // L: 90
						if (var14 > var12) { // L: 91
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1]; // L: 93
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 97
					var10 = this.groupIds[var9]; // L: 98
					var11 = this.fileCounts[var10]; // L: 99
					var7 = 0; // L: 100
					var12 = -1; // L: 101
					this.fileIds[var10] = new int[var11]; // L: 102

					for (var13 = 0; var13 < var11; ++var13) { // L: 103
						var14 = this.fileIds[var10][var13] = var7 += var4.readUnsignedShort(); // L: 104
						if (var14 > var12) { // L: 105
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1]; // L: 107
				}
			}

			if (var6 != 0) { // L: 110
				this.fileNameHashes = new int[var8 + 1][]; // L: 111
				this.fileNameHashTables = new IntHashTable[var8 + 1]; // L: 112

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 113
					var10 = this.groupIds[var9]; // L: 114
					var11 = this.fileCounts[var10]; // L: 115
					this.fileNameHashes[var10] = new int[this.files[var10].length]; // L: 116

					for (var12 = 0; var12 < var11; ++var12) { // L: 117
						this.fileNameHashes[var10][this.fileIds[var10][var12]] = var4.readInt();
					}

					this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]); // L: 118
				}
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 121

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "1"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 126
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II[IB)[B",
		garbageValue = "59"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 130
			if (this.files[var1][var2] == null) { // L: 131
				boolean var4 = this.buildFiles(var1, var3); // L: 132
				if (!var4) { // L: 133
					this.loadGroup(var1); // L: 134
					var4 = this.buildFiles(var1, var3); // L: 135
					if (!var4) { // L: 136
						return null;
					}
				}
			}

			byte[] var5 = WorldMapData_1.method5224(this.files[var1][var2], false); // L: 139
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 140
			}

			return var5; // L: 141
		} else {
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "641754960"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 145
			if (this.files[var1][var2] != null) {
				return true; // L: 146
			} else if (this.groups[var1] != null) { // L: 147
				return true;
			} else {
				this.loadGroup(var1); // L: 148
				return this.groups[var1] != null; // L: 149
			}
		} else {
			return false; // L: 150
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-61718556"
	)
	public boolean method6603(int var1) {
		if (this.files.length == 1) { // L: 154
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 155
		} else {
			throw new RuntimeException(); // L: 156
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1640810218"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 160
			return true;
		} else {
			this.loadGroup(var1); // L: 161
			return this.groups[var1] != null; // L: 162
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "31"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true; // L: 167

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) { // L: 168
			int var3 = this.groupIds[var2]; // L: 169
			if (this.groups[var3] == null) { // L: 170
				this.loadGroup(var3); // L: 171
				if (this.groups[var3] == null) { // L: 172
					var1 = false;
				}
			}
		}

		return var1; // L: 175
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1816380649"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) { // L: 184
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0); // L: 185
		} else {
			throw new RuntimeException(); // L: 186
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "914937938"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 190
			if (this.files[var1][var2] == null) { // L: 191
				boolean var3 = this.buildFiles(var1, (int[])null); // L: 192
				if (!var3) { // L: 193
					this.loadGroup(var1); // L: 194
					var3 = this.buildFiles(var1, (int[])null); // L: 195
					if (!var3) { // L: 196
						return null;
					}
				}
			}

			byte[] var4 = WorldMapData_1.method5224(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "2075443388"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) { // L: 204
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0); // L: 205
		} else {
			throw new RuntimeException(); // L: 206
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "9"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 212 213 215
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1896866787"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 219
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "919082919"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 223
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 227
			this.groups[var1] = null;
		}

	} // L: 228

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2105035318"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 231
			this.files[var1][var2] = null;
		}

	} // L: 232

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1099299889"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 235
			if (this.files[var1] != null) { // L: 236
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 237
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 240

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "-20"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) { // L: 243
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 244
			int[] var4 = this.fileIds[var1]; // L: 245
			Object[] var5 = this.files[var1]; // L: 246
			boolean var6 = true; // L: 247

			for (int var7 = 0; var7 < var3; ++var7) { // L: 248
				if (var5[var4[var7]] == null) { // L: 249
					var6 = false; // L: 250
					break;
				}
			}

			if (var6) { // L: 254
				return true;
			} else {
				byte[] var21;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 256
					var21 = WorldMapData_1.method5224(this.groups[var1], false); // L: 261
				} else {
					var21 = WorldMapData_1.method5224(this.groups[var1], true); // L: 257
					Buffer var8 = new Buffer(var21); // L: 258
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 259
				}

				byte[] var25 = class161.decompressBytes(var21); // L: 264
				if (this.releaseGroups) { // L: 276
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) { // L: 277
					int var22 = var25.length; // L: 278
					--var22; // L: 279
					var10 = var25[var22] & 255;
					var22 -= var10 * var3 * 4; // L: 280
					Buffer var11 = new Buffer(var25); // L: 281
					int[] var12 = new int[var3]; // L: 282
					var11.offset = var22; // L: 283

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 284
						var14 = 0; // L: 285

						for (var15 = 0; var15 < var3; ++var15) { // L: 286
							var14 += var11.readInt(); // L: 287
							var12[var15] += var14; // L: 288
						}
					}

					byte[][] var23 = new byte[var3][]; // L: 291

					for (var14 = 0; var14 < var3; ++var14) { // L: 292
						var23[var14] = new byte[var12[var14]]; // L: 293
						var12[var14] = 0; // L: 294
					}

					var11.offset = var22; // L: 296
					var14 = 0; // L: 297

					int var17;
					for (var15 = 0; var15 < var10; ++var15) { // L: 298
						int var24 = 0; // L: 299

						for (var17 = 0; var17 < var3; ++var17) { // L: 300
							var24 += var11.readInt(); // L: 301
							System.arraycopy(var25, var14, var23[var17], var12[var17], var24); // L: 302
							var12[var17] += var24; // L: 303
							var14 += var24; // L: 304
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 307
						if (!this.shallowFiles) { // L: 308
							var17 = var4[var15]; // L: 310
							byte[] var19 = var23[var15]; // L: 312
							Object var18;
							if (var19 == null) { // L: 314
								var18 = null; // L: 315
							} else if (var19.length > 136) { // L: 318
								DirectByteArrayCopier var20 = new DirectByteArrayCopier(); // L: 320
								var20.set(var19); // L: 321
								var18 = var20; // L: 322
							} else {
								var18 = var19; // L: 336
							}

							var5[var17] = var18; // L: 338
						} else {
							var5[var4[var15]] = var23[var15]; // L: 340
						}
					}
				} else if (!this.shallowFiles) { // L: 344
					var10 = var4[0]; // L: 346
					Object var26;
					if (var25 == null) { // L: 349
						var26 = null; // L: 350
					} else if (var25.length > 136) { // L: 353
						DirectByteArrayCopier var27 = new DirectByteArrayCopier(); // L: 355
						var27.set(var25); // L: 356
						var26 = var27; // L: 357
					} else {
						var26 = var25; // L: 371
					}

					var5[var10] = var26; // L: 373
				} else {
					var5[var4[0]] = var25; // L: 375
				}

				return true; // L: 377
			}
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "1"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 381
		return this.groupNameHashTable.get(GrandExchangeOfferAgeComparator.hashString(var1)); // L: 382
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "-1707447212"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 386
		return this.fileNameHashTables[var1].get(GrandExchangeOfferAgeComparator.hashString(var2)); // L: 387
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-580857019"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 391
		var2 = var2.toLowerCase(); // L: 392
		int var3 = this.groupNameHashTable.get(GrandExchangeOfferAgeComparator.hashString(var1)); // L: 393
		if (var3 < 0) { // L: 394
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(GrandExchangeOfferAgeComparator.hashString(var2)); // L: 395
			return var4 >= 0; // L: 396
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B",
		garbageValue = "-26"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 401
		var2 = var2.toLowerCase(); // L: 402
		int var3 = this.groupNameHashTable.get(GrandExchangeOfferAgeComparator.hashString(var1)); // L: 403
		int var4 = this.fileNameHashTables[var3].get(GrandExchangeOfferAgeComparator.hashString(var2)); // L: 404
		return this.takeFile(var3, var4); // L: 405
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "-36"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 409
		var2 = var2.toLowerCase(); // L: 410
		int var3 = this.groupNameHashTable.get(GrandExchangeOfferAgeComparator.hashString(var1)); // L: 411
		int var4 = this.fileNameHashTables[var3].get(GrandExchangeOfferAgeComparator.hashString(var2)); // L: 412
		return this.tryLoadFile(var3, var4); // L: 413
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-110975497"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 417
		int var2 = this.groupNameHashTable.get(GrandExchangeOfferAgeComparator.hashString(var1)); // L: 418
		return this.tryLoadGroup(var2); // L: 419
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 423
		int var2 = this.groupNameHashTable.get(GrandExchangeOfferAgeComparator.hashString(var1)); // L: 424
		if (var2 >= 0) { // L: 425
			this.loadRegionFromGroup(var2); // L: 426
		}
	} // L: 427

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "114"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 430
		int var2 = this.groupNameHashTable.get(GrandExchangeOfferAgeComparator.hashString(var1)); // L: 431
		return this.groupLoadPercent(var2); // L: 432
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1935274773"
	)
	public static boolean method6619(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 21
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-90"
	)
	public static int method6625(int var0) {
		if (var0 > 0) { // L: 199
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 200 201
		}
	}
}
