import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("ay")
	@Export("name")
	public final String name;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1802994483
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 13
		this.buildId = var2; // L: 14
	} // L: 15

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-22"
	)
	static final void method6659(int var0) {
		if (GrandExchangeEvent.loadInterface(var0)) { // L: 12102
			FontName.drawModelComponents(class179.Widget_interfaceComponents[var0], -1); // L: 12103
		}
	} // L: 12104
}
