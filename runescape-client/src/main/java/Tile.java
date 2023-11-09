import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -948321613
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 49406973
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -24808023
	)
	@Export("y")
	int y;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -730007907
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("wallObject")
	WallObject wallObject;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("decorativeObject")
	DecorativeObject decorativeObject;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("groundObject")
	GroundObject groundObject;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 750773541
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lho;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("x")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -608278959
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -456317475
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("b")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("l")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("y")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1631939595
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -185533757
	)
	int field2307;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1929279565
	)
	int field2323;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1846310317
	)
	int field2324;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
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

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lcz;ZI)V",
		garbageValue = "2105473278"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 5026
			var0.isUnanimated = false; // L: 5027
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) { // L: 5028 5029
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 5031
			int var3 = var0.y >> 7; // L: 5032
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 5033
				long var4 = class394.calculateTag(0, 0, 0, false, var0.index); // L: 5034
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 5035
					var0.isUnanimated = false; // L: 5036
					var0.tileHeight = SecureRandomFuture.getTileHeight(var0.x, var0.y, FriendSystem.Client_plane); // L: 5037
					var0.playerCycle = Client.cycle; // L: 5038
					Decimator.scene.addNullableObject(FriendSystem.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 5039
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 5042
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 5043
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 5044
					}

					var0.tileHeight = SecureRandomFuture.getTileHeight(var0.x, var0.y, FriendSystem.Client_plane); // L: 5046
					var0.playerCycle = Client.cycle; // L: 5047
					Decimator.scene.drawEntity(FriendSystem.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 5048
				}
			}
		}

	} // L: 5052
}
