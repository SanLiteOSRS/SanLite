import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class226 implements class29 {
	@ObfuscatedName("ac")
	char[] field2374;
	@ObfuscatedName("al")
	int[] field2379;
	@ObfuscatedName("ak")
	public int[] field2373;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1388234181
	)
	public int field2376;
	@ObfuscatedName("ao")
	int[] field2377;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2109755151
	)
	int field2378;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1767369861
	)
	int field2385;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1418302057
	)
	int field2380;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1713082771
	)
	int field2381;
	@ObfuscatedName("av")
	boolean[] field2382;
	@ObfuscatedName("ag")
	boolean[] field2383;
	@ObfuscatedName("aa")
	boolean[] field2384;
	@ObfuscatedName("ap")
	public char field2375;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 372049411
	)
	public int field2386;

	public class226() {
		this.field2374 = new char[128]; // L: 8
		this.field2379 = new int[128]; // L: 9
		this.field2373 = new int[128]; // L: 10
		this.field2376 = 0; // L: 11
		this.field2377 = new int[128]; // L: 12
		this.field2378 = 0; // L: 13
		this.field2385 = 0; // L: 14
		this.field2380 = 0; // L: 15
		this.field2381 = 0; // L: 16
		this.field2382 = new boolean[112]; // L: 17
		this.field2383 = new boolean[112]; // L: 18
		this.field2384 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1448724719"
	)
	public boolean vmethod4264(int var1) {
		this.method4253(var1); // L: 24
		this.field2382[var1] = true; // L: 25
		this.field2383[var1] = true; // L: 26
		this.field2384[var1] = false; // L: 27
		this.field2373[++this.field2376 - 1] = var1; // L: 28
		return true; // L: 29
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-974805318"
	)
	public boolean vmethod4251(int var1) {
		this.field2382[var1] = false; // L: 33
		this.field2383[var1] = false; // L: 34
		this.field2384[var1] = true; // L: 35
		this.field2377[++this.field2378 - 1] = var1; // L: 36
		return true; // L: 37
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "19"
	)
	public boolean vmethod4275(char var1) {
		int var2 = this.field2380 + 1 & 127; // L: 41
		if (var2 != this.field2385) { // L: 42
			this.field2379[this.field2380] = -1; // L: 43
			this.field2374[this.field2380] = var1; // L: 44
			this.field2380 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-672025946"
	)
	public boolean vmethod4254(boolean var1) {
		return false; // L: 60
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1769728274"
	)
	void method4253(int var1) {
		int var2 = this.field2380 + 1 & 127; // L: 51
		if (var2 != this.field2385) { // L: 52
			this.field2379[this.field2380] = var1; // L: 53
			this.field2374[this.field2380] = 0; // L: 54
			this.field2380 = var2; // L: 55
		}

	} // L: 57

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method4250() {
		this.field2385 = this.field2381; // L: 64
		this.field2381 = this.field2380; // L: 65
		this.field2376 = 0; // L: 66
		this.field2378 = 0; // L: 67
		Arrays.fill(this.field2383, false); // L: 68
		Arrays.fill(this.field2384, false); // L: 69
	} // L: 70

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-192433797"
	)
	public final boolean method4256() {
		if (this.field2385 == this.field2381) { // L: 73
			return false;
		} else {
			this.field2386 = this.field2379[this.field2385]; // L: 74
			this.field2375 = this.field2374[this.field2385]; // L: 75
			this.field2385 = this.field2385 + 1 & 127; // L: 76
			return true; // L: 77
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1443777028"
	)
	public boolean method4272(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2383[var1] : false; // L: 81 82
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-978109184"
	)
	public boolean method4280(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2382[var1] : false; // L: 86 87
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1065204501"
	)
	public boolean method4259(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2384[var1] : false; // L: 91 92
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "118"
	)
	public int[] method4298() {
		int[] var1 = new int[this.field2376]; // L: 96

		for (int var2 = 0; var2 < this.field2376; ++var2) { // L: 97
			var1[var2] = this.field2373[var2]; // L: 98
		}

		return var1; // L: 100
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-31"
	)
	public int[] method4292() {
		int[] var1 = new int[this.field2378]; // L: 104

		for (int var2 = 0; var2 < this.field2378; ++var2) { // L: 105
			var1[var2] = this.field2377[var2]; // L: 106
		}

		return var1; // L: 108
	}
}
