import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("aa")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = -826564107
	)
	static int field4231;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -768850565
	)
	@Export("index")
	int index;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1807050663
	)
	volatile int field4235;
	@ObfuscatedName("af")
	boolean field4228;
	@ObfuscatedName("ao")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 116900827
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 948859093
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 826288613
	)
	int field4241;
	@ObfuscatedName("ag")
	boolean field4242;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lqc;Lqc;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5); // L: 27
		this.field4235 = 0;
		this.field4228 = false;
		this.field4241 = -1;
		this.field4242 = false;
		this.archiveDisk = var1; // L: 28
		this.masterDisk = var2;
		this.index = var3;
		this.field4228 = var6;
		this.field4242 = var7;
		Clock.method3548(this, this.index);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-447317625"
	)
	public boolean method6647() {
		return this.field4235 == 1; // L: 37
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-710094047"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4235 == 1 || this.field4242 && this.field4235 == 2) { // L: 41
			return 100;
		} else if (super.groups != null) { // L: 42
			return 99;
		} else {
			int var1 = PacketBufferNode.method5673(255, this.index); // L: 43
			if (var1 >= 100) {
				var1 = 99; // L: 44
			}

			return var1; // L: 45
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-662286080"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		TextureProvider.method4755(this.index, var1); // L: 49
	} // L: 50

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "44"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			SpriteMask.method5955(var1, this.archiveDisk, this); // L: 53
		} else {
			class341.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 54
		}

	} // L: 55

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1142899829"
	)
	void method6648() {
		this.field4235 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1614804410"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2; // L: 70
		if (this.masterDisk != null) {
			SpriteMask.method5955(this.index, this.masterDisk, this);
		} else {
			class341.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 72
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-669872897"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 76
			if (this.field4235 == 1) { // L: 77
				throw new RuntimeException(); // L: 78
			}

			if (this.masterDisk != null) { // L: 80
				int var5 = this.index; // L: 81
				ArchiveDisk var6 = this.masterDisk; // L: 82
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 84
				var7.type = 0; // L: 85
				var7.key = (long)var5; // L: 86
				var7.data = var2; // L: 87
				var7.archiveDisk = var6; // L: 88
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 89
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 90
				} // L: 91

				class300.method5686(); // L: 92
			}

			this.decodeIndex(var2); // L: 95
			this.loadAllLocal(); // L: 96
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 99
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 100
			if (this.archiveDisk != null) { // L: 101
				ArchiveDisk var11 = this.archiveDisk; // L: 102
				ArchiveDiskAction var14 = new ArchiveDiskAction(); // L: 104
				var14.type = 0; // L: 105
				var14.key = (long)var1; // L: 106
				var14.data = var2; // L: 107
				var14.archiveDisk = var11; // L: 108
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 109
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var14); // L: 110
				} // L: 111

				class300.method5686(); // L: 112
				this.validGroups[var1] = true; // L: 114
			}

			if (var4) {
				super.groups[var1] = class104.method2665(var2, false); // L: 116
			}
		}

	} // L: 118

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqc;I[BZI)V",
		garbageValue = "-149482019"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 121
			if (this.field4235 == 1) { // L: 122
				throw new RuntimeException(); // L: 123
			}

			if (var3 == null) { // L: 125
				class341.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 126
				return; // L: 127
			}

			Archive_crc.reset(); // L: 129
			Archive_crc.update(var3, 0, var3.length); // L: 130
			var5 = (int)Archive_crc.getValue(); // L: 131
			if (var5 != this.indexCrc) { // L: 132
				class341.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 133
				return; // L: 134
			}

			Buffer var9 = new Buffer(NPC.decompressBytes(var3)); // L: 136
			int var7 = var9.readUnsignedByte(); // L: 137
			if (var7 != 5 && var7 != 6) { // L: 138
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 139
			if (var7 >= 6) { // L: 140
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 141
				class341.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 142
				return; // L: 143
			}

			this.decodeIndex(var3); // L: 145
			this.loadAllLocal(); // L: 146
		} else {
			if (!var4 && var2 == this.field4241) { // L: 149
				this.field4235 = 1; // L: 150
			}

			if (var3 == null || var3.length <= 2) { // L: 152
				this.validGroups[var2] = false; // L: 153
				if (this.field4228 || var4) { // L: 154
					class341.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 155
			}

			Archive_crc.reset(); // L: 157
			Archive_crc.update(var3, 0, var3.length - 2); // L: 158
			var5 = (int)Archive_crc.getValue(); // L: 159
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 160
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 161
				this.validGroups[var2] = false; // L: 162
				if (this.field4228 || var4) { // L: 163
					class341.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 164
			}

			this.validGroups[var2] = true; // L: 166
			if (var4) { // L: 167
				super.groups[var2] = class104.method2665(var3, false);
			}
		}

	} // L: 169

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1691266995"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 172

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 173
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 174
			this.field4235 = 1; // L: 175
		} else {
			this.field4241 = -1; // L: 178

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 179
				if (super.fileCounts[var1] > 0) { // L: 180
					WorldMapArea.method5170(var1, this.archiveDisk, this); // L: 181
					this.field4241 = var1; // L: 182
				}
			}

			if (this.field4241 == -1) { // L: 185
				this.field4235 = 1;
			}

		}
	} // L: 176 186

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "36647456"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 189
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : PacketBufferNode.method5673(this.index, var1); // L: 190 191
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "82"
	)
	public boolean method6685(int var1) {
		return this.validGroups[var1]; // L: 195
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2093030557"
	)
	public boolean method6657(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 199
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1624347688"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 203
		int var2 = 0; // L: 204

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 205
			if (super.fileCounts[var3] > 0) { // L: 206
				var1 += 100; // L: 207
				var2 += this.groupLoadPercent(var3); // L: 208
			}
		}

		if (var1 == 0) { // L: 211
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 212
			return var3; // L: 213
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "14"
	)
	public static String method6690(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 58

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 59
			int var5 = var0[var4] & 255; // L: 60
			var3.append(class383.field4391[var5 >>> 2]); // L: 61
			if (var4 < var2 - 1) { // L: 62
				int var6 = var0[var4 + 1] & 255; // L: 63
				var3.append(class383.field4391[(var5 & 3) << 4 | var6 >>> 4]); // L: 64
				if (var4 < var2 - 2) { // L: 65
					int var7 = var0[var4 + 2] & 255; // L: 66
					var3.append(class383.field4391[(var6 & 15) << 2 | var7 >>> 6]).append(class383.field4391[var7 & 63]); // L: 67
				} else {
					var3.append(class383.field4391[(var6 & 15) << 2]).append("="); // L: 69
				}
			} else {
				var3.append(class383.field4391[(var5 & 3) << 4]).append("=="); // L: 71
			}
		}

		return var3.toString(); // L: 73
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "1449504556"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnq;II)Z",
		garbageValue = "1801207784"
	)
	public static boolean method6692(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 238
		if (var2 == null) { // L: 239
			return false;
		} else {
			UserComparator2.SpriteBuffer_decode(var2); // L: 240
			return true; // L: 241
		}
	}
}
