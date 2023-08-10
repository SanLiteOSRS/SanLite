import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
public class class390 extends RuntimeException {
	public class390(String var1, Object[] var2) {
		super(String.format(var1, var2)); // L: 5
	} // L: 6

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-79"
	)
	static final void method7262() {
		PacketBufferNode var0 = class503.getPacketBufferNode(ClientPacket.field3176, Client.packetWriter.isaacCipher); // L: 12412
		Client.packetWriter.addNode(var0); // L: 12413
		Interpreter.field864 = true; // L: 12414

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12415
			if (var1.type == 0 || var1.type == 3) { // L: 12416
				Actor.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12418
			class200.invalidateWidget(Client.meslayerContinueWidget); // L: 12419
			Client.meslayerContinueWidget = null; // L: 12420
		}

		Interpreter.field864 = false; // L: 12422
	} // L: 12423
}
