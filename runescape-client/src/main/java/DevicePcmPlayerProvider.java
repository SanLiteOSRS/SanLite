import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lbk;",
		garbageValue = "415453075"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1853930476"
	)
	static final boolean method311(int var0, int var1) {
		ObjectComposition var2 = class90.getObjectDefinition(var0); // L: 1013
		if (var1 == 11) { // L: 1014
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 1015
		}

		return var2.method3950(var1); // L: 1016
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Lmt;IIII)V",
		garbageValue = "-1524791147"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12586
		if (var4 != null) { // L: 12587
			if (Client.minimapState < 3) { // L: 12588
				class10.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12589
			}

		}
	} // L: 12590
}
