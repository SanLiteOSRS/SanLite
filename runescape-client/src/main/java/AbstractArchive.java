import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("of")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1377156489
	)
	static int field4398;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -218182883
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("ay")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("ae")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("ab")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("av")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("ap")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("bu")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("bo")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("bi")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("bq")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1050579779
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("bk")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("bm")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4398 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "27999"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "48"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 209

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-395303036"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 179 180
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "13"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var2 = class409.method7646(var1, 0, var3); // L: 40
		this.hash = var2;
		Buffer var4 = new Buffer(class311.decompressBytes(var1));
		int var5 = var4.readUnsignedByte();
		if (var5 >= 5 && var5 <= 7) {
			if (var5 >= 6) {
				var4.readInt(); // L: 47
			}

			int var6 = var4.readUnsignedByte();
			if (var5 >= 7) {
				this.groupCount = var4.method9625();
			} else {
				this.groupCount = var4.readUnsignedShort(); // L: 52
			}

			int var7 = 0;
			int var8 = -1;
			this.groupIds = new int[this.groupCount];
			int var9;
			if (var5 >= 7) {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupIds[var9] = var7 += var4.method9625(); // L: 58
					if (this.groupIds[var9] > var8) {
						var8 = this.groupIds[var9];
					}
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupIds[var9] = var7 += var4.readUnsignedShort();
					if (this.groupIds[var9] > var8) {
						var8 = this.groupIds[var9];
					}
				}
			}

			this.groupCrcs = new int[var8 + 1];
			this.groupVersions = new int[var8 + 1];
			this.fileCounts = new int[var8 + 1];
			this.fileIds = new int[var8 + 1][];
			this.groups = new Object[var8 + 1]; // L: 72
			this.files = new Object[var8 + 1][];
			if (var6 != 0) {
				this.groupNameHashes = new int[var8 + 1];

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 76
					this.groupNameHashes[this.groupIds[var9]] = var4.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.groupCrcs[this.groupIds[var9]] = var4.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.groupVersions[this.groupIds[var9]] = var4.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.fileCounts[this.groupIds[var9]] = var4.readUnsignedShort();
			}

			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			if (var5 >= 7) {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					var10 = this.groupIds[var9]; // L: 84
					var11 = this.fileCounts[var10]; // L: 85
					var7 = 0;
					var12 = -1;
					this.fileIds[var10] = new int[var11]; // L: 88

					for (var13 = 0; var13 < var11; ++var13) {
						var14 = this.fileIds[var10][var13] = var7 += var4.method9625();
						if (var14 > var12) { // L: 91
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1];
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 97
					var10 = this.groupIds[var9];
					var11 = this.fileCounts[var10];
					var7 = 0; // L: 100
					var12 = -1;
					this.fileIds[var10] = new int[var11];

					for (var13 = 0; var13 < var11; ++var13) { // L: 103
						var14 = this.fileIds[var10][var13] = var7 += var4.readUnsignedShort();
						if (var14 > var12) {
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1];
				}
			}

			if (var6 != 0) {
				this.fileNameHashes = new int[var8 + 1][];
				this.fileNameHashTables = new IntHashTable[var8 + 1]; // L: 112

				for (var9 = 0; var9 < this.groupCount; ++var9) {
					var10 = this.groupIds[var9];
					var11 = this.fileCounts[var10]; // L: 115
					this.fileNameHashes[var10] = new int[this.files[var10].length];

					for (var12 = 0; var12 < var11; ++var12) {
						this.fileNameHashes[var10][this.fileIds[var10][var12]] = var4.readInt();
					}

					this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]); // L: 118
				}
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 121

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "-1721014985"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 126
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "1333978509"
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

			byte[] var5 = WallObject.method5944(this.files[var1][var2], false); // L: 139
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 140
			}

			return var5; // L: 141
		} else {
			return null;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-71"
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "110383370"
	)
	public boolean method7108(int var1) {
		if (this.files.length == 1) { // L: 154
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 155
		} else {
			throw new RuntimeException(); // L: 156
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1341626039"
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

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1611405592"
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

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1039960044"
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "125"
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

			byte[] var4 = WallObject.method5944(this.files[var1][var2], false); // L: 199
			return var4; // L: 200
		} else {
			return null;
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-309427369"
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

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-917756867"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 212 213 215
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1378529587"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files != null && var1 < this.files.length && this.files[var1] != null ? this.files[var1].length : 0; // L: 219 220
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-537477897"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 224
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-77174197"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 228
			this.groups[var1] = null;
		}

	} // L: 229

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-57"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 232
			this.files[var1][var2] = null;
		}

	} // L: 233

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1606759550"
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

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "1509718229"
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
					var21 = WallObject.method5944(this.groups[var1], false); // L: 262
				} else {
					var21 = WallObject.method5944(this.groups[var1], true); // L: 258
					Buffer var8 = new Buffer(var21); // L: 259
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 260
				}

				byte[] var25 = class311.decompressBytes(var21); // L: 265
				if (this.releaseGroups) { // L: 283
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) { // L: 284
					int var22 = var25.length; // L: 285
					--var22; // L: 286
					var10 = var25[var22] & 255;
					var22 -= var10 * var3 * 4; // L: 287
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

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-3"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 388
		return this.groupNameHashTable.get(class350.hashString(var1)); // L: 389
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)I",
		garbageValue = "24"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 393
		return this.fileNameHashTables[var1].get(class350.hashString(var2)); // L: 394
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "-1768998681"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 398
		var2 = var2.toLowerCase(); // L: 399
		int var3 = this.groupNameHashTable.get(class350.hashString(var1)); // L: 400
		if (var3 < 0) { // L: 401
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class350.hashString(var2)); // L: 402
			return var4 >= 0; // L: 403
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "390207284"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 408
		var2 = var2.toLowerCase(); // L: 409
		int var3 = this.groupNameHashTable.get(class350.hashString(var1)); // L: 410
		int var4 = this.fileNameHashTables[var3].get(class350.hashString(var2)); // L: 411
		return this.takeFile(var3, var4); // L: 412
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "7"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 416
		var2 = var2.toLowerCase(); // L: 417
		int var3 = this.groupNameHashTable.get(class350.hashString(var1)); // L: 418
		int var4 = this.fileNameHashTables[var3].get(class350.hashString(var2)); // L: 419
		return this.tryLoadFile(var3, var4); // L: 420
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-83"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 424
		int var2 = this.groupNameHashTable.get(class350.hashString(var1)); // L: 425
		return this.tryLoadGroup(var2); // L: 426
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-320052568"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 430
		int var2 = this.groupNameHashTable.get(class350.hashString(var1)); // L: 431
		if (var2 >= 0) { // L: 432
			this.loadRegionFromGroup(var2); // L: 433
		}
	} // L: 434

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2141753050"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 437
		int var2 = this.groupNameHashTable.get(class350.hashString(var1)); // L: 438
		return this.groupLoadPercent(var2); // L: 439
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "-609300174"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 31
		if (var1 != null) { // L: 32
			int var2 = var0.offset; // L: 33
			var0.writeInt(var1.id); // L: 34

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 35
				if (var1.creationErrors[var3] != 0) { // L: 36
					var0.writeByte(var1.creationErrors[var3]); // L: 37
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 41
						Field var5;
						int var6;
						if (var4 == 0) { // L: 42
							var5 = var1.fields[var3]; // L: 43
							var6 = Reflection.getInt(var5, (Object)null); // L: 44
							var0.writeByte(0); // L: 45
							var0.writeInt(var6); // L: 46
						} else if (var4 == 1) { // L: 48
							var5 = var1.fields[var3]; // L: 49
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 50
							var0.writeByte(0); // L: 51
						} else if (var4 == 2) { // L: 53
							var5 = var1.fields[var3]; // L: 54
							var6 = var5.getModifiers(); // L: 55
							var0.writeByte(0); // L: 56
							var0.writeInt(var6); // L: 57
						}

						Method var25;
						if (var4 != 3) { // L: 59
							if (var4 == 4) { // L: 79
								var25 = var1.methods[var3]; // L: 80
								var6 = var25.getModifiers(); // L: 81
								var0.writeByte(0); // L: 82
								var0.writeInt(var6); // L: 83
							}
						} else {
							var25 = var1.methods[var3]; // L: 60
							byte[][] var10 = var1.arguments[var3]; // L: 61
							Object[] var7 = new Object[var10.length]; // L: 62

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 63
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 64
								var7[var8] = var9.readObject(); // L: 65
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 67
							if (var11 == null) { // L: 68
								var0.writeByte(0);
							} else if (var11 instanceof Number) { // L: 69
								var0.writeByte(1); // L: 70
								var0.writeLong(((Number)var11).longValue()); // L: 71
							} else if (var11 instanceof String) { // L: 73
								var0.writeByte(2); // L: 74
								var0.writeStringCp1252NullTerminated((String)var11); // L: 75
							} else {
								var0.writeByte(4); // L: 77
							}
						}
					} catch (ClassNotFoundException var13) { // L: 86
						var0.writeByte(-10); // L: 87
					} catch (InvalidClassException var14) { // L: 89
						var0.writeByte(-11); // L: 90
					} catch (StreamCorruptedException var15) { // L: 92
						var0.writeByte(-12); // L: 93
					} catch (OptionalDataException var16) { // L: 95
						var0.writeByte(-13); // L: 96
					} catch (IllegalAccessException var17) { // L: 98
						var0.writeByte(-14); // L: 99
					} catch (IllegalArgumentException var18) { // L: 101
						var0.writeByte(-15); // L: 102
					} catch (InvocationTargetException var19) { // L: 104
						var0.writeByte(-16); // L: 105
					} catch (SecurityException var20) { // L: 107
						var0.writeByte(-17); // L: 108
					} catch (IOException var21) { // L: 110
						var0.writeByte(-18); // L: 111
					} catch (NullPointerException var22) { // L: 113
						var0.writeByte(-19); // L: 114
					} catch (Exception var23) { // L: 116
						var0.writeByte(-20); // L: 117
					} catch (Throwable var24) { // L: 119
						var0.writeByte(-21); // L: 120
					}
				}
			}

			var0.writeCrc(var2); // L: 123
			var1.remove(); // L: 124
		}
	} // L: 125
}
