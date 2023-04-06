import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	} // L: 12459

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIILiz;B)Z",
		garbageValue = "1"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12463
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lej;",
		garbageValue = "-2100418601"
	)
	static class125 method1203(int var0) {
		class125 var1 = (class125)SpriteMask.findEnumerated(Occluder.method4564(), var0); // L: 156
		if (var1 == null) {
			var1 = class125.field1490; // L: 157
		}

		return var1; // L: 158
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "92"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (GrandExchangeEvent.loadInterface(var0)) { // L: 11548
			Widget[] var1 = class155.Widget_interfaceComponents[var0]; // L: 11549

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11550
				Widget var3 = var1[var2]; // L: 11551
				if (var3 != null) { // L: 11552
					var3.modelFrame = 0; // L: 11553
					var3.modelFrameCycle = 0; // L: 11554
				}
			}

		}
	} // L: 11556

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "957157213"
	)
	static final void method1201(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11660
		WorldMapSectionType.clientPreferences.updateSoundEffectVolume(var0); // L: 11661
	} // L: 11662

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "872602777"
	)
	static void method1202(String var0) {
		FontName.field4790 = var0; // L: 12124

		try {
			String var1 = class392.client.getParameter(Integer.toString(18)); // L: 12126
			String var2 = class392.client.getParameter(Integer.toString(13)); // L: 12127
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12128
			if (var0.length() == 0) { // L: 12129
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class140.method3114(WorldMapSection2.method4844() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 12130
			}

			class26.method381(class392.client, "document.cookie=\"" + var3 + "\""); // L: 12131
		} catch (Throwable var4) { // L: 12133
		}

	} // L: 12134
}
