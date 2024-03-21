import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	static SpritePixels[] field492;
	@ObfuscatedName("aq")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 13136

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Loj;Loj;B)I",
		garbageValue = "67"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 13139
			return 0;
		} else {
			if (this.filterWorlds) { // L: 13140
				if (Client.worldId == var1.world) { // L: 13141
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 13142
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 13144
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 13148
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 13152
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Ldc;",
		garbageValue = "-515850425"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = WorldMapSectionType.archive12.takeFile(var0, 0);
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = class257.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhr;",
		garbageValue = "-123"
	)
	public static FloorUnderlayDefinition method1203(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.field2052.get((long)var0); // L: 21
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.field2051.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 26
			FloorUnderlayDefinition.field2052.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILrl;Lom;I)V",
		garbageValue = "-1206837819"
	)
	static void method1204(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null; // L: 44
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 45
			for (ArchiveDiskAction var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var5 != null; var5 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) { // L: 46
				if (var5.key == (long)var0 && var1 == var5.archiveDisk && var5.type == 0) { // L: 47
					var3 = var5.data; // L: 48
					break; // L: 49
				}
			}
		}

		if (var3 != null) { // L: 53
			var2.load(var1, var0, var3, true); // L: 54
		} else {
			byte[] var4 = var1.read(var0); // L: 57
			var2.load(var1, var0, var4, true); // L: 58
		}
	} // L: 55 59

	@ObfuscatedName("aw")
	static final void method1205(long var0) {
		try {
			Thread.sleep(var0); // L: 20
		} catch (InterruptedException var3) { // L: 22
		}

	} // L: 23

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1865309453"
	)
	public static void method1192() {
		class321.field3484.clear(); // L: 142
	} // L: 143

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)V",
		garbageValue = "55"
	)
	static final void method1202(Widget var0) {
		int var1 = var0.contentType; // L: 12459
		if (var1 == 324) { // L: 12460
			if (Client.field593 == -1) { // L: 12461
				Client.field593 = var0.spriteId2; // L: 12462
				Client.field716 = var0.spriteId; // L: 12463
			}

			if (Client.playerAppearance.field3665 == 1) { // L: 12465
				var0.spriteId2 = Client.field593;
			} else {
				var0.spriteId2 = Client.field716; // L: 12466
			}

		} else if (var1 == 325) { // L: 12469
			if (Client.field593 == -1) { // L: 12470
				Client.field593 = var0.spriteId2; // L: 12471
				Client.field716 = var0.spriteId; // L: 12472
			}

			if (Client.playerAppearance.field3665 == 1) { // L: 12474
				var0.spriteId2 = Client.field716;
			} else {
				var0.spriteId2 = Client.field593; // L: 12475
			}

		} else if (var1 == 327) { // L: 12478
			var0.modelAngleX = 150; // L: 12479
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12480
			var0.modelType = 5; // L: 12481
			var0.modelId = 0; // L: 12482
		} else if (var1 == 328) { // L: 12485
			var0.modelAngleX = 150; // L: 12486
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12487
			var0.modelType = 5; // L: 12488
			var0.modelId = 1; // L: 12489
		}
	} // L: 12467 12476 12483 12490 12492
}
