import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class128 {
	@ObfuscatedName("ai")
	public static final float field1512;
	@ObfuscatedName("ar")
	public static final float field1519;
	@ObfuscatedName("as")
	static float[] field1511;
	@ObfuscatedName("aa")
	static float[] field1510;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static IndexedSprite field1508;
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	static GraphicsDefaults field1514;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(
		intValue = -45116601
	)
	static int field1513;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -1097261913
	)
	static int field1520;

	static {
		field1512 = Math.ulp(1.0F); // L: 10
		field1519 = field1512 * 2.0F; // L: 11
		field1511 = new float[4]; // L: 12
		field1510 = new float[5]; // L: 13
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "552143229"
	)
	public static int method3013(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 112
		return (var0 + var2) / var1 - var2; // L: 113
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "64"
	)
	static final int method3011(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 981
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 982
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "38"
	)
	static void method3018(int var0, String var1) {
		Login.Login_loadingText = var1; // L: 2041
		Login.Login_loadingPercent = var0; // L: 2042
	} // L: 2043

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "([Lng;IB)V",
		garbageValue = "100"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12015
			Widget var3 = var0[var2]; // L: 12016
			if (var3 != null) { // L: 12017
				if (var3.type == 0) { // L: 12018
					if (var3.children != null) { // L: 12019
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12020
					if (var4 != null) { // L: 12021
						Canvas.method292(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 12023
					var5 = new ScriptEvent(); // L: 12024
					var5.widget = var3; // L: 12025
					var5.args = var3.onDialogAbort; // L: 12026
					class177.runScriptEvent(var5); // L: 12027
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 12029
					if (var3.childIndex >= 0) { // L: 12030
						Widget var6 = ArchiveLoader.field1070.method6431(var3.id); // L: 12031
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 12032
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 12036
					var5.widget = var3; // L: 12037
					var5.args = var3.onSubChange; // L: 12038
					class177.runScriptEvent(var5); // L: 12039
				}
			}
		}

	} // L: 12042
}
