import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("c")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("k")
	@Export("ItemComposition_inMembersWorld")
	public static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "[Lqe;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1124857953
	)
	@Export("group")
	int group;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 67717225
	)
	@Export("type")
	int type;
	@ObfuscatedName("w")
	boolean field1022;

	InterfaceParent() {
		this.field1022 = false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkc;",
		garbageValue = "1265149283"
	)
	static class302[] method2058() {
		return new class302[]{class302.field3577, class302.field3578}; // L: 35
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "1"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) { // L: 171
			class296.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Lfa;",
		garbageValue = "59"
	)
	public static Clock method2057() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}
}
