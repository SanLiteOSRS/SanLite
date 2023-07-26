import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 335450763
	)
	static int field4293;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -61873427
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1554227631
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("ao")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("ac")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("an")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("af")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("ai")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("al")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bd")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[Luj;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bn")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("ba")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -717754119
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bp")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bv")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4293 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-664965088"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 118

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1837159139"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 204

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1193931520"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 174 175
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-62"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = class313.method6018(var1, var1.length); // L: 37
		Buffer var2 = new Buffer(class304.decompressBytes(var1)); // L: 38
		int var3 = var2.readUnsignedByte(); // L: 39
		if (var3 >= 5 && var3 <= 7) { // L: 40
			if (var3 >= 6) { // L: 41
				var2.readInt(); // L: 42
			}

			int var4 = var2.readUnsignedByte(); // L: 45
			if (var3 >= 7) { // L: 46
				this.groupCount = var2.method9105();
			} else {
				this.groupCount = var2.readUnsignedShort(); // L: 47
			}

			int var5 = 0; // L: 48
			int var6 = -1; // L: 49
			this.groupIds = new int[this.groupCount]; // L: 50
			int var7;
			if (var3 >= 7) { // L: 51
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 52
					this.groupIds[var7] = var5 += var2.method9105(); // L: 53
					if (this.groupIds[var7] > var6) { // L: 54
						var6 = this.groupIds[var7];
					}
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 58
					this.groupIds[var7] = var5 += var2.readUnsignedShort(); // L: 59
					if (this.groupIds[var7] > var6) { // L: 60
						var6 = this.groupIds[var7];
					}
				}
			}

			this.groupCrcs = new int[var6 + 1]; // L: 63
			this.groupVersions = new int[var6 + 1]; // L: 64
			this.fileCounts = new int[var6 + 1]; // L: 65
			this.fileIds = new int[var6 + 1][]; // L: 66
			this.groups = new Object[var6 + 1]; // L: 67
			this.files = new Object[var6 + 1][]; // L: 68
			if (var4 != 0) { // L: 69
				this.groupNameHashes = new int[var6 + 1]; // L: 70

				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 71
					this.groupNameHashes[this.groupIds[var7]] = var2.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes); // L: 72
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 74
				this.groupCrcs[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 75
				this.groupVersions[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 76
				this.fileCounts[this.groupIds[var7]] = var2.readUnsignedShort();
			}

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			if (var3 >= 7) { // L: 77
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 78
					var8 = this.groupIds[var7]; // L: 79
					var9 = this.fileCounts[var8]; // L: 80
					var5 = 0; // L: 81
					var10 = -1; // L: 82
					this.fileIds[var8] = new int[var9]; // L: 83

					for (var11 = 0; var11 < var9; ++var11) { // L: 84
						var12 = this.fileIds[var8][var11] = var5 += var2.method9105(); // L: 85
						if (var12 > var10) { // L: 86
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1]; // L: 88
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 92
					var8 = this.groupIds[var7]; // L: 93
					var9 = this.fileCounts[var8]; // L: 94
					var5 = 0; // L: 95
					var10 = -1; // L: 96
					this.fileIds[var8] = new int[var9]; // L: 97

					for (var11 = 0; var11 < var9; ++var11) { // L: 98
						var12 = this.fileIds[var8][var11] = var5 += var2.readUnsignedShort(); // L: 99
						if (var12 > var10) { // L: 100
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1]; // L: 102
				}
			}

			if (var4 != 0) { // L: 105
				this.fileNameHashes = new int[var6 + 1][]; // L: 106
				this.fileNameHashTables = new IntHashTable[var6 + 1]; // L: 107

				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 108
					var8 = this.groupIds[var7]; // L: 109
					var9 = this.fileCounts[var8]; // L: 110
					this.fileNameHashes[var8] = new int[this.files[var8].length]; // L: 111

					for (var10 = 0; var10 < var9; ++var10) { // L: 112
						this.fileNameHashes[var8][this.fileIds[var8][var10]] = var2.readInt();
					}

					this.fileNameHashTables[var8] = new IntHashTable(this.fileNameHashes[var8]); // L: 113
				}
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 116

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1888233667"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 121
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-979807337"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 125
			if (this.files[var1][var2] == null) { // L: 126
				boolean var4 = this.buildFiles(var1, var3); // L: 127
				if (!var4) { // L: 128
					this.loadGroup(var1); // L: 129
					var4 = this.buildFiles(var1, var3); // L: 130
					if (!var4) { // L: 131
						return null;
					}
				}
			}

			byte[] var5 = class150.method3189(this.files[var1][var2], false); // L: 134
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 135
			}

			return var5; // L: 136
		} else {
			return null;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-100656912"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 140
			if (this.files[var1][var2] != null) {
				return true; // L: 141
			} else if (this.groups[var1] != null) { // L: 142
				return true;
			} else {
				this.loadGroup(var1); // L: 143
				return this.groups[var1] != null; // L: 144
			}
		} else {
			return false; // L: 145
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "75"
	)
	public boolean method6757(int var1) {
		if (this.files.length == 1) { // L: 149
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 150
		} else {
			throw new RuntimeException(); // L: 151
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-247725441"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 155
			return true;
		} else {
			this.loadGroup(var1); // L: 156
			return this.groups[var1] != null; // L: 157
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-78"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true; // L: 162

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) { // L: 163
			int var3 = this.groupIds[var2]; // L: 164
			if (this.groups[var3] == null) { // L: 165
				this.loadGroup(var3); // L: 166
				if (this.groups[var3] == null) { // L: 167
					var1 = false;
				}
			}
		}

		return var1; // L: 170
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-2047218130"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) { // L: 179
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0); // L: 180
		} else {
			throw new RuntimeException(); // L: 181
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "8"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 185
			if (this.files[var1][var2] == null) { // L: 186
				boolean var3 = this.buildFiles(var1, (int[])null); // L: 187
				if (!var3) { // L: 188
					this.loadGroup(var1); // L: 189
					var3 = this.buildFiles(var1, (int[])null); // L: 190
					if (!var3) { // L: 191
						return null;
					}
				}
			}

			byte[] var4 = class150.method3189(this.files[var1][var2], false); // L: 194
			return var4; // L: 195
		} else {
			return null;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "2068434253"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) { // L: 199
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0); // L: 200
		} else {
			throw new RuntimeException(); // L: 201
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1146410571"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 207 208 210
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-637205539"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 214 215
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-76"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 219
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-120"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 223
			this.groups[var1] = null;
		}

	} // L: 224

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-50"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 227
			this.files[var1][var2] = null;
		}

	} // L: 228

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "321577490"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 231
			if (this.files[var1] != null) { // L: 232
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 233
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 236

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "512786407"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) { // L: 239
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 240
			int[] var4 = this.fileIds[var1]; // L: 241
			Object[] var5 = this.files[var1]; // L: 242
			boolean var6 = true; // L: 243

			for (int var7 = 0; var7 < var3; ++var7) { // L: 244
				if (var5[var4[var7]] == null) { // L: 245
					var6 = false; // L: 246
					break;
				}
			}

			if (var6) { // L: 250
				return true;
			} else {
				byte[] var21;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 252
					var21 = class150.method3189(this.groups[var1], false); // L: 257
				} else {
					var21 = class150.method3189(this.groups[var1], true); // L: 253
					Buffer var8 = new Buffer(var21); // L: 254
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 255
				}

				byte[] var24 = class304.decompressBytes(var21); // L: 260
				if (this.releaseGroups) { // L: 265
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 266
					int var9 = var24.length; // L: 267
					--var9;
					int var10 = var24[var9] & 255; // L: 268
					var9 -= var10 * var3 * 4; // L: 269
					Buffer var11 = new Buffer(var24); // L: 270
					int[] var12 = new int[var3]; // L: 271
					var11.offset = var9; // L: 272

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 273
						var14 = 0; // L: 274

						for (var15 = 0; var15 < var3; ++var15) { // L: 275
							var14 += var11.readInt(); // L: 276
							var12[var15] += var14; // L: 277
						}
					}

					byte[][] var22 = new byte[var3][]; // L: 280

					for (var14 = 0; var14 < var3; ++var14) { // L: 281
						var22[var14] = new byte[var12[var14]]; // L: 282
						var12[var14] = 0; // L: 283
					}

					var11.offset = var9; // L: 285
					var14 = 0; // L: 286

					int var17;
					for (var15 = 0; var15 < var10; ++var15) { // L: 287
						int var23 = 0; // L: 288

						for (var17 = 0; var17 < var3; ++var17) { // L: 289
							var23 += var11.readInt(); // L: 290
							System.arraycopy(var24, var14, var22[var17], var12[var17], var23); // L: 291
							var12[var17] += var23; // L: 292
							var14 += var23; // L: 293
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 296
						if (!this.shallowFiles) { // L: 297
							var17 = var4[var15]; // L: 299
							byte[] var19 = var22[var15]; // L: 301
							Object var18;
							if (var19 == null) { // L: 303
								var18 = null; // L: 304
							} else if (var19.length > 136) { // L: 307
								DirectByteArrayCopier var20 = new DirectByteArrayCopier(); // L: 309
								var20.set(var19); // L: 310
								var18 = var20; // L: 311
							} else {
								var18 = var19; // L: 325
							}

							var5[var17] = var18; // L: 327
						} else {
							var5[var4[var15]] = var22[var15]; // L: 329
						}
					}
				} else if (!this.shallowFiles) { // L: 333
					var5[var4[0]] = MusicPatchNode.method6054(var24, false);
				} else {
					var5[var4[0]] = var24; // L: 334
				}

				return true; // L: 336
			}
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-18"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 340
		return this.groupNameHashTable.get(PcmPlayer.hashString(var1)); // L: 341
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "91721922"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 345
		return this.fileNameHashTables[var1].get(PcmPlayer.hashString(var2)); // L: 346
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "831469561"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 350
		var2 = var2.toLowerCase(); // L: 351
		int var3 = this.groupNameHashTable.get(PcmPlayer.hashString(var1)); // L: 352
		if (var3 < 0) { // L: 353
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(PcmPlayer.hashString(var2)); // L: 354
			return var4 >= 0; // L: 355
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B",
		garbageValue = "68"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 360
		var2 = var2.toLowerCase(); // L: 361
		int var3 = this.groupNameHashTable.get(PcmPlayer.hashString(var1)); // L: 362
		int var4 = this.fileNameHashTables[var3].get(PcmPlayer.hashString(var2)); // L: 363
		return this.takeFile(var3, var4); // L: 364
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;S)Z",
		garbageValue = "238"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 368
		var2 = var2.toLowerCase(); // L: 369
		int var3 = this.groupNameHashTable.get(PcmPlayer.hashString(var1)); // L: 370
		int var4 = this.fileNameHashTables[var3].get(PcmPlayer.hashString(var2)); // L: 371
		return this.tryLoadFile(var3, var4); // L: 372
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "656064124"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 376
		int var2 = this.groupNameHashTable.get(PcmPlayer.hashString(var1)); // L: 377
		return this.tryLoadGroup(var2); // L: 378
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-946943017"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 382
		int var2 = this.groupNameHashTable.get(PcmPlayer.hashString(var1)); // L: 383
		if (var2 >= 0) { // L: 384
			this.loadRegionFromGroup(var2); // L: 385
		}
	} // L: 386

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1785019666"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 389
		int var2 = this.groupNameHashTable.get(PcmPlayer.hashString(var1)); // L: 390
		return this.groupLoadPercent(var2); // L: 391
	}
}
