import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 576812215
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1229428145
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1150264437
	)
	@Export("count")
	int count;
	@ObfuscatedName("o")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("g")
	@Export("labels")
	int[][] labels;

	Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1656377758"
	)
	static void method3899(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, ModeWhere.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != class35.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2571, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6483(var3[var6]);
					var8.packetBuffer.method6610(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2565, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6483(var3[var6]);
					var8.packetBuffer.method6610(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2600, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6449(0);
					var8.packetBuffer.method6484(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2613, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByte(0);
					var8.packetBuffer.method6484(var3[var6]);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			WorldMapScaleHandler.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
