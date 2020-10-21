import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class9 {
	@ObfuscatedName("f")
	ExecutorService field44;
	@ObfuscatedName("b")
	Future field41;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lkb;"
	)
	final Buffer field43;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ln;"
	)
	final class12 field40;

	@ObfuscatedSignature(
		signature = "(Lkb;Ln;)V"
	)
	public class9(Buffer var1, class12 var2) {
		this.field44 = Executors.newSingleThreadExecutor();
		this.field43 = var1;
		this.field40 = var2;
		this.method129();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "208933439"
	)
	public boolean method120() {
		return this.field41.isDone();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1441030159"
	)
	public void method121() {
		this.field44.shutdown();
		this.field44 = null;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)Lkb;",
		garbageValue = "590307722"
	)
	public Buffer method122() {
		try {
			return (Buffer)this.field41.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-2106026130"
	)
	void method129() {
		this.field41 = this.field44.submit(new class8(this, this.field43, this.field40));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(CB)Z",
		garbageValue = "-47"
	)
	static final boolean method124(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class3.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class349.field4075;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class349.field4073;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lks;IS)Z",
		garbageValue = "21881"
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
				Player var6 = Client.players[var1] = new Player();
				var6.index = var1;
				if (Players.field1284[var1] != null) {
					var6.read(Players.field1284[var1]);
				}

				var6.orientation = Players.Players_orientations[var1];
				var6.targetIndex = Players.Players_targetIndices[var1];
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var6.pathTraversed[0] = Players.field1295[var1];
				var6.plane = (byte)var8;
				var6.resetPath((var9 << 13) + var3 - FloorDecoration.baseX * 64, (var10 << 13) + var4 - WorldMapData_0.baseY * 64);
				var6.field664 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players.Players_regions[var1];
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
			return false;
		} else {
			int var5;
			int var11;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var11 = Players.Players_regions[var1];
				var7 = (var11 >> 28) + var4 & 3;
				var8 = var11 >> 14 & 255;
				var9 = var11 & 255;
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
				var11 = var3 & 255;
				var7 = Players.Players_regions[var1];
				var8 = (var7 >> 28) + var4 & 3;
				var9 = var5 + (var7 >> 14) & 255;
				var10 = var11 + var7 & 255;
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1826644624"
	)
	static void method132() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		signature = "(Lht;III)V",
		garbageValue = "549022721"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !MusicPatchNode.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
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
					int var10 = var5 * var8 - var7 * var4 >> 11;
					int var11 = var9 + PlayerType.localPlayer.x >> 7;
					int var12 = PlayerType.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = class4.getPacketBufferNode(ClientPacket.field2318, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.method5674(FloorDecoration.baseX * 64 + var11);
					var13.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0);
					var13.packetBuffer.method5672(WorldMapData_0.baseY * 64 + var12);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(PlayerType.localPlayer.x);
					var13.packetBuffer.writeShort(PlayerType.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
