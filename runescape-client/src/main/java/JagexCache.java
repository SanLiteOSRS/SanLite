import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = 137253805
	)
	static int field1728;

	static {
		JagexCache_randomDat = null; // L: 22
		JagexCache_dat2File = null; // L: 23
		JagexCache_idx255File = null; // L: 24
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1451347763"
	)
	static final void method3205(String var0, int var1) {
		PacketBufferNode var2 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2972, Client.packetWriter.isaacCipher); // L: 218
		var2.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 219
		var2.packetBuffer.method7878(var1); // L: 220
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 221
		Client.packetWriter.addNode(var2); // L: 222
	} // L: 223

	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2130372893"
	)
	static void method3206(int var0, int var1) {
		if (FriendsChatMember.clientPreferences.method2222() != 0 && var0 != -1) { // L: 3630
			class118.method2713(class17.field89, var0, 0, FriendsChatMember.clientPreferences.method2222(), false); // L: 3631
			Client.playingJingle = true; // L: 3632
		}

	} // L: 3634
}
