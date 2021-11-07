import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class279 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "228808320"
	)
	static final void method5217(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		class397.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1977280908"
	)
	static void method5216() {
		if (ClanSettings.field1440 != null) {
			Client.field742 = Client.cycle;
			ClanSettings.field1440.method5490();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					ClanSettings.field1440.method5498(class19.baseX * 64 + (Client.players[var0].x >> 7), DefaultsGroup.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
