import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class141 extends class143 {
	@ObfuscatedName("ar")
	static byte[][][] field1628;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -6949237618253814325L
	)
	long field1627;
	@ObfuscatedName("ap")
	String field1626;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class141(class146 var1) {
		this.this$0 = var1;
		this.field1627 = -1L; // L: 74
		this.field1626 = null; // L: 75
	} // L: 77

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1627 = var1.readLong(); // L: 82
		}

		this.field1626 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3344(this.field1627, this.field1626, 0); // L: 88
	} // L: 89

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "1341518248"
	)
	public static FloorUnderlayDefinition method3213(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.field2039.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.field2035.takeFile(1, var0); // L: 27
			var1 = new FloorUnderlayDefinition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 30
			FloorUnderlayDefinition.field2039.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Ldn;ZI)V",
		garbageValue = "-11258464"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4969
			var0.isUnanimated = false; // L: 4970
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 4971 4972
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4974
			int var3 = var0.y >> 7; // L: 4975
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4976
				long var4 = DynamicObject.calculateTag(0, 0, 0, false, var0.index); // L: 4977
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4978
					var0.isUnanimated = false; // L: 4979
					var0.tileHeight = class19.getTileHeight(var0.x, var0.y, class113.Client_plane); // L: 4980
					var0.playerCycle = Client.cycle; // L: 4981
					GrandExchangeOfferOwnWorldComparator.scene.addNullableObject(class113.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY); // L: 4982
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4985
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4986
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4987
					}

					var0.tileHeight = class19.getTileHeight(var0.x, var0.y, class113.Client_plane); // L: 4989
					var0.playerCycle = Client.cycle; // L: 4990
					GrandExchangeOfferOwnWorldComparator.scene.drawEntity(class113.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4991
				}
			}
		}

	} // L: 4995
}
