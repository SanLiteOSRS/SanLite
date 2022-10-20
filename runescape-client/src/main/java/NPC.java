import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("f")
	String field1265;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1190695941
	)
	int field1268;

	NPC() {
		this.field1265 = ""; // L: 11
		this.field1268 = 31; // L: 13
	} // L: 15

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1936513030"
	)
	void method2488(String var1) {
		this.field1265 = var1 == null ? "" : var1; // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lha;",
		garbageValue = "-157507070"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 109
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapElement.SequenceDefinition_get(super.sequence) : null; // L: 110
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? WorldMapElement.SequenceDefinition_get(super.movementSequence) : null; // L: 111
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 112
			if (var3 == null) { // L: 113
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 114
				super.defaultHeight = var3.height; // L: 115
				int var4 = var3.indicesCount; // L: 116
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 117
					Model var5 = ReflectionCheck.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 118
					if (var5 != null) { // L: 119
						var5.offsetBy(0, -super.field1159, 0); // L: 120
						Model[] var6 = new Model[]{var3, var5}; // L: 121
						var3 = new Model(var6, 2); // L: 122
					}
				}

				if (this.definition.size == 1) { // L: 125
					var3.isSingleTile = true;
				}

				if (super.field1202 != 0 && Client.cycle >= super.field1197 && Client.cycle < super.field1198) { // L: 126
					var3.overrideHue = super.field1199; // L: 127
					var3.overrideSaturation = super.field1200; // L: 128
					var3.overrideLuminance = super.field1185; // L: 129
					var3.overrideAmount = super.field1202; // L: 130
					var3.field2667 = (short)var4; // L: 131
				} else {
					var3.overrideAmount = 0; // L: 134
				}

				return var3; // L: 136
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "44"
	)
	void method2489(int var1) {
		this.field1268 = var1; // L: 22
	} // L: 23

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-41"
	)
	boolean method2511(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 26
			return (this.field1268 & 1 << var1) != 0; // L: 27
		} else {
			return true; // L: 29
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "659712992"
	)
	final String method2492() {
		if (!this.field1265.isEmpty()) { // L: 33
			return this.field1265; // L: 34
		} else {
			NPCComposition var1 = this.definition; // L: 36
			if (var1.transforms != null) { // L: 37
				var1 = var1.transform(); // L: 38
				if (var1 == null) { // L: 39
					var1 = this.definition; // L: 40
				}
			}

			return var1.name; // L: 43
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILgo;B)V",
		garbageValue = "-73"
	)
	final void method2487(int var1, class202 var2) {
		int var3 = super.pathX[0]; // L: 47
		int var4 = super.pathY[0]; // L: 48
		if (var1 == 0) { // L: 49
			--var3; // L: 50
			++var4; // L: 51
		}

		if (var1 == 1) { // L: 53
			++var4;
		}

		if (var1 == 2) { // L: 54
			++var3; // L: 55
			++var4; // L: 56
		}

		if (var1 == 3) { // L: 58
			--var3;
		}

		if (var1 == 4) { // L: 59
			++var3;
		}

		if (var1 == 5) { // L: 60
			--var3; // L: 61
			--var4; // L: 62
		}

		if (var1 == 6) { // L: 64
			--var4;
		}

		if (var1 == 7) { // L: 65
			++var3; // L: 66
			--var4; // L: 67
		}

		if (super.sequence != -1 && WorldMapElement.SequenceDefinition_get(super.sequence).field2211 == 1) { // L: 69
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 70
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 71
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 72
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 73
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 74
		}

		super.pathX[0] = var3; // L: 76
		super.pathY[0] = var4; // L: 77
		super.pathTraversed[0] = var2; // L: 78
	} // L: 79

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIZS)V",
		garbageValue = "-22787"
	)
	final void method2497(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && WorldMapElement.SequenceDefinition_get(super.sequence).field2211 == 1) { // L: 82
			super.sequence = -1;
		}

		if (!var3) { // L: 83
			int var4 = var1 - super.pathX[0]; // L: 84
			int var5 = var2 - super.pathY[0]; // L: 85
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 86
				if (super.pathLength < 9) { // L: 87
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 88
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 89
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 90
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 91
				}

				super.pathX[0] = var1; // L: 93
				super.pathY[0] = var2; // L: 94
				super.pathTraversed[0] = class202.field2282; // L: 95
				return; // L: 96
			}
		}

		super.pathLength = 0; // L: 99
		super.field1211 = 0; // L: 100
		super.field1172 = 0; // L: 101
		super.pathX[0] = var1; // L: 102
		super.pathY[0] = var2; // L: 103
		super.x = super.field1201 * 64 + super.pathX[0] * 128; // L: 104
		super.y = super.field1201 * 64 + super.pathY[0] * 128; // L: 105
	} // L: 106

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "246357037"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 140
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-621878720"
	)
	static boolean method2494(String var0) {
		if (var0 == null) { // L: 156
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 163
			} catch (MalformedURLException var2) { // L: 160
				return false; // L: 161
			}
		}
	}
}
