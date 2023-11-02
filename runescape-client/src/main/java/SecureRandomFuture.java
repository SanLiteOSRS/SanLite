import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("ah")
	static byte[][][] field997;
	@ObfuscatedName("av")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("ir")
	static int[] field1000;
	@ObfuscatedName("ac")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("al")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor(); // L: 10
		this.future = this.executor.submit(new SecureRandomCallable()); // L: 14
	} // L: 15

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown(); // L: 18
		this.executor = null; // L: 19
	} // L: 20

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1952225914"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone(); // L: 23
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "862228801"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get(); // L: 28
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILrw;Lok;I)V",
		garbageValue = "-1154223283"
	)
	static void method2199(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 33
		var3.type = 1; // L: 34
		var3.key = (long)var0; // L: 35
		var3.archiveDisk = var1; // L: 36
		var3.archive = var2; // L: 37
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 38
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		class87.method2311();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1191570763"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 39
		if (var4 == null) { // L: 40
			var4 = new ItemContainer(); // L: 41
			ItemContainer.itemContainers.put(var4, (long)var0); // L: 42
		}

		if (var4.ids.length <= var1) { // L: 44
			int[] var5 = new int[var1 + 1]; // L: 45
			int[] var6 = new int[var1 + 1]; // L: 46

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) { // L: 47
				var5[var7] = var4.ids[var7]; // L: 48
				var6[var7] = var4.quantities[var7]; // L: 49
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) { // L: 51
				var5[var7] = -1; // L: 52
				var6[var7] = 0; // L: 53
			}

			var4.ids = var5; // L: 55
			var4.quantities = var6; // L: 56
		}

		var4.ids[var1] = var2; // L: 58
		var4.quantities[var1] = var3; // L: 59
	} // L: 60

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "469992378"
	)
	static final float method2200(int var0) {
		float var1 = 10075.0F - (float)var0; // L: 29
		return (1.0075567F * var1 - 75.56675F) / var1; // L: 30
	}

	@ObfuscatedName("ah")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 86
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(IIIILud;Lmp;B)V",
		garbageValue = "23"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12560
			int var6 = Client.camAngleY & 2047; // L: 12561
			int var7 = var3 * var3 + var2 * var2; // L: 12562
			if (var7 <= 6400) { // L: 12563
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12564
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12565
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12566
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12567
				if (var7 > 2500) {
					var4.method9697(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12568
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12569
				}

			}
		}
	} // L: 12570
}
