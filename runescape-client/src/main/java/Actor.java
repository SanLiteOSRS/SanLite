import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 51908093
	)
	@Export("x")
	int x;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 450111749
	)
	@Export("y")
	int y;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -2096450799
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bm")
	int field1201;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1874078453
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 249266279
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1789894491
	)
	int field1204;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 332775185
	)
	int field1265;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -2026712891
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1194661635
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1748061929
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1321306909
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -21157331
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1110338289
	)
	int field1211;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1887405783
	)
	int field1252;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1436242459
	)
	int field1213;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -205209549
	)
	int field1214;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 39304363
	)
	int field1215;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -928383205
	)
	int field1216;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1651956753
	)
	int field1246;
	@ObfuscatedName("bg")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cw")
	boolean field1219;
	@ObfuscatedName("cf")
	boolean field1220;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1984260023
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1670480919
	)
	int field1222;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1372248375
	)
	int field1223;
	@ObfuscatedName("cx")
	int[] field1264;
	@ObfuscatedName("cd")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ce")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cp")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cv")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("co")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1926646529
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ch")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 2068155445
	)
	int field1234;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1967176287
	)
	int field1235;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1617326933
	)
	int field1236;
	@ObfuscatedName("cg")
	boolean field1237;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -74098563
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1996741795
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -15077673
	)
	int field1240;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1925148019
	)
	int field1241;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1553687919
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1662504155
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 136905603
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 4675371
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 84726575
	)
	int field1224;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	IterableNodeHashTable field1263;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 2127035337
	)
	int field1248;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1757389903
	)
	int field1249;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1365204549
	)
	int field1247;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1398290153
	)
	int field1251;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1177123047
	)
	int field1217;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1999731983
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1021724449
	)
	int field1254;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1945888581
	)
	int field1255;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -902113611
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -610695377
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 572723283
	)
	int field1258;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -132963355
	)
	int field1200;
	@ObfuscatedName("dv")
	byte field1260;
	@ObfuscatedName("dr")
	byte field1218;
	@ObfuscatedName("do")
	byte field1212;
	@ObfuscatedName("db")
	byte field1250;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -609801851
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1514745499
	)
	int field1239;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1789885949
	)
	int field1266;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1388670275
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("de")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dc")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "[Lin;"
	)
	@Export("pathTraversed")
	class217[] pathTraversed;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 703114731
	)
	int field1271;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 1678896513
	)
	int field1261;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -611368101
	)
	int field1273;

	Actor() {
		this.isWalking = false; // L: 18
		this.field1201 = -1462459311; // L: 19
		this.idleSequence = -1; // L: 21
		this.field1204 = -1; // L: 22
		this.field1265 = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1211 = -1;
		this.field1252 = -1;
		this.field1213 = -1;
		this.field1214 = -1;
		this.field1215 = -1; // L: 33
		this.field1216 = -1;
		this.field1246 = -1;
		this.overheadText = null;
		this.field1220 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1222 = 0;
		this.field1223 = 0;
		this.field1264 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1234 = -1;
		this.field1235 = -1;
		this.field1236 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.field1240 = 0;
		this.field1241 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1224 = 0;
		this.field1263 = new IterableNodeHashTable(4);
		this.field1248 = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1258 = -1; // L: 77
		this.field1200 = -1;
		this.field1239 = 0;
		this.field1266 = 32;
		this.pathLength = 0;
		this.pathX = new int[10]; // L: 87
		this.pathY = new int[10]; // L: 88
		this.pathTraversed = new class217[10];
		this.field1271 = 0;
		this.field1261 = 0;
		this.field1273 = -1;
	} // L: 94

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "381940201"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 102
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	final void method2373() {
		this.pathLength = 0;
		this.field1261 = 0; // L: 98
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1923884006"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 106
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false; // L: 110
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = WorldMapCacheName.method5560(var1); // L: 116
			var10 = var12.field2154; // L: 117
			var11 = var12.field2161;
		}

		int var14;
		if (var8) {
			if (var10 == -1) { // L: 121
				return;
			}

			var9 = 0;
			var14 = 0;
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

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1229115524"
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
			var8.field1994 = var1; // L: 171
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
			if (var13.definition.field1994 == var8.field1994) { // L: 185
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

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-711075108"
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
			var3.field1994 = var1; // L: 213
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
		garbageValue = "0"
	)
	void method2376(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 230
		class536 var6 = (class536)this.field1263.get((long)var1); // L: 231
		if (var6 != null) { // L: 232
			var6.remove(); // L: 233
			--this.field1248; // L: 234
		}

		if (var2 != 65535 && var2 != -1) { // L: 236
			byte var7 = 0; // L: 239
			if (var4 > 0) { // L: 240
				var7 = -1; // L: 241
			}

			this.field1263.put(new class536(var2, var3, var5, var7), (long)var1); // L: 243
			++this.field1248; // L: 244
		}
	} // L: 237 245

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Lsf;",
		garbageValue = "-343795604"
	)
	IterableNodeHashTable method2377() {
		return this.field1263; // L: 248
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-28624"
	)
	void method2391() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1263); // L: 252

		for (class536 var2 = (class536)var1.method8713(); var2 != null; var2 = (class536)var1.next()) { // L: 253
			var2.remove(); // L: 254
		}

		this.field1248 = 0; // L: 256
	} // L: 257

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljr;I)Ljr;",
		garbageValue = "-787093925"
	)
	Model method2379(Model var1) {
		if (this.field1248 == 0) { // L: 260
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1263); // L: 261
			int var3 = var1.verticesCount; // L: 262
			int var4 = var1.indicesCount; // L: 263
			int var5 = var1.field2724; // L: 264
			byte var6 = var1.field2723; // L: 265

			for (class536 var7 = (class536)var2.method8713(); var7 != null; var7 = (class536)var2.next()) { // L: 266
				if (var7.field5253 != -1) { // L: 267
					Model var8 = StructComposition.SpotAnimationDefinition_get(var7.field5256).method3750(); // L: 268
					if (var8 != null) { // L: 269
						var3 += var8.verticesCount; // L: 270
						var4 += var8.indicesCount; // L: 271
						var5 += var8.field2724; // L: 272
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 274
			var10.method4842(var1); // L: 275

			for (class536 var11 = (class536)var2.method8713(); var11 != null; var11 = (class536)var2.next()) { // L: 276
				if (var11.field5253 != -1) { // L: 277
					Model var9 = StructComposition.SpotAnimationDefinition_get(var11.field5256).getModel(var11.field5253); // L: 278
					if (var9 != null) { // L: 279
						var9.offsetBy(0, -var11.field5254, 0); // L: 280
						var10.method4842(var9); // L: 281
					}
				}
			}

			return var10; // L: 283
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	void method2393() {
		this.field1237 = false; // L: 287
		this.field1234 = -1; // L: 288
		this.field1235 = -1; // L: 289
		this.field1236 = -1; // L: 290
	} // L: 291

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lto;I)V",
		garbageValue = "-1660235487"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = VarbitComposition.localPlayer = Client.players[var1] = new Player();
		var2.index = var1; // L: 41
		int var3 = var0.readBits(30);
		byte var4 = (byte)(var3 >> 28);
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383; // L: 45
		var2.pathX[0] = var5 - UrlRequester.baseX * 64;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - class47.baseY * 64;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 49
		HealthBar.Client_plane = var2.plane = var4;
		if (Players.field1388[var1] != null) {
			var2.read(Players.field1388[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 53
		Players.field1387[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) { // L: 57
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597; // L: 61
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 65
				Players.field1387[var7] = 0;
			}
		}

		var0.exportIndex();
	} // L: 69

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lon;IB)Lly;",
		garbageValue = "38"
	)
	public static PacketBufferNode method2407(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher); // L: 23
		var4.packetBuffer.writeByte(0); // L: 24
		int var5 = var4.packetBuffer.offset; // L: 25
		var4.packetBuffer.writeByte(var0); // L: 26
		String var6 = var1.toLowerCase(); // L: 27
		int var7 = 0; // L: 28
		byte[] var8 = null; // L: 29
		if (var6.startsWith("yellow:")) { // L: 30
			var7 = 0; // L: 31
			var1 = var1.substring("yellow:".length()); // L: 32
		} else if (var6.startsWith("red:")) { // L: 34
			var7 = 1; // L: 35
			var1 = var1.substring("red:".length()); // L: 36
		} else if (var6.startsWith("green:")) { // L: 38
			var7 = 2; // L: 39
			var1 = var1.substring("green:".length()); // L: 40
		} else if (var6.startsWith("cyan:")) { // L: 42
			var7 = 3; // L: 43
			var1 = var1.substring("cyan:".length()); // L: 44
		} else if (var6.startsWith("purple:")) { // L: 46
			var7 = 4; // L: 47
			var1 = var1.substring("purple:".length()); // L: 48
		} else if (var6.startsWith("white:")) { // L: 50
			var7 = 5; // L: 51
			var1 = var1.substring("white:".length()); // L: 52
		} else if (var6.startsWith("flash1:")) { // L: 54
			var7 = 6; // L: 55
			var1 = var1.substring("flash1:".length()); // L: 56
		} else if (var6.startsWith("flash2:")) { // L: 58
			var7 = 7; // L: 59
			var1 = var1.substring("flash2:".length()); // L: 60
		} else if (var6.startsWith("flash3:")) { // L: 62
			var7 = 8; // L: 63
			var1 = var1.substring("flash3:".length()); // L: 64
		} else if (var6.startsWith("glow1:")) { // L: 66
			var7 = 9; // L: 67
			var1 = var1.substring("glow1:".length()); // L: 68
		} else if (var6.startsWith("glow2:")) { // L: 70
			var7 = 10; // L: 71
			var1 = var1.substring("glow2:".length()); // L: 72
		} else if (var6.startsWith("glow3:")) { // L: 74
			var7 = 11; // L: 75
			var1 = var1.substring("glow3:".length()); // L: 76
		} else if (var6.startsWith("rainbow:")) { // L: 78
			var7 = 12; // L: 79
			var1 = var1.substring("rainbow:".length()); // L: 80
		} else if (var6.startsWith("pattern")) { // L: 82
			var8 = Interpreter.method2049(var6); // L: 83
			if (var8 != null) { // L: 84
				var7 = var8.length + 12; // L: 85
				var1 = var1.substring("pattern".length() + var8.length + 1); // L: 86
			}
		}

		var6 = var1.toLowerCase(); // L: 89
		byte var9 = 0; // L: 90
		if (var6.startsWith("wave:")) { // L: 91
			var9 = 1; // L: 92
			var1 = var1.substring("wave:".length()); // L: 93
		} else if (var6.startsWith("wave2:")) { // L: 95
			var9 = 2; // L: 96
			var1 = var1.substring("wave2:".length()); // L: 97
		} else if (var6.startsWith("shake:")) { // L: 99
			var9 = 3; // L: 100
			var1 = var1.substring("shake:".length()); // L: 101
		} else if (var6.startsWith("scroll:")) { // L: 103
			var9 = 4; // L: 104
			var1 = var1.substring("scroll:".length()); // L: 105
		} else if (var6.startsWith("slide:")) { // L: 107
			var9 = 5; // L: 108
			var1 = var1.substring("slide:".length()); // L: 109
		}

		var4.packetBuffer.writeByte(var7); // L: 111
		var4.packetBuffer.writeByte(var9); // L: 112
		if (var8 != null && Client.field708 >= 214) { // L: 113
			for (int var10 = 0; var10 < var8.length; ++var10) { // L: 114
				var4.packetBuffer.writeByte(var8[var10]); // L: 115
			}
		}

		class216.method4235(var4.packetBuffer, var1); // L: 118
		if (var0 == class339.field3821.rsOrdinal()) { // L: 119
			var4.packetBuffer.writeByte(var3); // L: 120
		}

		var4.packetBuffer.method9055(var4.packetBuffer.offset - var5); // L: 122
		return var4; // L: 123
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)Z",
		garbageValue = "-1903392375"
	)
	static boolean method2406(PlayerComposition var0) {
		if (var0.equipment[0] < 512) { // L: 1024
			return false; // L: 1028
		} else {
			ItemComposition var1 = InvDefinition.ItemComposition_get(var0.equipment[0] - 512); // L: 1025
			return var1.maleModel1 != class209.field2339.field2334 && var1.maleModel2 != class209.field2339.field2334; // L: 1026
		}
	}
}
