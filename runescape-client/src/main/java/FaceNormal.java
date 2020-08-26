import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1856660121
	)
	public static int field1922;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 1637295417
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -364011515
	)
	@Export("x")
	int x;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1271035903
	)
	@Export("y")
	int y;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1616346001
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(ILlz;Liw;B)V",
		garbageValue = "81"
	)
	static void method3388(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		WorldMapArea.method415();
	}
}
