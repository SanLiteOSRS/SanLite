import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("z")
	static final int[] field1711;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2064389097
	)
	static int field1710;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 632538905
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 195506189
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 891667147
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1711 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1711[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "812293859"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IS)V",
		garbageValue = "21911"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-15726"
	)
	public static int method2813(int var0) {
		return PacketWriter.method2409(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(IIIIZS)V",
		garbageValue = "-20141"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field820;
		} else if (var5 >= 100) {
			var6 = Client.field872;
		} else {
			var6 = (Client.field872 - Client.field820) * var5 / 100 + Client.field820;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field877) {
			var14 = Client.field877;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field738) {
				var6 = Client.field738;
				var8 = var3 * var6 * 512 / (var14 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field878) {
			var14 = Client.field878;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field875) {
				var6 = Client.field875;
				var8 = var14 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var13 = new int[9];

			for (var9 = 0; var9 < var13.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = class21.method281(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				var11 = PlayerComposition.method4640(var11, var3);
				var13[var9] = var12 * var11 >> 16;
			}

			Scene.Scene_buildVisiblityMap(var13, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "7"
	)
	static void method2818(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class306.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
