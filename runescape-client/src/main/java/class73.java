import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public class class73 {
	@ObfuscatedName("wo")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("ar")
	static final BigInteger field912;
	@ObfuscatedName("as")
	static final BigInteger field916;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1558904169
	)
	static int field921;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		longValue = -311790209696913705L
	)
	static long field922;
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	static class473 field920;
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	static Decimator field919;

	static {
		field912 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field916 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1659794248"
	)
	static void method2117(int var0, int var1, int var2) {
		NodeDeque var3 = Client.groundItems[var0][var1][var2]; // L: 8759
		if (var3 == null) { // L: 8760
			Actor.scene.method5441(var0, var1, var2); // L: 8761
		} else {
			long var4 = -99999999L; // L: 8764
			TileItem var6 = null; // L: 8765

			TileItem var7;
			for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) { // L: 8766 8767 8777
				ItemComposition var8 = ArchiveDiskActionHandler.ItemComposition_get(var7.id); // L: 8768
				long var12 = (long)var8.price; // L: 8769
				if (var8.isStackable == 1) { // L: 8770
					var12 *= var7.quantity < Integer.MAX_VALUE ? (long)(var7.quantity + 1) : (long)var7.quantity; // L: 8771
				}

				if (var12 > var4) { // L: 8773
					var4 = var12; // L: 8774
					var6 = var7; // L: 8775
				}
			}

			if (var6 == null) { // L: 8779
				Actor.scene.method5441(var0, var1, var2); // L: 8780
			} else {
				var3.addLast(var6); // L: 8783
				TileItem var14 = null; // L: 8784
				TileItem var9 = null; // L: 8785

				for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) { // L: 8786 8787 8792
					if (var6.id != var7.id) { // L: 8788
						if (var14 == null) { // L: 8789
							var14 = var7;
						}

						if (var14.id != var7.id && var9 == null) { // L: 8790
							var9 = var7;
						}
					}
				}

				long var10 = class18.calculateTag(var1, var2, 3, false, 0); // L: 8794
				Actor.scene.newGroundItemPile(var0, var1, var2, class272.getTileHeight(var1 * 128 + 64, var2 * 128 + 64, var0), var6, var10, var14, var9); // L: 8795
			}
		}
	} // L: 8762 8781 8796
}
