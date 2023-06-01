import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = -1957330816
	)
	static int field1371;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 134147747
	)
	static int field1374;
	@ObfuscatedName("ar")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("ab")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("at")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("ax")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -8731301738556860465L
	)
	long field1369;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class53.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = ItemContainer.method2224(var2); // L: 33
			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (class53.archive2.method6681(15)) { // L: 37
			var2 = class53.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read(); // L: 41
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "29"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 45
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "66"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1262295786"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-579077844"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1705575780"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "99"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "597492219"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) { // L: 81
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	} // L: 88

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lsj;",
		garbageValue = "1304567816"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return WorldMapData_1.getPreferencesFile("2", class332.field3772.name, var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0; // L: 98
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey(); // L: 102
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) { // L: 106
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += class298.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var23 = new Buffer(var2);
			var23.writeByte(2);
			var23.writeShort(var3);
			Iterator var24 = this.map.entrySet().iterator();

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next(); // L: 116
				int var13 = (Integer)var12.getKey();
				if (this.intsPersistence[var13]) {
					var23.writeShort(var13);
					Object var8 = var12.getValue(); // L: 121
					class490 var9 = class490.method8835(var8.getClass());
					var23.writeByte(var9.field4977);
					class490.method8827(var8, var23); // L: 124
				}
			}

			var1.write(var23.array, 0, var23.offset); // L: 128
		} catch (Exception var21) { // L: 130
		} finally {
			try {
				var1.close(); // L: 133
			} catch (Exception var20) { // L: 135
			}

		}

		this.unwrittenChanges = false; // L: 137
		this.field1369 = Canvas.method310(); // L: 138
	} // L: 139

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1787404114"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 142

		label242: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 144

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 145 146 149
					var4 = var1.read(var2, var3, var2.length - var3); // L: 147
					if (var4 == -1) { // L: 148
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 151
				if (var14.array.length - var14.offset < 1) {
					return; // L: 152
				}

				int var15 = var14.readUnsignedByte(); // L: 153
				if (var15 >= 0 && var15 <= 2) {
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) { // L: 155
						var16 = var14.readUnsignedShort(); // L: 156
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label242;
							}

							var8 = var14.readUnsignedShort(); // L: 158
							var9 = var14.readUnsignedByte(); // L: 159
							class490 var10 = (class490)class217.findEnumerated(class490.method8832(), var9); // L: 160
							Object var11 = var10.method8826(var14); // L: 161
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 162
								this.map.put(var8, var11); // L: 163
							}

							++var7; // L: 157
						}
					} else {
						var16 = var14.readUnsignedShort(); // L: 168

						for (var7 = 0; var7 < var16; ++var7) { // L: 169
							var8 = var14.readUnsignedShort(); // L: 170
							var9 = var14.readInt(); // L: 171
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 172
								this.map.put(var8, var9); // L: 173
							}
						}

						var7 = var14.readUnsignedShort(); // L: 176
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label242;
							}

							var14.readUnsignedShort(); // L: 178
							var14.readStringCp1252NullTerminated(); // L: 179
							++var8; // L: 177
						}
					}
				}
			} catch (Exception var25) { // L: 183
				break label242;
			} finally {
				try {
					var1.close(); // L: 186
				} catch (Exception var24) { // L: 188
				}

			}

			return; // L: 154
		}

		this.unwrittenChanges = false; // L: 190
	} // L: 191

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1762761379"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1369 < Canvas.method310() - 60000L) { // L: 194
			this.write(); // L: 195
		}

	} // L: 197

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "29"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 200
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lor;II)Llt;",
		garbageValue = "1251692558"
	)
	public static PacketBufferNode method2718(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class251.getPacketBufferNode(ClientPacket.field3177, Client.packetWriter.isaacCipher); // L: 23
		var4.packetBuffer.writeByte(0); // L: 24
		int var5 = var4.packetBuffer.offset; // L: 25
		var4.packetBuffer.writeByte(var0); // L: 26
		String var6 = var1.toLowerCase(); // L: 27
		int var7 = 0; // L: 28
		byte[] var8 = null; // L: 29
		if (var6.startsWith("yellow:")) { // L: 30
			var7 = 0; // L: 31
			var1 = var1.substring("yellow:".length()); // L: 32
		} else if (var6.startsWith("red:")) { // L: 34
			var7 = 1; // L: 35
			var1 = var1.substring("red:".length()); // L: 36
		} else if (var6.startsWith("green:")) { // L: 38
			var7 = 2; // L: 39
			var1 = var1.substring("green:".length()); // L: 40
		} else if (var6.startsWith("cyan:")) { // L: 42
			var7 = 3; // L: 43
			var1 = var1.substring("cyan:".length()); // L: 44
		} else if (var6.startsWith("purple:")) { // L: 46
			var7 = 4; // L: 47
			var1 = var1.substring("purple:".length()); // L: 48
		} else if (var6.startsWith("white:")) { // L: 50
			var7 = 5; // L: 51
			var1 = var1.substring("white:".length()); // L: 52
		} else if (var6.startsWith("flash1:")) { // L: 54
			var7 = 6; // L: 55
			var1 = var1.substring("flash1:".length()); // L: 56
		} else if (var6.startsWith("flash2:")) { // L: 58
			var7 = 7; // L: 59
			var1 = var1.substring("flash2:".length()); // L: 60
		} else if (var6.startsWith("flash3:")) { // L: 62
			var7 = 8; // L: 63
			var1 = var1.substring("flash3:".length()); // L: 64
		} else if (var6.startsWith("glow1:")) { // L: 66
			var7 = 9; // L: 67
			var1 = var1.substring("glow1:".length()); // L: 68
		} else if (var6.startsWith("glow2:")) { // L: 70
			var7 = 10; // L: 71
			var1 = var1.substring("glow2:".length()); // L: 72
		} else if (var6.startsWith("glow3:")) { // L: 74
			var7 = 11; // L: 75
			var1 = var1.substring("glow3:".length()); // L: 76
		} else if (var6.startsWith("rainbow:")) { // L: 78
			var7 = 12; // L: 79
			var1 = var1.substring("rainbow:".length()); // L: 80
		} else if (var6.startsWith("pattern")) { // L: 82
			var8 = ClientPacket.method5721(var6); // L: 83
			if (var8 != null) { // L: 84
				var7 = var8.length + 12; // L: 85
				var1 = var1.substring("pattern".length() + var8.length + 1); // L: 86
			}
		}

		var6 = var1.toLowerCase(); // L: 89
		byte var9 = 0; // L: 90
		if (var6.startsWith("wave:")) { // L: 91
			var9 = 1; // L: 92
			var1 = var1.substring("wave:".length()); // L: 93
		} else if (var6.startsWith("wave2:")) { // L: 95
			var9 = 2; // L: 96
			var1 = var1.substring("wave2:".length()); // L: 97
		} else if (var6.startsWith("shake:")) { // L: 99
			var9 = 3; // L: 100
			var1 = var1.substring("shake:".length()); // L: 101
		} else if (var6.startsWith("scroll:")) { // L: 103
			var9 = 4; // L: 104
			var1 = var1.substring("scroll:".length()); // L: 105
		} else if (var6.startsWith("slide:")) { // L: 107
			var9 = 5; // L: 108
			var1 = var1.substring("slide:".length()); // L: 109
		}

		var4.packetBuffer.writeByte(var7); // L: 111
		var4.packetBuffer.writeByte(var9); // L: 112
		if (var8 != null && Client.field657 >= 214) { // L: 113
			for (int var10 = 0; var10 < var8.length; ++var10) { // L: 114
				var4.packetBuffer.writeByte(var8[var10]); // L: 115
			}
		}

		class30.method433(var4.packetBuffer, var1); // L: 118
		if (var0 == class337.field3793.rsOrdinal()) { // L: 119
			var4.packetBuffer.writeByte(var3); // L: 120
		}

		var4.packetBuffer.method9158(var4.packetBuffer.offset - var5); // L: 122
		return var4; // L: 123
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
	)
	static final void method2719(int var0) {
		int[] var1 = class178.sceneMinimapSprite.pixels; // L: 6142
		int var2 = var1.length; // L: 6143

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 6144
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 6145
			var4 = (103 - var3) * 2048 + 24628; // L: 6146

			for (var5 = 1; var5 < 103; ++var5) { // L: 6147
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 6148
					UserComparator4.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 6149
					UserComparator4.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 6150
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 6153
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 6154
		class178.sceneMinimapSprite.setRaster(); // L: 6155

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 6156
			for (var6 = 1; var6 < 103; ++var6) { // L: 6157
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 6158
					GroundObject.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 6159
					GroundObject.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 6162

		for (var5 = 0; var5 < 104; ++var5) { // L: 6163
			for (var6 = 0; var6 < 104; ++var6) { // L: 6164
				long var7 = UserComparator4.scene.getGroundObjectTag(NetFileRequest.Client_plane, var5, var6); // L: 6165
				if (var7 != 0L) { // L: 6166
					int var9 = class299.Entity_unpackID(var7); // L: 6167
					int var10 = class59.getObjectDefinition(var9).mapIconId; // L: 6168
					if (var10 >= 0 && class147.WorldMapElement_get(var10).field1914) { // L: 6169 6170
						Client.mapIcons[Client.mapIconCount] = class147.WorldMapElement_get(var10).getSpriteBool(false); // L: 6173
						Client.field625[Client.mapIconCount] = var5; // L: 6174
						Client.field719[Client.mapIconCount] = var6; // L: 6175
						++Client.mapIconCount; // L: 6176
					}
				}
			}
		}

		class139.rasterProvider.apply(); // L: 6181
	} // L: 6182

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "21"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (WorldMapAreaData.loadInterface(var0)) { // L: 11147
			PacketWriter.updateInterface(UserComparator6.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6); // L: 11148
		}
	} // L: 11149
}
