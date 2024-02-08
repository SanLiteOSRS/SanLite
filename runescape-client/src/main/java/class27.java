import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class27 {
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1968580127
	)
	static int field135;
	@ObfuscatedName("ag")
	int[] field138;
	@ObfuscatedName("ao")
	int[] field140;

	public class27() {
		this.field138 = new int[112]; // L: 12
		this.field140 = new int[192]; // L: 13
		Arrays.fill(this.field138, 3); // L: 16
		Arrays.fill(this.field140, 3); // L: 17
	} // L: 18

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "83"
	)
	public void method427(int var1, int var2) {
		if (this.method400(var1) && this.method422(var2)) { // L: 21
			this.field138[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "-120"
	)
	public void method393(char var1, int var2) {
		if (this.method397(var1) && this.method422(var2)) { // L: 27
			this.field140[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1889056683"
	)
	public int method394(int var1) {
		return this.method400(var1) ? this.field138[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "0"
	)
	public int method395(char var1) {
		return this.method397(var1) ? this.field140[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1248469043"
	)
	public boolean method412(int var1) {
		return this.method400(var1) && (this.field138[var1] == 1 || this.field138[var1] == 3); // L: 47
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "1"
	)
	public boolean method418(char var1) {
		return this.method397(var1) && (this.field140[var1] == 1 || this.field140[var1] == 3); // L: 51
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "845483812"
	)
	public boolean method398(int var1) {
		return this.method400(var1) && (this.field138[var1] == 2 || this.field138[var1] == 3); // L: 55
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "392991290"
	)
	public boolean method399(char var1) {
		return this.method397(var1) && (this.field140[var1] == 2 || this.field140[var1] == 3); // L: 59
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "105"
	)
	boolean method400(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "105"
	)
	boolean method397(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "84"
	)
	boolean method422(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(I)Lpu;",
		garbageValue = "89017045"
	)
	public static NodeDeque method401() {
		return Client.scriptEvents; // L: 5137
	}
}
