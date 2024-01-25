import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("am")
	boolean field4718;
	@ObfuscatedName("ap")
	boolean field4717;

	Friend() {
	} // L: 9

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrm;I)I",
		garbageValue = "-900411691"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field4718 && !var1.field4718) { // L: 16
			return -1;
		} else if (!this.field4718 && var1.field4718) {
			return 1; // L: 17
		} else if (this.field4717 && !var1.field4717) { // L: 18
			return -1;
		} else if (!this.field4717 && var1.field4717) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrq;B)I",
		garbageValue = "111"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1983288800"
	)
	public static void method8228() {
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 47
	} // L: 48
}
