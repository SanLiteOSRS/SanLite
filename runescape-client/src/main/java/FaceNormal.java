import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1370299305
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 937419017
	)
	@Export("y")
	int y;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1295456613
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llc;ZI)V",
		garbageValue = "273969388"
	)
	public static void method4081(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) {
			try {
				NetCache.NetCache_socket.close();
			} catch (Exception var8) {
			}

			NetCache.NetCache_socket = null;
		}

		NetCache.NetCache_socket = var0;
		Buffer var2;
		if (NetCache.NetCache_socket != null) {
			try {
				var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				NetCache.NetCache_socket.write(var2.array, 0, 4);
			} catch (IOException var7) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var6) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}
		}

		NetCache.NetCache_responseHeaderBuffer.offset = 0;
		class7.NetCache_currentResponse = null;
		NetCache.NetCache_responseArchiveBuffer = null;
		NetCache.field3626 = 0;

		while (true) {
			NetFileRequest var9 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
			if (var9 == null) {
				while (true) {
					var9 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
					if (var9 == null) {
						if (NetCache.field3629 != 0) {
							try {
								var2 = new Buffer(4);
								var2.writeByte(4);
								var2.writeByte(NetCache.field3629);
								var2.writeShort(0);
								NetCache.NetCache_socket.write(var2.array, 0, 4);
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close();
								} catch (Exception var4) {
								}

								++NetCache.NetCache_ioExceptions;
								NetCache.NetCache_socket = null;
							}
						}

						NetCache.NetCache_loadTime = 0;
						SecureRandomCallable.field1108 = Archive.currentTimeMillis();
						return;
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var9);
					NetCache.NetCache_pendingWrites.put(var9, var9.key);
					++NetCache.NetCache_pendingWritesCount;
					--NetCache.NetCache_pendingResponsesCount;
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var9, var9.key);
			++NetCache.NetCache_pendingPriorityWritesCount;
			--NetCache.NetCache_pendingPriorityResponsesCount;
		}
	}
}
