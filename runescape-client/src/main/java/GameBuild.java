import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static Archive field3803;
	@ObfuscatedName("au")
	@Export("name")
	public final String name;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -978256915
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsm;",
		garbageValue = "97"
	)
	public static class481 method6587(int var0) {
		class481 var1 = (class481)class481.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class481.field4961.takeFile(39, var0); // L: 25
			var1 = new class481(); // L: 26
			if (var2 != null) { // L: 27
				var1.method8929(new Buffer(var2));
			}

			var1.method8934(); // L: 28
			class481.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-347521940"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1062
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1063
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1064
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1065
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1066
		return var3; // L: 1067
	}
}
