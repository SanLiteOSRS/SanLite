import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class141 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 363593983
	)
	int field1624;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -949021879
	)
	int field1621;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -444644241
	)
	int field1622;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1952126939
	)
	int field1627;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class141(class147 var1) {
		this.this$0 = var1;
		this.field1624 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1624 = var1.readUnsignedShort(); // L: 166
		this.field1621 = var1.readInt(); // L: 167
		this.field1622 = var1.readUnsignedByte(); // L: 168
		this.field1627 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3335(this.field1624, this.field1621, this.field1622, this.field1627); // L: 173
	} // L: 174

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lgr;",
		garbageValue = "931002418"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-6"
	)
	static final boolean method3211(int var0, int var1) {
		ObjectComposition var2 = WorldMapSection2.getObjectDefinition(var0); // L: 1030
		if (var1 == 11) { // L: 1031
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 1032
		}

		return var2.method3892(var1); // L: 1033
	}
}
