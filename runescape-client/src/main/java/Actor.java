import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1627221919
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1229064101
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 859314757
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("au")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1116880781
	)
	int field1190;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1586754657
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 202365461
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -443851925
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1050697865
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 831500559
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -363813803
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -48519097
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1481502379
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1744329137
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 973353207
	)
	int field1140;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 85122549
	)
	int field1141;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1023655065
	)
	int field1149;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1595589709
	)
	int field1143;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1230784115
	)
	int field1170;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -121606743
	)
	int field1145;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 561395115
	)
	int field1150;
	@ObfuscatedName("ac")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("bq")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("bn")
	boolean field1164;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 620000609
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1029513379
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1684740929
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("bt")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bw")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bd")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bg")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("by")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bs")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 209400023
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ba")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1111975469
	)
	int field1162;
	@ObfuscatedName("bc")
	boolean field1163;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1722266545
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -476097555
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1156174571
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1992697237
	)
	int field1167;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 317961021
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 950342315
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -628849645
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -850715395
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 192722969
	)
	int field1172;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -2060788623
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1267076011
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 2064742585
	)
	int field1175;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1095735453
	)
	int field1176;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1225658055
	)
	int field1195;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1030903563
	)
	int field1178;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1105142705
	)
	int field1179;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -347010529
	)
	int field1127;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 679512859
	)
	int field1181;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1885865357
	)
	int field1182;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1486525213
	)
	int field1183;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1765855905
	)
	int field1136;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1904328571
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -622538989
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 300576935
	)
	int field1187;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -719314241
	)
	int field1188;
	@ObfuscatedName("cs")
	byte field1189;
	@ObfuscatedName("cy")
	byte field1131;
	@ObfuscatedName("cw")
	byte field1191;
	@ObfuscatedName("cg")
	byte field1192;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 577155807
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1510192509
	)
	int field1194;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 535616333
	)
	int field1180;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -2007282911
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cv")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("ck")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("pathTraversed")
	class192[] pathTraversed;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1185667037
	)
	int field1200;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 1063461451
	)
	int field1201;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1123890181
	)
	int field1202;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1190 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.field1140 = -1; // L: 24
		this.field1141 = -1; // L: 25
		this.field1149 = -1; // L: 26
		this.field1143 = -1; // L: 27
		this.field1170 = -1; // L: 28
		this.field1145 = -1; // L: 29
		this.field1150 = -1; // L: 30
		this.overheadText = null; // L: 31
		this.field1164 = false; // L: 33
		this.overheadTextCyclesRemaining = 100; // L: 34
		this.overheadTextColor = 0; // L: 35
		this.overheadTextEffect = 0; // L: 36
		this.hitSplatCount = 0; // L: 38
		this.hitSplatTypes = new int[4]; // L: 39
		this.hitSplatValues = new int[4]; // L: 40
		this.hitSplatCycles = new int[4]; // L: 41
		this.hitSplatTypes2 = new int[4]; // L: 42
		this.hitSplatValues2 = new int[4]; // L: 43
		this.healthBars = new IterableNodeDeque(); // L: 44
		this.targetIndex = -1; // L: 45
		this.false0 = false; // L: 46
		this.field1162 = -1; // L: 47
		this.movementSequence = -1; // L: 49
		this.movementFrame = 0; // L: 50
		this.movementFrameCycle = 0; // L: 51
		this.field1167 = 0; // L: 52
		this.sequence = -1; // L: 53
		this.sequenceFrame = 0; // L: 54
		this.sequenceFrameCycle = 0; // L: 55
		this.sequenceDelay = 0; // L: 56
		this.field1172 = 0; // L: 57
		this.spotAnimation = -1; // L: 58
		this.spotAnimationFrame = 0; // L: 59
		this.field1175 = 0; // L: 60
		this.npcCycle = 0; // L: 70
		this.defaultHeight = 200; // L: 71
		this.field1187 = -1; // L: 72
		this.field1188 = -1; // L: 73
		this.field1194 = 0; // L: 79
		this.field1180 = 32; // L: 80
		this.pathLength = 0; // L: 81
		this.pathX = new int[10]; // L: 82
		this.pathY = new int[10]; // L: 83
		this.pathTraversed = new class192[10]; // L: 84
		this.field1200 = 0; // L: 85
		this.field1201 = 0; // L: 86
		this.field1202 = -1; // L: 87
	} // L: 89

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-18"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 97
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-114112856"
	)
	final void method2149() {
		this.pathLength = 0; // L: 92
		this.field1201 = 0; // L: 93
	} // L: 94

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1265149339"
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
			HitSplatDefinition var12 = HealthBar.method2311(var1); // L: 111
			var10 = var12.field2032; // L: 112
			var11 = var12.field2019; // L: 113
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "5"
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
			if (var13.definition.field1862 == var8.field1862) { // L: 177
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
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

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2071136883"
	)
	static final void method2163() {
		Client.field685 = Client.cycleCntr; // L: 11992
		DirectByteArrayCopier.FriendsChatManager_inFriendsChat = true; // L: 11993
	} // L: 11994

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-400960551"
	)
	static void method2148(byte[] var0, int var1) {
		if (Client.randomDatData == null) { // L: 12163
			Client.randomDatData = new byte[24];
		}

		class351.writeRandomDat(var0, var1, Client.randomDatData, 0, 24); // L: 12164
	} // L: 12165
}
