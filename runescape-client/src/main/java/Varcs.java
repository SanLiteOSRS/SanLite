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

@ObfuscatedName("ek")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	static IndexedSprite field1405;
	@ObfuscatedName("ak")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("ax")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ao")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("ah")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -4197071780898285755L
	)
	long field1408;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = SoundSystem.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var3 = Client.method1828(var2); // L: 33
			this.intsPersistence[var2] = var3.persist; // L: 34
		}

		var2 = 0; // L: 36
		if (SoundSystem.archive2.method6867(15)) { // L: 37
			var2 = SoundSystem.archive2.getGroupFileCount(15); // L: 38
		}

		this.strings = new String[var2]; // L: 40
		this.read(); // L: 41
	} // L: 42

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "122334652"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 45
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 46
		}

	} // L: 47

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-72"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 50
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 51 52 54
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1655952111"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 58
	} // L: 59

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1561446610"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 62
		return var2 instanceof String ? (String)var2 : ""; // L: 63 64 66
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1584969503"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 71
	} // L: 72

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "12"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 76
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lto;",
		garbageValue = "-1600709615"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class17.getPreferencesFile("2", UrlRequester.field1436.name, var1); // L: 91
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1883242657"
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
						var2 += class478.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3; // L: 108
				}
			}

			Buffer var26 = new Buffer(var2); // L: 112
			var26.writeByte(2); // L: 113
			var26.writeShort(var3); // L: 114
			Iterator var27 = this.map.entrySet().iterator(); // L: 115

			while (var27.hasNext()) {
				Entry var15 = (Entry)var27.next(); // L: 116
				int var16 = (Integer)var15.getKey(); // L: 118
				if (this.intsPersistence[var16]) { // L: 119
					var26.writeShort(var16); // L: 120
					Object var8 = var15.getValue(); // L: 121
					class517 var9 = class517.method9029(var8.getClass()); // L: 122
					var26.writeByte(var9.field5069); // L: 123
					Class var11 = var8.getClass(); // L: 126
					class517 var12 = class517.method9029(var11); // L: 128
					if (var12 == null) { // L: 129
						throw new IllegalArgumentException();
					}

					class513 var10 = var12.field5071; // L: 130
					var10.vmethod9055(var8, var26); // L: 133
				}
			}

			var1.write(var26.array, 0, var26.offset); // L: 138
		} catch (Exception var24) { // L: 140
		} finally {
			try {
				var1.close(); // L: 143
			} catch (Exception var23) { // L: 145
			}

		}

		this.unwrittenChanges = false; // L: 147
		this.field1408 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 148
	} // L: 149

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-16884896"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 152

		try {
			byte[] var2 = new byte[(int)var1.length()]; // L: 154

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 155 156 159
				var4 = var1.read(var2, var3, var2.length - var3); // L: 157
				if (var4 == -1) { // L: 158
					throw new EOFException();
				}
			}

			Buffer var14 = new Buffer(var2); // L: 161
			if (var14.array.length - var14.offset < 1) {
				return; // L: 162
			}

			int var15 = var14.readUnsignedByte(); // L: 163
			if (var15 < 0 || var15 > 2) {
				return; // L: 164
			}

			int var7;
			int var8;
			int var9;
			int var16;
			if (var15 >= 2) { // L: 165
				var16 = var14.readUnsignedShort(); // L: 166

				for (var7 = 0; var7 < var16; ++var7) { // L: 167
					var8 = var14.readUnsignedShort(); // L: 168
					var9 = var14.readUnsignedByte(); // L: 169
					class517 var10 = (class517)SequenceDefinition.findEnumerated(class517.method9047(), var9); // L: 170
					Object var11 = var10.method9032(var14); // L: 171
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 172
						this.map.put(var8, var11); // L: 173
					}
				}
			} else {
				var16 = var14.readUnsignedShort(); // L: 178

				for (var7 = 0; var7 < var16; ++var7) { // L: 179
					var8 = var14.readUnsignedShort(); // L: 180
					var9 = var14.readInt(); // L: 181
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 182
						this.map.put(var8, var9); // L: 183
					}
				}

				var7 = var14.readUnsignedShort(); // L: 186

				for (var8 = 0; var8 < var7; ++var8) { // L: 187
					var14.readUnsignedShort(); // L: 188
					var14.readStringCp1252NullTerminated(); // L: 189
				}
			}
		} catch (Exception var25) { // L: 193
		} finally {
			try {
				var1.close(); // L: 196
			} catch (Exception var24) { // L: 198
			}

		}

		this.unwrittenChanges = false; // L: 200
	} // L: 201

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-409824509"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1408 < GrandExchangeOfferTotalQuantityComparator.method7049() - 60000L) { // L: 204
			this.write(); // L: 205
		}

	} // L: 207

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1882993315"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 210
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;I)V",
		garbageValue = "-1336759241"
	)
	public static void method2787(AbstractArchive var0) {
		class522.field5090 = var0; // L: 20
	} // L: 21
}
