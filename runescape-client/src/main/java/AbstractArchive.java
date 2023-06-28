import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -2084025713
	)
	static int field4265;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2057927725
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("az")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("au")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("aq")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("aw")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("ay")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("al")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("am")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[Luf;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bc")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bj")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1568512069
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bg")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bf")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4265 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-662286080"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "44"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 204

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "36647456"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 174
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "2"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = class196.method3756(var1, var1.length); // L: 37
		Buffer var2 = new Buffer(NPC.decompressBytes(var1)); // L: 38
		int var3 = var2.readUnsignedByte(); // L: 39
		if (var3 >= 5 && var3 <= 7) { // L: 40
			if (var3 >= 6) { // L: 41
				var2.readInt(); // L: 42
			}

			int var4 = var2.readUnsignedByte(); // L: 45
			if (var3 >= 7) { // L: 46
				this.groupCount = var2.method8927();
			} else {
				this.groupCount = var2.readUnsignedShort(); // L: 47
			}

			int var5 = 0; // L: 48
			int var6 = -1; // L: 49
			this.groupIds = new int[this.groupCount]; // L: 50
			int var7;
			if (var3 >= 7) { // L: 51
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 52
					this.groupIds[var7] = var5 += var2.method8927(); // L: 53
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
						var12 = this.fileIds[var8][var11] = var5 += var2.method8927(); // L: 85
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
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1137620411"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "-575133043"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 125
			if (this.files[var1][var2] == null) { // L: 126
				boolean var4 = this.buildFiles(var1, var3);
				if (!var4) {
					this.loadGroup(var1);
					var4 = this.buildFiles(var1, var3); // L: 130
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = Varps.method5964(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1129495144"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] != null) {
				return true;
			} else if (this.groups[var1] != null) {
				return true;
			} else {
				this.loadGroup(var1);
				return this.groups[var1] != null;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method6694(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1932610329"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 155
			return true;
		} else {
			this.loadGroup(var1);
			return this.groups[var1] != null;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "32334"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true;

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) {
			int var3 = this.groupIds[var2];
			if (this.groups[var3] == null) {
				this.loadGroup(var3); // L: 166
				if (this.groups[var3] == null) {
					var1 = false;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-932023905"
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

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1089327053"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var3 = this.buildFiles(var1, (int[])null);
				if (!var3) { // L: 188
					this.loadGroup(var1); // L: 189
					var3 = this.buildFiles(var1, (int[])null);
					if (!var3) { // L: 191
						return null;
					}
				}
			}

			byte[] var4 = Varps.method5964(this.files[var1][var2], false);
			return var4; // L: 195
		} else {
			return null;
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-25"
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

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "228604856"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 207 208 210
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1039432837"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 214 215
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-93"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 219
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1392732"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 223
			this.groups[var1] = null;
		}

	} // L: 224

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "53"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 227
			this.files[var1][var2] = null;
		}

	} // L: 228

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "115"
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
				byte[] var18;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 252
					var18 = Varps.method5964(this.groups[var1], false); // L: 257
				} else {
					var18 = Varps.method5964(this.groups[var1], true); // L: 253
					Buffer var8 = new Buffer(var18); // L: 254
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 255
				}

				byte[] var20 = NPC.decompressBytes(var18); // L: 260
				if (this.releaseGroups) { // L: 265
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 266
					int var9 = var20.length; // L: 267
					--var9; // L: 268
					int var10 = var20[var9] & 255;
					var9 -= var3 * var10 * 4; // L: 269
					Buffer var11 = new Buffer(var20); // L: 270
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

					byte[][] var19 = new byte[var3][]; // L: 280

					for (var14 = 0; var14 < var3; ++var14) { // L: 281
						var19[var14] = new byte[var12[var14]]; // L: 282
						var12[var14] = 0; // L: 283
					}

					var11.offset = var9; // L: 285
					var14 = 0; // L: 286

					for (var15 = 0; var15 < var10; ++var15) { // L: 287
						int var16 = 0; // L: 288

						for (int var17 = 0; var17 < var3; ++var17) { // L: 289
							var16 += var11.readInt(); // L: 290
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16); // L: 291
							var12[var17] += var16; // L: 292
							var14 += var16; // L: 293
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 296
						if (!this.shallowFiles) { // L: 297
							var5[var4[var15]] = class104.method2665(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 298
						}
					}
				} else if (!this.shallowFiles) { // L: 302
					var5[var4[0]] = class104.method2665(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 303
				}

				return true; // L: 305
			}
		}
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1931627079"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 309
		return this.groupNameHashTable.get(class213.hashString(var1)); // L: 310
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)I",
		garbageValue = "-5312"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 314
		return this.fileNameHashTables[var1].get(class213.hashString(var2)); // L: 315
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "536777106"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 319
		var2 = var2.toLowerCase(); // L: 320
		int var3 = this.groupNameHashTable.get(class213.hashString(var1)); // L: 321
		if (var3 < 0) { // L: 322
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class213.hashString(var2)); // L: 323
			return var4 >= 0; // L: 324
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B",
		garbageValue = "117"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 329
		var2 = var2.toLowerCase(); // L: 330
		int var3 = this.groupNameHashTable.get(class213.hashString(var1)); // L: 331
		int var4 = this.fileNameHashTables[var3].get(class213.hashString(var2)); // L: 332
		return this.takeFile(var3, var4); // L: 333
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "-100"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 337
		var2 = var2.toLowerCase(); // L: 338
		int var3 = this.groupNameHashTable.get(class213.hashString(var1)); // L: 339
		int var4 = this.fileNameHashTables[var3].get(class213.hashString(var2)); // L: 340
		return this.tryLoadFile(var3, var4); // L: 341
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1634274768"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 345
		int var2 = this.groupNameHashTable.get(class213.hashString(var1)); // L: 346
		return this.tryLoadGroup(var2); // L: 347
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1806976666"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 351
		int var2 = this.groupNameHashTable.get(class213.hashString(var1)); // L: 352
		if (var2 >= 0) { // L: 353
			this.loadRegionFromGroup(var2); // L: 354
		}
	} // L: 355

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2014386736"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 358
		int var2 = this.groupNameHashTable.get(class213.hashString(var1)); // L: 359
		return this.groupLoadPercent(var2); // L: 360
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqq;FFFI)F",
		garbageValue = "62692236"
	)
	static float method6743(class440 var0, float var1, float var2, float var3) {
		float var4 = FriendLoginUpdate.method7784(var0.field4700, var0.field4701, var1); // L: 116
		if (Math.abs(var4) < class125.field1463) { // L: 117
			return var1;
		} else {
			float var5 = FriendLoginUpdate.method7784(var0.field4700, var0.field4701, var2); // L: 118
			if (Math.abs(var5) < class125.field1463) { // L: 119
				return var2;
			} else {
				float var6 = 0.0F; // L: 120
				float var7 = 0.0F; // L: 121
				float var8 = 0.0F; // L: 122
				float var13 = 0.0F; // L: 127
				boolean var14 = true; // L: 128
				boolean var15 = false; // L: 129

				do {
					var15 = false; // L: 131
					if (var14) { // L: 132
						var6 = var1; // L: 133
						var13 = var4; // L: 134
						var7 = var2 - var1; // L: 135
						var8 = var7; // L: 136
						var14 = false; // L: 137
					}

					if (Math.abs(var13) < Math.abs(var5)) { // L: 139
						var1 = var2; // L: 140
						var2 = var6; // L: 141
						var6 = var1; // L: 142
						var4 = var5; // L: 143
						var5 = var13; // L: 144
						var13 = var4; // L: 145
					}

					float var16 = class125.field1467 * Math.abs(var2) + var3 * 0.5F; // L: 147
					float var17 = (var6 - var2) * 0.5F; // L: 148
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F; // L: 149
					if (var18) { // L: 150
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) { // L: 151
							float var12 = var5 / var4; // L: 156
							float var9;
							float var10;
							if (var1 == var6) { // L: 157
								var9 = var12 * 2.0F * var17; // L: 158
								var10 = 1.0F - var12; // L: 159
							} else {
								var10 = var4 / var13; // L: 162
								float var11 = var5 / var13; // L: 163
								var9 = (2.0F * var17 * var10 * (var10 - var11) - (var11 - 1.0F) * (var2 - var1)) * var12; // L: 164
								var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F); // L: 165
							}

							if ((double)var9 > 0.0D) { // L: 167
								var10 = -var10;
							} else {
								var9 = -var9; // L: 168
							}

							var12 = var8; // L: 169
							var8 = var7; // L: 170
							if (var9 * 2.0F < var10 * var17 * 3.0F - Math.abs(var10 * var16) && var9 < Math.abs(0.5F * var12 * var10)) { // L: 171
								var7 = var9 / var10; // L: 172
							} else {
								var7 = var17; // L: 175
								var8 = var17; // L: 176
							}
						} else {
							var7 = var17; // L: 152
							var8 = var17; // L: 153
						}

						var1 = var2; // L: 179
						var4 = var5; // L: 180
						if (Math.abs(var7) > var16) { // L: 181
							var2 += var7;
						} else if ((double)var17 > 0.0D) { // L: 182
							var2 += var16;
						} else {
							var2 -= var16; // L: 183
						}

						var5 = FriendLoginUpdate.method7784(var0.field4700, var0.field4701, var2); // L: 184
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) { // L: 185
							var14 = true; // L: 186
							var15 = true; // L: 187
						} else {
							var15 = true; // L: 190
						}
					}
				} while(var15);

				return var2; // L: 194
			}
		}
	}
}
