import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bg")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "[Lrx;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("h")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12804

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lmg;Lmg;B)I",
		garbageValue = "-94"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12807
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12808
				if (Client.worldId == var1.world) { // L: 12809
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12810
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12812
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12816
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12820
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljh;",
		garbageValue = "-1399136251"
	)
	static LoginPacket[] method1224() {
		return new LoginPacket[]{LoginPacket.field3300, LoginPacket.field3304, LoginPacket.field3301, LoginPacket.field3305, LoginPacket.field3303, LoginPacket.field3308}; // L: 22
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "1"
	)
	public static final boolean method1212(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 36
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "1356676967"
	)
	static int method1223(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1002
			var0 -= 1000; // L: 1003
			var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1004
		} else {
			var3 = var2 ? class190.scriptDotWidget : class360.field4354; // L: 1006
		}

		class69.invalidateWidget(var3); // L: 1007
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 1008
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 1028
				var3.modelType = 2; // L: 1029
				var3.modelId = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1030
				return 1; // L: 1031
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 1033
				var3.modelType = 3; // L: 1034
				var3.modelId = class155.localPlayer.appearance.getChatHeadId(); // L: 1035
				return 1; // L: 1036
			} else {
				return 2; // L: 1038
			}
		} else {
			class87.Interpreter_intStackSize -= 2; // L: 1009
			int var4 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 1010
			int var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 1011
			var3.itemId = var4; // L: 1012
			var3.itemQuantity = var5; // L: 1013
			ItemComposition var6 = NPCComposition.ItemComposition_get(var4); // L: 1014
			var3.modelAngleX = var6.xan2d; // L: 1015
			var3.modelAngleY = var6.yan2d; // L: 1016
			var3.modelAngleZ = var6.zan2d; // L: 1017
			var3.modelOffsetX = var6.offsetX2d; // L: 1018
			var3.modelOffsetY = var6.offsetY2d; // L: 1019
			var3.modelZoom = var6.zoom2d; // L: 1020
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0; // L: 1021
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 1022
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 1023
			}

			if (var3.field3659 > 0) { // L: 1024
				var3.modelZoom = var3.modelZoom * 32 / var3.field3659;
			} else if (var3.rawWidth > 0) { // L: 1025
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 1026
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1113873989"
	)
	static final void method1219() {
		int var0 = VarcInt.menuX; // L: 8747
		int var1 = NPC.menuY; // L: 8748
		int var2 = AttackOption.menuWidth; // L: 8749
		int var3 = MouseHandler.menuHeight; // L: 8750
		int var4 = 6116423; // L: 8751
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 8752
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 8753
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 8754
		class146.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 8755
		int var5 = MouseHandler.MouseHandler_x; // L: 8756
		int var6 = MouseHandler.MouseHandler_y; // L: 8757

		int var7;
		int var8;
		int var9;
		for (var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 8758
			var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 8759
			var9 = 16777215; // L: 8760
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 8761
				var9 = 16776960;
			}

			class146.fontBold12.draw(class34.method491(var7), var0 + 3, var8, var9, 0); // L: 8762
		}

		var7 = VarcInt.menuX; // L: 8764
		var8 = NPC.menuY; // L: 8765
		var9 = AttackOption.menuWidth; // L: 8766
		int var10 = MouseHandler.menuHeight; // L: 8767

		for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 8769
			if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 8770
				Client.field732[var11] = true;
			}
		}

	} // L: 8773
}
