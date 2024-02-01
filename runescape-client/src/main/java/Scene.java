import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Scene")
public class Scene {
	@ObfuscatedName("am")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("aw")
	@Export("tileUpdateCount")
	static int tileUpdateCount;
	@ObfuscatedName("az")
	@Export("Scene_plane")
	static int Scene_plane;
	@ObfuscatedName("av")
	@Export("Scene_drawnCount")
	static int Scene_drawnCount;
	@ObfuscatedName("ak")
	@Export("Scene_cameraXTileMin")
	static int Scene_cameraXTileMin;
	@ObfuscatedName("ay")
	@Export("Scene_cameraXTileMax")
	static int Scene_cameraXTileMax;
	@ObfuscatedName("as")
	@Export("Scene_cameraYTileMin")
	static int Scene_cameraYTileMin;
	@ObfuscatedName("ab")
	@Export("Scene_cameraYTileMax")
	static int Scene_cameraYTileMax;
	@ObfuscatedName("ah")
	@Export("Scene_cameraXTile")
	static int Scene_cameraXTile;
	@ObfuscatedName("ai")
	@Export("Scene_cameraYTile")
	static int Scene_cameraYTile;
	@ObfuscatedName("ac")
	@Export("Scene_cameraX")
	static int Scene_cameraX;
	@ObfuscatedName("al")
	@Export("Scene_cameraY")
	static int Scene_cameraY;
	@ObfuscatedName("at")
	@Export("Scene_cameraZ")
	static int Scene_cameraZ;
	@ObfuscatedName("bj")
	@Export("Scene_cameraPitchSine")
	static int Scene_cameraPitchSine;
	@ObfuscatedName("bd")
	@Export("Scene_cameraPitchCosine")
	static int Scene_cameraPitchCosine;
	@ObfuscatedName("bg")
	@Export("Scene_cameraYawSine")
	static int Scene_cameraYawSine;
	@ObfuscatedName("bt")
	@Export("Scene_cameraYawCosine")
	static int Scene_cameraYawCosine;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "[Lll;"
	)
	@Export("gameObjects")
	static GameObject[] gameObjects;
	@ObfuscatedName("ba")
	@Export("checkClick")
	static boolean checkClick;
	@ObfuscatedName("bk")
	@Export("Scene_selectedPlane")
	static int Scene_selectedPlane;
	@ObfuscatedName("bn")
	@Export("Scene_selectedScreenX")
	static int Scene_selectedScreenX;
	@ObfuscatedName("by")
	@Export("Scene_selectedScreenY")
	static int Scene_selectedScreenY;
	@ObfuscatedName("bc")
	@Export("Scene_selectedX")
	public static int Scene_selectedX;
	@ObfuscatedName("bx")
	@Export("Scene_selectedY")
	public static int Scene_selectedY;
	@ObfuscatedName("bf")
	@Export("viewportWalking")
	static boolean viewportWalking;
	@ObfuscatedName("bm")
	@Export("Scene_planesCount")
	static int Scene_planesCount;
	@ObfuscatedName("bq")
	@Export("Scene_planeOccluderCounts")
	static int[] Scene_planeOccluderCounts;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[[Lkt;"
	)
	@Export("Scene_planeOccluders")
	static Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("bh")
	@Export("Scene_currentOccludersCount")
	static int Scene_currentOccludersCount;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[Lkt;"
	)
	@Export("Scene_currentOccluders")
	static Occluder[] Scene_currentOccluders;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("Scene_tilesDeque")
	static NodeDeque Scene_tilesDeque;
	@ObfuscatedName("bu")
	static final int[] field2877;
	@ObfuscatedName("be")
	static final int[] field2870;
	@ObfuscatedName("bs")
	static final int[] field2873;
	@ObfuscatedName("bl")
	static final int[] field2880;
	@ObfuscatedName("bz")
	static final int[] field2854;
	@ObfuscatedName("bo")
	static final int[] field2887;
	@ObfuscatedName("cg")
	static final int[] field2878;
	@ObfuscatedName("cl")
	@Export("visibilityMap")
	static boolean[][][][] visibilityMap;
	@ObfuscatedName("cs")
	@Export("visibleTiles")
	static boolean[][] visibleTiles;
	@ObfuscatedName("cc")
	@Export("Scene_viewportXCenter")
	static int Scene_viewportXCenter;
	@ObfuscatedName("cd")
	@Export("Scene_viewportYCenter")
	static int Scene_viewportYCenter;
	@ObfuscatedName("cu")
	@Export("Scene_viewportXMin")
	static int Scene_viewportXMin;
	@ObfuscatedName("co")
	@Export("Scene_viewportYMin")
	static int Scene_viewportYMin;
	@ObfuscatedName("cy")
	@Export("Scene_viewportXMax")
	static int Scene_viewportXMax;
	@ObfuscatedName("cn")
	@Export("Scene_viewportYMax")
	static int Scene_viewportYMax;
	@ObfuscatedName("ap")
	@Export("planes")
	int planes;
	@ObfuscatedName("af")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("aj")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("aq")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[[Lkd;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("ag")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ao")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lll;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("aa")
	int[][][] field2840;
	@ObfuscatedName("cp")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("cq")
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
		field2877 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76}; // L: 54
		field2870 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160}; // L: 55
		field2873 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19}; // L: 56
		field2880 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0}; // L: 57
		field2854 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4}; // L: 58
		field2887 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0}; // L: 59
		field2878 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8}; // L: 60
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
		this.field2840 = new int[var1][var2 + 1][var3 + 1]; // L: 100
		this.tileHeights = var4; // L: 101
		this.clear(); // L: 102
	} // L: 103

	@ObfuscatedName("am")
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

	@ObfuscatedName("ap")
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

	@ObfuscatedName("af")
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
					boolean var8 = SequenceDefinition.method4123(var9) == 2; // L: 142
					if (var8 && var7.startX == var1 && var2 == var7.startY) { // L: 144
						--var7.plane;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) { // L: 148
			this.tiles[0][var1][var2] = new Tile(0, var1, var2);
		}

		this.tiles[0][var1][var2].linkedBelowTile = var3; // L: 149
		this.tiles[3][var1][var2] = null; // L: 150
	} // L: 151

	@ObfuscatedName("aq")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 170
		if (var5 != null) { // L: 171
			this.tiles[var1][var2][var3].minPlane = var4; // L: 172
		}
	} // L: 173

	@ObfuscatedName("ar")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) { // L: 176
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false); // L: 177

			for (var22 = var1; var22 >= 0; --var22) { // L: 178
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 179
		} else if (var4 != 1) { // L: 182
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20); // L: 188

			for (var22 = var1; var22 >= 0; --var22) { // L: 189
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23; // L: 190
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7); // L: 183

			for (var22 = var1; var22 >= 0; --var22) { // L: 184
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 185
		}
	} // L: 180 186 191

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIILkp;JI)V"
	)
	@Export("newGroundObject")
	public void newGroundObject(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) { // L: 194
			GroundObject var9 = new GroundObject(); // L: 195
			var9.renderable = var5; // L: 196
			var9.x = var2 * 128 + 64; // L: 197
			var9.y = var3 * 128 + 64; // L: 198
			var9.z = var4; // L: 199
			var9.tag = var6; // L: 200
			var9.flags = var8; // L: 201
			if (this.tiles[var1][var2][var3] == null) { // L: 202
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].groundObject = var9; // L: 203
		}
	} // L: 204

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIILkp;JLkp;Lkp;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer(); // L: 207
		var10.first = var5; // L: 208
		var10.x = var2 * 134217728 + 67108864; // L: 209
		var10.y = var3 * 128 + 64; // L: 210
		var10.z = var4; // L: 211
		var10.tag = var6; // L: 212
		var10.second = var8; // L: 213
		var10.third = var9; // L: 214
		int var11 = 0; // L: 215
		Tile var12 = this.tiles[var1][var2][var3]; // L: 216
		if (var12 != null) { // L: 217
			for (int var13 = 0; var13 < var12.gameObjectsCount; ++var13) { // L: 218
				if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) { // L: 219
					Model var14 = (Model)var12.gameObjects[var13].renderable; // L: 220
					var14.calculateBoundsCylinder(); // L: 221
					if (var14.height > var11) { // L: 222
						var11 = var14.height;
					}
				}
			}
		}

		var10.height = var11; // L: 226
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new Tile(var1, var2, var3); // L: 227
		}

		this.tiles[var1][var2][var3].itemLayer = var10; // L: 228
	} // L: 229

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIILkp;Lkp;IIJI)V"
	)
	@Export("newWallObject")
	public void newWallObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) { // L: 232
			WallObject var12 = new WallObject(); // L: 233
			var12.tag = var9; // L: 234
			var12.flags = var11; // L: 235
			var12.x = var2 * 128 + 64; // L: 236
			var12.y = var3 * 128 + 64; // L: 237
			var12.z = var4; // L: 238
			var12.renderable1 = var5; // L: 239
			var12.renderable2 = var6; // L: 240
			var12.orientationA = var7; // L: 241
			var12.orientationB = var8; // L: 242

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.tiles[var13][var2][var3] == null) {
					this.tiles[var13][var2][var3] = new Tile(var13, var2, var3); // L: 243
				}
			}

			this.tiles[var1][var2][var3].wallObject = var12; // L: 244
		}
	} // L: 245

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIILkp;Lkp;IIIIJI)V"
	)
	@Export("newDecorativeObject")
	public void newDecorativeObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) { // L: 248
			DecorativeObject var14 = new DecorativeObject(); // L: 249
			var14.tag = var11; // L: 250
			var14.flags = var13; // L: 251
			var14.x = var2 * 128 + 64; // L: 252
			var14.y = var3 * 128 + 64; // L: 253
			var14.z = var4; // L: 254
			var14.renderable1 = var5; // L: 255
			var14.renderable2 = var6; // L: 256
			var14.orientation = var7; // L: 257
			var14.orientation2 = var8; // L: 258
			var14.xOffset = var9; // L: 259
			var14.yOffset = var10; // L: 260

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3); // L: 261
				}
			}

			this.tiles[var1][var2][var3].decorativeObject = var14; // L: 262
		}
	} // L: 263

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILkp;IJI)Z"
	)
	public boolean method5521(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) { // L: 266
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128; // L: 267
			int var13 = var6 * 64 + var3 * 128; // L: 268
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11); // L: 269
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIILkp;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
		if (var6 == null) { // L: 273
			return true;
		} else {
			int var11 = var2 - var5; // L: 274
			int var12 = var3 - var5; // L: 275
			int var13 = var5 + var2; // L: 276
			int var14 = var3 + var5; // L: 277
			if (var10) { // L: 278
				if (var7 > 640 && var7 < 1408) { // L: 279
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) { // L: 280
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) { // L: 281
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) { // L: 282
					var11 -= 128;
				}
			}

			var11 /= 128; // L: 284
			var12 /= 128; // L: 285
			var13 /= 128; // L: 286
			var14 /= 128; // L: 287
			return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 288
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIILkp;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 292 293
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILkp;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) { // L: 297
			for (var16 = var3; var16 < var3 + var5; ++var16) { // L: 298
				if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) { // L: 299
					return false;
				}

				Tile var23 = this.tiles[var1][var15][var16]; // L: 300
				if (var23 != null && var23.gameObjectsCount >= 5) { // L: 301
					return false;
				}
			}
		}

		GameObject var21 = new GameObject(); // L: 304
		var21.tag = var12; // L: 305
		var21.flags = var14; // L: 306
		var21.plane = var1; // L: 307
		var21.centerX = var6; // L: 308
		var21.centerY = var7; // L: 309
		var21.z = var8; // L: 310
		var21.renderable = var9; // L: 311
		var21.orientation = var10; // L: 312
		var21.startX = var2; // L: 313
		var21.startY = var3; // L: 314
		var21.endX = var2 + var4 - 1; // L: 315
		var21.endY = var3 + var5 - 1; // L: 316

		for (var16 = var2; var16 < var2 + var4; ++var16) { // L: 317
			for (int var17 = var3; var17 < var3 + var5; ++var17) { // L: 318
				int var18 = 0; // L: 319
				if (var16 > var2) { // L: 320
					++var18;
				}

				if (var16 < var2 + var4 - 1) { // L: 321
					var18 += 4;
				}

				if (var17 > var3) { // L: 322
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) { // L: 323
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.tiles[var19][var16][var17] == null) {
						this.tiles[var19][var16][var17] = new Tile(var19, var16, var17); // L: 324
					}
				}

				Tile var22 = this.tiles[var1][var16][var17]; // L: 325
				var22.gameObjects[var22.gameObjectsCount] = var21; // L: 326
				var22.gameObjectEdgeMasks[var22.gameObjectsCount] = var18; // L: 327
				var22.gameObjectsEdgeMask |= var18; // L: 329
				++var22.gameObjectsCount; // L: 330
			}
		}

		if (var11) { // L: 333
			this.tempGameObjects[this.tempGameObjectsCount++] = var21;
		}

		return true; // L: 334
	}

	@ObfuscatedName("aw")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 338
			GameObject var2 = this.tempGameObjects[var1]; // L: 339
			this.removeGameObject(var2); // L: 340
			this.tempGameObjects[var1] = null; // L: 341
		}

		this.tempGameObjectsCount = 0; // L: 343
	} // L: 344

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lll;)V"
	)
	@Export("removeGameObject")
	void removeGameObject(GameObject var1) {
		for (int var2 = var1.startX; var2 <= var1.endX; ++var2) { // L: 347
			for (int var3 = var1.startY; var3 <= var1.endY; ++var3) { // L: 348
				Tile var4 = this.tiles[var1.plane][var2][var3]; // L: 349
				if (var4 != null) { // L: 350
					int var5;
					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 351
						if (var4.gameObjects[var5] == var1) { // L: 352
							--var4.gameObjectsCount; // L: 353

							for (int var6 = var5; var6 < var4.gameObjectsCount; ++var6) { // L: 354
								var4.gameObjects[var6] = var4.gameObjects[var6 + 1]; // L: 355
								var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1]; // L: 356
							}

							var4.gameObjects[var4.gameObjectsCount] = null; // L: 358
							break;
						}
					}

					var4.gameObjectsEdgeMask = 0; // L: 362

					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 363
						var4.gameObjectsEdgeMask |= var4.gameObjectEdgeMasks[var5]; // L: 365
					}
				}
			}
		}

	} // L: 370

	@ObfuscatedName("av")
	public void method5398(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 373
		if (var5 != null) { // L: 374
			DecorativeObject var6 = var5.decorativeObject; // L: 375
			if (var6 != null) { // L: 376
				var6.xOffset = var4 * var6.xOffset / 16; // L: 377
				var6.yOffset = var4 * var6.yOffset / 16; // L: 378
			}
		}
	} // L: 379

	@ObfuscatedName("ak")
	public void method5399(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 382
		if (var4 != null) {
			var4.wallObject = null; // L: 384
		}
	} // L: 383 385

	@ObfuscatedName("ay")
	public void method5400(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 388
		if (var4 != null) {
			var4.decorativeObject = null; // L: 390
		}
	} // L: 389 391

	@ObfuscatedName("as")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 394
		if (var4 != null) { // L: 395
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 396
				GameObject var6 = var4.gameObjects[var5]; // L: 397
				long var8 = var6.tag; // L: 399
				boolean var7 = SequenceDefinition.method4123(var8) == 2; // L: 401
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 403
					this.removeGameObject(var6); // L: 404
					return; // L: 405
				}
			}

		}
	} // L: 408

	@ObfuscatedName("ab")
	public void method5402(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 411
		if (var4 != null) {
			var4.groundObject = null; // L: 413
		}
	} // L: 412 414

	@ObfuscatedName("ah")
	public void method5403(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 417
		if (var4 != null) {
			var4.itemLayer = null; // L: 419
		}
	} // L: 418 420

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Llv;"
	)
	public WallObject method5404(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 423
		return var4 == null ? null : var4.wallObject; // L: 424 425
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Llu;"
	)
	public DecorativeObject method5469(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 429
		return var4 == null ? null : var4.decorativeObject; // L: 430 431
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Lll;"
	)
	@Export("getGameObject")
	public GameObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 435
		if (var4 == null) { // L: 436
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 437
				GameObject var6 = var4.gameObjects[var5]; // L: 438
				long var8 = var6.tag; // L: 440
				boolean var7 = SequenceDefinition.method4123(var8) == 2; // L: 442
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 444
					return var6;
				}
			}

			return null; // L: 446
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lku;"
	)
	@Export("getGroundObject")
	public GroundObject getGroundObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 450
		return var4 != null && var4.groundObject != null ? var4.groundObject : null; // L: 451 452
	}

	@ObfuscatedName("bj")
	@Export("getWallObjectTag")
	public long getWallObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 456
		return var4 != null && var4.wallObject != null ? var4.wallObject.tag : 0L; // L: 457 458
	}

	@ObfuscatedName("bd")
	@Export("getDecorativeObjectTag")
	public long getDecorativeObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 462
		return var4 != null && var4.decorativeObject != null ? var4.decorativeObject.tag : 0L; // L: 463 464
	}

	@ObfuscatedName("bg")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 468
		if (var4 == null) { // L: 469
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 470
				GameObject var6 = var4.gameObjects[var5]; // L: 471
				long var8 = var6.tag; // L: 473
				boolean var7 = SequenceDefinition.method4123(var8) == 2; // L: 475
				if (var7 && var2 == var6.startX && var3 == var6.startY) { // L: 477
					return var6.tag;
				}
			}

			return 0L; // L: 479
		}
	}

	@ObfuscatedName("bt")
	@Export("getGroundObjectTag")
	public long getGroundObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 483
		return var4 != null && var4.groundObject != null ? var4.groundObject.tag : 0L; // L: 484 485
	}

	@ObfuscatedName("br")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3]; // L: 489
		if (var6 == null) { // L: 490
			return -1;
		} else if (var6.wallObject != null && var6.wallObject.tag == var4) { // L: 491
			return var6.wallObject.flags & 255;
		} else if (var6.decorativeObject != null && var6.decorativeObject.tag == var4) { // L: 492
			return var6.decorativeObject.flags & 255;
		} else if (var6.groundObject != null && var6.groundObject.tag == var4) { // L: 493
			return var6.groundObject.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) { // L: 494
				if (var6.gameObjects[var7].tag == var4) { // L: 495
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1; // L: 497
		}
	}

	@ObfuscatedName("ba")
	public void method5413(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) { // L: 501
			for (int var5 = 0; var5 < this.xSize; ++var5) { // L: 502
				for (int var6 = 0; var6 < this.ySize; ++var6) { // L: 503
					Tile var7 = this.tiles[var4][var5][var6]; // L: 504
					if (var7 != null) { // L: 505
						WallObject var8 = var7.wallObject; // L: 506
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) { // L: 507
							ModelData var9 = (ModelData)var8.renderable1; // L: 508
							this.method5547(var9, var4, var5, var6, 1, 1); // L: 509
							if (var8.renderable2 instanceof ModelData) { // L: 510
								var10 = (ModelData)var8.renderable2; // L: 511
								this.method5547(var10, var4, var5, var6, 1, 1); // L: 512
								ModelData.method5173(var9, var10, 0, 0, 0, false); // L: 513
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 514
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3); // L: 516
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) { // L: 518
							GameObject var14 = var7.gameObjects[var12]; // L: 519
							if (var14 != null && var14.renderable instanceof ModelData) { // L: 520
								ModelData var11 = (ModelData)var14.renderable; // L: 521
								this.method5547(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1); // L: 522
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3); // L: 523
							}
						}

						GroundObject var13 = var7.groundObject; // L: 526
						if (var13 != null && var13.renderable instanceof ModelData) { // L: 527
							var10 = (ModelData)var13.renderable; // L: 528
							this.method5483(var10, var4, var5, var6); // L: 529
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 530
						}
					}
				}
			}
		}

	} // L: 536

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lkm;III)V"
	)
	void method5483(ModelData var1, int var2, int var3, int var4) {
		int var6 = var3 + 1; // L: 540
		int var7 = var4 - 1; // L: 541
		int var8 = var4 + 1; // L: 542

		for (int var9 = var3; var9 <= var6; ++var9) { // L: 543
			if (var9 >= 0 && var9 < this.xSize) { // L: 544
				for (int var10 = var7; var10 <= var8; ++var10) { // L: 545
					if (var10 >= 0 && var10 < this.ySize && (var9 >= var6 || var10 >= var8)) { // L: 546 547
						Tile var11 = this.tiles[var2][var9][var10]; // L: 548
						if (var11 != null && var11.groundObject != null && var11.groundObject.renderable instanceof ModelData) { // L: 549 550
							int var12 = this.method5416(var2, var9, var10, var2, var3, var4); // L: 551
							ModelData var13 = (ModelData)var11.groundObject.renderable; // L: 552
							ModelData.method5173(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true); // L: 553
						}
					}
				}
			}
		}

	} // L: 557

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lkm;IIIII)V"
	)
	void method5547(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 560
		int var8 = var3; // L: 561
		int var9 = var3 + var5; // L: 562
		int var10 = var4 - 1; // L: 563
		int var11 = var4 + var6; // L: 564

		for (int var12 = var2; var12 <= var2 + 1; ++var12) { // L: 565
			if (var12 != this.planes) { // L: 566
				for (int var13 = var8; var13 <= var9; ++var13) { // L: 567
					if (var13 >= 0 && var13 < this.xSize) { // L: 568
						for (int var14 = var10; var14 <= var11; ++var14) { // L: 569
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) { // L: 570 571
								Tile var15 = this.tiles[var12][var13][var14]; // L: 572
								if (var15 != null) { // L: 573
									int var16 = this.method5416(var12, var13, var14, var2, var3, var4); // L: 574
									WallObject var17 = var15.wallObject; // L: 575
									if (var17 != null) { // L: 576
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) { // L: 577
											var18 = (ModelData)var17.renderable1; // L: 578
											ModelData.method5173(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 579
										}

										if (var17.renderable2 instanceof ModelData) { // L: 581
											var18 = (ModelData)var17.renderable2; // L: 582
											ModelData.method5173(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 583
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) { // L: 586
										GameObject var19 = var15.gameObjects[var23]; // L: 587
										if (var19 != null && var19.renderable instanceof ModelData) { // L: 588
											ModelData var20 = (ModelData)var19.renderable; // L: 589
											int var21 = var19.endX - var19.startX + 1; // L: 590
											int var22 = var19.endY - var19.startY + 1; // L: 591
											ModelData.method5173(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7); // L: 592
										}
									}
								}
							}
						}
					}
				}

				--var8; // L: 597
				var7 = false; // L: 598
			}
		}

	} // L: 600

	@ObfuscatedName("by")
	int method5416(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method5417(var1, var2, var3) - this.method5417(var4, var5, var6); // L: 603
	}

	@ObfuscatedName("bc")
	int method5417(int var1, int var2, int var3) {
		return (this.tileHeights[var1][var2 + 1][var3 + 1] + this.tileHeights[var1][var2][var3] + this.tileHeights[var1][var2][var3 + 1] + this.tileHeights[var1][var2 + 1][var3]) / 4; // L: 607
	}

	@ObfuscatedName("bx")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6]; // L: 611
		if (var7 != null) { // L: 612
			SceneTilePaint var8 = var7.paint; // L: 613
			int var10;
			if (var8 != null) { // L: 614
				int var18 = var8.rgb; // L: 615
				if (var18 != 0) { // L: 616
					for (var10 = 0; var10 < 4; ++var10) { // L: 617
						var1[var2] = var18; // L: 618
						var1[var2 + 1] = var18; // L: 619
						var1[var2 + 2] = var18; // L: 620
						var1[var2 + 3] = var18; // L: 621
						var2 += var3; // L: 622
					}

				}
			} else {
				SceneTileModel var9 = var7.model; // L: 626
				if (var9 != null) { // L: 627
					var10 = var9.shape; // L: 628
					int var11 = var9.rotation; // L: 629
					int var12 = var9.underlayRgb; // L: 630
					int var13 = var9.overlayRgb; // L: 631
					int[] var14 = this.tileShape2D[var10]; // L: 632
					int[] var15 = this.tileRotation2D[var11]; // L: 633
					int var16 = 0; // L: 634
					int var17;
					if (var12 != 0) { // L: 635
						for (var17 = 0; var17 < 4; ++var17) { // L: 636
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 637
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 638
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 639
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 640
							var2 += var3; // L: 641
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) { // L: 645
							if (var14[var15[var16++]] != 0) { // L: 646
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 647
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 648
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 649
								var1[var2 + 3] = var13;
							}

							var2 += var3; // L: 650
						}
					}

				}
			}
		}
	} // L: 624 653

	@ObfuscatedName("bv")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!shouldSendWalk() || var4) { // L: 732
			checkClick = true; // L: 733
			viewportWalking = var4; // L: 734
			Scene_selectedPlane = var1; // L: 735
			Scene_selectedScreenX = var2; // L: 736
			Scene_selectedScreenY = var3; // L: 737
			Scene_selectedX = -1; // L: 738
			Scene_selectedY = -1; // L: 739
		}
	} // L: 740

	@ObfuscatedName("bm")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		viewportWalking = true; // L: 743
	} // L: 744

	@ObfuscatedName("bh")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) { // L: 756
			var1 = 0;
		} else if (var1 >= this.xSize * 128) { // L: 757
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) { // L: 758
			var3 = 0;
		} else if (var3 >= this.ySize * 128) { // L: 759
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) { // L: 760
			var4 = 128;
		} else if (var4 > 383) { // L: 761
			var4 = 383;
		}

		++Scene_drawnCount; // L: 762
		Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 763
		Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 764
		Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5]; // L: 765
		Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5]; // L: 766
		visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64]; // L: 767
		Scene_cameraX = var1; // L: 768
		Scene_cameraY = var2; // L: 769
		Scene_cameraZ = var3; // L: 770
		Scene_cameraXTile = var1 / 128; // L: 771
		Scene_cameraYTile = var3 / 128; // L: 772
		Scene_plane = var6; // L: 773
		Scene_cameraXTileMin = Scene_cameraXTile - 25; // L: 774
		if (Scene_cameraXTileMin < 0) { // L: 775
			Scene_cameraXTileMin = 0;
		}

		Scene_cameraYTileMin = Scene_cameraYTile - 25; // L: 776
		if (Scene_cameraYTileMin < 0) { // L: 777
			Scene_cameraYTileMin = 0;
		}

		Scene_cameraXTileMax = Scene_cameraXTile + 25; // L: 778
		if (Scene_cameraXTileMax > this.xSize) { // L: 779
			Scene_cameraXTileMax = this.xSize;
		}

		Scene_cameraYTileMax = Scene_cameraYTile + 25; // L: 780
		if (Scene_cameraYTileMax > this.ySize) { // L: 781
			Scene_cameraYTileMax = this.ySize;
		}

		this.occlude(); // L: 782
		tileUpdateCount = 0; // L: 783

		int var7;
		Tile[][] var8;
		int var9;
		int var10;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 784
			var8 = this.tiles[var7]; // L: 785

			for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) { // L: 786
				for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) { // L: 787
					Tile var16 = var8[var9][var10]; // L: 788
					if (var16 != null) { // L: 789
						if (var16.minPlane <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) { // L: 790
							var16.drawPrimary = true; // L: 796
							var16.drawSecondary = true; // L: 797
							if (var16.gameObjectsCount > 0) { // L: 798
								var16.drawGameObjects = true;
							} else {
								var16.drawGameObjects = false; // L: 799
							}

							++tileUpdateCount; // L: 800
						} else {
							var16.drawPrimary = false; // L: 791
							var16.drawSecondary = false; // L: 792
							var16.drawGameObjectEdges = 0; // L: 793
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
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 806
			var8 = this.tiles[var7]; // L: 807

			for (var9 = -25; var9 <= 0; ++var9) { // L: 808
				var10 = var9 + Scene_cameraXTile; // L: 809
				var11 = Scene_cameraXTile - var9; // L: 810
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 811
					for (var12 = -25; var12 <= 0; ++var12) { // L: 812
						var13 = var12 + Scene_cameraYTile; // L: 813
						var14 = Scene_cameraYTile - var12; // L: 814
						if (var10 >= Scene_cameraXTileMin) { // L: 815
							if (var13 >= Scene_cameraYTileMin) { // L: 816
								var15 = var8[var10][var13]; // L: 817
								if (var15 != null && var15.drawPrimary) { // L: 818
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 820
								var15 = var8[var10][var14]; // L: 821
								if (var15 != null && var15.drawPrimary) { // L: 822
									this.drawTile(var15, true);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 825
							if (var13 >= Scene_cameraYTileMin) { // L: 826
								var15 = var8[var11][var13]; // L: 827
								if (var15 != null && var15.drawPrimary) { // L: 828
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 830
								var15 = var8[var11][var14]; // L: 831
								if (var15 != null && var15.drawPrimary) { // L: 832
									this.drawTile(var15, true);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 835
							checkClick = false; // L: 836
							return; // L: 837
						}
					}
				}
			}
		}

		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 843
			var8 = this.tiles[var7]; // L: 844

			for (var9 = -25; var9 <= 0; ++var9) { // L: 845
				var10 = var9 + Scene_cameraXTile; // L: 846
				var11 = Scene_cameraXTile - var9; // L: 847
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 848
					for (var12 = -25; var12 <= 0; ++var12) { // L: 849
						var13 = var12 + Scene_cameraYTile; // L: 850
						var14 = Scene_cameraYTile - var12; // L: 851
						if (var10 >= Scene_cameraXTileMin) { // L: 852
							if (var13 >= Scene_cameraYTileMin) { // L: 853
								var15 = var8[var10][var13]; // L: 854
								if (var15 != null && var15.drawPrimary) { // L: 855
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 857
								var15 = var8[var10][var14]; // L: 858
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, false); // L: 859
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 862
							if (var13 >= Scene_cameraYTileMin) { // L: 863
								var15 = var8[var11][var13]; // L: 864
								if (var15 != null && var15.drawPrimary) { // L: 865
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 867
								var15 = var8[var11][var14]; // L: 868
								if (var15 != null && var15.drawPrimary) { // L: 869
									this.drawTile(var15, false);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 872
							checkClick = false; // L: 873
							return; // L: 874
						}
					}
				}
			}
		}

		checkClick = false; // L: 880
	} // L: 881

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lkd;Z)V"
	)
	@Export("drawTile")
	void drawTile(Tile var1, boolean var2) {
		Scene_tilesDeque.addFirst(var1); // L: 884

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
												var3 = (Tile)Scene_tilesDeque.removeLast(); // L: 886
												if (var3 == null) { // L: 887
													return;
												}
											} while(!var3.drawSecondary); // L: 888

											var4 = var3.x; // L: 889
											var5 = var3.y; // L: 890
											var6 = var3.plane; // L: 891
											var7 = var3.originalPlane; // L: 892
											var8 = this.tiles[var6]; // L: 893
											if (!var3.drawPrimary) { // L: 894
												break;
											}

											if (var2) { // L: 895
												if (var6 > 0) { // L: 896
													var9 = this.tiles[var6 - 1][var4][var5]; // L: 897
													if (var9 != null && var9.drawSecondary) { // L: 898
														continue;
													}
												}

												if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) { // L: 900
													var9 = var8[var4 - 1][var5]; // L: 901
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 1) == 0)) { // L: 902
														continue;
													}
												}

												if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) { // L: 904
													var9 = var8[var4 + 1][var5]; // L: 905
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 4) == 0)) { // L: 906
														continue;
													}
												}

												if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) { // L: 908
													var9 = var8[var4][var5 - 1]; // L: 909
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 8) == 0)) { // L: 910
														continue;
													}
												}

												if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) { // L: 912
													var9 = var8[var4][var5 + 1]; // L: 913
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 2) == 0)) { // L: 914
														continue;
													}
												}
											} else {
												var2 = true; // L: 917
											}

											var3.drawPrimary = false; // L: 918
											if (var3.linkedBelowTile != null) { // L: 919
												var9 = var3.linkedBelowTile; // L: 920
												if (var9.paint != null) { // L: 921
													if (!this.method5392(0, var4, var5)) { // L: 922
														this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												} else if (var9.model != null && !this.method5392(0, var4, var5)) { // L: 924 925
													this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
												}

												var10 = var9.wallObject; // L: 927
												if (var10 != null) { // L: 928
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * 4096 - Scene_cameraX, var10.z - Scene_cameraY, var10.y * 4096 - Scene_cameraZ, var10.tag);
												}

												for (var11 = 0; var11 < var9.gameObjectsCount; ++var11) { // L: 929
													var12 = var9.gameObjects[var11]; // L: 930
													if (var12 != null) { // L: 931
														var12.renderable.draw(var12.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX - Scene_cameraX, var12.z - Scene_cameraY, var12.centerY - Scene_cameraZ, var12.tag);
													}
												}
											}

											var20 = false; // L: 934
											if (var3.paint != null) { // L: 935
												if (!this.method5392(var7, var4, var5)) { // L: 936
													var20 = true; // L: 937
													if (var3.paint.neColor != 12345678 || checkClick && var6 <= Scene_selectedPlane) { // L: 938
														this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												}
											} else if (var3.model != null && !this.method5392(var7, var4, var5)) { // L: 941 942
												var20 = true; // L: 943
												this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5); // L: 944
											}

											var21 = 0; // L: 947
											var11 = 0; // L: 948
											WallObject var31 = var3.wallObject; // L: 949
											DecorativeObject var13 = var3.decorativeObject; // L: 950
											if (var31 != null || var13 != null) { // L: 951
												if (var4 == Scene_cameraXTile) { // L: 952
													++var21;
												} else if (Scene_cameraXTile < var4) { // L: 953
													var21 += 2;
												}

												if (var5 == Scene_cameraYTile) { // L: 954
													var21 += 3;
												} else if (Scene_cameraYTile > var5) { // L: 955
													var21 += 6;
												}

												var11 = field2877[var21]; // L: 956
												var3.field2799 = field2873[var21]; // L: 957
											}

											if (var31 != null) { // L: 959
												if ((var31.orientationA & field2870[var21]) != 0) { // L: 960
													if (var31.orientationA == 16) { // L: 961
														var3.drawGameObjectEdges = 3; // L: 962
														var3.field2780 = field2880[var21]; // L: 963
														var3.field2796 = 3 - var3.field2780; // L: 964
													} else if (var31.orientationA == 32) { // L: 966
														var3.drawGameObjectEdges = 6; // L: 967
														var3.field2780 = field2854[var21]; // L: 968
														var3.field2796 = 6 - var3.field2780; // L: 969
													} else if (var31.orientationA == 64) { // L: 971
														var3.drawGameObjectEdges = 12; // L: 972
														var3.field2780 = field2887[var21]; // L: 973
														var3.field2796 = 12 - var3.field2780; // L: 974
													} else {
														var3.drawGameObjectEdges = 9; // L: 977
														var3.field2780 = field2878[var21]; // L: 978
														var3.field2796 = 9 - var3.field2780; // L: 979
													}
												} else {
													var3.drawGameObjectEdges = 0; // L: 982
												}

												if ((var31.orientationA & var11) != 0 && !this.method5433(var7, var4, var5, var31.orientationA)) { // L: 983
													var31.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * 4096 - Scene_cameraX, var31.z - Scene_cameraY, var31.y * 4096 - Scene_cameraZ, var31.tag);
												}

												if ((var31.orientationB & var11) != 0 && !this.method5433(var7, var4, var5, var31.orientationB)) { // L: 984
													var31.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * 4096 - Scene_cameraX, var31.z - Scene_cameraY, var31.y * 4096 - Scene_cameraZ, var31.tag);
												}
											}

											if (var13 != null && !this.method5434(var7, var4, var5, var13.renderable1.height)) { // L: 986
												if ((var13.orientation & var11) != 0) { // L: 987
													var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.xOffset + (var13.x * 4096 - Scene_cameraX), var13.z - Scene_cameraY, var13.yOffset + (var13.y * 4096 - Scene_cameraZ), var13.tag); // L: 988
												} else if (var13.orientation == 256) { // L: 990
													var14 = var13.x * 4096 - Scene_cameraX; // L: 991
													var15 = var13.z - Scene_cameraY; // L: 992
													var16 = var13.y * 4096 - Scene_cameraZ; // L: 993
													var17 = var13.orientation2; // L: 994
													if (var17 != 1 && var17 != 2) { // L: 996
														var18 = var14; // L: 997
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) { // L: 999
														var19 = var16; // L: 1000
													} else {
														var19 = -var16;
													}

													if (var19 < var18) { // L: 1001
														var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset, var15, var16 + var13.yOffset, var13.tag); // L: 1002
													} else if (var13.renderable2 != null) { // L: 1004
														var13.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag); // L: 1005
													}
												}
											}

											if (var20) { // L: 1009
												GroundObject var22 = var3.groundObject; // L: 1010
												if (var22 != null) { // L: 1011
													var22.renderable.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var22.x * 4096 - Scene_cameraX, var22.z - Scene_cameraY, var22.y * 4096 - Scene_cameraZ, var22.tag);
												}

												ItemLayer var23 = var3.itemLayer; // L: 1012
												if (var23 != null && var23.height == 0) { // L: 1013
													if (var23.second != null) { // L: 1014
														var23.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 64 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}

													if (var23.third != null) { // L: 1015
														var23.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 64 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}

													if (var23.first != null) { // L: 1016
														var23.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 64 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}
												}
											}

											var14 = var3.gameObjectsEdgeMask; // L: 1019
											if (var14 != 0) { // L: 1020
												if (var4 < Scene_cameraXTile && (var14 & 4) != 0) { // L: 1021
													var36 = var8[var4 + 1][var5]; // L: 1022
													if (var36 != null && var36.drawSecondary) { // L: 1023
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 < Scene_cameraYTile && (var14 & 2) != 0) { // L: 1025
													var36 = var8[var4][var5 + 1]; // L: 1026
													if (var36 != null && var36.drawSecondary) { // L: 1027
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var4 > Scene_cameraXTile && (var14 & 1) != 0) { // L: 1029
													var36 = var8[var4 - 1][var5]; // L: 1030
													if (var36 != null && var36.drawSecondary) { // L: 1031
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > Scene_cameraYTile && (var14 & 8) != 0) { // L: 1033
													var36 = var8[var4][var5 - 1]; // L: 1034
													if (var36 != null && var36.drawSecondary) { // L: 1035
														Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var3.drawGameObjectEdges != 0) { // L: 1039
											var20 = true; // L: 1040

											for (var21 = 0; var21 < var3.gameObjectsCount; ++var21) { // L: 1041
												if (var3.gameObjects[var21].lastDrawn != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.drawGameObjectEdges) == var3.field2780) { // L: 1042
													var20 = false; // L: 1043
													break; // L: 1044
												}
											}

											if (var20) { // L: 1047
												var10 = var3.wallObject; // L: 1048
												if (!this.method5433(var7, var4, var5, var10.orientationA)) { // L: 1049
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * 4096 - Scene_cameraX, var10.z - Scene_cameraY, var10.y * 4096 - Scene_cameraZ, var10.tag);
												}

												var3.drawGameObjectEdges = 0; // L: 1050
											}
										}

										if (!var3.drawGameObjects) { // L: 1053
											break;
										}

										try {
											int var34 = var3.gameObjectsCount; // L: 1055
											var3.drawGameObjects = false; // L: 1056
											var21 = 0; // L: 1057

											label563:
											for (var11 = 0; var11 < var34; ++var11) { // L: 1058
												var12 = var3.gameObjects[var11]; // L: 1059
												if (var12.lastDrawn != Scene_drawnCount) { // L: 1060
													for (var24 = var12.startX; var24 <= var12.endX; ++var24) { // L: 1061
														for (var14 = var12.startY; var14 <= var12.endY; ++var14) { // L: 1062
															var36 = var8[var24][var14]; // L: 1063
															if (var36.drawPrimary) { // L: 1064
																var3.drawGameObjects = true; // L: 1065
																continue label563; // L: 1066
															}

															if (var36.drawGameObjectEdges != 0) { // L: 1068
																var16 = 0; // L: 1069
																if (var24 > var12.startX) { // L: 1070
																	++var16;
																}

																if (var24 < var12.endX) { // L: 1071
																	var16 += 4;
																}

																if (var14 > var12.startY) { // L: 1072
																	var16 += 8;
																}

																if (var14 < var12.endY) { // L: 1073
																	var16 += 2;
																}

																if ((var16 & var36.drawGameObjectEdges) == var3.field2796) { // L: 1074
																	var3.drawGameObjects = true; // L: 1075
																	continue label563; // L: 1076
																}
															}
														}
													}

													gameObjects[var21++] = var12; // L: 1081
													var24 = Scene_cameraXTile - var12.startX; // L: 1082
													var14 = var12.endX - Scene_cameraXTile; // L: 1083
													if (var14 > var24) { // L: 1084
														var24 = var14;
													}

													var15 = Scene_cameraYTile - var12.startY; // L: 1085
													var16 = var12.endY - Scene_cameraYTile; // L: 1086
													if (var16 > var15) { // L: 1087
														var12.field3134 = var24 + var16;
													} else {
														var12.field3134 = var24 + var15; // L: 1088
													}
												}
											}

											while (var21 > 0) { // L: 1091
												var11 = -50; // L: 1092
												var25 = -1; // L: 1093

												for (var24 = 0; var24 < var21; ++var24) { // L: 1094
													GameObject var35 = gameObjects[var24]; // L: 1095
													if (var35.lastDrawn != Scene_drawnCount) { // L: 1096
														if (var35.field3134 > var11) { // L: 1097
															var11 = var35.field3134; // L: 1098
															var25 = var24; // L: 1099
														} else if (var11 == var35.field3134) { // L: 1101
															var15 = var35.centerX - Scene_cameraX; // L: 1102
															var16 = var35.centerY - Scene_cameraZ; // L: 1103
															var17 = gameObjects[var25].centerX - Scene_cameraX; // L: 1104
															var18 = gameObjects[var25].centerY - Scene_cameraZ; // L: 1105
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) { // L: 1106
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) { // L: 1110
													break;
												}

												GameObject var33 = gameObjects[var25]; // L: 1111
												var33.lastDrawn = Scene_drawnCount; // L: 1112
												if (!this.method5435(var7, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) { // L: 1113
													var33.renderable.draw(var33.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX - Scene_cameraX, var33.z - Scene_cameraY, var33.centerY - Scene_cameraZ, var33.tag); // L: 1114
												}

												for (var14 = var33.startX; var14 <= var33.endX; ++var14) { // L: 1116
													for (var15 = var33.startY; var15 <= var33.endY; ++var15) { // L: 1117
														Tile var26 = var8[var14][var15]; // L: 1118
														if (var26.drawGameObjectEdges != 0) { // L: 1119
															Scene_tilesDeque.addFirst(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.drawSecondary) { // L: 1120
															Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var3.drawGameObjects) { // L: 1124
												break;
											}
										} catch (Exception var28) { // L: 1126
											var3.drawGameObjects = false; // L: 1127
											break;
										}
									}
								} while(!var3.drawSecondary); // L: 1130
							} while(var3.drawGameObjectEdges != 0); // L: 1131

							if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) { // L: 1132
								break;
							}

							var9 = var8[var4 - 1][var5]; // L: 1133
						} while(var9 != null && var9.drawSecondary); // L: 1134

						if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) { // L: 1136
							break;
						}

						var9 = var8[var4 + 1][var5]; // L: 1137
					} while(var9 != null && var9.drawSecondary); // L: 1138

					if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) { // L: 1140
						break;
					}

					var9 = var8[var4][var5 - 1]; // L: 1141
				} while(var9 != null && var9.drawSecondary); // L: 1142

				if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) { // L: 1144
					break;
				}

				var9 = var8[var4][var5 + 1]; // L: 1145
			} while(var9 != null && var9.drawSecondary); // L: 1146

			var3.drawSecondary = false; // L: 1148
			--tileUpdateCount; // L: 1149
			ItemLayer var32 = var3.itemLayer; // L: 1150
			if (var32 != null && var32.height != 0) { // L: 1151
				if (var32.second != null) { // L: 1152
					var32.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 64 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}

				if (var32.third != null) { // L: 1153
					var32.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 64 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}

				if (var32.first != null) { // L: 1154
					var32.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 64 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}
			}

			if (var3.field2799 != 0) { // L: 1156
				DecorativeObject var29 = var3.decorativeObject; // L: 1157
				if (var29 != null && !this.method5434(var7, var4, var5, var29.renderable1.height)) { // L: 1158
					if ((var29.orientation & var3.field2799) != 0) { // L: 1159
						var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.xOffset + (var29.x * 4096 - Scene_cameraX), var29.z - Scene_cameraY, var29.yOffset + (var29.y * 4096 - Scene_cameraZ), var29.tag); // L: 1160
					} else if (var29.orientation == 256) { // L: 1162
						var11 = var29.x * 4096 - Scene_cameraX; // L: 1163
						var25 = var29.z - Scene_cameraY; // L: 1164
						var24 = var29.y * 4096 - Scene_cameraZ; // L: 1165
						var14 = var29.orientation2; // L: 1166
						if (var14 != 1 && var14 != 2) { // L: 1168
							var15 = var11; // L: 1169
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) { // L: 1171
							var16 = var24; // L: 1172
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) { // L: 1173
							var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var29.xOffset, var25, var24 + var29.yOffset, var29.tag); // L: 1174
						} else if (var29.renderable2 != null) { // L: 1176
							var29.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var25, var24, var29.tag); // L: 1177
						}
					}
				}

				WallObject var27 = var3.wallObject; // L: 1181
				if (var27 != null) { // L: 1182
					if ((var27.orientationB & var3.field2799) != 0 && !this.method5433(var7, var4, var5, var27.orientationB)) { // L: 1183
						var27.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 4096 - Scene_cameraX, var27.z - Scene_cameraY, var27.y * 4096 - Scene_cameraZ, var27.tag);
					}

					if ((var27.orientationA & var3.field2799) != 0 && !this.method5433(var7, var4, var5, var27.orientationA)) { // L: 1184
						var27.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 4096 - Scene_cameraX, var27.z - Scene_cameraY, var27.y * 4096 - Scene_cameraZ, var27.tag);
					}
				}
			}

			Tile var30;
			if (var6 < this.planes - 1) { // L: 1187
				var30 = this.tiles[var6 + 1][var4][var5]; // L: 1188
				if (var30 != null && var30.drawSecondary) { // L: 1189
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 < Scene_cameraXTile) { // L: 1191
				var30 = var8[var4 + 1][var5]; // L: 1192
				if (var30 != null && var30.drawSecondary) { // L: 1193
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < Scene_cameraYTile) { // L: 1195
				var30 = var8[var4][var5 + 1]; // L: 1196
				if (var30 != null && var30.drawSecondary) { // L: 1197
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 > Scene_cameraXTile) { // L: 1199
				var30 = var8[var4 - 1][var5]; // L: 1200
				if (var30 != null && var30.drawSecondary) { // L: 1201
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > Scene_cameraYTile) { // L: 1203
				var30 = var8[var4][var5 - 1]; // L: 1204
				if (var30 != null && var30.drawSecondary) { // L: 1205
					Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lkh;IIIIIII)V"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - Scene_cameraX; // L: 1213
		int var11;
		int var12 = var11 = (var8 << 7) - Scene_cameraZ; // L: 1215
		int var13;
		int var14 = var13 = var10 + 128; // L: 1217
		int var15;
		int var16 = var15 = var12 + 128; // L: 1219
		int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY; // L: 1220
		int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY; // L: 1221
		int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY; // L: 1222
		int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY; // L: 1223
		int var21 = var10 * var6 + var5 * var12 >> 16; // L: 1224
		var12 = var12 * var6 - var5 * var10 >> 16; // L: 1225
		var10 = var21; // L: 1226
		var21 = var17 * var4 - var3 * var12 >> 16; // L: 1227
		var12 = var3 * var17 + var12 * var4 >> 16; // L: 1228
		var17 = var21; // L: 1229
		if (var12 >= 50) { // L: 1230
			var21 = var14 * var6 + var5 * var11 >> 16; // L: 1231
			var11 = var11 * var6 - var5 * var14 >> 16; // L: 1232
			var14 = var21; // L: 1233
			var21 = var18 * var4 - var3 * var11 >> 16; // L: 1234
			var11 = var3 * var18 + var11 * var4 >> 16; // L: 1235
			var18 = var21; // L: 1236
			if (var11 >= 50) { // L: 1237
				var21 = var13 * var6 + var5 * var16 >> 16; // L: 1238
				var16 = var16 * var6 - var5 * var13 >> 16; // L: 1239
				var13 = var21; // L: 1240
				var21 = var19 * var4 - var3 * var16 >> 16; // L: 1241
				var16 = var3 * var19 + var16 * var4 >> 16; // L: 1242
				var19 = var21; // L: 1243
				if (var16 >= 50) { // L: 1244
					var21 = var9 * var6 + var5 * var15 >> 16; // L: 1245
					var15 = var15 * var6 - var5 * var9 >> 16; // L: 1246
					var9 = var21; // L: 1247
					var21 = var20 * var4 - var3 * var15 >> 16; // L: 1248
					var15 = var3 * var20 + var15 * var4 >> 16; // L: 1249
					if (var15 >= 50) { // L: 1251
						int var22 = Rasterizer3D.method5269() + var10 * Rasterizer3D.method5320() / var12; // L: 1252
						int var23 = Rasterizer3D.method5253() + var17 * Rasterizer3D.method5320() / var12; // L: 1253
						int var24 = Rasterizer3D.method5269() + var14 * Rasterizer3D.method5320() / var11; // L: 1254
						int var25 = Rasterizer3D.method5253() + var18 * Rasterizer3D.method5320() / var11; // L: 1255
						int var26 = Rasterizer3D.method5269() + var13 * Rasterizer3D.method5320() / var16; // L: 1256
						int var27 = Rasterizer3D.method5253() + var19 * Rasterizer3D.method5320() / var16; // L: 1257
						int var28 = Rasterizer3D.method5269() + var9 * Rasterizer3D.method5320() / var15; // L: 1258
						int var29 = Rasterizer3D.method5253() + var21 * Rasterizer3D.method5320() / var15; // L: 1259
						float var30 = SoundSystem.method871(var12); // L: 1260
						float var31 = SoundSystem.method871(var11); // L: 1261
						float var32 = SoundSystem.method871(var16); // L: 1262
						float var33 = SoundSystem.method871(var15); // L: 1263
						Rasterizer3D.field2809.field3081 = 0; // L: 1264
						int var34;
						int var35;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) { // L: 1265
							Rasterizer3D.field2809.field3098 = false; // L: 1266
							var34 = Rasterizer3D.method5259(); // L: 1267
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) { // L: 1268
								Rasterizer3D.field2809.field3098 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) { // L: 1269
								Scene_selectedX = var7; // L: 1270
								Scene_selectedY = var8; // L: 1271
							}

							if (var1.texture == -1) { // L: 1273
								if (var1.neColor != 12345678) { // L: 1274
									Rasterizer3D.method5266(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.neColor, var1.nwColor, var1.seColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1276
								if (var1.isFlat) { // L: 1277
									Rasterizer3D.method5268(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
								} else {
									Rasterizer3D.method5268(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture); // L: 1278
								}
							} else {
								var35 = Rasterizer3D.field2809.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1281
								Rasterizer3D.method5266(var27, var29, var25, var26, var28, var24, var32, var33, var31, method5429(var35, var1.neColor), method5429(var35, var1.nwColor), method5429(var35, var1.seColor)); // L: 1282
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) { // L: 1285
							Rasterizer3D.field2809.field3098 = false; // L: 1286
							var34 = Rasterizer3D.method5259(); // L: 1287
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) { // L: 1288
								Rasterizer3D.field2809.field3098 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) { // L: 1289
								Scene_selectedX = var7; // L: 1290
								Scene_selectedY = var8; // L: 1291
							}

							if (var1.texture == -1) { // L: 1293
								if (var1.swColor != 12345678) { // L: 1294
									Rasterizer3D.method5266(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.swColor, var1.seColor, var1.nwColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1296
								Rasterizer3D.method5268(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture); // L: 1297
							} else {
								var35 = Rasterizer3D.field2809.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1300
								Rasterizer3D.method5266(var23, var25, var29, var22, var24, var28, var30, var31, var33, method5429(var35, var1.swColor), method5429(var35, var1.seColor), method5429(var35, var1.nwColor)); // L: 1301
							}
						}

					}
				}
			}
		}
	} // L: 1304

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lkc;IIIIII)V"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length; // L: 1307

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) { // L: 1308
			var10 = var1.vertexX[var9] - Scene_cameraX; // L: 1309
			var11 = var1.vertexY[var9] - Scene_cameraY; // L: 1310
			var12 = var1.vertexZ[var9] - Scene_cameraZ; // L: 1311
			var13 = var12 * var4 + var5 * var10 >> 16; // L: 1312
			var12 = var5 * var12 - var10 * var4 >> 16; // L: 1313
			var10 = var13; // L: 1314
			var13 = var3 * var11 - var12 * var2 >> 16; // L: 1315
			var12 = var11 * var2 + var3 * var12 >> 16; // L: 1316
			if (var12 < 50) { // L: 1318
				return;
			}

			if (var1.triangleTextureId != null) { // L: 1319
				SceneTileModel.field2964[var9] = var10; // L: 1320
				SceneTileModel.field2965[var9] = var13; // L: 1321
				SceneTileModel.field2956[var9] = var12; // L: 1322
			}

			SceneTileModel.field2952[var9] = Rasterizer3D.method5269() + var10 * Rasterizer3D.method5320() / var12; // L: 1324
			SceneTileModel.field2962[var9] = Rasterizer3D.method5253() + var13 * Rasterizer3D.method5320() / var12; // L: 1325
			SceneTileModel.field2954[var9] = SoundSystem.method871(var12); // L: 1326
		}

		Rasterizer3D.field2809.field3081 = 0; // L: 1328
		var8 = var1.faceX.length; // L: 1329

		for (var9 = 0; var9 < var8; ++var9) { // L: 1330
			var10 = var1.faceX[var9]; // L: 1331
			var11 = var1.faceY[var9]; // L: 1332
			var12 = var1.faceZ[var9]; // L: 1333
			var13 = SceneTileModel.field2952[var10]; // L: 1334
			int var14 = SceneTileModel.field2952[var11]; // L: 1335
			int var15 = SceneTileModel.field2952[var12]; // L: 1336
			int var16 = SceneTileModel.field2962[var10]; // L: 1337
			int var17 = SceneTileModel.field2962[var11]; // L: 1338
			int var18 = SceneTileModel.field2962[var12]; // L: 1339
			float var19 = SceneTileModel.field2954[var10]; // L: 1340
			float var20 = SceneTileModel.field2954[var11]; // L: 1341
			float var21 = SceneTileModel.field2954[var12]; // L: 1342
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) { // L: 1343
				Rasterizer3D.field2809.field3098 = false; // L: 1344
				int var22 = Rasterizer3D.method5259(); // L: 1345
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) { // L: 1346
					Rasterizer3D.field2809.field3098 = true;
				}

				if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) { // L: 1347
					Scene_selectedX = var6; // L: 1348
					Scene_selectedY = var7; // L: 1349
				}

				if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) { // L: 1351
					if (!Scene_isLowDetail) { // L: 1355
						if (var1.field2961) { // L: 1356
							Rasterizer3D.method5268(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2964[0], SceneTileModel.field2964[1], SceneTileModel.field2964[3], SceneTileModel.field2965[0], SceneTileModel.field2965[1], SceneTileModel.field2965[3], SceneTileModel.field2956[0], SceneTileModel.field2956[1], SceneTileModel.field2956[3], var1.triangleTextureId[var9]);
						} else {
							Rasterizer3D.method5268(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2964[var10], SceneTileModel.field2964[var11], SceneTileModel.field2964[var12], SceneTileModel.field2965[var10], SceneTileModel.field2965[var11], SceneTileModel.field2965[var12], SceneTileModel.field2956[var10], SceneTileModel.field2956[var11], SceneTileModel.field2956[var12], var1.triangleTextureId[var9]); // L: 1357
						}
					} else {
						int var23 = Rasterizer3D.field2809.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.triangleTextureId[var9]); // L: 1360
						Rasterizer3D.method5266(var16, var17, var18, var13, var14, var15, var19, var20, var21, method5429(var23, var1.triangleColorA[var9]), method5429(var23, var1.triangleColorB[var9]), method5429(var23, var1.triangleColorC[var9])); // L: 1361
					}
				} else if (var1.triangleColorA[var9] != 12345678) { // L: 1352
					Rasterizer3D.method5266(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
				}
			}
		}

	} // L: 1366

	@ObfuscatedName("bl")
	@Export("occlude")
	void occlude() {
		int var1 = Scene_planeOccluderCounts[Scene_plane]; // L: 1393
		Occluder[] var2 = Scene_planeOccluders[Scene_plane]; // L: 1394
		Scene_currentOccludersCount = 0; // L: 1395

		for (int var3 = 0; var3 < var1; ++var3) { // L: 1396
			Occluder var4 = var2[var3]; // L: 1397
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) { // L: 1398
				var5 = var4.minTileX - Scene_cameraXTile + 25; // L: 1399
				if (var5 >= 0 && var5 <= 50) { // L: 1400
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1401
					if (var6 < 0) { // L: 1402
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1403
					if (var7 > 50) { // L: 1404
						var7 = 50;
					}

					var13 = false; // L: 1405

					while (var6 <= var7) { // L: 1406
						if (visibleTiles[var5][var6++]) { // L: 1407
							var13 = true; // L: 1408
							break;
						}
					}

					if (var13) { // L: 1412
						var9 = Scene_cameraX - var4.minX; // L: 1413
						if (var9 > 32) { // L: 1414
							var4.field2927 = 1;
						} else {
							if (var9 >= -32) { // L: 1415
								continue;
							}

							var4.field2927 = 2; // L: 1416
							var9 = -var9; // L: 1417
						}

						var4.field2928 = (var4.minZ - Scene_cameraZ << 8) / var9; // L: 1420
						var4.field2932 = (var4.maxZ - Scene_cameraZ << 8) / var9; // L: 1421
						var4.field2919 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1422
						var4.field2933 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1423
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1424
					}
				}
			} else if (var4.type == 2) { // L: 1427
				var5 = var4.minTileY - Scene_cameraYTile + 25; // L: 1428
				if (var5 >= 0 && var5 <= 50) { // L: 1429
					var6 = var4.minTileX - Scene_cameraXTile + 25; // L: 1430
					if (var6 < 0) { // L: 1431
						var6 = 0;
					}

					var7 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1432
					if (var7 > 50) { // L: 1433
						var7 = 50;
					}

					var13 = false; // L: 1434

					while (var6 <= var7) { // L: 1435
						if (visibleTiles[var6++][var5]) { // L: 1436
							var13 = true; // L: 1437
							break;
						}
					}

					if (var13) { // L: 1441
						var9 = Scene_cameraZ - var4.minZ; // L: 1442
						if (var9 > 32) { // L: 1443
							var4.field2927 = 3;
						} else {
							if (var9 >= -32) { // L: 1444
								continue;
							}

							var4.field2927 = 4; // L: 1445
							var9 = -var9; // L: 1446
						}

						var4.field2916 = (var4.minX - Scene_cameraX << 8) / var9; // L: 1449
						var4.field2930 = (var4.maxX - Scene_cameraX << 8) / var9; // L: 1450
						var4.field2919 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1451
						var4.field2933 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1452
						Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1453
					}
				}
			} else if (var4.type == 4) { // L: 1456
				var5 = var4.minY - Scene_cameraY; // L: 1457
				if (var5 > 128) { // L: 1458
					var6 = var4.minTileY - Scene_cameraYTile + 25; // L: 1459
					if (var6 < 0) { // L: 1460
						var6 = 0;
					}

					var7 = var4.maxTileY - Scene_cameraYTile + 25; // L: 1461
					if (var7 > 50) { // L: 1462
						var7 = 50;
					}

					if (var6 <= var7) { // L: 1463
						int var8 = var4.minTileX - Scene_cameraXTile + 25; // L: 1464
						if (var8 < 0) { // L: 1465
							var8 = 0;
						}

						var9 = var4.maxTileX - Scene_cameraXTile + 25; // L: 1466
						if (var9 > 50) { // L: 1467
							var9 = 50;
						}

						boolean var10 = false; // L: 1468

						label148:
						for (int var11 = var8; var11 <= var9; ++var11) { // L: 1469
							for (int var12 = var6; var12 <= var7; ++var12) { // L: 1470
								if (visibleTiles[var11][var12]) { // L: 1471
									var10 = true; // L: 1472
									break label148;
								}
							}
						}

						if (var10) { // L: 1477
							var4.field2927 = 5; // L: 1478
							var4.field2916 = (var4.minX - Scene_cameraX << 8) / var5; // L: 1479
							var4.field2930 = (var4.maxX - Scene_cameraX << 8) / var5; // L: 1480
							var4.field2928 = (var4.minZ - Scene_cameraZ << 8) / var5; // L: 1481
							var4.field2932 = (var4.maxZ - Scene_cameraZ << 8) / var5; // L: 1482
							Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1483
						}
					}
				}
			}
		}

	} // L: 1487

	@ObfuscatedName("bz")
	boolean method5392(int var1, int var2, int var3) {
		int var4 = this.field2840[var1][var2][var3]; // L: 1490
		if (var4 == -Scene_drawnCount) { // L: 1491
			return false;
		} else if (var4 == Scene_drawnCount) { // L: 1492
			return true;
		} else {
			int var5 = var2 << 7; // L: 1493
			int var6 = var3 << 7; // L: 1494
			if (this.method5513(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method5513(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method5513(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method5513(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) { // L: 1495
				this.field2840[var1][var2][var3] = Scene_drawnCount; // L: 1496
				return true; // L: 1497
			} else {
				this.field2840[var1][var2][var3] = -Scene_drawnCount; // L: 1500
				return false; // L: 1501
			}
		}
	}

	@ObfuscatedName("bo")
	boolean method5433(int var1, int var2, int var3, int var4) {
		if (!this.method5392(var1, var2, var3)) { // L: 1506
			return false;
		} else {
			int var5 = var2 << 7; // L: 1507
			int var6 = var3 << 7; // L: 1508
			int var7 = this.tileHeights[var1][var2][var3] - 1; // L: 1509
			int var8 = var7 - 120; // L: 1510
			int var9 = var7 - 230; // L: 1511
			int var10 = var7 - 238; // L: 1512
			if (var4 < 16) { // L: 1513
				if (var4 == 1) { // L: 1514
					if (var5 > Scene_cameraX) { // L: 1515
						if (!this.method5513(var5, var7, var6)) { // L: 1516
							return false;
						}

						if (!this.method5513(var5, var7, var6 + 128)) { // L: 1517
							return false;
						}
					}

					if (var1 > 0) { // L: 1519
						if (!this.method5513(var5, var8, var6)) { // L: 1520
							return false;
						}

						if (!this.method5513(var5, var8, var6 + 128)) { // L: 1521
							return false;
						}
					}

					if (!this.method5513(var5, var9, var6)) { // L: 1523
						return false;
					}

					if (!this.method5513(var5, var9, var6 + 128)) { // L: 1524
						return false;
					}

					return true; // L: 1525
				}

				if (var4 == 2) { // L: 1527
					if (var6 < Scene_cameraZ) { // L: 1528
						if (!this.method5513(var5, var7, var6 + 128)) { // L: 1529
							return false;
						}

						if (!this.method5513(var5 + 128, var7, var6 + 128)) { // L: 1530
							return false;
						}
					}

					if (var1 > 0) { // L: 1532
						if (!this.method5513(var5, var8, var6 + 128)) { // L: 1533
							return false;
						}

						if (!this.method5513(var5 + 128, var8, var6 + 128)) { // L: 1534
							return false;
						}
					}

					if (!this.method5513(var5, var9, var6 + 128)) { // L: 1536
						return false;
					}

					if (!this.method5513(var5 + 128, var9, var6 + 128)) { // L: 1537
						return false;
					}

					return true; // L: 1538
				}

				if (var4 == 4) { // L: 1540
					if (var5 < Scene_cameraX) { // L: 1541
						if (!this.method5513(var5 + 128, var7, var6)) { // L: 1542
							return false;
						}

						if (!this.method5513(var5 + 128, var7, var6 + 128)) { // L: 1543
							return false;
						}
					}

					if (var1 > 0) { // L: 1545
						if (!this.method5513(var5 + 128, var8, var6)) { // L: 1546
							return false;
						}

						if (!this.method5513(var5 + 128, var8, var6 + 128)) { // L: 1547
							return false;
						}
					}

					if (!this.method5513(var5 + 128, var9, var6)) { // L: 1549
						return false;
					}

					if (!this.method5513(var5 + 128, var9, var6 + 128)) { // L: 1550
						return false;
					}

					return true; // L: 1551
				}

				if (var4 == 8) { // L: 1553
					if (var6 > Scene_cameraZ) { // L: 1554
						if (!this.method5513(var5, var7, var6)) { // L: 1555
							return false;
						}

						if (!this.method5513(var5 + 128, var7, var6)) { // L: 1556
							return false;
						}
					}

					if (var1 > 0) { // L: 1558
						if (!this.method5513(var5, var8, var6)) { // L: 1559
							return false;
						}

						if (!this.method5513(var5 + 128, var8, var6)) { // L: 1560
							return false;
						}
					}

					if (!this.method5513(var5, var9, var6)) { // L: 1562
						return false;
					}

					if (!this.method5513(var5 + 128, var9, var6)) { // L: 1563
						return false;
					}

					return true; // L: 1564
				}
			}

			if (!this.method5513(var5 + 64, var10, var6 + 64)) { // L: 1567
				return false;
			} else if (var4 == 16) { // L: 1568
				return this.method5513(var5, var9, var6 + 128); // L: 1569
			} else if (var4 == 32) { // L: 1572
				return this.method5513(var5 + 128, var9, var6 + 128); // L: 1573
			} else if (var4 == 64) { // L: 1576
				return this.method5513(var5 + 128, var9, var6); // L: 1577
			} else if (var4 == 128) { // L: 1580
				return this.method5513(var5, var9, var6); // L: 1581
			} else {
				return true; // L: 1584
			}
		}
	}

	@ObfuscatedName("cg")
	boolean method5434(int var1, int var2, int var3, int var4) {
		if (!this.method5392(var1, var2, var3)) { // L: 1588
			return false;
		} else {
			int var5 = var2 << 7; // L: 1589
			int var6 = var3 << 7; // L: 1590
			return this.method5513(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method5513(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method5513(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method5513(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1); // L: 1591
		}
	}

	@ObfuscatedName("cb")
	boolean method5435(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) { // L: 1596
			if (!this.method5392(var1, var2, var4)) { // L: 1597
				return false;
			} else {
				var7 = var2 << 7; // L: 1598
				var8 = var4 << 7; // L: 1599
				return this.method5513(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method5513(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method5513(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method5513(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1); // L: 1600
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) { // L: 1603
				for (var8 = var4; var8 <= var5; ++var8) { // L: 1604
					if (this.field2840[var1][var7][var8] == -Scene_drawnCount) { // L: 1605
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1; // L: 1608
			var8 = (var4 << 7) + 2; // L: 1609
			int var9 = this.tileHeights[var1][var2][var4] - var6; // L: 1610
			if (!this.method5513(var7, var9, var8)) { // L: 1611
				return false;
			} else {
				int var10 = (var3 << 7) - 1; // L: 1612
				if (!this.method5513(var10, var9, var8)) { // L: 1613
					return false;
				} else {
					int var11 = (var5 << 7) - 1; // L: 1614
					if (!this.method5513(var7, var9, var11)) { // L: 1615
						return false;
					} else if (!this.method5513(var10, var9, var11)) { // L: 1616
						return false;
					} else {
						return true; // L: 1617
					}
				}
			}
		}
	}

	@ObfuscatedName("ci")
	boolean method5513(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) { // L: 1621
			Occluder var5 = Scene_currentOccluders[var4]; // L: 1622
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2927 == 1) { // L: 1623
				var6 = var5.minX - var1; // L: 1624
				if (var6 > 0) { // L: 1625
					var7 = (var6 * var5.field2928 >> 8) + var5.minZ; // L: 1626
					var8 = (var6 * var5.field2932 >> 8) + var5.maxZ; // L: 1627
					var9 = (var6 * var5.field2919 >> 8) + var5.minY; // L: 1628
					var10 = (var6 * var5.field2933 >> 8) + var5.maxY; // L: 1629
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1630
						return true;
					}
				}
			} else if (var5.field2927 == 2) { // L: 1634
				var6 = var1 - var5.minX; // L: 1635
				if (var6 > 0) { // L: 1636
					var7 = (var6 * var5.field2928 >> 8) + var5.minZ; // L: 1637
					var8 = (var6 * var5.field2932 >> 8) + var5.maxZ; // L: 1638
					var9 = (var6 * var5.field2919 >> 8) + var5.minY; // L: 1639
					var10 = (var6 * var5.field2933 >> 8) + var5.maxY; // L: 1640
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1641
						return true;
					}
				}
			} else if (var5.field2927 == 3) { // L: 1645
				var6 = var5.minZ - var3; // L: 1646
				if (var6 > 0) { // L: 1647
					var7 = (var6 * var5.field2916 >> 8) + var5.minX; // L: 1648
					var8 = (var6 * var5.field2930 >> 8) + var5.maxX; // L: 1649
					var9 = (var6 * var5.field2919 >> 8) + var5.minY; // L: 1650
					var10 = (var6 * var5.field2933 >> 8) + var5.maxY; // L: 1651
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1652
						return true;
					}
				}
			} else if (var5.field2927 == 4) { // L: 1656
				var6 = var3 - var5.minZ; // L: 1657
				if (var6 > 0) { // L: 1658
					var7 = (var6 * var5.field2916 >> 8) + var5.minX; // L: 1659
					var8 = (var6 * var5.field2930 >> 8) + var5.maxX; // L: 1660
					var9 = (var6 * var5.field2919 >> 8) + var5.minY; // L: 1661
					var10 = (var6 * var5.field2933 >> 8) + var5.maxY; // L: 1662
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1663
						return true;
					}
				}
			} else if (var5.field2927 == 5) { // L: 1667
				var6 = var2 - var5.minY; // L: 1668
				if (var6 > 0) { // L: 1669
					var7 = (var6 * var5.field2916 >> 8) + var5.minX; // L: 1670
					var8 = (var6 * var5.field2930 >> 8) + var5.maxX; // L: 1671
					var9 = (var6 * var5.field2928 >> 8) + var5.minZ; // L: 1672
					var10 = (var6 * var5.field2932 >> 8) + var5.maxZ; // L: 1673
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) { // L: 1674
						return true;
					}
				}
			}
		}

		return false; // L: 1679
	}

	@ObfuscatedName("aj")
	@Export("Scene_addOccluder")
	public static void Scene_addOccluder(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Occluder var8 = new Occluder(); // L: 154
		var8.minTileX = var2 / 128; // L: 155
		var8.maxTileX = var3 / 128; // L: 156
		var8.minTileY = var4 / 128; // L: 157
		var8.maxTileY = var5 / 128; // L: 158
		var8.type = var1; // L: 159
		var8.minX = var2; // L: 160
		var8.maxX = var3; // L: 161
		var8.minZ = var4; // L: 162
		var8.maxZ = var5; // L: 163
		var8.minY = var6; // L: 164
		var8.maxY = var7; // L: 165
		Scene_planeOccluders[var0][Scene_planeOccluderCounts[var0]++] = var8; // L: 166
	} // L: 167

	@ObfuscatedName("bf")
	@Export("Scene_buildVisiblityMap")
	public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
		Scene_viewportXMin = 0; // L: 656
		Scene_viewportYMin = 0; // L: 657
		Scene_viewportXMax = var3; // L: 658
		Scene_viewportYMax = var4; // L: 659
		Scene_viewportXCenter = var3 / 2; // L: 660
		Scene_viewportYCenter = var4 / 2; // L: 661
		boolean[][][][] var5 = new boolean[var0.length][32][53][53]; // L: 662

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) { // L: 663
			for (var7 = 0; var7 < 2048; var7 += 64) { // L: 664
				Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 665
				Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 666
				Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 667
				Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 668
				var8 = (var6 - 128) / 32; // L: 669
				var9 = var7 / 64; // L: 670

				for (int var10 = -26; var10 < 26; ++var10) { // L: 671
					for (var11 = -26; var11 < 26; ++var11) { // L: 672
						var12 = var10 * 128; // L: 673
						int var13 = var11 * 128; // L: 674
						boolean var14 = false; // L: 675

						for (int var15 = -var1; var15 <= var2; var15 += 128) { // L: 676
							if (method5418(var12, var0[var8] + var15, var13)) { // L: 677
								var14 = true; // L: 678
								break;
							}
						}

						var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14; // L: 682
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) { // L: 687
			for (var7 = 0; var7 < 32; ++var7) { // L: 688
				for (var8 = -25; var8 < 25; ++var8) { // L: 689
					for (var9 = -25; var9 < 25; ++var9) { // L: 690
						boolean var16 = false; // L: 691

						label85:
						for (var11 = -1; var11 <= 1; ++var11) { // L: 692
							for (var12 = -1; var12 <= 1; ++var12) { // L: 693
								if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 694
									var16 = true; // L: 695
									break label85;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 698
									var16 = true; // L: 699
									break label85; // L: 700
								}

								if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 702
									var16 = true; // L: 703
									break label85; // L: 704
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 706
									var16 = true; // L: 707
									break label85; // L: 708
								}
							}
						}

						visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16; // L: 712
					}
				}
			}
		}

	} // L: 717

	@ObfuscatedName("bp")
	static boolean method5418(int var0, int var1, int var2) {
		int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16; // L: 720
		int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16; // L: 721
		int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16; // L: 722
		int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16; // L: 723
		if (var5 >= 50 && var5 <= 3500) { // L: 724
			int var7 = var3 * 128 / var5 + Scene_viewportXCenter; // L: 725
			int var8 = var6 * 128 / var5 + Scene_viewportYCenter; // L: 726
			return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax; // L: 727
		} else {
			return false; // L: 728
		}
	}

	@ObfuscatedName("bq")
	@Export("shouldSendWalk")
	public static boolean shouldSendWalk() {
		return viewportWalking && Scene_selectedX != -1; // L: 747
	}

	@ObfuscatedName("bb")
	public static void method5384() {
		Scene_selectedX = -1; // L: 751
		viewportWalking = false; // L: 752
	} // L: 753

	@ObfuscatedName("be")
	static final int method5429(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1369
		if (var1 < 2) { // L: 1370
			var1 = 2;
		} else if (var1 > 126) { // L: 1371
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1372
	}

	@ObfuscatedName("bs")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) { // L: 1376
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) { // L: 1377
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) { // L: 1378
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) { // L: 1379
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2); // L: 1380
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3); // L: 1381
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7); // L: 1382
			if (var8 == 0) { // L: 1383
				if (var9 != 0) { // L: 1386
					return var9 < 0 ? var10 <= 0 : var10 >= 0; // L: 1387
				} else {
					return true; // L: 1389
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0; // L: 1384
			}
		}
	}
}
