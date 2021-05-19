import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("p")
public abstract class class14 extends Node {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	static Archive field129;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;

	class14() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	abstract void vmethod339(Buffer var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	abstract void vmethod338(class11 var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	static void method224() {
		Tiles.field1097 = null;
		class9.field71 = null;
		Tiles.field1088 = null;
		Tiles.field1086 = null;
		Tiles.field1105 = null;
		Tiles.field1090 = null;
		StructComposition.field1730 = null;
		Tiles.Tiles_hue = null;
		class280.Tiles_saturation = null;
		Tiles.Tiles_lightness = null;
		class20.Tiles_hueMultiplier = null;
		AbstractByteArrayCopier.field3115 = null;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-5"
	)
	static final void method222(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your ignore list").toString();
		WorldMapScaleHandler.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "-54"
	)
	static int method216(int var0, Script var1, boolean var2) {
		Widget var3 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "-112"
	)
	static int method215(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) {
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) {
				if (var0 == 6750) {
					++class13.Interpreter_stringStackSize;
					return 1;
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
						NPCComposition var4 = class8.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					++WorldMapCacheName.Interpreter_intStackSize;
					return 1;
				}
			} else {
				--WorldMapCacheName.Interpreter_intStackSize;
				return 1;
			}
		} else {
			WorldMapCacheName.Interpreter_intStackSize -= 2;
			--class13.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-464058040"
	)
	static boolean method223() {
		return (Client.drawPlayerNames & 2) != 0;
	}
}
