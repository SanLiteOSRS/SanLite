import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -389894911
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 65440413
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1214343763
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("at")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 670600495
	)
	int field1181;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 627237213
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -345007929
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 285862749
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1599221413
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 498947341
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1244346649
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1074551991
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 635132903
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 942099641
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1991306379
	)
	int field1191;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1794639095
	)
	int field1201;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -780518925
	)
	int field1193;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1001233629
	)
	int field1194;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1165960723
	)
	int field1195;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1684483195
	)
	int field1226;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 496030663
	)
	int field1197;
	@ObfuscatedName("ac")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("bh")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("be")
	boolean field1187;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1917412835
	)
	int field1248;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1708374603
	)
	int field1202;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -1814648137
	)
	int field1229;
	@ObfuscatedName("bp")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bc")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bl")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bv")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bx")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bg")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 254868797
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("br")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1743725497
	)
	int field1190;
	@ObfuscatedName("bn")
	boolean field1228;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -23593053
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1618805973
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 81322447
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 623693747
	)
	int field1218;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 94737613
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1723796857
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1043036109
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1398805233
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 203372551
	)
	int field1223;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 385930223
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1092439411
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -4845983
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1151499147
	)
	int field1227;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1672871789
	)
	@Export("spotAnimationHeight")
	int spotAnimationHeight;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 1740141433
	)
	int field1196;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 17282343
	)
	int field1230;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1947883815
	)
	int field1185;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -749405229
	)
	int field1213;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -526209475
	)
	int field1233;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -140925909
	)
	int field1234;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 244421825
	)
	int field1235;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -5311601
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1571258463
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1291773733
	)
	int field1238;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1011438041
	)
	int field1200;
	@ObfuscatedName("ch")
	byte field1240;
	@ObfuscatedName("ce")
	byte field1220;
	@ObfuscatedName("cg")
	byte field1232;
	@ObfuscatedName("ca")
	byte field1243;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -947520985
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -306091521
	)
	int field1245;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1951063541
	)
	int field1249;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 472227045
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("ck")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("ci")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "[Lgs;"
	)
	@Export("pathTraversed")
	class204[] pathTraversed;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -346153835
	)
	int field1239;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 2136239977
	)
	int field1252;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1485827703
	)
	int field1253;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1181 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.field1191 = -1; // L: 24
		this.field1201 = -1; // L: 25
		this.field1193 = -1;
		this.field1194 = -1; // L: 27
		this.field1195 = -1; // L: 28
		this.field1226 = -1; // L: 29
		this.field1197 = -1; // L: 30
		this.overheadText = null; // L: 31
		this.field1187 = false; // L: 33
		this.field1248 = 100; // L: 34
		this.field1202 = 0; // L: 35
		this.field1229 = 0; // L: 36
		this.hitSplatCount = 0; // L: 38
		this.hitSplatTypes = new int[4]; // L: 39
		this.hitSplatValues = new int[4]; // L: 40
		this.hitSplatCycles = new int[4]; // L: 41
		this.hitSplatTypes2 = new int[4]; // L: 42
		this.hitSplatValues2 = new int[4]; // L: 43
		this.healthBars = new IterableNodeDeque(); // L: 44
		this.targetIndex = -1; // L: 45
		this.false0 = false; // L: 46
		this.field1190 = -1; // L: 47
		this.movementSequence = -1; // L: 49
		this.movementFrame = 0; // L: 50
		this.movementFrameCycle = 0; // L: 51
		this.field1218 = 0; // L: 52
		this.sequence = -1; // L: 53
		this.sequenceFrame = 0; // L: 54
		this.sequenceFrameCycle = 0; // L: 55
		this.sequenceDelay = 0; // L: 56
		this.field1223 = 0; // L: 57
		this.spotAnimation = -1; // L: 58
		this.spotAnimationFrame = 0; // L: 59
		this.spotAnimationFrameCycle = 0; // L: 60
		this.npcCycle = 0; // L: 70
		this.defaultHeight = 200; // L: 71
		this.field1238 = -1; // L: 72
		this.field1200 = -1; // L: 73
		this.field1245 = 0; // L: 79
		this.field1249 = 32; // L: 80
		this.pathLength = 0; // L: 81
		this.pathX = new int[10]; // L: 82
		this.pathY = new int[10]; // L: 83
		this.pathTraversed = new class204[10]; // L: 84
		this.field1239 = 0; // L: 85
		this.field1252 = 0; // L: 86
		this.field1253 = -1; // L: 87
	} // L: 89

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-200769249"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 97
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "226013540"
	)
	final void method2348() {
		this.pathLength = 0; // L: 92
		this.field1252 = 0; // L: 93
	} // L: 94

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-45918745"
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
			HitSplatDefinition var12 = class364.method6987(var1); // L: 111
			var10 = var12.field2146; // L: 112
			var11 = var12.field2132; // L: 113
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

			for (int var13 = 1; var13 < 4; ++var13) { // L: 121
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1256732773"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 159
		HealthBarDefinition var7;
		if (var8 != null) { // L: 160
			var7 = var8; // L: 161
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 164
			var8 = new HealthBarDefinition(); // L: 165
			if (var9 != null) { // L: 166
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1); // L: 167
			var7 = var8; // L: 168
		}

		var8 = var7; // L: 170
		HealthBar var14 = null; // L: 171
		HealthBar var10 = null; // L: 172
		int var11 = var7.int2; // L: 173
		int var12 = 0; // L: 174

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) { // L: 175
			++var12; // L: 176
			if (var13.definition.field1983 == var8.field1983) { // L: 177
				var13.put(var2 + var4, var5, var6, var3); // L: 178
				return; // L: 179
			}

			if (var13.definition.int1 <= var8.int1) { // L: 181
				var14 = var13;
			}

			if (var13.definition.int2 > var11) { // L: 182
				var10 = var13; // L: 183
				var11 = var13.definition.int2; // L: 184
			}
		}

		if (var10 != null || var12 < 4) { // L: 187
			var13 = new HealthBar(var8); // L: 188
			if (var14 == null) { // L: 189
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14); // L: 190
			}

			var13.put(var2 + var4, var5, var6, var3); // L: 191
			if (var12 >= 4) { // L: 192
				var10.remove();
			}

		}
	} // L: 193

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 198
		HealthBarDefinition var2;
		if (var3 != null) { // L: 199
			var2 = var3; // L: 200
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 203
			var3 = new HealthBarDefinition(); // L: 204
			if (var4 != null) { // L: 205
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1); // L: 206
			var2 = var3; // L: 207
		}

		var3 = var2; // L: 209

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) { // L: 210
			if (var3 == var5.definition) { // L: 211
				var5.remove(); // L: 212
				return; // L: 213
			}
		}

	} // L: 216

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1295308947"
	)
	public static int method2362(int var0) {
		return class284.field3329[var0]; // L: 26
	}
}
