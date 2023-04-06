import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("an")
	@Export("name")
	public final String name;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1881256167
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
