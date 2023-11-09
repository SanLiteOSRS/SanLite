import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public class class311 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	UrlRequest field3497;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	SpritePixels field3499;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Let;)V"
	)
	class311(String var1, UrlRequester var2) {
		try {
			this.field3497 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3497 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Lez;)V"
	)
	class311(UrlRequest var1) {
		this.field3497 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ltq;",
		garbageValue = "26"
	)
	SpritePixels method6032() {
		if (this.field3499 == null && this.field3497 != null && this.field3497.isDone()) { // L: 28
			if (this.field3497.getResponse() != null) { // L: 29
				this.field3499 = Strings.method6601(this.field3497.getResponse()); // L: 30
			}

			this.field3497 = null; // L: 32
		}

		return this.field3499; // L: 34
	}
}
