import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jd")
public class class267 {
	@ObfuscatedName("sz")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;

	static {
		int var0 = 0;
		int var1 = 0;
		class262[] var2 = new class262[]{class262.field3194, class262.field3193};
		class262[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class262 var5 = var3[var4];
			if (var5.field3192 > var0) {
				var0 = var5.field3192;
			}

			if (var5.field3195 > var1) {
				var1 = var5.field3195;
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "2132527544"
	)
	static int method4991(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Canvas.method498(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class143.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class26.method351(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class261.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = SoundSystem.Client_plane;
					var4 = class15.baseX * 64 + (class262.localPlayer.x >> 7);
					var5 = WorldMapSprite.baseY * 64 + (class262.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					ChatChannel.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Canvas.method498(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					ChatChannel.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class143.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					ChatChannel.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class26.method351(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					ChatChannel.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.field843;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.field633;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}
}
