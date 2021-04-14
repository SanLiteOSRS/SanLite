import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("d")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("f")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljt;Ljt;I)I",
		garbageValue = "-1018432181"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		signature = "(ILcc;ZB)I",
		garbageValue = "20"
	)
	static int method1217(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = WorldMapScaleHandler.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					Tile.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Login.clientPreferences.windowMode;
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--class16.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					Interpreter.Interpreter_stringStackSize -= 2;
					--class16.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--Interpreter.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					Login.clientPreferences.windowMode = var3;
					Message.savePreferences();
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(ILcc;ZB)I",
		garbageValue = "73"
	)
	static int method1216(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) {
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) {
				if (var0 == 6750) {
					++Interpreter.Interpreter_stringStackSize;
					return 1;
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
						NPCComposition var4 = GraphicsObject.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					++class16.Interpreter_intStackSize;
					return 1;
				}
			} else {
				--class16.Interpreter_intStackSize;
				return 1;
			}
		} else {
			class16.Interpreter_intStackSize -= 2;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		}
	}
}
