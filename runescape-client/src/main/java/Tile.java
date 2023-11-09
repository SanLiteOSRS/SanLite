import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = 1625689069
	)
	static int field2309;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 310315191
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1042449253
	)
	@Export("x")
	int x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1729743891
	)
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1166615343
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("wallObject")
	WallObject wallObject;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("decorativeObject")
	DecorativeObject decorativeObject;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("groundObject")
	GroundObject groundObject;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -586782739
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lhe;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("m")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1285794361
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1656859021
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("z")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("r")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("y")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -356982793
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1340907321
	)
	int field2328;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1070411147
	)
	int field2329;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -661116225
	)
	int field2330;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "67"
	)
	public static int method3935(int var0, int var1, int var2) {
		int var3 = class14.method171(var2 - var1 + 1); // L: 57
		var3 <<= var1; // L: 58
		var0 |= var3; // L: 59
		return var0; // L: 60
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lls;IIB)Z",
		garbageValue = "127"
	)
	public static boolean method3937(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 213
		if (var3 == null) {
			return false; // L: 214
		} else {
			class117.SpriteBuffer_decode(var3); // L: 215
			return true; // L: 216
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "401867522"
	)
	static final void method3936() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 98
			int var0 = Scene.Scene_cameraPitchSine; // L: 99
			int var1 = Scene.Scene_cameraPitchCosine; // L: 100
			int var2 = Scene.Scene_cameraYawSine; // L: 101
			int var3 = Scene.Scene_cameraYawCosine; // L: 102
			byte var4 = 50; // L: 103
			short var5 = 3500; // L: 104
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 105
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 106
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 107
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 108
			int var10 = Rasterizer3D.method3944(var7, var4, var1, var0); // L: 110
			int var11 = Rasterizer3D.method3965(var7, var4, var1, var0); // L: 111
			var7 = var10; // L: 112
			var10 = Rasterizer3D.method3944(var9, var5, var1, var0); // L: 113
			int var12 = Rasterizer3D.method3965(var9, var5, var1, var0); // L: 114
			var9 = var10; // L: 115
			var10 = Rasterizer3D.method3945(var6, var11, var3, var2); // L: 116
			var11 = Rasterizer3D.method3963(var6, var11, var3, var2); // L: 117
			var6 = var10; // L: 118
			var10 = Rasterizer3D.method3945(var8, var12, var3, var2); // L: 119
			var12 = Rasterizer3D.method3963(var8, var12, var3, var2); // L: 120
			class141.field1634 = (var10 + var6) / 2; // L: 122
			ViewportMouse.field2593 = (var7 + var9) / 2; // L: 123
			class143.field1639 = (var12 + var11) / 2; // L: 124
			SoundCache.field322 = (var10 - var6) / 2; // L: 125
			WorldMapCacheName.field2870 = (var9 - var7) / 2; // L: 126
			ViewportMouse.field2599 = (var12 - var11) / 2; // L: 127
			UrlRequest.field1355 = Math.abs(SoundCache.field322); // L: 128
			class123.field1517 = Math.abs(WorldMapCacheName.field2870); // L: 129
			class150.field1677 = Math.abs(ViewportMouse.field2599); // L: 130
		}
	} // L: 131
}
