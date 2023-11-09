import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
public class class515 {
	@ObfuscatedName("au")
	int[] field5113;
	@ObfuscatedName("ae")
	short[] field5114;

	@ObfuscatedSignature(
		descriptor = "(Lhw;)V"
	)
	public class515(NPCComposition var1) {
		this.field5113 = new int[8]; // L: 10
		this.field5114 = new short[8]; // L: 11
		int var2 = 0; // L: 12
		if (var1.method3697()) { // L: 13
			var2 = var1.method3698().length; // L: 14
			System.arraycopy(var1.method3698(), 0, this.field5113, 0, var2); // L: 15
			System.arraycopy(var1.method3700(), 0, this.field5114, 0, var2); // L: 16
		}

		for (int var3 = var2; var3 < 8; ++var3) { // L: 18
			this.field5113[var3] = -1; // L: 19
			this.field5114[var3] = -1; // L: 20
		}

	} // L: 22

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-122"
	)
	public int[] method9299() {
		return this.field5113; // L: 25
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "80"
	)
	public short[] method9300() {
		return this.field5114; // L: 29
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-1005641077"
	)
	public void method9301(int var1, int var2, short var3) {
		this.field5113[var1] = var2; // L: 33
		this.field5114[var1] = var3; // L: 34
	} // L: 35

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "1"
	)
	public void method9302(int[] var1, short[] var2) {
		this.field5113 = var1; // L: 38
		this.field5114 = var2; // L: 39
	} // L: 40
}
