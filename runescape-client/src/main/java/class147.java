import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class147 extends class143 {
	@ObfuscatedName("gd")
	static String field1648;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = -183991149
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -630324793
	)
	int field1649;
	@ObfuscatedName("an")
	byte field1651;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class147(class146 var1) {
		this.this$0 = var1;
		this.field1649 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1649 = var1.readUnsignedShort(); // L: 134
		this.field1651 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3200(this.field1649, this.field1651); // L: 139
	} // L: 140

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "1681141944"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < GrandExchangeOfferUnitPriceComparator.WorldMapElement_cached.length && GrandExchangeOfferUnitPriceComparator.WorldMapElement_cached[var0] != null ? GrandExchangeOfferUnitPriceComparator.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ltt;",
		garbageValue = "-48"
	)
	static SpritePixels method3133(int var0, int var1, int var2) {
		DemotingHashTable var3 = WorldMapRegion.WorldMapRegion_cachedSprites; // L: 38
		long var4 = (long)(var2 << 16 | var0 << 8 | var1); // L: 41
		return (SpritePixels)var3.get(var4); // L: 43
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "-497431041"
	)
	public static void method3136(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0; // L: 19
	} // L: 20

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1769774153"
	)
	static final void method3138(String var0) {
		HealthBarUpdate.addGameMessage(30, "", var0); // L: 116
	} // L: 117
}
