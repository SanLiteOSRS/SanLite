import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("co")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lev;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("b")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("l")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("m")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -289623255
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1416487067
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1408552327
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1198237171
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "[Lll;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)[Lll;",
		garbageValue = "20409592"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("f")
	static double method2356(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4;
		double var6 = Math.exp(var8 * -var8 / 2.0D) / Math.sqrt(6.283185307179586D);
		return var6 / var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "1422774584"
	)
	static int method2355(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			MilliClock.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = UserComparator4.getWidget(var3);
				if (var6.children == null) {
					var6.children = new Widget[var5 + 1];
				}

				if (var6.children.length <= var5) {
					Widget[] var7 = new Widget[var5 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var5 > 0 && var6.children[var5 - 1] == null) {
					throw new RuntimeException("" + (var5 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var5;
					var12.isIf3 = true;
					var6.children[var5] = var12;
					if (var2) {
						MouseRecorder.field621 = var12;
					} else {
						Interpreter.field1122 = var12;
					}

					GrandExchangeOfferOwnWorldComparator.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var9;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var9 = var2 ? MouseRecorder.field621 : Interpreter.field1122;
				Widget var10 = UserComparator4.getWidget(var9.id);
				var10.children[var9.childIndex] = null;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var9 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
				var9.children = null;
				GrandExchangeOfferOwnWorldComparator.invalidateWidget(var9);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var9 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]);
					if (var9 != null) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							MouseRecorder.field621 = var9;
						} else {
							Interpreter.field1122 = var9;
						}
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				MilliClock.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
				Widget var11 = ItemContainer.getWidgetChild(var3, var4);
				if (var11 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						MouseRecorder.field621 = var11;
					} else {
						Interpreter.field1122 = var11;
					}
				} else {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
