import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1201238509
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1333374059
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1475797575
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 905621997
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1367224805
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -359238835
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 994649457
	)
	int field224;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -287102607
	)
	int field223;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -64559715
	)
	int field228;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1728764959
	)
	int field225;

	WorldMapSection2() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lar;B)V",
		garbageValue = "100"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field224) {
			var1.regionLowX = this.field224;
		}

		if (var1.regionHighX < this.field228) {
			var1.regionHighX = this.field228;
		}

		if (var1.regionLowY > this.field223) {
			var1.regionLowY = this.field223;
		}

		if (var1.regionHighY < this.field225) {
			var1.regionHighY = this.field225;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IIII)Z",
		garbageValue = "-339896458"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-2135820245"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field224 && var1 >> 6 <= this.field228 && var2 >> 6 >= this.field223 && var2 >> 6 <= this.field225;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "-1761492451"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field224 * 64 - this.regionStartX * 64 + var2, var3 + (this.field223 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "(III)Lhg;",
		garbageValue = "-1553504587"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field224 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field223 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkf;I)V",
		garbageValue = "2144381737"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field224 = var1.readUnsignedShort();
		this.field223 = var1.readUnsignedShort();
		this.field228 = var1.readUnsignedShort();
		this.field225 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "240000675"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IB)Lbk;",
		garbageValue = "1"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "835345001"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			Tile.clientPreferences.roofsHidden = !Tile.clientPreferences.roofsHidden;
			WorldMapData_1.savePreferences();
			if (Tile.clientPreferences.roofsHidden) {
				WorldMapRectangle.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				WorldMapRectangle.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				Message.worldMap.showCoord = !Message.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.displayFps = false;
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				ArchiveLoader.method1208();
			}
		}

		PacketBufferNode var1 = Client.getPacketBufferNode(ClientPacket.field2296, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
