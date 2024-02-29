import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public class class497 extends class499 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1572270949
	)
	int field4977;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 954734261
	)
	int field4978;

	public class497(int var1, int var2, int var3, int var4) {
		super(var3, var4); // L: 8
		this.field4977 = 0; // L: 4
		this.field4978 = 0; // L: 5
		this.field4977 = var1; // L: 9
		this.field4978 = var2; // L: 10
	} // L: 11

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2068931324"
	)
	public int method8865() {
		double var1 = this.method8876(); // L: 14
		return (int)Math.round((double)this.field4977 + var1 * (double)(this.field4978 - this.field4977)); // L: 15
	}
}
