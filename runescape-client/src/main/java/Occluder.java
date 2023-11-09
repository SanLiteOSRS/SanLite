import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 375332677
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 248180405
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 503029785
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -421200517
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 29121303
	)
	@Export("type")
	int type;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 515098517
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1314735259
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1448057615
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1946840619
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1348334437
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1407567959
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1749878813
	)
	int field2649;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1814095067
	)
	int field2650;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1467054083
	)
	int field2651;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1976276607
	)
	int field2652;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 859027157
	)
	int field2653;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2055017915
	)
	int field2654;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 805904779
	)
	int field2655;

	Occluder() {
	} // L: 23

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-474258851"
	)
	public static String method4810(CharSequence var0) {
		long var3 = 0L; // L: 44
		int var5 = var0.length(); // L: 45

		for (int var6 = 0; var6 < var5; ++var6) { // L: 46
			var3 *= 37L; // L: 47
			char var7 = var0.charAt(var6); // L: 48
			if (var7 >= 'A' && var7 <= 'Z') { // L: 49
				var3 += (long)(var7 + 1 - 65);
			} else if (var7 >= 'a' && var7 <= 'z') { // L: 50
				var3 += (long)(var7 + 1 - 97);
			} else if (var7 >= '0' && var7 <= '9') {
				var3 += (long)(var7 + 27 - 48); // L: 51
			}

			if (var3 >= 177917621779460413L) { // L: 52
				break;
			}
		}

		while (var3 % 37L == 0L && 0L != var3) { // L: 54
			var3 /= 37L;
		}

		String var8 = FriendSystem.base37DecodeLong(var3); // L: 57
		if (var8 == null) { // L: 58
			var8 = "";
		}

		return var8; // L: 59
	}
}
