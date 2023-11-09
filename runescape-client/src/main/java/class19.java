import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class19 implements Callable {
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = 419723581
	)
	static int field104;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	static ClanChannel field107;
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final class10 field102;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lam;Lak;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field102 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field102.method81()) { // L: 53
				Login.method2088(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field102.method89(); // L: 60
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-608378874"
	)
	public static int method282(String var0) {
		return var0.length() + 2; // L: 123
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "190436510"
	)
	static void method280(int var0) {
		if (var0 != Client.gameState) { // L: 1191
			if (Client.gameState == 30) { // L: 1192
				Client.field713.method4070(); // L: 1193
			}

			if (Client.gameState == 0) { // L: 1195
				class392.client.method507();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1196
				class60.method1155(0); // L: 1197
				Client.field549 = 0; // L: 1198
				Client.field516 = 0; // L: 1199
				Client.timer.method7333(var0); // L: 1200
				if (var0 != 20) { // L: 1201
					class130.method3030(false);
				}
			}

			if (var0 != 20 && var0 != 40 && GroundObject.field2411 != null) { // L: 1203 1204
				GroundObject.field2411.close(); // L: 1205
				GroundObject.field2411 = null; // L: 1206
			}

			if (Client.gameState == 25) { // L: 1209
				Client.field501 = 0; // L: 1210
				Client.field627 = 0; // L: 1211
				Client.field479 = 1; // L: 1212
				Client.field548 = 0; // L: 1213
				Client.field775 = 1; // L: 1214
			}

			if (var0 != 5 && var0 != 10) { // L: 1216
				if (var0 == 20) { // L: 1224
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1225
					PlayerComposition.method5782(class223.field2581, class143.archive8, false, var3); // L: 1226
				} else if (var0 == 11) { // L: 1228
					PlayerComposition.method5782(class223.field2581, class143.archive8, false, 4); // L: 1229
				} else if (var0 == 50) { // L: 1231
					Tile.setLoginResponseString("", "Updating date of birth...", ""); // L: 1232
					PlayerComposition.method5782(class223.field2581, class143.archive8, false, 7); // L: 1233
				} else {
					ModeWhere.method6667(); // L: 1235
				}
			} else {
				boolean var1 = WorldMapSectionType.clientPreferences.method2448() >= Client.field486; // L: 1219
				int var2 = var1 ? 0 : 12; // L: 1221
				PlayerComposition.method5782(class223.field2581, class143.archive8, true, var2); // L: 1222
			}

			Client.gameState = var0; // L: 1236
		}
	} // L: 1237

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-194934658"
	)
	static void method278(int var0, int var1) {
		if (WorldMapSectionType.clientPreferences.method2440() != 0 && var0 != -1) { // L: 3702
			class163.method3352(class36.field239, var0, 0, WorldMapSectionType.clientPreferences.method2440(), false); // L: 3703
			Client.playingJingle = true; // L: 3704
		}

	} // L: 3706

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(ZLsq;B)V",
		garbageValue = "-16"
	)
	static final void method281(boolean var0, PacketBuffer var1) {
		while (true) {
			byte var2 = 16; // L: 8303
			int var3 = 1 << var2; // L: 8304
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= var2 + 12) { // L: 8305
				int var4 = var1.readBits(var2); // L: 8306
				if (var4 != var3 - 1) { // L: 8307
					boolean var5 = false; // L: 8308
					if (Client.npcs[var4] == null) { // L: 8309
						Client.npcs[var4] = new NPC(); // L: 8310
						var5 = true; // L: 8311
					}

					NPC var6 = Client.npcs[var4]; // L: 8313
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8314
					var6.npcCycle = Client.cycle; // L: 8315
					int var10 = var1.readBits(1); // L: 8319
					if (var10 == 1) { // L: 8320
						Client.field662[++Client.field539 - 1] = var4;
					}

					var6.definition = class188.getNpcDefinition(var1.readBits(14)); // L: 8321
					int var9;
					if (var0) { // L: 8322
						var9 = var1.readBits(8); // L: 8323
						if (var9 > 127) { // L: 8324
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 8327
						if (var9 > 15) { // L: 8328
							var9 -= 32;
						}
					}

					int var7 = var1.readBits(1); // L: 8330
					boolean var11 = var1.readBits(1) == 1; // L: 8331
					if (var11) { // L: 8332
						var1.readBits(32); // L: 8333
					}

					int var8;
					if (var0) { // L: 8335
						var8 = var1.readBits(8); // L: 8336
						if (var8 > 127) { // L: 8337
							var8 -= 256;
						}
					} else {
						var8 = var1.readBits(5); // L: 8340
						if (var8 > 15) { // L: 8341
							var8 -= 32;
						}
					}

					int var12 = Client.field612[var1.readBits(3)]; // L: 8343
					if (var5) { // L: 8344
						var6.orientation = var6.rotation = var12;
					}

					class418.method7808(var6); // L: 8345
					if (var6.field1209 == 0) { // L: 8346
						var6.rotation = 0;
					}

					var6.method2557(BuddyRankComparator.localPlayer.pathX[0] + var8, BuddyRankComparator.localPlayer.pathY[0] + var9, var7 == 1); // L: 8347
					continue; // L: 8348
				}
			}

			var1.exportIndex(); // L: 8349
			return; // L: 8350
		}
	}
}
