import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	} // L: 4

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "53"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (ParamComposition.loadInterface(var0)) { // L: 11309
			Renderable.runComponentCloseListeners(class358.Widget_interfaceComponents[var0], var1); // L: 11310
		}
	} // L: 11311
}
