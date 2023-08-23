import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
public class class219 implements Comparator {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static IndexedSprite field2417;
	@ObfuscatedName("bw")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;

	class219() {
	} // L: 39

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lio;Lio;I)I",
		garbageValue = "-975759787"
	)
	int method4257(class214 var1, class214 var2) {
		return var1.method4178() - var2.method4178(); // L: 42
	}

	public int compare(Object var1, Object var2) {
		return this.method4257((class214)var1, (class214)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 50
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Ljava/lang/String;Ljava/lang/String;B)[Luk;",
		garbageValue = "-64"
	)
	public static IndexedSprite[] method4261(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 43
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 44
			int var4 = var0.getFileId(var3, var2); // L: 45
			return KeyHandler.method424(var0, var3, var4); // L: 46
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-38"
	)
	public static void method4262() {
		class505.DBTableType_cache.clear(); // L: 67
	} // L: 68
}
