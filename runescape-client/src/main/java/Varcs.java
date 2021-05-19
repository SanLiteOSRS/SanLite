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

@ObfuscatedName("dp")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("o")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("g")
	@Export("map")
	Map map;
	@ObfuscatedName("l")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("z")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -3093933850404302195L
	)
	long field1364;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = KitDefinition.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = class13.method210(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		var2 = 0;
		if (KitDefinition.archive2.method4842(15)) {
			var2 = KitDefinition.archive2.getGroupFileCount(15);
		}

		this.strings = new String[var2];
		this.read();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1963266648"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1125709356"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-725128375"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-484415575"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "950"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2112696076"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1];
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-362954670"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lng;",
		garbageValue = "0"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return Buddy.getPreferencesFile("2", NetSocket.field1492.name, var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "293338844"
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
						var2 += class4.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var28 = new Buffer(var2);
			var28.writeByte(2);
			var28.writeShort(var3);
			Iterator var29 = this.map.entrySet().iterator();

			label146:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var29.hasNext()) {
						var1.write(var28.array, 0, var28.offset);
						break label146;
					}

					var16 = (Entry)var29.next();
					var17 = (Integer)var16.getKey();
				} while(!this.intsPersistence[var17]);

				var28.writeShort(var17);
				Object var8 = var16.getValue();
				Class var10 = var8.getClass();
				class374[] var11 = class374.method6356();
				int var12 = 0;

				class374 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null;
						break;
					}

					class374 var13 = var11[var12];
					if (var10 == var13.field4134) {
						var9 = var13;
						break;
					}

					++var12;
				}

				var28.writeByte(var9.field4138);
				class370 var18 = class374.method6350(var8.getClass());
				var18.vmethod6366(var8, var28);
			}
		} catch (Exception var26) {
		} finally {
			try {
				var1.close();
			} catch (Exception var25) {
			}

		}

		this.unwrittenChanges = false;
		this.field1364 = Archive.currentTimeMillis();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label213: {
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
				if (var14.array.length - var14.offset >= 1) {
					int var15 = var14.readUnsignedByte();
					if (var15 < 0 || var15 > 2) {
						return;
					}

					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) {
						var16 = var14.readUnsignedShort();
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label213;
							}

							var8 = var14.readUnsignedShort();
							var9 = var14.readUnsignedByte();
							class374 var10 = (class374)UserComparator4.findEnumerated(class374.method6356(), var9);
							Object var11 = var10.method6351(var14);
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
								break label213;
							}

							var14.readUnsignedShort();
							var14.readStringCp1252NullTerminated();
							++var8;
						}
					}
				}
			} catch (Exception var25) {
				break label213;
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1105689647"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1364 < Archive.currentTimeMillis() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "14"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmo;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "77620903"
	)
	static String method2326(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-45"
	)
	public static boolean method2329(int var0) {
		return (var0 >> 30 & 1) != 0;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-380939793"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[ParamComposition.Client_plane][var0][var1];
		if (var2 == null) {
			class5.scene.removeGroundItemPile(ParamComposition.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = Strings.ItemDefinition_get(var6.id);
				long var11 = (long)var7.price;
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				class5.scene.removeGroundItemPile(ParamComposition.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var5.id != var6.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = class17.calculateTag(var0, var1, 3, false, 0);
				class5.scene.newGroundItemPile(ParamComposition.Client_plane, var0, var1, SceneTilePaint.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, ParamComposition.Client_plane), var5, var9, var13, var8);
			}
		}
	}
}
