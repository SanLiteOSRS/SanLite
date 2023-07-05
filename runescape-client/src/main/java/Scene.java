import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("Scene")
public class Scene {
	@ObfuscatedName("at")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("ac")
	@Export("tileUpdateCount")
	static int tileUpdateCount;
	@ObfuscatedName("ag")
	@Export("Scene_plane")
	static int Scene_plane;
	@ObfuscatedName("ar")
	@Export("Scene_drawnCount")
	static int Scene_drawnCount;
	@ObfuscatedName("ah")
	@Export("Scene_cameraXTileMin")
	static int Scene_cameraXTileMin;
	@ObfuscatedName("az")
	@Export("Scene_cameraXTileMax")
	static int Scene_cameraXTileMax;
	@ObfuscatedName("au")
	@Export("Scene_cameraYTileMin")
	static int Scene_cameraYTileMin;
	@ObfuscatedName("ai")
	@Export("Scene_cameraYTileMax")
	static int Scene_cameraYTileMax;
	@ObfuscatedName("aq")
	@Export("Scene_cameraXTile")
	static int Scene_cameraXTile;
	@ObfuscatedName("aw")
	@Export("Scene_cameraYTile")
	static int Scene_cameraYTile;
	@ObfuscatedName("ay")
	@Export("Scene_cameraX")
	static int Scene_cameraX;
	@ObfuscatedName("al")
	@Export("Scene_cameraY")
	static int Scene_cameraY;
	@ObfuscatedName("am")
	@Export("Scene_cameraZ")
	static int Scene_cameraZ;
	@ObfuscatedName("bs")
	@Export("Scene_cameraPitchSine")
	static int Scene_cameraPitchSine;
	@ObfuscatedName("bc")
	@Export("Scene_cameraPitchCosine")
	static int Scene_cameraPitchCosine;
	@ObfuscatedName("bj")
	@Export("Scene_cameraYawSine")
	static int Scene_cameraYawSine;
	@ObfuscatedName("bo")
	@Export("Scene_cameraYawCosine")
	static int Scene_cameraYawCosine;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "[Ljj;"
	)
	@Export("gameObjects")
	static GameObject[] gameObjects;
	@ObfuscatedName("bg")
	@Export("checkClick")
	static boolean checkClick;
	@ObfuscatedName("bf")
	@Export("Scene_selectedPlane")
	static int Scene_selectedPlane;
	@ObfuscatedName("bd")
	@Export("Scene_selectedScreenX")
	static int Scene_selectedScreenX;
	@ObfuscatedName("ba")
	@Export("Scene_selectedScreenY")
	static int Scene_selectedScreenY;
	@ObfuscatedName("bn")
	@Export("Scene_selectedX")
	public static int Scene_selectedX;
	@ObfuscatedName("bb")
	@Export("Scene_selectedY")
	public static int Scene_selectedY;
	@ObfuscatedName("bx")
	@Export("viewportWalking")
	static boolean viewportWalking;
	@ObfuscatedName("bp")
	@Export("Scene_planesCount")
	static int Scene_planesCount;
	@ObfuscatedName("bw")
	@Export("Scene_planeOccluderCounts")
	static int[] Scene_planeOccluderCounts;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "[[Ljw;"
	)
	@Export("Scene_planeOccluders")
	static Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("bk")
	@Export("Scene_currentOccludersCount")
	static int Scene_currentOccludersCount;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "[Ljw;"
	)
	@Export("Scene_currentOccluders")
	static Occluder[] Scene_currentOccluders;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("Scene_tilesDeque")
	static NodeDeque Scene_tilesDeque;
	@ObfuscatedName("bm")
	static final int[] field2591;
	@ObfuscatedName("br")
	static final int[] field2580;
	@ObfuscatedName("bu")
	static final int[] field2570;
	@ObfuscatedName("by")
	static final int[] field2552;
	@ObfuscatedName("bt")
	static final int[] field2551;
	@ObfuscatedName("bl")
	static final int[] field2596;
	@ObfuscatedName("cs")
	static final int[] field2597;
	@ObfuscatedName("cy")
	@Export("visibilityMap")
	static boolean[][][][] visibilityMap;
	@ObfuscatedName("cd")
	@Export("visibleTiles")
	static boolean[][] visibleTiles;
	@ObfuscatedName("cv")
	@Export("Scene_viewportXCenter")
	static int Scene_viewportXCenter;
	@ObfuscatedName("cr")
	@Export("Scene_viewportYCenter")
	static int Scene_viewportYCenter;
	@ObfuscatedName("cm")
	@Export("Scene_viewportXMin")
	static int Scene_viewportXMin;
	@ObfuscatedName("cg")
	@Export("Scene_viewportYMin")
	static int Scene_viewportYMin;
	@ObfuscatedName("ci")
	@Export("Scene_viewportXMax")
	static int Scene_viewportXMax;
	@ObfuscatedName("cb")
	@Export("Scene_viewportYMax")
	static int Scene_viewportYMax;
	@ObfuscatedName("an")
	@Export("planes")
	int planes;
	@ObfuscatedName("av")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("as")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("ax")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[[[Lix;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("ab")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ak")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Ljj;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("af")
	int[][][] field2579;
	@ObfuscatedName("ch")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("cp")
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
		field2591 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76}; // L: 54
		field2580 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160}; // L: 55
		field2570 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19}; // L: 56
		field2552 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0}; // L: 57
		field2551 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4}; // L: 58
		field2596 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0}; // L: 59
		field2597 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8}; // L: 60
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
		this.field2579 = new int[var1][var2 + 1][var3 + 1]; // L: 100
		this.tileHeights = var4; // L: 101
		this.clear(); // L: 102
	} // L: 103

	@ObfuscatedName("at")
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

	@ObfuscatedName("an")
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

	@ObfuscatedName("av")
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

	@ObfuscatedName("ax")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 174
		if (var5 != null) { // L: 175
			this.tiles[var1][var2][var3].minPlane = var4; // L: 176
		}
	} // L: 177

	@ObfuscatedName("ap")
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIILim;JI)V"
	)
	@Export("newGroundObject")
	public void newGroundObject(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) { // L: 198
			GroundObject var9 = new GroundObject(); // L: 199
			var9.renderable = var5; // L: 200
			var9.x = var2 * 128 + 64; // L: 201
			var9.y = var3 * -2013265920 + 1140850688; // L: 202
			var9.z = var4; // L: 203
			var9.tag = var6; // L: 204
			var9.flags = var8; // L: 205
			if (this.tiles[var1][var2][var3] == null) { // L: 206
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].groundObject = var9; // L: 207
		}
	} // L: 208

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIILim;JLim;Lim;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer(); // L: 211
		var10.first = var5; // L: 212
		var10.x = var2 * 128 + 64; // L: 213
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIILim;Lim;IIJI)V"
	)
	@Export("newWallObject")
	public void newWallObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) { // L: 236
			WallObject var12 = new WallObject(); // L: 237
			var12.tag = var9; // L: 238
			var12.flags = var11; // L: 239
			var12.x = var2 * 128 + 64; // L: 240
			var12.y = var3 * 134217728 + 67108864; // L: 241
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIILim;Lim;IIIIJI)V"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILim;IJI)Z"
	)
	public boolean method4522(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) { // L: 270
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128; // L: 271
			int var13 = var6 * 64 + var3 * 128; // L: 272
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11); // L: 273
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIILim;IJZ)Z"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIILim;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 296 297
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILim;IZJI)Z"
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

	@ObfuscatedName("ac")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 342
			GameObject var2 = this.tempGameObjects[var1]; // L: 343
			this.removeGameObject(var2); // L: 344
			this.tempGameObjects[var1] = null; // L: 345
		}

		this.tempGameObjectsCount = 0; // L: 347
	} // L: 348

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljj;)V"
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

	@ObfuscatedName("ar")
	public void method4550(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 377
		if (var5 != null) { // L: 378
			DecorativeObject var6 = var5.decorativeObject; // L: 379
			if (var6 != null) { // L: 380
				var6.xOffset = var4 * var6.xOffset / 16; // L: 381
				var6.yOffset = var4 * var6.yOffset / 16; // L: 382
			}
		}
	} // L: 383

	@ObfuscatedName("ah")
	public void method4529(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 386
		if (var4 != null) {
			var4.wallObject = null; // L: 388
		}
	} // L: 387 389

	@ObfuscatedName("az")
	public void method4574(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 392
		if (var4 != null) {
			var4.decorativeObject = null; // L: 394
		}
	} // L: 393 395

	@ObfuscatedName("au")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 398
		if (var4 != null) { // L: 399
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 400
				GameObject var6 = var4.gameObjects[var5]; // L: 401
				long var8 = var6.tag; // L: 403
				int var10 = (int)(var8 >>> 14 & 3L); // L: 407
				boolean var7 = var10 == 2; // L: 409
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 411
					this.removeGameObject(var6); // L: 412
					return; // L: 413
				}
			}

		}
	} // L: 416

	@ObfuscatedName("ai")
	public void method4532(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 419
		if (var4 != null) {
			var4.groundObject = null; // L: 421
		}
	} // L: 420 422

	@ObfuscatedName("aq")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 425
		if (var4 != null) {
			var4.itemLayer = null; // L: 427
		}
	} // L: 426 428

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Ljo;"
	)
	public WallObject method4534(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 431
		return var4 == null ? null : var4.wallObject; // L: 432 433
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Ljs;"
	)
	public DecorativeObject method4535(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 437
		return var4 == null ? null : var4.decorativeObject; // L: 438 439
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Ljj;"
	)
	@Export("getGameObject")
	public GameObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 443
		if (var4 == null) { // L: 444
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 445
				GameObject var6 = var4.gameObjects[var5]; // L: 446
				long var8 = var6.tag; // L: 448
				int var10 = (int)(var8 >>> 14 & 3L); // L: 452
				boolean var7 = var10 == 2; // L: 454
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 456
					return var6;
				}
			}

			return null; // L: 458
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Lia;"
	)
	@Export("getGroundObject")
	public GroundObject getGroundObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 462
		return var4 != null && var4.groundObject != null ? var4.groundObject : null; // L: 463 464
	}

	@ObfuscatedName("bs")
	@Export("getWallObjectTag")
	public long getWallObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 468
		return var4 != null && var4.wallObject != null ? var4.wallObject.tag : 0L; // L: 469 470
	}

	@ObfuscatedName("bc")
	@Export("getDecorativeObjectTag")
	public long getDecorativeObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 474
		return var4 != null && var4.decorativeObject != null ? var4.decorativeObject.tag : 0L; // L: 475 476
	}

	@ObfuscatedName("bj")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 480
		if (var4 == null) { // L: 481
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 482
				GameObject var6 = var4.gameObjects[var5]; // L: 483
				long var8 = var6.tag; // L: 485
				int var10 = (int)(var8 >>> 14 & 3L); // L: 489
				boolean var7 = var10 == 2; // L: 491
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 493
					return var6.tag;
				}
			}

			return 0L; // L: 495
		}
	}

	@ObfuscatedName("bo")
	@Export("getGroundObjectTag")
	public long getGroundObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 499
		return var4 != null && var4.groundObject != null ? var4.groundObject.tag : 0L; // L: 500 501
	}

	@ObfuscatedName("bq")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3]; // L: 505
		if (var6 == null) { // L: 506
			return -1;
		} else if (var6.wallObject != null && var6.wallObject.tag == var4) { // L: 507
			return var6.wallObject.flags & 255;
		} else if (var6.decorativeObject != null && var6.decorativeObject.tag == var4) { // L: 508
			return var6.decorativeObject.flags & 255;
		} else if (var6.groundObject != null && var6.groundObject.tag == var4) { // L: 509
			return var6.groundObject.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) { // L: 510
				if (var6.gameObjects[var7].tag == var4) { // L: 511
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1; // L: 513
		}
	}

	@ObfuscatedName("bg")
	public void method4543(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) { // L: 517
			for (int var5 = 0; var5 < this.xSize; ++var5) { // L: 518
				for (int var6 = 0; var6 < this.ySize; ++var6) { // L: 519
					Tile var7 = this.tiles[var4][var5][var6]; // L: 520
					if (var7 != null) { // L: 521
						WallObject var8 = var7.wallObject; // L: 522
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) { // L: 523
							ModelData var9 = (ModelData)var8.renderable1; // L: 524
							this.method4545(var9, var4, var5, var6, 1, 1); // L: 525
							if (var8.renderable2 instanceof ModelData) { // L: 526
								var10 = (ModelData)var8.renderable2; // L: 527
								this.method4545(var10, var4, var5, var6, 1, 1); // L: 528
								ModelData.method4315(var9, var10, 0, 0, 0, false); // L: 529
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 530
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3); // L: 532
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) { // L: 534
							GameObject var14 = var7.gameObjects[var12]; // L: 535
							if (var14 != null && var14.renderable instanceof ModelData) { // L: 536
								ModelData var11 = (ModelData)var14.renderable; // L: 537
								this.method4545(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1); // L: 538
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3); // L: 539
							}
						}

						GroundObject var13 = var7.groundObject; // L: 542
						if (var13 != null && var13.renderable instanceof ModelData) { // L: 543
							var10 = (ModelData)var13.renderable; // L: 544
							this.method4544(var10, var4, var5, var6); // L: 545
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 546
						}
					}
				}
			}
		}

	} // L: 552

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lit;III)V"
	)
	void method4544(ModelData var1, int var2, int var3, int var4) {
		int var6 = var3 + 1; // L: 556
		int var7 = var4 - 1; // L: 557
		int var8 = var4 + 1; // L: 558

		for (int var9 = var3; var9 <= var6; ++var9) { // L: 559
			if (var9 >= 0 && var9 < this.xSize) { // L: 560
				for (int var10 = var7; var10 <= var8; ++var10) { // L: 561
					if (var10 >= 0 && var10 < this.ySize && (var9 >= var6 || var10 >= var8)) { // L: 562 563
						Tile var11 = this.tiles[var2][var9][var10]; // L: 564
						if (var11 != null && var11.groundObject != null && var11.groundObject.renderable instanceof ModelData) { // L: 565 566
							int var12 = this.method4546(var2, var9, var10, var2, var3, var4); // L: 567
							ModelData var13 = (ModelData)var11.groundObject.renderable; // L: 568
							ModelData.method4315(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true); // L: 569
						}
					}
				}
			}
		}

	} // L: 573

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lit;IIIII)V"
	)
	void method4545(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 576
		int var8 = var3; // L: 577
		int var9 = var3 + var5; // L: 578
		int var10 = var4 - 1; // L: 579
		int var11 = var4 + var6; // L: 580

		for (int var12 = var2; var12 <= var2 + 1; ++var12) { // L: 581
			if (var12 != this.planes) { // L: 582
				for (int var13 = var8; var13 <= var9; ++var13) { // L: 583
					if (var13 >= 0 && var13 < this.xSize) { // L: 584
						for (int var14 = var10; var14 <= var11; ++var14) { // L: 585
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) { // L: 586 587
								Tile var15 = this.tiles[var12][var13][var14]; // L: 588
								if (var15 != null) { // L: 589
									int var16 = this.method4546(var12, var13, var14, var2, var3, var4); // L: 590
									WallObject var17 = var15.wallObject; // L: 591
									if (var17 != null) { // L: 592
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) { // L: 593
											var18 = (ModelData)var17.renderable1; // L: 594
											ModelData.method4315(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 595
										}

										if (var17.renderable2 instanceof ModelData) { // L: 597
											var18 = (ModelData)var17.renderable2; // L: 598
											ModelData.method4315(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 599
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) { // L: 602
										GameObject var19 = var15.gameObjects[var23]; // L: 603
										if (var19 != null && var19.renderable instanceof ModelData) { // L: 604
											ModelData var20 = (ModelData)var19.renderable; // L: 605
											int var21 = var19.endX - var19.startX + 1; // L: 606
											int var22 = var19.endY - var19.startY + 1; // L: 607
											ModelData.method4315(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7); // L: 608
										}
									}
								}
							}
						}
					}
				}

				--var8; // L: 613
				var7 = false; // L: 614
			}
		}

	} // L: 616

	@ObfuscatedName("ba")
	int method4546(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method4547(var1, var2, var3) - this.method4547(var4, var5, var6); // L: 619
	}

	@ObfuscatedName("bn")
	int method4547(int var1, int var2, int var3) {
		return (this.tileHeights[var1][var2 + 1][var3 + 1] + this.tileHeights[var1][var2][var3] + this.tileHeights[var1][var2][var3 + 1] + this.tileHeights[var1][var2 + 1][var3]) / 4; // L: 623
	}

	@ObfuscatedName("bb")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6]; // L: 627
		if (var7 != null) { // L: 628
			SceneTilePaint var8 = var7.paint; // L: 629
			int var10;
			if (var8 != null) { // L: 630
				int var18 = var8.rgb; // L: 631
				if (var18 != 0) { // L: 632
					for (var10 = 0; var10 < 4; ++var10) { // L: 633
						var1[var2] = var18; // L: 634
						var1[var2 + 1] = var18; // L: 635
						var1[var2 + 2] = var18; // L: 636
						var1[var2 + 3] = var18; // L: 637
						var2 += var3; // L: 638
					}

				}
			} else {
				SceneTileModel var9 = var7.model; // L: 642
				if (var9 != null) { // L: 643
					var10 = var9.shape; // L: 644
					int var11 = var9.rotation; // L: 645
					int var12 = var9.underlayRgb; // L: 646
					int var13 = var9.overlayRgb; // L: 647
					int[] var14 = this.tileShape2D[var10]; // L: 648
					int[] var15 = this.tileRotation2D[var11]; // L: 649
					int var16 = 0; // L: 650
					int var17;
					if (var12 != 0) { // L: 651
						for (var17 = 0; var17 < 4; ++var17) { // L: 652
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 653
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 654
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 655
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 656
							var2 += var3; // L: 657
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) { // L: 661
							if (var14[var15[var16++]] != 0) { // L: 662
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 663
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 664
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 665
								var1[var2 + 3] = var13;
							}

							var2 += var3; // L: 666
						}
					}

				}
			}
		}
	} // L: 640 669

	@ObfuscatedName("bh")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!shouldSendWalk() || var4) { // L: 748
			checkClick = true; // L: 749
			viewportWalking = var4; // L: 750
			Scene_selectedPlane = var1; // L: 751
			Scene_selectedScreenX = var2; // L: 752
			Scene_selectedScreenY = var3; // L: 753
			Scene_selectedX = -1; // L: 754
			Scene_selectedY = -1; // L: 755
		}
	} // L: 756

	@ObfuscatedName("bp")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		viewportWalking = true; // L: 759
	} // L: 760

	@ObfuscatedName("bk")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) { // L: 772
			var1 = 0;
		} else if (var1 >= this.xSize * 128) { // L: 773
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) { // L: 774
			var3 = 0;
		} else if (var3 >= this.ySize * 128) { // L: 775
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) { // L: 776
			var4 = 128;
		} else if (var4 > 383) { // L: 777
			var4 = 383;
		}

		++Scene_drawnCount; // L: 778
		Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 779
		Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 780
		Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5]; // L: 781
		Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5]; // L: 782
		visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64]; // L: 783
		Scene_cameraX = var1; // L: 784
		Scene_cameraY = var2; // L: 785
		Scene_cameraZ = var3; // L: 786
		Scene_cameraXTile = var1 / 128; // L: 787
		Scene_cameraYTile = var3 / 128; // L: 788
		Scene_plane = var6; // L: 789
		Scene_cameraXTileMin = Scene_cameraXTile - 25; // L: 790
		if (Scene_cameraXTileMin < 0) { // L: 791
			Scene_cameraXTileMin = 0;
		}

		Scene_cameraYTileMin = Scene_cameraYTile - 25; // L: 792
		if (Scene_cameraYTileMin < 0) { // L: 793
			Scene_cameraYTileMin = 0;
		}

		Scene_cameraXTileMax = Scene_cameraXTile + 25; // L: 794
		if (Scene_cameraXTileMax > this.xSize) { // L: 795
			Scene_cameraXTileMax = this.xSize;
		}

		Scene_cameraYTileMax = Scene_cameraYTile + 25; // L: 796
		if (Scene_cameraYTileMax > this.ySize) { // L: 797
			Scene_cameraYTileMax = this.ySize;
		}

		this.occlude(); // L: 798
		tileUpdateCount = 0; // L: 799

		int var7;
		Tile[][] var8;
		int var9;
		int var10;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 800
			var8 = this.tiles[var7]; // L: 801

			for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) { // L: 802
				for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) { // L: 803
					Tile var16 = var8[var9][var10]; // L: 804
					if (var16 != null) { // L: 805
						if (var16.minPlane <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) { // L: 806
							var16.drawPrimary = true; // L: 812
							var16.drawSecondary = true; // L: 813
							if (var16.gameObjectsCount > 0) { // L: 814
								var16.drawGameObjects = true;
							} else {
								var16.drawGameObjects = false; // L: 815
							}

							++tileUpdateCount; // L: 816
						} else {
							var16.drawPrimary = false; // L: 807
							var16.drawSecondary = false; // L: 808
							var16.drawGameObjectEdges = 0; // L: 809
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
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 822
			var8 = this.tiles[var7]; // L: 823

			for (var9 = -25; var9 <= 0; ++var9) { // L: 824
				var10 = var9 + Scene_cameraXTile; // L: 825
				var11 = Scene_cameraXTile - var9; // L: 826
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 827
					for (var12 = -25; var12 <= 0; ++var12) { // L: 828
						var13 = var12 + Scene_cameraYTile; // L: 829
						var14 = Scene_cameraYTile - var12; // L: 830
						if (var10 >= Scene_cameraXTileMin) { // L: 831
							if (var13 >= Scene_cameraYTileMin) { // L: 832
								var15 = var8[var10][var13]; // L: 833
								if (var15 != null && var15.drawPrimary) { // L: 834
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 836
								var15 = var8[var10][var14]; // L: 837
								if (var15 != null && var15.drawPrimary) { // L: 838
									this.drawTile(var15, true);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 841
							if (var13 >= Scene_cameraYTileMin) { // L: 842
								var15 = var8[var11][var13]; // L: 843
								if (var15 != null && var15.drawPrimary) { // L: 844
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 846
								var15 = var8[var11][var14]; // L: 847
								if (var15 != null && var15.drawPrimary) { // L: 848
									this.drawTile(var15, true);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 851
							checkClick = false; // L: 852
							return; // L: 853
						}
					}
				}
			}
		}

		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 859
			var8 = this.tiles[var7]; // L: 860

			for (var9 = -25; var9 <= 0; ++var9) { // L: 861
				var10 = var9 + Scene_cameraXTile; // L: 862
				var11 = Scene_cameraXTile - var9; // L: 863
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 864
					for (var12 = -25; var12 <= 0; ++var12) { // L: 865
						var13 = var12 + Scene_cameraYTile; // L: 866
						var14 = Scene_cameraYTile - var12; // L: 867
						if (var10 >= Scene_cameraXTileMin) { // L: 868
							if (var13 >= Scene_cameraYTileMin) { // L: 869
								var15 = var8[var10][var13]; // L: 870
								if (var15 != null && var15.drawPrimary) { // L: 871
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 873
								var15 = var8[var10][var14]; // L: 874
								if (var15 != null && var15.drawPrimary) { // L: 875
									this.drawTile(var15, false);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 878
							if (var13 >= Scene_cameraYTileMin) { // L: 879
								var15 = var8[var11][var13]; // L: 880
								if (var15 != null && var15.drawPrimary) { // L: 881
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 883
								var15 = var8[var11][var14]; // L: 884
								if (var15 != null && var15.drawPrimary) { // L: 885
									this.drawTile(var15, false);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 888
							checkClick = false; // L: 889
							return; // L: 890
						}
					}
				}
			}
		}

		checkClick = false; // L: 896
	} // L: 897

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lix;Z)V"
	)
	@Export("drawTile")
	void drawTile(Tile var1, boolean var2) {
		Scene_tilesDeque.addFirst(var1); // L: 900

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
												var3 = (Tile)Scene_tilesDeque.removeLast(); // L: 902
												if (var3 == null) { // L: 903
													return;
												}
											} while(!var3.drawSecondary); // L: 904

											var4 = var3.x; // L: 905
											var5 = var3.y; // L: 906
											var6 = var3.plane; // L: 907
											var7 = var3.originalPlane; // L: 908
											var8 = this.tiles[var6]; // L: 909
											if (!var3.drawPrimary) { // L: 910
												break;
											}

											if (var2) { // L: 911
												if (var6 > 0) { // L: 912
													var9 = this.tiles[var6 - 1][var4][var5]; // L: 913
													if (var9 != null && var9.drawSecondary) { // L: 914
														continue;
													}
												}

												if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) { // L: 916
													var9 = var8[var4 - 1][var5]; // L: 917
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 1) == 0)) { // L: 918
														continue;
													}
												}

												if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) { // L: 920
													var9 = var8[var4 + 1][var5]; // L: 921
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 4) == 0)) { // L: 922
														continue;
													}
												}

												if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) { // L: 924
													var9 = var8[var4][var5 - 1]; // L: 925
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 8) == 0)) { // L: 926
														continue;
													}
												}

												if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) { // L: 928
													var9 = var8[var4][var5 + 1]; // L: 929
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 2) == 0)) { // L: 930
														continue;
													}
												}
											} else {
												var2 = true; // L: 933
											}

											var3.drawPrimary = false; // L: 934
											if (var3.linkedBelowTile != null) { // L: 935
												var9 = var3.linkedBelowTile; // L: 936
												if (var9.paint != null) { // L: 937
													if (!this.method4562(0, var4, var5)) { // L: 938
														this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												} else if (var9.model != null && !this.method4562(0, var4, var5)) { // L: 940 941
													this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
												}

												var10 = var9.wallObject; // L: 943
												if (var10 != null) { // L: 944
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * 4096 - Scene_cameraX, var10.z - Scene_cameraY, var10.y * 64 - Scene_cameraZ, var10.tag);
												}

												for (var11 = 0; var11 < var9.gameObjectsCount; ++var11) { // L: 945
													var12 = var9.gameObjects[var11]; // L: 946
													if (var12 != null) { // L: 947
														var12.renderable.draw(var12.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX - Scene_cameraX, var12.z - Scene_cameraY, var12.centerY - Scene_cameraZ, var12.tag);
													}
												}
											}

											var20 = false; // L: 950
											if (var3.paint != null) { // L: 951
												if (!this.method4562(var7, var4, var5)) { // L: 952
													var20 = true; // L: 953
													if (var3.paint.neColor != 12345678 || checkClick && var6 <= Scene_selectedPlane) { // L: 954
														this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												}
											} else if (var3.model != null && !this.method4562(var7, var4, var5)) { // L: 957 958
												var20 = true; // L: 959
												this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5); // L: 960
											}

											var21 = 0; // L: 963
											var11 = 0; // L: 964
											WallObject var31 = var3.wallObject; // L: 965
											DecorativeObject var13 = var3.decorativeObject; // L: 966
											if (var31 != null || var13 != null) { // L: 967
												if (var4 == Scene_cameraXTile) { // L: 968
													++var21;
												} else if (Scene_cameraXTile < var4) { // L: 969
													var21 += 2;
												}

												if (var5 == Scene_cameraYTile) { // L: 970
													var21 += 3;
												} else if (Scene_cameraYTile > var5) { // L: 971
													var21 += 6;
												}

												var11 = field2591[var21]; // L: 972
												var3.field2513 = field2570[var21]; // L: 973
											}

											if (var31 != null) { // L: 975
												if ((var31.orientationA & field2580[var21]) != 0) { // L: 976
													if (var31.orientationA == 16) { // L: 977
														var3.drawGameObjectEdges = 3; // L: 978
														var3.field2511 = field2552[var21]; // L: 979
														var3.field2512 = 3 - var3.field2511; // L: 980
													} else if (var31.orientationA == 32) { // L: 982
														var3.drawGameObjectEdges = 6; // L: 983
														var3.field2511 = field2551[var21]; // L: 984
														var3.field2512 = 6 - var3.field2511; // L: 985
													} else if (var31.orientationA == 64) { // L: 987
														var3.drawGameObjectEdges = 12; // L: 988
														var3.field2511 = field2596[var21]; // L: 989
														var3.field2512 = 12 - var3.field2511; // L: 990
													} else {
														var3.drawGameObjectEdges = 9; // L: 993
														var3.field2511 = field2597[var21]; // L: 994
														var3.field2512 = 9 - var3.field2511; // L: 995
													}
												} else {
													var3.drawGameObjectEdges = 0; // L: 998
												}

												if ((var31.orientationA & var11) != 0 && !this.method4563(var7, var4, var5, var31.orientationA)) { // L: 999
													var31.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * 4096 - Scene_cameraX, var31.z - Scene_cameraY, var31.y * 64 - Scene_cameraZ, var31.tag);
												}

												if ((var31.orientationB & var11) != 0 && !this.method4563(var7, var4, var5, var31.orientationB)) { // L: 1000
													var31.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * 4096 - Scene_cameraX, var31.z - Scene_cameraY, var31.y * 64 - Scene_cameraZ, var31.tag);
												}
											}

											if (var13 != null && !this.method4676(var7, var4, var5, var13.renderable1.height)) { // L: 1002
												if ((var13.orientation & var11) != 0) { // L: 1003
													var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.xOffset + (var13.x * 4096 - Scene_cameraX), var13.z - Scene_cameraY, var13.yOffset + (var13.y * 4096 - Scene_cameraZ), var13.tag); // L: 1004
												} else if (var13.orientation == 256) { // L: 1006
													var14 = var13.x * 4096 - Scene_cameraX; // L: 1007
													var15 = var13.z - Scene_cameraY; // L: 1008
													var16 = var13.y * 4096 - Scene_cameraZ; // L: 1009
													var17 = var13.orientation2; // L: 1010
													if (var17 != 1 && var17 != 2) { // L: 1012
														var18 = var14; // L: 1013
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) { // L: 1015
														var19 = var16; // L: 1016
													} else {
														var19 = -var16;
													}

													if (var19 < var18) { // L: 1017
														var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset, var15, var16 + var13.yOffset, var13.tag); // L: 1018
													} else if (var13.renderable2 != null) { // L: 1020
														var13.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag); // L: 1021
													}
												}
											}

											if (var20) { // L: 1025
												GroundObject var22 = var3.groundObject; // L: 1026
												if (var22 != null) { // L: 1027
													var22.renderable.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var22.x * 4096 - Scene_cameraX, var22.z - Scene_cameraY, var22.y * 64 - Scene_cameraZ, var22.tag);
												}

												ItemLayer var23 = var3.itemLayer; // L: 1028
												if (var23 != null && var23.height == 0) { // L: 1029
													if (var23.second != null) { // L: 1030
														var23.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 4096 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}

													if (var23.third != null) { // L: 1031
														var23.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 4096 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}

													if (var23.first != null) { // L: 1032
														var23.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 4096 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}
												}
											}

											var14 = var3.gameObjectsEdgeMask; // L: 1035
											if (var14 != 0) { // L: 1036
												if (var4 < Scene_cameraXTile && (var14 & 4) != 0) { // L: 1037
													var36 = var8[var4 + 1][var5]; // L: 1038
													if (var36 != null && var36.drawSecondary) { // L: 1039
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 < Scene_cameraYTile && (var14 & 2) != 0) { // L: 1041
													var36 = var8[var4][var5 + 1]; // L: 1042
													if (var36 != null && var36.drawSecondary) { // L: 1043
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var4 > Scene_cameraXTile && (var14 & 1) != 0) { // L: 1045
													var36 = var8[var4 - 1][var5]; // L: 1046
													if (var36 != null && var36.drawSecondary) { // L: 1047
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > Scene_cameraYTile && (var14 & 8) != 0) { // L: 1049
													var36 = var8[var4][var5 - 1]; // L: 1050
													if (var36 != null && var36.drawSecondary) { // L: 1051
														Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var3.drawGameObjectEdges != 0) { // L: 1055
											var20 = true; // L: 1056

											for (var21 = 0; var21 < var3.gameObjectsCount; ++var21) { // L: 1057
												if (var3.gameObjects[var21].lastDrawn != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.drawGameObjectEdges) == var3.field2511) { // L: 1058
													var20 = false; // L: 1059
													break; // L: 1060
												}
											}

											if (var20) { // L: 1063
												var10 = var3.wallObject; // L: 1064
												if (!this.method4563(var7, var4, var5, var10.orientationA)) { // L: 1065
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * 4096 - Scene_cameraX, var10.z - Scene_cameraY, var10.y * 64 - Scene_cameraZ, var10.tag);
												}

												var3.drawGameObjectEdges = 0; // L: 1066
											}
										}

										if (!var3.drawGameObjects) { // L: 1069
											break;
										}

										try {
											int var34 = var3.gameObjectsCount; // L: 1071
											var3.drawGameObjects = false; // L: 1072
											var21 = 0; // L: 1073

											label563:
											for (var11 = 0; var11 < var34; ++var11) { // L: 1074
												var12 = var3.gameObjects[var11]; // L: 1075
												if (var12.lastDrawn != Scene_drawnCount) { // L: 1076
													for (var24 = var12.startX; var24 <= var12.endX; ++var24) { // L: 1077
														for (var14 = var12.startY; var14 <= var12.endY; ++var14) { // L: 1078
															var36 = var8[var24][var14]; // L: 1079
															if (var36.drawPrimary) { // L: 1080
																var3.drawGameObjects = true; // L: 1081
																continue label563; // L: 1082
															}

															if (var36.drawGameObjectEdges != 0) { // L: 1084
																var16 = 0; // L: 1085
																if (var24 > var12.startX) { // L: 1086
																	++var16;
																}

																if (var24 < var12.endX) { // L: 1087
																	var16 += 4;
																}

																if (var14 > var12.startY) { // L: 1088
																	var16 += 8;
																}

																if (var14 < var12.endY) { // L: 1089
																	var16 += 2;
																}

																if ((var16 & var36.drawGameObjectEdges) == var3.field2512) { // L: 1090
																	var3.drawGameObjects = true; // L: 1091
																	continue label563; // L: 1092
																}
															}
														}
													}

													gameObjects[var21++] = var12; // L: 1097
													var24 = Scene_cameraXTile - var12.startX; // L: 1098
													var14 = var12.endX - Scene_cameraXTile; // L: 1099
													if (var14 > var24) { // L: 1100
														var24 = var14;
													}

													var15 = Scene_cameraYTile - var12.startY; // L: 1101
													var16 = var12.endY - Scene_cameraYTile; // L: 1102
													if (var16 > var15) { // L: 1103
														var12.field2847 = var24 + var16;
													} else {
														var12.field2847 = var24 + var15; // L: 1104
													}
												}
											}

											while (var21 > 0) { // L: 1107
												var11 = -50; // L: 1108
												var25 = -1; // L: 1109

												for (var24 = 0; var24 < var21; ++var24) { // L: 1110
													GameObject var35 = gameObjects[var24]; // L: 1111
													if (var35.lastDrawn != Scene_drawnCount) { // L: 1112
														if (var35.field2847 > var11) { // L: 1113
															var11 = var35.field2847; // L: 1114
															var25 = var24; // L: 1115
														} else if (var11 == var35.field2847) { // L: 1117
															var15 = var35.centerX - Scene_cameraX; // L: 1118
															var16 = var35.centerY - Scene_cameraZ; // L: 1119
															var17 = gameObjects[var25].centerX - Scene_cameraX; // L: 1120
															var18 = gameObjects[var25].centerY - Scene_cameraZ; // L: 1121
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) { // L: 1122
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) { // L: 1126
													break;
												}

												GameObject var33 = gameObjects[var25]; // L: 1127
												var33.lastDrawn = Scene_drawnCount; // L: 1128
												if (!this.method4565(var7, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) { // L: 1129
													var33.renderable.draw(var33.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX - Scene_cameraX, var33.z - Scene_cameraY, var33.centerY - Scene_cameraZ, var33.tag); // L: 1130
												}

												for (var14 = var33.startX; var14 <= var33.endX; ++var14) { // L: 1132
													for (var15 = var33.startY; var15 <= var33.endY; ++var15) { // L: 1133
														Tile var26 = var8[var14][var15]; // L: 1134
														if (var26.drawGameObjectEdges != 0) { // L: 1135
															Scene_tilesDeque.addFirst(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.drawSecondary) { // L: 1136
															Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var3.drawGameObjects) { // L: 1140
												break;
											}
										} catch (Exception var28) { // L: 1142
											var3.drawGameObjects = false; // L: 1143
											break;
										}
									}
								} while(!var3.drawSecondary); // L: 1146
							} while(var3.drawGameObjectEdges != 0); // L: 1147

							if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) { // L: 1148
								break;
							}

							var9 = var8[var4 - 1][var5]; // L: 1149
						} while(var9 != null && var9.drawSecondary); // L: 1150

						if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) { // L: 1152
							break;
						}

						var9 = var8[var4 + 1][var5]; // L: 1153
					} while(var9 != null && var9.drawSecondary); // L: 1154

					if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) { // L: 1156
						break;
					}

					var9 = var8[var4][var5 - 1]; // L: 1157
				} while(var9 != null && var9.drawSecondary); // L: 1158

				if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) { // L: 1160
					break;
				}

				var9 = var8[var4][var5 + 1]; // L: 1161
			} while(var9 != null && var9.drawSecondary); // L: 1162

			var3.drawSecondary = false; // L: 1164
			--tileUpdateCount; // L: 1165
			ItemLayer var32 = var3.itemLayer; // L: 1166
			if (var32 != null && var32.height != 0) { // L: 1167
				if (var32.second != null) { // L: 1168
					var32.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 4096 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}

				if (var32.third != null) { // L: 1169
					var32.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 4096 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}

				if (var32.first != null) { // L: 1170
					var32.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 4096 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}
			}

			if (var3.field2513 != 0) { // L: 1172
				DecorativeObject var29 = var3.decorativeObject; // L: 1173
				if (var29 != null && !this.method4676(var7, var4, var5, var29.renderable1.height)) { // L: 1174
					if ((var29.orientation & var3.field2513) != 0) { // L: 1175
						var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.xOffset + (var29.x * 4096 - Scene_cameraX), var29.z - Scene_cameraY, var29.yOffset + (var29.y * 4096 - Scene_cameraZ), var29.tag); // L: 1176
					} else if (var29.orientation == 256) { // L: 1178
						var11 = var29.x * 4096 - Scene_cameraX; // L: 1179
						var25 = var29.z - Scene_cameraY; // L: 1180
						var24 = var29.y * 4096 - Scene_cameraZ; // L: 1181
						var14 = var29.orientation2; // L: 1182
						if (var14 != 1 && var14 != 2) { // L: 1184
							var15 = var11; // L: 1185
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) { // L: 1187
							var16 = var24; // L: 1188
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) { // L: 1189
							var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var29.xOffset, var25, var24 + var29.yOffset, var29.tag); // L: 1190
						} else if (var29.renderable2 != null) { // L: 1192
							var29.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var25, var24, var29.tag); // L: 1193
						}
					}
				}

				WallObject var27 = var3.wallObject; // L: 1197
				if (var27 != null) { // L: 1198
					if ((var27.orientationB & var3.field2513) != 0 && !this.method4563(var7, var4, var5, var27.orientationB)) { // L: 1199
						var27.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 4096 - Scene_cameraX, var27.z - Scene_cameraY, var27.y * 64 - Scene_cameraZ, var27.tag);
					}

					if ((var27.orientationA & var3.field2513) != 0 && !this.method4563(var7, var4, var5, var27.orientationA)) { // L: 1200
						var27.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 4096 - Scene_cameraX, var27.z - Scene_cameraY, var27.y * 64 - Scene_cameraZ, var27.tag);
					}
				}
			}

			Tile var30;
			if (var6 < this.planes - 1) { // L: 1203
				var30 = this.tiles[var6 + 1][var4][var5]; // L: 1204
				if (var30 != null && var30.drawSecondary) { // L: 1205
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 < Scene_cameraXTile) { // L: 1207
				var30 = var8[var4 + 1][var5]; // L: 1208
				if (var30 != null && var30.drawSecondary) { // L: 1209
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < Scene_cameraYTile) { // L: 1211
				var30 = var8[var4][var5 + 1]; // L: 1212
				if (var30 != null && var30.drawSecondary) { // L: 1213
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 > Scene_cameraXTile) { // L: 1215
				var30 = var8[var4 - 1][var5]; // L: 1216
				if (var30 != null && var30.drawSecondary) { // L: 1217
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > Scene_cameraYTile) { // L: 1219
				var30 = var8[var4][var5 - 1]; // L: 1220
				if (var30 != null && var30.drawSecondary) { // L: 1221
					Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IIIIIII)V"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - Scene_cameraX; // L: 1229
		int var11;
		int var12 = var11 = (var8 << 7) - Scene_cameraZ; // L: 1231
		int var13;
		int var14 = var13 = var10 + 128; // L: 1233
		int var15;
		int var16 = var15 = var12 + 128; // L: 1235
		int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY; // L: 1236
		int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY; // L: 1237
		int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY; // L: 1238
		int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY; // L: 1239
		int var21 = var10 * var6 + var5 * var12 >> 16; // L: 1240
		var12 = var12 * var6 - var5 * var10 >> 16; // L: 1241
		var10 = var21; // L: 1242
		var21 = var17 * var4 - var3 * var12 >> 16; // L: 1243
		var12 = var3 * var17 + var12 * var4 >> 16; // L: 1244
		var17 = var21; // L: 1245
		if (var12 >= 50) { // L: 1246
			var21 = var14 * var6 + var5 * var11 >> 16; // L: 1247
			var11 = var11 * var6 - var5 * var14 >> 16; // L: 1248
			var14 = var21; // L: 1249
			var21 = var18 * var4 - var3 * var11 >> 16; // L: 1250
			var11 = var3 * var18 + var11 * var4 >> 16; // L: 1251
			var18 = var21; // L: 1252
			if (var11 >= 50) { // L: 1253
				var21 = var13 * var6 + var5 * var16 >> 16; // L: 1254
				var16 = var16 * var6 - var5 * var13 >> 16; // L: 1255
				var13 = var21; // L: 1256
				var21 = var19 * var4 - var3 * var16 >> 16; // L: 1257
				var16 = var3 * var19 + var16 * var4 >> 16; // L: 1258
				var19 = var21; // L: 1259
				if (var16 >= 50) { // L: 1260
					var21 = var9 * var6 + var5 * var15 >> 16; // L: 1261
					var15 = var15 * var6 - var5 * var9 >> 16; // L: 1262
					var9 = var21; // L: 1263
					var21 = var20 * var4 - var3 * var15 >> 16; // L: 1264
					var15 = var3 * var20 + var15 * var4 >> 16; // L: 1265
					if (var15 >= 50) { // L: 1267
						int var22 = Rasterizer3D.method4375() + var10 * Rasterizer3D.method4374() / var12; // L: 1268
						int var23 = Rasterizer3D.method4376() + var17 * Rasterizer3D.method4374() / var12; // L: 1269
						int var24 = Rasterizer3D.method4375() + var14 * Rasterizer3D.method4374() / var11; // L: 1270
						int var25 = Rasterizer3D.method4376() + var18 * Rasterizer3D.method4374() / var11; // L: 1271
						int var26 = Rasterizer3D.method4375() + var13 * Rasterizer3D.method4374() / var16; // L: 1272
						int var27 = Rasterizer3D.method4376() + var19 * Rasterizer3D.method4374() / var16; // L: 1273
						int var28 = Rasterizer3D.method4375() + var9 * Rasterizer3D.method4374() / var15; // L: 1274
						int var29 = Rasterizer3D.method4376() + var21 * Rasterizer3D.method4374() / var15; // L: 1275
						float var30 = class137.method3092(var12); // L: 1276
						float var31 = class137.method3092(var11); // L: 1277
						float var32 = class137.method3092(var16); // L: 1278
						float var33 = class137.method3092(var15); // L: 1279
						Rasterizer3D.field2520.field2793 = 0; // L: 1280
						int var34;
						int var35;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) { // L: 1281
							Rasterizer3D.field2520.field2798 = false; // L: 1282
							var34 = Rasterizer3D.method4388(); // L: 1283
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) { // L: 1284
								Rasterizer3D.field2520.field2798 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) { // L: 1285
								Scene_selectedX = var7; // L: 1286
								Scene_selectedY = var8; // L: 1287
							}

							if (var1.texture == -1) { // L: 1289
								if (var1.neColor != 12345678) { // L: 1290
									Rasterizer3D.method4389(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.neColor, var1.nwColor, var1.seColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1292
								if (var1.isFlat) { // L: 1293
									Rasterizer3D.method4380(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
								} else {
									Rasterizer3D.method4380(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture); // L: 1294
								}
							} else {
								var35 = Rasterizer3D.field2520.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1297
								Rasterizer3D.method4389(var27, var29, var25, var26, var28, var24, var32, var33, var31, method4689(var35, var1.neColor), method4689(var35, var1.nwColor), method4689(var35, var1.seColor)); // L: 1298
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) { // L: 1301
							Rasterizer3D.field2520.field2798 = false; // L: 1302
							var34 = Rasterizer3D.method4388(); // L: 1303
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) { // L: 1304
								Rasterizer3D.field2520.field2798 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) { // L: 1305
								Scene_selectedX = var7; // L: 1306
								Scene_selectedY = var8; // L: 1307
							}

							if (var1.texture == -1) { // L: 1309
								if (var1.swColor != 12345678) { // L: 1310
									Rasterizer3D.method4389(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.swColor, var1.seColor, var1.nwColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1312
								Rasterizer3D.method4380(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture); // L: 1313
							} else {
								var35 = Rasterizer3D.field2520.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1316
								Rasterizer3D.method4389(var23, var25, var29, var22, var24, var28, var30, var31, var33, method4689(var35, var1.swColor), method4689(var35, var1.seColor), method4689(var35, var1.nwColor)); // L: 1317
							}
						}

					}
				}
			}
		}
	} // L: 1320

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljr;IIIIII)V"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length; // L: 1323

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) { // L: 1324
			var10 = var1.vertexX[var9] - Scene_cameraX; // L: 1325
			var11 = var1.vertexY[var9] - Scene_cameraY; // L: 1326
			var12 = var1.vertexZ[var9] - Scene_cameraZ; // L: 1327
			var13 = var12 * var4 + var5 * var10 >> 16; // L: 1328
			var12 = var5 * var12 - var10 * var4 >> 16; // L: 1329
			var10 = var13; // L: 1330
			var13 = var3 * var11 - var12 * var2 >> 16; // L: 1331
			var12 = var11 * var2 + var3 * var12 >> 16; // L: 1332
			if (var12 < 50) { // L: 1334
				return;
			}

			if (var1.triangleTextureId != null) { // L: 1335
				SceneTileModel.field2666[var9] = var10; // L: 1336
				SceneTileModel.field2657[var9] = var13; // L: 1337
				SceneTileModel.field2677[var9] = var12; // L: 1338
			}

			SceneTileModel.field2672[var9] = Rasterizer3D.method4375() + var10 * Rasterizer3D.method4374() / var12; // L: 1340
			SceneTileModel.field2673[var9] = Rasterizer3D.method4376() + var13 * Rasterizer3D.method4374() / var12; // L: 1341
			SceneTileModel.field2674[var9] = class137.method3092(var12); // L: 1342
		}

		Rasterizer3D.field2520.field2793 = 0; // L: 1344
		var8 = var1.faceX.length; // L: 1345

		for (var9 = 0; var9 < var8; ++var9) { // L: 1346
			var10 = var1.faceX[var9]; // L: 1347
			var11 = var1.faceY[var9]; // L: 1348
			var12 = var1.faceZ[var9]; // L: 1349
			var13 = SceneTileModel.field2672[var10]; // L: 1350
			int var14 = SceneTileModel.field2672[var11]; // L: 1351
			int var15 = SceneTileModel.field2672[var12]; // L: 1352
			int var16 = SceneTileModel.field2673[var10]; // L: 1353
			int var17 = SceneTileModel.field2673[var11]; // L: 1354
			int var18 = SceneTileModel.field2673[var12]; // L: 1355
			float var19 = SceneTileModel.field2674[var10]; // L: 1356
			float var20 = SceneTileModel.field2674[var11]; // L: 1357
			float var21 = SceneTileModel.field2674[var12]; // L: 1358
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) { // L: 1359
				Rasterizer3D.field2520.field2798 = false; // L: 1360
				int var22 = Rasterizer3D.method4388(); // L: 1361
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) { // L: 1362
					Rasterizer3D.field2520.field2798 = true;
				}

				if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) { // L: 1363
					Scene_selectedX = var6; // L: 1364
					Scene_selectedY = var7; // L: 1365
				}

				if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) { // L: 1367
					if (!Scene_isLowDetail) { // L: 1371
						if (var1.field2669) { // L: 1372
							Rasterizer3D.method4380(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2666[0], SceneTileModel.field2666[1], SceneTileModel.field2666[3], SceneTileModel.field2657[0], SceneTileModel.field2657[1], SceneTileModel.field2657[3], SceneTileModel.field2677[0], SceneTileModel.field2677[1], SceneTileModel.field2677[3], var1.triangleTextureId[var9]);
						} else {
							Rasterizer3D.method4380(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2666[var10], SceneTileModel.field2666[var11], SceneTileModel.field2666[var12], SceneTileModel.field2657[var10], SceneTileModel.field2657[var11], SceneTileModel.field2657[var12], SceneTileModel.field2677[var10], SceneTileModel.field2677[var11], SceneTileModel.field2677[var12], var1.triangleTextureId[var9]); // L: 1373
						}
					} else {
						int var23 = Rasterizer3D.field2520.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.triangleTextureId[var9]); // L: 1376
						Rasterizer3D.method4389(var16, var17, var18, var13, var14, var15, var19, var20, var21, method4689(var23, var1.triangleColorA[var9]), method4689(var23, var1.triangleColorB[var9]), method4689(var23, var1.triangleColorC[var9])); // L: 1377
					}
				} else if (var1.triangleColorA[var9] != 12345678) { // L: 1368
					Rasterizer3D.method4389(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
				}
			}
		}

	} // L: 1382

	@ObfuscatedName("by")
	@Export("occlude")
	void occlude() {
		int var1 = Scene_planeOccluderCounts[Scene_plane]; // L: 1409
		Occluder[] var2 = Scene_planeOccluders[Scene_plane]; // L: 1410
		Scene_currentOccludersCount = 0; // L: 1411

		for (int var3 = 0; var3 < var1; ++var3) { // L: 1412
			Occluder var4 = var2[var3]; // L: 1413
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) { // L: 1414
				var5 = var4.minTileX - Scene_cameraXTile + 25; // L: 1415
				if (var5 >= 0 && var5 <= 50) { // L: 1416
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1417
					if (var6 < 0) { // L: 1418
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1419
					if (var7 > 50) { // L: 1420
						var7 = 50;
					}

					var13 = false; // L: 1421

					while (var6 <= var7) { // L: 1422
						if (visibleTiles[var5][var6++]) { // L: 1423
							var13 = true; // L: 1424
							break;
						}
					}

					if (var13) { // L: 1428
						var9 = Scene_cameraX - var4.minX; // L: 1429
						if (var9 > 32) { // L: 1430
							var4.field2638 = 1;
						} else {
							if (var9 >= -32) { // L: 1431
								continue;
							}

							var4.field2638 = 2; // L: 1432
							var9 = -var9; // L: 1433
						}

						var4.field2641 = (var4.minZ - Scene_cameraZ << 8) / var9; // L: 1436
						var4.field2642 = (var4.maxZ - Scene_cameraZ << 8) / var9; // L: 1437
						var4.field2634 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1438
						var4.field2640 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1439
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1440
					}
				}
			} else if (var4.type == 2) { // L: 1443
				var5 = var4.minTileY - Scene_cameraYTile + 25; // L: 1444
				if (var5 >= 0 && var5 <= 50) { // L: 1445
					var6 = var4.minTileX - Scene_cameraXTile + 25; // L: 1446
					if (var6 < 0) { // L: 1447
						var6 = 0;
					}

					var7 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1448
					if (var7 > 50) { // L: 1449
						var7 = 50;
					}

					var13 = false; // L: 1450

					while (var6 <= var7) { // L: 1451
						if (visibleTiles[var6++][var5]) { // L: 1452
							var13 = true; // L: 1453
							break;
						}
					}

					if (var13) { // L: 1457
						var9 = Scene_cameraZ - var4.minZ; // L: 1458
						if (var9 > 32) { // L: 1459
							var4.field2638 = 3;
						} else {
							if (var9 >= -32) { // L: 1460
								continue;
							}

							var4.field2638 = 4; // L: 1461
							var9 = -var9; // L: 1462
						}

						var4.field2644 = (var4.minX - Scene_cameraX << 8) / var9; // L: 1465
						var4.field2643 = (var4.maxX - Scene_cameraX << 8) / var9; // L: 1466
						var4.field2634 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1467
						var4.field2640 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1468
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1469
					}
				}
			} else if (var4.type == 4) { // L: 1472
				var5 = var4.minY - Scene_cameraY; // L: 1473
				if (var5 > 128) { // L: 1474
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1475
					if (var6 < 0) { // L: 1476
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1477
					if (var7 > 50) { // L: 1478
						var7 = 50;
					}

					if (var6 <= var7) { // L: 1479
						int var8 = var4.minTileX - Scene_cameraXTile + 25; // L: 1480
						if (var8 < 0) { // L: 1481
							var8 = 0;
						}

						var9 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1482
						if (var9 > 50) { // L: 1483
							var9 = 50;
						}

						boolean var10 = false; // L: 1484

						label150:
						for (int var11 = var8; var11 <= var9; ++var11) { // L: 1485
							for (int var12 = var6; var12 <= var7; ++var12) { // L: 1486
								if (visibleTiles[var11][var12]) { // L: 1487
									var10 = true; // L: 1488
									break label150;
								}
							}
						}

						if (var10) { // L: 1493
							var4.field2638 = 5; // L: 1494
							var4.field2644 = (var4.minX - Scene_cameraX << 8) / var5; // L: 1495
							var4.field2643 = (var4.maxX - Scene_cameraX << 8) / var5; // L: 1496
							var4.field2641 = (var4.minZ - Scene_cameraZ << 8) / var5; // L: 1497
							var4.field2642 = (var4.maxZ - Scene_cameraZ << 8) / var5; // L: 1498
							Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1499
						}
					}
				}
			}
		}

	} // L: 1503

	@ObfuscatedName("bt")
	boolean method4562(int var1, int var2, int var3) {
		int var4 = this.field2579[var1][var2][var3]; // L: 1506
		if (var4 == -Scene_drawnCount) { // L: 1507
			return false;
		} else if (var4 == Scene_drawnCount) { // L: 1508
			return true;
		} else {
			int var5 = var2 << 7; // L: 1509
			int var6 = var3 << 7; // L: 1510
			if (this.method4566(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method4566(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method4566(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4566(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) { // L: 1511
				this.field2579[var1][var2][var3] = Scene_drawnCount; // L: 1512
				return true; // L: 1513
			} else {
				this.field2579[var1][var2][var3] = -Scene_drawnCount; // L: 1516
				return false; // L: 1517
			}
		}
	}

	@ObfuscatedName("bl")
	boolean method4563(int var1, int var2, int var3, int var4) {
		if (!this.method4562(var1, var2, var3)) { // L: 1522
			return false;
		} else {
			int var5 = var2 << 7; // L: 1523
			int var6 = var3 << 7; // L: 1524
			int var7 = this.tileHeights[var1][var2][var3] - 1; // L: 1525
			int var8 = var7 - 120; // L: 1526
			int var9 = var7 - 230; // L: 1527
			int var10 = var7 - 238; // L: 1528
			if (var4 < 16) { // L: 1529
				if (var4 == 1) { // L: 1530
					if (var5 > Scene_cameraX) { // L: 1531
						if (!this.method4566(var5, var7, var6)) { // L: 1532
							return false;
						}

						if (!this.method4566(var5, var7, var6 + 128)) { // L: 1533
							return false;
						}
					}

					if (var1 > 0) { // L: 1535
						if (!this.method4566(var5, var8, var6)) { // L: 1536
							return false;
						}

						if (!this.method4566(var5, var8, var6 + 128)) { // L: 1537
							return false;
						}
					}

					if (!this.method4566(var5, var9, var6)) { // L: 1539
						return false;
					}

					if (!this.method4566(var5, var9, var6 + 128)) { // L: 1540
						return false;
					}

					return true; // L: 1541
				}

				if (var4 == 2) { // L: 1543
					if (var6 < Scene_cameraZ) { // L: 1544
						if (!this.method4566(var5, var7, var6 + 128)) { // L: 1545
							return false;
						}

						if (!this.method4566(var5 + 128, var7, var6 + 128)) { // L: 1546
							return false;
						}
					}

					if (var1 > 0) { // L: 1548
						if (!this.method4566(var5, var8, var6 + 128)) { // L: 1549
							return false;
						}

						if (!this.method4566(var5 + 128, var8, var6 + 128)) { // L: 1550
							return false;
						}
					}

					if (!this.method4566(var5, var9, var6 + 128)) { // L: 1552
						return false;
					}

					if (!this.method4566(var5 + 128, var9, var6 + 128)) { // L: 1553
						return false;
					}

					return true; // L: 1554
				}

				if (var4 == 4) { // L: 1556
					if (var5 < Scene_cameraX) { // L: 1557
						if (!this.method4566(var5 + 128, var7, var6)) { // L: 1558
							return false;
						}

						if (!this.method4566(var5 + 128, var7, var6 + 128)) { // L: 1559
							return false;
						}
					}

					if (var1 > 0) { // L: 1561
						if (!this.method4566(var5 + 128, var8, var6)) { // L: 1562
							return false;
						}

						if (!this.method4566(var5 + 128, var8, var6 + 128)) { // L: 1563
							return false;
						}
					}

					if (!this.method4566(var5 + 128, var9, var6)) { // L: 1565
						return false;
					}

					if (!this.method4566(var5 + 128, var9, var6 + 128)) { // L: 1566
						return false;
					}

					return true; // L: 1567
				}

				if (var4 == 8) { // L: 1569
					if (var6 > Scene_cameraZ) { // L: 1570
						if (!this.method4566(var5, var7, var6)) { // L: 1571
							return false;
						}

						if (!this.method4566(var5 + 128, var7, var6)) { // L: 1572
							return false;
						}
					}

					if (var1 > 0) { // L: 1574
						if (!this.method4566(var5, var8, var6)) { // L: 1575
							return false;
						}

						if (!this.method4566(var5 + 128, var8, var6)) { // L: 1576
							return false;
						}
					}

					if (!this.method4566(var5, var9, var6)) { // L: 1578
						return false;
					}

					if (!this.method4566(var5 + 128, var9, var6)) { // L: 1579
						return false;
					}

					return true; // L: 1580
				}
			}

			if (!this.method4566(var5 + 64, var10, var6 + 64)) { // L: 1583
				return false;
			} else if (var4 == 16) { // L: 1584
				return this.method4566(var5, var9, var6 + 128); // L: 1585
			} else if (var4 == 32) { // L: 1588
				return this.method4566(var5 + 128, var9, var6 + 128); // L: 1589
			} else if (var4 == 64) { // L: 1592
				return this.method4566(var5 + 128, var9, var6); // L: 1593
			} else if (var4 == 128) { // L: 1596
				return this.method4566(var5, var9, var6); // L: 1597
			} else {
				return true; // L: 1600
			}
		}
	}

	@ObfuscatedName("cs")
	boolean method4676(int var1, int var2, int var3, int var4) {
		if (!this.method4562(var1, var2, var3)) { // L: 1604
			return false;
		} else {
			int var5 = var2 << 7; // L: 1605
			int var6 = var3 << 7; // L: 1606
			return this.method4566(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method4566(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4566(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4566(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1); // L: 1607
		}
	}

	@ObfuscatedName("cu")
	boolean method4565(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) { // L: 1612
			if (!this.method4562(var1, var2, var4)) { // L: 1613
				return false;
			} else {
				var7 = var2 << 7; // L: 1614
				var8 = var4 << 7; // L: 1615
				return this.method4566(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method4566(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4566(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4566(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1); // L: 1616
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) { // L: 1619
				for (var8 = var4; var8 <= var5; ++var8) { // L: 1620
					if (this.field2579[var1][var7][var8] == -Scene_drawnCount) { // L: 1621
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1; // L: 1624
			var8 = (var4 << 7) + 2; // L: 1625
			int var9 = this.tileHeights[var1][var2][var4] - var6; // L: 1626
			if (!this.method4566(var7, var9, var8)) { // L: 1627
				return false;
			} else {
				int var10 = (var3 << 7) - 1; // L: 1628
				if (!this.method4566(var10, var9, var8)) { // L: 1629
					return false;
				} else {
					int var11 = (var5 << 7) - 1; // L: 1630
					if (!this.method4566(var7, var9, var11)) { // L: 1631
						return false;
					} else if (!this.method4566(var10, var9, var11)) { // L: 1632
						return false;
					} else {
						return true; // L: 1633
					}
				}
			}
		}
	}

	@ObfuscatedName("ca")
	boolean method4566(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) { // L: 1637
			Occluder var5 = Scene_currentOccluders[var4]; // L: 1638
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2638 == 1) { // L: 1639
				var6 = var5.minX - var1; // L: 1640
				if (var6 > 0) { // L: 1641
					var7 = (var6 * var5.field2641 >> 8) + var5.minZ; // L: 1642
					var8 = (var6 * var5.field2642 >> 8) + var5.maxZ; // L: 1643
					var9 = (var6 * var5.field2634 >> 8) + var5.minY; // L: 1644
					var10 = (var6 * var5.field2640 >> 8) + var5.maxY; // L: 1645
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1646
						return true;
					}
				}
			} else if (var5.field2638 == 2) { // L: 1650
				var6 = var1 - var5.minX; // L: 1651
				if (var6 > 0) { // L: 1652
					var7 = (var6 * var5.field2641 >> 8) + var5.minZ; // L: 1653
					var8 = (var6 * var5.field2642 >> 8) + var5.maxZ; // L: 1654
					var9 = (var6 * var5.field2634 >> 8) + var5.minY; // L: 1655
					var10 = (var6 * var5.field2640 >> 8) + var5.maxY; // L: 1656
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1657
						return true;
					}
				}
			} else if (var5.field2638 == 3) { // L: 1661
				var6 = var5.minZ - var3; // L: 1662
				if (var6 > 0) { // L: 1663
					var7 = (var6 * var5.field2644 >> 8) + var5.minX; // L: 1664
					var8 = (var6 * var5.field2643 >> 8) + var5.maxX; // L: 1665
					var9 = (var6 * var5.field2634 >> 8) + var5.minY; // L: 1666
					var10 = (var6 * var5.field2640 >> 8) + var5.maxY; // L: 1667
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1668
						return true;
					}
				}
			} else if (var5.field2638 == 4) { // L: 1672
				var6 = var3 - var5.minZ; // L: 1673
				if (var6 > 0) { // L: 1674
					var7 = (var6 * var5.field2644 >> 8) + var5.minX; // L: 1675
					var8 = (var6 * var5.field2643 >> 8) + var5.maxX; // L: 1676
					var9 = (var6 * var5.field2634 >> 8) + var5.minY; // L: 1677
					var10 = (var6 * var5.field2640 >> 8) + var5.maxY; // L: 1678
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1679
						return true;
					}
				}
			} else if (var5.field2638 == 5) { // L: 1683
				var6 = var2 - var5.minY; // L: 1684
				if (var6 > 0) { // L: 1685
					var7 = (var6 * var5.field2644 >> 8) + var5.minX; // L: 1686
					var8 = (var6 * var5.field2643 >> 8) + var5.maxX; // L: 1687
					var9 = (var6 * var5.field2641 >> 8) + var5.minZ; // L: 1688
					var10 = (var6 * var5.field2642 >> 8) + var5.maxZ; // L: 1689
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) { // L: 1690
						return true;
					}
				}
			}
		}

		return false; // L: 1695
	}

	@ObfuscatedName("as")
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

	@ObfuscatedName("bx")
	@Export("Scene_buildVisiblityMap")
	public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
		Scene_viewportXMin = 0; // L: 672
		Scene_viewportYMin = 0; // L: 673
		Scene_viewportXMax = var3; // L: 674
		Scene_viewportYMax = var4; // L: 675
		Scene_viewportXCenter = var3 / 2; // L: 676
		Scene_viewportYCenter = var4 / 2; // L: 677
		boolean[][][][] var5 = new boolean[var0.length][32][53][53]; // L: 678

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) { // L: 679
			for (var7 = 0; var7 < 2048; var7 += 64) { // L: 680
				Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 681
				Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 682
				Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 683
				Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 684
				var8 = (var6 - 128) / 32; // L: 685
				var9 = var7 / 64; // L: 686

				for (int var10 = -26; var10 < 26; ++var10) { // L: 687
					for (var11 = -26; var11 < 26; ++var11) { // L: 688
						var12 = var10 * 128; // L: 689
						int var13 = var11 * 128; // L: 690
						boolean var14 = false; // L: 691

						for (int var15 = -var1; var15 <= var2; var15 += 128) { // L: 692
							if (method4576(var12, var0[var8] + var15, var13)) { // L: 693
								var14 = true; // L: 694
								break;
							}
						}

						var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14; // L: 698
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) { // L: 703
			for (var7 = 0; var7 < 32; ++var7) { // L: 704
				for (var8 = -25; var8 < 25; ++var8) { // L: 705
					for (var9 = -25; var9 < 25; ++var9) { // L: 706
						boolean var16 = false; // L: 707

						label84:
						for (var11 = -1; var11 <= 1; ++var11) { // L: 708
							for (var12 = -1; var12 <= 1; ++var12) { // L: 709
								if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 710
									var16 = true; // L: 711
									break label84;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 714
									var16 = true; // L: 715
									break label84; // L: 716
								}

								if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 718
									var16 = true; // L: 719
									break label84; // L: 720
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 722
									var16 = true; // L: 723
									break label84; // L: 724
								}
							}
						}

						visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16; // L: 728
					}
				}
			}
		}

	} // L: 733

	@ObfuscatedName("be")
	static boolean method4576(int var0, int var1, int var2) {
		int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16; // L: 736
		int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16; // L: 737
		int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16; // L: 738
		int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16; // L: 739
		if (var5 >= 50 && var5 <= 3500) { // L: 740
			int var7 = var3 * 128 / var5 + Scene_viewportXCenter; // L: 741
			int var8 = var6 * 128 / var5 + Scene_viewportYCenter; // L: 742
			return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax; // L: 743
		} else {
			return false; // L: 744
		}
	}

	@ObfuscatedName("bw")
	@Export("shouldSendWalk")
	public static boolean shouldSendWalk() {
		return viewportWalking && Scene_selectedX != -1; // L: 763
	}

	@ObfuscatedName("bi")
	public static void method4554() {
		Scene_selectedX = -1; // L: 767
		viewportWalking = false; // L: 768
	} // L: 769

	@ObfuscatedName("br")
	static final int method4689(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1385
		if (var1 < 2) { // L: 1386
			var1 = 2;
		} else if (var1 > 126) { // L: 1387
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1388
	}

	@ObfuscatedName("bu")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) { // L: 1392
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) { // L: 1393
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) { // L: 1394
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) { // L: 1395
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2); // L: 1396
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3); // L: 1397
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7); // L: 1398
			if (var8 == 0) { // L: 1399
				if (var9 != 0) { // L: 1402
					return var9 < 0 ? var10 <= 0 : var10 >= 0; // L: 1403
				} else {
					return true; // L: 1405
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0; // L: 1400
			}
		}
	}
}
