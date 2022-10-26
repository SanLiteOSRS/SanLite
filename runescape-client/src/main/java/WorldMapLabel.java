import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("a")
	@Export("text")
	String text;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1062281855
	)
	@Export("width")
	int width;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 128768729
	)
	@Export("height")
	int height;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILhb;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "927826836"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 623
		if (DecorativeObject.garbageCollector == null || !DecorativeObject.garbageCollector.isValid()) { // L: 624
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 626

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 627
					if (var2.isValid()) { // L: 629
						DecorativeObject.garbageCollector = var2; // L: 630
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 631
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 632
					}
				}
			} catch (Throwable var11) { // L: 637
			}
		}

		if (DecorativeObject.garbageCollector != null) { // L: 639
			long var9 = UserComparator8.method2748(); // L: 640
			long var3 = DecorativeObject.garbageCollector.getCollectionTime(); // L: 641
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 642
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 643
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 644
				if (0L != var7) { // L: 645
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 647
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 648
		}

		return var0; // L: 650
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "5021"
	)
	static void method5157() {
		if (class7.worldMap != null) { // L: 4407
			class7.worldMap.method7888(ApproximateRouteStrategy.Client_plane, class26.baseX * 64 + (class296.localPlayer.x >> 7), class158.baseY * 64 + (class296.localPlayer.y >> 7), false); // L: 4408
			class7.worldMap.loadCache(); // L: 4409
		}

	} // L: 4411

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lco;I)Z",
		garbageValue = "58335505"
	)
	static boolean method5159(Player var0) {
		if (Client.drawPlayerNames == 0) { // L: 4961
			return false;
		} else if (class296.localPlayer == var0) { // L: 4962
			return class453.method8254(); // L: 4981
		} else {
			boolean var1 = class313.method6247(); // L: 4963
			boolean var2;
			if (!var1) { // L: 4964
				var2 = (Client.drawPlayerNames & 1) != 0; // L: 4967
				var1 = var2 && var0.isFriend(); // L: 4969
			}

			var2 = var1; // L: 4971
			if (!var1) { // L: 4972
				boolean var3 = (Client.drawPlayerNames & 2) != 0; // L: 4975
				var2 = var3 && var0.isFriendsChatMember(); // L: 4977
			}

			return var2; // L: 4979
		}
	}
}
