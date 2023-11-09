import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -889058105
	)
	static int field4273;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2080689493
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("af")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("av")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("az")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("ak")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("aa")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("au")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("ai")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bw")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bq")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1475513601
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bh")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bc")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4273 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1212333650"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 132

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-41"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 218

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "76"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 188 189
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1606777499"
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
		Buffer var15 = new Buffer(WorldMapSection1.decompressBytes(var1)); // L: 52
		var5 = var15.readUnsignedByte(); // L: 53
		if (var5 >= 5 && var5 <= 7) { // L: 54
			if (var5 >= 6) { // L: 55
				var15.readInt(); // L: 56
			}

			var6 = var15.readUnsignedByte(); // L: 59
			if (var5 >= 7) { // L: 60
				this.groupCount = var15.method9194();
			} else {
				this.groupCount = var15.readUnsignedShort(); // L: 61
			}

			int var7 = 0; // L: 62
			int var8 = -1; // L: 63
			this.groupIds = new int[this.groupCount]; // L: 64
			int var9;
			if (var5 >= 7) { // L: 65
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 66
					this.groupIds[var9] = var7 += var15.method9194(); // L: 67
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
						var14 = this.fileIds[var10][var13] = var7 += var15.method9194(); // L: 99
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1976576861"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 135
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II[IB)[B",
		garbageValue = "1"
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

			byte[] var5 = class25.method332(this.files[var1][var2], false); // L: 148
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 149
			}

			return var5; // L: 150
		} else {
			return null;
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1020201866"
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "865009962"
	)
	public boolean method6728(int var1) {
		if (this.files.length == 1) { // L: 163
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 164
		} else {
			throw new RuntimeException(); // L: 165
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "814435511"
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1880649479"
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

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "228744894"
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

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-2143193320"
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

			byte[] var4 = class25.method332(this.files[var1][var2], false); // L: 208
			return var4; // L: 209
		} else {
			return null;
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "326891134"
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

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1342409383"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 221 222 224
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 228 229
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012841756"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 233
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-22600965"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 237
			this.groups[var1] = null;
		}

	} // L: 238

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1322479564"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 241
			this.files[var1][var2] = null;
		}

	} // L: 242

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 245
			if (this.files[var1] != null) { // L: 246
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 247
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 250

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "-51"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) { // L: 253
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 254
			int[] var4 = this.fileIds[var1]; // L: 255
			Object[] var5 = this.files[var1]; // L: 256
			boolean var6 = true; // L: 257

			for (int var7 = 0; var7 < var3; ++var7) { // L: 258
				if (var5[var4[var7]] == null) { // L: 259
					var6 = false; // L: 260
					break;
				}
			}

			if (var6) { // L: 264
				return true;
			} else {
				byte[] var21;
				if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) { // L: 266
					var21 = class25.method332(this.groups[var1], true); // L: 267
					Buffer var8 = new Buffer(var21); // L: 268
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 269
				} else {
					var21 = class25.method332(this.groups[var1], false); // L: 271
				}

				byte[] var24 = WorldMapSection1.decompressBytes(var21); // L: 274
				if (this.releaseGroups) { // L: 311
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 312
					int var9 = var24.length; // L: 313
					--var9;
					int var10 = var24[var9] & 255; // L: 314
					var9 -= var10 * var3 * 4; // L: 315
					Buffer var11 = new Buffer(var24); // L: 316
					int[] var12 = new int[var3]; // L: 317
					var11.offset = var9; // L: 318

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 319
						var14 = 0; // L: 320

						for (var15 = 0; var15 < var3; ++var15) { // L: 321
							var14 += var11.readInt(); // L: 322
							var12[var15] += var14; // L: 323
						}
					}

					byte[][] var22 = new byte[var3][]; // L: 326

					for (var14 = 0; var14 < var3; ++var14) { // L: 327
						var22[var14] = new byte[var12[var14]]; // L: 328
						var12[var14] = 0; // L: 329
					}

					var11.offset = var9; // L: 331
					var14 = 0; // L: 332

					int var17;
					for (var15 = 0; var15 < var10; ++var15) { // L: 333
						int var23 = 0; // L: 334

						for (var17 = 0; var17 < var3; ++var17) { // L: 335
							var23 += var11.readInt(); // L: 336
							System.arraycopy(var24, var14, var22[var17], var12[var17], var23); // L: 337
							var12[var17] += var23; // L: 338
							var14 += var23; // L: 339
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 342
						if (!this.shallowFiles) { // L: 343
							var17 = var4[var15]; // L: 345
							byte[] var19 = var22[var15]; // L: 347
							Object var18;
							if (var19 == null) { // L: 349
								var18 = null; // L: 350
							} else if (var19.length > 136) { // L: 353
								DirectByteArrayCopier var20 = new DirectByteArrayCopier(); // L: 355
								var20.set(var19); // L: 356
								var18 = var20; // L: 357
							} else {
								var18 = var19; // L: 371
							}

							var5[var17] = var18; // L: 373
						} else {
							var5[var4[var15]] = var22[var15]; // L: 375
						}
					}
				} else if (!this.shallowFiles) { // L: 379
					var5[var4[0]] = class176.method3489(var24, false);
				} else {
					var5[var4[0]] = var24; // L: 380
				}

				return true; // L: 382
			}
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "92"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 386
		return this.groupNameHashTable.get(class139.hashString(var1)); // L: 387
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)I",
		garbageValue = "-96"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 391
		return this.fileNameHashTables[var1].get(class139.hashString(var2)); // L: 392
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "60"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 396
		var2 = var2.toLowerCase(); // L: 397
		int var3 = this.groupNameHashTable.get(class139.hashString(var1)); // L: 398
		if (var3 < 0) { // L: 399
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class139.hashString(var2)); // L: 400
			return var4 >= 0; // L: 401
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B",
		garbageValue = "56"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 406
		var2 = var2.toLowerCase(); // L: 407
		int var3 = this.groupNameHashTable.get(class139.hashString(var1)); // L: 408
		int var4 = this.fileNameHashTables[var3].get(class139.hashString(var2)); // L: 409
		return this.takeFile(var3, var4); // L: 410
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-962205666"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 414
		var2 = var2.toLowerCase(); // L: 415
		int var3 = this.groupNameHashTable.get(class139.hashString(var1)); // L: 416
		int var4 = this.fileNameHashTables[var3].get(class139.hashString(var2)); // L: 417
		return this.tryLoadFile(var3, var4); // L: 418
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-42227769"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 422
		int var2 = this.groupNameHashTable.get(class139.hashString(var1)); // L: 423
		return this.tryLoadGroup(var2); // L: 424
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-161664701"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 428
		int var2 = this.groupNameHashTable.get(class139.hashString(var1)); // L: 429
		if (var2 >= 0) { // L: 430
			this.loadRegionFromGroup(var2); // L: 431
		}
	} // L: 432

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 435
		int var2 = this.groupNameHashTable.get(class139.hashString(var1)); // L: 436
		return this.groupLoadPercent(var2); // L: 437
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-33"
	)
	public static int method6810(int var0) {
		return (var0 & class496.field4999) - 1; // L: 26
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1593998080"
	)
	static boolean method6809() {
		return (Client.drawPlayerNames & 4) != 0; // L: 5047
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "49277"
	)
	static final void method6807() {
		Client.field685 = Client.cycleCntr; // L: 12383
		class47.FriendsChatManager_inFriendsChat = true; // L: 12384
	} // L: 12385
}
