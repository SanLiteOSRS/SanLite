import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -536072233
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1607146609
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -179610333
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-323833461"
	)
	public static void method4988() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}
}
