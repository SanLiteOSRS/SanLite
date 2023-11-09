import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ao")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 633819505
	)
	@Export("index")
	int index;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1080002433
	)
	volatile int field4249;
	@ObfuscatedName("az")
	boolean field4255;
	@ObfuscatedName("ab")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1442831955
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1295202823
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 211592441
	)
	int field4244;
	@ObfuscatedName("aa")
	boolean field4256;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	class359 field4257;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lrw;Lrw;Lnw;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, class359 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
		super(var5, var6); // L: 28
		this.field4249 = 0; // L: 17
		this.field4255 = false; // L: 18
		this.field4244 = -1; // L: 23
		this.field4256 = false; // L: 24
		this.archiveDisk = var1; // L: 29
		this.masterDisk = var2; // L: 30
		this.index = var4; // L: 31
		this.field4255 = var7; // L: 32
		this.field4256 = var8; // L: 33
		this.field4257 = var3; // L: 34
		this.field4257.method6900(this, this.index); // L: 35
	} // L: 36

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-70000"
	)
	public boolean method6741() {
		return this.field4249 == 1; // L: 39
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-328495537"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4249 == 1 || this.field4256 && this.field4249 == 2) { // L: 43
			return 100;
		} else if (super.groups != null) { // L: 44
			return 99;
		} else {
			int var1 = this.field4257.method6877(255, this.index); // L: 45
			if (var1 >= 100) {
				var1 = 99; // L: 46
			}

			return var1; // L: 47
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-468998802"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4257.method6862(this.index, var1); // L: 51
	} // L: 52

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1781904268"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 55
			GrandExchangeOfferOwnWorldComparator.method1239(var1, this.archiveDisk, this);
		} else {
			this.field4257.method6866(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 56
		}

	} // L: 57

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	void method6747() {
		this.field4249 = 2; // L: 60
		super.groupIds = new int[0]; // L: 61
		super.groupCrcs = new int[0]; // L: 62
		super.groupVersions = new int[0]; // L: 63
		super.fileCounts = new int[0]; // L: 64
		super.fileIds = new int[0][]; // L: 65
		super.groups = new Object[0]; // L: 66
		super.files = new Object[0][]; // L: 67
	} // L: 68

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2081588245"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 71
		this.indexVersion = var2; // L: 72
		if (this.masterDisk != null) { // L: 73
			GrandExchangeOfferOwnWorldComparator.method1239(this.index, this.masterDisk, this);
		} else {
			this.field4257.method6866(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 74
		}

	} // L: 75

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-1785482221"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 78
			if (this.field4249 == 1) { // L: 79
				throw new RuntimeException(); // L: 80
			}

			if (this.masterDisk != null) { // L: 82
				class214.method4333(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 83
			this.loadAllLocal(); // L: 84
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 87
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 88
			if (this.archiveDisk != null) { // L: 89
				class214.method4333(var1, var2, this.archiveDisk); // L: 90
				this.validGroups[var1] = true; // L: 91
			}

			if (var4) { // L: 93
				super.groups[var1] = class20.method324(var2, false);
			}
		}

	} // L: 95

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrw;I[BZI)V",
		garbageValue = "-1322414582"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 98
			if (this.field4249 == 1) { // L: 99
				throw new RuntimeException(); // L: 100
			}

			if (var3 == null) { // L: 102
				this.field4257.method6866(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 103
				return; // L: 104
			}

			Archive_crc.reset(); // L: 106
			Archive_crc.update(var3, 0, var3.length); // L: 107
			var5 = (int)Archive_crc.getValue(); // L: 108
			if (var5 != this.indexCrc) { // L: 109
				this.field4257.method6866(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 110
				return; // L: 111
			}

			Buffer var9 = new Buffer(ObjectComposition.decompressBytes(var3)); // L: 113
			int var7 = var9.readUnsignedByte(); // L: 114
			if (var7 != 5 && var7 != 6) { // L: 115
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 116
			if (var7 >= 6) { // L: 117
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 118
				this.field4257.method6866(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 119
				return; // L: 120
			}

			this.decodeIndex(var3); // L: 122
			this.loadAllLocal(); // L: 123
		} else {
			if (!var4 && var2 == this.field4244) { // L: 126
				this.field4249 = 1; // L: 127
			}

			if (var3 == null || var3.length <= 2) { // L: 129
				this.validGroups[var2] = false; // L: 130
				if (this.field4255 || var4) { // L: 131
					this.field4257.method6866(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 132
			}

			Archive_crc.reset(); // L: 134
			Archive_crc.update(var3, 0, var3.length - 2); // L: 135
			var5 = (int)Archive_crc.getValue(); // L: 136
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 137
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 138
				this.validGroups[var2] = false; // L: 139
				if (this.field4255 || var4) { // L: 140
					this.field4257.method6866(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 141
			}

			this.validGroups[var2] = true; // L: 143
			if (var4) { // L: 144
				super.groups[var2] = class20.method324(var3, false);
			}
		}

	} // L: 146

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-635056076"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 149

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 150
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 151
			this.field4249 = 1; // L: 152
		} else {
			this.field4244 = -1; // L: 155

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 156
				if (super.fileCounts[var1] > 0) { // L: 157
					ArchiveDisk var2 = this.archiveDisk; // L: 158
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 161
					var4.type = 1; // L: 162
					var4.key = (long)var1; // L: 163
					var4.archiveDisk = var2; // L: 164
					var4.archive = this; // L: 165
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 166
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 167
					} // L: 168

					class308.method6016(); // L: 169
					this.field4244 = var1; // L: 171
				}
			}

			if (this.field4244 == -1) { // L: 174
				this.field4249 = 1;
			}

		}
	} // L: 153 175

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-20"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 178
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4257.method6877(this.index, var1); // L: 179 180
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-124"
	)
	public boolean method6718(int var1) {
		return this.validGroups[var1]; // L: 184
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "255"
	)
	public boolean method6714(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 188
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1857820275"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 192
		int var2 = 0; // L: 193

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 194
			if (super.fileCounts[var3] > 0) { // L: 195
				var1 += 100; // L: 196
				var2 += this.groupLoadPercent(var3); // L: 197
			}
		}

		if (var1 == 0) { // L: 200
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 201
			return var3; // L: 202
		}
	}
}
