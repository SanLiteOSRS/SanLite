import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		signature = "[Lly;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 136172069
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1402910771
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1011628117
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("at")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -477017185
	)
	int field1007;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1508823583
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1984168657
	)
	@Export("readySequence")
	int readySequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 845088399
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1336726555
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1451963771
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2000722135
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 207993293
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1423094315
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1748919145
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("aj")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("an")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ai")
	boolean field968;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -263246735
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1742046101
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -815377649
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("av")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ao")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bj")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bn")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bi")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bp")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		signature = "Ljv;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1403434087
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bx")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1507873993
	)
	int field981;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -203452431
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1749828811
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1321307133
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1530341969
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1363131469
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 2014778209
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1060389691
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1582636697
	)
	int field973;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1271026177
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -416499547
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1172946753
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1898700159
	)
	int field993;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2097471137
	)
	int field994;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1384002081
	)
	int field992;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -2137511937
	)
	int field996;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -2030426109
	)
	int field952;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -593176361
	)
	int field998;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 798187101
	)
	int field999;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 145719275
	)
	int field1000;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 423082639
	)
	int field1001;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -724191925
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -250505211
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 373581305
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1380674587
	)
	int field957;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1991830867
	)
	int field1006;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1201240635
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cj")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cr")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ca")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 349923111
	)
	int field989;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1293926575
	)
	int field1012;

	Actor() {
		this.isWalking = false;
		this.field1007 = 1;
		this.readySequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field968 = false;
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
		this.field981 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field973 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field957 = 0;
		this.field1006 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field989 = 0;
		this.field1012 = 0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-251916247"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1387787360"
	)
	final void method1848() {
		this.pathLength = 0;
		this.field1012 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(IIIIIIB)V",
		garbageValue = "104"
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
			HitSplatDefinition var12 = ScriptFrame.method1222(var1);
			var10 = var12.field3375;
			var11 = var12.field3364;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		signature = "(IIIIIIB)V",
		garbageValue = "0"
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
			if (var13.definition.field3312 == var8.field3312) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "24"
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "424984717"
	)
	public static void method1867(boolean var0) {
		if (class297.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeMedium(0);
				class297.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					class297.NetCache_socket.close();
				} catch (Exception var3) {
				}

				++NetCache.NetCache_ioExceptions;
				class297.NetCache_socket = null;
			}

		}
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1068788857"
	)
	static final void method1868() {
		int[] var0 = Players.Players_indices;

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) {
			Player var2 = Client.players[var0[var1]];
			if (var2 != null && var2.overheadTextCyclesRemaining > 0) {
				--var2.overheadTextCyclesRemaining;
				if (var2.overheadTextCyclesRemaining == 0) {
					var2.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) {
			int var4 = Client.npcIndices[var1];
			NPC var3 = Client.npcs[var4];
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
				--var3.overheadTextCyclesRemaining;
				if (var3.overheadTextCyclesRemaining == 0) {
					var3.overheadText = null;
				}
			}
		}

	}
}
