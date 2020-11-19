import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("f")
	boolean field3659;
	@ObfuscatedName("b")
	boolean field3660;

	Friend() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lki;I)I",
		garbageValue = "638196038"
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
		} else if (this.field3659 && !var1.field3659) {
			return -1;
		} else if (!this.field3659 && var1.field3659) {
			return 1;
		} else if (this.field3660 && !var1.field3660) {
			return -1;
		} else if (!this.field3660 && var1.field3660) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(Ljh;B)I",
		garbageValue = "69"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
