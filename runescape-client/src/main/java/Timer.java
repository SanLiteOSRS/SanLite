import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("vx")
	static Iterator field4460;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 617951219101868201L
	)
	long field4458;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = -7191502108870423843L
	)
	long field4456;
	@ObfuscatedName("v")
	public boolean field4452;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 9077131697962765351L
	)
	long field4450;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -4812176588802340469L
	)
	long field4454;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 4276904843029533051L
	)
	long field4455;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1102349833
	)
	int field4453;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 887946609
	)
	int field4457;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1762076025
	)
	int field4451;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1226330179
	)
	int field4459;

	public Timer() {
		this.field4458 = -1L; // L: 7
		this.field4456 = -1L; // L: 8
		this.field4452 = false; // L: 9
		this.field4450 = 0L; // L: 10
		this.field4454 = 0L; // L: 11
		this.field4455 = 0L; // L: 12
		this.field4453 = 0; // L: 13
		this.field4457 = 0; // L: 14
		this.field4451 = 0; // L: 15
		this.field4459 = 0; // L: 16
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-26308"
	)
	public void method7352() {
		this.field4458 = Message.method1197(); // L: 19
	} // L: 20

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	public void method7330() {
		if (-1L != this.field4458) { // L: 23
			this.field4454 = Message.method1197() - this.field4458; // L: 24
			this.field4458 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	public void method7331(int var1) {
		this.field4456 = Message.method1197(); // L: 30
		this.field4453 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1829013009"
	)
	public void method7332() {
		if (this.field4456 != -1L) { // L: 35
			this.field4450 = Message.method1197() - this.field4456; // L: 36
			this.field4456 = -1L; // L: 37
		}

		++this.field4451; // L: 39
		this.field4452 = true; // L: 40
	} // L: 41

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-223931045"
	)
	public void method7333() {
		this.field4452 = false; // L: 44
		this.field4457 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-420900063"
	)
	public void method7328() {
		this.method7332();
	} // L: 50

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "-113"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4454; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4450; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4455; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4453); // L: 74
		var1.writeShort(this.field4457);
		var1.writeShort(this.field4451);
		var1.writeShort(this.field4459); // L: 77
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lly;III)Lnv;",
		garbageValue = "1891121533"
	)
	public static Font method7358(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3); // L: 70
		boolean var4;
		if (var5 == null) { // L: 71
			var4 = false; // L: 72
		} else {
			VarpDefinition.SpriteBuffer_decode(var5); // L: 75
			var4 = true; // L: 76
		}

		if (!var4) { // L: 78
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3); // L: 80
			Font var8;
			if (var6 == null) { // L: 82
				var8 = null; // L: 83
			} else {
				Font var7 = new Font(var6, class481.SpriteBuffer_xOffsets, class414.SpriteBuffer_yOffsets, class11.SpriteBuffer_spriteWidths, StructComposition.SpriteBuffer_spriteHeights, WorldMapEvent.SpriteBuffer_spritePalette, GroundObject.SpriteBuffer_pixels); // L: 86
				class481.SpriteBuffer_xOffsets = null; // L: 88
				class414.SpriteBuffer_yOffsets = null; // L: 89
				class11.SpriteBuffer_spriteWidths = null; // L: 90
				StructComposition.SpriteBuffer_spriteHeights = null; // L: 91
				WorldMapEvent.SpriteBuffer_spritePalette = null; // L: 92
				GroundObject.SpriteBuffer_pixels = null; // L: 93
				var8 = var7; // L: 95
			}

			return var8; // L: 97
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BIIS)I",
		garbageValue = "-5416"
	)
	static int method7357(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}
}
