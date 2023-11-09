import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
@Implements("GroundObject")
public final class GroundObject {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2134679337
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1961961451
	)
	@Export("x")
	int x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -860880896
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 5480525870071507937L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 603864985
	)
	@Export("flags")
	int flags;

	GroundObject() {
	}

	@ObfuscatedName("at")
	public static final void method4357(long var0) {
		if (var0 > 0L) { // L: 9
			if (0L == var0 % 10L) { // L: 10
				Skeleton.method4505(var0 - 1L); // L: 11
				Skeleton.method4505(1L); // L: 12
			} else {
				Skeleton.method4505(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "3841"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.field3164, Client.packetWriter.isaacCipher); // L: 10014
		var2.packetBuffer.writeInt(var0); // L: 10015
		var2.packetBuffer.method8948(var1); // L: 10016
		Client.packetWriter.addNode(var2); // L: 10017
	} // L: 10018
}
