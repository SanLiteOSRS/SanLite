import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Lio;"
	)
	@Export("NetCache_currentResponse")
	static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		signature = "Liw;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -533090373
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -141428387
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2027106077
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1015841735
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1352493759
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("o")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 248691895
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IZIZB)V",
		garbageValue = "-24"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (AbstractByteArrayCopier.World_worlds != null) {
			WorldMapRegion.doWorldSorting(0, AbstractByteArrayCopier.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}
}
