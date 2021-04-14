import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lmv;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lmv;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lmv;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lmv;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lmv;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lmv;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 1196232611
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("k")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "72"
	)
	static String method6285(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class0.field4 != null) {
			var3 = "/p=" + class0.field4;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + class35.clientLanguage + "/a=" + FaceNormal.field2002 + var3 + "/";
	}
}
