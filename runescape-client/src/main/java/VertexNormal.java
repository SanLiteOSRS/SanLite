import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ep")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1734980481
	)
	@Export("x")
	int x;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1170582091
	)
	@Export("y")
	int y;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1919036787
	)
	@Export("z")
	int z;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2072706825
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		signature = "(Lep;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Ljava/awt/Component;B)V",
		garbageValue = "84"
	)
	static void method3136(Component var0) {
		var0.setFocusTraversalKeysEnabled(false);
		var0.addKeyListener(KeyHandler.KeyHandler_instance);
		var0.addFocusListener(KeyHandler.KeyHandler_instance);
	}

	@ObfuscatedName("b")
	static final void method3135(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1764411765"
	)
	public static void method3133(int var0) {
		class206.musicPlayerStatus = 1;
		class23.musicTrackArchive = null;
		TileItem.musicTrackGroupId = -1;
		class206.musicTrackFileId = -1;
		class206.musicTrackVolume = 0;
		class195.musicTrackBoolean = false;
		MusicPatch.pcmSampleLength = var0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-1937553317"
	)
	static int method3134(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				MilliClock.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.method183(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				MilliClock.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapSection1.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				MilliClock.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = BuddyRankComparator.method3557(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ScriptEvent.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = GrandExchangeOfferUnitPriceComparator.Client_plane;
					var4 = FloorDecoration.baseX * 64 + (PlayerType.localPlayer.x >> 7);
					var5 = WorldMapData_0.baseY * 64 + (PlayerType.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					MilliClock.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.method183(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					MilliClock.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = WorldMapSection1.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					MilliClock.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = BuddyRankComparator.method3557(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					MilliClock.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		signature = "(Lht;B)Z",
		garbageValue = "35"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
