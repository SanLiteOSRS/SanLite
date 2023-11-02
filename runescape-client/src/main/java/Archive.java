import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("aa")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 516067263
	)
	@Export("index")
	int index;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -681535421
	)
	volatile int field4308;
	@ObfuscatedName("av")
	boolean field4302;
	@ObfuscatedName("ag")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1674750205
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 909357945
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 797430825
	)
	int field4304;
	@ObfuscatedName("aj")
	boolean field4315;
	@ObfuscatedName("an")
	boolean field4316;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loo;"
	)
	class374 field4317;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lrw;Lrw;Loo;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, class374 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6); // L: 29
		this.field4308 = 0; // L: 17
		this.field4302 = false; // L: 18
		this.field4304 = -1; // L: 23
		this.field4315 = false; // L: 24
		this.field4316 = false; // L: 25
		this.archiveDisk = var1; // L: 30
		this.masterDisk = var2; // L: 31
		this.index = var4; // L: 32
		this.field4302 = var7; // L: 33
		this.field4315 = var8; // L: 34
		this.field4316 = var9; // L: 35
		this.field4317 = var3; // L: 36
		this.field4317.method7002(this, this.index); // L: 37
	} // L: 38

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "792420297"
	)
	public boolean method6856() {
		return this.field4308 == 1; // L: 41
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-266993868"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4308 == 1 || this.field4315 && this.field4308 == 2) { // L: 45
			return 100;
		} else if (super.groups != null) { // L: 46
			return 99;
		} else {
			int var1 = this.field4317.method7006(255, this.index); // L: 47
			if (var1 >= 100) { // L: 48
				var1 = 99;
			}

			return var1; // L: 49
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1737906888"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4317.method7005(this.index, var1); // L: 53
	} // L: 54

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
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
			this.field4317.method7004(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 78
		}

	} // L: 79

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1649823621"
	)
	void method6860() {
		this.field4308 = 2; // L: 82
		super.groupIds = new int[0]; // L: 83
		super.groupCrcs = new int[0]; // L: 84
		super.groupVersions = new int[0]; // L: 85
		super.fileCounts = new int[0]; // L: 86
		super.fileIds = new int[0][]; // L: 87
		super.groups = new Object[0]; // L: 88
		super.files = new Object[0][]; // L: 89
	} // L: 90

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-5167"
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
			this.field4317.method7004(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 117
		}

	} // L: 118

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[BZZS)V",
		garbageValue = "-22741"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 121
			if (this.field4308 == 1) { // L: 122
				throw new RuntimeException(); // L: 123
			}

			if (this.masterDisk != null) { // L: 125
				WorldMapCacheName.method5717(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 126
			this.loadAllLocal(); // L: 127
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 130
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 131
			if (this.archiveDisk != null) { // L: 132
				WorldMapCacheName.method5717(var1, var2, this.archiveDisk); // L: 133
				this.validGroups[var1] = true; // L: 134
			}

			if (var4) { // L: 136
				Object[] var5 = super.groups; // L: 137
				Object var7;
				if (var2 == null) { // L: 141
					var7 = null; // L: 142
				} else if (var2.length > 136) { // L: 145
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 147
					var8.set(var2); // L: 148
					var7 = var8; // L: 149
				} else {
					var7 = var2; // L: 163
				}

				var5[var1] = var7; // L: 165
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrw;I[BZB)V",
		garbageValue = "61"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4308 == 1) {
				throw new RuntimeException(); // L: 173
			}

			if (var3 == null) {
				this.field4317.method7004(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 176
				return; // L: 177
			}

			Archive_crc.reset(); // L: 179
			Archive_crc.update(var3, 0, var3.length); // L: 180
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4317.method7004(this, 255, this.index, this.indexCrc, (byte)0, true);
				return; // L: 184
			}

			Buffer var11 = new Buffer(class372.decompressBytes(var3));
			int var12 = var11.readUnsignedByte(); // L: 187
			if (var12 != 5 && var12 != 6) { // L: 188
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 189
			if (var12 >= 6) { // L: 190
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 191
				this.field4317.method7004(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3); // L: 195
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4304) { // L: 199
				this.field4308 = 1; // L: 200
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false; // L: 203
				if (this.field4302 || var4) { // L: 204
					this.field4317.method7004(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 205
			}

			Archive_crc.reset(); // L: 207
			Archive_crc.update(var3, 0, var3.length - 2); // L: 208
			var5 = (int)Archive_crc.getValue(); // L: 209
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 210
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 211
				this.validGroups[var2] = false; // L: 212
				if (this.field4302 || var4) {
					this.field4317.method7004(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4); // L: 213
				}

				return; // L: 214
			}

			this.validGroups[var2] = true; // L: 216
			if (var4) { // L: 217
				Object[] var7 = super.groups; // L: 218
				Object var9;
				if (var3 == null) { // L: 222
					var9 = null; // L: 223
				} else if (var3.length > 136) { // L: 226
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 228
					var10.set(var3); // L: 229
					var9 = var10; // L: 230
				} else {
					var9 = var3; // L: 244
				}

				var7[var2] = var9; // L: 246
			}
		}

	} // L: 249

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-527981427"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 252

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 253
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 254
			this.field4308 = 1; // L: 255
		} else {
			this.field4304 = -1; // L: 258

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 259
				if (super.fileCounts[var1] > 0) { // L: 260
					SecureRandomFuture.method2199(var1, this.archiveDisk, this); // L: 261
					this.field4304 = var1; // L: 262
				}
			}

			if (this.field4304 == -1) { // L: 265
				this.field4308 = 1;
			}

		}
	} // L: 256 266

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "177421131"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 269
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4317.method7006(this.index, var1); // L: 270 271
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1483404371"
	)
	public boolean method6866(int var1) {
		return this.validGroups[var1]; // L: 275
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-109"
	)
	public boolean method6867(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 279
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 283
		int var2 = 0; // L: 284

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 285
			if (super.fileCounts[var3] > 0) { // L: 286
				var1 += 100; // L: 287
				var2 += this.groupLoadPercent(var3); // L: 288
			}
		}

		if (var1 == 0) { // L: 291
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 292
			return var3; // L: 293
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;B)I",
		garbageValue = "8"
	)
	static int method6897(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 168
		String[] var3 = Login.field939; // L: 170

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 171
			var5 = var3[var4]; // L: 172
			if (var0.tryLoadFileByNames(var5, "")) { // L: 174
				++var2; // L: 175
			}
		}

		var3 = Login.field962; // L: 181

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 182
			var5 = var3[var4]; // L: 183
			if (var1.tryLoadFileByNames(var5, "")) { // L: 185
				++var2; // L: 186
			}
		}

		var3 = Login.field961; // L: 192

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 193
			var5 = var3[var4]; // L: 194
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) { // L: 196
				++var2; // L: 197
			}
		}

		return var2; // L: 202
	}
}
