import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("af")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;I)I",
		garbageValue = "-1114697504"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)Lcg;",
		garbageValue = "570345303"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 39
		return var2.getMessage(var1); // L: 40
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IS)Lfp;",
		garbageValue = "-26313"
	)
	static class137 method2865(int var0) {
		class137 var1 = (class137)GameObject.findEnumerated(LoginScreenAnimation.method2429(), var0); // L: 126
		if (var1 == null) {
			var1 = class137.field1600; // L: 127
		}

		return var1; // L: 128
	}
}
