import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class129 implements Callable {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class130 field1527;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class131 field1529;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class132 field1526;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1571193313
	)
	final int field1525;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class137 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;Lfm;Lfa;Lfg;I)V"
	)
	class129(class137 var1, class130 var2, class131 var3, class132 var4, int var5) {
		this.this$0 = var1; // L: 247
		this.field1527 = var2; // L: 248
		this.field1529 = var3; // L: 249
		this.field1526 = var4; // L: 250
		this.field1525 = var5; // L: 251
	} // L: 252

	public Object call() {
		this.field1527.method2992(); // L: 256
		class130[][] var1;
		if (this.field1529 == class131.field1557) { // L: 258
			var1 = this.this$0.field1610; // L: 259
		} else {
			var1 = this.this$0.field1608; // L: 262
		}

		var1[this.field1525][this.field1526.method3027()] = this.field1527; // L: 264
		return null; // L: 265
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-68"
	)
	static void method2989(int var0) {
		if (var0 != Client.gameState) { // L: 1297
			if (Client.gameState == 30) { // L: 1298
				Client.field612.method4119(); // L: 1299
			}

			if (Client.gameState == 0) { // L: 1301
				TileItem.client.method634();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1302
				BuddyRankComparator.method2912(0); // L: 1303
				Client.field552 = 0; // L: 1304
				Client.field796 = 0; // L: 1305
				Client.timer.method7725(var0); // L: 1306
				if (var0 != 20) { // L: 1307
					GrandExchangeOfferTotalQuantityComparator.method6892(false);
				}
			}

			if (var0 != 20 && var0 != 40 && UserComparator5.field1461 != null) { // L: 1309 1310
				UserComparator5.field1461.close(); // L: 1311
				UserComparator5.field1461 = null; // L: 1312
			}

			if (Client.gameState == 25) { // L: 1315
				Client.field537 = 0; // L: 1316
				Client.field730 = 0; // L: 1317
				Client.field584 = 1; // L: 1318
				Client.field679 = 0; // L: 1319
				Client.field586 = 1; // L: 1320
			}

			if (var0 != 5 && var0 != 10) { // L: 1322
				if (var0 == 20) { // L: 1330
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1331
					UserComparator10.method2904(class131.field1565, class386.field4436, false, var3); // L: 1332
				} else if (var0 == 11) { // L: 1334
					UserComparator10.method2904(class131.field1565, class386.field4436, false, 4); // L: 1335
				} else if (var0 == 50) { // L: 1337
					Actor.setLoginResponseString("", "Updating date of birth...", ""); // L: 1338
					UserComparator10.method2904(class131.field1565, class386.field4436, false, 7); // L: 1339
				} else {
					WorldMapData_0.method5080(); // L: 1341
				}
			} else {
				boolean var1 = class150.clientPreferences.method2539() >= Client.field521; // L: 1325
				int var2 = var1 ? 0 : 12; // L: 1327
				UserComparator10.method2904(class131.field1565, class386.field4436, true, var2); // L: 1328
			}

			Client.gameState = var0; // L: 1342
		}
	} // L: 1343
}
