import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("h")
	String field1258;

	NPC() {
		this.field1258 = ""; // L: 11
	} // L: 13

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1708053046"
	)
	void method2333(String var1) {
		this.field1258 = var1 == null ? "" : var1; // L: 16
	} // L: 17

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Lhp;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 96
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ByteArrayPool.SequenceDefinition_get(super.sequence) : null; // L: 97
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? ByteArrayPool.SequenceDefinition_get(super.movementSequence) : null; // L: 98
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 99
			if (var3 == null) { // L: 100
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 101
				super.defaultHeight = var3.height; // L: 102
				int var4 = var3.indicesCount; // L: 103
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 104
					Model var5 = ArchiveDisk.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 105
					if (var5 != null) { // L: 106
						var5.offsetBy(0, -super.field1195, 0); // L: 107
						Model[] var6 = new Model[]{var3, var5}; // L: 108
						var3 = new Model(var6, 2); // L: 109
					}
				}

				if (this.definition.size == 1) { // L: 112
					var3.isSingleTile = true;
				}

				if (super.field1192 != 0 && Client.cycle >= super.field1187 && Client.cycle < super.field1188) { // L: 113
					var3.overrideHue = super.field1189; // L: 114
					var3.overrideSaturation = super.field1131; // L: 115
					var3.overrideLuminance = super.field1191; // L: 116
					var3.overrideAmount = super.field1192; // L: 117
					var3.field2527 = (short)var4; // L: 118
				} else {
					var3.overrideAmount = 0; // L: 121
				}

				return var3; // L: 123
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "83"
	)
	final String method2314() {
		if (!this.field1258.isEmpty()) { // L: 20
			return this.field1258; // L: 21
		} else {
			NPCComposition var1 = this.definition; // L: 23
			if (var1.transforms != null) { // L: 24
				var1 = var1.transform(); // L: 25
				if (var1 == null) { // L: 26
					var1 = this.definition; // L: 27
				}
			}

			return var1.name; // L: 30
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILgi;B)V",
		garbageValue = "64"
	)
	final void method2315(int var1, class192 var2) {
		int var3 = super.pathX[0]; // L: 34
		int var4 = super.pathY[0]; // L: 35
		if (var1 == 0) { // L: 36
			--var3; // L: 37
			++var4; // L: 38
		}

		if (var1 == 1) { // L: 40
			++var4;
		}

		if (var1 == 2) { // L: 41
			++var3; // L: 42
			++var4; // L: 43
		}

		if (var1 == 3) { // L: 45
			--var3;
		}

		if (var1 == 4) { // L: 46
			++var3;
		}

		if (var1 == 5) { // L: 47
			--var3; // L: 48
			--var4; // L: 49
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4; // L: 54
		}

		if (super.sequence != -1 && ByteArrayPool.SequenceDefinition_get(super.sequence).field2180 == 1) {
			super.sequence = -1; // L: 56
		}

		if (super.pathLength < 9) { // L: 57
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 58
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 59
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 60
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 61
		}

		super.pathX[0] = var3; // L: 63
		super.pathY[0] = var4; // L: 64
		super.pathTraversed[0] = var2; // L: 65
	} // L: 66

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1292121019"
	)
	final void method2316(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && ByteArrayPool.SequenceDefinition_get(super.sequence).field2180 == 1) { // L: 69
			super.sequence = -1;
		}

		if (!var3) { // L: 70
			int var4 = var1 - super.pathX[0]; // L: 71
			int var5 = var2 - super.pathY[0]; // L: 72
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 73
				if (super.pathLength < 9) { // L: 74
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 75
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 76
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 77
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 78
				}

				super.pathX[0] = var1; // L: 80
				super.pathY[0] = var2; // L: 81
				super.pathTraversed[0] = class192.field2206; // L: 82
				return; // L: 83
			}
		}

		super.pathLength = 0; // L: 86
		super.field1201 = 0; // L: 87
		super.field1200 = 0; // L: 88
		super.pathX[0] = var1; // L: 89
		super.pathY[0] = var2; // L: 90
		super.x = super.pathX[0] * 128 + super.field1190 * -1534074048; // L: 91
		super.y = super.field1190 * -1534074048 + super.pathY[0] * 128; // L: 92
	} // L: 93

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-18"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 127
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2056731845"
	)
	public static int method2334(int var0, int var1, int var2) {
		int var3 = class14.method171(var2 - var1 + 1); // L: 51
		var3 <<= var1; // L: 52
		return var0 & ~var3; // L: 53
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	static void method2320(int var0) {
		Client.oculusOrbState = var0; // L: 12225
	} // L: 12226
}
