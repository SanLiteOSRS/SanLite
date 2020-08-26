import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class25 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)[Llm;",
		garbageValue = "742415234"
	)
	@Export("FillMode_values")
	public static class332[] FillMode_values() {
		return new class332[]{class332.field3888, class332.SOLID, class332.field3889};
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Lme;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}
}
