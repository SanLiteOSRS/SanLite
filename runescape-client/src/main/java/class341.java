import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class341 {
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 1349348737
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	UrlRequest field3600;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	SpritePixels field3599;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Len;)V"
	)
	class341(String var1, UrlRequester var2) {
		try {
			this.field3600 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3600 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Leq;)V"
	)
	class341(UrlRequest var1) {
		this.field3600 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "1517070019"
	)
	SpritePixels method6264() {
		if (this.field3599 == null && this.field3600 != null && this.field3600.isDone()) { // L: 28
			if (this.field3600.getResponse() != null) { // L: 29
				this.field3599 = Frames.method4854(this.field3600.getResponse()); // L: 30
			}

			this.field3600 = null; // L: 32
		}

		return this.field3599; // L: 34
	}
}
