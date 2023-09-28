import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("Scene")
public class Scene {
	@ObfuscatedName("ac")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("as")
	@Export("tileUpdateCount")
	static int tileUpdateCount;
	@ObfuscatedName("aj")
	@Export("Scene_plane")
	static int Scene_plane;
	@ObfuscatedName("an")
	@Export("Scene_drawnCount")
	static int Scene_drawnCount;
	@ObfuscatedName("au")
	@Export("Scene_cameraXTileMin")
	static int Scene_cameraXTileMin;
	@ObfuscatedName("ai")
	@Export("Scene_cameraXTileMax")
	static int Scene_cameraXTileMax;
	@ObfuscatedName("ae")
	@Export("Scene_cameraYTileMin")
	static int Scene_cameraYTileMin;
	@ObfuscatedName("aw")
	@Export("Scene_cameraYTileMax")
	static int Scene_cameraYTileMax;
	@ObfuscatedName("aq")
	@Export("Scene_cameraXTile")
	static int Scene_cameraXTile;
	@ObfuscatedName("az")
	@Export("Scene_cameraYTile")
	static int Scene_cameraYTile;
	@ObfuscatedName("at")
	@Export("Scene_cameraX")
	static int Scene_cameraX;
	@ObfuscatedName("af")
	@Export("Scene_cameraY")
	static int Scene_cameraY;
	@ObfuscatedName("ad")
	@Export("Scene_cameraZ")
	static int Scene_cameraZ;
	@ObfuscatedName("bn")
	@Export("Scene_cameraPitchSine")
	static int Scene_cameraPitchSine;
	@ObfuscatedName("bk")
	@Export("Scene_cameraPitchCosine")
	static int Scene_cameraPitchCosine;
	@ObfuscatedName("by")
	@Export("Scene_cameraYawSine")
	static int Scene_cameraYawSine;
	@ObfuscatedName("bd")
	@Export("Scene_cameraYawCosine")
	static int Scene_cameraYawCosine;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "[Lkl;"
	)
	@Export("gameObjects")
	static GameObject[] gameObjects;
	@ObfuscatedName("bv")
	@Export("checkClick")
	static boolean checkClick;
	@ObfuscatedName("ba")
	@Export("Scene_selectedPlane")
	static int Scene_selectedPlane;
	@ObfuscatedName("bz")
	@Export("Scene_selectedScreenX")
	static int Scene_selectedScreenX;
	@ObfuscatedName("bb")
	@Export("Scene_selectedScreenY")
	static int Scene_selectedScreenY;
	@ObfuscatedName("bo")
	@Export("Scene_selectedX")
	public static int Scene_selectedX;
	@ObfuscatedName("bp")
	@Export("Scene_selectedY")
	public static int Scene_selectedY;
	@ObfuscatedName("bt")
	@Export("viewportWalking")
	static boolean viewportWalking;
	@ObfuscatedName("bs")
	@Export("Scene_planesCount")
	static int Scene_planesCount;
	@ObfuscatedName("bc")
	@Export("Scene_planeOccluderCounts")
	static int[] Scene_planeOccluderCounts;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "[[Lje;"
	)
	@Export("Scene_planeOccluders")
	static Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("bf")
	@Export("Scene_currentOccludersCount")
	static int Scene_currentOccludersCount;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "[Lje;"
	)
	@Export("Scene_currentOccluders")
	static Occluder[] Scene_currentOccluders;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("Scene_tilesDeque")
	static NodeDeque Scene_tilesDeque;
	@ObfuscatedName("bg")
	static final int[] field2630;
	@ObfuscatedName("bj")
	static final int[] field2631;
	@ObfuscatedName("bx")
	static final int[] field2620;
	@ObfuscatedName("bi")
	static final int[] field2604;
	@ObfuscatedName("bq")
	static final int[] field2634;
	@ObfuscatedName("bw")
	static final int[] field2626;
	@ObfuscatedName("ce")
	static final int[] field2598;
	@ObfuscatedName("cy")
	@Export("visibilityMap")
	static boolean[][][][] visibilityMap;
	@ObfuscatedName("cz")
	@Export("visibleTiles")
	static boolean[][] visibleTiles;
	@ObfuscatedName("cp")
	@Export("Scene_viewportXCenter")
	static int Scene_viewportXCenter;
	@ObfuscatedName("cb")
	@Export("Scene_viewportYCenter")
	static int Scene_viewportYCenter;
	@ObfuscatedName("cn")
	@Export("Scene_viewportXMin")
	static int Scene_viewportXMin;
	@ObfuscatedName("ck")
	@Export("Scene_viewportYMin")
	static int Scene_viewportYMin;
	@ObfuscatedName("cr")
	@Export("Scene_viewportXMax")
	static int Scene_viewportXMax;
	@ObfuscatedName("cs")
	@Export("Scene_viewportYMax")
	static int Scene_viewportYMax;
	@ObfuscatedName("al")
	@Export("planes")
	int planes;
	@ObfuscatedName("ak")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("ax")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("ao")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[[Ljh;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("ar")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ab")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lkl;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("av")
	int[][][] field2592;
	@ObfuscatedName("cg")
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
		field2630 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76}; // L: 54
		field2631 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160}; // L: 55
		field2620 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19}; // L: 56
		field2604 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0}; // L: 57
		field2634 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4}; // L: 58
		field2626 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0}; // L: 59
		field2598 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8}; // L: 60
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
		this.field2592 = new int[var1][var2 + 1][var3 + 1]; // L: 100
		this.tileHeights = var4; // L: 101
		this.clear(); // L: 102
	} // L: 103

	@ObfuscatedName("ac")
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

	@ObfuscatedName("al")
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

	@ObfuscatedName("ak")
	@Export("setLinkBelow")
	public void setLinkBelow(int var1, int var2) {
		Tile var3 = this.tiles[0][var1][var2]; // L: 132

		for (int var4 = 0; var4 < 3; ++var4) { // L: 133
			Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2]; // L: 134
			if (var5 != null) { // L: 135
				--var5.plane; // L: 136

				for (int var6 = 0; var6 < var5.gameObjectsCount; ++var6) { // L: 137
					GameObject var7 = var5.gameObjects[var6]; // L: 138
					if (SequenceDefinition.method4210(var7.tag) && var7.startX == var1 && var2 == var7.startY) { // L: 139
						--var7.plane;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) { // L: 143
			this.tiles[0][var1][var2] = new Tile(0, var1, var2);
		}

		this.tiles[0][var1][var2].linkedBelowTile = var3; // L: 144
		this.tiles[3][var1][var2] = null; // L: 145
	} // L: 146

	@ObfuscatedName("ao")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 165
		if (var5 != null) { // L: 166
			this.tiles[var1][var2][var3].minPlane = var4; // L: 167
		}
	} // L: 168

	@ObfuscatedName("ah")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) { // L: 171
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false); // L: 172

			for (var22 = var1; var22 >= 0; --var22) { // L: 173
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 174
		} else if (var4 != 1) { // L: 177
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20); // L: 183

			for (var22 = var1; var22 >= 0; --var22) { // L: 184
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23; // L: 185
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7); // L: 178

			for (var22 = var1; var22 >= 0; --var22) { // L: 179
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21; // L: 180
		}
	} // L: 175 181 186

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIILjy;JI)V"
	)
	@Export("newGroundObject")
	public void newGroundObject(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) { // L: 189
			GroundObject var9 = new GroundObject(); // L: 190
			var9.renderable = var5; // L: 191
			var9.x = var2 * 128 + 64; // L: 192
			var9.y = var3 * 128 + 64; // L: 193
			var9.z = var4; // L: 194
			var9.tag = var6; // L: 195
			var9.flags = var8; // L: 196
			if (this.tiles[var1][var2][var3] == null) { // L: 197
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].groundObject = var9; // L: 198
		}
	} // L: 199

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIILjy;JLjy;Ljy;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer(); // L: 202
		var10.first = var5; // L: 203
		var10.x = var2 * 128 + 64; // L: 204
		var10.y = var3 * 128 + 64; // L: 205
		var10.z = var4; // L: 206
		var10.tag = var6; // L: 207
		var10.second = var8; // L: 208
		var10.third = var9; // L: 209
		int var11 = 0; // L: 210
		Tile var12 = this.tiles[var1][var2][var3]; // L: 211
		if (var12 != null) { // L: 212
			for (int var13 = 0; var13 < var12.gameObjectsCount; ++var13) { // L: 213
				if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) { // L: 214
					Model var14 = (Model)var12.gameObjects[var13].renderable; // L: 215
					var14.calculateBoundsCylinder(); // L: 216
					if (var14.height > var11) { // L: 217
						var11 = var14.height;
					}
				}
			}
		}

		var10.height = var11; // L: 221
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new Tile(var1, var2, var3); // L: 222
		}

		this.tiles[var1][var2][var3].itemLayer = var10; // L: 223
	} // L: 224

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIILjy;Ljy;IIJI)V"
	)
	@Export("newWallObject")
	public void newWallObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) { // L: 227
			WallObject var12 = new WallObject(); // L: 228
			var12.tag = var9; // L: 229
			var12.flags = var11; // L: 230
			var12.x = var2 * 128 + 64; // L: 231
			var12.y = var3 * 128 + 64; // L: 232
			var12.z = var4; // L: 233
			var12.renderable1 = var5; // L: 234
			var12.renderable2 = var6; // L: 235
			var12.orientationA = var7; // L: 236
			var12.orientationB = var8; // L: 237

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.tiles[var13][var2][var3] == null) {
					this.tiles[var13][var2][var3] = new Tile(var13, var2, var3); // L: 238
				}
			}

			this.tiles[var1][var2][var3].wallObject = var12; // L: 239
		}
	} // L: 240

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIILjy;Ljy;IIIIJI)V"
	)
	@Export("newDecorativeObject")
	public void newDecorativeObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) { // L: 243
			DecorativeObject var14 = new DecorativeObject(); // L: 244
			var14.tag = var11; // L: 245
			var14.flags = var13; // L: 246
			var14.x = var2 * 128 + 64; // L: 247
			var14.y = var3 * 128 + 64; // L: 248
			var14.z = var4; // L: 249
			var14.renderable1 = var5; // L: 250
			var14.renderable2 = var6; // L: 251
			var14.orientation = var7; // L: 252
			var14.orientation2 = var8; // L: 253
			var14.xOffset = var9; // L: 254
			var14.yOffset = var10; // L: 255

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3); // L: 256
				}
			}

			this.tiles[var1][var2][var3].decorativeObject = var14; // L: 257
		}
	} // L: 258

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjy;IJI)Z"
	)
	public boolean method4716(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) { // L: 261
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128; // L: 262
			int var13 = var6 * 64 + var3 * 128; // L: 263
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11); // L: 264
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjy;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
		if (var6 == null) { // L: 268
			return true;
		} else {
			int var11 = var2 - var5; // L: 269
			int var12 = var3 - var5; // L: 270
			int var13 = var5 + var2; // L: 271
			int var14 = var3 + var5; // L: 272
			if (var10) { // L: 273
				if (var7 > 640 && var7 < 1408) { // L: 274
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) { // L: 275
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) { // L: 276
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) { // L: 277
					var11 -= 128;
				}
			}

			var11 /= 128; // L: 279
			var12 /= 128; // L: 280
			var13 /= 128; // L: 281
			var14 /= 128; // L: 282
			return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 283
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIILjy;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0); // L: 287 288
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjy;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) { // L: 292
			for (var16 = var3; var16 < var3 + var5; ++var16) { // L: 293
				if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) { // L: 294
					return false;
				}

				Tile var23 = this.tiles[var1][var15][var16]; // L: 295
				if (var23 != null && var23.gameObjectsCount >= 5) { // L: 296
					return false;
				}
			}
		}

		GameObject var21 = new GameObject(); // L: 299
		var21.tag = var12; // L: 300
		var21.flags = var14; // L: 301
		var21.plane = var1; // L: 302
		var21.centerX = var6; // L: 303
		var21.centerY = var7; // L: 304
		var21.z = var8; // L: 305
		var21.renderable = var9; // L: 306
		var21.orientation = var10; // L: 307
		var21.startX = var2; // L: 308
		var21.startY = var3; // L: 309
		var21.endX = var2 + var4 - 1; // L: 310
		var21.endY = var3 + var5 - 1; // L: 311

		for (var16 = var2; var16 < var2 + var4; ++var16) { // L: 312
			for (int var17 = var3; var17 < var3 + var5; ++var17) { // L: 313
				int var18 = 0; // L: 314
				if (var16 > var2) { // L: 315
					++var18;
				}

				if (var16 < var2 + var4 - 1) { // L: 316
					var18 += 4;
				}

				if (var17 > var3) { // L: 317
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) { // L: 318
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.tiles[var19][var16][var17] == null) {
						this.tiles[var19][var16][var17] = new Tile(var19, var16, var17); // L: 319
					}
				}

				Tile var22 = this.tiles[var1][var16][var17]; // L: 320
				var22.gameObjects[var22.gameObjectsCount] = var21; // L: 321
				var22.gameObjectEdgeMasks[var22.gameObjectsCount] = var18; // L: 322
				var22.gameObjectsEdgeMask |= var18; // L: 324
				++var22.gameObjectsCount; // L: 325
			}
		}

		if (var11) { // L: 328
			this.tempGameObjects[this.tempGameObjectsCount++] = var21;
		}

		return true; // L: 329
	}

	@ObfuscatedName("as")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) { // L: 333
			GameObject var2 = this.tempGameObjects[var1]; // L: 334
			this.removeGameObject(var2); // L: 335
			this.tempGameObjects[var1] = null; // L: 336
		}

		this.tempGameObjectsCount = 0; // L: 338
	} // L: 339

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lkl;)V"
	)
	@Export("removeGameObject")
	void removeGameObject(GameObject var1) {
		for (int var2 = var1.startX; var2 <= var1.endX; ++var2) { // L: 342
			for (int var3 = var1.startY; var3 <= var1.endY; ++var3) { // L: 343
				Tile var4 = this.tiles[var1.plane][var2][var3]; // L: 344
				if (var4 != null) { // L: 345
					int var5;
					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 346
						if (var4.gameObjects[var5] == var1) { // L: 347
							--var4.gameObjectsCount; // L: 348

							for (int var6 = var5; var6 < var4.gameObjectsCount; ++var6) { // L: 349
								var4.gameObjects[var6] = var4.gameObjects[var6 + 1]; // L: 350
								var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1]; // L: 351
							}

							var4.gameObjects[var4.gameObjectsCount] = null; // L: 353
							break;
						}
					}

					var4.gameObjectsEdgeMask = 0; // L: 357

					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 358
						var4.gameObjectsEdgeMask |= var4.gameObjectEdgeMasks[var5]; // L: 360
					}
				}
			}
		}

	} // L: 365

	@ObfuscatedName("an")
	public void method4726(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3]; // L: 368
		if (var5 != null) { // L: 369
			DecorativeObject var6 = var5.decorativeObject; // L: 370
			if (var6 != null) { // L: 371
				var6.xOffset = var4 * var6.xOffset / 16; // L: 372
				var6.yOffset = var4 * var6.yOffset / 16; // L: 373
			}
		}
	} // L: 374

	@ObfuscatedName("au")
	public void method4676(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 377
		if (var4 != null) {
			var4.wallObject = null; // L: 379
		}
	} // L: 378 380

	@ObfuscatedName("ai")
	public void method4677(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 383
		if (var4 != null) {
			var4.decorativeObject = null; // L: 385
		}
	} // L: 384 386

	@ObfuscatedName("ae")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 389
		if (var4 != null) { // L: 390
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 391
				GameObject var6 = var4.gameObjects[var5]; // L: 392
				if (SequenceDefinition.method4210(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 393
					this.removeGameObject(var6); // L: 394
					return; // L: 395
				}
			}

		}
	} // L: 398

	@ObfuscatedName("aw")
	public void method4679(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 401
		if (var4 != null) {
			var4.groundObject = null; // L: 403
		}
	} // L: 402 404

	@ObfuscatedName("aq")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 407
		if (var4 != null) {
			var4.itemLayer = null; // L: 409
		}
	} // L: 408 410

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)Lkr;"
	)
	public WallObject method4681(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 413
		return var4 == null ? null : var4.wallObject; // L: 414 415
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Lkq;"
	)
	public DecorativeObject method4682(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 419
		return var4 == null ? null : var4.decorativeObject; // L: 420 421
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Lkl;"
	)
	@Export("getGameObject")
	public GameObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 425
		if (var4 == null) { // L: 426
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 427
				GameObject var6 = var4.gameObjects[var5]; // L: 428
				if (SequenceDefinition.method4210(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 429
					return var6;
				}
			}

			return null; // L: 431
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Ljd;"
	)
	@Export("getGroundObject")
	public GroundObject getGroundObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 435
		return var4 != null && var4.groundObject != null ? var4.groundObject : null; // L: 436 437
	}

	@ObfuscatedName("bn")
	@Export("getWallObjectTag")
	public long getWallObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 441
		return var4 != null && var4.wallObject != null ? var4.wallObject.tag : 0L; // L: 442 443
	}

	@ObfuscatedName("bk")
	@Export("getDecorativeObjectTag")
	public long getDecorativeObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 447
		return var4 != null && var4.decorativeObject != null ? var4.decorativeObject.tag : 0L; // L: 448 449
	}

	@ObfuscatedName("by")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 453
		if (var4 == null) { // L: 454
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) { // L: 455
				GameObject var6 = var4.gameObjects[var5]; // L: 456
				if (SequenceDefinition.method4210(var6.tag) && var2 == var6.startX && var3 == var6.startY) { // L: 457
					return var6.tag;
				}
			}

			return 0L; // L: 459
		}
	}

	@ObfuscatedName("bd")
	@Export("getGroundObjectTag")
	public long getGroundObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3]; // L: 463
		return var4 != null && var4.groundObject != null ? var4.groundObject.tag : 0L; // L: 464 465
	}

	@ObfuscatedName("be")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3]; // L: 469
		if (var6 == null) { // L: 470
			return -1;
		} else if (var6.wallObject != null && var6.wallObject.tag == var4) { // L: 471
			return var6.wallObject.flags & 255;
		} else if (var6.decorativeObject != null && var6.decorativeObject.tag == var4) { // L: 472
			return var6.decorativeObject.flags & 255;
		} else if (var6.groundObject != null && var6.groundObject.tag == var4) { // L: 473
			return var6.groundObject.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) { // L: 474
				if (var6.gameObjects[var7].tag == var4) { // L: 475
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1; // L: 477
		}
	}

	@ObfuscatedName("bv")
	public void method4690(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) { // L: 481
			for (int var5 = 0; var5 < this.xSize; ++var5) { // L: 482
				for (int var6 = 0; var6 < this.ySize; ++var6) { // L: 483
					Tile var7 = this.tiles[var4][var5][var6]; // L: 484
					if (var7 != null) { // L: 485
						WallObject var8 = var7.wallObject; // L: 486
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) { // L: 487
							ModelData var9 = (ModelData)var8.renderable1; // L: 488
							this.method4692(var9, var4, var5, var6, 1, 1); // L: 489
							if (var8.renderable2 instanceof ModelData) { // L: 490
								var10 = (ModelData)var8.renderable2; // L: 491
								this.method4692(var10, var4, var5, var6, 1, 1); // L: 492
								ModelData.method4444(var9, var10, 0, 0, 0, false); // L: 493
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 494
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3); // L: 496
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) { // L: 498
							GameObject var14 = var7.gameObjects[var12]; // L: 499
							if (var14 != null && var14.renderable instanceof ModelData) { // L: 500
								ModelData var11 = (ModelData)var14.renderable; // L: 501
								this.method4692(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1); // L: 502
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3); // L: 503
							}
						}

						GroundObject var13 = var7.groundObject; // L: 506
						if (var13 != null && var13.renderable instanceof ModelData) { // L: 507
							var10 = (ModelData)var13.renderable; // L: 508
							this.method4706(var10, var4, var5, var6); // L: 509
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3); // L: 510
						}
					}
				}
			}
		}

	} // L: 516

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljw;III)V"
	)
	void method4706(ModelData var1, int var2, int var3, int var4) {
		int var6 = var3 + 1; // L: 520
		int var7 = var4 - 1; // L: 521
		int var8 = var4 + 1; // L: 522

		for (int var9 = var3; var9 <= var6; ++var9) { // L: 523
			if (var9 >= 0 && var9 < this.xSize) { // L: 524
				for (int var10 = var7; var10 <= var8; ++var10) { // L: 525
					if (var10 >= 0 && var10 < this.ySize && (var9 >= var6 || var10 >= var8)) { // L: 526 527
						Tile var11 = this.tiles[var2][var9][var10]; // L: 528
						if (var11 != null && var11.groundObject != null && var11.groundObject.renderable instanceof ModelData) { // L: 529 530
							int var12 = this.method4693(var2, var9, var10, var2, var3, var4); // L: 531
							ModelData var13 = (ModelData)var11.groundObject.renderable; // L: 532
							ModelData.method4444(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true); // L: 533
						}
					}
				}
			}
		}

	} // L: 537

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljw;IIIII)V"
	)
	void method4692(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 540
		int var8 = var3; // L: 541
		int var9 = var3 + var5; // L: 542
		int var10 = var4 - 1; // L: 543
		int var11 = var4 + var6; // L: 544

		for (int var12 = var2; var12 <= var2 + 1; ++var12) { // L: 545
			if (var12 != this.planes) { // L: 546
				for (int var13 = var8; var13 <= var9; ++var13) { // L: 547
					if (var13 >= 0 && var13 < this.xSize) { // L: 548
						for (int var14 = var10; var14 <= var11; ++var14) { // L: 549
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) { // L: 550 551
								Tile var15 = this.tiles[var12][var13][var14]; // L: 552
								if (var15 != null) { // L: 553
									int var16 = this.method4693(var12, var13, var14, var2, var3, var4); // L: 554
									WallObject var17 = var15.wallObject; // L: 555
									if (var17 != null) { // L: 556
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) { // L: 557
											var18 = (ModelData)var17.renderable1; // L: 558
											ModelData.method4444(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 559
										}

										if (var17.renderable2 instanceof ModelData) { // L: 561
											var18 = (ModelData)var17.renderable2; // L: 562
											ModelData.method4444(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7); // L: 563
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) { // L: 566
										GameObject var19 = var15.gameObjects[var23]; // L: 567
										if (var19 != null && var19.renderable instanceof ModelData) { // L: 568
											ModelData var20 = (ModelData)var19.renderable; // L: 569
											int var21 = var19.endX - var19.startX + 1; // L: 570
											int var22 = var19.endY - var19.startY + 1; // L: 571
											ModelData.method4444(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7); // L: 572
										}
									}
								}
							}
						}
					}
				}

				--var8; // L: 577
				var7 = false; // L: 578
			}
		}

	} // L: 580

	@ObfuscatedName("bb")
	int method4693(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method4694(var1, var2, var3) - this.method4694(var4, var5, var6); // L: 583
	}

	@ObfuscatedName("bo")
	int method4694(int var1, int var2, int var3) {
		return (this.tileHeights[var1][var2 + 1][var3 + 1] + this.tileHeights[var1][var2][var3] + this.tileHeights[var1][var2][var3 + 1] + this.tileHeights[var1][var2 + 1][var3]) / 4; // L: 587
	}

	@ObfuscatedName("bp")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6]; // L: 591
		if (var7 != null) { // L: 592
			SceneTilePaint var8 = var7.paint; // L: 593
			int var10;
			if (var8 != null) { // L: 594
				int var18 = var8.rgb; // L: 595
				if (var18 != 0) { // L: 596
					for (var10 = 0; var10 < 4; ++var10) { // L: 597
						var1[var2] = var18; // L: 598
						var1[var2 + 1] = var18; // L: 599
						var1[var2 + 2] = var18; // L: 600
						var1[var2 + 3] = var18; // L: 601
						var2 += var3; // L: 602
					}

				}
			} else {
				SceneTileModel var9 = var7.model; // L: 606
				if (var9 != null) { // L: 607
					var10 = var9.shape; // L: 608
					int var11 = var9.rotation; // L: 609
					int var12 = var9.underlayRgb; // L: 610
					int var13 = var9.overlayRgb; // L: 611
					int[] var14 = this.tileShape2D[var10]; // L: 612
					int[] var15 = this.tileRotation2D[var11]; // L: 613
					int var16 = 0; // L: 614
					int var17;
					if (var12 != 0) { // L: 615
						for (var17 = 0; var17 < 4; ++var17) { // L: 616
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 617
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 618
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 619
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13; // L: 620
							var2 += var3; // L: 621
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) { // L: 625
							if (var14[var15[var16++]] != 0) { // L: 626
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 627
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 628
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) { // L: 629
								var1[var2 + 3] = var13;
							}

							var2 += var3; // L: 630
						}
					}

				}
			}
		}
	} // L: 604 633

	@ObfuscatedName("br")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!shouldSendWalk() || var4) { // L: 712
			checkClick = true; // L: 713
			viewportWalking = var4; // L: 714
			Scene_selectedPlane = var1; // L: 715
			Scene_selectedScreenX = var2; // L: 716
			Scene_selectedScreenY = var3; // L: 717
			Scene_selectedX = -1; // L: 718
			Scene_selectedY = -1; // L: 719
		}
	} // L: 720

	@ObfuscatedName("bs")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		viewportWalking = true; // L: 723
	} // L: 724

	@ObfuscatedName("bf")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) { // L: 736
			var1 = 0;
		} else if (var1 >= this.xSize * 128) { // L: 737
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) { // L: 738
			var3 = 0;
		} else if (var3 >= this.ySize * 128) { // L: 739
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) { // L: 740
			var4 = 128;
		} else if (var4 > 383) { // L: 741
			var4 = 383;
		}

		++Scene_drawnCount; // L: 742
		Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 743
		Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var4]; // L: 744
		Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var5]; // L: 745
		Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var5]; // L: 746
		visibleTiles = visibilityMap[(var4 - 128) / 32][var5 / 64]; // L: 747
		Scene_cameraX = var1; // L: 748
		Scene_cameraY = var2; // L: 749
		Scene_cameraZ = var3; // L: 750
		Scene_cameraXTile = var1 / 128; // L: 751
		Scene_cameraYTile = var3 / 128; // L: 752
		Scene_plane = var6; // L: 753
		Scene_cameraXTileMin = Scene_cameraXTile - 25; // L: 754
		if (Scene_cameraXTileMin < 0) { // L: 755
			Scene_cameraXTileMin = 0;
		}

		Scene_cameraYTileMin = Scene_cameraYTile - 25; // L: 756
		if (Scene_cameraYTileMin < 0) { // L: 757
			Scene_cameraYTileMin = 0;
		}

		Scene_cameraXTileMax = Scene_cameraXTile + 25; // L: 758
		if (Scene_cameraXTileMax > this.xSize) { // L: 759
			Scene_cameraXTileMax = this.xSize;
		}

		Scene_cameraYTileMax = Scene_cameraYTile + 25; // L: 760
		if (Scene_cameraYTileMax > this.ySize) { // L: 761
			Scene_cameraYTileMax = this.ySize;
		}

		this.occlude(); // L: 762
		tileUpdateCount = 0; // L: 763

		int var7;
		Tile[][] var8;
		int var9;
		int var10;
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 764
			var8 = this.tiles[var7]; // L: 765

			for (var9 = Scene_cameraXTileMin; var9 < Scene_cameraXTileMax; ++var9) { // L: 766
				for (var10 = Scene_cameraYTileMin; var10 < Scene_cameraYTileMax; ++var10) { // L: 767
					Tile var16 = var8[var9][var10]; // L: 768
					if (var16 != null) { // L: 769
						if (var16.minPlane <= var6 && (visibleTiles[var9 - Scene_cameraXTile + 25][var10 - Scene_cameraYTile + 25] || this.tileHeights[var7][var9][var10] - var2 >= 2000)) { // L: 770
							var16.drawPrimary = true; // L: 776
							var16.drawSecondary = true; // L: 777
							if (var16.gameObjectsCount > 0) { // L: 778
								var16.drawGameObjects = true;
							} else {
								var16.drawGameObjects = false; // L: 779
							}

							++tileUpdateCount; // L: 780
						} else {
							var16.drawPrimary = false; // L: 771
							var16.drawSecondary = false; // L: 772
							var16.drawGameObjectEdges = 0; // L: 773
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
		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 786
			var8 = this.tiles[var7]; // L: 787

			for (var9 = -25; var9 <= 0; ++var9) { // L: 788
				var10 = var9 + Scene_cameraXTile; // L: 789
				var11 = Scene_cameraXTile - var9; // L: 790
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 791
					for (var12 = -25; var12 <= 0; ++var12) { // L: 792
						var13 = var12 + Scene_cameraYTile; // L: 793
						var14 = Scene_cameraYTile - var12; // L: 794
						if (var10 >= Scene_cameraXTileMin) { // L: 795
							if (var13 >= Scene_cameraYTileMin) { // L: 796
								var15 = var8[var10][var13]; // L: 797
								if (var15 != null && var15.drawPrimary) { // L: 798
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 800
								var15 = var8[var10][var14]; // L: 801
								if (var15 != null && var15.drawPrimary) { // L: 802
									this.drawTile(var15, true);
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 805
							if (var13 >= Scene_cameraYTileMin) { // L: 806
								var15 = var8[var11][var13]; // L: 807
								if (var15 != null && var15.drawPrimary) { // L: 808
									this.drawTile(var15, true);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 810
								var15 = var8[var11][var14]; // L: 811
								if (var15 != null && var15.drawPrimary) { // L: 812
									this.drawTile(var15, true);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 815
							checkClick = false; // L: 816
							return; // L: 817
						}
					}
				}
			}
		}

		for (var7 = this.minPlane; var7 < this.planes; ++var7) { // L: 823
			var8 = this.tiles[var7]; // L: 824

			for (var9 = -25; var9 <= 0; ++var9) { // L: 825
				var10 = var9 + Scene_cameraXTile; // L: 826
				var11 = Scene_cameraXTile - var9; // L: 827
				if (var10 >= Scene_cameraXTileMin || var11 < Scene_cameraXTileMax) { // L: 828
					for (var12 = -25; var12 <= 0; ++var12) { // L: 829
						var13 = var12 + Scene_cameraYTile; // L: 830
						var14 = Scene_cameraYTile - var12; // L: 831
						if (var10 >= Scene_cameraXTileMin) { // L: 832
							if (var13 >= Scene_cameraYTileMin) { // L: 833
								var15 = var8[var10][var13]; // L: 834
								if (var15 != null && var15.drawPrimary) { // L: 835
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 837
								var15 = var8[var10][var14]; // L: 838
								if (var15 != null && var15.drawPrimary) {
									this.drawTile(var15, false); // L: 839
								}
							}
						}

						if (var11 < Scene_cameraXTileMax) { // L: 842
							if (var13 >= Scene_cameraYTileMin) { // L: 843
								var15 = var8[var11][var13]; // L: 844
								if (var15 != null && var15.drawPrimary) { // L: 845
									this.drawTile(var15, false);
								}
							}

							if (var14 < Scene_cameraYTileMax) { // L: 847
								var15 = var8[var11][var14]; // L: 848
								if (var15 != null && var15.drawPrimary) { // L: 849
									this.drawTile(var15, false);
								}
							}
						}

						if (tileUpdateCount == 0) { // L: 852
							checkClick = false; // L: 853
							return; // L: 854
						}
					}
				}
			}
		}

		checkClick = false; // L: 860
	} // L: 861

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Z)V"
	)
	@Export("drawTile")
	void drawTile(Tile var1, boolean var2) {
		Scene_tilesDeque.addFirst(var1); // L: 864

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
												var3 = (Tile)Scene_tilesDeque.removeLast(); // L: 866
												if (var3 == null) { // L: 867
													return;
												}
											} while(!var3.drawSecondary); // L: 868

											var4 = var3.x; // L: 869
											var5 = var3.y; // L: 870
											var6 = var3.plane; // L: 871
											var7 = var3.originalPlane; // L: 872
											var8 = this.tiles[var6]; // L: 873
											if (!var3.drawPrimary) { // L: 874
												break;
											}

											if (var2) { // L: 875
												if (var6 > 0) { // L: 876
													var9 = this.tiles[var6 - 1][var4][var5]; // L: 877
													if (var9 != null && var9.drawSecondary) { // L: 878
														continue;
													}
												}

												if (var4 <= Scene_cameraXTile && var4 > Scene_cameraXTileMin) { // L: 880
													var9 = var8[var4 - 1][var5]; // L: 881
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 1) == 0)) { // L: 882
														continue;
													}
												}

												if (var4 >= Scene_cameraXTile && var4 < Scene_cameraXTileMax - 1) { // L: 884
													var9 = var8[var4 + 1][var5]; // L: 885
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 4) == 0)) { // L: 886
														continue;
													}
												}

												if (var5 <= Scene_cameraYTile && var5 > Scene_cameraYTileMin) { // L: 888
													var9 = var8[var4][var5 - 1]; // L: 889
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 8) == 0)) { // L: 890
														continue;
													}
												}

												if (var5 >= Scene_cameraYTile && var5 < Scene_cameraYTileMax - 1) { // L: 892
													var9 = var8[var4][var5 + 1]; // L: 893
													if (var9 != null && var9.drawSecondary && (var9.drawPrimary || (var3.gameObjectsEdgeMask & 2) == 0)) { // L: 894
														continue;
													}
												}
											} else {
												var2 = true; // L: 897
											}

											var3.drawPrimary = false; // L: 898
											if (var3.linkedBelowTile != null) { // L: 899
												var9 = var3.linkedBelowTile; // L: 900
												if (var9.paint != null) { // L: 901
													if (!this.method4689(0, var4, var5)) { // L: 902
														this.drawTileUnderlay(var9.paint, 0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												} else if (var9.model != null && !this.method4689(0, var4, var5)) { // L: 904 905
													this.drawTileOverlay(var9.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
												}

												var10 = var9.wallObject; // L: 907
												if (var10 != null) { // L: 908
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * 4096 - Scene_cameraX, var10.z - Scene_cameraY, var10.y * 4096 - Scene_cameraZ, var10.tag);
												}

												for (var11 = 0; var11 < var9.gameObjectsCount; ++var11) { // L: 909
													var12 = var9.gameObjects[var11]; // L: 910
													if (var12 != null) { // L: 911
														var12.renderable.draw(var12.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var12.centerX - Scene_cameraX, var12.z - Scene_cameraY, var12.centerY - Scene_cameraZ, var12.tag);
													}
												}
											}

											var20 = false; // L: 914
											if (var3.paint != null) { // L: 915
												if (!this.method4689(var7, var4, var5)) { // L: 916
													var20 = true; // L: 917
													if (var3.paint.neColor != 12345678 || checkClick && var6 <= Scene_selectedPlane) { // L: 918
														this.drawTileUnderlay(var3.paint, var7, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5);
													}
												}
											} else if (var3.model != null && !this.method4689(var7, var4, var5)) { // L: 921 922
												var20 = true; // L: 923
												this.drawTileOverlay(var3.model, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var4, var5); // L: 924
											}

											var21 = 0; // L: 927
											var11 = 0; // L: 928
											WallObject var31 = var3.wallObject; // L: 929
											DecorativeObject var13 = var3.decorativeObject; // L: 930
											if (var31 != null || var13 != null) { // L: 931
												if (var4 == Scene_cameraXTile) { // L: 932
													++var21;
												} else if (Scene_cameraXTile < var4) { // L: 933
													var21 += 2;
												}

												if (var5 == Scene_cameraYTile) { // L: 934
													var21 += 3;
												} else if (Scene_cameraYTile > var5) { // L: 935
													var21 += 6;
												}

												var11 = field2630[var21]; // L: 936
												var3.field2547 = field2620[var21]; // L: 937
											}

											if (var31 != null) { // L: 939
												if ((var31.orientationA & field2631[var21]) != 0) { // L: 940
													if (var31.orientationA == 16) { // L: 941
														var3.drawGameObjectEdges = 3; // L: 942
														var3.field2545 = field2604[var21]; // L: 943
														var3.field2532 = 3 - var3.field2545; // L: 944
													} else if (var31.orientationA == 32) { // L: 946
														var3.drawGameObjectEdges = 6; // L: 947
														var3.field2545 = field2634[var21]; // L: 948
														var3.field2532 = 6 - var3.field2545; // L: 949
													} else if (var31.orientationA == 64) { // L: 951
														var3.drawGameObjectEdges = 12; // L: 952
														var3.field2545 = field2626[var21]; // L: 953
														var3.field2532 = 12 - var3.field2545; // L: 954
													} else {
														var3.drawGameObjectEdges = 9; // L: 957
														var3.field2545 = field2598[var21]; // L: 958
														var3.field2532 = 9 - var3.field2545; // L: 959
													}
												} else {
													var3.drawGameObjectEdges = 0; // L: 962
												}

												if ((var31.orientationA & var11) != 0 && !this.method4788(var7, var4, var5, var31.orientationA)) { // L: 963
													var31.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * 4096 - Scene_cameraX, var31.z - Scene_cameraY, var31.y * 4096 - Scene_cameraZ, var31.tag);
												}

												if ((var31.orientationB & var11) != 0 && !this.method4788(var7, var4, var5, var31.orientationB)) { // L: 964
													var31.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var31.x * 4096 - Scene_cameraX, var31.z - Scene_cameraY, var31.y * 4096 - Scene_cameraZ, var31.tag);
												}
											}

											if (var13 != null && !this.method4821(var7, var4, var5, var13.renderable1.height)) { // L: 966
												if ((var13.orientation & var11) != 0) { // L: 967
													var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var13.xOffset + (var13.x * 4096 - Scene_cameraX), var13.z - Scene_cameraY, var13.yOffset + (var13.y * 4096 - Scene_cameraZ), var13.tag); // L: 968
												} else if (var13.orientation == 256) { // L: 970
													var14 = var13.x * 4096 - Scene_cameraX; // L: 971
													var15 = var13.z - Scene_cameraY; // L: 972
													var16 = var13.y * 4096 - Scene_cameraZ; // L: 973
													var17 = var13.orientation2; // L: 974
													if (var17 != 1 && var17 != 2) { // L: 976
														var18 = var14; // L: 977
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) { // L: 979
														var19 = var16; // L: 980
													} else {
														var19 = -var16;
													}

													if (var19 < var18) { // L: 981
														var13.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14 + var13.xOffset, var15, var16 + var13.yOffset, var13.tag); // L: 982
													} else if (var13.renderable2 != null) { // L: 984
														var13.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var14, var15, var16, var13.tag); // L: 985
													}
												}
											}

											if (var20) { // L: 989
												GroundObject var22 = var3.groundObject; // L: 990
												if (var22 != null) { // L: 991
													var22.renderable.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var22.x * 4096 - Scene_cameraX, var22.z - Scene_cameraY, var22.y * 4096 - Scene_cameraZ, var22.tag);
												}

												ItemLayer var23 = var3.itemLayer; // L: 992
												if (var23 != null && var23.height == 0) { // L: 993
													if (var23.second != null) { // L: 994
														var23.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 4096 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}

													if (var23.third != null) { // L: 995
														var23.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 4096 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}

													if (var23.first != null) { // L: 996
														var23.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var23.x * 4096 - Scene_cameraX, var23.z - Scene_cameraY, var23.y * 4096 - Scene_cameraZ, var23.tag);
													}
												}
											}

											var14 = var3.gameObjectsEdgeMask; // L: 999
											if (var14 != 0) { // L: 1000
												if (var4 < Scene_cameraXTile && (var14 & 4) != 0) { // L: 1001
													var36 = var8[var4 + 1][var5]; // L: 1002
													if (var36 != null && var36.drawSecondary) { // L: 1003
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 < Scene_cameraYTile && (var14 & 2) != 0) { // L: 1005
													var36 = var8[var4][var5 + 1]; // L: 1006
													if (var36 != null && var36.drawSecondary) { // L: 1007
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var4 > Scene_cameraXTile && (var14 & 1) != 0) { // L: 1009
													var36 = var8[var4 - 1][var5]; // L: 1010
													if (var36 != null && var36.drawSecondary) { // L: 1011
														Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > Scene_cameraYTile && (var14 & 8) != 0) { // L: 1013
													var36 = var8[var4][var5 - 1]; // L: 1014
													if (var36 != null && var36.drawSecondary) { // L: 1015
														Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var3.drawGameObjectEdges != 0) { // L: 1019
											var20 = true; // L: 1020

											for (var21 = 0; var21 < var3.gameObjectsCount; ++var21) { // L: 1021
												if (var3.gameObjects[var21].lastDrawn != Scene_drawnCount && (var3.gameObjectEdgeMasks[var21] & var3.drawGameObjectEdges) == var3.field2545) { // L: 1022
													var20 = false; // L: 1023
													break; // L: 1024
												}
											}

											if (var20) { // L: 1027
												var10 = var3.wallObject; // L: 1028
												if (!this.method4788(var7, var4, var5, var10.orientationA)) { // L: 1029
													var10.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var10.x * 4096 - Scene_cameraX, var10.z - Scene_cameraY, var10.y * 4096 - Scene_cameraZ, var10.tag);
												}

												var3.drawGameObjectEdges = 0; // L: 1030
											}
										}

										if (!var3.drawGameObjects) { // L: 1033
											break;
										}

										try {
											int var34 = var3.gameObjectsCount; // L: 1035
											var3.drawGameObjects = false; // L: 1036
											var21 = 0; // L: 1037

											label563:
											for (var11 = 0; var11 < var34; ++var11) { // L: 1038
												var12 = var3.gameObjects[var11]; // L: 1039
												if (var12.lastDrawn != Scene_drawnCount) { // L: 1040
													for (var24 = var12.startX; var24 <= var12.endX; ++var24) { // L: 1041
														for (var14 = var12.startY; var14 <= var12.endY; ++var14) { // L: 1042
															var36 = var8[var24][var14]; // L: 1043
															if (var36.drawPrimary) { // L: 1044
																var3.drawGameObjects = true; // L: 1045
																continue label563; // L: 1046
															}

															if (var36.drawGameObjectEdges != 0) { // L: 1048
																var16 = 0; // L: 1049
																if (var24 > var12.startX) { // L: 1050
																	++var16;
																}

																if (var24 < var12.endX) { // L: 1051
																	var16 += 4;
																}

																if (var14 > var12.startY) { // L: 1052
																	var16 += 8;
																}

																if (var14 < var12.endY) { // L: 1053
																	var16 += 2;
																}

																if ((var16 & var36.drawGameObjectEdges) == var3.field2532) { // L: 1054
																	var3.drawGameObjects = true; // L: 1055
																	continue label563; // L: 1056
																}
															}
														}
													}

													gameObjects[var21++] = var12; // L: 1061
													var24 = Scene_cameraXTile - var12.startX; // L: 1062
													var14 = var12.endX - Scene_cameraXTile; // L: 1063
													if (var14 > var24) { // L: 1064
														var24 = var14;
													}

													var15 = Scene_cameraYTile - var12.startY; // L: 1065
													var16 = var12.endY - Scene_cameraYTile; // L: 1066
													if (var16 > var15) { // L: 1067
														var12.field2887 = var24 + var16;
													} else {
														var12.field2887 = var24 + var15; // L: 1068
													}
												}
											}

											while (var21 > 0) { // L: 1071
												var11 = -50; // L: 1072
												var25 = -1; // L: 1073

												for (var24 = 0; var24 < var21; ++var24) { // L: 1074
													GameObject var35 = gameObjects[var24]; // L: 1075
													if (var35.lastDrawn != Scene_drawnCount) { // L: 1076
														if (var35.field2887 > var11) { // L: 1077
															var11 = var35.field2887; // L: 1078
															var25 = var24; // L: 1079
														} else if (var11 == var35.field2887) { // L: 1081
															var15 = var35.centerX - Scene_cameraX; // L: 1082
															var16 = var35.centerY - Scene_cameraZ; // L: 1083
															var17 = gameObjects[var25].centerX - Scene_cameraX; // L: 1084
															var18 = gameObjects[var25].centerY - Scene_cameraZ; // L: 1085
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) { // L: 1086
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) { // L: 1090
													break;
												}

												GameObject var33 = gameObjects[var25]; // L: 1091
												var33.lastDrawn = Scene_drawnCount; // L: 1092
												if (!this.method4711(var7, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) { // L: 1093
													var33.renderable.draw(var33.orientation, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var33.centerX - Scene_cameraX, var33.z - Scene_cameraY, var33.centerY - Scene_cameraZ, var33.tag); // L: 1094
												}

												for (var14 = var33.startX; var14 <= var33.endX; ++var14) { // L: 1096
													for (var15 = var33.startY; var15 <= var33.endY; ++var15) { // L: 1097
														Tile var26 = var8[var14][var15]; // L: 1098
														if (var26.drawGameObjectEdges != 0) { // L: 1099
															Scene_tilesDeque.addFirst(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.drawSecondary) { // L: 1100
															Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var3.drawGameObjects) { // L: 1104
												break;
											}
										} catch (Exception var28) { // L: 1106
											var3.drawGameObjects = false; // L: 1107
											break;
										}
									}
								} while(!var3.drawSecondary); // L: 1110
							} while(var3.drawGameObjectEdges != 0); // L: 1111

							if (var4 > Scene_cameraXTile || var4 <= Scene_cameraXTileMin) { // L: 1112
								break;
							}

							var9 = var8[var4 - 1][var5]; // L: 1113
						} while(var9 != null && var9.drawSecondary); // L: 1114

						if (var4 < Scene_cameraXTile || var4 >= Scene_cameraXTileMax - 1) { // L: 1116
							break;
						}

						var9 = var8[var4 + 1][var5]; // L: 1117
					} while(var9 != null && var9.drawSecondary); // L: 1118

					if (var5 > Scene_cameraYTile || var5 <= Scene_cameraYTileMin) { // L: 1120
						break;
					}

					var9 = var8[var4][var5 - 1]; // L: 1121
				} while(var9 != null && var9.drawSecondary); // L: 1122

				if (var5 < Scene_cameraYTile || var5 >= Scene_cameraYTileMax - 1) { // L: 1124
					break;
				}

				var9 = var8[var4][var5 + 1]; // L: 1125
			} while(var9 != null && var9.drawSecondary); // L: 1126

			var3.drawSecondary = false; // L: 1128
			--tileUpdateCount; // L: 1129
			ItemLayer var32 = var3.itemLayer; // L: 1130
			if (var32 != null && var32.height != 0) { // L: 1131
				if (var32.second != null) { // L: 1132
					var32.second.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 4096 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}

				if (var32.third != null) { // L: 1133
					var32.third.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 4096 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}

				if (var32.first != null) { // L: 1134
					var32.first.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var32.x * 4096 - Scene_cameraX, var32.z - Scene_cameraY - var32.height, var32.y * 4096 - Scene_cameraZ, var32.tag);
				}
			}

			if (var3.field2547 != 0) { // L: 1136
				DecorativeObject var29 = var3.decorativeObject; // L: 1137
				if (var29 != null && !this.method4821(var7, var4, var5, var29.renderable1.height)) { // L: 1138
					if ((var29.orientation & var3.field2547) != 0) { // L: 1139
						var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var29.xOffset + (var29.x * 4096 - Scene_cameraX), var29.z - Scene_cameraY, var29.yOffset + (var29.y * 4096 - Scene_cameraZ), var29.tag); // L: 1140
					} else if (var29.orientation == 256) { // L: 1142
						var11 = var29.x * 4096 - Scene_cameraX; // L: 1143
						var25 = var29.z - Scene_cameraY; // L: 1144
						var24 = var29.y * 4096 - Scene_cameraZ; // L: 1145
						var14 = var29.orientation2; // L: 1146
						if (var14 != 1 && var14 != 2) { // L: 1148
							var15 = var11; // L: 1149
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) { // L: 1151
							var16 = var24; // L: 1152
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) { // L: 1153
							var29.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11 + var29.xOffset, var25, var24 + var29.yOffset, var29.tag); // L: 1154
						} else if (var29.renderable2 != null) { // L: 1156
							var29.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var11, var25, var24, var29.tag); // L: 1157
						}
					}
				}

				WallObject var27 = var3.wallObject; // L: 1161
				if (var27 != null) { // L: 1162
					if ((var27.orientationB & var3.field2547) != 0 && !this.method4788(var7, var4, var5, var27.orientationB)) { // L: 1163
						var27.renderable2.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 4096 - Scene_cameraX, var27.z - Scene_cameraY, var27.y * 4096 - Scene_cameraZ, var27.tag);
					}

					if ((var27.orientationA & var3.field2547) != 0 && !this.method4788(var7, var4, var5, var27.orientationA)) { // L: 1164
						var27.renderable1.draw(0, Scene_cameraPitchSine, Scene_cameraPitchCosine, Scene_cameraYawSine, Scene_cameraYawCosine, var27.x * 4096 - Scene_cameraX, var27.z - Scene_cameraY, var27.y * 4096 - Scene_cameraZ, var27.tag);
					}
				}
			}

			Tile var30;
			if (var6 < this.planes - 1) { // L: 1167
				var30 = this.tiles[var6 + 1][var4][var5]; // L: 1168
				if (var30 != null && var30.drawSecondary) { // L: 1169
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 < Scene_cameraXTile) { // L: 1171
				var30 = var8[var4 + 1][var5]; // L: 1172
				if (var30 != null && var30.drawSecondary) { // L: 1173
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < Scene_cameraYTile) { // L: 1175
				var30 = var8[var4][var5 + 1]; // L: 1176
				if (var30 != null && var30.drawSecondary) { // L: 1177
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var4 > Scene_cameraXTile) { // L: 1179
				var30 = var8[var4 - 1][var5]; // L: 1180
				if (var30 != null && var30.drawSecondary) { // L: 1181
					Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > Scene_cameraYTile) { // L: 1183
				var30 = var8[var4][var5 - 1]; // L: 1184
				if (var30 != null && var30.drawSecondary) { // L: 1185
					Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IIIIIII)V"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(SceneTilePaint var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - Scene_cameraX; // L: 1193
		int var11;
		int var12 = var11 = (var8 << 7) - Scene_cameraZ; // L: 1195
		int var13;
		int var14 = var13 = var10 + 128; // L: 1197
		int var15;
		int var16 = var15 = var12 + 128; // L: 1199
		int var17 = this.tileHeights[var2][var7][var8] - Scene_cameraY; // L: 1200
		int var18 = this.tileHeights[var2][var7 + 1][var8] - Scene_cameraY; // L: 1201
		int var19 = this.tileHeights[var2][var7 + 1][var8 + 1] - Scene_cameraY; // L: 1202
		int var20 = this.tileHeights[var2][var7][var8 + 1] - Scene_cameraY; // L: 1203
		int var21 = var10 * var6 + var5 * var12 >> 16; // L: 1204
		var12 = var12 * var6 - var5 * var10 >> 16; // L: 1205
		var10 = var21; // L: 1206
		var21 = var17 * var4 - var3 * var12 >> 16; // L: 1207
		var12 = var3 * var17 + var12 * var4 >> 16; // L: 1208
		var17 = var21; // L: 1209
		if (var12 >= 50) { // L: 1210
			var21 = var14 * var6 + var5 * var11 >> 16; // L: 1211
			var11 = var11 * var6 - var5 * var14 >> 16; // L: 1212
			var14 = var21; // L: 1213
			var21 = var18 * var4 - var3 * var11 >> 16; // L: 1214
			var11 = var3 * var18 + var11 * var4 >> 16; // L: 1215
			var18 = var21; // L: 1216
			if (var11 >= 50) { // L: 1217
				var21 = var13 * var6 + var5 * var16 >> 16; // L: 1218
				var16 = var16 * var6 - var5 * var13 >> 16; // L: 1219
				var13 = var21; // L: 1220
				var21 = var19 * var4 - var3 * var16 >> 16; // L: 1221
				var16 = var3 * var19 + var16 * var4 >> 16; // L: 1222
				var19 = var21; // L: 1223
				if (var16 >= 50) { // L: 1224
					var21 = var9 * var6 + var5 * var15 >> 16; // L: 1225
					var15 = var15 * var6 - var5 * var9 >> 16; // L: 1226
					var9 = var21; // L: 1227
					var21 = var20 * var4 - var3 * var15 >> 16; // L: 1228
					var15 = var3 * var20 + var15 * var4 >> 16; // L: 1229
					if (var15 >= 50) { // L: 1231
						int var22 = Rasterizer3D.method4567() + var10 * Rasterizer3D.method4528() / var12; // L: 1232
						int var23 = Rasterizer3D.method4566() + var17 * Rasterizer3D.method4528() / var12; // L: 1233
						int var24 = Rasterizer3D.method4567() + var14 * Rasterizer3D.method4528() / var11; // L: 1234
						int var25 = Rasterizer3D.method4566() + var18 * Rasterizer3D.method4528() / var11; // L: 1235
						int var26 = Rasterizer3D.method4567() + var13 * Rasterizer3D.method4528() / var16; // L: 1236
						int var27 = Rasterizer3D.method4566() + var19 * Rasterizer3D.method4528() / var16; // L: 1237
						int var28 = Rasterizer3D.method4567() + var9 * Rasterizer3D.method4528() / var15; // L: 1238
						int var29 = Rasterizer3D.method4566() + var21 * Rasterizer3D.method4528() / var15; // L: 1239
						float var30 = SecureRandomFuture.method2200(var12); // L: 1240
						float var31 = SecureRandomFuture.method2200(var11); // L: 1241
						float var32 = SecureRandomFuture.method2200(var16); // L: 1242
						float var33 = SecureRandomFuture.method2200(var15); // L: 1243
						Rasterizer3D.field2550.field2832 = 0; // L: 1244
						int var34;
						int var35;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) { // L: 1245
							Rasterizer3D.field2550.field2838 = false; // L: 1246
							var34 = Rasterizer3D.method4594(); // L: 1247
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > var34 || var28 > var34 || var24 > var34) { // L: 1248
								Rasterizer3D.field2550.field2838 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var27, var29, var25, var26, var28, var24)) { // L: 1249
								Scene_selectedX = var7; // L: 1250
								Scene_selectedY = var8; // L: 1251
							}

							if (var1.texture == -1) { // L: 1253
								if (var1.neColor != 12345678) { // L: 1254
									Rasterizer3D.method4536(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.neColor, var1.nwColor, var1.seColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1256
								if (var1.isFlat) { // L: 1257
									Rasterizer3D.method4531(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.neColor, var1.nwColor, var1.seColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture);
								} else {
									Rasterizer3D.method4531(var27, var29, var25, var26, var28, var24, var32, var33, var31, var1.neColor, var1.nwColor, var1.seColor, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.texture); // L: 1258
								}
							} else {
								var35 = Rasterizer3D.field2550.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1261
								Rasterizer3D.method4536(var27, var29, var25, var26, var28, var24, var32, var33, var31, method4778(var35, var1.neColor), method4778(var35, var1.nwColor), method4778(var35, var1.seColor)); // L: 1262
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) { // L: 1265
							Rasterizer3D.field2550.field2838 = false; // L: 1266
							var34 = Rasterizer3D.method4594(); // L: 1267
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > var34 || var24 > var34 || var28 > var34) { // L: 1268
								Rasterizer3D.field2550.field2838 = true;
							}

							if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var23, var25, var29, var22, var24, var28)) { // L: 1269
								Scene_selectedX = var7; // L: 1270
								Scene_selectedY = var8; // L: 1271
							}

							if (var1.texture == -1) { // L: 1273
								if (var1.swColor != 12345678) { // L: 1274
									Rasterizer3D.method4536(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.swColor, var1.seColor, var1.nwColor);
								}
							} else if (!Scene_isLowDetail) { // L: 1276
								Rasterizer3D.method4531(var23, var25, var29, var22, var24, var28, var30, var31, var33, var1.swColor, var1.seColor, var1.nwColor, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.texture); // L: 1277
							} else {
								var35 = Rasterizer3D.field2550.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.texture); // L: 1280
								Rasterizer3D.method4536(var23, var25, var29, var22, var24, var28, var30, var31, var33, method4778(var35, var1.swColor), method4778(var35, var1.seColor), method4778(var35, var1.nwColor)); // L: 1281
							}
						}

					}
				}
			}
		}
	} // L: 1284

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIIIII)V"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(SceneTileModel var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.vertexX.length; // L: 1287

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) { // L: 1288
			var10 = var1.vertexX[var9] - Scene_cameraX; // L: 1289
			var11 = var1.vertexY[var9] - Scene_cameraY; // L: 1290
			var12 = var1.vertexZ[var9] - Scene_cameraZ; // L: 1291
			var13 = var12 * var4 + var5 * var10 >> 16; // L: 1292
			var12 = var5 * var12 - var10 * var4 >> 16; // L: 1293
			var10 = var13; // L: 1294
			var13 = var3 * var11 - var12 * var2 >> 16; // L: 1295
			var12 = var11 * var2 + var3 * var12 >> 16; // L: 1296
			if (var12 < 50) { // L: 1298
				return;
			}

			if (var1.triangleTextureId != null) { // L: 1299
				SceneTileModel.field2716[var9] = var10; // L: 1300
				SceneTileModel.field2717[var9] = var13; // L: 1301
				SceneTileModel.field2718[var9] = var12; // L: 1302
			}

			SceneTileModel.field2713[var9] = Rasterizer3D.method4567() + var10 * Rasterizer3D.method4528() / var12; // L: 1304
			SceneTileModel.field2714[var9] = Rasterizer3D.method4566() + var13 * Rasterizer3D.method4528() / var12; // L: 1305
			SceneTileModel.field2719[var9] = SecureRandomFuture.method2200(var12); // L: 1306
		}

		Rasterizer3D.field2550.field2832 = 0; // L: 1308
		var8 = var1.faceX.length; // L: 1309

		for (var9 = 0; var9 < var8; ++var9) { // L: 1310
			var10 = var1.faceX[var9]; // L: 1311
			var11 = var1.faceY[var9]; // L: 1312
			var12 = var1.faceZ[var9]; // L: 1313
			var13 = SceneTileModel.field2713[var10]; // L: 1314
			int var14 = SceneTileModel.field2713[var11]; // L: 1315
			int var15 = SceneTileModel.field2713[var12]; // L: 1316
			int var16 = SceneTileModel.field2714[var10]; // L: 1317
			int var17 = SceneTileModel.field2714[var11]; // L: 1318
			int var18 = SceneTileModel.field2714[var12]; // L: 1319
			float var19 = SceneTileModel.field2719[var10]; // L: 1320
			float var20 = SceneTileModel.field2719[var11]; // L: 1321
			float var21 = SceneTileModel.field2719[var12]; // L: 1322
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) { // L: 1323
				Rasterizer3D.field2550.field2838 = false; // L: 1324
				int var22 = Rasterizer3D.method4594(); // L: 1325
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > var22 || var14 > var22 || var15 > var22) { // L: 1326
					Rasterizer3D.field2550.field2838 = true;
				}

				if (checkClick && containsBounds(Scene_selectedScreenX, Scene_selectedScreenY, var16, var17, var18, var13, var14, var15)) { // L: 1327
					Scene_selectedX = var6; // L: 1328
					Scene_selectedY = var7; // L: 1329
				}

				if (var1.triangleTextureId != null && var1.triangleTextureId[var9] != -1) { // L: 1331
					if (!Scene_isLowDetail) { // L: 1335
						if (var1.field2715) { // L: 1336
							Rasterizer3D.method4531(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2716[0], SceneTileModel.field2716[1], SceneTileModel.field2716[3], SceneTileModel.field2717[0], SceneTileModel.field2717[1], SceneTileModel.field2717[3], SceneTileModel.field2718[0], SceneTileModel.field2718[1], SceneTileModel.field2718[3], var1.triangleTextureId[var9]);
						} else {
							Rasterizer3D.method4531(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9], SceneTileModel.field2716[var10], SceneTileModel.field2716[var11], SceneTileModel.field2716[var12], SceneTileModel.field2717[var10], SceneTileModel.field2717[var11], SceneTileModel.field2717[var12], SceneTileModel.field2718[var10], SceneTileModel.field2718[var11], SceneTileModel.field2718[var12], var1.triangleTextureId[var9]); // L: 1337
						}
					} else {
						int var23 = Rasterizer3D.field2550.Rasterizer3D_textureLoader.getAverageTextureRGB(var1.triangleTextureId[var9]); // L: 1340
						Rasterizer3D.method4536(var16, var17, var18, var13, var14, var15, var19, var20, var21, method4778(var23, var1.triangleColorA[var9]), method4778(var23, var1.triangleColorB[var9]), method4778(var23, var1.triangleColorC[var9])); // L: 1341
					}
				} else if (var1.triangleColorA[var9] != 12345678) { // L: 1332
					Rasterizer3D.method4536(var16, var17, var18, var13, var14, var15, var19, var20, var21, var1.triangleColorA[var9], var1.triangleColorB[var9], var1.triangleColorC[var9]);
				}
			}
		}

	} // L: 1346

	@ObfuscatedName("bi")
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
							var4.field2680 = 1;
						} else {
							if (var9 >= -32) { // L: 1395
								continue;
							}

							var4.field2680 = 2; // L: 1396
							var9 = -var9; // L: 1397
						}

						var4.field2683 = (var4.minZ - Scene_cameraZ << 8) / var9; // L: 1400
						var4.field2684 = (var4.maxZ - Scene_cameraZ << 8) / var9; // L: 1401
						var4.field2678 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1402
						var4.field2686 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1403
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
							var4.field2680 = 3;
						} else {
							if (var9 >= -32) { // L: 1424
								continue;
							}

							var4.field2680 = 4; // L: 1425
							var9 = -var9; // L: 1426
						}

						var4.field2669 = (var4.minX - Scene_cameraX << 8) / var9; // L: 1429
						var4.field2685 = (var4.maxX - Scene_cameraX << 8) / var9; // L: 1430
						var4.field2678 = (var4.minY - Scene_cameraY << 8) / var9; // L: 1431
						var4.field2686 = (var4.maxY - Scene_cameraY << 8) / var9; // L: 1432
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

						label150:
						for (int var11 = var8; var11 <= var9; ++var11) { // L: 1449
							for (int var12 = var6; var12 <= var7; ++var12) { // L: 1450
								if (visibleTiles[var11][var12]) { // L: 1451
									var10 = true; // L: 1452
									break label150;
								}
							}
						}

						if (var10) { // L: 1457
							var4.field2680 = 5; // L: 1458
							var4.field2669 = (var4.minX - Scene_cameraX << 8) / var5; // L: 1459
							var4.field2685 = (var4.maxX - Scene_cameraX << 8) / var5; // L: 1460
							var4.field2683 = (var4.minZ - Scene_cameraZ << 8) / var5; // L: 1461
							var4.field2684 = (var4.maxZ - Scene_cameraZ << 8) / var5; // L: 1462
							Scene_currentOccluders[Scene_currentOccludersCount++] = var4; // L: 1463
						}
					}
				}
			}
		}

	} // L: 1467

	@ObfuscatedName("bq")
	boolean method4689(int var1, int var2, int var3) {
		int var4 = this.field2592[var1][var2][var3]; // L: 1470
		if (var4 == -Scene_drawnCount) { // L: 1471
			return false;
		} else if (var4 == Scene_drawnCount) { // L: 1472
			return true;
		} else {
			int var5 = var2 << 7; // L: 1473
			int var6 = var3 << 7; // L: 1474
			if (this.method4799(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method4799(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method4799(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4799(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) { // L: 1475
				this.field2592[var1][var2][var3] = Scene_drawnCount; // L: 1476
				return true; // L: 1477
			} else {
				this.field2592[var1][var2][var3] = -Scene_drawnCount; // L: 1480
				return false; // L: 1481
			}
		}
	}

	@ObfuscatedName("bw")
	boolean method4788(int var1, int var2, int var3, int var4) {
		if (!this.method4689(var1, var2, var3)) { // L: 1486
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
						if (!this.method4799(var5, var7, var6)) { // L: 1496
							return false;
						}

						if (!this.method4799(var5, var7, var6 + 128)) { // L: 1497
							return false;
						}
					}

					if (var1 > 0) { // L: 1499
						if (!this.method4799(var5, var8, var6)) { // L: 1500
							return false;
						}

						if (!this.method4799(var5, var8, var6 + 128)) { // L: 1501
							return false;
						}
					}

					if (!this.method4799(var5, var9, var6)) { // L: 1503
						return false;
					}

					if (!this.method4799(var5, var9, var6 + 128)) { // L: 1504
						return false;
					}

					return true; // L: 1505
				}

				if (var4 == 2) { // L: 1507
					if (var6 < Scene_cameraZ) { // L: 1508
						if (!this.method4799(var5, var7, var6 + 128)) { // L: 1509
							return false;
						}

						if (!this.method4799(var5 + 128, var7, var6 + 128)) { // L: 1510
							return false;
						}
					}

					if (var1 > 0) { // L: 1512
						if (!this.method4799(var5, var8, var6 + 128)) { // L: 1513
							return false;
						}

						if (!this.method4799(var5 + 128, var8, var6 + 128)) { // L: 1514
							return false;
						}
					}

					if (!this.method4799(var5, var9, var6 + 128)) { // L: 1516
						return false;
					}

					if (!this.method4799(var5 + 128, var9, var6 + 128)) { // L: 1517
						return false;
					}

					return true; // L: 1518
				}

				if (var4 == 4) { // L: 1520
					if (var5 < Scene_cameraX) { // L: 1521
						if (!this.method4799(var5 + 128, var7, var6)) { // L: 1522
							return false;
						}

						if (!this.method4799(var5 + 128, var7, var6 + 128)) { // L: 1523
							return false;
						}
					}

					if (var1 > 0) { // L: 1525
						if (!this.method4799(var5 + 128, var8, var6)) { // L: 1526
							return false;
						}

						if (!this.method4799(var5 + 128, var8, var6 + 128)) { // L: 1527
							return false;
						}
					}

					if (!this.method4799(var5 + 128, var9, var6)) { // L: 1529
						return false;
					}

					if (!this.method4799(var5 + 128, var9, var6 + 128)) { // L: 1530
						return false;
					}

					return true; // L: 1531
				}

				if (var4 == 8) { // L: 1533
					if (var6 > Scene_cameraZ) { // L: 1534
						if (!this.method4799(var5, var7, var6)) { // L: 1535
							return false;
						}

						if (!this.method4799(var5 + 128, var7, var6)) { // L: 1536
							return false;
						}
					}

					if (var1 > 0) { // L: 1538
						if (!this.method4799(var5, var8, var6)) { // L: 1539
							return false;
						}

						if (!this.method4799(var5 + 128, var8, var6)) { // L: 1540
							return false;
						}
					}

					if (!this.method4799(var5, var9, var6)) { // L: 1542
						return false;
					}

					if (!this.method4799(var5 + 128, var9, var6)) { // L: 1543
						return false;
					}

					return true; // L: 1544
				}
			}

			if (!this.method4799(var5 + 64, var10, var6 + 64)) { // L: 1547
				return false;
			} else if (var4 == 16) { // L: 1548
				return this.method4799(var5, var9, var6 + 128); // L: 1549
			} else if (var4 == 32) { // L: 1552
				return this.method4799(var5 + 128, var9, var6 + 128); // L: 1553
			} else if (var4 == 64) { // L: 1556
				return this.method4799(var5 + 128, var9, var6); // L: 1557
			} else if (var4 == 128) { // L: 1560
				return this.method4799(var5, var9, var6); // L: 1561
			} else {
				return true; // L: 1564
			}
		}
	}

	@ObfuscatedName("ce")
	boolean method4821(int var1, int var2, int var3, int var4) {
		if (!this.method4689(var1, var2, var3)) { // L: 1568
			return false;
		} else {
			int var5 = var2 << 7; // L: 1569
			int var6 = var3 << 7; // L: 1570
			return this.method4799(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method4799(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4799(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4799(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1); // L: 1571
		}
	}

	@ObfuscatedName("cu")
	boolean method4711(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) { // L: 1576
			if (!this.method4689(var1, var2, var4)) { // L: 1577
				return false;
			} else {
				var7 = var2 << 7; // L: 1578
				var8 = var4 << 7; // L: 1579
				return this.method4799(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method4799(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4799(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4799(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1); // L: 1580
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) { // L: 1583
				for (var8 = var4; var8 <= var5; ++var8) { // L: 1584
					if (this.field2592[var1][var7][var8] == -Scene_drawnCount) { // L: 1585
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1; // L: 1588
			var8 = (var4 << 7) + 2; // L: 1589
			int var9 = this.tileHeights[var1][var2][var4] - var6; // L: 1590
			if (!this.method4799(var7, var9, var8)) { // L: 1591
				return false;
			} else {
				int var10 = (var3 << 7) - 1; // L: 1592
				if (!this.method4799(var10, var9, var8)) { // L: 1593
					return false;
				} else {
					int var11 = (var5 << 7) - 1; // L: 1594
					if (!this.method4799(var7, var9, var11)) { // L: 1595
						return false;
					} else if (!this.method4799(var10, var9, var11)) { // L: 1596
						return false;
					} else {
						return true; // L: 1597
					}
				}
			}
		}
	}

	@ObfuscatedName("cw")
	boolean method4799(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Scene_currentOccludersCount; ++var4) { // L: 1601
			Occluder var5 = Scene_currentOccluders[var4]; // L: 1602
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2680 == 1) { // L: 1603
				var6 = var5.minX - var1; // L: 1604
				if (var6 > 0) { // L: 1605
					var7 = (var6 * var5.field2683 >> 8) + var5.minZ; // L: 1606
					var8 = (var6 * var5.field2684 >> 8) + var5.maxZ; // L: 1607
					var9 = (var6 * var5.field2678 >> 8) + var5.minY; // L: 1608
					var10 = (var6 * var5.field2686 >> 8) + var5.maxY; // L: 1609
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1610
						return true;
					}
				}
			} else if (var5.field2680 == 2) { // L: 1614
				var6 = var1 - var5.minX; // L: 1615
				if (var6 > 0) { // L: 1616
					var7 = (var6 * var5.field2683 >> 8) + var5.minZ; // L: 1617
					var8 = (var6 * var5.field2684 >> 8) + var5.maxZ; // L: 1618
					var9 = (var6 * var5.field2678 >> 8) + var5.minY; // L: 1619
					var10 = (var6 * var5.field2686 >> 8) + var5.maxY; // L: 1620
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1621
						return true;
					}
				}
			} else if (var5.field2680 == 3) { // L: 1625
				var6 = var5.minZ - var3; // L: 1626
				if (var6 > 0) { // L: 1627
					var7 = (var6 * var5.field2669 >> 8) + var5.minX; // L: 1628
					var8 = (var6 * var5.field2685 >> 8) + var5.maxX; // L: 1629
					var9 = (var6 * var5.field2678 >> 8) + var5.minY; // L: 1630
					var10 = (var6 * var5.field2686 >> 8) + var5.maxY; // L: 1631
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1632
						return true;
					}
				}
			} else if (var5.field2680 == 4) { // L: 1636
				var6 = var3 - var5.minZ; // L: 1637
				if (var6 > 0) { // L: 1638
					var7 = (var6 * var5.field2669 >> 8) + var5.minX; // L: 1639
					var8 = (var6 * var5.field2685 >> 8) + var5.maxX; // L: 1640
					var9 = (var6 * var5.field2678 >> 8) + var5.minY; // L: 1641
					var10 = (var6 * var5.field2686 >> 8) + var5.maxY; // L: 1642
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) { // L: 1643
						return true;
					}
				}
			} else if (var5.field2680 == 5) { // L: 1647
				var6 = var2 - var5.minY; // L: 1648
				if (var6 > 0) { // L: 1649
					var7 = (var6 * var5.field2669 >> 8) + var5.minX; // L: 1650
					var8 = (var6 * var5.field2685 >> 8) + var5.maxX; // L: 1651
					var9 = (var6 * var5.field2683 >> 8) + var5.minZ; // L: 1652
					var10 = (var6 * var5.field2684 >> 8) + var5.maxZ; // L: 1653
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) { // L: 1654
						return true;
					}
				}
			}
		}

		return false; // L: 1659
	}

	@ObfuscatedName("ax")
	@Export("Scene_addOccluder")
	public static void Scene_addOccluder(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Occluder var8 = new Occluder(); // L: 149
		var8.minTileX = var2 / 128; // L: 150
		var8.maxTileX = var3 / 128; // L: 151
		var8.minTileY = var4 / 128; // L: 152
		var8.maxTileY = var5 / 128; // L: 153
		var8.type = var1; // L: 154
		var8.minX = var2; // L: 155
		var8.maxX = var3; // L: 156
		var8.minZ = var4; // L: 157
		var8.maxZ = var5; // L: 158
		var8.minY = var6; // L: 159
		var8.maxY = var7; // L: 160
		Scene_planeOccluders[var0][Scene_planeOccluderCounts[var0]++] = var8; // L: 161
	} // L: 162

	@ObfuscatedName("bt")
	@Export("Scene_buildVisiblityMap")
	public static void Scene_buildVisiblityMap(int[] var0, int var1, int var2, int var3, int var4) {
		Scene_viewportXMin = 0; // L: 636
		Scene_viewportYMin = 0; // L: 637
		Scene_viewportXMax = var3; // L: 638
		Scene_viewportYMax = var4; // L: 639
		Scene_viewportXCenter = var3 / 2; // L: 640
		Scene_viewportYCenter = var4 / 2; // L: 641
		boolean[][][][] var5 = new boolean[var0.length][32][53][53]; // L: 642

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) { // L: 643
			for (var7 = 0; var7 < 2048; var7 += 64) { // L: 644
				Scene_cameraPitchSine = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 645
				Scene_cameraPitchCosine = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 646
				Scene_cameraYawSine = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 647
				Scene_cameraYawCosine = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 648
				var8 = (var6 - 128) / 32; // L: 649
				var9 = var7 / 64; // L: 650

				for (int var10 = -26; var10 < 26; ++var10) { // L: 651
					for (var11 = -26; var11 < 26; ++var11) { // L: 652
						var12 = var10 * 128; // L: 653
						int var13 = var11 * 128; // L: 654
						boolean var14 = false; // L: 655

						for (int var15 = -var1; var15 <= var2; var15 += 128) { // L: 656
							if (method4670(var12, var0[var8] + var15, var13)) { // L: 657
								var14 = true; // L: 658
								break;
							}
						}

						var5[var8][var9][var10 + 1 + 25][var11 + 1 + 25] = var14; // L: 662
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) { // L: 667
			for (var7 = 0; var7 < 32; ++var7) { // L: 668
				for (var8 = -25; var8 < 25; ++var8) { // L: 669
					for (var9 = -25; var9 < 25; ++var9) { // L: 670
						boolean var16 = false; // L: 671

						label84:
						for (var11 = -1; var11 <= 1; ++var11) { // L: 672
							for (var12 = -1; var12 <= 1; ++var12) { // L: 673
								if (var5[var6][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 674
									var16 = true; // L: 675
									break label84;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 678
									var16 = true; // L: 679
									break label84; // L: 680
								}

								if (var5[var6 + 1][var7][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 682
									var16 = true; // L: 683
									break label84; // L: 684
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 1 + 25][var9 + var12 + 1 + 25]) { // L: 686
									var16 = true; // L: 687
									break label84; // L: 688
								}
							}
						}

						visibilityMap[var6][var7][var8 + 25][var9 + 25] = var16; // L: 692
					}
				}
			}
		}

	} // L: 697

	@ObfuscatedName("bm")
	static boolean method4670(int var0, int var1, int var2) {
		int var3 = var0 * Scene_cameraYawCosine + var2 * Scene_cameraYawSine >> 16; // L: 700
		int var4 = var2 * Scene_cameraYawCosine - var0 * Scene_cameraYawSine >> 16; // L: 701
		int var5 = var4 * Scene_cameraPitchCosine + Scene_cameraPitchSine * var1 >> 16; // L: 702
		int var6 = Scene_cameraPitchCosine * var1 - var4 * Scene_cameraPitchSine >> 16; // L: 703
		if (var5 >= 50 && var5 <= 3500) { // L: 704
			int var7 = var3 * 128 / var5 + Scene_viewportXCenter; // L: 705
			int var8 = var6 * 128 / var5 + Scene_viewportYCenter; // L: 706
			return var7 >= Scene_viewportXMin && var7 <= Scene_viewportXMax && var8 >= Scene_viewportYMin && var8 <= Scene_viewportYMax; // L: 707
		} else {
			return false; // L: 708
		}
	}

	@ObfuscatedName("bc")
	@Export("shouldSendWalk")
	public static boolean shouldSendWalk() {
		return viewportWalking && Scene_selectedX != -1; // L: 727
	}

	@ObfuscatedName("bu")
	public static void method4783() {
		Scene_selectedX = -1; // L: 731
		viewportWalking = false; // L: 732
	} // L: 733

	@ObfuscatedName("bj")
	static final int method4778(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7; // L: 1349
		if (var1 < 2) { // L: 1350
			var1 = 2;
		} else if (var1 > 126) { // L: 1351
			var1 = 126;
		}

		return (var0 & 65408) + var1; // L: 1352
	}

	@ObfuscatedName("bx")
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
