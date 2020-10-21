import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1443412059
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 815931901
	)
	@Export("count")
	int count;
	@ObfuscatedName("l")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("m")
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
		signature = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-1635350138"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class60.field453.startsWith("win")) {
				MouseHandler.method1176(var0, 0);
			} else if (class60.field453.startsWith("mac")) {
				WorldMapManager.method735(var0, 1, "openjs");
			} else {
				MouseHandler.method1176(var0, 2);
			}
		} else {
			MouseHandler.method1176(var0, 3);
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(Liw;IIS)Lle;",
		garbageValue = "8416"
	)
	static IndexedSprite method3215(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class217.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			IndexedSprite var5 = new IndexedSprite();
			var5.width = class336.SpriteBuffer_spriteWidth;
			var5.height = class336.SpriteBuffer_spriteHeight;
			var5.xOffset = class336.SpriteBuffer_xOffsets[0];
			var5.yOffset = class225.SpriteBuffer_yOffsets[0];
			var5.subWidth = class336.SpriteBuffer_spriteWidths[0];
			var5.subHeight = class336.SpriteBuffer_spriteHeights[0];
			var5.palette = WorldMapID.SpriteBuffer_spritePalette;
			var5.pixels = class13.SpriteBuffer_pixels[0];
			class336.SpriteBuffer_xOffsets = null;
			class225.SpriteBuffer_yOffsets = null;
			class336.SpriteBuffer_spriteWidths = null;
			class336.SpriteBuffer_spriteHeights = null;
			WorldMapID.SpriteBuffer_spritePalette = null;
			class13.SpriteBuffer_pixels = null;
			return var5;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "11601118"
	)
	static boolean method3212(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1;
	}
}
