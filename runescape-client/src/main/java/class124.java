import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
public enum class124 implements class345 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	field1535(0, 0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	field1528(1, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	field1529(2, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	field1536(3, 3),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	field1531(4, 4);

	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 324015279
	)
	final int field1532;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1800983085
	)
	final int field1530;

	class124(int var3, int var4) {
		this.field1532 = var3; // L: 147
		this.field1530 = var4; // L: 148
	} // L: 149

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "96"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1530; // L: 152
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1048113560"
	)
	static void method2939(boolean var0) {
		byte var1 = 0; // L: 1632
		boolean var2 = StructComposition.clientPreferences.method2424() >= Client.field511; // L: 1635
		if (!var2) { // L: 1637
			var1 = 12; // L: 1638
		} else if (BuddyRankComparator.client.method1230() || BuddyRankComparator.client.isOtlTokenRequesterInitialized()) { // L: 1640
			var1 = 10; // L: 1641
		}

		class12.method155(var1); // L: 1643
		if (var0) { // L: 1644
			Login.Login_username = ""; // L: 1645
			Login.Login_password = ""; // L: 1646
			class143.field1697 = 0; // L: 1647
			class141.otp = ""; // L: 1648
		}

		GameObject.method4831(); // L: 1650
		SoundSystem.method873(); // L: 1651
	} // L: 1652
}
