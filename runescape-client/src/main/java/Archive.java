import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("aq")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2102326873
	)
	@Export("index")
	int index;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1071552705
	)
	volatile int field4270;
	@ObfuscatedName("af")
	boolean field4268;
	@ObfuscatedName("ad")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -522011567
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 813927447
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1263705211
	)
	int field4273;
	@ObfuscatedName("ab")
	boolean field4262;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	class359 field4275;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lru;Lru;Lnf;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, class359 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
		super(var5, var6); // L: 28
		this.field4270 = 0; // L: 17
		this.field4268 = false; // L: 18
		this.field4273 = -1; // L: 23
		this.field4262 = false; // L: 24
		this.archiveDisk = var1; // L: 29
		this.masterDisk = var2; // L: 30
		this.index = var4; // L: 31
		this.field4268 = var7; // L: 32
		this.field4262 = var8; // L: 33
		this.field4275 = var3; // L: 34
		this.field4275.method6794(this, this.index); // L: 35
	} // L: 36

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-432364648"
	)
	public boolean method6676() {
		return this.field4270 == 1; // L: 39
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4270 == 1 || this.field4262 && this.field4270 == 2) { // L: 43
			return 100;
		} else if (super.groups != null) { // L: 44
			return 99;
		} else {
			int var1 = this.field4275.method6814(255, this.index); // L: 45
			if (var1 >= 100) {
				var1 = 99; // L: 46
			}

			return var1; // L: 47
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1272707955"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4275.method6803(this.index, var1); // L: 51
	} // L: 52

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "402130956"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 55
			ArchiveDisk var2 = this.archiveDisk; // L: 56
			byte[] var4 = null; // L: 59
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 60
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 61
					if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) { // L: 62
						var4 = var6.data; // L: 63
						break; // L: 64
					}
				}
			}

			if (var4 != null) { // L: 68
				this.load(var2, var1, var4, true); // L: 69
			} else {
				byte[] var5 = var2.read(var1); // L: 72
				this.load(var2, var1, var5, true); // L: 73
			}
		} else {
			this.field4275.method6796(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 76
		}

	} // L: 77

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6675() {
		this.field4270 = 2; // L: 80
		super.groupIds = new int[0]; // L: 81
		super.groupCrcs = new int[0]; // L: 82
		super.groupVersions = new int[0]; // L: 83
		super.fileCounts = new int[0]; // L: 84
		super.fileIds = new int[0][]; // L: 85
		super.groups = new Object[0]; // L: 86
		super.files = new Object[0][]; // L: 87
	} // L: 88

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "18"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 91
		this.indexVersion = var2; // L: 92
		if (this.masterDisk != null) { // L: 93
			int var3 = this.index; // L: 94
			ArchiveDisk var4 = this.masterDisk; // L: 95
			byte[] var6 = null; // L: 98
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 99
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 100
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) { // L: 101
						var6 = var8.data; // L: 102
						break; // L: 103
					}
				}
			}

			if (var6 != null) { // L: 107
				this.load(var4, var3, var6, true); // L: 108
			} else {
				byte[] var7 = var4.read(var3); // L: 111
				this.load(var4, var3, var7, true); // L: 112
			}
		} else {
			this.field4275.method6796(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 115
		}

	} // L: 116

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1578809524"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 119
			if (this.field4270 == 1) { // L: 120
				throw new RuntimeException(); // L: 121
			}

			if (this.masterDisk != null) { // L: 123
				int var5 = this.index; // L: 124
				ArchiveDisk var6 = this.masterDisk; // L: 125
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 127
				var7.type = 0; // L: 128
				var7.key = (long)var5; // L: 129
				var7.data = var2; // L: 130
				var7.archiveDisk = var6; // L: 131
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 132
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 133
				} // L: 134

				UserComparator8.method2866(); // L: 135
			}

			this.decodeIndex(var2); // L: 138
			this.loadAllLocal(); // L: 139
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 142
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 143
			if (this.archiveDisk != null) { // L: 144
				ArchiveDisk var11 = this.archiveDisk; // L: 145
				ArchiveDiskAction var16 = new ArchiveDiskAction(); // L: 147
				var16.type = 0; // L: 148
				var16.key = (long)var1; // L: 149
				var16.data = var2; // L: 150
				var16.archiveDisk = var11; // L: 151
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 152
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var16); // L: 153
				} // L: 154

				UserComparator8.method2866(); // L: 155
				this.validGroups[var1] = true; // L: 157
			}

			if (var4) { // L: 159
				Object[] var15 = super.groups; // L: 160
				Object var17;
				if (var2 == null) { // L: 164
					var17 = null; // L: 165
				} else if (var2.length > 136) { // L: 168
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 170
					var8.set(var2); // L: 171
					var17 = var8; // L: 172
				} else {
					var17 = var2; // L: 186
				}

				var15[var1] = var17; // L: 188
			}
		}

	} // L: 191

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lru;I[BZI)V",
		garbageValue = "-250323664"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 194
			if (this.field4270 == 1) { // L: 195
				throw new RuntimeException(); // L: 196
			}

			if (var3 == null) { // L: 198
				this.field4275.method6796(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 199
				return; // L: 200
			}

			Archive_crc.reset(); // L: 202
			Archive_crc.update(var3, 0, var3.length); // L: 203
			var5 = (int)Archive_crc.getValue(); // L: 204
			if (var5 != this.indexCrc) { // L: 205
				this.field4275.method6796(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 206
				return; // L: 207
			}

			Buffer var11 = new Buffer(class53.decompressBytes(var3)); // L: 209
			int var12 = var11.readUnsignedByte(); // L: 210
			if (var12 != 5 && var12 != 6) { // L: 211
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 212
			if (var12 >= 6) { // L: 213
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 214
				this.field4275.method6796(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 215
				return; // L: 216
			}

			this.decodeIndex(var3); // L: 218
			this.loadAllLocal(); // L: 219
		} else {
			if (!var4 && var2 == this.field4273) { // L: 222
				this.field4270 = 1; // L: 223
			}

			if (var3 == null || var3.length <= 2) { // L: 225
				this.validGroups[var2] = false; // L: 226
				if (this.field4268 || var4) { // L: 227
					this.field4275.method6796(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 228
			}

			Archive_crc.reset(); // L: 230
			Archive_crc.update(var3, 0, var3.length - 2); // L: 231
			var5 = (int)Archive_crc.getValue(); // L: 232
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 233
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 234
				this.validGroups[var2] = false; // L: 235
				if (this.field4268 || var4) {
					this.field4275.method6796(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4); // L: 236
				}

				return; // L: 237
			}

			this.validGroups[var2] = true; // L: 239
			if (var4) { // L: 240
				Object[] var7 = super.groups; // L: 241
				Object var9;
				if (var3 == null) { // L: 245
					var9 = null; // L: 246
				} else if (var3.length > 136) { // L: 249
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 251
					var10.set(var3); // L: 252
					var9 = var10; // L: 253
				} else {
					var9 = var3; // L: 267
				}

				var7[var2] = var9; // L: 269
			}
		}

	} // L: 272

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1319297597"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 275

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 276
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 277
			this.field4270 = 1; // L: 278
		} else {
			this.field4273 = -1; // L: 281

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 282
				if (super.fileCounts[var1] > 0) { // L: 283
					SceneTilePaint.method4922(var1, this.archiveDisk, this); // L: 284
					this.field4273 = var1; // L: 285
				}
			}

			if (this.field4273 == -1) { // L: 288
				this.field4270 = 1;
			}

		}
	} // L: 279 289

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1917091652"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 292
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4275.method6814(this.index, var1); // L: 293 294
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-354618855"
	)
	public boolean method6659(int var1) {
		return this.validGroups[var1]; // L: 298
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1031243198"
	)
	public boolean method6660(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 302
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-91850240"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 306
		int var2 = 0; // L: 307

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 308
			if (super.fileCounts[var3] > 0) { // L: 309
				var1 += 100; // L: 310
				var2 += this.groupLoadPercent(var3); // L: 311
			}
		}

		if (var1 == 0) { // L: 314
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 315
			return var3; // L: 316
		}
	}
}
