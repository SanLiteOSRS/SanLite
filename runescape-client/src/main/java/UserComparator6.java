import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = -421019103
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;I)I",
		garbageValue = "1341322906"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lbz;I)V",
		garbageValue = "-1996213238"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 2327
			Client.isMembersWorld = var0.isMembersOnly(); // L: 2328
			class344.method6675(var0.isMembersOnly()); // L: 2329
		}

		if (var0.properties != Client.worldProperties) { // L: 2331
			Archive var1 = ClientPreferences.archive8; // L: 2332
			int var2 = var0.properties; // L: 2333
			if ((var2 & 536870912) != 0) { // L: 2335
				Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 2336
			} else if ((var2 & 1073741824) != 0) { // L: 2338
				Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 2339
			} else if ((var2 & 256) != 0) { // L: 2341
				Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", ""); // L: 2342
			} else {
				Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 2345
			}
		}

		class139.worldHost = var0.host; // L: 2349
		Client.worldId = var0.id; // L: 2350
		Client.worldProperties = var0.properties; // L: 2351
		ClanChannel.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2352
		class137.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2353
		class31.currentPort = ClanChannel.worldPort; // L: 2354
	} // L: 2355
}
