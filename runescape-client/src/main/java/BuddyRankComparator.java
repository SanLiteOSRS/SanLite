import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;B)I",
		garbageValue = "13"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lmb;I)Ljava/lang/String;",
		garbageValue = "-745287011"
	)
	static String method2892(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 11004
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 11005
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 11007
					if (var3 == -1) { // L: 11008
						break;
					}

					String var4 = var0.substring(0, var3); // L: 11009
					int var6 = ClanChannelMember.method3137(var1, var2 - 1); // L: 11011
					String var5;
					if (var6 < 999999999) { // L: 11013
						var5 = Integer.toString(var6); // L: 11014
					} else {
						var5 = "*"; // L: 11017
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 11019
				}
			}
		}

		return var0; // L: 11023
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lmb;B)Ljava/lang/String;",
		garbageValue = "-40"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (LoginScreenAnimation.Widget_unpackTargetMask(StudioGame.getWidgetFlags(var0)) == 0) { // L: 12643
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12644 12645 12647
		}
	}
}
