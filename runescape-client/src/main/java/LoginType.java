import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static final LoginType field5019;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static final LoginType field5020;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static final LoginType field5029;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static final LoginType field5018;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static final LoginType field5023;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static final LoginType field5024;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static final LoginType field5025;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	public static final LoginType field5027;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1236604395
	)
	public final int field5022;
	@ObfuscatedName("ap")
	final String field5021;

	static {
		oldscape = new LoginType(0, 0, "", ""); // L: 5
		field5019 = new LoginType(8, 1, "", ""); // L: 6
		field5020 = new LoginType(7, 2, "", ""); // L: 7
		field5029 = new LoginType(5, 3, "", ""); // L: 8
		field5018 = new LoginType(4, 4, "", ""); // L: 9
		field5023 = new LoginType(1, 5, "", ""); // L: 10
		field5024 = new LoginType(6, 6, "", ""); // L: 11
		field5025 = new LoginType(3, 7, "", ""); // L: 12
		field5027 = new LoginType(2, -1, "", "", true, new LoginType[]{oldscape, field5019, field5020, field5018, field5029}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5022 = var1; // L: 18
		this.field5021 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Ltt;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5022 = var1; // L: 23
		this.field5021 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field5021; // L: 29
	}
}
