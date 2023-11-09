import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("DecorativeObject")
public final class DecorativeObject {
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 452898185
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1353438721
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1346340783
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1328351163
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -607881373
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1711060009
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1573434537
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -4691380879163567243L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 35030579
	)
	@Export("flags")
	int flags;

	DecorativeObject() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "285951283"
	)
	static void method5025() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 264
			if (class20.clientPreferences.method2473() != null) { // L: 265
				Login.Login_username = class20.clientPreferences.method2473(); // L: 266
				Client.Login_isUsernameRemembered = true; // L: 267
			} else {
				Client.Login_isUsernameRemembered = false; // L: 269
			}

		}
	} // L: 270

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lif;I)V",
		garbageValue = "960745047"
	)
	static final void method5024(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 90
			for (var7 = 0; var7 < 64; ++var7) { // L: 91
				for (var8 = 0; var8 < 64; ++var8) { // L: 92
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 93
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 97

		for (var7 = 0; var7 < 4; ++var7) { // L: 98
			for (var8 = 0; var8 < 64; ++var8) { // L: 99
				for (int var9 = 0; var9 < 64; ++var9) { // L: 100
					int var10 = var8 + var1; // L: 101
					int var11 = var9 + var2; // L: 102
					class372.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 103
				}
			}
		}

	} // L: 107

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "([Lmq;Lmq;ZB)V",
		garbageValue = "44"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 10476
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 10477
		class135.resizeInterface(var0, var1.id, var3, var4, var2); // L: 10478
		if (var1.children != null) {
			class135.resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 10479
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 10480
		if (var5 != null) { // L: 10481
			SequenceDefinition.method4149(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) { // L: 10482
		}

	} // L: 10483
}
