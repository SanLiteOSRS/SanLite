import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class156 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 4578511467478170483L
	)
	long field1775;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 1193244438836580063L
	)
	long field1772;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	IterableNodeDeque field1773;

	@ObfuscatedSignature(
		descriptor = "(Lrd;)V"
	)
	public class156(Buffer var1) {
		this.field1772 = -1L; // L: 10
		this.field1773 = new IterableNodeDeque(); // L: 11
		this.method3336(var1); // L: 19
	} // L: 20

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-2055199078"
	)
	void method3336(Buffer var1) {
		this.field1775 = var1.readLong(); // L: 23
		this.field1772 = var1.readLong(); // L: 24

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 25 26 36
			Object var3;
			if (var2 == 1) { // L: 28
				var3 = new class151(this);
			} else if (var2 == 4) {
				var3 = new class162(this); // L: 29
			} else if (var2 == 3) { // L: 30
				var3 = new class147(this);
			} else if (var2 == 2) { // L: 31
				var3 = new class145(this);
			} else {
				if (var2 != 5) { // L: 32
					throw new RuntimeException(""); // L: 33
				}

				var3 = new class152(this);
			}

			((class155)var3).vmethod3387(var1); // L: 34
			this.field1773.addFirst((Node)var3); // L: 35
		}

	} // L: 38

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lfm;B)V",
		garbageValue = "0"
	)
	public void method3335(ClanChannel var1) {
		if (var1.key == this.field1775 && this.field1772 == var1.field1792) { // L: 41
			for (class155 var2 = (class155)this.field1773.last(); var2 != null; var2 = (class155)this.field1773.previous()) { // L: 42
				var2.vmethod3388(var1); // L: 43
			}

			++var1.field1792; // L: 45
		} else {
			throw new RuntimeException("");
		}
	} // L: 46

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Lbw;II[I[II)V",
		garbageValue = "1537846162"
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

						if (var12 != var11) { // L: 113
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

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001; // L: 138
							}
						} else if (var3[var10] == 3) { // L: 140
							var11 = var0[var5].isMembersOnly() ? 1 : 0; // L: 141
							var12 = var8.isMembersOnly() ? 1 : 0; // L: 142
						} else {
							var11 = var0[var5].id; // L: 145
							var12 = var8.id; // L: 146
						}

						if (var11 != var12) { // L: 148
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
}
