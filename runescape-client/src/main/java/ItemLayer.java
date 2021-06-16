import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("bq")
	@Export("otp")
	static String otp;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -193076461
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 314356507
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -695126527
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 5487494310770586269L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 400175677
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;Ljp;Lie;B)Z",
		garbageValue = "0"
	)
	public static boolean method3860(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, MidiPcmStream var3) {
		class233.musicPatchesArchive = var0;
		class233.musicSamplesArchive = var1;
		class230.soundEffectsArchive = var2;
		class233.midiPcmStream = var3;
		return true;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-395066972"
	)
	public static boolean method3861(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class302.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BII)I",
		garbageValue = "-1419386207"
	)
	public static int method3863(byte[] var0, int var1) {
		int var3 = -1;

		for (int var4 = 0; var4 < var1; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Liv;III)V",
		garbageValue = "-1678262366"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var4 = PlayerComposition.method4851(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				if (var4 != null) {
					Client.clickedWidget = var0;
					var4 = PlayerComposition.method4851(var0);
					if (var4 == null) {
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					UserComparator7.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var5 = HealthBarUpdate.method2283();
					if (var5 != -1) {
						WorldMapIcon_1.method3305(var5);
					}

					return;
				}
			}

		}
	}
}
