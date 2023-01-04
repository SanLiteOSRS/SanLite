import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1763916019
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1296860225
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1267714979
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -983407105
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1470591223
	)
	@Export("x")
	int x;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1313330391
	)
	@Export("z")
	int z;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1859823171
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2082705889
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("b")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.z = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = ClanSettings.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = class216.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "110882397"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 38
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 39
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 40
					++this.frame; // L: 41
					if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 42
						this.isFinished = true; // L: 43
						break;
					}
				}
			} else {
				this.frame += var1; // L: 49
				if (this.frame >= this.sequenceDefinition.method4024()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lhh;",
		garbageValue = "-1279733976"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ClanSettings.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lom;",
		garbageValue = "-2061778903"
	)
	static class413[] method2028() {
		return new class413[]{class413.field4637, class413.field4636, class413.field4635, class413.field4639}; // L: 16
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "44034066"
	)
	static int method2024() {
		return Login.loginIndex; // L: 2381
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "51"
	)
	static int method2021() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1443
			int var0 = 0; // L: 1444

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1445
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1446
			}

			return var0 * 10000 / Client.field804; // L: 1448
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1124455620"
	)
	static boolean method2026() {
		return (Client.drawPlayerNames & 8) != 0; // L: 5015
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Lkd;II)I",
		garbageValue = "-1546792935"
	)
	static final int method2025(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11041
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11043
				int var3 = 0; // L: 11044
				int var4 = 0; // L: 11045
				byte var5 = 0; // L: 11046

				while (true) {
					int var6 = var2[var4++]; // L: 11048
					int var7 = 0; // L: 11049
					byte var8 = 0; // L: 11050
					if (var6 == 0) { // L: 11051
						return var3;
					}

					if (var6 == 1) { // L: 11052
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11053
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11054
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11055
						var9 = var2[var4++] << 16; // L: 11056
						var9 += var2[var4++]; // L: 11057
						var10 = class175.getWidget(var9); // L: 11058
						var11 = var2[var4++]; // L: 11059
						if (var11 != -1 && (!NPCComposition.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11060
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11061
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11062
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11066
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11067
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11068
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11069
						var7 = class155.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11070
						for (var9 = 0; var9 < 25; ++var9) { // L: 11071
							if (Skills.Skills_enabled[var9]) { // L: 11072
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11075
						var9 = var2[var4++] << 16; // L: 11076
						var9 += var2[var4++]; // L: 11077
						var10 = class175.getWidget(var9); // L: 11078
						var11 = var2[var4++]; // L: 11079
						if (var11 != -1 && (!NPCComposition.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11080
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11081
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11082
									var7 = 999999999; // L: 11083
									break; // L: 11084
								}
							}
						}
					}

					if (var6 == 11) { // L: 11089
						var7 = Client.field629;
					}

					if (var6 == 12) { // L: 11090
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11091
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11092
						int var13 = var2[var4++]; // L: 11093
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11094
					}

					if (var6 == 14) { // L: 11096
						var9 = var2[var4++]; // L: 11097
						var7 = class175.getVarbit(var9); // L: 11098
					}

					if (var6 == 15) { // L: 11100
						var8 = 1;
					}

					if (var6 == 16) { // L: 11101
						var8 = 2;
					}

					if (var6 == 17) { // L: 11102
						var8 = 3;
					}

					if (var6 == 18) { // L: 11103
						var7 = class154.baseX * 64 + (class155.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11104
						var7 = class365.baseY * 64 + (class155.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11105
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11106
						if (var5 == 0) { // L: 11107
							var3 += var7;
						}

						if (var5 == 1) { // L: 11108
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11109
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11110
							var3 *= var7;
						}

						var5 = 0; // L: 11111
					} else {
						var5 = var8; // L: 11113
					}
				}
			} catch (Exception var14) { // L: 11116
				return -1; // L: 11117
			}
		} else {
			return -2;
		}
	}

	public GraphicsObject() {
	}
}
