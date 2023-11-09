import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public final class class354 {
	@ObfuscatedName("d")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "8240"
	)
	protected static final void method6768() {
		class362.clock.mark(); // L: 459

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 460
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 461
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GroundObject.gameCyclesToDo = 0; // L: 462
	} // L: 463

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "892679424"
	)
	static final void method6769() {
		PacketBufferNode var0 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3097, Client.packetWriter.isaacCipher); // L: 12291
		Client.packetWriter.addNode(var0); // L: 12292
		Interpreter.field850 = true; // L: 12293

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12294
			if (var1.type == 0 || var1.type == 3) { // L: 12295
				class7.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12297
			class143.invalidateWidget(Client.meslayerContinueWidget); // L: 12298
			Client.meslayerContinueWidget = null; // L: 12299
		}

		Interpreter.field850 = false; // L: 12301
	} // L: 12302
}
