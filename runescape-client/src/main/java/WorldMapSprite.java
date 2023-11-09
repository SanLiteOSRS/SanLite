import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("w")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096]; // L: 11
	} // L: 12

	WorldMapSprite(int[] var1) {
		this.tileColors = var1; // L: 15
	} // L: 16

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1421933673"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1]; // L: 24
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;I)V",
		garbageValue = "-1163139509"
	)
	public static void method5338(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0; // L: 67
		NPCComposition.NpcDefinition_modelArchive = var1; // L: 68
	} // L: 69

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(Llm;Ljava/lang/String;I)V",
		garbageValue = "-1208127892"
	)
	static void method5337(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1726
		Client.archiveLoaders.add(var2); // L: 1727
		Client.field800 += var2.groupCount; // L: 1728
	} // L: 1729
}
