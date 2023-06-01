import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = -616485293
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 486011493
	)
	@Export("x")
	int x;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 444262637
	)
	@Export("y")
	int y;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1783540075
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1179509531
	)
	int field1147;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -462849811
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -643338939
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 499276517
	)
	int field1146;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1517504381
	)
	int field1171;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1992771445
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -508152349
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1793986717
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1981579923
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 227690235
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1323315859
	)
	int field1156;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1855400133
	)
	int field1143;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -675035603
	)
	int field1199;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 414853651
	)
	int field1179;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1639448663
	)
	int field1157;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1208447061
	)
	int field1149;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 526683557
	)
	int field1197;
	@ObfuscatedName("br")
	String field1160;
	@ObfuscatedName("cb")
	boolean field1161;
	@ObfuscatedName("cg")
	boolean field1162;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 248012639
	)
	int field1163;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -62955621
	)
	int field1164;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -339271441
	)
	int field1165;
	@ObfuscatedName("cd")
	int[] field1191;
	@ObfuscatedName("cl")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ck")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("ch")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cs")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("ci")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("co")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1579480329
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ct")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 605239463
	)
	int field1211;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 217978129
	)
	int field1177;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -470362857
	)
	int field1178;
	@ObfuscatedName("ca")
	boolean field1140;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1666702865
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1988657763
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -991109639
	)
	int field1182;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1726931023
	)
	int field1183;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1421559029
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -130505165
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 957484883
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -866705201
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -181152803
	)
	int field1188;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	IterableNodeHashTable field1172;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -740208703
	)
	int field1190;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1505380221
	)
	int field1158;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1817786769
	)
	int field1192;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1650215887
	)
	int field1193;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1512379421
	)
	int field1189;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 125350739
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1274421165
	)
	int field1196;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -712753089
	)
	int field1139;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1879933989
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1443084855
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1721493255
	)
	int field1200;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 60349675
	)
	int field1201;
	@ObfuscatedName("dx")
	byte field1175;
	@ObfuscatedName("db")
	byte field1203;
	@ObfuscatedName("dj")
	byte field1153;
	@ObfuscatedName("du")
	byte field1205;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -12064581
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1611239895
	)
	int field1207;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1694649193
	)
	int field1209;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1364433179
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dw")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dm")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	@Export("pathTraversed")
	class216[] pathTraversed;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 1033118343
	)
	int field1213;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = 2007231817
	)
	int field1214;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -1387593399
	)
	int field1215;

	Actor() {
		this.isWalking = false; // L: 18
		this.field1147 = 1; // L: 19
		this.idleSequence = -1; // L: 21
		this.field1146 = -1; // L: 22
		this.field1171 = -1; // L: 23
		this.walkSequence = -1; // L: 24
		this.walkBackSequence = -1; // L: 25
		this.walkLeftSequence = -1; // L: 26
		this.walkRightSequence = -1; // L: 27
		this.runSequence = -1; // L: 28
		this.field1156 = -1; // L: 29
		this.field1143 = -1; // L: 30
		this.field1199 = -1; // L: 31
		this.field1179 = -1; // L: 32
		this.field1157 = -1; // L: 33
		this.field1149 = -1; // L: 34
		this.field1197 = -1; // L: 35
		this.field1160 = null; // L: 36
		this.field1162 = false; // L: 38
		this.field1163 = 100; // L: 39
		this.field1164 = 0; // L: 40
		this.field1165 = 0; // L: 41
		this.field1191 = null; // L: 42
		this.hitSplatCount = 0; // L: 44
		this.hitSplatTypes = new int[4]; // L: 45
		this.hitSplatValues = new int[4]; // L: 46
		this.hitSplatCycles = new int[4]; // L: 47
		this.hitSplatTypes2 = new int[4]; // L: 48
		this.hitSplatValues2 = new int[4]; // L: 49
		this.healthBars = new IterableNodeDeque(); // L: 50
		this.targetIndex = -1; // L: 51
		this.false0 = false; // L: 52
		this.field1211 = -1; // L: 53
		this.field1177 = -1; // L: 54
		this.field1178 = -1; // L: 55
		this.movementSequence = -1; // L: 57
		this.movementFrame = 0; // L: 58
		this.field1182 = 0; // L: 59
		this.field1183 = 0; // L: 60
		this.sequence = -1; // L: 61
		this.sequenceFrame = 0; // L: 62
		this.sequenceFrameCycle = 0; // L: 63
		this.sequenceDelay = 0; // L: 64
		this.field1188 = 0; // L: 65
		this.field1172 = new IterableNodeHashTable(4); // L: 66
		this.field1190 = 0; // L: 67
		this.npcCycle = 0; // L: 75
		this.defaultHeight = 200; // L: 76
		this.field1200 = -1; // L: 77
		this.field1201 = -1; // L: 78
		this.field1207 = 0; // L: 84
		this.field1209 = 32; // L: 85
		this.pathLength = 0; // L: 86
		this.pathX = new int[10]; // L: 87
		this.pathY = new int[10]; // L: 88
		this.pathTraversed = new class216[10]; // L: 89
		this.field1213 = 0; // L: 90
		this.field1214 = 0; // L: 91
		this.field1215 = -1; // L: 92
	} // L: 94

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-964531656"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 102
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	final void method2352() {
		this.pathLength = 0; // L: 97
		this.field1214 = 0; // L: 98
	} // L: 99

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-303781023"
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
			HitSplatDefinition var13 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var1); // L: 118
			HitSplatDefinition var12;
			if (var13 != null) { // L: 119
				var12 = var13; // L: 120
			} else {
				byte[] var14 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var1); // L: 123
				var13 = new HitSplatDefinition(); // L: 124
				if (var14 != null) { // L: 125
					var13.decode(new Buffer(var14));
				}

				HitSplatDefinition.HitSplatDefinition_cached.put(var13, (long)var1); // L: 126
				var12 = var13; // L: 127
			}

			var10 = var12.field2133; // L: 130
			var11 = var12.field2124; // L: 131
		}

		int var15;
		if (var8) { // L: 133
			if (var10 == -1) { // L: 134
				return;
			}

			var9 = 0; // L: 135
			var15 = 0; // L: 136
			if (var10 == 0) { // L: 137
				var15 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var15 = this.hitSplatValues[0]; // L: 138
			}

			for (int var16 = 1; var16 < 4; ++var16) { // L: 139
				if (var10 == 0) { // L: 140
					if (this.hitSplatCycles[var16] < var15) { // L: 141
						var9 = var16; // L: 142
						var15 = this.hitSplatCycles[var16]; // L: 143
					}
				} else if (var10 == 1 && this.hitSplatValues[var16] < var15) { // L: 146 147
					var9 = var16; // L: 148
					var15 = this.hitSplatValues[var16]; // L: 149
				}
			}

			if (var10 == 1 && var15 >= var2) { // L: 153
				return;
			}
		} else {
			if (var7) { // L: 156
				this.hitSplatCount = 0;
			}

			for (var15 = 0; var15 < 4; ++var15) { // L: 157
				byte var17 = this.hitSplatCount; // L: 158
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 159
				if (this.hitSplatCycles[var17] <= var5) { // L: 160
					var9 = var17; // L: 161
					break; // L: 162
				}
			}
		}

		if (var9 >= 0) { // L: 166
			this.hitSplatTypes[var9] = var1; // L: 167
			this.hitSplatValues[var9] = var2; // L: 168
			this.hitSplatTypes2[var9] = var3; // L: 169
			this.hitSplatValues2[var9] = var4; // L: 170
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 171
		}
	} // L: 172

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1536361432"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = FileSystem.method3483(var1); // L: 175
		HealthBar var8 = null; // L: 176
		HealthBar var9 = null; // L: 177
		int var10 = var7.int2; // L: 178
		int var11 = 0; // L: 179

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 180
			++var11; // L: 181
			if (var12.definition.field1959 == var7.field1959) { // L: 182
				var12.put(var2 + var4, var5, var6, var3); // L: 183
				return; // L: 184
			}

			if (var12.definition.int1 <= var7.int1) { // L: 186
				var8 = var12;
			}

			if (var12.definition.int2 > var10) { // L: 187
				var9 = var12; // L: 188
				var10 = var12.definition.int2; // L: 189
			}
		}

		if (var9 != null || var11 < 4) { // L: 192
			var12 = new HealthBar(var7); // L: 193
			if (var8 == null) { // L: 194
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8); // L: 195
			}

			var12.put(var2 + var4, var5, var6, var3); // L: 196
			if (var11 >= 4) { // L: 197
				var9.remove();
			}

		}
	} // L: 198

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-756009856"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = FileSystem.method3483(var1); // L: 201

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 202
			if (var2 == var3.definition) { // L: 203
				var3.remove(); // L: 204
				return; // L: 205
			}
		}

	} // L: 208

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "109"
	)
	void method2358(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 211
		class523 var6 = (class523)this.field1172.get((long)var1); // L: 212
		if (var6 != null) { // L: 213
			var6.remove(); // L: 214
			--this.field1190; // L: 215
		}

		if (var2 != 65535 && var2 != -1) { // L: 217
			byte var7 = 0; // L: 220
			if (var4 > 0) { // L: 221
				var7 = -1; // L: 222
			}

			this.field1172.put(new class523(var2, var3, var5, var7), (long)var1); // L: 224
			++this.field1190; // L: 225
		}
	} // L: 218 226

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Lsc;",
		garbageValue = "340671574"
	)
	IterableNodeHashTable method2376() {
		return this.field1172; // L: 229
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "385598036"
	)
	void method2360() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1172); // L: 233

		for (class523 var2 = (class523)var1.method8654(); var2 != null; var2 = (class523)var1.next()) { // L: 234
			var2.remove(); // L: 235
		}

		this.field1190 = 0; // L: 237
	} // L: 238

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(Ljh;I)Ljh;",
		garbageValue = "1338663822"
	)
	Model method2361(Model var1) {
		if (this.field1190 == 0) { // L: 241
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1172); // L: 242
			int var3 = var1.verticesCount; // L: 243
			int var4 = var1.indicesCount; // L: 244
			int var5 = var1.field2702; // L: 245
			byte var6 = var1.field2705; // L: 246

			for (class523 var7 = (class523)var2.method8654(); var7 != null; var7 = (class523)var2.next()) { // L: 247
				if (var7.field5167 != -1) { // L: 248
					Model var8 = class155.SpotAnimationDefinition_get(var7.field5166).method3728(); // L: 249
					if (var8 != null) { // L: 250
						var3 += var8.verticesCount; // L: 251
						var4 += var8.indicesCount; // L: 252
						var5 += var8.field2702; // L: 253
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 255
			var10.method4825(var1); // L: 256

			for (class523 var11 = (class523)var2.method8654(); var11 != null; var11 = (class523)var2.next()) { // L: 257
				if (var11.field5167 != -1) { // L: 258
					Model var9 = class155.SpotAnimationDefinition_get(var11.field5166).getModel(var11.field5167); // L: 259
					if (var9 != null) { // L: 260
						var9.offsetBy(0, -var11.field5170, 0); // L: 261
						var10.method4825(var9); // L: 262
					}
				}
			}

			return var10; // L: 264
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	void method2380() {
		this.field1140 = false; // L: 268
		this.field1211 = -1; // L: 269
		this.field1177 = -1; // L: 270
		this.field1178 = -1; // L: 271
	} // L: 272
}
