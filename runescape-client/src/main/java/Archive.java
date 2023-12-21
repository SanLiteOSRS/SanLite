import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("av")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1859087545
	)
	@Export("index")
	int index;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1884228769
	)
	volatile int field4280;
	@ObfuscatedName("az")
	boolean field4289;
	@ObfuscatedName("ap")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -881107247
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1090956953
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1160325827
	)
	int field4288;
	@ObfuscatedName("ak")
	boolean field4283;
	@ObfuscatedName("aj")
	boolean field4290;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	class371 field4276;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lrg;Lrg;Loz;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, class371 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6); // L: 29
		this.field4280 = 0; // L: 17
		this.field4289 = false; // L: 18
		this.field4288 = -1; // L: 23
		this.field4283 = false; // L: 24
		this.field4290 = false; // L: 25
		this.archiveDisk = var1; // L: 30
		this.masterDisk = var2; // L: 31
		this.index = var4; // L: 32
		this.field4289 = var7; // L: 33
		this.field4283 = var8; // L: 34
		this.field4290 = var9; // L: 35
		this.field4276 = var3; // L: 36
		this.field4276.method7047(this, this.index); // L: 37
	} // L: 38

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2141667286"
	)
	public boolean method6898() {
		return this.field4280 == 1; // L: 41
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2079566791"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4280 == 1 || this.field4283 && this.field4280 == 2) { // L: 45
			return 100;
		} else if (super.groups != null) { // L: 46
			return 99;
		} else {
			int var1 = this.field4276.method7051(255, this.index); // L: 47
			if (var1 >= 100) {
				var1 = 99; // L: 48
			}

			return var1; // L: 49
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "606874642"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4276.method7050(this.index, var1); // L: 53
	} // L: 54

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-412384319"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 57
			ArchiveDisk var2 = this.archiveDisk; // L: 58
			byte[] var4 = null; // L: 61
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 62
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 63
					if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) { // L: 64
						var4 = var6.data; // L: 65
						break; // L: 66
					}
				}
			}

			if (var4 != null) { // L: 70
				this.load(var2, var1, var4, true); // L: 71
			} else {
				byte[] var5 = var2.read(var1); // L: 74
				this.load(var2, var1, var5, true); // L: 75
			}
		} else {
			this.field4276.method7054(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 78
		}

	} // L: 79

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "152861270"
	)
	void method6902() {
		this.field4280 = 2; // L: 82
		super.groupIds = new int[0]; // L: 83
		super.groupCrcs = new int[0]; // L: 84
		super.groupVersions = new int[0]; // L: 85
		super.fileCounts = new int[0]; // L: 86
		super.fileIds = new int[0][]; // L: 87
		super.groups = new Object[0]; // L: 88
		super.files = new Object[0][]; // L: 89
	} // L: 90

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "949324306"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 93
		this.indexVersion = var2; // L: 94
		if (this.masterDisk != null) { // L: 95
			int var3 = this.index; // L: 96
			ArchiveDisk var4 = this.masterDisk; // L: 97
			byte[] var6 = null; // L: 100
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 101
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 102
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) { // L: 103
						var6 = var8.data; // L: 104
						break; // L: 105
					}
				}
			}

			if (var6 != null) { // L: 109
				this.load(var4, var3, var6, true); // L: 110
			} else {
				byte[] var7 = var4.read(var3); // L: 113
				this.load(var4, var3, var7, true); // L: 114
			}
		} else {
			this.field4276.method7054(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 117
		}

	} // L: 118

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1611170598"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 121
			if (this.field4280 == 1) { // L: 122
				throw new RuntimeException(); // L: 123
			}

			if (this.masterDisk != null) { // L: 125
				CollisionMap.method4381(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 126
			this.loadAllLocal(); // L: 127
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 130
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 131
			if (this.archiveDisk != null) { // L: 132
				CollisionMap.method4381(var1, var2, this.archiveDisk); // L: 133
				this.validGroups[var1] = true; // L: 134
			}

			if (var4) {
				super.groups[var1] = VarcInt.method3598(var2, false); // L: 136
			}
		}

	} // L: 138

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I[BZB)V",
		garbageValue = "0"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 141
			if (this.field4280 == 1) { // L: 142
				throw new RuntimeException(); // L: 143
			}

			if (var3 == null) { // L: 145
				this.field4276.method7054(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 146
				return; // L: 147
			}

			Archive_crc.reset(); // L: 149
			Archive_crc.update(var3, 0, var3.length); // L: 150
			var5 = (int)Archive_crc.getValue(); // L: 151
			if (var5 != this.indexCrc) { // L: 152
				this.field4276.method7054(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 153
				return; // L: 154
			}

			Buffer var9 = new Buffer(class30.decompressBytes(var3)); // L: 156
			int var7 = var9.readUnsignedByte(); // L: 157
			if (var7 != 5 && var7 != 6) { // L: 158
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 159
			if (var7 >= 6) { // L: 160
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 161
				this.field4276.method7054(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 162
				return; // L: 163
			}

			this.decodeIndex(var3); // L: 165
			this.loadAllLocal(); // L: 166
		} else {
			if (!var4 && var2 == this.field4288) { // L: 169
				this.field4280 = 1; // L: 170
			}

			if (var3 == null || var3.length <= 2) { // L: 172
				this.validGroups[var2] = false; // L: 173
				if (this.field4289 || var4) { // L: 174
					this.field4276.method7054(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 175
			}

			Archive_crc.reset(); // L: 177
			Archive_crc.update(var3, 0, var3.length - 2); // L: 178
			var5 = (int)Archive_crc.getValue(); // L: 179
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 180
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 181
				this.validGroups[var2] = false; // L: 182
				if (this.field4289 || var4) { // L: 183
					this.field4276.method7054(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 184
			}

			this.validGroups[var2] = true; // L: 186
			if (var4) { // L: 187
				super.groups[var2] = VarcInt.method3598(var3, false);
			}
		}

	} // L: 189

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-65241547"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 192

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 193
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 194
			this.field4280 = 1; // L: 195
		} else {
			this.field4288 = -1; // L: 198

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 199
				if (super.fileCounts[var1] > 0) { // L: 200
					ArchiveDisk var2 = this.archiveDisk; // L: 201
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 204
					var4.type = 1; // L: 205
					var4.key = (long)var1; // L: 206
					var4.archiveDisk = var2; // L: 207
					var4.archive = this; // L: 208
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 209
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 210
					} // L: 211

					synchronized(ArchiveDiskActionHandler.field4272) { // L: 213
						if (ArchiveDiskActionHandler.field4271 == 0) { // L: 214
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 215
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 216
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 217
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 218
						}

						ArchiveDiskActionHandler.field4271 = 600; // L: 220
						ArchiveDiskActionHandler.field4274 = false; // L: 221
					}

					this.field4288 = var1; // L: 225
				}
			}

			if (this.field4288 == -1) { // L: 228
				this.field4280 = 1;
			}

		}
	} // L: 196 229

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-788412100"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 232
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4276.method7051(this.index, var1); // L: 233 234
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1250672154"
	)
	public boolean method6908(int var1) {
		return this.validGroups[var1]; // L: 238
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "48"
	)
	public boolean method6909(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 242
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "939033209"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 246
		int var2 = 0; // L: 247

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 248
			if (super.fileCounts[var3] > 0) { // L: 249
				var1 += 100; // L: 250
				var2 += this.groupLoadPercent(var3); // L: 251
			}
		}

		if (var1 == 0) { // L: 254
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 255
			return var3; // L: 256
		}
	}
}
