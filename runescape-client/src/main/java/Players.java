import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("Players")
public class Players {
	@ObfuscatedName("ac")
	static byte[] field1362;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lia;"
	)
	static class217[] field1363;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Ltl;"
	)
	static Buffer[] field1364;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2120068221
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("av")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -498673831
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("au")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("az")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ab")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("ao")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1695236913
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("am")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	static Buffer field1370;

	static {
		field1362 = new byte[2048];
		field1363 = new class217[2048]; // L: 20
		field1364 = new Buffer[2048]; // L: 21
		Players_count = 0; // L: 22
		Players_indices = new int[2048]; // L: 23
		Players_emptyIdxCount = 0; // L: 24
		Players_emptyIndices = new int[2048]; // L: 25
		Players_regions = new int[2048]; // L: 26
		Players_orientations = new int[2048]; // L: 27
		Players_targetIndices = new int[2048]; // L: 28
		Players_pendingUpdateCount = 0; // L: 29
		Players_pendingUpdateIndices = new int[2048]; // L: 30
		field1370 = new Buffer(new byte[5000]); // L: 31
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "94"
	)
	static int method2768() {
		return ++Messages.Messages_count - 1; // L: 19
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)Luq;",
		garbageValue = "-180456707"
	)
	static SpritePixels method2756(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var4 = (long)(var2 << 16 | var0 << 8 | var1); // L: 41
		return (SpritePixels)var3.get(var4); // L: 43
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "2126436093"
	)
	static int method2764(int var0, Script var1, boolean var2) {
		return 2; // L: 5096
	}
}
