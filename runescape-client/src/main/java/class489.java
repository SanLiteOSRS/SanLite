import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public class class489 {
	@ObfuscatedName("af")
	int[] field4997;
	@ObfuscatedName("an")
	short[] field4995;

	@ObfuscatedSignature(
		descriptor = "(Lhs;)V"
	)
	public class489(NPCComposition var1) {
		this.field4997 = new int[8]; // L: 10
		this.field4995 = new short[8]; // L: 11
		int var2 = 0; // L: 12
		if (var1.method3776()) { // L: 13
			var2 = var1.method3777().length; // L: 14
			System.arraycopy(var1.method3777(), 0, this.field4997, 0, var2); // L: 15
			System.arraycopy(var1.method3779(), 0, this.field4995, 0, var2); // L: 16
		}

		for (int var3 = var2; var3 < 8; ++var3) { // L: 18
			this.field4997[var3] = -1; // L: 19
			this.field4995[var3] = -1; // L: 20
		}

	} // L: 22

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-91"
	)
	public int[] method9309() {
		return this.field4997; // L: 25
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "496795655"
	)
	public short[] method9302() {
		return this.field4995; // L: 29
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "164406269"
	)
	public void method9303(int var1, int var2, short var3) {
		this.field4997[var1] = var2; // L: 33
		this.field4995[var1] = var3; // L: 34
	} // L: 35

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "12"
	)
	public void method9315(int[] var1, short[] var2) {
		this.field4997 = var1; // L: 38
		this.field4995 = var2; // L: 39
	} // L: 40
}
