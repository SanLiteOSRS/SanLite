import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("KeyHandler")
public class KeyHandler {
	@ObfuscatedName("bd")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("dc")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 92
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 63
		if (var1 != null) { // L: 64
			for (int var2 = 0; var2 < var1.ids.length; ++var2) { // L: 65
				var1.ids[var2] = -1; // L: 66
				var1.quantities[var2] = 0; // L: 67
			}

		}
	} // L: 69

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "-802183786"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 2214
			Client.isMembersWorld = var0.isMembersOnly(); // L: 2215
			boolean var1 = var0.isMembersOnly(); // L: 2216
			if (var1 != class129.ItemComposition_inMembersWorld) { // L: 2218
				ItemComposition.ItemComposition_cached.clear(); // L: 2220
				ItemComposition.ItemComposition_cachedModels.clear(); // L: 2221
				ItemComposition.ItemComposition_cachedSprites.clear(); // L: 2222
				class129.ItemComposition_inMembersWorld = var1; // L: 2224
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 2228
			Archive var3 = GrandExchangeOfferOwnWorldComparator.field481; // L: 2229
			int var2 = var0.properties; // L: 2230
			if ((var2 & class522.field5122.rsOrdinal()) != 0) { // L: 2232
				Login.logoSprite = class313.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", ""); // L: 2233
			} else if ((var2 & class522.field5123.rsOrdinal()) != 0) { // L: 2235
				Login.logoSprite = class313.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", ""); // L: 2236
			} else if ((var2 & class522.field5094.rsOrdinal()) != 0) { // L: 2238
				Login.logoSprite = class313.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", ""); // L: 2239
			} else {
				Login.logoSprite = class313.SpriteBuffer_getIndexedSpriteByName(var3, "logo", ""); // L: 2242
			}
		}

		Friend.worldHost = var0.host; // L: 2246
		Client.worldId = var0.id; // L: 2247
		Client.worldProperties = var0.properties; // L: 2248
		ItemLayer.field2655 = var0.field808; // L: 2249
		WorldMapCacheName.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 2250
		AbstractSocket.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 2251
		class252.currentPort = WorldMapCacheName.worldPort; // L: 2252
	} // L: 2253

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "-1398097704"
	)
	static final String method450(int var0, int var1) {
		int var2 = var1 - var0; // L: 10662
		if (var2 < -9) { // L: 10663
			return class167.colorStartTag(16711680);
		} else if (var2 < -6) { // L: 10664
			return class167.colorStartTag(16723968);
		} else if (var2 < -3) { // L: 10665
			return class167.colorStartTag(16740352);
		} else if (var2 < 0) { // L: 10666
			return class167.colorStartTag(16756736);
		} else if (var2 > 9) {
			return class167.colorStartTag(65280); // L: 10667
		} else if (var2 > 6) { // L: 10668
			return class167.colorStartTag(4259584);
		} else if (var2 > 3) { // L: 10669
			return class167.colorStartTag(8453888);
		} else {
			return var2 > 0 ? class167.colorStartTag(12648192) : class167.colorStartTag(16776960); // L: 10670 10671
		}
	}
}
