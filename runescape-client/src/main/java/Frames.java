import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("fb")
	static String field2620;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lhm;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lln;Lln;IZ)V",
		garbageValue = "0"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 11
		int var6 = var1.getGroupFileCount(var3); // L: 12
		this.frames = new Animation[var6]; // L: 13
		int[] var7 = var1.getGroupFileIds(var3); // L: 14

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 15
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 16
			Skeleton var10 = null; // L: 17
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 18

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 19 20 25
				if (var11 == var12.id) { // L: 21
					var10 = var12; // L: 22
					break;
				}
			}

			if (var10 == null) { // L: 27
				byte[] var13 = var2.getFile(var11, 0); // L: 30
				var10 = new Skeleton(var11, var13); // L: 31
				var5.addFirst(var10); // L: 32
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 34
		}

	} // L: 36

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1076744918"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 39
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lkz;III)V",
		garbageValue = "1584997198"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 4058
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !FriendsChatMember.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 4059
				SpriteMask var3 = var0.getSpriteMask(true); // L: 4060
				if (var3 == null) { // L: 4061
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 4062
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 4063
				if (var3.contains(var4, var5)) { // L: 4064
					var4 -= var3.width / 2; // L: 4065
					var5 -= var3.height / 2; // L: 4066
					int var6 = Client.camAngleY & 2047; // L: 4067
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 4068
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 4069
					int var9 = var5 * var7 + var4 * var8 >> 11; // L: 4070
					int var10 = var5 * var8 - var4 * var7 >> 11; // L: 4071
					int var11 = var9 + class387.localPlayer.x >> 7; // L: 4072
					int var12 = class387.localPlayer.y - var10 >> 7; // L: 4073
					PacketBufferNode var13 = Renderable.getPacketBufferNode(ClientPacket.field3087, Client.packetWriter.isaacCipher); // L: 4075
					var13.packetBuffer.writeByte(18); // L: 4076
					var13.packetBuffer.writeShort(ParamComposition.baseX * 64 + var11); // L: 4077
					var13.packetBuffer.method8765(Client.field702.method4143(82) ? (Client.field702.method4143(81) ? 2 : 1) : 0); // L: 4078
					var13.packetBuffer.writeShort(Client.baseY * 64 + var12); // L: 4079
					var13.packetBuffer.writeByte(var4); // L: 4080
					var13.packetBuffer.writeByte(var5); // L: 4081
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 4082
					var13.packetBuffer.writeByte(57); // L: 4083
					var13.packetBuffer.writeByte(0); // L: 4084
					var13.packetBuffer.writeByte(0); // L: 4085
					var13.packetBuffer.writeByte(89); // L: 4086
					var13.packetBuffer.writeShort(class387.localPlayer.x); // L: 4087
					var13.packetBuffer.writeShort(class387.localPlayer.y); // L: 4088
					var13.packetBuffer.writeByte(63); // L: 4089
					Client.packetWriter.addNode(var13); // L: 4090
					Client.destinationX = var11; // L: 4091
					Client.destinationY = var12; // L: 4092
				}
			}

		}
	} // L: 4095
}
