import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iw")
public class class218 implements Comparator {
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = 1336604261
	)
	@Export("menuX")
	static int menuX;

	class218() {
	} // L: 47

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lic;Lic;I)I",
		garbageValue = "-1149900776"
	)
	int method4219(class213 var1, class213 var2) {
		return var1.method4151() - var2.method4151(); // L: 50
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 58
	}

	public int compare(Object var1, Object var2) {
		return this.method4219((class213)var1, (class213)var2); // L: 54
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnh;",
		garbageValue = "-1173494533"
	)
	static class343[] method4222() {
		return new class343[]{class343.field3854, class343.field3851}; // L: 35
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZB)I",
		garbageValue = "-21"
	)
	static int method4223(int var0, Script var1, boolean var2) {
		Widget var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1857
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1858
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = class316.Widget_unpackTargetMask(class209.getWidgetFlags(var3)); // L: 1859
			return 1; // L: 1860
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1862
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1869
				if (var3.dataText == null) { // L: 1870
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1871
				}

				return 1; // L: 1872
			} else {
				return 2; // L: 1874
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 1863
			--var4; // L: 1864
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1865
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1866
			} else {
				Interpreter.Interpreter_stringStack[++class156.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1867
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldr;ZI)V",
		garbageValue = "1939759884"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4864
			var0.isUnanimated = false; // L: 4865
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 4866 4867
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4869
			int var3 = var0.y >> 7; // L: 4870
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4871
				long var4 = ArchiveLoader.calculateTag(0, 0, 0, false, var0.index); // L: 4872
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4873
					var0.isUnanimated = false; // L: 4874
					var0.tileHeight = class208.getTileHeight(var0.x, var0.y, NetFileRequest.Client_plane); // L: 4875
					var0.playerCycle = Client.cycle; // L: 4876
					UserComparator4.scene.addNullableObject(NetFileRequest.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 4877
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4880
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4881
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4882
					}

					var0.tileHeight = class208.getTileHeight(var0.x, var0.y, NetFileRequest.Client_plane); // L: 4884
					var0.playerCycle = Client.cycle; // L: 4885
					UserComparator4.scene.drawEntity(NetFileRequest.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4886
				}
			}
		}

	} // L: 4890
}
