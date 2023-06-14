import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
public class class501 {
	@ObfuscatedName("at")
	int[] field5024;
	@ObfuscatedName("an")
	short[] field5025;

	@ObfuscatedSignature(
		descriptor = "(Lhd;)V"
	)
	public class501(NPCComposition var1) {
		this.field5024 = new int[8]; // L: 10
		this.field5025 = new short[8]; // L: 11
		int var2 = 0; // L: 12
		if (var1.method3698()) { // L: 13
			var2 = var1.method3699().length; // L: 14
			System.arraycopy(var1.method3699(), 0, this.field5024, 0, var2); // L: 15
			System.arraycopy(var1.method3706(), 0, this.field5025, 0, var2); // L: 16
		}

		for (int var3 = var2; var3 < 8; ++var3) { // L: 18
			this.field5024[var3] = -1; // L: 19
			this.field5025[var3] = -1; // L: 20
		}

	} // L: 22

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1705195685"
	)
	public int[] method9160() {
		return this.field5024; // L: 25
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "747465431"
	)
	public short[] method9161() {
		return this.field5025; // L: 29
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-575239298"
	)
	public void method9168(int var1, int var2, short var3) {
		this.field5024[var1] = var2; // L: 33
		this.field5025[var1] = var3; // L: 34
	} // L: 35

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-386747680"
	)
	public void method9163(int[] var1, short[] var2) {
		this.field5024 = var1; // L: 38
		this.field5025 = var2; // L: 39
	} // L: 40
}
