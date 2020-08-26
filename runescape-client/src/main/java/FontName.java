import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lkz;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lkz;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lkz;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lkz;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lkz;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lkz;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 334630663
	)
	@Export("clientTickTimeIdx")
	static int clientTickTimeIdx;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("x")
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)[Lkz;",
		garbageValue = "1417653903"
	)
	public static FontName[] method5439() {
		return new FontName[]{FontName_verdana13, FontName_verdana15, FontName_verdana11, FontName_plain12, FontName_plain11, FontName_bold12};
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;II)Z",
		garbageValue = "-1097380872"
	)
	static boolean method5444(String var0, int var1) {
		return WorldMapIcon_1.method380(var0, var1, "openjs");
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1161805725"
	)
	public static String method5445(CharSequence var0) {
		return ScriptEvent.method1236('*', var0.length());
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1773491987"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field890 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class39.getWindowedMode() == 1) {
			class2.client.setMaxCanvasSize(765, 503);
		} else {
			class2.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			GrandExchangeEvent.method160();
		}

	}
}
