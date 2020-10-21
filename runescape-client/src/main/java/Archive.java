import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("id")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ao")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Llt;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Llt;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1087109335
	)
	@Export("index")
	int index;
	@ObfuscatedName("i")
	volatile boolean field3180;
	@ObfuscatedName("ab")
	boolean field3183;
	@ObfuscatedName("ac")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -861635571
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 711915875
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 833914621
	)
	int field3188;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		signature = "(Llt;Llt;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.field3180 = false;
		this.field3183 = false;
		this.field3188 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3183 = var6;
		class236.method4263(this, this.index);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1666992241"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		WorldMapSection3.method870(this.index, var1);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "1168057688"
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
			if (NetCache.NetCache_currentResponse != null && var4 == NetCache.NetCache_currentResponse.key) {
				var2 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding) + 1;
			} else {
				var2 = 0;
			}

			return var2;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1308309481"
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
			VarcInt.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1771311633"
	)
	public boolean method4420() {
		return this.field3180;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "853852990"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3180) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var2 = this.index;
			long var3 = (long)(var2 + 16711680);
			int var1;
			if (NetCache.NetCache_currentResponse != null && var3 == NetCache.NetCache_currentResponse.key) {
				var1 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding) + 1;
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

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "2008218250"
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
					if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) {
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
			VarcInt.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		signature = "(I[BZZI)V",
		garbageValue = "-1937939642"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3180) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				UrlRequester.method3417(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				UrlRequester.method3417(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = AbstractByteArrayCopier.method4069(var2, false);
			}
		}

	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		signature = "(Llt;I[BZI)V",
		garbageValue = "-1033218148"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3180) {
				throw new RuntimeException();
			} else if (var3 == null) {
				VarcInt.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
			} else {
				Archive_crc.reset();
				Archive_crc.update(var3, 0, var3.length);
				var5 = (int)Archive_crc.getValue();
				if (var5 != this.indexCrc) {
					VarcInt.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				} else {
					Buffer var9 = new Buffer(UserComparator3.decompressBytes(var3));
					int var7 = var9.readUnsignedByte();
					if (var7 != 5 && var7 != 6) {
						throw new RuntimeException(var7 + "," + this.index + "," + var2);
					} else {
						int var8 = 0;
						if (var7 >= 6) {
							var8 = var9.readInt();
						}

						if (var8 != this.indexVersion) {
							VarcInt.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
						} else {
							this.decodeIndex(var3);
							this.loadAllLocal();
						}
					}
				}
			}
		} else {
			if (!var4 && var2 == this.field3188) {
				this.field3180 = true;
			}

			if (var3 != null && var3.length > 2) {
				Archive_crc.reset();
				Archive_crc.update(var3, 0, var3.length - 2);
				var5 = (int)Archive_crc.getValue();
				int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
				if (var5 == super.groupCrcs[var2] && var6 == super.groupVersions[var2]) {
					this.validGroups[var2] = true;
					if (var4) {
						super.groups[var2] = AbstractByteArrayCopier.method4069(var3, false);
					}

				} else {
					this.validGroups[var2] = false;
					if (this.field3183 || var4) {
						VarcInt.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
					}

				}
			} else {
				this.validGroups[var2] = false;
				if (this.field3183 || var4) {
					VarcInt.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

			}
		}
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1835807428"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field3180 = true;
		} else {
			this.field3188 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					ArchiveDisk var2 = this.archiveDisk;
					ArchiveDiskAction var4 = new ArchiveDiskAction();
					var4.type = 1;
					var4.key = (long)var1;
					var4.archiveDisk = var2;
					var4.archive = this;
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
					}

					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
						if (ArchiveDiskActionHandler.field3176 == 0) {
							class105.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
							class105.ArchiveDiskActionHandler_thread.setDaemon(true);
							class105.ArchiveDiskActionHandler_thread.start();
							class105.ArchiveDiskActionHandler_thread.setPriority(5);
						}

						ArchiveDiskActionHandler.field3176 = 600;
					}

					this.field3188 = var1;
				}
			}

			if (this.field3188 == -1) {
				this.field3180 = true;
			}

		}
	}

	@ObfuscatedName("do")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1907030186"
	)
	public boolean method4411(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method4416(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		signature = "(S)I",
		garbageValue = "2047"
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(DDII)[D",
		garbageValue = "-2056845281"
	)
	public static double[] method4445(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = Script.method2356((double)var7, var0, var2);
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "-1832830458"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}
}
