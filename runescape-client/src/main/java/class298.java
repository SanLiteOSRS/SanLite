import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
public class class298 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1940747343
	)
	public int field3454;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1875649367
	)
	public int field3456;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -10528687
	)
	public int field3455;

	class298() {
	} // L: 8

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-578583912"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12646
		short[] var2 = new short[16]; // L: 12647
		int var3 = 0; // L: 12648

		for (int var4 = 0; var4 < ItemComposition.ItemComposition_fileCount; ++var4) { // L: 12649
			ItemComposition var9 = NPCComposition.ItemComposition_get(var4); // L: 12650
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12651 12652 12653
				if (var3 >= 250) { // L: 12654
					ScriptEvent.foundItemIdCount = -1; // L: 12655
					class19.foundItemIds = null; // L: 12656
					return; // L: 12657
				}

				if (var3 >= var2.length) { // L: 12659
					short[] var6 = new short[var2.length * 2]; // L: 12660

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12661
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12662
				}

				var2[var3++] = (short)var4; // L: 12664
			}
		}

		class19.foundItemIds = var2; // L: 12666
		UserComparator6.foundItemIndex = 0; // L: 12667
		ScriptEvent.foundItemIdCount = var3; // L: 12668
		String[] var8 = new String[ScriptEvent.foundItemIdCount]; // L: 12669

		for (int var5 = 0; var5 < ScriptEvent.foundItemIdCount; ++var5) { // L: 12670
			var8[var5] = NPCComposition.ItemComposition_get(var2[var5]).name;
		}

		short[] var10 = class19.foundItemIds; // L: 12671
		class82.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12673
	} // L: 12675
}
