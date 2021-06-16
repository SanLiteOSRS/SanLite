import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = -431438208
	)
	static int field2029;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	static ClanChannel field2031;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1437380799
	)
	@Export("element")
	final int element;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1704027019
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 96075769
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;ILfd;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = Archive.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1717389517"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lfd;",
		garbageValue = "1736510941"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-401407374"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lhs;",
		garbageValue = "0"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2752, ServerPacket.field2704, ServerPacket.field2705, ServerPacket.field2706, ServerPacket.field2707, ServerPacket.field2708, ServerPacket.field2709, ServerPacket.field2746, ServerPacket.field2711, ServerPacket.field2728, ServerPacket.field2713, ServerPacket.field2714, ServerPacket.field2715, ServerPacket.field2716, ServerPacket.field2721, ServerPacket.field2718, ServerPacket.field2719, ServerPacket.field2778, ServerPacket.field2765, ServerPacket.field2722, ServerPacket.field2720, ServerPacket.field2724, ServerPacket.field2725, ServerPacket.field2726, ServerPacket.field2712, ServerPacket.field2753, ServerPacket.field2732, ServerPacket.field2773, ServerPacket.field2731, ServerPacket.field2798, ServerPacket.field2733, ServerPacket.field2734, ServerPacket.field2735, ServerPacket.field2717, ServerPacket.field2737, ServerPacket.field2738, ServerPacket.field2739, ServerPacket.field2740, ServerPacket.field2741, ServerPacket.field2742, ServerPacket.field2743, ServerPacket.field2744, ServerPacket.field2710, ServerPacket.field2793, ServerPacket.field2747, ServerPacket.field2723, ServerPacket.field2749, ServerPacket.field2748, ServerPacket.field2751, ServerPacket.field2727, ServerPacket.field2736, ServerPacket.field2754, ServerPacket.field2755, ServerPacket.field2703, ServerPacket.field2757, ServerPacket.field2758, ServerPacket.field2799, ServerPacket.field2760, ServerPacket.field2761, ServerPacket.field2762, ServerPacket.field2763, ServerPacket.field2764, ServerPacket.field2794, ServerPacket.field2766, ServerPacket.field2767, ServerPacket.field2768, ServerPacket.field2769, ServerPacket.field2770, ServerPacket.field2771, ServerPacket.field2772, ServerPacket.field2759, ServerPacket.field2774, ServerPacket.field2775, ServerPacket.field2776, ServerPacket.field2777, ServerPacket.field2780, ServerPacket.field2779, ServerPacket.field2730, ServerPacket.field2781, ServerPacket.field2750, ServerPacket.field2782, ServerPacket.field2784, ServerPacket.field2785, ServerPacket.field2786, ServerPacket.field2729, ServerPacket.field2792, ServerPacket.field2789, ServerPacket.field2790, ServerPacket.field2783, ServerPacket.field2791, ServerPacket.field2745, ServerPacket.field2756, ServerPacket.field2795, ServerPacket.field2796, ServerPacket.field2797};
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V",
		garbageValue = "-23293"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = DevicePcmPlayerProvider.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (0L != var5) {
			var7 = DevicePcmPlayerProvider.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			boolean var11 = var5 != 0L && !class24.method329(var5);
			if (var11) {
				var10 = var4;
			}

			int[] var12 = class69.sceneMinimapSprite.pixels;
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = Message.Entity_unpackID(var5);
			ObjectComposition var15 = Tiles.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = FloorDecoration.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var17 + var1 * 4 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var12[var13] = var10;
						var12[var13 + 512] = var10;
						var12[var13 + 1024] = var10;
						var12[var13 + 1536] = var10;
					} else if (var8 == 1) {
						var12[var13] = var10;
						var12[var13 + 1] = var10;
						var12[var13 + 2] = var10;
						var12[var13 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 3] = var10;
						var12[var13 + 512 + 3] = var10;
						var12[var13 + 1024 + 3] = var10;
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var12[var13 + 1536] = var10;
						var12[var13 + 1536 + 1] = var10;
						var12[var13 + 1536 + 2] = var10;
						var12[var13 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var12[var13] = var10;
					} else if (var8 == 1) {
						var12[var13 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var12[var13] = var10;
						var12[var13 + 512] = var10;
						var12[var13 + 1024] = var10;
						var12[var13 + 1536] = var10;
					} else if (var8 == 0) {
						var12[var13] = var10;
						var12[var13 + 1] = var10;
						var12[var13 + 2] = var10;
						var12[var13 + 3] = var10;
					} else if (var8 == 1) {
						var12[var13 + 3] = var10;
						var12[var13 + 512 + 3] = var10;
						var12[var13 + 1024 + 3] = var10;
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var12[var13 + 1536] = var10;
						var12[var13 + 1536 + 1] = var10;
						var12[var13 + 1536 + 2] = var10;
						var12[var13 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = DevicePcmPlayerProvider.scene.getGameObjectTag(var0, var1, var2);
		if (0L != var5) {
			var7 = DevicePcmPlayerProvider.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = Message.Entity_unpackID(var5);
			ObjectComposition var19 = Tiles.getObjectDefinition(var10);
			if (var19.mapSceneId != -1) {
				IndexedSprite var26 = FloorDecoration.mapSceneSprites[var19.mapSceneId];
				if (var26 != null) {
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2;
					var14 = (var19.sizeY * 4 - var26.subHeight) / 2;
					var26.drawAt(var13 + var1 * 4 + 48, var14 + (104 - var2 - var19.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				int var20 = 15658734;
				boolean var27 = 0L != var5 && !class24.method329(var5);
				if (var27) {
					var20 = 15597568;
				}

				int[] var21 = class69.sceneMinimapSprite.pixels;
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var21[var22] = var20;
					var21[var22 + 1 + 512] = var20;
					var21[var22 + 1024 + 2] = var20;
					var21[var22 + 1536 + 3] = var20;
				} else {
					var21[var22 + 1536] = var20;
					var21[var22 + 1 + 1024] = var20;
					var21[var22 + 512 + 2] = var20;
					var21[var22 + 3] = var20;
				}
			}
		}

		var5 = DevicePcmPlayerProvider.scene.getFloorDecorationTag(var0, var1, var2);
		if (0L != var5) {
			var7 = Message.Entity_unpackID(var5);
			ObjectComposition var23 = Tiles.getObjectDefinition(var7);
			if (var23.mapSceneId != -1) {
				IndexedSprite var24 = FloorDecoration.mapSceneSprites[var23.mapSceneId];
				if (var24 != null) {
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2;
					int var25 = (var23.sizeY * 4 - var24.subHeight) / 2;
					var24.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var23.sizeY) * 4 + var25 + 48);
				}
			}
		}

	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "360913539"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = InterfaceParent.getPacketBufferNode(ClientPacket.field2667, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
