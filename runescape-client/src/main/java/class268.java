import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Deprecated
@jf
@ObfuscatedName("ji")
public final class class268 {
	@ObfuscatedName("w")
	static final HashMap field3168;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 1083786667
	)
	@Export("Client_plane")
	static int Client_plane;

	static {
		field3168 = new HashMap(); // L: 11
		TimeZone var0;
		synchronized(field3168) { // L: 16
			TimeZone var2 = (TimeZone)field3168.get("Europe/London"); // L: 17
			if (var2 == null) { // L: 18
				var2 = TimeZone.getTimeZone("Europe/London"); // L: 19
				field3168.put("Europe/London", var2); // L: 20
			}

			var0 = var2; // L: 22
		}

		java.util.Calendar.getInstance(var0); // L: 25
	} // L: 26

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "824492268"
	)
	static boolean method5149(int var0) {
		for (int var1 = 0; var1 < Client.field714; ++var1) { // L: 11302
			if (Client.field716[var1] == var0) { // L: 11303
				return true;
			}
		}

		return false; // L: 11305
	}
}
