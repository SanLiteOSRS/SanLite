import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public class class383 {
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "344145901"
	)
	static void method7318(int var0, int var1) {
		int var2 = class7.fontBold12.stringWidth("Choose Option"); // L: 8818

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 8819
			var4 = class7.fontBold12.stringWidth(SceneTilePaint.method4753(var3)); // L: 8820
			if (var4 > var2) { // L: 8821
				var2 = var4;
			}
		}

		var2 += 8; // L: 8823
		var3 = Client.menuOptionsCount * 15 + 22; // L: 8824
		var4 = var0 - var2 / 2; // L: 8825
		if (var4 + var2 > GameEngine.canvasWidth) { // L: 8826
			var4 = GameEngine.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 8827
			var4 = 0;
		}

		int var5 = var1; // L: 8828
		if (var3 + var1 > class143.canvasHeight) { // L: 8829
			var5 = class143.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 8830
			var5 = 0;
		}

		class20.menuX = var4; // L: 8831
		Login.menuY = var5; // L: 8832
		PacketWriter.menuWidth = var2; // L: 8833
		class30.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 8834
	} // L: 8835
}
