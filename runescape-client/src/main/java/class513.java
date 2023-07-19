import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tc")
public class class513 {
	@ObfuscatedName("ai")
	int[] field5068;
	@ObfuscatedName("aj")
	short[] field5069;

	@ObfuscatedSignature(
		descriptor = "(Lhs;)V"
	)
	public class513(NPCComposition var1) {
		this.field5068 = new int[8]; // L: 10
		this.field5069 = new short[8]; // L: 11
		int var2 = 0; // L: 12
		if (var1.method3821()) { // L: 13
			var2 = var1.method3822().length; // L: 14
			System.arraycopy(var1.method3822(), 0, this.field5068, 0, var2); // L: 15
			System.arraycopy(var1.method3824(), 0, this.field5069, 0, var2); // L: 16
		}

		for (int var3 = var2; var3 < 8; ++var3) { // L: 18
			this.field5068[var3] = -1; // L: 19
			this.field5069[var3] = -1; // L: 20
		}

	} // L: 22

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2095877587"
	)
	public int[] method9314() {
		return this.field5068; // L: 25
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-872673192"
	)
	public short[] method9315() {
		return this.field5069; // L: 29
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-1310886943"
	)
	public void method9320(int var1, int var2, short var3) {
		this.field5068[var1] = var2; // L: 33
		this.field5069[var1] = var3; // L: 34
	} // L: 35

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "459872913"
	)
	public void method9325(int[] var1, short[] var2) {
		this.field5068 = var1; // L: 38
		this.field5069 = var2; // L: 39
	} // L: 40
}
