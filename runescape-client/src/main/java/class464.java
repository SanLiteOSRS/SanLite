import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("rq")
public class class464 extends class467 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1608023843
	)
	int field4807;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 490235575
	)
	int field4803;
	@ObfuscatedName("ar")
	double field4802;
	@ObfuscatedName("ab")
	double field4805;
	@ObfuscatedName("at")
	double field4806;
	@ObfuscatedName("ax")
	double field4804;
	@ObfuscatedName("al")
	double field4808;

	public class464(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10); // L: 13
		this.field4807 = 0; // L: 4
		this.field4803 = 0; // L: 5
		this.field4802 = 0.0D; // L: 6
		this.field4805 = 0.0D; // L: 7
		this.field4806 = 0.0D; // L: 8
		this.field4804 = 0.0D; // L: 9
		this.field4808 = 0.0D; // L: 10
		this.field4807 = var3; // L: 14
		this.field4803 = var6; // L: 15
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) { // L: 16
			this.field4802 = (double)var4; // L: 17
			this.field4805 = (double)var5; // L: 18
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D; // L: 21
			double var13 = (double)((float)(var8 + var2)) / 2.0D; // L: 22
			double var15 = (double)((float)(var4 + var7)) / 2.0D; // L: 23
			double var17 = (double)((float)(var5 + var8)) / 2.0D; // L: 24
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2); // L: 25
			double var21 = -1.0D * (double)(var4 - var7) / (double)(var5 - var8); // L: 26
			this.field4802 = (var17 + (var19 * var11 - var15 * var21) - var13) / (var19 - var21); // L: 27
			this.field4805 = var13 + (this.field4802 - var11) * var19; // L: 28
			this.field4806 = Math.sqrt(Math.pow(this.field4802 - (double)var1, 2.0D) + Math.pow(this.field4805 - (double)var2, 2.0D)); // L: 29
			this.field4804 = Math.atan2((double)var2 - this.field4805, (double)var1 - this.field4802); // L: 30
			double var23 = Math.atan2((double)var8 - this.field4805, (double)var7 - this.field4802); // L: 31
			this.field4808 = Math.atan2((double)var5 - this.field4805, (double)var4 - this.field4802); // L: 32
			boolean var25 = this.field4804 <= var23 && var23 <= this.field4808 || this.field4808 <= var23 && var23 <= this.field4804; // L: 33
			if (!var25) { // L: 34
				this.field4808 += 3.141592653589793D * (double)(this.field4804 - this.field4808 > 0.0D ? 2 : -2); // L: 35
			}

		}
	} // L: 19 37

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	public int vmethod8410() {
		double var1 = this.method8421(); // L: 40
		double var3 = (this.field4808 - this.field4804) * var1 + this.field4804; // L: 41
		return (int)Math.round(this.field4802 + this.field4806 * Math.cos(var3)); // L: 42
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2035088065"
	)
	public int vmethod8411() {
		double var1 = this.method8421(); // L: 46
		double var3 = (this.field4808 - this.field4804) * var1 + this.field4804; // L: 47
		return (int)Math.round(this.field4805 + this.field4806 * Math.sin(var3)); // L: 48
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-812959020"
	)
	public int vmethod8412() {
		double var1 = this.method8421(); // L: 52
		return (int)Math.round((double)(this.field4803 - this.field4807) * var1 + (double)this.field4807); // L: 53
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "-492379402"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 218
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 219
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 220
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 221
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 222
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 223
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 224
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 225
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 226 227
		}
	}
}
