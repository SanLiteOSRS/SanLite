import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public class class465 extends class467 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -818354293
	)
	int field4805;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1887327431
	)
	int field4804;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 26972001
	)
	int field4806;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1500670169
	)
	int field4809;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -359756077
	)
	int field4808;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -861903555
	)
	int field4807;

	public class465(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8); // L: 12
		this.field4805 = 0; // L: 4
		this.field4804 = 0; // L: 5
		this.field4806 = 0; // L: 6
		this.field4809 = 0; // L: 7
		this.field4808 = 0; // L: 8
		this.field4807 = 0; // L: 9
		this.field4805 = var1; // L: 13
		this.field4804 = var2; // L: 14
		this.field4806 = var3; // L: 15
		this.field4809 = var4; // L: 16
		this.field4808 = var5; // L: 17
		this.field4807 = var6; // L: 18
	} // L: 19

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1021755450"
	)
	public int vmethod8351() {
		double var1 = this.method8361(); // L: 22
		return (int)Math.round(var1 * (double)(this.field4809 - this.field4805) + (double)this.field4805); // L: 23
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1687418689"
	)
	public int vmethod8348() {
		double var1 = this.method8361(); // L: 27
		return (int)Math.round(var1 * (double)(this.field4808 - this.field4804) + (double)this.field4804); // L: 28
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1779423139"
	)
	public int vmethod8347() {
		double var1 = this.method8361(); // L: 32
		return (int)Math.round((double)this.field4806 + (double)(this.field4807 - this.field4806) * var1); // L: 33
	}
}
