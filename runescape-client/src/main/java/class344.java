import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public class class344 {
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = 918016623
	)
	static int field3667;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	UrlRequest field3669;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	SpritePixels field3670;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;)V"
	)
	class344(String var1, UrlRequester var2) {
		try {
			this.field3669 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3669 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Lel;)V"
	)
	class344(UrlRequest var1) {
		this.field3669 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lvg;",
		garbageValue = "-20"
	)
	SpritePixels method6316() {
		if (this.field3670 == null && this.field3669 != null && this.field3669.isDone()) { // L: 28
			if (this.field3669.getResponse() != null) { // L: 29
				this.field3670 = GrandExchangeOfferUnitPriceComparator.method7149(this.field3669.getResponse()); // L: 30
			}

			this.field3669 = null; // L: 32
		}

		return this.field3670; // L: 34
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "126"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 9241
		Client.isMenuOpen = false; // L: 9242
		Client.menuActions[0] = "Cancel"; // L: 9244
		Client.menuTargets[0] = ""; // L: 9245
		Client.menuOpcodes[0] = 1006; // L: 9246
		Client.menuShiftClick[0] = false; // L: 9247
		Client.menuOptionsCount = 1; // L: 9248
	} // L: 9249

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-52"
	)
	static void method6318(int var0, int var1) {
		MenuAction var2 = Message.tempMenuAction; // L: 12238
		if (var2 != null) { // L: 12240
			CollisionMap.method4359(var2.param0, var2.param1, var2.opcode, var2.identifier, var2.field916, var2.field913, var2.field918, var0, var1); // L: 12241
		}

		Message.tempMenuAction = null; // L: 12244
	} // L: 12245
}
