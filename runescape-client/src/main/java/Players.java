import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("Players")
public class Players {
	@ObfuscatedName("ar")
	static byte[] field1362;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lio;"
	)
	static class218[] field1363;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	static Buffer[] field1360;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -240814297
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("ag")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 612840329
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("av")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("ap")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("aq")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("at")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1418055473
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("ax")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static Buffer field1374;

	static {
		field1362 = new byte[2048]; // L: 19
		field1363 = new class218[2048]; // L: 20
		field1360 = new Buffer[2048]; // L: 21
		Players_count = 0; // L: 22
		Players_indices = new int[2048]; // L: 23
		Players_emptyIdxCount = 0; // L: 24
		Players_emptyIndices = new int[2048]; // L: 25
		Players_regions = new int[2048]; // L: 26
		Players_orientations = new int[2048]; // L: 27
		Players_targetIndices = new int[2048]; // L: 28
		Players_pendingUpdateCount = 0; // L: 29
		Players_pendingUpdateIndices = new int[2048]; // L: 30
		field1374 = new Buffer(new byte[5000]); // L: 31
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1685678133"
	)
	public static boolean method2700(int var0) {
		return var0 == WorldMapDecorationType.field3828.id; // L: 43
	}
}
