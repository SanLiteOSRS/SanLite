import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("ww")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static ClanSettings field4432;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Loo;Loo;B)I",
		garbageValue = "-79"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1); // L: 43
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 51
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 47
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1191583068"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!VertexNormal.client.method1791() && !VertexNormal.client.isOtlTokenRequesterInitialized() && !VertexNormal.client.method1257()) { // L: 1203
			Login.Login_response1 = ""; // L: 1207
			Login.Login_response2 = "Enter your username/email & password."; // L: 1208
			Login.Login_response3 = ""; // L: 1209
			Actor.method2489(2); // L: 1210
			if (var0) { // L: 1211
				Login.Login_password = "";
			}

			LoginPacket.method5996(); // L: 1212
			if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1214
				Login.currentLoginField = 1; // L: 1215
			} else {
				Login.currentLoginField = 0; // L: 1218
			}

		} else {
			Actor.method2489(10); // L: 1204
		}
	} // L: 1205 1221

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1307281199"
	)
	static boolean method7241() {
		return class93.clientPreferences.method2605() >= Client.field503; // L: 12749
	}
}
