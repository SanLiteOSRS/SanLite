import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("bc")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "[Lnn;"
	)
	static Widget[] field1453;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;I)I",
		garbageValue = "-1398324092"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2060260259"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class160.method3434(); // L: 9265
		Client.menuActions[0] = "Cancel"; // L: 9266
		Client.menuTargets[0] = ""; // L: 9267
		Client.menuOpcodes[0] = 1006; // L: 9268
		Client.menuShiftClick[0] = false; // L: 9269
		Client.menuOptionsCount = 1; // L: 9270
	} // L: 9271
}
