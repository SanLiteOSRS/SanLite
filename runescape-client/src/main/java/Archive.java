import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ax")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1509849729
	)
	@Export("index")
	int index;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -912230569
	)
	volatile int field4172;
	@ObfuscatedName("ar")
	boolean field4173;
	@ObfuscatedName("ak")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 15719519
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 312439331
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 378602323
	)
	int field4178;
	@ObfuscatedName("az")
	public boolean field4179;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpv;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5); // L: 27
		this.field4172 = 0; // L: 17
		this.field4173 = false; // L: 18
		this.field4178 = -1; // L: 23
		this.field4179 = false; // L: 24
		this.archiveDisk = var1; // L: 28
		this.masterDisk = var2; // L: 29
		this.index = var3; // L: 30
		this.field4173 = var6; // L: 31
		this.field4179 = var7; // L: 32
		int var9 = this.index; // L: 34
		if (this.field4179) { // L: 36
			if (var9 <= NetCache.field4219) { // L: 37
				throw new RuntimeException(""); // L: 38
			}

			if (var9 < NetCache.field4220) { // L: 40
				NetCache.field4220 = var9; // L: 41
			}
		} else {
			if (var9 >= NetCache.field4220) { // L: 45
				throw new RuntimeException(""); // L: 46
			}

			if (var9 > NetCache.field4219) { // L: 48
				NetCache.field4219 = var9; // L: 49
			}
		}

		if (HealthBarUpdate.field1223 != null) { // L: 52
			HealthBarUpdate.field1223.offset = var9 * 8 + 5; // L: 54
			if (HealthBarUpdate.field1223.offset >= HealthBarUpdate.field1223.array.length) { // L: 55
				if (!this.field4179) { // L: 56
					throw new RuntimeException(""); // L: 60
				}

				this.method6386(); // L: 57
			} else {
				int var10 = HealthBarUpdate.field1223.readInt(); // L: 62
				int var11 = HealthBarUpdate.field1223.readInt(); // L: 63
				this.loadIndex(var10, var11); // L: 64
			}
		} else {
			DevicePcmPlayerProvider.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 68
			NetCache.NetCache_archives[var9] = this; // L: 69
		}

	} // L: 71

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "596729444"
	)
	public boolean method6424() {
		return this.field4172 == 1; // L: 74
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "71"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4172 != 1 && (!this.field4179 || this.field4172 != 2)) { // L: 78
			if (super.groups != null) { // L: 79
				return 99;
			} else {
				int var2 = this.index; // L: 81
				long var3 = (long)(var2 + 16711680); // L: 83
				int var1;
				if (class133.NetCache_currentResponse != null && class133.NetCache_currentResponse.key == var3) { // L: 84
					var1 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - class133.NetCache_currentResponse.padding) + 1; // L: 88
				} else {
					var1 = 0; // L: 85
				}

				int var5 = var1; // L: 90
				if (var1 >= 100) { // L: 91
					var5 = 99;
				}

				return var5; // L: 92
			}
		} else {
			return 100;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-7"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index; // L: 96
		long var3 = (long)((var2 << 16) + var1); // L: 98
		NetFileRequest var5 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var3); // L: 99
		if (var5 != null) { // L: 100
			NetCache.NetCache_pendingWritesQueue.addLast(var5); // L: 101
		}

	} // L: 103

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 106
			ArchiveDisk var2 = this.archiveDisk; // L: 107
			byte[] var4 = null; // L: 110
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 111
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 112
					if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) { // L: 113
						var4 = var6.data; // L: 114
						break; // L: 115
					}
				}
			}

			if (var4 != null) { // L: 119
				this.load(var2, var1, var4, true); // L: 120
			} else {
				byte[] var5 = var2.read(var1); // L: 123
				this.load(var2, var1, var5, true); // L: 124
			}
		} else {
			DevicePcmPlayerProvider.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 127
		}

	} // L: 128

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1123893577"
	)
	public void method6386() {
		this.field4172 = 2; // L: 131
		super.groupIds = new int[0]; // L: 132
		super.groupCrcs = new int[0]; // L: 133
		super.groupVersions = new int[0]; // L: 134
		super.fileCounts = new int[0]; // L: 135
		super.fileIds = new int[0][]; // L: 136
		super.groups = new Object[0]; // L: 137
		super.files = new Object[0][]; // L: 138
	} // L: 139

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1981775415"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 142
		this.indexVersion = var2; // L: 143
		if (this.masterDisk != null) { // L: 144
			int var3 = this.index; // L: 145
			ArchiveDisk var4 = this.masterDisk; // L: 146
			byte[] var6 = null; // L: 149
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 150
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 151
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) { // L: 152
						var6 = var8.data; // L: 153
						break; // L: 154
					}
				}
			}

			if (var6 != null) { // L: 158
				this.load(var4, var3, var6, true); // L: 159
			} else {
				byte[] var7 = var4.read(var3); // L: 162
				this.load(var4, var3, var7, true); // L: 163
			}
		} else {
			DevicePcmPlayerProvider.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 166
		}

	} // L: 167

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1431655765"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 170
			if (this.field4172 == 1) { // L: 171
				throw new RuntimeException(); // L: 172
			}

			if (this.masterDisk != null) { // L: 174
				HealthBar.method2550(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 175
			this.loadAllLocal(); // L: 176
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 179
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 180
			if (this.archiveDisk != null) { // L: 181
				HealthBar.method2550(var1, var2, this.archiveDisk); // L: 182
				this.validGroups[var1] = true; // L: 183
			}

			if (var4) { // L: 185
				super.groups[var1] = WorldMapRegion.method5050(var2, false);
			}
		}

	} // L: 187

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpv;I[BZI)V",
		garbageValue = "1631564881"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 190
			if (this.field4172 == 1) { // L: 191
				throw new RuntimeException(); // L: 192
			}

			if (var3 == null) { // L: 194
				DevicePcmPlayerProvider.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 195
				return; // L: 196
			}

			Archive_crc.reset(); // L: 198
			Archive_crc.update(var3, 0, var3.length); // L: 199
			var5 = (int)Archive_crc.getValue(); // L: 200
			if (var5 != this.indexCrc) { // L: 201
				DevicePcmPlayerProvider.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 202
				return; // L: 203
			}

			Buffer var9 = new Buffer(Timer.decompressBytes(var3)); // L: 205
			int var7 = var9.readUnsignedByte(); // L: 206
			if (var7 != 5 && var7 != 6) { // L: 207
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 208
			if (var7 >= 6) { // L: 209
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) { // L: 210
				DevicePcmPlayerProvider.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 211
				return; // L: 212
			}

			this.decodeIndex(var3); // L: 214
			this.loadAllLocal(); // L: 215
		} else {
			if (!var4 && var2 == this.field4178) { // L: 218
				this.field4172 = 1; // L: 219
			}

			if (var3 == null || var3.length <= 2) { // L: 221
				this.validGroups[var2] = false; // L: 222
				if (this.field4173 || var4) { // L: 223
					DevicePcmPlayerProvider.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 224
			}

			Archive_crc.reset(); // L: 226
			Archive_crc.update(var3, 0, var3.length - 2); // L: 227
			var5 = (int)Archive_crc.getValue(); // L: 228
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 229
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 230
				this.validGroups[var2] = false; // L: 231
				if (this.field4173 || var4) { // L: 232
					DevicePcmPlayerProvider.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 233
			}

			this.validGroups[var2] = true; // L: 235
			if (var4) { // L: 236
				super.groups[var2] = WorldMapRegion.method5050(var3, false);
			}
		}

	} // L: 238

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-95"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 241

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 242
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 243
			this.field4172 = 1; // L: 244
		} else {
			this.field4178 = -1; // L: 247

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 248
				if (super.fileCounts[var1] > 0) { // L: 249
					class324.method6325(var1, this.archiveDisk, this); // L: 250
					this.field4178 = var1; // L: 251
				}
			}

			if (this.field4178 == -1) { // L: 254
				this.field4172 = 1;
			}

		}
	} // L: 245 255

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-877210204"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 258
			return 100;
		} else if (this.validGroups[var1]) { // L: 259
			return 100;
		} else {
			int var3 = this.index; // L: 261
			long var4 = (long)((var3 << 16) + var1); // L: 263
			int var2;
			if (class133.NetCache_currentResponse != null && class133.NetCache_currentResponse.key == var4) { // L: 264
				var2 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - class133.NetCache_currentResponse.padding) + 1; // L: 268
			} else {
				var2 = 0; // L: 265
			}

			return var2; // L: 270
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-791"
	)
	public boolean method6422(int var1) {
		return this.validGroups[var1]; // L: 274
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "255"
	)
	public boolean method6393(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 278
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1192908559"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 282
		int var2 = 0; // L: 283

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 284
			if (super.fileCounts[var3] > 0) { // L: 285
				var1 += 100; // L: 286
				var2 += this.groupLoadPercent(var3); // L: 287
			}
		}

		if (var1 == 0) { // L: 290
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 291
			return var3; // L: 292
		}
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)Ljava/lang/String;",
		garbageValue = "1359302110"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (WorldMapDecorationType.Widget_unpackTargetMask(ParamComposition.getWidgetFlags(var0)) == 0) { // L: 12103
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12104 12105 12107
		}
	}
}
