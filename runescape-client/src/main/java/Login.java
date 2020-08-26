import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Login")
public class Login {
	@ObfuscatedName("k")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1062905543
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	static IndexedSprite field1221;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -760884959
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 496089237
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("p")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1163892197
	)
	static int field1210;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -608933825
	)
	static int field1213;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 662808535
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("aq")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("al")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("ah")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("av")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("ax")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("as")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("af")
	static boolean field1224;
	@ObfuscatedName("ak")
	static boolean field1201;
	@ObfuscatedName("bc")
	static boolean field1223;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -189383965
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("bg")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		signature = "[Lls;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -322396857
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1129392139
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1846745523
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		longValue = -4736688833894642183L
	)
	static long field1232;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		longValue = -2848820817006551463L
	)
	static long field1233;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		field1210 = -1;
		field1213 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field1224 = false;
		field1201 = false;
		field1223 = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class171();
		field1232 = -1L;
		field1233 = -1L;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "942552334"
	)
	static final void method2160() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (var0.plane == Huffman.Client_plane && Client.cycle <= var0.cycleEnd) {
				if (Client.cycle >= var0.cycleStart) {
					if (var0.targetIndex > 0) {
						NPC var1 = Client.npcs[var0.targetIndex - 1];
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
							var0.setDestination(var1.x, var1.y, ArchiveLoader.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) {
						int var2 = -var0.targetIndex - 1;
						Player var3;
						if (var2 == Client.localPlayerIndex) {
							var3 = WorldMapLabelSize.localPlayer;
						} else {
							var3 = Client.players[var2];
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, ArchiveLoader.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					var0.advance(Client.field737);
					ScriptEvent.scene.drawEntity(Huffman.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
				}
			} else {
				var0.remove();
			}
		}

	}
}
