import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
public class class514 {
	@ObfuscatedName("aw")
	int[] field5073;
	@ObfuscatedName("ay")
	short[] field5074;

	@ObfuscatedSignature(
		descriptor = "(Lhi;)V"
	)
	public class514(NPCComposition var1) {
		this.field5073 = new int[8]; // L: 10
		this.field5074 = new short[8]; // L: 11
		int var2 = 0; // L: 12
		if (var1.method3715()) { // L: 13
			var2 = var1.method3720().length; // L: 14
			System.arraycopy(var1.method3720(), 0, this.field5073, 0, var2); // L: 15
			System.arraycopy(var1.method3750(), 0, this.field5074, 0, var2); // L: 16
		}

		for (int var3 = var2; var3 < 8; ++var3) { // L: 18
			this.field5073[var3] = -1; // L: 19
			this.field5074[var3] = -1; // L: 20
		}

	} // L: 22

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "128"
	)
	public int[] method9349() {
		return this.field5073; // L: 25
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-145680326"
	)
	public short[] method9350() {
		return this.field5074; // L: 29
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-467719790"
	)
	public void method9351(int var1, int var2, short var3) {
		this.field5073[var1] = var2; // L: 33
		this.field5074[var1] = var3; // L: 34
	} // L: 35

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "-45"
	)
	public void method9359(int[] var1, short[] var2) {
		this.field5073 = var1; // L: 38
		this.field5074 = var2; // L: 39
	} // L: 40
}
