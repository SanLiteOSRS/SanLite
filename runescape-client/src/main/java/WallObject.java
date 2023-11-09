import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("WallObject")
public final class WallObject {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 831610123
	)
	@Export("z")
	int z;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 507454547
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1495536097
	)
	@Export("y")
	int y;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -167272539
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -62535915
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -7062648959881461387L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -582315537
	)
	@Export("flags")
	int flags;

	WallObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1207780885"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 13
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Lbk;II[I[II)V",
		garbageValue = "809053443"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) { // L: 81
			int var5 = var1 - 1; // L: 82
			int var6 = var2 + 1; // L: 83
			int var7 = (var2 + var1) / 2; // L: 84
			World var8 = var0[var7]; // L: 85
			var0[var7] = var0[var1]; // L: 86
			var0[var1] = var8; // L: 87

			while (var5 < var6) { // L: 88
				boolean var9 = true; // L: 89

				int var10;
				int var11;
				int var12;
				do {
					--var6; // L: 91

					for (var10 = 0; var10 < 4; ++var10) { // L: 92
						if (var3[var10] == 2) { // L: 95
							var11 = var0[var6].index; // L: 96
							var12 = var8.index; // L: 97
						} else if (var3[var10] == 1) { // L: 99
							var11 = var0[var6].population; // L: 100
							var12 = var8.population; // L: 101
							if (var11 == -1 && var4[var10] == 1) { // L: 102
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 103
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 105
							var11 = var0[var6].isMembersOnly() ? 1 : 0; // L: 106
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 107
						} else {
							var11 = var0[var6].id; // L: 110
							var12 = var8.id; // L: 111
						}

						if (var11 != var12) { // L: 113
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) { // L: 116 117
								var9 = false; // L: 119
							}
							break;
						}

						if (var10 == 3) { // L: 114
							var9 = false;
						}
					}
				} while(var9);

				var9 = true; // L: 124

				do {
					++var5; // L: 126

					for (var10 = 0; var10 < 4; ++var10) { // L: 127
						if (var3[var10] == 2) { // L: 130
							var11 = var0[var5].index; // L: 131
							var12 = var8.index; // L: 132
						} else if (var3[var10] == 1) { // L: 134
							var11 = var0[var5].population; // L: 135
							var12 = var8.population; // L: 136
							if (var11 == -1 && var4[var10] == 1) { // L: 137
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) { // L: 138
								var12 = 2001;
							}
						} else if (var3[var10] == 3) { // L: 140
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 141
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 142
						} else {
							var11 = var0[var5].id; // L: 145
							var12 = var8.id; // L: 146
						}

						if (var12 != var11) { // L: 148
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) { // L: 151 152
								var9 = false; // L: 154
							}
							break;
						}

						if (var10 == 3) { // L: 149
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) { // L: 159
					World var13 = var0[var5]; // L: 160
					var0[var5] = var0[var6]; // L: 161
					var0[var6] = var13; // L: 162
				}
			}

			sortWorlds(var0, var1, var6, var3, var4); // L: 165
			sortWorlds(var0, var6 + 1, var2, var3, var4); // L: 166
		}

	} // L: 168

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcg;",
		garbageValue = "1721549658"
	)
	static class82[] method4494() {
		return new class82[]{class82.field1065, class82.field1062, class82.field1064, class82.field1072, class82.field1069}; // L: 16
	}
}
