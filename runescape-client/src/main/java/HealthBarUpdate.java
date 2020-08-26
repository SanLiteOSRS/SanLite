import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = 1178172800
	)
	static int field1038;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1931274229
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1765683631
	)
	@Export("health")
	int health;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1932254665
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -488536303
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIIIB)V",
		garbageValue = "1"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1655201695"
	)
	public static boolean method1815() {
		return class206.musicPlayerStatus != 0 ? true : class206.midiPcmStream.isReady();
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1341706343"
	)
	static final void method1818() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-487929114"
	)
	static final void method1817(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field883[var4] = true;
			}
		}

	}
}
