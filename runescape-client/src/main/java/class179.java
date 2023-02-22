import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class179 {
	@ObfuscatedName("v")
	public short[] field1913;
	@ObfuscatedName("s")
	public short[] field1914;

	class179(int var1) {
		ItemComposition var2 = TileItem.ItemComposition_get(var1); // L: 12
		if (var2.method4007()) { // L: 13
			this.field1913 = new short[var2.recolorTo.length]; // L: 14
			System.arraycopy(var2.recolorTo, 0, this.field1913, 0, this.field1913.length); // L: 15
		}

		if (var2.method4008()) { // L: 17
			this.field1914 = new short[var2.retextureTo.length]; // L: 18
			System.arraycopy(var2.retextureTo, 0, this.field1914, 0, this.field1914.length); // L: 19
		}

	} // L: 21

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljg;",
		garbageValue = "1293582698"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3294, ServerPacket.field3193, ServerPacket.field3284, ServerPacket.field3195, ServerPacket.field3196, ServerPacket.field3197, ServerPacket.field3237, ServerPacket.field3199, ServerPacket.field3305, ServerPacket.field3201, ServerPacket.field3202, ServerPacket.field3267, ServerPacket.field3204, ServerPacket.field3205, ServerPacket.field3273, ServerPacket.field3207, ServerPacket.field3208, ServerPacket.field3209, ServerPacket.field3210, ServerPacket.field3211, ServerPacket.field3259, ServerPacket.field3213, ServerPacket.field3231, ServerPacket.field3215, ServerPacket.field3206, ServerPacket.field3217, ServerPacket.field3218, ServerPacket.field3219, ServerPacket.field3220, ServerPacket.field3221, ServerPacket.field3222, ServerPacket.field3223, ServerPacket.field3224, ServerPacket.field3282, ServerPacket.field3226, ServerPacket.field3198, ServerPacket.field3200, ServerPacket.field3229, ServerPacket.field3230, ServerPacket.field3296, ServerPacket.field3216, ServerPacket.field3233, ServerPacket.field3227, ServerPacket.field3235, ServerPacket.field3236, ServerPacket.field3306, ServerPacket.field3238, ServerPacket.field3239, ServerPacket.field3240, ServerPacket.field3248, ServerPacket.field3242, ServerPacket.field3243, ServerPacket.field3244, ServerPacket.field3287, ServerPacket.field3246, ServerPacket.field3247, ServerPacket.field3253, ServerPacket.field3214, ServerPacket.field3250, ServerPacket.field3303, ServerPacket.field3194, ServerPacket.field3212, ServerPacket.field3254, ServerPacket.field3255, ServerPacket.field3256, ServerPacket.field3276, ServerPacket.field3258, ServerPacket.field3279, ServerPacket.field3260, ServerPacket.field3261, ServerPacket.field3234, ServerPacket.field3281, ServerPacket.field3264, ServerPacket.field3265, ServerPacket.field3271, ServerPacket.field3252, ServerPacket.field3251, ServerPacket.field3269, ServerPacket.field3270, ServerPacket.field3245, ServerPacket.field3272, ServerPacket.field3266, ServerPacket.field3291, ServerPacket.field3275, ServerPacket.field3232, ServerPacket.field3277, ServerPacket.field3278, ServerPacket.field3225, ServerPacket.field3280, ServerPacket.field3263, ServerPacket.field3249, ServerPacket.field3283, ServerPacket.field3274, ServerPacket.field3285, ServerPacket.field3286, ServerPacket.field3241, ServerPacket.field3192, ServerPacket.field3289, ServerPacket.field3290, ServerPacket.field3293, ServerPacket.field3292, ServerPacket.field3228, ServerPacket.field3288, ServerPacket.field3295, ServerPacket.field3257, ServerPacket.field3297, ServerPacket.field3298, ServerPacket.field3299, ServerPacket.field3300, ServerPacket.field3301, ServerPacket.field3302, ServerPacket.field3262, ServerPacket.field3304}; // L: 122
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)V",
		garbageValue = "63"
	)
	static final void method3571(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8259

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8260 8261 8266
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8262
				var10 = var11; // L: 8263
				break;
			}
		}

		if (var10 == null) { // L: 8268
			var10 = new PendingSpawn(); // L: 8269
			var10.plane = var0; // L: 8270
			var10.type = var3; // L: 8271
			var10.x = var1; // L: 8272
			var10.y = var2; // L: 8273
			class204.method4131(var10); // L: 8274
			Client.pendingSpawns.addFirst(var10); // L: 8275
		}

		var10.field1150 = var4; // L: 8277
		var10.field1152 = var5; // L: 8278
		var10.field1151 = var6; // L: 8279
		var10.delay = var8; // L: 8280
		var10.hitpoints = var9; // L: 8281
		var10.method2414(var7); // L: 8282
	} // L: 8283
}
