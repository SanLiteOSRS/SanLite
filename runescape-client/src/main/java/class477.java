import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public class class477 extends class479 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 686394835
	)
	int field4855;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1659138085
	)
	int field4854;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -631879243
	)
	int field4856;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -569140699
	)
	int field4857;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -50552413
	)
	int field4853;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -486429865
	)
	int field4858;

	public class477(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8); // L: 12
		this.field4855 = 0; // L: 4
		this.field4854 = 0; // L: 5
		this.field4856 = 0; // L: 6
		this.field4857 = 0; // L: 7
		this.field4853 = 0; // L: 8
		this.field4858 = 0; // L: 9
		this.field4855 = var1; // L: 13
		this.field4854 = var2; // L: 14
		this.field4856 = var3; // L: 15
		this.field4857 = var4; // L: 16
		this.field4853 = var5; // L: 17
		this.field4858 = var6; // L: 18
	} // L: 19

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "501200516"
	)
	public int vmethod8468() {
		double var1 = this.method8488(); // L: 22
		return (int)Math.round((double)this.field4855 + var1 * (double)(this.field4857 - this.field4855)); // L: 23
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "211145026"
	)
	public int vmethod8474() {
		double var1 = this.method8488(); // L: 27
		return (int)Math.round(var1 * (double)(this.field4853 - this.field4854) + (double)this.field4854); // L: 28
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837519948"
	)
	public int vmethod8470() {
		double var1 = this.method8488(); // L: 32
		return (int)Math.round(var1 * (double)(this.field4858 - this.field4856) + (double)this.field4856); // L: 33
	}
}
