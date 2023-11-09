import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class168 {
	@ObfuscatedName("q")
	@Export("operatingSystemName")
	public static String operatingSystemName;

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	public static void method3488() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 345
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 346
	} // L: 347

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1456500003"
	)
	public static void method3487(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = Renderable.getPacketBufferNode(ClientPacket.field3090, Client.packetWriter.isaacCipher); // L: 13313
		var4.packetBuffer.method8674(var2); // L: 13314
		var4.packetBuffer.writeIntME(var1); // L: 13315
		var4.packetBuffer.method8683(var0); // L: 13316
		var4.packetBuffer.method8696(var3 ? Client.field594 : 0); // L: 13317
		Client.packetWriter.addNode(var4); // L: 13318
	} // L: 13319
}
