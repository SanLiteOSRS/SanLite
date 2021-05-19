import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("gd")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1388423843"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lcy;",
		garbageValue = "-1813556269"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1134289303"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method5149();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Lmo;I)Lmo;",
		garbageValue = "-159166525"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = MouseRecorder.method2126(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IB)V",
		garbageValue = "-15"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		Friend.method5550(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 128) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			ScriptEvent.method2116(var0, var4, var5, var6);
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "-938940288"
	)
	static int method2250(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = KeyHandler.method453(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				WorldMapCacheName.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class0.method6(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = KitDefinition.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = ParamComposition.Client_plane;
					var4 = JagexCache.baseX * 64 + (class35.localPlayer.x >> 7);
					var5 = Messages.baseY * 64 + (class35.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					WorldMapCacheName.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = KeyHandler.method453(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					WorldMapCacheName.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					WorldMapCacheName.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class0.method6(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					WorldMapCacheName.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.field627;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.field837;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1471202584"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (UserComparator8.loadInterface(var0)) {
				Widget[] var1 = Widget.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class243.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
