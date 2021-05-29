import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hi")
public class class230 {
	@ObfuscatedName("v")
	static int[] field2814;

	static {
		new Object();
		field2814 = new int[33];
		field2814[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field2814[var1] = var0 - 1;
			var0 += var0;
		}

	}
}
