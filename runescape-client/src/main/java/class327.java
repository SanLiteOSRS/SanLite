import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public class class327 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final class327 field4087;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final class327 field4088;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static final class327 field4086;

	static {
		field4087 = new class327(); // L: 4
		field4088 = new class327(); // L: 5
		field4086 = new class327(); // L: 6
	}

	class327() {
	} // L: 8

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1442599873"
	)
	public static void method5978() {
		ByteArrayPool.field4218.clear(); // L: 43
		ByteArrayPool.field4218.add(100); // L: 44
		ByteArrayPool.field4218.add(5000); // L: 45
		ByteArrayPool.field4218.add(10000); // L: 46
		ByteArrayPool.field4218.add(30000); // L: 47
	} // L: 48

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-869460521"
	)
	static void method5979() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11480
			int var1 = var0.group; // L: 11481
			if (ParamComposition.loadInterface(var1)) { // L: 11482
				boolean var2 = true; // L: 11483
				Widget[] var3 = class358.Widget_interfaceComponents[var1]; // L: 11484

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11485
					if (var3[var4] != null) { // L: 11486
						var2 = var3[var4].isIf3; // L: 11487
						break;
					}
				}

				if (!var2) { // L: 11491
					var4 = (int)var0.key; // L: 11492
					Widget var5 = HitSplatDefinition.getWidget(var4); // L: 11493
					if (var5 != null) { // L: 11494
						class125.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11498
}
