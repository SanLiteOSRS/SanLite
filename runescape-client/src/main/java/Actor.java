import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1509430289
	)
	@Export("x")
	int x;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1161131933
	)
	@Export("y")
	int y;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -801118043
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1817157965
	)
	int field1181;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 657406157
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1230535435
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 817671675
	)
	int field1184;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1470475637
	)
	int field1185;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -377561393
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -250604557
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -2121160341
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1901053715
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -834720683
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1304177087
	)
	int field1191;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1483478789
	)
	int field1192;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -2117235055
	)
	int field1193;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -826603561
	)
	int field1194;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -917644957
	)
	int field1195;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -598710567
	)
	int field1196;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1745473463
	)
	int field1197;
	@ObfuscatedName("bd")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ch")
	boolean field1199;
	@ObfuscatedName("cg")
	boolean field1200;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 357460971
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -98577301
	)
	int field1198;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -780472911
	)
	int field1203;
	@ObfuscatedName("cm")
	int[] field1204;
	@ObfuscatedName("cc")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cl")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cd")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cw")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cv")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cp")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -294539655
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ca")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1978550917
	)
	int field1218;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1657231985
	)
	int field1215;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1998691275
	)
	int field1216;
	@ObfuscatedName("cj")
	boolean field1217;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 647962175
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -552145619
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -2120718239
	)
	int field1220;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1643951841
	)
	int field1214;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1114347577
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 939041583
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -90673321
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -79377967
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -714948099
	)
	int field1226;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	IterableNodeHashTable field1227;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1821941277
	)
	int field1242;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1994581379
	)
	int field1229;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1959570293
	)
	int field1230;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 1124464127
	)
	int field1231;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 632612065
	)
	int field1232;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1856887465
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 131046427
	)
	int field1234;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -303136309
	)
	int field1235;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 971561835
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 88178471
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -363060371
	)
	int field1183;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1355126321
	)
	int field1189;
	@ObfuscatedName("dv")
	byte field1240;
	@ObfuscatedName("dt")
	byte field1247;
	@ObfuscatedName("dz")
	byte field1190;
	@ObfuscatedName("da")
	byte field1243;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1447208913
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -148746535
	)
	int field1246;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1053991459
	)
	int field1228;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1503370365
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("db")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("du")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "[Lia;"
	)
	@Export("pathTraversed")
	class217[] pathTraversed;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = 754922955
	)
	int field1251;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 1354417185
	)
	int field1252;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -1266519947
	)
	int field1253;

	Actor() {
		this.isWalking = false; // L: 18
		this.field1181 = 1; // L: 19
		this.idleSequence = -1; // L: 21
		this.field1184 = -1; // L: 22
		this.field1185 = -1; // L: 23
		this.walkSequence = -1; // L: 24
		this.walkBackSequence = -1; // L: 25
		this.walkLeftSequence = -1; // L: 26
		this.walkRightSequence = -1; // L: 27
		this.runSequence = -1; // L: 28
		this.field1191 = -1; // L: 29
		this.field1192 = -1; // L: 30
		this.field1193 = -1; // L: 31
		this.field1194 = -1;
		this.field1195 = -1; // L: 33
		this.field1196 = -1; // L: 34
		this.field1197 = -1; // L: 35
		this.overheadText = null; // L: 36
		this.field1200 = false; // L: 38
		this.overheadTextCyclesRemaining = 100; // L: 39
		this.field1198 = 0; // L: 40
		this.field1203 = 0; // L: 41
		this.field1204 = null; // L: 42
		this.hitSplatCount = 0; // L: 44
		this.hitSplatTypes = new int[4]; // L: 45
		this.hitSplatValues = new int[4]; // L: 46
		this.hitSplatCycles = new int[4]; // L: 47
		this.hitSplatTypes2 = new int[4]; // L: 48
		this.hitSplatValues2 = new int[4]; // L: 49
		this.healthBars = new IterableNodeDeque(); // L: 50
		this.targetIndex = -1; // L: 51
		this.false0 = false; // L: 52
		this.field1218 = -1; // L: 53
		this.field1215 = -1; // L: 54
		this.field1216 = -1; // L: 55
		this.movementSequence = -1; // L: 57
		this.movementFrame = 0; // L: 58
		this.field1220 = 0; // L: 59
		this.field1214 = 0; // L: 60
		this.sequence = -1; // L: 61
		this.sequenceFrame = 0; // L: 62
		this.sequenceFrameCycle = 0; // L: 63
		this.sequenceDelay = 0; // L: 64
		this.field1226 = 0; // L: 65
		this.field1227 = new IterableNodeHashTable(4); // L: 66
		this.field1242 = 0; // L: 67
		this.npcCycle = 0; // L: 75
		this.defaultHeight = 200; // L: 76
		this.field1183 = -1; // L: 77
		this.field1189 = -1; // L: 78
		this.field1246 = 0; // L: 84
		this.field1228 = 32; // L: 85
		this.pathLength = 0; // L: 86
		this.pathX = new int[10]; // L: 87
		this.pathY = new int[10]; // L: 88
		this.pathTraversed = new class217[10]; // L: 89
		this.field1251 = 0; // L: 90
		this.field1252 = 0; // L: 91
		this.field1253 = -1; // L: 92
	} // L: 94

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "90"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 102
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1534727547"
	)
	final void method2445() {
		this.pathLength = 0; // L: 97
		this.field1252 = 0; // L: 98
	} // L: 99

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1879499380"
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
			HitSplatDefinition var12 = class131.method3110(var1); // L: 116
			var10 = var12.field2132; // L: 117
			var11 = var12.field2150; // L: 118
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

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "95"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 164
		HealthBarDefinition var7;
		if (var8 != null) { // L: 165
			var7 = var8; // L: 166
		} else {
			byte[] var9 = FriendSystem.HealthBarDefinition_archive.takeFile(33, var1); // L: 169
			var8 = new HealthBarDefinition(); // L: 170
			var8.field1970 = var1; // L: 171
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
			if (var13.definition.field1970 == var8.field1970) { // L: 185
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

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 206
		HealthBarDefinition var2;
		if (var3 != null) { // L: 207
			var2 = var3; // L: 208
		} else {
			byte[] var4 = FriendSystem.HealthBarDefinition_archive.takeFile(33, var1); // L: 211
			var3 = new HealthBarDefinition(); // L: 212
			var3.field1970 = var1; // L: 213
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-312618826"
	)
	void method2428(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 230
		class535 var6 = (class535)this.field1227.get((long)var1); // L: 231
		if (var6 != null) { // L: 232
			var6.remove(); // L: 233
			--this.field1242; // L: 234
		}

		if (var2 != 65535 && var2 != -1) { // L: 236
			byte var7 = 0; // L: 239
			if (var4 > 0) { // L: 240
				var7 = -1; // L: 241
			}

			this.field1227.put(new class535(var2, var3, var5, var7), (long)var1); // L: 243
			++this.field1242; // L: 244
		}
	} // L: 237 245

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I)Lsw;",
		garbageValue = "1230646246"
	)
	IterableNodeHashTable method2436() {
		return this.field1227; // L: 248
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "60784820"
	)
	void method2430() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1227); // L: 252

		for (class535 var2 = (class535)var1.method8709(); var2 != null; var2 = (class535)var1.next()) { // L: 253
			var2.remove(); // L: 254
		}

		this.field1242 = 0; // L: 256
	} // L: 257

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ljr;I)Ljr;",
		garbageValue = "1439420290"
	)
	Model method2452(Model var1) {
		if (this.field1242 == 0) { // L: 260
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1227); // L: 261
			int var3 = var1.verticesCount; // L: 262
			int var4 = var1.indicesCount; // L: 263
			int var5 = var1.field2716; // L: 264
			byte var6 = var1.field2725; // L: 265

			for (class535 var7 = (class535)var2.method8709(); var7 != null; var7 = (class535)var2.next()) { // L: 266
				if (var7.field5218 != -1) { // L: 267
					Model var8 = TextureProvider.SpotAnimationDefinition_get(var7.field5220).method3891(); // L: 268
					if (var8 != null) { // L: 269
						var3 += var8.verticesCount; // L: 270
						var4 += var8.indicesCount; // L: 271
						var5 += var8.field2716; // L: 272
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 274
			var10.method4934(var1); // L: 275

			for (class535 var11 = (class535)var2.method8709(); var11 != null; var11 = (class535)var2.next()) { // L: 276
				if (var11.field5218 != -1) { // L: 277
					Model var9 = TextureProvider.SpotAnimationDefinition_get(var11.field5220).getModel(var11.field5218); // L: 278
					if (var9 != null) { // L: 279
						var9.offsetBy(0, -var11.field5222, 0); // L: 280
						var10.method4934(var9); // L: 281
					}
				}
			}

			return var10; // L: 283
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1678265504"
	)
	void method2424() {
		this.field1217 = false; // L: 287
		this.field1218 = -1; // L: 288
		this.field1215 = -1; // L: 289
		this.field1216 = -1; // L: 290
	} // L: 291

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1532725422"
	)
	public static int method2448(int var0) {
		return class464.field4783[var0 & 16383]; // L: 32
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([FB)V",
		garbageValue = "-87"
	)
	static void method2434(float[] var0) {
		if (var0[0] + class126.field1494 < 1.3333334F) { // L: 308
			float var1 = var0[0] - 2.0F; // L: 309
			float var2 = var0[0] - 1.0F; // L: 310
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * 4.0F * var2)); // L: 311
			float var4 = 0.5F * (-var1 + var3); // L: 312
			if (var0[1] + class126.field1494 > var4) { // L: 313
				var0[1] = var4 - class126.field1494; // L: 314
			} else {
				var4 = 0.5F * (-var1 - var3); // L: 317
				if (var0[1] < var4 + class126.field1494) { // L: 318
					var0[1] = var4 + class126.field1494; // L: 319
				}
			}
		} else {
			var0[0] = 1.3333334F - class126.field1494; // L: 324
			var0[1] = 0.33333334F - class126.field1494; // L: 325
		}

	} // L: 327
}
