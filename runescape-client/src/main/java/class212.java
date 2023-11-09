import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class212 implements class29 {
	@ObfuscatedName("ai")
	char[] field2334;
	@ObfuscatedName("aj")
	int[] field2343;
	@ObfuscatedName("ac")
	public int[] field2335;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -848248163
	)
	public int field2336;
	@ObfuscatedName("ay")
	int[] field2337;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1659501617
	)
	int field2338;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1952235361
	)
	int field2339;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1728669651
	)
	int field2347;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1887095333
	)
	int field2341;
	@ObfuscatedName("az")
	boolean[] field2340;
	@ObfuscatedName("ab")
	boolean[] field2333;
	@ObfuscatedName("ao")
	boolean[] field2344;
	@ObfuscatedName("as")
	public char field2345;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -593556623
	)
	public int field2346;

	public class212() {
		this.field2334 = new char[128]; // L: 8
		this.field2343 = new int[128]; // L: 9
		this.field2335 = new int[128]; // L: 10
		this.field2336 = 0; // L: 11
		this.field2337 = new int[128]; // L: 12
		this.field2338 = 0; // L: 13
		this.field2339 = 0; // L: 14
		this.field2347 = 0; // L: 15
		this.field2341 = 0; // L: 16
		this.field2340 = new boolean[112]; // L: 17
		this.field2333 = new boolean[112]; // L: 18
		this.field2344 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "82"
	)
	public boolean vmethod4291(int var1) {
		this.method4256(var1); // L: 24
		this.field2340[var1] = true; // L: 25
		this.field2333[var1] = true; // L: 26
		this.field2344[var1] = false; // L: 27
		this.field2335[++this.field2336 - 1] = var1; // L: 28
		return true; // L: 29
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1280453224"
	)
	public boolean vmethod4254(int var1) {
		this.field2340[var1] = false; // L: 33
		this.field2333[var1] = false; // L: 34
		this.field2344[var1] = true; // L: 35
		this.field2337[++this.field2338 - 1] = var1; // L: 36
		return true; // L: 37
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-81"
	)
	public boolean vmethod4255(char var1) {
		int var2 = this.field2347 + 1 & 127; // L: 41
		if (var2 != this.field2339) { // L: 42
			this.field2343[this.field2347] = -1; // L: 43
			this.field2334[this.field2347] = var1; // L: 44
			this.field2347 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-996268450"
	)
	public boolean vmethod4276(boolean var1) {
		return false; // L: 60
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-412093432"
	)
	void method4256(int var1) {
		int var2 = this.field2347 + 1 & 127; // L: 51
		if (var2 != this.field2339) { // L: 52
			this.field2343[this.field2347] = var1; // L: 53
			this.field2334[this.field2347] = 0; // L: 54
			this.field2347 = var2; // L: 55
		}

	} // L: 57

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method4265() {
		this.field2339 = this.field2341; // L: 64
		this.field2341 = this.field2347; // L: 65
		this.field2336 = 0; // L: 66
		this.field2338 = 0; // L: 67
		Arrays.fill(this.field2333, false); // L: 68
		Arrays.fill(this.field2344, false); // L: 69
	} // L: 70

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2052969992"
	)
	public final boolean method4277() {
		if (this.field2341 == this.field2339) { // L: 73
			return false;
		} else {
			this.field2346 = this.field2343[this.field2339]; // L: 74
			this.field2345 = this.field2334[this.field2339]; // L: 75
			this.field2339 = this.field2339 + 1 & 127; // L: 76
			return true; // L: 77
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-935743929"
	)
	public boolean method4260(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2333[var1] : false; // L: 81 82
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "708"
	)
	public boolean method4285(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2340[var1] : false; // L: 86 87
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-1"
	)
	public boolean method4268(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2344[var1] : false; // L: 91 92
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1778917259"
	)
	public int[] method4263() {
		int[] var1 = new int[this.field2336]; // L: 96

		for (int var2 = 0; var2 < this.field2336; ++var2) { // L: 97
			var1[var2] = this.field2335[var2]; // L: 98
		}

		return var1; // L: 100
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "436093098"
	)
	public int[] method4264() {
		int[] var1 = new int[this.field2338]; // L: 104

		for (int var2 = 0; var2 < this.field2338; ++var2) { // L: 105
			var1[var2] = this.field2337[var2]; // L: 106
		}

		return var1; // L: 108
	}
}
