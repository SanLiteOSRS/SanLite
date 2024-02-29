import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("ah")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("hm")
	static SecureRandom field489;
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	static class516 field488;

	ApproximateRouteStrategy() {
	} // L: 13157

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILiz;I)Z",
		garbageValue = "-101996106"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 13161
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "64"
	)
	static void method1185(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Client.groundItems[var0][var1][var2]; // L: 8406
		if (var5 != null) { // L: 8407
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) { // L: 8408 8409 8414
				if ((var3 & 32767) == var6.id) { // L: 8410
					var6.method2758(var4); // L: 8411
					break;
				}
			}
		}

	} // L: 8417

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "233"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12710
			PacketBufferNode var1 = ViewportMouse.getPacketBufferNode(ClientPacket.field3233, Client.packetWriter.isaacCipher); // L: 12712
			var1.packetBuffer.writeByte(class145.stringCp1252NullTerminatedByteSize(var0)); // L: 12713
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12714
			Client.packetWriter.addNode(var1); // L: 12715
		}
	} // L: 12716
}
