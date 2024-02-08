import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class220 {
	@ObfuscatedName("aj")
	public String field2363;
	@ObfuscatedName("aq")
	public float[] field2364;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1469156959
	)
	public int field2369;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1380325511
	)
	public int field2366;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 146630491
	)
	public int field2368;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	final class219 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lih;)V"
	)
	class220(class219 var1) {
		this.this$0 = var1;
		this.field2364 = new float[4]; // L: 306
		this.field2369 = 1; // L: 307
		this.field2366 = 1; // L: 308
		this.field2368 = 0; // L: 309
	} // L: 311

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[Liv;",
		garbageValue = "91"
	)
	static class228[] method4347() {
		return new class228[]{class228.field2431, class228.field2437, class228.field2428, class228.field2426, class228.field2430, class228.field2432, class228.field2434}; // L: 25
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(Lnn;III)V",
		garbageValue = "1169045919"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 11854
			if (var0 != null) { // L: 11856
				Widget var4 = class482.method8733(var0); // L: 11859
				if (var4 == null) { // L: 11860
					var4 = var0.parent;
				}

				if (var4 != null) { // L: 11863
					Client.clickedWidget = var0; // L: 11867
					var4 = class482.method8733(var0); // L: 11870
					if (var4 == null) { // L: 11871
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4; // L: 11874
					Client.widgetClickX = var1; // L: 11875
					Client.widgetClickY = var2; // L: 11876
					class10.widgetDragDuration = 0; // L: 11877
					Client.isDraggingWidget = false; // L: 11878
					int var6 = Client.menuOptionsCount - 1; // L: 11881
					if (var6 != -1) { // L: 11884
						SoundSystem.method876(var6);
					}

					return; // L: 11885
				}
			}

		}
	} // L: 11865

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(I)Lor;",
		garbageValue = "1678673995"
	)
	static class375 method4348() {
		return UrlRequester.field1418; // L: 12797
	}
}
