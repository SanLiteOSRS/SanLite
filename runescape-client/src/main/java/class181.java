import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class181 extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1417199785
	)
	static int field1987;

	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Llu;IIIBZI)V",
		garbageValue = "656217552"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 101
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 102
		if (var8 == null) { // L: 103
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 104
			if (var8 == null) { // L: 105
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 106
				if (var8 != null) { // L: 107
					if (var5) { // L: 108
						var8.removeDual(); // L: 109
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 110
						--NetCache.NetCache_pendingWritesCount; // L: 111
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 112
					}

				} else {
					if (!var5) { // L: 116
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 117
						if (var8 != null) { // L: 118
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 120
					var8.archive = var0; // L: 121
					var8.crc = var3; // L: 122
					var8.padding = var4; // L: 123
					if (var5) { // L: 124
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 125
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 126
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 129
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 130
						++NetCache.NetCache_pendingWritesCount; // L: 131
					}

				}
			}
		}
	} // L: 114 133

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1007127385"
	)
	static final void method3547() {
		PacketBufferNode var0 = class433.getPacketBufferNode(ClientPacket.field2958, Client.packetWriter.isaacCipher); // L: 11967
		Client.packetWriter.addNode(var0); // L: 11968
		Interpreter.field840 = true; // L: 11969

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11970
			if (var1.type == 0 || var1.type == 3) { // L: 11971
				Canvas.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11973
			class220.invalidateWidget(Client.meslayerContinueWidget); // L: 11974
			Client.meslayerContinueWidget = null; // L: 11975
		}

		Interpreter.field840 = false; // L: 11977
	} // L: 11978
}
