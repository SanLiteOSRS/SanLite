import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class60 {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 577001783
	)
	static int field434;
	@ObfuscatedName("ai")
	byte[] field435;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1184122135
	)
	int field433;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2000975055
	)
	int field432;

	class60() {
		this.field435 = null; // L: 4
		this.field433 = 0; // L: 5
		this.field432 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1229869880"
	)
	int method1183(int var1) {
		int var2 = 0; // L: 11

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field432; var1 -= var4) { // L: 12 13 20
			var4 = 8 - this.field432; // L: 14
			int var5 = (1 << var4) - 1; // L: 15
			var2 += (this.field435[this.field433] >> this.field432 & var5) << var3; // L: 16
			this.field432 = 0; // L: 17
			++this.field433; // L: 18
			var3 += var4; // L: 19
		}

		if (var1 > 0) { // L: 22
			var4 = (1 << var1) - 1; // L: 23
			var2 += (this.field435[this.field433] >> this.field432 & var4) << var3; // L: 24
			this.field432 += var1; // L: 25
		}

		return var2; // L: 27
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1858736065"
	)
	int method1179() {
		int var1 = this.field435[this.field433] >> this.field432 & 1; // L: 31
		++this.field432; // L: 32
		this.field433 += this.field432 >> 3; // L: 33
		this.field432 &= 7; // L: 34
		return var1; // L: 35
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "-125"
	)
	void method1177(byte[] var1, int var2) {
		this.field435 = var1; // L: 39
		this.field433 = var2; // L: 40
		this.field432 = 0; // L: 41
	} // L: 42

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IIIIIII)V",
		garbageValue = "1373573002"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104; // L: 150
		int var8;
		if (var7) { // L: 152
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 153

			while (true) {
				var8 = var0.readUnsignedShort(); // L: 155
				if (var8 == 0) { // L: 156
					if (var1 == 0) { // L: 157
						Tiles.Tiles_heights[0][var2][var3] = -HorizontalAlignment.method3806(var4 + 932731, var5 + 556238) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240; // L: 158
					}
					break;
				}

				if (var8 == 1) { // L: 161
					int var9 = var0.readUnsignedByte(); // L: 162
					if (var9 == 1) { // L: 163
						var9 = 0;
					}

					if (var1 == 0) { // L: 164
						Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8; // L: 165
					}
					break;
				}

				if (var8 <= 49) { // L: 168
					Tiles.field1033[var1][var2][var3] = (short)var0.readShort(); // L: 169
					class53.field367[var1][var2][var3] = (byte)((var8 - 2) / 4); // L: 170
					Tiles.field1019[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3); // L: 171
				} else if (var8 <= 81) { // L: 174
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49); // L: 175
				} else {
					Tiles.field1018[var1][var2][var3] = (short)(var8 - 81); // L: 178
				}
			}
		} else {
			while (true) {
				var8 = var0.readUnsignedShort(); // L: 183
				if (var8 == 0) { // L: 184
					break;
				}

				if (var8 == 1) { // L: 185
					var0.readUnsignedByte(); // L: 186
					break; // L: 187
				}

				if (var8 <= 49) { // L: 189
					var0.readShort(); // L: 190
				}
			}
		}

	} // L: 194
}
