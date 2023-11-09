import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("Ignored")
public class Ignored extends Nameable {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 410982667
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)I",
		garbageValue = "2045269019"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "1550816169"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1092263394"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 8192
		Client.isMenuOpen = false; // L: 8193
		Client.menuActions[0] = "Cancel"; // L: 8195
		Client.menuTargets[0] = ""; // L: 8196
		Client.menuOpcodes[0] = 1006; // L: 8197
		Client.menuShiftClick[0] = false; // L: 8198
		Client.menuOptionsCount = 1; // L: 8199
	} // L: 8200
}
