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

@Deprecated
@ObfuscatedName("dw")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("b")
	public static short[][] field1379;
	@ObfuscatedName("v")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("s")
	@Export("map")
	Map map;
	/** @deprecated */
	@ObfuscatedName("z")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("j")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -9023487979530086869L
	)
	long field1372;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class372.archive2.getGroupFileCount(19); // L: 29
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
					var4.method3633(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (class372.archive2.method6484(15)) { // L: 50
			var2 = class372.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "673007191"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 59
		}

	} // L: 60

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "165690125"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1857512946"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "3"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "2075821296"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1364685302"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1996405903"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lqr;",
		garbageValue = "-836020576"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return UrlRequester.getPreferencesFile("2", class134.field1606.name, var1); // L: 104
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "43"
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
						var2 += class96.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 121
				}
			}

			Buffer var26 = new Buffer(var2); // L: 125
			var26.writeByte(2); // L: 126
			var26.writeShort(var3); // L: 127
			Iterator var27 = this.map.entrySet().iterator(); // L: 128

			while (var27.hasNext()) {
				Entry var15 = (Entry)var27.next(); // L: 129
				int var16 = (Integer)var15.getKey(); // L: 131
				if (this.intsPersistence[var16]) { // L: 132
					var26.writeShort(var16); // L: 133
					Object var8 = var15.getValue(); // L: 134
					class463 var9 = class463.method8511(var8.getClass()); // L: 135
					var26.writeByte(var9.field4896); // L: 136
					Class var11 = var8.getClass(); // L: 139
					class463 var12 = class463.method8511(var11); // L: 141
					if (var12 == null) { // L: 142
						throw new IllegalArgumentException();
					}

					class459 var10 = var12.field4900; // L: 143
					var10.vmethod8518(var8, var26); // L: 146
				}
			}

			var1.write(var26.array, 0, var26.offset); // L: 151
		} catch (Exception var24) { // L: 153
		} finally {
			try {
				var1.close(); // L: 156
			} catch (Exception var23) { // L: 158
			}

		}

		this.unwrittenChanges = false; // L: 160
		this.field1372 = class153.method3317(); // L: 161
	} // L: 162

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-927723462"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 165

		label225: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 167

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 168 169 172
					var4 = var1.read(var2, var3, var2.length - var3); // L: 170
					if (var4 == -1) { // L: 171
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 174
				if (var14.array.length - var14.offset >= 1) {
					int var15 = var14.readUnsignedByte(); // L: 176
					if (var15 >= 0 && var15 <= 2) {
						int var7;
						int var8;
						int var9;
						int var16;
						if (var15 >= 2) { // L: 178
							var16 = var14.readUnsignedShort(); // L: 179
							var7 = 0;

							while (true) {
								if (var7 >= var16) {
									break label225;
								}

								var8 = var14.readUnsignedShort(); // L: 181
								var9 = var14.readUnsignedByte(); // L: 182
								class463 var10 = (class463)class4.findEnumerated(class463.method8503(), var9); // L: 183
								Object var11 = var10.method8507(var14); // L: 184
								if (this.intsPersistence[var8]) { // L: 185
									this.map.put(var8, var11); // L: 186
								}

								++var7; // L: 180
							}
						} else {
							var16 = var14.readUnsignedShort(); // L: 191

							for (var7 = 0; var7 < var16; ++var7) { // L: 192
								var8 = var14.readUnsignedShort(); // L: 193
								var9 = var14.readInt(); // L: 194
								if (this.intsPersistence[var8]) { // L: 195
									this.map.put(var8, var9); // L: 196
								}
							}

							var7 = var14.readUnsignedShort(); // L: 199
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label225;
								}

								var14.readUnsignedShort(); // L: 201
								var14.readStringCp1252NullTerminated(); // L: 202
								++var8; // L: 200
							}
						}
					}

					return; // L: 177
				}
			} catch (Exception var25) { // L: 206
				break label225;
			} finally {
				try {
					var1.close(); // L: 209
				} catch (Exception var24) { // L: 211
				}

			}

			return; // L: 175
		}

		this.unwrittenChanges = false; // L: 213
	} // L: 214

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "247889880"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1372 < class153.method3317() - 60000L) { // L: 217
			this.write(); // L: 218
		}

	} // L: 220

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 223
	}
}
