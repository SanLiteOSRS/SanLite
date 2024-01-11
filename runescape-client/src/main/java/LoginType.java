import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static final LoginType field5063;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static final LoginType field5062;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static final LoginType field5065;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static final LoginType field5066;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static final LoginType field5067;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static final LoginType field5068;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static final LoginType field5069;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	public static final LoginType field5070;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1785594517
	)
	final int field5071;
	@ObfuscatedName("au")
	final String field5072;

	static {
		oldscape = new LoginType(4, 0, "", ""); // L: 5
		field5063 = new LoginType(0, 1, "", ""); // L: 6
		field5062 = new LoginType(5, 2, "", ""); // L: 7
		field5065 = new LoginType(3, 3, "", ""); // L: 8
		field5066 = new LoginType(7, 4, "", ""); // L: 9
		field5067 = new LoginType(1, 5, "", ""); // L: 10
		field5068 = new LoginType(6, 6, "", ""); // L: 11
		field5069 = new LoginType(8, 7, "", ""); // L: 12
		field5070 = new LoginType(2, -1, "", "", true, new LoginType[]{oldscape, field5063, field5062, field5066, field5065}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5071 = var1; // L: 18
		this.field5072 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lth;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5071 = var1; // L: 23
		this.field5072 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field5072; // L: 29
	}
}
