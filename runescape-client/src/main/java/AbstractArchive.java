import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -592681403
	)
	static int field3599;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2033401093
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("g")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("t")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("u")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("q")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("s")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("p")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("c")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lox;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("l")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("w")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1153167145
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("ak")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("ad")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor();
		field3599 = 0;
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "341986030"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1768582746"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1362561714"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "619109968"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		this.hash = ItemLayer.method3863(var1, var1.length);
		Buffer var2 = new Buffer(class106.decompressBytes(var1));
		int var3 = var2.readUnsignedByte();
		if (var3 >= 5 && var3 <= 7) {
			if (var3 >= 6) {
				var2.readInt();
			}

			int var4 = var2.readUnsignedByte();
			if (var3 >= 7) {
				this.groupCount = var2.method6629();
			} else {
				this.groupCount = var2.readUnsignedShort();
			}

			int var5 = 0;
			int var6 = -1;
			this.groupIds = new int[this.groupCount];
			int var7;
			if (var3 >= 7) {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupIds[var7] = var5 += var2.method6629();
					if (this.groupIds[var7] > var6) {
						var6 = this.groupIds[var7];
					}
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					this.groupIds[var7] = var5 += var2.readUnsignedShort();
					if (this.groupIds[var7] > var6) {
						var6 = this.groupIds[var7];
					}
				}
			}

			this.groupCrcs = new int[var6 + 1];
			this.groupVersions = new int[var6 + 1];
			this.fileCounts = new int[var6 + 1];
			this.fileIds = new int[var6 + 1][];
			this.groups = new Object[var6 + 1];
			this.files = new Object[var6 + 1][];
			if (var4 != 0) {
				this.groupNameHashes = new int[var6 + 1];

				for (var7 = 0; var7 < this.groupCount; ++var7) {
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
					var5 = 0;
					var10 = -1;
					this.fileIds[var8] = new int[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var12 = this.fileIds[var8][var11] = var5 += var2.method6629();
						if (var12 > var10) {
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1];
				}
			} else {
				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					var5 = 0;
					var10 = -1;
					this.fileIds[var8] = new int[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var12 = this.fileIds[var8][var11] = var5 += var2.readUnsignedShort();
						if (var12 > var10) {
							var10 = var12;
						}
					}

					this.files[var8] = new Object[var10 + 1];
				}
			}

			if (var4 != 0) {
				this.fileNameHashes = new int[var6 + 1][];
				this.fileNameHashTables = new IntHashTable[var6 + 1];

				for (var7 = 0; var7 < this.groupCount; ++var7) {
					var8 = this.groupIds[var7];
					var9 = this.fileCounts[var8];
					this.fileNameHashes[var8] = new int[this.files[var8].length];

					for (var10 = 0; var10 < var9; ++var10) {
						this.fileNameHashes[var8][this.fileIds[var8][var10]] = var2.readInt();
					}

					this.fileNameHashTables[var8] = new IntHashTable(this.fileNameHashes[var8]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIS)[B",
		garbageValue = "-23090"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "456038683"
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

			byte[] var5 = class304.method5597(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}

			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "974691239"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public boolean method5071(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) {
			return true;
		} else {
			this.loadGroup(var1);
			return this.groups[var1] != null;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1206998992"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true;

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) {
			int var3 = this.groupIds[var2];
			if (this.groups[var3] == null) {
				this.loadGroup(var3);
				if (this.groups[var3] == null) {
					var1 = false;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-1122798118"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)[B",
		garbageValue = "1973943836"
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

			byte[] var4 = class304.method5597(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "2061465489"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1723486034"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-404024789"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-95"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "282074373"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-952876246"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) {
			if (this.files[var1] != null) {
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
					this.files[var1][var2] = null;
				}
			}
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Z",
		garbageValue = "0"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) {
			return false;
		} else {
			int var3 = this.fileCounts[var1];
			int[] var4 = this.fileIds[var1];
			Object[] var5 = this.files[var1];
			boolean var6 = true;

			for (int var7 = 0; var7 < var3; ++var7) {
				if (var5[var4[var7]] == null) {
					var6 = false;
					break;
				}
			}

			if (var6) {
				return true;
			} else {
				byte[] var21;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
					var21 = class304.method5597(this.groups[var1], false);
				} else {
					var21 = class304.method5597(this.groups[var1], true);
					Buffer var8 = new Buffer(var21);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				}

				byte[] var25 = class106.decompressBytes(var21);
				if (this.releaseGroups) {
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) {
					int var22 = var25.length;
					--var22;
					var10 = var25[var22] & 255;
					var22 -= var3 * var10 * 4;
					Buffer var11 = new Buffer(var25);
					int[] var12 = new int[var3];
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

					var11.offset = var22;
					var14 = 0;

					int var17;
					for (var15 = 0; var15 < var10; ++var15) {
						int var24 = 0;

						for (var17 = 0; var17 < var3; ++var17) {
							var24 += var11.readInt();
							System.arraycopy(var25, var14, var23[var17], var12[var17], var24);
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
								var18 = var19;
							}

							var5[var17] = var18;
						} else {
							var5[var4[var15]] = var23[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var10 = var4[0];
					Object var26;
					if (var25 == null) {
						var26 = null;
					} else if (var25.length > 136) {
						DirectByteArrayCopier var27 = new DirectByteArrayCopier();
						var27.set(var25);
						var26 = var27;
					} else {
						var26 = var25;
					}

					var5[var10] = var26;
				} else {
					var5[var4[0]] = var25;
				}

				return true;
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "48"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(FontName.hashString(var1));
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "1136247668"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(FontName.hashString(var2));
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
		garbageValue = "-116"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(FontName.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(FontName.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "1041405463"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(FontName.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(FontName.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "1893660482"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(FontName.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(FontName.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "2073972058"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(FontName.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2081300499"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(FontName.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "366192275"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(FontName.hashString(var1));
		return this.groupLoadPercent(var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lns;B)V",
		garbageValue = "101"
	)
	static final void method5160(PacketBuffer var0) {
		int var1 = 0;
		var0.importIndex();

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) {
			var5 = Players.Players_indices[var2];
			if ((Players.field1372[var5] & 1) == 0) {
				if (var1 > 0) {
					--var1;
					var10000 = Players.field1372;
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1);
					if (var4 == 0) {
						var1 = class244.method4805(var0);
						var10000 = Players.field1372;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						GrandExchangeOfferWorldComparator.readPlayerUpdate(var0, var5);
					}
				}
			}
		}

		var0.exportIndex();
		if (var1 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();

			for (var2 = 0; var2 < Players.Players_count; ++var2) {
				var5 = Players.Players_indices[var2];
				if ((Players.field1372[var5] & 1) != 0) {
					if (var1 > 0) {
						--var1;
						var10000 = Players.field1372;
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1);
						if (var4 == 0) {
							var1 = class244.method4805(var0);
							var10000 = Players.field1372;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							GrandExchangeOfferWorldComparator.readPlayerUpdate(var0, var5);
						}
					}
				}
			}

			var0.exportIndex();
			if (var1 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
					var5 = Players.Players_emptyIndices[var2];
					if ((Players.field1372[var5] & 1) != 0) {
						if (var1 > 0) {
							--var1;
							var10000 = Players.field1372;
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1);
							if (var4 == 0) {
								var1 = class244.method4805(var0);
								var10000 = Players.field1372;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class35.updateExternalPlayer(var0, var5)) {
								var10000 = Players.field1372;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex();
				if (var1 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) {
						var5 = Players.Players_emptyIndices[var2];
						if ((Players.field1372[var5] & 1) == 0) {
							if (var1 > 0) {
								--var1;
								var10000 = Players.field1372;
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1);
								if (var4 == 0) {
									var1 = class244.method4805(var0);
									var10000 = Players.field1372;
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class35.updateExternalPlayer(var0, var5)) {
									var10000 = Players.field1372;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex();
					if (var1 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;

						for (var2 = 1; var2 < 2048; ++var2) {
							var10000 = Players.field1372;
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2];
							if (var3 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2;
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1724921062"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}
}
