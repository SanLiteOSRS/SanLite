import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public class class496 extends class499 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1909808895
	)
	int field4993;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -542560327
	)
	int field4992;
	@ObfuscatedName("af")
	double field4997;
	@ObfuscatedName("at")
	double field4991;
	@ObfuscatedName("an")
	double field4995;
	@ObfuscatedName("ao")
	double field4994;
	@ObfuscatedName("ab")
	double field4996;

	public class496(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10); // L: 13
		this.field4993 = 0; // L: 4
		this.field4992 = 0; // L: 5
		this.field4997 = 0.0D; // L: 6
		this.field4991 = 0.0D; // L: 7
		this.field4995 = 0.0D; // L: 8
		this.field4994 = 0.0D; // L: 9
		this.field4996 = 0.0D; // L: 10
		this.field4993 = var3; // L: 14
		this.field4992 = var6; // L: 15
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) { // L: 16
			this.field4997 = (double)var4; // L: 17
			this.field4991 = (double)var5; // L: 18
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D; // L: 21
			double var13 = (double)((float)(var8 + var2)) / 2.0D; // L: 22
			double var15 = (double)((float)(var4 + var7)) / 2.0D; // L: 23
			double var17 = (double)((float)(var5 + var8)) / 2.0D; // L: 24
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2); // L: 25
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8); // L: 26
			this.field4997 = (var17 + (var19 * var11 - var15 * var21) - var13) / (var19 - var21); // L: 27
			this.field4991 = var19 * (this.field4997 - var11) + var13; // L: 28
			this.field4995 = Math.sqrt(Math.pow(this.field4997 - (double)var1, 2.0D) + Math.pow(this.field4991 - (double)var2, 2.0D)); // L: 29
			this.field4994 = Math.atan2((double)var2 - this.field4991, (double)var1 - this.field4997); // L: 30
			double var23 = Math.atan2((double)var8 - this.field4991, (double)var7 - this.field4997); // L: 31
			this.field4996 = Math.atan2((double)var5 - this.field4991, (double)var4 - this.field4997); // L: 32
			boolean var25 = this.field4994 <= var23 && var23 <= this.field4996 || this.field4996 <= var23 && var23 <= this.field4994; // L: 33
			if (!var25) { // L: 34
				this.field4996 += (double)(this.field4994 - this.field4996 > 0.0D ? 2 : -2) * 3.141592653589793D; // L: 35
			}

		}
	} // L: 19 37

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	public int vmethod8668() {
		double var1 = this.method8680(); // L: 40
		double var3 = var1 * (this.field4996 - this.field4994) + this.field4994; // L: 41
		return (int)Math.round(this.field4997 + this.field4995 * Math.cos(var3)); // L: 42
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	public int vmethod8669() {
		double var1 = this.method8680(); // L: 46
		double var3 = (this.field4996 - this.field4994) * var1 + this.field4994; // L: 47
		return (int)Math.round(this.field4991 + this.field4995 * Math.sin(var3)); // L: 48
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-723802647"
	)
	public int vmethod8674() {
		double var1 = this.method8680(); // L: 52
		return (int)Math.round((double)this.field4993 + var1 * (double)(this.field4992 - this.field4993)); // L: 53
	}
}
