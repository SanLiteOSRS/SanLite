import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements class391 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	field2090(1, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	field2087(0, 2);

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	static StudioGame field2089;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1211211747
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -863373227
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 14
		this.id = var4; // L: 15
	} // L: 16

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 20
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1301037601"
	)
	static void method3850(int var0, String var1) {
		Login.Login_loadingText = var1; // L: 2018
		Login.Login_loadingPercent = var0; // L: 2019
	} // L: 2020

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IIB)V",
		garbageValue = "108"
	)
	public static void method3854(Widget var0, int var1, int var2) {
		var0.field3801.bodyColors[var1] = var2; // L: 1048
		var0.field3801.method6332(); // L: 1049
	} // L: 1050

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)Z",
		garbageValue = "0"
	)
	static boolean method3853(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8;
		if (var5 == class371.field4328.field4331) { // L: 8494
			WallObject var7 = LoginType.scene.method4728(var0, var1, var2); // L: 8495
			if (var7 != null) { // L: 8496
				var8 = class206.Entity_unpackID(var7.tag); // L: 8497
				if (var3 == WorldMapDecorationType.field3925.id) { // L: 8498
					var7.renderable1 = new DynamicObject(var8, 2, var4 + 4, var0, var1, var2, var6, false, var7.renderable1); // L: 8499
					var7.renderable2 = new DynamicObject(var8, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var7.renderable2); // L: 8500
				} else {
					var7.renderable1 = new DynamicObject(var8, var3, var4, var0, var1, var2, var6, false, var7.renderable1); // L: 8503
				}

				return true; // L: 8505
			}
		} else if (var5 == class371.field4327.field4331) { // L: 8508
			DecorativeObject var9 = LoginType.scene.method4817(var0, var1, var2); // L: 8509
			if (var9 != null) { // L: 8510
				var8 = class206.Entity_unpackID(var9.tag); // L: 8511
				if (var3 != WorldMapDecorationType.field3936.id && var3 != WorldMapDecorationType.field3935.id) { // L: 8512
					if (var3 == WorldMapDecorationType.field3930.id) { // L: 8515
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1); // L: 8516
					} else if (var3 == WorldMapDecorationType.field3945.id) { // L: 8518
						var9.renderable1 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable1); // L: 8519
					} else if (var3 == WorldMapDecorationType.field3932.id) { // L: 8521
						var9.renderable1 = new DynamicObject(var8, 4, var4 + 4, var0, var1, var2, var6, false, var9.renderable1); // L: 8522
						var9.renderable2 = new DynamicObject(var8, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var9.renderable2); // L: 8523
					}
				} else {
					var9.renderable1 = new DynamicObject(var8, 4, var4, var0, var1, var2, var6, false, var9.renderable1); // L: 8513
				}

				return true; // L: 8525
			}
		} else if (var5 == class371.field4329.field4331) { // L: 8528
			GameObject var10 = LoginType.scene.getGameObject(var0, var1, var2); // L: 8529
			if (var3 == WorldMapDecorationType.field3929.id) { // L: 8530
				var3 = WorldMapDecorationType.field3943.id;
			}

			if (var10 != null) { // L: 8531
				var10.renderable = new DynamicObject(class206.Entity_unpackID(var10.tag), var3, var4, var0, var1, var2, var6, false, var10.renderable); // L: 8532
				return true; // L: 8533
			}
		} else if (var5 == class371.field4330.field4331) { // L: 8536
			GroundObject var11 = LoginType.scene.getGroundObject(var0, var1, var2); // L: 8537
			if (var11 != null) { // L: 8538
				var11.renderable = new DynamicObject(class206.Entity_unpackID(var11.tag), 22, var4, var0, var1, var2, var6, false, var11.renderable); // L: 8539
				return true; // L: 8540
			}
		}

		return false; // L: 8543
	}
}
