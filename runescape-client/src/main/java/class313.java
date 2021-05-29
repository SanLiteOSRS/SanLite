import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
public class class313 {
	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "([Lio;Lio;ZI)V",
		garbageValue = "1078266988"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
		class27.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			class27.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			PlayerType.method4857(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIIIIII)V",
		garbageValue = "584848260"
	)
	static final void method5617(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field708) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field708 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !Client.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				WorldMapCacheName.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				WorldMapCacheName.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				WorldMapCacheName.invalidateWidget(var0);
				Client.field708 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				WorldMapCacheName.invalidateWidget(var0);
			}
		}

	}
}
