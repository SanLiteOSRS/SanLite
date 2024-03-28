import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ag")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -489476613
	)
	@Export("index")
	int index;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1691528149
	)
	volatile int field4366;
	@ObfuscatedName("al")
	boolean field4374;
	@ObfuscatedName("as")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -49291
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -111857479
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -958861827
	)
	int field4367;
	@ObfuscatedName("aj")
	boolean field4380;
	@ObfuscatedName("au")
	boolean field4381;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	class379 field4382;

	static {
		Archive_crc = new CRC32(); // L: 21
	}

	@ObfuscatedSignature(
		descriptor = "(Lra;Lra;Low;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, class379 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6); // L: 30
		this.field4366 = 0; // L: 18
		this.field4374 = false; // L: 19
		this.field4367 = -1; // L: 24
		this.field4380 = false; // L: 25
		this.field4381 = false; // L: 26
		this.archiveDisk = var1; // L: 31
		this.masterDisk = var2; // L: 32
		this.index = var4; // L: 33
		this.field4374 = var7; // L: 34
		this.field4380 = var8; // L: 35
		this.field4381 = var9; // L: 36
		this.field4382 = var3; // L: 37
		this.field4382.method7051(this, this.index); // L: 38
	} // L: 39

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2082669340"
	)
	public boolean method6907() {
		return this.field4366 == 1; // L: 42
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1118560862"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4366 == 1 || this.field4380 && this.field4366 == 2) { // L: 46
			return 100;
		} else if (super.groups != null) { // L: 47
			return 99;
		} else {
			int var1 = this.field4382.method7058(class376.field4389.field4407, this.index); // L: 48
			if (var1 >= 100) { // L: 49
				var1 = 99;
			}

			return var1; // L: 50
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "131061325"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4382.method7057(this.index, var1); // L: 54
	} // L: 55

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-682763266"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 58
			ArchiveDisk var2 = this.archiveDisk; // L: 59
			byte[] var4 = null; // L: 62
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 63
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 64
					if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) { // L: 65
						var4 = var6.data; // L: 66
						break; // L: 67
					}
				}
			}

			if (var4 != null) { // L: 71
				this.load(var2, var1, var4, true); // L: 72
			} else {
				byte[] var5 = var2.read(var1); // L: 75
				this.load(var2, var1, var5, true); // L: 76
			}
		} else {
			this.field4382.method7056(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 79
		}

	} // L: 80

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6941() {
		this.field4366 = 2; // L: 83
		super.groupIds = new int[0]; // L: 84
		super.groupCrcs = new int[0]; // L: 85
		super.groupVersions = new int[0]; // L: 86
		super.fileCounts = new int[0]; // L: 87
		super.fileIds = new int[0][]; // L: 88
		super.groups = new Object[0]; // L: 89
		super.files = new Object[0][]; // L: 90
	} // L: 91

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "567580415"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 94
		this.indexVersion = var2; // L: 95
		if (this.masterDisk != null) { // L: 96
			int var3 = this.index; // L: 97
			ArchiveDisk var4 = this.masterDisk; // L: 98
			byte[] var6 = null; // L: 101
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 102
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 103
					if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) { // L: 104
						var6 = var8.data; // L: 105
						break; // L: 106
					}
				}
			}

			if (var6 != null) { // L: 110
				this.load(var4, var3, var6, true); // L: 111
			} else {
				byte[] var7 = var4.read(var3); // L: 114
				this.load(var4, var3, var7, true); // L: 115
			}
		} else {
			this.field4382.method7056(this, class376.field4389.field4407, this.index, this.indexCrc, (byte)0, true); // L: 118
		}

	} // L: 119

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I[BZZB)V",
		garbageValue = "-36"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 122
			if (this.field4366 == 1) { // L: 123
				throw new RuntimeException(); // L: 124
			}

			if (this.masterDisk != null) { // L: 126
				class350.method6804(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 127
			this.loadAllLocal(); // L: 128
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 131
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 132
			if (this.archiveDisk != null) { // L: 133
				class350.method6804(var1, var2, this.archiveDisk); // L: 134
				this.validGroups[var1] = true; // L: 135
			}

			if (var4) { // L: 137
				Object[] var5 = super.groups; // L: 138
				Object var7;
				if (var2 == null) { // L: 142
					var7 = null; // L: 143
				} else if (var2.length > 136) { // L: 146
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 148
					var8.set(var2); // L: 149
					var7 = var8; // L: 150
				} else {
					var7 = var2; // L: 164
				}

				var5[var1] = var7; // L: 166
			}
		}

	} // L: 169

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lra;I[BZI)V",
		garbageValue = "-1527143543"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 172
			if (this.field4366 == 1) { // L: 173
				throw new RuntimeException(); // L: 174
			}

			if (var3 == null) { // L: 176
				this.field4382.method7056(this, class376.field4389.field4407, this.index, this.indexCrc, (byte)0, true); // L: 177
				return; // L: 178
			}

			Archive_crc.reset(); // L: 180
			Archive_crc.update(var3, 0, var3.length); // L: 181
			var5 = (int)Archive_crc.getValue(); // L: 182
			if (var5 != this.indexCrc) { // L: 183
				this.field4382.method7056(this, class376.field4389.field4407, this.index, this.indexCrc, (byte)0, true); // L: 184
				return; // L: 185
			}

			Buffer var11 = new Buffer(GrandExchangeOfferUnitPriceComparator.decompressBytes(var3)); // L: 187
			int var12 = var11.readUnsignedByte(); // L: 188
			if (var12 != 5 && var12 != 6) { // L: 189
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 190
			if (var12 >= 6) { // L: 191
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 192
				this.field4382.method7056(this, class376.field4389.field4407, this.index, this.indexCrc, (byte)0, true); // L: 193
				return; // L: 194
			}

			this.decodeIndex(var3); // L: 196
			this.loadAllLocal(); // L: 197
		} else {
			if (!var4 && var2 == this.field4367) { // L: 200
				this.field4366 = 1; // L: 201
			}

			if (var3 == null || var3.length <= 2) { // L: 203
				this.validGroups[var2] = false; // L: 204
				if (this.field4374 || var4) { // L: 205
					this.field4382.method7056(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 206
			}

			Archive_crc.reset(); // L: 208
			Archive_crc.update(var3, 0, var3.length - 2); // L: 209
			var5 = (int)Archive_crc.getValue(); // L: 210
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 211
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 212
				this.validGroups[var2] = false; // L: 213
				if (this.field4374 || var4) {
					this.field4382.method7056(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4); // L: 214
				}

				return; // L: 215
			}

			this.validGroups[var2] = true; // L: 217
			if (var4) { // L: 218
				Object[] var7 = super.groups; // L: 219
				Object var9;
				if (var3 == null) { // L: 223
					var9 = null; // L: 224
				} else if (var3.length > 136) { // L: 227
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 229
					var10.set(var3); // L: 230
					var9 = var10; // L: 231
				} else {
					var9 = var3; // L: 245
				}

				var7[var2] = var9; // L: 247
			}
		}

	} // L: 250

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-643104183"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 253

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 254
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 255
			this.field4366 = 1; // L: 256
		} else {
			this.field4367 = -1; // L: 259

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 260
				if (super.fileCounts[var1] > 0) { // L: 261
					class126.method2947(var1, this.archiveDisk, this); // L: 262
					this.field4367 = var1; // L: 263
				}
			}

			if (this.field4367 == -1) { // L: 266
				this.field4366 = 1;
			}

		}
	} // L: 257 267

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1246061272"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 270
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4382.method7058(this.index, var1); // L: 271 272
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1592630133"
	)
	public boolean method6912(int var1) {
		return this.validGroups[var1]; // L: 276
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "18651121"
	)
	public boolean method6938(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 280
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1906599408"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 284
		int var2 = 0; // L: 285

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 286
			if (super.fileCounts[var3] > 0) { // L: 287
				var1 += 100; // L: 288
				var2 += this.groupLoadPercent(var3); // L: 289
			}
		}

		if (var1 == 0) { // L: 292
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 293
			return var3; // L: 294
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method6949() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 351

			for (int var0 = 0; var0 < class404.idxCount; ++var0) { // L: 352
				UserComparator5.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 353
			JagexCache.JagexCache_randomDat.close(); // L: 354
		} catch (Exception var2) { // L: 356
		}

	} // L: 357

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(II)Luh;",
		garbageValue = "1698671373"
	)
	static class526 method6948(int var0) {
		class526 var1 = (class526)Client.Widget_cachedFonts.get((long)var0); // L: 12996
		if (var1 == null) { // L: 12997
			var1 = new class526(class439.field4743, var0); // L: 12998
		}

		return var1; // L: 13000
	}
}
