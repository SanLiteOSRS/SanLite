import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1766410589
	)
	@Export("x")
	int x;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1556616227
	)
	@Export("y")
	int y;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1594942263
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1748580133
	)
	int field1223;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -88027347
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 690241029
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 190803943
	)
	int field1237;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -121091159
	)
	int field1190;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1501618131
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1132330219
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1584060379
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 771169105
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -787306259
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1563977323
	)
	int field1194;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1081941851
	)
	int field1197;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1538712951
	)
	int field1198;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1380842751
	)
	int field1211;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1448312691
	)
	int field1200;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 91635021
	)
	int field1201;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1188504687
	)
	int field1202;
	@ObfuscatedName("bj")
	String field1213;
	@ObfuscatedName("ct")
	boolean field1204;
	@ObfuscatedName("cf")
	boolean field1192;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1809405787
	)
	int field1182;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 559722085
	)
	int field1207;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1943627225
	)
	int field1208;
	@ObfuscatedName("cj")
	int[] field1189;
	@ObfuscatedName("cw")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ce")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cm")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("ca")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cx")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -222805781
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cr")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1129335637
	)
	int field1219;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1575237503
	)
	int field1220;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -2038244283
	)
	int field1221;
	@ObfuscatedName("cl")
	boolean field1222;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 898222983
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -7108387
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -567357867
	)
	int field1225;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -2008098921
	)
	int field1193;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1584912307
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 512786407
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1666737641
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -665241399
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1779633697
	)
	int field1199;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	IterableNodeHashTable field1186;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 697829181
	)
	int field1233;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -124938771
	)
	int field1234;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 260123841
	)
	int field1196;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1666423841
	)
	int field1236;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1261182483
	)
	int field1224;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -287971117
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -609952917
	)
	int field1239;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1252810341
	)
	int field1232;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -868708075
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 357335143
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -530524667
	)
	int field1183;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 1527917085
	)
	int field1244;
	@ObfuscatedName("dz")
	byte field1245;
	@ObfuscatedName("dx")
	byte field1238;
	@ObfuscatedName("dp")
	byte field1247;
	@ObfuscatedName("ds")
	byte field1248;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 2136410599
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1121995239
	)
	int field1250;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -215065449
	)
	int field1251;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1181401597
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("db")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dw")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "[Lio;"
	)
	@Export("pathTraversed")
	class218[] pathTraversed;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 122518907
	)
	int field1256;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 1669409601
	)
	int field1257;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1655690669
	)
	int field1258;

	Actor() {
		this.isWalking = false; // L: 18
		this.field1223 = 1; // L: 19
		this.idleSequence = -1; // L: 21
		this.field1237 = -1; // L: 22
		this.field1190 = -1; // L: 23
		this.walkSequence = -1; // L: 24
		this.walkBackSequence = -1; // L: 25
		this.walkLeftSequence = -1; // L: 26
		this.walkRightSequence = -1; // L: 27
		this.runSequence = -1; // L: 28
		this.field1194 = -1; // L: 29
		this.field1197 = -1; // L: 30
		this.field1198 = -1; // L: 31
		this.field1211 = -1; // L: 32
		this.field1200 = -1; // L: 33
		this.field1201 = -1; // L: 34
		this.field1202 = -1; // L: 35
		this.field1213 = null; // L: 36
		this.field1192 = false; // L: 38
		this.field1182 = 100; // L: 39
		this.field1207 = 0; // L: 40
		this.field1208 = 0; // L: 41
		this.field1189 = null; // L: 42
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1219 = -1;
		this.field1220 = -1;
		this.field1221 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.field1225 = 0;
		this.field1193 = 0; // L: 60
		this.sequence = -1; // L: 61
		this.sequenceFrame = 0; // L: 62
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1199 = 0;
		this.field1186 = new IterableNodeHashTable(4);
		this.field1233 = 0;
		this.npcCycle = 0; // L: 75
		this.defaultHeight = 200; // L: 76
		this.field1183 = -1; // L: 77
		this.field1244 = -1; // L: 78
		this.field1250 = 0; // L: 84
		this.field1251 = 32; // L: 85
		this.pathLength = 0; // L: 86
		this.pathX = new int[10]; // L: 87
		this.pathY = new int[10]; // L: 88
		this.pathTraversed = new class218[10]; // L: 89
		this.field1256 = 0; // L: 90
		this.field1257 = 0; // L: 91
		this.field1258 = -1; // L: 92
	} // L: 94

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 102
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "179353417"
	)
	final void method2400() {
		this.pathLength = 0; // L: 97
		this.field1257 = 0; // L: 98
	} // L: 99

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "114"
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
			HitSplatDefinition var12 = class177.method3541(var1); // L: 116
			var10 = var12.field2131; // L: 117
			var11 = var12.field2123; // L: 118
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-730054495"
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
			var8.field1962 = var1; // L: 171
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
			if (var13.definition.field1962 == var8.field1962) { // L: 185
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "281579888"
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
			var3.field1962 = var1; // L: 213
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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "921981147"
	)
	void method2399(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 230
		class536 var6 = (class536)this.field1186.get((long)var1); // L: 231
		if (var6 != null) { // L: 232
			var6.remove(); // L: 233
			--this.field1233; // L: 234
		}

		if (var2 != 65535 && var2 != -1) { // L: 236
			byte var7 = 0; // L: 239
			if (var4 > 0) { // L: 240
				var7 = -1; // L: 241
			}

			this.field1186.put(new class536(var2, var3, var5, var7), (long)var1); // L: 243
			++this.field1233; // L: 244
		}
	} // L: 237 245

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Lsa;",
		garbageValue = "655512297"
	)
	IterableNodeHashTable method2388() {
		return this.field1186; // L: 248
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1776103193"
	)
	void method2409() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1186); // L: 252

		for (class536 var2 = (class536)var1.method8761(); var2 != null; var2 = (class536)var1.next()) { // L: 253
			var2.remove(); // L: 254
		}

		this.field1233 = 0; // L: 256
	} // L: 257

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljo;I)Ljo;",
		garbageValue = "1288995708"
	)
	Model method2391(Model var1) {
		if (this.field1233 == 0) { // L: 260
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1186); // L: 261
			int var3 = var1.verticesCount; // L: 262
			int var4 = var1.indicesCount; // L: 263
			int var5 = var1.field2695; // L: 264
			byte var6 = var1.field2683; // L: 265

			for (class536 var7 = (class536)var2.method8761(); var7 != null; var7 = (class536)var2.next()) { // L: 266
				if (var7.field5224 != -1) { // L: 267
					Model var8 = NPCComposition.SpotAnimationDefinition_get(var7.field5225).method3778(); // L: 268
					if (var8 != null) { // L: 269
						var3 += var8.verticesCount; // L: 270
						var4 += var8.indicesCount; // L: 271
						var5 += var8.field2695; // L: 272
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 274
			var10.method4810(var1); // L: 275

			for (class536 var11 = (class536)var2.method8761(); var11 != null; var11 = (class536)var2.next()) { // L: 276
				if (var11.field5224 != -1) { // L: 277
					Model var9 = NPCComposition.SpotAnimationDefinition_get(var11.field5225).getModel(var11.field5224); // L: 278
					if (var9 != null) { // L: 279
						var9.offsetBy(0, -var11.field5222, 0); // L: 280
						var10.method4810(var9); // L: 281
					}
				}
			}

			return var10; // L: 283
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "110"
	)
	void method2392() {
		this.field1222 = false; // L: 287
		this.field1219 = -1; // L: 288
		this.field1220 = -1; // L: 289
		this.field1221 = -1; // L: 290
	} // L: 291

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "-19"
	)
	public static void method2413(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 43
			int var4 = (var3 + var2) / 2; // L: 44
			int var5 = var2; // L: 45
			String var6 = var0[var4]; // L: 46
			var0[var4] = var0[var3]; // L: 47
			var0[var3] = var6; // L: 48
			int var7 = var1[var4]; // L: 49
			var1[var4] = var1[var3]; // L: 50
			var1[var3] = var7; // L: 51

			for (int var8 = var2; var8 < var3; ++var8) { // L: 52
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 53
					String var9 = var0[var8]; // L: 54
					var0[var8] = var0[var5]; // L: 55
					var0[var5] = var9; // L: 56
					int var10 = var1[var8]; // L: 57
					var1[var8] = var1[var5]; // L: 58
					var1[var5++] = var10; // L: 59
				}
			}

			var0[var3] = var0[var5]; // L: 63
			var0[var5] = var6; // L: 64
			var1[var3] = var1[var5]; // L: 65
			var1[var5] = var7; // L: 66
			method2413(var0, var1, var2, var5 - 1); // L: 67
			method2413(var0, var1, var5 + 1, var3); // L: 68
		}

	} // L: 70

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "-4545"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1865
		Login.Login_response2 = var1; // L: 1866
		Login.Login_response3 = var2; // L: 1867
	} // L: 1868

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	static void method2418() {
		class20.field114 = System.getenv("JX_ACCESS_TOKEN"); // L: 922
		Script.field1003 = System.getenv("JX_REFRESH_TOKEN"); // L: 923
		class11.field65 = System.getenv("JX_SESSION_ID"); // L: 924
		Login.field960 = System.getenv("JX_CHARACTER_ID"); // L: 925
		String var0 = System.getenv("JX_DISPLAY_NAME"); // L: 926
		String var1;
		if (var0 != null && !var0.isEmpty() && var0.charAt(0) != '#') { // L: 930
			var1 = var0; // L: 934
		} else {
			var1 = ""; // L: 931
		}

		Login.field940 = var1; // L: 936
	} // L: 938

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-2105376256"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4690
			byte var2 = 4; // L: 4691
			int var3 = var2 + 6; // L: 4692
			int var4 = var2 + 6; // L: 4693
			int var5 = class113.fontPlain12.lineWidth(var0, 250); // L: 4694
			int var6 = class113.fontPlain12.lineCount(var0, 250) * 13; // L: 4695
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0); // L: 4696
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215); // L: 4697
			class113.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4698
			Skeleton.method4553(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6); // L: 4699
			if (var1) { // L: 4700
				class156.rasterProvider.drawFull(0, 0); // L: 4701
			} else {
				int var7 = var3; // L: 4704
				int var8 = var4; // L: 4705
				int var9 = var5; // L: 4706
				int var10 = var6; // L: 4707

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4709
					if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 4710
						Client.field735[var11] = true;
					}
				}
			}

		}
	} // L: 4714

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Ldn;ZI)V",
		garbageValue = "1063629203"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12444
		int var3 = (int)var0.key; // L: 12445
		var0.remove(); // L: 12446
		if (var1 && var2 != -1 && Widget.Widget_loadedInterfaces[var2]) { // L: 12447 12448 12449
			ArchiveLoader.Widget_archive.clearFilesGroup(var2); // L: 12450
			if (ArchiveLoader.Widget_interfaceComponents[var2] != null) { // L: 12451
				for (int var4 = 0; var4 < ArchiveLoader.Widget_interfaceComponents[var2].length; ++var4) { // L: 12452
					if (ArchiveLoader.Widget_interfaceComponents[var2][var4] != null) { // L: 12453
						ArchiveLoader.Widget_interfaceComponents[var2][var4] = null; // L: 12454
					}
				}

				ArchiveLoader.Widget_interfaceComponents[var2] = null; // L: 12457
				Widget.Widget_loadedInterfaces[var2] = false; // L: 12458
			}
		}

		for (IntegerNode var5 = (IntegerNode)Client.widgetFlags.first(); var5 != null; var5 = (IntegerNode)Client.widgetFlags.next()) { // L: 12461
			if ((var5.key >> 48 & 65535L) == (long)var2) { // L: 12462
				var5.remove(); // L: 12463
			}
		}

		Widget var6 = VarbitComposition.getWidget(var3); // L: 12467
		if (var6 != null) {
			class200.invalidateWidget(var6); // L: 12468
		}

		if (Client.rootInterface != -1) { // L: 12469
			ChatChannel.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 12470
}
