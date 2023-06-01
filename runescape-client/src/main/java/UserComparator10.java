import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@ObfuscatedName("ey")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static IndexedSprite field1443;
	@ObfuscatedName("ay")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqc;Lqc;B)I",
		garbageValue = "-119"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "949903405"
	)
	static boolean method2882(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 61
			try {
				if (!class31.field148.startsWith("win")) { // L: 63
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 64
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 65

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 66
						if (var14.indexOf(var0.charAt(var4)) == -1) { // L: 67
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 69
					return true; // L: 70
				}
			} catch (Throwable var8) { // L: 72
				return false; // L: 73
			}
		} else if (var1 == 1) { // L: 76
			try {
				Applet var7 = class31.field150; // L: 79
				Object[] var5 = new Object[]{(new URL(class31.field150.getCodeBase(), var0)).toString()}; // L: 80
				Object var13 = JSObject.getWindow(var7).call(var2, var5); // L: 83
				return var13 != null; // L: 86
			} catch (Throwable var9) { // L: 88
				return false; // L: 89
			}
		} else if (var1 == 2) { // L: 92
			try {
				class31.field150.getAppletContext().showDocument(new URL(class31.field150.getCodeBase(), var0), "_blank"); // L: 94
				return true; // L: 95
			} catch (Exception var10) { // L: 97
				return false; // L: 98
			}
		} else if (var1 == 3) { // L: 101
			try {
				Applet var3 = class31.field150; // L: 103
				JSObject.getWindow(var3).call("loggedout", (Object[])null); // L: 106
			} catch (Throwable var12) { // L: 109
			}

			try {
				class31.field150.getAppletContext().showDocument(new URL(class31.field150.getCodeBase(), var0), "_top"); // L: 111
				return true; // L: 112
			} catch (Exception var11) { // L: 114
				return false; // L: 115
			}
		} else {
			throw new IllegalArgumentException(); // L: 118
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-860990495"
	)
	static int method2886(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1000
			var0 -= 1000; // L: 1001
			var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1002
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 1004
		}

		HorizontalAlignment.invalidateWidget(var3); // L: 1005
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1006
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1026
				var3.modelType = 2; // L: 1027
				var3.modelId = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1028
				return 1; // L: 1029
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1031
				var3.modelType = 3; // L: 1032
				var3.modelId = HitSplatDefinition.localPlayer.appearance.getChatHeadId(); // L: 1033
				return 1; // L: 1034
			} else if (var0 == 1207) { // L: 1036
				boolean var7 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 1037
				class14.method168(var3, HitSplatDefinition.localPlayer.appearance, var7); // L: 1038
				return 1; // L: 1039
			} else if (var0 == 1208) { // L: 1041
				var4 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1042
				if (var3.field3666 == null) { // L: 1043
					throw new RuntimeException(""); // L: 1044
				} else {
					class323.method6096(var3, var4); // L: 1046
					return 1; // L: 1047
				}
			} else if (var0 == 1209) { // L: 1049
				class336.Interpreter_intStackSize -= 2; // L: 1050
				var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 1051
				var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 1052
				if (var3.field3666 == null) { // L: 1053
					throw new RuntimeException(""); // L: 1054
				} else {
					class17.method250(var3, var4, var5); // L: 1056
					return 1; // L: 1057
				}
			} else if (var0 == 1210) { // L: 1059
				var4 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1060
				if (var3.field3666 == null) { // L: 1061
					throw new RuntimeException(""); // L: 1062
				} else {
					KeyHandler.method414(var3, HitSplatDefinition.localPlayer.appearance.field3543, var4); // L: 1064
					return 1; // L: 1065
				}
			} else {
				return 2; // L: 1067
			}
		} else {
			class336.Interpreter_intStackSize -= 2; // L: 1007
			var4 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 1008
			var5 = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 1009
			var3.itemId = var4; // L: 1010
			var3.itemQuantity = var5; // L: 1011
			ItemComposition var6 = class230.ItemComposition_get(var4); // L: 1012
			var3.modelAngleX = var6.xan2d; // L: 1013
			var3.modelAngleY = var6.yan2d; // L: 1014
			var3.modelAngleZ = var6.zan2d; // L: 1015
			var3.modelOffsetX = var6.offsetX2d; // L: 1016
			var3.modelOffsetY = var6.offsetY2d; // L: 1017
			var3.modelZoom = var6.zoom2d; // L: 1018
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 1019
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 1020
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1021
			}

			if (var3.field3664 > 0) { // L: 1022
				var3.modelZoom = var3.modelZoom * 32 / var3.field3664;
			} else if (var3.rawWidth > 0) { // L: 1023
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1024
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-52"
	)
	static final void method2887(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString(); // L: 166
		HealthBarUpdate.addGameMessage(30, "", var1); // L: 168
	} // L: 170
}
