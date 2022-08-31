import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("c")
	@Export("name")
	public final String name;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1346396169
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
		this.name = var1; // L: 13
		this.buildId = var2; // L: 14
	} // L: 15
}
