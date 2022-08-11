import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1731335085
	)
	static int field480;
	@ObfuscatedName("bq")
	static String field479;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(
		intValue = -876119815
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("o")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12513

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llf;Llf;I)I",
		garbageValue = "579303732"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12516
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12517
				if (Client.worldId == var1.world) { // L: 12518
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12519
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12521
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12525
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12529
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1860134981"
	)
	public static int method1103(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) { // L: 24 25 28
			if ((var1 & 1) != 0) {
				var2 = var0 * var2; // L: 26
			}

			var0 *= var0; // L: 27
		}

		if (var1 == 1) { // L: 30
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Lgf;",
		garbageValue = "801437853"
	)
	public static HitSplatDefinition method1095(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 52
		if (var1 != null) { // L: 53
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 54
			var1 = new HitSplatDefinition(); // L: 55
			if (var2 != null) { // L: 56
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 57
			return var1; // L: 58
		}
	}

	@ObfuscatedName("q")
	public static String method1107(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 31
			if (var0 % 37L == 0L) { // L: 32
				return null;
			} else {
				int var2 = 0; // L: 33

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 34 35 37
					++var2; // L: 36
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 39

				while (var0 != 0L) { // L: 40
					long var6 = var0; // L: 41
					var0 /= 37L; // L: 42
					var5.append(class345.base37Table[(int)(var6 - var0 * 37L)]); // L: 43
				}

				return var5.reverse().toString(); // L: 45
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1594580668"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5584
			int var3 = SecureRandomFuture.getTileHeight(var0, var1, FriendSystem.Client_plane) - var2; // L: 5589
			var0 -= WorldMapLabelSize.cameraX; // L: 5590
			var3 -= class123.cameraY; // L: 5591
			var1 -= Widget.cameraZ; // L: 5592
			int var4 = Rasterizer3D.Rasterizer3D_sine[UserComparator9.cameraPitch]; // L: 5593
			int var5 = Rasterizer3D.Rasterizer3D_cosine[UserComparator9.cameraPitch]; // L: 5594
			int var6 = Rasterizer3D.Rasterizer3D_sine[PendingSpawn.cameraYaw]; // L: 5595
			int var7 = Rasterizer3D.Rasterizer3D_cosine[PendingSpawn.cameraYaw]; // L: 5596
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5597
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5598
			var0 = var8; // L: 5599
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5600
			var1 = var4 * var3 + var5 * var1 >> 16; // L: 5601
			if (var1 >= 50) { // L: 5603
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5604
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5605
			} else {
				Client.viewportTempX = -1; // L: 5608
				Client.viewportTempY = -1; // L: 5609
			}

		} else {
			Client.viewportTempX = -1; // L: 5585
			Client.viewportTempY = -1; // L: 5586
		}
	} // L: 5587 5611
}
