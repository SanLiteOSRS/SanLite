import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class201 implements class30 {
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("h")
	char[] field2327;
	@ObfuscatedName("e")
	int[] field2316;
	@ObfuscatedName("v")
	public int[] field2323;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1561579701
	)
	public int field2326;
	@ObfuscatedName("m")
	int[] field2319;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 784206767
	)
	int field2320;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -791064279
	)
	int field2321;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1539729439
	)
	int field2322;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1119474005
	)
	int field2317;
	@ObfuscatedName("b")
	boolean[] field2324;
	@ObfuscatedName("j")
	boolean[] field2325;
	@ObfuscatedName("g")
	boolean[] field2318;
	@ObfuscatedName("i")
	public char field2315;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1152900247
	)
	public int field2328;

	public class201() {
		this.field2327 = new char[128]; // L: 8
		this.field2316 = new int[128];
		this.field2323 = new int[128];
		this.field2326 = 0;
		this.field2319 = new int[128];
		this.field2320 = 0; // L: 13
		this.field2321 = 0;
		this.field2322 = 0;
		this.field2317 = 0;
		this.field2324 = new boolean[112];
		this.field2325 = new boolean[112];
		this.field2318 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1119176744"
	)
	public boolean vmethod4138(int var1) {
		this.method4101(var1);
		this.field2324[var1] = true;
		this.field2325[var1] = true;
		this.field2318[var1] = false;
		this.field2323[++this.field2326 - 1] = var1;
		return true;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-916991313"
	)
	public boolean vmethod4099(int var1) {
		this.field2324[var1] = false;
		this.field2325[var1] = false; // L: 34
		this.field2318[var1] = true;
		this.field2319[++this.field2320 - 1] = var1;
		return true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-258182"
	)
	public boolean vmethod4097(char var1) {
		int var2 = this.field2322 + 1 & 127; // L: 41
		if (var2 != this.field2321) { // L: 42
			this.field2316[this.field2322] = -1; // L: 43
			this.field2327[this.field2322] = var1; // L: 44
			this.field2322 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "333814410"
	)
	public boolean vmethod4102(boolean var1) {
		return false; // L: 60
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "41"
	)
	void method4101(int var1) {
		int var2 = this.field2322 + 1 & 127; // L: 51
		if (var2 != this.field2321) { // L: 52
			this.field2316[this.field2322] = var1; // L: 53
			this.field2327[this.field2322] = 0; // L: 54
			this.field2322 = var2; // L: 55
		}

	} // L: 57

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	public void method4103() {
		this.field2321 = this.field2317; // L: 64
		this.field2317 = this.field2322; // L: 65
		this.field2326 = 0; // L: 66
		this.field2320 = 0; // L: 67
		Arrays.fill(this.field2325, false); // L: 68
		Arrays.fill(this.field2318, false); // L: 69
	} // L: 70

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	public final boolean method4114() {
		if (this.field2317 == this.field2321) { // L: 73
			return false;
		} else {
			this.field2328 = this.field2316[this.field2321]; // L: 74
			this.field2315 = this.field2327[this.field2321]; // L: 75
			this.field2321 = this.field2321 + 1 & 127; // L: 76
			return true; // L: 77
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "903181500"
	)
	public boolean method4136(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2325[var1] : false; // L: 81 82
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method4106(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2324[var1] : false; // L: 86 87
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1557864328"
	)
	public boolean method4104(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2318[var1] : false; // L: 91 92
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "5"
	)
	public int[] method4108() {
		int[] var1 = new int[this.field2326]; // L: 96

		for (int var2 = 0; var2 < this.field2326; ++var2) { // L: 97
			var1[var2] = this.field2323[var2]; // L: 98
		}

		return var1; // L: 100
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2137693462"
	)
	public int[] method4109() {
		int[] var1 = new int[this.field2320]; // L: 104

		for (int var2 = 0; var2 < this.field2320; ++var2) { // L: 105
			var1[var2] = this.field2319[var2]; // L: 106
		}

		return var1; // L: 108
	}

	@ObfuscatedName("h")
	public static final int method4112(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (0.0D != var2) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (1.0D + var2) * var4;
			} else {
				var12 = var4 + var2 - var2 * var4; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = 0.3333333333333333D + var0; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = 6.0D * (var12 - var14) * var16 + var14;
			} else if (var16 * 2.0D < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = var14 + 6.0D * (0.6666666666666666D - var16) * (var12 - var14);
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var0 * 6.0D * (var12 - var14) + var14;
			} else if (var0 * 2.0D < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14); // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = 6.0D * (var12 - var14) * var20 + var14;
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) { // L: 32
				var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(var6 * 256.0D); // L: 35
		int var13 = (int)(var8 * 256.0D); // L: 36
		int var23 = (int)(256.0D * var10); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}
}
