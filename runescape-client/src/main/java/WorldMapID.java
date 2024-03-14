import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	static final WorldMapID field2659;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	static final WorldMapID field2658;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lcj;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1317539837
	)
	@Export("value")
	final int value;

	static {
		field2659 = new WorldMapID(0); // L: 4
		field2658 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IB)I",
		garbageValue = "101"
	)
	public static int method5045(CharSequence var0, int var1) {
		return Script.method2242(var0, var1, true); // L: 77
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1075667756"
	)
	static int method5043(int var0, Script var1, boolean var2) {
		return 2; // L: 5145
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-61769157"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12834
		short[] var2 = new short[16]; // L: 12835
		int var3 = 0; // L: 12836

		for (int var4 = 0; var4 < ItemComposition.ItemComposition_fileCount; ++var4) { // L: 12837
			ItemComposition var9 = ArchiveDiskActionHandler.ItemComposition_get(var4); // L: 12838
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12839 12840 12841
				if (var3 >= 250) { // L: 12842
					class207.foundItemIdCount = -1; // L: 12843
					class73.foundItemIds = null; // L: 12844
					return; // L: 12845
				}

				if (var3 >= var2.length) { // L: 12847
					short[] var6 = new short[var2.length * 2]; // L: 12848

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12849
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12850
				}

				var2[var3++] = (short)var4; // L: 12852
			}
		}

		class73.foundItemIds = var2; // L: 12854
		GameObject.foundItemIndex = 0; // L: 12855
		class207.foundItemIdCount = var3; // L: 12856
		String[] var8 = new String[class207.foundItemIdCount]; // L: 12857

		for (int var5 = 0; var5 < class207.foundItemIdCount; ++var5) { // L: 12858
			var8[var5] = ArchiveDiskActionHandler.ItemComposition_get(var2[var5]).name;
		}

		short[] var10 = class73.foundItemIds; // L: 12859
		Script.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 12861
	} // L: 12863
}
