import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class151 extends class161 {
	@ObfuscatedName("az")
	static byte[][][] field1708;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1026077785
	)
	int field1710;
	@ObfuscatedName("aw")
	byte field1709;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 350317843
	)
	int field1712;
	@ObfuscatedName("ai")
	String field1711;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class151(class162 var1) {
		this.this$0 = var1;
		this.field1710 = -1; // L: 103
	} // L: 108

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	void vmethod3504(Buffer var1) {
		this.field1710 = var1.readUnsignedShort(); // L: 111
		this.field1709 = var1.readByte(); // L: 112
		this.field1712 = var1.readUnsignedShort(); // L: 113
		var1.readLong(); // L: 114
		this.field1711 = var1.readStringCp1252NullTerminated(); // L: 115
	} // L: 116

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	void vmethod3509(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1710); // L: 119
		var2.rank = this.field1709; // L: 120
		var2.world = this.field1712; // L: 121
		var2.username = new Username(this.field1711); // L: 122
	} // L: 123

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2016936296"
	)
	public static void method3279() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 441
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 442
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 443
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 444
	} // L: 445

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "-2002148097"
	)
	static void method3280(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem(); // L: 8507
		var10.id = var3; // L: 8508
		var10.quantity = var4; // L: 8509
		var10.method2758(var5); // L: 8510
		if (Client.groundItems[var0][var1][var2] == null) { // L: 8511
			Client.groundItems[var0][var1][var2] = new NodeDeque(); // L: 8512
		}

		Client.groundItems[var0][var1][var2].addFirst(var10); // L: 8514
		class73.method2117(var0, var1, var2); // L: 8515
	} // L: 8516
}
