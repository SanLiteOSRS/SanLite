import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	static AbstractSocket field1277;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = -1219967507
	)
	static int field1276;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1862821053
	)
	@Export("x")
	int x;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 985421299
	)
	@Export("y")
	int y;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 8499943
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2103652723
	)
	int field1249;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -682106097
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1478474189
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1883369341
	)
	int field1206;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 313622405
	)
	int field1207;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1949350247
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 998928211
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -174129813
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 220265917
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 899381017
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2057224975
	)
	int field1213;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1139744979
	)
	int field1214;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 737935349
	)
	int field1215;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 402357639
	)
	int field1264;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 547048533
	)
	int field1269;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -980380777
	)
	int field1218;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1857553201
	)
	int field1226;
	@ObfuscatedName("bg")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cb")
	boolean field1252;
	@ObfuscatedName("cj")
	boolean field1222;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1723863083
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 328219357
	)
	int field1224;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 260735143
	)
	int field1225;
	@ObfuscatedName("cl")
	int[] field1262;
	@ObfuscatedName("ci")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ct")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cm")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cd")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cc")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cn")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1323133659
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cu")
	boolean field1227;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1710238225
	)
	int field1272;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1633594777
	)
	int field1237;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1077681299
	)
	int field1216;
	@ObfuscatedName("co")
	boolean field1239;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -736904749
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 361836319
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -270358857
	)
	int field1242;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 641905945
	)
	int field1243;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1037212889
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1332788851
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1127621139
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 2011747125
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -2087063199
	)
	int field1248;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	IterableNodeHashTable field1204;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1837002709
	)
	int field1220;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -591572193
	)
	int field1251;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -235809
	)
	int field1258;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 795656539
	)
	int field1238;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1114212247
	)
	int field1253;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -781644513
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1902776145
	)
	int field1256;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 991529221
	)
	int field1203;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 65821175
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 393857127
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1876849975
	)
	int field1260;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 940209169
	)
	int field1236;
	@ObfuscatedName("dy")
	byte field1261;
	@ObfuscatedName("dt")
	byte field1263;
	@ObfuscatedName("de")
	byte field1235;
	@ObfuscatedName("dz")
	byte field1265;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -250909065
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -826008939
	)
	int field1267;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -110650303
	)
	int field1268;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1259578643
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("du")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dc")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "[Liu;"
	)
	@Export("pathTraversed")
	class233[] pathTraversed;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -1186026863
	)
	int field1257;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -623530183
	)
	int field1274;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -1972614327
	)
	int field1275;

	Actor() {
		this.isWalking = false; // L: 18
		this.field1249 = 1; // L: 19
		this.idleSequence = -1; // L: 21
		this.field1206 = -1; // L: 22
		this.field1207 = -1; // L: 23
		this.walkSequence = -1; // L: 24
		this.walkBackSequence = -1; // L: 25
		this.walkLeftSequence = -1; // L: 26
		this.walkRightSequence = -1; // L: 27
		this.runSequence = -1; // L: 28
		this.field1213 = -1; // L: 29
		this.field1214 = -1; // L: 30
		this.field1215 = -1; // L: 31
		this.field1264 = -1; // L: 32
		this.field1269 = -1; // L: 33
		this.field1218 = -1;
		this.field1226 = -1; // L: 35
		this.overheadText = null; // L: 36
		this.field1222 = false; // L: 38
		this.overheadTextCyclesRemaining = 100; // L: 39
		this.field1224 = 0; // L: 40
		this.field1225 = 0; // L: 41
		this.field1262 = null; // L: 42
		this.hitSplatCount = 0; // L: 44
		this.hitSplatTypes = new int[4]; // L: 45
		this.hitSplatValues = new int[4]; // L: 46
		this.hitSplatCycles = new int[4]; // L: 47
		this.hitSplatTypes2 = new int[4]; // L: 48
		this.hitSplatValues2 = new int[4]; // L: 49
		this.healthBars = new IterableNodeDeque(); // L: 50
		this.targetIndex = -1; // L: 51
		this.field1227 = false; // L: 52
		this.field1272 = -1; // L: 53
		this.field1237 = -1; // L: 54
		this.field1216 = -1; // L: 55
		this.movementSequence = -1; // L: 57
		this.movementFrame = 0; // L: 58
		this.field1242 = 0; // L: 59
		this.field1243 = 0; // L: 60
		this.sequence = -1; // L: 61
		this.sequenceFrame = 0; // L: 62
		this.sequenceFrameCycle = 0; // L: 63
		this.sequenceDelay = 0; // L: 64
		this.field1248 = 0; // L: 65
		this.field1204 = new IterableNodeHashTable(4); // L: 66
		this.field1220 = 0; // L: 67
		this.npcCycle = 0; // L: 75
		this.defaultHeight = 200; // L: 76
		this.field1260 = -1; // L: 77
		this.field1236 = -1; // L: 78
		this.field1267 = 0; // L: 84
		this.field1268 = 32; // L: 85
		this.pathLength = 0; // L: 86
		this.pathX = new int[10]; // L: 87
		this.pathY = new int[10]; // L: 88
		this.pathTraversed = new class233[10]; // L: 89
		this.field1257 = 0; // L: 90
		this.field1274 = 0; // L: 91
		this.field1275 = -1; // L: 92
	} // L: 94

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "951800784"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 102
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	final void method2393() {
		this.pathLength = 0; // L: 97
		this.field1274 = 0; // L: 98
	} // L: 99

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-275518772"
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
			HitSplatDefinition var12 = class193.method3723(var1); // L: 116
			var10 = var12.field2229; // L: 117
			var11 = var12.field2227; // L: 118
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-427923599"
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
			var8.field2061 = var1; // L: 171
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
			if (var13.definition.field2061 == var8.field2061) { // L: 185
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
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
			var3.field2061 = var1; // L: 213
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1044792612"
	)
	void method2414(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 230
		class556 var6 = (class556)this.field1204.get((long)var1); // L: 231
		if (var6 != null) { // L: 232
			var6.remove(); // L: 233
			--this.field1220; // L: 234
		}

		if (var2 != 65535 && var2 != -1) { // L: 236
			byte var7 = 0; // L: 239
			if (var4 > 0) { // L: 240
				var7 = -1; // L: 241
			}

			this.field1204.put(new class556(var2, var3, var5, var7), (long)var1); // L: 243
			++this.field1220; // L: 244
		}
	} // L: 237 245

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)Lto;",
		garbageValue = "-37"
	)
	IterableNodeHashTable method2399() {
		return this.field1204; // L: 248
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-356157819"
	)
	void method2400() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1204); // L: 252

		for (class556 var2 = (class556)var1.method8943(); var2 != null; var2 = (class556)var1.next()) { // L: 253
			var2.remove(); // L: 254
		}

		this.field1220 = 0; // L: 256
	} // L: 257

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljn;I)Ljn;",
		garbageValue = "1979045598"
	)
	Model method2401(Model var1) {
		if (this.field1220 == 0) { // L: 260
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1204); // L: 261
			int var3 = var1.verticesCount; // L: 262
			int var4 = var1.indicesCount; // L: 263
			int var5 = var1.field2845; // L: 264
			byte var6 = var1.field2829; // L: 265

			for (class556 var7 = (class556)var2.method8943(); var7 != null; var7 = (class556)var2.next()) { // L: 266
				if (var7.field5378 != -1) { // L: 267
					Model var8 = UserComparator3.SpotAnimationDefinition_get(var7.field5380).method3940(); // L: 268
					if (var8 != null) { // L: 269
						var3 += var8.verticesCount; // L: 270
						var4 += var8.indicesCount; // L: 271
						var5 += var8.field2845; // L: 272
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 274
			var10.method5058(var1); // L: 275

			for (class556 var11 = (class556)var2.method8943(); var11 != null; var11 = (class556)var2.next()) { // L: 276
				if (var11.field5378 != -1) { // L: 277
					Model var9 = UserComparator3.SpotAnimationDefinition_get(var11.field5380).getModel(var11.field5378); // L: 278
					if (var9 != null) { // L: 279
						var9.offsetBy(0, -var11.field5382, 0); // L: 280
						var10.method5058(var9); // L: 281
					}
				}
			}

			return var10; // L: 283
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1848872872"
	)
	void method2419() {
		this.field1239 = false; // L: 287
		this.field1272 = -1; // L: 288
		this.field1237 = -1; // L: 289
		this.field1216 = -1; // L: 290
	} // L: 291

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2088786442"
	)
	static int method2392(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2; // L: 34
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "1179769137"
	)
	public static void method2413(Widget var0, int var1) {
		ItemComposition var2 = class10.ItemComposition_get(var1); // L: 1053
		var0.field3801.equipment[var2.maleModel] = var1 + 512; // L: 1054
		if (var2.maleModel1 != -1) { // L: 1055
			var0.field3801.equipment[var2.maleModel1] = 0; // L: 1056
		}

		if (var2.field2326 != -1) { // L: 1058
			var0.field3801.equipment[var2.field2326] = 0; // L: 1059
		}

		var0.field3801.method6332(); // L: 1061
	} // L: 1062
}
