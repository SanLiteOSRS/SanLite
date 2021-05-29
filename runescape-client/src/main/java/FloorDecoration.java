import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 859770957
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1864149275
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -758120448
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 5096767537878498943L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -383801797
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmi;",
		garbageValue = "-71321726"
	)
	static class338[] method3834() {
		return new class338[]{class338.field3914, class338.field3916, class338.field3915, class338.field3917};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (Clock.loadInterface(var0)) {
				Widget[] var1 = Widget.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						World.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
