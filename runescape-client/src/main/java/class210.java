import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class210 extends Node {
	@ObfuscatedName("ao")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 383898851
	)
	public int field2335;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2043098711
	)
	public int field2330;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1470694441
	)
	public int field2331;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	public Widget field2332;

	@ObfuscatedSignature(
		descriptor = "(IIILmb;)V"
	)
	public class210(int var1, int var2, int var3, Widget var4) {
		this.field2331 = var1; // L: 15
		this.field2335 = var2; // L: 16
		this.field2330 = var3; // L: 17
		this.field2332 = var4; // L: 18
	} // L: 19

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "1705126651"
	)
	static char method4124(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "([Lmb;IB)V",
		garbageValue = "-26"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11890
			Widget var3 = var0[var2]; // L: 11891
			if (var3 != null) { // L: 11892
				if (var3.type == 0) { // L: 11893
					if (var3.children != null) { // L: 11894
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11895
					if (var4 != null) { // L: 11896
						class453.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11898
					var5 = new ScriptEvent(); // L: 11899
					var5.widget = var3; // L: 11900
					var5.args = var3.onDialogAbort; // L: 11901
					Clock.runScriptEvent(var5); // L: 11902
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11904
					if (var3.childIndex >= 0) { // L: 11905
						Widget var6 = FriendSystem.getWidget(var3.id); // L: 11906
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11907
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11911
					var5.widget = var3; // L: 11912
					var5.args = var3.onSubChange; // L: 11913
					Clock.runScriptEvent(var5); // L: 11914
				}
			}
		}

	} // L: 11917
}
