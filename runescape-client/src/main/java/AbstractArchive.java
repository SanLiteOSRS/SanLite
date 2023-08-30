import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -587326437
	)
	static int field4296;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1963160975
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("ah")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("as")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("aj")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("av")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("aw")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("ak")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bh")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bk")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bv")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -214196507
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("by")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bs")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor();
		field4296 = 0;
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1272707955"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 132

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "402130956"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1917091652"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 188 189
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1178944062"
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
		Buffer var15 = new Buffer(class53.decompressBytes(var1)); // L: 52
		var5 = var15.readUnsignedByte(); // L: 53
		if (var5 >= 5 && var5 <= 7) { // L: 54
			if (var5 >= 6) { // L: 55
				var15.readInt(); // L: 56
			}

			var6 = var15.readUnsignedByte(); // L: 59
			if (var5 >= 7) { // L: 60
				this.groupCount = var15.method9077();
			} else {
				this.groupCount = var15.readUnsignedShort(); // L: 61
			}

			int var7 = 0; // L: 62
			int var8 = -1; // L: 63
			this.groupIds = new int[this.groupCount]; // L: 64
			int var9;
			if (var5 >= 7) { // L: 65
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 66
					this.groupIds[var9] = var7 += var15.method9077(); // L: 67
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
						var14 = this.fileIds[var10][var13] = var7 += var15.method9077(); // L: 99
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
		garbageValue = "-1"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 135
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "1244530387"
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

			byte[] var5 = class126.method2930(this.files[var1][var2], false); // L: 148
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 149
			}

			return var5; // L: 150
		} else {
			return null;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "57"
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2143773006"
	)
	public boolean method6698(int var1) {
		if (this.files.length == 1) { // L: 163
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 164
		} else {
			throw new RuntimeException(); // L: 165
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1627595520"
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-796696946"
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-118859567"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1922174985"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var3 = this.buildFiles(var1, (int[])null);
				if (!var3) {
					this.loadGroup(var1);
					var3 = this.buildFiles(var1, (int[])null);
					if (!var3) {
						return null;
					}
				}
			}

			byte[] var4 = class126.method2930(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-893648028"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0);
		} else {
			throw new RuntimeException(); // L: 215
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "76530715"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "11"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-92"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "64500147"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 241
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "68"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) {
			if (this.files[var1] != null) { // L: 246
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
					this.files[var1][var2] = null;
				}
			}
		}

	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "-93"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) {
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 254
			int[] var4 = this.fileIds[var1];
			Object[] var5 = this.files[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; ++var7) { // L: 258
				if (var5[var4[var7]] == null) {
					var6 = false;
					break;
				}
			}

			if (var6) {
				return true;
			} else {
				byte[] var21;
				if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
					var21 = class126.method2930(this.groups[var1], true); // L: 267
					Buffer var8 = new Buffer(var21);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				} else {
					var21 = class126.method2930(this.groups[var1], false); // L: 271
				}

				byte[] var25 = class53.decompressBytes(var21);
				if (this.releaseGroups) { // L: 311
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) { // L: 312
					int var22 = var25.length;
					--var22;
					var10 = var25[var22] & 255;
					var22 -= var10 * var3 * 4; // L: 315
					Buffer var11 = new Buffer(var25);
					int[] var12 = new int[var3]; // L: 317
					var11.offset = var22;

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) {
						var14 = 0;

						for (var15 = 0; var15 < var3; ++var15) {
							var14 += var11.readInt();
							var12[var15] += var14;
						}
					}

					byte[][] var23 = new byte[var3][];

					for (var14 = 0; var14 < var3; ++var14) {
						var23[var14] = new byte[var12[var14]];
						var12[var14] = 0;
					}

					var11.offset = var22; // L: 331
					var14 = 0;

					int var17;
					for (var15 = 0; var15 < var10; ++var15) {
						int var24 = 0;

						for (var17 = 0; var17 < var3; ++var17) {
							var24 += var11.readInt(); // L: 336
							System.arraycopy(var25, var14, var23[var17], var12[var17], var24); // L: 337
							var12[var17] += var24;
							var14 += var24;
						}
					}

					for (var15 = 0; var15 < var3; ++var15) {
						if (!this.shallowFiles) {
							var17 = var4[var15];
							byte[] var19 = var23[var15];
							Object var18;
							if (var19 == null) {
								var18 = null;
							} else if (var19.length > 136) {
								DirectByteArrayCopier var20 = new DirectByteArrayCopier();
								var20.set(var19);
								var18 = var20;
							} else {
								var18 = var19; // L: 371
							}

							var5[var17] = var18; // L: 373
						} else {
							var5[var4[var15]] = var23[var15]; // L: 375
						}
					}
				} else if (!this.shallowFiles) { // L: 379
					var10 = var4[0]; // L: 381
					Object var26;
					if (var25 == null) { // L: 384
						var26 = null; // L: 385
					} else if (var25.length > 136) { // L: 388
						DirectByteArrayCopier var27 = new DirectByteArrayCopier(); // L: 390
						var27.set(var25); // L: 391
						var26 = var27; // L: 392
					} else {
						var26 = var25; // L: 406
					}

					var5[var10] = var26; // L: 408
				} else {
					var5[var4[0]] = var25; // L: 410
				}

				return true; // L: 412
			}
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1972103558"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 416
		return this.groupNameHashTable.get(WorldMapElement.hashString(var1)); // L: 417
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "22201919"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 421
		return this.fileNameHashTables[var1].get(WorldMapElement.hashString(var2)); // L: 422
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "978478615"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 426
		var2 = var2.toLowerCase(); // L: 427
		int var3 = this.groupNameHashTable.get(WorldMapElement.hashString(var1)); // L: 428
		if (var3 < 0) { // L: 429
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(WorldMapElement.hashString(var2)); // L: 430
			return var4 >= 0; // L: 431
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1446262093"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 436
		var2 = var2.toLowerCase(); // L: 437
		int var3 = this.groupNameHashTable.get(WorldMapElement.hashString(var1)); // L: 438
		int var4 = this.fileNameHashTables[var3].get(WorldMapElement.hashString(var2)); // L: 439
		return this.takeFile(var3, var4); // L: 440
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-254123457"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 444
		var2 = var2.toLowerCase(); // L: 445
		int var3 = this.groupNameHashTable.get(WorldMapElement.hashString(var1)); // L: 446
		int var4 = this.fileNameHashTables[var3].get(WorldMapElement.hashString(var2)); // L: 447
		return this.tryLoadFile(var3, var4); // L: 448
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "64"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 452
		int var2 = this.groupNameHashTable.get(WorldMapElement.hashString(var1)); // L: 453
		return this.tryLoadGroup(var2); // L: 454
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2037127897"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 458
		int var2 = this.groupNameHashTable.get(WorldMapElement.hashString(var1)); // L: 459
		if (var2 >= 0) { // L: 460
			this.loadRegionFromGroup(var2); // L: 461
		}
	} // L: 462

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1703515273"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 465
		int var2 = this.groupNameHashTable.get(WorldMapElement.hashString(var1)); // L: 466
		return this.groupLoadPercent(var2); // L: 467
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lhh;",
		garbageValue = "-2101462016"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = class13.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lto;II)V",
		garbageValue = "-312425420"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1; // L: 190
		if (var2) { // L: 191
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2); // L: 192
		Player var4 = Client.players[var1]; // L: 193
		if (var3 == 0) { // L: 194
			if (var2) { // L: 195
				var4.field1154 = false; // L: 196
			} else if (Client.localPlayerIndex == var1) { // L: 199
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class47.baseY * 64 + var4.pathY[0] >> 13) + (UrlRequester.baseX * 64 + var4.pathX[0] >> 13 << 14); // L: 200
				if (var4.field1234 != -1) { // L: 201
					Players.Players_orientations[var1] = var4.field1234;
				} else {
					Players.Players_orientations[var1] = var4.orientation; // L: 202
				}

				Players.Players_targetIndices[var1] = var4.targetIndex; // L: 203
				Client.players[var1] = null; // L: 204
				if (var0.readBits(1) != 0) { // L: 205
					KitDefinition.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) { // L: 208
				var5 = var0.readBits(3); // L: 209
				var6 = var4.pathX[0]; // L: 210
				var7 = var4.pathY[0]; // L: 211
				if (var5 == 0) { // L: 212
					--var6; // L: 213
					--var7; // L: 214
				} else if (var5 == 1) { // L: 216
					--var7;
				} else if (var5 == 2) { // L: 217
					++var6; // L: 218
					--var7; // L: 219
				} else if (var5 == 3) { // L: 221
					--var6;
				} else if (var5 == 4) { // L: 222
					++var6;
				} else if (var5 == 5) { // L: 223
					--var6; // L: 224
					++var7; // L: 225
				} else if (var5 == 6) { // L: 227
					++var7;
				} else if (var5 == 7) { // L: 228
					++var6; // L: 229
					++var7; // L: 230
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 232
					var4.resetPath(var6, var7); // L: 233
					var4.field1154 = false; // L: 234
				} else if (var2) { // L: 236
					var4.field1154 = true; // L: 237
					var4.tileX = var6; // L: 238
					var4.tileY = var7; // L: 239
				} else {
					var4.field1154 = false; // L: 242
					var4.method2345(var6, var7, Players.field1377[var1]); // L: 243
				}

			} else if (var3 == 2) { // L: 247
				var5 = var0.readBits(4); // L: 248
				var6 = var4.pathX[0]; // L: 249
				var7 = var4.pathY[0]; // L: 250
				if (var5 == 0) { // L: 251
					var6 -= 2; // L: 252
					var7 -= 2; // L: 253
				} else if (var5 == 1) { // L: 255
					--var6; // L: 256
					var7 -= 2; // L: 257
				} else if (var5 == 2) { // L: 259
					var7 -= 2;
				} else if (var5 == 3) { // L: 260
					++var6; // L: 261
					var7 -= 2; // L: 262
				} else if (var5 == 4) { // L: 264
					var6 += 2; // L: 265
					var7 -= 2; // L: 266
				} else if (var5 == 5) { // L: 268
					var6 -= 2; // L: 269
					--var7; // L: 270
				} else if (var5 == 6) { // L: 272
					var6 += 2; // L: 273
					--var7; // L: 274
				} else if (var5 == 7) { // L: 276
					var6 -= 2;
				} else if (var5 == 8) { // L: 277
					var6 += 2;
				} else if (var5 == 9) { // L: 278
					var6 -= 2; // L: 279
					++var7; // L: 280
				} else if (var5 == 10) { // L: 282
					var6 += 2; // L: 283
					++var7; // L: 284
				} else if (var5 == 11) { // L: 286
					var6 -= 2; // L: 287
					var7 += 2; // L: 288
				} else if (var5 == 12) { // L: 290
					--var6; // L: 291
					var7 += 2; // L: 292
				} else if (var5 == 13) { // L: 294
					var7 += 2;
				} else if (var5 == 14) { // L: 295
					++var6; // L: 296
					var7 += 2; // L: 297
				} else if (var5 == 15) { // L: 299
					var6 += 2; // L: 300
					var7 += 2; // L: 301
				}

				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 303
					if (var2) { // L: 307
						var4.field1154 = true; // L: 308
						var4.tileX = var6; // L: 309
						var4.tileY = var7; // L: 310
					} else {
						var4.field1154 = false; // L: 313
						var4.method2345(var6, var7, Players.field1377[var1]); // L: 314
					}
				} else {
					var4.resetPath(var6, var7); // L: 304
					var4.field1154 = false; // L: 305
				}

			} else {
				var5 = var0.readBits(1); // L: 318
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) { // L: 319
					var6 = var0.readBits(12); // L: 320
					var7 = var6 >> 10; // L: 321
					var8 = var6 >> 5 & 31; // L: 322
					if (var8 > 15) { // L: 323
						var8 -= 32;
					}

					var9 = var6 & 31; // L: 324
					if (var9 > 15) { // L: 325
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0]; // L: 326
					var11 = var9 + var4.pathY[0]; // L: 327
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) { // L: 328
						if (var2) { // L: 332
							var4.field1154 = true; // L: 333
							var4.tileX = var10; // L: 334
							var4.tileY = var11; // L: 335
						} else {
							var4.field1154 = false; // L: 338
							var4.method2345(var10, var11, Players.field1377[var1]); // L: 339
						}
					} else {
						var4.resetPath(var10, var11); // L: 329
						var4.field1154 = false; // L: 330
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 341
					if (Client.localPlayerIndex == var1) { // L: 342
						HealthBar.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30); // L: 345
					var7 = var6 >> 28; // L: 346
					var8 = var6 >> 14 & 16383; // L: 347
					var9 = var6 & 16383; // L: 348
					var10 = (UrlRequester.baseX * 64 + var8 + var4.pathX[0] & 16383) - UrlRequester.baseX * 64; // L: 349
					var11 = (class47.baseY * 64 + var9 + var4.pathY[0] & 16383) - class47.baseY * 64; // L: 350
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) { // L: 351
						var4.resetPath(var10, var11); // L: 352
						var4.field1154 = false; // L: 353
					} else if (var2) { // L: 355
						var4.field1154 = true; // L: 356
						var4.tileX = var10; // L: 357
						var4.tileY = var11; // L: 358
					} else {
						var4.field1154 = false; // L: 361
						var4.method2345(var10, var11, Players.field1377[var1]); // L: 362
					}

					var4.plane = (byte)(var7 + var4.plane & 3); // L: 364
					if (Client.localPlayerIndex == var1) { // L: 365
						HealthBar.Client_plane = var4.plane;
					}

				}
			}
		}
	} // L: 197 206 245 316 343 366
}
