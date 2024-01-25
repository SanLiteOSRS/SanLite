import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ow")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -496791129
	)
	static int field4364;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 351155213
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("ab")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("ah")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("ac")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("al")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("at")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bj")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bd")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bt")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("br")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 39458225
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bn")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("by")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4364 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-402789424"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 132

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1009267633"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 218

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1305673050"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 188 189
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1274631732"
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
		Buffer var15 = new Buffer(UserComparator6.decompressBytes(var1)); // L: 52
		var5 = var15.readUnsignedByte(); // L: 53
		if (var5 >= 5 && var5 <= 7) { // L: 54
			if (var5 >= 6) { // L: 55
				var15.readInt(); // L: 56
			}

			var6 = var15.readUnsignedByte(); // L: 59
			if (var5 >= 7) { // L: 60
				this.groupCount = var15.method9405();
			} else {
				this.groupCount = var15.readUnsignedShort(); // L: 61
			}

			int var7 = 0; // L: 62
			int var8 = -1; // L: 63
			this.groupIds = new int[this.groupCount]; // L: 64
			int var9;
			if (var5 >= 7) { // L: 65
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 66
					this.groupIds[var9] = var7 += var15.method9405(); // L: 67
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
						var14 = this.fileIds[var10][var13] = var7 += var15.method9405(); // L: 99
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "41"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 135
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "805644799"
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

			byte[] var5 = class195.method3837(this.files[var1][var2], false); // L: 148
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 149
			}

			return var5; // L: 150
		} else {
			return null;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-92"
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
		descriptor = "(II)Z",
		garbageValue = "267636877"
	)
	public boolean method7033(int var1) {
		if (this.files.length == 1) { // L: 163
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 164
		} else {
			throw new RuntimeException(); // L: 165
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "5"
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1299701809"
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "2141631018"
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1888386965"
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

			byte[] var4 = class195.method3837(this.files[var1][var2], false); // L: 208
			return var4; // L: 209
		} else {
			return null;
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "979607819"
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "10"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 221 222 224
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1304539629"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 228 229
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-712092596"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 233
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1886170840"
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
		garbageValue = "-1842795768"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 241
			this.files[var1][var2] = null;
		}

	} // L: 242

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "83"
	)
	public void method7046() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 245
			if (this.files[var1] != null) { // L: 246
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 247
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 250

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "-43"
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
				byte[] var18;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 266
					var18 = class195.method3837(this.groups[var1], false); // L: 271
				} else {
					var18 = class195.method3837(this.groups[var1], true); // L: 267
					Buffer var8 = new Buffer(var18); // L: 268
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 269
				}

				byte[] var20 = UserComparator6.decompressBytes(var18); // L: 274
				if (this.releaseGroups) { // L: 311
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 312
					int var9 = var20.length; // L: 313
					--var9; // L: 314
					int var10 = var20[var9] & 255;
					var9 -= var3 * var10 * 4; // L: 315
					Buffer var11 = new Buffer(var20); // L: 316
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

					byte[][] var19 = new byte[var3][]; // L: 326

					for (var14 = 0; var14 < var3; ++var14) { // L: 327
						var19[var14] = new byte[var12[var14]]; // L: 328
						var12[var14] = 0; // L: 329
					}

					var11.offset = var9; // L: 331
					var14 = 0; // L: 332

					for (var15 = 0; var15 < var10; ++var15) { // L: 333
						int var16 = 0; // L: 334

						for (int var17 = 0; var17 < var3; ++var17) { // L: 335
							var16 += var11.readInt(); // L: 336
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 337
							var12[var17] += var16; // L: 338
							var14 += var16; // L: 339
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 342
						if (!this.shallowFiles) { // L: 343
							var5[var4[var15]] = class159.method3462(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 344
						}
					}
				} else if (!this.shallowFiles) { // L: 348
					var5[var4[0]] = class159.method3462(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 349
				}

				return true; // L: 351
			}
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-25"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 355
		return this.groupNameHashTable.get(class6.hashString(var1)); // L: 356
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "944082683"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 360
		return this.fileNameHashTables[var1].get(class6.hashString(var2)); // L: 361
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "2104571622"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 365
		var2 = var2.toLowerCase(); // L: 366
		int var3 = this.groupNameHashTable.get(class6.hashString(var1)); // L: 367
		if (var3 < 0) { // L: 368
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class6.hashString(var2)); // L: 369
			return var4 >= 0; // L: 370
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "683173749"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 375
		var2 = var2.toLowerCase(); // L: 376
		int var3 = this.groupNameHashTable.get(class6.hashString(var1)); // L: 377
		int var4 = this.fileNameHashTables[var3].get(class6.hashString(var2)); // L: 378
		return this.takeFile(var3, var4); // L: 379
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1848326104"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 383
		var2 = var2.toLowerCase(); // L: 384
		int var3 = this.groupNameHashTable.get(class6.hashString(var1)); // L: 385
		int var4 = this.fileNameHashTables[var3].get(class6.hashString(var2)); // L: 386
		return this.tryLoadFile(var3, var4); // L: 387
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "870922471"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 391
		int var2 = this.groupNameHashTable.get(class6.hashString(var1)); // L: 392
		return this.tryLoadGroup(var2); // L: 393
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-114"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 397
		int var2 = this.groupNameHashTable.get(class6.hashString(var1)); // L: 398
		if (var2 >= 0) { // L: 399
			this.loadRegionFromGroup(var2); // L: 400
		}
	} // L: 401

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "138546846"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 404
		int var2 = this.groupNameHashTable.get(class6.hashString(var1)); // L: 405
		return this.groupLoadPercent(var2); // L: 406
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "45"
	)
	static int method7038(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2859
			UserComparator6.Interpreter_intStackSize -= 2; // L: 2860
			var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2861
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2862
			EnumComposition var10 = class10.getEnum(var3); // L: 2863
			if (var10.outputType != 's') { // L: 2864
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2865
				if (var9 == var10.keys[var6]) { // L: 2866
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2867
					var10 = null; // L: 2868
					break;
				}
			}

			if (var10 != null) { // L: 2872
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2873
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2875
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2901
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 2902
				EnumComposition var4 = class10.getEnum(var3); // L: 2903
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.size(); // L: 2904
				return 1; // L: 2905
			} else {
				return 2; // L: 2907
			}
		} else {
			UserComparator6.Interpreter_intStackSize -= 4; // L: 2876
			var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 2877
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 2878
			int var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 2879
			var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3]; // L: 2880
			EnumComposition var7 = class10.getEnum(var5); // L: 2881
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2882
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2887
					if (var6 == var7.keys[var8]) { // L: 2888
						if (var9 == 115) { // L: 2889
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2890
						}

						var7 = null; // L: 2891
						break;
					}
				}

				if (var7 != null) { // L: 2895
					if (var9 == 115) { // L: 2896
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2897
					}
				}

				return 1; // L: 2899
			} else {
				if (var9 == 115) { // L: 2883
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 2884
				}

				return 1; // L: 2885
			}
		}
	}
}
