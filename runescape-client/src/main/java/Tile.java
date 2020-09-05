import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		signature = "Lce;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -400770483
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1404568893
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -378034661
	)
	@Export("x")
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -266768933
	)
	@Export("y")
	int y;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lem;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Len;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Leb;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Leu;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ldg;"
	)
	@Export("tileItemPile")
	ItemLayer tileItemPile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 240084109
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "[Led;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("h")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -640534231
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1686983663
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("c")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("f")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("y")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 913733009
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -870351799
	)
	int field1678;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1246325149
	)
	int field1687;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 465843851
	)
	int field1689;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lek;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}
}
