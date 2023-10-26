import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("hg")
	static String field1264;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -1997964845
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1919662235
	)
	@Export("x")
	int x;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 911384671
	)
	@Export("y")
	int y;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -588472147
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1427239535
	)
	int field1189;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 853525071
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1870832023
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 711329225
	)
	int field1192;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1955286379
	)
	int field1193;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 2142725019
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1536012287
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1590359877
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 194641425
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -956343027
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 851255097
	)
	int field1217;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 379475913
	)
	int field1202;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 533100813
	)
	int field1201;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1964851679
	)
	int field1196;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1213518445
	)
	int field1203;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1575869773
	)
	int field1219;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1610158485
	)
	int field1205;
	@ObfuscatedName("bw")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ce")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("cu")
	boolean field1246;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -446384933
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -45531341
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1181300791
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("cg")
	int[] field1194;
	@ObfuscatedName("cy")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cz")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cp")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cb")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cn")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("ck")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1482943907
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cm")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -2028645779
	)
	int field1223;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1257229145
	)
	int field1224;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 192715273
	)
	int field1225;
	@ObfuscatedName("cx")
	boolean field1240;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1254111705
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1652738685
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1922167537
	)
	int field1229;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 83237739
	)
	int field1230;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1375718357
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1585646031
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1449210549
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -850382141
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1090369209
	)
	int field1235;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	IterableNodeHashTable field1236;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 68470013
	)
	int field1237;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 172762721
	)
	int field1238;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 905960377
	)
	int field1239;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1850051391
	)
	int field1185;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -469844753
	)
	int field1204;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1043406851
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1475992005
	)
	int field1243;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -518788005
	)
	int field1254;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1543236747
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1697854741
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -996539833
	)
	int field1247;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 566294173
	)
	int field1248;
	@ObfuscatedName("du")
	byte field1249;
	@ObfuscatedName("dr")
	byte field1250;
	@ObfuscatedName("dw")
	byte field1251;
	@ObfuscatedName("di")
	byte field1252;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1377423675
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 487721571
	)
	int field1212;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1597837779
	)
	int field1216;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 609746431
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dc")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("da")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	@Export("pathTraversed")
	class231[] pathTraversed;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 162940213
	)
	int field1233;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1502128755
	)
	int field1261;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = -893205417
	)
	int field1262;

	Actor() {
		this.isWalking = false;
		this.field1189 = 1;
		this.idleSequence = -1;
		this.field1192 = -1;
		this.field1193 = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1217 = -1;
		this.field1202 = -1;
		this.field1201 = -1;
		this.field1196 = -1;
		this.field1203 = -1;
		this.field1219 = -1;
		this.field1205 = -1;
		this.overheadText = null;
		this.field1246 = false;
		this.overheadTextCyclesRemaining = 100;
		this.overheadTextColor = 0;
		this.overheadTextEffect = 0;
		this.field1194 = null; // L: 42
		this.hitSplatCount = 0; // L: 44
		this.hitSplatTypes = new int[4]; // L: 45
		this.hitSplatValues = new int[4]; // L: 46
		this.hitSplatCycles = new int[4]; // L: 47
		this.hitSplatTypes2 = new int[4]; // L: 48
		this.hitSplatValues2 = new int[4]; // L: 49
		this.healthBars = new IterableNodeDeque(); // L: 50
		this.targetIndex = -1; // L: 51
		this.false0 = false; // L: 52
		this.field1223 = -1; // L: 53
		this.field1224 = -1; // L: 54
		this.field1225 = -1; // L: 55
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.field1229 = 0; // L: 59
		this.field1230 = 0; // L: 60
		this.sequence = -1; // L: 61
		this.sequenceFrame = 0; // L: 62
		this.sequenceFrameCycle = 0; // L: 63
		this.sequenceDelay = 0; // L: 64
		this.field1235 = 0; // L: 65
		this.field1236 = new IterableNodeHashTable(4); // L: 66
		this.field1237 = 0; // L: 67
		this.npcCycle = 0; // L: 75
		this.defaultHeight = 200; // L: 76
		this.field1247 = -1; // L: 77
		this.field1248 = -1; // L: 78
		this.field1212 = 0; // L: 84
		this.field1216 = 32; // L: 85
		this.pathLength = 0; // L: 86
		this.pathX = new int[10]; // L: 87
		this.pathY = new int[10]; // L: 88
		this.pathTraversed = new class231[10]; // L: 89
		this.field1233 = 0; // L: 90
		this.field1261 = 0; // L: 91
		this.field1262 = -1; // L: 92
	} // L: 94

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 102
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "188506301"
	)
	final void method2421() {
		this.pathLength = 0; // L: 97
		this.field1261 = 0; // L: 98
	} // L: 99

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2011213643"
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
			HitSplatDefinition var12 = class191.method3627(var1); // L: 116
			var10 = var12.field2177; // L: 117
			var11 = var12.field2175; // L: 118
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "555870749"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = DefaultsGroup.method8264(var1); // L: 162
		HealthBar var8 = null; // L: 163
		HealthBar var9 = null; // L: 164
		int var10 = var7.int2; // L: 165
		int var11 = 0; // L: 166

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 167
			++var11; // L: 168
			if (var12.definition.field1982 == var7.field1982) { // L: 169
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

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1727929675"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = DefaultsGroup.method8264(var1); // L: 188

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) { // L: 189
			if (var2 == var3.definition) { // L: 190
				var3.remove(); // L: 191
				return; // L: 192
			}
		}

	} // L: 195

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1528136211"
	)
	void method2426(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 198
		class551 var6 = (class551)this.field1236.get((long)var1); // L: 199
		if (var6 != null) { // L: 200
			var6.remove(); // L: 201
			--this.field1237; // L: 202
		}

		if (var2 != 65535 && var2 != -1) { // L: 204
			byte var7 = 0; // L: 207
			if (var4 > 0) { // L: 208
				var7 = -1; // L: 209
			}

			this.field1236.put(new class551(var2, var3, var5, var7), (long)var1); // L: 211
			++this.field1237; // L: 212
		}
	} // L: 205 213

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)Ltp;",
		garbageValue = "-113"
	)
	IterableNodeHashTable method2425() {
		return this.field1236; // L: 216
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "106644167"
	)
	void method2434() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1236); // L: 220

		for (class551 var2 = (class551)var1.method8861(); var2 != null; var2 = (class551)var1.next()) { // L: 221
			var2.remove(); // L: 222
		}

		this.field1237 = 0; // L: 224
	} // L: 225

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljn;B)Ljn;",
		garbageValue = "5"
	)
	Model method2448(Model var1) {
		if (this.field1237 == 0) { // L: 228
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1236); // L: 229
			int var3 = var1.verticesCount; // L: 230
			int var4 = var1.indicesCount; // L: 231
			int var5 = var1.field2747; // L: 232
			byte var6 = var1.field2746; // L: 233

			for (class551 var7 = (class551)var2.method8861(); var7 != null; var7 = (class551)var2.next()) { // L: 234
				if (var7.field5280 != -1) { // L: 235
					Model var8 = class406.SpotAnimationDefinition_get(var7.field5281).method3863(); // L: 236
					if (var8 != null) { // L: 237
						var3 += var8.verticesCount; // L: 238
						var4 += var8.indicesCount; // L: 239
						var5 += var8.field2747; // L: 240
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 242
			var10.method4904(var1); // L: 243

			for (class551 var11 = (class551)var2.method8861(); var11 != null; var11 = (class551)var2.next()) { // L: 244
				if (var11.field5280 != -1) { // L: 245
					Model var9 = class406.SpotAnimationDefinition_get(var11.field5281).getModel(var11.field5280); // L: 246
					if (var9 != null) { // L: 247
						var9.offsetBy(0, -var11.field5283, 0); // L: 248
						var10.method4904(var9); // L: 249
					}
				}
			}

			return var10; // L: 251
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-57"
	)
	void method2430() {
		this.field1240 = false; // L: 255
		this.field1223 = -1; // L: 256
		this.field1224 = -1; // L: 257
		this.field1225 = -1; // L: 258
	} // L: 259

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "-1751998077"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111; // L: 26
		} else if (var0 == 8217) { // L: 27
			var1 = -110;
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1768262837"
	)
	public static void method2456() {
		StructComposition.StructDefinition_cached.clear(); // L: 57
	} // L: 58
}
