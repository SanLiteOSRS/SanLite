import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("s")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1095750709
	)
	@Export("index")
	int index;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 583008577
	)
	volatile int field4137;
	@ObfuscatedName("r")
	boolean field4133;
	@ObfuscatedName("l")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1766307111
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1994509211
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -556768421
	)
	int field4139;
	@ObfuscatedName("u")
	public boolean field4140;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lob;Lob;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5); // L: 27
		this.field4137 = 0; // L: 17
		this.field4133 = false; // L: 18
		this.field4139 = -1; // L: 23
		this.field4140 = false; // L: 24
		this.archiveDisk = var1; // L: 28
		this.masterDisk = var2; // L: 29
		this.index = var3; // L: 30
		this.field4133 = var6; // L: 31
		this.field4140 = var7; // L: 32
		FriendSystem.method1825(this, this.index); // L: 33
	} // L: 34

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "264896575"
	)
	public boolean method6294() {
		return this.field4137 == 1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1558024188"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4137 == 1 || this.field4140 && this.field4137 == 2) { // L: 41
			return 100;
		} else if (super.groups != null) { // L: 42
			return 99;
		} else {
			int var1 = ItemLayer.method4054(255, this.index); // L: 43
			if (var1 >= 100) {
				var1 = 99; // L: 44
			}

			return var1; // L: 45
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "61"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		Decimator.method1108(this.index, var1); // L: 49
	} // L: 50

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1857779270"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 53
			ArchiveDisk var2 = this.archiveDisk; // L: 54
			byte[] var4 = null; // L: 57
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 58
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 59
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) { // L: 60
						var4 = var6.data; // L: 61
						break; // L: 62
					}
				}
			}

			if (var4 != null) { // L: 66
				this.load(var2, var1, var4, true); // L: 67
			} else {
				byte[] var5 = var2.read(var1); // L: 70
				this.load(var2, var1, var5, true); // L: 71
			}
		} else {
			class158.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 74
		}

	} // L: 75

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-2535"
	)
	public void method6306() {
		this.field4137 = 2; // L: 78
		super.groupIds = new int[0]; // L: 79
		super.groupCrcs = new int[0]; // L: 80
		super.groupVersions = new int[0]; // L: 81
		super.fileCounts = new int[0]; // L: 82
		super.fileIds = new int[0][]; // L: 83
		super.groups = new Object[0]; // L: 84
		super.files = new Object[0][]; // L: 85
	} // L: 86

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-787981531"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 89
		this.indexVersion = var2; // L: 90
		if (this.masterDisk != null) { // L: 91
			int var3 = this.index; // L: 92
			ArchiveDisk var4 = this.masterDisk; // L: 93
			byte[] var6 = null; // L: 96
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 97
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 98
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) { // L: 99
						var6 = var8.data; // L: 100
						break; // L: 101
					}
				}
			}

			if (var6 != null) { // L: 105
				this.load(var4, var3, var6, true); // L: 106
			} else {
				byte[] var7 = var4.read(var3); // L: 109
				this.load(var4, var3, var7, true); // L: 110
			}
		} else {
			class158.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 113
		}

	} // L: 114

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "719574940"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 117
			if (this.field4137 == 1) { // L: 118
				throw new RuntimeException(); // L: 119
			}

			if (this.masterDisk != null) { // L: 121
				class86.method2249(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 122
			this.loadAllLocal(); // L: 123
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 126
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 127
			if (this.archiveDisk != null) { // L: 128
				class86.method2249(var1, var2, this.archiveDisk); // L: 129
				this.validGroups[var1] = true; // L: 130
			}

			if (var4) { // L: 132
				super.groups[var1] = class138.method3001(var2, false);
			}
		}

	} // L: 134

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lob;I[BZB)V",
		garbageValue = "-65"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 137
			if (this.field4137 == 1) { // L: 138
				throw new RuntimeException(); // L: 139
			}

			if (var3 == null) { // L: 141
				class158.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 142
				return; // L: 143
			}

			Archive_crc.reset(); // L: 145
			Archive_crc.update(var3, 0, var3.length); // L: 146
			var5 = (int)Archive_crc.getValue(); // L: 147
			if (var5 != this.indexCrc) { // L: 148
				class158.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 149
				return; // L: 150
			}

			Buffer var9 = new Buffer(VertexNormal.decompressBytes(var3)); // L: 152
			int var7 = var9.readUnsignedByte(); // L: 153
			if (var7 != 5 && var7 != 6) { // L: 154
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 155
			if (var7 >= 6) { // L: 156
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 157
				class158.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 158
				return; // L: 159
			}

			this.decodeIndex(var3); // L: 161
			this.loadAllLocal(); // L: 162
		} else {
			if (!var4 && var2 == this.field4139) { // L: 165
				this.field4137 = 1; // L: 166
			}

			if (var3 == null || var3.length <= 2) { // L: 168
				this.validGroups[var2] = false; // L: 169
				if (this.field4133 || var4) { // L: 170
					class158.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 171
			}

			Archive_crc.reset(); // L: 173
			Archive_crc.update(var3, 0, var3.length - 2); // L: 174
			var5 = (int)Archive_crc.getValue(); // L: 175
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 176
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 177
				this.validGroups[var2] = false; // L: 178
				if (this.field4133 || var4) { // L: 179
					class158.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 180
			}

			this.validGroups[var2] = true; // L: 182
			if (var4) { // L: 183
				super.groups[var2] = class138.method3001(var3, false);
			}
		}

	} // L: 185

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 188

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 189
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 190
			this.field4137 = 1; // L: 191
		} else {
			this.field4139 = -1; // L: 194

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 195
				if (super.fileCounts[var1] > 0) { // L: 196
					Coord.method5688(var1, this.archiveDisk, this); // L: 197
					this.field4139 = var1; // L: 198
				}
			}

			if (this.field4139 == -1) { // L: 201
				this.field4137 = 1;
			}

		}
	} // L: 192 202

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "15"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 205
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : ItemLayer.method4054(this.index, var1); // L: 206 207
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1186185048"
	)
	public boolean method6304(int var1) {
		return this.validGroups[var1]; // L: 211
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2123519559"
	)
	public boolean method6298(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 215
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1013746997"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 219
		int var2 = 0; // L: 220

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 221
			if (super.fileCounts[var3] > 0) { // L: 222
				var1 += 100; // L: 223
				var2 += this.groupLoadPercent(var3); // L: 224
			}
		}

		if (var1 == 0) { // L: 227
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 228
			return var3; // L: 229
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1432548013"
	)
	public static int method6338(int var0) {
		return class281.field3279[var0]; // L: 37
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1924896276"
	)
	static void method6307(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1643

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1644
			int var4 = var3 * 32 + 15 + 128; // L: 1645
			int var5 = StructComposition.method3661(var4); // L: 1646
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1647
			int var8 = var1 - 334; // L: 1650
			if (var8 < 0) { // L: 1651
				var8 = 0;
			} else if (var8 > 100) { // L: 1652
				var8 = 100;
			}

			int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 1653
			int var7 = var9 * var5 / 256; // L: 1654
			var2[var3] = var6 * var7 >> 16; // L: 1657
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1659
	} // L: 1660
}
