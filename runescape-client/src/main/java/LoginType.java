import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4987;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4995;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4990;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4991;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4992;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4993;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4994;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	public static final LoginType field4998;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1096679751
	)
	public final int field4988;
	@ObfuscatedName("ad")
	final String field4997;

	static {
		oldscape = new LoginType(8, 0, "", ""); // L: 5
		field4987 = new LoginType(4, 1, "", ""); // L: 6
		field4995 = new LoginType(1, 2, "", ""); // L: 7
		field4990 = new LoginType(6, 3, "", ""); // L: 8
		field4991 = new LoginType(2, 4, "", ""); // L: 9
		field4992 = new LoginType(0, 5, "", ""); // L: 10
		field4993 = new LoginType(5, 6, "", ""); // L: 11
		field4994 = new LoginType(7, 7, "", ""); // L: 12
		field4998 = new LoginType(3, -1, "", "", true, new LoginType[]{oldscape, field4987, field4995, field4991, field4990}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4988 = var1; // L: 18
		this.field4997 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lsl;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4988 = var1; // L: 23
		this.field4997 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4997; // L: 29
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ldf;III)V",
		garbageValue = "-1416218434"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4424
			int var3 = EnumComposition.SequenceDefinition_get(var1).field2327; // L: 4425
			if (var3 == 1) { // L: 4426
				var0.sequenceFrame = 0; // L: 4427
				var0.sequenceFrameCycle = 0; // L: 4428
				var0.sequenceDelay = var2; // L: 4429
				var0.field1224 = 0; // L: 4430
			}

			if (var3 == 2) { // L: 4432
				var0.field1224 = 0; // L: 4433
			}
		} else if (var1 == -1 || var0.sequence == -1 || EnumComposition.SequenceDefinition_get(var1).field2320 >= EnumComposition.SequenceDefinition_get(var0.sequence).field2320) { // L: 4436
			var0.sequence = var1; // L: 4437
			var0.sequenceFrame = 0; // L: 4438
			var0.sequenceFrameCycle = 0; // L: 4439
			var0.sequenceDelay = var2; // L: 4440
			var0.field1224 = 0; // L: 4441
			var0.field1261 = var0.pathLength; // L: 4442
		}

	} // L: 4444
}
