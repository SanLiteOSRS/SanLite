import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public class class368 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1891610836"
	)
	static final String method7010(int var0) {
		if (var0 < 100000) { // L: 446
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>"; // L: 447 448
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-462155747"
	)
	public static String method7012(CharSequence var0) {
		int var2 = var0.length(); // L: 193
		char[] var3 = new char[var2]; // L: 195

		for (int var4 = 0; var4 < var2; ++var4) { // L: 196
			var3[var4] = '*';
		}

		String var1 = new String(var3); // L: 197
		return var1; // L: 199
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	static final void method7011(String var0) {
		SecureRandomCallable.method2319(var0 + " is already on your ignore list"); // L: 165
	} // L: 166
}
