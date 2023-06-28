import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1398229817
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -209742379
	)
	@Export("x")
	int x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1087673033
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1035826465
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("wallObject")
	WallObject wallObject;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("decorativeObject")
	DecorativeObject decorativeObject;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("groundObject")
	GroundObject groundObject;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -844456061
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Ljj;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("aj")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1850568531
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -132323629
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ag")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ar")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ah")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1915680807
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1505479829
	)
	int field2511;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 419007859
	)
	int field2512;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 979517787
	)
	int field2513;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5]; // L: 17
		this.gameObjectEdgeMasks = new int[5]; // L: 18
		this.gameObjectsEdgeMask = 0; // L: 19
		this.originalPlane = this.plane = var1; // L: 31
		this.x = var2; // L: 32
		this.y = var3; // L: 33
	} // L: 34

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1287745138"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 62
		if (var0 < 0 || var0 >= 65536) { // L: 63
			var0 >>>= 16; // L: 64
			var1 += 16; // L: 65
		}

		if (var0 >= 256) { // L: 67
			var0 >>>= 8; // L: 68
			var1 += 8; // L: 69
		}

		if (var0 >= 16) { // L: 71
			var0 >>>= 4; // L: 72
			var1 += 4; // L: 73
		}

		if (var0 >= 4) { // L: 75
			var0 >>>= 2; // L: 76
			var1 += 2; // L: 77
		}

		if (var0 >= 1) { // L: 79
			var0 >>>= 1; // L: 80
			++var1; // L: 81
		}

		return var0 + var1; // L: 83
	}
}
