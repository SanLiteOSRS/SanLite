import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public enum class6 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	field15(0, 0);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -408714925
	)
	final int field16;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1763504589
	)
	final int field11;

	class6(int var3, int var4) {
		this.field16 = var3; // L: 16
		this.field11 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field11; // L: 22
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-517269502"
	)
	static void method44() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 44
			if (var0.obj != null) { // L: 45
				var0.set();
			}
		}

	} // L: 47

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-91"
	)
	public static void method37(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 57
	} // L: 58

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "30"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 111
			int var3 = var0; // L: 113
			String var2;
			if (var1 && var0 >= 0) { // L: 116
				int var4 = 2; // L: 120

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 121 122 124
					var5 /= 10; // L: 123
				}

				char[] var6 = new char[var4]; // L: 126
				var6[0] = '+'; // L: 127

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 128
					int var8 = var3; // L: 129
					var3 /= 10; // L: 130
					int var9 = var8 - var3 * 10; // L: 131
					if (var9 >= 10) { // L: 132
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 133
					}
				}

				var2 = new String(var6); // L: 135
			} else {
				var2 = Integer.toString(var0, 10); // L: 117
			}

			return var2; // L: 137
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1593494378"
	)
	public static void method43() {
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 386
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 387
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 388
	} // L: 389

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class105.logOut(); // L: 3106
		switch(var0) { // L: 3107
		case 1:
			AbstractWorldMapIcon.method5548(); // L: 3110
			break;
		case 2:
			class14.method171(24); // L: 3116
			UrlRequest.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 3117
		}

	} // L: 3122

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)V",
		garbageValue = "-74968964"
	)
	static final void method46(PendingSpawn var0) {
		long var1 = 0L; // L: 8298
		int var3 = -1; // L: 8299
		int var4 = 0; // L: 8300
		int var5 = 0; // L: 8301
		if (var0.type == 0) { // L: 8302
			var1 = UserComparator4.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8303
			var1 = UserComparator4.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8304
			var1 = UserComparator4.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 8305
			var1 = UserComparator4.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) { // L: 8306
			int var6 = UserComparator4.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8307
			var3 = class299.Entity_unpackID(var1); // L: 8308
			var4 = var6 & 31; // L: 8309
			var5 = var6 >> 6 & 3; // L: 8310
		}

		var0.objectId = var3; // L: 8312
		var0.field1128 = var4; // L: 8313
		var0.field1136 = var5; // L: 8314
	} // L: 8315
}
