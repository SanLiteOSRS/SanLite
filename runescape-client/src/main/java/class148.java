import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class148 {
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -2100278607
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "366368994"
	)
	static final int method3015(int var0, int var1) {
		int var2 = GrandExchangeOfferWorldComparator.method4609(var0 + 45365, 91923 + var1, 4) - 128 + (GrandExchangeOfferWorldComparator.method4609(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (GrandExchangeOfferWorldComparator.method4609(var0, var1, 1) - 128 >> 2);
		var2 = (int)(0.3D * (double)var2) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Lbu;S)V",
		garbageValue = "-13863"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			Actor.method2173(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			Archive var1 = SoundSystem.archive8;
			int var2 = var0.properties;
			if ((var2 & 536870912) != 0) {
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var2 & 1073741824) != 0) {
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}
		}

		MusicPatch.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		AttackOption.port1 = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		Calendar.port2 = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class5.port3 = AttackOption.port1;
	}
}
