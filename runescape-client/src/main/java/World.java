import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("World")
public class World {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1728801439
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1039031469
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("r")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("h")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1045630855
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 425898455
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -372282787
	)
	@Export("population")
	int population;
	@ObfuscatedName("k")
	@Export("host")
	String host;
	@ObfuscatedName("g")
	@Export("activity")
	String activity;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1961893903
	)
	@Export("location")
	int location;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 724778095
	)
	@Export("index")
	int index;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1633198198"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-896740127"
	)
	boolean method1749() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1876446967"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2071254222"
	)
	boolean method1757() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1854711947"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "39105033"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-31490"
	)
	boolean method1778() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2001631546"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World_sortOption1[var5] != var0) {
				var2[var4] = World_sortOption1[var5];
				var3[var4] = World_sortOption2[var5];
				++var4;
			}
		}

		World_sortOption1 = var2;
		World_sortOption2 = var3;
		FileSystem.sortWorlds(World_worlds, 0, World_worlds.length - 1, World_sortOption1, World_sortOption2);
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IS)V",
		garbageValue = "-356"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1276 >= Client.cycle) {
			Messages.method2461(var0);
		} else if (var0.field1269 >= Client.cycle) {
			WorldMapLabelSize.method3279(var0);
		} else {
			SoundCache.method930(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1276 = 0;
			var0.field1269 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1225 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1225 * 64;
			var0.method2263();
		}

		if (class262.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field1276 = 0;
			var0.field1269 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field1225 * 64;
			var0.y = var0.pathY[0] * 128 + var0.field1225 * 64;
			var0.method2263();
		}

		if (var0.field1275 != 0) {
			if (var0.targetIndex != -1) {
				Object var2 = null;
				if (var0.targetIndex < 32768) {
					var2 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var2 = Client.players[var0.targetIndex - 32768];
				}

				if (var2 != null) {
					int var3 = var0.x - ((Actor)var2).x;
					int var4 = var0.y - ((Actor)var2).y;
					if (var3 != 0 || var4 != 0) {
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field1280 != -1 && (var0.pathLength == 0 || var0.field1242 > 0)) {
				var0.orientation = var0.field1280;
				var0.field1280 = -1;
			}

			int var5 = var0.orientation - var0.rotation & 2047;
			if (var5 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var5 != 0) {
				++var0.field1274;
				boolean var7;
				if (var5 > 1024) {
					var0.rotation -= var0.field1275;
					var7 = true;
					if (var5 < var0.field1275 || var5 > 2048 - var0.field1275) {
						var0.rotation = var0.orientation;
						var7 = false;
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1274 > 25 || var7)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1275;
					var7 = true;
					if (var5 < var0.field1275 || var5 > 2048 - var0.field1275) {
						var0.rotation = var0.orientation;
						var7 = false;
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1274 > 25 || var7)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field1274 = 0;
			}
		}

		class0.method11(var0);
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lcj;IIB)V",
		garbageValue = "2"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = WorldMapScaleHandler.SequenceDefinition_get(var1).field1894;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1258 = 0;
			}

			if (var3 == 2) {
				var0.field1258 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || WorldMapScaleHandler.SequenceDefinition_get(var1).field1892 >= WorldMapScaleHandler.SequenceDefinition_get(var0.sequence).field1892) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1258 = 0;
			var0.field1281 = var0.pathLength;
		}

	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1994807431"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		class233.method4541();
		if (class289.friendsChatManager != null) {
			class289.friendsChatManager.invalidateIgnoreds();
		}

	}
}
