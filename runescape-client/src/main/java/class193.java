import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class193 {
	@ObfuscatedName("w")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("v")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1089933965
	)
	public static int field2212;
	@ObfuscatedName("k")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("o")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("Widget_modelsArchive")
	public static AbstractArchive Widget_modelsArchive;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1821500032"
	)
	public static void method3820() {
		if (MouseHandler.MouseHandler_instance != null) { // L: 43
			synchronized(MouseHandler.MouseHandler_instance) { // L: 44
				MouseHandler.MouseHandler_instance = null; // L: 45
			} // L: 46
		}

	} // L: 48

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lls;Ljava/lang/String;Ljava/lang/String;S)[Lqn;",
		garbageValue = "546"
	)
	public static SpritePixels[] method3818(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 149
		int var4 = var0.getFileId(var3, var2); // L: 150
		return Tiles.method2024(var0, var3, var4); // L: 151
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)I",
		garbageValue = "-20"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 12074
		return var1 != null ? var1.integer : var0.flags; // L: 12075 12076
	}
}
