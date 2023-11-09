import java.io.EOFException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ep")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("aw")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("ac")
	@Export("map")
	Map map;
	/** @deprecated */
	@Deprecated
	@ObfuscatedName("au")
	@Export("strings")
	String[] strings;
	@ObfuscatedName("ab")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -7171747788514623875L
	)
	long field1371;

	Varcs() {
		this.unwrittenChanges = false; // L: 25
		int var1 = class85.archive2.getGroupFileCount(19); // L: 29
		this.map = new HashMap(); // L: 30
		this.intsPersistence = new boolean[var1]; // L: 31

		int var2;
		for (var2 = 0; var2 < var1; ++var2) { // L: 32
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2); // L: 35
			VarcInt var3;
			if (var4 != null) { // L: 36
				var3 = var4; // L: 37
			} else {
				byte[] var5 = class294.VarcInt_archive.takeFile(19, var2); // L: 40
				var4 = new VarcInt(); // L: 41
				if (var5 != null) {
					var4.method3680(new Buffer(var5)); // L: 42
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2); // L: 43
				var3 = var4; // L: 44
			}

			this.intsPersistence[var2] = var3.persist; // L: 47
		}

		var2 = 0; // L: 49
		if (class85.archive2.method6646(15)) { // L: 50
			var2 = class85.archive2.getGroupFileCount(15); // L: 51
		}

		this.strings = new String[var2]; // L: 53
		this.read(); // L: 54
	} // L: 55

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1427050414"
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
		garbageValue = "721184906"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1); // L: 63
		return var2 instanceof Integer ? (Integer)var2 : -1; // L: 64 65 67
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-875468987"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2); // L: 71
	} // L: 72

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1231946680"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1); // L: 75
		return var2 instanceof String ? (String)var2 : ""; // L: 76 77 79
	}

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1623165865"
	)
	@Export("setStringOld")
	void setStringOld(int var1, String var2) {
		this.strings[var1] = var2; // L: 84
	} // L: 85

	/** @deprecated */
	@Deprecated
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "8"
	)
	@Export("getStringOld")
	String getStringOld(int var1) {
		return this.strings[var1]; // L: 89
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-39979061"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZB)Lsy;",
		garbageValue = "61"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return Rasterizer3D.getPreferencesFile("2", Client.field490.name, var1); // L: 104
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1900216587"
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
						var2 += DynamicObject.stringCp1252NullTerminatedByteSize((String)var7);
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
					class478 var9 = class478.method8888(var8.getClass()); // L: 135
					var23.writeByte(var9.field4950); // L: 136
					class478.method8906(var8, var23); // L: 137
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
		this.field1371 = class96.method2634(); // L: 151
	} // L: 152

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false); // L: 155

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
			if (var15 < 0 || var15 > 2) {
				return; // L: 167
			}

			int var7;
			int var8;
			int var9;
			int var16;
			if (var15 >= 2) { // L: 168
				var16 = var14.readUnsignedShort(); // L: 169

				for (var7 = 0; var7 < var16; ++var7) { // L: 170
					var8 = var14.readUnsignedShort(); // L: 171
					var9 = var14.readUnsignedByte(); // L: 172
					class478 var10 = (class478)StructComposition.findEnumerated(class478.method8889(), var9); // L: 173
					Object var11 = var10.method8895(var14); // L: 174
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 175
						this.map.put(var8, var11); // L: 176
					}
				}
			} else {
				var16 = var14.readUnsignedShort(); // L: 181

				for (var7 = 0; var7 < var16; ++var7) { // L: 182
					var8 = var14.readUnsignedShort(); // L: 183
					var9 = var14.readInt(); // L: 184
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) { // L: 185
						this.map.put(var8, var9); // L: 186
					}
				}

				var7 = var14.readUnsignedShort(); // L: 189

				for (var8 = 0; var8 < var7; ++var8) { // L: 190
					var14.readUnsignedShort(); // L: 191
					var14.readStringCp1252NullTerminated(); // L: 192
				}
			}
		} catch (Exception var25) { // L: 196
		} finally {
			try {
				var1.close(); // L: 199
			} catch (Exception var24) { // L: 201
			}

		}

		this.unwrittenChanges = false; // L: 203
	} // L: 204

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2118979895"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1371 < class96.method2634() - 60000L) { // L: 207
			this.write(); // L: 208
		}

	} // L: 210

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1302793492"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges; // L: 213
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)[Llm;",
		garbageValue = "-49"
	)
	public static class287[] method2720() {
		return new class287[]{class287.field3206, class287.field3197, class287.field3201, class287.field3199, class287.field3200, class287.field3202, class287.field3208, class287.field3203, class287.field3204, class287.field3205, class287.field3196}; // L: 18
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZI)I",
		garbageValue = "2095977299"
	)
	static int method2755(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 996
			var0 -= 1000; // L: 997
			var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 998
		} else {
			var3 = var2 ? SoundSystem.scriptDotWidget : class1.field5; // L: 1000
		}

		class144.invalidateWidget(var3); // L: 1001
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1002
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1022
				var3.modelType = 2; // L: 1023
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1024
				return 1; // L: 1025
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1027
				var3.modelType = 3; // L: 1028
				var3.modelId = MusicPatchNode.localPlayer.appearance.getChatHeadId(); // L: 1029
				return 1; // L: 1030
			} else if (var0 == 1207) { // L: 1032
				boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1033
				SecureRandomCallable.method2223(var3, MusicPatchNode.localPlayer.appearance, var7); // L: 1034
				return 1; // L: 1035
			} else if (var0 == 1208) { // L: 1037
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1038
				if (var3.field3584 == null) { // L: 1039
					throw new RuntimeException(""); // L: 1040
				} else {
					class282.method5683(var3, var4); // L: 1042
					return 1; // L: 1043
				}
			} else if (var0 == 1209) { // L: 1045
				Interpreter.Interpreter_intStackSize -= 2; // L: 1046
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1047
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1048
				if (var3.field3584 == null) { // L: 1049
					throw new RuntimeException(""); // L: 1050
				} else {
					ChatChannel.method2156(var3, var4, var5); // L: 1052
					return 1; // L: 1053
				}
			} else if (var0 == 1210) { // L: 1055
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1056
				if (var3.field3584 == null) { // L: 1057
					throw new RuntimeException(""); // L: 1058
				} else {
					class162.method3452(var3, MusicPatchNode.localPlayer.appearance.field3521, var4); // L: 1060
					return 1; // L: 1061
				}
			} else {
				return 2; // L: 1063
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 1003
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1004
			var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1005
			var3.itemId = var4; // L: 1006
			var3.itemQuantity = var5; // L: 1007
			ItemComposition var6 = HealthBarUpdate.ItemComposition_get(var4); // L: 1008
			var3.modelAngleX = var6.xan2d; // L: 1009
			var3.modelAngleY = var6.yan2d; // L: 1010
			var3.modelAngleZ = var6.zan2d; // L: 1011
			var3.modelOffsetX = var6.offsetX2d; // L: 1012
			var3.modelOffsetY = var6.offsetY2d; // L: 1013
			var3.modelZoom = var6.zoom2d; // L: 1014
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1015
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 1016
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1017
			}

			if (var3.field3625 > 0) { // L: 1018
				var3.modelZoom = var3.modelZoom * 32 / var3.field3625;
			} else if (var3.rawWidth > 0) { // L: 1019
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1020
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "2052817619"
	)
	static Date method2747() {
		java.util.Calendar var0 = java.util.Calendar.getInstance(); // L: 1359
		var0.set(2, 0); // L: 1360
		var0.set(5, 1); // L: 1361
		var0.set(1, 1900); // L: 1362
		return var0.getTime(); // L: 1363
	}
}
