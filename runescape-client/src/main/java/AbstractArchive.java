import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1755503017
	)
	static int field4271;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -311649933
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("af")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("ae")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("aq")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("ah")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("ak")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("ax")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bm")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("by")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bc")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 312251783
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bn")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bb")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4271 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-468998802"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 118

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1781904268"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 229

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-20"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 199 200
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "533292730"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = Interpreter.method1975(var1, var1.length); // L: 37
		Buffer var2 = new Buffer(ObjectComposition.decompressBytes(var1)); // L: 38
		int var3 = var2.readUnsignedByte(); // L: 39
		if (var3 >= 5 && var3 <= 7) { // L: 40
			if (var3 >= 6) { // L: 41
				var2.readInt(); // L: 42
			}

			int var4 = var2.readUnsignedByte(); // L: 45
			if (var3 >= 7) { // L: 46
				this.groupCount = var2.method9076();
			} else {
				this.groupCount = var2.readUnsignedShort(); // L: 47
			}

			int var5 = 0; // L: 48
			int var6 = -1; // L: 49
			this.groupIds = new int[this.groupCount]; // L: 50
			int var7;
			if (var3 >= 7) { // L: 51
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 52
					this.groupIds[var7] = var5 += var2.method9076(); // L: 53
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
						var12 = this.fileIds[var8][var11] = var5 += var2.method9076(); // L: 85
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIS)[B",
		garbageValue = "29809"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 121
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II[IB)[B",
		garbageValue = "-110"
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

			Object var5 = this.files[var1][var2]; // L: 135
			byte[] var7;
			if (var5 == null) { // L: 137
				var7 = null; // L: 138
			} else if (var5 instanceof byte[]) { // L: 141
				byte[] var6 = (byte[])((byte[])var5); // L: 142
				var7 = var6; // L: 148
			} else {
				if (!(var5 instanceof AbstractByteArrayCopier)) { // L: 152
					throw new IllegalArgumentException(); // L: 157
				}

				AbstractByteArrayCopier var8 = (AbstractByteArrayCopier)var5; // L: 153
				var7 = var8.get(); // L: 154
			}

			if (this.shallowFiles) { // L: 160
				this.files[var1][var2] = null;
			}

			return var7; // L: 161
		} else {
			return null;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-90"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 165
			if (this.files[var1][var2] != null) {
				return true; // L: 166
			} else if (this.groups[var1] != null) { // L: 167
				return true;
			} else {
				this.loadGroup(var1); // L: 168
				return this.groups[var1] != null; // L: 169
			}
		} else {
			return false; // L: 170
		}
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "309941630"
	)
	public boolean method6763(int var1) {
		if (this.files.length == 1) { // L: 174
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 175
		} else {
			throw new RuntimeException(); // L: 176
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2020924265"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 180
			return true;
		} else {
			this.loadGroup(var1); // L: 181
			return this.groups[var1] != null; // L: 182
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2098297416"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true; // L: 187

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) { // L: 188
			int var3 = this.groupIds[var2]; // L: 189
			if (this.groups[var3] == null) { // L: 190
				this.loadGroup(var3); // L: 191
				if (this.groups[var3] == null) { // L: 192
					var1 = false;
				}
			}
		}

		return var1; // L: 195
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1699447450"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) { // L: 204
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0); // L: 205
		} else {
			throw new RuntimeException(); // L: 206
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1757506106"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 210
			if (this.files[var1][var2] == null) { // L: 211
				boolean var3 = this.buildFiles(var1, (int[])null); // L: 212
				if (!var3) { // L: 213
					this.loadGroup(var1); // L: 214
					var3 = this.buildFiles(var1, (int[])null); // L: 215
					if (!var3) { // L: 216
						return null;
					}
				}
			}

			byte[] var4 = class133.method3128(this.files[var1][var2], false); // L: 219
			return var4; // L: 220
		} else {
			return null;
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-63"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) { // L: 224
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0); // L: 225
		} else {
			throw new RuntimeException(); // L: 226
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "29"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 232 233 235
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1711810413"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 239 240
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1726114297"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 244
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 248
			this.groups[var1] = null;
		}

	} // L: 249

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1521791646"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 252
			this.files[var1][var2] = null;
		}

	} // L: 253

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 256
			if (this.files[var1] != null) { // L: 257
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 258
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 261

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "9"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) { // L: 264
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 265
			int[] var4 = this.fileIds[var1]; // L: 266
			Object[] var5 = this.files[var1]; // L: 267
			boolean var6 = true; // L: 268

			for (int var7 = 0; var7 < var3; ++var7) { // L: 269
				if (var5[var4[var7]] == null) { // L: 270
					var6 = false; // L: 271
					break;
				}
			}

			if (var6) { // L: 275
				return true;
			} else {
				byte[] var18;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 277
					var18 = class133.method3128(this.groups[var1], false); // L: 282
				} else {
					var18 = class133.method3128(this.groups[var1], true); // L: 278
					Buffer var8 = new Buffer(var18); // L: 279
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 280
				}

				byte[] var20 = ObjectComposition.decompressBytes(var18); // L: 285
				if (this.releaseGroups) { // L: 290
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 291
					int var9 = var20.length; // L: 292
					--var9;
					int var10 = var20[var9] & 255; // L: 293
					var9 -= var10 * var3 * 4; // L: 294
					Buffer var11 = new Buffer(var20); // L: 295
					int[] var12 = new int[var3]; // L: 296
					var11.offset = var9; // L: 297

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 298
						var14 = 0; // L: 299

						for (var15 = 0; var15 < var3; ++var15) { // L: 300
							var14 += var11.readInt(); // L: 301
							var12[var15] += var14; // L: 302
						}
					}

					byte[][] var19 = new byte[var3][]; // L: 305

					for (var14 = 0; var14 < var3; ++var14) { // L: 306
						var19[var14] = new byte[var12[var14]]; // L: 307
						var12[var14] = 0; // L: 308
					}

					var11.offset = var9; // L: 310
					var14 = 0; // L: 311

					for (var15 = 0; var15 < var10; ++var15) { // L: 312
						int var16 = 0; // L: 313

						for (int var17 = 0; var17 < var3; ++var17) { // L: 314
							var16 += var11.readInt(); // L: 315
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 316
							var12[var17] += var16; // L: 317
							var14 += var16; // L: 318
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 321
						if (!this.shallowFiles) { // L: 322
							var5[var4[var15]] = class20.method324(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 323
						}
					}
				} else if (!this.shallowFiles) { // L: 327
					var5[var4[0]] = class20.method324(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 328
				}

				return true; // L: 330
			}
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-316218462"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 334
		return this.groupNameHashTable.get(class129.hashString(var1)); // L: 335
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)I",
		garbageValue = "-55"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 339
		return this.fileNameHashTables[var1].get(class129.hashString(var2)); // L: 340
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-757559736"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 344
		var2 = var2.toLowerCase(); // L: 345
		int var3 = this.groupNameHashTable.get(class129.hashString(var1)); // L: 346
		if (var3 < 0) { // L: 347
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class129.hashString(var2)); // L: 348
			return var4 >= 0; // L: 349
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1926375021"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 354
		var2 = var2.toLowerCase(); // L: 355
		int var3 = this.groupNameHashTable.get(class129.hashString(var1)); // L: 356
		int var4 = this.fileNameHashTables[var3].get(class129.hashString(var2)); // L: 357
		return this.takeFile(var3, var4); // L: 358
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "25"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 362
		var2 = var2.toLowerCase(); // L: 363
		int var3 = this.groupNameHashTable.get(class129.hashString(var1)); // L: 364
		int var4 = this.fileNameHashTables[var3].get(class129.hashString(var2)); // L: 365
		return this.tryLoadFile(var3, var4); // L: 366
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "437387154"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 370
		int var2 = this.groupNameHashTable.get(class129.hashString(var1)); // L: 371
		return this.tryLoadGroup(var2); // L: 372
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-127"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 376
		int var2 = this.groupNameHashTable.get(class129.hashString(var1)); // L: 377
		if (var2 >= 0) { // L: 378
			this.loadRegionFromGroup(var2); // L: 379
		}
	} // L: 380

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1933577267"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 383
		int var2 = this.groupNameHashTable.get(class129.hashString(var1)); // L: 384
		return this.groupLoadPercent(var2); // L: 385
	}
}
