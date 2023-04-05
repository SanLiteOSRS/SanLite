import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("Players")
public class Players {
	@ObfuscatedName("ac")
	static byte[] field1336;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lis;"
	)
	static class211[] field1332;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lsy;"
	)
	static Buffer[] field1335;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -838795897
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("av")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 898718497
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("ap")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("ar")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ak")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("ax")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1552754857
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("ay")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	static Buffer field1330;

	static {
		field1336 = new byte[2048]; // L: 18
		field1332 = new class211[2048]; // L: 19
		field1335 = new Buffer[2048]; // L: 20
		Players_count = 0; // L: 21
		Players_indices = new int[2048]; // L: 22
		Players_emptyIdxCount = 0; // L: 23
		Players_emptyIndices = new int[2048]; // L: 24
		Players_regions = new int[2048]; // L: 25
		Players_orientations = new int[2048]; // L: 26
		Players_targetIndices = new int[2048]; // L: 27
		Players_pendingUpdateCount = 0; // L: 28
		Players_pendingUpdateIndices = new int[2048]; // L: 29
		field1330 = new Buffer(new byte[5000]); // L: 30
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Lmx;Ljava/lang/String;I)V",
		garbageValue = "1745805921"
	)
	static void method2676(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1563
		Client.archiveLoaders.add(var2); // L: 1564
		Client.field715 += var2.groupCount; // L: 1565
	} // L: 1566
}
