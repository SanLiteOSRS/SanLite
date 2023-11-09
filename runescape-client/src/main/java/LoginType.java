import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static final LoginType field4818;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static final LoginType field4819;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static final LoginType field4817;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static final LoginType field4821;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static final LoginType field4822;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static final LoginType field4823;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	static final LoginType field4825;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	public static final LoginType field4820;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 543041991
	)
	final int field4826;
	@ObfuscatedName("ak")
	final String field4824;

	static {
		oldscape = new LoginType(7, 0, "", ""); // L: 5
		field4818 = new LoginType(4, 1, "", ""); // L: 6
		field4819 = new LoginType(6, 2, "", ""); // L: 7
		field4817 = new LoginType(0, 3, "", ""); // L: 8
		field4821 = new LoginType(5, 4, "", ""); // L: 9
		field4822 = new LoginType(2, 5, "", ""); // L: 10
		field4823 = new LoginType(3, 6, "", ""); // L: 11
		field4825 = new LoginType(1, 7, "", ""); // L: 12
		field4820 = new LoginType(8, -1, "", "", true, new LoginType[]{oldscape, field4818, field4819, field4821, field4817}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4826 = var1; // L: 18
		this.field4824 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lrm;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4826 = var1; // L: 23
		this.field4824 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4824; // L: 29
	}
}
