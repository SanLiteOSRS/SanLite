import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("df")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -566542991
	)
	@Export("x")
	int x;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -119015489
	)
	@Export("y")
	int y;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1115978189
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 328670719
	)
	int field1198;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -708453853
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1507626977
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1755887541
	)
	int field1191;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1720527121
	)
	int field1207;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 403226013
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -989384247
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -2049900857
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -670575641
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 273209973
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 388785657
	)
	int field1185;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2004441427
	)
	int field1186;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 660078083
	)
	int field1233;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1801934665
	)
	int field1188;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -586042643
	)
	int field1189;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1911959473
	)
	int field1190;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1857432021
	)
	int field1239;
	@ObfuscatedName("bq")
	String field1225;
	@ObfuscatedName("cf")
	boolean field1206;
	@ObfuscatedName("cg")
	boolean field1174;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 2129131609
	)
	int field1195;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 788736699
	)
	int field1196;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1899316695
	)
	int field1197;
	@ObfuscatedName("ce")
	int[] field1236;
	@ObfuscatedName("ct")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cw")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cl")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cs")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("co")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 2050397061
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cr")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -402115953
	)
	int field1208;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1781317999
	)
	int field1178;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1627124457
	)
	int field1210;
	@ObfuscatedName("cu")
	boolean field1211;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 320895825
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 914542215
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1781899867
	)
	int field1214;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1428922331
	)
	int field1248;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -760216869
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1935303951
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1840118521
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -945394067
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 2089660561
	)
	int field1199;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	IterableNodeHashTable field1221;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1707756343
	)
	int field1216;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 199035841
	)
	int field1209;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 1567601611
	)
	int field1224;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -2005383469
	)
	int field1194;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -66691109
	)
	int field1203;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -104636043
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -886385083
	)
	int field1187;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1723230919
	)
	int field1229;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1534078943
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 28818581
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 2141692895
	)
	int field1232;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 2117888191
	)
	int field1215;
	@ObfuscatedName("dp")
	byte field1234;
	@ObfuscatedName("df")
	byte field1235;
	@ObfuscatedName("dv")
	byte field1171;
	@ObfuscatedName("dz")
	byte field1237;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1089128167
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1697894425
	)
	int field1192;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1330672397
	)
	int field1240;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1742381503
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dj")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dy")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "[Liz;"
	)
	@Export("pathTraversed")
	class228[] pathTraversed;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -107205191
	)
	int field1245;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 1253684241
	)
	int field1220;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -375551905
	)
	int field1247;

	Actor() {
		this.isWalking = false; // L: 18
		this.field1198 = 1; // L: 19
		this.idleSequence = -1; // L: 21
		this.field1191 = -1; // L: 22
		this.field1207 = -1; // L: 23
		this.walkSequence = -1; // L: 24
		this.walkBackSequence = -1; // L: 25
		this.walkLeftSequence = -1; // L: 26
		this.walkRightSequence = -1; // L: 27
		this.runSequence = -1; // L: 28
		this.field1185 = -1; // L: 29
		this.field1186 = -1; // L: 30
		this.field1233 = -1; // L: 31
		this.field1188 = -1; // L: 32
		this.field1189 = -1; // L: 33
		this.field1190 = -1; // L: 34
		this.field1239 = -1; // L: 35
		this.field1225 = null; // L: 36
		this.field1174 = false; // L: 38
		this.field1195 = 100; // L: 39
		this.field1196 = 0; // L: 40
		this.field1197 = 0; // L: 41
		this.field1236 = null; // L: 42
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
		this.field1178 = -1; // L: 54
		this.field1210 = -1; // L: 55
		this.movementSequence = -1; // L: 57
		this.movementFrame = 0; // L: 58
		this.field1214 = 0; // L: 59
		this.field1248 = 0; // L: 60
		this.sequence = -1; // L: 61
		this.sequenceFrame = 0; // L: 62
		this.sequenceFrameCycle = 0; // L: 63
		this.sequenceDelay = 0; // L: 64
		this.field1199 = 0; // L: 65
		this.field1221 = new IterableNodeHashTable(4); // L: 66
		this.field1216 = 0; // L: 67
		this.npcCycle = 0; // L: 75
		this.defaultHeight = 200; // L: 76
		this.field1232 = -1; // L: 77
		this.field1215 = -1; // L: 78
		this.field1192 = 0; // L: 84
		this.field1240 = 32; // L: 85
		this.pathLength = 0; // L: 86
		this.pathX = new int[10]; // L: 87
		this.pathY = new int[10]; // L: 88
		this.pathTraversed = new class228[10]; // L: 89
		this.field1245 = 0; // L: 90
		this.field1220 = 0; // L: 91
		this.field1247 = -1; // L: 92
	} // L: 94

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1221291483"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 102
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "585669071"
	)
	final void method2461() {
		this.pathLength = 0; // L: 97
		this.field1220 = 0; // L: 98
	} // L: 99

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "31"
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
			HitSplatDefinition var12 = class149.method3275(var1); // L: 116
			var10 = var12.field2069; // L: 117
			var11 = var12.field2060; // L: 118
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-2108984921"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class92.method2445(var1); // L: 162
		HealthBar var8 = null; // L: 163
		HealthBar var9 = null; // L: 164
		int var10 = var7.int2; // L: 165
		int var11 = 0; // L: 166

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) { // L: 167
			++var11; // L: 168
			if (var12.definition.field1870 == var7.field1870) { // L: 169
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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-875440561"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class92.method2445(var1); // L: 188

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
		garbageValue = "-702211426"
	)
	void method2466(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 198
		class548 var6 = (class548)this.field1221.get((long)var1); // L: 199
		if (var6 != null) { // L: 200
			var6.remove(); // L: 201
			--this.field1216; // L: 202
		}

		if (var2 != 65535 && var2 != -1) { // L: 204
			byte var7 = 0; // L: 207
			if (var4 > 0) { // L: 208
				var7 = -1; // L: 209
			}

			this.field1221.put(new class548(var2, var3, var5, var7), (long)var1); // L: 211
			++this.field1216; // L: 212
		}
	} // L: 205 213

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)Ltz;",
		garbageValue = "-1"
	)
	IterableNodeHashTable method2467() {
		return this.field1221; // L: 216
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	void method2491() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1221); // L: 220

		for (class548 var2 = (class548)var1.method8937(); var2 != null; var2 = (class548)var1.next()) { // L: 221
			var2.remove(); // L: 222
		}

		this.field1216 = 0; // L: 224
	} // L: 225

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lka;I)Lka;",
		garbageValue = "-1145530728"
	)
	Model method2469(Model var1) {
		if (this.field1216 == 0) { // L: 228
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1221); // L: 229
			int var3 = var1.verticesCount; // L: 230
			int var4 = var1.indicesCount; // L: 231
			int var5 = var1.field2952; // L: 232
			byte var6 = var1.field2951; // L: 233

			for (class548 var7 = (class548)var2.method8937(); var7 != null; var7 = (class548)var2.next()) { // L: 234
				if (var7.field5289 != -1) { // L: 235
					Model var8 = Canvas.SpotAnimationDefinition_get(var7.field5287).method3766(); // L: 236
					if (var8 != null) { // L: 237
						var3 += var8.verticesCount; // L: 238
						var4 += var8.indicesCount; // L: 239
						var5 += var8.field2952; // L: 240
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 242
			var10.method5644(var1); // L: 243

			for (class548 var11 = (class548)var2.method8937(); var11 != null; var11 = (class548)var2.next()) { // L: 244
				if (var11.field5289 != -1) { // L: 245
					Model var9 = Canvas.SpotAnimationDefinition_get(var11.field5287).getModel(var11.field5289); // L: 246
					if (var9 != null) { // L: 247
						var9.offsetBy(0, -var11.field5288, 0); // L: 248
						var10.method5644(var9); // L: 249
					}
				}
			}

			return var10; // L: 251
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2480() {
		this.field1211 = false; // L: 255
		this.field1208 = -1; // L: 256
		this.field1178 = -1; // L: 257
		this.field1210 = -1; // L: 258
	} // L: 259

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbm;Lpf;Lpf;I)V",
		garbageValue = "1431524852"
	)
	static void method2496(GameEngine var0, Font var1, Font var2) {
		int var6;
		int var78;
		int var79;
		boolean var93;
		if (Login.worldSelectOpen) { // L: 338
			class223 var76 = Client.field724; // L: 342
			class223 var4 = var76; // L: 344

			while (true) {
				if (!var4.method4324()) { // L: 345
					if (MouseHandler.MouseHandler_lastButton != 1 && (class19.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) { // L: 366
						break;
					}

					int var77 = Login.xPadding + 280; // L: 367
					if (MouseHandler.MouseHandler_lastPressedX >= var77 && MouseHandler.MouseHandler_lastPressedX <= var77 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 368
						VarcInt.changeWorldSelectSorting(0, 0); // L: 369
						break; // L: 370
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var77 + 15 && MouseHandler.MouseHandler_lastPressedX <= var77 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 372
						VarcInt.changeWorldSelectSorting(0, 1); // L: 373
						break; // L: 374
					}

					var6 = Login.xPadding + 390; // L: 376
					if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 377
						VarcInt.changeWorldSelectSorting(1, 0); // L: 378
						break; // L: 379
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 381
						VarcInt.changeWorldSelectSorting(1, 1); // L: 382
						break; // L: 383
					}

					var78 = Login.xPadding + 500; // L: 385
					if (MouseHandler.MouseHandler_lastPressedX >= var78 && MouseHandler.MouseHandler_lastPressedX <= var78 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 386
						VarcInt.changeWorldSelectSorting(2, 0); // L: 387
						break; // L: 388
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var78 + 15 && MouseHandler.MouseHandler_lastPressedX <= var78 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 390
						VarcInt.changeWorldSelectSorting(2, 1); // L: 391
						break; // L: 392
					}

					var79 = Login.xPadding + 610; // L: 394
					if (MouseHandler.MouseHandler_lastPressedX >= var79 && MouseHandler.MouseHandler_lastPressedX <= var79 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 395
						VarcInt.changeWorldSelectSorting(3, 0); // L: 396
						break; // L: 397
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var79 + 15 && MouseHandler.MouseHandler_lastPressedX <= var79 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) { // L: 399
						VarcInt.changeWorldSelectSorting(3, 1); // L: 400
						break; // L: 401
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) { // L: 403
						Login.worldSelectOpen = false; // L: 405
						class250.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 406
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 407
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 408
						break; // L: 410
					}

					if (Login.hoveredWorldIndex != -1) { // L: 412
						World var80 = class361.World_worlds[Login.hoveredWorldIndex]; // L: 413
						if (var80.isDeadman()) { // L: 414
							var80.field808 = "beta"; // L: 415
						}

						boolean var10 = false; // L: 417
						if (var80.properties != Client.worldProperties) { // L: 418
							var93 = (Client.worldProperties & class522.field5109.rsOrdinal()) != 0; // L: 419
							boolean var94 = var80.isDeadman(); // L: 420
							if (var93 && !var94 || !var93 && var94) { // L: 421
								var10 = true; // L: 422
							}
						}

						KeyHandler.changeWorld(var80); // L: 425
						Login.worldSelectOpen = false; // L: 427
						class250.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 428
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 429
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 430
						if (var10) { // L: 432
							ByteArrayPool.method7920(); // L: 433
						}
					} else {
						if (Login.worldSelectPage > 0 && Varps.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= Varps.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class47.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class47.canvasHeight / 2 + 50) { // L: 437
							--Login.worldSelectPage; // L: 438
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class105.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= Language.canvasWidth - class105.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= Language.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class47.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class47.canvasHeight / 2 + 50) { // L: 440
							++Login.worldSelectPage; // L: 441
						}
					}
					break;
				}

				if (var4.field2360 == 13) { // L: 346
					Login.worldSelectOpen = false; // L: 348
					class250.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 349
					Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 350
					Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 351
					break; // L: 353
				}

				if (var4.field2360 == 96) { // L: 355
					if (Login.worldSelectPage > 0 && Varps.worldSelectLeftSprite != null) { // L: 356
						--Login.worldSelectPage; // L: 357
					}
				} else if (var4.field2360 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class105.worldSelectRightSprite != null) { // L: 360 361
					++Login.worldSelectPage; // L: 362
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) { // L: 447
				WorldMapIcon_1.clientPreferences.method2571(!WorldMapIcon_1.clientPreferences.method2631()); // L: 448
				if (!WorldMapIcon_1.clientPreferences.method2631()) { // L: 449
					ArrayList var3 = new ArrayList(); // L: 450
					var3.add(new class328(class514.field5059, "scape main", "", 255, false)); // L: 451
					PendingSpawn.method2459(var3, 0, 0, 0, 100, false); // L: 452
				} else {
					WorldMapManager.method4769(0, 0); // L: 454
				}

				class472.method8564(); // L: 455
			}

			if (Client.gameState != 5) { // L: 457
				if (-1L == Login.field928) { // L: 458
					Login.field928 = SpotAnimationDefinition.method3775() + 1000L; // L: 459
				}

				long var37 = SpotAnimationDefinition.method3775(); // L: 461
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 464
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) { // L: 468
							var5 = true; // L: 476
							break;
						}

						ArchiveLoader var39 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 469
						if (!var39.isLoaded()) { // L: 470
							var5 = false; // L: 471
							break; // L: 472
						}

						++Client.archiveLoadersDone; // L: 474
					}
				} else {
					var5 = true; // L: 465
				}

				if (var5 && Login.field906 == -1L) { // L: 478 479
					Login.field906 = var37; // L: 480
					if (Login.field906 > Login.field928) { // L: 481
						Login.field928 = Login.field906; // L: 482
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) { // L: 486
					if (class85.clientLanguage == Language.Language_EN) { // L: 487
						if (MouseHandler.MouseHandler_lastButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_lastButton == 4) { // L: 488
							var6 = Login.xPadding + 5; // L: 489
							short var7 = 463; // L: 490
							byte var8 = 100; // L: 491
							byte var40 = 35; // L: 492
							if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + var8 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var40) { // L: 493
								if (class241.loadWorlds()) { // L: 495
									Login.worldSelectOpen = true; // L: 496
									Login.worldSelectPage = 0; // L: 497
									Login.worldSelectPagesCount = 0; // L: 498
								}

								return; // L: 501
							}
						}

						if (class542.World_request != null && class241.loadWorlds()) { // L: 504 505
							Login.worldSelectOpen = true; // L: 506
							Login.worldSelectPage = 0; // L: 507
							Login.worldSelectPagesCount = 0; // L: 508
						}
					}

					var6 = MouseHandler.MouseHandler_lastButton; // L: 512
					var78 = MouseHandler.MouseHandler_lastPressedX; // L: 513
					var79 = MouseHandler.MouseHandler_lastPressedY; // L: 514
					if (var6 == 0) { // L: 515
						var78 = MouseHandler.MouseHandler_x; // L: 516
						var79 = MouseHandler.MouseHandler_y; // L: 517
					}

					if (!class19.mouseCam && var6 == 4) { // L: 519
						var6 = 1;
					}

					class223 var9 = Client.field724; // L: 522
					class223 var41 = var9; // L: 524
					short var82;
					int var83;
					if (Login.loginIndex == 0) { // L: 525
						var93 = false; // L: 526

						while (var41.method4324()) { // L: 527
							if (var41.field2360 == 84) { // L: 528
								var93 = true; // L: 529
							}
						}

						var83 = class157.loginBoxCenter - 80; // L: 532
						var82 = 291; // L: 533
						if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20) { // L: 534
							HealthBar.openURL(WorldMapID.method4938("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false); // L: 535
						}

						var83 = class157.loginBoxCenter + 80; // L: 537
						if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20 || var93) { // L: 538
							if ((Client.worldProperties & class522.field5111.rsOrdinal()) != 0) { // L: 540
								Login.Login_response0 = ""; // L: 541
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 542
								Login.Login_response2 = "Your normal account will not be affected."; // L: 543
								Login.Login_response3 = ""; // L: 544
								UserComparator7.method2966(1); // L: 545
								class150.method3281(); // L: 546
							} else if ((Client.worldProperties & class522.field5095.rsOrdinal()) != 0) { // L: 548
								if ((Client.worldProperties & class522.field5103.rsOrdinal()) != 0) { // L: 549
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 550
									Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 551
									Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 552
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 555
									Login.Login_response2 = "Players can attack each other"; // L: 556
									Login.Login_response3 = "almost everywhere."; // L: 557
								}

								Login.Login_response0 = "Warning!"; // L: 559
								UserComparator7.method2966(1); // L: 560
								class150.method3281(); // L: 561
							} else if ((Client.worldProperties & class522.field5103.rsOrdinal()) != 0) { // L: 563
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 564
								Login.Login_response2 = "The Protect Item prayer will"; // L: 565
								Login.Login_response3 = "not work on this world."; // L: 566
								Login.Login_response0 = "Warning!"; // L: 567
								UserComparator7.method2966(1); // L: 568
								class150.method3281(); // L: 569
							} else {
								SoundSystem.Login_promptCredentials(false); // L: 572
							}
						}
					} else {
						int var11;
						short var12;
						if (Login.loginIndex == 1) { // L: 577
							while (true) {
								if (!var41.method4324()) { // L: 578
									var11 = class157.loginBoxCenter - 80; // L: 586
									var12 = 321; // L: 587
									if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 588
										SoundSystem.Login_promptCredentials(false); // L: 589
									}

									var11 = class157.loginBoxCenter + 80; // L: 591
									if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 592
										UserComparator7.method2966(0); // L: 593
									}
									break;
								}

								if (var41.field2360 == 84) { // L: 579
									SoundSystem.Login_promptCredentials(false); // L: 580
								} else if (var41.field2360 == 13) { // L: 582
									UserComparator7.method2966(0); // L: 583
								}
							}
						} else {
							int var15;
							short var81;
							if (Login.loginIndex == 2) { // L: 596
								var81 = 201; // L: 597
								var11 = var81 + 52; // L: 598
								if (var6 == 1 && var79 >= var11 - 12 && var79 < var11 + 2) { // L: 599
									Login.currentLoginField = 0;
								}

								var11 += 15; // L: 600
								if (var6 == 1 && var79 >= var11 - 12 && var79 < var11 + 2) { // L: 601
									Login.currentLoginField = 1;
								}

								var11 += 15; // L: 602
								var81 = 361; // L: 603
								if (Login.field918 != null) { // L: 604
									var83 = Login.field918.highX / 2; // L: 605
									if (var6 == 1 && var78 >= Login.field918.lowX - var83 && var78 <= var83 + Login.field918.lowX && var79 >= var81 - 15 && var79 < var81) { // L: 606
										switch(Login.field931) { // L: 607
										case 1:
											HealthBar.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 615
											return; // L: 616
										case 2:
											HealthBar.openURL("https://support.runescape.com/hc/en-gb", true, false); // L: 610
										}
									}
								}

								var83 = class157.loginBoxCenter - 80; // L: 621
								var82 = 321; // L: 622
								if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20) { // L: 623
									class478.method8609(); // L: 624
									return; // L: 625
								}

								var83 = Login.loginBoxX + 180 + 80; // L: 627
								if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20) { // L: 628
									UserComparator7.method2966(0); // L: 629
									Login.Login_username = ""; // L: 630
									Login.Login_password = ""; // L: 631
									class53.field350 = 0; // L: 632
									class187.otp = ""; // L: 633
									Login.field920 = true; // L: 634
								}

								var83 = class157.loginBoxCenter + -117; // L: 636
								var82 = 277; // L: 637
								Login.field916 = var78 >= var83 && var78 < var83 + NPCComposition.field1966 && var79 >= var82 && var79 < var82 + class113.field1426; // L: 638
								if (var6 == 1 && Login.field916) { // L: 639
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered; // L: 640
									if (!Client.Login_isUsernameRemembered && WorldMapIcon_1.clientPreferences.method2593() != null) { // L: 641
										WorldMapIcon_1.clientPreferences.method2586((String)null); // L: 642
									}
								}

								var83 = class157.loginBoxCenter + 24; // L: 645
								var82 = 277; // L: 646
								Login.field919 = var78 >= var83 && var78 < var83 + NPCComposition.field1966 && var79 >= var82 && var79 < var82 + class113.field1426; // L: 647
								if (var6 == 1 && Login.field919) { // L: 648
									WorldMapIcon_1.clientPreferences.method2583(!WorldMapIcon_1.clientPreferences.method2543()); // L: 649
									if (!WorldMapIcon_1.clientPreferences.method2543()) { // L: 650
										Login.Login_username = ""; // L: 651
										WorldMapIcon_1.clientPreferences.method2586((String)null); // L: 652
										class150.method3281(); // L: 653
									}
								}

								while (true) {
									int var88;
									Transferable var104;
									do {
										while (true) {
											label1776:
											do {
												while (true) {
													while (var41.method4324()) { // L: 656
														if (var41.field2360 != 13) { // L: 657
															if (Login.currentLoginField != 0) { // L: 666
																continue label1776;
															}

															char var87 = var41.field2363; // L: 667

															for (var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var87 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15); ++var15) { // L: 669 670
															}

															if (var41.field2360 == 85 && Login.Login_username.length() > 0) { // L: 673
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var41.field2360 == 84 || var41.field2360 == 80) { // L: 674
																Login.currentLoginField = 1;
															}

															if (WorldMapScaleHandler.method5058(var41.field2363) && Login.Login_username.length() < 320) { // L: 675
																Login.Login_username = Login.Login_username + var41.field2363;
															}
														} else {
															UserComparator7.method2966(0); // L: 658
															Login.Login_username = ""; // L: 659
															Login.Login_password = ""; // L: 660
															class53.field350 = 0; // L: 661
															class187.otp = ""; // L: 662
															Login.field920 = true; // L: 663
														}
													}

													return; // L: 1417
												}
											} while(Login.currentLoginField != 1); // L: 677

											if (var41.field2360 == 85 && Login.Login_password.length() > 0) { // L: 678
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1); // L: 679
											} else if (var41.field2360 == 84 || var41.field2360 == 80) { // L: 681
												Login.currentLoginField = 0; // L: 682
												if (var41.field2360 == 84) { // L: 683
													Login.Login_username = Login.Login_username.trim(); // L: 684
													if (Login.Login_username.length() == 0) { // L: 685
														class139.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 686
														return; // L: 687
													}

													if (Login.Login_password.length() == 0) { // L: 689
														class139.setLoginResponseString("", "Please enter your password.", ""); // L: 690
														return; // L: 691
													}

													class139.setLoginResponseString("", "Connecting to server...", ""); // L: 693
													VerticalAlignment.method3754(false); // L: 694
													WorldMapSection2.method4516(20); // L: 695
													return; // L: 696
												}
											}

											if ((var41.method4316(82) || var41.method4316(87)) && var41.field2360 == 67) { // L: 699
												Clipboard var103 = Toolkit.getDefaultToolkit().getSystemClipboard(); // L: 700
												var104 = var103.getContents(SpriteMask.client); // L: 701
												var88 = 20 - Login.Login_password.length(); // L: 702
												break;
											}

											if (DirectByteArrayCopier.method6830(var41.field2363) && WorldMapScaleHandler.method5058(var41.field2363) && Login.Login_password.length() < 20) { // L: 719
												Login.Login_password = Login.Login_password + var41.field2363; // L: 720
											}
										}
									} while(var88 <= 0); // L: 703

									try {
										String var89 = (String)var104.getTransferData(DataFlavor.stringFlavor); // L: 705
										int var92 = Math.min(var88, var89.length()); // L: 706

										for (int var19 = 0; var19 < var92; ++var19) { // L: 707
											if (!DirectByteArrayCopier.method6830(var89.charAt(var19)) || !WorldMapScaleHandler.method5058(var89.charAt(var19))) { // L: 708
												UserComparator7.method2966(3); // L: 709
												return; // L: 710
											}
										}

										Login.Login_password = Login.Login_password + var89.substring(0, var92); // L: 713
									} catch (UnsupportedFlavorException var74) { // L: 715
									} catch (IOException var75) { // L: 716
									}
								}
							} else {
								Bounds var44;
								if (Login.loginIndex == 3) { // L: 726
									var11 = Login.loginBoxX + 180; // L: 727
									var12 = 241; // L: 728
									var44 = var1.method7668(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var11, var12); // L: 729
									if (var6 == 1 && var44.method8373(var78, var79)) { // L: 730
										HealthBar.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 731
									}

									var11 = Login.loginBoxX + 180; // L: 733
									var12 = 276; // L: 734
									if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 735
										ClientPreferences.method2645(false); // L: 736
									}

									var11 = Login.loginBoxX + 180; // L: 738
									var12 = 326; // L: 739
									if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 740
										HealthBar.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 741
										return; // L: 742
									}
								} else {
									int var14;
									if (Login.loginIndex == 4) { // L: 745
										var11 = Login.loginBoxX + 180 - 80; // L: 746
										var12 = 321; // L: 747
										if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 748
											class187.otp.trim(); // L: 749
											if (class187.otp.length() != 6) { // L: 750
												class139.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 751
												return; // L: 752
											}

											class53.field350 = Integer.parseInt(class187.otp); // L: 754
											class187.otp = ""; // L: 755
											VerticalAlignment.method3754(true); // L: 756
											class139.setLoginResponseString("", "Connecting to server...", ""); // L: 757
											WorldMapSection2.method4516(20); // L: 758
											return; // L: 759
										}

										if (var6 == 1 && var78 >= Login.loginBoxX + 180 - 9 && var78 <= Login.loginBoxX + 180 + 130 && var79 >= 263 && var79 <= 296) { // L: 761
											Login.field920 = !Login.field920; // L: 762
										}

										if (var6 == 1 && var78 >= Login.loginBoxX + 180 - 34 && var78 <= Login.loginBoxX + 34 + 180 && var79 >= 351 && var79 <= 363) { // L: 764
											HealthBar.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false); // L: 765
										}

										var11 = Login.loginBoxX + 180 + 80; // L: 767
										if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 768
											UserComparator7.method2966(0); // L: 769
											Login.Login_username = ""; // L: 770
											Login.Login_password = ""; // L: 771
											class53.field350 = 0; // L: 772
											class187.otp = ""; // L: 773
										}

										while (var41.method4324()) { // L: 775
											boolean var13 = false; // L: 776

											for (var14 = 0; var14 < "1234567890".length(); ++var14) { // L: 777
												if (var41.field2363 == "1234567890".charAt(var14)) { // L: 778
													var13 = true; // L: 779
													break; // L: 780
												}
											}

											if (var41.field2360 == 13) { // L: 783
												UserComparator7.method2966(0); // L: 784
												Login.Login_username = ""; // L: 785
												Login.Login_password = ""; // L: 786
												class53.field350 = 0; // L: 787
												class187.otp = ""; // L: 788
											} else {
												if (var41.field2360 == 85 && class187.otp.length() > 0) { // L: 791
													class187.otp = class187.otp.substring(0, class187.otp.length() - 1);
												}

												if (var41.field2360 == 84) { // L: 792
													class187.otp.trim(); // L: 793
													if (class187.otp.length() != 6) { // L: 794
														class139.setLoginResponseString("", "Please enter a 6-digit PIN.", ""); // L: 795
														return; // L: 796
													}

													class53.field350 = Integer.parseInt(class187.otp); // L: 798
													class187.otp = ""; // L: 799
													VerticalAlignment.method3754(true); // L: 800
													class139.setLoginResponseString("", "Connecting to server...", ""); // L: 801
													WorldMapSection2.method4516(20); // L: 802
													return; // L: 803
												}

												if (var13 && class187.otp.length() < 6) { // L: 805
													class187.otp = class187.otp + var41.field2363;
												}
											}
										}
									} else if (Login.loginIndex == 5) { // L: 809
										var11 = Login.loginBoxX + 180 - 80; // L: 810
										var12 = 321; // L: 811
										Buffer var22;
										if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 812
											Login.Login_username = Login.Login_username.trim(); // L: 814
											if (Login.Login_username.length() == 0) { // L: 815
												class139.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 816
											} else {
												long var48;
												try {
													URL var45 = new URL(WorldMapID.method4938("services", false) + "m=accountappeal/login.ws"); // L: 823
													URLConnection var17 = var45.openConnection(); // L: 824
													var17.setRequestProperty("connection", "close"); // L: 825
													var17.setDoInput(true); // L: 826
													var17.setDoOutput(true); // L: 827
													var17.setConnectTimeout(5000); // L: 828
													OutputStreamWriter var106 = new OutputStreamWriter(var17.getOutputStream()); // L: 829
													var106.write("data1=req"); // L: 830
													var106.flush(); // L: 831
													InputStream var107 = var17.getInputStream(); // L: 832
													Buffer var90 = new Buffer(new byte[1000]); // L: 833

													while (true) {
														int var21 = var107.read(var90.array, var90.offset, 1000 - var90.offset); // L: 835
														if (var21 == -1) { // L: 836
															var90.offset = 0; // L: 843
															long var50 = var90.readLong(); // L: 844
															var48 = var50; // L: 845
															break;
														}

														var90.offset += var21; // L: 837
														if (var90.offset >= 1000) { // L: 838
															var48 = 0L; // L: 839
															break;
														}
													}
												} catch (Exception var70) { // L: 847
													var48 = 0L; // L: 848
												}

												byte var84;
												if (var48 == 0L) { // L: 852
													var84 = 5;
												} else {
													String var108 = Login.Login_username; // L: 855
													Random var91 = new Random(); // L: 857
													Buffer var110 = new Buffer(128); // L: 858
													var22 = new Buffer(128); // L: 859
													int[] var96 = new int[]{var91.nextInt(), var91.nextInt(), (int)(var48 >> 32), (int)var48}; // L: 860 861 862 863 864
													var110.writeByte(10); // L: 865

													int var24;
													for (var24 = 0; var24 < 4; ++var24) { // L: 866
														var110.writeInt(var91.nextInt()); // L: 867
													}

													var110.writeInt(var96[0]); // L: 869
													var110.writeInt(var96[1]); // L: 870
													var110.writeLong(var48); // L: 871
													var110.writeLong(0L); // L: 872

													for (var24 = 0; var24 < 4; ++var24) { // L: 873
														var110.writeInt(var91.nextInt()); // L: 874
													}

													var110.encryptRsa(class72.field870, class72.field871); // L: 876
													var22.writeByte(10); // L: 877

													for (var24 = 0; var24 < 3; ++var24) { // L: 878
														var22.writeInt(var91.nextInt()); // L: 879
													}

													var22.writeLong(var91.nextLong()); // L: 881
													var22.method9247(var91.nextLong()); // L: 882
													class354.method6858(var22); // L: 883
													var22.writeLong(var91.nextLong()); // L: 884
													var22.encryptRsa(class72.field870, class72.field871); // L: 885
													var24 = ClanChannel.stringCp1252NullTerminatedByteSize(var108); // L: 886
													if (var24 % 8 != 0) { // L: 887
														var24 += 8 - var24 % 8;
													}

													Buffer var97 = new Buffer(var24); // L: 888
													var97.writeStringCp1252NullTerminated(var108); // L: 889
													var97.offset = var24; // L: 890
													var97.xteaEncryptAll(var96); // L: 891
													Buffer var26 = new Buffer(var22.offset + var110.offset + var97.offset + 5); // L: 892
													var26.writeByte(2); // L: 893
													var26.writeByte(var110.offset); // L: 894
													var26.writeBytes(var110.array, 0, var110.offset); // L: 895
													var26.writeByte(var22.offset); // L: 896
													var26.writeBytes(var22.array, 0, var22.offset); // L: 897
													var26.writeShort(var97.offset); // L: 898
													var26.writeBytes(var97.array, 0, var97.offset); // L: 899
													String var98 = class415.method7821(var26.array); // L: 900

													byte var18;
													try {
														URL var99 = new URL(WorldMapID.method4938("services", false) + "m=accountappeal/login.ws"); // L: 902
														URLConnection var100 = var99.openConnection(); // L: 903
														var100.setDoInput(true); // L: 904
														var100.setDoOutput(true); // L: 905
														var100.setConnectTimeout(5000); // L: 906
														OutputStreamWriter var101 = new OutputStreamWriter(var100.getOutputStream()); // L: 907
														var101.write("data2=" + WorldMapData_0.method4483(var98) + "&dest=" + WorldMapData_0.method4483("passwordchoice.ws")); // L: 908
														var101.flush(); // L: 909
														InputStream var102 = var100.getInputStream(); // L: 910
														var26 = new Buffer(new byte[1000]); // L: 911

														while (true) {
															int var32 = var102.read(var26.array, var26.offset, 1000 - var26.offset); // L: 913
															if (var32 == -1) { // L: 914
																var101.close(); // L: 921
																var102.close(); // L: 922
																String var111 = new String(var26.array); // L: 923
																if (var111.startsWith("OFFLINE")) { // L: 924
																	var18 = 4; // L: 925
																} else if (var111.startsWith("WRONG")) { // L: 928
																	var18 = 7; // L: 929
																} else if (var111.startsWith("RELOAD")) { // L: 932
																	var18 = 3; // L: 933
																} else if (var111.startsWith("Not permitted for social network accounts.")) { // L: 936
																	var18 = 6; // L: 937
																} else {
																	var26.xteaDecryptAll(var96); // L: 940

																	while (var26.offset > 0 && var26.array[var26.offset - 1] == 0) { // L: 941
																		--var26.offset; // L: 942
																	}

																	var111 = new String(var26.array, 0, var26.offset); // L: 944
																	boolean var33;
																	if (var111 == null) { // L: 947
																		var33 = false; // L: 948
																	} else {
																		label1945: {
																			try {
																				new URL(var111);
																			} catch (MalformedURLException var68) { // L: 954
																				var33 = false; // L: 955
																				break label1945; // L: 956
																			}

																			var33 = true; // L: 958
																		}
																	}

																	if (var33) { // L: 960
																		HealthBar.openURL(var111, true, false); // L: 961
																		var18 = 2; // L: 962
																	} else {
																		var18 = 5; // L: 964
																	}
																}
																break;
															}

															var26.offset += var32; // L: 915
															if (var26.offset >= 1000) { // L: 916
																var18 = 5; // L: 917
																break;
															}
														}
													} catch (Throwable var69) { // L: 966
														var69.printStackTrace(); // L: 967
														var18 = 5; // L: 968
													}

													var84 = var18; // L: 971
												}

												switch(var84) { // L: 973
												case 2:
													class139.setLoginResponseString(Strings.field4189, Strings.field4118, Strings.field4191); // L: 987
													UserComparator7.method2966(6); // L: 988
													break; // L: 989
												case 3:
													class139.setLoginResponseString("", "Error connecting to server.", ""); // L: 984
													break; // L: 985
												case 4:
													class139.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 975
													break; // L: 976
												case 5:
													class139.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 978
													break; // L: 979
												case 6:
													class139.setLoginResponseString("", "Error connecting to server.", ""); // L: 991
													break;
												case 7:
													class139.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 981
												}
											}

											return; // L: 995
										}

										var11 = Login.loginBoxX + 180 + 80; // L: 997
										if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 998
											SoundSystem.Login_promptCredentials(true); // L: 999
										}

										var82 = 361; // L: 1001
										if (class7.field21 != null) { // L: 1002
											var14 = class7.field21.highX / 2; // L: 1003
											if (var6 == 1 && var78 >= class7.field21.lowX - var14 && var78 <= var14 + class7.field21.lowX && var79 >= var82 - 15 && var79 < var82) { // L: 1004
												HealthBar.openURL(WorldMapID.method4938("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false); // L: 1005
											}
										}

										while (var41.method4324()) { // L: 1008
											boolean var85 = false; // L: 1009

											for (var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var15) { // L: 1010
												if (var41.field2363 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15)) { // L: 1011
													var85 = true; // L: 1012
													break; // L: 1013
												}
											}

											if (var41.field2360 == 13) { // L: 1016
												SoundSystem.Login_promptCredentials(true); // L: 1017
											} else {
												if (var41.field2360 == 85 && Login.Login_username.length() > 0) { // L: 1020
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var41.field2360 == 84) { // L: 1021
													Login.Login_username = Login.Login_username.trim(); // L: 1023
													if (Login.Login_username.length() == 0) { // L: 1024
														class139.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1025
													} else {
														long var52;
														try {
															URL var46 = new URL(WorldMapID.method4938("services", false) + "m=accountappeal/login.ws"); // L: 1032
															URLConnection var47 = var46.openConnection(); // L: 1033
															var47.setRequestProperty("connection", "close"); // L: 1034
															var47.setDoInput(true); // L: 1035
															var47.setDoOutput(true); // L: 1036
															var47.setConnectTimeout(5000); // L: 1037
															OutputStreamWriter var20 = new OutputStreamWriter(var47.getOutputStream()); // L: 1038
															var20.write("data1=req"); // L: 1039
															var20.flush(); // L: 1040
															InputStream var54 = var47.getInputStream(); // L: 1041
															var22 = new Buffer(new byte[1000]); // L: 1042

															while (true) {
																int var56 = var54.read(var22.array, var22.offset, 1000 - var22.offset); // L: 1044
																if (var56 == -1) { // L: 1045
																	var22.offset = 0; // L: 1052
																	long var57 = var22.readLong(); // L: 1053
																	var52 = var57; // L: 1054
																	break;
																}

																var22.offset += var56; // L: 1046
																if (var22.offset >= 1000) { // L: 1047
																	var52 = 0L; // L: 1048
																	break;
																}
															}
														} catch (Exception var73) { // L: 1056
															var52 = 0L; // L: 1057
														}

														byte var86;
														if (0L == var52) { // L: 1061
															var86 = 5;
														} else {
															String var109 = Login.Login_username; // L: 1064
															Random var95 = new Random(); // L: 1066
															Buffer var23 = new Buffer(128); // L: 1067
															Buffer var61 = new Buffer(128); // L: 1068
															int[] var25 = new int[]{var95.nextInt(), var95.nextInt(), (int)(var52 >> 32), (int)var52}; // L: 1069 1070 1071 1072 1073
															var23.writeByte(10); // L: 1074

															int var62;
															for (var62 = 0; var62 < 4; ++var62) { // L: 1075
																var23.writeInt(var95.nextInt()); // L: 1076
															}

															var23.writeInt(var25[0]); // L: 1078
															var23.writeInt(var25[1]); // L: 1079
															var23.writeLong(var52); // L: 1080
															var23.writeLong(0L); // L: 1081

															for (var62 = 0; var62 < 4; ++var62) { // L: 1082
																var23.writeInt(var95.nextInt()); // L: 1083
															}

															var23.encryptRsa(class72.field870, class72.field871); // L: 1085
															var61.writeByte(10); // L: 1086

															for (var62 = 0; var62 < 3; ++var62) { // L: 1087
																var61.writeInt(var95.nextInt()); // L: 1088
															}

															var61.writeLong(var95.nextLong()); // L: 1090
															var61.method9247(var95.nextLong()); // L: 1091
															class354.method6858(var61); // L: 1092
															var61.writeLong(var95.nextLong()); // L: 1093
															var61.encryptRsa(class72.field870, class72.field871); // L: 1094
															var62 = ClanChannel.stringCp1252NullTerminatedByteSize(var109); // L: 1095
															if (var62 % 8 != 0) { // L: 1096
																var62 += 8 - var62 % 8;
															}

															Buffer var27 = new Buffer(var62); // L: 1097
															var27.writeStringCp1252NullTerminated(var109); // L: 1098
															var27.offset = var62; // L: 1099
															var27.xteaEncryptAll(var25); // L: 1100
															Buffer var28 = new Buffer(var27.offset + var61.offset + var23.offset + 5); // L: 1101
															var28.writeByte(2); // L: 1102
															var28.writeByte(var23.offset); // L: 1103
															var28.writeBytes(var23.array, 0, var23.offset); // L: 1104
															var28.writeByte(var61.offset); // L: 1105
															var28.writeBytes(var61.array, 0, var61.offset); // L: 1106
															var28.writeShort(var27.offset); // L: 1107
															var28.writeBytes(var27.array, 0, var27.offset); // L: 1108
															String var29 = class415.method7821(var28.array); // L: 1109

															byte var65;
															try {
																URL var30 = new URL(WorldMapID.method4938("services", false) + "m=accountappeal/login.ws"); // L: 1111
																URLConnection var31 = var30.openConnection(); // L: 1112
																var31.setDoInput(true); // L: 1113
																var31.setDoOutput(true); // L: 1114
																var31.setConnectTimeout(5000); // L: 1115
																OutputStreamWriter var55 = new OutputStreamWriter(var31.getOutputStream()); // L: 1116
																var55.write("data2=" + WorldMapData_0.method4483(var29) + "&dest=" + WorldMapData_0.method4483("passwordchoice.ws")); // L: 1117
																var55.flush(); // L: 1118
																InputStream var63 = var31.getInputStream(); // L: 1119
																var28 = new Buffer(new byte[1000]); // L: 1120

																while (true) {
																	int var64 = var63.read(var28.array, var28.offset, 1000 - var28.offset); // L: 1122
																	if (var64 == -1) { // L: 1123
																		var55.close(); // L: 1130
																		var63.close(); // L: 1131
																		String var34 = new String(var28.array); // L: 1132
																		if (var34.startsWith("OFFLINE")) { // L: 1133
																			var65 = 4; // L: 1134
																		} else if (var34.startsWith("WRONG")) { // L: 1137
																			var65 = 7; // L: 1138
																		} else if (var34.startsWith("RELOAD")) { // L: 1141
																			var65 = 3; // L: 1142
																		} else if (var34.startsWith("Not permitted for social network accounts.")) { // L: 1145
																			var65 = 6; // L: 1146
																		} else {
																			var28.xteaDecryptAll(var25); // L: 1149

																			while (var28.offset > 0 && var28.array[var28.offset - 1] == 0) { // L: 1150
																				--var28.offset; // L: 1151
																			}

																			var34 = new String(var28.array, 0, var28.offset); // L: 1153
																			boolean var35;
																			if (var34 == null) { // L: 1156
																				var35 = false; // L: 1157
																			} else {
																				label1947: {
																					try {
																						new URL(var34);
																					} catch (MalformedURLException var71) { // L: 1163
																						var35 = false; // L: 1164
																						break label1947; // L: 1165
																					}

																					var35 = true; // L: 1167
																				}
																			}

																			if (var35) { // L: 1169
																				HealthBar.openURL(var34, true, false); // L: 1170
																				var65 = 2; // L: 1171
																			} else {
																				var65 = 5; // L: 1173
																			}
																		}
																		break;
																	}

																	var28.offset += var64; // L: 1124
																	if (var28.offset >= 1000) { // L: 1125
																		var65 = 5; // L: 1126
																		break;
																	}
																}
															} catch (Throwable var72) { // L: 1175
																var72.printStackTrace(); // L: 1176
																var65 = 5; // L: 1177
															}

															var86 = var65; // L: 1180
														}

														switch(var86) { // L: 1182
														case 2:
															class139.setLoginResponseString(Strings.field4189, Strings.field4118, Strings.field4191); // L: 1199
															UserComparator7.method2966(6); // L: 1200
															break;
														case 3:
															class139.setLoginResponseString("", "Error connecting to server.", ""); // L: 1190
															break; // L: 1191
														case 4:
															class139.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1196
															break; // L: 1197
														case 5:
															class139.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1193
															break; // L: 1194
														case 6:
															class139.setLoginResponseString("", "Error connecting to server.", ""); // L: 1184
															break; // L: 1185
														case 7:
															class139.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1187
														}
													}

													return; // L: 1204
												}

												if (var85 && Login.Login_username.length() < 320) { // L: 1206
													Login.Login_username = Login.Login_username + var41.field2363;
												}
											}
										}
									} else if (Login.loginIndex != 6) { // L: 1210
										if (Login.loginIndex == 7) { // L: 1221
											if (PendingSpawn.field1169 && !Client.onMobile) { // L: 1222
												var11 = class157.loginBoxCenter - 150; // L: 1223
												var83 = var11 + 40 + 240 + 25; // L: 1224
												var82 = 231; // L: 1225
												var14 = var82 + 40; // L: 1226
												if (var6 == 1 && var78 >= var11 && var78 <= var83 && var79 >= var82 && var79 <= var14) { // L: 1227
													Login.field915 = ObjectSound.method1978(var11, var78); // L: 1228
												}

												var15 = Login.loginBoxX + 180 - 80; // L: 1230
												short var16 = 321; // L: 1231
												boolean var66;
												if (var6 == 1 && var78 >= var15 - 75 && var78 <= var15 + 75 && var79 >= var16 - 20 && var79 <= var16 + 20) { // L: 1232
													var66 = class36.method709(); // L: 1233
													if (var66) { // L: 1234
														WorldMapSection2.method4516(50); // L: 1235
														return; // L: 1236
													}
												}

												var15 = Login.loginBoxX + 180 + 80; // L: 1239
												if (var6 == 1 && var78 >= var15 - 75 && var78 <= var15 + 75 && var79 >= var16 - 20 && var79 <= var16 + 20) { // L: 1240
													Login.field907 = new String[8]; // L: 1241
													SoundSystem.Login_promptCredentials(true); // L: 1242
												}

												while (var41.method4324()) { // L: 1244
													if (var41.field2360 == 101) { // L: 1245
														Login.field907[Login.field915] = null; // L: 1246
													}

													if (var41.field2360 == 85) { // L: 1248
														if (Login.field907[Login.field915] == null && Login.field915 > 0) { // L: 1249
															--Login.field915; // L: 1250
														}

														Login.field907[Login.field915] = null; // L: 1252
													}

													if (var41.field2363 >= '0' && var41.field2363 <= '9') { // L: 1254
														Login.field907[Login.field915] = "" + var41.field2363; // L: 1255
														if (Login.field915 < 7) { // L: 1256
															++Login.field915; // L: 1257
														}
													}

													if (var41.field2360 == 84) { // L: 1260
														var66 = class36.method709(); // L: 1261
														if (var66) { // L: 1262
															WorldMapSection2.method4516(50); // L: 1263
														}

														return; // L: 1265
													}
												}
											} else {
												var11 = Login.loginBoxX + 180 - 80; // L: 1270
												var12 = 321; // L: 1271
												if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1272
													HealthBar.openURL(WorldMapID.method4938("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1273
													class139.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1274
													UserComparator7.method2966(6); // L: 1275
													return; // L: 1276
												}

												var11 = Login.loginBoxX + 180 + 80; // L: 1278
												if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1279
													SoundSystem.Login_promptCredentials(true); // L: 1280
												}
											}
										} else if (Login.loginIndex == 8) { // L: 1284
											var11 = Login.loginBoxX + 180 - 80; // L: 1285
											var12 = 321; // L: 1286
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1287
												HealthBar.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1288
												class139.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1289
												UserComparator7.method2966(6); // L: 1290
												return; // L: 1291
											}

											var11 = Login.loginBoxX + 180 + 80; // L: 1293
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1294
												SoundSystem.Login_promptCredentials(true); // L: 1295
											}
										} else if (Login.loginIndex == 9) { // L: 1298
											var11 = Login.loginBoxX + 180; // L: 1299
											var12 = 311; // L: 1300
											if (var9.field2360 == 84 || var9.field2360 == 13 || var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1301
												ClientPreferences.method2645(false); // L: 1302
											}
										} else if (Login.loginIndex == 10) { // L: 1305
											var11 = Login.loginBoxX + 180; // L: 1306
											var12 = 209; // L: 1307
											if (var9.field2360 == 84 || var6 == 1 && var78 >= var11 - 109 && var78 <= var11 + 109 && var79 >= var12 && var79 <= var12 + 68) { // L: 1308
												class139.setLoginResponseString("", "Connecting to server...", ""); // L: 1309
												Client.field526 = class531.field5192; // L: 1310
												VerticalAlignment.method3754(false); // L: 1311
												WorldMapSection2.method4516(20); // L: 1312
											}
										} else if (Login.loginIndex == 12) { // L: 1315
											var11 = class157.loginBoxCenter; // L: 1316
											var12 = 233; // L: 1317
											var44 = var2.method7668(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12); // L: 1318
											Bounds var42 = var2.method7668(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12); // L: 1319
											Bounds var43 = var2.method7668(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12); // L: 1320
											var83 = var12 + 17; // L: 1321
											Bounds var105 = var2.method7668(0, 34, "<col=ffd200>agreement (EULA)</col>.", var11, var83); // L: 1322
											if (var6 == 1) { // L: 1323
												if (var44.method8373(var78, var79)) { // L: 1324
													HealthBar.openURL("https://www.jagex.com/terms", true, false); // L: 1325
												} else if (var42.method8373(var78, var79)) { // L: 1327
													HealthBar.openURL("https://www.jagex.com/terms/privacy", true, false); // L: 1328
												} else if (var43.method8373(var78, var79) || var105.method8373(var78, var79)) { // L: 1330
													HealthBar.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false); // L: 1331
												}
											}

											var11 = class157.loginBoxCenter - 80; // L: 1334
											var12 = 311; // L: 1335
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1336
												WorldMapIcon_1.clientPreferences.method2561(Client.field488); // L: 1338
												ClientPreferences.method2645(true); // L: 1340
											}

											var11 = class157.loginBoxCenter + 80; // L: 1342
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1343
												Login.loginIndex = 13; // L: 1344
											}
										} else if (Login.loginIndex == 13) { // L: 1347
											var11 = class157.loginBoxCenter; // L: 1348
											var12 = 321; // L: 1349
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1350
												ClientPreferences.method2645(true); // L: 1351
											}
										} else if (Login.loginIndex == 14) { // L: 1354
											String var67 = ""; // L: 1355
											switch(Login.field894) { // L: 1356
											case 0:
												var67 = "https://secure.runescape.com/m=offence-appeal/account-history"; // L: 1361
												break; // L: 1362
											case 1:
												var67 = "https://secure.runescape.com/m=accountappeal/passwordrecovery"; // L: 1358
												break; // L: 1359
											case 2:
												var67 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance"; // L: 1367
												break;
											default:
												SoundSystem.Login_promptCredentials(false); // L: 1364
											}

											var83 = Login.loginBoxX + 180; // L: 1370
											var82 = 276; // L: 1371
											if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20) { // L: 1372
												HealthBar.openURL(var67, true, false); // L: 1373
												class139.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1374
												UserComparator7.method2966(6); // L: 1375
												return; // L: 1376
											}

											var83 = Login.loginBoxX + 180; // L: 1378
											var82 = 326; // L: 1379
											if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20) { // L: 1380
												SoundSystem.Login_promptCredentials(false); // L: 1381
											}
										} else if (Login.loginIndex == 24) { // L: 1384
											var11 = Login.loginBoxX + 180; // L: 1385
											var12 = 301; // L: 1386
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1387
												ClientPreferences.method2645(false); // L: 1388
											}
										} else if (Login.loginIndex == 32) { // L: 1391
											var11 = Login.loginBoxX + 180 - 80; // L: 1392
											var12 = 321; // L: 1393
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1394
												HealthBar.openURL(WorldMapID.method4938("secure", true) + "m=dob/set_dob.ws", true, false); // L: 1395
												class139.setLoginResponseString("", "Page has opened in the browser.", ""); // L: 1396
												UserComparator7.method2966(6); // L: 1397
												return; // L: 1398
											}

											var11 = Login.loginBoxX + 180 + 80; // L: 1400
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1401
												SoundSystem.Login_promptCredentials(true); // L: 1402
											}
										} else if (Login.loginIndex == 33) { // L: 1405
											var11 = Login.loginBoxX + 180; // L: 1406
											var12 = 276; // L: 1407
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1408
												HealthBar.openURL("https://oldschool.runescape.com/launcher", true, false); // L: 1409
											}

											var11 = Login.loginBoxX + 180; // L: 1411
											var12 = 326; // L: 1412
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) { // L: 1413
												SoundSystem.Login_promptCredentials(true); // L: 1414
											}
										}
									} else {
										while (true) {
											do {
												if (!var41.method4324()) { // L: 1211
													var81 = 321; // L: 1216
													if (var6 == 1 && var79 >= var81 - 20 && var79 <= var81 + 20) { // L: 1217
														SoundSystem.Login_promptCredentials(true); // L: 1218
													}

													return;
												}
											} while(var41.field2360 != 84 && var41.field2360 != 13); // L: 1212

											SoundSystem.Login_promptCredentials(true); // L: 1213
										}
									}
								}
							}
						}
					}

				}
			}
		}
	} // L: 445

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-983398043"
	)
	static int method2495(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) { // L: 3442
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3443
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type(); // L: 3444
			return 1; // L: 3445
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) { // L: 3447
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3448
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id; // L: 3449
			return 1; // L: 3450
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) { // L: 3452
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3453
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice; // L: 3454
			return 1; // L: 3455
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) { // L: 3457
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3458
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity; // L: 3459
			return 1; // L: 3460
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) { // L: 3462
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3463
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity; // L: 3464
			return 1; // L: 3465
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) { // L: 3467
			var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3468
			Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice; // L: 3469
			return 1; // L: 3470
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) { // L: 3472
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3473
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3474
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0; // L: 3475
				return 1; // L: 3476
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) { // L: 3478
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3479
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3480
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0; // L: 3481
				return 1; // L: 3482
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) { // L: 3484
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3485
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3486
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0; // L: 3487
				return 1; // L: 3488
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) { // L: 3490
				var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3491
				var13 = Client.grandExchangeOffers[var3].status(); // L: 3492
				Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0; // L: 3493
				return 1; // L: 3494
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) { // L: 3496
					var12 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3497
					if (class6.grandExchangeEvents != null) { // L: 3498
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12); // L: 3499
					}

					return 1; // L: 3501
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) { // L: 3503
					var12 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3504
					if (class6.grandExchangeEvents != null) { // L: 3505
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12); // L: 3506
					}

					return 1; // L: 3508
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) { // L: 3510
					class517.Interpreter_intStackSize -= 2; // L: 3511
					var12 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize] == 1; // L: 3512
					boolean var11 = Interpreter.Interpreter_intStack[class517.Interpreter_intStackSize + 1] == 1; // L: 3513
					if (class6.grandExchangeEvents != null) { // L: 3514
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11; // L: 3515
						class6.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12); // L: 3516
					}

					return 1; // L: 3518
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) { // L: 3520
					var12 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3521
					if (class6.grandExchangeEvents != null) { // L: 3522
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12); // L: 3523
					}

					return 1; // L: 3525
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) { // L: 3527
					var12 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize] == 1; // L: 3528
					if (class6.grandExchangeEvents != null) { // L: 3529
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12); // L: 3530
					}

					return 1; // L: 3532
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) { // L: 3534
					Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class6.grandExchangeEvents == null ? 0 : class6.grandExchangeEvents.events.size(); // L: 3535
					return 1; // L: 3536
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) { // L: 3538
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3539
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3); // L: 3540
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.world; // L: 3541
						return 1; // L: 3542
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) { // L: 3544
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3545
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3); // L: 3546
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.getOfferName(); // L: 3547
						return 1; // L: 3548
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) { // L: 3550
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3551
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3); // L: 3552
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName(); // L: 3553
						return 1; // L: 3554
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) { // L: 3556
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3557
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3); // L: 3558
						long var5 = SpotAnimationDefinition.method3775() - class489.field4905 - var4.age; // L: 3559
						int var7 = (int)(var5 / 3600000L); // L: 3560
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L); // L: 3561
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L); // L: 3562
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10; // L: 3563
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var10; // L: 3564
						return 1; // L: 3565
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) { // L: 3567
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3568
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3); // L: 3569
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity; // L: 3570
						return 1; // L: 3571
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) { // L: 3573
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3574
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3); // L: 3575
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice; // L: 3576
						return 1; // L: 3577
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) { // L: 3579
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3580
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3); // L: 3581
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id; // L: 3582
						return 1; // L: 3583
					} else if (var0 == 3939) { // L: 3585
						var3 = Interpreter.Interpreter_intStack[--class517.Interpreter_intStackSize]; // L: 3586
						Interpreter.Interpreter_intStack[++class517.Interpreter_intStackSize - 1] = class214.ItemComposition_get(var3).isTradable ? 1 : 0; // L: 3587
						return 1; // L: 3588
					} else {
						return 2; // L: 3590
					}
				}
			}
		}
	}
}
