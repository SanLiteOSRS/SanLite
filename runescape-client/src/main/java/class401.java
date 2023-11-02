import java.util.regex.Pattern;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@mb
@ObfuscatedName("pa")
public final class class401 {
	static {
		Pattern.compile("^\\D*(\\d+)\\D*$"); // L: 9
	} // L: 10

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Lnm;III)V",
		garbageValue = "898277930"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3961
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3962
				SpriteMask var3 = var0.method6594(class33.field184, true); // L: 3963
				if (var3 == null) { // L: 3964
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3965
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3966
				if (var3.contains(var4, var5)) { // L: 3967
					var4 -= var3.width / 2; // L: 3968
					var5 -= var3.height / 2; // L: 3969
					int var6 = Client.camAngleY & 2047; // L: 3970
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3971
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3972
					int var9 = var7 * var5 + var4 * var8 >> 11; // L: 3973
					int var10 = var8 * var5 - var4 * var7 >> 11; // L: 3974
					int var11 = var9 + TextureProvider.localPlayer.x >> 7; // L: 3975
					int var12 = TextureProvider.localPlayer.y - var10 >> 7; // L: 3976
					PacketBufferNode var13 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3197, Client.packetWriter.isaacCipher); // L: 3978
					var13.packetBuffer.writeByte(18); // L: 3979
					var13.packetBuffer.method9244(class19.baseY * 64 + var12); // L: 3980
					var13.packetBuffer.writeByte(Client.field755.method4280(82) ? (Client.field755.method4280(81) ? 2 : 1) : 0); // L: 3981
					var13.packetBuffer.method9244(class20.baseX * 64 + var11); // L: 3982
					var13.packetBuffer.writeByte(var4); // L: 3983
					var13.packetBuffer.writeByte(var5); // L: 3984
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3985
					var13.packetBuffer.writeByte(57); // L: 3986
					var13.packetBuffer.writeByte(0); // L: 3987
					var13.packetBuffer.writeByte(0); // L: 3988
					var13.packetBuffer.writeByte(89); // L: 3989
					var13.packetBuffer.writeShort(TextureProvider.localPlayer.x); // L: 3990
					var13.packetBuffer.writeShort(TextureProvider.localPlayer.y); // L: 3991
					var13.packetBuffer.writeByte(63); // L: 3992
					Client.packetWriter.addNode(var13); // L: 3993
					Client.destinationX = var11; // L: 3994
					Client.destinationY = var12; // L: 3995
				}
			}

		}
	} // L: 3998
}
