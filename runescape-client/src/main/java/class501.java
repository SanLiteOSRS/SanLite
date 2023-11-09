import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public class class501 {
	@ObfuscatedName("ao")
	@Export("cacheSubPaths")
	public static String[] cacheSubPaths;
	@ObfuscatedName("ay")
	int[] field5021;
	@ObfuscatedName("an")
	short[] field5019;

	@ObfuscatedSignature(
		descriptor = "(Lho;)V"
	)
	public class501(NPCComposition var1) {
		this.field5021 = new int[8]; // L: 10
		this.field5019 = new short[8]; // L: 11
		int var2 = 0; // L: 12
		if (var1.method3678()) { // L: 13
			var2 = var1.method3679().length; // L: 14
			System.arraycopy(var1.method3679(), 0, this.field5021, 0, var2); // L: 15
			System.arraycopy(var1.method3683(), 0, this.field5019, 0, var2); // L: 16
		}

		for (int var3 = var2; var3 < 8; ++var3) { // L: 18
			this.field5021[var3] = -1; // L: 19
			this.field5019[var3] = -1; // L: 20
		}

	} // L: 22

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1339003088"
	)
	public int[] method9216() {
		return this.field5021; // L: 25
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1437177877"
	)
	public short[] method9210() {
		return this.field5019; // L: 29
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-1981113697"
	)
	public void method9214(int var1, int var2, short var3) {
		this.field5021[var1] = var2; // L: 33
		this.field5019[var1] = var3; // L: 34
	} // L: 35

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1553975419"
	)
	public void method9212(int[] var1, short[] var2) {
		this.field5021 = var1; // L: 38
		this.field5019 = var2; // L: 39
	} // L: 40
}
