import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("io")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1091037229
	)
	@Export("width")
	int width;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -263102101
	)
	@Export("height")
	int height;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1407371269
	)
	@Export("x")
	int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -673708259
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lha;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1372033756"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "663"
	)
	public static boolean method4966(int var0) {
		return (var0 >> 22 & 1) != 0; // L: 25
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "-22"
	)
	static int method4964(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 828
			var0 -= 1000; // L: 829
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 830
		} else {
			var3 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 832
		}

		class220.invalidateWidget(var3); // L: 833
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 834
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 854
				var3.modelType = 2; // L: 855
				var3.modelId = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 856
				return 1; // L: 857
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 859
				var3.modelType = 3; // L: 860
				var3.modelId = class28.localPlayer.appearance.getChatHeadId(); // L: 861
				return 1; // L: 862
			} else {
				return 2; // L: 864
			}
		} else {
			TaskHandler.Interpreter_intStackSize -= 2; // L: 835
			int var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 836
			int var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 837
			var3.itemId = var4; // L: 838
			var3.itemQuantity = var5; // L: 839
			ItemComposition var6 = class258.ItemComposition_get(var4); // L: 840
			var3.modelAngleX = var6.xan2d; // L: 841
			var3.modelAngleY = var6.yan2d; // L: 842
			var3.modelAngleZ = var6.zan2d; // L: 843
			var3.modelOffsetX = var6.offsetX2d; // L: 844
			var3.modelOffsetY = var6.offsetY2d; // L: 845
			var3.modelZoom = var6.zoom2d; // L: 846
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 847
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 848
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 849
			}

			if (var3.field3421 > 0) { // L: 850
				var3.modelZoom = var3.modelZoom * 32 / var3.field3421;
			} else if (var3.rawWidth > 0) { // L: 851
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 852
		}
	}
}
