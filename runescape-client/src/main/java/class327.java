import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public class class327 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final class327 field4051;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final class327 field4052;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final class327 field4050;

	static {
		field4051 = new class327();
		field4052 = new class327();
		field4050 = new class327();
	}

	class327() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldy;",
		garbageValue = "14"
	)
	static class116 method6109(int var0) {
		class116[] var1 = new class116[]{class116.field1420, class116.field1419, class116.field1425, class116.field1421, class116.field1423};
		class116 var2 = (class116)ChatChannel.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class116.field1420;
		}

		return var2;
	}
}
