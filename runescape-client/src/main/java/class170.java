import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gg")
public class class170 extends class182 {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "[Lum;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static Archive field1811;
	@ObfuscatedName("ai")
	String field1809;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	final class171 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgq;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class170(class171 var1, String var2, String var3) {
		super(var1, var2); // L: 394
		this.this$0 = var1; // L: 393
		this.field1809 = var3; // L: 395
	} // L: 396

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-403708913"
	)
	public int vmethod3636() {
		return 1; // L: 399
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-660184921"
	)
	public String vmethod3634() {
		return this.field1809; // L: 404
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V",
		garbageValue = "962136841"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class156.runScript(var0, 500000, 475000); // L: 104
	} // L: 105

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZB)I",
		garbageValue = "26"
	)
	static int method3486(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2810
			Interpreter.Interpreter_intStackSize -= 2; // L: 2811
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2812
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2813
			EnumComposition var10 = class150.getEnum(var3); // L: 2814
			if (var10.outputType != 's') { // L: 2815
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2816
				if (var9 == var10.keys[var6]) { // L: 2817
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2818
					var10 = null; // L: 2819
					break;
				}
			}

			if (var10 != null) { // L: 2823
				Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2824
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2826
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2852
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2853
				EnumComposition var4 = class150.getEnum(var3); // L: 2854
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 2855
				return 1; // L: 2856
			} else {
				return 2; // L: 2858
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 2827
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2828
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2829
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2830
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2831
			EnumComposition var7 = class150.getEnum(var5); // L: 2832
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2833
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2838
					if (var6 == var7.keys[var8]) { // L: 2839
						if (var9 == 115) { // L: 2840
							Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2841
						}

						var7 = null; // L: 2842
						break;
					}
				}

				if (var7 != null) { // L: 2846
					if (var9 == 115) { // L: 2847
						Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2848
					}
				}

				return 1; // L: 2850
			} else {
				if (var9 == 115) { // L: 2834
					Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2835
				}

				return 1; // L: 2836
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-852065543"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 607
		if (class478.garbageCollector == null || !class478.garbageCollector.isValid()) { // L: 608
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 610

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 611
					if (var2.isValid()) { // L: 613
						class478.garbageCollector = var2; // L: 614
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 615
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 616
					}
				}
			} catch (Throwable var11) { // L: 621
			}
		}

		if (class478.garbageCollector != null) { // L: 623
			long var9 = AttackOption.method2714(); // L: 624
			long var3 = class478.garbageCollector.getCollectionTime(); // L: 625
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) { // L: 626
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 627
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 628
				if (var7 != 0L) { // L: 629
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 631
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 632
		}

		return var0; // L: 634
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "18511"
	)
	static final void method3485() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 5160 5161 5178
			if (var0.plane == BuddyRankComparator.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 5162
				if (Client.cycle >= var0.cycleStart) { // L: 5163
					if (var0.targetIndex > 0) { // L: 5164
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 5165
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 5166
							var0.setDestination(var1.x, var1.y, class291.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 5168
						int var2 = -var0.targetIndex - 1; // L: 5170
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 5171
							var3 = class27.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 5172
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, class291.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 5173
						}
					}

					var0.advance(Client.field578); // L: 5175
					class173.scene.drawEntity(BuddyRankComparator.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 5176
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5180

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1377148097"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		MouseHandler.method661(); // L: 9088
		Client.menuActions[0] = "Cancel"; // L: 9089
		Client.menuTargets[0] = ""; // L: 9090
		Client.menuOpcodes[0] = 1006; // L: 9091
		Client.menuShiftClick[0] = false; // L: 9092
		Client.menuOptionsCount = 1; // L: 9093
	} // L: 9094
}
