import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("Login")
public class Login {
	@ObfuscatedName("b")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1744707789
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Llc;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lle;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lcg;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1076468107
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1330731251
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("a")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1371548097
	)
	static int field1216;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 402121111
	)
	static int field1217;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1682315035
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ai")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("ax")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ag")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("aq")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("aw")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("an")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("al")
	static boolean field1230;
	@ObfuscatedName("ap")
	static boolean field1229;
	@ObfuscatedName("bf")
	static boolean field1227;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1450671401
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bl")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -374959449
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1738897563
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1533348533
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = -8374739296205492955L
	)
	static long field1223;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = 3745631578629079475L
	)
	static long field1241;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field1216 = -1;
		field1217 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field1230 = false;
		field1229 = false;
		field1227 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class171();
		field1223 = -1L;
		field1241 = -1L;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-1829542828"
	)
	public static String method2219(CharSequence var0) {
		long var3 = 0L;
		int var5 = var0.length();

		for (int var6 = 0; var6 < var5; ++var6) {
			var3 *= 37L;
			char var7 = var0.charAt(var6);
			if (var7 >= 'A' && var7 <= 'Z') {
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') {
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48);
			}

			if (var3 >= 177917621779460413L) {
				break;
			}
		}

		while (var3 % 37L == 0L && var3 != 0L) {
			var3 /= 37L;
		}

		String var8 = class69.base37DecodeLong(var3);
		if (var8 == null) {
			var8 = "";
		}

		return var8;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmp;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-560858239"
	)
	static final void method2200() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (var0.plane == GrandExchangeOfferUnitPriceComparator.Client_plane && Client.cycle <= var0.cycleEnd) {
				if (Client.cycle >= var0.cycleStart) {
					if (var0.targetIndex > 0) {
						NPC var1 = Client.npcs[var0.targetIndex - 1];
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
							var0.setDestination(var1.x, var1.y, GrandExchangeOfferWorldComparator.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) {
						int var2 = -var0.targetIndex - 1;
						Player var3;
						if (var2 == Client.localPlayerIndex) {
							var3 = PlayerType.localPlayer;
						} else {
							var3 = Client.players[var2];
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, GrandExchangeOfferWorldComparator.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					var0.advance(Client.field743);
					ModeWhere.scene.drawEntity(GrandExchangeOfferUnitPriceComparator.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
				}
			} else {
				var0.remove();
			}
		}

	}
}
