import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gx")
public class class205 {
	@ObfuscatedName("v")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("x")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1532404537
	)
	static int field2359;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 328320861
	)
	static int field2364;
	@ObfuscatedName("r")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("u")
	@Export("bufferY")
	static int[] bufferY;
	@ObfuscatedName("iu")
	@Export("regions")
	static int[] regions;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}
}
