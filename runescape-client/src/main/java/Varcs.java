import java.io.EOFException;
import java.io.File;
import java.io.IOException;
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
@ObfuscatedName("cg")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("hc")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("w")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("v")
	@Export("map")
	Map map;
	/** @deprecated */
	@ObfuscatedName("c")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("q")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 3851811378176756195L
	)
	long field1317;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = Renderable.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var3 = UserComparator10.method2598(var2); // L: 33
			this.intsPersistence[var2] = var3.persist; // L: 34
		}

		var2 = 0; // L: 36
		if (Renderable.archive2.method5722(15)) { // L: 37
			var2 = Renderable.archive2.getGroupFileCount(15); // L: 38
		}

		this.strings = new String[var2]; // L: 40
		this.read(); // L: 41
	} // L: 42

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-484330896"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 45
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 46
		}

	} // L: 47

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "95"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 50
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 51 52 54
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1554838200"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 58
	} // L: 59

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-534941773"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 62
		return var2 instanceof String ? (String)var2 : ""; // L: 63 64 66
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "374777002"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 71
	} // L: 72

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1057672624"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 76
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-903379858"
	)
	@Export("clearTransient")
	void clearTransient() {
		int var1;
		for (var1 = 0; var1 < this.intsPersistence.length; ++var1) { // L: 80
			if (!this.intsPersistence[var1]) { // L: 81
				this.map.remove(var1); // L: 82
			}
		}

		for (var1 = 0; var1 < this.strings.length; ++var1) { // L: 85
			this.strings[var1] = null; // L: 86
		}

	} // L: 88

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lpn;",
		garbageValue = "-1782789520"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class433.getPreferencesFile("2", class20.field111.name, var1); // L: 91
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true); // L: 95

		try {
			int var2 = 3; // L: 97
			int var3 = 0; // L: 98
			Iterator var4 = this.map.entrySet().iterator(); // L: 99

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next(); // L: 100
				int var6 = (Integer)var5.getKey(); // L: 102
				if (this.intsPersistence[var6]) { // L: 103
					Object var7 = var5.getValue(); // L: 104
					var2 += 3; // L: 105
					if (var7 instanceof Integer) { // L: 106
						var2 += 4;
					} else if (var7 instanceof String) { // L: 107
						var2 += class309.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 108
				}
			}

			Buffer var24 = new Buffer(var2); // L: 112
			var24.writeByte(2); // L: 113
			var24.writeShort(var3); // L: 114
			Iterator var25 = this.map.entrySet().iterator(); // L: 115

			while (var25.hasNext()) {
				Entry var13 = (Entry)var25.next(); // L: 116
				int var14 = (Integer)var13.getKey(); // L: 118
				if (this.intsPersistence[var14]) { // L: 119
					var24.writeShort(var14); // L: 120
					Object var8 = var13.getValue(); // L: 121
					class433 var9 = class433.method7490(var8.getClass()); // L: 122
					var24.writeByte(var9.field4658); // L: 123
					class429 var10 = class433.method7504(var8.getClass()); // L: 125
					var10.vmethod7506(var8, var24); // L: 126
				}
			}

			var1.write(var24.array, 0, var24.offset); // L: 131
		} catch (Exception var22) { // L: 133
		} finally {
			try {
				var1.close(); // L: 136
			} catch (Exception var21) { // L: 138
			}

		}

		this.unwrittenChanges = false; // L: 140
		this.field1317 = class181.method3483(); // L: 141
	} // L: 142

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 145

		label229: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 147

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 148 149 152
					var4 = var1.read(var2, var3, var2.length - var3); // L: 150
					if (var4 == -1) { // L: 151
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 154
				if (var14.array.length - var14.offset >= 1) {
					int var15 = var14.readUnsignedByte(); // L: 156
					if (var15 >= 0 && var15 <= 2) {
						int var7;
						int var8;
						int var9;
						int var16;
						if (var15 >= 2) { // L: 158
							var16 = var14.readUnsignedShort(); // L: 159
							var7 = 0;

							while (true) {
								if (var7 >= var16) {
									break label229;
								}

								var8 = var14.readUnsignedShort(); // L: 161
								var9 = var14.readUnsignedByte(); // L: 162
								class433 var10 = (class433)GameEngine.findEnumerated(class433.method7494(), var9); // L: 163
								Object var11 = var10.method7493(var14); // L: 164
								if (this.intsPersistence[var8]) { // L: 165
									this.map.put(var8, var11); // L: 166
								}

								++var7; // L: 160
							}
						} else {
							var16 = var14.readUnsignedShort(); // L: 171

							for (var7 = 0; var7 < var16; ++var7) { // L: 172
								var8 = var14.readUnsignedShort(); // L: 173
								var9 = var14.readInt(); // L: 174
								if (this.intsPersistence[var8]) { // L: 175
									this.map.put(var8, var9); // L: 176
								}
							}

							var7 = var14.readUnsignedShort(); // L: 179
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label229;
								}

								var14.readUnsignedShort(); // L: 181
								var14.readStringCp1252NullTerminated(); // L: 182
								++var8; // L: 180
							}
						}
					}

					return; // L: 157
				}
			} catch (Exception var25) { // L: 186
				break label229;
			} finally {
				try {
					var1.close(); // L: 189
				} catch (Exception var24) { // L: 191
				}

			}

			return; // L: 155
		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1317 < class181.method3483() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1795921631"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;Ljava/io/File;I)V",
		garbageValue = "1476782288"
	)
	static void method2418(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(NetFileRequest.JagexCache_locationFile, "rw", 10000L); // L: 193
			Buffer var3 = new Buffer(500); // L: 194
			var3.writeByte(3); // L: 195
			var3.writeByte(var1 != null ? 1 : 0); // L: 196
			var3.writeCESU8(var0.getPath()); // L: 197
			if (var1 != null) {
				var3.writeCESU8(""); // L: 198
			}

			var2.write(var3.array, 0, var3.offset); // L: 199
			var2.close(); // L: 200
		} catch (IOException var4) { // L: 202
			var4.printStackTrace(); // L: 203
		}

	} // L: 205
}
