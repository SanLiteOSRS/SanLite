import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	static ArchiveDisk field1480;
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;B)I",
		garbageValue = "0"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1153152060"
	)
	public static void method2924() {
		class199.field2007.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	public static void method2925() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 41
	} // L: 42

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-205905443"
	)
	static final void method2922() {
		Client.field710 = Client.cycleCntr; // L: 12605
		class183.FriendsChatManager_inFriendsChat = true; // L: 12606
	} // L: 12607
}
