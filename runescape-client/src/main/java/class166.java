import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class166 extends class159 {
	@ObfuscatedName("aw")
	String field1792;
	@ObfuscatedName("ay")
	byte field1794;
	@ObfuscatedName("ar")
	byte field1793;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgs;)V"
	)
	class166(class160 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "-43"
	)
	void vmethod3411(Buffer var1) {
		this.field1792 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1792 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1794 = var1.readByte(); // L: 161
			this.field1793 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "-2132107044"
	)
	void vmethod3404(ClanChannel var1) {
		var1.name = this.field1792; // L: 167
		if (this.field1792 != null) { // L: 168
			var1.field1778 = this.field1794; // L: 169
			var1.field1780 = this.field1793; // L: 170
		}

	} // L: 172

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lmt;III)V",
		garbageValue = "1063442013"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3946
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3947
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3948
				if (var3 == null) { // L: 3949
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3950
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3951
				if (var3.contains(var4, var5)) { // L: 3952
					var4 -= var3.width / 2; // L: 3953
					var5 -= var3.height / 2; // L: 3954
					int var6 = Client.camAngleY & 2047; // L: 3955
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3956
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3957
					int var9 = var5 * var7 + var4 * var8 >> 11; // L: 3958
					int var10 = var8 * var5 - var4 * var7 >> 11; // L: 3959
					int var11 = var9 + class136.localPlayer.x >> 7; // L: 3960
					int var12 = class136.localPlayer.y - var10 >> 7; // L: 3961
					PacketBufferNode var13 = class503.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher); // L: 3963
					var13.packetBuffer.writeByte(18); // L: 3964
					var13.packetBuffer.writeShort(AbstractArchive.baseX * 64 + var11); // L: 3965
					var13.packetBuffer.method9188(Client.field750.method4151(82) ? (Client.field750.method4151(81) ? 2 : 1) : 0); // L: 3966
					var13.packetBuffer.method9143(class148.baseY * 64 + var12); // L: 3967
					var13.packetBuffer.writeByte(var4); // L: 3968
					var13.packetBuffer.writeByte(var5); // L: 3969
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3970
					var13.packetBuffer.writeByte(57); // L: 3971
					var13.packetBuffer.writeByte(0); // L: 3972
					var13.packetBuffer.writeByte(0); // L: 3973
					var13.packetBuffer.writeByte(89); // L: 3974
					var13.packetBuffer.writeShort(class136.localPlayer.x); // L: 3975
					var13.packetBuffer.writeShort(class136.localPlayer.y); // L: 3976
					var13.packetBuffer.writeByte(63); // L: 3977
					Client.packetWriter.addNode(var13); // L: 3978
					Client.destinationX = var11; // L: 3979
					Client.destinationY = var12; // L: 3980
				}
			}

		}
	} // L: 3983
}
