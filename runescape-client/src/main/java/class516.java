import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
public final class class516 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "6525"
	)
	public static boolean method9145() {
		boolean var0 = false; // L: 169
		boolean var1 = false; // L: 170
		if (!class316.field3413.isEmpty()) { // L: 171
			class418 var2 = (class418)class316.field3413.get(0); // L: 172
			if (var2 == null) { // L: 173
				class316.field3413.remove(0); // L: 174
			} else if (var2.vmethod7858()) { // L: 176
				if (var2.method7842()) { // L: 177
					System.out.println("Error in midimanager.service: " + var2.method7834()); // L: 178
					var0 = true; // L: 179
				} else {
					if (var2.method7839() != null) { // L: 182
						class316.field3413.add(1, var2.method7839()); // L: 183
					}

					var1 = var2.method7837(); // L: 185
				}

				class316.field3413.remove(0); // L: 187
			} else {
				var1 = var2.method7837(); // L: 190
			}
		}

		if (var0) { // L: 193
			class316.field3413.clear(); // L: 194
			SecureRandomCallable.method2326(); // L: 195
		}

		return var1; // L: 197
	}
}
