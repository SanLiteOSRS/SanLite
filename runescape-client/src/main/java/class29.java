import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
public class class29 {
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -1512161280
	)
	static int field172;
	@ObfuscatedName("s")
	public static Applet field174;
	@ObfuscatedName("h")
	public static String field167;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;

	static {
		field174 = null; // L: 10
		field167 = ""; // L: 11
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "-43"
	)
	public static float method388(int var0) {
		var0 &= 16383; // L: 24
		return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D); // L: 25
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "31"
	)
	static void method391(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lcb;ZB)V",
		garbageValue = "4"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11780
		int var3 = (int)var0.key; // L: 11781
		var0.remove(); // L: 11782
		if (var1 && var2 != -1 && Widget.Widget_loadedInterfaces[var2]) { // L: 11783 11784 11785
			class438.Widget_archive.clearFilesGroup(var2); // L: 11786
			if (class358.Widget_interfaceComponents[var2] != null) { // L: 11787
				boolean var4 = true; // L: 11788

				for (int var5 = 0; var5 < class358.Widget_interfaceComponents[var2].length; ++var5) { // L: 11789
					if (class358.Widget_interfaceComponents[var2][var5] != null) { // L: 11790
						if (class358.Widget_interfaceComponents[var2][var5].type != 2) { // L: 11791
							class358.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false; // L: 11792
						}
					}
				}

				if (var4) { // L: 11795
					class358.Widget_interfaceComponents[var2] = null;
				}

				Widget.Widget_loadedInterfaces[var2] = false; // L: 11796
			}
		}

		StudioGame.method5676(var2); // L: 11798
		Widget var6 = HitSplatDefinition.getWidget(var3); // L: 11799
		if (var6 != null) { // L: 11800
			class125.invalidateWidget(var6);
		}

		if (Client.rootInterface != -1) { // L: 11801
			ModelData0.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11802
}
