import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("om")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ah")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1565244861
	)
	@Export("index")
	int index;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 201826679
	)
	volatile int field4373;
	@ObfuscatedName("au")
	boolean field4380;
	@ObfuscatedName("ak")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -236197089
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1787363095
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1630602065
	)
	int field4379;
	@ObfuscatedName("an")
	boolean field4382;
	@ObfuscatedName("ag")
	boolean field4381;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	class378 field4376;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lrl;Lrl;Lot;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, class378 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6); // L: 29
		this.field4373 = 0; // L: 17
		this.field4380 = false; // L: 18
		this.field4379 = -1; // L: 23
		this.field4382 = false; // L: 24
		this.field4381 = false; // L: 25
		this.archiveDisk = var1; // L: 30
		this.masterDisk = var2; // L: 31
		this.index = var4; // L: 32
		this.field4380 = var7; // L: 33
		this.field4382 = var8; // L: 34
		this.field4381 = var9; // L: 35
		this.field4376 = var3; // L: 36
		this.field4376.method7225(this, this.index); // L: 37
	} // L: 38

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "41"
	)
	public boolean method7049() {
		return this.field4373 == 1; // L: 41
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "293660627"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4373 == 1 || this.field4382 && this.field4373 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4376.method7217(255, this.index); // L: 47
			if (var1 >= 100) { // L: 48
				var1 = 99;
			}

			return var1; // L: 49
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "27999"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4376.method7216(this.index, var1); // L: 53
	} // L: 54

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "48"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 57
			GrandExchangeOfferOwnWorldComparator.method1204(var1, this.archiveDisk, this);
		} else {
			this.field4376.method7220(this, this.index, var1, super.groupCrcs[var1], (byte)2, true); // L: 58
		}

	} // L: 59

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1307905316"
	)
	void method7053() {
		this.field4373 = 2; // L: 62
		super.groupIds = new int[0]; // L: 63
		super.groupCrcs = new int[0]; // L: 64
		super.groupVersions = new int[0]; // L: 65
		super.fileCounts = new int[0]; // L: 66
		super.fileIds = new int[0][]; // L: 67
		super.groups = new Object[0]; // L: 68
		super.files = new Object[0][]; // L: 69
	} // L: 70

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "32"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1; // L: 73
		this.indexVersion = var2; // L: 74
		if (this.masterDisk != null) { // L: 75
			GrandExchangeOfferOwnWorldComparator.method1204(this.index, this.masterDisk, this);
		} else {
			this.field4376.method7220(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 76
		}

	} // L: 77

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "1429389196"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 80
			if (this.field4373 == 1) { // L: 81
				throw new RuntimeException(); // L: 82
			}

			if (this.masterDisk != null) { // L: 84
				class321.method6113(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 85
			this.loadAllLocal(); // L: 86
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 89
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 90
			if (this.archiveDisk != null) { // L: 91
				class321.method6113(var1, var2, this.archiveDisk); // L: 92
				this.validGroups[var1] = true; // L: 93
			}

			if (var4) { // L: 95
				Object[] var5 = super.groups; // L: 96
				Object var7;
				if (var2 == null) { // L: 100
					var7 = null; // L: 101
				} else if (var2.length > 136) { // L: 104
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 106
					var8.set(var2); // L: 107
					var7 = var8; // L: 108
				} else {
					var7 = var2; // L: 122
				}

				var5[var1] = var7; // L: 124
			}
		}

	} // L: 127

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I[BZS)V",
		garbageValue = "19234"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 130
			if (this.field4373 == 1) { // L: 131
				throw new RuntimeException(); // L: 132
			}

			if (var3 == null) { // L: 134
				this.field4376.method7220(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 135
				return; // L: 136
			}

			Archive_crc.reset(); // L: 138
			Archive_crc.update(var3, 0, var3.length); // L: 139
			var5 = (int)Archive_crc.getValue(); // L: 140
			if (var5 != this.indexCrc) { // L: 141
				this.field4376.method7220(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 142
				return; // L: 143
			}

			Buffer var11 = new Buffer(class311.decompressBytes(var3)); // L: 145
			int var12 = var11.readUnsignedByte(); // L: 146
			if (var12 != 5 && var12 != 6) { // L: 147
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 148
			if (var12 >= 6) { // L: 149
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 150
				this.field4376.method7220(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 151
				return; // L: 152
			}

			this.decodeIndex(var3); // L: 154
			this.loadAllLocal(); // L: 155
		} else {
			if (!var4 && var2 == this.field4379) { // L: 158
				this.field4373 = 1; // L: 159
			}

			if (var3 == null || var3.length <= 2) { // L: 161
				this.validGroups[var2] = false; // L: 162
				if (this.field4380 || var4) { // L: 163
					this.field4376.method7220(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 164
			}

			Archive_crc.reset(); // L: 166
			Archive_crc.update(var3, 0, var3.length - 2); // L: 167
			var5 = (int)Archive_crc.getValue(); // L: 168
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 169
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 170
				this.validGroups[var2] = false; // L: 171
				if (this.field4380 || var4) { // L: 172
					this.field4376.method7220(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 173
			}

			this.validGroups[var2] = true; // L: 175
			if (var4) { // L: 176
				Object[] var7 = super.groups; // L: 177
				Object var9;
				if (var3 == null) { // L: 181
					var9 = null; // L: 182
				} else if (var3.length > 136) { // L: 185
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 187
					var10.set(var3); // L: 188
					var9 = var10; // L: 189
				} else {
					var9 = var3; // L: 203
				}

				var7[var2] = var9; // L: 205
			}
		}

	} // L: 208

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-67451079"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 211

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 212
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 213
			this.field4373 = 1; // L: 214
		} else {
			this.field4379 = -1; // L: 217

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 218
				if (super.fileCounts[var1] > 0) { // L: 219
					ArchiveDisk var2 = this.archiveDisk; // L: 220
					ArchiveDiskAction var4 = new ArchiveDiskAction(); // L: 223
					var4.type = 1; // L: 224
					var4.key = (long)var1; // L: 225
					var4.archiveDisk = var2; // L: 226
					var4.archive = this; // L: 227
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 228
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4); // L: 229
					} // L: 230

					synchronized(ArchiveDiskActionHandler.field4365) { // L: 232
						if (ArchiveDiskActionHandler.field4362 == 0) { // L: 233
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 234
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 235
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 236
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 237
						}

						ArchiveDiskActionHandler.field4362 = 600; // L: 239
						ArchiveDiskActionHandler.field4363 = false; // L: 240
					}

					this.field4379 = var1; // L: 244
				}
			}

			if (this.field4379 == -1) {
				this.field4373 = 1; // L: 247
			}

		}
	} // L: 215 248

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-395303036"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 251
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4376.method7217(this.index, var1); // L: 252 253
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-909920285"
	)
	public boolean method7059(int var1) {
		return this.validGroups[var1]; // L: 257
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "7"
	)
	public boolean method7060(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 261
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 265
		int var2 = 0; // L: 266

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 267
			if (super.fileCounts[var3] > 0) { // L: 268
				var1 += 100; // L: 269
				var2 += this.groupLoadPercent(var3); // L: 270
			}
		}

		if (var1 == 0) { // L: 273
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 274
			return var3; // L: 275
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2050143917"
	)
	public static void method7069(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 45
	} // L: 46

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "3"
	)
	static int method7100(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) { // L: 1923
			var7 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1924
			class209.addGameMessage(0, "", var7); // L: 1925
			return 1; // L: 1926
		} else if (var0 == ScriptOpcodes.ANIM) {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1929
			class485.performPlayerAnimation(VarpDefinition.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1930
			return 1; // L: 1931
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field894) { // L: 1934
				Interpreter.field893 = true; // L: 1935
			}

			return 1; // L: 1937
		} else {
			int var15;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1940
				var15 = 0; // L: 1941
				if (WallObject.isNumber(var7)) { // L: 1942
					var15 = class129.method3066(var7);
				}

				PacketBufferNode var13 = ViewportMouse.getPacketBufferNode(ClientPacket.field3249, Client.packetWriter.isaacCipher); // L: 1944
				var13.packetBuffer.writeInt(var15); // L: 1945
				Client.packetWriter.addNode(var13); // L: 1946
				return 1; // L: 1947
			} else {
				PacketBufferNode var11;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1950
					var11 = ViewportMouse.getPacketBufferNode(ClientPacket.field3178, Client.packetWriter.isaacCipher); // L: 1952
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1953
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1954
					Client.packetWriter.addNode(var11); // L: 1955
					return 1; // L: 1956
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1959
					var11 = ViewportMouse.getPacketBufferNode(ClientPacket.field3235, Client.packetWriter.isaacCipher); // L: 1961
					var11.packetBuffer.writeByte(var7.length() + 1); // L: 1962
					var11.packetBuffer.writeStringCp1252NullTerminated(var7); // L: 1963
					Client.packetWriter.addNode(var11); // L: 1964
					return 1; // L: 1965
				} else {
					int var3;
					String var4;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1968
						var4 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1969
						SecureRandomCallable.method2318(var3, var4); // L: 1970
						return 1; // L: 1971
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 3; // L: 1974
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1975
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1976
						int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1977
						Widget var14 = ArchiveLoader.field1070.method6431(var9); // L: 1978
						class27.clickWidget(var14, var3, var15); // L: 1979
						return 1; // L: 1980
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1983
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1984
						var15 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1985
						Widget var12 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 1986
						class27.clickWidget(var12, var3, var15); // L: 1987
						return 1; // L: 1988
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						class524.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1991
						return 1; // L: 1992
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class30.clientPreferences.method2635() ? 1 : 0; // L: 1995
						return 1; // L: 1996
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class30.clientPreferences.method2530(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 1999
						return 1; // L: 2000
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 2003
						boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2004
						class137.openURL(var7, var8, false); // L: 2005
						return 1; // L: 2006
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2009
						var11 = ViewportMouse.getPacketBufferNode(ClientPacket.field3175, Client.packetWriter.isaacCipher); // L: 2011
						var11.packetBuffer.writeShort(var3); // L: 2012
						Client.packetWriter.addNode(var11); // L: 2013
						return 1; // L: 2014
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2017
						class60.Interpreter_stringStackSize -= 2; // L: 2018
						var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize]; // L: 2019
						String var5 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1]; // L: 2020
						if (var4.length() > 500) { // L: 2021
							return 1;
						} else if (var5.length() > 500) { // L: 2022
							return 1;
						} else {
							PacketBufferNode var6 = ViewportMouse.getPacketBufferNode(ClientPacket.field3215, Client.packetWriter.isaacCipher); // L: 2023
							var6.packetBuffer.writeShort(1 + class145.stringCp1252NullTerminatedByteSize(var4) + class145.stringCp1252NullTerminatedByteSize(var5)); // L: 2024
							var6.packetBuffer.method9505(var3); // L: 2025
							var6.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 2026
							var6.packetBuffer.writeStringCp1252NullTerminated(var5); // L: 2027
							Client.packetWriter.addNode(var6); // L: 2028
							return 1; // L: 2029
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						--Interpreter.Interpreter_intStackSize; // L: 2032
						return 1; // L: 2033
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2036
						return 1; // L: 2037
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.field656 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2040
						return 1; // L: 2041
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2044
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2; // L: 2045
						}

						return 1; // L: 2046
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2049
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3; // L: 2050
						}

						return 1; // L: 2051
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2054
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5; // L: 2055
						}

						return 1; // L: 2056
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 2059
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9; // L: 2060
						}

						return 1; // L: 2061
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0; // L: 2064
						return 1; // L: 2065
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2068
						return 1; // L: 2069
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2072
						return 1; // L: 2073
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class93.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1); // L: 2076
						return 1; // L: 2077
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.getTapToDrop() ? 1 : 0; // L: 2080
						return 1; // L: 2081
					} else if (var0 == 3129) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2084
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2085
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2086
						return 1; // L: 2087
					} else if (var0 == 3130) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2090
						return 1; // L: 2091
					} else if (var0 == 3131) {
						--Interpreter.Interpreter_intStackSize; // L: 2094
						return 1; // L: 2095
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 2098
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArea.canvasHeight; // L: 2099
						return 1; // L: 2100
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--Interpreter.Interpreter_intStackSize; // L: 2103
						return 1; // L: 2104
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1; // L: 2107
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						Interpreter.Interpreter_intStackSize -= 2; // L: 2110
						return 1; // L: 2111
					} else if (var0 == 3136) {
						Client.field575 = 3; // L: 2114
						Client.field701 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2115
						return 1; // L: 2116
					} else if (var0 == 3137) {
						Client.field575 = 2; // L: 2119
						Client.field701 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2120
						return 1; // L: 2121
					} else if (var0 == 3138) {
						Client.field575 = 0; // L: 2124
						return 1; // L: 2125
					} else if (var0 == 3139) {
						Client.field575 = 1; // L: 2128
						return 1; // L: 2129
					} else if (var0 == 3140) {
						Client.field575 = 3; // L: 2132
						Client.field701 = var2 ? Interpreter.scriptDotWidget.id : class141.field1644.id; // L: 2133
						return 1; // L: 2134
					} else {
						boolean var10;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2137
							class30.clientPreferences.method2532(var10); // L: 2138
							return 1; // L: 2139
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class30.clientPreferences.method2533() ? 1 : 0; // L: 2142
							return 1; // L: 2143
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2146
							Client.Login_isUsernameRemembered = var10; // L: 2147
							if (!var10) { // L: 2148
								class30.clientPreferences.method2548(""); // L: 2149
							}

							return 1; // L: 2151
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0; // L: 2154
							return 1; // L: 2155
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1; // L: 2158
						} else if (var0 == 3146) {
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2161
							class30.clientPreferences.method2534(!var10); // L: 2162
							return 1; // L: 2163
						} else if (var0 == 3147) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class30.clientPreferences.method2580() ? 0 : 1; // L: 2166
							return 1; // L: 2167
						} else if (var0 == 3148) {
							return 1; // L: 2170
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2173
							return 1; // L: 2174
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2177
							return 1; // L: 2178
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2181
							return 1; // L: 2182
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2185
							return 1; // L: 2186
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Login.Login_loadingPercent; // L: 2189
							return 1; // L: 2190
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class538.method9752(); // L: 2193
							return 1; // L: 2194
						} else if (var0 == 3155) {
							--class60.Interpreter_stringStackSize; // L: 2197
							return 1; // L: 2198
						} else if (var0 == 3156) {
							return 1; // L: 2201
						} else if (var0 == 3157) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2204
							return 1; // L: 2205
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2208
							return 1; // L: 2209
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2212
							return 1; // L: 2213
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2216
							return 1; // L: 2217
						} else if (var0 == 3161) {
							--Interpreter.Interpreter_intStackSize; // L: 2220
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2221
							return 1; // L: 2222
						} else if (var0 == 3162) {
							--Interpreter.Interpreter_intStackSize; // L: 2225
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2226
							return 1; // L: 2227
						} else if (var0 == 3163) {
							--class60.Interpreter_stringStackSize; // L: 2230
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2231
							return 1; // L: 2232
						} else if (var0 == 3164) {
							--Interpreter.Interpreter_intStackSize; // L: 2235
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2236
							return 1; // L: 2237
						} else if (var0 == 3165) {
							--Interpreter.Interpreter_intStackSize; // L: 2240
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2241
							return 1; // L: 2242
						} else if (var0 == 3166) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2245
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2246
							return 1; // L: 2247
						} else if (var0 == 3167) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2250
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2251
							return 1; // L: 2252
						} else if (var0 == 3168) {
							Interpreter.Interpreter_intStackSize -= 2; // L: 2255
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2256
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2257
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2258
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2259
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2260
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2261
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2262
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2263
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = ""; // L: 2264
							return 1; // L: 2265
						} else if (var0 == 3169) {
							return 1; // L: 2268
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2271
							return 1; // L: 2272
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2275
							return 1; // L: 2276
						} else if (var0 == 3172) {
							--Interpreter.Interpreter_intStackSize; // L: 2279
							return 1; // L: 2280
						} else if (var0 == 3173) {
							--Interpreter.Interpreter_intStackSize; // L: 2283
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2284
							return 1; // L: 2285
						} else if (var0 == 3174) {
							--Interpreter.Interpreter_intStackSize; // L: 2288
							return 1; // L: 2289
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2292
							return 1; // L: 2293
						} else if (var0 == 3176) {
							return 1; // L: 2296
						} else if (var0 == 3177) {
							return 1; // L: 2299
						} else if (var0 == 3178) {
							--class60.Interpreter_stringStackSize; // L: 2302
							return 1; // L: 2303
						} else if (var0 == 3179) {
							return 1; // L: 2306
						} else if (var0 == 3180) {
							--class60.Interpreter_stringStackSize; // L: 2309
							return 1; // L: 2310
						} else if (var0 == 3181) {
							class182.method3660(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 2313
							return 1; // L: 2314
						} else if (var0 == 3182) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Frames.method5635(); // L: 2317
							return 1; // L: 2318
						} else if (var0 == 3189) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2321
							InvDefinition.method3540(var3); // L: 2322
							return 1; // L: 2323
						} else {
							return 2; // L: 2325
						}
					}
				}
			}
		}
	}
}
