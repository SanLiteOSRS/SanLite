import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final LoginType field4829;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final LoginType field4838;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final LoginType field4832;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final LoginType field4830;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final LoginType field4834;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final LoginType field4835;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static final LoginType field4836;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	public static final LoginType field4837;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2052296465
	)
	public final int field4833;
	@ObfuscatedName("j")
	final String field4839;

	static {
		oldscape = new LoginType(7, 0, "", ""); // L: 5
		field4829 = new LoginType(0, 1, "", ""); // L: 6
		field4838 = new LoginType(6, 2, "", ""); // L: 7
		field4832 = new LoginType(5, 3, "", ""); // L: 8
		field4830 = new LoginType(8, 4, "", ""); // L: 9
		field4834 = new LoginType(1, 5, "", ""); // L: 10
		field4835 = new LoginType(3, 6, "", ""); // L: 11
		field4836 = new LoginType(2, 7, "", ""); // L: 12
		field4837 = new LoginType(4, -1, "", "", true, new LoginType[]{oldscape, field4829, field4838, field4830, field4832}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4833 = var1; // L: 18
		this.field4839 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lqi;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4833 = var1; // L: 23
		this.field4839 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4839; // L: 29
	}
}
