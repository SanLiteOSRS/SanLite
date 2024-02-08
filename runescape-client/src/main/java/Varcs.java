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

@ObfuscatedName("ev")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("af")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("aj")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("aq")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("ar")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -7186478788079850087L
	)
	long field1390;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class36.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2); // L: 35
			VarcInt var3;
			if (var4 != null) { // L: 36
				var3 = var4; // L: 37
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2); // L: 40
				var4 = new VarcInt(); // L: 41
				if (var5 != null) {
					var4.method3629(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (class36.archive2.method6982(15)) { // L: 50
			var2 = class36.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1981675191"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) { // L: 59
			this.unwrittenChanges = true;
		}

	} // L: 60

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "63"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "8757"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "319681036"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1134068747"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1906556891"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-104"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 93
			if (!this.intsPersistence[var1]) { // L: 94
				this.map.remove(var1); // L: 95
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 98
			this.strings[var1] = null; // L: 99
		}

	} // L: 101

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)Ltt;",
		garbageValue = "-18"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return Huffman.getPreferencesFile("2", class1.field3.name, var1); // L: 104
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1783261994"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 108

		try {
			int var2 = 3; // L: 110
			int var3 = 0; // L: 111
			Iterator var4 = this.map.entrySet().iterator(); // L: 112

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 113
				int var6 = (Integer)var5.getKey(); // L: 115
				if (this.intsPersistence[var6]) { // L: 116
					Object var7 = var5.getValue(); // L: 117
					var2 += 3; // L: 118
					if (var7 instanceof Integer) { // L: 119
						var2 += 4;
					} else if (var7 instanceof String) { // L: 120
						var2 += CollisionMap.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 121
				}
			}

			Buffer var27 = new Buffer(var2); // L: 125
			var27.writeByte(2); // L: 126
			var27.writeShort(var3); // L: 127
			Iterator var28 = this.map.entrySet().iterator(); // L: 128

			label144:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var28.hasNext()) {
						var1.write(var27.array, 0, var27.offset); // L: 158
						break label144;
					}

					var16 = (Entry)var28.next(); // L: 129
					var17 = (Integer)var16.getKey(); // L: 131
				} while(!this.intsPersistence[var17]); // L: 132

				var27.writeShort(var17); // L: 133
				Object var8 = var16.getValue(); // L: 134
				Class var10 = var8.getClass(); // L: 136
				class518[] var11 = class518.method9256(); // L: 139
				int var12 = 0;

				class518 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null; // L: 150
						break;
					}

					class518 var13 = var11[var12]; // L: 141
					if (var10 == var13.field5106) { // L: 143
						var9 = var13; // L: 144
						break; // L: 145
					}

					++var12; // L: 140
				}

				var27.writeByte(var9.field5107); // L: 153
				class518.method9241(var8, var27); // L: 154
			}
		} catch (Exception var25) { // L: 160
		} finally {
			try {
				var1.close(); // L: 163
			} catch (Exception var24) { // L: 165
			}

		}

		this.unwrittenChanges = false; // L: 167
		this.field1390 = UserComparator9.method2973(); // L: 168
	} // L: 169

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1953991169"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 172

		label231: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 174

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 175 176 179
					var4 = var1.read(var2, var3, var2.length - var3); // L: 177
					if (var4 == -1) { // L: 178
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 181
				if (var14.array.length - var14.offset < 1) {
					return; // L: 182
				}

				int var15 = var14.readUnsignedByte(); // L: 183
				if (var15 >= 0 && var15 <= 2) {
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) { // L: 185
						var16 = var14.readUnsignedShort(); // L: 186
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label231;
							}

							var8 = var14.readUnsignedShort();
							var9 = var14.readUnsignedByte();
							class518 var10 = (class518)GrandExchangeEvents.findEnumerated(class518.method9256(), var9);
							Object var11 = var10.method9243(var14);
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 192
								this.map.put(var8, var11); // L: 193
							}

							++var7; // L: 187
						}
					} else {
						var16 = var14.readUnsignedShort(); // L: 198

						for (var7 = 0; var7 < var16; ++var7) { // L: 199
							var8 = var14.readUnsignedShort(); // L: 200
							var9 = var14.readInt(); // L: 201
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 202
								this.map.put(var8, var9); // L: 203
							}
						}

						var7 = var14.readUnsignedShort(); // L: 206
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label231;
							}

							var14.readUnsignedShort(); // L: 208
							var14.readStringCp1252NullTerminated(); // L: 209
							++var8; // L: 207
						}
					}
				}
			} catch (Exception var25) { // L: 213
				break label231;
			} finally {
				try {
					var1.close(); // L: 216
				} catch (Exception var24) { // L: 218
				}

			}

			return; // L: 184
		}

		this.unwrittenChanges = false; // L: 220
	} // L: 221

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-232139615"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1390 < UserComparator9.method2973() - 60000L) { // L: 224
			this.write(); // L: 225
		}

	} // L: 227

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-29"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 230
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1922946124"
	)
	public static int method2820(int var0, int var1) {
		return (var0 << 8) + var1; // L: 14
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Low;III)Z",
		garbageValue = "1296039969"
	)
	public static boolean method2829(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 188
		if (var3 == null) { // L: 189
			return false;
		} else {
			DynamicObject.SpriteBuffer_decode(var3); // L: 190
			return true; // L: 191
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1226766917"
	)
	static final int method2797(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 1002
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 1003
	}

	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-1680507055"
	)
	static void method2826(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 12647
		if (Client.randomDatData == null) { // L: 12649
			Client.randomDatData = new byte[24];
		}

		class425.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 12650
		if (JagexCache.JagexCache_randomDat != null) { // L: 12653
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 12655
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 12656
			} catch (Exception var4) { // L: 12658
			}
		}

	} // L: 12661
}
