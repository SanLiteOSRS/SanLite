import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class357 {
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;

	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Ldi;ZI)V",
		garbageValue = "1366698381"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11806
		int var3 = (int)var0.key; // L: 11807
		var0.remove(); // L: 11808
		if (var1 && var2 != -1 && class264.Widget_loadedInterfaces[var2]) { // L: 11809 11810 11811
			UserComparator3.Widget_archive.clearFilesGroup(var2); // L: 11812
			if (VerticalAlignment.Widget_interfaceComponents[var2] != null) { // L: 11813
				for (int var4 = 0; var4 < VerticalAlignment.Widget_interfaceComponents[var2].length; ++var4) { // L: 11814
					if (VerticalAlignment.Widget_interfaceComponents[var2][var4] != null) { // L: 11815
						VerticalAlignment.Widget_interfaceComponents[var2][var4] = null; // L: 11816
					}
				}

				VerticalAlignment.Widget_interfaceComponents[var2] = null; // L: 11819
				class264.Widget_loadedInterfaces[var2] = false; // L: 11820
			}
		}

		for (IntegerNode var5 = (IntegerNode)Client.widgetFlags.first(); var5 != null; var5 = (IntegerNode)Client.widgetFlags.next()) { // L: 11823
			if ((var5.key >> 48 & 65535L) == (long)var2) { // L: 11824
				var5.remove(); // L: 11825
			}
		}

		Widget var6 = class165.getWidget(var3); // L: 11829
		if (var6 != null) {
			class144.invalidateWidget(var6); // L: 11830
		}

		if (Client.rootInterface != -1) { // L: 11831
			class127.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11832
}
