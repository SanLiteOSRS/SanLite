import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static final LoginType field4088;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static final LoginType field4083;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static final LoginType field4084;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static final LoginType field4082;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static final LoginType field4086;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static final LoginType field4087;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static final LoginType field4081;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	public static final LoginType field4089;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -695543887
	)
	final int field4090;
	@ObfuscatedName("z")
	final String field4091;

	static {
		oldscape = new LoginType(6, 0, "", "");
		field4088 = new LoginType(1, 1, "", "");
		field4083 = new LoginType(3, 2, "", "");
		field4084 = new LoginType(5, 3, "", "");
		field4082 = new LoginType(8, 4, "", "");
		field4086 = new LoginType(7, 5, "", "");
		field4087 = new LoginType(0, 6, "", "");
		field4081 = new LoginType(2, 7, "", "");
		field4089 = new LoginType(4, -1, "", "", true, new LoginType[]{oldscape, field4088, field4083, field4082, field4084});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4090 = var1;
		this.field4091 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lnb;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4090 = var1;
		this.field4091 = var4;
	}

	public String toString() {
		return this.field4091;
	}
}
