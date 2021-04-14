import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hh")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1925008229
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 101057139
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("u")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("p")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "862387576"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IB)Ljq;",
		garbageValue = "55"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1072788075"
	)
	static int method4173(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class16.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class82.method1923(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class16.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Language.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class16.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GameBuild.method4386(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GameObject.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class26.Client_plane;
					var4 = ItemLayer.baseX * 64 + (Varcs.localPlayer.x >> 7);
					var5 = Tile.baseY * 64 + (Varcs.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class16.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = class82.method1923(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class16.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Language.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class16.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = GameBuild.method4386(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class16.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.field875;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.field759;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "53"
	)
	static void method4172(int var0, int var1) {
		int var2 = class368.fontBold12.stringWidth("Choose Option");

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			var4 = class368.fontBold12.stringWidth(class69.method1164(var3));
			if (var4 > var2) {
				var2 = var4;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		var4 = var0 - var2 / 2;
		if (var2 + var4 > InterfaceParent.canvasWidth) {
			var4 = InterfaceParent.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var1 + var3 > GameEngine.canvasHeight) {
			var5 = GameEngine.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		class16.menuX = var4;
		FontName.menuY = var5;
		Player.menuWidth = var2;
		class11.menuHeight = Client.menuOptionsCount * 15 + 22;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "121"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		AbstractByteArrayCopier.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}
}
