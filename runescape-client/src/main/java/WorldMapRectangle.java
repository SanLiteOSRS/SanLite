import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1826737113
	)
	@Export("width")
	int width;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 813874845
	)
	@Export("height")
	int height;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1282834747
	)
	@Export("x")
	int x;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 568186345
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lft;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lbk;Lbk;IZI)I",
		garbageValue = "1719503771"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1757() ? (var1.method1757() ? 0 : 1) : (var1.method1757() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1749() ? (var1.method1749() ? 0 : 1) : (var1.method1749() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "-36"
	)
	static void method3709(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class307.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var4) {
			}
		}

	}
}
