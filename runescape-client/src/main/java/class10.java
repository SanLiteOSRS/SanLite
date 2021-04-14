import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class10 extends class14 {
	@ObfuscatedName("ah")
	@Export("client")
	@ObfuscatedSignature(
		signature = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1376783639
	)
	int field72;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class10(class2 var1) {
		this.this$0 = var1;
		this.field72 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		this.field72 = var1.readUnsignedShort();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method180(this.field72);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "-1498407424"
	)
	static int method136(int var0, int var1) {
		FloorOverlayDefinition var2 = Login.method1968(var0);
		if (var2 == null) {
			return var1;
		} else if (var2.secondaryRgb >= 0) {
			return var2.secondaryRgb | -16777216;
		} else {
			int var3;
			if (var2.texture >= 0) {
				var3 = Players.method2285(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var3 = WallDecoration.method3808(var2.hue, var2.saturation, var2.lightness);
				int var4 = Players.method2285(var3, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			}
		}
	}

	@ObfuscatedName("b")
	public static boolean method137(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "86"
	)
	static void method129() {
		Login.loginIndex = 24;
		class9.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}
}
