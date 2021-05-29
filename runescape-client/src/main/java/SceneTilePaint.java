import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ga")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1657490379
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -338901479
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 74746585
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1630451137
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -80564939
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("j")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 426134523
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "1"
	)
	static int method4258(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1201682368"
	)
	public static void method4259() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1626936369"
	)
	static int method4260(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--Interpreter.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--class44.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--class44.Interpreter_intStackSize;
										return 1;
									}
								} else {
									class44.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--Interpreter.Interpreter_stringStackSize;
								--class44.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--class44.Interpreter_intStackSize;
							return 1;
						}
					} else {
						class44.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					class44.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				class44.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			class44.Interpreter_intStackSize -= 5;
			return 1;
		}
	}
}
