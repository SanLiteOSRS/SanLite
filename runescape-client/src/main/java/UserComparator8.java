import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = 1237393549
	)
	static int field1415;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static IndexedSprite field1416;
	@ObfuscatedName("gr")
	@ObfuscatedGetter(
		intValue = -777492217
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Lqg;I)I",
		garbageValue = "180048199"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-415594604"
	)
	static boolean method2852(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Ldd;",
		garbageValue = "-1140342011"
	)
	static Script method2854(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 61
		if (var2 != null) { // L: 62
			return var2; // L: 63
		} else {
			String var3 = String.valueOf(var0); // L: 65
			int var4 = class33.archive12.getGroupId(var3); // L: 66
			if (var4 == -1) { // L: 67
				return null; // L: 68
			} else {
				byte[] var5 = class33.archive12.takeFileFlat(var4); // L: 70
				if (var5 != null) { // L: 71
					if (var5.length <= 1) { // L: 72
						return null; // L: 73
					}

					var2 = class165.newScript(var5); // L: 75
					if (var2 != null) { // L: 76
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 77
						return var2; // L: 78
					}
				}

				return null; // L: 81
			}
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1243357118"
	)
	static void method2855(int var0) {
		if (var0 != Client.gameState) { // L: 1222
			if (Client.gameState == 30) { // L: 1223
				Client.field740.method4102(); // L: 1224
			}

			if (Client.gameState == 0) { // L: 1226
				class347.client.method500();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1227
				class347.method6613(0); // L: 1228
				Client.field558 = 0; // L: 1229
				Client.field782 = 0; // L: 1230
				Client.timer.method7609(var0); // L: 1231
				if (var0 != 20) { // L: 1232
					class152.method3194(false);
				}
			}

			if (var0 != 20 && var0 != 40 && ArchiveLoader.field1037 != null) { // L: 1234 1235
				ArchiveLoader.field1037.close(); // L: 1236
				ArchiveLoader.field1037 = null; // L: 1237
			}

			if (Client.gameState == 25) { // L: 1240
				Client.field576 = 0; // L: 1241
				Client.field572 = 0; // L: 1242
				Client.field573 = 1; // L: 1243
				Client.field574 = 0; // L: 1244
				Client.field580 = 1; // L: 1245
			}

			if (var0 != 5 && var0 != 10) { // L: 1247
				if (var0 == 20) { // L: 1255
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1256
					HorizontalAlignment.method3679(class53.archive10, class180.archive8, false, var3); // L: 1257
				} else if (var0 == 11) { // L: 1259
					HorizontalAlignment.method3679(class53.archive10, class180.archive8, false, 4); // L: 1260
				} else if (var0 == 50) { // L: 1262
					class478.setLoginResponseString("", "Updating date of birth...", ""); // L: 1263
					HorizontalAlignment.method3679(class53.archive10, class180.archive8, false, 7); // L: 1264
				} else {
					ReflectionCheck.method669(); // L: 1266
				}
			} else {
				boolean var1 = class10.clientPreferences.method2454() >= Client.field508; // L: 1250
				int var2 = var1 ? 0 : 12; // L: 1252
				HorizontalAlignment.method3679(class53.archive10, class180.archive8, true, var2); // L: 1253
			}

			Client.gameState = var0; // L: 1267
		}
	} // L: 1268
}
