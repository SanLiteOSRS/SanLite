import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("LoginPacket")
public class LoginPacket implements class293 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	public static final LoginPacket field3360;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static final LoginPacket field3353;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	public static final LoginPacket field3354;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	public static final LoginPacket field3355;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	public static final LoginPacket field3356;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static final LoginPacket field3352;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Llr;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1452756543
	)
	@Export("id")
	public final int id;

	static {
		field3360 = new LoginPacket(14, 0); // L: 5
		field3353 = new LoginPacket(15, 4); // L: 6
		field3354 = new LoginPacket(16, -2); // L: 7
		field3355 = new LoginPacket(18, -2); // L: 8
		field3356 = new LoginPacket(19, -2); // L: 9
		field3352 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = new LoginPacket[]{field3354, field3356, field3355, field3353, field3360, field3352}; // L: 17
		LoginPacket[] var1 = var0; // L: 19

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 20
			LoginPacket_indexedValues[var1[var2].id] = var1[var2]; // L: 21
		}

	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2077944538"
	)
	public static void method5768(int var0, int var1) {
		VarbitComposition var2 = Login.method2150(var0); // L: 33
		int var3 = var2.baseVar; // L: 34
		int var4 = var2.startBit; // L: 35
		int var5 = var2.endBit; // L: 36
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 37
		if (var1 < 0 || var1 > var6) { // L: 38
			var1 = 0;
		}

		var6 <<= var4; // L: 39
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 40
	} // L: 41

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1640269361"
	)
	protected static final void method5767() {
		Skills.clock.mark(); // L: 443

		int var0;
		for (var0 = 0; var0 < 32; ++var0) { // L: 444
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) { // L: 445
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0; // L: 446
	} // L: 447
}
