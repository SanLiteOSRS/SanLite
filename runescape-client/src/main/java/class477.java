import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public class class477 extends class480 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -629874895
	)
	int field4859;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -562859597
	)
	int field4858;
	@ObfuscatedName("ar")
	double field4863;
	@ObfuscatedName("am")
	double field4860;
	@ObfuscatedName("as")
	double field4861;
	@ObfuscatedName("aj")
	double field4862;
	@ObfuscatedName("ag")
	double field4857;

	public class477(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10); // L: 13
		this.field4859 = 0; // L: 4
		this.field4858 = 0; // L: 5
		this.field4863 = 0.0D; // L: 6
		this.field4860 = 0.0D; // L: 7
		this.field4861 = 0.0D; // L: 8
		this.field4862 = 0.0D; // L: 9
		this.field4857 = 0.0D; // L: 10
		this.field4859 = var3; // L: 14
		this.field4858 = var6; // L: 15
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) { // L: 16
			this.field4863 = (double)var4; // L: 17
			this.field4860 = (double)var5; // L: 18
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D; // L: 21
			double var13 = (double)((float)(var8 + var2)) / 2.0D; // L: 22
			double var15 = (double)((float)(var4 + var7)) / 2.0D; // L: 23
			double var17 = (double)((float)(var5 + var8)) / 2.0D; // L: 24
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2); // L: 25
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8); // L: 26
			this.field4863 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21); // L: 27
			this.field4860 = var13 + (this.field4863 - var11) * var19; // L: 28
			this.field4861 = Math.sqrt(Math.pow(this.field4863 - (double)var1, 2.0D) + Math.pow(this.field4860 - (double)var2, 2.0D)); // L: 29
			this.field4862 = Math.atan2((double)var2 - this.field4860, (double)var1 - this.field4863); // L: 30
			double var23 = Math.atan2((double)var8 - this.field4860, (double)var7 - this.field4863); // L: 31
			this.field4857 = Math.atan2((double)var5 - this.field4860, (double)var4 - this.field4863); // L: 32
			boolean var25 = this.field4862 <= var23 && var23 <= this.field4857 || this.field4857 <= var23 && var23 <= this.field4862; // L: 33
			if (!var25) { // L: 34
				this.field4857 += 3.141592653589793D * (double)(this.field4862 - this.field4857 > 0.0D ? 2 : -2); // L: 35
			}

		}
	} // L: 19 37

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2587"
	)
	public int vmethod8499() {
		double var1 = this.method8504(); // L: 40
		double var3 = this.field4862 + (this.field4857 - this.field4862) * var1; // L: 41
		return (int)Math.round(this.field4863 + this.field4861 * Math.cos(var3)); // L: 42
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1657628972"
	)
	public int vmethod8496() {
		double var1 = this.method8504(); // L: 46
		double var3 = (this.field4857 - this.field4862) * var1 + this.field4862; // L: 47
		return (int)Math.round(this.field4860 + this.field4861 * Math.sin(var3)); // L: 48
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "10605"
	)
	public int vmethod8497() {
		double var1 = this.method8504(); // L: 52
		return (int)Math.round((double)this.field4859 + var1 * (double)(this.field4858 - this.field4859)); // L: 53
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(II)Ltx;",
		garbageValue = "522363485"
	)
	static class507 method8476(int var0) {
		class507 var1 = (class507)Client.Widget_cachedModels.get((long)var0); // L: 12908
		if (var1 == null) { // L: 12909
			var1 = new class507(class176.field1852, ViewportMouse.method4930(var0), Message.method1241(var0)); // L: 12910
			Client.Widget_cachedModels.put(var1, (long)var0); // L: 12911
		}

		return var1; // L: 12913
	}
}
