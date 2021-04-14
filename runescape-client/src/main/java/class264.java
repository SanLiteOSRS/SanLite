import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class264 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ljj;"
	)
	static final class264 field3341;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Ljj;"
	)
	static final class264 field3340;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Ljj;"
	)
	static final class264 field3339;

	static {
		field3341 = new class264();
		field3340 = new class264();
		field3339 = new class264();
	}

	class264() {
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(Lnk;I)I",
		garbageValue = "-1827294520"
	)
	static int method4680(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}
}
