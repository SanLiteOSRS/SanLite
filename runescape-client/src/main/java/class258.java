import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class258 {
	@ObfuscatedName("vf")
	static List field2982;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	static final class258 field2980;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	static final class258 field2986;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1445258151
	)
	@Export("value")
	final int value;

	static {
		field2980 = new class258(0); // L: 4
		field2986 = new class258(1); // L: 5
	}

	class258(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)[Lke;",
		garbageValue = "-1296187217"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3266, ServerPacket.field3175, ServerPacket.field3180, ServerPacket.field3274, ServerPacket.field3178, ServerPacket.field3179, ServerPacket.field3209, ServerPacket.field3181, ServerPacket.field3273, ServerPacket.field3236, ServerPacket.field3184, ServerPacket.field3185, ServerPacket.field3186, ServerPacket.field3197, ServerPacket.field3188, ServerPacket.field3189, ServerPacket.field3190, ServerPacket.field3191, ServerPacket.field3249, ServerPacket.field3193, ServerPacket.field3194, ServerPacket.field3195, ServerPacket.field3196, ServerPacket.field3182, ServerPacket.field3255, ServerPacket.field3199, ServerPacket.field3200, ServerPacket.field3201, ServerPacket.field3202, ServerPacket.field3203, ServerPacket.field3204, ServerPacket.field3208, ServerPacket.field3222, ServerPacket.field3210, ServerPacket.field3183, ServerPacket.field3246, ServerPacket.field3235, ServerPacket.field3211, ServerPacket.field3205, ServerPacket.field3213, ServerPacket.field3214, ServerPacket.field3215, ServerPacket.field3216, ServerPacket.field3217, ServerPacket.field3218, ServerPacket.field3219, ServerPacket.field3275, ServerPacket.field3221, ServerPacket.field3176, ServerPacket.field3223, ServerPacket.field3224, ServerPacket.field3225, ServerPacket.field3226, ServerPacket.field3282, ServerPacket.field3228, ServerPacket.field3229, ServerPacket.field3230, ServerPacket.field3240, ServerPacket.field3232, ServerPacket.field3258, ServerPacket.field3239, ServerPacket.field3206, ServerPacket.field3177, ServerPacket.field3237, ServerPacket.field3238, ServerPacket.field3259, ServerPacket.field3263, ServerPacket.field3241, ServerPacket.field3242, ServerPacket.field3243, ServerPacket.field3244, ServerPacket.field3245, ServerPacket.field3271, ServerPacket.field3247, ServerPacket.field3248, ServerPacket.field3174, ServerPacket.field3250, ServerPacket.field3251, ServerPacket.field3252, ServerPacket.field3253, ServerPacket.field3254, ServerPacket.field3234, ServerPacket.field3256, ServerPacket.field3257, ServerPacket.field3187, ServerPacket.field3212, ServerPacket.field3260, ServerPacket.field3261, ServerPacket.field3262, ServerPacket.field3277, ServerPacket.field3264, ServerPacket.field3265, ServerPacket.field3276, ServerPacket.field3267, ServerPacket.field3268, ServerPacket.field3269, ServerPacket.field3270, ServerPacket.field3231, ServerPacket.field3272, ServerPacket.field3233, ServerPacket.field3198, ServerPacket.field3207, ServerPacket.field3227, ServerPacket.field3192, ServerPacket.field3278, ServerPacket.field3279, ServerPacket.field3280, ServerPacket.field3281}; // L: 117
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	public static void method5232() {
		class293.midiPcmStream.clear(); // L: 44
		class293.musicPlayerStatus = 1; // L: 45
		class364.musicTrackArchive = null; // L: 46
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-28"
	)
	public static boolean method5230(int var0) {
		return var0 >= WorldMapDecorationType.field3709.id && var0 <= WorldMapDecorationType.field3724.id; // L: 47
	}
}
