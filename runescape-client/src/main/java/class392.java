import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
public class class392 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	public static final class392 field4475;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	static final class392 field4478;
	@ObfuscatedName("bj")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -84981371
	)
	final int field4477;

	static {
		field4475 = new class392(1); // L: 5
		field4478 = new class392(0); // L: 6
	}

	class392(int var1) {
		this.field4477 = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "1245058623"
	)
	static SecureRandom method7406() {
		SecureRandom var0 = new SecureRandom(); // L: 39
		var0.nextInt(); // L: 40
		return var0; // L: 41
	}
}
