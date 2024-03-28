import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("iw")
	static int[] field2599;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -668451045
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 867288095
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 401221575
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1598634067
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("wallObject")
	WallObject wallObject;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("decorativeObject")
	DecorativeObject decorativeObject;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("groundObject")
	GroundObject groundObject;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1426142267
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lkk;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ai")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1022218731
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -906793913
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aj")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("au")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ay")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1376316457
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -287320169
	)
	int field2602;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 37074917
	)
	int field2583;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2057043439
	)
	int field2604;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CLpv;I)C",
		garbageValue = "994159739"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 117
			if (var0 >= 192 && var0 <= 198) { // L: 118
				return 'A';
			}

			if (var0 == 199) { // L: 119
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 120
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 121
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 122
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 123
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 124
				return 'U';
			}

			if (var0 == 221) { // L: 125
				return 'Y';
			}

			if (var0 == 223) { // L: 126
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 127
				return 'a';
			}

			if (var0 == 231) { // L: 128
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 129
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i'; // L: 130
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 131
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 132
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 133
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 134
				return 'y';
			}
		}

		if (var0 == 338) { // L: 136
			return 'O';
		} else if (var0 == 339) { // L: 137
			return 'o';
		} else if (var0 == 376) { // L: 138
			return 'Y';
		} else {
			return var0; // L: 139
		}
	}
}
