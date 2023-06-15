import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1535455127
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1573977337
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -434593771
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 102827573
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1777965878"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "773996379"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "84"
	)
	public boolean method8029(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.highY + this.lowY; // L: 29
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqs;Lqs;I)V",
		garbageValue = "999176632"
	)
	public void method8031(Bounds var1, Bounds var2) {
		this.method8032(var1, var2); // L: 37
		this.method8033(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqs;Lqs;I)V",
		garbageValue = "-1949887580"
	)
	void method8032(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method8037() > var1.method8037()) { // L: 48
			var2.highX -= var2.method8037() - var1.method8037(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqs;Lqs;B)V",
		garbageValue = "-34"
	)
	void method8033(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method8035() > var1.method8035()) { // L: 61
			var2.highY -= var2.method8035() - var1.method8035(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "533041581"
	)
	int method8037() {
		return this.lowX + this.highX; // L: 68
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "960024041"
	)
	int method8035() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhd;",
		garbageValue = "-1537173652"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 74
			var1 = new NPCComposition(); // L: 75
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 78
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1; // L: 80
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;III)Lph;",
		garbageValue = "1029940745"
	)
	public static Font method8030(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3); // L: 71
		boolean var4;
		if (var5 == null) { // L: 72
			var4 = false; // L: 73
		} else {
			UserComparator2.SpriteBuffer_decode(var5); // L: 76
			var4 = true; // L: 77
		}

		if (!var4) { // L: 79
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3); // L: 81
			Font var8;
			if (var6 == null) { // L: 83
				var8 = null; // L: 84
			} else {
				Font var7 = new Font(var6, class515.SpriteBuffer_xOffsets, class402.SpriteBuffer_yOffsets, class515.SpriteBuffer_spriteWidths, class515.SpriteBuffer_spriteHeights, class515.SpriteBuffer_spritePalette, class515.SpriteBuffer_pixels); // L: 87
				TextureProvider.method4758(); // L: 88
				var8 = var7; // L: 89
			}

			return var8; // L: 91
		}
	}
}
