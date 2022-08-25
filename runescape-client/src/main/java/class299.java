import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
public class class299 {
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("archive8")
	static Archive archive8;

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqi;",
		garbageValue = "7"
	)
	public static PrivateChatMode method5660(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field4825, PrivateChatMode.field4823, PrivateChatMode.field4826}; // L: 18
		PrivateChatMode[] var2 = var1; // L: 20

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 21
			PrivateChatMode var4 = var2[var3]; // L: 22
			if (var0 == var4.field4824) { // L: 24
				return var4;
			}
		}

		return null; // L: 28
	}
}
