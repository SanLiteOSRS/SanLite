import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static final LoginType field4552;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static final LoginType field4554;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static final LoginType field4551;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static final LoginType field4555;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static final LoginType field4556;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static final LoginType field4557;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	static final LoginType field4558;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	public static final LoginType field4559;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 722837247
	)
	final int field4560;
	@ObfuscatedName("k")
	final String field4561;

	static {
		oldscape = new LoginType(8, 0, "", "");
		field4552 = new LoginType(5, 1, "", "");
		field4554 = new LoginType(4, 2, "", "");
		field4551 = new LoginType(1, 3, "", "");
		field4555 = new LoginType(0, 4, "", "");
		field4556 = new LoginType(3, 5, "", "");
		field4557 = new LoginType(6, 6, "", "");
		field4558 = new LoginType(2, 7, "", "");
		field4559 = new LoginType(7, -1, "", "", true, new LoginType[]{oldscape, field4552, field4554, field4555, field4551});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4560 = var1;
		this.field4561 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lpa;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4560 = var1;
		this.field4561 = var4;
	}

	public String toString() {
		return this.field4561;
	}
}
