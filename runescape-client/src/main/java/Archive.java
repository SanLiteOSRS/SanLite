import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("j")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1928964095
	)
	@Export("index")
	int index;
	@ObfuscatedName("g")
	volatile boolean field3673;
	@ObfuscatedName("e")
	boolean field3674;
	@ObfuscatedName("p")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1953931107
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 619553041
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1459687887
	)
	int field3679;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lmr;Lmr;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.field3673 = false;
		this.field3674 = false;
		this.field3679 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3674 = var6;
		int var8 = this.index;
		if (class139.NetCache_reference != null) {
			class139.NetCache_reference.offset = var8 * 8 + 5;
			int var9 = class139.NetCache_reference.readInt();
			int var10 = class139.NetCache_reference.readInt();
			this.loadIndex(var9, var10);
		} else {
			AbstractByteArrayCopier.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
			NetCache.NetCache_archives[var8] = this;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-625670103"
	)
	public boolean method5260() {
		return this.field3673;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1260592296"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3673) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = HealthBarUpdate.method2185(255, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "297974277"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		AttackOption.method2297(this.index, var1);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "23"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			class318.method5887(var1, this.archiveDisk, this);
		} else {
			AbstractByteArrayCopier.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-60"
	)
	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			class318.method5887(this.index, this.masterDisk, this);
		} else {
			AbstractByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-1126308164"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3673) {
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

				Login.method1952();
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				ArchiveDisk var11 = this.archiveDisk;
				ArchiveDiskAction var16 = new ArchiveDiskAction();
				var16.type = 0;
				var16.key = (long)var1;
				var16.data = var2;
				var16.archiveDisk = var11;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var16);
				}

				Login.method1952();
				this.validGroups[var1] = true;
			}

			if (var4) {
				Object[] var15 = super.groups;
				Object var17;
				if (var2 == null) {
					var17 = null;
				} else if (var2.length > 136) {
					DirectByteArrayCopier var8 = new DirectByteArrayCopier();
					var8.set(var2);
					var17 = var8;
				} else {
					var17 = var2;
				}

				var15[var1] = var17;
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I[BZI)V",
		garbageValue = "702092430"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3673) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				AbstractByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				AbstractByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var11 = new Buffer(ByteArrayPool.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 != 5 && var12 != 6) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) {
				AbstractByteArrayCopier.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field3679) {
				this.field3673 = true;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field3674 || var4) {
					AbstractByteArrayCopier.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field3674 || var4) {
					AbstractByteArrayCopier.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1618182910"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field3673 = true;
		} else {
			this.field3679 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					ClanSettings.method2653(var1, this.archiveDisk, this);
					this.field3679 = var1;
				}
			}

			if (this.field3679 == -1) {
				this.field3673 = true;
			}

		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "14"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : HealthBarUpdate.method2185(this.index, var1);
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "836290734"
	)
	public boolean method5269(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-9"
	)
	public boolean method5270(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1624563419"
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
}
