import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static IndexedSprite field2862;
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1138617503
	)
	final int field2858;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1772890649
	)
	final int field2861;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1703029901
	)
	final int field2860;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2858 = var1; // L: 15
		this.field2861 = var2; // L: 16
		this.field2860 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "-3"
	)
	boolean method5088(float var1) {
		return var1 >= (float)this.field2860; // L: 21
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldn;",
		garbageValue = "977578301"
	)
	static final InterfaceParent method5085(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent(); // L: 12426
		var3.group = var1; // L: 12427
		var3.type = var2; // L: 12428
		Client.interfaceParents.put(var3, (long)var0); // L: 12429
		class92.Widget_resetModelFrames(var1); // L: 12430
		Widget var4 = VarbitComposition.getWidget(var0); // L: 12431
		class200.invalidateWidget(var4); // L: 12432
		if (Client.meslayerContinueWidget != null) { // L: 12433
			class200.invalidateWidget(Client.meslayerContinueWidget); // L: 12434
			Client.meslayerContinueWidget = null; // L: 12435
		}

		SoundCache.revalidateWidgetScroll(ArchiveLoader.Widget_interfaceComponents[var0 >> 16], var4, false); // L: 12437
		ScriptFrame.runWidgetOnLoadListener(var1); // L: 12438
		if (Client.rootInterface != -1) { // L: 12439
			ChatChannel.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3; // L: 12440
	}
}
