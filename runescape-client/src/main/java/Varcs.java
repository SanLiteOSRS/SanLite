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

@ObfuscatedName("cz")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("l")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("m")
	@Export("map")
	Map map;
	@ObfuscatedName("z")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("q")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -5306156143570405753L
	)
	long field1298;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = WorldMapSection3.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2);
			VarcInt var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2);
				var4 = new VarcInt();
				if (var5 != null) {
					var4.method4552(new Buffer(var5));
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2);
				var3 = var4;
			}

			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (WorldMapSection3.archive2.method4416(15)) {
			var2 = WorldMapSection3.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-1056987732"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IB)I",
		garbageValue = "0"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;I)V",
		garbageValue = "-368948322"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "2139997801"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;S)V",
		garbageValue = "14747"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)Ljava/lang/String;",
		garbageValue = "-475073463"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "2"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) {
			this.strings[var1] = null;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(ZI)Lmr;",
		garbageValue = "229705825"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return WorldMapID.getPreferencesFile("2", GrandExchangeOfferWorldComparator.field58.name, var1);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2018720636"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += SpriteMask.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var27 = new Buffer(var2);
			var27.writeByte(2);
			var27.writeShort(var3);
			Iterator var28 = this.map.entrySet().iterator();

			label146:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var28.hasNext()) {
						var1.write(var27.array, 0, var27.offset);
						break label146;
					}

					var16 = (Entry)var28.next();
					var17 = (Integer)var16.getKey();
				} while(!this.intsPersistence[var17]);

				var27.writeShort(var17);
				Object var8 = var16.getValue();
				Class var10 = var8.getClass();
				class3[] var11 = class3.method43();
				int var12 = 0;

				class3 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null;
						break;
					}

					class3 var13 = var11[var12];
					if (var10 == var13.field13) {
						var9 = var13;
						break;
					}

					++var12;
				}

				var27.writeByte(var9.field12);
				class3.method57(var8, var27);
			}
		} catch (Exception var25) {
		} finally {
			try {
				var1.close();
			} catch (Exception var24) {
			}

		}

		this.unwrittenChanges = false;
		this.field1298 = Nameable.currentTimeMillis();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-236281402"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label211: {
			try {
				byte[] var2 = new byte[(int)var1.length()];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2);
				if (var14.array.length - var14.offset < 1) {
					return;
				}

				int var15 = var14.readUnsignedByte();
				if (var15 >= 0 && var15 <= 2) {
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) {
						var16 = var14.readUnsignedShort();
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label211;
							}

							var8 = var14.readUnsignedShort();
							var9 = var14.readUnsignedByte();
							class3 var10 = (class3)class195.findEnumerated(class3.method43(), var9);
							Object var11 = var10.method47(var14);
							if (this.intsPersistence[var8]) {
								this.map.put(var8, var11);
							}

							++var7;
						}
					} else {
						var16 = var14.readUnsignedShort();

						for (var7 = 0; var7 < var16; ++var7) {
							var8 = var14.readUnsignedShort();
							var9 = var14.readInt();
							if (this.intsPersistence[var8]) {
								this.map.put(var8, var9);
							}
						}

						var7 = var14.readUnsignedShort();
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label211;
							}

							var14.readUnsignedShort();
							var14.readStringCp1252NullTerminated();
							++var8;
						}
					}
				}
			} catch (Exception var25) {
				break label211;
			} finally {
				try {
					var1.close();
				} catch (Exception var24) {
				}

			}

			return;
		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "362118254"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1298 < Nameable.currentTimeMillis() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-398043475"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		signature = "(Lht;I)Z",
		garbageValue = "322576420"
	)
	static final boolean method2313(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method4148(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = class4.getPacketBufferNode(ClientPacket.field2335, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
