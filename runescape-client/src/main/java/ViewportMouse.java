import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("h")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 233603823
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1918112547
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("x")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1060045251
	)
	static int field2746;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 242710193
	)
	static int field2747;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -61886565
	)
	static int field2749;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2117851361
	)
	static int field2742;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1096761705
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("n")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false; // L: 4
		ViewportMouse_x = 0; // L: 5
		ViewportMouse_y = 0; // L: 6
		ViewportMouse_false0 = false; // L: 7
		ViewportMouse_entityCount = 0; // L: 17
		ViewportMouse_entityTags = new long[1000]; // L: 18
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1012943456"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 139
	}
}
