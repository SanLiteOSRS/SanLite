import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 251627885
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmg;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILmg;Lmg;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1; // L: 11
		this.coord1 = var2; // L: 12
		this.coord2 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltm;",
		garbageValue = "-20344614"
	)
	static SpritePixels[] method5600() {
		SpritePixels[] var0 = new SpritePixels[class515.SpriteBuffer_spriteCount]; // L: 219

		for (int var1 = 0; var1 < class515.SpriteBuffer_spriteCount; ++var1) { // L: 220
			SpritePixels var2 = var0[var1] = new SpritePixels(); // L: 221
			var2.width = class330.SpriteBuffer_spriteWidth; // L: 222
			var2.height = class489.SpriteBuffer_spriteHeight; // L: 223
			var2.xOffset = class515.SpriteBuffer_xOffsets[var1]; // L: 224
			var2.yOffset = class402.SpriteBuffer_yOffsets[var1]; // L: 225
			var2.subWidth = class515.SpriteBuffer_spriteWidths[var1]; // L: 226
			var2.subHeight = class515.SpriteBuffer_spriteHeights[var1]; // L: 227
			int var3 = var2.subWidth * var2.subHeight; // L: 228
			byte[] var4 = class515.SpriteBuffer_pixels[var1]; // L: 229
			var2.pixels = new int[var3]; // L: 230

			for (int var5 = 0; var5 < var3; ++var5) { // L: 231
				var2.pixels[var5] = class515.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		TextureProvider.method4758(); // L: 233
		return var0; // L: 234
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1864251728"
	)
	static void method5599() {
		for (int var0 = 0; var0 < Client.field800.size(); ++var0) { // L: 12829
			int var2 = (Integer)Client.field800.get(var0); // L: 12831
			class136 var3 = HealthBar.method2553(var2); // L: 12833
			int var1;
			if (var3 == null) { // L: 12834
				var1 = 2; // L: 12835
			} else {
				var1 = var3.method3051() ? 0 : 1; // L: 12838
			}

			if (var1 != 2) { // L: 12840
				Client.field800.remove(var0); // L: 12841
				--var0; // L: 12842
			}
		}

	} // L: 12845
}
