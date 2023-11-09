import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Llg;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 380401923
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1245059367
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1816684323
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300]; // L: 13
		PacketBufferNode_packetBufferNodeCount = 0; // L: 14
	}

	PacketBufferNode() {
	} // L: 19

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2073453785"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) { // L: 50
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this; // L: 51
		}
	} // L: 52

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lls;",
		garbageValue = "-1731859764"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3260, ServerPacket.field3218, ServerPacket.field3219, ServerPacket.field3220, ServerPacket.field3225, ServerPacket.field3222, ServerPacket.field3223, ServerPacket.field3246, ServerPacket.field3267, ServerPacket.field3226, ServerPacket.field3227, ServerPacket.field3253, ServerPacket.field3229, ServerPacket.field3230, ServerPacket.field3231, ServerPacket.field3232, ServerPacket.field3305, ServerPacket.field3234, ServerPacket.field3221, ServerPacket.field3236, ServerPacket.field3237, ServerPacket.field3228, ServerPacket.field3239, ServerPacket.field3240, ServerPacket.field3304, ServerPacket.field3242, ServerPacket.field3243, ServerPacket.field3244, ServerPacket.field3245, ServerPacket.field3241, ServerPacket.field3247, ServerPacket.field3248, ServerPacket.field3321, ServerPacket.field3250, ServerPacket.field3282, ServerPacket.field3249, ServerPacket.field3300, ServerPacket.field3254, ServerPacket.field3255, ServerPacket.field3256, ServerPacket.field3257, ServerPacket.field3251, ServerPacket.field3259, ServerPacket.field3224, ServerPacket.field3309, ServerPacket.field3262, ServerPacket.field3263, ServerPacket.field3264, ServerPacket.field3261, ServerPacket.field3287, ServerPacket.field3317, ServerPacket.field3265, ServerPacket.field3325, ServerPacket.field3270, ServerPacket.field3271, ServerPacket.field3272, ServerPacket.field3233, ServerPacket.field3274, ServerPacket.field3275, ServerPacket.field3276, ServerPacket.field3277, ServerPacket.field3278, ServerPacket.field3279, ServerPacket.field3280, ServerPacket.field3281, ServerPacket.field3315, ServerPacket.field3283, ServerPacket.field3285, ServerPacket.field3235, ServerPacket.field3286, ServerPacket.field3333, ServerPacket.field3288, ServerPacket.field3289, ServerPacket.field3290, ServerPacket.field3291, ServerPacket.field3301, ServerPacket.field3258, ServerPacket.field3294, ServerPacket.field3324, ServerPacket.field3296, ServerPacket.field3314, ServerPacket.field3298, ServerPacket.field3332, ServerPacket.field3217, ServerPacket.field3329, ServerPacket.field3302, ServerPacket.field3303, ServerPacket.field3268, ServerPacket.field3292, ServerPacket.field3306, ServerPacket.field3307, ServerPacket.field3297, ServerPacket.field3336, ServerPacket.field3295, ServerPacket.field3311, ServerPacket.field3312, ServerPacket.field3313, ServerPacket.field3273, ServerPacket.field3252, ServerPacket.field3310, ServerPacket.field3266, ServerPacket.field3318, ServerPacket.field3319, ServerPacket.field3320, ServerPacket.field3238, ServerPacket.field3322, ServerPacket.field3323, ServerPacket.field3284, ServerPacket.field3326, ServerPacket.field3293, ServerPacket.field3327, ServerPacket.field3328, ServerPacket.field3269, ServerPacket.field3330, ServerPacket.field3331, ServerPacket.field3308, ServerPacket.field3316, ServerPacket.field3334, ServerPacket.field3335}; // L: 128
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "27"
	)
	public static int method5709(CharSequence var0) {
		return SecureRandomFuture.method2122(var0, 10, true); // L: 68
	}
}
