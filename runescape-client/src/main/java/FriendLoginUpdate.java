import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1361765007
	)
	public int field4627;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ac")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lur;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4627 = (int)(AttackOption.method2714() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "1961506148"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12735
		short[] var2 = new short[16]; // L: 12736
		int var3 = 0; // L: 12737

		for (int var4 = 0; var4 < class141.ItemComposition_fileCount; ++var4) { // L: 12738
			ItemComposition var9 = class141.ItemComposition_get(var4); // L: 12739
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12740 12741 12742
				if (var3 >= 250) { // L: 12743
					class260.foundItemIdCount = -1; // L: 12744
					class291.foundItemIds = null; // L: 12745
					return; // L: 12746
				}

				if (var3 >= var2.length) { // L: 12748
					short[] var6 = new short[var2.length * 2]; // L: 12749

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12750
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12751
				}

				var2[var3++] = (short)var4; // L: 12753
			}
		}

		class291.foundItemIds = var2; // L: 12755
		Client.foundItemIndex = 0; // L: 12756
		class260.foundItemIdCount = var3; // L: 12757
		String[] var8 = new String[class260.foundItemIdCount]; // L: 12758

		for (int var5 = 0; var5 < class260.foundItemIdCount; ++var5) { // L: 12759
			var8[var5] = class141.ItemComposition_get(var2[var5]).name;
		}

		AbstractWorldMapData.method5541(var8, class291.foundItemIds); // L: 12760
	} // L: 12761
}
