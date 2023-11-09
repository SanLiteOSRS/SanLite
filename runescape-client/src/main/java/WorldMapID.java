import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final WorldMapID field2992;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	static final WorldMapID field2993;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 933607109
	)
	@Export("value")
	final int value;

	static {
		field2992 = new WorldMapID(0); // L: 4
		field2993 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lcf;I)V",
		garbageValue = "1547422490"
	)
	static void method5339(NPC var0) {
		var0.field1163 = var0.definition.size; // L: 8830
		var0.field1228 = var0.definition.rotation; // L: 8831
		var0.walkSequence = var0.definition.walkSequence; // L: 8832
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 8833
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 8834
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 8835
		var0.idleSequence = var0.definition.idleSequence; // L: 8836
		var0.turnLeftSequence = var0.definition.turnLeftSequence; // L: 8837
		var0.turnRightSequence = var0.definition.turnRightSequence; // L: 8838
		var0.runSequence = var0.definition.field2039; // L: 8839
		var0.field1173 = var0.definition.field2040; // L: 8840
		var0.field1174 = var0.definition.field2059; // L: 8841
		var0.field1168 = var0.definition.field2042; // L: 8842
		var0.field1187 = var0.definition.field2043; // L: 8843
		var0.field1172 = var0.definition.field2065; // L: 8844
		var0.field1178 = var0.definition.field2045; // L: 8845
		var0.field1179 = var0.definition.field2057; // L: 8846
	} // L: 8847
}
