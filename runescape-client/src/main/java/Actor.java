import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1144428983
	)
	@Export("x")
	int x;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -411750205
	)
	@Export("y")
	int y;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1703696531
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 353040509
	)
	int field1140;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1532330627
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1590591885
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1319769839
	)
	int field1136;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1796560353
	)
	int field1166;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 736907545
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1648569641
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -127994241
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1059657777
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1939789287
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 793978951
	)
	int field1150;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1755337849
	)
	int field1151;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 802247051
	)
	int field1152;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1254675467
	)
	int field1153;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 572220041
	)
	int field1196;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1312118043
	)
	int field1155;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -428343529
	)
	int field1157;
	@ObfuscatedName("bw")
	String field1148;
	@ObfuscatedName("ce")
	boolean field1176;
	@ObfuscatedName("ci")
	boolean field1144;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -536830723
	)
	int field1160;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1337884343
	)
	int field1161;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 819594233
	)
	int field1206;
	@ObfuscatedName("cu")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ck")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cm")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cf")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cl")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1005900761
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cy")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -283165269
	)
	int field1172;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -714961113
	)
	int field1197;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1282076959
	)
	int field1174;
	@ObfuscatedName("co")
	boolean field1142;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1302441815
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 424813829
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -767724643
	)
	int field1178;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -463442209
	)
	int field1179;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1372355773
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -41215169
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1356757385
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1253892101
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -92383341
	)
	int field1184;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	IterableNodeHashTable field1185;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -500494421
	)
	int field1202;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1826657487
	)
	int field1187;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -603433453
	)
	int field1188;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -638797877
	)
	int field1189;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1509120399
	)
	int field1207;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -435598119
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1274841313
	)
	int field1192;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1929282871
	)
	int field1193;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -523202873
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -767387641
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1182789041
	)
	int field1168;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 707232483
	)
	int field1156;
	@ObfuscatedName("du")
	byte field1180;
	@ObfuscatedName("db")
	byte field1199;
	@ObfuscatedName("df")
	byte field1200;
	@ObfuscatedName("dq")
	byte field1208;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1751341433
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1223990063
	)
	int field1203;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 351748387
	)
	int field1190;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1134756167
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dy")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("ds")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "[Liu;"
	)
	@Export("pathTraversed")
	class210[] pathTraversed;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 1489558979
	)
	int field1209;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -1181739279
	)
	int field1210;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = 674049519
	)
	int field1211;

	Actor() {
		this.isWalking = false; // L: 18
		this.field1140 = 1; // L: 19
		this.idleSequence = -1; // L: 21
		this.field1136 = -1; // L: 22
		this.field1166 = -1; // L: 23
		this.walkSequence = -1; // L: 24
		this.walkBackSequence = -1; // L: 25
		this.walkLeftSequence = -1; // L: 26
		this.walkRightSequence = -1; // L: 27
		this.runSequence = -1; // L: 28
		this.field1150 = -1; // L: 29
		this.field1151 = -1; // L: 30
		this.field1152 = -1; // L: 31
		this.field1153 = -1; // L: 32
		this.field1196 = -1; // L: 33
		this.field1155 = -1; // L: 34
		this.field1157 = -1; // L: 35
		this.field1148 = null; // L: 36
		this.field1144 = false; // L: 38
		this.field1160 = 100;
		this.field1161 = 0;
		this.field1206 = 0; // L: 41
		this.hitSplatCount = 0; // L: 43
		this.hitSplatTypes = new int[4]; // L: 44
		this.hitSplatValues = new int[4]; // L: 45
		this.hitSplatCycles = new int[4]; // L: 46
		this.hitSplatTypes2 = new int[4]; // L: 47
		this.hitSplatValues2 = new int[4]; // L: 48
		this.healthBars = new IterableNodeDeque(); // L: 49
		this.targetIndex = -1; // L: 50
		this.false0 = false; // L: 51
		this.field1172 = -1; // L: 52
		this.field1197 = -1; // L: 53
		this.field1174 = -1; // L: 54
		this.movementSequence = -1; // L: 56
		this.movementFrame = 0; // L: 57
		this.field1178 = 0; // L: 58
		this.field1179 = 0; // L: 59
		this.sequence = -1; // L: 60
		this.sequenceFrame = 0; // L: 61
		this.sequenceFrameCycle = 0; // L: 62
		this.sequenceDelay = 0; // L: 63
		this.field1184 = 0; // L: 64
		this.field1185 = new IterableNodeHashTable(4); // L: 65
		this.field1202 = 0; // L: 66
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1168 = -1;
		this.field1156 = -1;
		this.field1203 = 0; // L: 83
		this.field1190 = 32; // L: 84
		this.pathLength = 0; // L: 85
		this.pathX = new int[10]; // L: 86
		this.pathY = new int[10]; // L: 87
		this.pathTraversed = new class210[10]; // L: 88
		this.field1209 = 0; // L: 89
		this.field1210 = 0; // L: 90
		this.field1211 = -1; // L: 91
	} // L: 93

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1666539507"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 101
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "32"
	)
	final void method2388() {
		this.pathLength = 0; // L: 96
		this.field1210 = 0; // L: 97
	} // L: 98

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1919870398"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 105
		boolean var8 = true; // L: 106

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 107
			if (this.hitSplatCycles[var9] > var5) { // L: 108
				var7 = false;
			} else {
				var8 = false; // L: 109
			}
		}

		var9 = -1; // L: 111
		int var10 = -1; // L: 112
		int var11 = 0; // L: 113
		if (var1 >= 0) { // L: 114
			HitSplatDefinition var12 = class122.method3046(var1); // L: 115
			var10 = var12.field2149; // L: 116
			var11 = var12.field2142; // L: 117
		}

		int var14;
		if (var8) { // L: 119
			if (var10 == -1) { // L: 120
				return;
			}

			var9 = 0; // L: 121
			var14 = 0; // L: 122
			if (var10 == 0) { // L: 123
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 124
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 125
				if (var10 == 0) { // L: 126
					if (this.hitSplatCycles[var13] < var14) { // L: 127
						var9 = var13; // L: 128
						var14 = this.hitSplatCycles[var13]; // L: 129
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 132 133
					var9 = var13; // L: 134
					var14 = this.hitSplatValues[var13]; // L: 135
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 143
				byte var15 = this.hitSplatCount; // L: 144
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 145
				if (this.hitSplatCycles[var15] <= var5) { // L: 146
					var9 = var15; // L: 147
					break; // L: 148
				}
			}
		}

		if (var9 >= 0) { // L: 152
			this.hitSplatTypes[var9] = var1; // L: 153
			this.hitSplatValues[var9] = var2; // L: 154
			this.hitSplatTypes2[var9] = var3; // L: 155
			this.hitSplatValues2[var9] = var4; // L: 156
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 157
		}
	} // L: 158

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "121"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 163
		HealthBarDefinition var7;
		if (var8 != null) { // L: 164
			var7 = var8; // L: 165
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 168
			var8 = new HealthBarDefinition(); // L: 169
			if (var9 != null) { // L: 170
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1); // L: 171
			var7 = var8; // L: 172
		}

		var8 = var7; // L: 174
		HealthBar var14 = null; // L: 175
		HealthBar var10 = null; // L: 176
		int var11 = var7.int2; // L: 177
		int var12 = 0; // L: 178

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) { // L: 179
			++var12; // L: 180
			if (var13.definition.field1959 == var8.field1959) { // L: 181
				var13.put(var2 + var4, var5, var6, var3); // L: 182
				return; // L: 183
			}

			if (var13.definition.int1 <= var8.int1) { // L: 185
				var14 = var13;
			}

			if (var13.definition.int2 > var11) { // L: 186
				var10 = var13; // L: 187
				var11 = var13.definition.int2; // L: 188
			}
		}

		if (var10 != null || var12 < 4) { // L: 191
			var13 = new HealthBar(var8); // L: 192
			if (var14 == null) { // L: 193
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14); // L: 194
			}

			var13.put(var2 + var4, var5, var6, var3); // L: 195
			if (var12 >= 4) { // L: 196
				var10.remove();
			}

		}
	} // L: 197

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1269115179"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 202
		HealthBarDefinition var2;
		if (var3 != null) { // L: 203
			var2 = var3; // L: 204
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 207
			var3 = new HealthBarDefinition(); // L: 208
			if (var4 != null) { // L: 209
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1); // L: 210
			var2 = var3; // L: 211
		}

		var3 = var2; // L: 213

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) { // L: 214
			if (var3 == var5.definition) { // L: 215
				var5.remove(); // L: 216
				return; // L: 217
			}
		}

	} // L: 220

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "329491762"
	)
	void method2375(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle; // L: 223
		class511 var6 = (class511)this.field1185.get((long)var1); // L: 224
		if (var6 != null) { // L: 225
			var6.remove(); // L: 226
			--this.field1202; // L: 227
		}

		if (var2 != 65535 && var2 != -1) { // L: 229
			byte var7 = 0; // L: 232
			if (var4 > 0) { // L: 233
				var7 = -1; // L: 234
			}

			this.field1185.put(new class511(var2, var3, var5, var7), (long)var1); // L: 236
			++this.field1202; // L: 237
		}
	} // L: 230 238

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(B)Lro;",
		garbageValue = "10"
	)
	IterableNodeHashTable method2376() {
		return this.field1185; // L: 241
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2086288959"
	)
	void method2377() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.field1185); // L: 245

		for (class511 var2 = (class511)var1.method8686(); var2 != null; var2 = (class511)var1.next()) { // L: 246
			var2.remove(); // L: 247
		}

		this.field1202 = 0; // L: 249
	} // L: 250

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lit;B)Lit;",
		garbageValue = "106"
	)
	Model method2374(Model var1) {
		if (this.field1202 == 0) { // L: 253
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.field1185); // L: 254
			int var3 = var1.verticesCount; // L: 255
			int var4 = var1.indicesCount; // L: 256
			int var5 = var1.field2708; // L: 257
			byte var6 = var1.field2707; // L: 258

			for (class511 var7 = (class511)var2.method8686(); var7 != null; var7 = (class511)var2.next()) { // L: 259
				if (var7.field5142 != -1) { // L: 260
					Model var8 = ItemContainer.SpotAnimationDefinition_get(var7.field5143).method3835(); // L: 261
					if (var8 != null) { // L: 262
						var3 += var8.verticesCount; // L: 263
						var4 += var8.indicesCount; // L: 264
						var5 += var8.field2708; // L: 265
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6); // L: 267
			var10.method4862(var1); // L: 268

			for (class511 var11 = (class511)var2.method8686(); var11 != null; var11 = (class511)var2.next()) { // L: 269
				if (var11.field5142 != -1) { // L: 270
					Model var9 = ItemContainer.SpotAnimationDefinition_get(var11.field5143).getModel(var11.field5142); // L: 271
					if (var9 != null) { // L: 272
						var9.offsetBy(0, -var11.field5145, 0); // L: 273
						var10.method4862(var9); // L: 274
					}
				}
			}

			return var10; // L: 276
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2125761914"
	)
	void method2370() {
		this.field1142 = false; // L: 280
		this.field1172 = -1; // L: 281
		this.field1197 = -1; // L: 282
		this.field1174 = -1; // L: 283
	} // L: 284

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lcq;",
		garbageValue = "470709205"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 39
		return var2.getMessage(var1); // L: 40
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILnm;IIIZI)V",
		garbageValue = "-1229709463"
	)
	public static void method2399(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class297.musicPlayerStatus = 1; // L: 71
		class297.musicTrackArchive = var1; // L: 72
		class379.musicTrackGroupId = var2; // L: 73
		VarpDefinition.musicTrackFileId = var3; // L: 74
		class100.musicTrackVolume = var4; // L: 75
		class120.musicTrackBoolean = var5; // L: 76
		class162.pcmSampleLength = var0; // L: 77
	} // L: 78

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "59"
	)
	public static int method2400(CharSequence var0) {
		int var1 = var0.length(); // L: 139
		int var2 = 0; // L: 140

		for (int var3 = 0; var3 < var1; ++var3) { // L: 141
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}

		return var2; // L: 142
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1598492457"
	)
	static final int method2398(int var0, int var1) {
		int var2 = var0 + var1 * 57; // L: 1034
		var2 ^= var2 << 13; // L: 1035
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 1036
		return var3 >> 19 & 255; // L: 1037
	}
}
