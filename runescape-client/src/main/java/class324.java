import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public class class324 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -349914131
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	UrlRequest field3526;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	SpritePixels field3527;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;)V"
	)
	class324(String var1, UrlRequester var2) {
		try {
			this.field3526 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3526 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Lev;)V"
	)
	class324(UrlRequest var1) {
		this.field3526 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Ltt;",
		garbageValue = "5"
	)
	SpritePixels method6098() {
		if (this.field3527 == null && this.field3526 != null && this.field3526.isDone()) { // L: 28
			if (this.field3526.getResponse() != null) { // L: 29
				this.field3527 = SecureRandomFuture.method2112(this.field3526.getResponse()); // L: 30
			}

			this.field3526 = null; // L: 32
		}

		return this.field3527; // L: 34
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z",
		garbageValue = "852552278"
	)
	static final boolean method6099(int var0, int var1, int var2, int var3, int var4) {
		PendingSpawn var5 = null; // L: 8269

		for (PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8270 8271 8276
			if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) { // L: 8272
				var5 = var6; // L: 8273
				break;
			}
		}

		if (var5 != null) { // L: 8278
			var5.field1122 = var4; // L: 8279
			return true; // L: 8280
		} else {
			return false; // L: 8282
		}
	}
}
