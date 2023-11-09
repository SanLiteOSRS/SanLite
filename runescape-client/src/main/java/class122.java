import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dj")
public class class122 extends DualNode {
	@ObfuscatedName("rw")
	static boolean field1499;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 97851213
	)
	static int field1500;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1372004053
	)
	int field1496;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "[[Ldp;"
	)
	public class117[][] field1495;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[[Ldp;"
	)
	class117[][] field1494;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	public Skeleton field1498;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 779215479
	)
	int field1497;
	@ObfuscatedName("w")
	boolean field1492;

	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;IZ)V"
	)
	class122(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1495 = null; // L: 14
		this.field1494 = null; // L: 15
		this.field1497 = 0; // L: 17
		this.field1496 = var3; // L: 42
		byte[] var5 = var1.takeFile(this.field1496 >> 16 & 65535, this.field1496 & 65535); // L: 43
		Buffer var6 = new Buffer(var5); // L: 44
		int var7 = var6.readUnsignedByte(); // L: 45
		int var8 = var6.readUnsignedShort(); // L: 46
		byte[] var9;
		if (var4) { // L: 48
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 49
		}

		this.field1498 = new Skeleton(var8, var9); // L: 50
		this.method2843(var6, var7); // L: 51
	} // L: 52

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V",
		garbageValue = "1383908694"
	)
	void method2843(Buffer var1, int var2) {
		var1.readUnsignedShort(); // L: 55
		var1.readUnsignedShort(); // L: 56
		this.field1497 = var1.readUnsignedByte(); // L: 57
		int var3 = var1.readUnsignedShort(); // L: 58
		this.field1494 = new class117[this.field1498.method4103().method4091()][]; // L: 59
		this.field1495 = new class117[this.field1498.method4101()][]; // L: 60

		for (int var4 = 0; var4 < var3; ++var4) { // L: 61
			class118 var5 = SequenceDefinition.method3854(var1.readUnsignedByte()); // L: 62
			int var6 = var1.readShortSmart(); // L: 63
			class119 var7 = LoginScreenAnimation.method2305(var1.readUnsignedByte()); // L: 64
			class117 var8 = new class117(); // L: 65
			var8.method2773(var1, var2); // L: 66
			int var9 = var5.method2800(); // L: 67
			class117[][] var10;
			if (var5 == class118.field1453) { // L: 69
				var10 = this.field1494; // L: 70
			} else {
				var10 = this.field1495; // L: 73
			}

			if (var10[var6] == null) { // L: 75
				var10[var6] = new class117[var9]; // L: 76
			}

			var10[var6][var7.method2818()] = var8; // L: 78
			if (var5 == class118.field1456) { // L: 79
				this.field1492 = true; // L: 80
			}
		}

	} // L: 83

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1862335606"
	)
	public int method2827() {
		return this.field1497; // L: 86
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1374676526"
	)
	public boolean method2828() {
		return this.field1492; // L: 90
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILdo;III)V",
		garbageValue = "171483096"
	)
	public void method2829(int var1, class115 var2, int var3, int var4) {
		class388 var5 = MouseHandler.method574(); // L: 94
		this.method2842(var5, var3, var2, var1); // L: 95
		this.method2825(var5, var3, var2, var1); // L: 96
		this.method2838(var5, var3, var2, var1); // L: 97
		var2.method2749(var5); // L: 98
		var5.method7027(); // L: 99
	} // L: 100

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnb;ILdo;II)V",
		garbageValue = "-960844295"
	)
	void method2842(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2734(this.field1497); // L: 103
		float var6 = var5[0]; // L: 104
		float var7 = var5[1]; // L: 105
		float var8 = var5[2]; // L: 106
		if (this.field1494[var2] != null) { // L: 107
			class117 var9 = this.field1494[var2][0]; // L: 108
			class117 var10 = this.field1494[var2][1]; // L: 109
			class117 var11 = this.field1494[var2][2]; // L: 110
			if (var9 != null) { // L: 111
				var6 = var9.method2777(var4);
			}

			if (var10 != null) { // L: 112
				var7 = var10.method2777(var4);
			}

			if (var11 != null) { // L: 113
				var8 = var11.method2777(var4);
			}
		}

		class387 var16 = ReflectionCheck.method612(); // L: 115
		var16.method6973(1.0F, 0.0F, 0.0F, var6); // L: 116
		class387 var14 = ReflectionCheck.method612(); // L: 117
		var14.method6973(0.0F, 1.0F, 0.0F, var7); // L: 118
		class387 var15 = ReflectionCheck.method612(); // L: 119
		var15.method6973(0.0F, 0.0F, 1.0F, var8); // L: 120
		class387 var12 = ReflectionCheck.method612(); // L: 121
		var12.method6970(var15); // L: 122
		var12.method6970(var16); // L: 123
		var12.method6970(var14); // L: 124
		class388 var13 = MouseHandler.method574(); // L: 125
		var13.method7051(var12); // L: 126
		var1.method7009(var13); // L: 127
		var16.method6987(); // L: 128
		var14.method6987(); // L: 129
		var15.method6987(); // L: 130
		var12.method6987(); // L: 131
		var13.method7027(); // L: 132
	} // L: 133

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnb;ILdo;IB)V",
		garbageValue = "14"
	)
	void method2838(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2739(this.field1497); // L: 136
		float var6 = var5[0]; // L: 137
		float var7 = var5[1]; // L: 138
		float var8 = var5[2]; // L: 139
		if (this.field1494[var2] != null) { // L: 140
			class117 var9 = this.field1494[var2][3]; // L: 141
			class117 var10 = this.field1494[var2][4]; // L: 142
			class117 var11 = this.field1494[var2][5]; // L: 143
			if (var9 != null) { // L: 144
				var6 = var9.method2777(var4);
			}

			if (var10 != null) { // L: 145
				var7 = var10.method2777(var4);
			}

			if (var11 != null) { // L: 146
				var8 = var11.method2777(var4);
			}
		}

		var1.field4410[12] = var6; // L: 148
		var1.field4410[13] = var7; // L: 149
		var1.field4410[14] = var8; // L: 150
	} // L: 151

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnb;ILdo;II)V",
		garbageValue = "-1985038620"
	)
	void method2825(class388 var1, int var2, class115 var3, int var4) {
		float[] var5 = var3.method2736(this.field1497); // L: 154
		float var6 = var5[0]; // L: 155
		float var7 = var5[1]; // L: 156
		float var8 = var5[2]; // L: 157
		if (this.field1494[var2] != null) { // L: 158
			class117 var9 = this.field1494[var2][6]; // L: 159
			class117 var10 = this.field1494[var2][7]; // L: 160
			class117 var11 = this.field1494[var2][8]; // L: 161
			if (var9 != null) { // L: 162
				var6 = var9.method2777(var4);
			}

			if (var10 != null) { // L: 163
				var7 = var10.method2777(var4);
			}

			if (var11 != null) { // L: 164
				var8 = var11.method2777(var4);
			}
		}

		class388 var12 = MouseHandler.method574(); // L: 166
		var12.method7007(var6, var7, var8); // L: 167
		var1.method7009(var12); // L: 168
		var12.method7027(); // L: 169
	} // L: 170

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "-1031128258"
	)
	static int method2853(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 488
			TaskHandler.Interpreter_intStackSize -= 3; // L: 489
			var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 490
			var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 491
			int var11 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 492
			if (var4 == 0) { // L: 493
				throw new RuntimeException(); // L: 494
			} else {
				Widget var6 = FloorUnderlayDefinition.getWidget(var9); // L: 496
				if (var6.children == null) { // L: 497
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 498
					Widget[] var7 = new Widget[var11 + 1]; // L: 499

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 500
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 501
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 503
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 504
					var12.type = var4; // L: 505
					var12.parentId = var12.id = var6.id; // L: 506
					var12.childIndex = var11; // L: 507
					var12.isIf3 = true; // L: 508
					var6.children[var11] = var12; // L: 509
					if (var2) { // L: 510
						VertexNormal.scriptDotWidget = var12;
					} else {
						class321.scriptActiveWidget = var12; // L: 511
					}

					class220.invalidateWidget(var6); // L: 512
					return 1; // L: 513
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 515
				var3 = var2 ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget; // L: 516
				Widget var10 = FloorUnderlayDefinition.getWidget(var3.id); // L: 517
				var10.children[var3.childIndex] = null; // L: 518
				class220.invalidateWidget(var10); // L: 519
				return 1; // L: 520
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 522
				var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 523
				var3.children = null; // L: 524
				class220.invalidateWidget(var3); // L: 525
				return 1; // L: 526
			} else if (var0 == 103) { // L: 528
				TaskHandler.Interpreter_intStackSize -= 3; // L: 529
				return 1; // L: 530
			} else if (var0 == 104) { // L: 532
				--TaskHandler.Interpreter_intStackSize; // L: 533
				return 1; // L: 534
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 536
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 549
					var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 550
					if (var3 != null) { // L: 551
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 552
						if (var2) { // L: 553
							VertexNormal.scriptDotWidget = var3;
						} else {
							class321.scriptActiveWidget = var3; // L: 554
						}
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 556
					}

					return 1; // L: 557
				} else if (var0 == 202) { // L: 559
					Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] = 0; // L: 560
					return 1; // L: 561
				} else if (var0 == 203) { // L: 563
					Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize + 1] = 0; // L: 564
					return 1; // L: 565
				} else {
					return 2; // L: 567
				}
			} else {
				TaskHandler.Interpreter_intStackSize -= 2; // L: 537
				var9 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 538
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 539
				Widget var5 = class293.getWidgetChild(var9, var4); // L: 540
				if (var5 != null && var4 != -1) { // L: 541
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1; // L: 542
					if (var2) { // L: 543
						VertexNormal.scriptDotWidget = var5;
					} else {
						class321.scriptActiveWidget = var5; // L: 544
					}
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 546
				}

				return 1; // L: 547
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZB)I",
		garbageValue = "1"
	)
	static int method2852(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 3049
			TaskHandler.Interpreter_intStackSize -= 2; // L: 3050
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3051
			var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3052
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 + var4; // L: 3053
			return 1; // L: 3054
		} else if (var0 == ScriptOpcodes.SUB) { // L: 3056
			TaskHandler.Interpreter_intStackSize -= 2; // L: 3057
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3058
			var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3059
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 - var4; // L: 3060
			return 1; // L: 3061
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 3063
			TaskHandler.Interpreter_intStackSize -= 2; // L: 3064
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3065
			var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3066
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4 * var3; // L: 3067
			return 1; // L: 3068
		} else if (var0 == ScriptOpcodes.DIV) { // L: 3070
			TaskHandler.Interpreter_intStackSize -= 2; // L: 3071
			var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3072
			var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3073
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 / var4; // L: 3074
			return 1; // L: 3075
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 3077
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3078
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 3079
			return 1; // L: 3080
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 3082
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]; // L: 3083
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 3084
			return 1; // L: 3085
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 3087
				TaskHandler.Interpreter_intStackSize -= 5; // L: 3088
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3089
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3090
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 3091
				var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3]; // L: 3092
				var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 4]; // L: 3093
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 3094
				return 1; // L: 3095
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 3097
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3098
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3099
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3100
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100; // L: 3101
				return 1; // L: 3102
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 3104
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3105
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3106
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3107
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 3108
				return 1; // L: 3109
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 3111
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3112
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3113
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3114
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 3115
				return 1; // L: 3116
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 3118
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3119
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3120
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3121
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 3122
				return 1; // L: 3123
			} else if (var0 == ScriptOpcodes.MOD) { // L: 3125
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3126
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3127
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3128
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 % var4; // L: 3129
				return 1; // L: 3130
			} else if (var0 == ScriptOpcodes.POW) { // L: 3132
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3133
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3134
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3135
				if (var3 == 0) { // L: 3136
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 3137
				}

				return 1; // L: 3138
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 3140
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3141
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3142
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3143
				if (var3 == 0) { // L: 3144
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 3145
					return 1; // L: 3146
				} else {
					switch(var4) { // L: 3148
					case 0:
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 3166
						break; // L: 3167
					case 1:
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3; // L: 3151
						break;
					case 2:
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 3176
						break;
					case 3:
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 3156
						break; // L: 3157
					case 4:
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 3161
						break; // L: 3162
					default:
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 3171
					}

					return 1; // L: 3180
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 3182
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3183
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3184
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3185
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 & var4; // L: 3186
				return 1; // L: 3187
			} else if (var0 == ScriptOpcodes.OR) { // L: 3189
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3190
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3191
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3192
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 | var4; // L: 3193
				return 1; // L: 3194
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 3196
				TaskHandler.Interpreter_intStackSize -= 3; // L: 3197
				long var9 = (long)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3198
				long var11 = (long)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3199
				long var13 = (long)Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 3200
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11); // L: 3201
				return 1; // L: 3202
			} else if (var0 == ScriptOpcodes.BITCOUNT) { // L: 3204
				var3 = class21.method302(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 3205
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3; // L: 3206
				return 1; // L: 3207
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) { // L: 3209
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3210
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3211
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3212
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 3213
				return 1; // L: 3214
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) { // L: 3216
				TaskHandler.Interpreter_intStackSize -= 3; // L: 3217
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3218
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3219
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 3220
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class137.method2962(var3, var4, var5); // L: 3221
				return 1; // L: 3222
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) { // L: 3224
				TaskHandler.Interpreter_intStackSize -= 3; // L: 3225
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3226
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3227
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 3228
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = ModelData0.method4493(var3, var4, var5); // L: 3229
				return 1; // L: 3230
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) { // L: 3232
				TaskHandler.Interpreter_intStackSize -= 3; // L: 3233
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3234
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3235
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 3236
				var6 = 31 - var5; // L: 3237
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6; // L: 3238
				return 1; // L: 3239
			} else if (var0 == 4030) { // L: 3241
				TaskHandler.Interpreter_intStackSize -= 4; // L: 3242
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3243
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3244
				var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]; // L: 3245
				var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3]; // L: 3246
				var3 = ModelData0.method4493(var3, var5, var6); // L: 3247
				var7 = ScriptEvent.method2168(var6 - var5 + 1); // L: 3248
				if (var4 > var7) { // L: 3249
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 3250
				return 1; // L: 3251
			} else if (var0 == 4032) { // L: 3253
				Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = ChatChannel.method2060(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1]); // L: 3254
				return 1; // L: 3255
			} else if (var0 == 4033) { // L: 3257
				Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.method4969(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1]); // L: 3258
				return 1; // L: 3259
			} else if (var0 == 4034) { // L: 3261
				TaskHandler.Interpreter_intStackSize -= 2; // L: 3262
				var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]; // L: 3263
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]; // L: 3264
				var5 = ClanSettings.method3043(var3, var4); // L: 3265
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5; // L: 3266
				return 1; // L: 3267
			} else if (var0 == 4035) { // L: 3269
				Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1]); // L: 3270
				return 1; // L: 3271
			} else {
				return 2; // L: 3273
			}
		}
	}
}
