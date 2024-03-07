import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ub")
public class class534 {
	@ObfuscatedName("aq")
	int[] field5203;
	@ObfuscatedName("aw")
	short[] field5202;

	@ObfuscatedSignature(
		descriptor = "(Lho;)V"
	)
	public class534(NPCComposition var1) {
		this.field5203 = new int[8]; // L: 10
		this.field5202 = new short[8]; // L: 11
		int var2 = 0; // L: 12
		if (var1.method3709()) { // L: 13
			var2 = var1.method3700().length; // L: 14
			System.arraycopy(var1.method3700(), 0, this.field5203, 0, var2); // L: 15
			System.arraycopy(var1.method3743(), 0, this.field5202, 0, var2); // L: 16
		}

		for (int var3 = var2; var3 < 8; ++var3) { // L: 18
			this.field5203[var3] = -1; // L: 19
			this.field5202[var3] = -1; // L: 20
		}

	} // L: 22

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "153301675"
	)
	public int[] method9715() {
		return this.field5203; // L: 25
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1838511532"
	)
	public short[] method9708() {
		return this.field5202; // L: 29
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-956250169"
	)
	public void method9709(int var1, int var2, short var3) {
		this.field5203[var1] = var2; // L: 33
		this.field5202[var1] = var3; // L: 34
	} // L: 35

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "221820389"
	)
	public void method9710(int[] var1, short[] var2) {
		this.field5203 = var1; // L: 38
		this.field5202 = var2; // L: 39
	} // L: 40

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "689661422"
	)
	static final void method9716() {
		Client.field734 = Client.cycleCntr; // L: 12697
		class257.field2665 = true; // L: 12698
	} // L: 12699
}
