import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("at")
	boolean field4589;
	@ObfuscatedName("an")
	boolean field4590;

	Friend() {
	} // L: 9

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqx;I)I",
		garbageValue = "1970511247"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field4589 && !var1.field4589) { // L: 16
			return -1;
		} else if (!this.field4589 && var1.field4589) {
			return 1; // L: 17
		} else if (this.field4590 && !var1.field4590) { // L: 18
			return -1;
		} else if (!this.field4590 && var1.field4590) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqm;I)I",
		garbageValue = "615597391"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lmb;III)V",
		garbageValue = "1076023356"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3823
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class305.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3824
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3825
				if (var3 == null) { // L: 3826
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3827
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3828
				if (var3.contains(var4, var5)) { // L: 3829
					var4 -= var3.width / 2; // L: 3830
					var5 -= var3.height / 2; // L: 3831
					int var6 = Client.camAngleY & 2047; // L: 3832
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3833
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3834
					int var9 = var5 * var7 + var4 * var8 >> 11; // L: 3835
					int var10 = var8 * var5 - var4 * var7 >> 11; // L: 3836
					int var11 = var9 + Projectile.localPlayer.x >> 7; // L: 3837
					int var12 = Projectile.localPlayer.y - var10 >> 7; // L: 3838
					PacketBufferNode var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher); // L: 3840
					var13.packetBuffer.writeByte(18); // L: 3841
					var13.packetBuffer.writeIntME(Client.field739.method4134(82) ? (Client.field739.method4134(81) ? 2 : 1) : 0); // L: 3842
					var13.packetBuffer.writeShort(class213.baseX * 64 + var11); // L: 3843
					var13.packetBuffer.method8949(class101.baseY * 64 + var12); // L: 3844
					var13.packetBuffer.writeByte(var4); // L: 3845
					var13.packetBuffer.writeByte(var5); // L: 3846
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3847
					var13.packetBuffer.writeByte(57); // L: 3848
					var13.packetBuffer.writeByte(0); // L: 3849
					var13.packetBuffer.writeByte(0); // L: 3850
					var13.packetBuffer.writeByte(89); // L: 3851
					var13.packetBuffer.writeShort(Projectile.localPlayer.x); // L: 3852
					var13.packetBuffer.writeShort(Projectile.localPlayer.y); // L: 3853
					var13.packetBuffer.writeByte(63); // L: 3854
					Client.packetWriter.addNode(var13); // L: 3855
					Client.destinationX = var11; // L: 3856
					Client.destinationY = var12; // L: 3857
				}
			}

		}
	} // L: 3860
}
