import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uy")
@Implements("RunException")
public class RunException extends RuntimeException {
	@ObfuscatedName("ai")
	@Export("RunException_applet")
	public static Applet RunException_applet;
	@ObfuscatedName("aj")
	public static String field5234;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1685534943
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ap")
	@Export("message")
	String message;
	@ObfuscatedName("av")
	@Export("throwable")
	Throwable throwable;

	RunException(Throwable var1, String var2) {
		this.message = var2; // L: 28
		this.throwable = var1; // L: 29
	} // L: 30
}
