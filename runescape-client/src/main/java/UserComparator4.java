import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("ai")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqd;Lqd;I)I",
		garbageValue = "-2102389691"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CB)B",
		garbageValue = "11"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111; // L: 26
		} else if (var0 == 8217) { // L: 27
			var1 = -110;
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) { // L: 29
			var1 = -108;
		} else if (var0 == 8226) { // L: 30
			var1 = -107;
		} else if (var0 == 8211) { // L: 31
			var1 = -106;
		} else if (var0 == 8212) { // L: 32
			var1 = -105;
		} else if (var0 == 732) { // L: 33
			var1 = -104;
		} else if (var0 == 8482) { // L: 34
			var1 = -103;
		} else if (var0 == 353) { // L: 35
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-47"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 13
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Ljava/lang/String;Ljava/lang/String;I)Lum;",
		garbageValue = "648502509"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) { // L: 143
			return null;
		} else {
			int var3 = var0.getGroupId(var1); // L: 144
			int var4 = var0.getFileId(var3, var2); // L: 145
			return AbstractWorldMapIcon.method5607(var0, var3, var4); // L: 146
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lme;IIZB)V",
		garbageValue = "21"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 11081
		int var5 = var0.height; // L: 11082
		if (var0.widthAlignment == 0) { // L: 11083
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 11084
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 11085
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 11086
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 11087
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 11088
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 11089
			var0.width = var0.height * var0.field3644 / var0.field3749;
		}

		if (var0.heightAlignment == 4) { // L: 11090
			var0.height = var0.width * var0.field3749 / var0.field3644;
		}

		if (var0.contentType == 1337) { // L: 11091
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) { // L: 11092
			var0.method6470().method6167(var0.width, var0.height); // L: 11093
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 11095
			ScriptEvent var6 = new ScriptEvent(); // L: 11096
			var6.widget = var0; // L: 11097
			var6.args = var0.onResize; // L: 11098
			Client.scriptEvents.addFirst(var6); // L: 11099
		}

	} // L: 11101

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(IIIILuq;Lmo;B)V",
		garbageValue = "-58"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 12541
			int var6 = Client.camAngleY & 2047; // L: 12542
			int var7 = var3 * var3 + var2 * var2; // L: 12543
			if (var7 <= 6400) { // L: 12544
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 12545
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 12546
				int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12547
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12548
				if (var7 > 2500) {
					var4.method9542(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 12549
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 12550
				}

			}
		}
	} // L: 12551

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)Z",
		garbageValue = "-740065901"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 12689
	}
}
