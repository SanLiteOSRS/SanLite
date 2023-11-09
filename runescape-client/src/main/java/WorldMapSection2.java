import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = 1383695695
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(
		intValue = -1433834637
	)
	static int field2691;
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "[Lqj;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1622796575
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -237991141
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 439211747
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 524831955
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1059862557
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 769010907
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1154211551
	)
	int field2681;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 415204313
	)
	int field2688;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1371216217
	)
	int field2689;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 12571677
	)
	int field2690;

	WorldMapSection2() {
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lhw;B)V",
		garbageValue = "11"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2681) { // L: 22
			var1.regionLowX = this.field2681;
		}

		if (var1.regionHighX < this.field2689) {
			var1.regionHighX = this.field2689; // L: 23
		}

		if (var1.regionLowY > this.field2688) { // L: 24
			var1.regionLowY = this.field2688;
		}

		if (var1.regionHighY < this.field2690) { // L: 25
			var1.regionHighY = this.field2690;
		}

	} // L: 26

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1974716574"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 30
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "819062651"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2681 && var1 >> 6 <= this.field2689 && var2 >> 6 >= this.field2688 && var2 >> 6 <= this.field2690; // L: 38
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "24"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2681 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2688 * 64 - this.regionStartY * 64)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Lkp;",
		garbageValue = "-711503187"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.regionStartX * 64 - this.field2681 * 64 + var1; // L: 57
			int var4 = this.regionStartY * 64 - this.field2688 * 64 + var2; // L: 58
			return new Coord(this.minPlane, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqw;B)V",
		garbageValue = "84"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte(); // L: 64
		this.planes = var1.readUnsignedByte(); // L: 65
		this.regionStartX = var1.readUnsignedShort(); // L: 66
		this.regionStartY = var1.readUnsignedShort(); // L: 67
		this.regionEndX = var1.readUnsignedShort(); // L: 68
		this.regionEndY = var1.readUnsignedShort(); // L: 69
		this.field2681 = var1.readUnsignedShort(); // L: 70
		this.field2688 = var1.readUnsignedShort(); // L: 71
		this.field2689 = var1.readUnsignedShort(); // L: 72
		this.field2690 = var1.readUnsignedShort(); // L: 73
		this.postRead(); // L: 74
	} // L: 75

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("postRead")
	void postRead() {
	} // L: 77

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1225163550"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class433.getPacketBufferNode(ClientPacket.field2943, Client.packetWriter.isaacCipher); // L: 9457
		var2.packetBuffer.writeIntME(var1); // L: 9458
		var2.packetBuffer.writeInt(var0); // L: 9459
		Client.packetWriter.addNode(var2); // L: 9460
	} // L: 9461

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(IIIILqj;Lkr;I)V",
		garbageValue = "2057360815"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2; // L: 12130
		if (var6 > 4225 && var6 < 90000) { // L: 12131
			int var7 = Client.camAngleY & 2047; // L: 12132
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 12133
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 12134
			int var10 = var9 * var2 + var3 * var8 >> 16; // L: 12135
			int var11 = var3 * var9 - var8 * var2 >> 16; // L: 12136
			double var12 = Math.atan2((double)var10, (double)var11); // L: 12137
			int var14 = var5.width / 2 - 25; // L: 12138
			int var15 = (int)(Math.sin(var12) * (double)var14); // L: 12139
			int var16 = (int)(Math.cos(var12) * (double)var14); // L: 12140
			byte var17 = 20; // L: 12141
			LoginPacket.redHintArrowSprite.method8198(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256); // L: 12142
		} else {
			Canvas.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5); // L: 12144
		}

	} // L: 12145
}
