import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jf")
public class class266 {
	@ObfuscatedName("aq")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;

	static {
		int var0 = 0;
		int var1 = 0;
		class261[] var2 = new class261[]{class261.field3203, class261.field3206};
		class261[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class261 var5 = var3[var4];
			if (var5.field3205 > var0) {
				var0 = var5.field3205;
			}

			if (var5.field3204 > var1) {
				var1 = var5.field3204;
			}
		}

	}
}
