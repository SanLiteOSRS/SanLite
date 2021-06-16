import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final WorldMapID field2111;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final WorldMapID field2108;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1292015261
	)
	@Export("value")
	final int value;

	static {
		field2111 = new WorldMapID(0);
		field2108 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-115"
	)
	static int method3718(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2096657321"
	)
	static final int method3716(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2067762103"
	)
	static void method3717() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (class20.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = WorldMapData_1.getWidget(var4);
					if (var5 != null) {
						Script.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
