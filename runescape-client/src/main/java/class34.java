import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public class class34 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("l")
	public static short[][] field193;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1698316323
	)
	int field190;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1677553367
	)
	int field191;

	class34(int var1, int var2) {
		this.field190 = var1; // L: 14
		this.field191 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lac;I)Z",
		garbageValue = "155959181"
	)
	boolean method501(class30 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field190) {
			case 1:
				return var1.vmethod3949(this.field191);
			case 2:
				return var1.vmethod3989(this.field191);
			case 3:
				return var1.vmethod3951((char)this.field191);
			case 4:
				return var1.vmethod3953(this.field191 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIILgv;Lgr;I)Z",
		garbageValue = "-1815573650"
	)
	public static final boolean method502(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4) {
		int var5 = var0; // L: 19
		int var6 = var1; // L: 20
		byte var7 = 64; // L: 21
		byte var8 = 64; // L: 22
		int var9 = var0 - var7; // L: 23
		int var10 = var1 - var8; // L: 24
		class203.directions[var7][var8] = 99; // L: 25
		class203.distances[var7][var8] = 0; // L: 26
		byte var11 = 0; // L: 27
		int var12 = 0; // L: 28
		class203.bufferX[var11] = var0; // L: 29
		int var20 = var11 + 1;
		class203.bufferY[var11] = var1; // L: 30
		int[][] var13 = var4.flags; // L: 31

		while (true) {
			label305:
			while (true) {
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				do {
					do {
						do {
							label282:
							do {
								if (var20 == var12) { // L: 32
									class203.field2291 = var5; // L: 151
									class203.field2294 = var6; // L: 152
									return false; // L: 153
								}

								var5 = class203.bufferX[var12]; // L: 33
								var6 = class203.bufferY[var12]; // L: 34
								var12 = var12 + 1 & 4095; // L: 35
								var18 = var5 - var9; // L: 36
								var19 = var6 - var10; // L: 37
								var14 = var5 - var4.xInset; // L: 38
								var15 = var6 - var4.yInset; // L: 39
								if (var3.hasArrived(var2, var5, var6, var4)) { // L: 40
									class203.field2291 = var5; // L: 41
									class203.field2294 = var6; // L: 42
									return true; // L: 43
								}

								var16 = class203.distances[var18][var19] + 1; // L: 45
								if (var18 > 0 && class203.directions[var18 - 1][var19] == 0 && (var13[var14 - 1][var15] & 19136782) == 0 && (var13[var14 - 1][var15 + var2 - 1] & 19136824) == 0) { // L: 46 47 48 49
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class203.bufferX[var20] = var5 - 1; // L: 53
											class203.bufferY[var20] = var6; // L: 54
											var20 = var20 + 1 & 4095; // L: 55
											class203.directions[var18 - 1][var19] = 2; // L: 56
											class203.distances[var18 - 1][var19] = var16; // L: 57
											break;
										}

										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0) { // L: 51
											break;
										}

										++var17; // L: 50
									}
								}

								if (var18 < 128 - var2 && class203.directions[var18 + 1][var19] == 0 && (var13[var14 + var2][var15] & 19136899) == 0 && (var13[var14 + var2][var15 + var2 - 1] & 19136992) == 0) { // L: 59 60 61 62
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class203.bufferX[var20] = var5 + 1; // L: 66
											class203.bufferY[var20] = var6; // L: 67
											var20 = var20 + 1 & 4095; // L: 68
											class203.directions[var18 + 1][var19] = 8; // L: 69
											class203.distances[var18 + 1][var19] = var16; // L: 70
											break;
										}

										if ((var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 64
											break;
										}

										++var17; // L: 63
									}
								}

								if (var19 > 0 && class203.directions[var18][var19 - 1] == 0 && (var13[var14][var15 - 1] & 19136782) == 0 && (var13[var14 + var2 - 1][var15 - 1] & 19136899) == 0) { // L: 72 73 74 75
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class203.bufferX[var20] = var5; // L: 79
											class203.bufferY[var20] = var6 - 1; // L: 80
											var20 = var20 + 1 & 4095; // L: 81
											class203.directions[var18][var19 - 1] = 1; // L: 82
											class203.distances[var18][var19 - 1] = var16; // L: 83
											break;
										}

										if ((var13[var17 + var14][var15 - 1] & 19136911) != 0) { // L: 77
											break;
										}

										++var17; // L: 76
									}
								}

								if (var19 < 128 - var2 && class203.directions[var18][var19 + 1] == 0 && (var13[var14][var15 + var2] & 19136824) == 0 && (var13[var14 + var2 - 1][var15 + var2] & 19136992) == 0) { // L: 85 86 87 88
									var17 = 1;

									while (true) {
										if (var17 >= var2 - 1) {
											class203.bufferX[var20] = var5; // L: 92
											class203.bufferY[var20] = var6 + 1; // L: 93
											var20 = var20 + 1 & 4095; // L: 94
											class203.directions[var18][var19 + 1] = 4; // L: 95
											class203.distances[var18][var19 + 1] = var16; // L: 96
											break;
										}

										if ((var13[var17 + var14][var15 + var2] & 19137016) != 0) { // L: 90
											break;
										}

										++var17; // L: 89
									}
								}

								if (var18 > 0 && var19 > 0 && class203.directions[var18 - 1][var19 - 1] == 0 && (var13[var14 - 1][var15 - 1] & 19136782) == 0) { // L: 98 99 100
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class203.bufferX[var20] = var5 - 1; // L: 105
											class203.bufferY[var20] = var6 - 1; // L: 106
											var20 = var20 + 1 & 4095; // L: 107
											class203.directions[var18 - 1][var19 - 1] = 3; // L: 108
											class203.distances[var18 - 1][var19 - 1] = var16; // L: 109
											break;
										}

										if ((var13[var14 - 1][var17 + (var15 - 1)] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 - 1] & 19136911) != 0) { // L: 102 103
											break;
										}

										++var17; // L: 101
									}
								}

								if (var18 < 128 - var2 && var19 > 0 && class203.directions[var18 + 1][var19 - 1] == 0 && (var13[var14 + var2][var15 - 1] & 19136899) == 0) { // L: 111 112 113
									var17 = 1;

									while (true) {
										if (var17 >= var2) {
											class203.bufferX[var20] = var5 + 1; // L: 118
											class203.bufferY[var20] = var6 - 1; // L: 119
											var20 = var20 + 1 & 4095; // L: 120
											class203.directions[var18 + 1][var19 - 1] = 9; // L: 121
											class203.distances[var18 + 1][var19 - 1] = var16; // L: 122
											break;
										}

										if ((var13[var14 + var2][var17 + (var15 - 1)] & 19136995) != 0 || (var13[var14 + var17][var15 - 1] & 19136911) != 0) { // L: 115 116
											break;
										}

										++var17; // L: 114
									}
								}

								if (var18 > 0 && var19 < 128 - var2 && class203.directions[var18 - 1][var19 + 1] == 0 && (var13[var14 - 1][var15 + var2] & 19136824) == 0) { // L: 124 125 126
									for (var17 = 1; var17 < var2; ++var17) { // L: 127
										if ((var13[var14 - 1][var17 + var15] & 19136830) != 0 || (var13[var17 + (var14 - 1)][var15 + var2] & 19137016) != 0) { // L: 128 129
											continue label282;
										}
									}

									class203.bufferX[var20] = var5 - 1; // L: 131
									class203.bufferY[var20] = var6 + 1; // L: 132
									var20 = var20 + 1 & 4095; // L: 133
									class203.directions[var18 - 1][var19 + 1] = 6; // L: 134
									class203.distances[var18 - 1][var19 + 1] = var16; // L: 135
								}
							} while(var18 >= 128 - var2); // L: 137
						} while(var19 >= 128 - var2);
					} while(class203.directions[var18 + 1][var19 + 1] != 0); // L: 138
				} while((var13[var14 + var2][var15 + var2] & 19136992) != 0); // L: 139

				for (var17 = 1; var17 < var2; ++var17) { // L: 140
					if ((var13[var17 + var14][var15 + var2] & 19137016) != 0 || (var13[var14 + var2][var17 + var15] & 19136995) != 0) { // L: 141 142
						continue label305;
					}
				}

				class203.bufferX[var20] = var5 + 1; // L: 144
				class203.bufferY[var20] = var6 + 1; // L: 145
				var20 = var20 + 1 & 4095; // L: 146
				class203.directions[var18 + 1][var19 + 1] = 12; // L: 147
				class203.distances[var18 + 1][var19 + 1] = var16; // L: 148
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-143409830"
	)
	public static void method503() {
		ItemComposition.ItemComposition_cachedSprites.clear(); // L: 568
	} // L: 569
}
