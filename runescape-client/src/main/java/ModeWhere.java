import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("ModeWhere")
public enum ModeWhere implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4471("", 0, new class386[]{class386.field4441, class386.field4440}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4459("", 1, new class386[]{class386.field4438, class386.field4441, class386.field4440}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4460("", 2, new class386[]{class386.field4438, class386.field4439, class386.field4441}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4461("", 3, new class386[]{class386.field4438}),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4468("", 4),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4463("", 5, new class386[]{class386.field4438, class386.field4441}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4465("", 6, new class386[]{class386.field4441}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4462("", 8, new class386[]{class386.field4438, class386.field4441}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4466("", 9, new class386[]{class386.field4438, class386.field4439}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4458("", 10, new class386[]{class386.field4438}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4464("", 11, new class386[]{class386.field4438}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4469("", 12, new class386[]{class386.field4438, class386.field4441}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	field4470("", 13, new class386[]{class386.field4438});

	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1468460281
	)
	@Export("id")
	final int id;
	@ObfuscatedName("aw")
	final Set field4472;

	static {
		method7301(); // L: 26
	} // L: 27

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lof;)V"
	)
	ModeWhere(String var3, int var4, class386[] var5) {
		this.field4472 = new HashSet();
		this.id = var4; // L: 41
		class386[] var6 = var5; // L: 43

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 44
			class386 var8 = var6[var7]; // L: 45
			this.field4472.add(var8); // L: 46
		}

	} // L: 49

	ModeWhere(String var3, int var4) {
		this.field4472 = new HashSet(); // L: 30
		this.id = var4; // L: 37
	} // L: 38

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 53
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpr;",
		garbageValue = "1372409485"
	)
	static ModeWhere[] method7301() {
		return new ModeWhere[]{field4463, field4465, field4459, field4466, field4460, field4470, field4468, field4469, field4471, field4458, field4462, field4464, field4461}; // L: 33
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Lch;II[I[II)V",
		garbageValue = "-1103489853"
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

						if (var12 != var11) { // L: 149
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1309784879"
	)
	public static boolean method7296(int var0) {
		return (var0 >> 22 & 1) != 0; // L: 25
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Ltq;I)Ljava/lang/Object;",
		garbageValue = "-1843828481"
	)
	static Object method7299(class518 var0) {
		if (var0 == null) { // L: 5378
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5379
		} else {
			switch(var0.field5104) { // L: 5381
			case 0:
				return Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize]; // L: 5387
			case 2:
				return Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 5383
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5385
			}
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IIILdf;B)V",
		garbageValue = "0"
	)
	static void method7304(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) { // L: 3808
			if (var0.field2228 != null && var0.field2228.containsKey(var1)) { // L: 3809
				int var5 = (Integer)var0.field2228.get(var1) & 15; // L: 3810
				if ((var5 <= 0 || class93.clientPreferences.method2551() != 0) && (var5 != 0 || class93.clientPreferences.method2549() != 0)) { // L: 3811
					class152.method3320((Integer)var0.field2228.get(var1), var2, var3, var4 == class25.localPlayer); // L: 3812
				}
			}
		}
	} // L: 3813
}
