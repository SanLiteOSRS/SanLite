import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -687726109
	)
	static int field380;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "[Lme;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 477038655
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lhd;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lhd;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		signature = "(ILhd;Lhd;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "-852874949",
		signature = "(I)V"
	)
	public static void method851() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		garbageValue = "32",
		signature = "(B)V"
	)
	public static void method850() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		garbageValue = "-21",
		signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}
}
