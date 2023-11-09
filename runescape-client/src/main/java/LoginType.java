import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static final LoginType field4930;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static final LoginType field4940;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static final LoginType field4932;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static final LoginType field4931;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static final LoginType field4934;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static final LoginType field4935;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	static final LoginType field4936;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	public static final LoginType field4937;
	@ObfuscatedName("sb")
	static boolean field4933;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2125697819
	)
	final int field4938;
	@ObfuscatedName("ad")
	final String field4939;

	static {
		oldscape = new LoginType(8, 0, "", ""); // L: 5
		field4930 = new LoginType(4, 1, "", ""); // L: 6
		field4940 = new LoginType(6, 2, "", ""); // L: 7
		field4932 = new LoginType(7, 3, "", ""); // L: 8
		field4931 = new LoginType(1, 4, "", ""); // L: 9
		field4934 = new LoginType(2, 5, "", ""); // L: 10
		field4935 = new LoginType(3, 6, "", ""); // L: 11
		field4936 = new LoginType(5, 7, "", ""); // L: 12
		field4937 = new LoginType(0, -1, "", "", true, new LoginType[]{oldscape, field4930, field4940, field4931, field4932}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4938 = var1; // L: 18
		this.field4939 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lsg;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4938 = var1; // L: 23
		this.field4939 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4939; // L: 29
	}
}
