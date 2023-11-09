import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
public class class476 extends class479 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1785147337
	)
	int field4850;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1471071573
	)
	int field4846;
	@ObfuscatedName("ac")
	double field4848;
	@ObfuscatedName("aw")
	double field4849;
	@ObfuscatedName("ay")
	double field4847;
	@ObfuscatedName("ap")
	double field4851;
	@ObfuscatedName("av")
	double field4852;

	public class476(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10); // L: 13
		this.field4850 = 0; // L: 4
		this.field4846 = 0; // L: 5
		this.field4848 = 0.0D; // L: 6
		this.field4849 = 0.0D; // L: 7
		this.field4847 = 0.0D; // L: 8
		this.field4851 = 0.0D; // L: 9
		this.field4852 = 0.0D; // L: 10
		this.field4850 = var3; // L: 14
		this.field4846 = var6; // L: 15
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) { // L: 16
			this.field4848 = (double)var4; // L: 17
			this.field4849 = (double)var5; // L: 18
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D; // L: 21
			double var13 = (double)((float)(var8 + var2)) / 2.0D; // L: 22
			double var15 = (double)((float)(var4 + var7)) / 2.0D; // L: 23
			double var17 = (double)((float)(var5 + var8)) / 2.0D; // L: 24
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2); // L: 25
			double var21 = -1.0D * (double)(var4 - var7) / (double)(var5 - var8); // L: 26
			this.field4848 = (var17 + (var19 * var11 - var15 * var21) - var13) / (var19 - var21); // L: 27
			this.field4849 = var19 * (this.field4848 - var11) + var13; // L: 28
			this.field4847 = Math.sqrt(Math.pow(this.field4848 - (double)var1, 2.0D) + Math.pow(this.field4849 - (double)var2, 2.0D)); // L: 29
			this.field4851 = Math.atan2((double)var2 - this.field4849, (double)var1 - this.field4848); // L: 30
			double var23 = Math.atan2((double)var8 - this.field4849, (double)var7 - this.field4848); // L: 31
			this.field4852 = Math.atan2((double)var5 - this.field4849, (double)var4 - this.field4848); // L: 32
			boolean var25 = this.field4851 <= var23 && var23 <= this.field4852 || this.field4852 <= var23 && var23 <= this.field4851; // L: 33
			if (!var25) { // L: 34
				this.field4852 += 3.141592653589793D * (double)(this.field4851 - this.field4852 > 0.0D ? 2 : -2); // L: 35
			}

		}
	} // L: 19 37

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "501200516"
	)
	public int vmethod8468() {
		double var1 = this.method8488(); // L: 40
		double var3 = (this.field4852 - this.field4851) * var1 + this.field4851; // L: 41
		return (int)Math.round(this.field4848 + this.field4847 * Math.cos(var3)); // L: 42
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "211145026"
	)
	public int vmethod8474() {
		double var1 = this.method8488(); // L: 46
		double var3 = this.field4851 + (this.field4852 - this.field4851) * var1; // L: 47
		return (int)Math.round(this.field4849 + this.field4847 * Math.sin(var3)); // L: 48
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837519948"
	)
	public int vmethod8470() {
		double var1 = this.method8488(); // L: 52
		return (int)Math.round((double)this.field4850 + (double)(this.field4846 - this.field4850) * var1); // L: 53
	}
}
