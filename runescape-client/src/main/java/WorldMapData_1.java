import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -624362671
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2082539499
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2054670475
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1388655107
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "1149185778"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field2108.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 4096;
			this.chunkXLow = var1.readUnsignedByte();
			this.chunkYLow = var1.readUnsignedByte();
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			this.chunkX = var1.readUnsignedByte();
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method6630();
			super.fileId = var1.method6630();
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1563875465"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field2068 = new byte[super.planes][64][64];
		super.field2074 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class180.field2103.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			int var5 = var1.readUnsignedByte();
			int var6 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) {
				for (int var7 = 0; var7 < 8; ++var7) {
					for (int var8 = 0; var8 < 8; ++var8) {
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "24313"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1571205738"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-115"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-29"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY;
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) {
			return false;
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1;
			if (var2.regionX == super.regionX && super.regionY == var2.regionY) {
				return this.chunkX == var2.chunkX && this.chunkY == var2.chunkY;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lhg;",
		garbageValue = "1853252899"
	)
	public static PacketBufferNode method3583() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lhj;",
		garbageValue = "1"
	)
	public static class226[] method3582() {
		return new class226[]{class226.field2688, class226.field2683, class226.field2684, class226.field2692, class226.field2693, class226.field2687, class226.field2686, class226.field2689, class226.field2690, class226.field2691};
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Liv;",
		garbageValue = "1896933792"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var1] == null || GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = class20.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var1][var2];
	}
}
