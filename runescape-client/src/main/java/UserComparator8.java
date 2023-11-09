import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("sc")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("a")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;I)I",
		garbageValue = "-1969798784"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "2"
	)
	public static final synchronized long method2748() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class279.field3267) { // L: 15
			class279.field3268 += class279.field3267 - var0; // L: 16
		}

		class279.field3267 = var0; // L: 18
		return class279.field3268 + var0; // L: 19
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "133413802"
	)
	static final void method2749(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 8694
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 8695
				Client.field718[var4] = true;
			}
		}

	} // L: 8697

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-2077871201"
	)
	static final void method2744(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 9896
			if (Client.menuOptionsCount < 500) { // L: 9897
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9898
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9899
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9900
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9901
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9902
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9903
				Client.field647[Client.menuOptionsCount] = var6; // L: 9904
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 9905
				++Client.menuOptionsCount; // L: 9906
			}

		}
	} // L: 9908
}
