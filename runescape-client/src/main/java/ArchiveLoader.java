import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 3333293732747841481L
	)
	static long field565;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -30883449
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1222733201
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		signature = "(Lid;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "1049083276"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method4416(var1) || this.archive.method4411(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(III)Lco;",
		garbageValue = "-2052034218"
	)
	static Script method1240(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = ViewportMouse.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = ViewportMouse.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = ClientPacket.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		signature = "(Lbi;ZI)V",
		garbageValue = "-788560949"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.readySequence == var0.movementSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = GrandExchangeOfferOwnWorldComparator.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = GrandExchangeOfferWorldComparator.getTileHeight(var0.x, var0.y, GrandExchangeOfferUnitPriceComparator.Client_plane);
					var0.playerCycle = Client.cycle;
					ModeWhere.scene.addNullableObject(GrandExchangeOfferUnitPriceComparator.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.field646, var0.field669, var0.field660, var0.field661);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = GrandExchangeOfferWorldComparator.getTileHeight(var0.x, var0.y, GrandExchangeOfferUnitPriceComparator.Client_plane);
					var0.playerCycle = Client.cycle;
					ModeWhere.scene.drawEntity(GrandExchangeOfferUnitPriceComparator.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}
}
