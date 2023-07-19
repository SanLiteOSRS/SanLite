import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -383471993
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1396566595
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1938845869
	)
	@Export("y")
	int y;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -732990465
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("wallObject")
	WallObject wallObject;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("decorativeObject")
	DecorativeObject decorativeObject;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("groundObject")
	GroundObject groundObject;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2142563461
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Ljs;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("as")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1821730315
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 382719037
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aa")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ar")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ad")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -606350397
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1272045445
	)
	int field2517;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1565725879
	)
	int field2518;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 680333217
	)
	int field2502;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Liy;"
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
