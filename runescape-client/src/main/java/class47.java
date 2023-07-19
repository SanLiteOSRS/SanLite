import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class47 {
	@ObfuscatedName("bm")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("gl")
	static String field333;
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "[Lum;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "[Luq;"
	)
	static SpritePixels[] field331;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	VorbisSample field329;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	RawSound field327;
	@ObfuscatedName("ac")
	ReentrantLock field328;

	@ObfuscatedSignature(
		descriptor = "(Lci;Lbe;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field329 = var1; // L: 11
		this.field327 = var2; // L: 12
		this.field328 = new ReentrantLock(); // L: 13
	} // L: 14

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)I",
		garbageValue = "-911722698"
	)
	static int method888(Widget var0) {
		if (var0.type != 11) { // L: 1559
			Interpreter.Interpreter_stringStack[class179.Interpreter_stringStackSize - 1] = ""; // L: 1560
			return 1; // L: 1561
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class179.Interpreter_stringStackSize]; // L: 1563
			Interpreter.Interpreter_stringStack[++class179.Interpreter_stringStackSize - 1] = var0.method6462(var1); // L: 1564
			return 1; // L: 1565
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "972204831"
	)
	static final void method889(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 9159
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 9160
				Client.field718[var4] = true;
			}
		}

	} // L: 9162
}
