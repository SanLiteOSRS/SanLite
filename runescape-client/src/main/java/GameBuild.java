import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("at")
	@Export("name")
	public final String name;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -576326483
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
}
