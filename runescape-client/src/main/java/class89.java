import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public enum class89 implements class372 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1097(0, -1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1096(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1091(2, 7),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1093(3, 8),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1089(4, 9);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	static ClanChannel field1092;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -893078041
	)
	final int field1094;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -961494479
	)
	final int field1095;

	class89(int var3, int var4) {
		this.field1094 = var3; // L: 20
		this.field1095 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1095; // L: 26
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
	)
	static final void method2306(int var0, int var1, int var2) {
		if (class157.cameraX < var0) { // L: 4031
			class157.cameraX = (var0 - class157.cameraX) * SecureRandomFuture.field990 / 1000 + class157.cameraX + Client.field755; // L: 4032
			if (class157.cameraX > var0) { // L: 4033
				class157.cameraX = var0;
			}
		}

		if (class157.cameraX > var0) { // L: 4035
			class157.cameraX -= (class157.cameraX - var0) * SecureRandomFuture.field990 / 1000 + Client.field755; // L: 4036
			if (class157.cameraX < var0) { // L: 4037
				class157.cameraX = var0;
			}
		}

		if (class384.cameraY < var1) { // L: 4039
			class384.cameraY = (var1 - class384.cameraY) * SecureRandomFuture.field990 / 1000 + class384.cameraY + Client.field755; // L: 4040
			if (class384.cameraY > var1) { // L: 4041
				class384.cameraY = var1;
			}
		}

		if (class384.cameraY > var1) { // L: 4043
			class384.cameraY -= (class384.cameraY - var1) * SecureRandomFuture.field990 / 1000 + Client.field755; // L: 4044
			if (class384.cameraY < var1) { // L: 4045
				class384.cameraY = var1;
			}
		}

		if (SoundSystem.cameraZ < var2) { // L: 4047
			SoundSystem.cameraZ = (var2 - SoundSystem.cameraZ) * SecureRandomFuture.field990 / 1000 + SoundSystem.cameraZ + Client.field755; // L: 4048
			if (SoundSystem.cameraZ > var2) { // L: 4049
				SoundSystem.cameraZ = var2;
			}
		}

		if (SoundSystem.cameraZ > var2) { // L: 4051
			SoundSystem.cameraZ -= (SoundSystem.cameraZ - var2) * SecureRandomFuture.field990 / 1000 + Client.field755; // L: 4052
			if (SoundSystem.cameraZ < var2) { // L: 4053
				SoundSystem.cameraZ = var2;
			}
		}

	} // L: 4055

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2092495072"
	)
	static void method2308() {
		if (Client.field766) { // L: 4975
			GrandExchangeOfferNameComparator.addPlayerToScene(class136.localPlayer, false); // L: 4976
		}

	} // L: 4978

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1018323278"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0; // L: 9203
		Client.isMenuOpen = false; // L: 9204
		Client.menuActions[0] = "Cancel"; // L: 9206
		Client.menuTargets[0] = ""; // L: 9207
		Client.menuOpcodes[0] = 1006; // L: 9208
		Client.menuShiftClick[0] = false; // L: 9209
		Client.menuOptionsCount = 1; // L: 9210
	} // L: 9211
}
