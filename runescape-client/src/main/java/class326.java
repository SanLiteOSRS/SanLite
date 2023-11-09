import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class326 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	UrlRequest field3544;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	SpritePixels field3543;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;)V"
	)
	class326(String var1, UrlRequester var2) {
		try {
			this.field3544 = var2.request(new URL(var1)); // L: 16
		} catch (MalformedURLException var4) { // L: 18
			this.field3544 = null; // L: 19
		}

	} // L: 21

	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	class326(UrlRequest var1) {
		this.field3544 = var1; // L: 24
	} // L: 25

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Luq;",
		garbageValue = "-115"
	)
	SpritePixels method6125() {
		if (this.field3543 == null && this.field3544 != null && this.field3544.isDone()) { // L: 28
			if (this.field3544.getResponse() != null) { // L: 29
				this.field3543 = class496.method8837(this.field3544.getResponse()); // L: 30
			}

			this.field3544 = null; // L: 32
		}

		return this.field3543; // L: 34
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1768378152"
	)
	static void method6120() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12064
			int var1 = var0.group; // L: 12065
			if (GrandExchangeEvent.loadInterface(var1)) { // L: 12066
				boolean var2 = true; // L: 12067
				Widget[] var3 = class179.Widget_interfaceComponents[var1]; // L: 12068

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12069
					if (var3[var4] != null) { // L: 12070
						var2 = var3[var4].isIf3; // L: 12071
						break;
					}
				}

				if (!var2) { // L: 12075
					var4 = (int)var0.key; // L: 12076
					Widget var5 = Interpreter.getWidget(var4); // L: 12077
					if (var5 != null) { // L: 12078
						class303.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12082
}
