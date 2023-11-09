import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -391673491
	)
	static int field164;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("o")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ldp;FI)F",
		garbageValue = "-1881283693"
	)
	static float method354(class117 var0, float var1) {
		if (var0 == null) { // L: 152
			return 0.0F; // L: 153
		} else {
			float var2 = var1 - var0.field1439; // L: 155
			return var2 * (var0.field1441[2] + (var2 * var0.field1441[0] + var0.field1441[1]) * var2) + var0.field1441[3]; // L: 156
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "109"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lcd;ZI)V",
		garbageValue = "-1835891561"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11999
		int var3 = (int)var0.key; // L: 12000
		var0.remove(); // L: 12001
		if (var1) { // L: 12002
			DecorativeObject.method4514(var2);
		}

		DirectByteArrayCopier.method5522(var2); // L: 12003
		Widget var4 = FloorUnderlayDefinition.getWidget(var3); // L: 12004
		if (var4 != null) { // L: 12005
			class220.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) { // L: 12006
			class220.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 12007

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIIILqj;Lkr;B)V",
		garbageValue = "34"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12148
			int var6 = Client.camAngleY & 2047; // L: 12149
			int var7 = var3 * var3 + var2 * var2; // L: 12150
			if (var7 <= 6400) { // L: 12151
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12152
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12153
				int var10 = var3 * var8 + var9 * var2 >> 16; // L: 12154
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12155
				if (var7 > 2500) {
					var4.method8196(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12156
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12157
				}

			}
		}
	} // L: 12158
}
