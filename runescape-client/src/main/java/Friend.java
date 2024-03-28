import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("az")
	boolean field4783;
	@ObfuscatedName("ah")
	boolean field4782;

	Friend() {
	} // L: 9

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrh;I)I",
		garbageValue = "-1758673926"
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
		} else if (this.field4783 && !var1.field4783) {
			return -1;
		} else if (!this.field4783 && var1.field4783) { // L: 17
			return 1;
		} else if (this.field4782 && !var1.field4782) { // L: 18
			return -1;
		} else if (!this.field4782 && var1.field4782) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrr;B)I",
		garbageValue = "25"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsk;",
		garbageValue = "1208243676"
	)
	static class473[] method8100() {
		return new class473[]{class473.field4894, class473.field4895, class473.field4893, class473.field4896}; // L: 16
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "277588749"
	)
	static void method8099() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 322
			Login.currentLoginField = 1; // L: 323
		} else {
			Login.currentLoginField = 0; // L: 326
		}

	} // L: 328
}
