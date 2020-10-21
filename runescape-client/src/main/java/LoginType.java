import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	static final LoginType field4071;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	static final LoginType field4063;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	static final LoginType field4064;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	static final LoginType field4065;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	static final LoginType field4066;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	static final LoginType field4067;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	static final LoginType field4069;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lmc;"
	)
	public static final LoginType field4061;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lds;"
	)
	@Export("soundCache")
	public static SoundCache soundCache;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1603045389
	)
	final int field4070;
	@ObfuscatedName("e")
	final String field4068;

	static {
		oldscape = new LoginType(8, 0, "", "");
		field4071 = new LoginType(4, 1, "", "");
		field4063 = new LoginType(7, 2, "", "");
		field4064 = new LoginType(0, 3, "", "");
		field4065 = new LoginType(2, 4, "", "");
		field4066 = new LoginType(6, 5, "", "");
		field4067 = new LoginType(3, 6, "", "");
		field4069 = new LoginType(1, 7, "", "");
		field4061 = new LoginType(5, -1, "", "", true, new LoginType[]{oldscape, field4071, field4063, field4065, field4064});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4070 = var1;
		this.field4068 = var4;
	}

	@ObfuscatedSignature(
		signature = "(IILjava/lang/String;Ljava/lang/String;Z[Lmc;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4070 = var1;
		this.field4068 = var4;
	}

	public String toString() {
		return this.field4068;
	}
}
