import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class240 {
	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "343853799"
	)
	static final void method4792() {
		PacketBufferNode var0 = UserComparator9.getPacketBufferNode(ClientPacket.field3136, Client.packetWriter.isaacCipher); // L: 11773
		Client.packetWriter.addNode(var0); // L: 11774
		Interpreter.field836 = true; // L: 11775

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11776
			if (var1.type == 0 || var1.type == 3) { // L: 11777
				class17.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11779
			class69.invalidateWidget(Client.meslayerContinueWidget); // L: 11780
			Client.meslayerContinueWidget = null; // L: 11781
		}

		Interpreter.field836 = false; // L: 11783
	} // L: 11784
}
