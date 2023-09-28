import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -360024201
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1723938877
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -94687907
	)
	int field1356;

	TileItem() {
		this.field1356 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method2724(int var1) {
		this.field1356 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class214.ItemComposition_get(this.id).getModel(this.quantity); // L: 27
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "60"
	)
	boolean method2726(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1356 & 1 << var1) != 0; // L: 21
		} else {
			return true; // L: 23
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lfz;FFFFFFFFI)V",
		garbageValue = "262393745"
	)
	static void method2727(class132 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) { // L: 295
			var0.field1543 = var1; // L: 298
			float var9 = var4 - var1; // L: 299
			float var10 = var8 - var5; // L: 300
			float var11 = var2 - var1; // L: 301
			float var12 = 0.0F; // L: 302
			float var13 = 0.0F; // L: 303
			if ((double)var11 != 0.0D) { // L: 304
				var12 = (var6 - var5) / var11; // L: 305
			}

			var11 = var4 - var3; // L: 307
			if (0.0D != (double)var11) { // L: 308
				var13 = (var8 - var7) / var11; // L: 309
			}

			float var14 = 1.0F / (var9 * var9); // L: 311
			float var15 = var12 * var9; // L: 312
			float var16 = var9 * var13; // L: 313
			var0.field1545 = var14 * (var15 + var16 - var10 - var10) / var9; // L: 314
			var0.field1546 = (var10 + var10 + var10 - var15 - var15 - var16) * var14; // L: 315
			var0.field1538 = var12; // L: 316
			var0.field1542 = var5; // L: 317
		}
	} // L: 296 318

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Liz;I)Z",
		garbageValue = "-966132551"
	)
	static boolean method2730(ObjectComposition var0) {
		if (var0.transforms != null) { // L: 568
			int[] var1 = var0.transforms; // L: 570

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 571
				int var3 = var1[var2]; // L: 572
				ObjectComposition var4 = class91.getObjectDefinition(var3); // L: 574
				if (var4.mapIconId != -1) { // L: 575
					return true; // L: 576
				}
			}
		} else if (var0.mapIconId != -1) { // L: 582
			return true; // L: 583
		}

		return false; // L: 585
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "667275397"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 596
		if (GrandExchangeOfferTotalQuantityComparator.garbageCollector == null || !GrandExchangeOfferTotalQuantityComparator.garbageCollector.isValid()) { // L: 597
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 599

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 600
					if (var2.isValid()) { // L: 602
						GrandExchangeOfferTotalQuantityComparator.garbageCollector = var2; // L: 603
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 604
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 605
					}
				}
			} catch (Throwable var11) { // L: 610
			}
		}

		if (GrandExchangeOfferTotalQuantityComparator.garbageCollector != null) { // L: 612
			long var9 = GrandExchangeOfferTotalQuantityComparator.method7049(); // L: 613
			long var3 = GrandExchangeOfferTotalQuantityComparator.garbageCollector.getCollectionTime(); // L: 614
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 615
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 616
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 617
				if (0L != var7) { // L: 618
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 620
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 621
		}

		return var0; // L: 623
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "901755520"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 5218
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 5219
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 5220
				int var3 = var2.x >> 7; // L: 5221
				int var4 = var2.y >> 7; // L: 5222
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 5223
					if (var2.field1189 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 5224
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 5225
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 5226
					}

					long var5 = GrandExchangeOfferAgeComparator.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 5228
					var2.playerCycle = Client.cycle; // L: 5229
					class10.scene.drawEntity(class87.Client_plane, var2.x, var2.y, class115.getTileHeight(var2.field1189 * 64 - 64 + var2.x, var2.field1189 * 64 - 64 + var2.y, class87.Client_plane), var2.field1189 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 5230
				}
			}
		}

	} // L: 5234
}
