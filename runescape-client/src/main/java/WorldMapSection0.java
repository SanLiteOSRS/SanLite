import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -460217413
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1822190497
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1271040555
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -851847639
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1760661357
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1186696643
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -748324835
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1065060381
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2106037831
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1336518611
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1700842473
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -136321497
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1135007501
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -342787319
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-16711936"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 26
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX; // L: 27
		}

		if (var1.regionLowY > this.newY) { // L: 28
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 29
			var1.regionHighY = this.newY;
		}

	} // L: 30

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1346270005"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) { // L: 34
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 37
		} else {
			return false; // L: 35
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "744535271"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 42
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1550524003"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 47
			return null; // L: 48
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 50 51 52
			return var4; // L: 53
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lnn;",
		garbageValue = "-67"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 58
			return null; // L: 59
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 61
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 62
			return new Coord(this.oldZ, var3, var4); // L: 63
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1013392578"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 68
		this.newZ = var1.readUnsignedByte(); // L: 69
		this.oldX = var1.readUnsignedShort(); // L: 70
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 71
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.oldY = var1.readUnsignedShort(); // L: 73
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 74
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.newX = var1.readUnsignedShort(); // L: 76
		this.newChunkXLow = var1.readUnsignedByte(); // L: 77
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 78
		this.newY = var1.readUnsignedShort(); // L: 79
		this.newChunkYLow = var1.readUnsignedByte(); // L: 80
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 81
		this.postRead(); // L: 82
	} // L: 83

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "924060716"
	)
	@Export("postRead")
	void postRead() {
	} // L: 85

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lmh;",
		garbageValue = "-886828409"
	)
	static PacketBufferNode method5639() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}
}
