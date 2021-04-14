import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1068128585
	)
	@Export("x")
	int x;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1496580437
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1434789983
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("aj")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -211651151
	)
	int field1258;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1629185903
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1638489447
	)
	@Export("readySequence")
	int readySequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1105812335
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1459534643
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -197807279
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1105024071
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 910987067
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -943524147
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2019858221
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("au")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ab")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("aa")
	boolean field1208;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1791931697
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1625309775
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1793952127
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("ah")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ae")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bh")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("br")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bn")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bi")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		signature = "Ljc;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 421944119
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bt")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -877553659
	)
	int field1237;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1958333453
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1237612855
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 950039177
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1061585055
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -692137845
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 830949033
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1415641635
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 334019467
	)
	int field1245;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -946982677
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1701654947
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1718225643
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 708623357
	)
	int field1249;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 375803761
	)
	int field1238;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1376238069
	)
	int field1240;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1384218543
	)
	int field1252;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1368903785
	)
	int field1253;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1912998321
	)
	int field1239;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1793257471
	)
	int field1255;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -836085199
	)
	int field1268;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1011086267
	)
	int field1213;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -966578099
	)
	int field1220;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 890714575
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1457707769
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -551796625
	)
	int field1261;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1810654447
	)
	int field1262;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1223856599
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cc")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cn")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ca")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -570005291
	)
	int field1267;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1192220791
	)
	int field1224;

	Actor() {
		this.isWalking = false;
		this.field1258 = 1;
		this.readySequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field1208 = false;
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
		this.field1237 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1245 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.field1220 = 0;
		this.defaultHeight = 200;
		this.field1261 = 0;
		this.field1262 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field1267 = 0;
		this.field1224 = 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-3"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "20"
	)
	final void method2157() {
		this.pathLength = 0;
		this.field1224 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(IIIIIII)V",
		garbageValue = "-186188203"
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
			HitSplatDefinition var12 = StudioGame.method4391(var1);
			var10 = var12.field3586;
			var11 = var12.field3581;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		signature = "(IIIIIII)V",
		garbageValue = "1980321202"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
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
			if (var13.definition.field3445 == var8.field3445) {
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1124408084"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "1120048289"
	)
	public static void method2173(boolean var0) {
		if (var0 != class21.ItemDefinition_inMembersWorld) {
			WorldMapLabelSize.method2678();
			class21.ItemDefinition_inMembersWorld = var0;
		}

	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		signature = "(B)Lmr;",
		garbageValue = "14"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return UserComparator4.worldMap;
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		signature = "(IS)V",
		garbageValue = "19847"
	)
	static void method2174(int var0) {
		Client.oculusOrbState = var0;
	}
}
