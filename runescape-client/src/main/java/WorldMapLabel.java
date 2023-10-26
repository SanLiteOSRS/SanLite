import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ac")
	@Export("text")
	String text;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 549349419
	)
	@Export("width")
	int width;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1069492799
	)
	@Export("height")
	int height;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILka;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1591685204"
	)
	public static int method5653(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 55
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 56
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 57
		var0 += var0 >>> 8; // L: 58
		var0 += var0 >>> 16; // L: 59
		return var0 & 255; // L: 60
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-26"
	)
	static int method5654(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 919
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 920
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Ldc;I)V",
		garbageValue = "-1071136907"
	)
	static void method5655(NPC var0) {
		var0.field1189 = var0.definition.size; // L: 9237
		var0.field1216 = var0.definition.rotation; // L: 9238
		var0.walkSequence = var0.definition.walkSequence; // L: 9239
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 9240
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 9241
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 9242
		var0.idleSequence = var0.definition.idleSequence; // L: 9243
		var0.field1192 = var0.definition.turnLeftSequence; // L: 9244
		var0.field1193 = var0.definition.turnRightSequence; // L: 9245
		var0.runSequence = var0.definition.field2059; // L: 9246
		var0.field1217 = var0.definition.field2060; // L: 9247
		var0.field1202 = var0.definition.field2061; // L: 9248
		var0.field1201 = var0.definition.field2088; // L: 9249
		var0.field1196 = var0.definition.field2063; // L: 9250
		var0.field1203 = var0.definition.field2064; // L: 9251
		var0.field1219 = var0.definition.field2065; // L: 9252
		var0.field1205 = var0.definition.field2074; // L: 9253
	} // L: 9254
}
