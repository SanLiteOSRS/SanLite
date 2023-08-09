import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1889468353
	)
	static int field1315;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1075939431
	)
	static int field1317;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ay")
	String field1310;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1715482361
	)
	int field1318;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	class514 field1313;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	class194 field1314;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	class194 field1316;

	static {
		field1315 = 1; // L: 17
		field1317 = 1; // L: 19
	}

	NPC() {
		this.field1310 = ""; // L: 12
		this.field1318 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-265998562"
	)
	void method2588(String var1) {
		this.field1310 = var1 == null ? "" : var1; // L: 24
	} // L: 25

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "-983173466"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 115
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class135.SequenceDefinition_get(super.sequence) : null; // L: 116
			SequenceDefinition var2 = super.movementSequence != -1 && (super.movementSequence != super.idleSequence || var1 == null) ? class135.SequenceDefinition_get(super.movementSequence) : null; // L: 117
			Model var3 = null; // L: 118
			if (this.field1314 != null && this.field1314.field1994) { // L: 119
				var3 = class136.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 120
			} else {
				var3 = this.definition.method3704(var1, super.sequenceFrame, var2, super.movementFrame, this.field1314); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.defaultHeight = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2391(var3); // L: 129
				if (this.definition.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1248 != 0 && Client.cycle >= super.field1183 && Client.cycle < super.field1244) { // L: 131
					var3.overrideHue = super.field1245; // L: 132
					var3.overrideSaturation = super.field1238; // L: 133
					var3.overrideLuminance = super.field1247; // L: 134
					var3.overrideAmount = super.field1248; // L: 135
					var3.field2684 = (short)var4; // L: 136
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
		garbageValue = "1401431099"
	)
	void method2601(int var1) {
		this.field1318 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1067111578"
	)
	boolean method2590(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 32
			return (this.field1318 & 1 << var1) != 0; // L: 33
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2003079034"
	)
	final String method2591() {
		if (!this.field1310.isEmpty()) {
			return this.field1310; // L: 40
		} else {
			NPCComposition var1 = this.definition; // L: 42
			if (var1.transforms != null) { // L: 43
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition; // L: 46
				}
			}

			return var1.name;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILio;I)V",
		garbageValue = "69019912"
	)
	final void method2592(int var1, class218 var2) {
		int var3 = super.pathX[0]; // L: 53
		int var4 = super.pathY[0];
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

		if (super.sequence != -1 && class135.SequenceDefinition_get(super.sequence).field2284 == 1) {
			super.sequence = -1; // L: 75
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "0"
	)
	final void method2593(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class135.SequenceDefinition_get(super.sequence).field2284 == 1) { // L: 88
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
				super.pathTraversed[0] = class218.field2384; // L: 101
				return; // L: 102
			}
		}

		super.pathLength = 0; // L: 105
		super.field1257 = 0; // L: 106
		super.field1256 = 0; // L: 107
		super.pathX[0] = var1; // L: 108
		super.pathY[0] = var2; // L: 109
		super.x = super.field1223 * 64 + super.pathX[0] * 128; // L: 110
		super.y = super.field1223 * 64 + super.pathY[0] * 128; // L: 111
	} // L: 112

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1083968241"
	)
	int[] method2596() {
		return this.field1313 != null ? this.field1313.method9349() : this.definition.method3720(); // L: 150 151 153
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "77"
	)
	short[] method2621() {
		return this.field1313 != null ? this.field1313.method9350() : this.definition.method3750(); // L: 157 158 160
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "0"
	)
	void method2597(int var1, int var2, short var3) {
		if (this.field1313 == null) { // L: 164
			this.field1313 = new class514(this.definition); // L: 165
		}

		this.field1313.method9351(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1811218204"
	)
	void method2594(int[] var1, short[] var2) {
		if (this.field1313 == null) { // L: 171
			this.field1313 = new class514(this.definition); // L: 172
		}

		this.field1313.method9359(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1565977870"
	)
	void method2625() {
		this.field1313 = null; // L: 178
	} // L: 179

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)V",
		garbageValue = "-1331713030"
	)
	void method2605(class194 var1) {
		this.field1316 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lhs;",
		garbageValue = "-1510314469"
	)
	class194 method2602() {
		return this.field1316; // L: 186
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)V",
		garbageValue = "-1722306850"
	)
	void method2603(class194 var1) {
		this.field1314 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 145
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-883060880"
	)
	void method2604() {
		this.field1316 = null; // L: 194
	} // L: 195

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1751428186"
	)
	void method2598() {
		this.field1314 = null; // L: 198
	} // L: 199

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-9"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 28
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 29
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 31
					return; // L: 58
				} catch (Exception var4) { // L: 34
				}
			}

			if (class31.field176.startsWith("win")) { // L: 36
				class351.method6662(var0, 0, "openjs"); // L: 39
			} else if (class31.field176.startsWith("mac")) { // L: 44
				class351.method6662(var0, 1, "openjs"); // L: 45
			} else {
				class351.method6662(var0, 2, "openjs"); // L: 49
			}
		} else {
			class351.method6662(var0, 3, "openjs"); // L: 54
		}

	}
}
