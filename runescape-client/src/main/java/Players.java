import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("Players")
public class Players {
	@ObfuscatedName("v")
	static byte[] field1372;
	@ObfuscatedName("y")
	static byte[] field1361;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "[Lnt;"
	)
	static Buffer[] field1362;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1407274759
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("m")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1572681721
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("h")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("d")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("z")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("b")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1672795699
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("k")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	static Buffer field1373;

	static {
		field1372 = new byte[2048];
		field1361 = new byte[2048];
		field1362 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1373 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1219077649"
	)
	public static void method2402() {
		ParamComposition.ParamDefinition_cached.clear();
	}
}
