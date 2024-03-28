import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1981468547
	)
	static int field4417;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -913359659
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("aa")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("aq")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("ac")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("ae")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("ak")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bp")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bz")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bf")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("be")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -2084852237
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bo")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bx")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor();
		field4417 = 0;
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "131061325"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 123

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-682763266"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 209

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1246061272"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 179 180
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-66"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var2 = class132.method3058(var1, 0, var3); // L: 40
		this.hash = var2; // L: 42
		Buffer var4 = new Buffer(GrandExchangeOfferUnitPriceComparator.decompressBytes(var1)); // L: 43
		int var5 = var4.readUnsignedByte(); // L: 44
		if (var5 >= 5 && var5 <= 7) { // L: 45
			if (var5 >= 6) { // L: 46
				var4.readInt(); // L: 47
			}

			int var6 = var4.readUnsignedByte(); // L: 50
			if (var5 >= 7) { // L: 51
				this.groupCount = var4.method9483();
			} else {
				this.groupCount = var4.readUnsignedShort(); // L: 52
			}

			int var7 = 0; // L: 53
			int var8 = -1; // L: 54
			this.groupIds = new int[this.groupCount]; // L: 55
			int var9;
			if (var5 >= 7) { // L: 56
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 57
					this.groupIds[var9] = var7 += var4.method9483(); // L: 58
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
						var14 = this.fileIds[var10][var13] = var7 += var4.method9483(); // L: 90
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "17838320"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 126
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II[IB)[B",
		garbageValue = "0"
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

			byte[] var5 = class352.method6813(this.files[var1][var2], false); // L: 139
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 140
			}

			return var5; // L: 141
		} else {
			return null;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "250033209"
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1456885890"
	)
	public boolean method6957(int var1) {
		if (this.files.length == 1) { // L: 154
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 155
		} else {
			throw new RuntimeException(); // L: 156
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1491025434"
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2005164598"
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "867303792"
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIS)[B",
		garbageValue = "26569"
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

			byte[] var4 = class352.method6813(this.files[var1][var2], false); // L: 199
			return var4; // L: 200
		} else {
			return null;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1451551845"
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-3"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 212 213 215
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-267710612"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 219 220
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 224
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-204118948"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 228
			this.groups[var1] = null;
		}

	} // L: 229

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-70083928"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 232
			this.files[var1][var2] = null;
		}

	} // L: 233

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2029224295"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 236
			if (this.files[var1] != null) { // L: 237
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 238
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 241

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "-1087669161"
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
					var21 = class352.method6813(this.groups[var1], false); // L: 262
				} else {
					var21 = class352.method6813(this.groups[var1], true); // L: 258
					Buffer var8 = new Buffer(var21); // L: 259
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 260
				}

				byte[] var25 = GrandExchangeOfferUnitPriceComparator.decompressBytes(var21); // L: 265
				if (this.releaseGroups) { // L: 283
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) { // L: 284
					int var22 = var25.length; // L: 285
					--var22; // L: 286
					var10 = var25[var22] & 255;
					var22 -= var3 * var10 * 4; // L: 287
					Buffer var11 = new Buffer(var25); // L: 288
					int[] var12 = new int[var3]; // L: 289
					var11.offset = var22; // L: 290

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 291
						var14 = 0; // L: 292

						for (var15 = 0; var15 < var3; ++var15) { // L: 293
							var14 += var11.readInt(); // L: 294
							var12[var15] += var14; // L: 295
						}
					}

					byte[][] var23 = new byte[var3][]; // L: 298

					for (var14 = 0; var14 < var3; ++var14) { // L: 299
						var23[var14] = new byte[var12[var14]]; // L: 300
						var12[var14] = 0; // L: 301
					}

					var11.offset = var22; // L: 303
					var14 = 0; // L: 304

					int var17;
					for (var15 = 0; var15 < var10; ++var15) { // L: 305
						int var24 = 0; // L: 306

						for (var17 = 0; var17 < var3; ++var17) { // L: 307
							var24 += var11.readInt(); // L: 308
							System.arraycopy(var25, var14, var23[var17], var12[var17], var24); // L: 309
							var12[var17] += var24; // L: 310
							var14 += var24; // L: 311
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 314
						if (!this.shallowFiles) { // L: 315
							var17 = var4[var15]; // L: 317
							byte[] var19 = var23[var15]; // L: 319
							Object var18;
							if (var19 == null) { // L: 321
								var18 = null; // L: 322
							} else if (var19.length > 136) { // L: 325
								DirectByteArrayCopier var20 = new DirectByteArrayCopier(); // L: 327
								var20.set(var19); // L: 328
								var18 = var20; // L: 329
							} else {
								var18 = var19; // L: 343
							}

							var5[var17] = var18; // L: 345
						} else {
							var5[var4[var15]] = var23[var15]; // L: 347
						}
					}
				} else if (!this.shallowFiles) { // L: 351
					var10 = var4[0]; // L: 353
					Object var26;
					if (var25 == null) { // L: 356
						var26 = null; // L: 357
					} else if (var25.length > 136) { // L: 360
						DirectByteArrayCopier var27 = new DirectByteArrayCopier(); // L: 362
						var27.set(var25); // L: 363
						var26 = var27; // L: 364
					} else {
						var26 = var25; // L: 378
					}

					var5[var10] = var26; // L: 380
				} else {
					var5[var4[0]] = var25; // L: 382
				}

				return true; // L: 384
			}
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "12452"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 388
		return this.groupNameHashTable.get(class103.hashString(var1)); // L: 389
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)I",
		garbageValue = "-41"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 393
		return this.fileNameHashTables[var1].get(class103.hashString(var2)); // L: 394
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "1973744787"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 398
		var2 = var2.toLowerCase(); // L: 399
		int var3 = this.groupNameHashTable.get(class103.hashString(var1)); // L: 400
		if (var3 < 0) { // L: 401
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class103.hashString(var2)); // L: 402
			return var4 >= 0; // L: 403
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B",
		garbageValue = "8"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 408
		var2 = var2.toLowerCase(); // L: 409
		int var3 = this.groupNameHashTable.get(class103.hashString(var1)); // L: 410
		int var4 = this.fileNameHashTables[var3].get(class103.hashString(var2)); // L: 411
		return this.takeFile(var3, var4); // L: 412
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "46"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 416
		var2 = var2.toLowerCase(); // L: 417
		int var3 = this.groupNameHashTable.get(class103.hashString(var1)); // L: 418
		int var4 = this.fileNameHashTables[var3].get(class103.hashString(var2)); // L: 419
		return this.tryLoadFile(var3, var4); // L: 420
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-103604135"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 424
		int var2 = this.groupNameHashTable.get(class103.hashString(var1)); // L: 425
		return this.tryLoadGroup(var2); // L: 426
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-28352"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 430
		int var2 = this.groupNameHashTable.get(class103.hashString(var1)); // L: 431
		if (var2 >= 0) { // L: 432
			this.loadRegionFromGroup(var2); // L: 433
		}
	} // L: 434

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "20"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 437
		int var2 = this.groupNameHashTable.get(class103.hashString(var1)); // L: 438
		return this.groupLoadPercent(var2); // L: 439
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
		garbageValue = "15"
	)
	public static String method7032(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 17
			return "";
		} else if (var2 == 1) { // L: 18
			CharSequence var10 = var0[var1]; // L: 19
			return var10 == null ? "null" : var10.toString(); // L: 20 21
		} else {
			int var3 = var2 + var1; // L: 23
			int var4 = 0; // L: 24

			for (int var5 = var1; var5 < var3; ++var5) { // L: 25
				CharSequence var9 = var0[var5]; // L: 26
				if (var9 == null) { // L: 27
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 28
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 30

			for (int var6 = var1; var6 < var3; ++var6) { // L: 31
				CharSequence var7 = var0[var6]; // L: 32
				if (var7 == null) { // L: 33
					var8.append("null");
				} else {
					var8.append(var7); // L: 34
				}
			}

			return var8.toString(); // L: 36
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-178003947"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class243.field2620.method6286(var1, var2); // L: 10170
		if (var5 != null) { // L: 10171
			if (var5.onOp != null) { // L: 10172
				ScriptEvent var6 = new ScriptEvent(); // L: 10173
				var6.widget = var5; // L: 10174
				var6.opIndex = var0; // L: 10175
				var6.targetName = var4; // L: 10176
				var6.args = var5.onOp; // L: 10177
				AbstractWorldMapData.runScriptEvent(var6); // L: 10178
			}

			boolean var11 = true; // L: 10180
			if (var5.contentType > 0) { // L: 10181
				var11 = PacketWriter.method2801(var5);
			}

			if (var11) { // L: 10182
				int var8 = class33.getWidgetFlags(var5); // L: 10184
				int var9 = var0 - 1; // L: 10185
				boolean var7 = (var8 >> var9 + 1 & 1) != 0; // L: 10187
				if (var7) { // L: 10189
					PacketBufferNode var10;
					if (var0 == 1) { // L: 10192
						var10 = class425.getPacketBufferNode(ClientPacket.field3218, Client.packetWriter.isaacCipher); // L: 10194
						var10.packetBuffer.writeIntME(var1); // L: 10195
						var10.packetBuffer.writeShort(var2); // L: 10196
						var10.packetBuffer.writeShort(var3); // L: 10197
						Client.packetWriter.addNode(var10); // L: 10198
					}

					if (var0 == 2) { // L: 10200
						var10 = class425.getPacketBufferNode(ClientPacket.field3293, Client.packetWriter.isaacCipher); // L: 10202
						var10.packetBuffer.writeIntME(var1); // L: 10203
						var10.packetBuffer.writeShort(var2); // L: 10204
						var10.packetBuffer.writeShort(var3); // L: 10205
						Client.packetWriter.addNode(var10); // L: 10206
					}

					if (var0 == 3) { // L: 10208
						var10 = class425.getPacketBufferNode(ClientPacket.field3258, Client.packetWriter.isaacCipher); // L: 10210
						var10.packetBuffer.writeIntME(var1); // L: 10211
						var10.packetBuffer.writeShort(var2); // L: 10212
						var10.packetBuffer.writeShort(var3); // L: 10213
						Client.packetWriter.addNode(var10); // L: 10214
					}

					if (var0 == 4) { // L: 10216
						var10 = class425.getPacketBufferNode(ClientPacket.field3249, Client.packetWriter.isaacCipher); // L: 10218
						var10.packetBuffer.writeIntME(var1); // L: 10219
						var10.packetBuffer.writeShort(var2); // L: 10220
						var10.packetBuffer.writeShort(var3); // L: 10221
						Client.packetWriter.addNode(var10); // L: 10222
					}

					if (var0 == 5) { // L: 10224
						var10 = class425.getPacketBufferNode(ClientPacket.field3257, Client.packetWriter.isaacCipher); // L: 10226
						var10.packetBuffer.writeIntME(var1); // L: 10227
						var10.packetBuffer.writeShort(var2); // L: 10228
						var10.packetBuffer.writeShort(var3); // L: 10229
						Client.packetWriter.addNode(var10); // L: 10230
					}

					if (var0 == 6) { // L: 10232
						var10 = class425.getPacketBufferNode(ClientPacket.field3223, Client.packetWriter.isaacCipher); // L: 10234
						var10.packetBuffer.writeIntME(var1); // L: 10235
						var10.packetBuffer.writeShort(var2); // L: 10236
						var10.packetBuffer.writeShort(var3); // L: 10237
						Client.packetWriter.addNode(var10); // L: 10238
					}

					if (var0 == 7) { // L: 10240
						var10 = class425.getPacketBufferNode(ClientPacket.field3222, Client.packetWriter.isaacCipher); // L: 10242
						var10.packetBuffer.writeIntME(var1); // L: 10243
						var10.packetBuffer.writeShort(var2); // L: 10244
						var10.packetBuffer.writeShort(var3); // L: 10245
						Client.packetWriter.addNode(var10); // L: 10246
					}

					if (var0 == 8) { // L: 10248
						var10 = class425.getPacketBufferNode(ClientPacket.field3217, Client.packetWriter.isaacCipher); // L: 10250
						var10.packetBuffer.writeIntME(var1); // L: 10251
						var10.packetBuffer.writeShort(var2); // L: 10252
						var10.packetBuffer.writeShort(var3); // L: 10253
						Client.packetWriter.addNode(var10); // L: 10254
					}

					if (var0 == 9) { // L: 10256
						var10 = class425.getPacketBufferNode(ClientPacket.field3290, Client.packetWriter.isaacCipher); // L: 10258
						var10.packetBuffer.writeIntME(var1); // L: 10259
						var10.packetBuffer.writeShort(var2); // L: 10260
						var10.packetBuffer.writeShort(var3); // L: 10261
						Client.packetWriter.addNode(var10); // L: 10262
					}

					if (var0 == 10) { // L: 10264
						var10 = class425.getPacketBufferNode(ClientPacket.field3262, Client.packetWriter.isaacCipher); // L: 10266
						var10.packetBuffer.writeIntME(var1); // L: 10267
						var10.packetBuffer.writeShort(var2); // L: 10268
						var10.packetBuffer.writeShort(var3); // L: 10269
						Client.packetWriter.addNode(var10); // L: 10270
					}

				}
			}
		}
	} // L: 10190 10272
}
