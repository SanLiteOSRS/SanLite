import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static StudioGame field3841;
	@ObfuscatedName("ax")
	@Export("name")
	public final String name;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 243254949
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
