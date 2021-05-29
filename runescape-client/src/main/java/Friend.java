import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("v")
	boolean field3824;
	@ObfuscatedName("n")
	boolean field3823;

	Friend() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llp;I)I",
		garbageValue = "-1023710905"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field3824 && !var1.field3824) {
			return -1;
		} else if (!this.field3824 && var1.field3824) {
			return 1;
		} else if (this.field3823 && !var1.field3823) {
			return -1;
		} else if (!this.field3823 && var1.field3823) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Llx;I)I",
		garbageValue = "539732409"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
