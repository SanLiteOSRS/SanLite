import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("s")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1633382556"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4324
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "([Lkn;IIIZI)V",
		garbageValue = "-1860767797"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10371
			Widget var6 = var0[var5]; // L: 10372
			if (var6 != null && var6.parentId == var1) { // L: 10373 10374
				Message.alignWidgetSize(var6, var2, var3, var4); // L: 10375
				UserComparator7.alignWidgetPosition(var6, var2, var3); // L: 10376
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10377
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10378
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 10379
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 10380
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10381
					class181.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10383
}
