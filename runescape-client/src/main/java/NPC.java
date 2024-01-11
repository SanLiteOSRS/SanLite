import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 227380837
	)
	static int field1306;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 704938651
	)
	static int field1302;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ap")
	String field1300;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1939318851
	)
	int field1301;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	class531 field1304;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	class187 field1303;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	class187 field1305;

	static {
		field1306 = 1; // L: 17
		field1302 = 1; // L: 19
	}

	NPC() {
		this.field1300 = ""; // L: 12
		this.field1301 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-9179"
	)
	void method2657(String var1) {
		this.field1300 = var1 == null ? "" : var1; // L: 24
	} // L: 25

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-714420560"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 115
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class9.SequenceDefinition_get(super.sequence) : null; // L: 116
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : class9.SequenceDefinition_get(super.movementSequence); // L: 117
			Model var3 = null; // L: 118
			if (this.field1303 != null && this.field1303.field1942) { // L: 119
				var3 = class25.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 120
			} else {
				var3 = this.definition.method3741(var1, super.sequenceFrame, var2, super.movementFrame, this.field1303); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.defaultHeight = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2486(var3); // L: 129
				if (this.definition.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1237 != 0 && Client.cycle >= super.field1180 && Client.cycle < super.field1233) { // L: 131
					var3.overrideHue = super.field1234; // L: 132
					var3.overrideSaturation = super.field1193; // L: 133
					var3.overrideLuminance = super.field1204; // L: 134
					var3.overrideAmount = super.field1237; // L: 135
					var3.field2995 = (short)var4; // L: 136
				} else {
					var3.overrideAmount = 0; // L: 139
				}

				return var3; // L: 141
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "7344261"
	)
	void method2710(int var1) {
		this.field1301 = var1; // L: 28
	} // L: 29

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-6"
	)
	boolean method2659(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 32
			return (this.field1301 & 1 << var1) != 0; // L: 33
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "946081125"
	)
	final String method2688() {
		if (!this.field1300.isEmpty()) { // L: 39
			return this.field1300; // L: 40
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILir;I)V",
		garbageValue = "-861226584"
	)
	final void method2661(int var1, class231 var2) {
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

		if (super.sequence != -1 && class9.SequenceDefinition_get(super.sequence).field2226 == 1) { // L: 75
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 76
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 77
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 78
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 79
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 80
		}

		super.pathX[0] = var3; // L: 82
		super.pathY[0] = var4; // L: 83
		super.pathTraversed[0] = var2; // L: 84
	} // L: 85

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-242237152"
	)
	final void method2658(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class9.SequenceDefinition_get(super.sequence).field2226 == 1) { // L: 88
			super.sequence = -1;
		}

		if (!var3) { // L: 89
			int var4 = var1 - super.pathX[0]; // L: 90
			int var5 = var2 - super.pathY[0]; // L: 91
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 92
				if (super.pathLength < 9) { // L: 93
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 94
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 95
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 96
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 97
				}

				super.pathX[0] = var1; // L: 99
				super.pathY[0] = var2; // L: 100
				super.pathTraversed[0] = class231.field2458; // L: 101
				return;
			}
		}

		super.pathLength = 0;
		super.field1215 = 0; // L: 106
		super.field1245 = 0; // L: 107
		super.pathX[0] = var1; // L: 108
		super.pathY[0] = var2; // L: 109
		super.x = super.field1175 * 423432192 + super.pathX[0] * 128; // L: 110
		super.y = super.field1175 * 423432192 + super.pathY[0] * 128; // L: 111
	} // L: 112

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1130323337"
	)
	int[] method2665() {
		return this.field1304 != null ? this.field1304.method9626() : this.definition.method3775(); // L: 150 151 153
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "123"
	)
	short[] method2686() {
		return this.field1304 != null ? this.field1304.method9641() : this.definition.method3722(); // L: 157 158 160
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IISS)V",
		garbageValue = "15528"
	)
	void method2692(int var1, int var2, short var3) {
		if (this.field1304 == null) { // L: 164
			this.field1304 = new class531(this.definition); // L: 165
		}

		this.field1304.method9629(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "71"
	)
	void method2668(int[] var1, short[] var2) {
		if (this.field1304 == null) { // L: 171
			this.field1304 = new class531(this.definition); // L: 172
		}

		this.field1304.method9630(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-70950580"
	)
	void method2669() {
		this.field1304 = null; // L: 178
	} // L: 179

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhb;I)V",
		garbageValue = "-192349719"
	)
	void method2670(class187 var1) {
		this.field1305 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lhb;",
		garbageValue = "1033276556"
	)
	class187 method2671() {
		return this.field1305; // L: 186
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhb;I)V",
		garbageValue = "585018689"
	)
	void method2664(class187 var1) {
		this.field1303 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 145
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1763065685"
	)
	void method2673() {
		this.field1305 = null; // L: 194
	} // L: 195

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "426726658"
	)
	void method2674() {
		this.field1303 = null; // L: 198
	} // L: 199

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "1013786616"
	)
	public static long method2718(int var0) {
		if (var0 > 63) { // L: 102
			throw new class405("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0}); // L: 103
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L; // L: 105
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lnn;Lnz;ZI)V",
		garbageValue = "-1941551229"
	)
	public static void method2717(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7; // L: 1004
		var0.field3759 = new PlayerComposition(var1); // L: 1005
		if (!var2) { // L: 1006
			var0.field3759.equipment = Arrays.copyOf(var0.field3759.field3643, var0.field3759.field3643.length); // L: 1007
			var0.field3759.method6383(); // L: 1008
		}

	} // L: 1010
}
