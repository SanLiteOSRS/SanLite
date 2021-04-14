import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class139 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 276144893
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -135678653
	)
	static int field1560;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IB)Lhu;",
		garbageValue = "83"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = class15.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "17"
	)
	public static void method2669() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}
}
