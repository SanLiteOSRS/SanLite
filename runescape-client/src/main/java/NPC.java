import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1770985255
	)
	static int field1277;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 413681233
	)
	static int field1274;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("aw")
	String field1272;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -189357307
	)
	int field1271;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	class489 field1282;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	class189 field1275;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	class189 field1278;

	static {
		field1277 = 1;
		field1274 = 1; // L: 19
	}

	NPC() {
		this.field1272 = ""; // L: 12
		this.field1271 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1586819780"
	)
	void method2558(String var1) {
		this.field1272 = var1 == null ? "" : var1; // L: 24
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "-112"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 115
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ItemContainer.SequenceDefinition_get(super.sequence) : null; // L: 116
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : ItemContainer.SequenceDefinition_get(super.movementSequence); // L: 117
			Model var3 = null; // L: 118
			if (this.field1275 != null && this.field1275.field2004) { // L: 119
				var3 = MusicPatchNode.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 120
			} else {
				var3 = this.definition.method3769(var1, super.sequenceFrame, var2, super.movementFrame, this.field1275); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.defaultHeight = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2374(var3); // L: 129
				if (this.definition.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1208 != 0 && Client.cycle >= super.field1168 && Client.cycle < super.field1156) { // L: 131
					var3.overrideHue = super.field1180; // L: 132
					var3.overrideSaturation = super.field1199; // L: 133
					var3.overrideLuminance = super.field1200; // L: 134
					var3.overrideAmount = super.field1208; // L: 135
					var3.field2755 = (short)var4; // L: 136
				} else {
					var3.overrideAmount = 0; // L: 139
				}

				return var3; // L: 141
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1826007749"
	)
	void method2613(int var1) {
		this.field1271 = var1; // L: 28
	} // L: 29

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1164667978"
	)
	boolean method2596(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 32
			return (this.field1271 & 1 << var1) != 0; // L: 33
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1379499313"
	)
	final String method2599() {
		if (!this.field1272.isEmpty()) { // L: 39
			return this.field1272; // L: 40
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILiu;B)V",
		garbageValue = "110"
	)
	final void method2562(int var1, class210 var2) {
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

		if (super.sequence != -1 && ItemContainer.SequenceDefinition_get(super.sequence).field2313 == 1) { // L: 75
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-208577848"
	)
	final void method2563(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && ItemContainer.SequenceDefinition_get(super.sequence).field2313 == 1) { // L: 88
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
				super.pathTraversed[0] = class210.field2389; // L: 101
				return; // L: 102
			}
		}

		super.pathLength = 0; // L: 105
		super.field1210 = 0; // L: 106
		super.field1209 = 0; // L: 107
		super.pathX[0] = var1; // L: 108
		super.pathY[0] = var2; // L: 109
		super.x = super.field1140 * 64 + super.pathX[0] * 128; // L: 110
		super.y = super.field1140 * 64 + super.pathY[0] * 128; // L: 111
	} // L: 112

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "14"
	)
	int[] method2566() {
		return this.field1282 != null ? this.field1282.method9309() : this.definition.method3777(); // L: 150 151 153
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "438914513"
	)
	short[] method2578() {
		return this.field1282 != null ? this.field1282.method9302() : this.definition.method3779(); // L: 157 158 160
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "2033131793"
	)
	void method2568(int var1, int var2, short var3) {
		if (this.field1282 == null) { // L: 164
			this.field1282 = new class489(this.definition); // L: 165
		}

		this.field1282.method9303(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "1712497596"
	)
	void method2593(int[] var1, short[] var2) {
		if (this.field1282 == null) { // L: 171
			this.field1282 = new class489(this.definition); // L: 172
		}

		this.field1282.method9315(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	void method2609() {
		this.field1282 = null; // L: 178
	} // L: 179

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lhv;I)V",
		garbageValue = "-1457608941"
	)
	void method2571(class189 var1) {
		this.field1278 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lhv;",
		garbageValue = "-767962512"
	)
	class189 method2572() {
		return this.field1278; // L: 186
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lhv;I)V",
		garbageValue = "1428478753"
	)
	void method2573(class189 var1) {
		this.field1275 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1666539507"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 145
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "17996"
	)
	void method2618() {
		this.field1278 = null; // L: 194
	} // L: 195

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-112"
	)
	void method2575() {
		this.field1275 = null; // L: 198
	} // L: 199

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "-54"
	)
	public static void method2627(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1228620083"
	)
	static final float method2626(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 25
		return (var1 * 1.0075567F - 75.56675F) / var1; // L: 26
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "599275396"
	)
	protected static final void method2628() {
		class399.clock.mark(); // L: 423

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 424
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 425
			GameEngine.clientTickTimes[var0] = 0L;
		}

		DirectByteArrayCopier.gameCyclesToDo = 0; // L: 426
	} // L: 427
}
