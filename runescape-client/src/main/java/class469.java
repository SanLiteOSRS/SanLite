import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
public final class class469 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lsh;"
	)
	static class469[] field4866;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1665976069
	)
	static int field4862;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1729019913
	)
	static int field4868;
	@ObfuscatedName("at")
	float field4863;
	@ObfuscatedName("an")
	float field4865;
	@ObfuscatedName("ao")
	float field4864;
	@ObfuscatedName("ab")
	float field4867;

	static {
		field4866 = new class469[0]; // L: 4
		PlayerType.method6892(100); // L: 9
		new class469();
	} // L: 14

	class469() {
		this.method8381(); // L: 44
	} // L: 45

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	public void method8386() {
		synchronized(field4866) { // L: 38
			if (class277.field3054 < field4862 - 1) { // L: 39
				field4866[++class277.field3054 - 1] = this;
			}

		}
	} // L: 41

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1592388866"
	)
	void method8379(float var1, float var2, float var3, float var4) {
		this.field4863 = var1; // L: 48
		this.field4865 = var2; // L: 49
		this.field4864 = var3; // L: 50
		this.field4867 = var4; // L: 51
	} // L: 52

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1951250570"
	)
	public void method8383(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 55
		float var6 = (float)Math.cos((double)(var4 * 0.5F)); // L: 56
		this.field4863 = var1 * var5; // L: 57
		this.field4865 = var2 * var5; // L: 58
		this.field4864 = var3 * var5; // L: 59
		this.field4867 = var6; // L: 60
	} // L: 61

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1755081326"
	)
	final void method8381() {
		this.field4864 = 0.0F; // L: 64
		this.field4865 = 0.0F; // L: 65
		this.field4863 = 0.0F; // L: 66
		this.field4867 = 1.0F; // L: 67
	} // L: 68

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsh;S)V",
		garbageValue = "20063"
	)
	public final void method8382(class469 var1) {
		this.method8379(this.field4867 * var1.field4863 + var1.field4867 * this.field4863 + this.field4864 * var1.field4865 - this.field4865 * var1.field4864, var1.field4864 * this.field4863 + var1.field4865 * this.field4867 + (var1.field4867 * this.field4865 - var1.field4863 * this.field4864), var1.field4863 * this.field4865 + var1.field4867 * this.field4864 - var1.field4865 * this.field4863 + this.field4867 * var1.field4864, this.field4867 * var1.field4867 - this.field4863 * var1.field4863 - var1.field4865 * this.field4865 - var1.field4864 * this.field4864); // L: 71
	} // L: 72

	public String toString() {
		return this.field4863 + "," + this.field4865 + "," + this.field4864 + "," + this.field4867; // L: 96
	}

	public int hashCode() {
		boolean var1 = true; // L: 85
		float var2 = 1.0F; // L: 86
		var2 = 31.0F * var2 + this.field4863; // L: 87
		var2 = this.field4865 + var2 * 31.0F; // L: 88
		var2 = var2 * 31.0F + this.field4864; // L: 89
		var2 = this.field4867 + 31.0F * var2; // L: 90
		return (int)var2; // L: 91
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class469)) { // L: 76
			return false; // L: 80
		} else {
			class469 var2 = (class469)var1; // L: 77
			return this.field4863 == var2.field4863 && var2.field4865 == this.field4865 && this.field4864 == var2.field4864 && var2.field4867 == this.field4867; // L: 78
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvl;",
		garbageValue = "655931485"
	)
	static IndexedSprite[] method8384() {
		IndexedSprite[] var0 = new IndexedSprite[class549.SpriteBuffer_spriteCount]; // L: 113

		for (int var1 = 0; var1 < class549.SpriteBuffer_spriteCount; ++var1) { // L: 114
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 115
			var2.width = class549.SpriteBuffer_spriteWidth; // L: 116
			var2.height = class549.SpriteBuffer_spriteHeight; // L: 117
			var2.xOffset = class549.SpriteBuffer_xOffsets[var1]; // L: 118
			var2.yOffset = class549.SpriteBuffer_yOffsets[var1]; // L: 119
			var2.subWidth = class549.SpriteBuffer_spriteWidths[var1]; // L: 120
			var2.subHeight = Ignored.SpriteBuffer_spriteHeights[var1] * 398261776; // L: 121
			var2.palette = class126.SpriteBuffer_spritePalette; // L: 122
			var2.pixels = class549.SpriteBuffer_pixels[var1]; // L: 123
		}

		SpotAnimationDefinition.method3949(); // L: 125
		return var0; // L: 126
	}
}
