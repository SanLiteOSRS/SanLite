import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1204437349
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -525287981
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1717389517"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lfd;",
		garbageValue = "1736510941"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-401407374"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "370652147"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "53"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-88"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = Archive.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 < this.screenX || var1 >= var4 + this.screenX) {
					return false;
				}
				break;
			case 1:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 >= this.screenY && var2 < var5 + this.screenY) {
					break;
				}

				return false;
			case 2:
				if (var2 <= this.screenY - var5 || var2 > this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-663056522"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= this.screenY + var3.height;
		} else {
			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-860022326"
	)
	public static int method3787(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1784757970"
	)
	public static int method3785(int var0, int var1, int var2) {
		int var3 = UserComparator2.method6890(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(Liv;III)V",
		garbageValue = "605397793"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var5 * var7 + var4 * var8 >> 11;
					int var10 = var5 * var8 - var4 * var7 >> 11;
					int var11 = var9 + class262.localPlayer.x >> 7;
					int var12 = class262.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = InterfaceParent.getPacketBufferNode(ClientPacket.field2615, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShort(WorldMapSprite.baseY * 64 + var12);
					var13.packetBuffer.method6639(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.method6649(class15.baseX * 64 + var11);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class262.localPlayer.x);
					var13.packetBuffer.writeShort(class262.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
