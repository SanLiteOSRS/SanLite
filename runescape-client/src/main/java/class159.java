import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class159 {
	@ObfuscatedName("f")
	@Export("directions")
	static int[][] directions;
	@ObfuscatedName("y")
	@Export("distances")
	static int[][] distances;
	@ObfuscatedName("b")
	@Export("bufferX")
	static int[] bufferX;
	@ObfuscatedName("d")
	@Export("bufferY")
	static int[] bufferY;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1685265527"
	)
	public static void method3192(int var0) {
		class232.musicPlayerStatus = 1;
		ModelData0.musicTrackArchive = null;
		class32.musicTrackGroupId = -1;
		class18.musicTrackFileId = -1;
		class232.musicTrackVolume = 0;
		class232.musicTrackBoolean = false;
		class232.pcmSampleLength = var0;
	}
}
