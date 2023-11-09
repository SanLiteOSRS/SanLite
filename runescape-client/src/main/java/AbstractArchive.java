import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 401859175
	)
	static int field4220;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1754346109
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("am")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("as")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("ak")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("az")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("ad")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("ae")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("ap")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[Ltd;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bb")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bi")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -159523507
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bx")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bo")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4220 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2103539915"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1884547323"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 204

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1973967810"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 174 175
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "104"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = class220.method4489(var1, var1.length); // L: 37
		Buffer var2 = new Buffer(class13.decompressBytes(var1)); // L: 38
		int var3 = var2.readUnsignedByte(); // L: 39
		if (var3 >= 5 && var3 <= 7) { // L: 40
			if (var3 >= 6) { // L: 41
				var2.readInt(); // L: 42
			}

			int var4 = var2.readUnsignedByte(); // L: 45
			if (var3 >= 7) { // L: 46
				this.groupCount = var2.method9290();
			} else {
				this.groupCount = var2.readUnsignedShort(); // L: 47
			}

			int var5 = 0; // L: 48
			int var6 = -1; // L: 49
			this.groupIds = new int[this.groupCount]; // L: 50
			int var7;
			if (var3 >= 7) { // L: 51
				for (var7 = 0; var7 < this.groupCount; ++var7) { // L: 52
					this.groupIds[var7] = var5 += var2.method9290(); // L: 53
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

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.groupCrcs[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.groupVersions[this.groupIds[var7]] = var2.readInt();
			}

			for (var7 = 0; var7 < this.groupCount; ++var7) {
				this.fileCounts[this.groupIds[var7]] = var2.readUnsignedShort();
			}

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			if (var3 >= 7) {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					var5 = 0; // L: 81
					var10 = -1; // L: 82
					this.fileIds[var8] = new int[var9]; // L: 83

					for (var11 = 0; var11 < var9; ++var11) { // L: 84
						var12 = this.fileIds[var8][var11] = var5 += var2.method9290(); // L: 85
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "-48"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "1331353922"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var4 = this.buildFiles(var1, var3);
				if (!var4) {
					this.loadGroup(var1);
					var4 = this.buildFiles(var1, var3);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = HealthBarDefinition.method3729(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 135
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-35"
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "953853219"
	)
	public boolean method6701(int var1) {
		if (this.files.length == 1) { // L: 149
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 150
		} else {
			throw new RuntimeException(); // L: 151
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1653429081"
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

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "128"
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

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "-18"
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

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-606351717"
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

			byte[] var4 = HealthBarDefinition.method3729(this.files[var1][var2], false); // L: 194
			return var4; // L: 195
		} else {
			return null;
		}
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1627749986"
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

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "296342556"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 207 208 210
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "65"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 214 215
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154371114"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 219
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2145845097"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 223
			this.groups[var1] = null;
		}

	} // L: 224

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-8"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 227
			this.files[var1][var2] = null;
		}

	} // L: 228

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1903798827"
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

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "-2109762247"
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
					var18 = HealthBarDefinition.method3729(this.groups[var1], false); // L: 257
				} else {
					var18 = HealthBarDefinition.method3729(this.groups[var1], true); // L: 253
					Buffer var8 = new Buffer(var18); // L: 254
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 255
				}

				byte[] var20 = class13.decompressBytes(var18); // L: 260
				if (this.releaseGroups) { // L: 265
					this.groups[var1] = null;
				}

				if (var3 > 1) { // L: 266
					int var9 = var20.length; // L: 267
					--var9;
					int var10 = var20[var9] & 255; // L: 268
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
							var5[var4[var15]] = class108.method2853(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15]; // L: 298
						}
					}
				} else if (!this.shallowFiles) { // L: 302
					var5[var4[0]] = class108.method2853(var20, false);
				} else {
					var5[var4[0]] = var20; // L: 303
				}

				return true; // L: 305
			}
		}
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1034841595"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 309
		return this.groupNameHashTable.get(VerticalAlignment.hashString(var1)); // L: 310
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)I",
		garbageValue = "8192"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 314
		return this.fileNameHashTables[var1].get(VerticalAlignment.hashString(var2)); // L: 315
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1313069490"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 319
		var2 = var2.toLowerCase(); // L: 320
		int var3 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1)); // L: 321
		if (var3 < 0) { // L: 322
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(VerticalAlignment.hashString(var2)); // L: 323
			return var4 >= 0; // L: 324
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1648560407"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 329
		var2 = var2.toLowerCase(); // L: 330
		int var3 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1)); // L: 331
		int var4 = this.fileNameHashTables[var3].get(VerticalAlignment.hashString(var2)); // L: 332
		return this.takeFile(var3, var4); // L: 333
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "842451065"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 337
		var2 = var2.toLowerCase(); // L: 338
		int var3 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1)); // L: 339
		int var4 = this.fileNameHashTables[var3].get(VerticalAlignment.hashString(var2)); // L: 340
		return this.tryLoadFile(var3, var4); // L: 341
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1583460139"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 345
		int var2 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1)); // L: 346
		return this.tryLoadGroup(var2); // L: 347
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1282619653"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 351
		int var2 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1)); // L: 352
		if (var2 >= 0) { // L: 353
			this.loadRegionFromGroup(var2); // L: 354
		}
	} // L: 355

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1956692579"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 358
		int var2 = this.groupNameHashTable.get(VerticalAlignment.hashString(var1)); // L: 359
		return this.groupLoadPercent(var2); // L: 360
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhs;",
		garbageValue = "-107"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 72
		if (var1 != null) { // L: 73
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 74
			var1 = new NPCComposition(); // L: 75
			var1.id = var0; // L: 76
			if (var2 != null) { // L: 77
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 78
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 79
			return var1; // L: 80
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CLnx;B)C",
		garbageValue = "16"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 117
			if (var0 >= 192 && var0 <= 198) { // L: 118
				return 'A';
			}

			if (var0 == 199) { // L: 119
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 120
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 121
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 122
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 123
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 124
				return 'U';
			}

			if (var0 == 221) { // L: 125
				return 'Y';
			}

			if (var0 == 223) { // L: 126
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 127
				return 'a';
			}

			if (var0 == 231) { // L: 128
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 129
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) { // L: 130
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 131
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 132
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 133
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 134
				return 'y';
			}
		}

		if (var0 == 338) { // L: 136
			return 'O';
		} else if (var0 == 339) { // L: 137
			return 'o';
		} else if (var0 == 376) { // L: 138
			return 'Y';
		} else {
			return var0; // L: 139
		}
	}
}
