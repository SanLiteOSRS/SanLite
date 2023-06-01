import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("bw")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 814075
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 329634895
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1513971887
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 853737189
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("wallObject")
	WallObject wallObject;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("decorativeObject")
	DecorativeObject decorativeObject;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("groundObject")
	GroundObject groundObject;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 811623041
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Ljw;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ae")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 23387639
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1880080499
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("as")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("am")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ao")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -192929135
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1953282603
	)
	int field2491;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -535698439
	)
	int field2501;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1997495707
	)
	int field2508;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liu;"
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
}
