import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class342 {
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 988916283
	)
	static int field3862;

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1771943161"
	)
	static void method6603(int var0, int var1) {
		int var2 = class59.fontBold12.stringWidth("Choose Option"); // L: 9355

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 9356
			var4 = class59.fontBold12.stringWidth(class181.method3532(var3)); // L: 9357
			if (var4 > var2) { // L: 9358
				var2 = var4;
			}
		}

		var2 += 8; // L: 9360
		var3 = Client.menuOptionsCount * 15 + 22; // L: 9361
		var4 = var0 - var2 / 2; // L: 9362
		if (var4 + var2 > class113.canvasWidth) { // L: 9363
			var4 = class113.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 9364
			var4 = 0;
		}

		int var5 = var1; // L: 9365
		if (var1 + var3 > class177.canvasHeight) { // L: 9366
			var5 = class177.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 9367
			var5 = 0;
		}

		class12.menuX = var4; // L: 9368
		class419.menuY = var5; // L: 9369
		class316.menuWidth = var2; // L: 9370
		Occluder.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 9371
	} // L: 9372
}
