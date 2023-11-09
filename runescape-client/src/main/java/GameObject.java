import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1892539701
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1266208533
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 464414183
	)
	@Export("z")
	int z;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1642892071
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1828236431
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1415584847
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1759886747
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1153607795
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -931918827
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -537493057
	)
	int field2849;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 501312717
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -1477331310994429987L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1771005875
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19
}
