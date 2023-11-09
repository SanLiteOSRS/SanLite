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

@ObfuscatedName("ef")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1140429649
	)
	static int field1366;
	@ObfuscatedName("av")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("as")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ax")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("ap")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -1995310396492266989L
	)
	long field1372;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = MouseRecorder.archive2.getGroupFileCount(19); // L: 29
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
					var4.method3613(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (MouseRecorder.archive2.method6657(15)) { // L: 50
			var2 = MouseRecorder.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "985051977"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 59
		}

	} // L: 60

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1651551854"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "32"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1825344050"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-2008147475"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1134556418"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1003252827"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lsu;",
		garbageValue = "2"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return FontName.getPreferencesFile("2", GameBuild.field3841.name, var1); // L: 104
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1985334055"
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
					} else if (var7 instanceof String) {
						var2 += Widget.stringCp1252NullTerminatedByteSize((String)var7); // L: 120
					}

					++var3; // L: 121
				}
			}

			Buffer var28 = new Buffer(var2); // L: 125
			var28.writeByte(2); // L: 126
			var28.writeShort(var3); // L: 127
			Iterator var29 = this.map.entrySet().iterator(); // L: 128

			label147:
			while (true) {
				Entry var16;
				int var17;
				do {
					if (!var29.hasNext()) {
						var1.write(var28.array, 0, var28.offset); // L: 161
						break label147;
					}

					var16 = (Entry)var29.next(); // L: 129
					var17 = (Integer)var16.getKey(); // L: 131
				} while(!this.intsPersistence[var17]); // L: 132

				var28.writeShort(var17); // L: 133
				Object var8 = var16.getValue(); // L: 134
				Class var10 = var8.getClass(); // L: 136
				class490[] var11 = class490.method8761(); // L: 139
				int var12 = 0;

				class490 var9;
				while (true) {
					if (var12 >= var11.length) {
						var9 = null; // L: 150
						break;
					}

					class490 var13 = var11[var12]; // L: 141
					if (var10 == var13.field4974) { // L: 143
						var9 = var13; // L: 144
						break; // L: 145
					}

					++var12; // L: 140
				}

				var28.writeByte(var9.field4975); // L: 153
				class486 var18 = class490.method8756(var8.getClass()); // L: 155
				var18.vmethod8774(var8, var28); // L: 156
			}
		} catch (Exception var26) { // L: 163
		} finally {
			try {
				var1.close(); // L: 166
			} catch (Exception var25) { // L: 168
			}

		}

		this.unwrittenChanges = false; // L: 170
		this.field1372 = WallObject.method5027(); // L: 171
	} // L: 172

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "189895418"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 175

		label245: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 177

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 178 179 182
					var4 = var1.read(var2, var3, var2.length - var3); // L: 180
					if (var4 == -1) { // L: 181
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 184
				if (var14.array.length - var14.offset >= 1) {
					int var15 = var14.readUnsignedByte(); // L: 186
					if (var15 >= 0 && var15 <= 2) {
						int var7;
						int var8;
						int var9;
						int var16;
						if (var15 >= 2) { // L: 188
							var16 = var14.readUnsignedShort(); // L: 189
							var7 = 0;

							while (true) {
								if (var7 >= var16) {
									break label245;
								}

								var8 = var14.readUnsignedShort(); // L: 191
								var9 = var14.readUnsignedByte(); // L: 192
								class490 var10 = (class490)GameObject.findEnumerated(class490.method8761(), var9); // L: 193
								Object var11 = var10.method8758(var14); // L: 194
								if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 195
									this.map.put(var8, var11); // L: 196
								}

								++var7; // L: 190
							}
						} else {
							var16 = var14.readUnsignedShort(); // L: 201

							for (var7 = 0; var7 < var16; ++var7) { // L: 202
								var8 = var14.readUnsignedShort(); // L: 203
								var9 = var14.readInt(); // L: 204
								if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 205
									this.map.put(var8, var9); // L: 206
								}
							}

							var7 = var14.readUnsignedShort(); // L: 209
							var8 = 0;

							while (true) {
								if (var8 >= var7) {
									break label245;
								}

								var14.readUnsignedShort(); // L: 211
								var14.readStringCp1252NullTerminated(); // L: 212
								++var8; // L: 210
							}
						}
					}

					return; // L: 187
				}
			} catch (Exception var25) { // L: 216
				break label245;
			} finally {
				try {
					var1.close(); // L: 219
				} catch (Exception var24) { // L: 221
				}

			}

			return; // L: 185
		}

		this.unwrittenChanges = false; // L: 223
	} // L: 224

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "125"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1372 < WallObject.method5027() - 60000L) { // L: 227
			this.write(); // L: 228
		}

	} // L: 230

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-26"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 233
	}
}
