import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class47 {
	@ObfuscatedName("sv")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcr;"
	)
	VorbisSample field317;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	RawSound field320;
	@ObfuscatedName("ar")
	ReentrantLock field318;

	@ObfuscatedSignature(
		descriptor = "(Lcr;Lbm;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field317 = var1; // L: 11
		this.field320 = var2; // L: 12
		this.field318 = new ReentrantLock(); // L: 13
	} // L: 14

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-850127991"
	)
	static void method867(int var0) {
		if (var0 != Client.gameState) { // L: 1314
			if (Client.gameState == 30) { // L: 1315
				Client.field616.method4052(); // L: 1316
			}

			if (Client.gameState == 0) { // L: 1318
				class439.client.method506();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1319
				class484.method8782(0); // L: 1320
				Client.field518 = 0; // L: 1321
				Client.field647 = 0; // L: 1322
				Client.timer.method7587(var0); // L: 1323
				if (var0 != 20) { // L: 1324
					FontName.method8639(false);
				}
			}

			if (var0 != 20 && var0 != 40 && GrandExchangeOfferAgeComparator.field4310 != null) { // L: 1326 1327
				GrandExchangeOfferAgeComparator.field4310.close(); // L: 1328
				GrandExchangeOfferAgeComparator.field4310 = null; // L: 1329
			}

			if (Client.gameState == 25) { // L: 1332
				Client.field553 = 0; // L: 1333
				Client.field716 = 0; // L: 1334
				Client.field550 = 1; // L: 1335
				Client.field624 = 0; // L: 1336
				Client.field552 = 1; // L: 1337
			}

			if (var0 != 5 && var0 != 10) { // L: 1339
				if (var0 == 20) { // L: 1347
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1348
					class211.method4118(WorldMapDecoration.archive10, GameBuild.archive8, false, var3); // L: 1349
				} else if (var0 == 11) { // L: 1351
					class211.method4118(WorldMapDecoration.archive10, GameBuild.archive8, false, 4); // L: 1352
				} else if (var0 == 50) { // L: 1354
					UrlRequest.setLoginResponseString("", "Updating date of birth...", ""); // L: 1355
					class211.method4118(WorldMapDecoration.archive10, GameBuild.archive8, false, 7); // L: 1356
				} else {
					SpriteMask.method6055(); // L: 1358
				}
			} else {
				boolean var1 = WorldMapManager.clientPreferences.method2448() >= Client.field485; // L: 1342
				int var2 = var1 ? 0 : 12; // L: 1344
				class211.method4118(WorldMapDecoration.archive10, GameBuild.archive8, true, var2); // L: 1345
			}

			Client.gameState = var0; // L: 1359
		}
	} // L: 1360

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-87910723"
	)
	static final void method869() {
		if (FriendsChatManager_inFriendsChat) { // L: 3769
			if (BZip2State.friendsChatManager != null) { // L: 3770
				BZip2State.friendsChatManager.sort(); // L: 3771
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3774
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3775
				var1.clearIsInFriendsChat(); // L: 3776
			}

			FriendsChatManager_inFriendsChat = false; // L: 3779
		}

	} // L: 3781

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = ModelData0.getWidgetChild(var0, var1); // L: 9764
		if (var4 != null && var4.onTargetEnter != null) { // L: 9765
			ScriptEvent var5 = new ScriptEvent(); // L: 9766
			var5.widget = var4; // L: 9767
			var5.args = var4.onTargetEnter; // L: 9768
			class260.runScriptEvent(var5); // L: 9769
		}

		Client.selectedSpellItemId = var3; // L: 9771
		Client.isSpellSelected = true; // L: 9772
		class60.selectedSpellWidget = var0; // L: 9773
		Client.selectedSpellChildIndex = var1; // L: 9774
		SoundCache.selectedSpellFlags = var2; // L: 9775
		HorizontalAlignment.invalidateWidget(var4); // L: 9776
	} // L: 9777
}
