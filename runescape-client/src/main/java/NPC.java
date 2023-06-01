import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1921553413
	)
	static int field1271;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1393608317
	)
	static int field1277;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ar")
	String field1270;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1376723111
	)
	int field1276;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	class501 field1273;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	class193 field1274;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	class193 field1278;

	static {
		field1271 = 1; // L: 17
		field1277 = 1; // L: 19
	}

	NPC() {
		this.field1270 = ""; // L: 12
		this.field1276 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1592156551"
	)
	void method2549(String var1) {
		this.field1270 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljh;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 115
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class149.SequenceDefinition_get(super.sequence) : null; // L: 116
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : class149.SequenceDefinition_get(super.movementSequence); // L: 117
			Model var3 = null; // L: 118
			if (this.field1274 != null && this.field1274.field2004) { // L: 119
				var3 = HitSplatDefinition.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 120
			} else {
				var3 = this.definition.method3707(var1, super.sequenceFrame, var2, super.movementFrame, this.field1274); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.defaultHeight = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2361(var3); // L: 129
				if (this.definition.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1205 != 0 && Client.cycle >= super.field1200 && Client.cycle < super.field1201) { // L: 131
					var3.overrideHue = super.field1175; // L: 132
					var3.overrideSaturation = super.field1203; // L: 133
					var3.overrideLuminance = super.field1153; // L: 134
					var3.overrideAmount = super.field1205; // L: 135
					var3.field2760 = (short)var4; // L: 136
				} else {
					var3.overrideAmount = 0; // L: 139
				}

				return var3; // L: 141
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "36"
	)
	void method2581(int var1) {
		this.field1276 = var1; // L: 28
	} // L: 29

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "870336862"
	)
	boolean method2551(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 32
			return (this.field1276 & 1 << var1) != 0; // L: 33
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "844088109"
	)
	final String method2552() {
		if (!this.field1270.isEmpty()) { // L: 39
			return this.field1270; // L: 40
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILip;B)V",
		garbageValue = "36"
	)
	final void method2557(int var1, class216 var2) {
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

		if (super.sequence != -1 && class149.SequenceDefinition_get(super.sequence).field2291 == 1) { // L: 75
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2081736519"
	)
	final void method2572(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class149.SequenceDefinition_get(super.sequence).field2291 == 1) { // L: 88
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
				super.pathTraversed[0] = class216.field2381; // L: 101
				return; // L: 102
			}
		}

		super.pathLength = 0; // L: 105
		super.field1214 = 0; // L: 106
		super.field1213 = 0; // L: 107
		super.pathX[0] = var1; // L: 108
		super.pathY[0] = var2; // L: 109
		super.x = super.field1147 * -3932160 + super.pathX[0] * 128; // L: 110
		super.y = super.field1147 * -3932160 + super.pathY[0] * 128; // L: 111
	} // L: 112

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1985139913"
	)
	int[] method2562() {
		return this.field1273 != null ? this.field1273.method9216() : this.definition.method3679(); // L: 150 151 153
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "-20"
	)
	short[] method2550() {
		return this.field1273 != null ? this.field1273.method9210() : this.definition.method3683(); // L: 157 158 160
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "725588373"
	)
	void method2553(int var1, int var2, short var3) {
		if (this.field1273 == null) { // L: 164
			this.field1273 = new class501(this.definition); // L: 165
		}

		this.field1273.method9214(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1249405894"
	)
	void method2607(int[] var1, short[] var2) {
		if (this.field1273 == null) { // L: 171
			this.field1273 = new class501(this.definition); // L: 172
		}

		this.field1273.method9212(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-610002372"
	)
	void method2561() {
		this.field1273 = null; // L: 178
	} // L: 179

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "-39357641"
	)
	void method2554(class193 var1) {
		this.field1278 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lht;",
		garbageValue = "371550634"
	)
	class193 method2563() {
		return this.field1278; // L: 186
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "2053471863"
	)
	void method2594(class193 var1) {
		this.field1274 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-964531656"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 145
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	void method2558() {
		this.field1278 = null; // L: 194
	} // L: 195

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1275562677"
	)
	void method2566() {
		this.field1274 = null; // L: 198
	} // L: 199

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public static boolean method2611() {
		ReflectionCheck var0 = (ReflectionCheck)class36.reflectionChecks.last(); // L: 24
		return var0 != null; // L: 25
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lmo;IIII)V",
		garbageValue = "1770291117"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3686 == null) { // L: 1225
			throw new RuntimeException(); // L: 1226
		} else {
			var0.field3686[var1] = var2; // L: 1228
			var0.field3687[var1] = var3; // L: 1229
		}
	} // L: 1230
}
