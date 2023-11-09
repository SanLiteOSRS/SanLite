import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("um")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -767276677
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1299964891
	)
	public static int field5179;
	@ObfuscatedName("ax")
	@Export("message")
	String message;
	@ObfuscatedName("al")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 28
		this.throwable = var1; // L: 29
	} // L: 30
}
