import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public class class434 {
	@ObfuscatedName("an")
	public static String field4676;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "605589778"
	)
	static final boolean method8100(int var0, int var1) {
		ObjectComposition var2 = class59.getObjectDefinition(var0); // L: 992
		if (var1 == 11) { // L: 993
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 994
		}

		return var2.method3872(var1); // L: 995
	}
}
