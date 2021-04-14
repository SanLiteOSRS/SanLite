import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("h")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1506133489
	)
	@Export("index")
	int index;
	@ObfuscatedName("e")
	volatile boolean field3250;
	@ObfuscatedName("k")
	boolean field3251;
	@ObfuscatedName("g")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1275315877
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -474512255
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1416389537
	)
	int field3256;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		signature = "(Llp;Llp;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.field3250 = false;
		this.field3251 = false;
		this.field3256 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3251 = var6;
		CollisionMap.method2622(this, this.index);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1118403482"
	)
	public boolean method4430() {
		return this.field3250;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1911280804"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3250) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = class22.method328(255, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "968295804"
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1985410743"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			ArchiveDisk var2 = this.archiveDisk;
			byte[] var4 = null;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) {
						var4 = var6.data;
						break;
					}
				}
			}

			if (var4 != null) {
				this.load(var2, var1, var4, true);
			} else {
				byte[] var5 = var2.read(var1);
				this.load(var2, var1, var5, true);
			}
		} else {
			Canvas.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "232168908"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			int var3 = this.index;
			ArchiveDisk var4 = this.masterDisk;
			byte[] var6 = null;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
					if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) {
						var6 = var8.data;
						break;
					}
				}
			}

			if (var6 != null) {
				this.load(var4, var3, var6, true);
			} else {
				byte[] var7 = var4.read(var3);
				this.load(var4, var3, var7, true);
			}
		} else {
			Canvas.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I[BZZI)V",
		garbageValue = "-1098415366"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3250) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				SoundSystem.method872(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				SoundSystem.method872(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				Object[] var5 = super.groups;
				Object var7;
				if (var2 == null) {
					var7 = null;
				} else if (var2.length > 136) {
					DirectByteArrayCopier var8 = new DirectByteArrayCopier();
					var8.set(var2);
					var7 = var8;
				} else {
					var7 = var2;
				}

				var5[var1] = var7;
			}
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Llp;I[BZI)V",
		garbageValue = "1126674323"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3250) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				Canvas.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				Canvas.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var11 = new Buffer(class238.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 != 5 && var12 != 6) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) {
				Canvas.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field3256) {
				this.field3250 = true;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field3251 || var4) {
					Canvas.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field3251 || var4) {
					Canvas.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "29991317"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field3250 = true;
		} else {
			this.field3256 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					class5.method85(var1, this.archiveDisk, this);
					this.field3256 = var1;
				}
			}

			if (this.field3256 == -1) {
				this.field3250 = true;
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "-13"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else if (this.validGroups[var1]) {
			return 100;
		} else {
			int var3 = this.index;
			long var4 = (long)((var3 << 16) + var1);
			int var2;
			if (class208.NetCache_currentResponse != null && class208.NetCache_currentResponse.key == var4) {
				var2 = InterfaceParent.NetCache_responseArchiveBuffer.offset * 99 / (InterfaceParent.NetCache_responseArchiveBuffer.array.length - class208.NetCache_currentResponse.padding) + 1;
			} else {
				var2 = 0;
			}

			return var2;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "-8"
	)
	public boolean method4458(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1999926301"
	)
	public boolean method4440(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "99"
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

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "32"
	)
	static final void method4471(int var0) {
		if (class15.loadInterface(var0)) {
			class208.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1);
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1450702687"
	)
	static final void method4470() {
		PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field2281, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				WorldMapData_1.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class29.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

	}
}
