import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class0 extends class14 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1588156263
	)
	int field3;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -2287605941349640037L
	)
	long field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class0(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field3 = var1.readInt();
		this.field0 = var1.readLong();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(class11 var1) {
		var1.method122(this.field3, this.field0);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lbg;I)V",
		garbageValue = "1784663758"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			WorldMapDecorationType.method4834(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			GrandExchangeOfferAgeComparator.method5068(GrandExchangeOfferAgeComparator.archive8, var0.properties);
		}

		class80.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		WorldMapLabelSize.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		GrandExchangeOfferTotalQuantityComparator.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		DesktopPlatformInfoProvider.currentPort = WorldMapLabelSize.worldPort;
	}
}
