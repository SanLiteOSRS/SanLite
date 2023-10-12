import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class193 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("archive5")
	public static EvictingDualNodeHashTable archive5;

	static {
		archive5 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lbi;B)V",
		garbageValue = "-42"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 241
		if (var0.sound != null) { // L: 242
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 243
		}

	} // L: 244

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1522751942"
	)
	static final void method3644(boolean var0) {
		class313.method5891(); // L: 6084
		++Client.packetWriter.pendingWrites; // L: 6085
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 6086
			Client.packetWriter.pendingWrites = 0; // L: 6087
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 6088
				PacketBufferNode var1 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher); // L: 6090
				Client.packetWriter.addNode(var1); // L: 6091

				try {
					Client.packetWriter.flush(); // L: 6093
				} catch (IOException var3) { // L: 6095
					Client.hadNetworkError = true; // L: 6096
				}
			}

		}
	} // L: 6099
}
