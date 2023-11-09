import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ac")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -994207861
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 816691635
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ap")
	protected float[] field5141;

	protected AbstractRasterProvider() {
	} // L: 9

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-640134058"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1844448669"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.method9393(this.pixels, this.width, this.height, this.field5141); // L: 12
	} // L: 13

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-530010411"
	)
	public final void method9474(boolean var1) {
		this.field5141 = var1 ? new float[this.width * this.height + 1] : null; // L: 19
	} // L: 20
}
