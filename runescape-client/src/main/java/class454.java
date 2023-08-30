import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public class class454 implements class459 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	public final class489 field4768;

	@ObfuscatedSignature(
		descriptor = "(Lsx;)V"
	)
	class454(class490 var1) {
		this.field4768 = var1; // L: 14
	} // L: 15

	@ObfuscatedSignature(
		descriptor = "(Lrp;)V"
	)
	public class454(class455 var1) {
		this(new class490(var1)); // L: 10
	} // L: 11

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "530420265"
	)
	public int method8287(int var1) {
		return this.field4768.vmethod8775(var1); // L: 18
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfh;FS)F",
		garbageValue = "26313"
	)
	static float method8290(class130 var0, float var1) {
		if (var0 == null) { // L: 194
			return 0.0F; // L: 195
		} else {
			float var2;
			if (var0.field1553 == var1) { // L: 198
				var2 = 0.0F; // L: 199
			} else if (var1 == var0.field1554) { // L: 201
				var2 = 1.0F; // L: 202
			} else {
				var2 = (var1 - var0.field1553) / (var0.field1554 - var0.field1553); // L: 205
			}

			float var3;
			if (var0.field1550) { // L: 208
				var3 = var2; // L: 209
			} else {
				class126.field1507[3] = var0.field1552; // L: 212
				class126.field1507[2] = var0.field1557; // L: 213
				class126.field1507[1] = var0.field1556; // L: 214
				class126.field1507[0] = var0.field1555 - var2; // L: 215
				class126.field1509[0] = 0.0F; // L: 216
				class126.field1509[1] = 0.0F; // L: 217
				class126.field1509[2] = 0.0F; // L: 218
				class126.field1509[3] = 0.0F; // L: 219
				class126.field1509[4] = 0.0F; // L: 220
				int var4 = ModelData0.method5023(class126.field1507, 3, 0.0F, true, 1.0F, true, class126.field1509); // L: 221
				if (var4 == 1) { // L: 222
					var3 = class126.field1509[0]; // L: 223
				} else {
					var3 = 0.0F; // L: 226
				}
			}

			return var3 * (var0.field1560 + var3 * (var3 * var0.field1547 + var0.field1561)) + var0.field1572; // L: 229
		}
	}
}
