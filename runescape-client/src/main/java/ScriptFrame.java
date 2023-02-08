import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bl")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static ClanChannel field471;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -909932757
	)
	static int field467;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1409452649
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("v")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("s")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lda;FFFFFFFFS)V",
		garbageValue = "19659"
	)
	static void method1155(class125 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) { // L: 305
			var0.field1520 = var1; // L: 308
			float var9 = var4 - var1; // L: 309
			float var10 = var8 - var5; // L: 310
			float var11 = var2 - var1; // L: 311
			float var12 = 0.0F; // L: 312
			float var13 = 0.0F; // L: 313
			if (0.0D != (double)var11) { // L: 314
				var12 = (var6 - var5) / var11; // L: 315
			}

			var11 = var4 - var3; // L: 317
			if (0.0D != (double)var11) { // L: 318
				var13 = (var8 - var7) / var11; // L: 319
			}

			float var14 = 1.0F / (var9 * var9); // L: 321
			float var15 = var12 * var9; // L: 322
			float var16 = var9 * var13; // L: 323
			var0.field1528 = (var16 + var15 - var10 - var10) * var14 / var9; // L: 324
			var0.field1529 = (var10 + var10 + var10 - var15 - var15 - var16) * var14; // L: 325
			var0.field1543 = var12; // L: 326
			var0.field1531 = var5; // L: 327
		}
	} // L: 306 328

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;Ljava/lang/String;Ljava/lang/String;I)Lnv;",
		garbageValue = "1624400192"
	)
	public static Font method1152(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 143
		int var5 = var0.getFileId(var4, var3); // L: 144
		return class33.method488(var0, var1, var4, var5); // L: 145
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILba;ZI)I",
		garbageValue = "-2085800684"
	)
	static int method1154(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1002
			var0 -= 1000; // L: 1003
			var3 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]); // L: 1004
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class85.field1091; // L: 1006
		}

		LoginScreenAnimation.invalidateWidget(var3); // L: 1007
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1008
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1028
				var3.modelType = 2; // L: 1029
				var3.modelId = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]; // L: 1030
				return 1; // L: 1031
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1033
				var3.modelType = 3; // L: 1034
				var3.modelId = class387.localPlayer.appearance.getChatHeadId(); // L: 1035
				return 1; // L: 1036
			} else {
				return 2; // L: 1038
			}
		} else {
			class302.Interpreter_intStackSize -= 2; // L: 1009
			int var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize]; // L: 1010
			int var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1]; // L: 1011
			var3.itemId = var4; // L: 1012
			var3.itemQuantity = var5; // L: 1013
			ItemComposition var6 = TileItem.ItemComposition_get(var4); // L: 1014
			var3.modelAngleX = var6.xan2d; // L: 1015
			var3.modelAngleY = var6.yan2d; // L: 1016
			var3.modelAngleZ = var6.zan2d; // L: 1017
			var3.modelOffsetX = var6.offsetX2d; // L: 1018
			var3.modelOffsetY = var6.offsetY2d; // L: 1019
			var3.modelZoom = var6.zoom2d; // L: 1020
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0; // L: 1021
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 1022
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1023
			}

			if (var3.field3616 > 0) { // L: 1024
				var3.modelZoom = var3.modelZoom * 32 / var3.field3616;
			} else if (var3.rawWidth > 0) { // L: 1025
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1026
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2147483647"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 4117
			PacketWriter.clientPreferences.method2551(!PacketWriter.clientPreferences.method2572()); // L: 4118
			if (PacketWriter.clientPreferences.method2572()) { // L: 4119
				class280.addGameMessage(99, "", "Roofs are now all hidden"); // L: 4120
			} else {
				class280.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 4123
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 4126
			PacketWriter.clientPreferences.method2488();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 4127
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 4128
		}

		if (Client.staffModLevel >= 2) { // L: 4129
			if (var0.equalsIgnoreCase("errortest")) { // L: 4130
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 4131
				GrandExchangeOfferUnitPriceComparator.worldMap.showCoord = !GrandExchangeOfferUnitPriceComparator.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 4132
				PacketWriter.clientPreferences.method2485(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 4133
				PacketWriter.clientPreferences.method2485(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 4134
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 4135
				WorldMapManager.method5197();
			}
		}

		PacketBufferNode var1 = Renderable.getPacketBufferNode(ClientPacket.field3091, Client.packetWriter.isaacCipher); // L: 4138
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 4139
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 4140
		Client.packetWriter.addNode(var1); // L: 4141
	} // L: 4142

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-834303604"
	)
	static void method1156() {
		Client.menuOptionsCount = 0; // L: 9226
		Client.isMenuOpen = false; // L: 9227
	} // L: 9228
}
