import java.util.Collections;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public final class class4 {
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	static AbstractSocket field4;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "1584240093"
	)
	public static void method20(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) { // L: 44
			Clock.ByteArrayPool_alternativeSizes = var0; // L: 51
			class267.ByteArrayPool_altSizeArrayCounts = new int[var0.length]; // L: 52
			class1.ByteArrayPool_arrays = new byte[var0.length][][]; // L: 53

			for (int var2 = 0; var2 < Clock.ByteArrayPool_alternativeSizes.length; ++var2) { // L: 54
				class1.ByteArrayPool_arrays[var2] = new byte[var1[var2]][]; // L: 55
				ByteArrayPool.field4590.add(var0[var2]); // L: 56
			}

			Collections.sort(ByteArrayPool.field4590); // L: 58
		} else {
			Clock.ByteArrayPool_alternativeSizes = null; // L: 45
			class267.ByteArrayPool_altSizeArrayCounts = null; // L: 46
			class1.ByteArrayPool_arrays = null; // L: 47
			Renderable.method5509(); // L: 48
		}
	} // L: 49 59

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "0"
	)
	static final void method19(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12735
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3479()) { // L: 12736
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12737
				PacketBufferNode var4 = class113.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher); // L: 12738
				var4.packetBuffer.writeByte(4 + ClanChannel.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12739
				var4.packetBuffer.writeByte(var0); // L: 12740
				var4.packetBuffer.writeShort(var1); // L: 12741
				var4.packetBuffer.writeBoolean(var2); // L: 12742
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12743
				Client.packetWriter.addNode(var4); // L: 12744
			}
		}
	} // L: 12745

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "2291"
	)
	static boolean method21() {
		return WorldMapIcon_1.clientPreferences.method2562() >= Client.field488; // L: 12936
	}
}
