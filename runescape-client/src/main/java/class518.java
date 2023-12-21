import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
public class class518 extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Ltu;"
	)
	class514[] field5076;
	@ObfuscatedName("ab")
	List field5079;

	@ObfuscatedSignature(
		descriptor = "(Lol;I)V"
	)
	public class518(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0); // L: 26
		this.method9155(new Buffer(var3)); // L: 27
	} // L: 28

	@ObfuscatedSignature(
		descriptor = "(Lol;II)V"
	)
	public class518(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1); // L: 21
		this.method9155(new Buffer(var4)); // L: 22
	} // L: 23

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-1944052091"
	)
	void method9155(Buffer var1) {
		int var2 = var1.method9341(); // L: 31
		this.field5076 = new class514[var2]; // L: 32
		this.field5079 = new ArrayList(var2); // L: 33

		for (int var3 = 0; var3 < var2; ++var3) { // L: 34
			this.field5076[var3] = (class514)class12.findEnumerated(class514.method9122(), var1.readUnsignedByte()); // L: 35
			int var4 = var1.method9341(); // L: 36
			HashMap var5 = new HashMap(var4); // L: 37

			while (var4-- > 0) { // L: 38
				Object var6 = this.field5076[var3].method9120(var1); // L: 39
				int var7 = var1.method9341(); // L: 40
				ArrayList var8 = new ArrayList(); // L: 41

				while (var7-- > 0) { // L: 42
					int var9 = var1.method9341(); // L: 43
					var8.add(var9); // L: 44
				}

				var5.put(var6, var8); // L: 46
			}

			this.field5079.add(var3, var5); // L: 48
		}

	} // L: 50

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;IB)Ljava/util/List;",
		garbageValue = "40"
	)
	public List method9156(Object var1, int var2) {
		if (var2 < 0) { // L: 53
			var2 = 0;
		}

		Map var3 = (Map)this.field5079.get(var2); // L: 54
		return (List)var3.get(var1); // L: 55
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Lup;",
		garbageValue = "-1344314706"
	)
	public static IndexedSprite[] method9159() {
		IndexedSprite[] var0 = new IndexedSprite[class541.SpriteBuffer_spriteCount]; // L: 179

		for (int var1 = 0; var1 < class541.SpriteBuffer_spriteCount; ++var1) { // L: 180
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 181
			var2.width = class541.SpriteBuffer_spriteWidth; // L: 182
			var2.height = GrandExchangeOfferWorldComparator.SpriteBuffer_spriteHeight; // L: 183
			var2.xOffset = class541.SpriteBuffer_xOffsets[var1]; // L: 184
			var2.yOffset = class541.SpriteBuffer_yOffsets[var1]; // L: 185
			var2.subWidth = class541.SpriteBuffer_spriteWidths[var1]; // L: 186
			var2.subHeight = class520.SpriteBuffer_spriteHeights[var1]; // L: 187
			var2.palette = class541.SpriteBuffer_spritePalette; // L: 188
			var2.pixels = class396.SpriteBuffer_pixels[var1]; // L: 189
		}

		class458.method8401(); // L: 191
		return var0; // L: 192
	}
}
