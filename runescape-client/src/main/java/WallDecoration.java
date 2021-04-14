import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lho;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		signature = "[Lhu;"
	)
	static Widget[] field2179;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1866984259
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1233523215
	)
	@Export("x")
	int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1569724115
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1106091565
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -790495867
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1527389689
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 221325297
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "Lfm;"
	)
	@Export("entity1")
	public Renderable entity1;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lfm;"
	)
	@Export("entity2")
	public Renderable entity2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -7920256203386986359L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1583095637
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "89979729"
	)
	static int method3808(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)[Lit;",
		garbageValue = "-1357735054"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ironman, PlayerType.field3226, PlayerType.PlayerType_normal};
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(IZI)Ljava/lang/String;",
		garbageValue = "-1850423672"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class44.method521(var0, 10, var1) : Integer.toString(var0);
	}
}
