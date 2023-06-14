import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2143916315"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-752004447"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqz;ZB)V",
		garbageValue = "-102"
	)
	public static void method6553(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) { // L: 44
			try {
				NetCache.NetCache_socket.close(); // L: 46
			} catch (Exception var8) { // L: 48
			}

			NetCache.NetCache_socket = null; // L: 49
		}

		NetCache.NetCache_socket = var0; // L: 51
		Buffer var2;
		if (NetCache.NetCache_socket != null) { // L: 53
			try {
				var2 = new Buffer(4); // L: 55
				var2.writeByte(var1 ? 2 : 3); // L: 56
				var2.writeMedium(0); // L: 57
				NetCache.NetCache_socket.write(var2.array, 0, 4); // L: 58
			} catch (IOException var7) {
				try {
					NetCache.NetCache_socket.close(); // L: 62
				} catch (Exception var6) { // L: 64
				}

				++NetCache.NetCache_ioExceptions; // L: 65
				NetCache.NetCache_socket = null; // L: 66
			}
		}

		NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 69
		ApproximateRouteStrategy.NetCache_currentResponse = null; // L: 70
		ModeWhere.NetCache_responseArchiveBuffer = null; // L: 71
		NetCache.field4278 = 0; // L: 72

		while (true) {
			NetFileRequest var9 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 74
			if (var9 == null) { // L: 75
				while (true) {
					var9 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 81
					if (var9 == null) { // L: 82
						if (NetCache.field4282 != 0) { // L: 88
							try {
								var2 = new Buffer(4); // L: 90
								var2.writeByte(4); // L: 91
								var2.writeByte(NetCache.field4282); // L: 92
								var2.writeShort(0); // L: 93
								NetCache.NetCache_socket.write(var2.array, 0, 4); // L: 94
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close(); // L: 98
								} catch (Exception var4) { // L: 100
								}

								++NetCache.NetCache_ioExceptions; // L: 101
								NetCache.NetCache_socket = null; // L: 102
							}
						}

						NetCache.NetCache_loadTime = 0; // L: 105
						class19.field100 = WallObject.method5027(); // L: 106
						return; // L: 107
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var9); // L: 83
					NetCache.NetCache_pendingWrites.put(var9, var9.key); // L: 84
					++NetCache.NetCache_pendingWritesCount; // L: 85
					--NetCache.NetCache_pendingResponsesCount; // L: 86
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var9, var9.key); // L: 76
			++NetCache.NetCache_pendingPriorityWritesCount; // L: 77
			--NetCache.NetCache_pendingPriorityResponsesCount; // L: 78
		}
	}
}
