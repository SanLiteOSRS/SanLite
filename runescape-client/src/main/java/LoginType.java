import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final LoginType field4853;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final LoginType field4852;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final LoginType field4857;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final LoginType field4854;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final LoginType field4855;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final LoginType field4860;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final LoginType field4856;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	public static final LoginType field4858;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -194931179
	)
	public final int field4859;
	@ObfuscatedName("c")
	final String field4850;

	static {
		oldscape = new LoginType(7, 0, "", ""); // L: 5
		field4853 = new LoginType(2, 1, "", ""); // L: 6
		field4852 = new LoginType(4, 2, "", ""); // L: 7
		field4857 = new LoginType(8, 3, "", ""); // L: 8
		field4854 = new LoginType(3, 4, "", ""); // L: 9
		field4855 = new LoginType(5, 5, "", ""); // L: 10
		field4860 = new LoginType(1, 6, "", ""); // L: 11
		field4856 = new LoginType(6, 7, "", ""); // L: 12
		field4858 = new LoginType(0, -1, "", "", true, new LoginType[]{oldscape, field4853, field4852, field4854, field4857}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4859 = var1; // L: 18
		this.field4850 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lqj;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4859 = var1; // L: 23
		this.field4850 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4850; // L: 29
	}
}
