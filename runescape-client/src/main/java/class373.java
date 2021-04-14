import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class373 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lne;"
	)
	public static final class373 field4126;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lne;"
	)
	public static final class373 field4134;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lne;"
	)
	public static final class373 field4128;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "[Low;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 652831107
	)
	final int field4129;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1417064257
	)
	public final int field4130;
	@ObfuscatedName("e")
	public final Class field4131;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lnn;"
	)
	final class369 field4132;

	static {
		field4126 = new class373(2, 0, Integer.class, new class370());
		field4134 = new class373(1, 1, Long.class, new class372());
		field4128 = new class373(0, 2, String.class, new class374());
	}

	@ObfuscatedSignature(
		signature = "(IILjava/lang/Class;Lnn;)V"
	)
	class373(int var1, int var2, Class var3, class369 var4) {
		this.field4129 = var1;
		this.field4130 = var2;
		this.field4131 = var3;
		this.field4132 = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4130;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lnu;I)Ljava/lang/Object;",
		garbageValue = "228670088"
	)
	public Object method6482(Buffer var1) {
		return this.field4132.vmethod6492(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Class;I)Lne;",
		garbageValue = "-1723331254"
	)
	public static class373 method6477(Class var0) {
		class373[] var1 = new class373[]{field4128, field4134, field4126};
		class373[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class373 var4 = var2[var3];
			if (var4.field4131 == var0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Class;I)Lnn;",
		garbageValue = "1858970757"
	)
	public static class369 method6480(Class var0) {
		class373 var1 = method6477(var0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		} else {
			return var1.field4132;
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		signature = "(Lhu;IIIB)V",
		garbageValue = "2"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class22.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
