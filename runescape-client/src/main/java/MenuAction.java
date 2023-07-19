import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static IndexedSprite field907;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = -1441472247
	)
	static int field900;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1237892543
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -505846945
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -627884775
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1900816209
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1583609609
	)
	int field904;
	@ObfuscatedName("ap")
	String field905;
	@ObfuscatedName("av")
	String field906;

	MenuAction() {
	} // L: 12947

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "-1764161188"
	)
	public static final void method2091(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 49
			PcmPlayer.field271 = var0; // L: 50
			PcmPlayer.PcmPlayer_stereo = var1; // L: 51
			PcmPlayer.field274 = var2; // L: 52
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 53

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	static final void method2092() {
		boolean var0 = false; // L: 10143

		while (!var0) { // L: 10144
			var0 = true; // L: 10145

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 10146
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 10147
					String var2 = Client.menuTargets[var1]; // L: 10148
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 10149
					Client.menuTargets[var1 + 1] = var2; // L: 10150
					String var3 = Client.menuActions[var1]; // L: 10151
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 10152
					Client.menuActions[var1 + 1] = var3; // L: 10153
					int var4 = Client.menuOpcodes[var1]; // L: 10154
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 10155
					Client.menuOpcodes[var1 + 1] = var4; // L: 10156
					var4 = Client.menuArguments1[var1]; // L: 10157
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 10158
					Client.menuArguments1[var1 + 1] = var4; // L: 10159
					var4 = Client.menuArguments2[var1]; // L: 10160
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 10161
					Client.menuArguments2[var1 + 1] = var4; // L: 10162
					var4 = Client.menuIdentifiers[var1]; // L: 10163
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 10164
					Client.menuIdentifiers[var1 + 1] = var4; // L: 10165
					var4 = Client.field663[var1]; // L: 10166
					Client.field663[var1] = Client.field663[var1 + 1]; // L: 10167
					Client.field663[var1 + 1] = var4; // L: 10168
					boolean var5 = Client.menuShiftClick[var1]; // L: 10169
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 10170
					Client.menuShiftClick[var1 + 1] = var5; // L: 10171
					var0 = false; // L: 10172
				}
			}
		}

	} // L: 10176

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Lme;B)Z",
		garbageValue = "69"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 11174
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 11175
				int var2 = WorldMapLabelSize.method5145(var0, var1); // L: 11176
				int var3 = var0.cs1ComparisonValues[var1]; // L: 11177
				if (var0.cs1Comparisons[var1] == 2) { // L: 11178
					if (var2 >= var3) { // L: 11179
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 11181
					if (var2 <= var3) { // L: 11182
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 11184
					if (var2 == var3) { // L: 11185
						return false;
					}
				} else if (var3 != var2) { // L: 11187
					return false;
				}
			}

			return true; // L: 11189
		}
	}
}
