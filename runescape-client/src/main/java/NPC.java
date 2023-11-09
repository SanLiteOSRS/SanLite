import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -936794839
	)
	static int field1314;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 719493761
	)
	static int field1308;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("aj")
	String field1309;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1782998233
	)
	int field1311;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	class513 field1312;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	class194 field1316;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	class194 field1315;

	static {
		field1314 = 1; // L: 17
		field1308 = 1;
	}

	NPC() {
		this.field1309 = ""; // L: 12
		this.field1311 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-23"
	)
	void method2645(String var1) {
		this.field1309 = var1 == null ? "" : var1; // L: 24
	} // L: 25

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljr;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 115
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class140.SequenceDefinition_get(super.sequence) : null; // L: 116
			SequenceDefinition var2 = super.movementSequence != -1 && (super.movementSequence != super.idleSequence || var1 == null) ? class140.SequenceDefinition_get(super.movementSequence) : null; // L: 117
			Model var3 = null; // L: 118
			if (this.field1316 != null && this.field1316.field2005) { // L: 119
				var3 = class27.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 120
			} else {
				var3 = this.definition.method3871(var1, super.sequenceFrame, var2, super.movementFrame, this.field1316); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.defaultHeight = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2452(var3); // L: 129
				if (this.definition.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1243 != 0 && Client.cycle >= super.field1183 && Client.cycle < super.field1189) { // L: 131
					var3.overrideHue = super.field1240; // L: 132
					var3.overrideSaturation = super.field1247; // L: 133
					var3.overrideLuminance = super.field1190; // L: 134
					var3.overrideAmount = super.field1243; // L: 135
					var3.field2699 = (short)var4; // L: 136
				} else {
					var3.overrideAmount = 0; // L: 139
				}

				return var3; // L: 141
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "51"
	)
	void method2628(int var1) {
		this.field1311 = var1; // L: 28
	} // L: 29

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "590380682"
	)
	boolean method2629(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 32
			return (this.field1311 & 1 << var1) != 0; // L: 33
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1723956105"
	)
	final String method2643() {
		if (!this.field1309.isEmpty()) { // L: 39
			return this.field1309; // L: 40
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILia;I)V",
		garbageValue = "1558446688"
	)
	final void method2675(int var1, class217 var2) {
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

		if (super.sequence != -1 && class140.SequenceDefinition_get(super.sequence).field2275 == 1) { // L: 75
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "381916393"
	)
	final void method2662(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class140.SequenceDefinition_get(super.sequence).field2275 == 1) { // L: 88
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
				super.pathTraversed[0] = class217.field2391; // L: 101
				return; // L: 102
			}
		}

		super.pathLength = 0; // L: 105
		super.field1252 = 0; // L: 106
		super.field1251 = 0; // L: 107
		super.pathX[0] = var1; // L: 108
		super.pathY[0] = var2; // L: 109
		super.x = super.field1181 * 64 + super.pathX[0] * 128; // L: 110
		super.y = super.field1181 * 64 + super.pathY[0] * 128; // L: 111
	} // L: 112

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1350830987"
	)
	int[] method2634() {
		return this.field1312 != null ? this.field1312.method9314() : this.definition.method3822(); // L: 150 151 153
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1935684442"
	)
	short[] method2688() {
		return this.field1312 != null ? this.field1312.method9315() : this.definition.method3824(); // L: 157 158 160
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "2128885265"
	)
	void method2636(int var1, int var2, short var3) {
		if (this.field1312 == null) { // L: 164
			this.field1312 = new class513(this.definition); // L: 165
		}

		this.field1312.method9320(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "238846511"
	)
	void method2682(int[] var1, short[] var2) {
		if (this.field1312 == null) { // L: 171
			this.field1312 = new class513(this.definition); // L: 172
		}

		this.field1312.method9325(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "2047"
	)
	void method2638() {
		this.field1312 = null; // L: 178
	} // L: 179

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)V",
		garbageValue = "1802722879"
	)
	void method2639(class194 var1) {
		this.field1315 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Lhh;",
		garbageValue = "-64"
	)
	class194 method2640() {
		return this.field1315; // L: 186
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)V",
		garbageValue = "1736703786"
	)
	void method2648(class194 var1) {
		this.field1316 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "90"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 145
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-524616825"
	)
	void method2642() {
		this.field1315 = null; // L: 194
	} // L: 195

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	void method2646() {
		this.field1316 = null; // L: 198
	} // L: 199

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;B)V",
		garbageValue = "-85"
	)
	public static void method2658(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.field1913 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lme;B)Lme;",
		garbageValue = "-73"
	)
	static Widget method2687(Widget var0) {
		int var2 = class19.getWidgetFlags(var0); // L: 12675
		int var1 = var2 >> 17 & 7; // L: 12677
		int var3 = var1; // L: 12679
		if (var1 == 0) { // L: 12680
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) { // L: 12681
				var0 = Interpreter.getWidget(var0.parentId); // L: 12682
				if (var0 == null) { // L: 12683
					return null;
				}
			}

			return var0; // L: 12685
		}
	}
}
