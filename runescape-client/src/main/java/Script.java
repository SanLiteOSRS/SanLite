import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("dq")
	static boolean field972;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 2134394913
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "[Lkn;"
	)
	static Widget[] field971;
	@ObfuscatedName("f")
	String field962;
	@ObfuscatedName("c")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("x")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("h")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1624364019
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -2093681401
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1508495137
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1760588085
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Lpe;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IS)[Lpe;",
		garbageValue = "10134"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 119
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lfz;",
		garbageValue = "-1956190631"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 31
			var1 = new KitDefinition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1548637382"
	)
	static void method2120() {
		Tiles.Tiles_minPlane = 99; // L: 49
		Tiles.field994 = new short[4][104][104]; // L: 50
		Tiles.field1001 = new short[4][104][104]; // L: 51
		Tiles.field996 = new byte[4][104][104]; // L: 52
		class174.field1852 = new byte[4][104][104]; // L: 53
		UserComparator7.field1410 = new int[4][105][105]; // L: 54
		class32.field179 = new byte[4][105][105]; // L: 55
		Tiles.field995 = new int[105][105]; // L: 56
		class32.Tiles_hue = new int[104]; // L: 57
		FriendSystem.Tiles_saturation = new int[104]; // L: 58
		DefaultsGroup.Tiles_lightness = new int[104]; // L: 59
		ClanChannelMember.Tiles_hueMultiplier = new int[104]; // L: 60
		class410.field4590 = new int[104]; // L: 61
	} // L: 62

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Llq;",
		garbageValue = "19"
	)
	public static StudioGame[] method2127() {
		return new StudioGame[]{StudioGame.runescape, StudioGame.game4, StudioGame.game5, StudioGame.stellardawn, StudioGame.game3, StudioGame.oldscape}; // L: 17
	}
}
