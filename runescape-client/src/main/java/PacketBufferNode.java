import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "[Lgy;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1286692403
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = 2196332218574994447L
	)
	static long field2348;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgx;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1793898605
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lnk;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 356559831
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-546801970"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lir;IIIZI)V",
		garbageValue = "-1085289699"
	)
	public static void method3898(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class210.musicPlayerStatus = 1;
		class210.musicTrackArchive = var0;
		FaceNormal.musicTrackGroupId = var1;
		WorldMapID.musicTrackFileId = var2;
		class375.musicTrackVolume = var3;
		class210.musicTrackBoolean = var4;
		class1.pcmSampleLength = 10000;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(ZZB)I",
		garbageValue = "1"
	)
	public static int method3896(boolean var0, boolean var1) {
		byte var2 = 0;
		int var3 = var2 + NetCache.NetCache_pendingPriorityWritesCount + NetCache.NetCache_pendingPriorityResponsesCount;
		return var3;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "387339011"
	)
	static final void method3888() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			boolean var1;
			int var2;
			int var3;
			ObjectComposition var4;
			if (var0.hitpoints == 0) {
				if (var0.objectId >= 0) {
					var2 = var0.objectId;
					var3 = var0.field1203;
					var4 = class19.getObjectDefinition(var2);
					if (var3 == 11) {
						var3 = 10;
					}

					if (var3 >= 5 && var3 <= 8) {
						var3 = 4;
					}

					var1 = var4.method5173(var3);
					if (!var1) {
						continue;
					}
				}

				class7.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1199, var0.field1203);
				var0.remove();
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102) {
					if (var0.id >= 0) {
						var2 = var0.id;
						var3 = var0.field1196;
						var4 = class19.getObjectDefinition(var2);
						if (var3 == 11) {
							var3 = 10;
						}

						if (var3 >= 5 && var3 <= 8) {
							var3 = 4;
						}

						var1 = var4.method5173(var3);
						if (!var1) {
							continue;
						}
					}

					class7.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.id, var0.orientation, var0.field1196);
					var0.delay = -1;
					if (var0.objectId == var0.id && var0.objectId == -1) {
						var0.remove();
					} else if (var0.id == var0.objectId && var0.orientation == var0.field1199 && var0.field1196 == var0.field1203) {
						var0.remove();
					}
				}
			}
		}

	}
}
