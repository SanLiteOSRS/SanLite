import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public class class127 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1679119383
	)
	int field1492;
	@ObfuscatedName("al")
	float field1490;
	@ObfuscatedName("ak")
	float field1491;
	@ObfuscatedName("ax")
	float field1495;
	@ObfuscatedName("ao")
	float field1489;
	@ObfuscatedName("ah")
	float field1494;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	class127 field1493;

	class127() {
		this.field1491 = Float.MAX_VALUE; // L: 8
		this.field1495 = Float.MAX_VALUE; // L: 9
		this.field1489 = Float.MAX_VALUE; // L: 10
		this.field1494 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "1810575829"
	)
	void method2943(Buffer var1, int var2) {
		this.field1492 = var1.readShort(); // L: 17
		this.field1490 = var1.method9211(); // L: 18
		this.field1491 = var1.method9211(); // L: 19
		this.field1495 = var1.method9211(); // L: 20
		this.field1489 = var1.method9211(); // L: 21
		this.field1494 = var1.method9211(); // L: 22
	} // L: 23

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IIIB)V",
		garbageValue = "-59"
	)
	static final void method2946(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method6594(class33.field184, false); // L: 12535
		if (var4 != null) { // L: 12536
			if (Client.minimapState < 3) { // L: 12537
				class404.field4490.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12538
			}

		}
	} // L: 12539
}
