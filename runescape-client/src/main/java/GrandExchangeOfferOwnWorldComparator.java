import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -1477191609
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("h")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljz;Ljz;B)I",
		garbageValue = "-64"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "836817261"
	)
	static void method1213() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1470000440"
	)
	static void method1212() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) {
			if (class44.method499(Client.menuOpcodes[var0])) {
				if (var0 < Client.menuOptionsCount - 1) {
					for (int var1 = var0; var1 < Client.menuOptionsCount - 1; ++var1) {
						Client.menuActions[var1] = Client.menuActions[var1 + 1];
						Client.menuTargets[var1] = Client.menuTargets[var1 + 1];
						Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1];
						Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1];
						Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1];
						Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1];
						Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1];
					}
				}

				--var0;
				--Client.menuOptionsCount;
			}
		}

		WorldMapRegion.method3317(SoundCache.menuWidth / 2 + AbstractByteArrayCopier.menuX, HitSplatDefinition.menuY);
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "117"
	)
	static final String method1214(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
