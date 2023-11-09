import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class347 {
	@ObfuscatedName("ap")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("by")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "16711935"
	)
	public static String method6610(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = WorldMapArea.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 25
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1612490980"
	)
	static void method6613(int var0) {
		if (var0 != Client.loginState) { // L: 12779
			Client.loginState = var0; // L: 12780
		}
	} // L: 12781
}
