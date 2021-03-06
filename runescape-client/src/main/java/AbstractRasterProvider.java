import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("d")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1159583033
	)
	@Export("width")
	public int width;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1839293839
	)
	@Export("height")
	public int height;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "2060006654",
		signature = "(III)V"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "-1656973228",
		signature = "(IIIII)V"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		garbageValue = "1592611264",
		signature = "(I)V"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_replace(this.pixels, this.width, this.height);
	}
}
