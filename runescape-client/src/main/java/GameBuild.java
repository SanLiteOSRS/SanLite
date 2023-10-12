import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("ao")
	@Export("name")
	public final String name;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1010319701
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
