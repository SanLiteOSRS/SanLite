import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("z")
	boolean field3651;
	@ObfuscatedName("k")
	boolean field3652;

	Friend() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lkc;I)I",
		garbageValue = "1550059745"
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
		} else if (this.field3651 && !var1.field3651) {
			return -1;
		} else if (!this.field3651 && var1.field3651) {
			return 1;
		} else if (this.field3652 && !var1.field3652) {
			return -1;
		} else if (!this.field3652 && var1.field3652) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(Ljc;I)I",
		garbageValue = "-243007320"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
