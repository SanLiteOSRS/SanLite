import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 170709657
	)
	static int field4303;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -121591717
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("aw")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("ae")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("ag")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("ad")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("af")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("be")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bd")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "[Lvh;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bi")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bv")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1759179805
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("ba")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bm")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4303 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "606874642"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 123

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-412384319"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 209

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-788412100"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 179 180
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-18383412"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var2 = class174.method3540(var1, 0, var3); // L: 40
		this.hash = var2; // L: 42
		Buffer var4 = new Buffer(class30.decompressBytes(var1)); // L: 43
		int var5 = var4.readUnsignedByte(); // L: 44
		if (var5 >= 5 && var5 <= 7) { // L: 45
			if (var5 >= 6) { // L: 46
				var4.readInt(); // L: 47
			}

			int var6 = var4.readUnsignedByte(); // L: 50
			if (var5 >= 7) { // L: 51
				this.groupCount = var4.method9279();
			} else {
				this.groupCount = var4.readUnsignedShort(); // L: 52
			}

			int var7 = 0; // L: 53
			int var8 = -1; // L: 54
			this.groupIds = new int[this.groupCount]; // L: 55
			int var9;
			if (var5 >= 7) { // L: 56
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 57
					this.groupIds[var9] = var7 += var4.method9279(); // L: 58
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
						var14 = this.fileIds[var10][var13] = var7 += var4.method9279(); // L: 90
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

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "946380186"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 126
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "1812200763"
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

			byte[] var5 = class128.method3079(this.files[var1][var2], false); // L: 139
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 140
			}

			return var5; // L: 141
		} else {
			return null;
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1107473294"
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

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-544854529"
	)
	public boolean method6954(int var1) {
		if (this.files.length == 1) { // L: 154
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 155
		} else {
			throw new RuntimeException(); // L: 156
		}
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "456199859"
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "127"
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "30"
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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "-4"
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

			byte[] var4 = class128.method3079(this.files[var1][var2], false); // L: 199
			return var4; // L: 200
		} else {
			return null;
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1549556992"
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

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1026301706"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 212 213 215
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1471865818"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 219 220
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1806746664"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 224
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 228
			this.groups[var1] = null;
		}

	} // L: 229

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2080028111"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 232
			this.files[var1][var2] = null;
		}

	} // L: 233

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	public void method7027() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 236
			if (this.files[var1] != null) { // L: 237
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 238
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 241

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "19"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) { // L: 244
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 245
			int[] var4 = this.fileIds[var1]; // L: 246
			Object[] var5 = this.files[var1]; // L: 247
			boolean var6 = true; // L: 248

			for (int var7 = 0; var7 < var3; ++var7) { // L: 249
				if (var5[var4[var7]] == null) { // L: 250
					var6 = false; // L: 251
					break;
				}
			}

			if (var6) { // L: 255
				return true;
			} else {
				byte[] var18;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 257
					var18 = class128.method3079(this.groups[var1], false); // L: 262
				} else {
					var18 = class128.method3079(this.groups[var1], true); // L: 258
					Buffer var8 = new Buffer(var18); // L: 259
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 260
				}

				byte[] var20 = class30.decompressBytes(var18); // L: 265
				if (this.releaseGroups) { // L: 284
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 285
					int var9 = var20.length; // L: 286
					--var9;
					int var10 = var20[var9] & 255; // L: 287
					var9 -= var3 * var10 * 4; // L: 288
					Buffer var11 = new Buffer(var20); // L: 289
					int[] var12 = new int[var3]; // L: 290
					var11.offset = var9; // L: 291

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 292
						var14 = 0; // L: 293

						for (var15 = 0; var15 < var3; ++var15) { // L: 294
							var14 += var11.readInt(); // L: 295
							var12[var15] += var14; // L: 296
						}
					}

					byte[][] var19 = new byte[var3][]; // L: 299

					for (var14 = 0; var14 < var3; ++var14) { // L: 300
						var19[var14] = new byte[var12[var14]]; // L: 301
						var12[var14] = 0; // L: 302
					}

					var11.offset = var9; // L: 304
					var14 = 0; // L: 305

					for (var15 = 0; var15 < var10; ++var15) { // L: 306
						int var16 = 0; // L: 307

						for (int var17 = 0; var17 < var3; ++var17) { // L: 308
							var16 += var11.readInt(); // L: 309
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 310
							var12[var17] += var16; // L: 311
							var14 += var16; // L: 312
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 315
						if (!this.shallowFiles) { // L: 316
							var5[var4[var15]] = VarcInt.method3598(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 317
						}
					}
				} else if (!this.shallowFiles) { // L: 321
					var5[var4[0]] = VarcInt.method3598(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 322
				}

				return true; // L: 324
			}
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1919401274"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 328
		return this.groupNameHashTable.get(class150.hashString(var1)); // L: 329
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "-34343914"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 333
		return this.fileNameHashTables[var1].get(class150.hashString(var2)); // L: 334
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;S)Z",
		garbageValue = "245"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 338
		var2 = var2.toLowerCase(); // L: 339
		int var3 = this.groupNameHashTable.get(class150.hashString(var1)); // L: 340
		if (var3 < 0) { // L: 341
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class150.hashString(var2)); // L: 342
			return var4 >= 0; // L: 343
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1936244729"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 348
		var2 = var2.toLowerCase(); // L: 349
		int var3 = this.groupNameHashTable.get(class150.hashString(var1)); // L: 350
		int var4 = this.fileNameHashTables[var3].get(class150.hashString(var2)); // L: 351
		return this.takeFile(var3, var4); // L: 352
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "100"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 356
		var2 = var2.toLowerCase(); // L: 357
		int var3 = this.groupNameHashTable.get(class150.hashString(var1)); // L: 358
		int var4 = this.fileNameHashTables[var3].get(class150.hashString(var2)); // L: 359
		return this.tryLoadFile(var3, var4); // L: 360
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1281128467"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 364
		int var2 = this.groupNameHashTable.get(class150.hashString(var1)); // L: 365
		return this.tryLoadGroup(var2); // L: 366
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1287445108"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 370
		int var2 = this.groupNameHashTable.get(class150.hashString(var1)); // L: 371
		if (var2 >= 0) { // L: 372
			this.loadRegionFromGroup(var2); // L: 373
		}
	} // L: 374

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1550662505"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 377
		int var2 = this.groupNameHashTable.get(class150.hashString(var1)); // L: 378
		return this.groupLoadPercent(var2); // L: 379
	}
}
