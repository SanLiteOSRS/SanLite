import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = 49328929
	)
	static int field1927;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Low;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1569878469
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1560016173
	)
	@Export("count")
	int count;
	@ObfuscatedName("u")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("p")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1482747310"
	)
	public static int method3431(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-259166904"
	)
	static final int method3433() {
		return Client.menuOptionsCount - 1;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		signature = "(IIIIIIIII)V",
		garbageValue = "353587604"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class15.loadInterface(var0)) {
			WallDecoration.field2179 = null;
			class2.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (WallDecoration.field2179 != null) {
				class2.drawInterface(WallDecoration.field2179, -1412584499, var1, var2, var3, var4, class11.field106, class235.field2843, var7);
				WallDecoration.field2179 = null;
			}

		} else {
			if (var7 != -1) {
				Client.field811[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.field811[var8] = true;
				}
			}

		}
	}
}
