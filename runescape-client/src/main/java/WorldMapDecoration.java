import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aa")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1951458321
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1622720231
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1680868715
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Ljava/io/File;I)V",
		garbageValue = "1315266294"
	)
	static void method406(File var0) {
		FileSystem.FileSystem_cacheDir = var0;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(ILcy;ZI)I",
		garbageValue = "-1984297327"
	)
	static int method405(int var0, Script var1, boolean var2) {
		Widget var3 = TileItem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.method176(WorldMapIcon_0.getWidgetClickMask(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
