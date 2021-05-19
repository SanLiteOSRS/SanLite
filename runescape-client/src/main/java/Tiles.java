import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("h")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("c")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 617721713
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("g")
	static byte[][][] field1097;
	@ObfuscatedName("z")
	static byte[][][] field1088;
	@ObfuscatedName("t")
	static byte[][][] field1086;
	@ObfuscatedName("v")
	static byte[][][] field1090;
	@ObfuscatedName("q")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("x")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("pcmPlayerProvider")
	static PlayerProvider pcmPlayerProvider;
	@ObfuscatedName("p")
	static int[][][] field1105;
	@ObfuscatedName("u")
	static final int[] field1085;
	@ObfuscatedName("m")
	static final int[] field1095;
	@ObfuscatedName("j")
	static final int[] field1096;
	@ObfuscatedName("f")
	static final int[] field1100;
	@ObfuscatedName("s")
	static final int[] field1098;
	@ObfuscatedName("y")
	static final int[] field1094;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -606383605
	)
	static int field1092;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 257499445
	)
	static int field1101;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field1085 = new int[]{1, 2, 4, 8};
		field1095 = new int[]{16, 32, 64, 128};
		field1096 = new int[]{1, 0, -1, 0};
		field1100 = new int[]{0, -1, 0, 1};
		field1098 = new int[]{1, -1, -1, 1};
		field1094 = new int[]{-1, -1, 1, 1};
		field1092 = (int)(Math.random() * 17.0D) - 8;
		field1101 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IS)Z",
		garbageValue = "12210"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2);
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0) {
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13);
			var4 = var0.readBits(13);
			boolean var12 = var0.readBits(1) == 1;
			if (var12) {
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var11 = Client.players[var1] = new Player();
				var11.index = var1;
				if (Players.field1346[var1] != null) {
					var11.read(Players.field1346[var1]);
				}

				var11.orientation = Players.Players_orientations[var1];
				var11.targetIndex = Players.Players_targetIndices[var1];
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = Players.field1345[var1];
				var11.plane = (byte)var8;
				var11.resetPath((var9 << 13) + var3 - JagexCache.baseX * 64, (var10 << 13) + var4 - Messages.baseY * 64);
				var11.field1186 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players.Players_regions[var1];
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
			return false;
		} else {
			int var5;
			int var6;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var6 = Players.Players_regions[var1];
				var7 = (var6 >> 28) + var4 & 3;
				var8 = var6 >> 14 & 255;
				var9 = var6 & 255;
				if (var5 == 0) {
					--var8;
					--var9;
				}

				if (var5 == 1) {
					--var9;
				}

				if (var5 == 2) {
					++var8;
					--var9;
				}

				if (var5 == 3) {
					--var8;
				}

				if (var5 == 4) {
					++var8;
				}

				if (var5 == 5) {
					--var8;
					++var9;
				}

				if (var5 == 6) {
					++var9;
				}

				if (var5 == 7) {
					++var8;
					++var9;
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
				return false;
			} else {
				var3 = var0.readBits(18);
				var4 = var3 >> 16;
				var5 = var3 >> 8 & 255;
				var6 = var3 & 255;
				var7 = Players.Players_regions[var1];
				var8 = (var7 >> 28) + var4 & 3;
				var9 = var5 + (var7 >> 14) & 255;
				var10 = var6 + var7 & 255;
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			}
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "2232"
	)
	static final void method2046() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var0.plane == ParamComposition.Client_plane && !var0.isFinished) {
				if (Client.cycle >= var0.cycleStart) {
					var0.advance(Client.field768);
					if (var0.isFinished) {
						var0.remove();
					} else {
						class5.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false);
					}
				}
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1790483961"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2658, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
