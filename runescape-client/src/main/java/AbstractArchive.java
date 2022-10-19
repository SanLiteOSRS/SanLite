import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -442127047
	)
	static int field4157;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1110470755
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("w")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("m")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("i")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("e")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("g")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("k")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("v")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lrl;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("an")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("ah")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -531202277
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("af")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("ad")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4157 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "61"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 123

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1857779270"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 209

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "15"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 179 180
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-658852576"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var2 = WorldMapSprite.method5156(var1, 0, var3); // L: 40
		this.hash = var2; // L: 42
		Buffer var4 = new Buffer(VertexNormal.decompressBytes(var1)); // L: 43
		int var5 = var4.readUnsignedByte(); // L: 44
		if (var5 >= 5 && var5 <= 7) { // L: 45
			if (var5 >= 6) { // L: 46
				var4.readInt(); // L: 47
			}

			int var6 = var4.readUnsignedByte(); // L: 50
			if (var5 >= 7) { // L: 51
				this.groupCount = var4.method8421();
			} else {
				this.groupCount = var4.readUnsignedShort(); // L: 52
			}

			int var7 = 0; // L: 53
			int var8 = -1; // L: 54
			this.groupIds = new int[this.groupCount]; // L: 55
			int var9;
			if (var5 >= 7) { // L: 56
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 57
					this.groupIds[var9] = var7 += var4.method8421(); // L: 58
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
						var14 = this.fileIds[var10][var13] = var7 += var4.method8421(); // L: 90
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "-18"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 126
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II[IB)[B",
		garbageValue = "-104"
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

			byte[] var5 = StudioGame.method6260(this.files[var1][var2], false); // L: 139
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 140
			}

			return var5; // L: 141
		} else {
			return null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1739441369"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 145
			if (this.files[var1][var2] != null) { // L: 146
				return true;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1676667383"
	)
	public boolean method6348(int var1) {
		if (this.files.length == 1) { // L: 154
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 155
		} else {
			throw new RuntimeException(); // L: 156
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "404906413"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "397677135"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-104"
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "-79"
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

			byte[] var4 = StudioGame.method6260(this.files[var1][var2], false); // L: 199
			return var4; // L: 200
		} else {
			return null;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "0"
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-5"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 212 213 215
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "919501440"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 219
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 223
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-232459526"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 227
			this.groups[var1] = null;
		}

	} // L: 228

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1512120476"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 231
			this.files[var1][var2] = null;
		}

	} // L: 232

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1839748346"
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "1683493694"
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
				byte[] var18;
				if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) { // L: 256
					var18 = StudioGame.method6260(this.groups[var1], true); // L: 257
					Buffer var8 = new Buffer(var18); // L: 258
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 259
				} else {
					var18 = StudioGame.method6260(this.groups[var1], false); // L: 261
				}

				byte[] var20 = VertexNormal.decompressBytes(var18); // L: 264
				if (this.releaseGroups) { // L: 276
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 277
					int var9 = var20.length; // L: 278
					--var9; // L: 279
					int var10 = var20[var9] & 255;
					var9 -= var10 * var3 * 4; // L: 280
					Buffer var11 = new Buffer(var20); // L: 281
					int[] var12 = new int[var3]; // L: 282
					var11.offset = var9; // L: 283

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 284
						var14 = 0; // L: 285

						for (var15 = 0; var15 < var3; ++var15) { // L: 286
							var14 += var11.readInt(); // L: 287
							var12[var15] += var14; // L: 288
						}
					}

					byte[][] var19 = new byte[var3][]; // L: 291

					for (var14 = 0; var14 < var3; ++var14) { // L: 292
						var19[var14] = new byte[var12[var14]]; // L: 293
						var12[var14] = 0; // L: 294
					}

					var11.offset = var9; // L: 296
					var14 = 0; // L: 297

					for (var15 = 0; var15 < var10; ++var15) { // L: 298
						int var16 = 0; // L: 299

						for (int var17 = 0; var17 < var3; ++var17) { // L: 300
							var16 += var11.readInt(); // L: 301
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 302
							var12[var17] += var16; // L: 303
							var14 += var16; // L: 304
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 307
						if (!this.shallowFiles) { // L: 308
							var5[var4[var15]] = class138.method3001(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 309
						}
					}
				} else if (!this.shallowFiles) { // L: 313
					var5[var4[0]] = class138.method3001(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 314
				}

				return true; // L: 316
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "58"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 320
		return this.groupNameHashTable.get(class343.hashString(var1)); // L: 321
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "2074335845"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 325
		return this.fileNameHashTables[var1].get(class343.hashString(var2)); // L: 326
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-2074684585"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 330
		var2 = var2.toLowerCase(); // L: 331
		int var3 = this.groupNameHashTable.get(class343.hashString(var1)); // L: 332
		if (var3 < 0) { // L: 333
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class343.hashString(var2)); // L: 334
			return var4 >= 0; // L: 335
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B",
		garbageValue = "-109"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 340
		var2 = var2.toLowerCase(); // L: 341
		int var3 = this.groupNameHashTable.get(class343.hashString(var1)); // L: 342
		int var4 = this.fileNameHashTables[var3].get(class343.hashString(var2)); // L: 343
		return this.takeFile(var3, var4); // L: 344
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1679993527"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 348
		var2 = var2.toLowerCase(); // L: 349
		int var3 = this.groupNameHashTable.get(class343.hashString(var1)); // L: 350
		int var4 = this.fileNameHashTables[var3].get(class343.hashString(var2)); // L: 351
		return this.tryLoadFile(var3, var4); // L: 352
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1051034151"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 356
		int var2 = this.groupNameHashTable.get(class343.hashString(var1)); // L: 357
		return this.tryLoadGroup(var2); // L: 358
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1907143195"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 362
		int var2 = this.groupNameHashTable.get(class343.hashString(var1)); // L: 363
		if (var2 >= 0) { // L: 364
			this.loadRegionFromGroup(var2); // L: 365
		}
	} // L: 366

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "200899507"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 369
		int var2 = this.groupNameHashTable.get(class343.hashString(var1)); // L: 370
		return this.groupLoadPercent(var2); // L: 371
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-51"
	)
	static final void method6439(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8688
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8689
				Client.field717[var4] = true;
			}
		}

	} // L: 8691
}
