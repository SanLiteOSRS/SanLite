import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("o")
	static final int[] field1710;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(
		intValue = -1778547945
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1244645657
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1956088267
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 147814917
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1710 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1710[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-699123952"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnt;IB)V",
		garbageValue = "-59"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Llk;ZB)V",
		garbageValue = "-27"
	)
	public static void method2928(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) {
			try {
				NetCache.NetCache_socket.close();
			} catch (Exception var6) {
			}

			NetCache.NetCache_socket = null;
		}

		NetCache.NetCache_socket = var0;
		class105.method2358(var1);
		NetCache.NetCache_responseHeaderBuffer.offset = 0;
		class34.NetCache_currentResponse = null;
		class254.NetCache_responseArchiveBuffer = null;
		NetCache.field3615 = 0;

		while (true) {
			NetFileRequest var2 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
			if (var2 == null) {
				while (true) {
					var2 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
					if (var2 == null) {
						if (NetCache.field3618 != 0) {
							try {
								Buffer var7 = new Buffer(4);
								var7.writeByte(4);
								var7.writeByte(NetCache.field3618);
								var7.writeShort(0);
								NetCache.NetCache_socket.write(var7.array, 0, 4);
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
						NetCache.field3604 = ClientPacket.currentTimeMillis();
						return;
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var2);
					NetCache.NetCache_pendingWrites.put(var2, var2.key);
					++NetCache.NetCache_pendingWritesCount;
					--NetCache.NetCache_pendingResponsesCount;
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var2, var2.key);
			++NetCache.NetCache_pendingPriorityWritesCount;
			--NetCache.NetCache_pendingPriorityResponsesCount;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "264139195"
	)
	public static int method2935(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}
}
