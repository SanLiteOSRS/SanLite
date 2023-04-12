import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("WallObject")
public final class WallObject {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -476261499
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1217976121
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -921698304
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -244010561
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1655274619
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 1373015219928650129L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1167353109
	)
	@Export("flags")
	int flags;

	WallObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	} // L: 14

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1252454973"
	)
	static final void method4754(boolean var0) {
		EnumComposition.playPcmPlayers(); // L: 5738
		++Client.packetWriter.pendingWrites; // L: 5739
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5740
			Client.packetWriter.pendingWrites = 0; // L: 5741
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5742
				PacketBufferNode var1 = UserComparator9.getPacketBufferNode(ClientPacket.field3092, Client.packetWriter.isaacCipher); // L: 5744
				Client.packetWriter.addNode(var1); // L: 5745

				try {
					Client.packetWriter.flush(); // L: 5747
				} catch (IOException var3) { // L: 5749
					Client.hadNetworkError = true; // L: 5750
				}
			}

		}
	} // L: 5753
}
