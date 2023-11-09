import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class474 {
	@ObfuscatedName("f")
	int[] field4942;
	@ObfuscatedName("w")
	short[] field4944;

	@ObfuscatedSignature(
		descriptor = "(Lgo;)V"
	)
	public class474(NPCComposition var1) {
		this.field4942 = new int[8]; // L: 10
		this.field4944 = new short[8]; // L: 11
		int var2 = 0; // L: 12
		if (var1.method3730()) { // L: 13
			var2 = var1.method3757().length; // L: 14
			System.arraycopy(var1.method3757(), 0, this.field4942, 0, var2); // L: 15
			System.arraycopy(var1.method3749(), 0, this.field4944, 0, var2); // L: 16
		}

		for (int var3 = var2; var3 < 8; ++var3) { // L: 18
			this.field4942[var3] = -1; // L: 19
			this.field4944[var3] = -1; // L: 20
		}

	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1293507413"
	)
	public int[] method8894() {
		return this.field4942; // L: 25
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "-114"
	)
	public short[] method8895() {
		return this.field4944; // L: 29
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IISS)V",
		garbageValue = "150"
	)
	public void method8896(int var1, int var2, short var3) {
		this.field4942[var1] = var2; // L: 33
		this.field4944[var1] = var3; // L: 34
	} // L: 35

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "-84"
	)
	public void method8899(int[] var1, short[] var2) {
		this.field4942 = var1; // L: 38
		this.field4944 = var2; // L: 39
	} // L: 40
}
