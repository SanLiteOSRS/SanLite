import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -86185865
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1391149389
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 495226583
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1857189891
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -949232909
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -786465885
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 947228775
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1274435893
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 120528241
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1393218637
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -425948857
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1428979731
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -870860083
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -849374061
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "1844466074"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1135530948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) { // L: 34
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 37
		} else {
			return false; // L: 35
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1124460333"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 42
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "557011185"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Lmo;",
		garbageValue = "-1670709360"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-801073373"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	@Export("postRead")
	void postRead() {
	} // L: 85

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1252747607"
	)
	static void method5608() {
		class404.field4490 = null; // L: 1244
		ParamComposition.redHintArrowSprite = null; // L: 1245
		KitDefinition.mapSceneSprites = null; // L: 1246
		UserComparator4.field1452 = null; // L: 1247
		class157.field1730 = null; // L: 1248
		UserComparator8.field1457 = null; // L: 1249
		class47.field343 = null; // L: 1250
		EnumComposition.field2021 = null; // L: 1251
		class103.field1336 = null; // L: 1252
		class36.scrollBarSprites = null; // L: 1253
		class178.field1854 = null; // L: 1254
	} // L: 1255

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3233, Client.packetWriter.isaacCipher); // L: 12633
		var0.packetBuffer.writeByte(0); // L: 12634
		Client.packetWriter.addNode(var0); // L: 12635
	} // L: 12636
}
