import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("h")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 383484853
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = -1601684285
	)
	@Export("baseY")
	static int baseY;
	@ObfuscatedName("gu")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1068493596"
	)
	public static final void method2374(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "252284948"
	)
	public static int method2381(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1395505171"
	)
	static final void method2378(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var13 + var6;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method3823(var17, var18, var19);
			Rasterizer3D.method3826(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method3823(var17, var19, var20);
			Rasterizer3D.method3826(var21, var23, var24, var17, var19, var20, var4);
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "930594009"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + HorizontalAlignment.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + HorizontalAlignment.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + HorizontalAlignment.colorStartTag(16776960) + var1 + "</col>";
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "716451367"
	)
	static final void method2357(int var0) {
		if (UserComparator8.loadInterface(var0)) {
			class308.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1);
		}
	}
}
