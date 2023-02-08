import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class36 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1268850395"
	)
	public static void method694() {
		ByteArrayPool.field4443.clear(); // L: 43
		ByteArrayPool.field4443.add(100); // L: 44
		ByteArrayPool.field4443.add(5000); // L: 45
		ByteArrayPool.field4443.add(10000); // L: 46
		ByteArrayPool.field4443.add(30000); // L: 47
	} // L: 48
}
