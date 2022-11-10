import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("at")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1764616911
	)
	@Export("z")
	int z;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1833070631
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1705508063
	)
	@Export("y")
	int y;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -309068729
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 183254539
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2009332571
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -417052637
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 2290048433807273417L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1818479357
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([Lmv;II)Lmv;",
		garbageValue = "1378360626"
	)
	@Export("findEnumerated")
	public static class342 findEnumerated(class342[] var0, int var1) {
		class342[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			class342 var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1518285879"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (WorldMapManager.loadInterface(var0)) { // L: 11837
			ClientPreferences.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1); // L: 11838
		}
	} // L: 11839
}
