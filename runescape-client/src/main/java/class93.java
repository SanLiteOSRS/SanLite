import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
public class class93 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "[Lnf;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("localPlayer")
	static Player localPlayer;

	@ObfuscatedName("d")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "992004750"
	)
	static int method2080(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var5 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var5 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]);
			if (var5.itemId != -1) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else {
			return 2;
		}
	}
}
