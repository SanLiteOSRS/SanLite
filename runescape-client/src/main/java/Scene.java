import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("Scene")
public class Scene {
	@ObfuscatedName("a")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("o")
	@Export("tileUpdateCount")
	static int tileUpdateCount;
	@ObfuscatedName("u")
	@Export("Scene_plane")
	static int Scene_plane;
	@ObfuscatedName("z")
	@Export("Scene_drawnCount")
	static int Scene_drawnCount;
	@ObfuscatedName("t")
	@Export("Scene_cameraXTileMin")
	static int Scene_cameraXTileMin;
	@ObfuscatedName("w")
	@Export("Scene_cameraXTileMax")
	static int Scene_cameraXTileMax;
	@ObfuscatedName("m")
	@Export("Scene_cameraYTileMin")
	static int Scene_cameraYTileMin;
	@ObfuscatedName("q")
	@Export("Scene_cameraYTileMax")
	static int Scene_cameraYTileMax;
	@ObfuscatedName("i")
	@Export("Scene_cameraXTile")
	static int Scene_cameraXTile;
	@ObfuscatedName("e")
	@Export("Scene_cameraYTile")
	static int Scene_cameraYTile;
	@ObfuscatedName("g")
	@Export("Scene_cameraX")
	static int Scene_cameraX;
	@ObfuscatedName("k")
	@Export("Scene_cameraY")
	static int Scene_cameraY;
	@ObfuscatedName("v")
	@Export("Scene_cameraZ")
	static int Scene_cameraZ;
	@ObfuscatedName("aj")
	@Export("Scene_cameraPitchSine")
	static int Scene_cameraPitchSine;
	@ObfuscatedName("an")
	@Export("Scene_cameraPitchCosine")
	static int Scene_cameraPitchCosine;
	@ObfuscatedName("ah")
	@Export("Scene_cameraYawSine")
	static int Scene_cameraYawSine;
	@ObfuscatedName("ao")
	@Export("Scene_cameraYawCosine")
	static int Scene_cameraYawCosine;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lhs;"
	)
	@Export("gameObjects")
	static GameObject[] gameObjects;
	@ObfuscatedName("af")
	@Export("checkClick")
	static boolean checkClick;
	@ObfuscatedName("ad")
	@Export("Scene_selectedPlane")
	static int Scene_selectedPlane;
	@ObfuscatedName("av")
	@Export("Scene_selectedScreenX")
	static int Scene_selectedScreenX;
	@ObfuscatedName("ak")
	@Export("Scene_selectedScreenY")
	static int Scene_selectedScreenY;
	@ObfuscatedName("ae")
	@Export("Scene_selectedX")
	public static int Scene_selectedX;
	@ObfuscatedName("ap")
	@Export("Scene_selectedY")
	public static int Scene_selectedY;
	@ObfuscatedName("as")
	@Export("viewportWalking")
	static boolean viewportWalking;
	@ObfuscatedName("ag")
	@Export("Scene_planesCount")
	static int Scene_planesCount;
	@ObfuscatedName("am")
	@Export("Scene_planeOccluderCounts")
	static int[] Scene_planeOccluderCounts;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[Lhk;"
	)
	@Export("Scene_planeOccluders")
	static Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("ab")
	@Export("Scene_currentOccludersCount")
	static int Scene_currentOccludersCount;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lhk;"
	)
	@Export("Scene_currentOccluders")
	static Occluder[] Scene_currentOccluders;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("Scene_tilesDeque")
	static NodeDeque Scene_tilesDeque;
	@ObfuscatedName("aw")
	static final int[] field2498;
	@ObfuscatedName("at")
	static final int[] field2505;
	@ObfuscatedName("ar")
	static final int[] field2500;
	@ObfuscatedName("ay")
	static final int[] field2501;
	@ObfuscatedName("ax")
	static final int[] field2502;
	@ObfuscatedName("aa")
	static final int[] field2503;
	@ObfuscatedName("bx")
	static final int[] field2497;
	@ObfuscatedName("bd")
	@Export("visibilityMap")
	static boolean[][][][] visibilityMap;
	@ObfuscatedName("bq")
	@Export("visibleTiles")
	static boolean[][] visibleTiles;
	@ObfuscatedName("bk")
	@Export("Scene_viewportXCenter")
	static int Scene_viewportXCenter;
	@ObfuscatedName("bc")
	@Export("Scene_viewportYCenter")
	static int Scene_viewportYCenter;
	@ObfuscatedName("bv")
	@Export("Scene_viewportXMin")
	static int Scene_viewportXMin;
	@ObfuscatedName("bt")
	@Export("Scene_viewportYMin")
	static int Scene_viewportYMin;
	@ObfuscatedName("ba")
	@Export("Scene_viewportXMax")
	static int Scene_viewportXMax;
	@ObfuscatedName("br")
	@Export("Scene_viewportYMax")
	static int Scene_viewportYMax;
	@ObfuscatedName("f")
	@Export("planes")
	int planes;
	@ObfuscatedName("c")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("x")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("h")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[[[Lhp;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("y")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("d")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[Lhs;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("r")
	int[][][] field2461;
	@ObfuscatedName("bo")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("bg")
	@Export("tileRotation2D")
	int[][] tileRotation2D;

	static {
		Scene_isLowDetail = true; // L: 8
		tileUpdateCount = 0; // L: 22
		Scene_plane = 0; // L: 23
		gameObjects = new GameObject[100]; // L: 38
		checkClick = false; // L: 39
		Scene_selectedPlane = 0; // L: 40
		Scene_selectedScreenX = 0; // L: 41
		Scene_selectedScreenY = 0; // L: 42
		Scene_selectedX = -1; // L: 43
		Scene_selectedY = -1; // L: 44
		viewportWalking = false; // L: 45
		Scene_planesCount = 4; // L: 48
		Scene_planeOccluderCounts = new int[Scene_planesCount]; // L: 49
		Scene_planeOccluders = new Occluder[Scene_planesCount][500]; // L: 50
		Scene_currentOccludersCount = 0; // L: 51
		Scene_currentOccluders = new Occluder[500]; // L: 52
		Scene_tilesDeque = new NodeDeque(); // L: 53
		field2498 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76}; // L: 54
		field2505 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160}; // L: 55
		field2500 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19}; // L: 56
		field2501 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0}; // L: 57
		field2502 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4}; // L: 58
		field2503 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0}; // L: 59
		field2497 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8}; // L: 60
		visibilityMap = new boolean[8][32][51][51]; // L: 86
	}

	public Scene(int var1, int var2, int var3, int[][][] var4) {
		this.minPlane = 0; // L: 14
		this.tempGameObjectsCount = 0; // L: 15
		this.tempGameObjects = new GameObject[5000]; // L: 16
		this.tileShape2D = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}}; // L: 65
		this.tileRotation2D = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}}; // L: 80
		this.planes = var1; // L: 96
		this.xSize = var2; // L: 97
		this.ySize = var3; // L: 98
		this.tiles = new Tile[var1][var2][var3]; // L: 99
		this.field2461 = new int[var1][var2 + 1][var3 + 1]; // L: 100
		this.tileHeights = var4; // L: 101
		this.clear(); // L: 102
	} // L: 103

	@ObfuscatedName("a")
	@Export("clear")
	public void clear() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.planes; ++var1) { // L: 106
			for (var2 = 0; var2 < this.xSize; ++var2) { // L: 107
				for (int var3 = 0; var3 < this.ySize; ++var3) { // L: 108
					this.tiles[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < Scene_planesCount; ++var1) { // L: 111
			for (var2 = 0; var2 < Scene_planeOccluderCounts[var1]; ++var2) { // L: 112
				Scene_planeOccluders[var1][var2] = null;
			}

			Scene_planeOccluderCounts[var1] = 0; // L: 113
		}

		for (var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 115
			this.tempGameObjects[var1] = null; // L: 116
		}

		this.tempGameObjectsCount = 0; // L: 118

		for (var1 = 0; var1 < gameObjects.length; ++var1) { // L: 119
			gameObjects[var1] = null;
		}

	} // L: 120

	@ObfuscatedName("f")
	@Export("init")
	public void init(int var1) {
		this.minPlane = var1; // L: 123

		for (int var2 = 0; var2 < this.xSize; ++var2) { // L: 124
			for (int var3 = 0; var3 < this.ySize; ++var3) { // L: 125
				if (this.tiles[var1][var2][var3] == null) { // L: 126
					this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
				}
			}
		}

	} // L: 129

	@ObfuscatedName("c")
	@Export("setLinkBelow")
	public void setLinkBelow(int var1, int var2) {
		Tile var3 = this.tiles[0][var1][var2]; // L: 132

		for (int var4 = 0; var4 < 3; ++var4) { // L: 133
			Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2]; // L: 134
			if (var5 != null) { // L: 135
				--var5.plane; // L: 136

				for (int var6 = 0; var6 < var5.gameObjectsCount; ++var6) { // L: 137
					GameObject var7 = var5.gameObjects[var6]; // L: 138
					long var9 = var7.tag; // L: 140
					int var11 = (int)(var9 >>> 14 & 3L); // L: 144
					boolean var8 = var11 == 2; // L: 146
					if (var8 && var7.startX == var1 && var2 == var7.startY) { // L: 148
						--var7.plane;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) { // L: 152
			this.tiles[0][var1][var2] = new Tile(0, var1, var2);
		}

		this.tiles[0][var1][var2].linkedBelowTile = var3; // L: 153
		this.tiles[3][var1][var2] = null; // L: 154
	} // L: 155

	@ObfuscatedName("h")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 174
		if (var5 != null) { // L: 175
			this.tiles[var1][var2][var3].minPlane = var4; // L: 176
		}
	} // L: 177

	@ObfuscatedName("j")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) { // L: 180
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false); // L: 181

			for (var22 = var1; var22 >= 0; --var22) { // L: 182
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 183
		} else if (var4 != 1) { // L: 186
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20); // L: 192

			for (var22 = var1; var22 >= 0; --var22) { // L: 193
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23; // L: 194
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7); // L: 187

			for (var22 = var1; var22 >= 0; --var22) { // L: 188
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 189
		}
	} // L: 184 190 195

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIILhd;JI)V"
	)
	@Export("newGroundObject")
	public void newGroundObject(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) { // L: 198
			GroundObject var9 = new GroundObject(); // L: 199
			var9.renderable = var5; // L: 200
			var9.x = var2 * 128 + 64; // L: 201
			var9.y = var3 * 128 + 64; // L: 202
			var9.z = var4; // L: 203
			var9.tag = var6; // L: 204
			var9.flags = var8; // L: 205
			if (this.tiles[var1][var2][var3] == null) { // L: 206
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].groundObject = var9; // L: 207
		}
	} // L: 208

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIIILhd;JLhd;Lhd;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer(); // L: 211
		var10.first = var5; // L: 212
		var10.x = var2 * -2013265920 + -1006632960; // L: 213
		var10.y = var3 * 128 + 64; // L: 214
		var10.z = var4; // L: 215
		var10.tag = var6; // L: 216
		var10.second = var8; // L: 217
		var10.third = var9; // L: 218
		int var11 = 0; // L: 219
		Tile var12 = this.tiles[var1][var2][var3]; // L: 220
		if (var12 != null) { // L: 221
			for (int var13 = 0; var13 < var12.gameObjectsCount; ++var13) { // L: 222
				if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) { // L: 223
					Model var14 = (Model)var12.gameObjects[var13].renderable; // L: 224
					var14.calculateBoundsCylinder(); // L: 225
					if (var14.height > var11) { // L: 226
						var11 = var14.height;
					}
				}
			}
		}

		var10.height = var11; // L: 230
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new Tile(var1, var2, var3); // L: 231
		}

		this.tiles[var1][var2][var3].itemLayer = var10; // L: 232
	} // L: 233

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIILhd;Lhd;IIJI)V"
	)
	@Export("newWallObject")
	public void newWallObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) { // L: 236
			WallObject var12 = new WallObject(); // L: 237
			var12.tag = var9; // L: 238
			var12.flags = var11; // L: 239
			var12.x = var2 * 128 + 64; // L: 240
			var12.y = var3 * 128 + 64; // L: 241
			var12.z = var4; // L: 242
			var12.renderable1 = var5; // L: 243
			var12.renderable2 = var6; // L: 244
			var12.orientationA = var7; // L: 245
			var12.orientationB = var8; // L: 246

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.tiles[var13][var2][var3] == null) {
					this.tiles[var13][var2][var3] = new Tile(var13, var2, var3); // L: 247
				}
			}

			this.tiles[var1][var2][var3].wallObject = var12; // L: 248
		}
	} // L: 249

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIILhd;Lhd;IIIIJI)V"
	)
	@Export("newDecorativeObject")
	public void newDecorativeObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) { // L: 252
			DecorativeObject var14 = new DecorativeObject(); // L: 253
			var14.tag = var11; // L: 254
			var14.flags = var13; // L: 255
			var14.x = var2 * 128 + 64; // L: 256
			var14.y = var3 * 128 + 64; // L: 257
			var14.z = var4; // L: 258
			var14.renderable1 = var5; // L: 259
			var14.renderable2 = var6; // L: 260
			var14.orientation = var7; // L: 261
			var14.orientation2 = var8; // L: 262
			var14.xOffset = var9; // L: 263
			var14.yOffset = var10; // L: 264

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3); // L: 265
				}
			}

			this.tiles[var1][var2][var3].decorativeObject = var14; // L: 266
		}
	} // L: 267

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILhd;IJI)Z"
	)
	public boolean method4315(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) { // L: 270
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128; // L: 271
			int var13 = var6 * 64 + var3 * 128; // L: 272
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11); // L: 273
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIIILhd;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
		if (var6 == null) { // L: 277
			return true;
		} else {
			int var11 = var2 - var5; // L: 278
			int var12 = var3 - var5; // L: 279
			int var13 = var5 + var2; // L: 280
			int var14 = var3 + var5; // L: 281
			if (var10) { // L: 282
				if (var7 > 640 && var7 < 1408) { // L: 283
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) { // L: 284
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) { // L: 285
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) { // L: 286
					var11 -= 128;
				}
			}

			var11 /= 128; // L: 288
			var12 /= 128; // L: 289
			var13 /= 128; // L: 290
			var14 /= 128; // L: 291
			return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 292
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIILhd;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 296 297
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILhd;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) { // L: 301
			for (var16 = var3; var16 < var3 + var5; ++var16) { // L: 302
				if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) { // L: 303
					return false;
				}

				Tile var23 = this.tiles[var1][var15][var16]; // L: 304
				if (var23 != null && var23.gameObjectsCount >= 5) { // L: 305
					return false;
				}
			}
		}

		GameObject var21 = new GameObject(); // L: 308
		var21.tag = var12; // L: 309
		var21.flags = var14; // L: 310
		var21.plane = var1; // L: 311
		var21.centerX = var6; // L: 312
		var21.centerY = var7; // L: 313
		var21.z = var8; // L: 314
		var21.renderable = var9; // L: 315
		var21.orientation = var10; // L: 316
		var21.startX = var2; // L: 317
		var21.startY = var3; // L: 318
		var21.endX = var2 + var4 - 1; // L: 319
		var21.endY = var3 + var5 - 1; // L: 320

		for (var16 = var2; var16 < var2 + var4; ++var16) { // L: 321
			for (int var17 = var3; var17 < var3 + var5; ++var17) { // L: 322
				int var18 = 0; // L: 323
				if (var16 > var2) { // L: 324
					++var18;
				}

				if (var16 < var2 + var4 - 1) { // L: 325
					var18 += 4;
				}

				if (var17 > var3) { // L: 326
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) { // L: 327
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.tiles[var19][var16][var17] == null) {
						this.tiles[var19][var16][var17] = new Tile(var19, var16, var17); // L: 328
					}
				}

				Tile var22 = this.tiles[var1][var16][var17]; // L: 329
				var22.gameObjects[var22.gameObjectsCount] = var21; // L: 330
				var22.gameObjectEdgeMasks[var22.gameObjectsCount] = var18; // L: 331
				var22.gameObjectsEdgeMask |= var18; // L: 333
				++var22.gameObjectsCount; // L: 334
			}
		}

		if (var11) { // L: 337
			this.tempGameObjects[this.tempGameObjectsCount++] = var21;
		}

		return true; // L: 338
	}

	@ObfuscatedName("o")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 342
			GameObject var2 = this.tempGameObjects[var1]; // L: 343
			this.removeGameObject(var2); // L: 344
			this.tempGameObjects[var1] = null; // L: 345
		}

		this.tempGameObjectsCount = 0; // L: 347
	} // L: 348

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lhs;)V"
	)
	@Export("removeGameObject")
	void removeGameObject(GameObject var1) {
		for (int var2 = var1.startX; var2 <= var1.endX; ++var2) { // L: 351
			for (int var3 = var1.startY; var3 <= var1.endY; ++var3) { // L: 352
				Tile var4 = this.tiles[var1.plane][var2][var3]; // L: 353
				if (var4 != null) { // L: 354
					int var5;
					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 355
						if (var4.gameObjects[var5] == var1) { // L: 356
							--var4.gameObjectsCount; // L: 357

							for (int var6 = var5; var6 < var4.gameObjectsCount; ++var6) { // L: 358
								var4.gameObjects[var6] = var4.gameObjects[var6 + 1]; // L: 359
								var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1]; // L: 360
							}

							var4.gameObjects[var4.gameObjectsCount] = null; // L: 362
							break;
						}
					}

					var4.gameObjectsEdgeMask = 0; // L: 366

					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 367
						var4.gameObjectsEdgeMask |= var4.gameObjectEdgeMasks[var5]; // L: 369
					}
				}
			}
		}

	} // L: 374

	@ObfuscatedName("z")
	public void method4287(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 377
		if (var5 != null) { // L: 378
			DecorativeObject var6 = var5.decorativeObject; // L: 379
			if (var6 != null) { // L: 380
				var6.xOffset = var4 * var6.xOffset / 16; // L: 381
				var6.yOffset = var4 * var6.yOffset / 16; // L: 382
			}
		}
	} // L: 383

	@ObfuscatedName("t")
	@Export("removeWallObject")
	public void removeWallObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 386
		if (var4 != null) {
			var4.wallObject = null; // L: 388
		}
	} // L: 387 389

	@ObfuscatedName("w")
	@Export("removeDecorativeObject")
	public void removeDecorativeObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 392
		if (var4 != null) {
			var4.decorativeObject = null; // L: 394
		}
	} // L: 393 395

	@ObfuscatedName("m")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 398
		if (var4 != null) { // L: 399
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 400
				GameObject var6 = var4.gameObjects[var5]; // L: 401
				if (ScriptFrame.method1135(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 402
					this.removeGameObject(var6); // L: 403
					return; // L: 404
				}
			}

		}
	} // L: 407

	@ObfuscatedName("q")
	@Export("removeGroundObject")
	public void removeGroundObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 410
		if (var4 != null) {
			var4.groundObject = null; // L: 412
		}
	} // L: 411 413

	@ObfuscatedName("i")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 416
		if (var4 != null) {
			var4.itemLayer = null; // L: 418
		}
	} // L: 417 419

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)Lhu;"
	)
	public WallObject method4293(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 422
		return var4 == null ? null : var4.wallObject; // L: 423 424
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)Lhi;"
	)
	public DecorativeObject method4294(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 428
		return var4 == null ? null : var4.decorativeObject; // L: 429 430
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)Lhs;"
	)
	@Export("getGameObject")
	public GameObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 434
		if (var4 == null) { // L: 435
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 436
				GameObject var6 = var4.gameObjects[var5]; // L: 437
				if (ScriptFrame.method1135(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 438
					return var6;
				}
			}

			return null; // L: 440
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Lgn;"
	)
	@Export("getGroundObject")
	public GroundObject getGroundObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 444
		return var4 != null && var4.groundObject != null ? var4.groundObject : null; // L: 445 446
	}

	@ObfuscatedName("aj")
	@Export("getWallObjectTag")
	public long getWallObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 450
		return var4 != null && var4.wallObject != null ? var4.wallObject.tag : 0L; // L: 451 452
	}

	@ObfuscatedName("an")
	@Export("getDecorativeObjectTag")
	public long getDecorativeObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 456
		return var4 != null && var4.decorativeObject != null ? var4.decorativeObject.tag : 0L; // L: 457 458
	}

	@ObfuscatedName("ah")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 462
		if (var4 == null) { // L: 463
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 464
				GameObject var6 = var4.gameObjects[var5]; // L: 465
				if (ScriptFrame.method1135(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 466
					return var6.tag;
				}
			}

			return 0L; // L: 468
		}
	}

	@ObfuscatedName("ao")
	@Export("getGroundObjectTag")
	public long getGroundObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 472
		return var4 != null && var4.groundObject != null ? var4.groundObject.tag : 0L; // L: 473 474
	}

	@ObfuscatedName("ac")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3]; // L: 478
		if (var6 == null) { // L: 479
			return -1;
		} else if (var6.wallObject != null && var6.wallObject.tag == var4) { // L: 480
			return var6.wallObject.flags & 255;
		} else if (var6.decorativeObject != null && var6.decorativeObject.tag == var4) { // L: 481
			return var6.decorativeObject.flags & 255;
		} else if (var6.groundObject != null && var6.groundObject.tag == var4) { // L: 482
			return var6.groundObject.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) { // L: 483
				if (var6.gameObjects[var7].tag == var4) { // L: 484
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1; // L: 486
		}
	}

	@ObfuscatedName("af")
	public void method4302(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) { // L: 490
			for (int var5 = 0; var5 < this.xSize; ++var5) { // L: 491
				for (int var6 = 0; var6 < this.ySize; ++var6) { // L: 492
					Tile var7 = this.tiles[var4][var5][var6]; // L: 493
					if (var7 != null) { // L: 494
						WallObject var8 = var7.wallObject; // L: 495
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) { // L: 496
							ModelData var9 = (ModelData)var8.renderable1; // L: 497
							this.method4434(var9, var4, var5, var6, 1, 1); // L: 498
							if (var8.renderable2 instanceof ModelData) { // L: 499
								var10 = (ModelData)var8.renderable2; // L: 500
								this.method4434(var10, var4, var5, var6, 1, 1); // L: 501
								ModelData.method4078(var9, var10, 0, 0, 0, false); // L: 502
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 503
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3); // L: 505
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) { // L: 507
							GameObject var14 = var7.gameObjects[var12]; // L: 508
							if (var14 != null && var14.renderable instanceof ModelData) { // L: 509
								ModelData var11 = (ModelData)var14.renderable; // L: 510
								this.method4434(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1); // L: 511
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3); // L: 512
							}
						}

						GroundObject var13 = var7.groundObject; // L: 515
						if (var13 != null && var13.renderable instanceof ModelData) { // L: 516
							var10 = (ModelData)var13.renderable; // L: 517
							this.method4398(var10, var4, var5, var6); // L: 518
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 519
						}
					}
				}
			}
		}

	} // L: 525

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgs;III)V"
	)
	void method4398(ModelData var1, int var2, int var3, int var4) {
		Tile var5;
		ModelData var6;
		if (var3 < this.xSize) { // L: 528
			var5 = this.tiles[var2][var3 + 1][var4]; // L: 529
			if (var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) { // L: 530
				var6 = (ModelData)var5.groundObject.renderable; // L: 531
				ModelData.method4078(var1, var6, 128, 0, 0, true); // L: 532
			}
		}

		if (var4 < this.xSize) { // L: 535
			var5 = this.tiles[var2][var3][var4 + 1]; // L: 536
			if (var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) { // L: 537
				var6 = (ModelData)var5.groundObject.renderable; // L: 538
				ModelData.method4078(var1, var6, 0, 0, 128, true); // L: 539
			}
		}

		if (var3 < this.xSize && var4 < this.ySize) { // L: 542
			var5 = this.tiles[var2][var3 + 1][var4 + 1]; // L: 543
			if (var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) { // L: 544
				var6 = (ModelData)var5.groundObject.renderable; // L: 545
				ModelData.method4078(var1, var6, 128, 0, 128, true); // L: 546
			}
		}

		if (var3 < this.xSize && var4 > 0) { // L: 549
			var5 = this.tiles[var2][var3 + 1][var4 - 1]; // L: 550
			if (var5 != null && var5.groundObject != null && var5.groundObject.renderable instanceof ModelData) { // L: 551
				var6 = (ModelData)var5.groundObject.renderable; // L: 552
				ModelData.method4078(var1, var6, 128, 0, -128, true); // L: 553
			}
		}

	} // L: 556

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lgs;IIIII)V"
	)
	void method4434(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 559
		int var8 = var3; // L: 560
		int var9 = var3 + var5; // L: 561
		int var10 = var4 - 1; // L: 562
		int var11 = var4 + var6; // L: 563

		for (int var12 = var2; var12 <= var2 + 1; ++var12) { // L: 564
			if (var12 != this.planes) { // L: 565
				for (int var13 = var8; var13 <= var9; ++var13) { // L: 566
					if (var13 >= 0 && var13 < this.xSize) { // L: 567
						for (int var14 = var10; var14 <= var11; ++var14) { // L: 568
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) { // L: 569 570
								Tile var15 = this.tiles[var12][var13][var14]; // L: 571
								if (var15 != null) { // L: 572
									int var16 = (this.tileHeights[var12][var13 + 1][var14] + this.tileHeights[var12][var13 + 1][var14 + 1] + this.tileHeights[var12][var13][var14] + this.tileHeights[var12][var13][var14 + 1]) / 4 - (this.tileHeights[var2][var3 + 1][var4] + this.tileHeights[var2][var3][var4] + this.tileHeights[var2][var3 + 1][var4 + 1] + this.tileHeights[var2][var3][var4 + 1]) / 4; // L: 573
									WallObject var17 = var15.wallObject; // L: 574
									if (var17 != null) { // L: 575
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) { // L: 576
											var18 = (ModelData)var17.renderable1; // L: 577
											ModelData.method4078(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 578
										}

										if (var17.renderable2 instanceof ModelData) { // L: 580
											var18 = (ModelData)var17.renderable2; // L: 581
											ModelData.method4078(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 582
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) { // L: 585
										GameObject var19 = var15.gameObjects[var23]; // L: 586
										if (var19 != null && var19.renderable instanceof ModelData) { // L: 587
											ModelData var20 = (ModelData)var19.renderable; // L: 588
											int var21 = var19.endX - var19.startX + 1; // L: 589
											int var22 = var19.endY - var19.startY + 1; // L: 590
											ModelData.method4078(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7); // L: 591
										}
									}
								}
							}
						}
					}
				}

				--var8; // L: 596
				var7 = false; // L: 597
			}
		}

	} // L: 599

	@ObfuscatedName("ak")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6]; // L: 602
		if (var7 != null) { // L: 603
			SceneTilePaint var8 = var7.paint; // L: 604
			int var10;
			if (var8 != null) { // L: 605
				int var18 = var8.rgb; // L: 606
				if (var18 != 0) { // L: 607
					for (var10 = 0; var10 < 4; ++var10) { // L: 608
						var1[var2] = var18; // L: 609
						var1[var2 + 1] = var18; // L: 610
						var1[var2 + 2] = var18; // L: 611
						var1[var2 + 3] = var18; // L: 612
						var2 += var3; // L: 613
					}

				}
			} else {
				SceneTileModel var9 = var7.model; // L: 617
				if (var9 != null) { // L: 618
					var10 = var9.shape; // L: 619
					int var11 = var9.rotation; // L: 620
					int var12 = var9.underlayRgb; // L: 621
					int var13 = var9.overlayRgb; // L: 622
					int[] var14 = this.tileShape2D[var10]; // L: 623
					int[] var15 = this.tileRotation2D[var11]; // L: 624
					int var16 = 0; // L: 625
					int var17;
					if (var12 != 0) { // L: 626
						for (var17 = 0; var17 < 4; ++var17) { // L: 627
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 628
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 629
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 630
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 631
							var2 += var3; // L: 632
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) { // L: 636
							if (var14[var15[var16++]] != 0) { // L: 637
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 638
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 639
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 640
								var1[var2 + 3] = var13;
							}

							var2 += var3; // L: 641
						}
					}

				}
			}
		}
	} // L: 615 644

	@ObfuscatedName("as")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!shouldSendWalk() || var4) { // L: 723
			checkClick = true; // L: 724
			viewportWalking = var4; // L: 725
			Scene_selectedPlane = var1; // L: 726
			Scene_selectedScreenX = var2; // L: 727
			Scene_selectedScreenY = var3; // L: 728
			Scene_selectedX = -1; // L: 729
			Scene_selectedY = -1; // L: 730
		}
	} // L: 731

	@ObfuscatedName("aq")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		viewportWalking = true; // L: 734
	} // L: 735

	@ObfuscatedName("am")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) { // L: 747
			var1 = 0;
		} else if (var1 >= this.xSize * 128) { // L: 748
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) { // L: 749
			var3 = 0;
		} else if (var3 >= this.ySize * 128) { // L: 750
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) { // L: 751
			var4 = 128;
		} else if (var4 > 383) { // L: 752
			var4 = 383;
		}

		++Scene_drawnCount; // L: 753
		Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 754
		Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 755
		Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5]; // L: 756
		Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5]; // L: 757
		visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64]; // L: 758
		Scene_cameraX = var1; // L: 759
		Scene_cameraY = var2; // L: 760
		Scene_cameraZ = var3; // L: 761
		Scene_cameraXTile = var1 / 128; // L: 762
		Scene_cameraYTile = var3 / 128; // L: 763
		Scene_plane = var6; // L: 764
		Scene_cameraXTileMin = Scene_cameraXTile - 25; // L: 765
		if (Scene_cameraXTileMin < 0) { // L: 766
			Scene_cameraXTileMin = 0;
		}

		Scene_cameraYTileMin = Scene_cameraYTile - 25; // L: 767
		if (Scene_cameraYTileMin < 0) { // L: 768
			Scene_cameraYTileMin = 0;
		}

		Scene_cameraXTileMax = Scene_cameraXTile + 25; // L: 769
		if (Scene_cameraXTileMax > this.xSize) { // L: 770
			Scene_cameraXTileMax = this.xSize;
		}

		Scene_cameraYTileMax = Scene_cameraYTile + 25; // L: 771
		if (Scene_cameraYTileMax > this.ySize) { // L: 772
			Scene_cameraYTileMax = this.ySize;
		}

		this.occlude(); // L: 773
		tileUpdateCount = 0; // L: 774

		int var7;
		Tile[][] var8;
		int var9;
		int var10;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 775
			var8 = this.tiles[var7]; // L: 776

			for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) { // L: 777
				for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) { // L: 778
					Tile var16 = var8[var9][var10]; // L: 779
					if (var16 != null) { // L: 780
						if (var16.minPlane <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) { // L: 781
							var16.drawPrimary = true; // L: 787
							var16.drawSecondary = true; // L: 788
							if (var16.gameObjectsCount > 0) {
								var16.drawGameObjects = true; // L: 789
							} else {
								var16.drawGameObjects = false; // L: 790
							}

							++tileUpdateCount; // L: 791
						} else {
							var16.drawPrimary = false; // L: 782
							var16.drawSecondary = false; // L: 783
							var16.drawGameObjectEdges = 0; // L: 784
						}
					}
				}
			}
		}

		int var11;
		int var12;
		int var13;
		int var14;
		Tile var15;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 797
			var8 = this.tiles[var7]; // L: 798

			for (var9 = -25; var9 <= 0; ++var9) { // L: 799
				var10 = var9 + Scene_cameraXTile; // L: 800
				var11 = Scene_cameraXTile - var9; // L: 801
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 802
					for (var12 = -25; var12 <= 0; ++var12) { // L: 803
						var13 = var12 + Scene_cameraYTile; // L: 804
						var14 = Scene_cameraYTile - var12; // L: 805
						if (var10 >= Scene_cameraXTileMin) { // L: 806
							if (var13 >= Scene_cameraYTileMin) { // L: 807
								var15 = var8[var10][var13]; // L: 808
								if (var15 != null && var15.drawPrimary) { // L: 809
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 811
								var15 = var8[var10][var14]; // L: 812
								if (var15 != null && var15.drawPrimary) { // L: 813
									this.drawTile(var15, true);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 816
							if (var13 >= Scene_cameraYTileMin) { // L: 817
								var15 = var8[var11][var13]; // L: 818
								if (var15 != null && var15.drawPrimary) { // L: 819
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 821
								var15 = var8[var11][var14]; // L: 822
								if (var15 != null && var15.drawPrimary) { // L: 823
									this.drawTile(var15, true);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 826
							checkClick = false; // L: 827
							return; // L: 828
						}
					}
				}
			}
		}

		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 834
			var8 = this.tiles[var7]; // L: 835

			for (var9 = -25; var9 <= 0; ++var9) { // L: 836
				var10 = var9 + Scene_cameraXTile; // L: 837
				var11 = Scene_cameraXTile - var9; // L: 838
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 839
					for (var12 = -25; var12 <= 0; ++var12) { // L: 840
						var13 = var12 + Scene_cameraYTile; // L: 841
						var14 = Scene_cameraYTile - var12; // L: 842
						if (var10 >= Scene_cameraXTileMin) { // L: 843
							if (var13 >= Scene_cameraYTileMin) { // L: 844
								var15 = var8[var10][var13]; // L: 845
								if (var15 != null && var15.drawPrimary) { // L: 846
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 848
								var15 = var8[var10][var14]; // L: 849
								if (var15 != null && var15.drawPrimary) { // L: 850
									this.drawTile(var15, false);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 853
							if (var13 >= Scene_cameraYTileMin) { // L: 854
								var15 = var8[var11][var13]; // L: 855
								if (var15 != null && var15.drawPrimary) { // L: 856
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 858
								var15 = var8[var11][var14]; // L: 859
								if (var15 != null && var15.drawPrimary) { // L: 860
									this.drawTile(var15, false);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 863
							checkClick = false; // L: 864
							return; // L: 865
						}
					}
				}
			}
		}

		checkClick = false; // L: 871
	} // L: 872

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhp;Z)V"
	)
	@Export("drawTile")
	void drawTile(Tile var1, boolean var2) {
		Scene_tilesDeque.addFirst(var1); // L: 875

		while (true) {
			Tile var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Tile[][] var8;
			Tile var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										WallObject var10;
										GameObject var12;
										int var17;
										int var18;
										boolean var20;
										int var21;
										Tile var36;
										while (true) {
											do {
												var3 = (Tile)Scene_tilesDeque.removeLast(); // L: 877
												if (var3 == null) { // L: 878
													return;
												}
											} while(!var3.drawSecondary); // L: 879

											var4 = var3.x; // L: 880
											var5 = var3.y; // L: 881
											var6 = var3.plane; // L: 882
											var7 = var3.originalPlane; // L: 883
											var8 = this.tiles[var6]; // L: 884
											if (!var3.drawPrimary) { // L: 885
												break;
											}

											if (var2) { // L: 886
												if (var6 > 0) { // L: 887
													var9 = this.tiles[var6 - 1][var4][var5]; // L: 888
													if (var9 != null && var9.drawSecondary) { // L: 889
														continue;
													}
												}

												if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) { // L: 891
													var9 = var8[var4 - 1][var5]; // L: 892
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 1) == 0)) { // L: 893
														continue;
													}
												}

												if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) { // L: 895
													var9 = var8[var4 + 1][var5]; // L: 896
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 4) == 0)) { // L: 897
														continue;
													}
												}

												if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) { // L: 899
													var9 = var8[var4][var5 - 1]; // L: 900
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 8) == 0)) { // L: 901
														continue;
													}
												}

												if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) { // L: 903
													var9 = var8[var4][var5 + 1]; // L: 904
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 2) == 0)) { // L: 905
														continue;
													}
												}
											} else {
												var2 = true; // L: 908
											}

											var3.drawPrimary = false; // L: 909
											if (var3.linkedBelowTile != null) { // L: 910
												var9 = var3.linkedBelowTile; // L: 911
												if (var9.paint != null) { // L: 912
													if (!this.method4350(0, var4, var5)) { // L: 913
														this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												} else if (var9.model != null && !this.method4350(0, var4, var5)) { // L: 915 916
													this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
												}

												var10 = var9.wallObject; // L: 918
												if (var10 != null) { // L: 919
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * 4096 - Scene_cameraX, var10.z - Scene_cameraY, var10.y * 4096 - Scene_cameraZ, var10.tag);
												}

												for (var11 = 0; var11 < var9.gameObjectsCount; ++var11) { // L: 920
													var12 = var9.gameObjects[var11]; // L: 921
													if (var12 != null) { // L: 922
														var12.renderable.draw(var12.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX - Scene_cameraX, var12.z - Scene_cameraY, var12.centerY - Scene_cameraZ, var12.tag);
													}
												}
											}

											var20 = false; // L: 925
											if (var3.paint != null) { // L: 926
												if (!this.method4350(var7, var4, var5)) { // L: 927
													var20 = true; // L: 928
													if (var3.paint.neColor != 12345678 || checkClick && var6 <= Scene_selectedPlane) { // L: 929
														this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												}
											} else if (var3.model != null && !this.method4350(var7, var4, var5)) { // L: 932 933
												var20 = true; // L: 934
												this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5); // L: 935
											}

											var21 = 0; // L: 938
											var11 = 0; // L: 939
											WallObject var31 = var3.wallObject; // L: 940
											DecorativeObject var13 = var3.decorativeObject; // L: 941
											if (var31 != null || var13 != null) { // L: 942
												if (var4 == Scene_cameraXTile) { // L: 943
													++var21;
												} else if (Scene_cameraXTile < var4) { // L: 944
													var21 += 2;
												}

												if (var5 == Scene_cameraYTile) { // L: 945
													var21 += 3;
												} else if (Scene_cameraYTile > var5) { // L: 946
													var21 += 6;
												}

												var11 = field2498[var21]; // L: 947
												var3.field2410 = field2500[var21]; // L: 948
											}

											if (var31 != null) { // L: 950
												if ((var31.orientationA & field2505[var21]) != 0) { // L: 951
													if (var31.orientationA == 16) { // L: 952
														var3.drawGameObjectEdges = 3; // L: 953
														var3.field2405 = field2501[var21]; // L: 954
														var3.field2399 = 3 - var3.field2405; // L: 955
													} else if (var31.orientationA == 32) { // L: 957
														var3.drawGameObjectEdges = 6; // L: 958
														var3.field2405 = field2502[var21]; // L: 959
														var3.field2399 = 6 - var3.field2405; // L: 960
													} else if (var31.orientationA == 64) { // L: 962
														var3.drawGameObjectEdges = 12; // L: 963
														var3.field2405 = field2503[var21]; // L: 964
														var3.field2399 = 12 - var3.field2405; // L: 965
													} else {
														var3.drawGameObjectEdges = 9; // L: 968
														var3.field2405 = field2497[var21]; // L: 969
														var3.field2399 = 9 - var3.field2405; // L: 970
													}
												} else {
													var3.drawGameObjectEdges = 0; // L: 973
												}

												if ((var31.orientationA & var11) != 0 && !this.method4444(var7, var4, var5, var31.orientationA)) { // L: 974
													var31.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * 4096 - Scene_cameraX, var31.z - Scene_cameraY, var31.y * 4096 - Scene_cameraZ, var31.tag);
												}

												if ((var31.orientationB & var11) != 0 && !this.method4444(var7, var4, var5, var31.orientationB)) { // L: 975
													var31.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * 4096 - Scene_cameraX, var31.z - Scene_cameraY, var31.y * 4096 - Scene_cameraZ, var31.tag);
												}
											}

											if (var13 != null && !this.method4394(var7, var4, var5, var13.renderable1.height)) { // L: 977
												if ((var13.orientation & var11) != 0) { // L: 978
													var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.xOffset + (var13.x * 4096 - Scene_cameraX), var13.z - Scene_cameraY, var13.yOffset + (var13.y * 4096 - Scene_cameraZ), var13.tag); // L: 979
												} else if (var13.orientation == 256) { // L: 981
													var14 = var13.x * 4096 - Scene_cameraX; // L: 982
													var15 = var13.z - Scene_cameraY; // L: 983
													var16 = var13.y * 4096 - Scene_cameraZ; // L: 984
													var17 = var13.orientation2; // L: 985
													if (var17 != 1 && var17 != 2) { // L: 987
														var18 = var14; // L: 988
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) { // L: 990
														var19 = var16; // L: 991
													} else {
														var19 = -var16;
													}

													if (var19 < var18) { // L: 992
														var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset, var15, var16 + var13.yOffset, var13.tag); // L: 993
													} else if (var13.renderable2 != null) { // L: 995
														var13.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag); // L: 996
													}
												}
											}

											if (var20) { // L: 1000
												GroundObject var22 = var3.groundObject; // L: 1001
												if (var22 != null) { // L: 1002
													var22.renderable.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var22.x * 4096 - Scene_cameraX, var22.z - Scene_cameraY, var22.y * 4096 - Scene_cameraZ, var22.tag);
												}

												ItemLayer var23 = var3.itemLayer; // L: 1003
												if (var23 != null && var23.height == 0) { // L: 1004
													if (var23.second != null) { // L: 1005
														var23.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 64 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}

													if (var23.third != null) { // L: 1006
														var23.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 64 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}

													if (var23.first != null) { // L: 1007
														var23.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 64 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}
												}
											}

											var14 = var3.gameObjectsEdgeMask; // L: 1010
											if (var14 != 0) { // L: 1011
												if (var4 < Scene_cameraXTile && (var14 & 4) != 0) { // L: 1012
													var36 = var8[var4 + 1][var5]; // L: 1013
													if (var36 != null && var36.drawSecondary) { // L: 1014
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 < Scene_cameraYTile && (var14 & 2) != 0) { // L: 1016
													var36 = var8[var4][var5 + 1]; // L: 1017
													if (var36 != null && var36.drawSecondary) { // L: 1018
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var4 > Scene_cameraXTile && (var14 & 1) != 0) { // L: 1020
													var36 = var8[var4 - 1][var5]; // L: 1021
													if (var36 != null && var36.drawSecondary) { // L: 1022
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > Scene_cameraYTile && (var14 & 8) != 0) { // L: 1024
													var36 = var8[var4][var5 - 1]; // L: 1025
													if (var36 != null && var36.drawSecondary) { // L: 1026
														Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var3.drawGameObjectEdges != 0) { // L: 1030
											var20 = true; // L: 1031

											for (var21 = 0; var21 < var3.gameObjectsCount; ++var21) { // L: 1032
												if (var3.gameObjects[var21].lastDrawn != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.drawGameObjectEdges) == var3.field2405) { // L: 1033
													var20 = false; // L: 1034
													break; // L: 1035
												}
											}

											if (var20) { // L: 1038
												var10 = var3.wallObject; // L: 1039
												if (!this.method4444(var7, var4, var5, var10.orientationA)) { // L: 1040
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * 4096 - Scene_cameraX, var10.z - Scene_cameraY, var10.y * 4096 - Scene_cameraZ, var10.tag);
												}

												var3.drawGameObjectEdges = 0; // L: 1041
											}
										}

										if (!var3.drawGameObjects) { // L: 1044
											break;
										}

										try {
											int var34 = var3.gameObjectsCount; // L: 1046
											var3.drawGameObjects = false; // L: 1047
											var21 = 0; // L: 1048

											label563:
											for (var11 = 0; var11 < var34; ++var11) { // L: 1049
												var12 = var3.gameObjects[var11]; // L: 1050
												if (var12.lastDrawn != Scene_drawnCount) { // L: 1051
													for (var24 = var12.startX; var24 <= var12.endX; ++var24) { // L: 1052
														for (var14 = var12.startY; var14 <= var12.endY; ++var14) { // L: 1053
															var36 = var8[var24][var14]; // L: 1054
															if (var36.drawPrimary) { // L: 1055
																var3.drawGameObjects = true; // L: 1056
																continue label563; // L: 1057
															}

															if (var36.drawGameObjectEdges != 0) { // L: 1059
																var16 = 0; // L: 1060
																if (var24 > var12.startX) { // L: 1061
																	++var16;
																}

																if (var24 < var12.endX) { // L: 1062
																	var16 += 4;
																}

																if (var14 > var12.startY) { // L: 1063
																	var16 += 8;
																}

																if (var14 < var12.endY) { // L: 1064
																	var16 += 2;
																}

																if ((var16 & var36.drawGameObjectEdges) == var3.field2399) { // L: 1065
																	var3.drawGameObjects = true; // L: 1066
																	continue label563; // L: 1067
																}
															}
														}
													}

													gameObjects[var21++] = var12; // L: 1072
													var24 = Scene_cameraXTile - var12.startX; // L: 1073
													var14 = var12.endX - Scene_cameraXTile; // L: 1074
													if (var14 > var24) { // L: 1075
														var24 = var14;
													}

													var15 = Scene_cameraYTile - var12.startY; // L: 1076
													var16 = var12.endY - Scene_cameraYTile; // L: 1077
													if (var16 > var15) { // L: 1078
														var12.field2737 = var24 + var16;
													} else {
														var12.field2737 = var24 + var15; // L: 1079
													}
												}
											}

											while (var21 > 0) { // L: 1082
												var11 = -50; // L: 1083
												var25 = -1; // L: 1084

												for (var24 = 0; var24 < var21; ++var24) { // L: 1085
													GameObject var35 = gameObjects[var24]; // L: 1086
													if (var35.lastDrawn != Scene_drawnCount) { // L: 1087
														if (var35.field2737 > var11) { // L: 1088
															var11 = var35.field2737; // L: 1089
															var25 = var24; // L: 1090
														} else if (var11 == var35.field2737) { // L: 1092
															var15 = var35.centerX - Scene_cameraX; // L: 1093
															var16 = var35.centerY - Scene_cameraZ; // L: 1094
															var17 = gameObjects[var25].centerX - Scene_cameraX; // L: 1095
															var18 = gameObjects[var25].centerY - Scene_cameraZ; // L: 1096
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) { // L: 1097
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) { // L: 1101
													break;
												}

												GameObject var33 = gameObjects[var25]; // L: 1102
												var33.lastDrawn = Scene_drawnCount; // L: 1103
												if (!this.method4322(var7, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) { // L: 1104
													var33.renderable.draw(var33.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX - Scene_cameraX, var33.z - Scene_cameraY, var33.centerY - Scene_cameraZ, var33.tag); // L: 1105
												}

												for (var14 = var33.startX; var14 <= var33.endX; ++var14) { // L: 1107
													for (var15 = var33.startY; var15 <= var33.endY; ++var15) { // L: 1108
														Tile var26 = var8[var14][var15]; // L: 1109
														if (var26.drawGameObjectEdges != 0) { // L: 1110
															Scene_tilesDeque.addFirst(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.drawSecondary) { // L: 1111
															Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var3.drawGameObjects) { // L: 1115
												break;
											}
										} catch (Exception var28) { // L: 1117
											var3.drawGameObjects = false; // L: 1118
											break;
										}
									}
								} while(!var3.drawSecondary); // L: 1121
							} while(var3.drawGameObjectEdges != 0); // L: 1122

							if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) { // L: 1123
								break;
							}

							var9 = var8[var4 - 1][var5]; // L: 1124
						} while(var9 != null && var9.drawSecondary); // L: 1125

						if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) { // L: 1127
							break;
						}

						var9 = var8[var4 + 1][var5]; // L: 1128
					} while(var9 != null && var9.drawSecondary); // L: 1129

					if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) { // L: 1131
						break;
					}

					var9 = var8[var4][var5 - 1]; // L: 1132
				} while(var9 != null && var9.drawSecondary); // L: 1133

				if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) { // L: 1135
					break;
				}

				var9 = var8[var4][var5 + 1]; // L: 1136
			} while(var9 != null && var9.drawSecondary); // L: 1137

			var3.drawSecondary = false; // L: 1139
			--tileUpdateCount; // L: 1140
			ItemLayer var32 = var3.itemLayer; // L: 1141
			if (var32 != null && var32.height != 0) { // L: 1142
				if (var32.second != null) { // L: 1143
					var32.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 64 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}

				if (var32.third != null) { // L: 1144
					var32.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 64 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}

				if (var32.first != null) { // L: 1145
					var32.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 64 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}
			}

			if (var3.field2410 != 0) { // L: 1147
				DecorativeObject var29 = var3.decorativeObject; // L: 1148
				if (var29 != null && !this.method4394(var7, var4, var5, var29.renderable1.height)) { // L: 1149
					if ((var29.orientation & var3.field2410) != 0) { // L: 1150
						var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.xOffset + (var29.x * 4096 - Scene_cameraX), var29.z - Scene_cameraY, var29.yOffset + (var29.y * 4096 - Scene_cameraZ), var29.tag); // L: 1151
					} else if (var29.orientation == 256) { // L: 1153
						var11 = var29.x * 4096 - Scene_cameraX; // L: 1154
						var25 = var29.z - Scene_cameraY; // L: 1155
						var24 = var29.y * 4096 - Scene_cameraZ; // L: 1156
						var14 = var29.orientation2; // L: 1157
						if (var14 != 1 && var14 != 2) { // L: 1159
							var15 = var11; // L: 1160
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) { // L: 1162
							var16 = var24; // L: 1163
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) { // L: 1164
							var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var29.xOffset, var25, var24 + var29.yOffset, var29.tag); // L: 1165
						} else if (var29.renderable2 != null) { // L: 1167
							var29.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var25, var24, var29.tag); // L: 1168
						}
					}
				}

				WallObject var27 = var3.wallObject; // L: 1172
				if (var27 != null) { // L: 1173
					if ((var27.orientationB & var3.field2410) != 0 && !this.method4444(var7, var4, var5, var27.orientationB)) { // L: 1174
						var27.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 4096 - Scene_cameraX, var27.z - Scene_cameraY, var27.y * 4096 - Scene_cameraZ, var27.tag);
					}

					if ((var27.orientationA & var3.field2410) != 0 && !this.method4444(var7, var4, var5, var27.orientationA)) { // L: 1175
						var27.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 4096 - Scene_cameraX, var27.z - Scene_cameraY, var27.y * 4096 - Scene_cameraZ, var27.tag);
					}
				}
			}

			Tile var30;
			if (var6 < this.planes - 1) { // L: 1178
				var30 = this.tiles[var6 + 1][var4][var5]; // L: 1179
				if (var30 != null && var30.drawSecondary) { // L: 1180
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 < Scene_cameraXTile) { // L: 1182
				var30 = var8[var4 + 1][var5]; // L: 1183
				if (var30 != null && var30.drawSecondary) { // L: 1184
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < Scene_cameraYTile) { // L: 1186
				var30 = var8[var4][var5 + 1]; // L: 1187
				if (var30 != null && var30.drawSecondary) { // L: 1188
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 > Scene_cameraXTile) { // L: 1190
				var30 = var8[var4 - 1][var5]; // L: 1191
				if (var30 != null && var30.drawSecondary) { // L: 1192
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > Scene_cameraYTile) { // L: 1194
				var30 = var8[var4][var5 - 1]; // L: 1195
				if (var30 != null && var30.drawSecondary) { // L: 1196
					Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lhr;IIIIIII)V"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - Scene_cameraX; // L: 1204
		int var11;
		int var12 = var11 = (var8 << 7) - Scene_cameraZ; // L: 1206
		int var13;
		int var14 = var13 = var10 + 128; // L: 1208
		int var15;
		int var16 = var15 = var12 + 128; // L: 1210
		int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY; // L: 1211
		int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY; // L: 1212
		int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY; // L: 1213
		int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY; // L: 1214
		int var21 = var10 * var6 + var5 * var12 >> 16; // L: 1215
		var12 = var12 * var6 - var5 * var10 >> 16; // L: 1216
		var10 = var21; // L: 1217
		var21 = var17 * var4 - var3 * var12 >> 16; // L: 1218
		var12 = var3 * var17 + var12 * var4 >> 16; // L: 1219
		var17 = var21; // L: 1220
		if (var12 >= 50) { // L: 1221
			var21 = var14 * var6 + var5 * var11 >> 16; // L: 1222
			var11 = var11 * var6 - var5 * var14 >> 16; // L: 1223
			var14 = var21; // L: 1224
			var21 = var18 * var4 - var3 * var11 >> 16; // L: 1225
			var11 = var3 * var18 + var11 * var4 >> 16; // L: 1226
			var18 = var21; // L: 1227
			if (var11 >= 50) { // L: 1228
				var21 = var13 * var6 + var5 * var16 >> 16; // L: 1229
				var16 = var16 * var6 - var5 * var13 >> 16; // L: 1230
				var13 = var21; // L: 1231
				var21 = var19 * var4 - var3 * var16 >> 16; // L: 1232
				var16 = var3 * var19 + var16 * var4 >> 16; // L: 1233
				var19 = var21; // L: 1234
				if (var16 >= 50) { // L: 1235
					var21 = var9 * var6 + var5 * var15 >> 16; // L: 1236
					var15 = var15 * var6 - var5 * var9 >> 16; // L: 1237
					var9 = var21; // L: 1238
					var21 = var20 * var4 - var3 * var15 >> 16; // L: 1239
					var15 = var3 * var20 + var15 * var4 >> 16; // L: 1240
					if (var15 >= 50) { // L: 1242
						int var22 = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1243
						int var23 = var17 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1244
						int var24 = var14 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1245
						int var25 = var18 * Rasterizer3D.Rasterizer3D_zoom / var11 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1246
						int var26 = var13 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1247
						int var27 = var19 * Rasterizer3D.Rasterizer3D_zoom / var16 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1248
						int var28 = var9 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1249
						int var29 = var21 * Rasterizer3D.Rasterizer3D_zoom / var15 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1250
						Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1251
						int var30;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) { // L: 1252
							Rasterizer3D.field2420 = false; // L: 1253
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1254
								Rasterizer3D.field2420 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) { // L: 1255
								Scene_selectedX = var7; // L: 1256
								Scene_selectedY = var8; // L: 1257
							}

							if (var1.texture == -1) { // L: 1259
								if (var1.neColor != 12345678) { // L: 1260
									Rasterizer3D.method4158(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1262
								if (var1.isFlat) { // L: 1263
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
								} else {
									Rasterizer3D.drawTexturedTile(var27, var29, var25, var26, var28, var24, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture); // L: 1264
								}
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1267
								Rasterizer3D.method4158(var27, var29, var25, var26, var28, var24, method4316(var30, var1.neColor), method4316(var30, var1.nwColor), method4316(var30, var1.seColor)); // L: 1268
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) { // L: 1271
							Rasterizer3D.field2420 = false; // L: 1272
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Rasterizer3D.Rasterizer3D_clipWidth || var24 > Rasterizer3D.Rasterizer3D_clipWidth || var28 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1273
								Rasterizer3D.field2420 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) { // L: 1274
								Scene_selectedX = var7; // L: 1275
								Scene_selectedY = var8; // L: 1276
							}

							if (var1.texture == -1) { // L: 1278
								if (var1.swColor != 12345678) { // L: 1279
									Rasterizer3D.method4158(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1281
								Rasterizer3D.drawTexturedTile(var23, var25, var29, var22, var24, var28, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture); // L: 1282
							} else {
								var30 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1285
								Rasterizer3D.method4158(var23, var25, var29, var22, var24, var28, method4316(var30, var1.swColor), method4316(var30, var1.seColor), method4316(var30, var1.nwColor)); // L: 1286
							}
						}

					}
				}
			}
		}
	} // L: 1289

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lhc;IIIIII)V"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length; // L: 1292

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) { // L: 1293
			var10 = var1.vertexX[var9] - Scene_cameraX; // L: 1294
			var11 = var1.vertexY[var9] - Scene_cameraY; // L: 1295
			var12 = var1.vertexZ[var9] - Scene_cameraZ; // L: 1296
			var13 = var12 * var4 + var5 * var10 >> 16; // L: 1297
			var12 = var5 * var12 - var10 * var4 >> 16; // L: 1298
			var10 = var13; // L: 1299
			var13 = var3 * var11 - var12 * var2 >> 16; // L: 1300
			var12 = var11 * var2 + var3 * var12 >> 16; // L: 1301
			if (var12 < 50) { // L: 1303
				return;
			}

			if (var1.triangleTextureId != null) { // L: 1304
				SceneTileModel.field2583[var9] = var10; // L: 1305
				SceneTileModel.field2566[var9] = var13; // L: 1306
				SceneTileModel.field2571[var9] = var12; // L: 1307
			}

			SceneTileModel.field2577[var9] = var10 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidX; // L: 1309
			SceneTileModel.field2582[var9] = var13 * Rasterizer3D.Rasterizer3D_zoom / var12 + Rasterizer3D.Rasterizer3D_clipMidY; // L: 1310
		}

		Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1312
		var8 = var1.faceX.length; // L: 1313

		for (var9 = 0; var9 < var8; ++var9) { // L: 1314
			var10 = var1.faceX[var9]; // L: 1315
			var11 = var1.faceY[var9]; // L: 1316
			var12 = var1.faceZ[var9]; // L: 1317
			var13 = SceneTileModel.field2577[var10]; // L: 1318
			int var14 = SceneTileModel.field2577[var11]; // L: 1319
			int var15 = SceneTileModel.field2577[var12]; // L: 1320
			int var16 = SceneTileModel.field2582[var10]; // L: 1321
			int var17 = SceneTileModel.field2582[var11]; // L: 1322
			int var18 = SceneTileModel.field2582[var12]; // L: 1323
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) { // L: 1324
				Rasterizer3D.field2420 = false; // L: 1325
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > Rasterizer3D.Rasterizer3D_clipWidth || var14 > Rasterizer3D.Rasterizer3D_clipWidth || var15 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1326
					Rasterizer3D.field2420 = true;
				}

				if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) { // L: 1327
					Scene_selectedX = var6; // L: 1328
					Scene_selectedY = var7; // L: 1329
				}

				if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) { // L: 1331
					if (!Scene_isLowDetail) { // L: 1335
						if (var1.isFlat) { // L: 1336
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2583[0], SceneTileModel.field2583[1], SceneTileModel.field2583[3], SceneTileModel.field2566[0], SceneTileModel.field2566[1], SceneTileModel.field2566[3], SceneTileModel.field2571[0], SceneTileModel.field2571[1], SceneTileModel.field2571[3], var1.triangleTextureId[var9]);
						} else {
							Rasterizer3D.drawTexturedTile(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2583[var10], SceneTileModel.field2583[var11], SceneTileModel.field2583[var12], SceneTileModel.field2566[var10], SceneTileModel.field2566[var11], SceneTileModel.field2566[var12], SceneTileModel.field2571[var10], SceneTileModel.field2571[var11], SceneTileModel.field2571[var12], var1.triangleTextureId[var9]); // L: 1337
						}
					} else {
						int var19 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.triangleTextureId[var9]); // L: 1340
						Rasterizer3D.method4158(var16, var17, var18, var13, var14, var15, method4316(var19, var1.triangleColorA[var9]), method4316(var19, var1.triangleColorB[var9]), method4316(var19, var1.triangleColorC[var9])); // L: 1341
					}
				} else if (var1.triangleColorA[var9] != 12345678) { // L: 1332
					Rasterizer3D.method4158(var16, var17, var18, var13, var14, var15, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
				}
			}
		}

	} // L: 1346

	@ObfuscatedName("at")
	@Export("occlude")
	void occlude() {
		int var1 = Scene_planeOccluderCounts[Scene_plane]; // L: 1373
		Occluder[] var2 = Scene_planeOccluders[Scene_plane]; // L: 1374
		Scene_currentOccludersCount = 0; // L: 1375

		for (int var3 = 0; var3 < var1; ++var3) { // L: 1376
			Occluder var4 = var2[var3]; // L: 1377
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) { // L: 1378
				var5 = var4.minTileX - Scene_cameraXTile + 25; // L: 1379
				if (var5 >= 0 && var5 <= 50) { // L: 1380
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1381
					if (var6 < 0) { // L: 1382
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1383
					if (var7 > 50) { // L: 1384
						var7 = 50;
					}

					var13 = false; // L: 1385

					while (var6 <= var7) { // L: 1386
						if (visibleTiles[var5][var6++]) { // L: 1387
							var13 = true; // L: 1388
							break;
						}
					}

					if (var13) { // L: 1392
						var9 = Scene_cameraX - var4.minX; // L: 1393
						if (var9 > 32) { // L: 1394
							var4.field2546 = 1;
						} else {
							if (var9 >= -32) { // L: 1395
								continue;
							}

							var4.field2546 = 2; // L: 1396
							var9 = -var9; // L: 1397
						}

						var4.field2551 = (var4.minZ - Scene_cameraZ << 8) / var9; // L: 1400
						var4.field2552 = (var4.maxZ - Scene_cameraZ << 8) / var9; // L: 1401
						var4.field2554 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1402
						var4.field2550 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1403
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1404
					}
				}
			} else if (var4.type == 2) { // L: 1407
				var5 = var4.minTileY - Scene_cameraYTile + 25; // L: 1408
				if (var5 >= 0 && var5 <= 50) { // L: 1409
					var6 = var4.minTileX - Scene_cameraXTile + 25; // L: 1410
					if (var6 < 0) { // L: 1411
						var6 = 0;
					}

					var7 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1412
					if (var7 > 50) { // L: 1413
						var7 = 50;
					}

					var13 = false; // L: 1414

					while (var6 <= var7) { // L: 1415
						if (visibleTiles[var6++][var5]) { // L: 1416
							var13 = true; // L: 1417
							break;
						}
					}

					if (var13) { // L: 1421
						var9 = Scene_cameraZ - var4.minZ; // L: 1422
						if (var9 > 32) { // L: 1423
							var4.field2546 = 3;
						} else {
							if (var9 >= -32) { // L: 1424
								continue;
							}

							var4.field2546 = 4; // L: 1425
							var9 = -var9; // L: 1426
						}

						var4.field2549 = (var4.minX - Scene_cameraX << 8) / var9; // L: 1429
						var4.field2544 = (var4.maxX - Scene_cameraX << 8) / var9; // L: 1430
						var4.field2554 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1431
						var4.field2550 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1432
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1433
					}
				}
			} else if (var4.type == 4) { // L: 1436
				var5 = var4.minY - Scene_cameraY; // L: 1437
				if (var5 > 128) { // L: 1438
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1439
					if (var6 < 0) { // L: 1440
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1441
					if (var7 > 50) { // L: 1442
						var7 = 50;
					}

					if (var6 <= var7) { // L: 1443
						int var8 = var4.minTileX - Scene_cameraXTile + 25; // L: 1444
						if (var8 < 0) { // L: 1445
							var8 = 0;
						}

						var9 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1446
						if (var9 > 50) { // L: 1447
							var9 = 50;
						}

						boolean var10 = false; // L: 1448

						label149:
						for (int var11 = var8; var11 <= var9; ++var11) { // L: 1449
							for (int var12 = var6; var12 <= var7; ++var12) { // L: 1450
								if (visibleTiles[var11][var12]) { // L: 1451
									var10 = true; // L: 1452
									break label149;
								}
							}
						}

						if (var10) { // L: 1457
							var4.field2546 = 5; // L: 1458
							var4.field2549 = (var4.minX - Scene_cameraX << 8) / var5; // L: 1459
							var4.field2544 = (var4.maxX - Scene_cameraX << 8) / var5; // L: 1460
							var4.field2551 = (var4.minZ - Scene_cameraZ << 8) / var5; // L: 1461
							var4.field2552 = (var4.maxZ - Scene_cameraZ << 8) / var5; // L: 1462
							Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1463
						}
					}
				}
			}
		}

	} // L: 1467

	@ObfuscatedName("ar")
	boolean method4350(int var1, int var2, int var3) {
		int var4 = this.field2461[var1][var2][var3]; // L: 1470
		if (var4 == -Scene_drawnCount) { // L: 1471
			return false;
		} else if (var4 == Scene_drawnCount) { // L: 1472
			return true;
		} else {
			int var5 = var2 << 7; // L: 1473
			int var6 = var3 << 7; // L: 1474
			if (this.method4323(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method4323(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method4323(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4323(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) { // L: 1475
				this.field2461[var1][var2][var3] = Scene_drawnCount; // L: 1476
				return true; // L: 1477
			} else {
				this.field2461[var1][var2][var3] = -Scene_drawnCount; // L: 1480
				return false; // L: 1481
			}
		}
	}

	@ObfuscatedName("ay")
	boolean method4444(int var1, int var2, int var3, int var4) {
		if (!this.method4350(var1, var2, var3)) { // L: 1486
			return false;
		} else {
			int var5 = var2 << 7; // L: 1487
			int var6 = var3 << 7; // L: 1488
			int var7 = this.tileHeights[var1][var2][var3] - 1; // L: 1489
			int var8 = var7 - 120; // L: 1490
			int var9 = var7 - 230; // L: 1491
			int var10 = var7 - 238; // L: 1492
			if (var4 < 16) { // L: 1493
				if (var4 == 1) { // L: 1494
					if (var5 > Scene_cameraX) { // L: 1495
						if (!this.method4323(var5, var7, var6)) { // L: 1496
							return false;
						}

						if (!this.method4323(var5, var7, var6 + 128)) { // L: 1497
							return false;
						}
					}

					if (var1 > 0) { // L: 1499
						if (!this.method4323(var5, var8, var6)) { // L: 1500
							return false;
						}

						if (!this.method4323(var5, var8, var6 + 128)) { // L: 1501
							return false;
						}
					}

					if (!this.method4323(var5, var9, var6)) { // L: 1503
						return false;
					}

					if (!this.method4323(var5, var9, var6 + 128)) { // L: 1504
						return false;
					}

					return true; // L: 1505
				}

				if (var4 == 2) { // L: 1507
					if (var6 < Scene_cameraZ) { // L: 1508
						if (!this.method4323(var5, var7, var6 + 128)) { // L: 1509
							return false;
						}

						if (!this.method4323(var5 + 128, var7, var6 + 128)) { // L: 1510
							return false;
						}
					}

					if (var1 > 0) { // L: 1512
						if (!this.method4323(var5, var8, var6 + 128)) { // L: 1513
							return false;
						}

						if (!this.method4323(var5 + 128, var8, var6 + 128)) { // L: 1514
							return false;
						}
					}

					if (!this.method4323(var5, var9, var6 + 128)) { // L: 1516
						return false;
					}

					if (!this.method4323(var5 + 128, var9, var6 + 128)) { // L: 1517
						return false;
					}

					return true; // L: 1518
				}

				if (var4 == 4) { // L: 1520
					if (var5 < Scene_cameraX) { // L: 1521
						if (!this.method4323(var5 + 128, var7, var6)) { // L: 1522
							return false;
						}

						if (!this.method4323(var5 + 128, var7, var6 + 128)) { // L: 1523
							return false;
						}
					}

					if (var1 > 0) { // L: 1525
						if (!this.method4323(var5 + 128, var8, var6)) { // L: 1526
							return false;
						}

						if (!this.method4323(var5 + 128, var8, var6 + 128)) { // L: 1527
							return false;
						}
					}

					if (!this.method4323(var5 + 128, var9, var6)) { // L: 1529
						return false;
					}

					if (!this.method4323(var5 + 128, var9, var6 + 128)) { // L: 1530
						return false;
					}

					return true; // L: 1531
				}

				if (var4 == 8) { // L: 1533
					if (var6 > Scene_cameraZ) { // L: 1534
						if (!this.method4323(var5, var7, var6)) { // L: 1535
							return false;
						}

						if (!this.method4323(var5 + 128, var7, var6)) { // L: 1536
							return false;
						}
					}

					if (var1 > 0) { // L: 1538
						if (!this.method4323(var5, var8, var6)) { // L: 1539
							return false;
						}

						if (!this.method4323(var5 + 128, var8, var6)) { // L: 1540
							return false;
						}
					}

					if (!this.method4323(var5, var9, var6)) { // L: 1542
						return false;
					}

					if (!this.method4323(var5 + 128, var9, var6)) { // L: 1543
						return false;
					}

					return true; // L: 1544
				}
			}

			if (!this.method4323(var5 + 64, var10, var6 + 64)) { // L: 1547
				return false;
			} else if (var4 == 16) { // L: 1548
				return this.method4323(var5, var9, var6 + 128); // L: 1549
			} else if (var4 == 32) { // L: 1552
				return this.method4323(var5 + 128, var9, var6 + 128); // L: 1553
			} else if (var4 == 64) { // L: 1556
				return this.method4323(var5 + 128, var9, var6); // L: 1557
			} else if (var4 == 128) { // L: 1560
				return this.method4323(var5, var9, var6); // L: 1561
			} else {
				return true; // L: 1564
			}
		}
	}

	@ObfuscatedName("ax")
	boolean method4394(int var1, int var2, int var3, int var4) {
		if (!this.method4350(var1, var2, var3)) { // L: 1568
			return false;
		} else {
			int var5 = var2 << 7; // L: 1569
			int var6 = var3 << 7; // L: 1570
			return this.method4323(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method4323(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4323(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4323(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1); // L: 1571
		}
	}

	@ObfuscatedName("aa")
	boolean method4322(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) { // L: 1576
			if (!this.method4350(var1, var2, var4)) { // L: 1577
				return false;
			} else {
				var7 = var2 << 7; // L: 1578
				var8 = var4 << 7; // L: 1579
				return this.method4323(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method4323(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4323(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4323(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1); // L: 1580
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) { // L: 1583
				for (var8 = var4; var8 <= var5; ++var8) { // L: 1584
					if (this.field2461[var1][var7][var8] == -Scene_drawnCount) { // L: 1585
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1; // L: 1588
			var8 = (var4 << 7) + 2; // L: 1589
			int var9 = this.tileHeights[var1][var2][var4] - var6; // L: 1590
			if (!this.method4323(var7, var9, var8)) { // L: 1591
				return false;
			} else {
				int var10 = (var3 << 7) - 1; // L: 1592
				if (!this.method4323(var10, var9, var8)) { // L: 1593
					return false;
				} else {
					int var11 = (var5 << 7) - 1; // L: 1594
					if (!this.method4323(var7, var9, var11)) { // L: 1595
						return false;
					} else if (!this.method4323(var10, var9, var11)) { // L: 1596
						return false;
					} else {
						return true; // L: 1597
					}
				}
			}
		}
	}

	@ObfuscatedName("bx")
	boolean method4323(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) { // L: 1601
			Occluder var5 = Scene_currentOccluders[var4]; // L: 1602
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2546 == 1) { // L: 1603
				var6 = var5.minX - var1; // L: 1604
				if (var6 > 0) { // L: 1605
					var7 = (var6 * var5.field2551 >> 8) + var5.minZ; // L: 1606
					var8 = (var6 * var5.field2552 >> 8) + var5.maxZ; // L: 1607
					var9 = (var6 * var5.field2554 >> 8) + var5.minY; // L: 1608
					var10 = (var6 * var5.field2550 >> 8) + var5.maxY; // L: 1609
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1610
						return true;
					}
				}
			} else if (var5.field2546 == 2) { // L: 1614
				var6 = var1 - var5.minX; // L: 1615
				if (var6 > 0) { // L: 1616
					var7 = (var6 * var5.field2551 >> 8) + var5.minZ; // L: 1617
					var8 = (var6 * var5.field2552 >> 8) + var5.maxZ; // L: 1618
					var9 = (var6 * var5.field2554 >> 8) + var5.minY; // L: 1619
					var10 = (var6 * var5.field2550 >> 8) + var5.maxY; // L: 1620
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1621
						return true;
					}
				}
			} else if (var5.field2546 == 3) { // L: 1625
				var6 = var5.minZ - var3; // L: 1626
				if (var6 > 0) { // L: 1627
					var7 = (var6 * var5.field2549 >> 8) + var5.minX; // L: 1628
					var8 = (var6 * var5.field2544 >> 8) + var5.maxX; // L: 1629
					var9 = (var6 * var5.field2554 >> 8) + var5.minY; // L: 1630
					var10 = (var6 * var5.field2550 >> 8) + var5.maxY; // L: 1631
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1632
						return true;
					}
				}
			} else if (var5.field2546 == 4) { // L: 1636
				var6 = var3 - var5.minZ; // L: 1637
				if (var6 > 0) { // L: 1638
					var7 = (var6 * var5.field2549 >> 8) + var5.minX; // L: 1639
					var8 = (var6 * var5.field2544 >> 8) + var5.maxX; // L: 1640
					var9 = (var6 * var5.field2554 >> 8) + var5.minY; // L: 1641
					var10 = (var6 * var5.field2550 >> 8) + var5.maxY; // L: 1642
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1643
						return true;
					}
				}
			} else if (var5.field2546 == 5) { // L: 1647
				var6 = var2 - var5.minY; // L: 1648
				if (var6 > 0) { // L: 1649
					var7 = (var6 * var5.field2549 >> 8) + var5.minX; // L: 1650
					var8 = (var6 * var5.field2544 >> 8) + var5.maxX; // L: 1651
					var9 = (var6 * var5.field2551 >> 8) + var5.minZ; // L: 1652
					var10 = (var6 * var5.field2552 >> 8) + var5.maxZ; // L: 1653
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) { // L: 1654
						return true;
					}
				}
			}
		}

		return false; // L: 1659
	}

	@ObfuscatedName("x")
	@Export("Scene_addOccluder")
	public static void Scene_addOccluder(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Occluder var8 = new Occluder(); // L: 158
		var8.minTileX = var2 / 128; // L: 159
		var8.maxTileX = var3 / 128; // L: 160
		var8.minTileY = var4 / 128; // L: 161
		var8.maxTileY = var5 / 128; // L: 162
		var8.type = var1; // L: 163
		var8.minX = var2; // L: 164
		var8.maxX = var3; // L: 165
		var8.minZ = var4; // L: 166
		var8.maxZ = var5; // L: 167
		var8.minY = var6; // L: 168
		var8.maxY = var7; // L: 169
		Scene_planeOccluders[var0][Scene_planeOccluderCounts[var0]++] = var8; // L: 170
	} // L: 171

	@ObfuscatedName("ae")
	@Export("Scene_buildVisiblityMap")
	public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
		Scene_viewportXMin = 0; // L: 647
		Scene_viewportYMin = 0; // L: 648
		Scene_viewportXMax = var3; // L: 649
		Scene_viewportYMax = var4; // L: 650
		Scene_viewportXCenter = var3 / 2; // L: 651
		Scene_viewportYCenter = var4 / 2; // L: 652
		boolean[][][][] var5 = new boolean[var0.length][32][53][53]; // L: 653

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) { // L: 654
			for (var7 = 0; var7 < 2048; var7 += 64) { // L: 655
				Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 656
				Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 657
				Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 658
				Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 659
				var8 = (var6 - 128) / 32; // L: 660
				var9 = var7 / 64; // L: 661

				for (int var10 = -26; var10 < 26; ++var10) { // L: 662
					for (var11 = -26; var11 < 26; ++var11) { // L: 663
						var12 = var10 * 128; // L: 664
						int var13 = var11 * 128; // L: 665
						boolean var14 = false; // L: 666

						for (int var15 = -var1; var15 <= var2; var15 += 128) { // L: 667
							if (method4307(var12, var0[var8] + var15, var13)) { // L: 668
								var14 = true; // L: 669
								break;
							}
						}

						var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14; // L: 673
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) { // L: 678
			for (var7 = 0; var7 < 32; ++var7) { // L: 679
				for (var8 = -25; var8 < 25; ++var8) { // L: 680
					for (var9 = -25; var9 < 25; ++var9) { // L: 681
						boolean var16 = false; // L: 682

						label87:
						for (var11 = -1; var11 <= 1; ++var11) { // L: 683
							for (var12 = -1; var12 <= 1; ++var12) { // L: 684
								if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 685
									var16 = true; // L: 686
									break label87;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 689
									var16 = true; // L: 690
									break label87; // L: 691
								}

								if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 693
									var16 = true; // L: 694
									break label87; // L: 695
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 697
									var16 = true; // L: 698
									break label87; // L: 699
								}
							}
						}

						visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16; // L: 703
					}
				}
			}
		}

	} // L: 708

	@ObfuscatedName("ap")
	static boolean method4307(int var0, int var1, int var2) {
		int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16; // L: 711
		int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16; // L: 712
		int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16; // L: 713
		int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16; // L: 714
		if (var5 >= 50 && var5 <= 3500) { // L: 715
			int var7 = var3 * 128 / var5 + Scene_viewportXCenter; // L: 716
			int var8 = var6 * 128 / var5 + Scene_viewportYCenter; // L: 717
			return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax; // L: 718
		} else {
			return false; // L: 719
		}
	}

	@ObfuscatedName("al")
	@Export("shouldSendWalk")
	public static boolean shouldSendWalk() {
		return viewportWalking && Scene_selectedX != -1; // L: 738
	}

	@ObfuscatedName("ag")
	public static void method4311() {
		Scene_selectedX = -1; // L: 742
		viewportWalking = false; // L: 743
	} // L: 744

	@ObfuscatedName("au")
	static final int method4316(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1349
		if (var1 < 2) { // L: 1350
			var1 = 2;
		} else if (var1 > 126) { // L: 1351
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1352
	}

	@ObfuscatedName("aw")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) { // L: 1356
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) { // L: 1357
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) { // L: 1358
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) { // L: 1359
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2); // L: 1360
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3); // L: 1361
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7); // L: 1362
			if (var8 == 0) { // L: 1363
				if (var9 != 0) { // L: 1366
					return var9 < 0 ? var10 <= 0 : var10 >= 0; // L: 1367
				} else {
					return true; // L: 1369
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0; // L: 1364
			}
		}
	}
}
