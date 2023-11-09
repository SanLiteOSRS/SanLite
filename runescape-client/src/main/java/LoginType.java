import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4925;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4926;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4927;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4929;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4928;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4930;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	static final LoginType field4931;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	public static final LoginType field4924;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1068092619
	)
	final int field4933;
	@ObfuscatedName("ao")
	final String field4932;

	static {
		oldscape = new LoginType(1, 0, "", ""); // L: 5
		field4925 = new LoginType(7, 1, "", ""); // L: 6
		field4926 = new LoginType(0, 2, "", ""); // L: 7
		field4927 = new LoginType(5, 3, "", ""); // L: 8
		field4929 = new LoginType(8, 4, "", ""); // L: 9
		field4928 = new LoginType(6, 5, "", ""); // L: 10
		field4930 = new LoginType(2, 6, "", ""); // L: 11
		field4931 = new LoginType(4, 7, "", ""); // L: 12
		field4924 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4925, field4926, field4929, field4927}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4933 = var1; // L: 18
		this.field4932 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lsj;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4933 = var1; // L: 23
		this.field4932 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4932; // L: 29
	}
}
