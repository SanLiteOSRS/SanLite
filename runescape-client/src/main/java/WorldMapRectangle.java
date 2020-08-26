import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("d")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 743023489
	)
	@Export("width")
	int width;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 995076797
	)
	@Export("height")
	int height;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1102925233
	)
	@Export("x")
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1014669257
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lai;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		signature = "(Lai;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "128"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		WorldMapData_0.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)Lcy;",
		garbageValue = "-1672146154"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ApproximateRouteStrategy.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = UserComparator7.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-2081056745"
	)
	static String method359() {
		return Tile.clientPreferences.hideUsername ? FontName.method5445(Login.Login_username) : Login.Login_username;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1970592993"
	)
	static void method361() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1277[var0] = null;
			Players.field1284[var0] = 1;
		}

	}
}
