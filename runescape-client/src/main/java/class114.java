import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class114 {
	@ObfuscatedName("v")
	public static final float field1410;
	@ObfuscatedName("c")
	public static final float field1407;

	static {
		field1410 = Math.ulp(1.0F); // L: 10
		field1407 = 2.0F * field1410; // L: 11
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1923556377"
	)
	public static void method2637() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 409
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 410
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 411
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 412
	} // L: 413

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1368697061"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher); // L: 12020
		var0.packetBuffer.writeByte(0); // L: 12021
		Client.packetWriter.addNode(var0); // L: 12022
	} // L: 12023
}
