import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -263924091
	)
	static int field1324;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1957934343
	)
	static int field1326;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("al")
	String field1319;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1047105089
	)
	int field1318;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	class530 field1322;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	class204 field1323;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	class204 field1325;

	static {
		field1324 = 1; // L: 17
		field1326 = 1; // L: 19
	}

	NPC() {
		this.field1319 = ""; // L: 12
		this.field1318 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "218528952"
	)
	void method2621(String var1) {
		this.field1319 = var1 == null ? "" : var1; // L: 24
	} // L: 25

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 115
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class36.SequenceDefinition_get(super.sequence) : null; // L: 116
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : class36.SequenceDefinition_get(super.movementSequence); // L: 117
			Model var3 = null; // L: 118
			if (this.field1323 != null && this.field1323.field2038) { // L: 119
				var3 = TextureProvider.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 120
			} else {
				var3 = this.definition.method3783(var1, super.sequenceFrame, var2, super.movementFrame, this.field1323); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.defaultHeight = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2448(var3); // L: 129
				if (this.definition.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1252 != 0 && Client.cycle >= super.field1247 && Client.cycle < super.field1248) { // L: 131
					var3.overrideHue = super.field1249; // L: 132
					var3.overrideSaturation = super.field1250; // L: 133
					var3.overrideLuminance = super.field1251; // L: 134
					var3.overrideAmount = super.field1252; // L: 135
					var3.field2801 = (short)var4; // L: 136
				} else {
					var3.overrideAmount = 0; // L: 139
				}

				return var3; // L: 141
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1833659778"
	)
	void method2622(int var1) {
		this.field1318 = var1; // L: 28
	} // L: 29

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "113824049"
	)
	boolean method2623(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1318 & 1 << var1) != 0; // L: 33
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-29"
	)
	final String method2672() {
		if (!this.field1319.isEmpty()) { // L: 39
			return this.field1319; // L: 40
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILip;B)V",
		garbageValue = "-1"
	)
	final void method2625(int var1, class231 var2) {
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

		if (super.sequence != -1 && class36.SequenceDefinition_get(super.sequence).field2339 == 1) { // L: 75
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-358090235"
	)
	final void method2681(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class36.SequenceDefinition_get(super.sequence).field2339 == 1) { // L: 88
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
				super.pathTraversed[0] = class231.field2428; // L: 101
				return; // L: 102
			}
		}

		super.pathLength = 0; // L: 105
		super.field1261 = 0; // L: 106
		super.field1233 = 0; // L: 107
		super.pathX[0] = var1; // L: 108
		super.pathY[0] = var2; // L: 109
		super.x = super.field1189 * 64 + super.pathX[0] * 128; // L: 110
		super.y = super.field1189 * 64 + super.pathY[0] * 128; // L: 111
	} // L: 112

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "0"
	)
	int[] method2629() {
		return this.field1322 != null ? this.field1322.method9454() : this.definition.method3791(); // L: 150 151 153
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-288846359"
	)
	short[] method2635() {
		return this.field1322 != null ? this.field1322.method9455() : this.definition.method3802(); // L: 157 158 160
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IISS)V",
		garbageValue = "-15144"
	)
	void method2666(int var1, int var2, short var3) {
		if (this.field1322 == null) { // L: 164
			this.field1322 = new class530(this.definition); // L: 165
		}

		this.field1322.method9456(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "8"
	)
	void method2653(int[] var1, short[] var2) {
		if (this.field1322 == null) { // L: 171
			this.field1322 = new class530(this.definition); // L: 172
		}

		this.field1322.method9457(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-432488525"
	)
	void method2633() {
		this.field1322 = null; // L: 178
	} // L: 179

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)V",
		garbageValue = "-1403637183"
	)
	void method2634(class204 var1) {
		this.field1325 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lhe;",
		garbageValue = "905115149"
	)
	class204 method2646() {
		return this.field1325; // L: 186
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)V",
		garbageValue = "463654606"
	)
	void method2636(class204 var1) {
		this.field1323 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 145
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	void method2637() {
		this.field1325 = null; // L: 194
	} // L: 195

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "257879915"
	)
	void method2638() {
		this.field1323 = null; // L: 198
	} // L: 199

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-965276822"
	)
	static void method2641(int var0) {
	} // L: 32

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	static final int method2684(int var0) {
		return Math.abs(var0 - DecorativeObject.cameraYaw) > 1024 ? 2048 * (var0 < DecorativeObject.cameraYaw ? 1 : -1) + var0 : var0; // L: 4039 4040
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "101752739"
	)
	static void method2643(Buffer var0, int var1) {
		class266.VorbisSample_setData(var0.array, var1); // L: 12814
		HealthBar.method2617(var0, var1); // L: 12815
	} // L: 12816
}
