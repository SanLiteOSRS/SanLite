import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	static SpritePixels[] field1248;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1981894979
	)
	@Export("x")
	int x;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -553869971
	)
	@Export("y")
	int y;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -613105557
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 741168960
	)
	int field1175;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 861061275
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -57288001
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 398756119
	)
	int field1236;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -789848963
	)
	int field1179;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1684928235
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1616831875
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -226477313
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -734962931
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 2065564805
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1465035877
	)
	int field1187;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 838906559
	)
	int field1186;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1263006309
	)
	int field1218;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 533777497
	)
	int field1188;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -2071850175
	)
	int field1178;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 438747425
	)
	int field1190;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1346806619
	)
	int field1191;
	@ObfuscatedName("bo")
	String field1195;
	@ObfuscatedName("cg")
	boolean field1202;
	@ObfuscatedName("cb")
	boolean field1194;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 922797311
	)
	int field1212;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1069021353
	)
	int field1185;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1015873939
	)
	int field1197;
	@ObfuscatedName("cp")
	int[] field1198;
	@ObfuscatedName("cl")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cs")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cc")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cd")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cu")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("co")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 2082686177
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ch")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -270277227
	)
	int field1208;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1481859161
	)
	int field1213;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -582178951
	)
	int field1210;
	@ObfuscatedName("ck")
	boolean field1211;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 431142937
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1588769625
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -290182791
	)
	int field1214;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1691490063
	)
	int field1196;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -70627403
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 125822657
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -56884747
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1260773255
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1322171187
	)
	int field1220;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	IterableNodeHashTable field1221;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 734589831
	)
	int field1247;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -977458449
	)
	int field1223;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 2101143253
	)
	int field1224;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 2137160791
	)
	int field1225;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 67797235
	)
	int field1226;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 614984107
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1821967681
	)
	int field1228;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 559101335
	)
	int field1173;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 987336325
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1152309747
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -780782197
	)
	int field1180;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1319111797
	)
	int field1233;
	@ObfuscatedName("dk")
	byte field1234;
	@ObfuscatedName("df")
	byte field1193;
	@ObfuscatedName("do")
	byte field1204;
	@ObfuscatedName("dx")
	byte field1237;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1049998599
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1997571179
	)
	int field1239;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 246420971
	)
	int field1240;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 6573123
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dy")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dl")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "[Lir;"
	)
	@Export("pathTraversed")
	class231[] pathTraversed;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -759355775
	)
	int field1245;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 854159423
	)
	int field1215;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = -1711073399
	)
	int field1192;

	Actor() {
		this.isWalking = false; // L: 18
		this.field1175 = 64; // L: 19
		this.idleSequence = -1; // L: 21
		this.field1236 = -1; // L: 22
		this.field1179 = -1; // L: 23
		this.walkSequence = -1; // L: 24
		this.walkBackSequence = -1; // L: 25
		this.walkLeftSequence = -1; // L: 26
		this.walkRightSequence = -1; // L: 27
		this.runSequence = -1; // L: 28
		this.field1187 = -1; // L: 29
		this.field1186 = -1; // L: 30
		this.field1218 = -1; // L: 31
		this.field1188 = -1; // L: 32
		this.field1178 = -1; // L: 33
		this.field1190 = -1; // L: 34
		this.field1191 = -1; // L: 35
		this.field1195 = null; // L: 36
		this.field1194 = false; // L: 38
		this.field1212 = 100; // L: 39
		this.field1185 = 0; // L: 40
		this.field1197 = 0; // L: 41
		this.field1198 = null; // L: 42
		this.hitSplatCount = 0; // L: 44
		this.hitSplatTypes = new int[4]; // L: 45
		this.hitSplatValues = new int[4]; // L: 46
		this.hitSplatCycles = new int[4]; // L: 47
		this.hitSplatTypes2 = new int[4]; // L: 48
		this.hitSplatValues2 = new int[4]; // L: 49
		this.healthBars = new IterableNodeDeque(); // L: 50
		this.targetIndex = -1; // L: 51
		this.false0 = false; // L: 52
		this.field1208 = -1; // L: 53
		this.field1213 = -1; // L: 54
		this.field1210 = -1; // L: 55
		this.movementSequence = -1; // L: 57
		this.movementFrame = 0; // L: 58
		this.field1214 = 0; // L: 59
		this.field1196 = 0; // L: 60
		this.sequence = -1; // L: 61
		this.sequenceFrame = 0; // L: 62
		this.sequenceFrameCycle = 0; // L: 63
		this.sequenceDelay = 0; // L: 64
		this.field1220 = 0; // L: 65
		this.field1221 = new IterableNodeHashTable(4); // L: 66
		this.field1247 = 0; // L: 67
		this.npcCycle = 0; // L: 75
		this.defaultHeight = 200; // L: 76
		this.field1180 = -1; // L: 77
		this.field1233 = -1; // L: 78
		this.field1239 = 0; // L: 84
		this.field1240 = 32; // L: 85
		this.pathLength = 0; // L: 86
		this.pathX = new int[10]; // L: 87
		this.pathY = new int[10]; // L: 88
		this.pathTraversed = new class231[10]; // L: 89
		this.field1245 = 0; // L: 90
		this.field1215 = 0; // L: 91
		this.field1192 = -1; // L: 92
	} // L: 94

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 102
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-100546177"
	)
	final void method2468() {
		this.pathLength = 0; // L: 97
		this.field1215 = 0; // L: 98
	} // L: 99

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "374247798"
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
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = class192.method3790(var1); // L: 116
			var10 = var12.field2071; // L: 117
			var11 = var12.field2069;
		}

		int var14;
		if (var8) {
			if (var10 == -1) { // L: 121
				return;
			}

			var9 = 0;
			var14 = 0; // L: 123
			if (var10 == 0) { // L: 124
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 125
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 126
				if (var10 == 0) { // L: 127
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13; // L: 129
						var14 = this.hitSplatCycles[var13]; // L: 130
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 134
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "908555621"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.NpcDefinition_cachedModels.get((long)var1); // L: 164
		HealthBarDefinition var7;
		if (var8 != null) { // L: 165
			var7 = var8; // L: 166
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 169
			var8 = new HealthBarDefinition(); // L: 170
			var8.field1887 = var1; // L: 171
			if (var9 != null) { // L: 172
				var8.decode(new Buffer(var9)); // L: 173
			}

			HealthBarDefinition.NpcDefinition_cachedModels.put(var8, (long)var1); // L: 175
			var7 = var8; // L: 176
		}

		var8 = var7; // L: 178
		HealthBar var14 = null; // L: 179
		HealthBar var10 = null; // L: 180
		int var11 = var7.int2; // L: 181
		int var12 = 0; // L: 182

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) { // L: 183
			++var12; // L: 184
			if (var13.definition.field1887 == var8.field1887) { // L: 185
				var13.put(var2 + var4, var5, var6, var3); // L: 186
				return; // L: 187
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13; // L: 189
			}

			if (var13.definition.int2 > var11) { // L: 190
				var10 = var13; // L: 191
				var11 = var13.definition.int2; // L: 192
			}
		}

		if (var10 != null || var12 < 4) { // L: 195
			var13 = new HealthBar(var8); // L: 196
			if (var14 == null) { // L: 197
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14); // L: 198
			}

			var13.put(var2 + var4, var5, var6, var3); // L: 199
			if (var12 >= 4) { // L: 200
				var10.remove();
			}

		}
	} // L: 201

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "10"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.NpcDefinition_cachedModels.get((long)var1); // L: 206
		HealthBarDefinition var2;
		if (var3 != null) { // L: 207
			var2 = var3; // L: 208
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 211
			var3 = new HealthBarDefinition(); // L: 212
			var3.field1887 = var1; // L: 213
			if (var4 != null) { // L: 214
				var3.decode(new Buffer(var4)); // L: 215
			}

			HealthBarDefinition.NpcDefinition_cachedModels.put(var3, (long)var1); // L: 217
			var2 = var3; // L: 218
		}

		var3 = var2; // L: 220

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) { // L: 221
			if (var3 == var5.definition) { // L: 222
				var5.remove(); // L: 223
				return; // L: 224
			}
		}

	} // L: 227

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1361275855"
	)
	void method2469(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 230
		class552 var6 = (class552)this.field1221.get((long)var1); // L: 231
		if (var6 != null) { // L: 232
			var6.remove(); // L: 233
			--this.field1247; // L: 234
		}

		if (var2 != 65535 && var2 != -1) { // L: 236
			byte var7 = 0; // L: 239
			if (var4 > 0) { // L: 240
				var7 = -1; // L: 241
			}

			this.field1221.put(new class552(var2, var3, var5, var7), (long)var1); // L: 243
			++this.field1247; // L: 244
		}
	} // L: 237 245

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Ltb;",
		garbageValue = "-1558428240"
	)
	IterableNodeHashTable method2455() {
		return this.field1221; // L: 248
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	void method2458() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1221); // L: 252

		for (class552 var2 = (class552)var1.method9062(); var2 != null; var2 = (class552)var1.next()) { // L: 253
			var2.remove(); // L: 254
		}

		this.field1247 = 0; // L: 256
	} // L: 257

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)Lko;",
		garbageValue = "1947094872"
	)
	Model method2486(Model var1) {
		if (this.field1247 == 0) { // L: 260
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1221); // L: 261
			int var3 = var1.verticesCount; // L: 262
			int var4 = var1.indicesCount; // L: 263
			int var5 = var1.field3043; // L: 264
			byte var6 = var1.field2993; // L: 265

			for (class552 var7 = (class552)var2.method9062(); var7 != null; var7 = (class552)var2.next()) { // L: 266
				if (var7.field5323 != -1) { // L: 267
					Model var8 = class151.SpotAnimationDefinition_get(var7.field5325).method3795(); // L: 268
					if (var8 != null) { // L: 269
						var3 += var8.verticesCount; // L: 270
						var4 += var8.indicesCount; // L: 271
						var5 += var8.field3043; // L: 272
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 274
			var10.method5635(var1); // L: 275

			for (class552 var11 = (class552)var2.method9062(); var11 != null; var11 = (class552)var2.next()) { // L: 276
				if (var11.field5323 != -1) { // L: 277
					Model var9 = class151.SpotAnimationDefinition_get(var11.field5325).getModel(var11.field5323); // L: 278
					if (var9 != null) { // L: 279
						var9.offsetBy(0, -var11.field5326, 0); // L: 280
						var10.method5635(var9); // L: 281
					}
				}
			}

			return var10; // L: 283
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "529168059"
	)
	void method2460() {
		this.field1211 = false; // L: 287
		this.field1208 = -1; // L: 288
		this.field1213 = -1; // L: 289
		this.field1210 = -1; // L: 290
	} // L: 291

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1459386223"
	)
	public static void method2488(int var0, int var1) {
		WorldMapRectangle.method5019(var0, var1, 0, 0); // L: 110
		class319.field3466.clear(); // L: 111
		class319.field3462.clear(); // L: 112
		if (class319.field3459.isEmpty() || var0 == 0 && var1 == 0) { // L: 113
			class150.method3304(); // L: 131
		} else {
			class319.field3462.add(new class418((class422)null, class319.field3460)); // L: 114
			class319.field3462.add(new class420((class422)null, 0, false, class319.field3464)); // L: 115
			ArrayList var3 = new ArrayList(); // L: 118
			Iterator var4 = class319.field3459.iterator(); // L: 119

			while (var4.hasNext()) {
				class331 var5 = (class331)var4.next(); // L: 120
				var3.add(var5); // L: 122
			}

			class319.field3462.add(new class417((class422)null, var3)); // L: 128
		}

	} // L: 133

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "526299186"
	)
	static void method2489(int var0) {
		if (var0 != Login.loginIndex) { // L: 2003
			Login.loginIndex = var0; // L: 2004
		}
	} // L: 2005
}
