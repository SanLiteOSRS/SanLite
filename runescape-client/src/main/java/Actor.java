import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1682415597
	)
	@Export("x")
	int x;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 261390341
	)
	@Export("y")
	int y;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1769179749
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -906487817
	)
	int field1212;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1653856533
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1005587195
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 596527443
	)
	int field1266;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 256643485
	)
	int field1213;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 245214983
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1199032719
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -529748857
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1475508573
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1293406329
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -386329313
	)
	int field1219;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -909248759
	)
	int field1220;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1576876033
	)
	int field1221;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1765727881
	)
	int field1222;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1796982345
	)
	int field1216;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1022136029
	)
	int field1224;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1008518259
	)
	int field1225;
	@ObfuscatedName("bx")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cs")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ch")
	boolean field1205;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1526300639
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 92402267
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 108337669
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("cn")
	int[] field1226;
	@ObfuscatedName("ci")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cl")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cm")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cx")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cw")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cy")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1046435177
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cv")
	boolean field1241;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -2134481181
	)
	int field1242;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -758837295
	)
	int field1243;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1874899127
	)
	int field1244;
	@ObfuscatedName("ca")
	boolean field1245;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 509789123
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 2022919199
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 2017854917
	)
	int field1267;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1854379435
	)
	int field1232;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1049413981
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1430383743
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -2143902041
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -2057820411
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -803318257
	)
	int field1254;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	IterableNodeHashTable field1263;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1919601901
	)
	int field1256;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -834807045
	)
	int field1257;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1348271175
	)
	int field1258;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 397933817
	)
	int field1259;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1896744821
	)
	int field1248;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1925697223
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -941694955
	)
	int field1271;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1676030111
	)
	int field1223;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1493658757
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -825642877
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -379331335
	)
	int field1262;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1667653559
	)
	int field1278;
	@ObfuscatedName("ds")
	byte field1268;
	@ObfuscatedName("dy")
	byte field1269;
	@ObfuscatedName("dz")
	byte field1276;
	@ObfuscatedName("dp")
	byte field1255;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1409684201
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1528983473
	)
	int field1227;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -359528855
	)
	int field1249;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 614875555
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dn")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dr")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	@Export("pathTraversed")
	class233[] pathTraversed;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 796262365
	)
	int field1279;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -991708375
	)
	int field1280;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -764561221
	)
	int field1270;

	Actor() {
		this.isWalking = false; // L: 18
		this.field1212 = 1; // L: 19
		this.idleSequence = -1; // L: 21
		this.field1266 = -1; // L: 22
		this.field1213 = -1; // L: 23
		this.walkSequence = -1; // L: 24
		this.walkBackSequence = -1; // L: 25
		this.walkLeftSequence = -1; // L: 26
		this.walkRightSequence = -1; // L: 27
		this.runSequence = -1; // L: 28
		this.field1219 = -1; // L: 29
		this.field1220 = -1; // L: 30
		this.field1221 = -1; // L: 31
		this.field1222 = -1; // L: 32
		this.field1216 = -1; // L: 33
		this.field1224 = -1; // L: 34
		this.field1225 = -1; // L: 35
		this.overheadText = null; // L: 36
		this.field1205 = false; // L: 38
		this.overheadTextCyclesRemaining = 100; // L: 39
		this.overheadTextColor = 0; // L: 40
		this.overheadTextEffect = 0; // L: 41
		this.field1226 = null; // L: 42
		this.hitSplatCount = 0; // L: 44
		this.hitSplatTypes = new int[4]; // L: 45
		this.hitSplatValues = new int[4]; // L: 46
		this.hitSplatCycles = new int[4]; // L: 47
		this.hitSplatTypes2 = new int[4]; // L: 48
		this.hitSplatValues2 = new int[4]; // L: 49
		this.healthBars = new IterableNodeDeque(); // L: 50
		this.targetIndex = -1; // L: 51
		this.field1241 = false; // L: 52
		this.field1242 = -1; // L: 53
		this.field1243 = -1; // L: 54
		this.field1244 = -1; // L: 55
		this.movementSequence = -1; // L: 57
		this.movementFrame = 0; // L: 58
		this.field1267 = 0; // L: 59
		this.field1232 = 0; // L: 60
		this.sequence = -1; // L: 61
		this.sequenceFrame = 0; // L: 62
		this.sequenceFrameCycle = 0; // L: 63
		this.sequenceDelay = 0; // L: 64
		this.field1254 = 0; // L: 65
		this.field1263 = new IterableNodeHashTable(4); // L: 66
		this.field1256 = 0; // L: 67
		this.npcCycle = 0; // L: 75
		this.defaultHeight = 200; // L: 76
		this.field1262 = -1; // L: 77
		this.field1278 = -1; // L: 78
		this.field1227 = 0; // L: 84
		this.field1249 = 32; // L: 85
		this.pathLength = 0; // L: 86
		this.pathX = new int[10]; // L: 87
		this.pathY = new int[10]; // L: 88
		this.pathTraversed = new class233[10]; // L: 89
		this.field1279 = 0; // L: 90
		this.field1280 = 0; // L: 91
		this.field1270 = -1; // L: 92
	} // L: 94

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "16409"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 102
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "709886252"
	)
	final void method2462() {
		this.pathLength = 0; // L: 97
		this.field1280 = 0; // L: 98
	} // L: 99

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1723210572"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 106
		boolean var8 = true; // L: 107

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 108
			if (this.hitSplatCycles[var9] > var5) { // L: 109
				var7 = false;
			} else {
				var8 = false; // L: 110
			}
		}

		var9 = -1; // L: 112
		int var10 = -1; // L: 113
		int var11 = 0; // L: 114
		if (var1 >= 0) { // L: 115
			HitSplatDefinition var12 = Language.method7357(var1); // L: 116
			var10 = var12.field2084; // L: 117
			var11 = var12.field2092; // L: 118
		}

		int var14;
		if (var8) { // L: 120
			if (var10 == -1) { // L: 121
				return;
			}

			var9 = 0; // L: 122
			var14 = 0; // L: 123
			if (var10 == 0) { // L: 124
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 125
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 126
				if (var10 == 0) { // L: 127
					if (this.hitSplatCycles[var13] < var14) { // L: 128
						var9 = var13; // L: 129
						var14 = this.hitSplatCycles[var13]; // L: 130
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 133 134
					var9 = var13; // L: 135
					var14 = this.hitSplatValues[var13]; // L: 136
				}
			}

			if (var10 == 1 && var14 >= var2) { // L: 140
				return;
			}
		} else {
			if (var7) { // L: 143
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 144
				byte var15 = this.hitSplatCount; // L: 145
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 146
				if (this.hitSplatCycles[var15] <= var5) { // L: 147
					var9 = var15; // L: 148
					break; // L: 149
				}
			}
		}

		if (var9 >= 0) { // L: 153
			this.hitSplatTypes[var9] = var1; // L: 154
			this.hitSplatValues[var9] = var2; // L: 155
			this.hitSplatTypes2[var9] = var3; // L: 156
			this.hitSplatValues2[var9] = var4; // L: 157
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 158
		}
	} // L: 159

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1922704024"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = VarcInt.method3595(var1); // L: 162
		HealthBar var8 = null; // L: 163
		HealthBar var9 = null; // L: 164
		int var10 = var7.int2; // L: 165
		int var11 = 0; // L: 166

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 167
			++var11; // L: 168
			if (var12.definition.field1918 == var7.field1918) { // L: 169
				var12.put(var2 + var4, var5, var6, var3); // L: 170
				return; // L: 171
			}

			if (var12.definition.int1 <= var7.int1) { // L: 173
				var8 = var12;
			}

			if (var12.definition.int2 > var10) { // L: 174
				var9 = var12; // L: 175
				var10 = var12.definition.int2; // L: 176
			}
		}

		if (var9 != null || var11 < 4) { // L: 179
			var12 = new HealthBar(var7); // L: 180
			if (var8 == null) { // L: 181
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8); // L: 182
			}

			var12.put(var2 + var4, var5, var6, var3); // L: 183
			if (var11 >= 4) { // L: 184
				var9.remove();
			}

		}
	} // L: 185

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1919875371"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = VarcInt.method3595(var1); // L: 188

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 189
			if (var2 == var3.definition) { // L: 190
				var3.remove(); // L: 191
				return; // L: 192
			}
		}

	} // L: 195

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1566666540"
	)
	void method2466(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 198
		class555 var6 = (class555)this.field1263.get((long)var1); // L: 199
		if (var6 != null) { // L: 200
			var6.remove(); // L: 201
			--this.field1256; // L: 202
		}

		if (var2 != 65535 && var2 != -1) { // L: 204
			byte var7 = 0; // L: 207
			if (var4 > 0) { // L: 208
				var7 = -1; // L: 209
			}

			this.field1263.put(new class555(var2, var3, var5, var7), (long)var1); // L: 211
			++this.field1256; // L: 212
		}
	} // L: 205 213

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)Lta;",
		garbageValue = "-43"
	)
	IterableNodeHashTable method2475() {
		return this.field1263; // L: 216
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "230480918"
	)
	void method2468() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1263); // L: 220

		for (class555 var2 = (class555)var1.method9127(); var2 != null; var2 = (class555)var1.next()) { // L: 221
			var2.remove(); // L: 222
		}

		this.field1256 = 0; // L: 224
	} // L: 225

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lkz;B)Lkz;",
		garbageValue = "1"
	)
	Model method2469(Model var1) {
		if (this.field1256 == 0) { // L: 228
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1263); // L: 229
			int var3 = var1.verticesCount; // L: 230
			int var4 = var1.indicesCount; // L: 231
			int var5 = var1.field3028; // L: 232
			byte var6 = var1.field2991; // L: 233

			for (class555 var7 = (class555)var2.method9127(); var7 != null; var7 = (class555)var2.next()) { // L: 234
				if (var7.field5349 != -1) { // L: 235
					Model var8 = VarbitComposition.SpotAnimationDefinition_get(var7.field5352).method3787(); // L: 236
					if (var8 != null) { // L: 237
						var3 += var8.verticesCount; // L: 238
						var4 += var8.indicesCount; // L: 239
						var5 += var8.field3028; // L: 240
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 242
			var10.method5683(var1); // L: 243

			for (class555 var11 = (class555)var2.method9127(); var11 != null; var11 = (class555)var2.next()) { // L: 244
				if (var11.field5349 != -1) { // L: 245
					Model var9 = VarbitComposition.SpotAnimationDefinition_get(var11.field5352).getModel(var11.field5349); // L: 246
					if (var9 != null) { // L: 247
						var9.offsetBy(0, -var11.field5353, 0); // L: 248
						var10.method5683(var9); // L: 249
					}
				}
			}

			return var10; // L: 251
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "811106472"
	)
	void method2470() {
		this.field1245 = false; // L: 255
		this.field1242 = -1; // L: 256
		this.field1243 = -1; // L: 257
		this.field1244 = -1; // L: 258
	} // L: 259
}
