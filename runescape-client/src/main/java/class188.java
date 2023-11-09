import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class188 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 478847471
	)
	@Export("idxCount")
	static int idxCount;
	@ObfuscatedName("gy")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("qc")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	static class425 field1958;
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lhl;",
		garbageValue = "-2070840169"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 67
		if (var1 != null) { // L: 68
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 69
			var1 = new NPCComposition(); // L: 70
			var1.id = var0; // L: 71
			if (var2 != null) { // L: 72
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 73
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 74
			return var1; // L: 75
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lnq;B)I",
		garbageValue = "0"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = IgnoreList.method7449(var9); // L: 33
			var8 = IgnoreList.method7449(var10); // L: 34
			var9 = class323.standardizeChar(var9, var2); // L: 35
			var10 = class323.standardizeChar(var10, var2); // L: 36
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var9 != var10) { // L: 40
					return class199.lowercaseChar(var9, var2) - class199.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 44
			if (var2 == Language.Language_FR) { // L: 45
				var5 = var3 - 1 - var17; // L: 46
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17; // L: 49
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var12 != var11) {
					return class199.lowercaseChar(var11, var2) - class199.lowercaseChar(var12, var2); // L: 55
				}
			}
		}

		var17 = var3 - var4; // L: 58
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var13 != var12) { // L: 63
					return class199.lowercaseChar(var12, var2) - class199.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}
}
