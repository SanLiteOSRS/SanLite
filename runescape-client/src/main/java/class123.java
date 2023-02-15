import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public enum class123 implements class349 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1502(0, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1504(1, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1503(2, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1506(3, 3),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1505(4, 4);

	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -677297709
	)
	final int field1508;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1512847447
	)
	final int field1507;

	class123(int var3, int var4) {
		this.field1508 = var3; // L: 131
		this.field1507 = var4; // L: 132
	} // L: 133

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1507; // L: 136
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1543055552"
	)
	public static final void method3031(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 82
		ViewportMouse.ViewportMouse_y = var1; // L: 83
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 84
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 85
		ViewportMouse.ViewportMouse_false0 = false; // L: 86
	} // L: 87

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1240645994"
	)
	static final int method3037(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 982
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 983
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-636311920"
	)
	static void method3032() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12593
			int var1 = var0.group; // L: 12594
			if (class153.loadInterface(var1)) { // L: 12595
				boolean var2 = true; // L: 12596
				Widget[] var3 = WorldMapLabel.Widget_interfaceComponents[var1]; // L: 12597

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 12598
					if (var3[var4] != null) { // L: 12599
						var2 = var3[var4].isIf3; // L: 12600
						break;
					}
				}

				if (!var2) { // L: 12604
					var4 = (int)var0.key; // L: 12605
					Widget var5 = class133.getWidget(var4); // L: 12606
					if (var5 != null) { // L: 12607
						LoginScreenAnimation.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 12611
}
