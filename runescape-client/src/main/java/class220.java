import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class220 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method4530() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 51
	} // L: 52

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "741847652"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ReflectionCheck.loadInterface(var0)) { // L: 11476
			ArchiveDiskAction.runComponentCloseListeners(Widget.Widget_interfaceComponents[var0], var1); // L: 11477
		}
	} // L: 11478

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lku;B)V",
		garbageValue = "106"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field705) { // L: 11703
			Client.field610[var0.rootIndex] = true; // L: 11704
		}

	} // L: 11706
}
