import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("n")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1917196565
	)
	@Export("index")
	int index;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1314569981
	)
	volatile int field4001;
	@ObfuscatedName("a")
	boolean field3998;
	@ObfuscatedName("d")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 925636457
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2094383779
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 372843791
	)
	int field4006;
	@ObfuscatedName("b")
	boolean field3994;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lng;Lng;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5);
		this.field4001 = 0; // L: 17
		this.field3998 = false;
		this.field4006 = -1;
		this.field3994 = false; // L: 24
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3; // L: 30
		this.field3998 = var6;
		this.field3994 = var7; // L: 32
		class151.method3144(this, this.index); // L: 33
	} // L: 34

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1700609792"
	)
	public boolean method5802() {
		return this.field4001 == 1; // L: 37
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-26876338"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4001 == 1 || this.field3994 && this.field4001 == 2) { // L: 41
			return 100; // L: 45
		} else if (super.groups != null) {
			return 99; // L: 42
		} else {
			int var1 = class263.method5194(255, this.index); // L: 43
			if (var1 >= 100) { // L: 44
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-335585852"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index; // L: 49
		long var3 = (long)((var2 << 16) + var1); // L: 51
		NetFileRequest var5 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var3); // L: 52
		if (var5 != null) { // L: 53
			NetCache.NetCache_pendingWritesQueue.addLast(var5); // L: 54
		}

	} // L: 56

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "586524231"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 59
			ArchiveDisk var2 = this.archiveDisk; // L: 60
			byte[] var4 = null; // L: 63
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 64
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 65
					if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) { // L: 66
						var4 = var6.data; // L: 67
						break; // L: 68
					}
				}
			}

			if (var4 != null) { // L: 72
				this.load(var2, var1, var4, true); // L: 73
			} else {
				byte[] var5 = var2.read(var1); // L: 76
				this.load(var2, var1, var5, true); // L: 77
			}
		} else {
			class181.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 80
		}

	} // L: 81

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1713679762"
	)
	void method5816() {
		this.field4001 = 2; // L: 84
		super.groupIds = new int[0]; // L: 85
		super.groupCrcs = new int[0]; // L: 86
		super.groupVersions = new int[0]; // L: 87
		super.fileCounts = new int[0]; // L: 88
		super.fileIds = new int[0][]; // L: 89
		super.groups = new Object[0]; // L: 90
		super.files = new Object[0][]; // L: 91
	} // L: 92

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1220318907"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 95
		this.indexVersion = var2; // L: 96
		if (this.masterDisk != null) { // L: 97
			UserComparator4.method2647(this.index, this.masterDisk, this);
		} else {
			class181.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 98
		}

	} // L: 99

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I[BZZB)V",
		garbageValue = "1"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 102
			if (this.field4001 == 1) { // L: 103
				throw new RuntimeException(); // L: 104
			}

			if (this.masterDisk != null) { // L: 106
				DecorativeObject.method4515(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 107
			this.loadAllLocal(); // L: 108
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 111
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 112
			if (this.archiveDisk != null) { // L: 113
				DecorativeObject.method4515(var1, var2, this.archiveDisk); // L: 114
				this.validGroups[var1] = true; // L: 115
			}

			if (var4) { // L: 117
				Object[] var5 = super.groups; // L: 118
				Object var7;
				if (var2 == null) { // L: 122
					var7 = null; // L: 123
				} else if (var2.length > 136) { // L: 126
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 128
					var8.set(var2); // L: 129
					var7 = var8; // L: 130
				} else {
					var7 = var2; // L: 144
				}

				var5[var1] = var7; // L: 146
			}
		}

	} // L: 149

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lng;I[BZI)V",
		garbageValue = "-734271793"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 152
			if (this.field4001 == 1) { // L: 153
				throw new RuntimeException(); // L: 154
			}

			if (var3 == null) { // L: 156
				class181.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 157
				return; // L: 158
			}

			Archive_crc.reset(); // L: 160
			Archive_crc.update(var3, 0, var3.length); // L: 161
			var5 = (int)Archive_crc.getValue(); // L: 162
			if (var5 != this.indexCrc) { // L: 163
				class181.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 164
				return; // L: 165
			}

			Buffer var11 = new Buffer(WorldMapDecorationType.decompressBytes(var3)); // L: 167
			int var12 = var11.readUnsignedByte(); // L: 168
			if (var12 != 5 && var12 != 6) { // L: 169
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 170
			if (var12 >= 6) { // L: 171
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 172
				class181.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 173
				return; // L: 174
			}

			this.decodeIndex(var3); // L: 176
			this.loadAllLocal(); // L: 177
		} else {
			if (!var4 && var2 == this.field4006) { // L: 180
				this.field4001 = 1; // L: 181
			}

			if (var3 == null || var3.length <= 2) { // L: 183
				this.validGroups[var2] = false; // L: 184
				if (this.field3998 || var4) { // L: 185
					class181.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 186
			}

			Archive_crc.reset(); // L: 188
			Archive_crc.update(var3, 0, var3.length - 2); // L: 189
			var5 = (int)Archive_crc.getValue(); // L: 190
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 191
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 192
				this.validGroups[var2] = false; // L: 193
				if (this.field3998 || var4) { // L: 194
					class181.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 195
			}

			this.validGroups[var2] = true; // L: 197
			if (var4) { // L: 198
				Object[] var7 = super.groups; // L: 199
				Object var9;
				if (var3 == null) { // L: 203
					var9 = null; // L: 204
				} else if (var3.length > 136) { // L: 207
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 209
					var10.set(var3); // L: 210
					var9 = var10; // L: 211
				} else {
					var9 = var3; // L: 225
				}

				var7[var2] = var9; // L: 227
			}
		}

	} // L: 230

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1288431140"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 233

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 234
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 235
			this.field4001 = 1; // L: 236
		} else {
			this.field4006 = -1; // L: 239

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 240
				if (super.fileCounts[var1] > 0) { // L: 241
					ArchiveDisk var2 = this.archiveDisk; // L: 242
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 245
					var4.type = 1; // L: 246
					var4.key = (long)var1; // L: 247
					var4.archiveDisk = var2; // L: 248
					var4.archive = this; // L: 249
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 250
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 251
					} // L: 252

					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 254
						if (ArchiveDiskActionHandler.field3991 == 0) { // L: 255
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 256
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 257
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 258
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 259
						}

						ArchiveDiskActionHandler.field3991 = 600; // L: 261
					}

					this.field4006 = var1; // L: 265
				}
			}

			if (this.field4006 == -1) { // L: 268
				this.field4001 = 1;
			}

		}
	} // L: 237 269

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1212522629"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 272
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : class263.method5194(this.index, var1); // L: 273 274
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "11"
	)
	public boolean method5812(int var1) {
		return this.validGroups[var1]; // L: 278
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "44"
	)
	public boolean method5813(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 282
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2142440427"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 286
		int var2 = 0; // L: 287

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 288
			if (super.fileCounts[var3] > 0) { // L: 289
				var1 += 100; // L: 290
				var2 += this.groupLoadPercent(var3); // L: 291
			}
		}

		if (var1 == 0) { // L: 294
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 295
			return var3; // L: 296
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "721380110"
	)
	public static String method5850(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lge;IIZI)V",
		garbageValue = "816915237"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10729
		byte var6 = -1; // L: 10730
		String var7 = null; // L: 10731
		if (var5 != null && var5[var3] != null) { // L: 10732
			if (var3 == 0) { // L: 10733
				var6 = 33;
			} else if (var3 == 1) { // L: 10734
				var6 = 34;
			} else if (var3 == 2) { // L: 10735
				var6 = 35;
			} else if (var3 == 3) { // L: 10736
				var6 = 36;
			} else {
				var6 = 37; // L: 10737
			}

			var7 = var5[var3]; // L: 10738
		} else if (var3 == 4) { // L: 10741
			var6 = 37; // L: 10742
			var7 = "Drop"; // L: 10743
		}

		if (var6 != -1 && var7 != null) { // L: 10746
			ViewportMouse.method4487(var7, class82.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4); // L: 10747
		}

	} // L: 10749

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-823191393"
	)
	static void method5847() {
		if (class302.field3596 != null) { // L: 12429
			Client.field773 = Client.cycle; // L: 12430
			class302.field3596.method6055(); // L: 12431

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12432
				if (Client.players[var0] != null) { // L: 12433
					class302.field3596.method6058(class300.baseX * 64 + (Client.players[var0].x >> 7), Message.baseY * 64 + (Client.players[var0].y >> 7)); // L: 12434
				}
			}
		}

	} // L: 12438
}
