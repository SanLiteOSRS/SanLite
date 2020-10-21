import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class class60 {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		signature = "Lcr;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("z")
	@Export("applet")
	static Applet applet;
	@ObfuscatedName("k")
	static String field451;
	@ObfuscatedName("a")
	static int[] field453;
	@ObfuscatedName("ah")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = -1192539033
	)
	static int field456;

	static {
		applet = null;
		field451 = "";
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "-14"
	)
	@Export("isKeyDown")
	public static final boolean isKeyDown() {
		synchronized(KeyHandler.KeyHandler_instance) {
			if (KeyHandler.field423 == KeyHandler.field399) {
				return false;
			} else {
				PlayerComposition.field2581 = KeyHandler.field420[KeyHandler.field423];
				PacketWriter.field1350 = KeyHandler.field419[KeyHandler.field423];
				KeyHandler.field423 = KeyHandler.field423 + 1 & 127;
				return true;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(IIIB)I",
		garbageValue = "-34"
	)
	static final int method947(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = TileItem.method2206(var3, var5);
		int var8 = TileItem.method2206(var3 + 1, var5);
		int var9 = TileItem.method2206(var3, var5 + 1);
		int var10 = TileItem.method2206(var3 + 1, var5 + 1);
		int var11 = ArchiveDisk.method5991(var7, var8, var4, var2);
		int var12 = ArchiveDisk.method5991(var9, var10, var4, var2);
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var11 >> 16) + (var14 * var12 >> 16);
		return var13;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Lhq;IS)V",
		garbageValue = "15262"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field2626 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field2661 == null) {
				var0.field2661 = new int[var0.field2626.length];
			}

			var0.field2661[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(IIII)I",
		garbageValue = "877979774"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		signature = "(Lkf;II)V",
		garbageValue = "-1719664383"
	)
	static void method937(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class310.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var4) {
			}
		}

	}
}
