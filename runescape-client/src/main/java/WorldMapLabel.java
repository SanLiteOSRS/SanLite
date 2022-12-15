import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static IndexedSprite field2975;
	@ObfuscatedName("h")
	@Export("text")
	String text;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1395351999
	)
	@Export("width")
	int width;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1987376379
	)
	@Export("height")
	int height;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILiq;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(CLmb;B)I",
		garbageValue = "50"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4; // L: 104
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) { // L: 105
			var0 = Character.toLowerCase(var0); // L: 106
			var2 = (var0 << 4) + 1; // L: 107
		}

		if (var0 == 241 && var1 == Language.Language_ES) { // L: 109
			var2 = 1762;
		}

		return var2; // L: 110
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "([Lkd;II)V",
		garbageValue = "1544392799"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11865
			Widget var3 = var0[var2]; // L: 11866
			if (var3 != null) { // L: 11867
				if (var3.type == 0) { // L: 11868
					if (var3.children != null) { // L: 11869
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11870
					if (var4 != null) { // L: 11871
						GrandExchangeOfferAgeComparator.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11873
					var5 = new ScriptEvent(); // L: 11874
					var5.widget = var3; // L: 11875
					var5.args = var3.onDialogAbort; // L: 11876
					WorldMapElement.runScriptEvent(var5); // L: 11877
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11879
					if (var3.childIndex >= 0) { // L: 11880
						Widget var6 = class175.getWidget(var3.id); // L: 11881
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11882
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11886
					var5.widget = var3; // L: 11887
					var5.args = var3.onSubChange; // L: 11888
					WorldMapElement.runScriptEvent(var5); // L: 11889
				}
			}
		}

	} // L: 11892
}
