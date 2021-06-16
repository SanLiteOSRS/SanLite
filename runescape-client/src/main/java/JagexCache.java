import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("u")
	@Export("cacheSubPaths")
	public static String[] cacheSubPaths;
	@ObfuscatedName("n")
	@Export("userHomeDirectory")
	public static String userHomeDirectory;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive10")
	static Archive archive10;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1038546340"
	)
	static final void method2637(int var0, int var1, int var2, boolean var3) {
		if (class20.loadInterface(var0)) {
			DynamicObject.resizeInterface(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "([Liv;II)V",
		garbageValue = "1856599832"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						class8.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					WorldMapSection1.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = WorldMapData_1.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					WorldMapSection1.runScriptEvent(var5);
				}
			}
		}

	}
}
