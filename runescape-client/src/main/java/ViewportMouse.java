import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jp")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ai")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1646648569
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1653132171
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("aw")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1608451057
	)
	static int field2781;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -148781323
	)
	static int field2775;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 390364327
	)
	static int field2777;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1637282709
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("ag")
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
}
