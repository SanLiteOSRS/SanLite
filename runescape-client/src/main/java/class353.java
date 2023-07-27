import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public enum class353 implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field4211(-1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field4213(0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field4209(1),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field4210(2);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 747367231
	)
	final int field4212;

	class353(int var3) {
		this.field4212 = var3; // L: 19
	} // L: 20

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4212; // L: 24
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(Lmt;III)V",
		garbageValue = "-587359339"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) { // L: 12007
			if (var0 != null && class503.method8951(var0) != null) { // L: 12008
				Client.clickedWidget = var0; // L: 12009
				Client.clickedWidgetParent = class503.method8951(var0); // L: 12010
				Client.widgetClickX = var1; // L: 12011
				Client.widgetClickY = var2; // L: 12012
				class130.widgetDragDuration = 0; // L: 12013
				Client.isDraggingWidget = false; // L: 12014
				int var3 = class59.method1178(); // L: 12015
				if (var3 != -1) { // L: 12016
					Language.method7004(var3);
				}

			}
		}
	} // L: 12017
}
