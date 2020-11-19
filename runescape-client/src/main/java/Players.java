import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("Players")
public class Players {
	@ObfuscatedName("l")
	static byte[] field1282;
	@ObfuscatedName("m")
	static byte[] field1295;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "[Lkb;"
	)
	static Buffer[] field1284;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1488243341
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("k")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -745504319
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("u")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("t")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("e")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("o")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 568889217
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("x")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lkb;"
	)
	static Buffer field1280;

	static {
		field1282 = new byte[2048];
		field1295 = new byte[2048];
		field1284 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1280 = new Buffer(new byte[5000]);
	}
}
