import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("j")
	@Export("name")
	public final String name;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -104611059
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-562774219"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
