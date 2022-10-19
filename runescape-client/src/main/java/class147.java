import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class147 extends class151 {
	@ObfuscatedName("a")
	String field1687;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1495650379
	)
	int field1688;
	@ObfuscatedName("c")
	byte field1693;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class147(class152 var1) {
		this.this$0 = var1;
		this.field1687 = null; // L: 55
	} // L: 59

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "85"
	)
	void vmethod3238(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1687 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1688 = var1.readUnsignedShort(); // L: 67
		this.field1693 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "-1303116736"
	)
	void vmethod3239(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1687); // L: 74
		var2.world = this.field1688; // L: 75
		var2.rank = this.field1693; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;IIB)[Lry;",
		garbageValue = "34"
	)
	public static IndexedSprite[] method3146(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 25
		boolean var3;
		if (var4 == null) { // L: 26
			var3 = false; // L: 27
		} else {
			class335.SpriteBuffer_decode(var4); // L: 30
			var3 = true; // L: 31
		}

		if (!var3) { // L: 33
			return null;
		} else {
			IndexedSprite[] var5 = new IndexedSprite[class477.SpriteBuffer_spriteCount]; // L: 36

			for (int var6 = 0; var6 < class477.SpriteBuffer_spriteCount; ++var6) { // L: 37
				IndexedSprite var7 = var5[var6] = new IndexedSprite(); // L: 38
				var7.width = class477.SpriteBuffer_spriteWidth; // L: 39
				var7.height = class477.SpriteBuffer_spriteHeight; // L: 40
				var7.xOffset = class451.SpriteBuffer_xOffsets[var6]; // L: 41
				var7.yOffset = class319.SpriteBuffer_yOffsets[var6]; // L: 42
				var7.subWidth = class450.SpriteBuffer_spriteWidths[var6]; // L: 43
				var7.subHeight = class477.SpriteBuffer_spriteHeights[var6]; // L: 44
				var7.palette = class477.SpriteBuffer_spritePalette; // L: 45
				var7.pixels = class453.SpriteBuffer_pixels[var6]; // L: 46
			}

			class451.SpriteBuffer_xOffsets = null; // L: 49
			class319.SpriteBuffer_yOffsets = null; // L: 50
			class450.SpriteBuffer_spriteWidths = null; // L: 51
			class477.SpriteBuffer_spriteHeights = null; // L: 52
			class477.SpriteBuffer_spritePalette = null; // L: 53
			class453.SpriteBuffer_pixels = null; // L: 54
			return var5; // L: 58
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "403120926"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) { // L: 5086
			if (WorldMapManager.loadInterface(var0)) { // L: 5087
				Widget[] var1 = Widget.Widget_interfaceComponents[var0]; // L: 5088

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5089
					Widget var3 = var1[var2]; // L: 5090
					if (var3.onLoad != null) { // L: 5091
						ScriptEvent var4 = new ScriptEvent(); // L: 5092
						var4.widget = var3; // L: 5093
						var4.args = var3.onLoad; // L: 5094
						class103.runScript(var4, 5000000, 0); // L: 5095
					}
				}

			}
		}
	} // L: 5098

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "84"
	)
	static long method3141() {
		return Client.field489; // L: 2985
	}
}
