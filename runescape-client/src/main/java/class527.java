import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public class class527 {
	@ObfuscatedName("at")
	int[] field5142;
	@ObfuscatedName("ah")
	short[] field5143;

	@ObfuscatedSignature(
		descriptor = "(Lhw;)V"
	)
	public class527(NPCComposition var1) {
		this.field5142 = new int[8]; // L: 10
		this.field5143 = new short[8]; // L: 11
		int var2 = 0; // L: 12
		if (var1.method3702()) { // L: 13
			var2 = var1.method3733().length; // L: 14
			System.arraycopy(var1.method3733(), 0, this.field5142, 0, var2); // L: 15
			System.arraycopy(var1.method3694(), 0, this.field5143, 0, var2); // L: 16
		}

		for (int var3 = var2; var3 < 8; ++var3) { // L: 18
			this.field5142[var3] = -1; // L: 19
			this.field5143[var3] = -1; // L: 20
		}

	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1522434870"
	)
	public int[] method9531() {
		return this.field5142; // L: 25
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-2015204847"
	)
	public short[] method9532() {
		return this.field5143; // L: 29
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-561705498"
	)
	public void method9533(int var1, int var2, short var3) {
		this.field5142[var1] = var2; // L: 33
		this.field5143[var1] = var3; // L: 34
	} // L: 35

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "1404172969"
	)
	public void method9534(int[] var1, short[] var2) {
		this.field5142 = var1; // L: 38
		this.field5143 = var2; // L: 39
	} // L: 40
}
