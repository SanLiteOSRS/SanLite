import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -584506529
	)
	static int field4339;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -309203221
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("aw")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("aq")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("at")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("af")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("ad")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bn")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bk")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[Lvr;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bd")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("be")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1175049071
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bz")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bb")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4339 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1737906888"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 123

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 209

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "177421131"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 179 180
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "269560048"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var2 = ArchiveDisk.method8262(var1, 0, var3); // L: 40
		this.hash = var2; // L: 42
		Buffer var4 = new Buffer(class372.decompressBytes(var1)); // L: 43
		int var5 = var4.readUnsignedByte(); // L: 44
		if (var5 >= 5 && var5 <= 7) { // L: 45
			if (var5 >= 6) { // L: 46
				var4.readInt(); // L: 47
			}

			int var6 = var4.readUnsignedByte(); // L: 50
			if (var5 >= 7) { // L: 51
				this.groupCount = var4.method9222();
			} else {
				this.groupCount = var4.readUnsignedShort(); // L: 52
			}

			int var7 = 0; // L: 53
			int var8 = -1; // L: 54
			this.groupIds = new int[this.groupCount]; // L: 55
			int var9;
			if (var5 >= 7) { // L: 56
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 57
					this.groupIds[var9] = var7 += var4.method9222(); // L: 58
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
						var14 = this.fileIds[var10][var13] = var7 += var4.method9222(); // L: 90
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1711310441"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 126
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-1302021436"
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

			byte[] var5 = class135.method3073(this.files[var1][var2], false); // L: 139
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 140
			}

			return var5; // L: 141
		} else {
			return null;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-919359930"
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-855081287"
	)
	public boolean method6944(int var1) {
		if (this.files.length == 1) { // L: 154
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 155
		} else {
			throw new RuntimeException(); // L: 156
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1482943907"
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "2123852000"
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1658357673"
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

			byte[] var4 = class135.method3073(this.files[var1][var2], false); // L: 199
			return var4; // L: 200
		} else {
			return null;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-2100873000"
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "114"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 212 213 215
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "5"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 219 220
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "325433573"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 224
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-28003"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 228
			this.groups[var1] = null;
		}

	} // L: 229

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-334571913"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 232
			this.files[var1][var2] = null;
		}

	} // L: 233

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	public void method6919() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 236
			if (this.files[var1] != null) { // L: 237
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 238
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 241

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "4"
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
				byte[] var21;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 257
					var21 = class135.method3073(this.groups[var1], false); // L: 262
				} else {
					var21 = class135.method3073(this.groups[var1], true); // L: 258
					Buffer var8 = new Buffer(var21); // L: 259
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 260
				}

				byte[] var25 = class372.decompressBytes(var21); // L: 265
				if (this.releaseGroups) { // L: 284
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) { // L: 285
					int var22 = var25.length; // L: 286
					--var22; // L: 287
					var10 = var25[var22] & 255;
					var22 -= var10 * var3 * 4; // L: 288
					Buffer var11 = new Buffer(var25); // L: 289
					int[] var12 = new int[var3]; // L: 290
					var11.offset = var22; // L: 291

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 292
						var14 = 0; // L: 293

						for (var15 = 0; var15 < var3; ++var15) { // L: 294
							var14 += var11.readInt(); // L: 295
							var12[var15] += var14; // L: 296
						}
					}

					byte[][] var23 = new byte[var3][]; // L: 299

					for (var14 = 0; var14 < var3; ++var14) { // L: 300
						var23[var14] = new byte[var12[var14]]; // L: 301
						var12[var14] = 0; // L: 302
					}

					var11.offset = var22; // L: 304
					var14 = 0; // L: 305

					int var17;
					for (var15 = 0; var15 < var10; ++var15) { // L: 306
						int var24 = 0; // L: 307

						for (var17 = 0; var17 < var3; ++var17) { // L: 308
							var24 += var11.readInt(); // L: 309
							System.arraycopy(var25, var14, var23[var17], var12[var17], var24); // L: 310
							var12[var17] += var24; // L: 311
							var14 += var24; // L: 312
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 315
						if (!this.shallowFiles) { // L: 316
							var17 = var4[var15]; // L: 318
							byte[] var19 = var23[var15]; // L: 320
							Object var18;
							if (var19 == null) { // L: 322
								var18 = null; // L: 323
							} else if (var19.length > 136) { // L: 326
								DirectByteArrayCopier var20 = new DirectByteArrayCopier(); // L: 328
								var20.set(var19); // L: 329
								var18 = var20; // L: 330
							} else {
								var18 = var19; // L: 344
							}

							var5[var17] = var18; // L: 346
						} else {
							var5[var4[var15]] = var23[var15]; // L: 348
						}
					}
				} else if (!this.shallowFiles) { // L: 352
					var10 = var4[0]; // L: 354
					Object var26;
					if (var25 == null) { // L: 357
						var26 = null; // L: 358
					} else if (var25.length > 136) { // L: 361
						DirectByteArrayCopier var27 = new DirectByteArrayCopier(); // L: 363
						var27.set(var25); // L: 364
						var26 = var27; // L: 365
					} else {
						var26 = var25; // L: 379
					}

					var5[var10] = var26; // L: 381
				} else {
					var5[var4[0]] = var25; // L: 383
				}

				return true; // L: 385
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "14942"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 389
		return this.groupNameHashTable.get(EnumComposition.hashString(var1)); // L: 390
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "261034000"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 394
		return this.fileNameHashTables[var1].get(EnumComposition.hashString(var2)); // L: 395
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "873049159"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 399
		var2 = var2.toLowerCase(); // L: 400
		int var3 = this.groupNameHashTable.get(EnumComposition.hashString(var1)); // L: 401
		if (var3 < 0) { // L: 402
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(EnumComposition.hashString(var2)); // L: 403
			return var4 >= 0; // L: 404
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;S)[B",
		garbageValue = "-22373"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 409
		var2 = var2.toLowerCase(); // L: 410
		int var3 = this.groupNameHashTable.get(EnumComposition.hashString(var1)); // L: 411
		int var4 = this.fileNameHashTables[var3].get(EnumComposition.hashString(var2)); // L: 412
		return this.takeFile(var3, var4); // L: 413
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-227874487"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 417
		var2 = var2.toLowerCase(); // L: 418
		int var3 = this.groupNameHashTable.get(EnumComposition.hashString(var1)); // L: 419
		int var4 = this.fileNameHashTables[var3].get(EnumComposition.hashString(var2)); // L: 420
		return this.tryLoadFile(var3, var4); // L: 421
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1792346501"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 425
		int var2 = this.groupNameHashTable.get(EnumComposition.hashString(var1)); // L: 426
		return this.tryLoadGroup(var2); // L: 427
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-24"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 431
		int var2 = this.groupNameHashTable.get(EnumComposition.hashString(var1)); // L: 432
		if (var2 >= 0) { // L: 433
			this.loadRegionFromGroup(var2); // L: 434
		}
	} // L: 435

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-108"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 438
		int var2 = this.groupNameHashTable.get(EnumComposition.hashString(var1)); // L: 439
		return this.groupLoadPercent(var2); // L: 440
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1888101922"
	)
	public static int method6972(int var0) {
		return var0 >>> 12; // L: 18
	}
}
