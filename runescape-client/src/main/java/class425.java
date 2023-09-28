import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class425 {
	@ObfuscatedName("au")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1111856781
	)
	int field4589;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2048912337
	)
	int field4587;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1057598057
	)
	int field4588;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 492235961
	)
	int field4586;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4589).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4588).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4587).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4589 + var5 + "Created: " + this.field4587 + var7 + "Total used: " + this.field4588 + var6 + "Max-In-Use: " + this.field4586; // L: 22
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-921532851"
	)
	static void method7821() {
		Client.packetWriter.addNode(ClanChannelMember.getPacketBufferNode(ClientPacket.field3216, Client.packetWriter.isaacCipher)); // L: 12831
		Client.oculusOrbState = 0; // L: 12832
	} // L: 12833
}
