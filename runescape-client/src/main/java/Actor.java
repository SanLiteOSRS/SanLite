import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cl")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2082301251
	)
	@Export("x")
	int x;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 201162729
	)
	@Export("y")
	int y;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -843576201
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -44581457
	)
	int field1201;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 187862823
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2069657441
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -344103579
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1645061365
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2128083475
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1087764383
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1509034049
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -938435851
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 684246447
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -749362017
	)
	int field1181;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 433711015
	)
	int field1151;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1396311481
	)
	int field1152;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1631079087
	)
	int field1153;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1713723467
	)
	int field1209;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -308852591
	)
	int field1184;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 916016745
	)
	int field1156;
	@ObfuscatedName("aa")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("bx")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("bh")
	boolean field1155;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 2132728057
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 128260117
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -513565809
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("bg")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bd")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bk")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bc")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bv")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -177989563
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("br")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1147619093
	)
	int field1203;
	@ObfuscatedName("by")
	boolean field1173;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1935010867
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -454451479
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -974665831
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -188171203
	)
	int field1160;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1963515013
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1749938985
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -986209861
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1799281131
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 94715391
	)
	int field1210;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 358038643
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1833683875
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1617465677
	)
	int field1142;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 801618611
	)
	int field1186;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1449841861
	)
	int field1159;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 201933441
	)
	int field1150;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1846469473
	)
	int field1189;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 661045753
	)
	int field1190;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 2028156093
	)
	int field1188;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -2024536551
	)
	int field1192;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -473772391
	)
	int field1193;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1018346863
	)
	int field1194;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1150467361
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -500790387
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 763616681
	)
	int field1197;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -866481861
	)
	int field1198;
	@ObfuscatedName("cm")
	byte field1199;
	@ObfuscatedName("cc")
	byte field1200;
	@ObfuscatedName("cr")
	byte field1185;
	@ObfuscatedName("ct")
	byte field1202;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 36455077
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1135644645
	)
	int field1204;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1831269937
	)
	int field1205;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1973809325
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cx")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cp")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "[Lgo;"
	)
	@Export("pathTraversed")
	class202[] pathTraversed;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1183618047
	)
	int field1172;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -220662997
	)
	int field1211;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1419553213
	)
	int field1212;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1201 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.field1181 = -1; // L: 24
		this.field1151 = -1; // L: 25
		this.field1152 = -1; // L: 26
		this.field1153 = -1; // L: 27
		this.field1209 = -1; // L: 28
		this.field1184 = -1; // L: 29
		this.field1156 = -1; // L: 30
		this.overheadText = null; // L: 31
		this.field1155 = false; // L: 33
		this.overheadTextCyclesRemaining = 100; // L: 34
		this.overheadTextColor = 0; // L: 35
		this.overheadTextEffect = 0; // L: 36
		this.hitSplatCount = 0; // L: 38
		this.hitSplatTypes = new int[4]; // L: 39
		this.hitSplatValues = new int[4]; // L: 40
		this.hitSplatCycles = new int[4]; // L: 41
		this.hitSplatTypes2 = new int[4]; // L: 42
		this.hitSplatValues2 = new int[4]; // L: 43
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false; // L: 46
		this.field1203 = -1; // L: 47
		this.movementSequence = -1; // L: 49
		this.movementFrame = 0; // L: 50
		this.movementFrameCycle = 0; // L: 51
		this.field1160 = 0; // L: 52
		this.sequence = -1; // L: 53
		this.sequenceFrame = 0; // L: 54
		this.sequenceFrameCycle = 0; // L: 55
		this.sequenceDelay = 0; // L: 56
		this.field1210 = 0; // L: 57
		this.spotAnimation = -1; // L: 58
		this.spotAnimationFrame = 0; // L: 59
		this.field1142 = 0; // L: 60
		this.npcCycle = 0; // L: 70
		this.defaultHeight = 200; // L: 71
		this.field1197 = -1; // L: 72
		this.field1198 = -1; // L: 73
		this.field1204 = 0; // L: 79
		this.field1205 = 32; // L: 80
		this.pathLength = 0; // L: 81
		this.pathX = new int[10]; // L: 82
		this.pathY = new int[10]; // L: 83
		this.pathTraversed = new class202[10]; // L: 84
		this.field1172 = 0; // L: 85
		this.field1211 = 0; // L: 86
		this.field1212 = -1; // L: 87
	} // L: 89

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "246357037"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 97
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1312167120"
	)
	final void method2316() {
		this.pathLength = 0; // L: 92
		this.field1211 = 0; // L: 93
	} // L: 94

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1854118366"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 101
		boolean var8 = true; // L: 102

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 103
			if (this.hitSplatCycles[var9] > var5) { // L: 104
				var7 = false;
			} else {
				var8 = false; // L: 105
			}
		}

		var9 = -1; // L: 107
		int var10 = -1; // L: 108
		int var11 = 0; // L: 109
		if (var1 >= 0) { // L: 110
			HitSplatDefinition var12 = class158.method3241(var1); // L: 111
			var10 = var12.field2067; // L: 112
			var11 = var12.field2056; // L: 113
		}

		int var14;
		if (var8) { // L: 115
			if (var10 == -1) { // L: 116
				return;
			}

			var9 = 0; // L: 117
			var14 = 0; // L: 118
			if (var10 == 0) { // L: 119
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 120
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) { // L: 122
					if (this.hitSplatCycles[var13] < var14) { // L: 123
						var9 = var13; // L: 124
						var14 = this.hitSplatCycles[var13]; // L: 125
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 128 129
					var9 = var13; // L: 130
					var14 = this.hitSplatValues[var13]; // L: 131
				}
			}

			if (var10 == 1 && var14 >= var2) { // L: 135
				return;
			}
		} else {
			if (var7) { // L: 138
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 139
				byte var15 = this.hitSplatCount; // L: 140
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 141
				if (this.hitSplatCycles[var15] <= var5) { // L: 142
					var9 = var15; // L: 143
					break; // L: 144
				}
			}
		}

		if (var9 >= 0) { // L: 148
			this.hitSplatTypes[var9] = var1; // L: 149
			this.hitSplatValues[var9] = var2; // L: 150
			this.hitSplatTypes2[var9] = var3; // L: 151
			this.hitSplatValues2[var9] = var4; // L: 152
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 153
		}
	} // L: 154

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1902970487"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = ModeWhere.method6594(var1); // L: 157
		HealthBar var8 = null; // L: 158
		HealthBar var9 = null; // L: 159
		int var10 = var7.int2; // L: 160
		int var11 = 0; // L: 161

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 162
			++var11; // L: 163
			if (var12.definition.field1929 == var7.field1929) { // L: 164
				var12.put(var2 + var4, var5, var6, var3); // L: 165
				return; // L: 166
			}

			if (var12.definition.int1 <= var7.int1) { // L: 168
				var8 = var12;
			}

			if (var12.definition.int2 > var10) { // L: 169
				var9 = var12; // L: 170
				var10 = var12.definition.int2; // L: 171
			}
		}

		if (var9 != null || var11 < 4) { // L: 174
			var12 = new HealthBar(var7); // L: 175
			if (var8 == null) { // L: 176
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8); // L: 177
			}

			var12.put(var2 + var4, var5, var6, var3); // L: 178
			if (var11 >= 4) { // L: 179
				var9.remove();
			}

		}
	} // L: 180

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1211388115"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = ModeWhere.method6594(var1); // L: 183

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 184
			if (var2 == var3.definition) { // L: 185
				var3.remove(); // L: 186
				return; // L: 187
			}
		}

	} // L: 190

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Lfd;",
		garbageValue = "-1492294528"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "93"
	)
	static int method2332(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 3414
			class379.Interpreter_intStackSize -= 2; // L: 3415
			var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3416
			var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3417
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 + var4; // L: 3418
			return 1; // L: 3419
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3421
			class379.Interpreter_intStackSize -= 2; // L: 3422
			var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3423
			var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3424
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 - var4; // L: 3425
			return 1; // L: 3426
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3428
			class379.Interpreter_intStackSize -= 2; // L: 3429
			var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3430
			var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3431
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 * var3; // L: 3432
			return 1; // L: 3433
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3435
			class379.Interpreter_intStackSize -= 2; // L: 3436
			var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3437
			var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3438
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 / var4; // L: 3439
			return 1; // L: 3440
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3442
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3443
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 3444
			return 1; // L: 3445
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3447
			var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3448
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 3449
			return 1; // L: 3450
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3452
				class379.Interpreter_intStackSize -= 5; // L: 3453
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3454
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3455
				var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 3456
				var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3]; // L: 3457
				var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 4]; // L: 3458
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 3459
				return 1; // L: 3460
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3462
				class379.Interpreter_intStackSize -= 2; // L: 3463
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3464
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3465
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100; // L: 3466
				return 1; // L: 3467
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3469
				class379.Interpreter_intStackSize -= 2; // L: 3470
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3471
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3472
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 3473
				return 1; // L: 3474
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3476
				class379.Interpreter_intStackSize -= 2; // L: 3477
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3478
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3479
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 3480
				return 1; // L: 3481
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3483
				class379.Interpreter_intStackSize -= 2; // L: 3484
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3485
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3486
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 3487
				return 1; // L: 3488
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3490
				class379.Interpreter_intStackSize -= 2; // L: 3491
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3492
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3493
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 % var4; // L: 3494
				return 1; // L: 3495
			} else if (var0 == ScriptOpcodes.POW) { // L: 3497
				class379.Interpreter_intStackSize -= 2; // L: 3498
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3499
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3500
				if (var3 == 0) { // L: 3501
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 3502
				}

				return 1; // L: 3503
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3505
				class379.Interpreter_intStackSize -= 2; // L: 3506
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3507
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3508
				if (var3 == 0) { // L: 3509
					Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 3510
					return 1; // L: 3511
				} else {
					switch(var4) { // L: 3513
					case 0:
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3536
						break; // L: 3537
					case 1:
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3; // L: 3526
						break; // L: 3527
					case 2:
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 3516
						break;
					case 3:
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 3521
						break; // L: 3522
					case 4:
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 3531
						break; // L: 3532
					default:
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 3541
					}

					return 1; // L: 3545
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3547
				class379.Interpreter_intStackSize -= 2; // L: 3548
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3549
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3550
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 & var4; // L: 3551
				return 1; // L: 3552
			} else if (var0 == ScriptOpcodes.OR) { // L: 3554
				class379.Interpreter_intStackSize -= 2; // L: 3555
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3556
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3557
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 | var4; // L: 3558
				return 1; // L: 3559
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3561
				class379.Interpreter_intStackSize -= 3; // L: 3562
				long var9 = (long)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3563
				long var11 = (long)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3564
				long var13 = (long)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 3565
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11); // L: 3566
				return 1; // L: 3567
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3569
				var3 = Renderable.method4454(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 3570
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3; // L: 3571
				return 1; // L: 3572
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3574
				class379.Interpreter_intStackSize -= 2; // L: 3575
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3576
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3577
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 3578
				return 1; // L: 3579
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3581
				class379.Interpreter_intStackSize -= 3; // L: 3582
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3583
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3584
				var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 3585
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WorldMapDecoration.method5148(var3, var4, var5); // L: 3586
				return 1; // L: 3587
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3589
				class379.Interpreter_intStackSize -= 3; // L: 3590
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3591
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3592
				var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 3593
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class28.method442(var3, var4, var5); // L: 3594
				return 1; // L: 3595
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3597
				class379.Interpreter_intStackSize -= 3; // L: 3598
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3599
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3600
				var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 3601
				var6 = 31 - var5; // L: 3602
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6; // L: 3603
				return 1; // L: 3604
			} else if (var0 == 4030) { // L: 3606
				class379.Interpreter_intStackSize -= 4; // L: 3607
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3608
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3609
				var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2]; // L: 3610
				var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3]; // L: 3611
				var3 = class28.method442(var3, var5, var6); // L: 3612
				var7 = Archive.method6338(var6 - var5 + 1); // L: 3613
				if (var4 > var7) { // L: 3614
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3615
				return 1; // L: 3616
			} else if (var0 == 4032) { // L: 3618
				Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = class315.method6250(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]); // L: 3619
				return 1; // L: 3620
			} else if (var0 == 4033) { // L: 3622
				Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = VarpDefinition.method3429(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]); // L: 3623
				return 1; // L: 3624
			} else if (var0 == 4034) { // L: 3626
				class379.Interpreter_intStackSize -= 2; // L: 3627
				var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3628
				var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3629
				var5 = AbstractWorldMapData.method5137(var3, var4); // L: 3630
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5; // L: 3631
				return 1; // L: 3632
			} else if (var0 == 4035) { // L: 3634
				Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]); // L: 3635
				return 1; // L: 3636
			} else {
				return 2; // L: 3638
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "391113383"
	)
	static int method2334(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3642
			var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3643
			var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3644
			Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3 + var10; // L: 3645
			return 1; // L: 3646
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3648
				class125.Interpreter_stringStackSize -= 2; // L: 3649
				var3 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize]; // L: 3650
				var4 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1]; // L: 3651
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3652
				return 1; // L: 3653
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3655
				var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3656
				var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3657
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3 + Canvas.intToString(var10, true); // L: 3658
				return 1; // L: 3659
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3661
				var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3662
				Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3663
				return 1; // L: 3664
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3666
					var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3667
					long var14 = ((long)var11 + 11745L) * 86400000L; // L: 3668
					Interpreter.Interpreter_calendar.setTime(new Date(var14)); // L: 3669
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3670
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3671
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3672
					Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3673
					return 1; // L: 3674
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3676
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3688
						var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3689
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = Integer.toString(var11); // L: 3690
						return 1; // L: 3691
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3693
						class125.Interpreter_stringStackSize -= 2; // L: 3694
						Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class297.method5726(Interpreter.compareStrings(Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1], class103.clientLanguage)); // L: 3695
						return 1; // L: 3696
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3698
							var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3699
							class379.Interpreter_intStackSize -= 2; // L: 3700
							var10 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3701
							var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3702
							var12 = class143.archive13.takeFile(var9, 0); // L: 3703
							var13 = new Font(var12); // L: 3704
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10); // L: 3705
							return 1; // L: 3706
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3708
							var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3709
							class379.Interpreter_intStackSize -= 2; // L: 3710
							var10 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3711
							var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3712
							var12 = class143.archive13.takeFile(var9, 0); // L: 3713
							var13 = new Font(var12); // L: 3714
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10); // L: 3715
							return 1; // L: 3716
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3718
							class125.Interpreter_stringStackSize -= 2; // L: 3719
							var3 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize]; // L: 3720
							var4 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1]; // L: 3721
							if (Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1) { // L: 3722
								Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4; // L: 3723
							}

							return 1; // L: 3724
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3726
							var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3727
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3728
							return 1; // L: 3729
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3731
							var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3732
							var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3733
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3 + (char)var10; // L: 3734
							return 1; // L: 3735
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3737
							var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3738
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class340.isCharPrintable((char)var11) ? 1 : 0; // L: 3739
							return 1; // L: 3740
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3742
							var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3743
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ClanSettings.isAlphaNumeric((char)var11) ? 1 : 0; // L: 3744
							return 1; // L: 3745
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3747
							var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3748
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = BuddyRankComparator.isCharAlphabetic((char)var11) ? 1 : 0; // L: 3749
							return 1; // L: 3750
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3752
							var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3753
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOffer.isDigit((char)var11) ? 1 : 0; // L: 3754
							return 1; // L: 3755
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3757
							var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3758
							if (var3 != null) { // L: 3759
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 3760
							}

							return 1; // L: 3761
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3763
							var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3764
							class379.Interpreter_intStackSize -= 2; // L: 3765
							var10 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize]; // L: 3766
							var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1]; // L: 3767
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.substring(var10, var9); // L: 3768
							return 1; // L: 3769
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3771
							var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3772
							StringBuilder var16 = new StringBuilder(var3.length()); // L: 3773
							boolean var18 = false; // L: 3774

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3775
								char var7 = var3.charAt(var6); // L: 3776
								if (var7 == '<') { // L: 3777
									var18 = true;
								} else if (var7 == '>') { // L: 3778
									var18 = false;
								} else if (!var18) { // L: 3779
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var16.toString(); // L: 3781
							return 1; // L: 3782
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3784
							var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3785
							var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3786
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.indexOf(var10); // L: 3787
							return 1; // L: 3788
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3790
							class125.Interpreter_stringStackSize -= 2; // L: 3791
							var3 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize]; // L: 3792
							var4 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1]; // L: 3793
							var9 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 3794
							Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9); // L: 3795
							return 1; // L: 3796
						} else if (var0 == 4122) { // L: 3798
							var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize]; // L: 3799
							Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3800
							return 1; // L: 3801
						} else if (var0 == 4123) { // L: 3803
							class125.Interpreter_stringStackSize -= 3; // L: 3804
							var3 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize]; // L: 3805
							var4 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1]; // L: 3806
							String var5 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 2]; // L: 3807
							if (class296.localPlayer.appearance == null) { // L: 3808
								Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5; // L: 3809
								return 1; // L: 3810
							} else {
								switch(class296.localPlayer.appearance.field3425) { // L: 3812
								case 0:
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3; // L: 3814
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4; // L: 3817
									break; // L: 3818
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5; // L: 3821
								}

								return 1; // L: 3824
							}
						} else {
							return 2; // L: 3826
						}
					}
				} else {
					class125.Interpreter_stringStackSize -= 2; // L: 3677
					var3 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize]; // L: 3678
					var4 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1]; // L: 3679
					if (class296.localPlayer.appearance != null && class296.localPlayer.appearance.field3423 != 0) { // L: 3680
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4; // L: 3684
					} else {
						Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3; // L: 3681
					}

					return 1; // L: 3686
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "279996688"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 121
	}
}
