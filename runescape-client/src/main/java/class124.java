import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class124 implements class123 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1858583893
	)
	@Export("SpriteBuffer_spriteCount")
	static int SpriteBuffer_spriteCount;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1284583399"
	)
	public static int method2490() {
		return ViewportMouse.ViewportMouse_entityCount;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "2146818180"
	)
	public static int method2489(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(CLjh;B)I",
		garbageValue = "3"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Loh;",
		garbageValue = "-64813696"
	)
	public static SpritePixels[] method2492(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return class337.method5985(var0, var3, var4);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1303478774"
	)
	static final void method2488() {
		Object var10000 = null;
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		class69.addGameMessage(30, "", var0);
	}
}
