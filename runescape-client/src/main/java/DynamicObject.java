import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2058281919
	)
	static int field998;
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field994;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1230540715
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1584482637
	)
	@Export("type")
	int type;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -60332413
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1063921529
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -110217485
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1921192251
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 60061939
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -543320113
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLkp;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = class9.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2246 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (var10.sequenceDefinition == this.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4106()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-714420560"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) { // L: 51
			int var1 = Client.cycle - this.cycleStart; // L: 52
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method4106(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label80: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label80;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame; // L: 57
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 58

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 60

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = class137.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}

		if (var12 == null) {
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var4][var7] + var8[var5][var6] + var8[var4][var6] + var8[var5][var7] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;I)V",
		garbageValue = "410657655"
	)
	public static void method2255(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		AbstractByteArrayCopier.field3856 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIZIB)J",
		garbageValue = "36"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 80
		if (var3) { // L: 81
			var5 |= 65536L;
		}

		return var5; // L: 82
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "2"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 202
		var1.offset = var0.length - 2; // L: 203
		class545.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 204
		class545.SpriteBuffer_xOffsets = new int[class545.SpriteBuffer_spriteCount]; // L: 205
		class388.SpriteBuffer_yOffsets = new int[class545.SpriteBuffer_spriteCount]; // L: 206
		FriendsList.SpriteBuffer_spriteWidths = new int[class545.SpriteBuffer_spriteCount]; // L: 207
		GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = new int[class545.SpriteBuffer_spriteCount]; // L: 208
		class230.SpriteBuffer_pixels = new byte[class545.SpriteBuffer_spriteCount][]; // L: 209
		var1.offset = var0.length - 7 - class545.SpriteBuffer_spriteCount * 8; // L: 210
		class545.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 211
		class545.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 212
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 213

		int var3;
		for (var3 = 0; var3 < class545.SpriteBuffer_spriteCount; ++var3) { // L: 214
			class545.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class545.SpriteBuffer_spriteCount; ++var3) { // L: 215
			class388.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class545.SpriteBuffer_spriteCount; ++var3) { // L: 216
			FriendsList.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class545.SpriteBuffer_spriteCount; ++var3) { // L: 217
			GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class545.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 218
		class113.SpriteBuffer_spritePalette = new int[var2]; // L: 219

		for (var3 = 1; var3 < var2; ++var3) { // L: 220
			class113.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 221
			if (class113.SpriteBuffer_spritePalette[var3] == 0) { // L: 222
				class113.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 224

		for (var3 = 0; var3 < class545.SpriteBuffer_spriteCount; ++var3) { // L: 225
			int var4 = FriendsList.SpriteBuffer_spriteWidths[var3]; // L: 226
			int var5 = GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights[var3]; // L: 227
			int var6 = var5 * var4; // L: 228
			byte[] var7 = new byte[var6]; // L: 229
			class230.SpriteBuffer_pixels[var3] = var7; // L: 230
			int var8 = var1.readUnsignedByte(); // L: 231
			int var9;
			if (var8 == 0) { // L: 232
				for (var9 = 0; var9 < var6; ++var9) { // L: 233
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 235
				for (var9 = 0; var9 < var4; ++var9) { // L: 236
					for (int var10 = 0; var10 < var5; ++var10) { // L: 237
						var7[var9 + var4 * var10] = var1.readByte(); // L: 238
					}
				}
			}
		}

	} // L: 243
}
