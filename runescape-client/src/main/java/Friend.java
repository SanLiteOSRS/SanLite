import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("au")
	boolean field4644;
	@ObfuscatedName("ae")
	boolean field4645;

	Friend() {
	} // L: 9

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqo;I)I",
		garbageValue = "-1434956269"
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
		} else if (this.field4644 && !var1.field4644) { // L: 16
			return -1;
		} else if (!this.field4644 && var1.field4644) { // L: 17
			return 1;
		} else if (this.field4645 && !var1.field4645) { // L: 18
			return -1;
		} else if (!this.field4645 && var1.field4645) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)I",
		garbageValue = "1756748027"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}
}
