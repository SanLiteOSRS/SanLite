import java.io.IOException;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bj")
	public static String field2988;
	@ObfuscatedName("cx")
	public static String field2936;
	@ObfuscatedName("jv")
	public static String field3067;
	@ObfuscatedName("ji")
	public static String field3015;
	@ObfuscatedName("jb")
	public static String field3069;

	static {
		field2988 = "Please visit the support page for assistance.";
		field2936 = "Please visit the support page for assistance.";
		field3067 = "";
		field3015 = "Page has opened in a new window.";
		field3069 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-21"
	)
	static void method4202() {
		if (Login.clearLoginScreen) {
			class296.titleboxSprite = null;
			ModelData0.titlebuttonSprite = null;
			GrandExchangeOfferTotalQuantityComparator.runesSprite = null;
			UserComparator2.leftTitleSprite = null;
			Login.rightTitleSprite = null;
			AbstractByteArrayCopier.logoSprite = null;
			ClientPreferences.title_muteSprite = null;
			class227.options_buttons_0Sprite = null;
			MusicPatchNode2.options_buttons_2Sprite = null;
			MidiPcmStream.worldSelectBackSprites = null;
			AbstractWorldMapIcon.worldSelectFlagSprites = null;
			MusicPatchNode.worldSelectArrows = null;
			Login.worldSelectStars = null;
			class7.field36 = null;
			Varcs.loginScreenRunesAnimation.method1904();
			class58.method915(2);
			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var0 = new Buffer(4);
					var0.writeByte(2);
					var0.writeMedium(0);
					NetCache.NetCache_socket.write(var0.array, 0, 4);
				} catch (IOException var3) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var2) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = false;
		}
	}
}
