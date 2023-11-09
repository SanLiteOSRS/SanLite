import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cs")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("h")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("e")
	@Export("lock")
	Object lock;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1063919825
	)
	@Export("index")
	int index;
	@ObfuscatedName("x")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("m")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("q")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; class12.method157(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "110"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-732526221"
	)
	static int method2264(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1789
			var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1790
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.itemId; // L: 1791
			return 1; // L: 1792
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1794
			var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1795
			if (var3.itemId != -1) { // L: 1796
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 1797
			}

			return 1; // L: 1798
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1800
			int var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 1801
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1802
			if (var4 != null) { // L: 1803
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0; // L: 1804
			}

			return 1; // L: 1805
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1807
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1808
			return 1; // L: 1809
		} else if (var0 == 2707) { // L: 1811
			var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1812
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.method6172() ? 1 : 0; // L: 1813
			return 1; // L: 1814
		} else if (var0 == 2708) { // L: 1816
			var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1817
			return class300.method5846(var3); // L: 1818
		} else if (var0 == 2709) { // L: 1820
			var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1821
			return LoginScreenAnimation.method2380(var3); // L: 1822
		} else {
			return 2; // L: 1824
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-91"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class136.method3073(); // L: 12201
		HealthBar.method2526(); // L: 12202
		int var1 = class109.VarpDefinition_get(var0).type; // L: 12203
		if (var1 != 0) { // L: 12204
			int var2 = Varps.Varps_main[var0]; // L: 12205
			if (var1 == 1) { // L: 12206
				if (var2 == 1) { // L: 12207
					FileSystem.method3480(0.9D);
				}

				if (var2 == 2) { // L: 12208
					FileSystem.method3480(0.8D);
				}

				if (var2 == 3) { // L: 12209
					FileSystem.method3480(0.7D);
				}

				if (var2 == 4) { // L: 12210
					FileSystem.method3480(0.6D);
				}
			}

			if (var1 == 3) { // L: 12212
				if (var2 == 0) { // L: 12213
					class299.method5834(255);
				}

				if (var2 == 1) { // L: 12214
					class299.method5834(192);
				}

				if (var2 == 2) { // L: 12215
					class299.method5834(128);
				}

				if (var2 == 3) { // L: 12216
					class299.method5834(64);
				}

				if (var2 == 4) { // L: 12217
					class299.method5834(0);
				}
			}

			if (var1 == 4) { // L: 12219
				if (var2 == 0) { // L: 12220
					class7.method43(127);
				}

				if (var2 == 1) { // L: 12221
					class7.method43(96);
				}

				if (var2 == 2) { // L: 12222
					class7.method43(64);
				}

				if (var2 == 3) { // L: 12223
					class7.method43(32);
				}

				if (var2 == 4) { // L: 12224
					class7.method43(0);
				}
			}

			if (var1 == 5) { // L: 12226
				Client.field598 = var2 == 1;
			}

			if (var1 == 6) { // L: 12227
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 12228
				Client.field685 = var2;
			}

			if (var1 == 10) { // L: 12229
				if (var2 == 0) { // L: 12230
					class18.method270(127);
				}

				if (var2 == 1) { // L: 12231
					class18.method270(96);
				}

				if (var2 == 2) { // L: 12232
					class18.method270(64);
				}

				if (var2 == 3) { // L: 12233
					class18.method270(32);
				}

				if (var2 == 4) { // L: 12234
					class18.method270(0);
				}
			}

			if (var1 == 17) { // L: 12236
				Client.followerIndex = var2 & 65535; // L: 12237
			}

			AttackOption[] var3;
			if (var1 == 18) { // L: 12239
				var3 = new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.field1347, AttackOption.field1346}; // L: 12242
				Client.playerAttackOption = (AttackOption)World.findEnumerated(var3, var2); // L: 12244
				if (Client.playerAttackOption == null) { // L: 12245
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 12247
				if (var2 == -1) { // L: 12248
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12249
				}
			}

			if (var1 == 22) { // L: 12251
				var3 = new AttackOption[]{AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.field1347, AttackOption.field1346}; // L: 12254
				Client.npcAttackOption = (AttackOption)World.findEnumerated(var3, var2); // L: 12256
				if (Client.npcAttackOption == null) { // L: 12257
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12259
}
