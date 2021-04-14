import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lmg;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		signature = "[Loh;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("o")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("u")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "([BIIB)Z",
		garbageValue = "-116"
	)
	static final boolean method2092(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label72:
		while (true) {
			int var6 = var4.method6595();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label72;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = class19.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field657;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "87"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class23.logOut();
		switch(var0) {
		case 1:
			Login.loginIndex = 24;
			class9.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			class10.method129();
		}

	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-217021781"
	)
	static void method2093() {
		PacketBufferNode var0 = ObjectComposition.getPacketBufferNode(ClientPacket.field2294, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(WorldMapScaleHandler.getWindowedMode());
		var0.packetBuffer.writeShort(InterfaceParent.canvasWidth);
		var0.packetBuffer.writeShort(GameEngine.canvasHeight);
		Client.packetWriter.addNode(var0);
	}
}
