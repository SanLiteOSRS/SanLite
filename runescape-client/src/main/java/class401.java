import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oc")
public class class401 {
	@ObfuscatedName("o")
	static final int[] field4398;
	@ObfuscatedName("r")
	static final int[] field4399;

	static {
		field4398 = new int[2048];
		field4399 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4398[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field4399[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

	}
}
