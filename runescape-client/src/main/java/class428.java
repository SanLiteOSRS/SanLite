import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public enum class428 implements class356 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	field4692(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	field4694(2, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	field4693(0, 3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	field4691(3, 10);

	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1750512657
	)
	final int field4695;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2023077401
	)
	final int field4696;

	class428(int var3, int var4) {
		this.field4695 = var3; // L: 16
		this.field4696 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "741942848"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4696; // L: 22
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lit;IIIIB)Z",
		garbageValue = "11"
	)
	static final boolean method8278(Model var0, int var1, int var2, int var3, int var4) {
		boolean var5 = ViewportMouse.ViewportMouse_isInViewport; // L: 166
		if (!var5) { // L: 168
			return false;
		} else {
			class122.method3045(); // L: 169
			class223 var6 = (class223)var0.field2722.get(var1); // L: 170
			int var7 = var2 + var6.field2616; // L: 171
			int var8 = var3 + var6.field2610; // L: 172
			int var9 = var4 + var6.field2614; // L: 173
			int var10 = var6.field2613; // L: 174
			int var11 = var6.field2617; // L: 175
			int var12 = var6.field2615; // L: 176
			int var13 = ViewportMouse.field2767 - var7; // L: 177
			int var14 = class294.field3366 - var8; // L: 178
			int var15 = ViewportMouse.field2768 - var9; // L: 179
			if (Math.abs(var13) > var10 + EnumComposition.field1979) { // L: 180
				return false; // L: 181
			} else if (Math.abs(var14) > var11 + ViewportMouse.field2771) { // L: 183
				return false; // L: 184
			} else if (Math.abs(var15) > var12 + class9.field44) { // L: 186
				return false; // L: 187
			} else if (Math.abs(var15 * UserComparator8.field1418 - var14 * ReflectionCheck.field268) > var11 * class9.field44 + var12 * ViewportMouse.field2771) { // L: 189
				return false; // L: 190
			} else if (Math.abs(var13 * ReflectionCheck.field268 - var15 * ViewportMouse.field2769) > var12 * EnumComposition.field1979 + var10 * class9.field44) { // L: 192
				return false; // L: 193
			} else {
				return Math.abs(var14 * ViewportMouse.field2769 - var13 * UserComparator8.field1418) <= var11 * EnumComposition.field1979 + var10 * ViewportMouse.field2771; // L: 195
			}
		}
	}
}
