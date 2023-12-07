import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("RasterProvider")
public final class RasterProvider extends AbstractRasterProvider {
	@ObfuscatedName("at")
	@Export("component")
	Component component;
	@ObfuscatedName("ah")
	Image field161;

	RasterProvider(int var1, int var2, Component var3, boolean var4) {
		super.width = var1; // L: 23
		super.height = var2; // L: 24
		super.pixels = new int[var2 * var1 + 1]; // L: 25
		if (var4) { // L: 26
			super.field5217 = new float[var2 * var1 + 1];
		}

		DataBufferInt var5 = new DataBufferInt(super.pixels, super.pixels.length); // L: 27
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255); // L: 28
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.width, super.height), var5, (Point)null); // L: 29
		this.field161 = new BufferedImage(var6, var7, false, new Hashtable()); // L: 30
		this.setComponent(var3); // L: 31
		this.apply(); // L: 32
	} // L: 33

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "22"
	)
	@Export("setComponent")
	final void setComponent(Component var1) {
		this.component = var1; // L: 36
	} // L: 37

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-24"
	)
	@Export("drawFull")
	public final void drawFull(int var1, int var2) {
		this.drawFull0(this.component.getGraphics(), var1, var2); // L: 41
	} // L: 42

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	@Export("draw")
	public final void draw(int var1, int var2, int var3, int var4) {
		this.draw0(this.component.getGraphics(), var1, var2, var3, var4); // L: 46
	} // L: 47

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;III)V",
		garbageValue = "-321512657"
	)
	@Export("drawFull0")
	final void drawFull0(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.field161, var2, var3, this.component); // L: 51
		} catch (Exception var5) { // L: 53
			this.component.repaint(); // L: 54
		}

	} // L: 56

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Graphics;IIIIB)V",
		garbageValue = "58"
	)
	@Export("draw0")
	final void draw0(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var6 = var1.getClip(); // L: 60
			var1.clipRect(var2, var3, var4, var5); // L: 61
			var1.drawImage(this.field161, 0, 0, this.component); // L: 62
			var1.setClip(var6); // L: 63
		} catch (Exception var7) { // L: 65
			this.component.repaint(); // L: 66
		}

	} // L: 68
}
