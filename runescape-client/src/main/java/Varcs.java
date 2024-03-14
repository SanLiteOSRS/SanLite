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

@ObfuscatedName("eu")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("at")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field1417;
	@ObfuscatedName("al")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("ai")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ar")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("as")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 7269891442893699467L
	)
	long field1414;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class19.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var3 = class145.method3229(var2); // L: 33
			this.intsPersistence[var2] = var3.persist; // L: 34
		}

		var2 = 0; // L: 36
		if (class19.archive2.method7060(15)) { // L: 37
			var2 = class19.archive2.getGroupFileCount(15); // L: 38
		}

		this.strings = new String[var2]; // L: 40
		this.read(); // L: 41
	} // L: 42

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-471377319"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 45
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 46
		}

	} // L: 47

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "127"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 50
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 51 52 54
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1080810570"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 58
	} // L: 59

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-848974840"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 62
		return var2 instanceof String ? (String)var2 : ""; // L: 63 64 66
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "7"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 71
	} // L: 72

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2051983983"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 76
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "200113157"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZB)Ltf;",
		garbageValue = "-5"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return VarcInt.getPreferencesFile("2", KeyHandler.field151.name, var1); // L: 91
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2136712165"
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
						var2 += class145.stringCp1252NullTerminatedByteSize((String)var7);
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
					class521 var9 = class521.method9334(var8.getClass()); // L: 122
					var24.writeByte(var9.field5124); // L: 123
					class517 var10 = class521.method9321(var8.getClass()); // L: 125
					var10.vmethod9339(var8, var24); // L: 126
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
		this.field1414 = SecureRandomCallable.method2320(); // L: 141
	} // L: 142

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "581188937"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 145

		label247: {
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
									break label247;
								}

								var8 = var14.readUnsignedShort(); // L: 161
								var9 = var14.readUnsignedByte(); // L: 162
								class521 var10 = (class521)class356.findEnumerated(class521.method9335(), var9); // L: 163
								Object var11 = var10.method9323(var14); // L: 164
								if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 165
									this.map.put(var8, var11); // L: 166
								}

								++var7; // L: 160
							}
						} else {
							var16 = var14.readUnsignedShort(); // L: 171

							for (var7 = 0; var7 < var16; ++var7) { // L: 172
								var8 = var14.readUnsignedShort(); // L: 173
								var9 = var14.readInt(); // L: 174
								if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 175
									this.map.put(var8, var9); // L: 176
								}
							}

							var7 = var14.readUnsignedShort(); // L: 179
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label247;
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
				break label247;
			} finally {
				try {
					var1.close(); // L: 189
				} catch (Exception var24) { // L: 191
				}

			}

			return; // L: 155
		}

		this.unwrittenChanges = false; // L: 193
	} // L: 194

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1414 < SecureRandomCallable.method2320() - 60000L) { // L: 197
			this.write(); // L: 198
		}

	} // L: 200

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "97"
	)
	boolean method2809() {
		return this.unwrittenChanges; // L: 203
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lox;",
		garbageValue = "1981251005"
	)
	public static StudioGame[] method2838() {
		return new StudioGame[]{StudioGame.game5, StudioGame.game4, StudioGame.runescape, StudioGame.stellardawn, StudioGame.oldscape, StudioGame.game3}; // L: 17
	}
}
