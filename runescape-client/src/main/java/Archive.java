import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ao")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Llz;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1943179967
	)
	@Export("index")
	int index;
	@ObfuscatedName("e")
	volatile boolean field3185;
	@ObfuscatedName("ab")
	boolean field3186;
	@ObfuscatedName("ag")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 865644011
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -193414103
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 196080105
	)
	int field3191;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		signature = "(Llz;Llz;IZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.field3185 = false;
		this.field3186 = false;
		this.field3191 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3186 = var6;
		Widget.method4174(this, this.index);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "176946518"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		SecureRandomCallable.method1204(this.index, var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-21407020"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : World.method1845(this.index, var1);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "450530880"
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
			Varps.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1735619365"
	)
	public boolean method4340() {
		return this.field3185;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-121154638"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field3185) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = World.method1845(255, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "1573806265"
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
			Varps.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		signature = "(I[BZZB)V",
		garbageValue = "-85"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3185) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				Calendar.method4039(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				ArchiveDisk var5 = this.archiveDisk;
				ArchiveDiskAction var6 = new ArchiveDiskAction();
				var6.type = 0;
				var6.key = (long)var1;
				var6.data = var2;
				var6.archiveDisk = var5;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var6);
				}

				WorldMapArea.method415();
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = MenuAction.method2140(var2, false);
			}
		}

	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		signature = "(Llz;I[BZI)V",
		garbageValue = "-2086018580"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3185) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				Varps.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				Varps.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var9 = new Buffer(DevicePcmPlayerProvider.decompressBytes(var3));
			int var7 = var9.readUnsignedByte();
			if (var7 != 5 && var7 != 6) {
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var7 >= 6) {
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) {
				Varps.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field3191) {
				this.field3185 = true;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field3186 || var4) {
					Varps.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field3186 || var4) {
					Varps.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				super.groups[var2] = MenuAction.method2140(var3, false);
			}
		}

	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1665634170"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field3185 = true;
		} else {
			this.field3191 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					FaceNormal.method3388(var1, this.archiveDisk, this);
					this.field3191 = var1;
				}
			}

			if (this.field3191 == -1) {
				this.field3185 = true;
			}

		}
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1146197798"
	)
	public boolean method4349(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1915493362"
	)
	public boolean method4350(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("db")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "-18"
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(S)Lgb;",
		garbageValue = "-18940"
	)
	public static PacketBufferNode method4385() {
		PacketBufferNode var0 = ItemContainer.method1226();
		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "961891121"
	)
	public static boolean method4386(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		signature = "(Lky;I)V",
		garbageValue = "2129310615"
	)
	static final void method4357(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field702; ++var1) {
			int var2 = Client.field721[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			int var6;
			int var7;
			int var8;
			if ((var4 & 128) != 0) {
				var5 = var0.method5639();
				int var9;
				int var10;
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.readUnsignedByte();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.method5612();
							int var12 = var9 > 0 ? var0.method5639() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			if ((var4 & 16) != 0) {
				var3.targetIndex = var0.method5656();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 8) != 0) {
				var3.field997 = var0.method5650();
				var3.field1016 = var0.method5730();
				var3.field1015 = var0.method5649();
				var3.field1017 = var0.method5649();
				var3.field1026 = var0.method5657() + Client.cycle;
				var3.field1019 = var0.method5657() + Client.cycle;
				var3.field1027 = var0.readUnsignedShort();
				var3.pathLength = 1;
				var3.field973 = 0;
				var3.field997 += var3.pathX[0];
				var3.field1016 += var3.pathY[0];
				var3.field1015 += var3.pathX[0];
				var3.field1017 += var3.pathY[0];
			}

			if ((var4 & 2) != 0) {
				var3.definition = Skeleton.getNpcDefinition(var0.readUnsignedShort());
				var3.field1014 = var3.definition.size;
				var3.field1025 = var3.definition.rotation;
				var3.walkSequence = var3.definition.walkSequence;
				var3.walkBackSequence = var3.definition.walkBackSequence;
				var3.walkLeftSequence = var3.definition.walkLeftSequence;
				var3.walkRightSequence = var3.definition.walkRightSequence;
				var3.readySequence = var3.definition.readySequence;
				var3.turnLeftSequence = var3.definition.turnLeftSequence;
				var3.turnRightSequence = var3.definition.turnRightSequence;
			}

			if ((var4 & 4) != 0) {
				var5 = var0.readUnsignedShort();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.method5639();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = WorldMapRegion.SequenceDefinition_get(var5).field3535;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1009 = 0;
					}

					if (var7 == 2) {
						var3.field1009 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || WorldMapRegion.SequenceDefinition_get(var5).field3537 >= WorldMapRegion.SequenceDefinition_get(var3.sequence).field3537) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1009 = 0;
					var3.field973 = var3.pathLength;
				}
			}

			if ((var4 & 1) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}

			if ((var4 & 32) != 0) {
				var3.spotAnimation = var0.method5655();
				var5 = var0.method5678();
				var3.field1003 = var5 >> 16;
				var3.field1013 = (var5 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1013 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}

			if ((var4 & 64) != 0) {
				var5 = var0.method5656();
				var6 = var0.method5655();
				var7 = var3.x - (var5 - WorldMapManager.baseX * 64 - WorldMapManager.baseX * 64) * 64;
				var8 = var3.y - (var6 - WorldMapLabel.baseY * 64 - WorldMapLabel.baseY * 64) * 64;
				if (var7 != 0 || var8 != 0) {
					var3.field1000 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}
		}

	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)V",
		garbageValue = "-1501250507"
	)
	static void method4383(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, WorldMapAreaData.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != WorldMapLabelSize.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = Client.getPacketBufferNode(ClientPacket.field2320, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5665(var3[var6]);
					var8.packetBuffer.method5644(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = Client.getPacketBufferNode(ClientPacket.field2246, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5653(var3[var6]);
					var8.packetBuffer.writeIntME(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = Client.getPacketBufferNode(ClientPacket.field2274, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method5665(var3[var6]);
					var8.packetBuffer.writeIntME(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = Client.getPacketBufferNode(ClientPacket.field2343, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeIntME(0);
					var8.packetBuffer.method5654(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			WorldMapRectangle.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
