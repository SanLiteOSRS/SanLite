import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ow")
public class class403 {
	@ObfuscatedName("d")
	static final int[] field4296;
	@ObfuscatedName("z")
	static final int[] field4298;

	static {
		field4296 = new int[2048];
		field4298 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4296[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field4298[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
