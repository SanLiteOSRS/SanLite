import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
public class class550 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lvc;",
		garbageValue = "242436982"
	)
	public static PrivateChatMode method9855(int var0) {
		PrivateChatMode[] var1 = class133.method3070(); // L: 20

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 21
			PrivateChatMode var3 = var1[var2]; // L: 22
			if (var0 == var3.field5374) {
				return var3; // L: 24
			}
		}

		return null; // L: 28
	}
}
