import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("h")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 935537311
	)
	@Export("index")
	int index;
	@ObfuscatedName("o")
	volatile boolean field3562;
	@ObfuscatedName("m")
	boolean field3566;
	@ObfuscatedName("r")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 449580407
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1844159497
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1224107027
	)
	int field3572;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.field3562 = false;
		this.field3566 = false;
		this.field3572 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3566 = var6;
		int var8 = this.index;
		if (UserComparator6.NetCache_reference != null) {
			UserComparator6.NetCache_reference.offset = var8 * 8 + 5;
			int var9 = UserComparator6.NetCache_reference.readInt();
			int var10 = UserComparator6.NetCache_reference.readInt();
			this.loadIndex(var9, var10);
		} else {
			MenuAction.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var8] = this;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1162495531"
	)
	public boolean method5044() {
		return this.field3562;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "976210931"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3562) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var2 = this.index;
			long var3 = (long)(var2 + 16711680);
			int var1;
			if (class34.NetCache_currentResponse != null && var3 == class34.NetCache_currentResponse.key) {
				var1 = class254.NetCache_responseArchiveBuffer.offset * 99 / (class254.NetCache_responseArchiveBuffer.array.length - class34.NetCache_currentResponse.padding) + 1;
			} else {
				var1 = 0;
			}

			int var5 = var1;
			if (var1 >= 100) {
				var5 = 99;
			}

			return var5;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "341986030"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index;
		long var3 = (long)((var2 << 16) + var1);
		NetFileRequest var5 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var3);
		if (var5 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var5);
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1768582746"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			PendingSpawn.method2261(var1, this.archiveDisk, this);
		} else {
			MenuAction.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1807724358"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			PendingSpawn.method2261(this.index, this.masterDisk, this);
		} else {
			MenuAction.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1456040345"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3562) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				int var5 = this.index;
				ArchiveDisk var6 = this.masterDisk;
				ArchiveDiskAction var7 = new ArchiveDiskAction();
				var7.type = 0;
				var7.key = (long)var5;
				var7.data = var2;
				var7.archiveDisk = var6;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7);
				}

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
					if (ArchiveDiskActionHandler.field3557 == 0) {
						class305.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						class305.ArchiveDiskActionHandler_thread.setDaemon(true);
						class305.ArchiveDiskActionHandler_thread.start();
						class305.ArchiveDiskActionHandler_thread.setPriority(5);
					}

					ArchiveDiskActionHandler.field3557 = 600;
				}
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				ArchiveDisk var13 = this.archiveDisk;
				ArchiveDiskAction var19 = new ArchiveDiskAction();
				var19.type = 0;
				var19.key = (long)var1;
				var19.data = var2;
				var19.archiveDisk = var13;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var19);
				}

				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
					if (ArchiveDiskActionHandler.field3557 == 0) {
						class305.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						class305.ArchiveDiskActionHandler_thread.setDaemon(true);
						class305.ArchiveDiskActionHandler_thread.start();
						class305.ArchiveDiskActionHandler_thread.setPriority(5);
					}

					ArchiveDiskActionHandler.field3557 = 600;
				}

				this.validGroups[var1] = true;
			}

			if (var4) {
				Object[] var21 = super.groups;
				Object var20;
				if (var2 == null) {
					var20 = null;
				} else if (var2.length > 136) {
					DirectByteArrayCopier var8 = new DirectByteArrayCopier();
					var8.set(var2);
					var20 = var8;
				} else {
					var20 = var2;
				}

				var21[var1] = var20;
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lla;I[BZI)V",
		garbageValue = "2098263983"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3562) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				MenuAction.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				MenuAction.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var11 = new Buffer(class106.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 != 5 && var12 != 6) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) {
				MenuAction.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field3572) {
				this.field3562 = true;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field3566 || var4) {
					MenuAction.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field3566 || var4) {
					MenuAction.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				Object[] var7 = super.groups;
				Object var9;
				if (var3 == null) {
					var9 = null;
				} else if (var3.length > 136) {
					DirectByteArrayCopier var10 = new DirectByteArrayCopier();
					var10.set(var3);
					var9 = var10;
				} else {
					var9 = var3;
				}

				var7[var2] = var9;
			}
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field3562 = true;
		} else {
			this.field3572 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					MouseHandler.method727(var1, this.archiveDisk, this);
					this.field3572 = var1;
				}
			}

			if (this.field3572 == -1) {
				this.field3562 = true;
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1362561714"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : class248.method4915(this.index, var1);
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1991091922"
	)
	public boolean method5030(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public boolean method5031(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "21"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0;
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) {
			if (super.fileCounts[var3] > 0) {
				var1 += 100;
				var2 += this.groupLoadPercent(var3);
			}
		}

		if (var1 == 0) {
			return 100;
		} else {
			var3 = var2 * 100 / var1;
			return var3;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lek;",
		garbageValue = "681923343"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lof;",
		garbageValue = "447770531"
	)
	static IndexedSprite method5021(boolean var0, boolean var1) {
		return var0 ? (var1 ? Login.field1005 : WorldMapCacheName.options_buttons_2Sprite) : (var1 ? NetFileRequest.field3577 : Login.options_buttons_0Sprite);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-64"
	)
	public static void method5060(int var0, int var1) {
		VarbitComposition var2 = WorldMapSection2.method3329(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-513021878"
	)
	public static int method5061(boolean var0, boolean var1) {
		byte var2 = 0;
		int var3 = var2 + NetCache.NetCache_pendingPriorityResponsesCount + NetCache.NetCache_pendingPriorityWritesCount;
		return var3;
	}
}
