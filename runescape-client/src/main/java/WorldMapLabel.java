import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("f")
	@Export("text")
	String text;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1900229559
	)
	@Export("width")
	int width;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 424685221
	)
	@Export("height")
	int height;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lab;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;IILab;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1774401095"
	)
	protected static final void method519() {
		UserComparator3.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0;
	}
}
