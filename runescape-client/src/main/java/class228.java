import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class228 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1970011251"
	)
	public static void method4246(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		signature = "(Lht;III)V",
		garbageValue = "-615693889"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var5 = var0;
				int var7 = WorldMapData_0.getWidgetClickMask(var0);
				int var6 = var7 >> 17 & 7;
				int var8 = var6;
				Widget var4;
				int var9;
				if (var6 == 0) {
					var4 = null;
				} else {
					var9 = 0;

					while (true) {
						if (var9 >= var8) {
							var4 = var5;
							break;
						}

						var5 = UserComparator4.getWidget(var5.parentId);
						if (var5 == null) {
							var4 = null;
							break;
						}

						++var9;
					}
				}

				Widget var10 = var4;
				if (var4 == null) {
					var10 = var0.parent;
				}

				if (var10 != null) {
					Client.clickedWidget = var0;
					var5 = var0;
					var7 = WorldMapData_0.getWidgetClickMask(var0);
					var6 = var7 >> 17 & 7;
					var8 = var6;
					if (var6 == 0) {
						var4 = null;
					} else {
						var9 = 0;

						while (true) {
							if (var9 >= var8) {
								var4 = var5;
								break;
							}

							var5 = UserComparator4.getWidget(var5.parentId);
							if (var5 == null) {
								var4 = null;
								break;
							}

							++var9;
						}
					}

					var10 = var4;
					if (var4 == null) {
						var10 = var0.parent;
					}

					Client.clickedWidgetParent = var10;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					GrandExchangeEvent.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var11 = FileSystem.method3638();
					if (var11 != -1) {
						AbstractByteArrayCopier.method4087(var11);
					}

					return;
				}
			}

		}
	}
}
