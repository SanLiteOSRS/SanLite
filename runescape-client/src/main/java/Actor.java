import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -60079109
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1766175129
	)
	@Export("y")
	int y;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 309307455
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("al")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -508330989
	)
	int field1211;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1856466777
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1523832987
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1651347451
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -894700151
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -644124853
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -260839917
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1673254867
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1777299595
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 258726619
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ac")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("az")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("aq")
	boolean field1223;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 441130155
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -506528051
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1268134939
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("an")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bd")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bw")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bf")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bu")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bb")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2001939337
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("by")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 713159597
	)
	int field1247;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1142077753
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1571862761
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 894074389
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -128111571
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1558553463
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1657374705
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1057732107
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1401992799
	)
	int field1244;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1781887565
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1474223197
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -481375045
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 895533867
	)
	int field1243;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 724261779
	)
	int field1224;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1356856001
	)
	int field1236;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 357124569
	)
	int field1251;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 837192135
	)
	int field1252;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -832167709
	)
	int field1253;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1244121347
	)
	int field1254;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1639074179
	)
	int field1237;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1718337881
	)
	int field1256;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1061708383
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1167885103
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 108366915
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1846500997
	)
	int field1248;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2042152507
	)
	int field1261;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1984582191
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cf")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cq")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cs")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -2122964403
	)
	int field1250;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -681332491
	)
	int field1215;

	Actor() {
		this.isWalking = false;
		this.field1211 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field1223 = false;
		this.overheadTextCyclesRemaining = 100;
		this.overheadTextColor = 0;
		this.overheadTextEffect = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1247 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1244 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1248 = 0;
		this.field1261 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field1250 = 0;
		this.field1215 = 0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1701330496"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "580510883"
	)
	final void method2194() {
		this.pathLength = 0;
		this.field1215 = 0;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "0"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var13 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var1);
			HitSplatDefinition var12;
			if (var13 != null) {
				var12 = var13;
			} else {
				byte[] var14 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var1);
				var13 = new HitSplatDefinition();
				if (var14 != null) {
					var13.decode(new Buffer(var14));
				}

				HitSplatDefinition.HitSplatDefinition_cached.put(var13, (long)var1);
				var12 = var13;
			}

			var10 = var12.field1752;
			var11 = var12.field1735;
		}

		int var15;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var15 = 0;
			if (var10 == 0) {
				var15 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var15 = this.hitSplatValues[0];
			}

			for (int var16 = 1; var16 < 4; ++var16) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var16] < var15) {
						var9 = var16;
						var15 = this.hitSplatCycles[var16];
					}
				} else if (var10 == 1 && this.hitSplatValues[var16] < var15) {
					var9 = var16;
					var15 = this.hitSplatValues[var16];
				}
			}

			if (var10 == 1 && var15 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var15 = 0; var15 < 4; ++var15) {
				byte var17 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var17] <= var5) {
					var9 = var17;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1818079351"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.field1596.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.field1596.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field1597 == var8.field1597) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1438107880"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.field1596.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.field1596.put(var3, (long)var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1704817926"
	)
	static final void method2199(int var0, int var1, boolean var2) {
		if (!var2 || var0 != MusicPatchNode2.field2827 || class11.field112 != var1) {
			MusicPatchNode2.field2827 = var0;
			class11.field112 = var1;
			Client.updateGameState(25);
			class7.drawLoadingMessage("Loading - please wait.", true);
			int var3 = JagexCache.baseX * 64;
			int var4 = Messages.baseY * 64;
			JagexCache.baseX = (var0 - 6) * 8;
			Messages.baseY = (var1 - 6) * 8;
			int var5 = JagexCache.baseX * 64 - var3;
			int var6 = Messages.baseY * 64 - var4;
			var3 = JagexCache.baseX * 64;
			var4 = Messages.baseY * 64;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var19 = Client.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = Client.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
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
			for (int var13 = var20; var13 != var8; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var6 + var14;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
				var18.x -= var5;
				var18.y -= var6;
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
					var18.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			class20.cameraX -= var5 << 7;
			WorldMapDecoration.cameraZ -= var6 << 7;
			HorizontalAlignment.oculusOrbFocalPointX -= var5 << 7;
			class280.oculusOrbFocalPointY -= var6 << 7;
			Client.field848 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}
}
