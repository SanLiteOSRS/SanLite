import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class210 extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -99227473
	)
	public int field2316;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1558274047
	)
	public int field2319;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1056805865
	)
	public int field2318;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public Widget field2314;

	@ObfuscatedSignature(
		descriptor = "(IIILmo;)V"
	)
	public class210(int var1, int var2, int var3, Widget var4) {
		this.field2318 = var1; // L: 15
		this.field2316 = var2; // L: 16
		this.field2319 = var3; // L: 17
		this.field2314 = var4; // L: 18
	} // L: 19

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1591764715"
	)
	public static void method4077() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 86
	} // L: 87

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-1"
	)
	static int method4076(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1154
			if (var1 <= var0 + 30) { // L: 1155
				return var2; // L: 1156
			}

			var0 += 30; // L: 1158
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1159
		}

		return 0; // L: 1161
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "876911969"
	)
	static final void method4078(String var0) {
		PacketBufferNode var1 = class251.getPacketBufferNode(ClientPacket.field3157, Client.packetWriter.isaacCipher); // L: 125
		var1.packetBuffer.writeByte(class298.stringCp1252NullTerminatedByteSize(var0)); // L: 126
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 127
		Client.packetWriter.addNode(var1); // L: 128
	} // L: 129
}
