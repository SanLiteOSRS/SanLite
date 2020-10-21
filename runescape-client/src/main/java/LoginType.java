import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	static final LoginType field4059;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	static final LoginType field4056;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	static final LoginType field4057;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	static final LoginType field4058;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	static final LoginType field4064;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	static final LoginType field4055;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	static final LoginType field4061;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lmu;"
	)
	public static final LoginType field4062;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -430747297
	)
	final int field4063;
	@ObfuscatedName("n")
	final String field4054;

	static {
		oldscape = new LoginType(1, 0, "", "");
		field4059 = new LoginType(8, 1, "", "");
		field4056 = new LoginType(3, 2, "", "");
		field4057 = new LoginType(4, 3, "", "");
		field4058 = new LoginType(6, 4, "", "");
		field4064 = new LoginType(7, 5, "", "");
		field4055 = new LoginType(5, 6, "", "");
		field4061 = new LoginType(0, 7, "", "");
		field4062 = new LoginType(2, -1, "", "", true, new LoginType[]{oldscape, field4059, field4056, field4058, field4057});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4063 = var1;
		this.field4054 = var4;
	}

	@ObfuscatedSignature(
		signature = "(IILjava/lang/String;Ljava/lang/String;Z[Lmu;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4063 = var1;
		this.field4054 = var4;
	}

	public String toString() {
		return this.field4054;
	}
}
