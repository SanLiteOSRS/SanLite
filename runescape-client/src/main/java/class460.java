import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("re")
public class class460 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	public static final class460 field4772;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	static final class460 field4773;
	@ObfuscatedName("ao")
	String field4774;

	static {
		field4772 = new class460("application/json"); // L: 4
		field4773 = new class460("text/plain"); // L: 5
	}

	class460(String var1) {
		this.field4774 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1631262328"
	)
	public String method8321() {
		return this.field4774; // L: 13
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Z",
		garbageValue = "1329235005"
	)
	static final boolean method8320(int var0, int var1, int var2, int var3, int var4) {
		PendingSpawn var5 = null; // L: 8402

		for (PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8403 8404 8409
			if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) { // L: 8405
				var5 = var6; // L: 8406
				break;
			}
		}

		if (var5 != null) { // L: 8411
			var5.field1190 = var4; // L: 8412
			return true; // L: 8413
		} else {
			return false; // L: 8415
		}
	}
}
