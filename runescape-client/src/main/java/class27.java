import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
public class class27 {
	@ObfuscatedName("ab")
	int[] field135;
	@ObfuscatedName("ak")
	int[] field139;

	public class27() {
		this.field135 = new int[112]; // L: 12
		this.field139 = new int[192]; // L: 13
		Arrays.fill(this.field135, 3); // L: 16
		Arrays.fill(this.field139, 3); // L: 17
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "116036003"
	)
	public void method382(int var1, int var2) {
		if (this.method381(var1) && this.method403(var2)) { // L: 21
			this.field135[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "21"
	)
	public void method383(char var1, int var2) {
		if (this.method390(var1) && this.method403(var2)) {
			this.field139[var1] = var2;
		}

	} // L: 30

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "125718608"
	)
	public int method420(int var1) {
		return this.method381(var1) ? this.field135[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "-11"
	)
	public int method385(char var1) {
		return this.method390(var1) ? this.field139[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1565428468"
	)
	public boolean method386(int var1) {
		return this.method381(var1) && (this.field135[var1] == 1 || this.field135[var1] == 3); // L: 47
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1964583469"
	)
	public boolean method387(char var1) {
		return this.method390(var1) && (this.field139[var1] == 1 || this.field139[var1] == 3); // L: 51
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1607220221"
	)
	public boolean method388(int var1) {
		return this.method381(var1) && (this.field135[var1] == 2 || this.field135[var1] == 3); // L: 55
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-42"
	)
	public boolean method389(char var1) {
		return this.method390(var1) && (this.field139[var1] == 2 || this.field139[var1] == 3); // L: 59
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2085268656"
	)
	boolean method381(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1585815968"
	)
	boolean method390(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "125198705"
	)
	boolean method403(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZS)V",
		garbageValue = "-19421"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		class100.method2626(var0, var1, "openjs", var2); // L: 27
	} // L: 28

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-52"
	)
	static long method406() {
		return Client.field631; // L: 3076
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)V",
		garbageValue = "1"
	)
	static final void method391(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		WorldMapID.method5467(var0, var1, var2, var3, var4, var5, var6, false); // L: 10160
	} // L: 10161
}
