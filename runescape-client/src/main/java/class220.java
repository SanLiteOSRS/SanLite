import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class220 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1588110941
	)
	public int field2244;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -296911909
	)
	public int field2242;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -375488911
	)
	public int field2241;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 118509621
	)
	public int field2243;

	class220(int var1, int var2, int var3, int var4) {
		this.field2244 = 0; // L: 4
		this.field2242 = 0; // L: 5
		this.field2241 = 0; // L: 6
		this.field2243 = 0; // L: 7
		this.field2244 = var1; // L: 10
		this.field2242 = var2; // L: 11
		this.field2241 = var3; // L: 12
		this.field2243 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lto;III)I",
		garbageValue = "1290495086"
	)
	static int method4074(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}
}
