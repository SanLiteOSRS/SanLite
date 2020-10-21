import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	public static class247 field1901;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("soundEffectsArchive")
	static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("au")
	static String field1904;

	ModelData0() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lct;Lct;IZIZB)I",
		garbageValue = "73"
	)
	static int method3376(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class2.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = class2.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "1145056768"
	)
	static final void method3377(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString();
		WorldMapRectangle.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Ljava/net/Socket;IIB)Lln;",
		garbageValue = "14"
	)
	public static AbstractSocket method3375(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}
}
