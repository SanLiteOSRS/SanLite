import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
public class class464 {
	@ObfuscatedName("am")
	float field4794;
	@ObfuscatedName("ap")
	float field4795;
	@ObfuscatedName("af")
	float field4796;

	static {
		new class464(0.0F, 0.0F, 0.0F); // L: 5
		new class464(1.0F, 1.0F, 1.0F); // L: 9
		new class464(1.0F, 0.0F, 0.0F); // L: 13
		new class464(0.0F, 1.0F, 0.0F); // L: 17
		new class464(0.0F, 0.0F, 1.0F); // L: 21
		class127.method3028(100);
	}

	class464(float var1, float var2, float var3) {
		this.field4794 = var1; // L: 35
		this.field4795 = var2; // L: 36
		this.field4796 = var3; // L: 37
	} // L: 38

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "159357859"
	)
	final float method8504() {
		return (float)Math.sqrt((double)(this.field4796 * this.field4796 + this.field4794 * this.field4794 + this.field4795 * this.field4795)); // L: 41
	}

	public String toString() {
		return this.field4794 + ", " + this.field4795 + ", " + this.field4796; // L: 46
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Luh;",
		garbageValue = "-1228913336"
	)
	public static class523 method8510(int var0) {
		class523 var1 = (class523)class523.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class523.field5124.takeFile(38, var0); // L: 26
			var1 = new class523(); // L: 27
			if (var2 != null) { // L: 28
				var1.method9283(new Buffer(var2));
			}

			var1.method9286(); // L: 29
			class523.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lut;",
		garbageValue = "1037732544"
	)
	static IndexedSprite method8511() {
		IndexedSprite var0 = new IndexedSprite(); // L: 127
		var0.width = class545.SpriteBuffer_spriteWidth; // L: 128
		var0.height = class545.SpriteBuffer_spriteHeight; // L: 129
		var0.xOffset = class545.SpriteBuffer_xOffsets[0]; // L: 130
		var0.yOffset = class388.SpriteBuffer_yOffsets[0]; // L: 131
		var0.subWidth = FriendsList.SpriteBuffer_spriteWidths[0]; // L: 132
		var0.subHeight = GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights[0]; // L: 133
		var0.palette = class113.SpriteBuffer_spritePalette; // L: 134
		var0.pixels = class230.SpriteBuffer_pixels[0]; // L: 135
		class545.SpriteBuffer_xOffsets = null; // L: 137
		class388.SpriteBuffer_yOffsets = null; // L: 138
		FriendsList.SpriteBuffer_spriteWidths = null; // L: 139
		GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = null; // L: 140
		class113.SpriteBuffer_spritePalette = null; // L: 141
		class230.SpriteBuffer_pixels = null; // L: 142
		return var0; // L: 144
	}
}
