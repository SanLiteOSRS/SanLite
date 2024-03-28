import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public static AbstractArchive field2195;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static EvictingDualNodeHashTable field2191;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = -408656389
	)
	static int field2198;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1195864831
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1033818315
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1026128439
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1892156123
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -995882387
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		field2191 = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "415277164"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 32
	} // L: 33

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "508531998"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 37
			if (var3 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var3, var2); // L: 39
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;III)V",
		garbageValue = "1821566574"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 44
			this.rgb = var1.readMedium();
		}

	} // L: 46

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "400288729"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 49
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 50
		double var6 = (double)(var1 & 255) / 256.0D; // L: 51
		double var8 = var2; // L: 52
		if (var4 < var2) { // L: 53
			var8 = var4;
		}

		if (var6 < var8) { // L: 54
			var8 = var6;
		}

		double var10 = var2; // L: 55
		if (var4 > var2) { // L: 56
			var10 = var4;
		}

		if (var6 > var10) { // L: 57
			var10 = var6;
		}

		double var12 = 0.0D; // L: 58
		double var14 = 0.0D; // L: 59
		double var16 = (var8 + var10) / 2.0D; // L: 60
		if (var8 != var10) { // L: 61
			if (var16 < 0.5D) { // L: 62
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) { // L: 63
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 64
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 65
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 66
			}
		}

		var12 /= 6.0D; // L: 68
		this.saturation = (int)(var14 * 256.0D); // L: 69
		this.lightness = (int)(256.0D * var16); // L: 70
		if (this.saturation < 0) { // L: 71
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 72
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 73
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 74
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 75
			this.hueMultiplier = (int)((1.0D - var16) * var14 * 512.0D);
		} else {
			this.hueMultiplier = (int)(var14 * var16 * 512.0D); // L: 76
		}

		if (this.hueMultiplier < 1) { // L: 77
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 78
	} // L: 79

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Lck;II[I[IB)V",
		garbageValue = "62"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 82
			int var5 = var1 - 1; // L: 83
			int var6 = var2 + 1; // L: 84
			int var7 = (var2 + var1) / 2; // L: 85
			World var8 = var0[var7]; // L: 86
			var0[var7] = var0[var1]; // L: 87
			var0[var1] = var8; // L: 88

			while (var5 < var6) { // L: 89
				boolean var9 = true; // L: 90

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 92

					for (var10 = 0; var10 < 4; ++var10) { // L: 93
						if (var3[var10] == 2) { // L: 96
							var11 = var0[var6].index; // L: 97
							var12 = var8.index; // L: 98
						} else if (var3[var10] == 1) { // L: 100
							var11 = var0[var6].population; // L: 101
							var12 = var8.population; // L: 102
							if (var11 == -1 && var4[var10] == 1) { // L: 103
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 104
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 106
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 107
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 108
						} else {
							var11 = var0[var6].id; // L: 111
							var12 = var8.id; // L: 112
						}

						if (var12 != var11) { // L: 114
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 117 118
								var9 = false; // L: 120
							}
							break;
						}

						if (var10 == 3) { // L: 115
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 125

				do {
					++var5; // L: 127

					for (var10 = 0; var10 < 4; ++var10) { // L: 128
						if (var3[var10] == 2) { // L: 131
							var11 = var0[var5].index; // L: 132
							var12 = var8.index; // L: 133
						} else if (var3[var10] == 1) { // L: 135
							var11 = var0[var5].population; // L: 136
							var12 = var8.population; // L: 137
							if (var11 == -1 && var4[var10] == 1) { // L: 138
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 139
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 141
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 142
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 143
						} else {
							var11 = var0[var5].id; // L: 146
							var12 = var8.id; // L: 147
						}

						if (var11 != var12) { // L: 149
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 152 153
								var9 = false; // L: 155
							}
							break;
						}

						if (var10 == 3) { // L: 150
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 160
					World var13 = var0[var5]; // L: 161
					var0[var5] = var0[var6]; // L: 162
					var0[var6] = var13; // L: 163
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 166
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 167
		}

	} // L: 169

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "-16"
	)
	static int method3965(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 5119
			int var5 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 5120
			NPCComposition var6 = UserComparator10.getNpcDefinition(var5); // L: 5121
			Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 5122
			return 1; // L: 5123
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 5125
				class19.Interpreter_intStackSize -= 2; // L: 5126
				var3 = UserComparator10.getNpcDefinition(Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize]); // L: 5127
				int var4 = Interpreter.Interpreter_intStack[class19.Interpreter_intStackSize + 1]; // L: 5128
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.method3877(var4); // L: 5129
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.method3890(var4); // L: 5130
				return 1; // L: 5131
			} else if (var0 == 6765) { // L: 5133
				var3 = UserComparator10.getNpcDefinition(Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]); // L: 5134
				Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5135
				return 1; // L: 5136
			} else {
				return 2; // L: 5138
			}
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Ldv;ZI)V",
		garbageValue = "19136782"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 12559
		int var3 = (int)var0.key; // L: 12560
		var0.remove(); // L: 12561
		if (var1) { // L: 12562
			class243.field2620.method6283(var2);
		}

		for (IntegerNode var4 = (IntegerNode)Client.widgetFlags.first(); var4 != null; var4 = (IntegerNode)Client.widgetFlags.next()) { // L: 12564
			if ((var4.key >> 48 & 65535L) == (long)var2) { // L: 12565
				var4.remove(); // L: 12566
			}
		}

		Widget var5 = class243.field2620.method6281(var3); // L: 12570
		if (var5 != null) {
			WorldMapData_0.invalidateWidget(var5); // L: 12571
		}

		if (Client.rootInterface != -1) { // L: 12572
			Login.method2161(Client.rootInterface, 1);
		}

	} // L: 12573
}
