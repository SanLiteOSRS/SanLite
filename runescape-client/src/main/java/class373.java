import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public class class373 extends DualNode {
	@ObfuscatedName("dl")
	static boolean field4355;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	Archive field4352;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2114435835
	)
	int field4354;
	@ObfuscatedName("af")
	byte field4353;

	class373() {
	} // L: 10

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;I)I",
		garbageValue = "2003716938"
	)
	static int method7026(AbstractArchive var0) {
		int var1 = Login.field941.length + Login.field942.length; // L: 168
		String[] var2 = Login.field943; // L: 170

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 171
			String var4 = var2[var3]; // L: 172
			if (var0.getGroupId(var4) != -1) { // L: 174
				++var1; // L: 175
			}
		}

		return var1; // L: 180
	}
}
