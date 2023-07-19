import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class184 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	static Widget field1907;
	@ObfuscatedName("ac")
	public short[] field1906;
	@ObfuscatedName("aw")
	public short[] field1903;

	class184(int var1) {
		ItemComposition var2 = class141.ItemComposition_get(var1); // L: 12
		if (var2.method4094()) { // L: 13
			this.field1906 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1906, 0, this.field1906.length); // L: 15
		}

		if (var2.method4095()) { // L: 17
			this.field1903 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1903, 0, this.field1903.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsw;III)I",
		garbageValue = "-543606388"
	)
	static int method3664(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) { // L: 33
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1); // L: 34
			return var3 == null ? var2 : var3.integer; // L: 35 36
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfw;",
		garbageValue = "43"
	)
	public static class138 method3661(int var0) {
		class138 var1 = (class138)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 407
		if (var1 != null) { // L: 408
			return var1;
		} else {
			var1 = AttackOption.method2720(GrandExchangeOfferOwnWorldComparator.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 409
			if (var1 != null) { // L: 410
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1; // L: 411
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2064974803"
	)
	static final int method3665() {
		if (ScriptFrame.clientPreferences.method2543()) { // L: 5196
			return BuddyRankComparator.Client_plane;
		} else {
			int var0 = class291.getTileHeight(PacketWriter.cameraX, World.cameraZ, BuddyRankComparator.Client_plane); // L: 5197
			return var0 - class309.cameraY < 800 && (Tiles.Tiles_renderFlags[BuddyRankComparator.Client_plane][PacketWriter.cameraX >> 7][World.cameraZ >> 7] & 4) != 0 ? BuddyRankComparator.Client_plane : 3; // L: 5198 5199
		}
	}
}
