import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 814526813
	)
	static int field1311;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2039481379
	)
	static int field1305;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ah")
	String field1306;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 761785473
	)
	int field1308;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	class527 field1309;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	class187 field1313;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	class187 field1312;

	static {
		field1311 = 1; // L: 17
		field1305 = 1; // L: 19
	}

	NPC() {
		this.field1306 = ""; // L: 12
		this.field1308 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-983100224"
	)
	void method2713(String var1) {
		this.field1306 = var1 == null ? "" : var1; // L: 24
	} // L: 25

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lka;",
		garbageValue = "1"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 115
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? DynamicObject.SequenceDefinition_get(super.sequence) : null; // L: 116
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : DynamicObject.SequenceDefinition_get(super.movementSequence); // L: 117
			Model var3 = null; // L: 118
			if (this.field1313 != null && this.field1313.field1914) { // L: 119
				var3 = class229.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 120
			} else {
				var3 = this.definition.method3735(var1, super.sequenceFrame, var2, super.movementFrame, this.field1313); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.defaultHeight = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2469(var3); // L: 129
				if (this.definition.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1237 != 0 && Client.cycle >= super.field1232 && Client.cycle < super.field1215) { // L: 131
					var3.overrideHue = super.field1234; // L: 132
					var3.overrideSaturation = super.field1235; // L: 133
					var3.overrideLuminance = super.field1171; // L: 134
					var3.overrideAmount = super.field1237; // L: 135
					var3.field3006 = (short)var4; // L: 136
				} else {
					var3.overrideAmount = 0; // L: 139
				}

				return var3; // L: 141
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "804243007"
	)
	void method2660(int var1) {
		this.field1308 = var1; // L: 28
	} // L: 29

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1535698170"
	)
	boolean method2661(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 32
			return (this.field1308 & 1 << var1) != 0; // L: 33
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	final String method2662() {
		if (!this.field1306.isEmpty()) { // L: 39
			return this.field1306; // L: 40
		} else {
			NPCComposition var1 = this.definition; // L: 42
			if (var1.transforms != null) { // L: 43
				var1 = var1.transform(); // L: 44
				if (var1 == null) { // L: 45
					var1 = this.definition; // L: 46
				}
			}

			return var1.name; // L: 49
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILiz;I)V",
		garbageValue = "844868343"
	)
	final void method2664(int var1, class228 var2) {
		int var3 = super.pathX[0]; // L: 53
		int var4 = super.pathY[0]; // L: 54
		if (var1 == 0) { // L: 55
			--var3; // L: 56
			++var4; // L: 57
		}

		if (var1 == 1) { // L: 59
			++var4;
		}

		if (var1 == 2) { // L: 60
			++var3; // L: 61
			++var4; // L: 62
		}

		if (var1 == 3) { // L: 64
			--var3;
		}

		if (var1 == 4) { // L: 65
			++var3;
		}

		if (var1 == 5) { // L: 66
			--var3; // L: 67
			--var4; // L: 68
		}

		if (var1 == 6) { // L: 70
			--var4;
		}

		if (var1 == 7) { // L: 71
			++var3; // L: 72
			--var4; // L: 73
		}

		if (super.sequence != -1 && DynamicObject.SequenceDefinition_get(super.sequence).field2205 == 1) { // L: 75
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 76
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "75"
	)
	final void method2702(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && DynamicObject.SequenceDefinition_get(super.sequence).field2205 == 1) { // L: 88
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0]; // L: 90
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = class228.field2409; // L: 101
				return;
			}
		}

		super.pathLength = 0; // L: 105
		super.field1220 = 0; // L: 106
		super.field1245 = 0; // L: 107
		super.pathX[0] = var1; // L: 108
		super.pathY[0] = var2; // L: 109
		super.x = super.field1198 * 64 + super.pathX[0] * 128; // L: 110
		super.y = super.field1198 * 64 + super.pathY[0] * 128; // L: 111
	} // L: 112

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "-23200"
	)
	int[] method2701() {
		return this.field1309 != null ? this.field1309.method9531() : this.definition.method3733(); // L: 150 151 153
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "120"
	)
	short[] method2667() {
		return this.field1309 != null ? this.field1309.method9532() : this.definition.method3694(); // L: 157 158 160
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-558766672"
	)
	void method2666(int var1, int var2, short var3) {
		if (this.field1309 == null) { // L: 164
			this.field1309 = new class527(this.definition); // L: 165
		}

		this.field1309.method9533(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1790507927"
	)
	void method2669(int[] var1, short[] var2) {
		if (this.field1309 == null) { // L: 171
			this.field1309 = new class527(this.definition); // L: 172
		}

		this.field1309.method9534(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2670() {
		this.field1309 = null; // L: 178
	} // L: 179

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhf;I)V",
		garbageValue = "-906762953"
	)
	void method2671(class187 var1) {
		this.field1312 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lhf;",
		garbageValue = "2"
	)
	class187 method2672() {
		return this.field1312; // L: 186
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhf;I)V",
		garbageValue = "-977381781"
	)
	void method2673(class187 var1) {
		this.field1313 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1221291483"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 145
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-434488190"
	)
	void method2674() {
		this.field1312 = null; // L: 194
	} // L: 195

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-923674269"
	)
	void method2675() {
		this.field1313 = null; // L: 198
	} // L: 199

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "-22"
	)
	public static int method2721(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 77
			boolean var3 = false; // L: 78
			boolean var4 = false; // L: 79
			int var5 = 0; // L: 80
			int var6 = var0.length(); // L: 81

			for (int var7 = 0; var7 < var6; ++var7) { // L: 82
				char var8 = var0.charAt(var7); // L: 83
				if (var7 == 0) { // L: 84
					if (var8 == '-') { // L: 85
						var3 = true; // L: 86
						continue;
					}

					if (var8 == '+') { // L: 89
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 91
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 92
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 93
						throw new NumberFormatException(); // L: 94
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 95
					throw new NumberFormatException();
				}

				if (var3) { // L: 96
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 97
				if (var9 / var1 != var5) { // L: 98
					throw new NumberFormatException();
				}

				var5 = var9; // L: 99
				var4 = true; // L: 100
			}

			if (!var4) { // L: 102
				throw new NumberFormatException();
			} else {
				return var5; // L: 103
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1588641318"
	)
	static final int method2719(int var0, int var1) {
		int var2 = var0 + var1 * 57; // L: 993
		var2 ^= var2 << 13; // L: 994
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 995
		return var3 >> 19 & 255; // L: 996
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "2109670231"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 230
		if (var0.sound != null) { // L: 231
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 232
		}

	} // L: 233
}
