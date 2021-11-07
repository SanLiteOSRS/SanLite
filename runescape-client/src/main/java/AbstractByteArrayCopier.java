import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "99"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-48"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IIIBZS)V",
		garbageValue = "-20064"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2);
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6);
		if (var8 == null) {
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6);
			if (var8 == null) {
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6);
				if (var8 != null) {
					if (var5) {
						var8.removeDual();
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingPriorityWritesCount;
					}

				} else {
					if (!var5) {
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6);
						if (var8 != null) {
							return;
						}
					}

					var8 = new NetFileRequest();
					var8.archive = var0;
					var8.crc = var3;
					var8.padding = var4;
					if (var5) {
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						++NetCache.NetCache_pendingPriorityWritesCount;
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8);
						NetCache.NetCache_pendingWrites.put(var8, var6);
						++NetCache.NetCache_pendingWritesCount;
					}

				}
			}
		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "1"
	)
	static void method5169(int var0, String var1) {
		int var2 = Players.Players_count;
		int[] var3 = Players.Players_indices;
		boolean var4 = false;
		Username var5 = new Username(var1, GrandExchangeOfferUnitPriceComparator.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = Client.players[var3[var6]];
			if (var7 != null && var7 != HealthBarDefinition.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2733, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.writeByte(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2769, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method6962(var3[var6]);
					var8.packetBuffer.method7171(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2714, Client.packetWriter.isaacCipher);
					var8.packetBuffer.method7001(var3[var6]);
					var8.packetBuffer.method6993(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2673, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.method7171(0);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			class397.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
