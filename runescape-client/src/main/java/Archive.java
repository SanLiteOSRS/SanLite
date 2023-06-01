import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("aw")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1750406067
	)
	@Export("index")
	int index;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -816786499
	)
	volatile int field4244;
	@ObfuscatedName("ag")
	boolean field4245;
	@ObfuscatedName("ad")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 976739087
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 770851089
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1486279051
	)
	int field4247;
	@ObfuscatedName("as")
	boolean field4250;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lqe;Lqe;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5); // L: 27
		this.field4244 = 0; // L: 17
		this.field4245 = false; // L: 18
		this.field4247 = -1; // L: 23
		this.field4250 = false; // L: 24
		this.archiveDisk = var1; // L: 28
		this.masterDisk = var2; // L: 29
		this.index = var3; // L: 30
		this.field4245 = var6; // L: 31
		this.field4250 = var7; // L: 32
		class323.method6094(this, this.index); // L: 33
	} // L: 34

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "18"
	)
	public boolean method6711() {
		return this.field4244 == 1; // L: 37
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1695358811"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4244 == 1 || this.field4250 && this.field4244 == 2) { // L: 41
			return 100;
		} else if (super.groups != null) { // L: 42
			return 99;
		} else {
			int var2 = this.index; // L: 44
			long var3 = (long)(var2 + 16711680); // L: 46
			int var1;
			if (class178.NetCache_currentResponse != null && class178.NetCache_currentResponse.key == var3) { // L: 47
				var1 = class280.NetCache_responseArchiveBuffer.offset * 99 / (class280.NetCache_responseArchiveBuffer.array.length - class178.NetCache_currentResponse.padding) + 1; // L: 51
			} else {
				var1 = 0; // L: 48
			}

			int var5 = var1; // L: 53
			if (var1 >= 100) { // L: 54
				var5 = 99;
			}

			return var5; // L: 55
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1212333650"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index; // L: 59
		long var3 = (long)((var2 << 16) + var1); // L: 61
		NetFileRequest var5 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var3); // L: 62
		if (var5 != null) { // L: 63
			NetCache.NetCache_pendingWritesQueue.addLast(var5); // L: 64
		}

	} // L: 66

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-41"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 69
			ArchiveDisk var2 = this.archiveDisk; // L: 70
			byte[] var4 = null; // L: 73
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 74
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 75
					if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) { // L: 76
						var4 = var6.data; // L: 77
						break; // L: 78
					}
				}
			}

			if (var4 != null) { // L: 82
				this.load(var2, var1, var4, true); // L: 83
			} else {
				byte[] var5 = var2.read(var1); // L: 86
				this.load(var2, var1, var5, true); // L: 87
			}
		} else {
			ApproximateRouteStrategy.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 90
		}

	} // L: 91

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-359286625"
	)
	void method6680() {
		this.field4244 = 2; // L: 94
		super.groupIds = new int[0]; // L: 95
		super.groupCrcs = new int[0]; // L: 96
		super.groupVersions = new int[0]; // L: 97
		super.fileCounts = new int[0]; // L: 98
		super.fileIds = new int[0][]; // L: 99
		super.groups = new Object[0]; // L: 100
		super.files = new Object[0][]; // L: 101
	} // L: 102

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "69"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 105
		this.indexVersion = var2; // L: 106
		if (this.masterDisk != null) { // L: 107
			int var3 = this.index; // L: 108
			ArchiveDisk var4 = this.masterDisk; // L: 109
			byte[] var6 = null; // L: 112
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 113
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 114
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) { // L: 115
						var6 = var8.data; // L: 116
						break; // L: 117
					}
				}
			}

			if (var6 != null) { // L: 121
				this.load(var4, var3, var6, true); // L: 122
			} else {
				byte[] var7 = var4.read(var3); // L: 125
				this.load(var4, var3, var7, true); // L: 126
			}
		} else {
			ApproximateRouteStrategy.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 129
		}

	} // L: 130

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I[BZZB)V",
		garbageValue = "12"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 133
			if (this.field4244 == 1) { // L: 134
				throw new RuntimeException(); // L: 135
			}

			if (this.masterDisk != null) { // L: 137
				int var5 = this.index; // L: 138
				ArchiveDisk var6 = this.masterDisk; // L: 139
				ArchiveDiskAction var7 = new ArchiveDiskAction(); // L: 141
				var7.type = 0; // L: 142
				var7.key = (long)var5; // L: 143
				var7.data = var2; // L: 144
				var7.archiveDisk = var6; // L: 145
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 146
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7); // L: 147
				} // L: 148

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 150
					if (ArchiveDiskActionHandler.field4237 == 0) { // L: 151
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 152
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 153
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 154
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 155
					}

					ArchiveDiskActionHandler.field4237 = 600; // L: 157
				}
			}

			this.decodeIndex(var2); // L: 162
			this.loadAllLocal(); // L: 163
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 166
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 167
			if (this.archiveDisk != null) { // L: 168
				ArchiveDisk var13 = this.archiveDisk; // L: 169
				ArchiveDiskAction var19 = new ArchiveDiskAction(); // L: 171
				var19.type = 0; // L: 172
				var19.key = (long)var1; // L: 173
				var19.data = var2; // L: 174
				var19.archiveDisk = var13; // L: 175
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 176
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var19); // L: 177
				} // L: 178

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 180
					if (ArchiveDiskActionHandler.field4237 == 0) { // L: 181
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 182
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 183
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 184
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 185
					}

					ArchiveDiskActionHandler.field4237 = 600; // L: 187
				}

				this.validGroups[var1] = true; // L: 191
			}

			if (var4) { // L: 193
				Object[] var21 = super.groups; // L: 194
				Object var20;
				if (var2 == null) { // L: 198
					var20 = null; // L: 199
				} else if (var2.length > 136) { // L: 202
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 204
					var8.set(var2); // L: 205
					var20 = var8; // L: 206
				} else {
					var20 = var2; // L: 220
				}

				var21[var1] = var20; // L: 222
			}
		}

	} // L: 225

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I[BZI)V",
		garbageValue = "143230958"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 228
			if (this.field4244 == 1) { // L: 229
				throw new RuntimeException(); // L: 230
			}

			if (var3 == null) { // L: 232
				ApproximateRouteStrategy.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 233
				return; // L: 234
			}

			Archive_crc.reset(); // L: 236
			Archive_crc.update(var3, 0, var3.length); // L: 237
			var5 = (int)Archive_crc.getValue(); // L: 238
			if (var5 != this.indexCrc) { // L: 239
				ApproximateRouteStrategy.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 240
				return; // L: 241
			}

			Buffer var11 = new Buffer(WorldMapSection1.decompressBytes(var3)); // L: 243
			int var12 = var11.readUnsignedByte(); // L: 244
			if (var12 != 5 && var12 != 6) { // L: 245
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 246
			if (var12 >= 6) { // L: 247
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 248
				ApproximateRouteStrategy.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 249
				return; // L: 250
			}

			this.decodeIndex(var3); // L: 252
			this.loadAllLocal(); // L: 253
		} else {
			if (!var4 && var2 == this.field4247) { // L: 256
				this.field4244 = 1; // L: 257
			}

			if (var3 == null || var3.length <= 2) { // L: 259
				this.validGroups[var2] = false; // L: 260
				if (this.field4245 || var4) { // L: 261
					ApproximateRouteStrategy.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 262
			}

			Archive_crc.reset(); // L: 264
			Archive_crc.update(var3, 0, var3.length - 2); // L: 265
			var5 = (int)Archive_crc.getValue(); // L: 266
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 267
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 268
				this.validGroups[var2] = false; // L: 269
				if (this.field4245 || var4) {
					ApproximateRouteStrategy.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4); // L: 270
				}

				return; // L: 271
			}

			this.validGroups[var2] = true; // L: 273
			if (var4) { // L: 274
				Object[] var7 = super.groups; // L: 275
				Object var9;
				if (var3 == null) { // L: 279
					var9 = null; // L: 280
				} else if (var3.length > 136) { // L: 283
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 285
					var10.set(var3); // L: 286
					var9 = var10; // L: 287
				} else {
					var9 = var3; // L: 301
				}

				var7[var2] = var9; // L: 303
			}
		}

	} // L: 306

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-178046378"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 309

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 310
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 311
			this.field4244 = 1; // L: 312
		} else {
			this.field4247 = -1; // L: 315

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 316
				if (super.fileCounts[var1] > 0) { // L: 317
					StructComposition.method3818(var1, this.archiveDisk, this); // L: 318
					this.field4247 = var1; // L: 319
				}
			}

			if (this.field4247 == -1) { // L: 322
				this.field4244 = 1;
			}

		}
	} // L: 313 323

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "76"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 326
			return 100;
		} else if (this.validGroups[var1]) { // L: 327
			return 100;
		} else {
			int var3 = this.index; // L: 329
			long var4 = (long)((var3 << 16) + var1); // L: 331
			int var2;
			if (class178.NetCache_currentResponse != null && var4 == class178.NetCache_currentResponse.key) { // L: 332
				var2 = class280.NetCache_responseArchiveBuffer.offset * 99 / (class280.NetCache_responseArchiveBuffer.array.length - class178.NetCache_currentResponse.padding) + 1; // L: 336
			} else {
				var2 = 0; // L: 333
			}

			return var2; // L: 338
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "224175695"
	)
	public boolean method6669(int var1) {
		return this.validGroups[var1]; // L: 342
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "16"
	)
	public boolean method6681(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 346
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "619239437"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 350
		int var2 = 0; // L: 351

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 352
			if (super.fileCounts[var3] > 0) { // L: 353
				var1 += 100; // L: 354
				var2 += this.groupLoadPercent(var3); // L: 355
			}
		}

		if (var1 == 0) { // L: 358
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 359
			return var3; // L: 360
		}
	}
}
