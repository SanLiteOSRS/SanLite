import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	static final LoginType field4068;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	static final LoginType field4066;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	static final LoginType field4064;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	static final LoginType field4074;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	static final LoginType field4069;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	static final LoginType field4070;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	static final LoginType field4071;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lml;"
	)
	public static final LoginType field4072;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2066001733
	)
	public final int field4073;
	@ObfuscatedName("s")
	final String field4067;

	static {
		oldscape = new LoginType(4, 0, "", "");
		field4068 = new LoginType(7, 1, "", "");
		field4066 = new LoginType(2, 2, "", "");
		field4064 = new LoginType(5, 3, "", "");
		field4074 = new LoginType(1, 4, "", "");
		field4069 = new LoginType(0, 5, "", "");
		field4070 = new LoginType(8, 6, "", "");
		field4071 = new LoginType(6, 7, "", "");
		field4072 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4068, field4066, field4074, field4064});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4073 = var1;
		this.field4067 = var4;
	}

	@ObfuscatedSignature(
		signature = "(IILjava/lang/String;Ljava/lang/String;Z[Lml;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4073 = var1;
		this.field4067 = var4;
	}

	public String toString() {
		return this.field4067;
	}
}
