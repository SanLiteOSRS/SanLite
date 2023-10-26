import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lcv;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ah")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("hz")
	static String field1471;
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;B)I",
		garbageValue = "85"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) { // L: 14
			return this.reversed ? var1.world - var2.world : var2.world - var1.world; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1193478763"
	)
	public static void method2909() {
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 55
	} // L: 56
}
