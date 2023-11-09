import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class194 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 3973216861410173197L
	)
	public long field1990;
	@ObfuscatedName("ay")
	int[] field1993;
	@ObfuscatedName("ar")
	short[] field1992;
	@ObfuscatedName("am")
	short[] field1995;
	@ObfuscatedName("as")
	public boolean field1994;

	public class194(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field1994 = false; // L: 8
		this.field1990 = var1; // L: 11
		this.field1993 = var3; // L: 12
		this.field1992 = var4; // L: 13
		this.field1995 = var5; // L: 14
		this.field1994 = var6; // L: 15
	} // L: 16

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "-1510328589"
	)
	static float method3703(class130 var0, float var1) {
		if (var0 == null) { // L: 174
			return 0.0F; // L: 175
		} else {
			float var2;
			if (var0.field1538 == var1) { // L: 178
				var2 = 0.0F; // L: 179
			} else if (var1 == var0.field1535) { // L: 181
				var2 = 1.0F; // L: 182
			} else {
				var2 = (var1 - var0.field1538) / (var0.field1535 - var0.field1538); // L: 185
			}

			float var3;
			if (var0.field1543) { // L: 188
				var3 = var2; // L: 189
			} else {
				class126.field1492[3] = var0.field1550; // L: 192
				class126.field1492[2] = var0.field1542; // L: 193
				class126.field1492[1] = var0.field1541; // L: 194
				class126.field1492[0] = var0.field1540 - var2; // L: 195
				class126.field1497[0] = 0.0F; // L: 196
				class126.field1497[1] = 0.0F; // L: 197
				class126.field1497[2] = 0.0F; // L: 198
				class126.field1497[3] = 0.0F; // L: 199
				class126.field1497[4] = 0.0F; // L: 200
				int var4 = class508.method9009(class126.field1492, 3, 0.0F, true, 1.0F, true, class126.field1497); // L: 201
				if (var4 == 1) { // L: 202
					var3 = class126.field1497[0]; // L: 203
				} else {
					var3 = 0.0F; // L: 206
				}
			}

			return (var0.field1553 + (var0.field1546 + var3 * var0.field1537) * var3) * var3 + var0.field1544; // L: 209
		}
	}
}
