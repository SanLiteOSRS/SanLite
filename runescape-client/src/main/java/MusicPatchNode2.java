import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("af")
	byte[] field3374;
	@ObfuscatedName("an")
	byte[] field3373;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 354539497
	)
	int field3375;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -32542335
	)
	int field3376;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -574961187
	)
	int field3381;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 821482501
	)
	int field3378;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1552238757
	)
	int field3379;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1668380791
	)
	int field3380;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 391036783
	)
	int field3377;

	MusicPatchNode2() {
	} // L: 14

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Ljava/lang/String;Ljava/lang/String;I)Ltc;",
		garbageValue = "1319736369"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 111
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 112
			int var4 = var0.getFileId(var3, var2); // L: 113
			byte[] var7 = var0.takeFile(var3, var4); // L: 118
			boolean var6;
			if (var7 == null) { // L: 119
				var6 = false; // L: 120
			} else {
				class485.SpriteBuffer_decode(var7); // L: 123
				var6 = true; // L: 124
			}

			IndexedSprite var5;
			if (!var6) { // L: 126
				var5 = null; // L: 127
			} else {
				var5 = Strings.method6600(); // L: 130
			}

			return var5; // L: 132
		}
	}
}
