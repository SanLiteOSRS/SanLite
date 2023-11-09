import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 1039880989
	)
	static int field4213;
	@ObfuscatedName("ao")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("jn")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1596339445
	)
	@Export("index")
	int index;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2103956439
	)
	volatile int field4204;
	@ObfuscatedName("aa")
	boolean field4205;
	@ObfuscatedName("ay")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1710883613
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 17451109
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2028669797
	)
	int field4207;
	@ObfuscatedName("ah")
	boolean field4211;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lqk;Lqk;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5); // L: 27
		this.field4204 = 0; // L: 17
		this.field4205 = false; // L: 18
		this.field4207 = -1; // L: 23
		this.field4211 = false; // L: 24
		this.archiveDisk = var1; // L: 28
		this.masterDisk = var2; // L: 29
		this.index = var3; // L: 30
		this.field4205 = var6; // L: 31
		this.field4211 = var7; // L: 32
		int var9 = this.index; // L: 34
		if (this.field4211) { // L: 36
			if (var9 <= NetCache.field4238) { // L: 37
				throw new RuntimeException(""); // L: 38
			}

			if (var9 < NetCache.field4257) { // L: 40
				NetCache.field4257 = var9; // L: 41
			}
		} else {
			if (var9 >= NetCache.field4257) { // L: 45
				throw new RuntimeException(""); // L: 46
			}

			if (var9 > NetCache.field4238) { // L: 48
				NetCache.field4238 = var9; // L: 49
			}
		}

		if (Login.field928 != null) { // L: 52
			Login.field928.offset = var9 * 8 + 5; // L: 54
			if (Login.field928.offset >= Login.field928.array.length) { // L: 55
				if (!this.field4211) { // L: 56
					throw new RuntimeException(""); // L: 60
				}

				this.method6661(); // L: 57
			} else {
				int var10 = Login.field928.readInt(); // L: 62
				int var11 = Login.field928.readInt(); // L: 63
				this.loadIndex(var10, var11); // L: 64
			}
		} else {
			Message.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 68
			NetCache.NetCache_archives[var9] = this; // L: 69
		}

	} // L: 71

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-28"
	)
	public boolean method6635() {
		return this.field4204 == 1; // L: 74
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4204 == 1 || this.field4211 && this.field4204 == 2) { // L: 78
			return 100;
		} else if (super.groups != null) { // L: 79
			return 99;
		} else {
			int var1 = class20.method305(255, this.index); // L: 80
			if (var1 >= 100) {
				var1 = 99; // L: 81
			}

			return var1; // L: 82
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2103539915"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1884547323"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 96
			ArchiveDisk var2 = this.archiveDisk; // L: 97
			byte[] var4 = null; // L: 100
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 101
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 102
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) { // L: 103
						var4 = var6.data; // L: 104
						break; // L: 105
					}
				}
			}

			if (var4 != null) { // L: 109
				this.load(var2, var1, var4, true); // L: 110
			} else {
				byte[] var5 = var2.read(var1); // L: 113
				this.load(var2, var1, var5, true); // L: 114
			}
		} else {
			Message.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 117
		}

	} // L: 118

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	void method6661() {
		this.field4204 = 2; // L: 121
		super.groupIds = new int[0]; // L: 122
		super.groupCrcs = new int[0]; // L: 123
		super.groupVersions = new int[0]; // L: 124
		super.fileCounts = new int[0]; // L: 125
		super.fileIds = new int[0][]; // L: 126
		super.groups = new Object[0]; // L: 127
		super.files = new Object[0][]; // L: 128
	} // L: 129

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-691028"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 132
		this.indexVersion = var2; // L: 133
		if (this.masterDisk != null) { // L: 134
			int var3 = this.index; // L: 135
			ArchiveDisk var4 = this.masterDisk; // L: 136
			byte[] var6 = null; // L: 139
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 140
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 141
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) { // L: 142
						var6 = var8.data;
						break;
					}
				}
			}

			if (var6 != null) {
				this.load(var4, var3, var6, true);
			} else {
				byte[] var7 = var4.read(var3); // L: 152
				this.load(var4, var3, var7, true); // L: 153
			}
		} else {
			Message.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 156
		}

	} // L: 157

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "681088359"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 160
			if (this.field4204 == 1) { // L: 161
				throw new RuntimeException(); // L: 162
			}

			if (this.masterDisk != null) { // L: 164
				MenuAction.method2041(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 165
			this.loadAllLocal(); // L: 166
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 169
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 170
			if (this.archiveDisk != null) { // L: 171
				MenuAction.method2041(var1, var2, this.archiveDisk); // L: 172
				this.validGroups[var1] = true; // L: 173
			}

			if (var4) { // L: 175
				super.groups[var1] = class108.method2853(var2, false);
			}
		}

	} // L: 177

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqk;I[BZB)V",
		garbageValue = "101"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 180
			if (this.field4204 == 1) { // L: 181
				throw new RuntimeException(); // L: 182
			}

			if (var3 == null) { // L: 184
				Message.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 185
				return; // L: 186
			}

			Archive_crc.reset(); // L: 188
			Archive_crc.update(var3, 0, var3.length); // L: 189
			var5 = (int)Archive_crc.getValue(); // L: 190
			if (var5 != this.indexCrc) { // L: 191
				Message.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 192
				return; // L: 193
			}

			Buffer var9 = new Buffer(class13.decompressBytes(var3)); // L: 195
			int var7 = var9.readUnsignedByte(); // L: 196
			if (var7 != 5 && var7 != 6) { // L: 197
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 198
			if (var7 >= 6) { // L: 199
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 200
				Message.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 201
				return; // L: 202
			}

			this.decodeIndex(var3); // L: 204
			this.loadAllLocal(); // L: 205
		} else {
			if (!var4 && var2 == this.field4207) { // L: 208
				this.field4204 = 1; // L: 209
			}

			if (var3 == null || var3.length <= 2) { // L: 211
				this.validGroups[var2] = false; // L: 212
				if (this.field4205 || var4) { // L: 213
					Message.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 214
			}

			Archive_crc.reset(); // L: 216
			Archive_crc.update(var3, 0, var3.length - 2); // L: 217
			var5 = (int)Archive_crc.getValue(); // L: 218
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 219
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 220
				this.validGroups[var2] = false; // L: 221
				if (this.field4205 || var4) { // L: 222
					Message.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 223
			}

			this.validGroups[var2] = true; // L: 225
			if (var4) { // L: 226
				super.groups[var2] = class108.method2853(var3, false);
			}
		}

	} // L: 228

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "302914766"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 231

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 232
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 233
			this.field4204 = 1; // L: 234
		} else {
			this.field4207 = -1; // L: 237

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 238
				if (super.fileCounts[var1] > 0) { // L: 239
					class236.method4951(var1, this.archiveDisk, this); // L: 240
					this.field4207 = var1; // L: 241
				}
			}

			if (this.field4207 == -1) { // L: 244
				this.field4204 = 1;
			}

		}
	} // L: 235 245

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1973967810"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 248
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : class20.method305(this.index, var1); // L: 249 250
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1783984529"
	)
	public boolean method6650(int var1) {
		return this.validGroups[var1]; // L: 254
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1442403869"
	)
	public boolean method6646(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 258
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 262
		int var2 = 0; // L: 263

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 264
			if (super.fileCounts[var3] > 0) { // L: 265
				var1 += 100; // L: 266
				var2 += this.groupLoadPercent(var3); // L: 267
			}
		}

		if (var1 == 0) { // L: 270
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 271
			return var3; // L: 272
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CLnx;I)I",
		garbageValue = "-1341614150"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 143
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 144
			var0 = Character.toLowerCase(var0); // L: 145
			var2 = (var0 << 4) + 1; // L: 146
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 148
			var2 = 1762;
		}

		return var2; // L: 149
	}
}
