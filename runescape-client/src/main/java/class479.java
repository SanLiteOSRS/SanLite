import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
public class class479 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	public static final class479 field4879;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static final class479 field4878;
	@ObfuscatedName("al")
	String field4877;

	static {
		field4879 = new class479("application/json"); // L: 4
		field4878 = new class479("text/plain"); // L: 5
	}

	class479(String var1) {
		this.field4877 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1029608624"
	)
	public String method8751() {
		return this.field4877;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;B)I",
		garbageValue = "-120"
	)
	public static int method8756(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length(); // L: 9
		int var4 = var1; // L: 10

		for (int var5 = 0; var5 < var3; ++var5) { // L: 11
			char var6 = var2.charAt(var5); // L: 12
			if (var6 <= 127) { // L: 13
				var0[var4++] = (byte)var6; // L: 14
			} else if (var6 <= 2047) { // L: 16
				var0[var4++] = (byte)(192 | var6 >> 6); // L: 17
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 18
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f'); // L: 21
				var0[var4++] = (byte)(128 | var6 >> 6 & 63); // L: 22
				var0[var4++] = (byte)(128 | var6 & '?'); // L: 23
			}
		}

		return var4 - var1; // L: 26
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static void method8753() {
		if (MilliClock.field2352 != null) { // L: 12956
			Client.field825 = Client.cycle; // L: 12957
			MilliClock.field2352.method7322(); // L: 12958

			for (int var0 = 0; var0 < Client.players.length; ++var0) { // L: 12959
				if (Client.players[var0] != null) { // L: 12960
					MilliClock.field2352.method7320(Projectile.baseX * 64 + (Client.players[var0].x >> 7), GameEngine.baseY * 8 + (Client.players[var0].y >> 7)); // L: 12961
				}
			}
		}

	} // L: 12965
}
