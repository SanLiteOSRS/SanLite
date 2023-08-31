import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class36 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("aj")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "16"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ModeWhere.loadInterface(var0)) { // L: 10548
			class162.field1797 = null; // L: 10555
			class135.drawInterface(PacketBufferNode.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 10556
			if (class162.field1797 != null) { // L: 10557
				class135.drawInterface(class162.field1797, -1412584499, var1, var2, var3, var4, class134.field1611, class326.field3559, var7); // L: 10558
				class162.field1797 = null; // L: 10559
			}

		} else {
			if (var7 != -1) { // L: 10549
				Client.field536[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 10551
					Client.field536[var8] = true;
				}
			}

		}
	} // L: 10553 10561
}
