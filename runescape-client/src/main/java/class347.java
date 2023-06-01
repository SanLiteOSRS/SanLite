import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public class class347 {
	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lmo;B)Ljava/lang/String;",
		garbageValue = "-60"
	)
	static String method6646(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 10756
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 10757
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 10759
					if (var3 == -1) { // L: 10760
						break;
					}

					String var4 = var0.substring(0, var3); // L: 10761
					int var6 = class216.method4197(var1, var2 - 1); // L: 10763
					String var5;
					if (var6 < 999999999) { // L: 10765
						var5 = Integer.toString(var6); // L: 10766
					} else {
						var5 = "*"; // L: 10769
					}

					var0 = var4 + var5 + var0.substring(var3 + 2); // L: 10771
				}
			}
		}

		return var0; // L: 10775
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2068427633"
	)
	static final void method6647(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 11981
		var0 = 100 - var0; // L: 11982
		float var1 = 0.5F + (float)var0 / 200.0F; // L: 11983
		GameEngine.method625((double)var1); // L: 11984
	} // L: 11985
}
