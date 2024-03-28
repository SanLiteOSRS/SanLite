import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class416 {
	@ObfuscatedName("az")
	public char field4607;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -359537527
	)
	public int field4606;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2077581877
	)
	public int field4605;

	class416() {
		this.field4606 = 0; // L: 5
		this.field4605 = 0; // L: 6
	} // L: 8

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Loc;Ljava/lang/String;Ljava/lang/String;I)[Lvl;",
		garbageValue = "1961812750"
	)
	public static IndexedSprite[] method7648(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 99
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 100
			int var4 = var0.getFileId(var3, var2); // L: 101
			return class225.method4272(var0, var3, var4); // L: 102
		}
	}
}
