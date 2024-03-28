import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("az")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -778481141
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 718040999
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("at")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1542313969
	)
	static int field2855;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1286346729
	)
	static int field2862;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2137355447
	)
	static int field2861;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -128438779
	)
	static int field2859;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1329375593
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("ar")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("cm")
	static String field2868;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIIB)V",
		garbageValue = "-76"
	)
	static final void method5101(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method6658(class243.field2620, false); // L: 12689
		if (var4 != null) { // L: 12690
			if (Client.minimapState < 3) { // L: 12691
				GroundObject.field2556.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12692
			}

		}
	} // L: 12693
}
