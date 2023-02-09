import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("r")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1735268773
	)
	@Export("index")
	int index;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1144192569
	)
	volatile int field4207;
	@ObfuscatedName("k")
	boolean field4208;
	@ObfuscatedName("c")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1537961039
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -822534929
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1889287369
	)
	int field4206;
	@ObfuscatedName("h")
	boolean field4205;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Loi;Loi;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5); // L: 27
		this.field4207 = 0; // L: 17
		this.field4208 = false; // L: 18
		this.field4206 = -1; // L: 23
		this.field4205 = false; // L: 24
		this.archiveDisk = var1; // L: 28
		this.masterDisk = var2; // L: 29
		this.index = var3; // L: 30
		this.field4208 = var6; // L: 31
		this.field4205 = var7; // L: 32
		class350.method6771(this, this.index); // L: 33
	} // L: 34

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2058008546"
	)
	public boolean method6473() {
		return this.field4207 == 1; // L: 37
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "499788298"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4207 != 1 && (!this.field4205 || this.field4207 != 2)) { // L: 41
			if (super.groups != null) { // L: 42
				return 99;
			} else {
				int var2 = this.index; // L: 44
				long var3 = (long)(var2 + 16711680); // L: 46
				int var1;
				if (WorldMapDecoration.NetCache_currentResponse != null && WorldMapDecoration.NetCache_currentResponse.key == var3) { // L: 47
					var1 = class14.NetCache_responseArchiveBuffer.offset * 99 / (class14.NetCache_responseArchiveBuffer.array.length - WorldMapDecoration.NetCache_currentResponse.padding) + 1; // L: 51
				} else {
					var1 = 0; // L: 48
				}

				int var5 = var1; // L: 53
				if (var1 >= 100) { // L: 54
					var5 = 99;
				}

				return var5;
			}
		} else {
			return 100; // L: 55
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1827988769"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		class122.method3030(this.index, var1); // L: 59
	} // L: 60

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-4"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 63
			ArchiveDisk var2 = this.archiveDisk; // L: 64
			byte[] var4 = null; // L: 67
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 68
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 69
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) { // L: 70
						var4 = var6.data; // L: 71
						break; // L: 72
					}
				}
			}

			if (var4 != null) { // L: 76
				this.load(var2, var1, var4, true); // L: 77
			} else {
				byte[] var5 = var2.read(var1); // L: 80
				this.load(var2, var1, var5, true); // L: 81
			}
		} else {
			World.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 84
		}

	} // L: 85

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-342076711"
	)
	void method6480() {
		this.field4207 = 2; // L: 88
		super.groupIds = new int[0]; // L: 89
		super.groupCrcs = new int[0]; // L: 90
		super.groupVersions = new int[0]; // L: 91
		super.fileCounts = new int[0]; // L: 92
		super.fileIds = new int[0][]; // L: 93
		super.groups = new Object[0]; // L: 94
		super.files = new Object[0][]; // L: 95
	} // L: 96

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1215695827"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 99
		this.indexVersion = var2; // L: 100
		if (this.masterDisk != null) { // L: 101
			int var3 = this.index; // L: 102
			ArchiveDisk var4 = this.masterDisk; // L: 103
			byte[] var6 = null; // L: 106
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 107
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 108
					if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) { // L: 109
						var6 = var8.data; // L: 110
						break; // L: 111
					}
				}
			}

			if (var6 != null) { // L: 115
				this.load(var4, var3, var6, true); // L: 116
			} else {
				byte[] var7 = var4.read(var3); // L: 119
				this.load(var4, var3, var7, true); // L: 120
			}
		} else {
			World.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 123
		}

	} // L: 124

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I[BZZB)V",
		garbageValue = "-9"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 127
			if (this.field4207 == 1) { // L: 128
				throw new RuntimeException(); // L: 129
			}

			if (this.masterDisk != null) { // L: 131
				WorldMapSectionType.method5296(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 132
			this.loadAllLocal(); // L: 133
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 136
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 137
			if (this.archiveDisk != null) { // L: 138
				WorldMapSectionType.method5296(var1, var2, this.archiveDisk); // L: 139
				this.validGroups[var1] = true; // L: 140
			}

			if (var4) { // L: 142
				Object[] var5 = super.groups; // L: 143
				Object var7;
				if (var2 == null) { // L: 147
					var7 = null; // L: 148
				} else if (var2.length > 136) { // L: 151
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 153
					var8.set(var2); // L: 154
					var7 = var8; // L: 155
				} else {
					var7 = var2; // L: 169
				}

				var5[var1] = var7; // L: 171
			}
		}

	} // L: 174

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Loi;I[BZB)V",
		garbageValue = "45"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 177
			if (this.field4207 == 1) { // L: 178
				throw new RuntimeException(); // L: 179
			}

			if (var3 == null) { // L: 181
				World.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 182
				return; // L: 183
			}

			Archive_crc.reset(); // L: 185
			Archive_crc.update(var3, 0, var3.length); // L: 186
			var5 = (int)Archive_crc.getValue(); // L: 187
			if (var5 != this.indexCrc) { // L: 188
				World.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 189
				return; // L: 190
			}

			Buffer var11 = new Buffer(class161.decompressBytes(var3)); // L: 192
			int var12 = var11.readUnsignedByte(); // L: 193
			if (var12 != 5 && var12 != 6) { // L: 194
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 195
			if (var12 >= 6) { // L: 196
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 197
				World.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 198
				return; // L: 199
			}

			this.decodeIndex(var3); // L: 201
			this.loadAllLocal(); // L: 202
		} else {
			if (!var4 && var2 == this.field4206) { // L: 205
				this.field4207 = 1; // L: 206
			}

			if (var3 == null || var3.length <= 2) { // L: 208
				this.validGroups[var2] = false; // L: 209
				if (this.field4208 || var4) { // L: 210
					World.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 211
			}

			Archive_crc.reset(); // L: 213
			Archive_crc.update(var3, 0, var3.length - 2); // L: 214
			var5 = (int)Archive_crc.getValue(); // L: 215
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 216
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 217
				this.validGroups[var2] = false; // L: 218
				if (this.field4208 || var4) { // L: 219
					World.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 220
			}

			this.validGroups[var2] = true; // L: 222
			if (var4) { // L: 223
				Object[] var7 = super.groups; // L: 224
				Object var9;
				if (var3 == null) { // L: 228
					var9 = null; // L: 229
				} else if (var3.length > 136) { // L: 232
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 234
					var10.set(var3); // L: 235
					var9 = var10; // L: 236
				} else {
					var9 = var3; // L: 250
				}

				var7[var2] = var9; // L: 252
			}
		}

	} // L: 255

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "110"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 258

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 259
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 260
			this.field4207 = 1; // L: 261
		} else {
			this.field4206 = -1; // L: 264

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 265
				if (super.fileCounts[var1] > 0) { // L: 266
					Players.method2749(var1, this.archiveDisk, this); // L: 267
					this.field4206 = var1; // L: 268
				}
			}

			if (this.field4206 == -1) { // L: 271
				this.field4207 = 1;
			}

		}
	} // L: 262 272

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-821387785"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 275
			return 100;
		} else if (this.validGroups[var1]) { // L: 276
			return 100;
		} else {
			int var3 = this.index; // L: 278
			long var4 = (long)((var3 << 16) + var1); // L: 280
			int var2;
			if (WorldMapDecoration.NetCache_currentResponse != null && WorldMapDecoration.NetCache_currentResponse.key == var4) { // L: 281
				var2 = class14.NetCache_responseArchiveBuffer.offset * 99 / (class14.NetCache_responseArchiveBuffer.array.length - WorldMapDecoration.NetCache_currentResponse.padding) + 1; // L: 285
			} else {
				var2 = 0; // L: 282
			}

			return var2; // L: 287
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1389317722"
	)
	public boolean method6483(int var1) {
		return this.validGroups[var1]; // L: 291
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "124"
	)
	public boolean method6484(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 295
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2147483648"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 299
		int var2 = 0; // L: 300

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 301
			if (super.fileCounts[var3] > 0) { // L: 302
				var1 += 100; // L: 303
				var2 += this.groupLoadPercent(var3); // L: 304
			}
		}

		if (var1 == 0) { // L: 307
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 308
			return var3; // L: 309
		}
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1489138096"
	)
	static void method6515(int var0) {
		SequenceDefinition var1 = class85.SequenceDefinition_get(var0); // L: 13413
		if (var1.isCachedModelIdSet()) { // L: 13414
			if (class70.method2087(var1.SequenceDefinition_cachedModelId) == 2) { // L: 13417
				Client.field797.add(var1.SequenceDefinition_cachedModelId); // L: 13418
			}

		}
	} // L: 13415 13420
}
