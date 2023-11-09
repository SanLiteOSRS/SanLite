import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("g")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -175327191
	)
	@Export("index")
	int index;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1245590993
	)
	volatile int field4189;
	@ObfuscatedName("b")
	boolean field4176;
	@ObfuscatedName("j")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 117631983
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 288216263
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 722015315
	)
	int field4190;
	@ObfuscatedName("k")
	boolean field4191;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Loi;Loi;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5); // L: 27
		this.field4189 = 0; // L: 17
		this.field4176 = false; // L: 18
		this.field4190 = -1; // L: 23
		this.field4191 = false; // L: 24
		this.archiveDisk = var1; // L: 28
		this.masterDisk = var2; // L: 29
		this.index = var3; // L: 30
		this.field4176 = var6; // L: 31
		this.field4191 = var7; // L: 32
		class300.method5845(this, this.index); // L: 33
	} // L: 34

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329124045"
	)
	public boolean method6415() {
		return this.field4189 == 1; // L: 37
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1416460864"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4189 == 1 || this.field4191 && this.field4189 == 2) { // L: 41
			return 100;
		} else if (super.groups != null) { // L: 42
			return 99;
		} else {
			int var2 = this.index; // L: 44
			long var3 = (long)(var2 + 16711680); // L: 46
			int var1;
			if (class185.NetCache_currentResponse != null && class185.NetCache_currentResponse.key == var3) { // L: 47
				var1 = ModeWhere.NetCache_responseArchiveBuffer.offset * 99 / (ModeWhere.NetCache_responseArchiveBuffer.array.length - class185.NetCache_currentResponse.padding) + 1; // L: 51
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-25"
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
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
			VarpDefinition.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 90
		}

	} // L: 91

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2108339126"
	)
	void method6419() {
		this.field4189 = 2; // L: 94
		super.groupIds = new int[0]; // L: 95
		super.groupCrcs = new int[0]; // L: 96
		super.groupVersions = new int[0]; // L: 97
		super.fileCounts = new int[0]; // L: 98
		super.fileIds = new int[0][]; // L: 99
		super.groups = new Object[0]; // L: 100
		super.files = new Object[0][]; // L: 101
	} // L: 102

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1668172401"
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
			VarpDefinition.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 129
		}

	} // L: 130

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "908824441"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 133
			if (this.field4189 == 1) { // L: 134
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

				class154.method3300(); // L: 149
			}

			this.decodeIndex(var2); // L: 152
			this.loadAllLocal(); // L: 153
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 156
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 157
			if (this.archiveDisk != null) { // L: 158
				ArchiveDisk var11 = this.archiveDisk; // L: 159
				ArchiveDiskAction var16 = new ArchiveDiskAction(); // L: 161
				var16.type = 0; // L: 162
				var16.key = (long)var1; // L: 163
				var16.data = var2; // L: 164
				var16.archiveDisk = var11; // L: 165
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 166
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var16); // L: 167
				} // L: 168

				class154.method3300(); // L: 169
				this.validGroups[var1] = true; // L: 171
			}

			if (var4) { // L: 173
				Object[] var15 = super.groups; // L: 174
				Object var17;
				if (var2 == null) { // L: 178
					var17 = null; // L: 179
				} else if (var2.length > 136) { // L: 182
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 184
					var8.set(var2); // L: 185
					var17 = var8; // L: 186
				} else {
					var17 = var2; // L: 191
				}

				var15[var1] = var17; // L: 193
			}
		}

	} // L: 196

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Loi;I[BZI)V",
		garbageValue = "-2092582059"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 199
			if (this.field4189 == 1) { // L: 200
				throw new RuntimeException(); // L: 201
			}

			if (var3 == null) { // L: 203
				VarpDefinition.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 204
				return; // L: 205
			}

			Archive_crc.reset(); // L: 207
			Archive_crc.update(var3, 0, var3.length); // L: 208
			var5 = (int)Archive_crc.getValue(); // L: 209
			if (var5 != this.indexCrc) { // L: 210
				VarpDefinition.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 211
				return; // L: 212
			}

			Buffer var11 = new Buffer(WorldMapCacheName.decompressBytes(var3)); // L: 214
			int var12 = var11.readUnsignedByte(); // L: 215
			if (var12 != 5 && var12 != 6) { // L: 216
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 217
			if (var12 >= 6) { // L: 218
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 219
				VarpDefinition.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 220
				return; // L: 221
			}

			this.decodeIndex(var3); // L: 223
			this.loadAllLocal(); // L: 224
		} else {
			if (!var4 && var2 == this.field4190) { // L: 227
				this.field4189 = 1; // L: 228
			}

			if (var3 == null || var3.length <= 2) { // L: 230
				this.validGroups[var2] = false; // L: 231
				if (this.field4176 || var4) { // L: 232
					VarpDefinition.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 233
			}

			Archive_crc.reset(); // L: 235
			Archive_crc.update(var3, 0, var3.length - 2); // L: 236
			var5 = (int)Archive_crc.getValue(); // L: 237
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 238
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 239
				this.validGroups[var2] = false; // L: 240
				if (this.field4176 || var4) { // L: 241
					VarpDefinition.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 242
			}

			this.validGroups[var2] = true; // L: 244
			if (var4) { // L: 245
				Object[] var7 = super.groups; // L: 246
				Object var9;
				if (var3 == null) { // L: 250
					var9 = null; // L: 251
				} else if (var3.length > 136) { // L: 254
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 256
					var10.set(var3); // L: 257
					var9 = var10; // L: 258
				} else {
					var9 = var3; // L: 263
				}

				var7[var2] = var9; // L: 265
			}
		}

	} // L: 268

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1655264850"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 271

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 272
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 273
			this.field4189 = 1; // L: 274
		} else {
			this.field4190 = -1; // L: 277

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 278
				if (super.fileCounts[var1] > 0) { // L: 279
					class272.method5476(var1, this.archiveDisk, this); // L: 280
					this.field4190 = var1; // L: 281
				}
			}

			if (this.field4190 == -1) { // L: 284
				this.field4189 = 1;
			}

		}
	} // L: 275 285

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "266817"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 288
			return 100;
		} else if (this.validGroups[var1]) { // L: 289
			return 100;
		} else {
			int var3 = this.index; // L: 291
			long var4 = (long)((var3 << 16) + var1); // L: 293
			int var2;
			if (class185.NetCache_currentResponse != null && var4 == class185.NetCache_currentResponse.key) { // L: 294
				var2 = ModeWhere.NetCache_responseArchiveBuffer.offset * 99 / (ModeWhere.NetCache_responseArchiveBuffer.array.length - class185.NetCache_currentResponse.padding) + 1; // L: 298
			} else {
				var2 = 0; // L: 295
			}

			return var2; // L: 300
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1932389793"
	)
	public boolean method6424(int var1) {
		return this.validGroups[var1]; // L: 304
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1451159899"
	)
	public boolean method6448(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 308
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-21"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 312
		int var2 = 0; // L: 313

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 314
			if (super.fileCounts[var3] > 0) { // L: 315
				var1 += 100; // L: 316
				var2 += this.groupLoadPercent(var3); // L: 317
			}
		}

		if (var1 == 0) { // L: 320
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 321
			return var3; // L: 322
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1925135714"
	)
	static final boolean method6426(int var0, int var1) {
		ObjectComposition var2 = VarpDefinition.getObjectDefinition(var0); // L: 1046
		if (var1 == 11) { // L: 1047
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 1048
		}

		return var2.method3867(var1); // L: 1049
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "53956374"
	)
	static final void method6455(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) { // L: 12568
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3312()) { // L: 12569
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12570
				if (var2.rank == -1) {
					PacketBufferNode var3 = class136.getPacketBufferNode(ClientPacket.field3055, Client.packetWriter.isaacCipher); // L: 12572
					var3.packetBuffer.writeByte(3 + class13.stringCp1252NullTerminatedByteSize(var2.username.getName())); // L: 12573
					var3.packetBuffer.writeByte(var0); // L: 12574
					var3.packetBuffer.writeShort(var1); // L: 12575
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName()); // L: 12576
					Client.packetWriter.addNode(var3); // L: 12577
				}
			}
		}
	} // L: 12571 12578
}
