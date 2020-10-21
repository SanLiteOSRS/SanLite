import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Llv;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Ljs;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 921396255
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lkb;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lmh;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lks;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lgw;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 67173535
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("u")
	boolean field1340;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -330616605
	)
	int field1337;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -708203583
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgw;"
	)
	ServerPacket field1348;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lgw;"
	)
	ServerPacket field1339;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lgw;"
	)
	ServerPacket field1350;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1340 = true;
		this.field1337 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "702095612"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "73"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lgk;B)V",
		garbageValue = "29"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Llv;I)V",
		garbageValue = "-640227269"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1950086546"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1804593474"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(S)Llv;",
		garbageValue = "310"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "60"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = Occluder.method3413(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + class217.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + NetFileRequest.clientType + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)[Llu;",
		garbageValue = "987618759"
	)
	@Export("FillMode_values")
	public static class333[] FillMode_values() {
		return new class333[]{class333.SOLID, class333.field3894, class333.field3895};
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		signature = "(ZLks;I)V",
		garbageValue = "-232306457"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			var2 = var1.method5797();
			var3 = var1.method5797();
			int var4 = var1.readUnsignedShort();
			WorldMapEvent.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					WorldMapEvent.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class52.regions = new int[var4];
			class22.regionMapArchiveIds = new int[var4];
			WallDecoration.regionLandArchiveIds = new int[var4];
			GrandExchangeOffer.regionLandArchives = new byte[var4][];
			GameEngine.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
				var16 = true;
			}

			if (var2 / 8 == 48 && var3 / 8 == 148) {
				var16 = true;
			}

			var4 = 0;

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						class52.regions[var4] = var8;
						class22.regionMapArchiveIds[var4] = Varcs.archive5.getGroupId("m" + var6 + "_" + var7);
						WallDecoration.regionLandArchiveIds[var4] = Varcs.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			Projectile.method2223(var2, var3, true);
		} else {
			var2 = var1.method5659();
			var3 = var1.method5659();
			boolean var15 = var1.method5668() == 1;
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			WorldMapEvent.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					WorldMapEvent.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class52.regions = new int[var5];
			class22.regionMapArchiveIds = new int[var5];
			WallDecoration.regionLandArchiveIds = new int[var5];
			GrandExchangeOffer.regionLandArchives = new byte[var5][];
			GameEngine.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class52.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class52.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class22.regionMapArchiveIds[var5] = Varcs.archive5.getGroupId("m" + var13 + "_" + var14);
								WallDecoration.regionLandArchiveIds[var5] = Varcs.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			Projectile.method2223(var3, var2, !var15);
		}

	}
}
