import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("js")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 985658013
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 445225997
	)
	@Export("z")
	int z;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1219532499
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1409332347
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -135210001
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1951023605
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 815730865
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1518207805
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1218290605
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 408790235
	)
	int field2853;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1969157713
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 5871548578503636443L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 882463215
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "472778457"
	)
	static int method5123(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 4404
			Client.logoutTimer = 250; // L: 4405
			return 1; // L: 4406
		} else {
			return 2; // L: 4408
		}
	}
}
