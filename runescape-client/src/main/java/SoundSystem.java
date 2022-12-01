import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1567971571
	)
	static int field332;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Lab;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2]; // L: 6
	} // L: 8

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) { // L: 12
				PcmPlayer var2 = this.players[var1]; // L: 13
				if (var2 != null) { // L: 14
					var2.run();
				}
			}
		} catch (Exception var4) { // L: 17
			class421.RunException_sendStackTrace((String)null, var4); // L: 18
		}

	} // L: 20

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1102083287"
	)
	static final void method859(String var0) {
		PacketBufferNode var1 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3031, Client.packetWriter.isaacCipher); // L: 133
		var1.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var0)); // L: 134
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 135
		Client.packetWriter.addNode(var1); // L: 136
	} // L: 137

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2133811273"
	)
	static final boolean method862(int var0, int var1) {
		ObjectComposition var2 = InterfaceParent.getObjectDefinition(var0); // L: 1054
		if (var1 == 11) { // L: 1055
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 1056
		}

		return var2.method3759(var1); // L: 1057
	}
}
