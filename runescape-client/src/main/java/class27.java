import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class27 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field125;
	@ObfuscatedName("cq")
	@Export("otp")
	static String otp;
	@ObfuscatedName("ab")
	int[] field121;
	@ObfuscatedName("aw")
	int[] field118;

	public class27() {
		this.field121 = new int[112];
		this.field118 = new int[192];
		Arrays.fill(this.field121, 3);
		Arrays.fill(this.field118, 3); // L: 17
	} // L: 18

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "5000268"
	)
	public void method396(int var1, int var2) {
		if (this.method372(var1) && this.method361(var2)) { // L: 21
			this.field121[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-1060120672"
	)
	public void method402(char var1, int var2) {
		if (this.method371(var1) && this.method361(var2)) { // L: 27
			this.field118[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "3"
	)
	public int method364(int var1) {
		return this.method372(var1) ? this.field121[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CB)I",
		garbageValue = "-90"
	)
	public int method379(char var1) {
		return this.method371(var1) ? this.field118[var1] : 0; // L: 40
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1831477201"
	)
	public boolean method366(int var1) {
		return this.method372(var1) && (this.field121[var1] == 1 || this.field121[var1] == 3); // L: 47
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "907464497"
	)
	public boolean method367(char var1) {
		return this.method371(var1) && (this.field118[var1] == 1 || this.field118[var1] == 3); // L: 51
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "46"
	)
	public boolean method368(int var1) {
		return this.method372(var1) && (this.field121[var1] == 2 || this.field121[var1] == 3); // L: 55
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1220370851"
	)
	public boolean method365(char var1) {
		return this.method371(var1) && (this.field118[var1] == 2 || this.field118[var1] == 3); // L: 59
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "32"
	)
	boolean method372(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "67"
	)
	boolean method371(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1181765278"
	)
	boolean method361(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "670557189"
	)
	public static byte[] method401(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		byte[] var2 = new byte[var1]; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 > 127) { // L: 13
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 14
			}
		}

		return var2; // L: 16
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lto;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	static String method400(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 41
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 42
			return var3 == null ? var2 : (String)var3.obj; // L: 43 44
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	public static void method362() {
		class527.DBRowType_cache.clear(); // L: 86
	} // L: 87

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "596339197"
	)
	static final void method399(boolean var0) {
		if (var0) { // L: 3107
			Client.field547 = Login.field951 ? class140.field1657 : class140.field1659; // L: 3108
		} else {
			Client.field547 = NPC.clientPreferences.method2468(Login.Login_username) ? class140.field1661 : class140.field1656; // L: 3111
		}

	} // L: 3113
}
