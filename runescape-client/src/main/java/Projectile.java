import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 127950911
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1863046985
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1665161409
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -893343909
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -263031347
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2028575857
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 982684035
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 628428817
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 941880901
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1476235573
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1149707689
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("o")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("n")
	@Export("x")
	double x;
	@ObfuscatedName("x")
	@Export("y")
	double y;
	@ObfuscatedName("p")
	@Export("z")
	double z;
	@ObfuscatedName("r")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("y")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("s")
	@Export("speed")
	double speed;
	@ObfuscatedName("j")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("w")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 424232085
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -833335819
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Ljg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 795159959
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 529023201
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = HealthBarUpdate.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class105.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-968797731"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1771638026"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += (double)var1 * this.speedY;
		this.z += this.speedZ * (double)var1 + 0.5D * this.accelerationZ * (double)var1 * (double)var1;
		this.speedZ += this.accelerationZ * (double)var1;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			this.frameCycle += var1;

			while (true) {
				do {
					do {
						if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
							return;
						}

						this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.frame = 0;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Leh;",
		garbageValue = "-2070677844"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = HealthBarUpdate.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-809557598"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1613642703"
	)
	public static void method2228() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		signature = "(IIB)V",
		garbageValue = "-73"
	)
	@Export("playSoundJingle")
	static void playSoundJingle(int var0, int var1) {
		if (Client.musicVolume != 0 && var0 != -1) {
			Canvas.method952(AbstractByteArrayCopier.archive11, var0, 0, Client.musicVolume, false);
			Client.field916 = true;
		}

	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-206735455"
	)
	static void method2226() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			ArchiveLoader.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		signature = "(IIZI)V",
		garbageValue = "506267788"
	)
	static final void method2223(int var0, int var1, boolean var2) {
		if (!var2 || var0 != GrandExchangeEvent.field78 || AbstractWorldMapData.field198 != var1) {
			GrandExchangeEvent.field78 = var0;
			AbstractWorldMapData.field198 = var1;
			BuddyRankComparator.updateGameState(25);
			AbstractWorldMapData.drawLoadingMessage("Loading - please wait.", true);
			int var3 = FloorDecoration.baseX * 64;
			int var4 = WorldMapData_0.baseY * 64;
			FloorDecoration.baseX = (var0 - 6) * 8;
			WorldMapData_0.baseY = (var1 - 6) * 8;
			int var5 = FloorDecoration.baseX * 64 - var3;
			int var6 = WorldMapData_0.baseY * 64 - var4;
			var3 = FloorDecoration.baseX * 64;
			var4 = WorldMapData_0.baseY * 64;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var8 = Client.npcs[var7];
				if (var8 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var8.pathX;
						var10000[var9] -= var5;
						var10000 = var8.pathY;
						var10000[var9] -= var6;
					}

					var8.x -= var5 * 128;
					var8.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var21 = Client.players[var7];
				if (var21 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var21.pathX;
						var10000[var9] -= var5;
						var10000 = var21.pathY;
						var10000[var9] -= var6;
					}

					var21.x -= var5 * 128;
					var21.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var18 = 104;
			byte var22 = 1;
			if (var5 < 0) {
				var20 = 103;
				var18 = -1;
				var22 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var13 != var18; var13 += var22) {
				for (var14 = var10; var14 != var11; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var14 + var6;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var19 = (PendingSpawn)Client.pendingSpawns.last(); var19 != null; var19 = (PendingSpawn)Client.pendingSpawns.previous()) {
				var19.x -= var5;
				var19.y -= var6;
				if (var19.x < 0 || var19.y < 0 || var19.x >= 104 || var19.y >= 104) {
					var19.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			ItemContainer.cameraX -= var5 << 7;
			WorldMapManager.cameraZ -= var6 << 7;
			TileItem.oculusOrbFocalPointX -= var5 << 7;
			Interpreter.oculusOrbFocalPointY -= var6 << 7;
			Client.field906 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}
}
