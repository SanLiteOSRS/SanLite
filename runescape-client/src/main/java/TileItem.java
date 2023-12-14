import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1683425433
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 232562963
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 553790659
	)
	int field1342;

	TileItem() {
		this.field1342 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2048402866"
	)
	void method2754(int var1) {
		this.field1342 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lka;",
		garbageValue = "1"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class214.ItemComposition_get(this.id).getModel(this.quantity); // L: 27
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "117367628"
	)
	boolean method2755(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1342 & 1 << var1) != 0; // L: 21
		} else {
			return true; // L: 23
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CLof;I)C",
		garbageValue = "938832228"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 117
			if (var0 >= 192 && var0 <= 198) { // L: 118
				return 'A';
			}

			if (var0 == 199) { // L: 119
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 120
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 121
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 122
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 123
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 124
				return 'U';
			}

			if (var0 == 221) { // L: 125
				return 'Y';
			}

			if (var0 == 223) { // L: 126
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 127
				return 'a';
			}

			if (var0 == 231) { // L: 128
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 129
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i'; // L: 130
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 131
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 132
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 133
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 134
				return 'y';
			}
		}

		if (var0 == 338) { // L: 136
			return 'O';
		} else if (var0 == 339) { // L: 137
			return 'o';
		} else if (var0 == 376) { // L: 138
			return 'Y';
		} else {
			return var0; // L: 139
		}
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)V",
		garbageValue = "2136163663"
	)
	static final void method2766(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8439

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8440 8441 8446
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8442
				var10 = var11; // L: 8443
				break;
			}
		}

		if (var10 == null) { // L: 8448
			var10 = new PendingSpawn(); // L: 8449
			var10.plane = var0; // L: 8450
			var10.type = var3; // L: 8451
			var10.x = var1; // L: 8452
			var10.y = var2; // L: 8453
			var10.field1152 = -1; // L: 8454
			ScriptFrame.method1212(var10); // L: 8455
			Client.pendingSpawns.addFirst(var10); // L: 8456
		}

		var10.field1162 = var4; // L: 8458
		var10.field1161 = var5; // L: 8459
		var10.field1160 = var6; // L: 8460
		var10.delay = var8; // L: 8461
		var10.hitpoints = var9; // L: 8462
		var10.method2453(var7); // L: 8463
	} // L: 8464
}
