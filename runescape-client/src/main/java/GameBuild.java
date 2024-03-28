import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("an")
	@Export("name")
	public final String name;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -471809715
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0); // L: 5
		BUILDLIVE = new GameBuild("BUILDLIVE", 3); // L: 6
		RC = new GameBuild("RC", 1); // L: 7
		WIP = new GameBuild("WIP", 2); // L: 8
	}

	GameBuild(String var1, int var2) {
		this.name = var1; // L: 17
		this.buildId = var2; // L: 18
	} // L: 19
}
