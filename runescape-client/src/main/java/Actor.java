import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 447826103
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 577677539
	)
	@Export("y")
	int y;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1112494515
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("at")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 964602217
	)
	int field1163;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1177407539
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -684272439
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 364693837
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2121418653
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -821590745
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2055230049
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 322703555
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1845507611
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1210399593
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1980220607
	)
	int field1173;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1031937609
	)
	int field1174;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -353043483
	)
	int field1168;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1601746545
	)
	int field1187;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1142020731
	)
	int field1172;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1733044813
	)
	int field1178;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1475862297
	)
	int field1179;
	@ObfuscatedName("ao")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("bj")
	boolean field1181;
	@ObfuscatedName("bf")
	boolean field1166;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 243955711
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1702079151
	)
	int field1161;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -891902263
	)
	int field1185;
	@ObfuscatedName("bo")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bl")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bn")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bi")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bw")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 114853969
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bg")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1500523149
	)
	int field1195;
	@ObfuscatedName("bk")
	boolean field1196;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1289012151
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 257231537
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1561816145
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1894422995
	)
	int field1200;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1519553247
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1643445407
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1407146837
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -210661437
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1455637611
	)
	int field1205;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 600195653
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1565000231
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -537658505
	)
	int field1208;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1617063017
	)
	int field1207;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1928204207
	)
	int field1210;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1803600605
	)
	int field1211;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1850142185
	)
	int field1212;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1115543865
	)
	int field1213;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 1800308381
	)
	int field1214;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1754022919
	)
	int field1215;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 61832475
	)
	int field1189;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1651711399
	)
	int field1217;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1125793951
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -2113487019
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 675501089
	)
	int field1176;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1767722343
	)
	int field1221;
	@ObfuscatedName("cv")
	byte field1180;
	@ObfuscatedName("cf")
	byte field1227;
	@ObfuscatedName("cm")
	byte field1224;
	@ObfuscatedName("ce")
	byte field1225;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 914646583
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 920630507
	)
	int field1191;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1730223223
	)
	int field1228;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1498527701
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cn")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cw")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "[Lhz;"
	)
	@Export("pathTraversed")
	class208[] pathTraversed;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1163077103
	)
	int field1175;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 343833459
	)
	int field1230;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1605021683
	)
	int field1220;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1163 = 1; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1173 = -1;
		this.field1174 = -1;
		this.field1168 = -1;
		this.field1187 = -1; // L: 27
		this.field1172 = -1; // L: 28
		this.field1178 = -1; // L: 29
		this.field1179 = -1; // L: 30
		this.overheadText = null; // L: 31
		this.field1166 = false; // L: 33
		this.overheadTextCyclesRemaining = 100; // L: 34
		this.field1161 = 0; // L: 35
		this.field1185 = 0; // L: 36
		this.hitSplatCount = 0; // L: 38
		this.hitSplatTypes = new int[4]; // L: 39
		this.hitSplatValues = new int[4]; // L: 40
		this.hitSplatCycles = new int[4]; // L: 41
		this.hitSplatTypes2 = new int[4]; // L: 42
		this.hitSplatValues2 = new int[4]; // L: 43
		this.healthBars = new IterableNodeDeque(); // L: 44
		this.targetIndex = -1; // L: 45
		this.false0 = false; // L: 46
		this.field1195 = -1; // L: 47
		this.movementSequence = -1; // L: 49
		this.movementFrame = 0; // L: 50
		this.movementFrameCycle = 0; // L: 51
		this.field1200 = 0; // L: 52
		this.sequence = -1; // L: 53
		this.sequenceFrame = 0; // L: 54
		this.sequenceFrameCycle = 0; // L: 55
		this.sequenceDelay = 0; // L: 56
		this.field1205 = 0; // L: 57
		this.spotAnimation = -1; // L: 58
		this.spotAnimationFrame = 0; // L: 59
		this.field1208 = 0; // L: 60
		this.npcCycle = 0; // L: 70
		this.defaultHeight = 200; // L: 71
		this.field1176 = -1; // L: 72
		this.field1221 = -1; // L: 73
		this.field1191 = 0; // L: 79
		this.field1228 = 32; // L: 80
		this.pathLength = 0; // L: 81
		this.pathX = new int[10]; // L: 82
		this.pathY = new int[10]; // L: 83
		this.pathTraversed = new class208[10]; // L: 84
		this.field1175 = 0; // L: 85
		this.field1230 = 0; // L: 86
		this.field1220 = -1; // L: 87
	} // L: 89

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1591490422"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 97
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1512245406"
	)
	final void method2423() {
		this.pathLength = 0; // L: 92
		this.field1230 = 0; // L: 93
	} // L: 94

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1738027073"
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
			HitSplatDefinition var12 = ChatChannel.method2224(var1); // L: 111
			var10 = var12.field2145; // L: 112
			var11 = var12.field2142; // L: 113
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "73"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class122.method3028(var1); // L: 157
		HealthBar var8 = null; // L: 158
		HealthBar var9 = null; // L: 159
		int var10 = var7.int2; // L: 160
		int var11 = 0; // L: 161

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 162
			++var11; // L: 163
			if (var12.definition.field1982 == var7.field1982) { // L: 164
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-46712861"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class122.method3028(var1); // L: 183

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 184
			if (var2 == var3.definition) { // L: 185
				var3.remove(); // L: 186
				return; // L: 187
			}
		}

	} // L: 190

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lgn;",
		garbageValue = "-712256700"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 21
			var1 = new StructComposition(); // L: 22
			if (var2 != null) { // L: 23
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 24
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}

	@ObfuscatedName("kp")
	static final void method2440(double var0) {
		Rasterizer3D.Rasterizer3D_setBrightness(var0); // L: 12730
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(var0); // L: 12731
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 12733
		PacketWriter.clientPreferences.method2583(var0); // L: 12735
	} // L: 12736
}
