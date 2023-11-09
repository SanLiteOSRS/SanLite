import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("ab")
	@Export("name")
	public final String name;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1593654059
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
		this.name = var1; // L: 17
		this.buildId = var2; // L: 18
	} // L: 19
}
