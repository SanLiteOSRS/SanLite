import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class313 {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field3398;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lol;Ljava/lang/String;Ljava/lang/String;B)Lup;",
		garbageValue = "12"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 140
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 141
			int var4 = var0.getFileId(var3, var2); // L: 142
			return class205.method4097(var0, var3, var4); // L: 143
		}
	}
}
