import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64); // L: 13
	}

	StructComposition() {
	} // L: 16

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1428543877"
	)
	@Export("postDecode")
	void postDecode() {
	} // L: 29

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "154237221"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 33
			if (var2 == 0) { // L: 34
				return;
			}

			this.decodeNext(var1, var2); // L: 35
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;IB)V",
		garbageValue = "-14"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = WorldMapSection2.readStringIntParameters(var1, this.params);
		}

	} // L: 42

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1990579490"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return class295.method5902(this.params, var1, var2); // L: 45
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "890701279"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		IterableNodeHashTable var4 = this.params; // L: 50
		String var3;
		if (var4 == null) { // L: 52
			var3 = var2; // L: 53
		} else {
			ObjectNode var5 = (ObjectNode)var4.get((long)var1); // L: 56
			if (var5 == null) { // L: 57
				var3 = var2; // L: 58
			} else {
				var3 = (String)var5.obj; // L: 61
			}
		}

		return var3; // L: 63
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-44"
	)
	static void method3879(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 39
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 40
	} // L: 41

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-70"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4702
			byte var2 = 4; // L: 4703
			int var3 = var2 + 6; // L: 4704
			int var4 = var2 + 6; // L: 4705
			int var5 = class339.fontPlain12.lineWidth(var0, 250); // L: 4706
			int var6 = class339.fontPlain12.lineCount(var0, 250) * 13; // L: 4707
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0); // L: 4708
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var2 + var6, 16777215); // L: 4709
			class339.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4710
			int var7 = var3 - var2; // L: 4711
			int var8 = var4 - var2; // L: 4712
			int var9 = var2 + var2 + var5; // L: 4713
			int var10 = var2 + var6 + var2; // L: 4714

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4716
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 4717
					Client.field720[var11] = true;
				}
			}

			if (var1) { // L: 4720
				WorldMapData_1.rasterProvider.drawFull(0, 0); // L: 4721
			} else {
				AbstractWorldMapIcon.method5085(var3, var4, var5, var6); // L: 4724
			}

		}
	} // L: 4726
}
