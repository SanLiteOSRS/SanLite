import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class174 extends class177 {
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2117443693
	)
	int field1883;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfs;Ljava/lang/String;I)V"
	)
	class174(class166 var1, String var2, int var3) {
		super(var1, var2); // L: 368
		this.this$0 = var1; // L: 367
		this.field1883 = var3; // L: 369
	} // L: 370

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1024"
	)
	public int vmethod3537() {
		return 0; // L: 373
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "64"
	)
	public int vmethod3539() {
		return this.field1883; // L: 378
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-200044471"
	)
	static void method3525(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1745

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1746
			int var4 = var3 * 32 + 15 + 128; // L: 1747
			int var5 = class17.method274(var4); // L: 1748
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1749
			int var8 = var1 - 334; // L: 1752
			if (var8 < 0) { // L: 1753
				var8 = 0;
			} else if (var8 > 100) { // L: 1754
				var8 = 100;
			}

			int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight; // L: 1755
			int var7 = var5 * var9 / 256; // L: 1756
			var2[var3] = var6 * var7 >> 16; // L: 1759
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1761
	} // L: 1762

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2140118435"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		ScriptFrame.method1156(); // L: 9231
		Client.menuActions[0] = "Cancel"; // L: 9232
		Client.menuTargets[0] = ""; // L: 9233
		Client.menuOpcodes[0] = 1006; // L: 9234
		Client.menuShiftClick[0] = false; // L: 9235
		Client.menuOptionsCount = 1; // L: 9236
	} // L: 9237
}
