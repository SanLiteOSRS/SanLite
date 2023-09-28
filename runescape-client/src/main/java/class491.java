import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
public class class491 extends class494 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 604492495
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2023245917
	)
	int field4902;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1026786859
	)
	int field4901;
	@ObfuscatedName("ak")
	double field4900;
	@ObfuscatedName("ax")
	double field4906;
	@ObfuscatedName("ao")
	double field4904;
	@ObfuscatedName("ah")
	double field4903;
	@ObfuscatedName("ar")
	double field4905;

	public class491(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10); // L: 13
		this.field4902 = 0; // L: 4
		this.field4901 = 0; // L: 5
		this.field4900 = 0.0D; // L: 6
		this.field4906 = 0.0D; // L: 7
		this.field4904 = 0.0D; // L: 8
		this.field4903 = 0.0D; // L: 9
		this.field4905 = 0.0D; // L: 10
		this.field4902 = var3; // L: 14
		this.field4901 = var6; // L: 15
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) { // L: 16
			this.field4900 = (double)var4; // L: 17
			this.field4906 = (double)var5; // L: 18
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D; // L: 21
			double var13 = (double)((float)(var8 + var2)) / 2.0D; // L: 22
			double var15 = (double)((float)(var4 + var7)) / 2.0D; // L: 23
			double var17 = (double)((float)(var5 + var8)) / 2.0D; // L: 24
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2); // L: 25
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8); // L: 26
			this.field4900 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21); // L: 27
			this.field4906 = var13 + (this.field4900 - var11) * var19; // L: 28
			this.field4904 = Math.sqrt(Math.pow(this.field4900 - (double)var1, 2.0D) + Math.pow(this.field4906 - (double)var2, 2.0D)); // L: 29
			this.field4903 = Math.atan2((double)var2 - this.field4906, (double)var1 - this.field4900); // L: 30
			double var23 = Math.atan2((double)var8 - this.field4906, (double)var7 - this.field4900); // L: 31
			this.field4905 = Math.atan2((double)var5 - this.field4906, (double)var4 - this.field4900); // L: 32
			boolean var25 = this.field4903 <= var23 && var23 <= this.field4905 || this.field4905 <= var23 && var23 <= this.field4903; // L: 33
			if (!var25) { // L: 34
				this.field4905 += 3.141592653589793D * (double)(this.field4903 - this.field4905 > 0.0D ? 2 : -2); // L: 35
			}

		}
	} // L: 19 37

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-437522182"
	)
	public int vmethod8614() {
		double var1 = this.method8628(); // L: 40
		double var3 = this.field4903 + var1 * (this.field4905 - this.field4903); // L: 41
		return (int)Math.round(this.field4900 + this.field4904 * Math.cos(var3)); // L: 42
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1670157872"
	)
	public int vmethod8622() {
		double var1 = this.method8628(); // L: 46
		double var3 = (this.field4905 - this.field4903) * var1 + this.field4903; // L: 47
		return (int)Math.round(this.field4906 + this.field4904 * Math.sin(var3)); // L: 48
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "54"
	)
	public int vmethod8618() {
		double var1 = this.method8628(); // L: 52
		return (int)Math.round(var1 * (double)(this.field4901 - this.field4902) + (double)this.field4902); // L: 53
	}
}
