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

@ObfuscatedName("ee")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("ac")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("ab")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("an")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("ao")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 283156368676865781L
	)
	long field1364;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class258.archive2.getGroupFileCount(19); // L: 29
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
					var4.method3588(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (class258.archive2.method6393(15)) { // L: 50
			var2 = class258.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "189351145"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2); // L: 58
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true; // L: 59
		}

	} // L: 60

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "17769"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "106800955"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1782127200"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "113"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-81497682"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1424772556"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lre;",
		garbageValue = "20"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class350.getPreferencesFile("2", class470.field4870.name, var1); // L: 104
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "685094308"
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
						var2 += WorldMapLabel.stringCp1252NullTerminatedByteSize((String)var7); // L: 120
					}

					++var3; // L: 121
				}
			}

			Buffer var23 = new Buffer(var2); // L: 125
			var23.writeByte(2); // L: 126
			var23.writeShort(var3); // L: 127
			Iterator var24 = this.map.entrySet().iterator(); // L: 128

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next(); // L: 129
				int var13 = (Integer)var12.getKey(); // L: 131
				if (this.intsPersistence[var13]) { // L: 132
					var23.writeShort(var13); // L: 133
					Object var8 = var12.getValue(); // L: 134
					class467 var9 = class467.method8473(var8.getClass()); // L: 135
					var23.writeByte(var9.field4862); // L: 136
					class467.method8475(var8, var23); // L: 137
				}
			}

			var1.write(var23.array, 0, var23.offset); // L: 141
		} catch (Exception var21) { // L: 143
		} finally {
			try {
				var1.close(); // L: 146
			} catch (Exception var20) { // L: 148
			}

		}

		this.unwrittenChanges = false; // L: 150
		this.field1364 = WorldMapSection2.method4844(); // L: 151
	} // L: 152

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-183595775"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 155

		label213: {
			try {
				byte[] var2 = new byte[(int)var1.length()]; // L: 157

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 158 159 162
					var4 = var1.read(var2, var3, var2.length - var3); // L: 160
					if (var4 == -1) { // L: 161
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2); // L: 164
				if (var14.array.length - var14.offset < 1) {
					return; // L: 165
				}

				int var15 = var14.readUnsignedByte(); // L: 166
				if (var15 >= 0 && var15 <= 2) {
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) { // L: 168
						var16 = var14.readUnsignedShort(); // L: 169
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label213;
							}

							var8 = var14.readUnsignedShort(); // L: 171
							var9 = var14.readUnsignedByte(); // L: 172
							class467 var10 = (class467)SpriteMask.findEnumerated(class467.method8480(), var9); // L: 173
							Object var11 = var10.method8465(var14); // L: 174
							if (this.intsPersistence[var8]) { // L: 175
								this.map.put(var8, var11); // L: 176
							}

							++var7; // L: 170
						}
					} else {
						var16 = var14.readUnsignedShort(); // L: 181

						for (var7 = 0; var7 < var16; ++var7) { // L: 182
							var8 = var14.readUnsignedShort(); // L: 183
							var9 = var14.readInt(); // L: 184
							if (this.intsPersistence[var8]) { // L: 185
								this.map.put(var8, var9); // L: 186
							}
						}

						var7 = var14.readUnsignedShort(); // L: 189
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label213;
							}

							var14.readUnsignedShort(); // L: 191
							var14.readStringCp1252NullTerminated(); // L: 192
							++var8; // L: 190
						}
					}
				}
			} catch (Exception var25) { // L: 196
				break label213;
			} finally {
				try {
					var1.close(); // L: 199
				} catch (Exception var24) { // L: 201
				}

			}

			return; // L: 167
		}

		this.unwrittenChanges = false; // L: 203
	} // L: 204

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "295942057"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1364 < WorldMapSection2.method4844() - 60000L) { // L: 207
			this.write(); // L: 208
		}

	} // L: 210

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 213
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2118839909"
	)
	static final int method2717(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 943
		int var4 = var0 & var2 - 1; // L: 944
		int var5 = var1 / var2; // L: 945
		int var6 = var1 & var2 - 1; // L: 946
		int var7 = class137.method3080(var3, var5); // L: 947
		int var8 = class137.method3080(var3 + 1, var5); // L: 948
		int var9 = class137.method3080(var3, var5 + 1); // L: 949
		int var10 = class137.method3080(var3 + 1, var5 + 1); // L: 950
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 953
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16); // L: 954
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1; // L: 959
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16); // L: 960
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1; // L: 965
		int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16); // L: 966
		return var15; // L: 968
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1952675812"
	)
	static void method2724() {
		if (Client.oculusOrbState == 1) { // L: 12205
			Client.field553 = true; // L: 12206
		}

	} // L: 12208
}
