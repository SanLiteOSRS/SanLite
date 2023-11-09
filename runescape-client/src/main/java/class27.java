import java.awt.FontMetrics;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class27 {
	@ObfuscatedName("as")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("by")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -40136851
	)
	static int field134;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("av")
	int[] field140;
	@ObfuscatedName("an")
	int[] field135;

	public class27() {
		this.field140 = new int[112]; // L: 12
		this.field135 = new int[192]; // L: 13
		Arrays.fill(this.field140, 3); // L: 16
		Arrays.fill(this.field135, 3); // L: 17
	} // L: 18

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	public void method445(int var1, int var2) {
		if (this.method422(var1) && this.method413(var2)) { // L: 21
			this.field140[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "112"
	)
	public void method415(char var1, int var2) {
		if (this.method423(var1) && this.method413(var2)) { // L: 27
			this.field135[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public int method414(int var1) {
		return this.method422(var1) ? this.field140[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "-17"
	)
	public int method417(char var1) {
		return this.method423(var1) ? this.field135[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1377669175"
	)
	public boolean method418(int var1) {
		return this.method422(var1) && (this.field140[var1] == 1 || this.field140[var1] == 3); // L: 47
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "2047353313"
	)
	public boolean method419(char var1) {
		return this.method423(var1) && (this.field135[var1] == 1 || this.field135[var1] == 3); // L: 51
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1846006137"
	)
	public boolean method420(int var1) {
		return this.method422(var1) && (this.field140[var1] == 2 || this.field140[var1] == 3); // L: 55
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-52"
	)
	public boolean method421(char var1) {
		return this.method423(var1) && (this.field135[var1] == 2 || this.field135[var1] == 3); // L: 59
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "24680"
	)
	boolean method422(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "689018457"
	)
	boolean method423(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-96"
	)
	boolean method413(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}
}
