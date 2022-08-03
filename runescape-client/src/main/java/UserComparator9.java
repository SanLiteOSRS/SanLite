import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 602443767
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;I)I",
		garbageValue = "-855347517"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "698637672"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		ItemComposition.method3712(); // L: 8322
		Client.menuActions[0] = "Cancel"; // L: 8323
		Client.menuTargets[0] = ""; // L: 8324
		Client.menuOpcodes[0] = 1006; // L: 8325
		Client.menuShiftClick[0] = false; // L: 8326
		Client.menuOptionsCount = 1; // L: 8327
	} // L: 8328
}
