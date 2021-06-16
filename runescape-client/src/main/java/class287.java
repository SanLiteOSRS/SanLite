import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class287 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class287 field3672;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class287 field3671;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	static final class287 field3673;

	static {
		field3672 = new class287();
		field3671 = new class287();
		field3673 = new class287();
	}

	class287() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Ley;",
		garbageValue = "-31"
	)
	public static HealthBarDefinition method5260(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.field1600.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.field1600.put(var1, (long)var0);
			return var1;
		}
	}
}
