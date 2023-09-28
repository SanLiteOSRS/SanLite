import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class188 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	public static EvictingDualNodeHashTable field1909;

	static {
		field1909 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "726259362"
	)
	static void method3619() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 270
			if (class91.clientPreferences.method2576() != null) { // L: 271
				Login.Login_username = class91.clientPreferences.method2576(); // L: 272
				Client.Login_isUsernameRemembered = true; // L: 273
			} else {
				Client.Login_isUsernameRemembered = false; // L: 275
			}

		}
	} // L: 276
}
