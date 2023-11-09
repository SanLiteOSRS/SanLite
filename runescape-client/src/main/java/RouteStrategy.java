import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = 355228337
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 679621931
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2098414301
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -445746929
	)
	public int field2378;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 437083269
	)
	public int field2380;

	protected RouteStrategy() {
	} // L: 9

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIILig;B)Z",
		garbageValue = "-69"
	)
	@Export("hasArrived")
	public abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (GrandExchangeEvent.loadInterface(var0)) { // L: 10545
			class72.field899 = null; // L: 10552
			Canvas.drawInterface(class179.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10553
			if (class72.field899 != null) { // L: 10554
				Canvas.drawInterface(class72.field899, -1412584499, var1, var2, var3, var4, SoundSystem.field311, DynamicObject.field996, var7); // L: 10555
				class72.field899 = null; // L: 10556
			}

		} else {
			if (var7 != -1) { // L: 10546
				Client.field717[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10548
					Client.field717[var8] = true;
				}
			}

		}
	} // L: 10550 10558
}
