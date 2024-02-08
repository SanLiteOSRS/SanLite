import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("an")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -171832595
	)
	@Export("index")
	int index;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 490261697
	)
	volatile int field4341;
	@ObfuscatedName("aa")
	boolean field4345;
	@ObfuscatedName("au")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -396704039
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 163935605
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 607421017
	)
	int field4347;
	@ObfuscatedName("az")
	boolean field4348;
	@ObfuscatedName("av")
	boolean field4349;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	class375 field4335;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;Lor;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, class375 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6); // L: 29
		this.field4341 = 0; // L: 17
		this.field4345 = false; // L: 18
		this.field4347 = -1; // L: 23
		this.field4348 = false; // L: 24
		this.field4349 = false; // L: 25
		this.archiveDisk = var1; // L: 30
		this.masterDisk = var2; // L: 31
		this.index = var4; // L: 32
		this.field4345 = var7; // L: 33
		this.field4348 = var8; // L: 34
		this.field4349 = var9; // L: 35
		this.field4335 = var3; // L: 36
		this.field4335.method7125(this, this.index); // L: 37
	} // L: 38

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2080710995"
	)
	public boolean method6983() {
		return this.field4341 == 1; // L: 41
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2143588282"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4341 == 1 || this.field4348 && this.field4341 == 2) { // L: 45
			return 100;
		} else if (super.groups != null) { // L: 46
			return 99;
		} else {
			int var1 = this.field4335.method7132(255, this.index); // L: 47
			if (var1 >= 100) {
				var1 = 99; // L: 48
			}

			return var1; // L: 49
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-402789424"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4335.method7133(this.index, var1); // L: 53
	} // L: 54

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1009267633"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 57
			ArchiveDisk var2 = this.archiveDisk; // L: 58
			byte[] var4 = null; // L: 61
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 62
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 63
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) { // L: 64
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
			this.field4335.method7136(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 78
		}

	} // L: 79

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-758623741"
	)
	void method7014() {
		this.field4341 = 2; // L: 82
		super.groupIds = new int[0]; // L: 83
		super.groupCrcs = new int[0]; // L: 84
		super.groupVersions = new int[0]; // L: 85
		super.fileCounts = new int[0]; // L: 86
		super.fileIds = new int[0][]; // L: 87
		super.groups = new Object[0]; // L: 88
		super.files = new Object[0][]; // L: 89
	} // L: 90

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1742112587"
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
					if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) { // L: 103
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
			this.field4335.method7136(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 117
		}

	} // L: 118

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-2005152498"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 121
			if (this.field4341 == 1) { // L: 122
				throw new RuntimeException(); // L: 123
			}

			if (this.masterDisk != null) { // L: 125
				int var5 = this.index; // L: 126
				ArchiveDisk var6 = this.masterDisk; // L: 127
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 129
				var7.type = 0; // L: 130
				var7.key = (long)var5; // L: 131
				var7.data = var2; // L: 132
				var7.archiveDisk = var6; // L: 133
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 134
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 135
				} // L: 136

				class169.method3549(); // L: 137
			}

			this.decodeIndex(var2); // L: 140
			this.loadAllLocal(); // L: 141
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 144
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 145
			if (this.archiveDisk != null) { // L: 146
				ArchiveDisk var11 = this.archiveDisk; // L: 147
				ArchiveDiskAction var14 = new ArchiveDiskAction(); // L: 149
				var14.type = 0; // L: 150
				var14.key = (long)var1; // L: 151
				var14.data = var2; // L: 152
				var14.archiveDisk = var11; // L: 153
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 154
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var14); // L: 155
				} // L: 156

				class169.method3549(); // L: 157
				this.validGroups[var1] = true; // L: 159
			}

			if (var4) {
				super.groups[var1] = class159.method3462(var2, false); // L: 161
			}
		}

	} // L: 163

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I[BZI)V",
		garbageValue = "-702664386"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 166
			if (this.field4341 == 1) { // L: 167
				throw new RuntimeException(); // L: 168
			}

			if (var3 == null) { // L: 170
				this.field4335.method7136(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 171
				return; // L: 172
			}

			Archive_crc.reset(); // L: 174
			Archive_crc.update(var3, 0, var3.length); // L: 175
			var5 = (int)Archive_crc.getValue(); // L: 176
			if (var5 != this.indexCrc) { // L: 177
				this.field4335.method7136(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 178
				return; // L: 179
			}

			Buffer var9 = new Buffer(UserComparator6.decompressBytes(var3)); // L: 181
			int var7 = var9.readUnsignedByte(); // L: 182
			if (var7 != 5 && var7 != 6) { // L: 183
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 184
			if (var7 >= 6) { // L: 185
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 186
				this.field4335.method7136(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 187
				return; // L: 188
			}

			this.decodeIndex(var3); // L: 190
			this.loadAllLocal(); // L: 191
		} else {
			if (!var4 && var2 == this.field4347) { // L: 194
				this.field4341 = 1; // L: 195
			}

			if (var3 == null || var3.length <= 2) { // L: 197
				this.validGroups[var2] = false; // L: 198
				if (this.field4345 || var4) { // L: 199
					this.field4335.method7136(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 200
			}

			Archive_crc.reset(); // L: 202
			Archive_crc.update(var3, 0, var3.length - 2); // L: 203
			var5 = (int)Archive_crc.getValue(); // L: 204
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 205
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 206
				this.validGroups[var2] = false; // L: 207
				if (this.field4345 || var4) { // L: 208
					this.field4335.method7136(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 209
			}

			this.validGroups[var2] = true; // L: 211
			if (var4) { // L: 212
				super.groups[var2] = class159.method3462(var3, false);
			}
		}

	} // L: 214

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1164117195"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 217

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 218
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 219
			this.field4341 = 1; // L: 220
		} else {
			this.field4347 = -1; // L: 223

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 224
				if (super.fileCounts[var1] > 0) { // L: 225
					ArchiveDisk var2 = this.archiveDisk; // L: 226
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 229
					var4.type = 1; // L: 230
					var4.key = (long)var1; // L: 231
					var4.archiveDisk = var2; // L: 232
					var4.archive = this; // L: 233
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 234
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 235
					} // L: 236

					class169.method3549(); // L: 237
					this.field4347 = var1; // L: 239
				}
			}

			if (this.field4347 == -1) { // L: 242
				this.field4341 = 1;
			}

		}
	} // L: 221 243

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1305673050"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 246
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4335.method7132(this.index, var1); // L: 247 248
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1639496689"
	)
	public boolean method6993(int var1) {
		return this.validGroups[var1]; // L: 252
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-758764736"
	)
	public boolean method6982(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 256
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1303076831"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 260
		int var2 = 0; // L: 261

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 262
			if (super.fileCounts[var3] > 0) { // L: 263
				var1 += 100; // L: 264
				var2 += this.groupLoadPercent(var3); // L: 265
			}
		}

		if (var1 == 0) { // L: 268
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 269
			return var3; // L: 270
		}
	}
}
