import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class44 {
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = -1104068608
	)
	static int field315;
	@ObfuscatedName("f")
	@Export("applet")
	static Applet applet;
	@ObfuscatedName("e")
	static String field309;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;

	static {
		applet = null;
		field309 = "";
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	static void method532() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "67"
	)
	public static void method540(int var0) {
		if (var0 != -1) {
			if (Widget.Widget_loadedInterfaces[var0]) {
				AttackOption.Widget_archive.clearFilesGroup(var0);
				if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0] != null) {
					boolean var1 = true;

					for (int var2 = 0; var2 < GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0].length; ++var2) {
						if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2] != null) {
							if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2].type != 2) {
								GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0][var2] = null;
							} else {
								var1 = false;
							}
						}
					}

					if (var1) {
						GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0] = null;
					}

					Widget.Widget_loadedInterfaces[var0] = false;
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1279481562"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
