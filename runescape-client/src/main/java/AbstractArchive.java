import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1022996685
	)
	static int field4201;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -209529523
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("ag")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("at")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("ai")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("aw")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("aa")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("ah")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("ad")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Ltd;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bv")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bo")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 2033647585
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bh")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bl")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4201 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-7"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 132

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 218

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-877210204"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 188 189
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "28"
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
		Buffer var15 = new Buffer(Timer.decompressBytes(var1)); // L: 52
		var5 = var15.readUnsignedByte(); // L: 53
		if (var5 >= 5 && var5 <= 7) { // L: 54
			if (var5 >= 6) { // L: 55
				var15.readInt(); // L: 56
			}

			var6 = var15.readUnsignedByte(); // L: 59
			if (var5 >= 7) { // L: 60
				this.groupCount = var15.method8637();
			} else {
				this.groupCount = var15.readUnsignedShort(); // L: 61
			}

			int var7 = 0; // L: 62
			int var8 = -1; // L: 63
			this.groupIds = new int[this.groupCount]; // L: 64
			int var9;
			if (var5 >= 7) { // L: 65
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 66
					this.groupIds[var9] = var7 += var15.method8637(); // L: 67
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
						var14 = this.fileIds[var10][var13] = var7 += var15.method8637(); // L: 99
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "-33"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 135
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-939348778"
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

			byte[] var5 = class126.method2966(this.files[var1][var2], false); // L: 148
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 149
			}

			return var5; // L: 150
		} else {
			return null;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "20"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 154
			if (this.files[var1][var2] != null) { // L: 155
				return true;
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-660710847"
	)
	public boolean method6436(int var1) {
		if (this.files.length == 1) { // L: 163
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 164
		} else {
			throw new RuntimeException(); // L: 165
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-32"
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

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "59"
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "0"
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

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-43714876"
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

			byte[] var4 = class126.method2966(this.files[var1][var2], false); // L: 208
			return var4; // L: 209
		} else {
			return null;
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "76"
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

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-594001418"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 221 222 224
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2068766616"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 228
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-668130411"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 232
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1088526005"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 236
			this.groups[var1] = null;
		}

	} // L: 237

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1584982100"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 240
			this.files[var1][var2] = null;
		}

	} // L: 241

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-657054879"
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

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "-144113176"
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
				byte[] var18;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 265
					var18 = class126.method2966(this.groups[var1], false); // L: 270
				} else {
					var18 = class126.method2966(this.groups[var1], true); // L: 266
					Buffer var8 = new Buffer(var18); // L: 267
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 268
				}

				byte[] var20 = Timer.decompressBytes(var18); // L: 273
				if (this.releaseGroups) { // L: 309
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 310
					int var9 = var20.length; // L: 311
					--var9; // L: 312
					int var10 = var20[var9] & 255;
					var9 -= var3 * var10 * 4; // L: 313
					Buffer var11 = new Buffer(var20); // L: 314
					int[] var12 = new int[var3]; // L: 315
					var11.offset = var9; // L: 316

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 317
						var14 = 0; // L: 318

						for (var15 = 0; var15 < var3; ++var15) { // L: 319
							var14 += var11.readInt(); // L: 320
							var12[var15] += var14; // L: 321
						}
					}

					byte[][] var19 = new byte[var3][]; // L: 324

					for (var14 = 0; var14 < var3; ++var14) { // L: 325
						var19[var14] = new byte[var12[var14]]; // L: 326
						var12[var14] = 0; // L: 327
					}

					var11.offset = var9; // L: 329
					var14 = 0; // L: 330

					for (var15 = 0; var15 < var10; ++var15) { // L: 331
						int var16 = 0; // L: 332

						for (int var17 = 0; var17 < var3; ++var17) { // L: 333
							var16 += var11.readInt(); // L: 334
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 335
							var12[var17] += var16; // L: 336
							var14 += var16; // L: 337
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 340
						if (!this.shallowFiles) { // L: 341
							var5[var4[var15]] = WorldMapRegion.method5050(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 342
						}
					}
				} else if (!this.shallowFiles) { // L: 346
					var5[var4[0]] = WorldMapRegion.method5050(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 347
				}

				return true; // L: 349
			}
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "158655528"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 353
		return this.groupNameHashTable.get(Login.hashString(var1)); // L: 354
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)I",
		garbageValue = "-110"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 358
		return this.fileNameHashTables[var1].get(Login.hashString(var2)); // L: 359
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "2093668083"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 363
		var2 = var2.toLowerCase(); // L: 364
		int var3 = this.groupNameHashTable.get(Login.hashString(var1)); // L: 365
		if (var3 < 0) { // L: 366
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(Login.hashString(var2)); // L: 367
			return var4 >= 0; // L: 368
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1889550610"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 373
		var2 = var2.toLowerCase(); // L: 374
		int var3 = this.groupNameHashTable.get(Login.hashString(var1)); // L: 375
		int var4 = this.fileNameHashTables[var3].get(Login.hashString(var2)); // L: 376
		return this.takeFile(var3, var4); // L: 377
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1049049092"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 381
		var2 = var2.toLowerCase(); // L: 382
		int var3 = this.groupNameHashTable.get(Login.hashString(var1)); // L: 383
		int var4 = this.fileNameHashTables[var3].get(Login.hashString(var2)); // L: 384
		return this.tryLoadFile(var3, var4); // L: 385
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-13"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 389
		int var2 = this.groupNameHashTable.get(Login.hashString(var1)); // L: 390
		return this.tryLoadGroup(var2); // L: 391
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2118736670"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 395
		int var2 = this.groupNameHashTable.get(Login.hashString(var1)); // L: 396
		if (var2 >= 0) { // L: 397
			this.loadRegionFromGroup(var2); // L: 398
		}
	} // L: 399

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2108299394"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 402
		int var2 = this.groupNameHashTable.get(Login.hashString(var1)); // L: 403
		return this.groupLoadPercent(var2); // L: 404
	}
}
