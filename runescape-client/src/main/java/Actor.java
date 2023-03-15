import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 770091805
	)
	@Export("x")
	int x;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 743230655
	)
	@Export("y")
	int y;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1722245845
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1676195648
	)
	int field1142;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1235682795
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1420600879
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1435384067
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2086036387
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1809627555
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1798474521
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -225554459
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1735929425
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1820789823
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 252414335
	)
	int field1152;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 2143421625
	)
	int field1153;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 423632581
	)
	int field1154;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1058735917
	)
	int field1155;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -1098651975
	)
	int field1200;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -343475767
	)
	int field1212;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1389539495
	)
	int field1158;
	@ObfuscatedName("bi")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cl")
	boolean field1160;
	@ObfuscatedName("ca")
	boolean field1161;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1578914273
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -967977927
	)
	int field1163;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -916611829
	)
	int field1156;
	@ObfuscatedName("ce")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cd")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cc")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("ct")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cy")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("ck")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -2047391823
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ch")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 639827229
	)
	int field1164;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1778758151
	)
	int field1180;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1769365589
	)
	int field1176;
	@ObfuscatedName("cu")
	boolean field1157;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -277162537
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -978942791
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -506604737
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1243951499
	)
	int field1181;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -2121799935
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -259160373
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1001943181
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 441642775
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 265556645
	)
	int field1186;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -310147253
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -513408173
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 249695979
	)
	int field1175;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1512216599
	)
	int field1190;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 990951261
	)
	int field1191;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1525119837
	)
	int field1192;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 424860395
	)
	int field1202;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1087094495
	)
	int field1194;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 412604959
	)
	int field1195;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 507205937
	)
	int field1196;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 957541249
	)
	int field1197;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1398589867
	)
	int field1162;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -578602873
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1202490677
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1568448827
	)
	int field1201;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 641368537
	)
	int field1159;
	@ObfuscatedName("dm")
	byte field1203;
	@ObfuscatedName("dz")
	byte field1185;
	@ObfuscatedName("dl")
	byte field1165;
	@ObfuscatedName("df")
	byte field1206;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1715212839
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -332609061
	)
	int field1208;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -484928621
	)
	int field1209;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -314615841
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("en")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("ei")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "[Lis;"
	)
	@Export("pathTraversed")
	class211[] pathTraversed;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -1311143011
	)
	int field1214;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = -43675601
	)
	int field1215;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 1290268989
	)
	int field1189;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1142 = 64; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.field1152 = -1; // L: 24
		this.field1153 = -1; // L: 25
		this.field1154 = -1; // L: 26
		this.field1155 = -1; // L: 27
		this.field1200 = -1; // L: 28
		this.field1212 = -1; // L: 29
		this.field1158 = -1; // L: 30
		this.overheadText = null; // L: 31
		this.field1161 = false; // L: 33
		this.overheadTextCyclesRemaining = 100; // L: 34
		this.field1163 = 0; // L: 35
		this.field1156 = 0; // L: 36
		this.hitSplatCount = 0; // L: 38
		this.hitSplatTypes = new int[4]; // L: 39
		this.hitSplatValues = new int[4]; // L: 40
		this.hitSplatCycles = new int[4]; // L: 41
		this.hitSplatTypes2 = new int[4]; // L: 42
		this.hitSplatValues2 = new int[4]; // L: 43
		this.healthBars = new IterableNodeDeque(); // L: 44
		this.targetIndex = -1; // L: 45
		this.false0 = false; // L: 46
		this.field1164 = -1; // L: 47
		this.field1180 = -1; // L: 48
		this.field1176 = -1; // L: 49
		this.movementSequence = -1; // L: 51
		this.movementFrame = 0; // L: 52
		this.movementFrameCycle = 0; // L: 53
		this.field1181 = 0; // L: 54
		this.sequence = -1; // L: 55
		this.sequenceFrame = 0; // L: 56
		this.sequenceFrameCycle = 0; // L: 57
		this.sequenceDelay = 0; // L: 58
		this.field1186 = 0; // L: 59
		this.spotAnimation = -1; // L: 60
		this.spotAnimationFrame = 0; // L: 61
		this.field1175 = 0; // L: 62
		this.npcCycle = 0; // L: 72
		this.defaultHeight = 200; // L: 73
		this.field1201 = -1; // L: 74
		this.field1159 = -1; // L: 75
		this.field1208 = 0; // L: 81
		this.field1209 = 32; // L: 82
		this.pathLength = 0; // L: 83
		this.pathX = new int[10]; // L: 84
		this.pathY = new int[10]; // L: 85
		this.pathTraversed = new class211[10]; // L: 86
		this.field1214 = 0; // L: 87
		this.field1215 = 0; // L: 88
		this.field1189 = -1; // L: 89
	} // L: 91

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1187706422"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 99
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	final void method2371() {
		this.pathLength = 0; // L: 94
		this.field1215 = 0; // L: 95
	} // L: 96

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "1"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 103
		boolean var8 = true; // L: 104

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 105
			if (this.hitSplatCycles[var9] > var5) { // L: 106
				var7 = false;
			} else {
				var8 = false; // L: 107
			}
		}

		var9 = -1; // L: 109
		int var10 = -1; // L: 110
		int var11 = 0; // L: 111
		if (var1 >= 0) { // L: 112
			HitSplatDefinition var12 = class191.method3664(var1); // L: 113
			var10 = var12.field2116; // L: 114
			var11 = var12.field2107; // L: 115
		}

		int var14;
		if (var8) { // L: 117
			if (var10 == -1) { // L: 118
				return;
			}

			var9 = 0; // L: 119
			var14 = 0; // L: 120
			if (var10 == 0) { // L: 121
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 122
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 123
				if (var10 == 0) { // L: 124
					if (this.hitSplatCycles[var13] < var14) { // L: 125
						var9 = var13; // L: 126
						var14 = this.hitSplatCycles[var13]; // L: 127
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 130 131
					var9 = var13; // L: 132
					var14 = this.hitSplatValues[var13]; // L: 133
				}
			}

			if (var10 == 1 && var14 >= var2) { // L: 137
				return;
			}
		} else {
			if (var7) { // L: 140
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 141
				byte var15 = this.hitSplatCount; // L: 142
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 143
				if (this.hitSplatCycles[var15] <= var5) { // L: 144
					var9 = var15; // L: 145
					break; // L: 146
				}
			}
		}

		if (var9 >= 0) { // L: 150
			this.hitSplatTypes[var9] = var1; // L: 151
			this.hitSplatValues[var9] = var2; // L: 152
			this.hitSplatTypes2[var9] = var3; // L: 153
			this.hitSplatValues2[var9] = var4; // L: 154
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 155
		}
	} // L: 156

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-2123887600"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = HealthBar.method2538(var1); // L: 159
		HealthBar var8 = null; // L: 160
		HealthBar var9 = null; // L: 161
		int var10 = var7.int2; // L: 162
		int var11 = 0; // L: 163

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 164
			++var11; // L: 165
			if (var12.definition.field1946 == var7.field1946) { // L: 166
				var12.put(var2 + var4, var5, var6, var3); // L: 167
				return; // L: 168
			}

			if (var12.definition.int1 <= var7.int1) { // L: 170
				var8 = var12;
			}

			if (var12.definition.int2 > var10) { // L: 171
				var9 = var12; // L: 172
				var10 = var12.definition.int2; // L: 173
			}
		}

		if (var9 != null || var11 < 4) { // L: 176
			var12 = new HealthBar(var7); // L: 177
			if (var8 == null) { // L: 178
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8); // L: 179
			}

			var12.put(var2 + var4, var5, var6, var3); // L: 180
			if (var11 >= 4) { // L: 181
				var9.remove();
			}

		}
	} // L: 182

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1332495526"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = HealthBar.method2538(var1); // L: 185

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 186
			if (var2 == var3.definition) { // L: 187
				var3.remove(); // L: 188
				return; // L: 189
			}
		}

	} // L: 192

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1487000942"
	)
	void method2362() {
		this.field1157 = false; // L: 195
		this.field1164 = -1; // L: 196
		this.field1180 = -1; // L: 197
		this.field1176 = -1; // L: 198
	} // L: 199
}
