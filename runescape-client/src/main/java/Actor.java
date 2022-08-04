import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -537607707
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1991451267
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -317366093
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("al")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 111124851
	)
	int field1202;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 946653701
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 316067523
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1426265509
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 178789113
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1203812637
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1440191925
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -882598583
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -536883565
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1357076803
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 960352449
	)
	int field1199;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -502200883
	)
	int field1143;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -899005579
	)
	int field1144;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1618623663
	)
	int field1145;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1908795387
	)
	int field1146;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1003186567
	)
	int field1147;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1078883857
	)
	int field1148;
	@ObfuscatedName("az")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("bz")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("bs")
	boolean field1151;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1475462461
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 535581087
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 626036729
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("bf")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bu")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bk")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bq")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bj")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bt")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -766757299
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("be")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1521222287
	)
	int field1164;
	@ObfuscatedName("bb")
	boolean field1152;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1451144151
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1998267769
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -135575699
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 553173281
	)
	int field1141;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1833058195
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -773219201
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1435045029
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1141471647
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 143630735
	)
	int field1174;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1452307989
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 2035761433
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 217193265
	)
	int field1201;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1536058191
	)
	int field1178;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -70635727
	)
	int field1128;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -104406783
	)
	int field1177;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -315753795
	)
	int field1188;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 270849611
	)
	int field1182;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1487251973
	)
	int field1183;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1502544871
	)
	int field1194;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -104818359
	)
	int field1166;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 217964137
	)
	int field1186;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 329688161
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1700146063
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1545212437
	)
	int field1189;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 370010675
	)
	int field1136;
	@ObfuscatedName("cl")
	byte field1191;
	@ObfuscatedName("cn")
	byte field1168;
	@ObfuscatedName("cu")
	byte field1193;
	@ObfuscatedName("ce")
	byte field1184;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 877961797
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -450622021
	)
	int field1196;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1399167525
	)
	int field1197;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1581137343
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cb")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cf")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "[Lgl;"
	)
	@Export("pathTraversed")
	class192[] pathTraversed;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 532547773
	)
	int field1142;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -960978771
	)
	int field1203;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -2087702069
	)
	int field1204;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1202 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.field1199 = -1; // L: 24
		this.field1143 = -1; // L: 25
		this.field1144 = -1; // L: 26
		this.field1145 = -1; // L: 27
		this.field1146 = -1; // L: 28
		this.field1147 = -1; // L: 29
		this.field1148 = -1; // L: 30
		this.overheadText = null; // L: 31
		this.field1151 = false; // L: 33
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
		this.field1164 = -1; // L: 47
		this.movementSequence = -1; // L: 49
		this.movementFrame = 0; // L: 50
		this.movementFrameCycle = 0; // L: 51
		this.field1141 = 0; // L: 52
		this.sequence = -1; // L: 53
		this.sequenceFrame = 0; // L: 54
		this.sequenceFrameCycle = 0; // L: 55
		this.sequenceDelay = 0; // L: 56
		this.field1174 = 0; // L: 57
		this.spotAnimation = -1; // L: 58
		this.spotAnimationFrame = 0; // L: 59
		this.field1201 = 0; // L: 60
		this.npcCycle = 0; // L: 70
		this.defaultHeight = 200; // L: 71
		this.field1189 = -1; // L: 72
		this.field1136 = -1; // L: 73
		this.field1196 = 0; // L: 79
		this.field1197 = 32; // L: 80
		this.pathLength = 0; // L: 81
		this.pathX = new int[10]; // L: 82
		this.pathY = new int[10]; // L: 83
		this.pathTraversed = new class192[10]; // L: 84
		this.field1142 = 0; // L: 85
		this.field1203 = 0; // L: 86
		this.field1204 = -1; // L: 87
	} // L: 89

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2042091468"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 97
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1025814898"
	)
	final void method2252() {
		this.pathLength = 0; // L: 92
		this.field1203 = 0; // L: 93
	} // L: 94

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-60"
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
			HitSplatDefinition var12 = GrandExchangeOfferOwnWorldComparator.method1095(var1); // L: 111
			var10 = var12.field2007; // L: 112
			var11 = var12.field2014; // L: 113
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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-954749131"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 159
		HealthBarDefinition var7;
		if (var8 != null) { // L: 160
			var7 = var8; // L: 161
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			if (var9 != null) { // L: 166
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null; // L: 171
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field1879 == var8.field1879) { // L: 177
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) { // L: 182
				var10 = var13; // L: 183
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lpi;",
		garbageValue = "-727013578"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(UserComparator10.cacheDir, "preferences" + var0 + ".dat"); // L: 164
		if (var3.exists()) { // L: 165
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 167
				return var10; // L: 168
			} catch (IOException var9) { // L: 170
			}
		}

		String var4 = ""; // L: 172
		if (KeyHandler.cacheGamebuild == 33) { // L: 173
			var4 = "_rc";
		} else if (KeyHandler.cacheGamebuild == 34) { // L: 174
			var4 = "_wip";
		}

		File var5 = new File(JagexCache.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 175
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 176
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 178
				return var6; // L: 179
			} catch (IOException var8) { // L: 181
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 184
			return var6; // L: 185
		} catch (IOException var7) { // L: 187
			throw new RuntimeException(); // L: 188
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1387002026"
	)
	static int method2268(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 917
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 918
		}
	}
}
