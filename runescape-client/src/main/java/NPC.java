import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -274576993
	)
	static int field1295;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1747239789
	)
	static int field1296;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgo;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("w")
	String field1293;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 908915155
	)
	int field1291;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	class474 field1292;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	class189 field1290;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	class189 field1289;

	static {
		field1295 = 1; // L: 18
		field1296 = 1; // L: 20
	}

	NPC() {
		this.field1293 = ""; // L: 13
		this.field1291 = 31; // L: 15
	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-549866424"
	)
	void method2613(String var1) {
		this.field1293 = var1 == null ? "" : var1; // L: 25
	} // L: 26

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhs;",
		garbageValue = "922199662"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 116
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class85.SequenceDefinition_get(super.sequence) : null; // L: 117
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : class85.SequenceDefinition_get(super.movementSequence); // L: 118
			Model var3 = this.definition.method3723(var1, super.sequenceFrame, var2, super.movementFrame, this.field1290); // L: 119
			if (var3 == null) { // L: 120
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 121
				super.defaultHeight = var3.height; // L: 122
				int var4 = var3.indicesCount; // L: 123
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 124
					Model var5 = MouseRecorder.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 125
					if (var5 != null) { // L: 126
						var5.offsetBy(0, -super.field1210, 0); // L: 127
						Model[] var6 = new Model[]{var3, var5}; // L: 128
						var3 = new Model(var6, 2); // L: 129
					}
				}

				if (this.definition.size == 1) { // L: 132
					var3.isSingleTile = true;
				}

				if (super.field1225 != 0 && Client.cycle >= super.field1176 && Client.cycle < super.field1221) { // L: 133
					var3.overrideHue = super.field1180; // L: 134
					var3.overrideSaturation = super.field1227; // L: 135
					var3.overrideLuminance = super.field1224; // L: 136
					var3.overrideAmount = super.field1225; // L: 137
					var3.field2743 = (short)var4; // L: 138
				} else {
					var3.overrideAmount = 0; // L: 141
				}

				return var3; // L: 143
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-92"
	)
	void method2614(int var1) {
		this.field1291 = var1; // L: 29
	} // L: 30

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2024396637"
	)
	boolean method2615(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 33
			return (this.field1291 & 1 << var1) != 0; // L: 34
		} else {
			return true; // L: 36
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2101442521"
	)
	final String method2616() {
		if (!this.field1293.isEmpty()) { // L: 40
			return this.field1293; // L: 41
		} else {
			NPCComposition var1 = this.definition; // L: 43
			if (var1.transforms != null) { // L: 44
				var1 = var1.transform(); // L: 45
				if (var1 == null) { // L: 46
					var1 = this.definition; // L: 47
				}
			}

			return var1.name; // L: 50
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILhz;I)V",
		garbageValue = "-565213758"
	)
	final void method2624(int var1, class208 var2) {
		int var3 = super.pathX[0]; // L: 54
		int var4 = super.pathY[0]; // L: 55
		if (var1 == 0) { // L: 56
			--var3; // L: 57
			++var4; // L: 58
		}

		if (var1 == 1) { // L: 60
			++var4;
		}

		if (var1 == 2) { // L: 61
			++var3; // L: 62
			++var4; // L: 63
		}

		if (var1 == 3) { // L: 65
			--var3;
		}

		if (var1 == 4) { // L: 66
			++var3;
		}

		if (var1 == 5) { // L: 67
			--var3; // L: 68
			--var4; // L: 69
		}

		if (var1 == 6) { // L: 71
			--var4;
		}

		if (var1 == 7) { // L: 72
			++var3; // L: 73
			--var4; // L: 74
		}

		if (super.sequence != -1 && class85.SequenceDefinition_get(super.sequence).field2301 == 1) { // L: 76
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 77
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 78
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 79
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 80
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 81
		}

		super.pathX[0] = var3; // L: 83
		super.pathY[0] = var4; // L: 84
		super.pathTraversed[0] = var2; // L: 85
	} // L: 86

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1025885682"
	)
	final void method2618(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class85.SequenceDefinition_get(super.sequence).field2301 == 1) { // L: 89
			super.sequence = -1;
		}

		if (!var3) { // L: 90
			int var4 = var1 - super.pathX[0]; // L: 91
			int var5 = var2 - super.pathY[0]; // L: 92
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 93
				if (super.pathLength < 9) { // L: 94
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 95
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 96
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 97
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 98
				}

				super.pathX[0] = var1; // L: 100
				super.pathY[0] = var2; // L: 101
				super.pathTraversed[0] = class208.field2360; // L: 102
				return; // L: 103
			}
		}

		super.pathLength = 0; // L: 106
		super.field1230 = 0; // L: 107
		super.field1175 = 0; // L: 108
		super.pathX[0] = var1; // L: 109
		super.pathY[0] = var2; // L: 110
		super.x = super.field1163 * 64 + super.pathX[0] * 128; // L: 111
		super.y = super.field1163 * 64 + super.pathY[0] * 128; // L: 112
	} // L: 113

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1225308448"
	)
	int[] method2655() {
		return this.field1292 != null ? this.field1292.method8894() : this.definition.method3757(); // L: 152 153 155
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)[S",
		garbageValue = "4096"
	)
	short[] method2643() {
		return this.field1292 != null ? this.field1292.method8895() : this.definition.method3749(); // L: 159 160 162
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "-45"
	)
	void method2623(int var1, int var2, short var3) {
		if (this.field1292 == null) { // L: 166
			this.field1292 = new class474(this.definition); // L: 167
		}

		this.field1292.method8896(var1, var2, var3); // L: 169
	} // L: 170

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1227705445"
	)
	void method2612(int[] var1, short[] var2) {
		if (this.field1292 == null) { // L: 173
			this.field1292 = new class474(this.definition); // L: 174
		}

		this.field1292.method8899(var1, var2); // L: 176
	} // L: 177

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-431556971"
	)
	void method2628() {
		this.field1292 = null; // L: 180
	} // L: 181

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lgj;B)V",
		garbageValue = "103"
	)
	void method2626(class189 var1) {
		this.field1289 = var1; // L: 184
	} // L: 185

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Lgj;",
		garbageValue = "47"
	)
	class189 method2633() {
		return this.field1289; // L: 188
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "49596576"
	)
	void method2639(class189 var1) {
		this.field1290 = var1; // L: 192
	} // L: 193

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1591490422"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 147
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1330268400"
	)
	void method2674() {
		this.field1289 = null; // L: 196
	} // L: 197

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1759648321"
	)
	void method2630() {
		this.field1290 = null; // L: 200
	} // L: 201

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "384292747"
	)
	public static int method2679(int var0) {
		return class431.field4688[var0 & 16383]; // L: 28
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1446356611"
	)
	static final void method2678(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12763
		PacketWriter.clientPreferences.method2481(var0); // L: 12764
	} // L: 12765
}
