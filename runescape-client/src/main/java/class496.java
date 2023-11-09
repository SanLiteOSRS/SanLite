import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("th")
public class class496 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2134872515
	)
	static final int field5002;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -535117395
	)
	static final int field5000;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1117362621
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;

	static {
		field5002 = (int)(Math.pow(2.0D, 4.0D) - 1.0D); // L: 10
		field5000 = (int)(Math.pow(2.0D, 8.0D) - 1.0D); // L: 11
	}
}
