import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lim;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lim;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lim;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lim;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("b")
	@Export("name")
	public final String name;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 597489609
	)
	final int field2875;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.field2875 = var2;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "-107"
	)
	static int method4386(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}
}
