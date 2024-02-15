import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class166 {
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("fontBold12")
	static Font fontBold12;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lmn;",
		garbageValue = "-676763677"
	)
	public static PacketBufferNode method3491() {
		PacketBufferNode var0 = class423.method8005(); // L: 42
		var0.clientPacket = null; // L: 43
		var0.clientPacketLength = 0; // L: 44
		var0.packetBuffer = new PacketBuffer(5000); // L: 45
		return var0; // L: 46
	}
}
