import java.util.Iterator;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("a")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("hj")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -485058211
	)
	@Export("index")
	int index;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1666198691
	)
	volatile int field3981;
	@ObfuscatedName("n")
	boolean field3989;
	@ObfuscatedName("d")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2011863653
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1947826101
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1638662051
	)
	int field3984;
	@ObfuscatedName("z")
	boolean field3988;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lnk;Lnk;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5); // L: 27
		this.field3981 = 0; // L: 17
		this.field3989 = false; // L: 18
		this.field3984 = -1;
		this.field3988 = false;
		this.archiveDisk = var1; // L: 28
		this.masterDisk = var2; // L: 29
		this.index = var3; // L: 30
		this.field3989 = var6; // L: 31
		this.field3988 = var7; // L: 32
		int var9 = this.index; // L: 34
		if (this.field3988) { // L: 36
			if (var9 <= NetCache.field4031) { // L: 37
				throw new RuntimeException(""); // L: 38
			}

			if (var9 < NetCache.field4015) { // L: 40
				NetCache.field4015 = var9; // L: 41
			}
		} else {
			if (var9 >= NetCache.field4015) { // L: 45
				throw new RuntimeException(""); // L: 46
			}

			if (var9 > NetCache.field4031) { // L: 48
				NetCache.field4031 = var9; // L: 49
			}
		}

		if (UserComparator3.field1385 != null) { // L: 52
			UserComparator3.field1385.offset = var9 * 8 + 5;
			if (UserComparator3.field1385.offset >= UserComparator3.field1385.array.length) {
				if (!this.field3988) { // L: 56
					throw new RuntimeException("");
				}

				this.method5729();
			} else {
				int var10 = UserComparator3.field1385.readInt(); // L: 62
				int var11 = UserComparator3.field1385.readInt(); // L: 63
				this.loadIndex(var10, var11); // L: 64
			}
		} else {
			StudioGame.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 68
			NetCache.NetCache_archives[var9] = this; // L: 69
		}

	} // L: 71

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "104"
	)
	public boolean method5710() {
		return this.field3981 == 1; // L: 74
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-14263237"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3981 == 1 || this.field3988 && this.field3981 == 2) { // L: 78
			return 100;
		} else if (super.groups != null) { // L: 79
			return 99;
		} else {
			int var1 = PlayerComposition.method5528(255, this.index); // L: 80
			if (var1 >= 100) { // L: 81
				var1 = 99;
			}

			return var1; // L: 82
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "31"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index; // L: 86
		long var3 = (long)((var2 << 16) + var1); // L: 88
		NetFileRequest var5 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var3); // L: 89
		if (var5 != null) { // L: 90
			NetCache.NetCache_pendingWritesQueue.addLast(var5); // L: 91
		}

	} // L: 93

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-115"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 96
			AbstractUserComparator.method6637(var1, this.archiveDisk, this);
		} else {
			StudioGame.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 97
		}

	} // L: 98

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "93"
	)
	void method5729() {
		this.field3981 = 2; // L: 101
		super.groupIds = new int[0]; // L: 102
		super.groupCrcs = new int[0]; // L: 103
		super.groupVersions = new int[0]; // L: 104
		super.fileCounts = new int[0]; // L: 105
		super.fileIds = new int[0][]; // L: 106
		super.groups = new Object[0]; // L: 107
		super.files = new Object[0][]; // L: 108
	} // L: 109

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-341729986"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 112
		this.indexVersion = var2; // L: 113
		if (this.masterDisk != null) { // L: 114
			AbstractUserComparator.method6637(this.index, this.masterDisk, this);
		} else {
			StudioGame.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	} // L: 116

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-238018615"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 119
			if (this.field3981 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) { // L: 123
				int var5 = this.index;
				ArchiveDisk var6 = this.masterDisk;
				ArchiveDiskAction var7 = new ArchiveDiskAction();
				var7.type = 0;
				var7.key = (long)var5; // L: 129
				var7.data = var2;
				var7.archiveDisk = var6;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7);
				}

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
					if (ArchiveDiskActionHandler.field3970 == 0) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 138
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 140
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
					}

					ArchiveDiskActionHandler.field3970 = 600; // L: 143
				}
			}

			this.decodeIndex(var2); // L: 148
			this.loadAllLocal(); // L: 149
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 152
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 153
			if (this.archiveDisk != null) { // L: 154
				ArchiveDisk var13 = this.archiveDisk; // L: 155
				ArchiveDiskAction var19 = new ArchiveDiskAction(); // L: 157
				var19.type = 0; // L: 158
				var19.key = (long)var1; // L: 159
				var19.data = var2; // L: 160
				var19.archiveDisk = var13; // L: 161
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 162
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var19); // L: 163
				} // L: 164

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 166
					if (ArchiveDiskActionHandler.field3970 == 0) { // L: 167
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 168
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 169
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 170
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 171
					}

					ArchiveDiskActionHandler.field3970 = 600; // L: 173
				}

				this.validGroups[var1] = true; // L: 177
			}

			if (var4) { // L: 179
				Object[] var21 = super.groups; // L: 180
				Object var20;
				if (var2 == null) { // L: 184
					var20 = null; // L: 185
				} else if (var2.length > 136) { // L: 188
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 190
					var8.set(var2); // L: 191
					var20 = var8; // L: 192
				} else {
					var20 = var2; // L: 206
				}

				var21[var1] = var20; // L: 208
			}
		}

	} // L: 211

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I[BZB)V",
		garbageValue = "51"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 214
			if (this.field3981 == 1) { // L: 215
				throw new RuntimeException(); // L: 216
			}

			if (var3 == null) { // L: 218
				StudioGame.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 219
				return; // L: 220
			}

			Archive_crc.reset(); // L: 222
			Archive_crc.update(var3, 0, var3.length); // L: 223
			var5 = (int)Archive_crc.getValue(); // L: 224
			if (var5 != this.indexCrc) { // L: 225
				StudioGame.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 226
				return; // L: 227
			}

			Buffer var11 = new Buffer(class305.decompressBytes(var3)); // L: 229
			int var12 = var11.readUnsignedByte(); // L: 230
			if (var12 != 5 && var12 != 6) { // L: 231
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 232
			if (var12 >= 6) { // L: 233
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 234
				StudioGame.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 235
				return; // L: 236
			}

			this.decodeIndex(var3); // L: 238
			this.loadAllLocal(); // L: 239
		} else {
			if (!var4 && var2 == this.field3984) { // L: 242
				this.field3981 = 1; // L: 243
			}

			if (var3 == null || var3.length <= 2) { // L: 245
				this.validGroups[var2] = false; // L: 246
				if (this.field3989 || var4) { // L: 247
					StudioGame.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 248
			}

			Archive_crc.reset(); // L: 250
			Archive_crc.update(var3, 0, var3.length - 2); // L: 251
			var5 = (int)Archive_crc.getValue(); // L: 252
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 253
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 254
				this.validGroups[var2] = false; // L: 255
				if (this.field3989 || var4) { // L: 256
					StudioGame.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 257
			}

			this.validGroups[var2] = true; // L: 259
			if (var4) { // L: 260
				Object[] var7 = super.groups; // L: 261
				Object var9;
				if (var3 == null) { // L: 265
					var9 = null; // L: 266
				} else if (var3.length > 136) { // L: 269
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 271
					var10.set(var3); // L: 272
					var9 = var10; // L: 273
				} else {
					var9 = var3; // L: 287
				}

				var7[var2] = var9; // L: 289
			}
		}

	} // L: 292

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 295

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 296
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 297
			this.field3981 = 1; // L: 298
		} else {
			this.field3984 = -1; // L: 301

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 302
				if (super.fileCounts[var1] > 0) { // L: 303
					class360.method6484(var1, this.archiveDisk, this); // L: 304
					this.field3984 = var1; // L: 305
				}
			}

			if (this.field3984 == -1) { // L: 308
				this.field3981 = 1;
			}

		}
	} // L: 299 309

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1701347881"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 312
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : PlayerComposition.method5528(this.index, var1); // L: 313 314
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-699044905"
	)
	public boolean method5719(int var1) {
		return this.validGroups[var1]; // L: 318
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "185534608"
	)
	public boolean method5722(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 322
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-54"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 326
		int var2 = 0; // L: 327

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 328
			if (super.fileCounts[var3] > 0) { // L: 329
				var1 += 100; // L: 330
				var2 += this.groupLoadPercent(var3); // L: 331
			}
		}

		if (var1 == 0) { // L: 334
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 335
			return var3; // L: 336
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpu;",
		garbageValue = "19"
	)
	public static class436 method5751(int var0) {
		class436 var1 = (class436)class436.DBTableType_cache.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = class436.field4669.takeFile(39, var0); // L: 21
			var1 = new class436(); // L: 22
			if (var2 != null) { // L: 23
				var1.method7532(new Buffer(var2));
			}

			var1.method7523(); // L: 24
			class436.DBTableType_cache.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "-75"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 115
			int var3 = var0; // L: 117
			String var2;
			if (var1 && var0 >= 0) { // L: 120
				int var4 = 2; // L: 124

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 125 126 128
					var5 /= 10; // L: 127
				}

				char[] var6 = new char[var4]; // L: 130
				var6[0] = '+'; // L: 131

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 132
					int var8 = var3; // L: 133
					var3 /= 10; // L: 134
					int var9 = var8 - var3 * 10; // L: 135
					if (var9 >= 10) { // L: 136
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 137
					}
				}

				var2 = new String(var6); // L: 139
			} else {
				var2 = Integer.toString(var0, 10); // L: 121
			}

			return var2; // L: 141
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1228918690"
	)
	static void method5750() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 54

		while (var0.hasNext()) { // L: 59
			Message var1 = (Message)var0.next(); // L: 55
			var1.clearIsFromFriend(); // L: 57
		}

	} // L: 60
}
