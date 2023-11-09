import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field1223;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 583712055
	)
	@Export("x")
	int x;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1173676427
	)
	@Export("y")
	int y;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1020615965
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1279251520
	)
	int field1155;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2131464391
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 28557013
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1411637209
	)
	int field1199;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1071771523
	)
	int field1159;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1868003099
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1037251465
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 513535125
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 418026995
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1204336597
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -858811131
	)
	int field1191;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 351810389
	)
	int field1198;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1598920981
	)
	int field1167;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 333656943
	)
	int field1168;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 978877079
	)
	int field1169;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -3972301
	)
	int field1183;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 250215379
	)
	int field1171;
	@ObfuscatedName("bl")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cs")
	boolean field1165;
	@ObfuscatedName("cu")
	boolean field1174;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1595120141
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1190750381
	)
	int field1189;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 119631037
	)
	int field1177;
	@ObfuscatedName("ch")
	int[] field1224;
	@ObfuscatedName("cy")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cd")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cv")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cr")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cm")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cg")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1091801083
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cc")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 2099679725
	)
	int field1228;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -697101729
	)
	int field1178;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 974122433
	)
	int field1190;
	@ObfuscatedName("cj")
	boolean field1184;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -100139863
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1558692971
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 416993781
	)
	int field1194;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1487680733
	)
	int field1195;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -254610587
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1629959799
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1901437587
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 2050917487
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 207129501
	)
	int field1200;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	IterableNodeHashTable field1201;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1668243431
	)
	int field1193;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1553245255
	)
	int field1203;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 2134899839
	)
	int field1173;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1719951815
	)
	int field1205;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1671304245
	)
	int field1206;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1732730909
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -556325665
	)
	int field1208;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 39657223
	)
	int field1209;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -382884163
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 518523699
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 2055675235
	)
	int field1170;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 987405931
	)
	int field1213;
	@ObfuscatedName("di")
	byte field1164;
	@ObfuscatedName("dj")
	byte field1215;
	@ObfuscatedName("dk")
	byte field1196;
	@ObfuscatedName("dy")
	byte field1217;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 677869991
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -588610153
	)
	int field1219;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1466211951
	)
	int field1220;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1557847499
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("ds")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dr")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "[Lie;"
	)
	@Export("pathTraversed")
	class216[] pathTraversed;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -392893065
	)
	int field1225;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 427678341
	)
	int field1226;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = -1961345553
	)
	int field1227;

	Actor() {
		this.isWalking = false; // L: 18
		this.field1155 = 64; // L: 19
		this.idleSequence = -1; // L: 21
		this.field1199 = -1; // L: 22
		this.field1159 = -1; // L: 23
		this.walkSequence = -1; // L: 24
		this.walkBackSequence = -1; // L: 25
		this.walkLeftSequence = -1; // L: 26
		this.walkRightSequence = -1; // L: 27
		this.runSequence = -1; // L: 28
		this.field1191 = -1; // L: 29
		this.field1198 = -1; // L: 30
		this.field1167 = -1; // L: 31
		this.field1168 = -1; // L: 32
		this.field1169 = -1; // L: 33
		this.field1183 = -1; // L: 34
		this.field1171 = -1; // L: 35
		this.overheadText = null; // L: 36
		this.field1174 = false; // L: 38
		this.overheadTextCyclesRemaining = 100; // L: 39
		this.field1189 = 0; // L: 40
		this.field1177 = 0; // L: 41
		this.field1224 = null; // L: 42
		this.hitSplatCount = 0; // L: 44
		this.hitSplatTypes = new int[4]; // L: 45
		this.hitSplatValues = new int[4]; // L: 46
		this.hitSplatCycles = new int[4]; // L: 47
		this.hitSplatTypes2 = new int[4]; // L: 48
		this.hitSplatValues2 = new int[4]; // L: 49
		this.healthBars = new IterableNodeDeque(); // L: 50
		this.targetIndex = -1; // L: 51
		this.false0 = false; // L: 52
		this.field1228 = -1; // L: 53
		this.field1178 = -1; // L: 54
		this.field1190 = -1; // L: 55
		this.movementSequence = -1; // L: 57
		this.movementFrame = 0; // L: 58
		this.field1194 = 0; // L: 59
		this.field1195 = 0; // L: 60
		this.sequence = -1; // L: 61
		this.sequenceFrame = 0; // L: 62
		this.sequenceFrameCycle = 0; // L: 63
		this.sequenceDelay = 0; // L: 64
		this.field1200 = 0; // L: 65
		this.field1201 = new IterableNodeHashTable(4); // L: 66
		this.field1193 = 0; // L: 67
		this.npcCycle = 0; // L: 75
		this.defaultHeight = 200; // L: 76
		this.field1170 = -1; // L: 77
		this.field1213 = -1; // L: 78
		this.field1219 = 0; // L: 84
		this.field1220 = 32; // L: 85
		this.pathLength = 0; // L: 86
		this.pathX = new int[10]; // L: 87
		this.pathY = new int[10]; // L: 88
		this.pathTraversed = new class216[10]; // L: 89
		this.field1225 = 0; // L: 90
		this.field1226 = 0; // L: 91
		this.field1227 = -1; // L: 92
	} // L: 94

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 102
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2144229618"
	)
	final void method2364() {
		this.pathLength = 0; // L: 97
		this.field1226 = 0; // L: 98
	} // L: 99

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "604654467"
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
			HitSplatDefinition var12 = PlayerComposition.method6053(var1); // L: 116
			var10 = var12.field2128; // L: 117
			var11 = var12.field2134; // L: 118
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

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "390211439"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 164
		HealthBarDefinition var7;
		if (var8 != null) { // L: 165
			var7 = var8; // L: 166
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 169
			var8 = new HealthBarDefinition(); // L: 170
			var8.field1954 = var1; // L: 171
			if (var9 != null) { // L: 172
				var8.decode(new Buffer(var9)); // L: 173
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1); // L: 175
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
			if (var13.definition.field1954 == var8.field1954) { // L: 185
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

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 206
		HealthBarDefinition var2;
		if (var3 != null) { // L: 207
			var2 = var3; // L: 208
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 211
			var3 = new HealthBarDefinition(); // L: 212
			var3.field1954 = var1; // L: 213
			if (var4 != null) { // L: 214
				var3.decode(new Buffer(var4)); // L: 215
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1); // L: 217
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

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "30"
	)
	void method2363(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 230
		class523 var6 = (class523)this.field1201.get((long)var1); // L: 231
		if (var6 != null) { // L: 232
			var6.remove(); // L: 233
			--this.field1193; // L: 234
		}

		if (var2 != 65535 && var2 != -1) { // L: 236
			byte var7 = 0; // L: 239
			if (var4 > 0) { // L: 240
				var7 = -1; // L: 241
			}

			this.field1201.put(new class523(var2, var3, var5, var7), (long)var1); // L: 243
			++this.field1193; // L: 244
		}
	} // L: 237 245

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)Lsv;",
		garbageValue = "1949828851"
	)
	IterableNodeHashTable method2391() {
		return this.field1201; // L: 248
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-131264283"
	)
	void method2365() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1201); // L: 252

		for (class523 var2 = (class523)var1.method8589(); var2 != null; var2 = (class523)var1.next()) { // L: 253
			var2.remove(); // L: 254
		}

		this.field1193 = 0; // L: 256
	} // L: 257

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)Ljd;",
		garbageValue = "1334524793"
	)
	Model method2366(Model var1) {
		if (this.field1193 == 0) { // L: 260
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1201); // L: 261
			int var3 = var1.verticesCount; // L: 262
			int var4 = var1.indicesCount; // L: 263
			int var5 = var1.field2707; // L: 264
			byte var6 = var1.field2706; // L: 265

			for (class523 var7 = (class523)var2.method8589(); var7 != null; var7 = (class523)var2.next()) { // L: 266
				if (var7.field5168 != -1) { // L: 267
					Model var8 = class53.SpotAnimationDefinition_get(var7.field5165).method3764(); // L: 268
					if (var8 != null) { // L: 269
						var3 += var8.verticesCount; // L: 270
						var4 += var8.indicesCount; // L: 271
						var5 += var8.field2707; // L: 272
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 274
			var10.method4782(var1); // L: 275

			for (class523 var11 = (class523)var2.method8589(); var11 != null; var11 = (class523)var2.next()) { // L: 276
				if (var11.field5168 != -1) { // L: 277
					Model var9 = class53.SpotAnimationDefinition_get(var11.field5165).getModel(var11.field5168); // L: 278
					if (var9 != null) { // L: 279
						var9.offsetBy(0, -var11.field5169, 0); // L: 280
						var10.method4782(var9); // L: 281
					}
				}
			}

			return var10; // L: 283
		}
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1832865159"
	)
	void method2375() {
		this.field1184 = false; // L: 287
		this.field1228 = -1; // L: 288
		this.field1178 = -1; // L: 289
		this.field1190 = -1; // L: 290
	} // L: 291
}
