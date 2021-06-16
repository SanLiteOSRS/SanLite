import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1361865131
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1864154747
	)
	@Export("x")
	public int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 807727247
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Liw;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-688819696"
	)
	@Export("packed")
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Liw;I)Z",
		garbageValue = "-1923777206"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-23"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public int hashCode() {
		return this.packed();
	}

	public String toString() {
		return this.toString(",");
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1693981343"
	)
	static final void method4790() {
		int var0 = SoundCache.field448 * 128 + 64;
		int var1 = AttackOption.field1351 * 16384 + 64;
		int var2 = ItemContainer.getTileHeight(var0, var1, SoundSystem.Client_plane) - Client.field659;
		if (ObjectSound.cameraX < var0) {
			ObjectSound.cameraX = (var0 - ObjectSound.cameraX) * FloorUnderlayDefinition.field1707 / 1000 + ObjectSound.cameraX + Message.field602;
			if (ObjectSound.cameraX > var0) {
				ObjectSound.cameraX = var0;
			}
		}

		if (ObjectSound.cameraX > var0) {
			ObjectSound.cameraX -= FloorUnderlayDefinition.field1707 * (ObjectSound.cameraX - var0) / 1000 + Message.field602;
			if (ObjectSound.cameraX < var0) {
				ObjectSound.cameraX = var0;
			}
		}

		if (class160.cameraY < var2) {
			class160.cameraY = (var2 - class160.cameraY) * FloorUnderlayDefinition.field1707 / 1000 + class160.cameraY + Message.field602;
			if (class160.cameraY > var2) {
				class160.cameraY = var2;
			}
		}

		if (class160.cameraY > var2) {
			class160.cameraY -= FloorUnderlayDefinition.field1707 * (class160.cameraY - var2) / 1000 + Message.field602;
			if (class160.cameraY < var2) {
				class160.cameraY = var2;
			}
		}

		if (Canvas.cameraZ < var1) {
			Canvas.cameraZ = (var1 - Canvas.cameraZ) * FloorUnderlayDefinition.field1707 / 1000 + Canvas.cameraZ + Message.field602;
			if (Canvas.cameraZ > var1) {
				Canvas.cameraZ = var1;
			}
		}

		if (Canvas.cameraZ > var1) {
			Canvas.cameraZ -= FloorUnderlayDefinition.field1707 * (Canvas.cameraZ - var1) / 1000 + Message.field602;
			if (Canvas.cameraZ < var1) {
				Canvas.cameraZ = var1;
			}
		}

		var0 = WorldMapIcon_0.field2029 * 16384 + 64;
		var1 = class44.field315 * 128 + 64;
		var2 = ItemContainer.getTileHeight(var0, var1, SoundSystem.Client_plane) - FriendsChatManager.field3815;
		int var3 = var0 - ObjectSound.cameraX;
		int var4 = var2 - class160.cameraY;
		int var5 = var1 - Canvas.cameraZ;
		int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3));
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047;
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047;
		if (var7 < 128) {
			var7 = 128;
		}

		if (var7 > 383) {
			var7 = 383;
		}

		if (class69.cameraPitch < var7) {
			class69.cameraPitch = (var7 - class69.cameraPitch) * class20.field166 / 1000 + class69.cameraPitch + GrandExchangeOfferOwnWorldComparator.field607;
			if (class69.cameraPitch > var7) {
				class69.cameraPitch = var7;
			}
		}

		if (class69.cameraPitch > var7) {
			class69.cameraPitch -= class20.field166 * (class69.cameraPitch - var7) / 1000 + GrandExchangeOfferOwnWorldComparator.field607;
			if (class69.cameraPitch < var7) {
				class69.cameraPitch = var7;
			}
		}

		int var9 = var8 - class32.cameraYaw;
		if (var9 > 1024) {
			var9 -= 2048;
		}

		if (var9 < -1024) {
			var9 += 2048;
		}

		if (var9 > 0) {
			class32.cameraYaw = class32.cameraYaw + GrandExchangeOfferOwnWorldComparator.field607 + var9 * class20.field166 / 1000;
			class32.cameraYaw &= 2047;
		}

		if (var9 < 0) {
			class32.cameraYaw -= -var9 * class20.field166 / 1000 + GrandExchangeOfferOwnWorldComparator.field607;
			class32.cameraYaw &= 2047;
		}

		int var10 = var8 - class32.cameraYaw;
		if (var10 > 1024) {
			var10 -= 2048;
		}

		if (var10 < -1024) {
			var10 += 2048;
		}

		if (var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) {
			class32.cameraYaw = var8;
		}

	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "57209027"
	)
	static final void method4801() {
		Client.field817 = Client.cycleCntr;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1607735940"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = InterfaceParent.getPacketBufferNode(ClientPacket.field2667, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
